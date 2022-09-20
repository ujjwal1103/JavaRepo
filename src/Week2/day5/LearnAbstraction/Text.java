package Week2.day5.LearnAbstraction;

public class Text extends Files {

    @Override
    void openFile() {
        System.out.println("Image file opened");
    }

    @Override
    void readFile() {
        System.out.println("Reading Image Data");
    }

    @Override
    void sendFile() {
        System.out.println("Image sent");
    }

    @Override
    void produceReport() {
        System.out.println("File has been read, opened and sent");
    }
}
