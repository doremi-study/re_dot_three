package co.kr.talentx.openscout.common.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Order(1)
@Configuration
@EnableWebSecurity
public class SecurityCuConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.csrf().disable()
			.headers().frameOptions().disable()
			.and()
				//.antMatcher("/cu/**")
				.authorizeRequests()
				.antMatchers("/cu/login/", "/cu/signup/")
				.permitAll()
				//.anyRequest().authenticated()
			.and()
				.formLogin()
				.loginPage("/cu/login")
				.usernameParameter("businessNumber")
				.passwordParameter("password")
				.permitAll()
			.and()
				.logout()
				.logoutSuccessUrl("/")
		;

	}

	@Override
	public void configure(WebSecurity web) throws Exception {
		super.configure(web);
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		super.configure(auth);
	}

}
