package com.theloom.spring.boot.template.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import com.theloom.spring.boot.template.model.dto.NewTemplateDto;
import com.theloom.spring.boot.template.model.dto.TemplateDto;
import com.theloom.spring.boot.template.model.entity.TemplateEntity;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TemplateMapper {

    @Mapping(target = "id", ignore = true)
    TemplateEntity toEntity(NewTemplateDto dto);

    TemplateDto toDto(TemplateEntity entity);

    List<TemplateDto> toDtoList(List<TemplateEntity> entities);

}
