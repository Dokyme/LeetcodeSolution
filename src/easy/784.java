class Solution {
    public List<String> letterCasePermutation(String S) {
		List<String> a=new ArrayList();
		permutation(a,S.toCharArray(),0,new StringBuilder());
		return a;
	}

	public void permutation(List<String> list,char[] str,int i,StringBuilder sb){
		if(i==str.length){
			list.add(sb.toString());
			return;
		}
		if(str[i]>=48&&str[i]<=57){
			sb.append(str[i]);
			permutation(list,str,i+1,sb);
			sb.deleteCharAt(sb.length()-1);
			return;
		}
        if(str[i]<96){
            sb.append(str[i]);
		permutation(list,str,i+1,sb);
		sb.deleteCharAt(sb.length()-1);
		sb.append(""+(char)(str[i]+32));
		permutation(list,str,i+1,sb);
		sb.deleteCharAt(sb.length()-1);
        }else{
            sb.append(str[i]);
		permutation(list,str,i+1,sb);
		sb.deleteCharAt(sb.length()-1);
		sb.append(""+(char)(str[i]-32));
		permutation(list,str,i+1,sb);
		sb.deleteCharAt(sb.length()-1);
        }
	}
}