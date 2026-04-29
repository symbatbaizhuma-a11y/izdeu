package code;// Java коды
// Бұл бағдарламада екі әдіс те көрсетілген. Маңызды: Бинарлық іздеу дұрыс жұмыс істеуі үшін массив алдын ала сұрыпталған болуы тиіс.

public class SearchAlgorithms {

    public static void main(String[] args) {
        int[] numbers = {10, 23, 35, 47, 50, 63, 75, 88, 91}; // Сұрыпталған массив
        int target = 63;

        // 1. Сызықтық іздеу
        int linearResult = linearSearch(numbers, target);
        System.out.println("Сызықтық іздеу нәтижесі: Индекс " + linearResult);

        // 2. Бинарлық іздеу
        int binaryResult = binarySearch(numbers, target);
        System.out.println("Бинарлық іздеу нәтижесі: Индекс " + binaryResult);
    }

    // Сызықтық іздеу алгоритмі
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Элемент табылды
            }
        }
        return -1; // Элемент табылмады
    }

    // Бинарлық іздеу алгоритмі
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid; // Элемент табылды
            }
            if (arr[mid] < target) {
                low = mid + 1; // Оң жақ бөліктен іздеу
            } else {
                high = mid - 1; // Сол жақ бөліктен іздеу
            }
        }
        return -1; // Элемент табылмады
    }
}