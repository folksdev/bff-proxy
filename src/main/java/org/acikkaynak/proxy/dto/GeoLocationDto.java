package org.acikkaynak.proxy.dto;


import java.util.List;

/**
 * {
 *    "html_attributions" : [],
 *    "results" : [
 *       {
 *          "formatted_address" : "Akat, Zeytinoğlu Cd., 34335 Beşiktaş/İstanbul, Türkiye",
 *          "geometry" : {
 *             "location" : {
 *                "lat" : 41.0839605,
 *                "lng" : 29.0268231
 *             },
 *             "viewport" : {
 *                "northeast" : {
 *                   "lat" : 41.08531032989271,
 *                   "lng" : 29.02817292989272
 *                },
 *                "southwest" : {
 *                   "lat" : 41.08261067010727,
 *                   "lng" : 29.02547327010727
 *                }
 *             }
 *          },
 *          "icon" : "https://maps.gstatic.com/mapfiles/place_api/icons/v1/png_71/geocode-71.png",
 *          "icon_background_color" : "#7B9EB0",
 *          "icon_mask_base_uri" : "https://maps.gstatic.com/mapfiles/place_api/icons/v2/generic_pinlet",
 *          "name" : "Zeytinoğlu Cd.",
 *          "place_id" : "ChIJBY7MkA22yhQR_LaYEOozeQw",
 *          "reference" : "ChIJBY7MkA22yhQR_LaYEOozeQw",
 *          "types" : [ "route" ]
 *       }
 *    ],
 *    "status" : "OK"
 * }
 */
public record GeoLocationDto (List<Result> results){

}
