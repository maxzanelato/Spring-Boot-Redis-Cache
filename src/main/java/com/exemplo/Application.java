package com.exemplo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/*
 * Exemplo extraído de https://www.journaldev.com/18141/spring-boot-redis-cache
 */

@SpringBootApplication
@EnableCaching
//public class Application implements CommandLineRunner {
public class Application {

//	private final Logger LOG = LoggerFactory.getLogger(getClass());
//
//	@Autowired
//	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

//	@Override
//	public void run(String... strings) {
//
//		//Populating embedded database here
//		LOG.info("Saving users. Current user count is {}.", userRepository.count());
//		User shubham = new User("Shubham", 2000);
//		User pankaj = new User("Pankaj", 29000);
//		User lewis = new User("Lewis", 550);
//		User roberto = new User("RobeRRRRRto", 550);
//
//		userRepository.save(shubham);
//		userRepository.save(pankaj);
//		userRepository.save(lewis);
//		userRepository.save(roberto);
//		LOG.info("Done saving users. Data: {}.", userRepository.findAll());
//	}
}
