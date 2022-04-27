package com.example.demo.components;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import com.example.demo.data.Person;

public class PersonsStore {
    

    HashMap<String,Person> persons = null;
    private AtomicInteger currentIDnumber = new AtomicInteger(1);
    
    public PersonsStore(){
        this.persons = new HashMap<String,Person>();
    }
    public void addPerson(Person newPerson){
        Integer newIdNumber = currentIDnumber.getAndIncrement();
        newPerson.setId(newIdNumber);
        persons.put(newIdNumber.toString(), newPerson);
    }
    
    public List<Person> getPersons(){
        return this.persons.values().stream().collect(Collectors.toList());
    }
    
    
    
    public Integer getCurrentIDnumber(){
        return this.currentIDnumber.get();
    }
}



