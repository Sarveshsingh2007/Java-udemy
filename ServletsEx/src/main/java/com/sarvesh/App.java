package com.sarvesh;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class App
{
    public static void main( String[] args ) throws LifecycleException
    {
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);

        Context ctx = tomcat.addContext("", null);
        Tomcat.addServlet(ctx, "HelloServlet", new HelloServlet());
        ctx.addServletMappingDecoded("/hello", "HelloServlet");

        tomcat.getConnector();
        tomcat.start();
        System.out.println("Tomcat Started...");
        tomcat.getServer().await();
    }
}
