package com.googleapi.repositoryimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;

import com.googleapi.repository.AuthorizationService;

@EnableWebSecurity
@EnableOAuth2Client
public class AuthorizationServiceImpl implements AuthorizationService{

	
	@Value("${google.clientId}")
	private String clientId;
	@Value("${google.clientSecret}")
	private String clientSecret;
	@Value("${google.redirectUri}")
	private String redirectURI;
	
	@Autowired
    private Environment env;
	
	@Override
	public String getTokenID() {
		System.out.println("In getTokenID Method");
		
		System.out.println("Access Token URI : "+env.getProperty("google.access-token-uri"));
		
		System.out.println("ClientId :"+clientId);
		System.out.println("ClientSecret :"+clientSecret);
		System.out.println("RedirectURI :"+redirectURI);
		
		String token = "4/PACKTZ7w8uEY0bgFAagFh_QThTzgkQ0tvQ4Y5hG_Ls1SjVoE-OAPjxqAGf_Nmev8l8rdL0ko_xhXefdFez9AEso#";
		return token;
	}
	
}
