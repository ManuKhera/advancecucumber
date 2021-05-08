package StepDefination;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	@Before("@SmokeTest")
	public void beforetest()
	{
		System.out.println("hooks run before Smoke Test");
	}
	@After("@SmokeTest")
	public void aftertest()
	{
		System.out.println("After Manu hook Smoke Test");
	}
	@Before("@WebTest")
	public void beforeWebtest()
	{
		System.out.println("hooks run before WebTest ");
	}
	@After("@WebTest")
	public void afterWebtest()
	{
		System.out.println("After Manu hook WebTest");
	}
}
