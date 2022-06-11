package com.iway.recrutement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iway.recrutement.model.Responsable;

@Repository
public interface ResponsableRepository extends JpaRepository<Responsable, Long> {

}
