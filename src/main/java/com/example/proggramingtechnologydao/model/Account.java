package com.example.proggramingtechnologydao.model;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
public class Account {
    public int id;
    public String name;
    public String email;
    public String role;

    public Account(int accountId, String name, String email, String roleType) {
        this.id = accountId; this.name = name; this.email = email; this.role = roleType;
    }

    @Override
    public String toString(){
        return id + " " + name + " "  + email + " " + role;
    }
}
