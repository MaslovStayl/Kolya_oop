package task1408;

public class BelarusianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 1500;
    }

    String getDescription() {
        return super.getDescription() + " Моя страна — " + Country.BELARUS + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
