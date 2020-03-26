package com.kafka.consumer.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor
public class User {

	private Integer id;
    private String name;
    private String depatrment;
    private Double salary;
 
}