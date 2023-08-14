package demo.springcore.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("empAddress")
public class Address {
	private String address;
	private String city;
	private String state;
	private String zipcode;
	public String getAddress() {
		return address;
	}
	@Value("E-367/45")
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	@Value("Gurugram")
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	@Value("Haryana")
	public void setState(String state) {
		this.state = state;
	}
	public String getZipcode() {
		return zipcode;
	}
	@Value("122002")
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "Address [address=" + address + ", city=" + city + ", state=" + state + ", zipcode=" + zipcode + "]";
	}
}
