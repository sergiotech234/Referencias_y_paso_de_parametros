public class TestReferencia {
    public static void modificar(Caja c){
        c.setContenido("modificado");
    }
    public static void reasignar(Caja c){
        c = new Caja("Nueva");
    }
    public  static void incrementar(int n){
        n = n + 10;
    }
    public static void main(String[] args) {
        /*
        El metodo modificar lo que hace es cambiar el contenido que tiene la caja
        El metodo reasignar no cambiara la caja original, sino que solo modifca la referencia local
        El metodo incrementar no cambiara el entorno original porque los tipos primitivos se pasan por valor
         */

        Caja caja =new Caja("Original");

        modificar(caja);

        System.out.println("Despues de modificar: " +caja.getContenido());

        reasignar(caja);
        System.out.println("Despues de reasignar: "+caja.getContenido());

        int numero=5;
        incrementar(numero);
        System.out.println("Despùes de incrementar: "+numero);

        Caja a =new Caja("libro");
        Caja b=a;
        b.setContenido("Cuadernos");

        System.out.println("Contenido de a: "+ a.getContenido());

        Caja c = null;

        try {
            System.out.println(c.getContenido());
        } catch (NullPointerException e) {
            System.out.println("Se ha producido una excepción: "
                    + e);
        }
    }
}
