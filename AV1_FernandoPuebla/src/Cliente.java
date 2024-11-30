public class Cliente {
    String Nome;
    long cpf;

    float totalCompra = 0;

    float calculaTotalCompra(float total, float preco){
        total += preco;

        return total;
    }
}
