/*
 * DialSistema.java
 *
 * Created on 13 de Março de 2008, 17:01
 */


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author  Administrador
 */
public class DialogCriarEscala extends javax.swing.JDialog {
    
 String NomeEscala;   
 int NDias=0;   
 int gravar=0; 
    
    
    
int StatusDados=0, nAlternativas,nQuestoes,nAlunos,nDisciplinas;
int TipoProva=0,TipoLing=0;
String NomeCartao;
String []LinguEst;
int ndias=0,nprof=0;
//int escalaexiste=1,ndias=0,nprof=0,nmaxreserva=0,nmaxfiscal=0, nprovadias=1;
String localPath = System.getProperty("user.dir");
String EscProf,EscPronta, EscDados;
String Nundaescala;
    /** Creates new form DialSistema */
    public DialogCriarEscala(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        jComboBoxPrimLing.setVisible(false);
        jComboBoxSegLing.setVisible(false);
        jLabel9.setVisible(false);
        jLabel10.setVisible(false);
                LinguEst = new String[2];
                LinguEst[0] = "Inglês" ;//Inglês, Espanhol, Francês, Alemão
                LinguEst[1] = "Espanhol" ;

//outra maneira de regular teclado
//jTextNomeEscala=DefinirTiposCaracteresETamanho(20,  "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZçÇéáíúóÁÉÓÍÚãõÃÕ"); 
    }
 
    public String Devolver_nome(){
        return NomeCartao;
          }
  
     public int Status(){
        
     return StatusDados;
             
    }
    
     public int Infor_NDias(){
         
       return NDias;  
         
     }
     
       public String Infor_NomeEscala(){
         
       return NomeEscala;  
         
     }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonContinuar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jTextNomedaEscala = new javax.swing.JTextField();
        jTextnFiscais = new javax.swing.JTextField();
        jTextnDias = new javax.swing.JTextField();
        jLabelNDias = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextnReservas = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextnMaxReservas = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxNtipos = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxNLE = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxSegLing = new javax.swing.JComboBox();
        jComboBoxPrimLing = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabelMensagem = new javax.swing.JLabel();
        jLabelMensagem1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CRIAR ESCALA");

        jButtonContinuar.setText("CONTINUAR");
        jButtonContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonContinuarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("CANCELAR");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jTextNomedaEscala.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextNomedaEscala.setText("nada");

        jTextnFiscais.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextnFiscais.setText("25");
        jTextnFiscais.setEnabled(false);

        jTextnDias.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextnDias.setText("3");
        jTextnDias.setToolTipText("");

        jLabelNDias.setText("Número de dias");

        jLabel2.setText("Nome da Escala");

        jLabel3.setText("Número de Fiscais Disponíveis");
        jLabel3.setEnabled(false);

        jTextnReservas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextnReservas.setText("4");
        jTextnReservas.setEnabled(false);

        jLabel4.setText("Número máximo de vezes para ser fiscal");
        jLabel4.setEnabled(false);

        jLabel5.setText("Número máximo de vezes para ser reserva");
        jLabel5.setEnabled(false);

        jTextnMaxReservas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextnMaxReservas.setText("2");
        jTextnMaxReservas.setToolTipText("");
        jTextnMaxReservas.setEnabled(false);

        jLabel6.setText("SAIR");
        jLabel6.setEnabled(false);

