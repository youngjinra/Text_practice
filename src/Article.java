public class Article {
    private int no;
    private String title;
    private String content;

    public Article(){}
    public Article(int no, String title, String content){
        this.no = no;
        this.title = title;
        this.content = content;
    }

    public int getNo(){
        return no;
    }

    public String getTitle(){
        return title;
    }

    public String getContent(){
        return content;
    }

    public void setNo(int no){
        this.no = no;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setContent(String content){
        this.content = content;
    }
}
