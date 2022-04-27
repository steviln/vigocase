/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.CrossOrigin;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import com.google.gson.Gson; 
import java.util.stream.Collectors;

import com.example.demo.data.Person;
import com.example.demo.data.AddEntityResponse;
import com.example.demo.components.PersonsStore;


/**
 *
 * @author stevi
 */
@RestController
@RequestMapping("add")
public class AddEntity {
    
    private final static PersonsStore personStore = new PersonsStore();  
    private final String developerURL = "http://localhost:3000";
    
    @PostMapping(produces = "application/json")
    @CrossOrigin(origins = developerURL)
    public AddEntityResponse newEntity(@RequestBody String person, HttpServletResponse response) {

        AddEntityResponse respons = new AddEntityResponse(0,0);
        Gson jsonReader = new Gson();
        
        try{
            Person newPerson = jsonReader.fromJson(person, Person.class);
            personStore.addPerson(newPerson);
            respons.setStatus(1);
            respons.setId(newPerson.getId());
        }catch(Exception e){
            System.out.println(e.toString());
        }
        
        return respons;
    }
       
    @GetMapping()
    @CrossOrigin(origins = developerURL)
    public @ResponseBody String getTest() {

        Gson jsonReader = new Gson();                
        return jsonReader.toJson(personStore.getPersons());
        
    } 
    
    @GetMapping(value = "/person/{id}")
    @CrossOrigin(origins = developerURL)
    public @ResponseBody String getPerson(@PathVariable("id") String preID){
        Integer id = Integer.parseInt(preID);
        
        Gson jsonReader = new Gson(); 
        List<Person> foundPersons = (List<Person>) personStore.getPersons().stream().filter(entity -> entity.getId() == id).collect(Collectors.toList());
        
        return jsonReader.toJson(foundPersons);
    }
    
    @GetMapping(value = "/postcode/{code}")
    @CrossOrigin(origins = developerURL)
    public @ResponseBody String getPostalCode(@PathVariable("code") String code){
        
        Gson jsonReader = new Gson(); 
        List<Person> foundPersons = (List<Person>) personStore.getPersons().stream().filter(entity -> entity.getPostnr().equals(code)).collect(Collectors.toList());
        
        return jsonReader.toJson(foundPersons);
    }
}
