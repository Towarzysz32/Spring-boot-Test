package springbootfirstproject.SpringBootFirst;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarApi {

  // @Autowired
    private Market market;

    public CarApi(Market market) {
        this.market = market;
    }

    public CarApi() { }

    @Override
    public String toString() {
        return "CarApi{" +
                "market=" + market +
                '}';
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
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
