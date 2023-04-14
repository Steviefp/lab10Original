package lab10Original;

import org.junit.jupiter.api.Test;

public class testSelectionSort {
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}

    @Test
    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        
        /** add tests to check for this unit test **/
        for(int i = 0; i < Sortedarr.length; i++) {
        	assert(Sortedarr[i]>0);
        }
    }
    @Test
    public void testNegative(){
    	int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -10;
        arr[4] = -2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -2;
        Sortedarr[1] = -7;
        Sortedarr[2] = -8;
        Sortedarr[3] = -9;
        Sortedarr[4] = -10;
        
        /** add tests to check for this unit test **/
        for(int i = 0; i < Sortedarr.length; i++) {
        	assert(Sortedarr[i]<0);
        }
    }
    
    public void testMixed(){
        
        /** Test data contains with both positive, negative and zeros **/
    }
    
    public void testDuplicates(){
        
        /** Test data contains duplicates **/
    }


}


