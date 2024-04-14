
package entidades;


public class Producto implements Comparable<Producto> {
    private int codigo;
    private String descripcion;
    private double precio;
    private Rubro rubro;
    private int stock;

    public Producto() {
    }

    public Producto(int codigo, String descripcion, double precio, Rubro rubro, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.rubro = rubro;
        this.stock = stock;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Rubro getRubro() {
        return rubro;
    }

    public void setRubro(Rubro rubro) {
        this.rubro = rubro;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public int compareTo(Producto t) {
        //0-->iguales
        //1-->mayor
        //-1-->menor
        if(this.codigo==t.codigo){
            
            return 0;
            
        }else if(this.codigo >t.codigo){
        
            return 1;
        }else {
        
            return -1;
        }
    }

   public String toString(){
   
       return codigo+" "+descripcion;
   }
    
    
}
