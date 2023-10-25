class Main
{
    public static void main(String[] args) {
        int[][] a = squareArrayN(5);
        print2DArr(a);
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