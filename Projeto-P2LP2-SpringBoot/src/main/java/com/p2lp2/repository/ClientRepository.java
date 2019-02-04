package com.p2lp2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.p2lp2.domain.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {

}
