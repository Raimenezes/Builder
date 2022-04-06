public class TimeBuilder {

    private Time time;

    public TimeBuilder(){
        time = new Time();
    }

    public Time build() {
        if (time.getNome().equals("")) {
            throw new IllegalArgumentException("Nome inválido");
        }
        return time;
    }

    public TimeBuilder setNome(String nome) {
        time.setNome(nome);
        return this;
    }

    public TimeBuilder setJogador(String jogador) {
        time.setJogador(jogador);
        return this;
    }

    public TimeBuilder setTreinador(String treinador) {
        time.setTreinador(treinador);
        return this;
    }

    public TimeBuilder setCor(String cor) {
        time.setCor(cor);
        return this;
    }

    public TimeBuilder setModalidade(String modalidade) {
        time.setModalidade(modalidade);
        return this;
    }

    public TimeBuilder setEstado(String estado) {
        time.setEstado(estado);
        return this;
    }
}
