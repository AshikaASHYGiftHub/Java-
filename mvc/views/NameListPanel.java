/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.views;
import javax.swing.DefaultListModel;
import javax.swing.JList;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import mvc.models.Person;
//import mvc.views.DetailViewPanel;
import mvc.controller.AddressBookController;



/**
 *
 * @author Admin
 */
public class NameListPanel extends javax.swing.JPanel {
    
    // Variables declaration - do not modify                     
    /*private javax.swing.JList contactList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration */
    private String[] nameList;
    private Person person;
    private DefaultListModel dlm;
    /**
     * Creates new form ContactList
     */
    public NameListPanel() {
        initComponents();
    }
  
   
    
    
    
    
    public JList getJList()
    {
        return contactList;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        contactList = new javax.swing.JList<>();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Contacts");

        contactList.setSelectionBackground(new java.awt.Color(153, 255, 255));
        contactList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                contactListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(contactList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void contactListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_contactListValueChanged
        /* if (!evt.getValueIsAdjusting()) {
                  String s = (contactList.getSelectedValue().toString());
                  System.out.println("in contact Value Changed. Selected "+ s);
                  AddressBookController c = new AddressBookController(s);
                  
                  
         }*/
        // TODO add your handling code here:
    }//GEN-LAST:event_contactListValueChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> contactList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
