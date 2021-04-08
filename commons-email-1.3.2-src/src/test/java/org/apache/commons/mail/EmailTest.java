package org.apache.commons.mail;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import java.nio.charset.IllegalCharsetNameException;
import java.util.Date;
public class EmailTest {
	
	private static final String[] TEST_EMAILS = {"ab@bc.com", "a.b@c.org",
	"abcdefghijklmnopqrst@abcdefghijklmnopqrst.com.bd"};
	//private static final String INVALID_EMAIL = "###";
	private static final String VALID_EMAIL = "abc@def.com";
	private static final String EMPTY = "";
	private static final String NAME = "asdasd";
	private static final String MESSAGE = "this is a message";
	
	//email concrete class for testing
	private EmailConcrete email;
	
	@Before
	public void setUpEmailTest() throws Exception {
	email = new EmailConcrete();
	}
	
	@After
	public void tearDownEmailTest() throws Exception{
	
	}

}