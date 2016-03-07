package br.unb.cic.ep;

public interface Exp {

    public int eval();
    //#ifdef PP
    public String prettyPrint();
    //#endif
}
