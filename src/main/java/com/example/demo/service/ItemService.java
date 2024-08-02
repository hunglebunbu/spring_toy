package com.example.demo.service;

import com.example.demo.model.Item;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ItemService {
    public List<Item> getItems() {
        return Arrays.asList(
            new Item(1L, "Item 1"),
            new Item(2L, "Item 2"),
            new Item(3L, "Item 3")
        );
    }
}
