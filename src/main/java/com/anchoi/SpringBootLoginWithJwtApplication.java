package com.anchoi;

//import com.tuyendt.springbootloginwithjwt.Entity.User;
//import Repository.com.anchoi.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootLoginWithJwtApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootLoginWithJwtApplication.class, args);
    }

//    @Autowired
//    UserRepository userRepository;
//    @Autowired
//    PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
        // Khi chương trình chạy
        // Insert vào csdl một user.
//        User user = new User();
//        user.setUsername("loda");
//        user.setPassword(passwordEncoder.encode("loda"));
//        userRepository.save(user);
//        System.out.println(user);
    }
}
