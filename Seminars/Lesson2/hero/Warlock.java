package Seminars.Lesson2.hero;

public class Warlock extends BaseMag {
    public Warlock( String name, int x, int y ) {
        super( name, "Warlock", 30, 17, 12, 9, 5, 5 );
        super.setPos( new Point2D( x, y ) );
        super.magic = 1;
    }
}