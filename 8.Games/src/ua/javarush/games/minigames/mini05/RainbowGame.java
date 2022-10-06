package ua.javarush.games.minigames.mini05;

import com.javarush.engine.cell.Game;
import com.javarush.engine.cell.Color;

import java.lang.reflect.Array;

/* 
Кольори веселки
*/

public class RainbowGame extends Game {
    @Override
    public void initialize() {
        setScreenSize(10, 7);
        int[] array = new int[]{
                Color.RED.ordinal(),
                Color.ORANGE.ordinal(),
                Color.YELLOW.ordinal(),
                Color.GREEN.ordinal(),
                Color.BLUE.ordinal(),
                Color.INDIGO.ordinal(),
                Color.VIOLET.ordinal()
        };
        for (int y = 0; y < 7; y++) {
            for (int x = 0; x < 10; x++) {
                setCellColor(x,y,Color.values()[array[y]]);
            }
        }
    }
}
