package pers.xinn.KaTeXinn;

public class KatexString implements KatexStringMethods {
    StringBuilder built = new StringBuilder();

    @Override
    public StringBuilder getBuilder(){
        return this.built;
    }

    public KatexString(Builder builder){
        this.built = builder.stringBuilder;
    }


    public static class Builder{
        StringBuilder stringBuilder = new StringBuilder();
        EnviromentArguments EnvTemp;
        int TempNumber;

        public Builder(){
            this.stringBuilder = stringBuilder;
        }

        public Builder BuildBegin(EnviromentArguments EAs){
            this.stringBuilder.append(String.format("\\begin{%s}",EAs));
            return this;
        }

        public Builder BuildBegin_ln(EnviromentArguments EAs){
            this.stringBuilder.append(String.format("\\begin{%s} \n",EAs));
            this.EnvTemp = EAs;
            return this;
        }

        public Builder Integration(String s){
            if (s.contains("/")){
                String[] temp = s.split("/");
                this.stringBuilder.append(String.format("\\int %s/%s",temp[0],temp[1]));
            }else {
                this.stringBuilder.append(String.format("\\int %s",s));
            }
            return this;
        }

        public Builder Fraction(String s){
            String[] temp = s.split("/");
            this.stringBuilder.append(String.format("\\frac{%s}{%s}",temp[0],temp[1]));
            return this;
        }


        public Builder BuildEnd(){
            this.stringBuilder.append(String.format("\\end{%s}",EnvTemp));
            return this;
        }

        public KatexString Build(){
            return new KatexString(this);
        }

        public Builder BuildNewLine(){
            this.stringBuilder.append("\\\\\n");
            return this;
        }

        public String toString(){
            return stringBuilder.toString();
        }


    }
}
