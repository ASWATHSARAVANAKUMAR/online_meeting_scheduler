package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.MeetingModel;

public interface MeetingRepository extends JpaRepository<MeetingModel,Integer>{

}
