package fr.softview.birdad.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.facebook.ads.sdk.APIContext;
import com.facebook.ads.sdk.APIException;
import com.facebook.ads.sdk.APINodeList;
import com.facebook.ads.sdk.AdAccount;
import com.facebook.ads.sdk.Campaign;

@RestController
public class BirdadRestController {
	 public static final APIContext context = new APIContext(
	            "EAAt4qpgBMEQBAPJzxasFasWKqZARnTmnQfyvcpH08OkgXRDCx5gYC233MNTTSfDFA1XhZCXhm55JrKHfZCR1HwMZCZCDUQjLwxQCqZA157oMojgVbFhnUJwiMhcdM50irStZCyZCXOEMqmEZAWNUK9DuyotNB7hZAMzQ4SPb6uxSgKZAzoUN9Hmh1lX",
	            "99e3b75b84bfea1075ee0fc79a14f45b"
	    );
  
	@GetMapping("/birdads/{id}")
	ResponseEntity<APINodeList<Campaign>> getAdvertices(Long id) throws APIException {
		AdAccount account = new AdAccount(id, context);
        APINodeList<Campaign> campaigns = account.getCampaigns().requestAllFields().execute();
        return new ResponseEntity<APINodeList<Campaign>>(campaigns, HttpStatus.OK)  ;
	}
}
