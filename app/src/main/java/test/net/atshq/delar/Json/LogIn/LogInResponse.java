package test.net.atshq.delar.Json.LogIn;


import com.google.gson.annotations.SerializedName;


public class LogInResponse{

	@SerializedName("response")
	private Response response;

	public void setResponse(Response response){
		this.response = response;
	}

	public Response getResponse(){
		return response;
	}

	@Override
 	public String toString(){
		return 
			"LogInResponse{" + 
			"response = '" + response + '\'' + 
			"}";
		}
}