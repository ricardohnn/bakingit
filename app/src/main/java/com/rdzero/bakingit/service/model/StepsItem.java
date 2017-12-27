package com.rdzero.bakingit.service.model;

import android.os.Bundle;

import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;
import org.parceler.Parcels;

import javax.annotation.Generated;

import icepick.Bundler;

@Parcel
@Generated("com.robohorse.robopojogenerator")
public class StepsItem implements Bundler<StepsItem>{

	@SerializedName("videoURL")
	String videoURL;

	@SerializedName("description")
	String description;

	@SerializedName("id")
	int id;

	@SerializedName("shortDescription")
    String shortDescription;

	@SerializedName("thumbnailURL")
    String thumbnailURL;

    public StepsItem() {
    }

    public void setVideoURL(String videoURL){
		this.videoURL = videoURL;
	}

	public String getVideoURL(){
		return videoURL;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setShortDescription(String shortDescription){
		this.shortDescription = shortDescription;
	}

	public String getShortDescription(){
		return shortDescription;
	}

	public void setThumbnailURL(String thumbnailURL){
		this.thumbnailURL = thumbnailURL;
	}

	public String getThumbnailURL(){
		return thumbnailURL;
	}

	@Override
 	public String toString(){
		return 
			"StepsItem{" + 
			"videoURL = '" + videoURL + '\'' + 
			",description = '" + description + '\'' + 
			",id = '" + id + '\'' + 
			",shortDescription = '" + shortDescription + '\'' + 
			",thumbnailURL = '" + thumbnailURL + '\'' + 
			"}";
	}

    @Override
    public void put(String key, StepsItem stepsItem, Bundle bundle) {
        bundle.putParcelable(key, Parcels.wrap(stepsItem));
    }

    @Override
    public StepsItem get(String key, Bundle bundle) {
        return Parcels.unwrap(bundle.getParcelable(key));
    }
}