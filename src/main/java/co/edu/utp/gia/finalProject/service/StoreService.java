package co.edu.utp.gia.finalProject.service;

import co.edu.utp.gia.finalProject.web.DTOs.StoreDTO;

import java.util.List;

public interface StoreService {
    StoreDTO createStore(StoreDTO storeDTO);

    StoreDTO updateStore(StoreDTO storeDTO);

    StoreDTO deleteStore(StoreDTO storeDTO);

    List<StoreDTO> getStores();
}
