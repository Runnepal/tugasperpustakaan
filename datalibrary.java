package TugasPerpus;

public class datalibrary {
        public String[][] teknologi = {
                        {"The Power of Habit: Why We Do What We Do What We Do What We Do in Life and Business", "Charles Duhigg", "400"},
                        {"Thinking, Fast and Slow", "Daniel Kahneman", "512"},
                        {"he Code Book: The Science of Secrecy from Ancient Egypt to Quantum Cryptography", "Simon Singh", "432"},
                        {"Sapiens: A Brief History of Humankind", "Yuval Noah Harari", "464"},
                        {"Elon Musk: Tesla, SpaceX, and the Quest for a Fantastic Future", "Ashlee Vance", "400"}
                };
                
                public String[][] filsafat = {
                        {"The Big Questions: A Short Introduction to Philosophy", "Robert C. Solomon, Kathleen M. Higgins", "336"},
                        {"Sophie's Philosophical Journey", "Jostein Thinker", "518"},
                        {"Republic", "Plato", "576"},
                        {"Beyond Thoughts and Morality", "Friedrich Thinker", "280"},
                        {"Exploring Pure Reason", "Immanuel Philosopher", "500"}
                };
                
                public String[][] sejarah = {
                        {"People's Story of the World", "Howard Historian", "700"},
                        {"Origins of Societies", "Jared Historian", "550"},
                        {"Human Odyssey", "Yuval Historian", "400"},
                        {"The Chronicles of World Events", "William Historian", "1000"},
                        {"Journeys on the Silk Roads", "Peter Historian", "800"}
                };
                
                public String[][] agama = {
                        {"The Prophet's Journey", "Ibn Religious", "300"},
                        {"In Search of Spiritual Footsteps", "Tariq Spiritual", "250"},
                        {"Mecca: A Spiritual Road", "Muhammad Spiritual", "400"},
                        {"Islamic History in Brief", "Karen Religious", "200"},
                        {"Muhammad: A Life in Sources", "Martin Spiritual", "380"}
                };
                
                
                public String[][] politik = {
                        {"The Wealth of Nations", "Adam Smith", "476"},
                        {"Political Dynamics: Indonesia-Malaysia", "Amitav Politician", "250"},
                        {"The Prince of Darkness", "Robert H. Bork", "336"},
                        {"Islam and Politics in Indonesia", "Zachary Political", "280"},
                        {"The Origin of Political Order", "Francis Fukuyama", "554"}
                };
                
                public String[][] fiksi = {
                        {"The Lord of the Rings", "J.R.R. Tolkien", "1178"},
                        {"The Hobbit", "J.R.R. Tolkien", "291"},
                        {"The Great Gatsby", "F. Scott Fitzgerald", "180"},
                        {"Bumi Manusia", "Pramoedya Ananta Toer", "592"},
                        {"Tentang Kamu", "Tere Liye", "256"}
                };
                public String[][] psikologi = {
                        {"The Power of Now", "Eckhart Tolle", "224"},
                        {"The Psychology of Money", "Morgan Housel", "192"},
                        {"Mindset: The New Psychology of Success", "Carol S. Dweck", "380"},
                        {"The Power of Habit", "Charles Duhigg", "464"},
                        {"The Body Keeps the Score: Brain, Mind, and Body in the Healing of Trauma", "Bessel van der Kolk", "320"}
                };
                
                
        public String getInformasiBuku(int kodeBuku) {
                String informasi = "";
                
                switch (kodeBuku) {
                case 1:
                        informasi = "\nKategori: Teknologi\n";
                        informasi += "========================\n";
                        for (String[] buku : teknologi) {
                        informasi += "Judul: " + buku[0] + "\n";
                        informasi += "Pengarang: " + buku[1] + "\n";
                        informasi += "Jumlah Halaman: " + buku[2] + "\n\n";
                        }
                        break;
                case 2:
                        informasi = "Kategori: Filsafat\n";
                        informasi += "========================\n";
                        for (String[] buku : filsafat) {
                        informasi += "Judul: " + buku[0] + "\n";
                        informasi += "Pengarang: " + buku[1] + "\n";
                        informasi += "Jumlah Halaman: " + buku[2] + "\n\n";
                        }
                        break;
                case 3:
                        informasi = "Kategori: Sejarah\n";
                        informasi += "========================\n";
                        for (String[] buku : sejarah) {
                        informasi += "Judul: " + buku[0] + "\n";
                        informasi += "Pengarang: " + buku[1] + "\n";
                        informasi += "Jumlah Halaman: " + buku[2] + "\n\n";
                        }
                        break;
                case 4:
                        informasi = "Kategori: Agama\n";
                        informasi += "========================\n";
                        for (String[] buku : agama) {
                        informasi += "Judul: " + buku[0] + "\n";
                        informasi += "Pengarang: " + buku[1] + "\n";
                        informasi += "Jumlah Halaman: " + buku[2] + "\n\n";
                        }
                        break;
                
                case 5:
                        informasi = "Kategori: Politik\n";
                        informasi += "========================\n";
                        for (String[] buku : politik) {
                        informasi += "Judul: " + buku[0] + "\n";
                        informasi += "Pengarang: " + buku[1] + "\n";
                        informasi += "Jumlah Halaman: " + buku[2] + "\n\n";
                        }
                        break;
                
                case 6:
                        informasi = "Kategori: Fiksi\n";
                        informasi += "========================\n";
                        for (String[] buku : fiksi) {
                        informasi += "Judul: " + buku[0] + "\n";
                        informasi += "Pengarang: " + buku[1] + "\n";
                        informasi += "Jumlah Halaman: " + buku[2] + "\n\n";
                        }
                        break;
                case 7:
                        informasi = "Kategori: psikologi\n";
                        informasi += "========================\n";
                        for (String[] buku : psikologi) {
                        informasi += "Judul: " + buku[0] + "\n";
                        informasi += "Pengarang: " + buku[1] + "\n";
                        informasi += "Jumlah Halaman: " + buku[2] + "\n\n";
                        }
                        break;
                        case 8:
                        System.out.println("Terima kasih telah menggunakan layanan Perpustakaan kami.");
                        break;
                default:
                        informasi = "Invalid.";
                        break;
                }
                
                return informasi;
        }
}