        jComboBoxNtipos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2" }));
        jComboBoxNtipos.setEnabled(false);
        jComboBoxNtipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxNtiposActionPerformed(evt);
            }
        });

        jLabel7.setText("SAIR");
        jLabel7.setEnabled(false);

        jComboBoxNLE.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2" }));
        jComboBoxNLE.setEnabled(false);
        jComboBoxNLE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxNLEActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(204, 0, 0));
        jLabel8.setText("OBS. Língua estrangeira conta como uma única disciplina (deve constar em Número de Disciplinas)");
        jLabel8.setEnabled(false);

        jComboBoxSegLing.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Espanhol", "Inglês", "Francês", "Alemão" }));
        jComboBoxSegLing.setEnabled(false);
        jComboBoxSegLing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSegLingActionPerformed(evt);
            }
        });

        jComboBoxPrimLing.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Inglês", "Espanhol", "Francês", "Alemão" }));
        jComboBoxPrimLing.setEnabled(false);
        jComboBoxPrimLing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPrimLingActionPerformed(evt);
            }
        });

        jLabel9.setText("SAIR");
        jLabel9.setEnabled(false);

        jLabel10.setText("SAIR");
        jLabel10.setEnabled(false);

        jLabelMensagem.setForeground(new java.awt.Color(204, 0, 0));
        jLabelMensagem.setText("média");
        jLabelMensagem.setEnabled(false);

        jLabelMensagem1.setForeground(new java.awt.Color(204, 0, 0));
        jLabelMensagem1.setText("média");
        jLabelMensagem1.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelNDias, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxNtipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxNLE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jTextnFiscais, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTextnDias, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jTextnMaxReservas, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTextnReservas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(57, 57, 57)
                                                .addComponent(jButtonContinuar))
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabelMensagem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabelMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonCancelar)))
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBoxPrimLing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(266, 266, 266)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBoxSegLing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(276, 276, 276))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextNomedaEscala, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(54, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextNomedaEscala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextnDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNDias))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextnFiscais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextnReservas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabelMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextnMaxReservas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabelMensagem1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxNLE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxNtipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxPrimLing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxSegLing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(70, 70, 70))
        );

        setSize(new java.awt.Dimension(650, 403));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonContinuarActionPerformed
///LER TODOS OS DADOS E CONTINUAR SE TUDO ESTIVER CERTO


        ler_dados();

        if (gravar == 1){
//            //Salva os dados e sai
//            gravar_dados();

            //ENVIAR VALORES
            //    Horario_Escala fprincipal = new Horario_Escala();
            // //ou assim JFrameCriar_Escala dlgtemp= new JFrameCriar_Escala(this, true);//mas não sei a diferença ainda
            StatusDados= 1;
            NomeEscala = jTextNomedaEscala.getText();
            NDias = Integer.parseInt(jTextnDias.getText());
            //
            //Horario_Escala main= new Horario_Escala(NomeEscala,Nundaescala, Status );
            //
            //        main.Receber_dados_Criados(ndias,nprof);//,nmaxreserva,nmaxfiscal);
        //        main.setVisible(true);
        //                     Status= 1;
        dispose();

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonContinuarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        StatusDados= 0;
        //        Horario_Escala main= new Horario_Escala(NomeEscalaEst,NumEscEst, Status );
        //        Main mane = new Main();
        //  Ndaescala= NumEscEscol;
        //            NomeEscalaEst=NomeEscEstava;
        //            NumEscEst = NumEscEstava;

        //            NomeEscalaEst=NomeEscEstava;
        //            Nundaescala = NumEscEst;

        //        mane.dispose();
        //                  .setVisible(true);//não serve pois ele cria outro
        //        main.setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jComboBoxNtiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxNtiposActionPerformed
        TipoProva = jComboBoxNtipos.getSelectedIndex();
        
        if (TipoProva==0){//só um tipo
            TipoLing = jComboBoxNLE.getSelectedIndex();
         if (TipoLing==0||TipoLing==1){   
         jLabelMensagem.setText("Será um tipo de prova.");
         TipoProva=1;
         }else if (TipoLing==2){   
            jLabelMensagem.setText("Será um tipo de prova para cada língua.");
            TipoProva=2;
         }
        }else{// 
             if (TipoLing==0||TipoLing==1){   
         jLabelMensagem.setText("Serão dois tipos de prova.");
         TipoProva=2;
         }else if (TipoLing==2){   
            jLabelMensagem.setText("Serão dois tipos de provas para cada língua.");
            TipoProva=4;
         }
        }
                 System.out.println("381  TipoProva=  "+TipoProva);
    }//GEN-LAST:event_jComboBoxNtiposActionPerformed

    private void jComboBoxNLEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxNLEActionPerformed

  // não importa que seja só uma disciplina. a lingua estrageira vai ser esta disciplina, o aluno vai fazer uma ou outra
  //não vai fazer as duas.
  //quando não tem duas línguas estrangeiras, significa que vai ter só o tipo1 e tippo 2 de prova
  //quando tem duas línguas estrangeiras, vamos ter o Tipo1A, Tipo1B, Tipo2A e Tipo2B.
      TipoLing = jComboBoxNLE.getSelectedIndex();
                 System.out.println("391  TipoLing=  "+TipoLing);
