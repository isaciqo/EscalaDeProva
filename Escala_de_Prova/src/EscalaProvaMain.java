

//import java.awt.List;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
// FALTA PEGAR A TABELAS DIAS E CRIAR A OUTRA PARA AS POSIÇÕES DAS SALAS. CRIAR UMA COLNA PARA CADA SALA. FAZER A SOMA TOTAL DE SALAS
/**
 *
 * @author Iran
 */
public class EscalaProvaMain extends javax.swing.JFrame {
public static int NDias=0, NFiscais=0;
public static String NomeEscala;
public static int Status = 0;
public static int []diaseSalas;
public static int [][]SalasFiscais;
//private static DefaultTableModel TabelaNew;
//DefaultTableModel TabelaNew = new DefaultTableModel();
private static DefaultTableModel TabelaNew = new DefaultTableModel();
private static DefaultTableModel TabelaFiscalRank = new DefaultTableModel();
private static DefaultTableModel TabelaTemporaria = new DefaultTableModel();
private static DefaultTableModel TabelaSalasDias = new DefaultTableModel();
private static DefaultTableModel modelo;
//public static DefaultTableModel modelo = new DefaultTableModel();

    /**
     * Creates new form EscalaProva
     */
    public EscalaProvaMain() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jScrollPaneResultado = new javax.swing.JScrollPane();
        jTableProfessores = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButttabelSalasDias = new javax.swing.JButton();
        jButmover = new javax.swing.JButton();
        jButtocriarraking = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemAbrir = new javax.swing.JMenuItem();
        jMenuItemNovaEscala = new javax.swing.JMenuItem();
        jMenuItemSalvar = new javax.swing.JMenuItem();
        jMenuItemSair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Escala de Prova");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/figuras/Sair.PNG"))); // NOI18N
        jButton3.setToolTipText("Sair");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jScrollPaneResultado.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultados"));

        jTableProfessores.setAutoCreateRowSorter(true);
        jTableProfessores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "A", "B"
            }
        ));
        jTableProfessores.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTableProfessores.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jScrollPaneResultado.setViewportView(jTableProfessores);

        jButton1.setText("tabela prof");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButttabelSalasDias.setText("TabelaSalasDias");
        jButttabelSalasDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButttabelSalasDiasActionPerformed(evt);
            }
        });

        jButmover.setText("jButtMOver");
        jButmover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButmoverActionPerformed(evt);
            }
        });

        jButtocriarraking.setText("criarranking");
        jButtocriarraking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtocriarrakingActionPerformed(evt);
            }
        });

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jMenu1.setText("Arquivo");

        jMenuItemAbrir.setText("Abrir");
        jMenu1.add(jMenuItemAbrir);

        jMenuItemNovaEscala.setText("Nova Escala");
        jMenuItemNovaEscala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNovaEscalaActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemNovaEscala);

        jMenuItemSalvar.setText("Salvar");
        jMenuItemSalvar.setToolTipText("");
        jMenuItemSalvar.setEnabled(false);
        jMenu1.add(jMenuItemSalvar);

        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemSair);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");

        jMenuItem1.setText("jMenuItem1");
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPaneResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jButton1)
                                    .addGap(42, 42, 42))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(80, 80, 80))
                                .addComponent(jButttabelSalasDias)
                                .addComponent(jButmover))
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtocriarraking)))
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButtocriarraking)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButttabelSalasDias)
                        .addGap(40, 40, 40)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButmover)
                        .addGap(69, 69, 69)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPaneResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))))
        );

        setSize(new java.awt.Dimension(667, 432));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItemNovaEscalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNovaEscalaActionPerformed

// ************** Abrir Janela para criar nova Escala de professores **************************
 CriarEscala();

 if (Status==1){
     Status = 0;// para pegar o retorno dos DiasSalas()
        DiasSalas();
          CriarTabelaSalasDias();
 }
 
 
  if (Status==1){
     Status = 0;// para pegar o retorno dos Nprofessores()
        Nprofessores();
 }
  
   if (Status==1){
     Status = 0;// para pegar o retorno dos Nprofessores()
        TabelaProfessores();
 }
  
  
  
  
 
    }//GEN-LAST:event_jMenuItemNovaEscalaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

       jTableProfessores.setModel(TabelaNew);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButttabelSalasDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButttabelSalasDiasActionPerformed

    jTableProfessores.setModel(TabelaSalasDias);
    //jTableProfessores.moveColumn(NORMAL, Status);
