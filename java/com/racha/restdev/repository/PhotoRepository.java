package com.racha.restdev.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.racha.restdev.model.Photo;

@Repository
public interface PhotoRepository extends JpaRepository<Photo, Long>{
    List<Photo> findByAlbum_id(long id);
}
