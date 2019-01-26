package com.fantom.jpa.jpaRepository;

import com.fantom.jpa.Entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author fantomboss
 * @date 2019/1/25-19:45
 */
public interface CountryRepository extends JpaRepository<Country,Integer> {
}
