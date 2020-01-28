package crm.mapper;

import org.mapstruct.Mapper;

import crm.model.Customer;
import crm.model.CustomerDto;
@Mapper
public interface CustomerDTOImpl {

	public Customer customerDtoToCustomer(CustomerDto dto);
	public CustomerDto customerToCustomerDto(Customer customer);
}
