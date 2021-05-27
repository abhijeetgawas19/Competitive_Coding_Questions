class Solution
{
    public:
    int count(struct node* head, int search_for)
    {
        int c = 0;
        struct node *p;
        for(p=head;p!=NULL;p=p->next)
        {
            if(p->data==search_for)
                c++;
        }
            return c;
    }
};
