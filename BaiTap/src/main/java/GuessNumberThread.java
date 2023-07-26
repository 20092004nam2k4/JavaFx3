public class GuessNumberThread implements Runnable{

    private int doanSo = 0;
    private int count = 0;

    public GuessNumberThread(int doanSo){
        this.doanSo = doanSo;
    }
    @Override
    public void run() {
        int randomNumber = 0;
        do {
            randomNumber = (int) (Math.random() * 100 + 1);
            count++;
            System.out.println();
        }while ()
    }
}
