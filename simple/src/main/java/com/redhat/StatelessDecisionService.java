package com.redhat;

import java.util.Collection;
import java.util.Map;

public interface StatelessDecisionService {

	
	void runRules(Collection<Object> facts, String processId);
}