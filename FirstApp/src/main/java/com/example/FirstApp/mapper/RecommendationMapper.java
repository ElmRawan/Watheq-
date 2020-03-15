package com.example.FirstApp.mapper;


import com.example.FirstApp.DTO.RecommendationDTO;
import com.example.FirstApp.model.Recommendation;

public interface RecommendationMapper {
	
	Recommendation dtoToRecommendation (final RecommendationDTO recommendationDTO);
	RecommendationDTO recommendationToDTO(final Recommendation recommendation);

}
