package com.gulsufindik.repository;

import com.gulsufindik.repository.entity.Sehir;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISehirRepository extends JpaRepository<Sehir,Long> {

}
