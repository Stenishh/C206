public class Computador {
    String marca;
     float preco;
    MemoriaUSB memoriaUSB;
    SistemaOperacional  sistemaOperacional;
    HardwareBasico hardwareBasico;


    public Computador(){
        sistemaOperacional = new SistemaOperacional();
        hardwareBasico = new HardwareBasico();
        memoriaUSB = new MemoriaUSB();
    }
    void mostraPcConfigs(){


            System.out.println("Da marca: " + marca);
            System.out.println("Custando: " + preco);
            System.out.println("Com capacidade de: " + hardwareBasico.capacidade + " GB");
            System.out.println("Com sistema: " + hardwareBasico.nome);
            System.out.println("Sistema operacional de " + sistemaOperacional.tipo);
            System.out.println(memoriaUSB.nome);
            System.out.println("Usb de: " + memoriaUSB.capacidade);


    }
    void addMemomoriaUSB(float MemoriaUSB){

    }
}
