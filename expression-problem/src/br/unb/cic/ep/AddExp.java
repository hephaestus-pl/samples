package br.unb.cic.ep;

public class AddExp implements Exp {

    private Exp lhs;
    private Exp rhs; 
    
    @Override
    public int eval() {
	return lhs.eval() + rhs.eval();
    }
	
    //#ifdef PP
    @Override
    public String prettyPrint() {
	// TODO Auto-generated method stub
	return null;
    }
    //#endif
}
