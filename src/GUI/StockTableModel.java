/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BE.StockItem;
import BLL.StockManager;
import java.util.ArrayList;
import java.util.Collection;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aka
 */
public class StockTableModel extends AbstractTableModel
{

    private StockManager sm;
    private final String[] header =
    {
        "Id", "StockQuantity", "Length", "ChargeNo", "SleeveID", "CoilTypeID"
    };
    private final Class[] columnTypes =
    {
        Integer.class, Double.class, Double.class, String.class, Integer.class, Integer.class
    };
    private ArrayList<StockItem> si;

    public StockTableModel()
    {
        try
        {
            sm = new StockManager();
        }
        catch (Exception ex)
        {
            System.out.println("lol");
        }
    }

    StockTableModel(ArrayList<StockItem> getByMaterialID)
    {
        fireTableDataChanged();
        si = getByMaterialID;
    }

    @Override
    public int getRowCount()
    {
        return si.size();
    }

    @Override
    public int getColumnCount()
    {
        return header.length;
    }

    @Override
    public String getColumnName(int col)
    {
        return header[col];
    }

    @Override
    public Class<?> getColumnClass(int col)
    {
        return columnTypes[col];
    }

    @Override
    public Object getValueAt(int row, int col)
    {
        {
            StockItem s = si.get(row);
            switch (col)
            {
                case 0:
                    return s.getID();
                case 1:
                    return s.getStockQuantity();
                case 2:
                    return s.getLength();
                case 3:
                    return s.getChargeNo();
                case 4:
                    return s.getSleeveID();
                case 5:
                    return s.getCoilTypeID();

            }
            return null;
        }
    }

    @Override
    public boolean isCellEditable(int row, int col)
    {
        return (false);
    }

    public void setCollection(Collection<StockItem> list)
    {
        si = new ArrayList<>(list);
        fireTableDataChanged();
    }

    public void clear()
    {
        fireTableRowsDeleted(0, 3);
    }
}
