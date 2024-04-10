package in.nareshit.raghu.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket createDocketApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("in.nareshit.raghu.rest"))
				.paths(PathSelectors.regex("/rest.*"))
				.build()
				.apiInfo(apiInfo())
				;
	}

	private ApiInfo apiInfo() {
		return new ApiInfo(
				"WAREHOUSE APP", //title
				"E-TECH WAREHOUSE APPLICATION(NIT-HYD)", //description 
				"WH 3.2 GA", //version
				"https://nareshit.in/", //terms of service URL
				new Contact("RAGHU S RAGHU", "https://github.com/javabyraghu", "javabyraghu@gmail.com"), //developer contact info
				"NIT-HYD WH Pvt Ltd", //license
				"https://nareshit.in/copyrights/hyd-wh/2020", //license URL
				Collections.emptyList() //Vendor names as list
				);
	}
}
