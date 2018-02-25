package test.net.atshq.delar.Json.SearchProduct;

import java.util.List;

import com.google.gson.annotations.SerializedName;


public class SearchProductResponse{

	@SerializedName("search_result")
	private List<SearchResultItem> searchResult;

	public void setSearchResult(List<SearchResultItem> searchResult){
		this.searchResult = searchResult;
	}

	public List<SearchResultItem> getSearchResult(){
		return searchResult;
	}

	@Override
 	public String toString(){
		return 
			"SearchProductResponse{" + 
			"search_result = '" + searchResult + '\'' + 
			"}";
		}
}