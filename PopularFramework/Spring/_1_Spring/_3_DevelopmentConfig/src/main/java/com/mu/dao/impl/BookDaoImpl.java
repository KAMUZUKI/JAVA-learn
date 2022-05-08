package com.mu.dao.impl;

import com.mu.dao.BookDao;

public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("BookDaoImpl is running...");
    }
}
