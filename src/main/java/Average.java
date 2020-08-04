import java.util.ArrayList;

public class Average {
    private ArrayList<Integer> list;
    
    public Average(ArrayList<Integer> list){
        this.list = list;
    }
    
    public double averagePoint(){
        if(this.list.isEmpty()){
            return 0;
        }
        int suma=0;
        for(int i=0; i<this.list.size(); i++){
            suma = suma + this.list.get(i);
        }
        
        double average = suma * 1.0/this.list.size();
        return average;
    }
    
    public int aprobadedAlums(){
        if(this.list.isEmpty()){
            return 0;
        }

        int contador =0;
        for(int i =0; i< this.list.size(); i++){
            if (this.list.get(i) >= 50){
                
                contador ++;
            }
        }
        return contador;
    }
    
    public double aprobaded(){
        if(this.list.isEmpty()){
            return 0;
        }
        int sum =0;
        int contador =0;
        for(int i =0; i< this.list.size(); i++){
            if (this.list.get(i) >= 50){
                sum = sum + this.list.get(i);
                contador ++;
            }
        }
        if(contador ==0){
            return 0;
        }
        double average = sum* 1.0 / contador;
        return average;
    }
    
    
    
}
