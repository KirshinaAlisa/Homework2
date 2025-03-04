public class ParkAttraction {
    public static void main(String[] args) {
        Park park = new Park();

        Park.Attraction rollerCoaster = park.new Attraction("Американские горки", "09:00 - 22:00", 600);
        Park.Attraction ferrisWheel = park.new Attraction("Колесо обозрения", "09:00 - 19:00", 300);
        Park.Attraction laughterRoom = park.new Attraction("Комната смеха", "12:00 - 23:00", 500);

        rollerCoaster.displayInfo();
        ferrisWheel.displayInfo();
        laughterRoom.displayInfo();
    }
}
