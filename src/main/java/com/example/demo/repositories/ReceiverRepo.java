package com.example.demo.repositories;

import com.example.demo.models.Receiver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceiverRepo extends JpaRepository<Receiver,Long> {


}
