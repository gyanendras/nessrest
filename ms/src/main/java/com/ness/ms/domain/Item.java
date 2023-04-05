package com.ness.ms.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="items")
public class Item {
	@Id
	Long itemId;
	
	Long orderIdItem ;
	Long product_id ;
	Long  quantity ;
	Double price_per_unit ;

}
