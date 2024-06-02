//package com.oasis.ATM.service;
//
//import com.oasis.ATM.model.User;
//import com.oasis.ATM.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//
//import java.util.Random;
//
//@Service
//public class AddUser {
//    @Autowired
//    UserRepository userRepository;
//    public ResponseEntity<String> addUser(String nae, String type , Long phoneNumber)
//    {
//        User user = new User();
//        user.setBalance(0.00);
//        user.setAccountHolder(name);
//        user.setTransactions(null);
//        user.setAccountType(type);
//        String number = generateAccountNumber();
//
//        while(userRepository.existsByAccountNumber(number))
//        {
//            number = generateAccountNumber();
//        }
//        user.setAccountNumber(number);
//        user.setPhoneNumber(phoneNumber);
//        userRepository.save(user);
//        System.out.println(number);
//        return new ResponseEntity<>("Added", HttpStatus.CREATED);
//    }
//    public Long generateAccountNumber()
//    {
//        Random random = new Random();
//        StringBuilder builder = new StringBuilder();
//        String characters = "0123456789";
//        String withoutZero = "123456789";
//        builder.append(characters.charAt(random.nextInt(characters.length())));
//        for (int i = 0; i < 9; i++) {
//            builder.append(characters.charAt(random.nextInt(characters.length())));
//        }
//        return Long.parseLong(builder.toString());
//    }
//}
