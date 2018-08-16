package com.googleapi.repositoryimpl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
import org.springframework.stereotype.Component;

import com.googleapi.repository.AuthorizationService;


@Configuration
@EnableWebSecurity
@EnableOAuth2Client
@PropertySource("application.properties")
public class AuthorizationServiceImpl implements AuthorizationService{

	@Value("${google.client.client-id}")
	private String clientId;
	@Value("${google.client.client-secret}")
	private String clientSecret;
	@Value("${google.client.redirectUri}")
	private String redirectURI;
	

	@Override
	public String getTokenID() {
		System.out.println("In getTokenID Method");
		
		System.out.println("ClientId :"+clientId);
		System.out.println("ClientSecret :"+clientSecret);
		System.out.println("RedirectURI :"+redirectURI);
		
		String token = "4/PACKTZ7w8uEY0bgFAagFh_QThTzgkQ0tvQ4Y5hG_Ls1SjVoE-OAPjxqAGf_Nmev8l8rdL0ko_xhXefdFez9AEso#";
		return token;
	}
	
	@Bean
	@Description("Enables ${...} expressions in the @Value annotations"
			+ " on fields of this configuration. Not needed if one is"
			+ " already available.")
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}

}
