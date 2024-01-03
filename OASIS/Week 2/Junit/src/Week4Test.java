import org.junit.*;

public class Week4Test {
    @Test
    public void testMax2Int1(){
        Assert.assertEquals(4,Week4.max2Int(3,4));
    }

    @Test
    public void testMax2Int2(){
       Assert.assertEquals(3,Week4.max2Int(3,2));
    }

    @Test
    public void testMax2Int3(){
       Assert.assertEquals(3,Week4.max2Int(3,1));
    }

    @Test
    public void testMax2Int4(){
        Assert.assertEquals(5,Week4.max2Int(5,1));
    }

    @Test
    public void testMax2Int5(){
        Assert.assertEquals(2,Week4.max2Int(2,1));
    }

    @Test
    public void testMinArray1(){
        int[] arr = new int[]{ 1,2,3 }; 
        Assert.assertEquals(1, Week4.minArray(arr));
    }

    @Test
    public void testMinArray2(){
        int[] arr = new int[]{ 1,2,3 }; 
        Assert.assertEquals(1, Week4.minArray(arr));
    }

    @Test
    public void testMinArray3(){
        int[] arr = new int[]{ 5,2,3 }; 
        Assert.assertEquals(2, Week4.minArray(arr));
    }

    @Test
    public void testMinArray4(){
        int[] arr = new int[]{ 4,5,3 }; 
        Assert.assertEquals(3, Week4.minArray(arr));
    }

    @Test
    public void testMinArray5(){
        int[] arr = new int[]{ 3,2,3 }; 
        Assert.assertEquals(2, Week4.minArray(arr));
    }

    @Test
    public void testCalculateBMI1(){
        Assert.assertEquals("Bình thường", Week4.calculateBMI(46, 1.52));
    }

    @Test
    public void testCalculateBMI2(){
        Assert.assertEquals("Thiếu cân", Week4.calculateBMI(50, 1.75));
    }

    @Test
    public void testCalculateBMI3(){
        Assert.assertEquals("Thiếu cân", Week4.calculateBMI(50, 1.70));
    }

    @Test
    public void testCalculateBMI4(){
        Assert.assertEquals("Béo phì", Week4.calculateBMI(70, 1.62));
    }

    @Test
    public void testCalculateBMI5(){
        Assert.assertEquals("Bình thường", Week4.calculateBMI(60, 1.7));
    }

    @Test
    public void testCalculateBMI() {
        
    }

    @Test
    public void testMax2Int() {
        
    }

    @Test
    public void testMinArray() {
        
    }
} 