package com.example.instagram;

import com.example.instagram.models.StoryModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface StoryApi {

    @GET("stories")
    Call<List<StoryModel>> getStories();

    @GET("stories/{sId}")
    Call<StoryModel> getStory(@Path("sId") String sId);


}
