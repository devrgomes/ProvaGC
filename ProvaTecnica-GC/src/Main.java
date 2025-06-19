import Questao01.SistemaDeAgenda;
import Questao02.PlataformaDeEstudos;
import Questao03.CadastroComSobrecarga;
import Questao04.ControleDeFluxoEOperadores;
import Questao05.Notificacoes;
import Questao06.Horarios;
import Questao07.ConstrucaoDeClassesEMetodos;
import Questao08.ConstrutoresEInstancias;
import Questao11.ManipulacaoDeDatas;
import Questao12.CalculoDeDiasUteis;
import Questao13.VerificacaoDeHorario;
import Questao14.OrdenacaoDeTarefas;
import Questao15.FiltroComFor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int opc = 1;

        System.out.println("""
                
                Olá, me chamo Rian Gomes e aqui está a minha prova Tecnica do Geração Caldeira.
                
                Fiz um modelo de seleção de escolhas referente as questões, onde ao selecionar uma alternativa
                retorna a resposta da questão.
                """);

        while (opc != 0) {

            System.out.println("""
                    
                    |===========================================================================================|
                    |                              Prova Tecnica Geração Cladeira                               |
                    |===========================================================================================|
                    |                                                                                           |
                    |                                   Selecione a Questão                                     |
                    |                                                                                           |
                    |  Questão  |               Descrição                                                       |
                    |                                                                                           |
                    |    01     | Sistema de Agendamento. Qual será a saída?                                    |
                    |    02     | Plataforma de estudos. Qual será a saída?                                     |
                    |    03     | Cadastro com Sobrecarga. Qual será a saída?                                   |
                    |    04     | Controle de fluxo e operadores. O que será impresso?                          |
                    |    05     | Qual será o valor final de notificacoes?                                      |
                    |    06     | Qual será a saída?                                                            |
                    |    07     | Construção de classes e métodos. Qual será a saída?                           |
                    |    08     | Construtores e instâncias.                                                    |
                    |             Qual das opções instancia corretamente um objeto da classe Usuario?           |
                    |    09     | Git no fluxo de trabalho.                                                     |
                    |             Durante o desenvolvimento de um projeto Java, um estagiário cometeu um erro   |
                    |             no commit mais recente e deseja desfazê-lo, mas manter as alterações feitas   |
                    |             nos arquivos para corrigir e comitar novamente. Qual comando deve ser usado?  |
                    |    10     | Controle de Versão.                                                           |
                    |             Você deseja descartar completamente as alterações feitas no arquivo           |
                    |             Calculadora.java, restaurando a última versão salva no repositório,           |
                    |             sem afetar outros arquivos do projeto. Qual comando deve usar?                |
                    |    11     | Manipulação de datas com java.time. Qual será a data impressa?                |
                    |    12     | Cálculo de dias úteis com LocalDate. Qual será a data impressa?               |
                    |    13     | Verificação de horário com LocalTime. O que será impresso?                    |
                    |    14     | Ordenação de tarefas com Comparable. Qual será a saída após a ordenação?      |
                    |    15     | Uso de for com filtro. Qual será a saída?                                     |
                    |-----------|------------------------------------------------------------------------------ |
                    |    00     | Sair                                                                          |
                    |===========================================================================================|
                    """);

            System.out.print("Digite a questão a qual deseja verificar a resposta: ");
            opc = scan.nextInt();

            switch (opc) {

                case 1:
                    SistemaDeAgenda agenda = new SistemaDeAgenda();
                    System.out.print("\nA resposta desta questão é: ");
                    agenda.Agendamento();
                    break;

                case 2:
                    PlataformaDeEstudos avaliacao = new PlataformaDeEstudos();
                    System.out.print("\nA resposta desta questão é: ");
                    avaliacao.Avaliacao();
                    break;

                case 3:
                    CadastroComSobrecarga sobrecarga = new CadastroComSobrecarga("Resposta");
                    System.out.print("\nA resposta desta questão é: ");
                    sobrecarga.exibeResposta();
                    break;

                case 4:
                    ControleDeFluxoEOperadores controle = new ControleDeFluxoEOperadores();
                    System.out.print("\nA resposta desta questão é: ");
                    controle.ControleDeFluxoEOperadores();
                    break;

                case 5:
                    Notificacoes notificacoes = new Notificacoes();
                    System.out.print("\nA resposta desta questão é: ");
                    notificacoes.Notificacoes();
                    break;

                case 6:
                    Horarios horarios = new Horarios();
                    System.out.print("\nA resposta desta questão é: ");
                    horarios.Horarios();
                    break;

                case 7:
                    ConstrucaoDeClassesEMetodos livro = new ConstrucaoDeClassesEMetodos();
                    System.out.print("\nA resposta desta questão é: ");
                    livro.testaLivro();
                    break;

                case 8:
                    ConstrutoresEInstancias construtores = new ConstrutoresEInstancias("João", 25);
                    System.out.println("\nA resposta desta questão é - " + construtores);
                    break;

                case 9:
                    System.out.println("""
                            A resposta desta questão é: git reset --mixed HEAD~1
                            Explicação: Este comando desfaz o commit mais recente, mas mantém as alterações feitas
                            nos arquivos para que possam ser corrigidas e comitadas novamente.
                            """);

                case 10:
                    System.out.println("""
                            A resposta desta questão é: git checkout Calculadora.java
                            Explicação: esse comando restaura o arquivo Calculadora.java
                            para a última versão do repositório, sem afetar os outros arquivos do projeto.
                            """);

                case 11:
                    ManipulacaoDeDatas manipulando = new ManipulacaoDeDatas();
                    System.out.print("\nA resposta desta questão é: ");
                    manipulando.JavaTime();
                    break;

                case 12:
                    CalculoDeDiasUteis diasUteis = new CalculoDeDiasUteis();
                    System.out.print("\nA resposta desta questão é: ");
                    diasUteis.LocalDate();
                    break;

                case 13:
                    VerificacaoDeHorario verifica = new VerificacaoDeHorario();
                    System.out.print("\nA resposta desta questão é: ");
                    verifica.LocalTime();
                    break;

                case 14:
                    System.out.print("\nA resposta desta questão é: ");
                    OrdenacaoDeTarefas.Comportable();
                    break;

                case 15:
                    FiltroComFor tarefa = new FiltroComFor();
                    System.out.print("\nA resposta desta questão é - ");
                    tarefa.Tarefas();
                    break;

                default:
                    if (opc == 0) {
                        // Finaliza o sistema
                        System.out.println("Saindo do sistema...");
                        // Trata opção inesistente
                    } else {
                        System.out.println("Opção inválida!");
                    }
                    break;
            }
        }
        System.out.println("""
                \nMuito obrigado pela oportunidade de poder demonstrar um pouco dos meus conhecimento.
                
                Até uma próxima!
                
                Linkedin: https://www.linkedin.com/in/devrgomes/
                GitHub: https://github.com/devrgomes
                Email: devrgomes@gmail.com
                """);
    }
}