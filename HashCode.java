public class HashCode {
    /**
     * @param key: A string you should hash
     * @param HASH_SIZE: An integer
     * @return: An integer
     */
    public int hashCode(char[] key, int HASH_SIZE) {
       // write your code here
       int add = 0;
       int result;
       int len = key.length;
       for (int i =0 ;i<len ;i++ ) {
        add = add + key[i] *(int)Math.pow(33, len -1 -i);
       }
        result= add % HASH_SIZE ;
        return result;
        
    }
}