package Week2.day5.LearnAbstraction;

public abstract class Files {
    void openFile(){
        System.out.println("File is opened");
    }
    void readFile(){
        System.out.println("Reading file");
    }

    abstract void produceReport();

    void sendFile(){
        System.out.println("file sent");
    }

}
