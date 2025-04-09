package com.example.springJpaMapping.mapper;

import com.example.springJpaMapping.dto.AddressDTO;
import com.example.springJpaMapping.entities.Address;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface AddressMapper extends EntityMapper<AddressDTO,Address>{


}
