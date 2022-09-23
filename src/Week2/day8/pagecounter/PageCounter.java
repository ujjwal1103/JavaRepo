package Week2.day8.pagecounter;

public class PageCounter
{
    public  static  int pageCounter(int numberOfPages,int pageNumber){



        int fromFront = pageNumber/2;
        int fromBack = numberOfPages - pageNumber / 2;

        if(fromBack > fromFront){
            return fromFront;
        }
        return fromBack;

    }
    public static void main(String[] args) {
        int numberOfPages = 6;
        int pageNumber = 3;
        System.out.println(pageCounter(numberOfPages, pageNumber));
    }
}
