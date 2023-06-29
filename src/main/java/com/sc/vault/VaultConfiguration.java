package com.sc.vault;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;

@Configuration
@Getter
@Setter
@ConfigurationProperties("demo")
public class VaultConfiguration {

	private String username;

	private String password;

	private String dbuser;

}
