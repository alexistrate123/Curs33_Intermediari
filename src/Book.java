public class Book {

    String name;
    String author;
    int totalPageNumber;
    int currentPageNumber;

    public Book(String name, String author, int totalPageNumber) {
        this.name = name;
        this.author = author;
        this.totalPageNumber = totalPageNumber;
        this.currentPageNumber = 1;
    }

    public void flipPageForward() {
        if(currentPageNumber >= totalPageNumber) {
            System.out.println("Ai ajuns la ultima pagina.");
        } else {
            currentPageNumber++;
        }
    }

    public void flipPageBackward() {
       if (currentPageNumber == 1) {
           System.out.println("Aceasta este prima pagina a cartii, cea anterioara este coperta.");
       } else  {
          currentPageNumber--;
       }
    }

    public void printBookState() {
        System.out.println("Cartea " + name + ", scrisa de " + author + ", are " + totalPageNumber + " de pagini, si este " +
                "deschisa la pagina " + currentPageNumber);
    }
}