//int ultimaColunaIndex = modelo.getColumnCount() - 1;
    
        // TODO add your handling code here:
    }//GEN-LAST:event_jButttabelSalasDiasActionPerformed

    private void jButmoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButmoverActionPerformed
    int primeiraColunaIndex = 1;
    int ultimaColunsaIndex = jTableProfessores.getColumnCount() - 1;
    jTableProfessores.moveColumn(primeiraColunaIndex, ultimaColunsaIndex);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButmoverActionPerformed

    private void jButtocriarrakingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtocriarrakingActionPerformed
//        TabelaFiscalRank = TabelaNew;
        CriarRanking(TabelaNew);


        // TODO add your handling code here:
    }//GEN-LAST:event_jButtocriarrakingActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
jTableProfessores.setModel(TabelaFiscalRank);
       // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
public static void Nprofessores(){
      JDialogFiscal  dlProfe= new JDialogFiscal(null, true);
      
     dlProfe.Receber_MatrizSalas(diaseSalas,NDias);
      
      dlProfe.setVisible(true);
      // ************* PEGAR O A QUANTIDADE DE FISCAIS *****************
     Status = dlProfe.Status();
      if (Status==1){
          NFiscais =dlProfe.Infor_NFiscias();
//     System.out.println("141 principal NFiscais =  "+NFiscais);
      }
 // ************* FIM DE PEGAR A QUANTIDADE DE FISCAIS *****************     
        
}
    
public void  TabelaProfessores(){
      DialogTabelaProfessor  dlTabelaProfe= new DialogTabelaProfessor(null, true);
      
      dlTabelaProfe.Receber_NFisc_NDias_Nome(NFiscais, NDias, NomeEscala,diaseSalas);
      
      dlTabelaProfe.setVisible(true);
      
      Status = dlTabelaProfe.Status(); 
  if (Status==1){    
     SalasFiscais= dlTabelaProfe.matriz();//esta não vai ser preciso apagar depois ela e a função
//     for (int lin = 1; lin<=2*NFiscais ;lin++){ 
//       for (int Col = 3; Col<=NDias+2 ;Col++){ 
////               System.out.println("main 167 SalasFiscais = "+SalasFiscais [lin-1] [Col-1]);
//       }
//      } 
//     DefaultTableModel modelo = new DefaultTableModel();
     modelo = dlTabelaProfe.PegarTabelaFis();
//       int ContCol=0;
    
////      for (int lin = 1; lin<=3*NFiscais ;lin++){ 
//////           System.out.println("main 232 linha  "+lin);  
////     for (int Col = 1; Col<=NDias ;Col++){ 
//////            ContCol=ContCol+1;
//////                 System.out.println("main 2236 Coluna  "+Col);  
//////      System.out.print(" "+modelo.getValueAt(lin-1,Col-1));
////       }
//////      System.out.println(" ");
////      } 
     
      OrganizarTabelaFiscal();
      
      // AGORA VAI CHAMAR A FUNÇÃO PARA FAZER O RANKING DOS FISCAIS
//      CriarRanking(TabelaNew);
     
    
  
  }
  
}
 
