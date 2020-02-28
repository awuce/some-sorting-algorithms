/*
  Bubble Sorting Algorithm on C
*/

#include <stdio.h>
#include <stdlib.h>
#include <malloc.h>

void bubble_sort(int *array, int len);
void swap(int *a, int *b);
void print_array(char *message, int *array, int len);

int main(int argc, char *argv) {
    printf("Bubble Sorting Algorithm\n\n");
    FILE *f = fopen("array.txt", "r+");
    int len = 0, *array = NULL;
    for (len = 0; !feof(f); len++) {
        array = (int *)realloc(array, sizeof(int)*(len + 1));
        fscanf(f, "%d\n", &array[len]);
    }
    print_array("Before:", array, len);
    bubble_sort(array, len);
    print_array("After: ", array, len);
    free(array);
    return 0;
}

void bubble_sort(int *array, int len) {
    for (int i = 0; i < len; i++)
      for (int j = 0; j < len-i-1; j++)
        if (array[j] > array[j+1])
          swap(&array[j], &array[j+1]);
}

void swap(int *a, int *b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}

void print_array(char *message, int *array, int len) {
    printf("%s", message);
    for (int i = 0; i < len; i++)
        printf(" %d", array[i]);
    printf("\n");
}
