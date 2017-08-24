package Day4_Enum.RockPaperScissorGame;

import java.util.Scanner;

public class GameRPS {

    private int wins;
    private int failure;
    private int draws;

    private RockPaperScissor player=RockPaperScissor.PAPER;
    private RockPaperScissor CPU=RockPaperScissor.PAPER;
    private int result;

    public void playGame(){
        Scanner input=new Scanner(System.in);

        System.out.println("Gramy w papier nożyce kamień.\n " +
                            "Podaj znak {[p]-papier, [n]-nożyce, [k]-kamień, [q]-wyjscie z gry}");


        while (true){
            char c=input.next().charAt(0);
            if (c=='q') break;
            simpleGame(c);
        }
        System.out.printf("Wygarne=%d ,Przegrane= %d, Remisy=%d",wins,failure,draws);
    }

    private void simpleGame(char c){
        try {
            player=player.getByChar(c);
            CPU=CPU.getRandomEnum();
            result=whatResult(player,CPU);

            if (result==0) {
                System.out.format("[Player] %s vs [CPU] %s => !DRAWS!\n",player,CPU);
                draws++;
            }
            if (result<0){
                System.out.format("[Player] %s vs [CPU] %s => !CPU WIN!\n",player,CPU);
                failure++;
            }
            if (result>0){
                System.out.format("[Player] %s vs [CPU] %s => !YOU WIN!\n",player,CPU);
                wins++;
            }
        } catch (RockPaperScissor.WrongChar wrongChar) {
            System.out.println("Podano zły znak. Powyższa gra nie bedzie uwzglęniona w statystykach\n");
            }
    }

    private int whatResult (RockPaperScissor player, RockPaperScissor CPU){
        int toReturn=player.index-CPU.index;
        return Math.abs(toReturn)<2? toReturn:-toReturn;
    }
}
