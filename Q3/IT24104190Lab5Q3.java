import java.util.Scanner;

public class IT24104190Lab5Q3{
	public static void main (String[] args){


Scanner obj = new Scanner(System.in);

System.out.print("Enter the Start Date (1-31) : ");
int start_date = obj.nextInt();

System.out.print("Enter the End Date(1-31) : ");
int end_date = obj.nextInt();

int days =  end_date - start_date;

double discounted_price = 0.00;


double ro_charge_day = 48000.00; 
if(days<3){
System.out.println("No discount");

}
else if(days>2 && days<5){
discounted_price = 48000.00*days*90/100;
}

else if(days>=5){
discounted_price = 48000.00*days*80/100;
}

System.out.println("Total amount to be paid : "+ discounted_price);

System.out.println("Room charge per day : "+ro_charge_day);


}

}