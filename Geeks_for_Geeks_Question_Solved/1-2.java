class Geeks
{
    // Function to insert element to stack
    public static void insert(Stack<Integer> st, int x)
    {
        // Your code here
        st.push(x);
        
    }
    
    // Function to pop element from stack
    public static void remove(Stack<Integer> st)
    {
        int x = st.pop();
        
    }
    
    // Function to return top of stack
    public static void headOf_Stack(Stack<Integer> st)
    {
        int x = st.peek();
        System.out.println(x + " ");
    }
    
    // Function to find the element in stack
    public static void find(Stack<Integer> st, int val)
    {
    
        Integer result = (Integer) st.search(val);
        if(result!=-1){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
    }
}
