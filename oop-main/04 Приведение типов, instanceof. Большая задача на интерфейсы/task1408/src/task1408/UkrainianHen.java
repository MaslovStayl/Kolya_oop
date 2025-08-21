package task1408;

public class UkrainianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 200;
    }

    String getDescription() {
        return super.getDescription() + " Моя страна — " + Country.UKRAINE + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
