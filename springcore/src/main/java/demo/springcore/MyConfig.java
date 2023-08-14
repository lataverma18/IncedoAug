package demo.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"demo.springcore.beans"})
public class MyConfig {
	
	public JdbcTemplate getJdbcTemplate()
	{
		JdbcTemplate jt=new JdbcTemplate(getDS());
		return jt;
	}
	public DataSource getDS()
	{
		DataSource ds=new DriverManagerDataSource("jdbc:postgresql://localhost:5432/WiproDB", "postgres", "system");
		return ds;
	}
	
}
