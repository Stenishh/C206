// Sem modificador de acesso nos atributos e gettes e setters q n pedi, -18 pontos
class Veiculo {
    String marca;
    String modelo;
    int ano;
    double kmRodados;
    Motor motor;

    public Veiculo() {
        motor = new Motor();
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public double getKmRodados() {
        return kmRodados;
    }

    public Motor getMotor() {
        return motor;
    }

    public void mostraInfos() {
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano : " + getAno());
        System.out.println("Km rodados: " + getKmRodados());
        System.out.println("Tipo do motor : " + getMotor().toString());
    }

    public void setKmRodados(double kmRodados) {
        this.kmRodados = kmRodados;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setMotor(Motor novoMotor) {
        this.motor = novoMotor;
    }
}
