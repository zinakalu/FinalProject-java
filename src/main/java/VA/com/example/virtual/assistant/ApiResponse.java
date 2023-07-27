package VA.com.example.virtual.assistant;

import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "responses")
public class ApiResponse {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "response_text")
    private String responseText;

    @Column(name = "response_date", columnDefinition = "TIMESTAMP")
    private LocalDateTime responseDate;

    @OneToOne
    @JoinColumn(name = "interaction_id")
    private UserInteractionsWithVirtualAssistant userinteractions;

}
