package test.net.atshq.delar.Json.Agents;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class AgentsResponse{

	@SerializedName("agents")
	private List<AgentsItem> agents;

	public void setAgents(List<AgentsItem> agents){
		this.agents = agents;
	}

	public List<AgentsItem> getAgents(){
		return agents;
	}

	@Override
 	public String toString(){
		return 
			"AgentsResponse{" + 
			"agents = '" + agents + '\'' + 
			"}";
		}
}