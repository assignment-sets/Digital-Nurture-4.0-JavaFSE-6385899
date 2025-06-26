# Output

```bash
gourab@gourab-Vostro-15-3515:~/coding/Digital-Nurture-4.0-JavaFSE-6385899/weekly_hands_on/week1/Data_structures_and_Algorithms/FinancialForecastingExample$ cd "/home/gourab/coding/Digital-Nurture-4.0-JavaFSE-6385899/weekly_hands_on/week1/Data_structures_and_Algorithms/FinancialForecastingExample/" && javac Test.java && java Test

projected reveneue for 5 years is : 3539271.96

```

## Time complexity analysis

- Time complexity of used recursive approach is : O(N)
- Space complexity is: O(N)

## optimization techniques discussed

- dynamic programming: memoization or tabulation is not going to help improve the time complexity much in our case rather waste extra space

- dp is useful when the recursion tree has branches but as our recursion tree is linear they are not required

- for saving both space and time direct math formula of CI can be used in ur case improving both space and time complexity to constant

- An iterative approach will bring down the space complexity to O(1) by removing the recursion stack space; however, we are to use the recursive approach specifically here
