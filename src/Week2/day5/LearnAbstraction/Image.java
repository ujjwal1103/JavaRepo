package Week2.day5.LearnAbstraction;

public class Image extends Files{

    @Override
    void openFile() {
        System.out.println("text file opened");
    }

    @Override
    void readFile() {
        System.out.println("Reading Text Data");
    }

    @Override
    void sendFile() {
        System.out.println("text sent");
    }
    @Override
    void produceReport() {
        System.out.println("File has been read, opened and sent");
    }
}
