package com.hybrid.rooms.model;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<Room, Integer> {

    public List<Room> findByIsOpen(boolean isOpen);
    public List<Room> findByCategoryOrderByNameAsc(char category);
    public List<Room> findByCategoryNotOrderByCategoryDesc(char category);
    public List<Room> findBySectorId(Long sectorId);
    public List<Room> findBySectorPermissionLevelLessThanEqual(int permissionLevel);
    public List<Room> findByIsOpenAndCategory(boolean isOpen, char category);
}
