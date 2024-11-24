import java.util.Scanner;

public class IT24104190Lab5Q2{
	public static void main(String[] args){

Scanner obj = new Scanner(System.in);

System.out.print("Enter the number of new members introduced : ");
int new_mem = obj.nextInt();

String prizes ;


if(new_mem < 0){
System.out.println("Input must be a number 0 or greater");
}


else{

switch(new_mem){
  case 0 : 
    prizes = "No Prize";
    break;

  case 1 :
    prizes = "Pen";
    break;
  
  case 2 :
    prizes = "Umbrella";
    break;

  case 3 :
    prizes = "Bag";
    break;

  case 4 :
    prizes = "Travelling Chair";
    break;

  default:
    prizes = "Headphone";
    break;

}

System.out.println("prize is a : "+prizes);

}

obj.close();


}

}



