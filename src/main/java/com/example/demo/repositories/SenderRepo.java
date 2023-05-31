package com.example.demo.repositories;

import com.example.demo.models.Receiver;
import com.example.demo.models.Sender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SenderRepo extends JpaRepository<Sender,Long> {


}
