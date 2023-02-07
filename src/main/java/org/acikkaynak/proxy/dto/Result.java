package org.acikkaynak.proxy.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


record  Result (
        @JsonProperty("formatted_address")
        String formattedAddress,
        Geometry geometry,
        String icon,
        @JsonProperty("icon_background_color")
        String iconBackgroundColor,
        @JsonProperty("icon_mask_base_uri")
        String iconMaskBaseUri,
        String name,
        String placeId,
        @JsonProperty("place_id")
        String reference
) {

}
