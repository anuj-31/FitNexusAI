package com.fitness.aiservice.service;

import com.fitness.aiservice.model.Activity;
import com.fitness.aiservice.model.Recommendation;
import com.fitness.aiservice.repository.RecommendationRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ActivityMessageListener {
//    @Value("${kafka.topic.name}")
private  final ActivityAIService activityAIService;
    private  final RecommendationRepository  recommendationRepository;
//    private  String topicName;
    @KafkaListener(topics = "${kafka.topic.name}",groupId = "activity-processor-group" )
    public  void processActivity(Activity activity){
        log.info("Received Activity for processing : {}",activity.getUserId());
 Recommendation recommendation =  activityAIService.generateRecommendation(activity);
 recommendationRepository.save(recommendation);

    }



}
