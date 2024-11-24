import java.util.Scanner;

public class IT24104190Lab5Q1{
	public static void main(String[] args){

Scanner obj = new Scanner(System.in);

System.out.print("Enter the first Integer : ");
int first_no = obj.nextInt();

System.out.print("Enter the secound Integer : ");
int secound_no = obj.nextInt();

System.out.print("Enter the third Integer : ");
int third_no = obj.nextInt();

int min_no = first_no;
int max_no = first_no;

System.out.println("User entered numbers are : " + first_no+" " + secound_no+" " + third_no );

if(min_no>secound_no){
min_no = secound_no;
  if(min_no>third_no){
  min_no = third_no;

  }
}

else if(min_no>third_no){
min_no = third_no;
  if(min_no>secound_no){
  min_no = secound_no;  

  } 

}

else if(secound_no>third_no){
min_no = third_no;

}

System.out.println("The Smallest number : "+min_no );


if(max_no<secound_no){
max_no = secound_no;
 if(max_no<third_no){
 max_no = third_no;

}

}

else if(third_no>max_no){
max_no = third_no;
 if(max_no<secound_no){
 max_no = secound_no;
 }

}

System.out.println("The Largest number : "+max_no );

}


}