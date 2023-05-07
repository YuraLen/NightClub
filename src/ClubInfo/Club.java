package ClubInfo;

/** Клас Club використовується для того, щоб задати інформацію про клуб, а надалі її обробляти. */
public class Club {
    private String name;
    private String address;
    public int actualNumOfVisitors;
    public int maxNumOfVisitors;
    private int priceToEntry;

    public Club(String name, String address, int actualNumOfVisitors, int maxNumOfVisitors, int priceToEntry) {
        this.name = name;
        this.address = address;
        this.actualNumOfVisitors = actualNumOfVisitors;
        this.maxNumOfVisitors = maxNumOfVisitors;
        this.priceToEntry = priceToEntry;
    }

    @Override
    public String toString() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~ Про клуб ~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Назва клубу: " + name);
        System.out.println("Адреса клубу: " + address);
        System.out.printf("Кількість людей в клубі на даний момент: %d з %d\n", actualNumOfVisitors, maxNumOfVisitors);
        System.out.printf("Ціна входу в клуб - %dгрн\n", priceToEntry);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public int getPriceToEntry(){
        return priceToEntry;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getActualNumOfVisitors() {
        return actualNumOfVisitors;
    }

    public void setActualNumOfVisitors(int actualNumOfVisitors) {
        this.actualNumOfVisitors = actualNumOfVisitors;
    }

    public int getMaxNumOfVisitors() {
        return maxNumOfVisitors;
    }

    public void setMaxNumOfVisitors(int maxNumOfVisitors) {
        this.maxNumOfVisitors = maxNumOfVisitors;
    }

    public void setPriceToEntry(int priceToEntry) {
        this.priceToEntry = priceToEntry;
    }
}