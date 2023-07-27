package VA.com.example.virtual.assistant;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ApiResponseRepository extends JpaRepository<ApiResponse, Integer> {
    List<ApiResponse> findByUser_Name(String userName);
}
