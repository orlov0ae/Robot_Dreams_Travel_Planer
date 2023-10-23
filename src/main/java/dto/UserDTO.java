package dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class UserDTO {

    private Long id;
    private String name;
    private String surname;
    private String email;

}
