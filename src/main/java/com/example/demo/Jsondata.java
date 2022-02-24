package com.example.demo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonInclude(Include.NON_NULL)
public class Jsondata {

	private Integer id;
	
	@JsonProperty(value="name")
	private String name123;
	
}
