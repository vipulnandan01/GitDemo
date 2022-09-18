package resources;

import java.util.ArrayList;

import pojo.AddPlace;
import pojo.Location;

//This class is responsible to generate test data for all our test cases
public class TestDataBuild 
{
	public AddPlace addPlacePayLoad(String name, String language, String address)
	{
		AddPlace ap= new AddPlace();
		ap.setAccuracy(50);
		ap.setAddress(address);
		ap.setLanguage(language);
		
		Location l = new Location();
		l.setLat(-38.383494);
		l.setLng(33.427362);
		ap.setLocation(l);
		
		ap.setName(name);
		ap.setPhone_number("9911234556");
		ap.setWebsite("29, side layout, cohen 010");
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("shoe park");
		al.add("shop");
		
		ap.setTypes(al);
		return ap;
	}
	public String deletePlacePayload(String placeId)
	{
		return "{\r\n    \"place_id\": \""+placeId+"\"   \r\n}";
	}
	
}
