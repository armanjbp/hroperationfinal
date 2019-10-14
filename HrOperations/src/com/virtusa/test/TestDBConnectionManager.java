package com.virtusa.test;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.Test;

import com.virtusa.dbconnection.ConnectionManager;

public class TestDBConnectionManager {
	Connection connection=ConnectionManager.openConnection();

	@Test
	public void positive_test() {
		
		assertEquals(true, connection!=null);
		assertTrue(true);
	}
	//@Test
//	public void Negative_test()
//	{
//		assertEquals(false, connection!=null);
//		assertTrue(true);
//	}

}
