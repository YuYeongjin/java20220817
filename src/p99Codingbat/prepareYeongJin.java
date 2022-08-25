package p99Codingbat;

public class prepareYeongJin {
	public static void main(String[] args) {
		System.out.println(sum67 (new int[] {1,2,2}));

	}

	public static int sum67(int[] nums) {
		  int result=0;
		  int num1=0;
		  int num2=0;
		  
		  if(nums.length>1){
		    for(int i = 0; i <nums.length; i++){
		      result+=nums[i];
		      for(int j = 0; j<nums.length; j++){
		        if (nums[i]==6){
		          num1=i;
		          if(nums[j]==7){
		            num2=j;
		          }
		        }
		      }
		    }
		  }
		  if(num1>0&&num2>0){
		    for (int i = num1; i<=num2; i++){
		      result -=nums[i];
		    } 
		  }
		  return result;
		}

}
