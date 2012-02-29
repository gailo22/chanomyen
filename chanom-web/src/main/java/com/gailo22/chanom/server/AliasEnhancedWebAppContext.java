package com.gailo22.chanom.server;

import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.jetty.webapp.WebAppContext;

public class AliasEnhancedWebAppContext extends WebAppContext {
	@Override
	public String getResourceAlias(String alias) {

		@SuppressWarnings("unchecked")
		Map<String, String> resourceAliases = (Map<String, String>) getResourceAliases();

		if (resourceAliases == null) {
			return null;
		}

		for (Entry<String, String> oneAlias : resourceAliases.entrySet()) {

			if (alias.startsWith(oneAlias.getKey())) {
				return alias.replace(oneAlias.getKey(), oneAlias.getValue());
			}
		}

		return null;
	}
}
