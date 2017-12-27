package com.rdzero.bakingit.service.repository;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RecipeRepository {
    private RecipeService recipeService;
    private static RecipeRepository recipeRepository;

    private RecipeRepository(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(RecipeService.HTTPS_API_RECIPE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        recipeService = retrofit.create(RecipeService.class);
    }

    public synchronized static RecipeRepository getInstance() {
        //TODO Use Dagger here
        if (recipeRepository == null) {
            recipeRepository = new RecipeRepository();
        }
        return recipeRepository;
    }
//
//    public LiveData<List<MoviesDetails>> getMoviesList(String searchType) {
//        final MutableLiveData<List<MoviesDetails>> data = new MutableLiveData<>();
//
//        recipeService.getMoviesList(searchType).enqueue(new Callback<DetailsResponse>() {
//            @Override
//            public void onResponse(Call<DetailsResponse> call, Response<DetailsResponse> response) {
//                Log.d("NAKAi", response.body().toString());
//                data.setValue(response.body().getResults());
//            }
//
//            @Override
//            public void onFailure(Call<DetailsResponse> call, Throwable t) {
//                // TODO Improve error handling
//                data.setValue(null);
//                Log.d("NAKAe", "error" + t.toString());
//            }
//        });
//
//        return data;
//    }
//
//    public LiveData<List<MovieReviews>> getMovieReviews(String movieId) {
//        final MutableLiveData<List<MovieReviews>> data = new MutableLiveData<>();
//
//        recipeService.getMovieReviews(movieId).enqueue(new Callback<ReviewsResponse>() {
//            @Override
//            public void onResponse(Call<ReviewsResponse> call, Response<ReviewsResponse> response) {
//                data.setValue(response.body().getResults());
//                Log.d("NAKAi", data.getValue().toString());
//            }
//
//            @Override
//            public void onFailure(Call<ReviewsResponse> call, Throwable t) {
//                // TODO Improve error handling
//                data.setValue(null);
//                Log.d("NAKAe", "error" + t.toString());
//            }
//        });
//
//        return data;
//    }
//
//    public LiveData<List<MovieTrailers>> getMovieTrailers(String movieId) {
//        final MutableLiveData<List<MovieTrailers>> data = new MutableLiveData<>();
//
//        recipeService.getMovieTrailers(movieId).enqueue(new Callback<TrailersResponse>() {
//            @Override
//            public void onResponse(Call<TrailersResponse> call, Response<TrailersResponse> response) {
//                //data.setValue(response.body().getResults());
//                Log.d("NAKAi", data.getValue().toString());
//            }
//
//            @Override
//            public void onFailure(Call<TrailersResponse> call, Throwable t) {
//                // TODO Improve error handling
//                data.setValue(null);
//                Log.d("NAKAe", "error" + t.toString());
//            }
//        });
//
//        return data;
//    }
}
