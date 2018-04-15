package spittr.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	//拦截http请求
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
			 	.antMatchers("/login")
                        .permitAll()
                        .antMatchers("/spittles").authenticated()
					.and()
					.formLogin()
					.loginPage("/login")
//					.loginProcessingUrl("/home")
//					.defaultSuccessUrl("/home").failureUrl("/login?error")
//	                .usernameParameter("user-name").passwordParameter("pwd");
							.and().csrf();
//							.httpBasic();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth)
			throws Exception {
		auth
			.inMemoryAuthentication()
			.withUser("admin").password("123456").roles("admin");
	}
	
}
