/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shivasai
 */
    
public class OrdArray {

    final private long[] a;                      // ref to array
    int nElems;                                  // number of dataitems 
    int curIn;
    //----------------------------------------------------------------------

    public OrdArray(int max) {                   // constructor
        a = new long[max];                       // create array
        nElems = 0;
    }

    public int binaryInsert(long insertKey) {
        int lowerBound = 0;
        int upperBound = nElems - 1;

        while (true) {
            curIn = (upperBound + lowerBound) / 2;
            if (nElems == 0) {
                return curIn = 0;
            }
            if (lowerBound == curIn) {
                if (a[curIn] > insertKey) {
                    return curIn;
                }
            }
            if (a[curIn] < insertKey) {
                lowerBound = curIn + 1;          // its in the upper 
                if (lowerBound > upperBound) {
                    return curIn += 1;
                }
            } else if (lowerBound > upperBound) {
                return curIn;
            } else {
                upperBound = curIn - 1;          // its in the lower   
            }
        }
    }

    public void display() {                      // display array contents
        for (int j = 0; j < nElems; j++) {       // for each element,
            System.out.print(a[j] + " ");        // display it
        }
        System.out.println("");
    }

    public void insert(long value) {             // put element into array
        binaryInsert(value);
        int j = curIn;
        int k;
        for (k = nElems; k > j; k--) {           // move bigger ones one up.
            a[k] = a[k - 1];
        }
        a[j] = value;                            // insert value
        nElems++;                                // increment size.
     }



public static void main(String[] args) 
{
    // TODO code application logic here
    int maxSize = 100;                                  // array size
    OrdArray arr;                                       // reference to array

    arr = new OrdArray(maxSize);                        // create array
    arr.insert(7);                                     // insert 10 items
    arr.insert(9);
    arr.insert(5);
    arr.insert(55);
    arr.insert(0);
    arr.insert(6);
    arr.insert(11);
    arr.insert(2);
    arr.insert(66);
    arr.insert(1234);

    arr.display(); 
}
}