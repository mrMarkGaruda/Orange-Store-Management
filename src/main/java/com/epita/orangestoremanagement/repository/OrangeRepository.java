package com.epita.orangestoremanagement.repository;

import com.epita.orangestoremanagement.model.Orange;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrangeRepository extends JpaRepository<Orange, Long> {
}
