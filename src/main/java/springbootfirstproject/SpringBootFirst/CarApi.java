package springbootfirstproject.SpringBootFirst;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarApi {

    public CarApi() { }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

   @Autowired
    private Market market;


    public CarApi(Market market) {
        this.market = market;
    }



     @GetMapping("/getCar")
    public List<Car> getCars(){
        return market.getCarList();
     }

    @PostMapping("/addCar")
    public boolean addCars(@RequestBody Car car){
        return market.addCar(car);
    }


}
