public class UsoDeExcepciones {
    public static void main(String[] args) {
        try{
            lanzaExcepcion();
        }
        catch (Exception exception){
            System.err.println("La excepcion se manejo en main");
        }
        noLanzaExcepcion();
    }
    public static void lanzaExcepcion() throws Exception{
        try{
            System.out.println("Metodo lanzaExcepcion");
            throw new Exception();
        }
        catch (Exception exception){
            System.err.println("La excepcion se manejo en el metodo lanzaExcepcion");
            throw exception;
        }
        finally {
            System.err.println("Se ejecuto el finally en lanzaExcepcion");
        }
    }

    public static void noLanzaExcepcion(){
        try{
            System.out.println("Metodo noLanzaExcepcion");
        }
        catch (Exception exception){
            System.err.println(exception);
        }
        finally {
            System.err.println("Se ejecuto Finnaly en noLanzaExcepcion");
        }
        System.out.println("Fin del metodo noLanzaExcepcion");
    }
}
