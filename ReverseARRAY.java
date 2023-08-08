 class ReverseARRAY {
    public static void reverse(int numbers[]){
        int first = 0, last = numbers.length - 1;
        for (int i=0;i< numbers.length;i++) {
            while (first < last) {
                //swap
                int temp = numbers[last];
                numbers[last] = numbers[first];
                numbers[first] = temp;
                first++;
                last--;
            }
            System.out.print(numbers[i]+" ");
        }
    }
    public static void main(String args[]){
        int numbers[] = {1,2,3,4,5};
        reverse(numbers);
    }
}
