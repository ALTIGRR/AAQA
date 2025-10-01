public class Exceptions {
    public static void main(String[] args) {
        try {
            String[][] fxf = new String[][]{
                    {"1", "1", "4", "5"},
                    {"5", "3", "11", "13"},
                    {"1", "5", "7", "3"},
                    {"10", "4", "2", "7"}
            };
            doubleMassive(fxf);
            System.out.println("Массив соответствует требованиям.");
            int result = doubleMassive(fxf);
            System.out.println("Сумма = " + result);
            System.out.println(fxf[1][3]);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Произошёл Out Of Bounds, размер массива меньше, чем элемент вызываемый по индексу");
        }
    }

    public static int doubleMassive(String[][] fxf) throws MyArraySizeException, MyArrayDataException {
        if (fxf.length != 4) {
            throw new MyArraySizeException("Неверное кол-во строк массива, попробуйте 4.");
        }
        for (int j = 0; j < fxf.length; j++) {
            if (fxf[j].length != 4) {
                throw new MyArraySizeException("Неверное кол-во столбцов массива, попробуйте 4.");
            }
        }
        int res = 0;
        for (int i = 0; i < fxf.length; i++) {
            for (int j = 0; j < fxf[i].length; j++) {
                try {
                    int number = Integer.parseInt(fxf[i][j]); // преобразование в int
                    res += number; // накопление в переменной каждого значения массива за счёт сложения и присваивания
                } catch (
                        NumberFormatException e) {// Integer.parseInt выбрасывает NumberFormatException, для использования своего исключения нужно преобразование
                    throw new MyArrayDataException("Ошибка преобразования в ячейке [" + i + "][" + j + "]:" + fxf[i][j]);
                }
            }
        }
        return res;
    }
}
