package org.qywx.sdk.agent.response;

import org.qywx.sdk.agent.object.MinAgent;
import org.qywx.sdk.base.Response;
import java.util.List;

/**
 * 获取企业应用列表返回对象
 * @author Rocye
 * @version 2018.1.22
 */
public class AgentListRespone extends Response {

    /** 企业应用列表 */
    private List<MinAgent> agentlist;

	public List<MinAgent> getAgentlist() {
		return agentlist;
	}
	public void setAgentlist(List<MinAgent> agentlist) {
		this.agentlist = agentlist;
	}

}
