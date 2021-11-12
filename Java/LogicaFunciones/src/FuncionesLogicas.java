public class FuncionesLogicas {
    public static void main(String [] args){
        System.out.println(dospares(6,4));
        
    }

    public static boolean dospares (int a, int b){
        return par (a) && par (b);
    }
}
