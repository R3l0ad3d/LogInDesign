package test.net.atshq.delar.Json.LocationUpdate;

public class LocationUpdateResponse{
	private LocationUpdate locationUpdate;

	public void setLocationUpdate(LocationUpdate locationUpdate){
		this.locationUpdate = locationUpdate;
	}

	public LocationUpdate getLocationUpdate(){
		return locationUpdate;
	}

	@Override
 	public String toString(){
		return 
			"LocationUpdateResponse{" + 
			"location_update = '" + locationUpdate + '\'' + 
			"}";
		}
}
