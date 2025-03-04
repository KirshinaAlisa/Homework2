
public class ObjectProduct {
    public static void main(String[] args) {
        Product product = new Product("ChocoPie", "2025-03-01", "Orion", "Корея", 160, false);
        product.printInfo();
        Product[]productsArray = new Product[5];
        productsArray[0] = new Product("Основы Java","2019", "БХВ-Петербург", "Россия", 1200, true);
        productsArray[1] = new Product("Программирование на Python", "2021", "Питер", "Россия", 1500, true);
        productsArray[2] = new Product("Алгоритмы и структуры данных", "2018", "O'Reilly", "США", 2000, false);
        productsArray[3] = new Product("Введение в искусственный интеллект", "2020", "MIT Press", "США", 2500, true);
        productsArray[4] = new Product("Дизайн пользовательских интерфейсов", "2022", "Альпина Паблишер", "Россия", 1800, true);
        for (Product p : productsArray) {
            p.printInfo();
        }
    }
}
