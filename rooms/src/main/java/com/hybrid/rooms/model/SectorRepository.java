package com.hybrid.rooms.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectorRepository extends CrudRepository<Sector, Integer> {
    
}
