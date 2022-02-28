package com.emlakBurada.emlakBuradaBanner.repository;


import com.emlakBurada.emlakBuradaBanner.model.Banner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface BannerRepository extends JpaRepository<Banner,Integer> {


}
