package com.example.proggramingtechnologydao.dao;

import com.example.proggramingtechnologydao.DataManager;
import com.example.proggramingtechnologydao.infrastructure.IAccountDao;
import com.example.proggramingtechnologydao.model.Account;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

public class AccountDao implements IAccountDao {

    @Override
    public void add(Account account) throws SQLException {
        var connection = DataManager.createDataSource().getConnection();

        PreparedStatement state = connection.prepareStatement("insert into accounts(name, email, password_hash, refresh_token, role_type) values (?,?,?)");
        state.setString(1,account.name);
        state.setString(2,account.email);
        state.setString(3,account.role);

        state.executeUpdate();
    }

    @Override
    public void update(Account account) throws SQLException {
        var connection = DataManager.createDataSource().getConnection();

        PreparedStatement state = connection.prepareStatement("update accounts set name = ?, email = ?, role_type = ? where account_id = ?");
        state.setString(1,account.name);
        state.setString(2,account.email);
        state.setString(3,account.role);
        state.setString(4, String.valueOf(account.id));

        state.executeUpdate();
    }

    @Override
    public Account get(int id) throws SQLException {
        var connection = DataManager.createDataSource().getConnection();

        PreparedStatement state = connection.prepareStatement("select * from accounts where account_id = ?");
        state.setInt(1, id);
        var result = state.executeQuery();

        Account account = null;
        while (result.next()){
            account = new Account(result.getInt("account_id"),result.getString("name"),
                    result.getString("email"),result.getString("role_type"));
        }
        return account;
    }

    @Override
    public Collection<Account> getAll() throws SQLException {
        var connection = DataManager.createDataSource().getConnection();

        PreparedStatement state = connection.prepareStatement("select * from accounts");
        var result = state.executeQuery();

        Collection<Account> list = new ArrayList<>();
        while (result.next()){
            list.add(new Account(result.getInt("account_id"),result.getString("name"),
                    result.getString("email"),result.getString("role_type"))
            );
        }
        return list;
    }

    @Override
    public void delete(int id) throws SQLException {
        var connection = DataManager.createDataSource().getConnection();

        PreparedStatement state = connection.prepareStatement("delete from accounts where account_id = ?");
        state.setInt(1, id);

        state.executeUpdate();
    }
}
