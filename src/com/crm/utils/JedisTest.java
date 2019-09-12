package com.crm.utils;

import org.junit.Test;

import redis.clients.jedis.Jedis;

public class JedisTest {
	
	@Test
	public void test01() {
		Jedis jedis = new Jedis("192.168.43.95",6379);

		jedis.set("username","lucy");
		
		String username = jedis.get("username");
		System.out.println(username);
		jedis.close();
	}
	
	@Test
	public void test02() {
		
	}
	
	
	

}
