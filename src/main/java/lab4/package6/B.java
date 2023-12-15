package lab4.package6;

public class B {
    private int n;
    private U[] uArr;

    public B(int n){
        this.n = n;
        uArr = new U[n];
    }

    public void add(U u){
        for (int i = 0; i < n; i++) {
            if(uArr[i] == null){
                uArr[i] = u;
                return;
            }
        }
    }

    public void remove(int i){
        uArr[i] = null;
    }
    public void callAll(){
        for(int i=0;i<n;i++){
            if(uArr[i] != null){
                uArr[i].method1();
                uArr[i].method2();
            }
        }
    }
}
