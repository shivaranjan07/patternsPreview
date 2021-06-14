package creationalPatterns.builder;


import java.time.LocalDate;
import java.time.Period;

/**
 * Concrete Builder for UserDTOBuilder
 * */
public class UserWebDTOBuilder implements UserDTOBuilder{
    private String firstName;
    private String lastName;
    private String age;
    private String address;
    private UserDTO dto;

    @Override
    public UserDTOBuilder withFirstName(String fname) {
        firstName = fname;
        return this;
    }

    @Override
    public UserDTOBuilder withLastName(String lname) {
        lastName = lname;
        return this;
    }

    @Override
    public UserDTOBuilder withBirthday(LocalDate date) {
        //user class need age not birthdate
        Period ageInYears = Period.between(date, LocalDate.now());
        age = Integer.toString(ageInYears.getYears());
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(Address address) {
        //need to build string using address
        this.address = address.getHouseNumber() + " " + address.getStreet() + "\n" + address.getCity()
                + "\n" + address.getState() + "\n" + address.getZipcode();

        return this;
    }

    @Override
    public UserDTO build() {
        dto = new UserWebDTO(firstName+" "+lastName, address, age);
        return dto; //built object not the reference
    }

    //optional method
    @Override
    public UserDTO getUserDTO() {
        return dto;
    }
}
