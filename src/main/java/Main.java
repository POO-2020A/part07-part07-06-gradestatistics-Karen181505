import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Average ave = new Average(list);
        Points points = new Points(list);
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        int participed=0;
        System.out.println("Enter point total, -1 stops:");
        while(true){
            int point = Integer.valueOf(scanner.nextLine());
            if(point == -1){
                break;
            } else if (point <= 100 && point >= 0){
                list.add(point);
                participed ++;
            }
        }
        
        System.out.println("Point average (all): " + ave.averagePoint() );
        if(ave.aprobaded() ==0){
            System.out.println("Point average (passing): -");
        }
        System.out.println("Point average (passing): " +  ave.aprobaded());
        double passPorcentage =0;
        if(participed >0){
          passPorcentage = (100.0* ave.aprobadedAlums())/ participed;  
        }else{
            passPorcentage = 0;
        }
        System.out.println("Pass percentage: " + passPorcentage);
        System.out.println("Grade distribution:");
        points.grades();
        points.print();
        
        
    }
}
