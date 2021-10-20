package com.examly.springapp.dao;

import com.examly.springapp.entity.MediaValutModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface MediaDao extends JpaRepository<MediaValutModel , Long> {
}
