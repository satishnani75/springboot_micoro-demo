package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ReqandResData;

@RestController
@RequestMapping("/mylog")
public class MyLogController {

	Logger log = LoggerFactory.getLogger(MyLogController.class);

	@GetMapping("/show")
	public String show(@RequestParam("name") String name) {

		log.error("error happend");
		System.out.println(" dat form git online 8888888888888 ");

		return "haiiiiii----777777777777--88888------" + name;
	}

	@GetMapping("/path/{name}")
	public String pathshow(@PathVariable("name") String name) {

		log.info("exicution started");
		if (name.equals("satish")) {

			log.error("Null pointer excption has thrown");
			throw new NullPointerException();

		} else

			System.out.println(" exicutuon completed");
		return "haiiiiii------ form path: ------" + name;
	}

	@GetMapping("jsondata")
	public String jsondata(@RequestBody Jsondata data, @RequestHeader String token) {
		
		if(token==null) {
			
			throw new NullPointerException();
		}else

		return "your data :" + data.getName123() + " token:" + token;
	}
	
	@GetMapping("/resp")
	public ResponseEntity<Jsondata> showjson(@RequestBody Jsondata jdata,@RequestHeader String token){
		log.info("resp method started");
		ResponseEntity<Jsondata> response= null;
		HttpEntity<String> httpenitity = new HttpEntity<>(token);
		            
		
		
		log.info("exicution complted");
		
		return new ResponseEntity<>(jdata,HttpStatus.OK);
		
	}
	// avoidig data in json using @jsonproperty(access="readonly")
	
	@PostMapping("/save")
	public ReqandResData savedata(@RequestBody ReqandResData data) {
		
		data.setReqdata("req data setting done");
		data.setResdata("response data setting done");
		
		return data;
	}
	
	
	
}
