package com.actitime.testScripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;

public class ProjectModule extends BaseClass{
	@Test
	public void createProject()
	{
		
		Reporter.log("Project created", true);
	}
}
