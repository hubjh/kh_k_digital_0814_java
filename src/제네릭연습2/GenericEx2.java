package 제네릭연습2;
/*
Date : 2023-08-30
Author : J.H.Hwang
Purpose :  Generic를 설명하는 프로그램입니다.
 */
public class GenericEx2 {
    public static void main(String[] args) {
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        powderPrinter.setMaterial(new Powder());
        Powder powder = powderPrinter.getMaterial();
        System.out.println(powder);
    }
}
