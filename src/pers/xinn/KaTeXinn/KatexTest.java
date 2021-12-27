package pers.xinn.KaTeXinn;

import pers.xinn.KaTeXinn.*;

import static pers.xinn.KaTeXinn.EnviromentArguments.*;
public class KatexTest{
    public static void main(String[] args) {

        KatexString katexString = new KatexString.Builder()
                .BuildBegin_ln(align)
                .Integration("1/2")
                .BuildNewLine()
                .Fraction("2/3")
                .BuildNewLine()
                .BuildEnd()
                .Build();
        System.out.println(katexString.built);



    }
}
