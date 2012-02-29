package com.gailo22.chanom.server;

import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.nio.SelectChannelConnector;
import org.eclipse.jetty.util.resource.ResourceCollection;
import org.eclipse.jetty.webapp.WebAppContext;

public class JettyServerProvider {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		Server server = new Server();

		Connector connector = new SelectChannelConnector();
		connector.setPort(8080);
		connector.setHost("127.0.0.1");
		server.addConnector(connector);

		WebAppContext webAppContext = new AliasEnhancedWebAppContext();
		webAppContext.setContextPath("/chanom");
		webAppContext.setBaseResource(new ResourceCollection(new String[] {
				"./src/main/webapp", "./target" }));
		webAppContext.setResourceAlias("/WEB-INF/classes/", "/classes/");

		server.setHandler(webAppContext);
		server.setStopAtShutdown(true);
		server.start();
		server.join();

	}

}
