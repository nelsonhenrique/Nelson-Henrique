package com.p2lp2.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.p2lp2.domain.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Integer> {

}
