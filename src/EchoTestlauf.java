
class EchoTestlauf {
	public static void main(String[] args) {
		Echo e1 = new Echo();
		Echo e2 = e1;
		int x = 0;
		
		while (x<4) {
			e1.hallo();	
			e1.zaehler =e1.zaehler +1;
			if (x==3) {
				e2.zaehler = e2.zaehler + 1;

			}
			if (x>0) {
				e2.zaehler = e2.zaehler + e1.zaehler;
			}
			x = x + 1;
			//if (x==4) {        //           bonus :)
			//	e2.zaehler+=14;  // bonus:)
				                              
		//	}      //                           bonus:)
		}
		System.out.println(e2.zaehler);
	}
}