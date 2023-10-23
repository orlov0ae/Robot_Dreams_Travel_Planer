package entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Component
@Table(name = "points", schema = "travel-planner")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Point {

    private Long id;
    private String name;
    private String description;
    private String address;

    @ManyToMany
    @JoinTable(name = "points_users", schema = "travel-planner", joinColumns = {
            @JoinColumn(name = "point_id", nullable = false)
    }, inverseJoinColumns = {
            @JoinColumn(name = "user_id", nullable = false)
    })
    private List<User> userList = new ArrayList<>();

}
