package ch.interoperability;

public class MyJavaFile {

    public static void main(String[] args) {
        System.out.println(MyKotlinFile.add(3,4));
        System.out.println(MyKotlinFile.getVolume(3, 5));
    }

    public static int subtract(int a, int b) {
        return a -b;
    }
}
