package br.edu.unime.Vacinacao;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan({"br.edu.unime.Vacinacao.Service"})
@EnableMongoRepositories(basePackages = "br.edu.unime.Vacinacao.Repository")
@EntityScan("basePackages = br.edu.unime.Vacinacao.Entity")
public class VacinacaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(VacinacaoApplication.class, args);
	}
	public @Bean MongoClient mongoClient() {
		return MongoClients.create("mongodb://localhost:27017");
	}

}
