package org.example.manager;

import static org.junit.Assert.*;

import org.example.jaxb.domain.AddressType;
import org.example.jaxb.domain.PersonType;
import org.junit.Before;
import org.junit.Test;

public class PersonTypeObjectInterfaceTest {
	
	PersonTypeObjectInterface objectInterface = new PersonTypeObjectInterface();
	PersonType person;
	AddressType residentialAddress;
	
	@Before
	public void setUp(){
		if (person == null) {
			person = new PersonType();
			person.setFirstName("John");
			person.setLastName("Doe");
		}

		if (residentialAddress == null) {
			residentialAddress = new AddressType();
			residentialAddress.setState("IL");
			residentialAddress.setZipCode("60604");

			person.setResidentialAddress(residentialAddress);
		}
	}
	
	@Test
	public void testGetResidentialAddressState() {
		String state = objectInterface.getResidentialAddressState(person);
		assertEquals("IL", state);
	}
	
	@Test
	public void test(){
		AddressType address = objectInterface.getAddressByZipcode(person, "60604");
		assertEquals(residentialAddress, address);
	}

}
