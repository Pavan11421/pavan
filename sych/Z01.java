package sych;



class Z16 {
	
	 static int i ;
	 static {
		 System.out.println("from z16");
	
	}

}

  class Z17{
	 
	public static void main(String[] args) {
		
		System.out.println("begin");
		System.out.println(Z16.i);
		System.out.println("end");
	}
	 
}
