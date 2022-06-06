package co.edu.utp.gia.finalProject.web.controller;


import co.edu.utp.gia.finalProject.service.StoreService;
import co.edu.utp.gia.finalProject.web.DTOs.StoreDTO;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("store")
@NoArgsConstructor
public class storeController {

    @Autowired
    private StoreService storeService;

    @PostMapping("createStore")
    public StoreDTO createStore(@RequestBody StoreDTO storeDTO) {
        return storeService.createStore(storeDTO);
    }

}
