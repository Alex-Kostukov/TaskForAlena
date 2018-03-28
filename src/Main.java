public class Main {
    public static void main(String[] args) {
        double a[] = {1, 2, 3, 1, 1, 0, 0, 0, -2, -1, -100};
        //создание массива - заменить на запись из файла
        System.out.println(getN(a)); // заменить
    }

    static int getN(double a[]) {

        int nElems = a.length; //количество элементов - заменить на m
        int i, j;               //счетчик цикла

        // вывод элементов - убрать или заменить
        for (j = 0; j < nElems; j++)
            System.out.print(a[j] + " ");
        System.out.println("");

        int shiftCounter, startBlock;

        for (i = 0; i < nElems; ) { //поиск удаляемого элемента
            shiftCounter = 1;
            startBlock = i;
            for (int k = i; k < nElems - 1; k++) {

                if (a[k + 1] <= a[k]) {
                    i = k;
                    break;
                }
                shiftCounter++;
                i = k;
            }

            if (shiftCounter == 2 || shiftCounter == 3) {
                for (int k = startBlock; k < nElems - shiftCounter; k++) //сдвиг последующих элементов
                    a[k] = a[k + shiftCounter];
                nElems = nElems - shiftCounter;   //уменьшение размера
                i = i - shiftCounter; // уменьшение положения курсора на количество сдвинутых элементов
            }
            i++;
            if (nElems == 0) {
                break;
            }
        }

        for (j = 0; j < nElems; j++)    //вывод элементов - заменить или удалить
            System.out.print(a[j] + " ");
        System.out.println("");

        return nElems;
    }


}
