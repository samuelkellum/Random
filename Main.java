import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int n = in.nextInt();
        if(n%2==0){
            if(k<=n/2){
                int[] profit = new int[n];
                for(int i =0;i<n;i++){
                    profit[i]=in.nextInt();
                }
        System.out.printf("%d\n" , maxProfit(k , n, profit));
                
            }
            
        }
        else{
            System.out.println("ERROR: Number of sections is not even!");
            
        }
        
    }

    static int maxProfit(int k, int n, int profit[]){
        int currentValue = 0;
        int maxProfit = 0;
        if(n == k * 2){
            for(int i = 0; i < n; i++){
                maxProfit += profit[i];
            }
        }
        else{
            for(int i=0;i<=n/2;i++){
                int x = i;
                for(int j=0;j<k;j++){
                    int limit;
        if(x+(n/2)<n){
            limit = x+(n/2);
        }
        else{
            limit = x-(n/2);
        }
        
    currentValue += profit[x] + profit[limit];
    
        if(x+1<n){
            x+=1;
        }
    }
    
    if(currentValue>maxProfit){
    
    maxProfit=currentValue;
    
    currentValue=0;
    
    }
    
    else{
        currentValue=0;}
    
    }
    
    }
    
    // return output
    
    return maxProfit;
    
    }
    
    }
