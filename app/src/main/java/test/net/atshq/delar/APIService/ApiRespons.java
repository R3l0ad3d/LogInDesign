package test.net.atshq.delar.APIService;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import test.net.atshq.delar.Json.Agents.AgentsResponse;
import test.net.atshq.delar.Json.LocationUpdate.LocationUpdateResponse;
import test.net.atshq.delar.Json.LogIn.LogInResponse;
import test.net.atshq.delar.Json.SearchProduct.SearchProductResponse;
import test.net.atshq.delar.Json.Setting.SettingResponse;

/**
 * Created by User on 2/25/2018.
 */

public class ApiRespons {
    protected static ApiRespons INSTANCE=null;
    protected static final String BASE_URL="http://dealer.x-io-m.com/";

    protected static Retrofit retrofit;
    protected static ApiService apiService;

    protected ApiRespons() {
    }
    public static ApiRespons getInstance(){
        if(INSTANCE==null){
            synchronized (ApiRespons.class){
                if(INSTANCE==null) INSTANCE=new ApiRespons();
            }
            INSTANCE = new ApiRespons();
        }
        return INSTANCE;
    }

    protected static Retrofit getRetrofit(){
        retrofit =   new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;
    }

    protected static ApiService getApiService(){
        apiService = getRetrofit().create(ApiService.class);
        return apiService;
    }

    //login call
    public Call<LogInResponse> callLogIn(String identity, String password){
        return getApiService().getLogIn(identity,password);
    }

    //agent list
    public Call<AgentsResponse> callAgents(long userId){
        return getApiService().getAgentList(userId);
    }

    //setting
    public Call<SettingResponse> callSetting(long userId){
        return getApiService().getSetting(userId);
    }

    //locationUpdate
    public Call<LocationUpdateResponse> callLocationUpdate(long userId,long latitiude,long longitude,String updateTime){
        return getApiService().getLocationUpdate(userId,latitiude,longitude,updateTime);
    }

    //search product
    public Call<SearchProductResponse> callSearchProduct(long userId,long showRoomId){
        return getApiService().getSearchProduct(userId,showRoomId);
    }
}
