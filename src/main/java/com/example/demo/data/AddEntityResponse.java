package com.example.demo.data;


public class AddEntityResponse {
    
    private Integer status = 0;
    private Integer id = 0;
    
    
    public AddEntityResponse(Integer tid, Integer tstatus){
        this.id = tid;
        this.status = tstatus;
    }
    
    public void setStatus(Integer newValue){
        this.status = newValue;
    }
    
    public Integer getStatus(){
        return this.status;
    }
    
    public void setId(Integer newValue){
        this.id = newValue;
    }
    
    public Integer getId(){
        return this.id;
    }

    
}
