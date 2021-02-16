package com.examplereqmapping.reqmapping.repository;


import com.examplereqmapping.reqmapping.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{
}
