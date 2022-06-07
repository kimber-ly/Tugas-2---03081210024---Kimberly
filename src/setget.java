public class setget {
    public int P, L, t;

    public void setp(int P){
        this.P = P;
    }
    public float getp(int P){
        return P;
    }

    public void setl(int l){
        this.L = l;
    }
    public float getl(int l){
        return l;
    }
    
    public void sett(int t){
        this.t = t;
    }
    public float gett(float t){
        return t;
    }
    public int HitungVolume(){
        return P*L*t;
    }
}