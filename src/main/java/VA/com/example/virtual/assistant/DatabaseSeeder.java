import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



public class DatabaseSeeder {


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserInteractionsWithVirtualAssistantRepository userInteractionsWithVirtualAssistantRepository;

    @Autowired
    private ApiResponseRepository apiResponseRepository;

    public void seedDatabase(){
        Faker faker = new Faker();

        for (int i = 0; i < 10; i ++){
            User user = new User();
            user.setName(faker.name().fullName());
            user.setEmail(faker.internet.email());


            userRepository.save(user);
        }
    }
    
}
