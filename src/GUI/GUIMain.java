/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.MaterialManager;
import BLL.ProductionOrderManager;
import BLL.SleeveManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.TableModel;

/**
 *
 * @author MikeZJ
 */
public class GUIMain extends javax.swing.JFrame
{

    private ProductionOrderManager po;
    private SleeveManager slm;
    private MaterialManager mm;
    private OrderTableModel OrderModel;
    private SleeveTableModel SleeveModel;
    private MaterialTableModel MaterialModel;
    private int SleeveID;
    private int MaterialID;

    /**
     * Creates new form OrderList
     */
    public GUIMain()
    {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        try
        {
            po = new ProductionOrderManager();
            slm = new SleeveManager();
            mm = new MaterialManager();

            OrderModel = new OrderTableModel(po.showAll());
            tblShowOrders.setModel(OrderModel);
            tblShowOrder.setModel(OrderModel);
            tblUpdateShowOrder.setModel(OrderModel);
            tblRemoveShowOrder.setModel(OrderModel);
            SleeveListener();
            MaterialListener();







        } catch (Exception ex)
        {
//            JOptionPane.showMessageDialog(this, "EROOR - Can't open GUI", "Error 1", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        panOrderInfo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblShowOrders = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblOrderList = new javax.swing.JTable();
        panBorderInfo = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblSleeveInfo = new javax.swing.JTable();
        lblOrderList = new javax.swing.JLabel();
        lblSimOrder = new javax.swing.JLabel();
        panBorderMat = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMaterialInfo = new javax.swing.JTable();
        panAddOrder = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblShowOrder = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        panBorderAdd = new javax.swing.JPanel();
        txtDueDate = new javax.swing.JTextField();
        txtCircumference = new javax.swing.JTextField();
        txtThickness = new javax.swing.JTextField();
        txtWidth = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        lblQuantity = new javax.swing.JLabel();
        lblWidth = new javax.swing.JLabel();
        lblThickness = new javax.swing.JLabel();
        lblCircumference = new javax.swing.JLabel();
        lblDueDate = new javax.swing.JLabel();
        lblAddOrderList = new javax.swing.JLabel();
        panUpdateOrder = new javax.swing.JPanel();
        btnUpdate = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblUpdateShowOrder = new javax.swing.JTable();
        btnUpdateClear = new javax.swing.JButton();
        panBorderUpdate = new javax.swing.JPanel();
        lblUpdateDueDate = new javax.swing.JLabel();
        txtUpdateDueDate = new javax.swing.JTextField();
        lblUpdateCircumference = new javax.swing.JLabel();
        txtUpdateCircumference = new javax.swing.JTextField();
        txtUpdateThickness = new javax.swing.JTextField();
        txtUpdateWidth = new javax.swing.JTextField();
        txtUpdateQuantity = new javax.swing.JTextField();
        txtUpdateID = new javax.swing.JTextField();
        lblUpdateThickness = new javax.swing.JLabel();
        lblIDOrder = new javax.swing.JLabel();
        lblUpdateQuantity = new javax.swing.JLabel();
        lblUpdateWidth = new javax.swing.JLabel();
        lblUpdaterOrderList = new javax.swing.JLabel();
        panRemoveOrder = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblRemoveShowOrder = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblRemoveOrder = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jScrollPane1.setViewportView(tblShowOrders);

        tblOrderList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String []
            {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tblOrderList);

        panBorderInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sleeve Information:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N

        jScrollPane7.setViewportView(tblSleeveInfo);

        javax.swing.GroupLayout panBorderInfoLayout = new javax.swing.GroupLayout(panBorderInfo);
        panBorderInfo.setLayout(panBorderInfoLayout);
        panBorderInfoLayout.setHorizontalGroup(
            panBorderInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBorderInfoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panBorderInfoLayout.setVerticalGroup(
            panBorderInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        lblOrderList.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblOrderList.setText("Orders:");

        lblSimOrder.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblSimOrder.setText("Similar Orders:");

        panBorderMat.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Material Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N

        jScrollPane2.setViewportView(tblMaterialInfo);

        javax.swing.GroupLayout panBorderMatLayout = new javax.swing.GroupLayout(panBorderMat);
        panBorderMat.setLayout(panBorderMatLayout);
        panBorderMatLayout.setHorizontalGroup(
            panBorderMatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBorderMatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE))
        );
        panBorderMatLayout.setVerticalGroup(
            panBorderMatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBorderMatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panOrderInfoLayout = new javax.swing.GroupLayout(panOrderInfo);
        panOrderInfo.setLayout(panOrderInfoLayout);
        panOrderInfoLayout.setHorizontalGroup(
            panOrderInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panOrderInfoLayout.createSequentialGroup()
                .addGroup(panOrderInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panOrderInfoLayout.createSequentialGroup()
                        .addGroup(panOrderInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSimOrder, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panOrderInfoLayout.createSequentialGroup()
                                .addComponent(lblOrderList)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(108, 108, 108))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panOrderInfoLayout.createSequentialGroup()
                        .addGroup(panOrderInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(panOrderInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panBorderInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panBorderMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panOrderInfoLayout.setVerticalGroup(
            panOrderInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panOrderInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panOrderInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panOrderInfoLayout.createSequentialGroup()
                        .addComponent(lblOrderList)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(lblSimOrder)
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                        .addGap(12, 12, 12))
                    .addGroup(panOrderInfoLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(panBorderInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panBorderMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("Select Order", panOrderInfo);

        jScrollPane4.setViewportView(tblShowOrder);

        btnAdd.setText("Add Order");

        btnClear.setText("Clear All");

        panBorderAdd.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Order", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N

        lblQuantity.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblQuantity.setText("Quantity:");

        lblWidth.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblWidth.setText("Width:");

        lblThickness.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblThickness.setText("Thickness:");

        lblCircumference.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCircumference.setText("Circumference:");

        lblDueDate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDueDate.setText("Due Date:");

        javax.swing.GroupLayout panBorderAddLayout = new javax.swing.GroupLayout(panBorderAdd);
        panBorderAdd.setLayout(panBorderAddLayout);
        panBorderAddLayout.setHorizontalGroup(
            panBorderAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBorderAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panBorderAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCircumference)
                    .addComponent(lblDueDate)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBorderAddLayout.createSequentialGroup()
                        .addGroup(panBorderAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblQuantity)
                            .addComponent(lblWidth)
                            .addComponent(lblThickness))
                        .addGap(25, 25, 25)))
                .addGap(8, 8, 8)
                .addGroup(panBorderAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCircumference, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                    .addComponent(txtDueDate)
                    .addComponent(txtWidth)
                    .addComponent(txtQuantity)
                    .addComponent(txtThickness)))
        );
        panBorderAddLayout.setVerticalGroup(
            panBorderAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBorderAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panBorderAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantity)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(panBorderAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWidth)
                    .addComponent(txtWidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panBorderAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblThickness)
                    .addComponent(txtThickness, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panBorderAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCircumference)
                    .addComponent(txtCircumference, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panBorderAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDueDate)
                    .addComponent(txtDueDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        lblAddOrderList.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblAddOrderList.setText("Orders:");

        javax.swing.GroupLayout panAddOrderLayout = new javax.swing.GroupLayout(panAddOrder);
        panAddOrder.setLayout(panAddOrderLayout);
        panAddOrderLayout.setHorizontalGroup(
            panAddOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAddOrderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panAddOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                    .addGroup(panAddOrderLayout.createSequentialGroup()
                        .addGroup(panAddOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panAddOrderLayout.createSequentialGroup()
                                .addComponent(btnAdd)
                                .addGap(18, 18, 18)
                                .addComponent(btnClear))
                            .addComponent(panBorderAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAddOrderList))
                        .addGap(0, 224, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panAddOrderLayout.setVerticalGroup(
            panAddOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAddOrderLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(panBorderAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(lblAddOrderList)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panAddOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnClear))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Add Order", panAddOrder);

        btnUpdate.setText("Add Order");

        jScrollPane5.setViewportView(tblUpdateShowOrder);

        btnUpdateClear.setText("Clear All");

        panBorderUpdate.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Update Order", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N

        lblUpdateDueDate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblUpdateDueDate.setText("Due Date:");

        lblUpdateCircumference.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblUpdateCircumference.setText("Circumference:");

        txtUpdateID.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtUpdateIDActionPerformed(evt);
            }
        });

        lblUpdateThickness.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblUpdateThickness.setText("Thickness:");

        lblIDOrder.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblIDOrder.setText("ID of Order:");

        lblUpdateQuantity.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblUpdateQuantity.setText("Quantity:");

        lblUpdateWidth.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblUpdateWidth.setText("Width:");

        javax.swing.GroupLayout panBorderUpdateLayout = new javax.swing.GroupLayout(panBorderUpdate);
        panBorderUpdate.setLayout(panBorderUpdateLayout);
        panBorderUpdateLayout.setHorizontalGroup(
            panBorderUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBorderUpdateLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panBorderUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUpdateDueDate)
                    .addComponent(lblUpdateCircumference)
                    .addComponent(lblUpdateThickness)
                    .addComponent(lblUpdateWidth)
                    .addComponent(lblUpdateQuantity)
                    .addComponent(lblIDOrder))
                .addGap(14, 14, 14)
                .addGroup(panBorderUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUpdateDueDate, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                    .addComponent(txtUpdateThickness)
                    .addComponent(txtUpdateWidth)
                    .addComponent(txtUpdateQuantity)
                    .addComponent(txtUpdateID)
                    .addComponent(txtUpdateCircumference))
                .addContainerGap())
        );
        panBorderUpdateLayout.setVerticalGroup(
            panBorderUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBorderUpdateLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panBorderUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUpdateID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIDOrder))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panBorderUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUpdateQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUpdateQuantity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panBorderUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUpdateWidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUpdateWidth))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panBorderUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUpdateThickness, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUpdateThickness))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panBorderUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUpdateCircumference, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUpdateCircumference))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panBorderUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUpdateDueDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUpdateDueDate))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblUpdaterOrderList.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblUpdaterOrderList.setText("Orders:");

        javax.swing.GroupLayout panUpdateOrderLayout = new javax.swing.GroupLayout(panUpdateOrder);
        panUpdateOrder.setLayout(panUpdateOrderLayout);
        panUpdateOrderLayout.setHorizontalGroup(
            panUpdateOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panUpdateOrderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panUpdateOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                    .addGroup(panUpdateOrderLayout.createSequentialGroup()
                        .addGroup(panUpdateOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panUpdateOrderLayout.createSequentialGroup()
                                .addComponent(btnUpdate)
                                .addGap(18, 18, 18)
                                .addComponent(btnUpdateClear))
                            .addComponent(lblUpdaterOrderList)
                            .addComponent(panBorderUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 240, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panUpdateOrderLayout.setVerticalGroup(
            panUpdateOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panUpdateOrderLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(panBorderUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblUpdaterOrderList)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panUpdateOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnUpdateClear))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Update Order", panUpdateOrder);

        jScrollPane6.setViewportView(tblRemoveShowOrder);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("ID of Order:");

        jButton1.setText("Remove Order");

        jButton2.setText("Clear All");

        lblRemoveOrder.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblRemoveOrder.setText("Orders:");

        javax.swing.GroupLayout panRemoveOrderLayout = new javax.swing.GroupLayout(panRemoveOrder);
        panRemoveOrder.setLayout(panRemoveOrderLayout);
        panRemoveOrderLayout.setHorizontalGroup(
            panRemoveOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRemoveOrderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panRemoveOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                    .addGroup(panRemoveOrderLayout.createSequentialGroup()
                        .addGroup(panRemoveOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panRemoveOrderLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panRemoveOrderLayout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2))
                            .addComponent(lblRemoveOrder))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panRemoveOrderLayout.setVerticalGroup(
            panRemoveOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panRemoveOrderLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(panRemoveOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
                .addComponent(lblRemoveOrder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panRemoveOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Remove Order", panRemoveOrder);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 635, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUpdateIDActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtUpdateIDActionPerformed
    {//GEN-HEADEREND:event_txtUpdateIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUpdateIDActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(GUIMain.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(GUIMain.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(GUIMain.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(GUIMain.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {

                new GUIMain().setVisible(true);

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdateClear;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblAddOrderList;
    private javax.swing.JLabel lblCircumference;
    private javax.swing.JLabel lblDueDate;
    private javax.swing.JLabel lblIDOrder;
    private javax.swing.JLabel lblOrderList;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblRemoveOrder;
    private javax.swing.JLabel lblSimOrder;
    private javax.swing.JLabel lblThickness;
    private javax.swing.JLabel lblUpdateCircumference;
    private javax.swing.JLabel lblUpdateDueDate;
    private javax.swing.JLabel lblUpdateQuantity;
    private javax.swing.JLabel lblUpdateThickness;
    private javax.swing.JLabel lblUpdateWidth;
    private javax.swing.JLabel lblUpdaterOrderList;
    private javax.swing.JLabel lblWidth;
    private javax.swing.JPanel panAddOrder;
    private javax.swing.JPanel panBorderAdd;
    private javax.swing.JPanel panBorderInfo;
    private javax.swing.JPanel panBorderMat;
    private javax.swing.JPanel panBorderUpdate;
    private javax.swing.JPanel panOrderInfo;
    private javax.swing.JPanel panRemoveOrder;
    private javax.swing.JPanel panUpdateOrder;
    private javax.swing.JTable tblMaterialInfo;
    private javax.swing.JTable tblOrderList;
    private javax.swing.JTable tblRemoveShowOrder;
    private javax.swing.JTable tblShowOrder;
    private javax.swing.JTable tblShowOrders;
    private javax.swing.JTable tblSleeveInfo;
    private javax.swing.JTable tblUpdateShowOrder;
    private javax.swing.JTextField txtCircumference;
    private javax.swing.JTextField txtDueDate;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtThickness;
    private javax.swing.JTextField txtUpdateCircumference;
    private javax.swing.JTextField txtUpdateDueDate;
    private javax.swing.JTextField txtUpdateID;
    private javax.swing.JTextField txtUpdateQuantity;
    private javax.swing.JTextField txtUpdateThickness;
    private javax.swing.JTextField txtUpdateWidth;
    private javax.swing.JTextField txtWidth;
    // End of variables declaration//GEN-END:variables
    public void SleeveListener()
    {
        tblShowOrders.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(final MouseEvent e)
            {
                if (e.getClickCount() == 1)
                {
                    final JTable OrderModel = (JTable) e.getSource();
                    final int row = OrderModel.getSelectedRow();
//                        final int column = OrderModel.getSelectedColumn();

                    SleeveID = (int) OrderModel.getValueAt(row, 5);
                    try
                    {
                        SleeveModel = new SleeveTableModel(slm.getBySleeveId(SleeveID));
                    } catch (Exception ex)
                    {
                        Logger.getLogger(GUIMain.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    tblSleeveInfo.setModel(SleeveModel);
                    System.out.println("Valgte SleeveID:" + SleeveID);
                }
            }
        });
    }

    public void MaterialListener()
    {
        tblSleeveInfo.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(final MouseEvent e)
            {
                if (e.getClickCount() == 1)
                {
                    final JTable SleeveModel = (JTable) e.getSource();
                    final int row = SleeveModel.getSelectedRow();
//                        final int column = OrderModel.getSelectedColumn();

                    MaterialID = (int) OrderModel.getValueAt(row, 3);
                    try
                    {
                        MaterialModel = new MaterialTableModel(mm.getByMaterialId(MaterialID));
                    } catch (Exception ex)
                    {
                        Logger.getLogger(GUIMain.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    tblMaterialInfo.setModel(MaterialModel);
                    System.out.println("Valgte MaterialID:" + MaterialID);
                }
            }
        });
    }
}