class Main {
    public static void main(String[] args) {
        int[] List = {1, 2, 3, 4, 5, 6,7,8,9,10,11,12,13,14,15};
        double sum = 0;

        for (int i = 0; i < List.length; i++) {
            sum += List[i];
        }
        double average = (sum / List.length);

        System.out.println("Average : "+average);
    }
}