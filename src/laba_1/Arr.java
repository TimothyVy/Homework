package laba_1;

public class Arr {
    private  int[] Arrg;
    private int summ;
    private int j = 0;
    public Arr(int[] Arrg){
        this.Arrg=Arrg;
    }
    public int pFor(){
        summ=0;
        for (int i =0; i<Arrg.length;i++){
            summ=summ+Arrg[i];
        }
        return summ;
    }
    public int pWhile(){
        j=0;
        summ=0;
        while (j<Arrg.length){
            summ=summ+Arrg[j];
            j++;
        }
        return summ;

    }
    public int pDoWhile(){
        j=0;
        summ=0;
        do{
            summ=summ+Arrg[j];
            j++;
        }while (j<Arrg.length);
        return summ;
    }

}
