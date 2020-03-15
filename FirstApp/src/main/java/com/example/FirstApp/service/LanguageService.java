package com.example.FirstApp.service;

import org.springframework.stereotype.Service;

import com.example.FirstApp.DTO.LanguageDTO;
import com.example.FirstApp.mapperImp.LanguageMapperImp;
import com.example.FirstApp.model.Language;
import com.example.FirstApp.repository.LanguageRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class LanguageService {
	

	private LanguageRepository languageRepository;
	private static final LanguageMapperImp languageMapperImp = new LanguageMapperImp();
	
	public LanguageDTO createLanguageDTO (LanguageDTO languageDTO) {
		
		Language language = Language.builder()
				.i_id(languageDTO.getI_id())
                .language_id(languageDTO.getLanguage_id())
                .language_name(languageDTO.getLanguage_name())
                .lang_cert_type(languageDTO.getLang_cert_type())
                .language_date(languageDTO.getLanguage_date())
                .language_institute_name(languageDTO.getLanguage_institute_name())
                .language_attach(languageDTO.getLanguage_attach())
                
                .build();
		
		Language saveLanguage = languageRepository.save(language);
        return languageMapperImp.languageToDTO(saveLanguage);
        
    }


}
