class array {
  public static void arraypt(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5, 6};
    int[] positiveNumbers = numbers; // copying arrays

    for (int number : positiveNumbers) {
      System.out.print(number + ", ");
    }
  }
}
