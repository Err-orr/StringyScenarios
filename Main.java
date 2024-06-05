public class Main {
    public static void main(String[] args) {
        String file1 = "Main.java";
        String file2 = "Hello.txt";
        String file3 = "Document.exe";
        String file4 = "Game.apk";
        String sentence = "Her stuffed rabbit, which she had had since she was a little girl, was named Creamy Guava.";
        String email1 = "somebodysaididid@yahoo.com";
        String email2 = "Whatisgoingonguys@gmail.gov";
        String email3 = "Notmyemail.com";
        String username = "       xXCool GamerXx      ";
        String word1 = "         Interesting                ";
        String word2 = " word ";
        String word3 = "choice ";
        String word4 = "there.";
        String student = "Paul Ogunsemore";
        String website = "https://www.365z.org";

        System.out.println(file1.substring(file1.indexOf(".")));
        System.out.println(file2.substring(file2.indexOf(".")));
        System.out.println(file3.substring(file3.indexOf(".")));
        System.out.println(file4.substring(file4.indexOf(".")));
        System.out.println(sentence.indexOf("she"));
        System.out.println(sentence.indexOf("had"));
        System.out.println(sentence.indexOf("was"));
        System.out.println(username.trim().replace(" ", "_"));
        if (email1.contains("@") && email1.contains(".com")) {
            System.out.println("Valid email.");
        } else {
            System.out.println("Invalid email.");
        }
        if (email2.contains("@") && email2.contains(".com")) {
            System.out.println("Valid email.");
        } else {
            System.out.println("Invalid email.");
        }
        if (email3.contains("@") && email3.contains(".com")) {
            System.out.println("Valid email.");
        } else {
            System.out.println("Invalid email.");
        }
        System.out.println(word1.trim().concat(word2).concat(word3).concat(word4));
        System.out.println("Downloads/games/textures/floor");
        System.out.println(student.substring(student.lastIndexOf(" ") + 1, student.lastIndexOf(" ") + 2));
        System.out.println(website.substring(website.indexOf(".") + 1, website.lastIndexOf(".")));
        System.out.println("Documents/ubuntu/readme.txt");
        System.out.println(email1.substring(0, email1.indexOf("@")));
        System.out.println(email2.substring(0, email2.indexOf("@")));
        System.out.println("No @ Symbol!");
    }
}