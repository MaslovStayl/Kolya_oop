package task1408;

public class RussianHen extends Hen {
    @Override
   public int getCountOfEggsPerMonth() {
        return 1000;
    }

    public String getDescription() {
        return super.getDescription() + " Моя страна — " + Country.RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}