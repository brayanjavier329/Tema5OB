public class Main {
    public static void main(String[] args) {
        //Se crea un objeto instanciando a la interface CocheCRUD de tipo CocheCRUDImpl
        CocheCRUD autoCRUD= new CocheCRUDImpl();
        //Y ahora se llaman a los metodos que implementó la clase CocheCRUDImpl de la interface CocheCRUD
        autoCRUD.delete();
        autoCRUD.findAll();
        autoCRUD.save();
    }
}