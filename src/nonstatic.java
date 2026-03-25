public class nonstatic {
    static int a;

    public void meth(){

        System.out.println(this.a);
    }

    nonstatic(){

    }

    public static void main(String[]args){
//        System.out.println(a);
//        System.out.println(nonstatic.a);
        nonstatic obj = new nonstatic();
        obj.meth();
//        System.out.println(obj.a);

    }
}
