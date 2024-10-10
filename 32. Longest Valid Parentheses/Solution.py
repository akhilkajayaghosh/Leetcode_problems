class Solution:
    def longestValidParentheses(self, s: str) -> int:
        res=[0]*len(s)
        st=[]
        for i,v in enumerate(s):
            if v=='(':
                st.append(i)
            else:
                if st :
                    res[i]=1
                    k=st.pop()
                    res[k]=1
        a=0
        c=0
        for i in res:
            if i==1:
                a+=1
            else:
                c=max(c,a)
                a=0
        c=max(c,a)
        return c
