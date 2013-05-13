/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BE.Material;
import BE.Sleeve;
import BLL.MaterialManager;
import BLL.SleeveManager;
import java.util.ArrayList;
import java.util.Collection;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Aka
 */
public class MaterialTableModel extends AbstractTableModel
{
    private MaterialManager mlm;
    private final String[] header =
    {
        "Id", "Material Name", "Material Densisty"
    };
    private final Class[] columnTypes =
    {
        Integer.class, String.class, Double.class
    };
    private ArrayList <Material> ml;

    public MaterialTableModel()
    {
        try
        {
            mlm = new MaterialManager();
        }
        catch (Exception ex)
        {
            System.out.println("lol");
        }
    }

    MaterialTableModel(ArrayList<Material> getByMaterialID)
    {
        fireTableDataChanged();
        ml = getByMaterialID;
    }

    @Override
    public int getRowCount()
    {
        return ml.size();
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
            Material m = ml.get(row);
            switch (col)
            {
                case 0:
                    return m.getID();
                case 1:
                    return m.getMaterialName();
                case 2:
                    return m.getMaterialDensity();

            }
            return null;
        }
    }

    @Override
    public boolean isCellEditable(int row, int col)
    {
        return (false);
    }

    public void setCollection(Collection<Material> list)
    {
        ml = new ArrayList<>(list);
        fireTableDataChanged();
    }  
}
