package ir.isc.academy.collections;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Address {
    public String street;
    public String city;
    public String country;


    @Override
    public String toString() {
        return "Address [street=" + street + ", city=" + city + ", country=" + country + "]";
    }

}
