package com.oasis.ATM.service;

import com.oasis.ATM.model.User;
import com.oasis.ATM.repository.UserRepository;
import com.oasis.ATM.requestModel.AddRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service

public class UserService {
    @Autowired
    UserRepository userRepository;
    public ResponseEntity<Boolean> addUsers(AddRequest addRequest) {
        User user = new User();
        user.setBalance(0.00);
        user.setAccountHolder(addRequest.getName());
        user.setTransactions(null);
        user.setAccountType(addRequest.type);
        String number = generateAccountNumber();
        user.setPin(addRequest.getPin());
        while (userRepository.existsByAccountNumber(number)) {
            number = generateAccountNumber();
        }
        user.setAccountNumber(number);
        user.setPhoneNumber(addRequest.phoneNumber);
        try {
            userRepository.save(user);
            return new ResponseEntity<>(true, HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();

            return new ResponseEntity<>(false, HttpStatus.BAD_REQUEST);
        }
    }
    public String generateAccountNumber()
    {
        Random random = new Random();
        StringBuilder builder = new StringBuilder();
        String characters = "0123456789";
        String withoutZero = "123456789";
        builder.append(characters.charAt(random.nextInt(characters.length())));
        for (int i = 0; i < 9; i++) {
            builder.append(characters.charAt(random.nextInt(characters.length())));
        }
        return builder.toString();
    }
    public ResponseEntity<List<User>> showUsers() {
        return new ResponseEntity<>(userRepository.findAll(),HttpStatus.OK);
    }
}
