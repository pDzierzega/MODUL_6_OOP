package Day4_Enum.RockPaperScissorGame;

import java.util.Random;

public enum RockPaperScissor {
    ROCK("ROCK",0,'k'),
    PAPER("PAPER",1,'p'),
    SCISSOR("SCISSOR",2,'n');


    //RockPaperScissor ROCK=new RockPaperScissor("Rock",0,'k');

    String name;
    int index;
    char symbol;

    private RockPaperScissor(String name, int index, char symbol){
        this.name=name;
        this.index=index;
        this.symbol=symbol;
    }

    public RockPaperScissor getRandomEnum(){
        Random random=new Random();
        int randomIndex=random.nextInt(3);
        for (RockPaperScissor CPU :RockPaperScissor.values()) {
            if (CPU.index==randomIndex) return CPU;
        }
        return null;
    }

    public RockPaperScissor getByChar(char c)throws WrongChar{
        for (RockPaperScissor toReturn :RockPaperScissor.values()) {
            if (toReturn.symbol==c) return toReturn;
        }
        throw new WrongChar();
    }



    public class WrongChar extends Exception{}

}
