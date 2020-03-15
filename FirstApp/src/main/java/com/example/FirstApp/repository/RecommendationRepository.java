package com.example.FirstApp.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.FirstApp.model.Recommendation;

@Repository
@Transactional
public interface RecommendationRepository extends CrudRepository<Recommendation, String>{
	  
	@Modifying
	@Query("UPDATE Recommendation recommendation SET recommendation.reco_from = :reco_from WHERE recommendation.reco_id = :reco_id")
	void updateRecoFrom(@Param("reco_id") String reco_id, @Param("reco_from") String reco_from);

	@Modifying
	@Query("UPDATE Recommendation recommendation SET recommendation.reco_date = :reco_date WHERE recommendation.reco_id = :reco_id")
	void updateRecoDate(@Param("reco_id") String reco_id, @Param("reco_date") String reco_date);
	
	@Modifying
	@Query("UPDATE Recommendation recommendation SET recommendation.reco_attach = :reco_attach WHERE recommendation.reco_id = :reco_id")
	void updateRecoAttach(@Param("reco_id") String reco_id, @Param("reco_attach") String reco_attach);
	
	@Modifying
	@Query("UPDATE Recommendation recommendation SET recommendation.reco_institute_name = :reco_institute_name WHERE recommendation.reco_id = :reco_id")
	void updateRecoInstituteName(@Param("reco_id") String reco_id, @Param("reco_institute_name") String reco_institute_name);
	
	}