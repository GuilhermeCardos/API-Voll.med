package med.voll.api.paciente;

import med.voll.api.endereco.DadosEndereco;

public record DadosCadastroPacientes(String nome, String cpf, String email, String telefone, DadosEndereco endereco) {
}
