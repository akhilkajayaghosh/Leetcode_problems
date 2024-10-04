class Solution {
    public long dividePlayers(int[] skill) {
        int n=skill.length;
        int sum=0;
        for(int i=0;i<n;i++)
            sum+=skill[i];
        int req_sum=sum/(n/2);
        if(req_sum%2!=0 && n%2!=0) return -1;
        long chem=0;
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            mp.put(skill[i],mp.getOrDefault(skill[i],0)+1);
        }
        for(int i=0;i<n;i++)
        {
            int val1=skill[i];
            int target=req_sum-val1;
            if(mp.containsKey(target))
            {
                if((mp.get(val1)>=1) && (mp.get(target)>=1)){
                chem+=(val1*target);
                mp.put(val1,mp.get(val1)-1);
                mp.put(target,mp.get(target)-1);
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            if(mp.get(skill[i])!=0)
                return -1;
        }
        return chem;
    }
}