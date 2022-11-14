package cl.globallogic.graphql.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphQLApplication {

	//http://localhost:8080/graphiql
	public static void main(String[] args) {
		SpringApplication.run(GraphQLApplication.class, args);
	}

}
