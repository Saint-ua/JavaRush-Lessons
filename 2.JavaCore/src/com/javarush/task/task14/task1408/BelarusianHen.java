package com.javarush.task.task14.task1408;

import org.w3c.dom.ls.LSOutput;

public class BelarusianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 50_000;
    }

    @Override
    String getDescription() {
        String string = String.format("%s Моя страна - %s. Я несу %d яиц в месяц.",
                super.getDescription(), Country.BELARUS, getCountOfEggsPerMonth());
        return string;
    }
}
