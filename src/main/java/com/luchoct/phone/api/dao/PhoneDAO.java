package com.luchoct.phone.api.dao;

import com.luchoct.phone.api.api.dto.Phone;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PhoneDAO {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public PhoneDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private static final String SELECT_PHONE_DETAILS =
            "SELECT id, title, description, picture_id, sim_free_fee, phone_features " +
                    "FROM phone_catalog " +
                    "ORDER BY sim_free_fee DESC";

    public List<Phone> getAllPhones() {
        return jdbcTemplate.query(PhoneDAO.SELECT_PHONE_DETAILS, (rs, rowNum) -> {
            final Phone phone = new Phone(
                    rs.getInt("id"),
                    rs.getString("title"),
                    rs.getString("description"),
                    rs.getString("picture_id"),
                    rs.getString("sim_free_fee"),
                    rs.getString("phone_features"));
            log.debug("Retrieved phone " + phone);
            return phone;
        });
    }
}
