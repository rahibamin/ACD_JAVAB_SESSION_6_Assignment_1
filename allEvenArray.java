package Session6.Assignment1;

public class allEvenArray {

	public static void main(String[] args) {
		int [] myArray =  new int[10];
		
		
		System.out.println("Even Numbers");
		System.out.println("Printing EVEN numbers between 1 and 10.");
		for(int i=0; i <= myArray.length ; i++){
			// if the number is divisible by 2 then it is even
			if( i % 2 == 0){
				System.out.print(i + " ");
			}
	}

}
}
