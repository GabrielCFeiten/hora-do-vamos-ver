package com.cf.milagre.repositories;

import com.cf.milagre.models.MilagreModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MilagreRepository extends JpaRepository<MilagreModel, Long> {
}
