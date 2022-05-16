package com.ficticiusclean.ficticiusclean.repository;

import com.ficticiusclean.ficticiusclean.model.VeiculoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeiculoRepository extends JpaRepository<VeiculoModel, Long> {
}
