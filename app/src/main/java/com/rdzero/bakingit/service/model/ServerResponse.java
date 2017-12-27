package com.rdzero.bakingit.service.model;

import android.os.Bundle;

import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;
import org.parceler.Parcels;

import java.util.List;

import javax.annotation.Generated;

import icepick.Bundler;

@Parcel
@Generated("com.robohorse.robopojogenerator")
public class ServerResponse implements Bundler<ServerResponse>{

	@SerializedName("image")
	private String image;

	@SerializedName("servings")
	private int servings;

	@SerializedName("name")
	private String name;

	@SerializedName("ingredients")
	private List<IngredientsItem> ingredients;

	@SerializedName("id")
	private int id;

	@SerializedName("steps")
	private List<StepsItem> steps;

    public ServerResponse() {
    }

    public void setImage(String image){
		this.image = image;
	}

	public String getImage(){
		return image;
	}

	public void setServings(int servings){
		this.servings = servings;
	}

	public int getServings(){
		return servings;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setIngredients(List<IngredientsItem> ingredients){
		this.ingredients = ingredients;
	}

	public List<IngredientsItem> getIngredients(){
		return ingredients;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setSteps(List<StepsItem> steps){
		this.steps = steps;
	}

	public List<StepsItem> getSteps(){
		return steps;
	}

	@Override
 	public String toString(){
		return 
			"ServerResponse{" + 
			"image = '" + image + '\'' + 
			",servings = '" + servings + '\'' + 
			",name = '" + name + '\'' + 
			",ingredients = '" + ingredients + '\'' + 
			",id = '" + id + '\'' + 
			",steps = '" + steps + '\'' + 
			"}";
	}

    @Override
    public void put(String key, ServerResponse serverResponse, Bundle bundle) {
        bundle.putParcelable(key, Parcels.wrap(serverResponse));
    }

    @Override
    public ServerResponse get(String key, Bundle bundle) {
        return Parcels.unwrap(bundle.getParcelable(key));
    }
}