package ua.javarush.games.minigames.mini03;

import com.javarush.engine.cell.Game;
import com.javarush.engine.cell.Color;

/* 
Проста програма
*/

public class SymbolGame extends Game {

    @Override
    public void initialize() {
        setScreenSize(8,3);
        char[] array = new char[]{'J','A','V','A','R','U','S','H'};
        for (int x = 0, y = 1; x < 8; x++) {
            setCellValueEx(x, y, Color.ORANGE, String.valueOf(array[x]));
        }
    }
}