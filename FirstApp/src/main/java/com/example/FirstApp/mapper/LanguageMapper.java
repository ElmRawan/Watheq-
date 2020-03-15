package com.example.FirstApp.mapper;

import com.example.FirstApp.DTO.LanguageDTO;
import com.example.FirstApp.model.Language;

public interface LanguageMapper {
	
	Language dtoToLanguage (final LanguageDTO languageDTO);
	LanguageDTO languageToDTO(final Language language);
}
