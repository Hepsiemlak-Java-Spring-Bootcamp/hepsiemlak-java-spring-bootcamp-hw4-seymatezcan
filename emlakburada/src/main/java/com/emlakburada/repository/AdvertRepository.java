package com.emlakburada.repository;

import com.emlakburada.model.Advert;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdvertRepository extends JpaRepository<Advert,Integer> {
}
