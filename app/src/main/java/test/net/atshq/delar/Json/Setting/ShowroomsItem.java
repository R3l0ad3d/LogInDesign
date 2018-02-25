package test.net.atshq.delar.Json.Setting;


import com.google.gson.annotations.SerializedName;


public class ShowroomsItem{

	@SerializedName("showrooms_id")
	private String showroomsId;

	public void setShowroomsId(String showroomsId){
		this.showroomsId = showroomsId;
	}

	public String getShowroomsId(){
		return showroomsId;
	}

	@Override
 	public String toString(){
		return 
			"ShowroomsItem{" + 
			"showrooms_id = '" + showroomsId + '\'' + 
			"}";
		}
}