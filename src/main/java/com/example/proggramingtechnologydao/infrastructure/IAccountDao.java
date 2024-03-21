package com.example.proggramingtechnologydao.infrastructure;

import com.example.proggramingtechnologydao.model.Account;

import java.sql.SQLException;
import java.util.Collection;

public interface IAccountDao {
    public void add(Account account) throws SQLException;
    public void update(Account account) throws SQLException;
    public Account get(int id) throws SQLException;
    public Collection<Account> getAll() throws SQLException;
    public void delete(int id) throws SQLException;
}
