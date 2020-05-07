public class Main {

    public static void main(String[] args) {

        Apresentador Joaquim = new Apresentador("Joaquim", 23, "joaquim@email.com",
                "TVI");

        Apresentador Afonso = new Apresentador("Afonso", 32, "afonso@gmail.com",
                "TVI");

        TV tvi = new TV("TVI", 1998, "tvi@gmai.com",
                "tvi");

        tvi.addApresentador(Joaquim);
        tvi.addApresentador(Afonso);

        tvi.printApresentador();

    }

}
