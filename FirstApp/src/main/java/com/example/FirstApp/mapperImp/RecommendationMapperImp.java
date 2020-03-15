package com.example.FirstApp.mapperImp;

import org.modelmapper.ModelMapper;
import com.example.FirstApp.DTO.RecommendationDTO;
import com.example.FirstApp.mapper.RecommendationMapper;
import com.example.FirstApp.model.Recommendation;

public class RecommendationMapperImp implements RecommendationMapper {
	
	 private ModelMapper modelMapper;
	  
	  public RecommendationMapperImp() {
		  modelMapper = new ModelMapper();
	  }

	@Override
	public Recommendation dtoToRecommendation(RecommendationDTO recommendationDTO) {
		return modelMapper.map(recommendationDTO, Recommendation.class);
	}

	@Override
	public RecommendationDTO recommendationToDTO(Recommendation recommendation) {
		return modelMapper.map(recommendation, RecommendationDTO.class);
	}

}
