package design.facade;

public class Main {

    public static void main(String[] args) {
        //窓口の中村くんを作る
        Librarian nakamura = new Librarian();
        //中村くんに昆虫図鑑の場所を聞く
        String location = nakamura.searchBook("昆虫図鑑");
        if(location.equals("貸出中です")){
            System.out.println("貸出中かよ…");
        }else if(location.equals("その本は所蔵していません")){
            System.out.println("なんだ、ないのか");
        }else{
            System.out.println("サンキュ！");
        }
    }
}
