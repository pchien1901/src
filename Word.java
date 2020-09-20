public class Word {
    //khai bao
    private String word_target;
    private String word_explain;

    // khoi tao
    Word (){
        this.word_target = "";
        this.word_explain ="";
    }
    Word (String new_word_target, String new_word_explain){
        this.word_target = new_word_target;
        this.word_explain = new_word_explain;
    }

    // set get gia tri


    public String getWord_target() {
        return word_target;
    }

    public void setWord_target(String word_target) {
        this.word_target = word_target;
    }

    public String getWord_explain() {
        return word_explain;
    }

    public void setWord_explain(String word_explain) {
        this.word_explain = word_explain;
    }
}
