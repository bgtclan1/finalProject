package co.edu.utp.gia.finalProject.service.impl;

import co.edu.utp.gia.finalProject.model.entity.StoreEntity;
import co.edu.utp.gia.finalProject.model.repository.StoreRepository;
import co.edu.utp.gia.finalProject.service.StoreService;
import co.edu.utp.gia.finalProject.web.DTOs.StoreDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