public void CriarRanking(DefaultTableModel TabelaNova){
   
    TabelaTemporaria = TabelaNova;
  
    
    // Obtenha os valores da última linha em um array
    int rowCount = TabelaTemporaria.getRowCount();
        int colCount = TabelaTemporaria.getColumnCount();
        int[] ultimaLinha = new int[colCount];
        for (int i = 0; i < colCount; i++) {
            //pega os valores da última linha (quantidade de vezes que o fiscal está disponçivel)
            ultimaLinha[i] = (int) TabelaTemporaria.getValueAt(rowCount - 1, i);
//            System.out.print("  317= "+ultimaLinha[i]);
        }
    
    
    // Crie uma estrutura de dados para armazenar índices e valores
        Map<Integer, Integer> indiceValorMap = new HashMap<>();
        for (int i = 0; i < colCount; i++) {
            //grava para cada índice de coluna o valor da disponibilidade
            indiceValorMap.put(i, ultimaLinha[i]);
//          System.out.print("  328= "+indiceValorMap.get(i));//é a quantidade que o fiscal está disponível 
        }
    // Ordene o mapa com base nos valores
/////*******************************************************        
        //sortedEntries
//sortedEntries são valores de indiceValorMap
List<Map.Entry<Integer, Integer>> QuantidadesOrdenadas = new ArrayList<Map.Entry<Integer, Integer>>(indiceValorMap.entrySet());
////for (Integer index : sortedEntries) {
// Integer index = entry.getKey();
//    System.out.println( "371aqui "+sortedEntries.get(index));//aparece o index=valor que está gravado
//}
//int contandolooping = 0;
Collections.sort(QuantidadesOrdenadas, new Comparator<Map.Entry<Integer, Integer>>() {
    @Override
     public int compare(Map.Entry<Integer, Integer> entry1, Map.Entry<Integer, Integer> entry2) {
//    public int compare(Integer index1, Integer index2) {
//  System.out.println("  *******   1   ********"); 
                 Integer valor1 =entry1.getValue();
//                   System.out.println("  365=valor1 "+valor1);   
                  Integer valor2 =entry2.getValue();
//                   System.out.println("  367=valor2 "+valor2); 
int res=1;
 if (valor2!=valor1) {
    res= valor2.compareTo(valor1);//se v1 >v2, res=1
     
 }



//       contandolooping=contandolooping+1;     
//  System.out.println("  370 resultado= "+res); //  Integer indice1 = entry1.getKey();
//  if (res== 0) {// caso os calores sejam iguais ele pega o menor índice  (getket pega o indice
//System.out.println("  373=entry1.getKey() "+entry1.getKey()); //                    
//System.out.println("  374entry2.getKey() "+entry2.getKey()); //   
//res = entry1.getKey().compareTo(entry2.getKey());
//////                     System.out.println("  387resultado= "+res);
//                }
//if (res== 1) {// caso os calores sejam iguais ele pega o menor índice  (getket pega o indice
//                    
////                     System.out.println("fica o valor = "+valor1+"para comprar com o proximo");
//                }else if(res==-1){
////                     System.out.println("fica o valor = "+valor2+"para comprar com o proximo");
//                    
//                }
//                return valor1.compareTo(valor2);
                return res;
            }
});
//
//for (Map.Entry<Integer, Integer> entry : QuantidadesOrdenadas) {
// Integer index = entry.getKey();
//////    System.out.println( "401aqui "+entry.getValue());
//////    System.out.println( "402aqui "+entry.getKey());
//////    System.out.println( "403aquiindex=  "+index);
//    System.out.println( " "+QuantidadesOrdenadas.get(index));//aparece o index=valor que está gravado
//}

     // Reorganize as colunas na tabela com base nos índices ordenados
////////        for (int i = 0; i < colCount; i++) {
//////////            int indiceOriginal = sortedEntries.get(i);
//////// Map.Entry<Integer, Integer> entrynew = QuantidadesOrdenadas.get(i);
////////// Map.Entry<Integer, Integer> entrynew = entry.getValue();
////////Integer index = entrynew.getKey();
////////////está ordenado
//////////na hora de mudar na tabela a tabela muda as colunas e não dá pra continuar com os índices
////////System.out.println( "412 sortedEntries.get(i) "+QuantidadesOrdenadas.get(i));
//////////System.out.println( "413 sortedEntries.get(i) "+entrynew.getValue());
//////////System.out.println( "414 sortedEntries.get(i) "+entrynew.getKey());
////////            int columnIndex = entrynew.getKey();
//////////             jTableProfessores.moveColumn(columnIndex, i);
////////             jTableProfessores.moveColumn(index, i);
////////// JOptionPane.showMessageDialog(rootPane, "continua ", "AVISO", 2);//fica fora do Frame
////////        }    
//**** Atualiza a tabela que veio com as colunas ordenadas ************

//***** apagar isto é só para imprimir **************
   int rCount = TabelaNova.getRowCount();
        int cCount = TabelaNova.getColumnCount();
         System.out.println( "448 ");
           for (int lin = 0; lin < rCount; lin++) {
   for (int col = 0; col < cCount; col++) { //VAI PEGAR CADA COLUNA E COLOCAR OS NOVOS VALORES RANQUEADOS  
    
        System.out.print( " "+TabelaNova.getValueAt(lin,col)); 
       }
        System.out.println( "");
   } 
//***** fim de apagar isto **************



   DefaultTableModel modeloTabelaFiscalRank = new DefaultTableModel();
// Copie as colunas do modelo de TabelaNova para o modelo de TabelaFiscalRank
for (int i = 0; i < TabelaTemporaria.getColumnCount(); i++) {
    modeloTabelaFiscalRank.addColumn(TabelaTemporaria.getColumnName(i));
}

 System.out.println( "455   ");

      int teste=0;
  for (int lin = 0; lin < rowCount; lin++) {
   for (int col = 0; col < colCount; col++) { //VAI PEGAR CADA COLUNA E COLOCAR OS NOVOS VALORES RANQUEADOS  
         Map.Entry<Integer, Integer> entrynew = QuantidadesOrdenadas.get(col);
//             System.out.println( " entrynew.getKey() "+entrynew.getKey());
// Map.Entry<Integer, Integer> entrynew = entry.getValue();
            Integer index = entrynew.getKey();
//             System.out.println( " "+entrynew.getKey());
//      for (int lin = 0; lin < rowCount; lin++) {       
            
            
//             System.out.print( " "+TabelaNova.getValueAt(lin,index)); 
//         teste= (int) TabelaNova.getValueAt(lin,col);
         teste= (int) TabelaNova.getValueAt(lin,index);
           System.out.print( " "+teste);
          if(col==0){ 
           modeloTabelaFiscalRank.addRow(new Object [] {""} );
          }
            modeloTabelaFiscalRank.setValueAt(teste, lin, col);
           
            Object novoNome = TabelaNova.getColumnName(index);
 System.out.println( "novoNome= "+novoNome);

// modeloTabelaFiscalRank.setColumnName(index,novoNome);
            
   // Obtém o nome da coluna da outra tabela que você deseja copiar

// modeloTabelaFiscalRank.getColumn(index).setHeaderValue(novoNome);  
// Define o novo nome da coluna na sua tabela
//modeloTabelaFiscalRank.getColumnModel().getColumn(col).setHeaderValue(novoNome);         
//            modeloTabelaFiscalRank.setColumnHeader(col, novoNome);
            
            
            
            
            
//            TabelaFiscalRank.setValueAt(teste,lin,col);
//  System.out.print( " "+TabelaFiscalRank.getValueAt(lin,col));

       }
        System.out.println( "");
   }   
        // FIM Obtenha os valores da última linha em um array
        // Copie os dados do modelo de TabelaNova para o modelo de TabelaFiscalRank
//for (int i = 0; i < TabelaTemporaria.getRowCount(); i++) {
//    Object[] rowData = new Object[TabelaTemporaria.getColumnCount()];
//    for (int j = 0; j < TabelaTemporaria.getColumnCount(); j++) {
//        rowData[j] = teste;//TabelaTemporaria.getValueAt(i, j);
//    }
//    modeloTabelaFiscalRank.addRow(rowData);
//}
//TabelaTemporaria = TabelaNova;
 System.out.print( "515 linhas=  "+modeloTabelaFiscalRank.getRowCount());
TabelaFiscalRank = modeloTabelaFiscalRank;
//jTableProfessores.removeAll();
        jTableProfessores.setModel(TabelaFiscalRank);  

         for (int col = 0; col < colCount; col++) {
//             for (Map.Entry<Integer, Integer> entry : QuantidadesOrdenadas) {
            Map.Entry<Integer, Integer> entrynew = QuantidadesOrdenadas.get(col);
            Integer index = entrynew.getKey();
  Object novoNome = TabelaNova.getColumnName(index);
 System.out.println( "novoNome= "+novoNome);
 jTableProfessores.getColumnModel().getColumn(col).setHeaderValue(novoNome);
// TabelaFiscalRank
         } 
        
        
        
}

