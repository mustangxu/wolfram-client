/**
 * Authored by jayxu @2022
 */
package com.jayxu.wolfram;

import com.google.gson.GsonBuilder;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * @author xujiajing
 */
public interface WolframService {
    String BASE_URL = "https://api.wolframalpha.com/v2/";
    String APP_ID = "THX44E-3GUJQYYWQL";

    static WolframService init() {
        var gson = new GsonBuilder().setLenient().create();
        // var interceptor = new HttpLoggingInterceptor();
        // interceptor.setLevel(HttpLoggingInterceptor.Level.HEADERS);

        var retrofit = new Retrofit.Builder().baseUrl(WolframService.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(gson))
            // .client(
            // new OkHttpClient.Builder().addInterceptor(interceptor).build())
            .build();

        return retrofit.create(WolframService.class);
    }

    @GET("query")
    Call<WolframResponse> query(@Query("appid") String appID,
            @Query("input") String input, @Query("output") String output);

    default Call<WolframResponse> query(@Query("input") String input) {
        return this.query(APP_ID, input, "json");
    }
}
