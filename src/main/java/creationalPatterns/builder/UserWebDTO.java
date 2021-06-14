package creationalPatterns.builder;

import lombok.*;

/**
 * Product class in Builder pattern
 * can use @Data for more readability have added all the required annotations explicitly
 * */
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class UserWebDTO implements UserDTO {
    private String name;
    private String address;
    private String age;
}
