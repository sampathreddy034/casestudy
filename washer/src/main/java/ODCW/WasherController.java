package ODCW;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/washer")
public class WasherController {

    @Autowired
    private WasherRepository washerRepository;

    @GetMapping(value = "/list")
    public List<Washer> getAllWashers(){
        return washerRepository.findAll();
    }
    @PostMapping(value = "/add")
    public String addwasher(@RequestBody Washer washer){
    	washerRepository.save(washer);
        return "washer Added Succesfully";
    }
    @DeleteMapping(value = "/delete/{washerID}")
    public String deleteProduct(@PathVariable String washerID) {
       System.out.println("Delete method called");
       washerRepository.deleteById(washerID);
        return "Deleted Successfully";
    }
    @PutMapping(value = "/update/{washerID}")
    public String updateCoupon(@RequestBody Washer washer, @PathVariable String washerID){
    	washerRepository.save(washer);
        return "washer Updated Succesfully";
    }
}
