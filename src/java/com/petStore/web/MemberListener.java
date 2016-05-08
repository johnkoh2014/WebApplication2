/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.petStore.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Web application lifecycle listener.
 *
 * @author User
 */
public class MemberListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent sce) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Map<String,String> userMap = new HashMap<String,String>();
        userMap.put("apple","apple123");
        userMap.put("orange","orange123");
        userMap.put("pear","pear123");
        
        Map<String, ArrayList<String>> petMap = new HashMap<String, ArrayList<String>>();
        
        ArrayList<String> applePets = new ArrayList<String>();
        applePets.add("snowy");
        applePets.add("fishy");
        petMap.put("apple", applePets);
        
        ArrayList<String> ornangePets = new ArrayList<String>();
        ornangePets.add("doggy");
        ornangePets.add("birdy");
        petMap.put("orange", ornangePets);
        
        ServletContext context = sce.getServletContext();
        
        context.setAttribute("users", userMap);
        context.setAttribute("pets", petMap);
        
    }

    public void contextDestroyed(ServletContextEvent sce) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
