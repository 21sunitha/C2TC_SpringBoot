package com.tnsif.DI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

	@Component 
	public class Customer3 {
		private  String name;
		private int cid;
		@Autowired 
		private Customer1 customer1;
		@Autowired
		private Customer2 customer2;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getCid() {
			return cid;
		}
		public void setCid(int cid) {
			this.cid = cid;
		}
		void show() {
			customer1.show();
			customer2.show();
			System.out.println("This is from customer 3  ");
		}

}
