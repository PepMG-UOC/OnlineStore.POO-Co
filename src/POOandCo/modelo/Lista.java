
package POOandCo.modelo;

import java.util.ArrayList;


public class Lista<T> {
    protected ArrayList<T> lista;
    
    public Lista() {
        lista = new ArrayList<>();
    }
    
    public int getSize() {
        // TO-BE-DONE
        return 1;
    }
    
    public void add(T t) {
    // TO-BE-DONE
    }
    
    public void borrar(T t) {
    // TO-BE-DONE
    }
    
   // public T getAt(int position) {
    // TO-BE-DONE
     //   return T(position);
    //}
    
    public void clear() {
    // TO-BE-DONE
    }
    public boolean isEmpty() {
    // TO-BE-DONE
        return true;
    }
    
    public ArrayList<T> getArrayList() {
        ArrayList<T> arrlist = new ArrayList<>(lista);
        return arrlist;
    }
}
