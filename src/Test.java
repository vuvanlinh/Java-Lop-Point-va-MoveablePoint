public class Test {
    public static void main(String[] args) {
        Point point = new Point(5, 5);
        System.out.println(point);

        MoveablePoint moveablePoint = new MoveablePoint(5, 5, 3, 2);
        System.out.println(MoveablePoint.move(moveablePoint));
        System.out.println(MoveablePoint.move(moveablePoint));



    }
}
