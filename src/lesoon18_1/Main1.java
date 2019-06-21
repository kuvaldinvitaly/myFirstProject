package lesoon18_1;

public class Main1 {
    public static void main(String[] args) {
        Tournir tournir = new Tournir();
        tournir.addComand("Динамо", 12);
        tournir.addComand("Шахтер", 3);
        tournir.addComand("Мадрид", 15);
        tournir.addComand("Ливерпуль", 17);
        tournir.addComand("Манчествер", 5);
        tournir.addComand("Шахтер", 4);

        tournir.printToConsolRate();

        tournir.printToChampion();

        tournir.minusBall("Ливерпуль",15);
        tournir.printToConsolRate();
        tournir.sredniiBall();

        tournir.printToTurnirTable();
    }
}
