//janhvi
public class ASCII_Chart {
	public static void main(String[] args) {
		System.out.println("ASCII_Chart...");
		
		//for loop
		for(int ascii=0; ascii<=255; ascii++) {
			
			//int ascii is type cast into char type
			System.out.println((char)ascii + "\t");
			
			if(ascii % 8 == 7) { //for new line
				System.out.println();
			}
		}
		
		//while loop
		int ascii=0;
		while(ascii<=255) {
			System.out.println((char)ascii + "\t");
			ascii++;
			if(ascii % 8 == 7) { //for new line
				System.out.println();
			}
		}//end of while
		
		//do while loop
		int ascii=0;
		do {
			System.out.println((char)ascii + "\t");
			
			if(ascii % 8 == 7) { //for new line
				System.out.println();
			}
			ascii++;
		}
		while(ascii!=255);
	}
}
