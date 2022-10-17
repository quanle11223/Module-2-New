package Bai6;

public class Point3D extends Point2D {
        public float z = 0.0f;

        public Point3D(){
        }
        public Point3D(float x , float y , float z) {
        }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x , float y , float z){

    }
    public float[] getXYZ(){
            return new float[]{x, y, z};
    }
    public String toString(){
           return String.valueOf((x + y + z));
    }
}
