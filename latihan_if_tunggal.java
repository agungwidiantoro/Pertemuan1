import java.io.*;
import java.util.*;

public class latihan_if_tunggal{
public static void main(String[] args){
Scanner input=new Scanner(System.in);

String Cuaca="";

System.out.println("Cuaca hari ini");
Cuaca=input.next();

if(Cuaca.equals("panas")){
	System.out.println("Kuliah");
	}else{
	System.out.println("Tidak kuliah");
	}

}
}