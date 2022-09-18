package stepDefinations;

import java.io.IOException;

import io.cucumber.java.Before;

public class Hooks 
{
	@Before("@DeletePlace")
	public void beforeScenario() throws IOException
	{
		//execute this code only when place id is null
		//write a code that will give you the place id
		StepDefination sd = new StepDefination();
		if(StepDefination.place_id==null)
		{
			sd.add_place_payload_with("Vipul", "Hindi", "Gaya");
			sd.user_calls_with_http_request("AddPlaceAPI", "POST");
			sd.verify_place_id_created_maps_to_using("Vipul", "getPlaceAPI");
		}
		
	}
}
