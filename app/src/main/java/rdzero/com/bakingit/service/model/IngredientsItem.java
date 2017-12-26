package rdzero.com.bakingit.service.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class IngredientsItem{

	@SerializedName("quantity")
	private int quantity;

	@SerializedName("measure")
	private String measure;

	@SerializedName("ingredient")
	private String ingredient;

	public void setQuantity(int quantity){
		this.quantity = quantity;
	}

	public int getQuantity(){
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
}