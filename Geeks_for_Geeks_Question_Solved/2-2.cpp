class Solution{
    public:
    //Function to find the height of a binary tree.
    int height(struct Node* node)
    {
        int x, y;
        if(node!=NULL)
        {
            x = height(node->left);
            y = height(node->right);
            if(x>y)
                return x+1;
            else
                return y+1;
            
        }
            return 0;
    }
};
