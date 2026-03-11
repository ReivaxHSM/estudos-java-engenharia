package projeto_progressao_aritmetica;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        int opcao = 0;
        
        do {
            String menu = "************************** MENU  ******************************\n\n" +
                    "O que você deseja calcular?\n\n" +
                    "1 - O enésimo termo de uma Progressão Aritmética\n" +
                    "2 - A razão de uma Progressão Aritmética\n" +
                    "3 - O valor da posição n numa Progressão Aritmética\n" +
                    "4 - A soma dos termos de uma PA\n" +
                    "5 - O valor de an e da razão a partir da Soma dos termos de uma PA\n" +
                    "0 - Sair do programa\n" +
                    "\n*******************************************************************\n\n";
            
            String opcaoStr = JOptionPane.showInputDialog(menu);
            
            // Se clicar em Cancelar ou fechar a janela, o programa encerra sem dar erro
            if (opcaoStr == null) {
                break;
            }
            
            opcao = Integer.parseInt(opcaoStr);
            double a1, r, an, sn;
            int n;

            switch (opcao) {
                case 1:
                    a1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 1º termo da PA: "));
                    r = Double.parseDouble(JOptionPane.showInputDialog("Digite a razão da PA: "));
                    n = Integer.parseInt(JOptionPane.showInputDialog("Digite o termo da sequência da PA que deseja conhecer: "));

                    an = a1 + (n - 1) * r;

                    JOptionPane.showMessageDialog(null, "O valor do " + n + "º termo da PA é " + an);
                    break;

                case 2:
                    a1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 1º termo da PA: "));
                    an = Double.parseDouble(JOptionPane.showInputDialog("Digite o enésimo termo da PA: "));
                    n = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de termos da PA: "));

                    r = (an - a1) / (n - 1);

                    JOptionPane.showMessageDialog(null, "O valor da razão é " + r);
                    break;

                case 3:
                    a1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 1º termo da PA: "));
                    an = Double.parseDouble(JOptionPane.showInputDialog("Digite o enésimo termo da PA: "));
                    r = Double.parseDouble(JOptionPane.showInputDialog("Digite a razão da PA: "));

                    n = (int) (((an - a1) / r) + 1);

                    JOptionPane.showMessageDialog(null, "O valor de n corresponde a " + n + " na sequência");
                    break;

                case 4:
                    a1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 1º termo da PA: "));
                    r = Double.parseDouble(JOptionPane.showInputDialog("Digite a razão da PA: "));
                    n = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição n da PA: "));

                    an = a1 + (n - 1) * r;
                    sn = ((a1 + an) * n) / 2.0;

                    JOptionPane.showMessageDialog(null, "O valor da soma dos " + n + " primeiros termos da PA é " + sn);
                    break;

                case 5:
                    a1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 1º termo da PA: "));
                    n = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição n da PA: "));
                    sn = Double.parseDouble(JOptionPane.showInputDialog("Digite a soma dos termos da PA: "));

                    an = ((2 * sn) - (n * a1)) / n;
                    r = (an - a1) / (n - 1);

                    JOptionPane.showMessageDialog(null, "an = " + an + "\nrazão = " + r);
                    break;
                    
                case 0:
                    JOptionPane.showMessageDialog(null, "Encerrando o programa. Até logo!");
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida, escolha entre 0 e 5 no menu.");
            }

        } while (opcao != 0);
    }
}