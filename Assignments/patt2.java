public class patt2 {
    public static void main(String[] args){
        int i;
        int j;
        int n= 5;
        for(i=1;i<=n;i++){
 
            for(j=1;j<=i;j++){
                System.out.print(i);
            }
            for(int k=i;k<=n-1;k++){
                System.out.print("1");
            }
            System.out.println();
        }
    }
}
