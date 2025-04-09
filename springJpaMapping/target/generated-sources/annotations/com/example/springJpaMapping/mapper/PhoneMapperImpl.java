package com.example.springJpaMapping.mapper;

import com.example.springJpaMapping.dto.PhoneDto;
import com.example.springJpaMapping.entities.Phone;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class PhoneMapperImpl implements PhoneMapper {

    @Override
    public Phone toEntity(PhoneDto dto) {
        if ( dto == null ) {
            return null;
        }

        Phone phone = new Phone();

        phone.setId( dto.getId() );
        phone.setPhoneNo( dto.getPhoneNo() );
        phone.setCountryCode( dto.getCountryCode() );
        phone.setEmployee( dto.getEmployee() );

        return phone;
    }

    @Override
    public PhoneDto toDto(Phone entity) {
        if ( entity == null ) {
            return null;
        }

        PhoneDto phoneDto = new PhoneDto();

        phoneDto.setId( entity.getId() );
        phoneDto.setPhoneNo( entity.getPhoneNo() );
        phoneDto.setCountryCode( entity.getCountryCode() );
        phoneDto.setEmployee( entity.getEmployee() );

        return phoneDto;
    }

    @Override
    public List<Phone> toEntity(List<PhoneDto> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Phone> list = new ArrayList<Phone>( dtoList.size() );
        for ( PhoneDto phoneDto : dtoList ) {
            list.add( toEntity( phoneDto ) );
        }

        return list;
    }

    @Override
    public List<PhoneDto> toDto(List<Phone> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PhoneDto> list = new ArrayList<PhoneDto>( entityList.size() );
        for ( Phone phone : entityList ) {
            list.add( toDto( phone ) );
        }

        return list;
    }
}
