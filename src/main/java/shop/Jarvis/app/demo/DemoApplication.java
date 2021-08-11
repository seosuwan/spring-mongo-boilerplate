package shop.Jarvis.app.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import shop.Jarvis.app.demo.user.entity.User;
import shop.Jarvis.app.demo.user.repository.UserRepository;

import java.util.List;


@SpringBootApplication
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class DemoApplication implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		userRepository.deleteAll();
		userRepository.save(new User("a","이순신","a@","1"));
		userRepository.save(new User("b","홍길동","b@","1"));
		userRepository.save(new User("c","이순신","c@","1"));

		List<User>users = userRepository.findAll();
		System.out.println("전체출력");
		for(User u: users){
			System.out.println(u.toString());
		}
		System.out.println("이순신 만보여주");
		for(User u: userRepository.findAllByName("이순신")){
			System.out.println(u.toString());
		}
	}
}
