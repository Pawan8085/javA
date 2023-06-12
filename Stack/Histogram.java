public class Histogram {
    //Leetcode : 84. Largest Rectangle in Histogram

    public int largestRectangleArea(int[] arr) {
        int n=arr.length;
        int left[] = new int[n];
        Stack<Integer> stk = new Stack<>();

        for(int j=0;j<n;++j){
	        while(!stk.isEmpty()&&arr[stk.peek()]>=arr[j]){
	            stk.pop();
	        }
	        if(stk.isEmpty()){
	            left[j]=-1;
	        }
	        else{
	            left[j]=stk.peek();
	        }
	        stk.push(j);
	    }

         int right[] = new int[n];
        Stack<Integer> _stk = new Stack<>();
	    for(int k=n-1;k>=0;--k){
	        while(!_stk.isEmpty()&&arr[_stk.peek()]>=arr[k]){
	            _stk.pop();
	        }
	        if(_stk.isEmpty()){
	            right[k]=n;
	        }
	        else{
	            right[k]=_stk.peek();
	        }
	        _stk.push(k);
	    }

        int maxArea = 0;
        for(int i=0;i<n;++i){

            int area = (right[i]-left[i]-1)*arr[i];

            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
}
