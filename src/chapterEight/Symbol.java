package chapterEight;

public enum Symbol {
    E, X, O;

    @Override
    public String toString() {
        switch(this){
            case E -> {return "E";}
            case O -> {return "O";}
            case X -> {return "X";}
        }
        return "Symbol{}";
    }
}

