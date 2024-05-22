package com.coder.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import com.coder.model.Book;

@Configuration
public class RedisConfig {
	
	@Bean
	public JedisConnectionFactory jedisConnFactory()
	{
		JedisConnectionFactory jf=new JedisConnectionFactory();
		
		//jf.setHostName();
		//jf.setPassword(null);
		//jf.setPort(0);
		
		
		return jf;
	}
	
	@Bean
	public RedisTemplate<String,Book> redisTemplate()
	{
		RedisTemplate <String ,Book> redisTemplate =new RedisTemplate();
		
		redisTemplate.setConnectionFactory(jedisConnFactory());
		
		return redisTemplate;
		
	}

}
