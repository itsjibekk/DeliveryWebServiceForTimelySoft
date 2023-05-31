package com.example.demo.services.impl;

import com.example.demo.models.Parcel;
import com.example.demo.repositories.ParcelRepo;
import com.example.demo.repositories.ReceiverRepo;
import com.example.demo.repositories.SenderRepo;
import com.example.demo.services.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private final ParcelRepo parcelRepo;
    private final SenderRepo senderRepo;
    private final ReceiverRepo receiverRepo;

    public OrderServiceImpl(ParcelRepo parcelRepo, SenderRepo senderRepo, ReceiverRepo receiverRepo) {
        this.parcelRepo = parcelRepo;
        this.senderRepo = senderRepo;
        this.receiverRepo = receiverRepo;
    }
    @Override
    public List<Parcel> getAll() {
        return parcelRepo.findAll();
    }

    @Override
    public void saveParcel(Parcel parcel) {
        this.senderRepo.save(parcel.getSender());
        this.receiverRepo.save(parcel.getReceiver());
        this.parcelRepo.save(parcel);
    }


}
