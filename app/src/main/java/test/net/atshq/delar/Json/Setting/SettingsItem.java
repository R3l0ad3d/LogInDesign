package test.net.atshq.delar.Json.Setting;


import com.google.gson.annotations.SerializedName;


public class SettingsItem{

	@SerializedName("user_id")
	private String userId;

	@SerializedName("tracking_starts_at")
	private String trackingStartsAt;

	@SerializedName("gps_log_keep")
	private String gpsLogKeep;

	@SerializedName("tracking_ends_at")
	private String trackingEndsAt;

	@SerializedName("update_delay")
	private String updateDelay;

	public void setUserId(String userId){
		this.userId = userId;
	}

	public String getUserId(){
		return userId;
	}

	public void setTrackingStartsAt(String trackingStartsAt){
		this.trackingStartsAt = trackingStartsAt;
	}

	public String getTrackingStartsAt(){
		return trackingStartsAt;
	}

	public void setGpsLogKeep(String gpsLogKeep){
		this.gpsLogKeep = gpsLogKeep;
	}

	public String getGpsLogKeep(){
		return gpsLogKeep;
	}

	public void setTrackingEndsAt(String trackingEndsAt){
		this.trackingEndsAt = trackingEndsAt;
	}

	public String getTrackingEndsAt(){
		return trackingEndsAt;
	}

	public void setUpdateDelay(String updateDelay){
		this.updateDelay = updateDelay;
	}

	public String getUpdateDelay(){
		return updateDelay;
	}

	@Override
 	public String toString(){
		return 
			"SettingsItem{" + 
			"user_id = '" + userId + '\'' + 
			",tracking_starts_at = '" + trackingStartsAt + '\'' + 
			",gps_log_keep = '" + gpsLogKeep + '\'' + 
			",tracking_ends_at = '" + trackingEndsAt + '\'' + 
			",update_delay = '" + updateDelay + '\'' + 
			"}";
		}
}