public class HashCode {
    /**
     * @param key:       A string you should hash
     * @param HASH_SIZE: An integer
     * @return: An integer
     */

    /**存在溢出

    public int hashCode(char[] key, int HASH_SIZE) {
        // write your code here
        int add = 0;
        int result;
        int len = key.length;
        for (int i = 0; i < len; i++) {
            add = add + key[i] * (int) Math.pow(33, len - 1 - i);
        }
        result = add % HASH_SIZE;
        return result;

    }
    */
    
    public int hashCode(char[] key, int HASH_SIZE) {
      // write your code here
       long sum = key[key.length-1],last = 1;
      for (int i = key.length-2; i >= 0; i--) {

          last *= 33;
          if (last>HASH_SIZE) {
              last %= HASH_SIZE;
          }
          sum = sum + key[i]*last;
          sum %= HASH_SIZE;
      }

      return (int)sum% HASH_SIZE;

  }
}