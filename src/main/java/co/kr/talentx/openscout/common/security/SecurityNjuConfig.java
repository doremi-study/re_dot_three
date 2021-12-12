package co.kr.talentx.openscout.common.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Order(2)
@Configuration
@EnableWebSecurity
public class SecurityNjuConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.csrf().disable()
			.headers().frameOptions().disable()
			.and()
			.antMatcher("/nju/**")
				.authorizeRequests()
				.antMatchers("**/signup/**", "/login/**")
				.permitAll()
				.anyRequest().authenticated()
			.and()
				.formLogin()
				//.loginPage("/nju/login")
				.usernameParameter("idNumber")
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