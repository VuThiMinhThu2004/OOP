import org.junit.*;

public class Week4Test {
    @Test
    public void testMax2Int1(){
        System.out.println(Week4.max2Int(3,4));
    }

    @Test
    public void testMax2Int2(){
       System.out.println(Week4.max2Int(3,2));
    }

    @Test
    public void testMax2Int3(){
       System.out.println(Week4.max2Int(3,1));
    }

    @Test
    public void testMax2Int4(){
        System.out.println(Week4.max2Int(5,1));
    }

    @Test
    public void testMax2Int5(){
        System.out.println(Week4.max2Int(2,1));
    }

    @Test
    public void testMinArray1(){
        int[] arr = new int[]{ 1,2,3 }; 
       System.out.println(Week4.minArray(arr));
    }

    @Test
    public void testMinArray2(){
        int[] arr = new int[]{ 1,2,3 }; 
        System.out.println(Week4.minArray(arr));
    }

    @Test
    public void testMinArray3(){
        int[] arr = new int[]{ 5,2,3 }; 
        System.out.println(Week4.minArray(arr));
    }

    @Test
    public void testMinArray4(){
        int[] arr = new int[]{ 4,5,3 }; 
        System.out.println(Week4.minArray(arr));
    }

    @Test
    public void testMinArray5(){
        int[] arr = new int[]{ 3,2,3 }; 
        System.out.println(Week4.minArray(arr));
    }

    @Test
    public void testCalculateBMI1(){
        System.out.println(Week4.calculateBMI(46, 1.52));
    }

    @Test
    public void testCalculateBMI2(){
        System.out.println(Week4.calculateBMI(50, 1.75));
    }

    @Test
    public void testCalculateBMI3(){
        System.out.println(Week4.calculateBMI(50, 1.70));
    }

    @Test
    public void testCalculateBMI4(){
        System.out.println(Week4.calculateBMI(70, 1.62));
    }

    @Test
    public void testCalculateBMI5(){
        System.out.println(Week4.calculateBMI(60, 1.7));
    }
} 