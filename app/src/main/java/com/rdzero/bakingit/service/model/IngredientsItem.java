package com.rdzero.bakingit.service.model;

import android.os.Bundle;

import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;
import org.parceler.Parcels;

import javax.annotation.Generated;

import icepick.Bundler;

@Parcel
@Generated("com.robohorse.robopojogenerator")
public class IngredientsItem implements Bundler<IngredientsItem>{

	@SerializedName("quantity")
	float quantity;

	@SerializedName("measure")
	String measure;

	@SerializedName("ingredient")
	String ingredient;

    public IngredientsItem() {
    }

    public void setQuantity(float quantity){
		this.quantity = quantity;
	}

	public float getQuantity(){
		return quantity;
	}

	public void setMeasure(String measure){
		this.measure = measure;
	}

	public String getMeasure(){
		return measure;
	}

	public void setIngredient(String ingredient){
		this.ingredient = ingredient;
	}

	public String getIngredient(){
		return ingredient;
	}

	@Override
 	public String toString(){
		return 
			"IngredientsItem{" + 
			"quantity = '" + quantity + '\'' + 
			",measure = '" + measure + '\'' + 
			",ingredient = '" + ingredient + '\'' + 
			"}";
	}

    @Override
    public void put(String key, IngredientsItem ingredientsItem, Bundle bundle) {
        bundle.putParcelable(key, Parcels.wrap(ingredientsItem));
    }

    @Override
    public IngredientsItem get(String key, Bundle bundle) {
        return Parcels.unwrap(bundle.getParcelable(key));
    }
}