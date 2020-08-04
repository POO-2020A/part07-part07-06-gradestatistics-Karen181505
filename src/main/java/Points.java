import java.util.ArrayList;
public class Points {
    private ArrayList<Integer> list;
    private ArrayList<Integer> grades;
    
    public Points(ArrayList<Integer> list){
        this.list = list;
        this.grades = new ArrayList<>();
    }
    
    public ArrayList grades(){
        
        for(int i=0; i<this.list.size(); i++){
            if(this.list.get(i) < 50 && this.list.get(i) >0){
                grades.add(0);
            }else if(this.list.get(i) < 60 && this.list.get(i) >= 50){
                grades.add(1);
            }else if(this.list.get(i) < 70 && this.list.get(i) >= 60){
                grades.add(2);
            }else if(this.list.get(i) < 80 && this.list.get(i) >= 70){
                grades.add(3);
            }else if(this.list.get(i) < 90 && this.list.get(i) >= 80){
                grades.add(4);
            }else if(this.list.get(i) > 90){
                grades.add(5);
            }
        }
        return grades;
    }
    
    public void print(){
        int cont0=0;
        int cont1=0;
        int cont2=0;
        int cont3 =0;
        int cont4=0;
        int cont5=0;
        for(int i=0; i < this.grades.size(); i++){
            if(this.grades.get(i) ==0){
                cont0++;
            }else if(this.grades.get(i)==1){
                cont1++;
            }else if(this.grades.get(i)==2){
                cont2++;
            }else if(this.grades.get(i)==3){
                cont3++;
            }else if(this.grades.get(i)==4){
                cont4++;
            }else if(this.grades.get(i)==5){
                cont5++;
            }
        }

        System.out.print("5: ");
            for(int j=0; j<cont5; j++){
                System.out.print("*");
            }
            System.out.println("");
            System.out.print("4: ");
            for(int j=0; j<cont4; j++){
                System.out.print("*");
            }
            System.out.println("");
            System.out.print("3: ");
            for(int j=0; j<cont3; j++){
                System.out.print("*");
            }
            System.out.println("");
            System.out.print("2: ");
            for(int j=0; j<cont2; j++){
                System.out.print("*");
            }
            System.out.println();
            System.out.print("1: ");
            for(int j=0; j<cont1; j++){
                System.out.print("*");
            }
            System.out.println("");
            System.out.print("0: ");
            for(int j=0; j<cont0; j++){
                System.out.print("*");
            }
            System.out.println("");
    }
}
