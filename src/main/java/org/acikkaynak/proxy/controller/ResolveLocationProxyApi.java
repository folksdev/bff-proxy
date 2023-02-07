package org.acikkaynak.proxy.controller;


import org.acikkaynak.proxy.dto.GeoLocationDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

@RestController
@RequestMapping("/v1/api/resolver")
@Validated
public class ResolveLocationProxyApi {

    @Value("${bff.url}")
    private String BASE_URL;

    private final RestTemplate restTemplate;

    public ResolveLocationProxyApi(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping()
    public ResponseEntity<GeoLocationDto> getGeoLocation(@Valid @NotBlank @RequestParam(name = "address_text") String addressText) {
        GeoLocationDto result = restTemplate.getForEntity(BASE_URL + addressText, GeoLocationDto.class).getBody();
        return ResponseEntity.ok(result);
    }

}
