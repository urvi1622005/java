public class even {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            if(i==6){
                continue;
            }
            if(i%2==0){
                System.out.println(i);
            }
            else{
                System.out.println("number is odd : " + i);
            }
        }
    }
    
}
