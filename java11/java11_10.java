package test.java11;

class BookInfo {
    private static int counter = 0;
    private String book_title;
    private String writer_name;
    private String publication_year;
    private int id;
    public BookInfo(String b, String w, String p) {
        book_title = b;
        writer_name = w;
        publication_year = p;
        id = ++counter;
    }
    public String getBook_Title() {
        return book_title;
    }
    private String getWriter_Name() {
        return writer_name;
    }
    private String getPublication_Year() {
        return publication_year;
    }
    public int getId() {
        return id;
    }
}

public class java11_10 {
    public static void main(String[] args) {
        // 三国志の書籍情報
        BookInfo book1 = new BookInfo("三国志", "吉川英治", "1989");
        
        // 楊令伝の書籍情報
        BookInfo book2 = new BookInfo("楊令伝","北方謙三","2011");
        
        // 竜馬がゆくの書籍情報
        BookInfo book3 = new BookInfo("竜馬がゆく","司馬遼太郎","1998");
        
        // 坊っちゃんの書籍情報
        BookInfo book4 = new BookInfo("坊っちゃん","夏目漱石","1906");
        
        // 吾輩は猫であるの書籍情報
        BookInfo book5 = new BookInfo("吾輩は猫である","夏目漱石","1905");
        
        // 三国志
        System.out.println("書　　名：" + book1.getBook_Title());
        System.out.println("著 者 名：" + book1.getWriter_Name());
        System.out.println("出 版 年：" + book1.getPublication_Year());
        System.out.println("書籍番号：" + book1.getId());

        // 楊令伝
        System.out.println("書　　名：" + book2.getBook_Title());
        System.out.println("著 者 名：" + book2.getWriter_Name());
        System.out.println("出 版 年：" + book2.getPublication_Year());
        System.out.println("書籍番号：" + book2.getId());

        // 竜馬がゆく
        System.out.println("書　　名：" + book3.getBook_Title());
        System.out.println("著 者 名：" + book3.getWriter_Name());
        System.out.println("出 版 年：" + book3.getPublication_Year());
        System.out.println("書籍番号：" + book3.getId());

        // 坊っちゃん
        System.out.println("書　　名：" + book4.getBook_Title());
        System.out.println("著 者 名：" + book4.getWriter_Name());
        System.out.println("出 版 年：" + book4.getPublication_Year());
        System.out.println("書籍番号：" + book4.getId());

        // 吾輩は猫である
        System.out.println(" 書　　名：" + book5.getBook_Title());
        System.out.println("著 者 名：" + book5.getWriter_Name());
        System.out.println("出 版 年：" + book5.getPublication_Year());
        System.out.println("書籍番号：" + book5.getId());
    }
}
// 1 
// 2 
// 3 
// 4 
//5