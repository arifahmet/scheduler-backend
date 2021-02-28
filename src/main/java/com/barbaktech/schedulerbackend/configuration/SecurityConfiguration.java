package com.barbaktech.schedulerbackend.configuration;

import com.okta.spring.boot.oauth.Okta;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .anyRequest().authenticated()
                .and()
                .oauth2ResourceServer().jwt(); //or .opaqueToken();
        http.cors();
        // force a non-empty response body for 401's to make the response more browser friendly
        Okta.configureResourceServer401ResponseBody(http);


    }
}
