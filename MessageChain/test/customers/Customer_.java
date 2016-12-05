package customers;

import org.junit.Test;
import static org.junit.Assert.*;
import places.Address;
import places.City;
import places.Continent;
import places.Country;

public class Customer_ {
    
    @Test
    public void should_be_able_to_check_if_is_european() {
        Address address = new Address();
        address.setCity(new City("Barcelona", new Country("España", Continent.EUROPE)));
        Customer customer = new Customer("Carlos Acosta");
        customer.setAddress(address);
            
        assertEquals(Continent.EUROPE, customer.getAddress().getCity().getCountry().getContinent());
    }
}
