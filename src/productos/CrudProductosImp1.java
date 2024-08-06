package productos;

import java.util.*;


public class CrudProductosImp1 implements ICrudProductos{

    java.util.HashMap<Integer, Producto> productos =  new HashMap();

    @Override
    public void agregar(Producto p) {
        productos.put(p.getId(), p);
    }

    @Override
    public void eliminar(Producto p) {
        if(productos.containsKey(p.getId())){
            productos.remove(p.getId());
        }

    }

    @Override
    public void modificar(Producto p) {
        if(productos.containsKey(p.getId())){
            productos.replace(p.getId(), p);
        }
    }

    @Override
    public void listar() {
        for (Integer p : productos.keySet()) {
            System.out.println("Clave: " + p + " Producto: " + productos.get(p));
        }
    }
}
