
public class SinglyLinkedListDemo {

  public static void airportCode() {
    SinglyLinkedList<String> airports = new SinglyLinkedList<>();
    airports.addFirst("LAX");
    airports.addLast("SLC");
    airports.addLast("BOS");
    airports.addFirst("SFO");
    airports.addFirst("DEN");
    airports.addLast("BZN");
    airports.removeFirst();
    System.out.println(airports);
    airports.addAfter(2, "JFK");
    System.out.println(airports);
    System.out.println(airports.getNth(1));

  }

  public static void playlist() {
    SinglyLinkedList<Song> playlist = new SinglyLinkedList<>();
    playlist.addFirst(new Song("Here In Spirit", "Jim James"));
    playlist.addLast(new Song("Seigfried", "Frank Ocean"));
    playlist.addFirst(new Song("Runaway", "Kanye West"));
    System.out.println(playlist.first());
    System.out.println(playlist.toString());
  }

  public static void quote() {
    SinglyLinkedList<String> quote = new SinglyLinkedList<>();
    quote.addFirst("and");
    quote.addFirst("is");
    quote.addAfter(0, "never");
    quote.addAfter(1, "pure");
    quote.addLast("rarely");
    quote.addLast("simple");
    quote.addFirst("the");
    quote.addAfter(0, "truth");
    System.out.println(quote.toString());
  }

  public static void main(String[] args) {
    airportCode();
    playlist();
    quote();
  }
}