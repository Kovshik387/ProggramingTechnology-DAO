package com.example.proggramingtechnologydao.dao;

import com.example.proggramingtechnologydao.infrastructure.IAccountDao;
import com.example.proggramingtechnologydao.model.Account;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AccountFileDao implements IAccountDao {

    private final String path = "C:\\Users\\Disco\\OneDrive\\Desktop\\db.txt";
    @Override
    public void add(Account account) throws SQLException {

    }

    @Override
    public void update(Account account) throws SQLException {

    }

    @Override
    public Account get(int id) throws SQLException {
        return null;
    }

    @Override
    public Collection<Account> getAll() throws SQLException {
        File file = null;
        Scanner scanner = null;
        Collection<Account> list = new ArrayList<>();

        try {
            file = new File(path);

            scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                var line = scanner.nextLine().split(" ");
                list.add(new Account(Integer.parseInt(line[0]), line[1], line[2], line[3]));
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
        @Override
    public void delete(int id) throws SQLException {

    }
}
