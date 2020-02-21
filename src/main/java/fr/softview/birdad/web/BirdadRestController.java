package fr.softview.birdad.web;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.facebook.ads.sdk.APIException;

import fr.softview.birdad.domain.Advertisement;
import fr.softview.birdad.domain.Response;

@RestController
public class BirdadRestController {

	 private static final Logger log = LoggerFactory.getLogger(BirdadRestController.class);
  
	@GetMapping("/birdads")
	Response getAdvertices() throws APIException {
		RestTemplate restTemplate = new RestTemplate();
		String url = "https://graph.facebook.com/v6.0/ads_archive?ad_reached_countries={ad_reached_countries}&search_terms={search_terms}&access_token={access_token}";
		
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("ad_reached_countries", "FR");
		uriVariables.put("search_terms", "paris");
		uriVariables.put("access_token", "EAAt4qpgBMEQBAGedBGbhVslAi2QZAyVQtLOnhZCtJDAH7Y89xZBZBcvUSXsJxP52sZAdPVeLeINs8UPd4cZABlVtvZC8QG8qVKpFZB91n15S6t5mLjTMBati9ymvuFq4lBPURJFzMNfPyt8j0Ugcfxm473TuC4bgjAlJ5crKu330pZCIaM5ct9GZCaL18JXGHepDHS4ZBt7EVIit9Hy1FNQiOWG");
		
		Response response = restTemplate.getForObject(url, Response.class, uriVariables);
		log.info("======== REST API WITH REST TEMPLATE============================== ");
		log.info(response.toString());
        return response ;
	}
}
