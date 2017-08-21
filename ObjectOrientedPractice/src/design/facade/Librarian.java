package design.facade;

/**
 * @author kumetoshiyuki
 * Visitorは図書委員に尋ねる(Facadeクラス)
 * 窓口的な役割を担う
 */
public class Librarian {
    public String searchBook(String bookName) {
        //本を探す
        BookList bookList = new BookList();
        String location = bookList.searchBook(bookName);
        //本の場所がnullではない(所蔵してる)とき
        if (location != null) {
            //貸出中かチェックする
            LendingList lendingList = new LendingList();
            if (lendingList.check(bookName)) {
                //貸出中のとき
                return "貸出中です";
            } else {
                //貸出中ではないとき
                return location;
            }
        //所蔵してないとき
        } else {
            return "その本は所蔵していません";
        }
    }
}
