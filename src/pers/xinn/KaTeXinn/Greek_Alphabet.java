package pers.xinn.KaTeXinn;

public enum Greek_Alphabet {

    Alpha("Alpha", "α","Α"),
    Beta("Beta", "β","Β"),
    Gamma("Gamma", "γ","Γ"),
    Delta("Delta","δ","Δ"),
    Epsilon("Epsilon","ε","Ε"),
    Zeta("Zeta","ζ","Ζ"),
    Eta("Eta","η","Η"),
    Theta("Theta","θ","Θ"),
    Iota("Iota","ι","Ι"),
    Kappa("Kappa","κ","Κ"),
    Lambda("Lambda","λ","Λ"),
    Mu("Mu","μ","Μ"),
    Nu("Nu","ν","Ν"),
    Xi("Xi","ξ","Ξ"),
    Omicron("Omicron","ο","Ο"),
    Pi("Pi","π","Π"),
    Rho("Rho","ρ","Ρ"),
    Sigma("Sigma","σ","Σ"),
    Tau("tau","τ","Τ"),
    Upsilon("Upsilon","υ","Υ"),
    Phi("Phi","φ","Φ"),
    Chi("Chi","χ","Χ"),
    Psi("Psi","ψ","Ψ"),
    Omega("Omega","ω","Ω");

    private final String key;
    private final String LowerCase;
    private final String UpperCase;

    Greek_Alphabet(String key, String LowerCase,String UpperCase) {
        this.key = key;
        this.LowerCase = LowerCase;
        this.UpperCase = UpperCase;
    }

    public String getLowerCase() {
        return LowerCase;
    }

    public String getUpperCase() {
        return UpperCase;
    }
    public String getKey(){
        return key;
    }
    public String getAll(){
        return String.format("key: %s LowerCase: %s Uppercase %s",key,LowerCase,UpperCase);
    }
    public String getAll_noAssignments(){
        return String.format("%s %s %s",key,LowerCase,UpperCase);
    }
}


