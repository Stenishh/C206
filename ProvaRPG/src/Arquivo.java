import java.io.*;
import java.util.ArrayList;

class Arquivo {
    // Não foi bem assim que pedi, -6 pontos
    private OutputStream os = null;
    private OutputStreamWriter osw = null;
    private BufferedWriter bw = null;
    private String nomeArquivo;

    private InputStream is = null;
    private InputStreamReader isr = null;
    private BufferedReader br = null;
    // Não pedi construtor, -5 pontos
    public Arquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public void escrever(String mensagem) {
        try {
            os = new FileOutputStream(this.nomeArquivo, true);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);

            bw.write(mensagem);
            bw.newLine();
        } catch (Exception e) {
            System.out.println("Erro ao escrever: " + e.getMessage());
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                System.out.println("Erro ao fechar o buffer: " + e.getMessage());
            }
        }
    }
    // não pedi isso, -10 pontos
    public void escreverVeiculo(Veiculo veiculo) throws ValorInvalidoException {
        if (veiculo.getAno() < 1960 || veiculo.getAno() > 2024) {
            System.out.println("Ano inválido!");
        }
        if (veiculo.getKmRodados() < 0) {
            System.out.println("Km Rodados não pode ser negativo!");
        }
        if (!veiculo.getMarca().equals("rolls-royce") && !veiculo.getMarca().equals("bentley")) {
            System.out.println("Marca inválida!");
        }
        if (veiculo.getMotor().getPotencia() <= 0 || veiculo.getMotor().getNumCilindros() <= 0) {
            System.out.println("Valores inválidos para o motor!");
        }
    }

    public ArrayList<Veiculo> ler() {
        ArrayList<Veiculo> veiculos = new ArrayList<>();

        try {
            is = new FileInputStream(this.nomeArquivo);
            isr = new InputStreamReader(is, "UTF-8");
            br = new BufferedReader(isr);

            String line;
            while ((line = br.readLine()) != null) {
                String[] veiculoInfo = line.split(" ; ");
                Veiculo veiculo = new Veiculo();
                veiculo.setMarca(veiculoInfo[0]);
                veiculo.setModelo(veiculoInfo[1]);
                veiculo.setAno(Integer.parseInt(veiculoInfo[2]));
                veiculo.setKmRodados(Double.parseDouble(veiculoInfo[3]));
                veiculos.add(veiculo);
            }
        } catch (Exception e) {
            System.out.println("Erro ao ler: " + e.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                System.out.println("Erro ao fechar o buffer: " + e.getMessage());
            }
        }

        return veiculos;
    }

    public void ordenarVeiculos(ArrayList<Veiculo> veiculos) {
        veiculos.sort((v1, v2) -> Integer.compare(v2.getAno(), v1.getAno()));
    }

    public void mostrarQuantidadePorMarca(ArrayList<Veiculo> veiculos) {
        int contarRollsRoyce = 0;
        int contarBentley = 0;

        for (Veiculo veiculo : veiculos) {
            if (veiculo.getMarca().equals("Rolls-Royce")) {
                contarRollsRoyce++;
            } else if (veiculo.getMarca().equals("Bentley")) {
                contarBentley++;
            }
        }

        System.out.println("Quantidade de Rolls-Royce: " + contarRollsRoyce);
        System.out.println("Quantidade de Bentley: " + contarBentley);
    }
}