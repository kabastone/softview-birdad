package fr.softview.birdad.web;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.facebook.ads.sdk.APIContext;
import com.facebook.ads.sdk.APIException;

@RestController
public class BirdadRestController {
	 public static final APIContext context = new APIContext(
	            "EAAt4qpgBMEQBAPJzxasFasWKqZARnTmnQfyvcpH08OkgXRDCx5gYC233MNTTSfDFA1XhZCXhm55JrKHfZCR1HwMZCZCDUQjLwxQCqZA157oMojgVbFhnUJwiMhcdM50irStZCyZCXOEMqmEZAWNUK9DuyotNB7hZAMzQ4SPb6uxSgKZAzoUN9Hmh1lX",
	            "99e3b75b84bfea1075ee0fc79a14f45b"
	    );
	 private static final Logger log = LoggerFactory.getLogger(BirdadRestController.class);
  
	@GetMapping("/birdads")
	ResponseEntity<String> getAdvertices() throws APIException {
		RestTemplate restTemplate = new RestTemplate();
		String url = "https://graph.facebook.com/v6.0/ads_archive?ad_reached_countries={ad_reached_countries}&search_terms={search_terms}&access_token={access_token}";
		
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("ad_reached_countries", "FR");
		uriVariables.put("search_terms", "paris");
		uriVariables.put("access_token", "EAAt4qpgBMEQBAOb7QGZBRFjNAudrojUitZBDJizP3tXIn9QtSFHXUXAdY6Qb0ZAW0XFBWDna4NnmmXcN0QWXjGlH6ZCLQiCPdW3L3V1GkUPWsuJuZCpf5wlEcapGkeBq6LM1tm4ZAWnrbAFG5ERnILKgRIdZANsZAZACcMlsXFvWRdGZBs75AT3OUCmDc4sTy6OGSjNKrnAQNSOf0vWOCIJjrE");
		
		ResponseEntity<String> ad = restTemplate.getForEntity(url, String.class, uriVariables);
		log.info(ad.getBody().toString());
        return ad  ;
	}
}
