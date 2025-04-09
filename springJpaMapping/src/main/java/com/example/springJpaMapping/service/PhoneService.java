package com.example.springJpaMapping.service;


import com.example.springJpaMapping.dto.PhoneDto;
import com.example.springJpaMapping.entities.Phone;
import com.example.springJpaMapping.mapper.PhoneMapper;
import com.example.springJpaMapping.repository.PhoneRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Slf4j
@Service
@RequiredArgsConstructor
public class PhoneService
{

        private final PhoneRepository phoneRepository;
        private final PhoneMapper phoneMapper;


        public PhoneDto save(PhoneDto phoneDto){
            Phone save =phoneRepository.save(phoneMapper.toEntity(phoneDto));
            return phoneMapper.toDto(save);
        }

        public List<PhoneDto> get(){
            List<Phone> getPhone=phoneRepository.findAll();
            return phoneMapper.toDto(getPhone);
        }

        public PhoneDto getPhoneById(Long id){
            Optional<Phone> getById= phoneRepository.findByIdAndQuery(id);
            return  phoneMapper.toDto(getById.get());
        }

        public PhoneDto getPhoneByCountryCode(Integer countryCode){
            Optional<Phone> getByCountryCode=phoneRepository.findByCountryCode(countryCode);
            return phoneMapper.toDto(getByCountryCode.get());
        }

    }


