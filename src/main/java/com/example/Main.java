package com.example;

import com.example.dao.AddressRepository;
import com.example.dao.UserRepository;
import com.example.entity.Address;
import com.example.entity.User;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableCaching
public class Main {

  public static void main(String[] args) {
    ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);
    var userRepository = context.getBean(UserRepository.class);
    var addressRepository = context.getBean(AddressRepository.class);
    var user1 = userRepository.save(User.builder()
        .name("vlad")
        .addressList(List.of(
            Address.builder()
                .value("address_vlad1")
                .build(),
            Address.builder()
                .value("address_vlad2")
                .build()))
        .build());
    System.out.println("----------------------------------------------------------");
    var user2 = userRepository.save(User.builder()
        .name("nastya")
        .addressList(List.of(
            Address.builder()
                .value("address_nastya1")
                .build(),
            Address.builder()
                .value("address_nastya2")
                .build()))
        .build());
    var user3 = userRepository.save(User.builder()
        .name("andrew")
        .addressList(List.of(
            Address.builder()
                .value("address_andrew1")
                .build()))
        .build());
    System.out.println("----------------------------------------------------------1111");
    System.out.println(userRepository.findById(user1.getId()));
    System.out.println("----------------------------------------------------------1111");
    System.out.println(userRepository.findById(user1.getId()));
    System.out.println("----------------------------------------------------------2222");
    System.out.println(userRepository.findById(user2.getId()));
    System.out.println("----------------------------------------------------------2222");
    System.out.println(userRepository.findById(user2.getId()));

    System.out.println("----------------------------------------------------------ADDRESS_2");
    System.out.println(addressRepository.findById(2L));

//    User updatedUser2 = userRepository.save(user2);
//    System.out.println(userRepository.findById(user2.getId()));

    System.out.println("-------------FIND ALL------------------");
    Iterable<User> allUsers = userRepository.findAll();
    allUsers.forEach(System.out::println);

//    var cache = CacheManager.ALL_CACHE_MANAGERS.get(0).getCache("com.example.entity.User");
//    System.out.println(cache.getSize());
//    System.out.println(cache);
  }

}
