public class ForLoop {
    public static void main (String[]args){
        simpleloop();
    }
    public static void simpleloop(){
        for(int i=20; i>1; i--){
            System.out.println(i);
        }
    }

public static void loopWithArray(){
    int number[]={1,2,3,4,5,6,7,8,9,12,13,14};
    for(int i=0; i<number.length;i++){
        System.out.println(i);
    }
}
}