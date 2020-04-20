package springbootfirstproject.SpringBootFirst;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.yaml.snakeyaml.error.Mark;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class SpringBootFirstApplicationTests {



	//Market
	@Test
	public void market_getlist(){
		Market market = new Market();
		Assertions.assertNotNull(market.getCarList(),"Dziala poprawnie");
	}

	@Test
	public void market_market(){
		Market market = new Market();
		Car car = new Car();
		Assertions.assertTrue(market.addCar(car));
	}

	// CarApi
	@Test
	public void hello_say_hello(){
	CarApi carapi = new CarApi();
		Assertions.assertEquals(carapi.hello(),"hello","funkcja hello dziala poprawnie");
	}

	@Test
	public void CarApi_GetCar(){
		CarApi carapi = new CarApi();
		Car car = new Car("Ford","Mustang");
		Assertions.assertEquals(carapi.getCars(),car);

	}


}
