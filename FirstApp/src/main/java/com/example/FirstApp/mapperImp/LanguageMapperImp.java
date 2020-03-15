package com.example.FirstApp.mapperImp;


import org.modelmapper.ModelMapper;
import com.example.FirstApp.DTO.LanguageDTO;
import com.example.FirstApp.mapper.LanguageMapper;
import com.example.FirstApp.model.Language;

public class LanguageMapperImp implements LanguageMapper{

	private ModelMapper modelMapper;
	  
	  public LanguageMapperImp() {
		  modelMapper = new ModelMapper();
	  }
	  
	@Override
	public Language dtoToLanguage(LanguageDTO languageDTO) {
		return modelMapper.map(languageDTO, Language.class);
	}

	@Override
	public LanguageDTO languageToDTO(Language language) {
		return modelMapper.map(language, LanguageDTO.class);
	}

}
