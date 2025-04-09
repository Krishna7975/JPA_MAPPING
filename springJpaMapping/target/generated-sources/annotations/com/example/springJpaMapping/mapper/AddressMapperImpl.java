package com.example.springJpaMapping.mapper;

import com.example.springJpaMapping.dto.AddressDTO;
import com.example.springJpaMapping.entities.Address;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class AddressMapperImpl implements AddressMapper {

    @Override
    public Address toEntity(AddressDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Address address = new Address();

        address.setAddressLine1( dto.getAddressLine1() );
        address.setStreet( dto.getStreet() );
        address.setCountry( dto.getCountry() );
        address.setZipcode( dto.getZipcode() );
        address.setState( dto.getState() );
        address.setCity( dto.getCity() );

        return address;
    }

    @Override
    public AddressDTO toDto(Address entity) {
        if ( entity == null ) {
            return null;
        }

        AddressDTO addressDTO = new AddressDTO();

        addressDTO.setAddressLine1( entity.getAddressLine1() );
        addressDTO.setStreet( entity.getStreet() );
        addressDTO.setCountry( entity.getCountry() );
        addressDTO.setZipcode( entity.getZipcode() );
        addressDTO.setState( entity.getState() );
        addressDTO.setCity( entity.getCity() );

        return addressDTO;
    }

    @Override
    public List<Address> toEntity(List<AddressDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Address> list = new ArrayList<Address>( dtoList.size() );
        for ( AddressDTO addressDTO : dtoList ) {
            list.add( toEntity( addressDTO ) );
        }

        return list;
    }

    @Override
    public List<AddressDTO> toDto(List<Address> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<AddressDTO> list = new ArrayList<AddressDTO>( entityList.size() );
        for ( Address address : entityList ) {
            list.add( toDto( address ) );
        }

        return list;
    }
}
