public class MoveablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    MoveablePoint() {

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

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] getSpeed = {getxSpeed(), getySpeed()};
        return getSpeed;
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + ")" + "," +
                "speed=" + "(" + xSpeed + "," + ySpeed + ")";
    }

    public static MoveablePoint move(MoveablePoint move) {
        float x, y;
        x = move.getX();
        y = move.getY();
        x += move.getxSpeed();
        y += move.getySpeed();
        move.setXY(x, y);
        return move;
    }
}
