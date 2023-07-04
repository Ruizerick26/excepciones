public class principal {
    public class main {
        public static void main(String[] args) {
            try{
                int[] myNumbres={1,2,3};
                System.out.println(myNumbres[10]);
            } catch (Exception e){
                System.out.println("Something went wrong");
            }
            finally {
                System.out.println("De todas formas voy a mostrar este mensaje");
            }
        }
    }
}
