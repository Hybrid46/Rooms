package com.hybrid.rooms;

import com.hybrid.rooms.model.Room;
import com.hybrid.rooms.model.RoomRepository;
import com.hybrid.rooms.model.Sector;
import com.hybrid.rooms.model.SectorRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RoomsApplication {

    @PostConstruct
    public void start() {

        //@Autowired
        RoomRepository roomRepository;
        //@Autowired
        SectorRepository sectorRepository;
        
        Sector sectorA = new Sector("Sector A", 1);
        Sector sectorB = new Sector("Sector B", 2);
        Sector sectorC = new Sector("Sector C", 3);
        
        sectorRepository.save(sectorA);
        sectorRepository.save(sectorB);
        sectorRepository.save(sectorC);
        
        Room roomA1 = new Room("Room A1", 'A', true, sectorA);
        Room roomA2 = new Room("Room A2", 'A', true, sectorA);
        
        Room roomB1 = new Room("Room B1", 'B', true, sectorB);
        Room roomB2 = new Room("Room B2", 'B', true, sectorB);
        Room roomB3 = new Room("Room B3", 'B', true, sectorB);
        
        Room roomC1 = new Room("Room C1", 'C', true, sectorC);
        Room roomC2 = new Room("Room C2", 'C', true, sectorC);
        
        roomRepository.save(roomA1);
        roomRepository.save(roomA2);
        
        roomRepository.save(roomB1);
        roomRepository.save(roomB2);
        roomRepository.save(roomB3);
        
        roomRepository.save(roomC1);
        roomRepository.save(roomC2);
    }

    public static void main(String[] args) {
        SpringApplication.run(RoomsApplication.class, args);
    }
}