public static void CriarTabelaSalasDias(){
  int SalaMaior = 0;  
    for (int lin = 1; lin<=2*NDias ;lin++){  
//     System.out.println("dia");
          TabelaSalasDias.addRow(new Object [] { ""} );
//    System.out.print("diaseSalas"+ diaseSalas [lin-1]);
         for (int Col = 1; Col<=diaseSalas [lin-1]  ;Col++){
    if(SalaMaior<diaseSalas [lin-1]){
    SalaMaior=SalaMaior+1;  
    TabelaSalasDias.addColumn("Sala"+SalaMaior);//
//    if(totalSala<=diaseSalas [lin-1]){
//     TabelaSalasDias.addRow(new Object [] { ""} );
    }
     TabelaSalasDias.setValueAt(1, lin-1, Col-1);
//      System.out.print(" "+TabelaSalasDias.getValueAt( lin-1, Col-1));  
         }
//         System.out.println(""); 
    }
//      for (int lin = 1; lin<=3*NFiscais ;lin++){ 
////           System.out.println("main 232 linha  "+lin);  
//     for (int Col = 1; Col<=NDias ;Col++){ 
////            ContCol=ContCol+1;
////                 System.out.println("main 2236 Coluna  "+Col);  
////      System.out.print(" "+modelo.getValueAt(lin-1,Col-1));
//       }
////      System.out.println(" ");
//      } 
////}
}
public static void OrganizarTabelaFiscal(){
 
//             System.out.print("comeca ");
            int ContC=-1;// colunas da tabela nova
            int contL=0;//linha da taabela nova
       
//                for (int Col = 1; Col<=NDias ;Col++){ 
                    
//         int   quantidadefalsa     =31;    
     for (int lin = 1; lin<=3*NFiscais ;lin=lin+3){//linha dos dados originais 
         contL=-1;
            
         ContC=ContC+1;
            
       TabelaNew.addColumn("Fiscal"+(ContC+1));//
//           System.out.println("main 265 coluna  "+ContC);  
// int linantigo
int quantidade = 0;
           for (int col = 1; col<=NDias ;col++){ //coluna dos dados originais
//                ContC=ContC+1;
                contL=contL+1;
//                linantigo=0;
//                linantigo=linantigo+1;
        if(lin==1){//a cada dia ele coloca 3 linhas
         TabelaNew.addRow(new Object [] {""} );//1h
         TabelaNew.addRow(new Object [] {""} );//2h
         TabelaNew.addRow(new Object [] {""} );//liberdade

            }
//         System.out.println("main 276 coluna  "+ContC);
           TabelaNew.setValueAt(modelo.getValueAt(lin-1,col-1), contL, ContC);//primeiro horário
          
//           System.out.print("363 "+TabelaNew.getValueAt(contL,ContC));// print sem ln, não muda a linha
//       System.out.println("main 280 coluna  "+ContC);
            contL=contL+1;
            TabelaNew.setValueAt(modelo.getValueAt(lin,col-1), contL, ContC);//segundo horário
//            System.out.print("367 "+TabelaNew.getValueAt(contL,ContC));// print sem ln, não muda a linha
      quantidade= quantidade+(int)modelo.getValueAt(lin-1,col-1)+(int)modelo.getValueAt(lin,col-1);
             contL=contL+1;
         
            TabelaNew.setValueAt(modelo.getValueAt(lin+1,col-1), contL, ContC);//livre
//             contL=contL+1;
//            TabelaNew.setValueAt(quantidade, contL, ContC);//quantidade
//      System.out.print("374 quantidade = "+quantidade);// print sem ln, não muda a linha
      
      
       }
            if(lin==1){
           TabelaNew.addRow(new Object [] {""} );//total disponível
           }
//            quantidadefalsa=quantidadefalsa-2;
             TabelaNew.setValueAt(quantidade, contL+1, ContC);//quantidade
//      System.out.println(" ");
      } 
   
}

