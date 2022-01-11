package Models;

import java.sql.*;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

public class MonModele extends AbstractTableModel{

    private int NbreLignes=0 ;
    private int Nbcolonnes ;
    private String[]Titres ;
    private ArrayList<Vector<String> > MesLignes = new ArrayList<Vector<String>>() ;
    
    public MonModele(ResultSet Res)
    {
        try {
            
            ResultSetMetaData rsmd = Res.getMetaData();
            Nbcolonnes = rsmd.getColumnCount();
            
            
            Titres = new String[Nbcolonnes];
            for(int i=0 ; i< Nbcolonnes ;i++)
                Titres[i]= rsmd.getColumnLabel(i+1);
            
           Vector<String> Ligne ;
            while(Res.next())
            { 
               Ligne = new Vector<String>();
                for(int i=0 ; i<Nbcolonnes ;i++)
                {
//                    if(Res==null)
//                        System.err.println("Pb de Res");
                    //System.out.println(i + " = " +Res.getObject(i+1).toString());
                    if(Res.getObject(i+1)!=null)
                    Ligne.add(Res.getObject(i+1).toString());
                    else
                        Ligne.add("");
                }
                    
                MesLignes.add(Ligne);
                NbreLignes++ ;
            }
            
        } 
        catch (SQLException ex) {
            Logger.getLogger(MonModele.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    @Override
    public int getRowCount() {
       return NbreLignes ;
    }

    @Override
    public int getColumnCount() {
       return Nbcolonnes ;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        return MesLignes.get(rowIndex).get(columnIndex);
    }

    @Override
    public String getColumnName(int column) {
        return Titres[column];
    }
    
}
