package ua.javarush.task.pro.task08.task0805;

import java.util.Random;

public class MagicBall {
    private static final String CERTAIN = "Безперечно";
    private static final String DEFINITELY = "Безумовно, так";
    private static final String MOST_LIKELY = "Найймовірніше";
    private static final String OUTLOOK_GOOD = "Хороші перспективи";
    private static final String ASK_AGAIN_LATER = "Запитай пізніше";
    private static final String TRY_AGAIN = "Спробуй ще";
    private static final String NO = "Моя відповідь — ні";
    private static final String VERY_DOUBTFUL = "Вельми сумнівно";

    public static String getPrediction() {
        //напишіть тут ваш код
        Random r = new Random();
        int x = r.nextInt(8);
        String[] ans = {CERTAIN, DEFINITELY, MOST_LIKELY, OUTLOOK_GOOD,
                        ASK_AGAIN_LATER, TRY_AGAIN, NO, VERY_DOUBTFUL};
        if(x>=0 && x<8) return ans[x];
        else return null;
    }
}
