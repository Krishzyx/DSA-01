class main {
  private static void LinearSearch(int[] arr, int item) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == item)
        ;
      {
        System.out.println(item + "found at index:" + i);
      }
    }
    System.out.println("Match Not Found");
  }

  public static void main(String args[]) {
    int arr[] = { 12, 34, 56, 78, 45, 67, 89 };

    int item = 78;
    LinearSearch(arr, item);
  }
}
