import java.util.Arrays;

public class mergeSort {

    public void sorter(int[] data)
    {
        mergeSort(data, 0, data.length-1);
    }

    public void mergeSort(int[] data, int first, int end)
    {
        if(first=sizeOfRight) || (i<sizeOfLeft && left[i]<=right[j]))
            {
                data[k]=left[i];
                i++;
            }

            else
            {
                data[k]=right[j];
                j++;
            }

        }

    }

    public static void main(String[] args)
    {
        int[] array = {9,0,5,1,2,8,6};

        mergeSort mc= new mergeSort();

        mc.sorter(array);
        System.out.println("The sorted array is: ");
        System.out.println(Arrays.toString(array));
    }
}
