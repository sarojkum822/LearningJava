
public class patt {
    public static void main(String[] args) {
        int i;
        int j;
        int n = 5;
        int count = 1;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if(j==i){
                    System.out.print(count++);
                }
                else{
                    System.out.print("1");
                }
                
            }
            System.out.println();
        }
    }
}