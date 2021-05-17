import Abstract.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;
import java.util.Date;
import Adapter.MernisServiceAdapter;

public class Main {

	public static void main(String[] args) {
		System.out.println("Starbucks");
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(2, "Yücel", "Sarýkaya", new Date(1998, 6, 18), "12345678911")); // sadece dogum yilini alir																										

		System.out.println("=============================================");

		System.out.println("Nero");
		BaseCustomerManager customerManager2 = new NeroCustomerManager();
		customerManager2.save(new Customer(2, "Yücel", "Sarýkaya", new Date(1997, 6, 18), "12345678911"));
	}

}
