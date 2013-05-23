/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import BE.SimilarSleeve;
import DAL.SimilarSleeveDBM;
import java.util.ArrayList;

/**
 *
 * @author MikeZJ
 */
public class SimilarSleeveManager
{

    private SimilarSleeveDBM ssldb;

    public SimilarSleeveManager() throws Exception
    {
        ssldb = new SimilarSleeveDBM();
    }

    public ArrayList<SimilarSleeve> getNewSimilarSleeve(int ID) throws Exception
    {
        return ssldb.getNewSimilarSleeve(ID);
    }
}
