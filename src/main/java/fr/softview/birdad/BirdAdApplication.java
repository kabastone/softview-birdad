package fr.softview.birdad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.facebook.ads.sdk.APIContext;
import com.facebook.ads.sdk.APINodeList;
import com.facebook.ads.sdk.AdAccount;
import com.facebook.ads.sdk.Campaign;


@SpringBootApplication
public class BirdAdApplication {

	 public static final APIContext context = new APIContext(
	            "EAAt4qpgBMEQBAIVljrt2hzJLxPeeZAiyJlVj2LmIyEV4uTP6tZAzE5Ryj7SrC88YDAZCjNl4UXfFMCvaTYeQjt7kmHHZBfFFKeZBdklg6b8ZA1SjHqjCw8YmLigbmbblN7GujFJYNHUzlELJzXtWVw81Qz3kGFSshWXMm77DQZAqvFX8Y51sJNJkZAmjxoTHNAg6nY8Ix4gFqgZDZD",
	            "99e3b75b84bfea1075ee0fc79a14f45b"
	    );
	public static void main(String[] args) {
		SpringApplication.run(BirdAdApplication.class, args);
		AdAccount account = new AdAccount("act_2926779830678386", context);
        try {
            APINodeList<Campaign> campaigns = account.getCampaigns().requestAllFields().execute();
            
            campaigns.forEach(campaign -> System.out.println(campaign.getFieldName()));
//            for(Campaign campaign : campaigns) {
//                System.out.println(campaign.getFieldName());
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}
