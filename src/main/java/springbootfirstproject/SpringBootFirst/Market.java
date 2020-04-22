package springbootfirstproject.SpringBootFirst;

import org.springframework.expression.spel.ast.NullLiteral;
import org.springframework.stereotype.Service;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

@Service
public class Market {

    private List<Car> carList;

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    public Market(){
        this.carList = new ArrayList<>();
        carList.add(new Car("Ford","Mustang"));
    }

    public boolean addCar(Car car){
        return carList.add(car);
    }
}
