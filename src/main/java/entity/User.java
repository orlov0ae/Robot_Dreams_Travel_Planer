package entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Component
@Table(name = "users", schema = "travel-planner")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Scope("session")
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String surname;
    private String email;

    @JsonIgnore
    private String password;

    @ManyToMany
    @JoinTable(name = "user_roles", schema = "travel-planner", joinColumns = {
            @JoinColumn(name = "user_id", nullable = false)
    }, inverseJoinColumns = {
            @JoinColumn(name = "role_id", nullable = false)
    })
    private List<Role> roleList = new ArrayList<>();

}
