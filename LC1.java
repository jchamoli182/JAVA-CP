public class LC1 {
    private String str = "chamoli";
    // public LC1(String s){

    //     str = s;

    // }
    public String createString(){


        StringBuilder sb = new StringBuilder(str);

        sb.append(" jayesh");

        System.out.println(sb.toString());

        str = sb.toString();

        System.out.println(str);


        return "";
    }
}
