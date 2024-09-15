import java.util.Scanner;
public class calculatecgpa {
    public static void main(String args[]){
        double count=0;
        System.out.println("welcome to cgpa calculator!"+" "+"let's calculate your cgpa");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of subjects:");
        int n=sc.nextInt();
        System.out.println("enter total number of marks:");
        int m=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("enter your"+" "+i+" "+"subject");
            int v=sc.nextInt();
            count+=v;
        }
        double sum=count*100/m;
    
        double cgpa=sum/9.5;
        System.out.println("The required cgpa is"+" "+cgpa);
        
    }
    
}
