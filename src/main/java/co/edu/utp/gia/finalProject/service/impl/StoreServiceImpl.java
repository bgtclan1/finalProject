package co.edu.utp.gia.finalProject.service.impl;

import co.edu.utp.gia.finalProject.model.entity.StoreEntity;
import co.edu.utp.gia.finalProject.model.repository.StoreRepository;
import co.edu.utp.gia.finalProject.service.StoreService;
import co.edu.utp.gia.finalProject.web.DTOs.StoreDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StoreServiceImpl implements StoreService {


    @Autowired
    private StoreRepository storeRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public StoreDTO createStore(StoreDTO storeDTO) {
        return modelMapper.map(storeRepository.save(modelMapper.map(storeDTO, StoreEntity.class)), StoreDTO.class);
    }
    @Override
    public StoreDTO updateStore(StoreDTO storeDTO) {
        return modelMapper.map(storeRepository.save(modelMapper.map(storeDTO, StoreEntity.class)), StoreDTO.class);
    }

    @Override
    public StoreDTO deleteStore(StoreDTO storeDTO) {
        storeRepository.delete(modelMapper.map(storeDTO, StoreEntity.class));
        return null;
    }

    @Override
    public List<StoreDTO> getStores() {
        List<StoreDTO> storesDTOsResponse = new ArrayList<>();
        storeRepository.findAll().forEach(storeEntity -> {
            storesDTOsResponse.add(modelMapper.map(storeEntity, StoreDTO.class));
        });
        return storesDTOsResponse;
    }

}
