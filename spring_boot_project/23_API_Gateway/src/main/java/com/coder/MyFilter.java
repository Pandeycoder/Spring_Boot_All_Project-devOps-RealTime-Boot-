//package com.coder;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.http.server.reactive.ServerHttpRequest;
//import org.springframework.stereotype.Component;
//import org.springframework.web.server.ServerWebExchange;
//
//@Component
//public class MyFilter implements GlobalFilter {
//
//	private Logger logger=LoggerFactory.getLogger(MyFilter.class);
//	
//	
//	@Override
//	public Mono<void> filter(ServerWebExchange exchange, GatewayFilter chain)
//	{
//		logger.info("MyFilter: - filter method executed...");
//		
//		ServerHttpRequest req=exchange.getRequest();
//		
//		return chain.filter(exchange);
//	}
//} 
