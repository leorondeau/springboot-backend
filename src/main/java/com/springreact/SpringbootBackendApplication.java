package com.springreact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
		
	}
	
	@Override
	public void run (String... args) throws Exception {
		
		String sql = "INSERT INTO employees (eid, name, role) VALUES ('001', 'Leo Rondeau', 'Creator')";
		
		int rows = jdbcTemplate.update(sql);
		if(rows > 0) {
			System.out.println("A new row has been added");
		}
	}
	

}
