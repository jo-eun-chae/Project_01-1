package base;

/**
 * Circle 클래스
 *
 * @author (2019315011 조은채)
 * @version (2020.09.16)
 */
public class Circle
{
    public int x; // 원의 x좌표
    public int y; // 원의 y좌표
    public int radius; // 원의 반지름
    
    /**
     * Constructor for objects of class Circle
     */
    public Circle(int x, int y, int radius)
    {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    /**
     * 같은 원인지 아닌지 판단하는 메소드
     *
     * @param  obj  Circle 메소드에서 만든 객체
     * @return    true or false
     */
    public boolean equals(Object obj)
    {
        Circle c = (Circle)obj;
        if((this.x == c.x) && (this.y == c.y))
            return true;
        else
            return false;
    }
}
