import java.io.*;
import java.util.*;

public class latihan_if_majemuk{
public static void main(String[]Args){

int Nilai;
Scanner input=new Scanner(System.in);

System.out.print("Masukan Nilai Ulangan =  ");
Nilai=input.nextInt();


if(Nilai >= 80){
	System.out.println("Grade A");
}else if(Nilai >= 70){
	System.out.println("Grade B");
}else if(Nilai >= 60){
	System.out.println("Grade C");
}else if(Nilai >= 50){
	System.out.println("Grade D");
}else{
	System.out.println("grade E");
}
}
}