package com.example.springJpaMapping.service;

import com.example.springJpaMapping.dto.AddressDTO;
import com.example.springJpaMapping.entities.Address;
import com.example.springJpaMapping.mapper.AddressMapper;
import com.example.springJpaMapping.repository.AddressRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class AddressService {



    private final AddressRepository addressRepository;

    private  final AddressMapper addressMapper;



    public AddressDTO save(AddressDTO addressDTO){
        Address save= addressRepository.save(addressMapper.toEntity(addressDTO));
        return addressMapper.toDto(save);
    }


    public List<AddressDTO> get(){
        List<Address> getAllAddress=addressRepository.findAll();
        return addressMapper.toDto(getAllAddress);
    }


    public AddressDTO getAddressByAddressId(Long id){
        Optional<Address> getById= addressRepository.findByIdAndQuery(id);

        return  addressMapper.toDto(getById.get());
    }

//    public AddressDTO UpdateAddressDetails(AddressDTO addressDTO, Integer id){
//        Optional<Address> updateDetail=addressRepository.findById(id);
//        if (updateDetail==null){
//            log.info("There is no record with this entry");
//            return null;
//        }
//        addressDTO.setStreet(addressDTO.getStreet());
//        addressDTO.setCity(addressDTO.getCity());
//        addressDTO.setCountry(addressDTO.getCountry());
//        Address emp = addressRepository.save(addressMapper.toEntity(addressDTO));
//        log.info("Updated details "+ emp);
//        return  addressMapper.toDto(emp);
//    }

}
