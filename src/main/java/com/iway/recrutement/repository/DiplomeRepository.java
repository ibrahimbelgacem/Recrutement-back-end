package com.iway.recrutement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iway.recrutement.model.Diplome;
@Repository
public interface DiplomeRepository extends JpaRepository<Diplome, Long>{
}
