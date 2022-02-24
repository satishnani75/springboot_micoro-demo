package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Data;

@Data
public class ReqandResData {
	
	private Integer id;
	private String name;
	
	private String gmail;
	private String address;
	@JsonProperty(access=Access.WRITE_ONLY)
    private String phno;
    @JsonProperty(access=Access.READ_ONLY)
    private String reqdata;
    private String resdata;
    
    

}
