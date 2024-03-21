package com.example.proggramingtechnologydao.model;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class Account {
    public int id;
    public String name;
    public String email;
    public String role;

    @Override
    public String toString(){
        return id + " " + name + " "  + email + " " + role;
    }
}
