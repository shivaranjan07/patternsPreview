package creationalPatterns.builder;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


/**
 * User entity class - Class used to construct the product
 * Address is a regular value class
 * */
@Setter
@Getter
public class User {
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private Address address;
}
