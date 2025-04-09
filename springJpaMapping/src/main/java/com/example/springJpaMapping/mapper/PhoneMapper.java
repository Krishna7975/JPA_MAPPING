package com.example.springJpaMapping.mapper;

import com.example.springJpaMapping.dto.PhoneDto;
import com.example.springJpaMapping.entities.Phone;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PhoneMapper extends EntityMapper<PhoneDto, Phone>{
}
