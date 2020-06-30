package com.example.demo.deo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Alien;


public interface AlienRepo extends JpaRepository<Alien,Integer>
{

}
