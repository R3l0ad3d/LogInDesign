package test.net.atshq.delar.Json.LocationUpdate;

public class LocationUpdate{
	private String updateTime;
	private String userId;
	private String latitude;
	private String addedOn;
	private String longitude;

	public void setUpdateTime(String updateTime){
		this.updateTime = updateTime;
	}

	public String getUpdateTime(){
		return updateTime;
	}

	public void setUserId(String userId){
		this.userId = userId;
	}

	public String getUserId(){
		return userId;
	}

	public void setLatitude(String latitude){
		this.latitude = latitude;
	}

	public String getLatitude(){
		return latitude;
	}

	public void setAddedOn(String addedOn){
		this.addedOn = addedOn;
	}

	public String getAddedOn(){
		return addedOn;
	}

	public void setLongitude(String longitude){
		this.longitude = longitude;
	}

	public String getLongitude(){
		return longitude;
	}

	@Override
 	public String toString(){
		return 
			"LocationUpdate{" + 
			"update_time = '" + updateTime + '\'' + 
			",user_id = '" + userId + '\'' + 
			",latitude = '" + latitude + '\'' + 
			",added_on = '" + addedOn + '\'' + 
			",longitude = '" + longitude + '\'' + 
			"}";
		}
}
