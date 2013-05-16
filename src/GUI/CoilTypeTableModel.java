/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BE.CoilType;
import BLL.CoilTypeManager;
import java.util.ArrayList;
import java.util.Collection;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author MikeZJ
 */
  public class CoilTypeTableModel extends AbstractTableModel
{
    private CoilTypeManager ctm;
    private final String[] header =
    {
        "ID","MaterialID", "Width", "Thickness", "Code"
    };
    private final Class[] columnTypes =
    {
        Integer.class,Integer.class, Double.class, Double.class, String.class
    };
    private ArrayList <CoilType> ct;

    public CoilTypeTableModel()
    {
        try
        {
            ctm = new CoilTypeManager();
        }
        catch (Exception ex)
        {
            System.out.println("lol");
        }
    }

    CoilTypeTableModel(ArrayList<CoilType> getByMaterialID)
    {
        fireTableDataChanged();
        ct = getByMaterialID;
    }

    @Override
    public int getRowCount()
    {
        return ct.size();
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
            CoilType c = ct.get(row);
            switch (col)
            {
                case 0:
                    return c.getID();
                case 1:
                    return c.getMaterialID();
                case 2:
                    return c.getWidth();
                case 3:
                    return c.getThickness();
                case 4:
                    return c.getCode();

            }
            return null;
        }
    }

    @Override
    public boolean isCellEditable(int row, int col)
    {
        return (false);
    }

    public void setCollection(Collection<CoilType> list)
    {
        ct = new ArrayList<>(list);
        fireTableDataChanged();
    }  
}
  

