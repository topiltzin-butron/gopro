package org.topiltzin.shibumi.gopro;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.topiltzin.shibumi.gopro.client.GoProClient;
import org.topiltzin.shibumi.gopro.dto.GoProCamera;
import org.topiltzin.shibumi.gopro.exception.GoProException;

@RunWith(MockitoJUnitRunner.class)
public class GoProTest {

	@Mock
	private GoProClient goProClient;
	private GoProCamera goProCamera;

	@BeforeClass
	public static void oneTimeSetup() {
		System.out.println("- oneTimeSetup");
	}

	@AfterClass
	public static void oneTimeTearDown() {
		System.out.println("- oneTimeTearDown");
	}

	@Before
	public void setUp() {
		System.out.println("-- setUp");
		goProCamera = new GoProCamera("goprotopy");
	}

	@After
	public void tearDown() {
		System.out.println("-- tearDown");
	}

	@Test
	public void testTurnOn() throws GoProException {
		System.out.println("--- testTurnOn");
		doNothing().when(goProClient).turnOn(goProCamera);
		goProClient.turnOn(goProCamera);
	}
	
	@Test(expected=GoProException.class)
	public void testTurnOnFailed() throws GoProException {
		System.out.println("--- testTurnOnFailed");
		doThrow(new GoProException("Unable to turn on")).when(goProClient).turnOn(goProCamera);
		goProClient.turnOn(goProCamera);
	}
	
	@Test
	public void testTurnOff() throws GoProException {
		System.out.println("--- testTurnOff");
		doNothing().when(goProClient).turnOff(goProCamera);
		goProClient.turnOff(goProCamera);
	}
	
	@Test(expected=GoProException.class)
	public void testTurnOffFailed() throws GoProException {
		System.out.println("--- testTurnOffFailed");
		doThrow(new GoProException("Unable to turn off")).when(goProClient).turnOff(goProCamera);
		goProClient.turnOff(goProCamera);
	}

}
