package cn.luischen;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
@SpringBootApplication(exclude=DataSourceAutoConfiguration.class)
public class SpringBootRun {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringBootRun.class, args);
	}

}