if (TipoLing==2){
        jComboBoxPrimLing.setVisible(true);
        jComboBoxSegLing.setVisible(true);
        jLabel9.setVisible(true);
        jLabel10.setVisible(true);
//        jComboBoxNtipos.setSelectedIndex(1);
        jComboBoxNtipos.removeAllItems();
        jComboBoxNtipos.addItem(2);
        jComboBoxNtipos.addItem(4);
        jLabelMensagem.setText("Será um tipo de prova para cada língua");
        TipoProva=2;
//        mudar a sequencia para escolher quantos tipos de prova, fica 2 e 4
        
//        jComboBoxNtipos.setEnabled(false);
}else{
    //        mudar a sequencia para escolher quantos tipos de prova, fica 1 e 2
     jComboBoxPrimLing.setVisible(false);
        jComboBoxSegLing.setVisible(false);
        jLabel9.setVisible(false);
        jLabel10.setVisible(false);
        jComboBoxNtipos.setSelectedIndex(0);
        jComboBoxNtipos.setEnabled(true);
        jLabelMensagem.setText("Será somente um tipo de prova");
        TipoProva=1;
       jComboBoxNtipos.removeAllItems();
//       jComboBoxNtipos.addItem(0);
       jComboBoxNtipos.addItem(1);
       jComboBoxNtipos.addItem(2);
}

    }//GEN-LAST:event_jComboBoxNLEActionPerformed

    private void jComboBoxSegLingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSegLingActionPerformed
       LinguEst[1]= (String) jComboBoxSegLing.getSelectedItem();
       System.out.println("395 LinguEst[0]= " + LinguEst[1]);

    }//GEN-LAST:event_jComboBoxSegLingActionPerformed

    private void jComboBoxPrimLingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPrimLingActionPerformed

//        System.out.println("400 LinguEst[1]= " + jComboBoxPrimLing.getSelectedItem());
        LinguEst[0] =  jComboBoxPrimLing.getSelectedItem().toString();
//      LinguEst[0]= (String) jComboBoxNLE.getSelectedItem();
//        System.out.println("74 LinguEst[1]= " + jComboBoxPrimLing.getSelectedItem());
//          jComboBoxNascimento.setSelectedIndex(intdat);
    }//GEN-LAST:event_jComboBoxPrimLingActionPerformed
      
