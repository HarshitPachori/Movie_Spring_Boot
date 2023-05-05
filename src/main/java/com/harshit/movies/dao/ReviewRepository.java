package com.harshit.movies.dao;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.harshit.movies.models.Review;

public interface ReviewRepository extends MongoRepository<Review, ObjectId> {

}
