package resources;

import java.util.ArrayList;
import java.util.List;

import pojo.AddPlace;
import pojo.LocationAddPlace;

public class TestDataBuild {

	public AddPlace addPlacePayload(String name, String language, String address) {
		
		AddPlace p = new AddPlace();
		p.setAccuracy(50);
		p.setAddress(address);
		p.setLanguage(language);
		p.setPhone_number("(+91) 983 893 3937");
		p.setName(name);
		p.setWesite("http://google.com");
		
		List<String> myList = new ArrayList<String>();
		myList.add("shoe park");
		myList.add("shop");
		p.setTypes(myList);
		
		LocationAddPlace la = new LocationAddPlace();
		la.setLat(-38.383494);
		la.setLng(33.427362);
		p.setLocation(la);
		
		return p;
	}
	
	public String deletePlacePayload(String placeId)
	{
		return "{\\r\\n\\\"place_id\\\" : \\\""+placeId+"\\\"\\r\\n}";
	}
}
