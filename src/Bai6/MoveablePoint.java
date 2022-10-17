package Bai6;

public class MoveablePoint extends Point{
        public float xSpeed = 0.0f;
        public float ySpeed = 0.0f;
         public float [] floats = {x,y};

        public MoveablePoint(){

        }
        public MoveablePoint(float xSpeed, float ySpeed){
            this.ySpeed = ySpeed;
            this.xSpeed = xSpeed;
        }
        public MoveablePoint(float xSpeed, float ySpeed, float x, float y) {
        }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){

    }
    public float[] getSpeed(){
            return new float[]{floats[2]};
    }
    public String toString(){
            return "(x,y), speed = (xs,ys)";
    }
    public MoveablePoint move(){
            x += xSpeed;
            y += ySpeed;
            return this;
    }
}
