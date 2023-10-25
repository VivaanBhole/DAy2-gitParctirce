class Main
{
    public static void main(String[] args) {
        int[][] a = squareArrayN(5);
        print2DArr(a);
        int n = analyze2DArray(a);
        System.out.println("First Even With Required Sum: "+ (n != -1 ? n : " Not Present"));
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
            int n = firstEvenWithSum(row);
            if (n != -1)
                return n;
        }

        return -1;
    }

    static int firstEvenWithSum(int[] arr)
    {
        for (int i = 1; i < arr.length-1; i++)
        {
            if (arr[i] % 2 == 0 && arr[i-1] + arr[i+1] > 17)
                return arr[i];
        }
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