package lessons;
import java.lang.*;
class SomeClass {
    private   String str = "hello world!!";
    public  String getStr(){
        return  str;
    }

    public void setStr(String newStr) {
        this.str = newStr;
    }



}
class Main {

    public static void main(String[] args) {

        SomeClass object= new SomeClass();
        System.out.println(object.getStr());
        object.setStr("dadon");
        System.out.println(object.getStr());
    }
}
