package com.rdzero.bakingit.service.repository;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

interface RecipeService {
    String HTTPS_API_RECIPE_URL = "https://d17h27t6h515a5.cloudfront.net/topher/2017/May/59121517_baking/baking.json";

//    @GET("movie/{type}")
//    Call<DetailsResponse> getMoviesList(@Path("type") String searchType);
//
//    @GET("movie/{movie_id}/reviews")
//    Call<ReviewsResponse> getMovieReviews(@Path("movie_id") String movieId);
//
//    @GET("movie/{movie_id}/videos")
//    Call<TrailersResponse> getMovieTrailers(@Path("movie_id") String movieId);
}
