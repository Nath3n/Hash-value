public class Prog2301 {
    public static void main(String[] args){
        new Prog2301();
    }
    public int hash(String key, int tableSize){
        int hashVal = 0;
        for(int i = 0; i <key.length() ; i++)
            hashVal = 37 * hashVal + key.charAt(i);

        hashVal %= tableSize;
        if (hashVal < 0)
            hashVal += tableSize;
        return hashVal;

    }
    public Prog2301(){
        String[] keywords = {"abstract", "boolean","class","string", " interface","character","final"};
        for (int i = 0; i < keywords.length; i++){
            System.out.println(i + " " + keywords[i] + " " + hash(keywords[i], 46));
        }
    }
}
