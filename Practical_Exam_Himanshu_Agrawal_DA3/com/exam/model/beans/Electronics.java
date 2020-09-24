package com.exam.model.beans;

public class Electronics extends RetailProduct{

		private int warranty;




		public Electronics() {
			super();
			// TODO Auto-generated constructor stub
		}


		public Electronics(int itemCode, String itemName, double unitPrice, int quantity,int warranty) {
			super(itemCode, itemName, unitPrice, quantity);
			this.warranty = warranty;
			// TODO Auto-generated constructor stub
		}


		public int getWarranty() {
			return warranty;
		}

		public void setWarranty(int warranty) {
			this.warranty = warranty;
		}
}
