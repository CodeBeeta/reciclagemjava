package classe;

public class Usuario {

	String nome;
	String email;

	@Override
	public boolean equals(Object objeto) {

		if (objeto instanceof Usuario) {
			Usuario outro = (Usuario) objeto;
			boolean nomeIgual = outro.nome == this.nome;
			boolean emailIgual = outro.email == this.email;
			return nomeIgual && emailIgual;
		} else {
			return false;
		}

	}
	
	@Override
	public int hashCode() {
		return this.nome.length();
	}
}
