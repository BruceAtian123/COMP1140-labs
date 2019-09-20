package comp1110.lab3;

public class Bucket {
    final double capacity;
    double contents;

    public Bucket(double capacity) {
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity-contents;
    }

    public double getContents() {
        return contents;
    }

    public double empty(){
        double a = this.contents;
        this.contents = 0;
        return a;
    }

    public void add(double amount){
        if(this.contents+amount>=this.capacity){
            this.contents = this.capacity;
        }else{
            this.contents += amount;
        }
    }

    public static void main(String[] args) {
        Bucket big = new Bucket(10.0);
        Bucket small = new Bucket(1.0);
        big.add(20.0);
        small.add(20.0);
        System.out.println(big.getContents());
        System.out.println(small.getContents());
        big.empty();
        big.add(small.empty());
        small.empty();
        System.out.println(big.getContents());
        System.out.println(small.getContents());
    }
}