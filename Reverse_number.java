class Reverse_number{
	int num;
	
	void reverse(int num){
	this.num=num;
	System.out.println("Number =" + this.num);
	
}
	void loop(){
		int i=0;
		
		while(num!=0){
			int a =num%10;
			System.out.print(a);
			num=num/10;
			i++;
		}
	}
		public static void main(String args[]){
			Reverse_number r1=new Reverse_number();
			r1.reverse(123);
			r1.loop();
		
	}
}