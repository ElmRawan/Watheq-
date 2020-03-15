package com.example.FirstApp.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.FirstApp.model.Language;

@Repository
@Transactional
public interface LanguageRepository extends CrudRepository<Language, String>{
	
	@Modifying
	@Query("UPDATE Language language SET language.language_name = :language_name WHERE language.language_id = :language_id")
	void updateLanguageName(@Param("language_id") String language_id, @Param("language_name") String language_name);
	
	@Modifying
	@Query("UPDATE Language language SET language.lang_cert_type = :lang_cert_type WHERE language.language_id = :language_id")
	void updateLangCertType(@Param("language_id") String language_id, @Param("lang_cert_type") String lang_cert_type);
	
	@Modifying
	@Query("UPDATE Language language SET language.language_date = :language_date WHERE language.language_id = :language_id")
	void updateLanguageDate(@Param("language_id") String language_id, @Param("language_date") String language_date);
	
	@Modifying
	@Query("UPDATE Language language SET language.language_institute_name = :language_institute_name WHERE language.language_id = :language_id")
	void updateLanguageInstituteName(@Param("language_id") String language_id, @Param("language_institute_name") String language_institute_name);
	
	@Modifying
	@Query("UPDATE Language language SET language.language_attach = :language_attach WHERE language.language_id = :language_id")
	void updateLanguageAttach(@Param("language_id") String language_id, @Param("language_attach") String language_attach);
	
	}