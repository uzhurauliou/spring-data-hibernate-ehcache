package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

  public UserService() {
    System.out.println("Creating UserService...");
  }

  public void getUser(){
    System.out.println("Sending user...");
  }

}
