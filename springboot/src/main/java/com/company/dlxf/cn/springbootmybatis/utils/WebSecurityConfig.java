package com.company.dlxf.cn.springbootmybatis.utils;


import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    UserDetailsService customUserService(){ //注册UserDetailsService 的bean
        return new CustomUserService();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(customUserService()).passwordEncoder(new BCryptPasswordEncoder()); //user Details Service验证
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
            http
                /*设置哪些请求不需要拦截*/
                .csrf().disable()
                .authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/login").permitAll()
                .antMatchers("/auth/login").permitAll()
                .antMatchers("/static/**").permitAll()
                .anyRequest().authenticated()
                .and()

                /*表单登录*/
                .formLogin()
                .loginPage("/login")
                .loginProcessingUrl("/auth/login")
                .defaultSuccessUrl("/admin")
                .usernameParameter("userName")
                .passwordParameter("password")
                .and()

                /*退出*/
                .logout()
                .logoutUrl("/exit")
                .logoutSuccessUrl("/login")
                .deleteCookies("JSESSIONID")
                .and()

                .httpBasic();
                http.headers().frameOptions().sameOrigin();
    }

}
