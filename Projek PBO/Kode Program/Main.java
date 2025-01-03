package VannStore;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Category> categories = initializeCategories(); // Inisialisasi produk dan kategori
        List<User> users = new ArrayList<>(); // Daftar pengguna
        Admin admin = new Admin(1, "Admin Vann", "Super Admin"); // Admin default

        boolean isRunning = true; // Status program
        while (isRunning) {
            // Menu Utama
            System.out.println("\nSelamat Datang di VANN-STORE!");
            System.out.println("Masuk sebagai:");
            System.out.println("1. Pengguna Biasa");
            System.out.println("2. Admin");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");

            int mainChoice = scanner.nextInt();
            scanner.nextLine(); // Membaca newline

            switch (mainChoice) {
                case 1: // Pengguna Biasa
                    userMenu(scanner, categories);
                    break;

                case 2: // Admin
                    adminMenu(scanner, admin, categories);
                    break;

                case 0: // Keluar
                    System.out.println("Terima kasih telah menggunakan VANN-STORE!");
                    isRunning = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }

        scanner.close();
    }

    // Menu untuk pengguna biasa
    private static void userMenu(Scanner scanner, List<Category> categories) {
        System.out.println("\nSelamat datang, Pengguna!");
        System.out.println("Pilih kategori untuk melihat produk:");

        // Menampilkan kategori
        for (int i = 0; i < categories.size(); i++) {
            System.out.println((i + 1) + ". " + categories.get(i).getName());
        }
        System.out.println("0. Kembali ke menu utama");

        System.out.print("Masukkan pilihan kategori: ");
        int categoryChoice = scanner.nextInt();
        if (categoryChoice == 0) return; // Kembali ke menu utama

        if (categoryChoice < 1 || categoryChoice > categories.size()) {
            System.out.println("Pilihan tidak valid.");
            return;
        }

        // Menampilkan produk dalam kategori yang dipilih
        Category selectedCategory = categories.get(categoryChoice - 1);
        System.out.println("\nProduk dalam kategori " + selectedCategory.getName() + ":");
        for (Product product : selectedCategory.getProducts()) {
            System.out.println("- " + product.getName() + " (Harga: Rp" + product.getPrice() + ")");
        }
    }

    // Menu untuk admin
    private static void adminMenu(Scanner scanner, Admin admin, List<Category> categories) {
        System.out.println("\nSelamat datang, " + admin.getName() + "!");
        System.out.println("Peran Anda: " + admin.getRole());
        System.out.println("Apa yang ingin Anda lakukan?");
        System.out.println("1. Lihat Semua Produk");
        System.out.println("2. Tambah Produk Baru");
        System.out.println("0. Kembali ke menu utama");
        System.out.print("Pilihan: ");

        int adminChoice = scanner.nextInt();
        scanner.nextLine(); // Membaca newline

        switch (adminChoice) {
            case 1: // Lihat Semua Produk
                System.out.println("\nDaftar Semua Produk:");
                for (Category category : categories) {
                    System.out.println("Kategori: " + category.getName());
                    for (Product product : category.getProducts()) {
                        System.out.println("- " + product.getName() + " (Harga: Rp" + product.getPrice() + ")");
                    }
                }
                break;

            case 2: // Tambah Produk Baru
                System.out.print("\nMasukkan nama kategori: ");
                String categoryName = scanner.nextLine();
                Category category = findCategory(categories, categoryName);
                if (category == null) {
                    System.out.println("Kategori tidak ditemukan.");
                    break;
                }

                System.out.print("Masukkan nama produk: ");
                String productName = scanner.nextLine();
                System.out.print("Masukkan harga produk: ");
                double price = scanner.nextDouble();
                scanner.nextLine(); // Membaca newline
                System.out.print("Masukkan deskripsi produk: ");
                String description = scanner.nextLine();
                System.out.print("Masukkan stok produk: ");
                int stock = scanner.nextInt();

                Product newProduct = new Product(
                    category.getProducts().size() + 1, productName, price, description, stock, category
                );
                category.addProduct(newProduct);
                System.out.println("Produk baru berhasil ditambahkan!");
                break;

            case 0: // Kembali ke menu utama
                return;

            default:
                System.out.println("Pilihan tidak valid.");
        }
    }

    // Metode untuk inisialisasi kategori dan produk
    private static List<Category> initializeCategories() {
        List<Category> categories = new ArrayList<>();
        Category necklaces = new Category("Kalung");
        necklaces.addProduct(new Product(1, "Kalung Emas", 500000.0, "Panjang: 45 cm", 5, necklaces));
        necklaces.addProduct(new Product(2, "Kalung Perak", 250000.0, "Panjang: 50 cm", 10, necklaces));

        Category bracelets = new Category("Gelang");
        bracelets.addProduct(new Product(3, "Gelang Emas", 300000.0, "Panjang: 20 cm", 7, bracelets));
        bracelets.addProduct(new Product(4, "Gelang Perak", 150000.0, "Panjang: 18 cm", 12, bracelets));

        categories.add(necklaces);
        categories.add(bracelets);
        return categories;
    }

    // Metode untuk mencari kategori
    private static Category findCategory(List<Category> categories, String name) {
        for (Category category : categories) {
            if (category.getName().equalsIgnoreCase(name)) {
                return category;
            }
        }
        return null;
    }
}
