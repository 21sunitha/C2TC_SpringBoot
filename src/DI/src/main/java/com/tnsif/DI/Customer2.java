package com.tnsif.DI;
import org.springframework.stereotype.Component;

	@Component 
	public class Customer2 {
		private  String name;
		private int cid;
		
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
			System.out.println("This is from customer 2  ");
		}

}
