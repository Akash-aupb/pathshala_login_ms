package com.ps.pathshala;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class PathshalaApplication  {



	public static void main(String[] args) {
		SpringApplication.run(PathshalaApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		String sql = "select school_name from SCHOOL_MAP;";
//		String result = jdbcTemplate.queryForObject(sql,String.class);
//		System.out.println(result);
//	}
}
