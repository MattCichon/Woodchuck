package com.matt.ttTwitter.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.matt.ttTwitter.model.Tag;

@Repository
public interface TagRepository extends CrudRepository<Tag, Long> {

	Tag findByPhrase(String phrase);

}
