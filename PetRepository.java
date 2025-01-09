package com.example.demo;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.awt.print.Book;
import java.util.List;
import java.util.Map;

@Repository
public class PetRepository {
    private final JdbcClient jdbcClient;

    public PetRepository(JdbcTemplate template, JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }


    public List<PetadoptionUML> getAllPETS() {
        return jdbcClient.sql("SELECT * FROM pettable").query(
                (rs, rowNum) -> new PetadoptionUML(
                        rs.getString("pet_name"),
                        rs.getInt("pet_age"),
                        rs.getString("pet_shelter"),
                        rs.getString("pet_type"))
        ).list();

    }


    public void addPet(PetadoptionUML newPet) {
        String sql = "INSERT INTO pettable (pet_name, pet_age, pet_shelter, pet_type) VALUES (:petName, :petAge, :petShelter, :petType)";
        KeyHolder keyHolder = new GeneratedKeyHolder();

        jdbcClient.sql(sql)
                .params(newPet.getPetname(), newPet.getAge(), newPet.getpet_shelter(), newPet.getPet_type())
                .update(keyHolder);

        Number key = keyHolder.getKey();
        if (key != null) {
            newPet.setPetname(key.toString());
        }
    }

    public PetadoptionUML getPetinfo(String pet_name) {
        return jdbcClient.sql("SELECT * FROM pettable WHERE pet_name = ?")
                .params(Map.of("PET NAME", pet_name))
                .query(
                        (rs, rowNum) -> new PetadoptionUML(
                                rs.getString("pet_name"),
                                rs.getInt("pet_age"),
                                rs.getString("pet_shelter"),
                                rs.getString("pet_type"))
                ).single();
    }
}