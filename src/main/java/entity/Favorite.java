package entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Component;

@Data
@Entity
@Component
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@EqualsAndHashCode
public class Favorite {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Point point;

}
