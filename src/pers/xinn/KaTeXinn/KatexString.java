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


    public static class Builder implements BuilderMethods{
        StringBuilder stringBuilder = new StringBuilder();
        EnviromentArguments EnvTemp;
        int TempNumber;

        public Builder(){
            this.stringBuilder = stringBuilder;
        }
        @Override
        public Builder BuildBegin(EnviromentArguments EAs){
            this.stringBuilder.append(String.format("\\begin{%s}",EAs));
            return this;
        }
        @Override
        public Builder BuildBegin_ln(EnviromentArguments EAs){
            this.stringBuilder.append(String.format("\\begin{%s} \n",EAs));
            this.EnvTemp = EAs;
            return this;
        }
        @Override
        public Builder Integrate(String s){
            if (s.contains("/")){
                String[] temp = s.split("/");
                this.stringBuilder.append(String.format("\\int %s/%s",temp[0],temp[1]));
            }else {
                this.stringBuilder.append(String.format("\\int %s",s));
            }
            return this;
        }
        @Override
        public Builder Integrate(String s, int i){
            String times = "i".repeat(i);
            if (s.contains("/")){
                String[] temp = s.split("/");
                this.stringBuilder.append(String.format("\\%snt %s/%s",times,temp[0],temp[1]));
            }else {
                this.stringBuilder.append(String.format("\\%snt %s",times,s));
            }
            return this;
        }
        @Override
        public Builder Frac(String s){
            String[] temp = s.split("/");
            this.stringBuilder.append(String.format("\\frac{%s}{%s}",temp[0],temp[1]));
            return this;
        }

        @Override
        public Builder tFrac(String s) {
            return null;
        }

        @Override
        public Builder dFrac(String s) {
            return null;
        }

        @Override
        public Builder cFrac(String s) {
            return null;
        }

        @Override
        public Builder A_Over_B(int a, int b) {
            return null;
        }

        @Override
        public Builder BuildEnd(){
            this.stringBuilder.append(String.format("\\end{%s}",EnvTemp));
            return this;
        }
        @Override
        public KatexString Build(){
            return new KatexString(this);
        }
        @Override
        public Builder BuildNewLine(){
            this.stringBuilder.append("\\\\\n");
            return this;
        }

        @Override
        public Builder Box() {
            return null;
        }

        @Override
        public Builder Differentiate() {
            return null;
        }

        @Override
        public Builder Bar() {
            return null;
        }

        @Override
        public String toString(){
            return stringBuilder.toString();
        }
    }
    public String toString(){
        return built.toString();
    }
}
