package fr.softview.birdad.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriBuilder;
import org.springframework.web.util.UriComponentsBuilder;

import com.facebook.ads.sdk.APIException;

import fr.softview.birdad.domain.Advertisement;
import fr.softview.birdad.domain.Page;
import fr.softview.birdad.domain.Response;

@RestController
@CrossOrigin
public class BirdadRestController {

	 private static final Logger log = LoggerFactory.getLogger(BirdadRestController.class);
	 private static final String ACCESS_TOKEN = "EAAt4qpgBMEQBADNpGapJIE3mHx0y8WhYvkub4oppLjoh0ouSZA0JU3CpJY3R8WpvZA9Gr9Qfezy2TreGFRY6PPQ6YNZBqQvsusWhVJjjUozHL7LKuGiWWwVyWm1GZA70n2fLpDyGyFZAq2zg8vik3CWlYpK5qArafZB9CdpWRa5lpiZBFzrBrKuAwPejs3O29YZD";
	
	 private static final String HOST = "graph.facebook.com" ;
	@GetMapping("/birdads")
	Response getAdvertices(@RequestParam() MultiValueMap<String, String> uriParams) throws APIException {
		RestTemplate restTemplate = new RestTemplate();
		//uriParams.addIfAbsent("ad_reached_countries", "FR,US,SN");
		//uriParams.addIfAbsent("search_terms", "paris");
		uriParams.add("access_token", ACCESS_TOKEN);

		UriBuilder uri = UriComponentsBuilder.newInstance(
				).scheme("https")
				.host(HOST)
				.path("/v6.0/ads_archive")
				.queryParams(uriParams);
		
		log.info("URI " + uri.build().toString());
		Response response = restTemplate.getForObject(uri.build().toString(), Response.class);
		response.getData().stream().forEach(
				(Advertisement ad) -> { 
					try {
						ad.setPage((Page) getPageFanCount(ad.getPageID(), "fan_count"));
					} catch (APIException e) {
						e.printStackTrace();
					}
				} );
		log.info("======== REST API WITH REST TEMPLATE============================== ");
		log.info(response.toString());
        return response ;
	}
	
	
	Page getPageFanCount(Long pageId, String fields) throws APIException  {
		
		RestTemplate restTemplate = new RestTemplate();

		UriBuilder uri = UriComponentsBuilder.newInstance(
				).scheme("https")
				.host(HOST)
				.path("/v6.0/" + pageId)
				.queryParam("fields", fields)
				.queryParam("access_token", "3228898833805380|FWP7oncVcKQQ1xXZMddomYz8u0w");
		log.info("URI " + uri.build().toString());
		Page response = restTemplate.getForObject(uri.build().toString(), Page.class);
		log.info("======== REST API WITH REST TEMPLATE============================== ");
		log.info(response.toString());
		return response;
	}
}
