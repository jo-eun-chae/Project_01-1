import base.*;
import myInterface.*;
import java.util.StringTokenizer;

/**
 * Write a description of class MyApp here.
 *
 * @author (2019315026 전유정)
 * @version (2020.09.16)
 */
public class MyApp
{
    /**
     * Circle 객체를 만드는 메소드
     *
     * @param  x  원의 x좌표
     * @param  y  원의 y좌표
     * @param  radian  원의 반지름
     * @return    Circle 객체
     */
    public static Circle makeCircle(Integer x, Integer y, Integer radius)
    {
        Circle c = new Circle(x, y, radius);
        return c;
    }
    
    /**
     * Interger 배열에 Stirng data를 저장하는 메소드
     *
     * @param  data  Circle 객체를 만들기 위해 필요한 정보
     * @return    배열
     */
    public static Integer[] makeToken(String dataToken)
    {
        Integer[] temp;
        int i = 0;
        String data;
        StringTokenizer array = new StringTokenizer(dataToken, ",");
        while(array.hasMoreTokens() == true){
            temp[i] += Integer.parseInt(array.nextToken());
            i++;
        
            String[] temp1 = data.split(",");
            Integer[] temp = new Integer[temp1.length];
            for(int j = 0 ; j < temp1.length ; j++){
                temp[j] = Integer.valueOf(temp1[j]);

            }
        }
        return temp;
    }

    public static void main(String[] args){
        Integer[] array;
        String data = "2,3,5,2,3,10";
        array = makeToken(data);
        
        Circle c1 = makeCircle(array[0], array[1], array[2]);
        Circle c2 = makeCircle(array[3], array[4], array[5]);
        
        System.out.println("원1 : " + c1 +" ==> 면적 : " + c1.getArea());
        System.out.println("원2 : " + c2 +" ==> 면적 : " + c2.getArea());
        if (c1.equals(c2) == true )
            System.out.println("같은 원");
        else
            System.out.println("서로 다른 원");
    }
}
