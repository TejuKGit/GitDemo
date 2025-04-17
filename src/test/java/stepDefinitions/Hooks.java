package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks 
{
	//run before every scenario in al the feature files
	@Before("@NetBanking")
	public void netBankingSetup()
	{
		System.out.println("***********BEFORE*******************");
		System.out.println("Setup the entries in Netbanking database");
	}
	
	@After
	public void tearDown()
	{
		System.out.println("Clear the entriesXXXXXXXXXXXXXXXXXXXXXXXXX");
	}
	
	@Before("@Mortgage")
	public void mortGageSetup()
	{
		System.out.println("Clear the entries++++++++++++++++++++");
		System.out.println("sop1");
		System.out.println("sop2");
	}
	
	//Beforehook -> Background-> Scenario-> Afterhook

}
