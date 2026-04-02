package com.fitness.activityservice.repository;

import com.fitness.activityservice.model.Activity;
import com.fitness.activityservice.service.ActivityService;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityRepository extends MongoRepository<Activity, String> {
}
