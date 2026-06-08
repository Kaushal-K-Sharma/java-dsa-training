
public class Str {
    public static void main(String[] args){
        String str = "Hello World";
        System.out.println(str);
        System.out.println(str.charAt(0));
        StringBuilder sb = new StringBuilder("Hello");
        //StringBuilder sbd = sb.delete(1,3);
        System.out.println(sb);
        StringBuilder sbreverse = sb.reverse();
        System.out.println(sbreverse);

    }
}