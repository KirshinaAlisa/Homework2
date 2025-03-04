public class Product {
        private String productName;
        private String productDate;
        private String company;
        private String country;
        private double price;
        private boolean bookingStatus;

        public Product(String productName, String productDate, String company, String country, double price, boolean bookingStatus) {
            this.productName = productName;
            this.productDate = productDate;
            this.company = company;
            this.country = country;
            this.price = price;
            this.bookingStatus = bookingStatus;
        }

        public void printInfo() {
            System.out.println("Название: " + productName);
            System.out.println("Дата производства: " + productDate);
            System.out.println("Производитель: " + company);
            System.out.println("Страна происхождения: " + country);
            System.out.println("Цена: " + price + " рублей");
            System.out.println("Состояние бронирования: " + (bookingStatus ? "Забронировано" : "Свободно"));
        }
    }
