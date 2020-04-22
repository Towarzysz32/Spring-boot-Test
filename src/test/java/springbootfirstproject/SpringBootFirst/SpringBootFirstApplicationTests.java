package springbootfirstproject.SpringBootFirst;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
class SpringBootFirstApplicationTests {

	// Car
	@Test
	public void carConstructorNotArgument(){
		Car car = new Car();
		Car testcar = new Car("NULL","NULL");
		Assertions.assertEquals(car,testcar);
	}

	@Test
	public void carConstructorWithArgument(){
		Car car = new Car("Ford","Mustang");
		Assertions.assertNotNull(car);
	}

	@Test
	public void testSetModel() {
		Car car = new Car();
		Car testcar = new Car("Mustang","NULL");
		car.setModel("Mustang");
		Assertions.assertEquals(car,testcar);
	}

	@Test
	public void testSetMark() {
		Car car = new Car();
		Car testcar = new Car("NULL","Mustang");
		car.setMark("Mustang");
		Assertions.assertEquals(car,testcar);
	}

	@Test
	public void testGetModel() {
		Car car = new Car("Ford","Mustang");
		Assertions.assertEquals(car.getModel(),"Ford");
	}

	@Test
	public void testGetMark() {
		Car car = new Car("Ford","Mustang");
		Assertions.assertEquals(car.getMark(),"Mustang");
	}

	@Test
	public void testEquals(){
		Car car = new Car();
		Assertions.assertTrue(car.equals(car)); // czy to ma sens? testuje sie operatory przeciazenia?
	}

	//Market
	@Test
	public void testSetCarList() {
		Market market = new Market();
		List<Car> carList = null;
		market.setCarList(carList);
		Assertions.assertNotNull(market);
	}

	@Test
	public void marketGetlist(){
		Market market = new Market();
		Car car = new Car("Ford", "Mustang");
		List<Car> carList = new ArrayList<>(); ;
		carList.add(car);
		Assertions.assertNotNull(market,"Not null");
		Assertions.assertEquals(market.getCarList(),carList,"Not null");
	}

	@Test
	public void marketAddCar(){
		Market market = new Market();
		Car car = new Car();
		Assertions.assertTrue(market.addCar(car));
	}

	// CarApi
	@Test
	public void CarApiContstuct(){
		CarApi carapi = new CarApi();
		Assertions.assertNotNull(carapi);
	}

	@Test
	public void helloSayHello(){
	CarApi carapi = new CarApi();
		Assertions.assertEquals(carapi.hello(),"hello","funkcja hello dziala poprawnie");
	}

	@Test
	public void CarApiGetCar(){
		Market mock = Mockito.mock(Market.class);
		Mockito.when(mock.getCarList()).thenReturn(Arrays.asList(new Car("Ford","Mustang")));

		List<Car> carList =  mock.getCarList();
		Car car = new Car("Ford","Mustang");
		Assertions.assertEquals(carList.get(0),car);
	}
}
