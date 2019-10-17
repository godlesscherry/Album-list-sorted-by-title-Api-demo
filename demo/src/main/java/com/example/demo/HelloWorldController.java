package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.util.comparator.Comparators;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloWorldController {
	private RestTemplate restTemplate;

@RequestMapping(value ="/")
public String helloworld(){ 
   return "helloworld";
     }

public void RestService(RestTemplateBuilder restTemplateBuilder) {
    this.restTemplate = restTemplateBuilder.build();
}
@RequestMapping(value ="/movies" ,method = RequestMethod.GET)
public ArrayList<Album> getPostsPlainJSON() {
    String url = "https://jsonplaceholder.typicode.com/albums";
      RestTemplateBuilder r = new RestTemplateBuilder();
      RestTemplate rt = r.build();
      Album[] a = rt.getForObject(url, Album[].class);
      ArrayList<Album> list = new ArrayList(Arrays.asList(a));
      Collections.sort(list, new Comparator<Album>() {

		@Override
		public int compare(Album a, Album b) {
			// TODO Auto-generated method stub
			
			return a.title.compareTo(b.title);
		}
	
      });
    	  
	 return list;
     
    
}



}
