package visitor;

import upm.jbb.IO;


public final class VisitorMain {

    public static void main(String[] args) {
    	
    	
        IO.getIO().addView(new FiguresManager());
    }
}
