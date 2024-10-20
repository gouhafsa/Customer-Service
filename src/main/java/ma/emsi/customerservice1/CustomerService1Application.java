package ma.emsi.customerservice1;

import ma.emsi.customerservice1.Dao.Customer;
import ma.emsi.customerservice1.Dao.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class CustomerService1Application {

    public static void main(String[] args) {
        SpringApplication.run(CustomerService1Application.class, args);
    }
    @Bean
    CommandLineRunner start(CustomerRepository customerRepository) {
        return args -> {
            customerRepository.save(Customer.builder().name("X").email("X@gmail.com").build());
            customerRepository.save(Customer.builder().name("Y").email("Y@gmail.com").build());
        };
    }

}
