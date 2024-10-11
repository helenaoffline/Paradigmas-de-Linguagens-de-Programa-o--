class Contrato implements Imprimivel {
    private String partes;
    private String termos;

    public Contrato(String partes, String termos) {
        this.partes = partes;
        this.termos = termos;
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo Contrato entre " + partes + " com os termos: " + termos);
    }
}