package VA.com.example.virtual.assistant;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/users")
public class UserInteractionsWithVirtualAssistantController {

    @Autowired
    private UserInteractionsWithVirtualAssistantRepository userInteractionsWithVirtualAssistantRepository;

    @GetMapping(path = "/{usersId}")
    public Optional<UserInteractionsWithVirtualAssistant> getUserInteractionsById(
            @PathVariable int userinteractionsId) {
        return userInteractionsWithVirtualAssistantRepository.findById(userinteractionsId);
    }

}

// @PostMapping("/interactions")
// public UserInteractionsWithVirtualAssistant createInteraction(@RequestBody
// UserInteractionsWithVirtualAssistant interaction) {
// // Here, the interaction object is automatically created from the JSON in the
// request body,
// // and its fields are set to the values specified in the JSON.
// // So there's no need to manually call new
// UserInteractionsWithVirtualAssistant() or
// // the setter methods.

// // Save the interaction to the database
// userInteractionRepository.save(interaction);

// // Return the saved interaction
// return interaction;
// }
