package org.mavenBaseClass;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Report extends BaseClass {
	
	public static void generatejvmreporat(String jsonPath) {
		File f =new File("C:\\Users\\haris\\eclipse-workspace\\cucumbarClass\\Repoting\\JVM");
		
		Configuration con=new Configuration(f, "FB-2023");
		
		con.addClassifications("Automation", "Selenium");
		con.addClassifications("Sprint","66" );
		con.addClassifications("Platform", "Windows11");
		con.addClassifications("Version", "Eclipse-oxygen");
		
		
		
		List<String> li=new ArrayList<String>();
		li.add(jsonPath);
		
		ReportBuilder rep=new ReportBuilder(li, con);
		rep.generateReports();
	
	}

}
