package com.neo.java.junits;

import org.junit.Test;

import com.neo.java.JavaUtils;

public class JunitCase {

	@Test
	public void test() {
		System.out.println(JavaUtils.parseSafe(Boolean.class, "true"));
		
	}

}
