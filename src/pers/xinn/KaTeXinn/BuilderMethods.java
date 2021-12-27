package pers.xinn.KaTeXinn;

public interface BuilderMethods {
    KatexString.Builder BuildBegin(EnviromentArguments EAs);

    KatexString.Builder BuildBegin_ln(EnviromentArguments EAs);

    KatexString.Builder Integrate(String s);

    KatexString.Builder Integrate(String s, int i);

    KatexString.Builder Frac(String s);

    KatexString.Builder tFrac(String s);

    KatexString.Builder dFrac(String s);

    KatexString.Builder cFrac(String s);

    KatexString.Builder A_Over_B(int a,int b);

    KatexString.Builder BuildEnd();

    KatexString Build();

    KatexString.Builder BuildNewLine();

    KatexString.Builder Box();

    KatexString.Builder Differentiate();

    KatexString.Builder Bar();
}
