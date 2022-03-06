package com.example.week1.user;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TestEntityManager entityManager;

    @Test
    @DisplayName("ทำการสร้าง user, user_address และ user_payment")
    public void case01() {
        // Create data
        Users customer = new Users();
        customer.setId(2);
        customer.setFirstName("testFirstname");
        customer.setLastName("testLastname");
        customer.setUsername("test");
        customer.setCreatedAt(new Timestamp(System.currentTimeMillis()));
        UserAddress address01 = new UserAddress();
        address01.setId(1);
        address01.setAddressLine1("test01 line1");
        address01.setCity("Kalasin");
        address01.setCountry("Thailand");
        address01.setPostalCode("46210");
        address01.setUser(customer);
//        entityManager.persist(address01);
        UserAddress address02 = new UserAddress();
        address02.setId(2);
        address02.setAddressLine1("test02 line1");
        address02.setCity("Ubonratchathani");
        address02.setCountry("Thailand");
        address02.setPostalCode("34000");
        address02.setUser(customer);
        Set<UserAddress> addresses = new HashSet<>();
//        entityManager.persist(address02);
        addresses.add(address01);
        addresses.add(address02);
        customer.setAddress(addresses);
        Set<UserPayment> payments = new HashSet<>();
        UserPayment userPayment = new UserPayment();
        userPayment.setUser(customer);
        userPayment.setPaymentType("credit card");
        userPayment.setAccountNo("9908987990");
        userPayment.setExpiry("02/25");
        userPayment.setProvider("master card");
//        entityManager.persist(userPayment);
        payments.add(userPayment);
        customer.setUserPayments(payments);
        entityManager.persist(customer);

        // Get data
        Users foundCustomer =  userRepository.getById(2);
        // Assert
        System.out.println(foundCustomer.getAddress());
        List<UserAddress> addressList = new ArrayList<UserAddress>(foundCustomer.getAddress());
        assertEquals(2, addressList.size());
        //UserAddress
        assertEquals(2,
                addressList.get(0).getUser().getId());
        assertEquals(2,
                addressList.get(1).getUser().getId());
        //UserPayment
        List<UserPayment> paymentList = new ArrayList<UserPayment>(foundCustomer.getUserPayments());
        assertEquals(1, paymentList.size());
        assertEquals(2,
                paymentList.get(0).getUser().getId());
    }
}