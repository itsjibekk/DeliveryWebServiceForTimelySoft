package com.example.demo.services;

import com.example.demo.models.Parcel;
import com.example.demo.models.Sender;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

public interface OrderService {
    List<Parcel> getAll();
    void saveParcel(Parcel parcel);
}
