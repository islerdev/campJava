package day4Hw2;

public abstract class BaseCustomerManager implements ICustomerService {

	@Override
	public void save(Customer customer) {
		System.out.println("Veritabanưna kaydedildi: " + customer.getFirstName());
		
	}

}
