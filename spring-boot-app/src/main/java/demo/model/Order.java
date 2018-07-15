package demo.model;

import java.util.Date;

public class Order {
	Long id;
	String name;
	Buyer buyer;
	Seller seller;
	Date creationDate;
	Date completionDate;
}
