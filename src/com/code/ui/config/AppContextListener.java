package com.code.ui.config;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.code.dal.EnvironmentUtilities;

public class AppContextListener implements ServletContextListener {

    @SuppressWarnings("static-access")
	public void contextInitialized(ServletContextEvent p1) {        
         try{
             EnvironmentUtilities.setContextPath(p1.getServletContext().getContextPath());
             EnvironmentUtilities.setServerName(p1.getServletContext().getServerInfo().split(" ")[0]);
         }
         catch(Exception e){
             e.printStackTrace();
         }
         System.out.println("Server Info: " + EnvironmentUtilities.getServerInfo());
         System.out.println("Context Path: " + EnvironmentUtilities.getContextPath());
         EnvironmentUtilities.setApplicationPath(p1.getServletContext().getRealPath("/").replace("\\", "/"));
    }
  
    public void contextDestroyed(ServletContextEvent event) {
    }
}
