public class AnimalDemo {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal qualquer", 5);
        Mamifero mamifero = new Mamifero("Leão", 10);
        Cachorro cachorro = new Cachorro("Rex", 3);
        Poodle poodle = new Poodle("Bobby", 2);
        Ave ave = new Ave("Águia", 7);
        Arara arara = new Arara("Blue", 4);
        AraraCaninde araraCaninde = new AraraCaninde("Red", 5);
        Peixe peixe = new Peixe("Salmão", 2);
        Acara acara = new Acara("Bolha", 1);
        AcaraBandeira acaraBandeira = new AcaraBandeira("Espuma", 1);

        System.out.println("Detalhes dos animais:");
        mostrarDetalhes(animal);
        mostrarDetalhes(mamifero);
        mostrarDetalhes(cachorro);
        mostrarDetalhes(poodle);
        mostrarDetalhes(ave);
        mostrarDetalhes(arara);
        mostrarDetalhes(araraCaninde);
        mostrarDetalhes(peixe);
        mostrarDetalhes(acara);
        mostrarDetalhes(acaraBandeira);
    }

    public static void mostrarDetalhes(Animal animal) {
        System.out.println("Nome: " + animal.getNome());
        System.out.println("Idade: " + animal.getIdade());
        animal.mover();
        animal.emitirSom();
        System.out.println();
    }
}