public static void DiasSalas(){
          JDialogTabelaDias_Salas  dlDias_Salas= new JDialogTabelaDias_Salas(null, true);
          
           // ************* ENVIA O NOME E A QUANTIDADE DE DIAS *****************
   
     
       dlDias_Salas.Receber_Nome_NDias(NDias, NomeEscala);
 // ************* FIM DE ENVIAR O NOME E A QUANTIDADE DE DIAS *****************
            dlDias_Salas.setVisible(true); 
       Status = dlDias_Salas.Status();
 // ************* PEGA TODA A MATRIZ DA TABELA DE DIAS E SALAS POR DIAS **************
   if (Status==1){
 diaseSalas = new int [2*NDias];
 diaseSalas= dlDias_Salas.matriz();
 
 
 
 
   }
  // ************* FIM DE PEGAR TODA A MATRIZ DA TABELA DE DIAS E SALAS POR DIAS **************

            
    }
    
    
public static void CriarEscala(){
          DialogCriarEscala  dlgCriar= new DialogCriarEscala(null, true);
           
          dlgCriar.setVisible(true); 
         Status = dlgCriar.Status();
   // ************* PEGAR O NOME E A QUANTIDADE DE DIAS *****************
    if (Status==1){
   NDias =dlgCriar.Infor_NDias();
   NomeEscala=dlgCriar.Infor_NomeEscala();
    }
             
 // ************* FIM DE PEGAR O NOME E A QUANTIDADE DE DIAS *****************
  
  
        
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EscalaProvaMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EscalaProvaMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EscalaProvaMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EscalaProvaMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EscalaProvaMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButmover;
    private javax.swing.JButton jButtocriarraking;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButttabelSalasDias;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemAbrir;
    private javax.swing.JMenuItem jMenuItemNovaEscala;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemSalvar;
    private javax.swing.JScrollPane jScrollPaneResultado;
    private javax.swing.JTable jTableProfessores;
    // End of variables declaration//GEN-END:variables
}
