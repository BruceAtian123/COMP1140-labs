package comp1110.lab3;

public class stackableBucket extends Bucket{
    stackableBucket innerBucket;
    String name;

    public stackableBucket(double capacity, String name) {
        super(capacity);
        this.name = name;
    }

    public String getInnerBucket() {
        return innerBucket.name;
    }

    public void setInnerBucket(stackableBucket smallerBucket) {
        if(smallerBucket.getCapacity()>super.getCapacity()){
            System.out.println("Too large to stack!");
        }else if(smallerBucket.getCapacity()<=super.getCapacity()&&this.innerBucket==null){
            this.innerBucket = smallerBucket;
        }else if(smallerBucket.getCapacity()<=super.getCapacity()&&this.innerBucket!=null){
            this.innerBucket.setInnerBucket(smallerBucket);
        }
    }

    public static void main(String[] args) {
        stackableBucket b = new stackableBucket(10.0,"big");
        stackableBucket m = new stackableBucket(5.0,"medium");
        stackableBucket s = new stackableBucket(1.0,"small");
        m.setInnerBucket(b);
        b.setInnerBucket(m);
        System.out.println(b.getInnerBucket());
        b.setInnerBucket(s);
        System.out.println(b.getInnerBucket());
        System.out.println(m.getInnerBucket());
    }
}