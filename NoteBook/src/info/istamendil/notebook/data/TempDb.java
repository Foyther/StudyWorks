/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.istamendil.notebook.data;
import java.util.Arrays;
/**
 *
 * @author Artem
 */
public class TempDb implements Db{
    
    private EndlessArray db;
    public TempDb(){
        db = new EndlessArray();
    }
    public void save(Object obj) throws DbException{
        try{
            db.add(obj);
        }
        catch(Exception ex){
            throw new DbException("Save error");
        }
    }
    public Object[] findAll(){
        return Arrays.copyOf(this.db.getArray(), this.db.length());
    }
}
