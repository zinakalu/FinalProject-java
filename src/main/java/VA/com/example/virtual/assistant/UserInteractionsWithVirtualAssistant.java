package VA.com.example.virtual.assistant;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "userinteractions")
public class UserInteractionsWithVirtualAssistant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "user_input_speech")
    private String userInputSpeech;

    @OneToOne(mappedBy = "userinteractions", cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = true)
    private ApiResponse apiResponse;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    @JsonIgnore
    private User interactions;

    @Column(name = "date_of_speech", columnDefinition = "TIMESTAMP")
    private Date dateOfSpeech;

    public UserInteractionsWithVirtualAssistant() {

    }

    public Integer getId() {
        return id;
    }

    public String getUserInputSpeech() {
        return userInputSpeech;
    }

    public Date getDateOfSpeech() {
        return dateOfSpeech;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUserInputSpeech(String userInputSpeech) {
        this.userInputSpeech = userInputSpeech;
    }

    public void setDateOfSpeech(Date dateOfSpeech) {
        this.dateOfSpeech = dateOfSpeech;
    }

    public String toString() {
        return "id:" + this.id + "user speech: " + this.userInputSpeech + "date created:" + this.dateOfSpeech;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UserInteractionsWithVirtualAssistant)) {
            return false;
        }
        return id != null && id.equals(((UserInteractionsWithVirtualAssistant) o).getId());
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

}
