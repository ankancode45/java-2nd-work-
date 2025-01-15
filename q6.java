//Author Ankan 
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
class Address{
	private String street;
	private String city;
	private String pinCode;
}
@Getter
@Setter
@AllArgsConstructor
@ToString
class Person{
	private String name;
	private int age;
	private Address address; //Person HAS-A relationship with address
}
class Information{
	public static void main(String[]args){
		Address address= new Address("Entally","Kolkata","700014");//Address object
		Person person= new Person("Ankan",19,address);//Person object with address
	System.out.println(person);
	}
}
		
	
