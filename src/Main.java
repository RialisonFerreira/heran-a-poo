class Peixe extends Animal {
    String caracteristica;

    public Peixe(String nome, int idade, String caracteristica) {
        super(nome, idade);

        this.caracteristica = caracteristica;
    }

    public String getCaracteristica() {

        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {

        this.caracteristica = caracteristica;
    }

    public void comer() {
        System.out.println("Ação: " + getNome() + " está comendo.");
    }
    public void emitirSom() {
        System.out.println(getNome() + " não emite som, apenas faz bolhas.");
    }

    public String toString() {
        return "Nome: " + getNome() + "\nIdade: " + getIdade() + "\nCaracterística: " + caracteristica;
    }

    public static void main(String[] args) {
        Peixe peixe = new Peixe("peixe boi", 4 , "acinzentado");
        System.out.println(peixe.toString());
        peixe.comer();
        peixe.emitirSom();
    }
}