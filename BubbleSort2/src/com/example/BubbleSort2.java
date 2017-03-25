package com.example;

/**
 * Created by chike on 23/03/2017.
 */
public class BubbleSort2 { //by naming this class BubbleSort2, we MUST give our Constructor class the same name
    static int[] sortedArray = {}; //this is the sorted array variable, it holds the sorted array after it has been passed
    //manipulated by our constructor

    public BubbleSort2(int[] unsortedArray){ //this is our Constructor class, it must be public in order to be accessed by our
        //test I believe

        //beyond here is the code which actually sorts the data
        int i, j, temp; // i is our Pass counter, j is our counter in the actual array, temp is a variable which stores
        //the value of the item which is getting swapped, until the previous (smaller) index has assumed the value of the
        //index+1, assuming that the index+1 is greater than the index counter itself.

        boolean done = true; //this checks whether the list has been sorted, it is immediately unchecked when the while loop is called
        //if the 'if' statement doesn't run, the done variable can't be set to true again, therefore it is set to false and breaks

        while(done){ //while true, but if it's false, it breaks
            done = false; //done is immediately set to false, if this stays as false then it'll break execution
            for(i = 0; i < unsortedArray.length - 1; i++){ //for each pass, which is less than the length - 1, as Java is zero-indexed
                for(j = 1; j < (unsortedArray.length - i); j++){ //for each element in the list, MINUS the pass number
                    //this is because after each pass the biggest number is funneled to the back and therefore, we no longer
                    //need to worry about this
                    if(unsortedArray[j-1] > unsortedArray[j]){ //if the previous element is greater than the current element...
                        //this is why it was essential to set j = 1, as on the first loop, j-1 = 0, if j was equal to 0, then
                        //0-1 = -1, which is outside of the range of the loop
                        temp = unsortedArray[j-1]; //if something is out of order, set the temp equal to the out-of-place value
                        //which will hold the value until the lower index has assumed the value of the higher index
                        unsortedArray[j-1] = unsortedArray[j]; //the lower index assumes the value of the greater index,
                        //therefore the lower number goes first
                        unsortedArray[j] = temp; //the further down index assumes the biggest of the bigger number which was originally
                        //in the lower down index, so the bigger number gets pushed down
                        done = true; //if the block of code is run, then set done equal to true, meaning that the while loop will
                        //iterate again
                    }
                }
            }
        }

        sortedArray = unsortedArray; //the variable which'll store out sorted array after it was changed from unsorted to sorted
    }



    public static int[] getSortedArray(){ //this is a getter function, it MUST have get followed by the name of our
        //Constructor function, it takes the value of the program and runs it.
        return sortedArray; //it then returns the value of the sorted array
    }
}

