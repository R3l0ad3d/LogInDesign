package test.net.atshq.delar.APIService;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Path;
import test.net.atshq.delar.Json.Agents.AgentsResponse;
import test.net.atshq.delar.Json.LocationUpdate.LocationUpdateResponse;
import test.net.atshq.delar.Json.LogIn.LogInResponse;
import test.net.atshq.delar.Json.SearchProduct.SearchProductResponse;
import test.net.atshq.delar.Json.Setting.SettingResponse;

/**
 * Created by User on 2/25/2018.
 */

public interface ApiService {
    @FormUrlEncoded
    @POST("Mobileauth/login")
    Call<LogInResponse> getLogIn(@Field("identity") String identity, @Field("password") String password);

    @POST("api/agent_list/{user_id}")
    Call<AgentsResponse> getAgentList(@Path("user_id")long path);

    @POST("api/settings/{user_id}")
    Call<SettingResponse> getSetting(@Path("user_id")long path);

    @FormUrlEncoded
    @POST("api/location_update/{user_id}")
    Call<LocationUpdateResponse> getLocationUpdate(@Path("user_id") long path, @Field("latitude")long  latitude,
                                                   @Field("longitude") long longitude, @Field("update_time") String update_time);

    @POST("api/search_product/{user_id}/{showroom_id}")
    Call<SearchProductResponse> getSearchProduct(@Path("user_id")long user_id, @Path("showroom_id")long showroom_id);
}
