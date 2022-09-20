package Week2.day5.LearnAbstraction;

public class FileDriver {
    public static void main(String[] args) {
        Image img= new Image();
        img.openFile();
        img.readFile();
        img.sendFile();
        img.produceReport();


        Text txt = new Text();
        txt.openFile();
        txt.readFile();
        txt.sendFile();
        txt.produceReport();
    }
}
