package VA.com.example.virtual.assistant;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/usersinteractions")
public class UserInteractionsWithVirtualAssistantController {

    @Autowired
    private UserInteractionsWithVirtualAssistantRepository userInteractionsWithVirtualAssistantRepository;

    @GetMapping(path = "/{usersinteractionsId}")
    public Optional<UserInteractionsWithVirtualAssistant> getUserInteractionsById(
            @PathVariable int userinteractionsId) {
        return userInteractionsWithVirtualAssistantRepository.findById(userinteractionsId);
    }

}
