package demo.model;

import java.util.Date;
import java.util.List;

public class GoodsSpecification {
	Long id;
	Category category;
	String specification;
	String material;
	String color;
	Date expiryDate;
	Date producationDate;
	Integer reservationCount;
	List<String> goodsDemostrationImages;
	List<String> goodsDescriptiveImages;
}
