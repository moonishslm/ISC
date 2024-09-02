package ir.freeland.spring.validator;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;


public class Input {

    @Min(1)
    @Max(10)
    private int numberBetweenOneAndTen;

    @Setter
    @Getter
    @NotNull(message = "Name cannot be null, my man.")
    @NotEmpty(message = "Name cannot be empty, bro.")
    private String firstName;

    @Setter
    @Getter
    @Pattern(regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", message = "Email is invalid")
    private String email;

    // Note that this is actually not a valid IP address pattern, since
    // it allows values greater than 255 per octet.
    @Pattern(regexp = "^[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}$", message = "Noooooo! wrong!")
    private String ipAddress;

    public int getNumberBetweenOneAndTen() {
        return numberBetweenOneAndTen;
    }

    public void setNumberBetweenOneAndTen(int numberBetweenOneAndTen) {
        this.numberBetweenOneAndTen = numberBetweenOneAndTen;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
}
