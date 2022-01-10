# sort-o_GreenMushrooms 

## Team Members:
- Tasnim Chowdhury
- Emily Ortiz
- Kartik Vanjani

## SOTW: Stitches by Shawn Mendes

__________________________

# BubbleSort
- The best case for bubble sort would be no sorting at all, and therefore the elements in the array being listed from least to greatest because
  - Time complexity
- The worst case 
  - Time complexity

# SelectionSort
- The best case for selection sort would also be the elements listed in order from least to greatest, or the least number being placed at the minPos and the greatest element being placed in the maxPos because then it would be way easier to get the elemts in their proper spaces. However, with the elements already being in least to greatest form, the elements would not need to be moved at all, and thus it would be the best case possible. 
  - Time complexity: We believe the best case would be O(n) and here is why. Say for instance we have an array we need sorted listed as [1, 2, 3, 4, 5]. Since the loop will run around the times equal to the amount of elements present in the array, and since the array is already sorted, the comparisons would be equal to the elements in the array minus 1, or n - 1, passes would also be n - 1, but the swaps would be 0. Since selection sort work by placing the minimum value at the start and the next less value next to start and so on, one loop nested, or O(n) would be the best case. 

- The worst case for selection sort would be if the elements in the array are listed from greatest to least. Since the maximum number of swaps you can do is the element number minus 1 since the algorithm finds the minimum value and puts it at the end and so on, the worse case possible would be to have every element from greatest to least. This way every element would be out of place, and the number of swaps would be the greatest. 
  - Time complexity should be O(n^2). Since the selection sort algorithm looks for the minimum values, and it would take two nested loops to place the minimum value in its position and the max at the last, the worst case would be n* n+1 which would be O(n^2).

# InsertionSort
- The best case for insertion sort would be one that requires 0 swaps, which means the conditional under the nested for loop must always return false. In order for this to be the case, the number to the left of a chosen index must always be less than the number at the chosen index, meaning that the array must be in already ascending order, or sorted. 
  - Eg. [1, 3, 5, 7, 12] -------> Comparisons: 4     Swaps: 0     Passes: 4
  - Time complexity: O(n) because the first loop and its contents will run around the same number of times as the length of the input. However, most of the content under the nested for loop will never run because it is under a conditional that will always return false in the best case scenario, making the second loop not significant enough to add to the time complexity.
- The worst case for insertion sort would be one that requires the maximum number of swaps, which means the conditional under the nested for loop must always return true. In order for this to be the case, the number to the left of a chosen index must always be greater than the number at the chosen index, meaning that the array must be in descending order, or reverse sorted. 
  - Eg. [12, 7, 5, 3, 1] -------> Comparisons: 10     Swaps: 10     Passes: 4
  - Time complexity: O(n^2) because the first loop and its contents will run around the same number of times as the length of the input (n). In addition, all of the content under the nested for loop will always run because it is under a conditional that will always return true in the worst case scenario, making the second loop multiply the time complexity by n* O(n) since for each pass, the loop that checks for swaps runs n times. 
