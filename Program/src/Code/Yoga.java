package Code;

public class Yoga {

	int Zoom_id;
	String Practice_Name;
	int Practise_code;
	int NoOfMouth;
	double NetCost;
	
	
	public Yoga(int zoom_id, String practice_Name, int practise_code, int noOfMouth, int netCost) {
		super();
		Zoom_id = zoom_id;
		Practice_Name = practice_Name;
		Practise_code = practise_code;
		NoOfMouth = noOfMouth;
		NetCost = netCost;
	}


	public Yoga() {
		System.out.println("Online Yoga Payment System");
	}




	public int getZoom_id() {
		return Zoom_id;
	}


	public void setZoom_id(int zoom_id) {
		Zoom_id = zoom_id;
	}


	public String getPractice_Name() {
		return Practice_Name;
	}


	public void setPractice_Name(String practice_Name) {
		Practice_Name = practice_Name;
	}
	
	public double OnlinePayment (int Practise_Code) {
		
		if(Practise_Code == 666) {
			return 30;
		}else if (Practise_Code == 777) {
			
			return 20;
		}else {
			return 0 ;
		}
	}
		
		@Override
	public String toString() {
		return "Yoga [Zoom_id=" + Zoom_id + ", Practice_Name=" + Practice_Name + ", Practise_code=" + Practise_code
				+ ", NoOfMouth=" + NoOfMouth + ", NetCost=" + NetCost + "]";
	}


		public double OnlinePayment (double NetCost , int NoOfMouth ) {
			
			double Refresh = NetCost-(0.3*NetCost); 
			double Yearly_Payment = (Refresh  *  NoOfMouth);
			
			return Yearly_Payment;
				
		}




	
		
		
	}

