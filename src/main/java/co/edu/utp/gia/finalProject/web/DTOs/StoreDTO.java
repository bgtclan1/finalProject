package co.edu.utp.gia.finalProject.web.DTOs;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StoreDTO {

    private Long id;
    private CategoryDTO categoryDTO;
    private String Name;
    private String Address;
    private String phone;
    private int status;
}
