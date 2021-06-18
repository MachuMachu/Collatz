import java.util.Scanner;

public class Main {

	public static void main(String[] args){
	    Scanner s=new Scanner(System.in);
	    int a,x; char loop='y'; String str;
	    System.out.println("This program produces Collatz sequence");
	    while(loop=='y') {
	    	str=""; 
		    System.out.print("Input positive integer: "); 
	    	x=s.nextInt();
	    	a=x;
	    	while(a!=1) {
	    		if(a%2==0) {
	    			a/=2;
	    			str+=" "+a;
	    		}
	    		else {
	    			a=3*a+1;
	    			str+=" "+a;
	    		}
	    	}
	    System.out.println("The collats sequence of "+x+" is "+str);
	    System.out.print("Again?[y/n]: ");
	    loop=s.next().charAt(0);
	    }
	}

}
