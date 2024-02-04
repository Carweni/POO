public class InterfacesAnimaisDemo {
    public static void main(String[] args) {
        Mamifero cachorro = new Cachorro("Rex");
        Gato gato = new Gato("Albert Whiskers");
        Leão leão = new Leão("Simba");
        Lobo lobo = new Lobo("Wolf");
        Macaco macaco = new Macaco("George");
        Arara arara = new Arara("Luca");
        Pinguim pinguim = new Pinguim("Pingu");
        Avestruz avestruz = new Avestruz("Ozzie");
        Baleia baleia = new Baleia("Willy");
        Ornitorrinco ornitorrinco = new Ornitorrinco("Perry");
        Morcego morcego = new Morcego("Batman");

        System.out.println("=== Zoológico ===\n");

        cachorro.amamentar();
        cachorro.mover();
        cachorro.emitirSom();

        System.out.println();

        gato.amamentar();
        gato.mover();
        gato.emitirSom();
        
        System.out.println();

        leão.amamentar();
        leão.mover();
        leão.emitirSom();
        
        System.out.println();

        lobo.amamentar();
        lobo.mover();
        lobo.emitirSom();
        
        System.out.println();

        macaco.amamentar();
        macaco.mover();
        macaco.emitirSom();

        System.out.println();

        arara.mover();
        arara.emitirSom();

        System.out.println();

        pinguim.mover();
        pinguim.emitirSom();
        pinguim.nadar();

        System.out.println();

        avestruz.mover();
        avestruz.emitirSom();

        System.out.println();

        baleia.mover();
        baleia.amamentar();
        baleia.nadar();
        baleia.emitirSom();

        System.out.println();

        ornitorrinco.amamentar();
        ornitorrinco.nadar();
        ornitorrinco.mover();
        ornitorrinco.emitirSom();

        System.out.println();

        morcego.amamentar();
        morcego.mover();
        morcego.emitirSom();
    }
}