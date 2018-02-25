package test.net.atshq.delar.Json.Setting;

import java.util.List;

import com.google.gson.annotations.SerializedName;


public class SettingResponse{

	@SerializedName("settings")
	private List<SettingsItem> settings;

	@SerializedName("showrooms")
	private List<ShowroomsItem> showrooms;

	public void setSettings(List<SettingsItem> settings){
		this.settings = settings;
	}

	public List<SettingsItem> getSettings(){
		return settings;
	}

	public void setShowrooms(List<ShowroomsItem> showrooms){
		this.showrooms = showrooms;
	}

	public List<ShowroomsItem> getShowrooms(){
		return showrooms;
	}

	@Override
 	public String toString(){
		return 
			"SettingResponse{" + 
			"settings = '" + settings + '\'' + 
			",showrooms = '" + showrooms + '\'' + 
			"}";
		}
}