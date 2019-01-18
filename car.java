package car;

public class car extends tyre {
	engine e;
	cartype t;
	car(engine e, cartype t){
		this.e = e;
		this.t=t;
		
	}
	void enginename(){
		e.run();
	}
	void typeofcar(){
		t.type();
	}
	void numberoftyre(){
		System.out.println(numberoftyres);
	}
	int r;
      void calculateDist(int radius){
    	this.r=radius;
    	System.out.println(2*3.14*r);
		
	}
      
      



}
