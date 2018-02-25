package test.net.atshq.delar.Json.SearchProduct;


import com.google.gson.annotations.SerializedName;

public class SearchResultItem{

	@SerializedName("unit_name")
	private String unitName;

	@SerializedName("model_name")
	private String modelName;

	@SerializedName("item_type_name")
	private String itemTypeName;

	@SerializedName("product_size")
	private Object productSize;

	@SerializedName("brand_name")
	private String brandName;

	@SerializedName("color_name")
	private String colorName;

	@SerializedName("model_details")
	private String modelDetails;

	@SerializedName("stock")
	private String stock;

	@SerializedName("product_brands_id")
	private String productBrandsId;

	@SerializedName("product_models_variation_id")
	private String productModelsVariationId;

	public void setUnitName(String unitName){
		this.unitName = unitName;
	}

	public String getUnitName(){
		return unitName;
	}

	public void setModelName(String modelName){
		this.modelName = modelName;
	}

	public String getModelName(){
		return modelName;
	}

	public void setItemTypeName(String itemTypeName){
		this.itemTypeName = itemTypeName;
	}

	public String getItemTypeName(){
		return itemTypeName;
	}

	public void setProductSize(Object productSize){
		this.productSize = productSize;
	}

	public Object getProductSize(){
		return productSize;
	}

	public void setBrandName(String brandName){
		this.brandName = brandName;
	}

	public String getBrandName(){
		return brandName;
	}

	public void setColorName(String colorName){
		this.colorName = colorName;
	}

	public String getColorName(){
		return colorName;
	}

	public void setModelDetails(String modelDetails){
		this.modelDetails = modelDetails;
	}

	public String getModelDetails(){
		return modelDetails;
	}

	public void setStock(String stock){
		this.stock = stock;
	}

	public String getStock(){
		return stock;
	}

	public void setProductBrandsId(String productBrandsId){
		this.productBrandsId = productBrandsId;
	}

	public String getProductBrandsId(){
		return productBrandsId;
	}

	public void setProductModelsVariationId(String productModelsVariationId){
		this.productModelsVariationId = productModelsVariationId;
	}

	public String getProductModelsVariationId(){
		return productModelsVariationId;
	}

	@Override
 	public String toString(){
		return 
			"SearchResultItem{" + 
			"unit_name = '" + unitName + '\'' + 
			",model_name = '" + modelName + '\'' + 
			",item_type_name = '" + itemTypeName + '\'' + 
			",product_size = '" + productSize + '\'' + 
			",brand_name = '" + brandName + '\'' + 
			",color_name = '" + colorName + '\'' + 
			",model_details = '" + modelDetails + '\'' + 
			",stock = '" + stock + '\'' + 
			",product_brands_id = '" + productBrandsId + '\'' + 
			",product_models_variation_id = '" + productModelsVariationId + '\'' + 
			"}";
		}
}