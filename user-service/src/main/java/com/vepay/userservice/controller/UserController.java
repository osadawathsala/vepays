package com.vepay.userservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Osada
 * @created 12/03/2025
 */

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping
  public ResponseEntity<?> check(){
      return ResponseEntity
              .status(HttpStatus.OK)
              .body("ok");
  }
}
