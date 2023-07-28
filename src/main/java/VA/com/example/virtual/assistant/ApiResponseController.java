package VA.com.example.virtual.assistant;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/response")
public class ApiResponseController {

    @Autowired
    private ApiResponseRepository apiResponseRepository;

    @GetMapping(path = "/{responseId}")
    public Optional<ApiResponse> getApiResponsesById(@PathVariable int responseId) {
        return apiResponseRepository.findById(responseId);
    }

}