//  *************************************************************
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogCriarEscala dialog = new DialogCriarEscala(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonContinuar;
    private javax.swing.JComboBox jComboBoxNLE;
    private javax.swing.JComboBox jComboBoxNtipos;
    private javax.swing.JComboBox jComboBoxPrimLing;
    private javax.swing.JComboBox jComboBoxSegLing;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelMensagem;
    private javax.swing.JLabel jLabelMensagem1;
    private javax.swing.JLabel jLabelNDias;
    private javax.swing.JTextField jTextNomedaEscala;
    private javax.swing.JTextField jTextnDias;
    private javax.swing.JTextField jTextnFiscais;
    private javax.swing.JTextField jTextnMaxReservas;
    private javax.swing.JTextField jTextnReservas;
    // End of variables declaration//GEN-END:variables
    
    
 public void ler_dados(){
 

     
     if (jTextNomedaEscala.getText().equals("") ) {
            JOptionPane.showMessageDialog(rootPane, "Forneça um nome para a escala.", "AVISO", 2);//fica fora do Frame
//            System.out.println("NÃO vai gravar ");
            return;
        }
     
  if (jTextnDias.getText().equals("") || jTextnDias.getText().equals("0")) {
            JOptionPane.showMessageDialog(rootPane, "Forneça uma quantidade válida de dias.", "AVISO", 2);//fica fora do Frame
//            System.out.println("NÃO vai gravar ");
            return;
        }

if (jTextnFiscais.getText().equals("") || Integer.parseInt(jTextnFiscais.getText())<2 ) {
            JOptionPane.showMessageDialog(rootPane, "Forneça uma quantidade válida de Fiscais.", "AVISO", 2);//fica fora do Frame
//            System.out.println("NÃO vai gravar ");
            return;
        }


if (jTextnReservas.getText().equals("") || jTextnReservas.getText().equals("0") ) {
            JOptionPane.showMessageDialog(rootPane, "Forneça uma quantidade válida de Reservas.", "AVISO", 2);//fica fora do Frame
            System.out.println("NÃO vai gravar ");
            return;
        }

if (jTextnMaxReservas.getText().equals("")  || jTextnMaxReservas.getText().equals("0") ) {
            JOptionPane.showMessageDialog(rootPane, "Forneça um quantidade máxima válida para ser reserva.", "AVISO", 2);//fica fora do Frame
            System.out.println("NÃO vai gravar ");
            return;
        }

//if (Integer.parseInt(jTextnDias.getText()) <= Integer.parseInt(jTextnFiscais.getText()) ) {
//            JOptionPane.showMessageDialog(rootPane, "Forneça um quantidade de Fiscais maior que a de dias.", "AVISO", 2);//fica fora do Frame
//            System.out.println("NÃO vai gravar ");
//            return;
//        }


NomeCartao =  jTextNomedaEscala.getText();
nQuestoes =  Integer.parseInt(jTextnDias.getText());//número de questões que terá a prova
nAlternativas =  Integer.parseInt(jTextnFiscais.getText());//número de alternativas que terá a questão
nDisciplinas =  Integer.parseInt(jTextnReservas.getText());//número de disciplinas que terá a prova
nAlunos =  Integer.parseInt(jTextnMaxReservas.getText());//número de alunos que farao a prova


//System.out.println("vai gravar ");
gravar=1;// autoriza continuar , dados estão todos certos




}
 
 public void gravar_dados(){
     //caso queira que o usuario escolha o nome
//        javax.swing.JFileChooser dlg = new javax.swing.JFileChooser();
//          dlg.setCurrentDirectory(new File(localPath));//pega o local onde está o programa
//        dlg.showSaveDialog(this);
//        java.io.File selF = dlg.getSelectedFile();
     //fim de escolher o nome  
     //AQUI O USUARIO NÃO ESCOLHE O NOME, É UM ARQUIVO DO PROGRAMA.
           System.out.println("411 nome = "+ localPath);
//         java.io.File selF ="Escala1";
      //  if (selF != null) {
            java.io.File selFpara = new File(localPath + "/Escala"+Nundaescala);
            if (!selFpara.exists()) {//DEVE CRIAR O ARQUIVO CASO ELE TENHA SIDO APAGADO PELO USUARIO
                // falta fazer o código
                 System.out.println("416 o arquivo não existe nome = "+ selFpara);
            } else {
                
                  selFpara.delete();
                  selFpara.delete();
//                
//                Object[] options = {"Yes", "No"};
//                int answer = JOptionPane.showOptionDialog(rootPane,
//                        "Overwrite data?", "Question",
//                        JOptionPane.YES_NO_CANCEL_OPTION,
//                        JOptionPane.QUESTION_MESSAGE,
//                        null,
//                        options,
//                        options[1]);
//                if (answer == JOptionPane.YES_OPTION) {
//                      selFpara.delete();
//                      selFpara.delete();
//                } else if (answer == JOptionPane.NO_OPTION) {
//                    selFpara = new File(selFpara + "_new");
//                    selFpara = new File(selFpara + "_parametros");
//                }
            }
   

        DecimalFormat df = new DecimalFormat("0.#");///quando se coloca 0 no lugar de # o zero aparece
//************* salva a escala criada *************************
//        for (int lin = 1; lin<=nturmas ;lin++){
            String ExisteS,NdiaS,NturmS,NprofS;//,NmaxfiscS,NmaxreserS;
             ExisteS = df.format(1);
             NdiaS = df.format(ndias);
//           NturmS = df.format(1);//vou começar co,m 1, o usuário vai atualizar os dados depois para cada dia
           NprofS= df.format(nprof);
//           NmaxfiscS   = df.format(nmaxfiscal);
//           NmaxreserS= df.format(nmaxreserva);
//            EscProf = "Escala"+Nundaescala+"Prof";//Nome do arquivo que vai salvar o nome do professor e suas especificidades
            EscPronta="Escala"+Nundaescala+"Resul";//Nome do arquivo que vai salvar o resultado
            EscDados = "Escala"+Nundaescala+"Dados";//Nome do arquivo que vai salvar od dados de cada dia
     // "  " + NturmS +

           try {
                FileWriter fwpara = new FileWriter(selFpara, true);//o true eu coloquei   
  String outSpara = "  " + ExisteS + "  " + NdiaS + "  " + NomeCartao+"  "+ EscProf+"  "+ EscPronta +"  "+ EscDados + "\n";
                fwpara.write(outSpara);
                fwpara.close();
            } catch (IOException e) {
            }
//        }
//************* FIM de salva a escala criada *************************
                    
// mandar os valores para a tela principal.                    
     
     
 }
 
 
}
