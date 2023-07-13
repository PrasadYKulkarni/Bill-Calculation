package Controller;

public class Service {
	public double billCalculate(int qty,double price,String membership) {
		
		double total;
		double finalAmt;
		double gstAmt;
		double deliveryCharge=40;
		
		if (membership.equals("Prime")) {
			//GST is 5%
			total=qty*price;
			finalAmt=total +total*0.05;
			return finalAmt;
		}
		
		else {
			//GST is 5%
			total=qty*price+deliveryCharge;
			gstAmt=total+total*0.05;
			return gstAmt;
		}
		
	}
	
        public double originalAmt(int qty, double price) {
		double total=qty*price;
		return total;
			}
        
	}


