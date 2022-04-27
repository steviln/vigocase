package com.example.demo.data;


public class Person {
    
    
    private Integer id = null;
    private String navn = null;
    private String adresse = null;
    private String postnr = null;
    private String poststed = null;
    private String telefon = null;
    private String epost = null;
    private String fodselsdato = null;
    private String markedsforing = null;
    
    public Person(Integer nid, String nnavn, String nadresse, String npostnr, String npoststed, String ntelefon, String nepost, String nfodselsdato, String nmarkedsforing){
   
        this.id = null;
        this.navn = null;
        this.adresse = null;
        this.postnr = null;
        this.poststed = null;
        this.telefon = null;
        this.epost = null;
        this.fodselsdato = null;
        this.markedsforing = null;
  
    }

    public void setId(Integer newValue){
        this.id = newValue;
    }

    public Integer getId(){
        return this.id;
    }

    public void setNavn(String newValue){
        this.navn = newValue;
    }

    public String getNavn(){
        return this.navn;
    }

    public void setAdresse(String newValue){
        this.adresse = newValue;
    }

    public String getAdresse(){
        return this.adresse;
    }

    public void setPostnr(String newValue){
        this.postnr = newValue;
    }

    public String getPostnr(){
        return this.postnr;
    }

    public void setPoststed(String newValue){
        this.poststed = newValue;
    }

    public String getPoststed(){
        return this.poststed;
    }

    public void setTelefon(String newValue){
        this.telefon = newValue;
    }

    public String getTelefon(){
        return this.telefon;
    }

    public void setEpost(String newValue){
        this.epost = newValue;
    }

    public String getEpost(){
        return this.epost;
    }

    public void setFodselsdato(String newValue){
        this.fodselsdato = newValue;
    }

    public String getFodselsdato(){
        return this.fodselsdato;
    }

    public void setMarkedsforing(String newValue){
        this.markedsforing = newValue;
    }

    public String getMarkedsforing(){
        return this.markedsforing;
    }



}
