package com.example.FirstApp.service;

import com.example.FirstApp.DTO.RecommendationDTO;
import com.example.FirstApp.mapperImp.RecommendationMapperImp;
import com.example.FirstApp.model.Recommendation;
import com.example.FirstApp.repository.RecommendationRepository;

public class RecommendationService {
	
	private RecommendationRepository recommendationRepository;
	private static final RecommendationMapperImp recommendationMapperImp = new RecommendationMapperImp();
	
	public RecommendationDTO createRecommendationDTO(RecommendationDTO recommendationDTO) {
		
		Recommendation recommendation = Recommendation.builder()
				.i_id(recommendationDTO.getI_id())
                .com_cr(recommendationDTO.getCom_cr())
                .edu_id(recommendationDTO.getEdu_id())
                .reco_from(recommendationDTO.getReco_from())
                .reco_date(recommendationDTO.getReco_date())
                .reco_addby(recommendationDTO.getReco_addby())
                .reco_attach(recommendationDTO.getReco_attach())
                .reco_institute_name(recommendationDTO.getReco_institute_name())
                
                .build();
		
		Recommendation saveRecommendation = recommendationRepository.save(recommendation);
        return recommendationMapperImp.recommendationToDTO(saveRecommendation);
        
    }

}
