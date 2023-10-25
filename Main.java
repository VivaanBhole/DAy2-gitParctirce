class Main
{
    public static void main(String[] args) {
        int[][] a = squareArrayN(5);
        print2DArr(a);
        System.out.println("First Even: "+analyze2DArray(a));
    }

    static int[][] squareArrayN(int n)
    {
        if (n < 0)
            throw new IndexOutOfBoundsException(); 

        int[][] arr = new int[n][n];

        for (int[] row : arr) 
            randomlyFillArray(row);
        
        return arr;
    }

    static int analyze2DArray(int[][] arr)
    {
        for (int[] row : arr)
        {
            int n = firstEven(row);
            if (n != -1)
                return n;
        }

        return -1;
    }

    static int firstEven(int[] arr)
    {
        for (int i : arr)
                if (i % 2 == 0)
                    return i;
        return -1;
    }

    static void randomlyFillArray(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = (int)(Math.random()*10+1);
        }
    }

    static void print2DArr(int[][] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length;j++)
                System.out.print(arr[i][j]+"\t");
            System.out.println();
        }
    }
}