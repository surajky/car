package car;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		engine e2=new bmw();
		engine e1=new vw();
		cartype t1=new solar();
		cartype t2=new electric();
		cartype t3=new motor();
		car c=new car(e2,t2);
		c.enginename();
		c.calculateDist(50);
		c.typeofcar();
		c.numberoftyre();

	}

}
