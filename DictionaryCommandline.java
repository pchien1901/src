public class DictionaryCommandline extends DictionaryManagement {
    public static void showAllWords(){
        System.out.printf ("%-10s|%-30s|%s\n", "No", "English", "vietnamese");
        for (int i = 0; i < words.size(); i++){
            System.out.printf ("%-10d|%-40s|%s\n",i+1,words.get(i).getWord_target(), words.get(i).getWord_explain() );
        }
    }
    public static void dictionaryBasic(){
        insertFromCommandline();
        showAllWords();
    }
    public static void main(String [] args){
        dictionaryBasic();
    }
}
