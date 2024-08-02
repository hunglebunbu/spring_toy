package com.example.demo.dto;

import com.example.demo.model.Item;
import java.util.List;

public class Response {
    private boolean success;
    private List<Item> data;

    public Response(boolean success, List<Item> data) {
        this.success = success;
        this.data = data;
    }

    // Getters và setters
    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<Item> getData() {
        return data;
    }

    public void setData(List<Item> data) {
        this.data = data;
    }
}
