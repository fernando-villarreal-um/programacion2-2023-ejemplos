package prod_cons;

public class Borrarme {

    protected Object llave;

    public boolean llamado1(String dato) {
        String var1 = "var1";
        String var2 = "var2";
        String var3 = "var3";
        String var4 = "var4";
        String var5 = "var5";
        String var6 = "var6";
        return true;
    }

    public boolean llamado2(String dato) {
        String var1 = "var1";
        String var2 = "var2";
        synchronized (this.llave) {
            String var3 = "var3";
            String var4 = "var4";
        }
        String var5 = "var5";
        String var6 = "var6";
        return true;
    }

    public boolean llamado3(String dato) {
        String var1 = "var1";
        String var2 = "var2";
        synchronized (this) {
            String var3 = "var3";
            String var4 = "var4";
        }
        String var5 = "var5";
        String var6 = "var6";
        return true;
    }


}
