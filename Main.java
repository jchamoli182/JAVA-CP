
class Main extends LC1{
    public static void main(String[] args) {
        // LC1 l = new LC1("chamoli");
        String s = "";
        LC1 lc = new LC1();
        // helper();
        lc.createString();

        System.out.println("returning a empty string: " + s);
    }

    public void helper(){
        System.out.println(createString());
    }
}