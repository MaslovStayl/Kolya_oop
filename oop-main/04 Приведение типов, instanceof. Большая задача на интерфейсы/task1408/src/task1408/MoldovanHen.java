package task1408;

public class MoldovanHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 300;
    }

    String getDescription() {
        return super.getDescription() + " Моя страна — " + Country.MOLDOVA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
