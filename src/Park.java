public class Park {
    public class Attraction {
        private String name;
        private String openingHours;
        private double price;

        public Attraction(String name, String openingHours, double price) {
            this.name = name;
            this.openingHours = openingHours;
            this.price = price;
        }

        public void displayInfo() {
            System.out.println("Аттракцион: " + name);
            System.out.println("Время работы: " + openingHours);
            System.out.println("Стоимость: " + price + " руб.");
            System.out.println();
        }
    }
}