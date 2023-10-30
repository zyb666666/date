
import java.math.BigDecimal;
import java.text.SimpleDateFormat;

/**
 *
 *
 * @author Kelly
 *
 *//*
 * @Author: zyb666666 2419299610@qq.com
 * @Date: 2023-10-30 10:25:42
 * @LastEditors: zyb666666 2419299610@qq.com
 * @LastEditTime: 2023-10-30 10:25:50
 * @FilePath: \date\1.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
public class WindowsTimeTest {
    public static void main(String[] args) {

        String dateTime1 = "1601-01-01 00:00:00";

        //修改成你要改的日期时间
        String dateTime2 = "2023-09-25 10:00:00";
        try{
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            //日期时间,毫秒
            long time2 = sdf.parse(dateTime2).getTime();
            //毫秒转为秒
            System.out.println("CMD->systeminfo->安装日期："+(time2/1000));

            long m = time2 - sdf.parse(dateTime1).getTime();
            //毫秒转为纳秒
            BigDecimal bigDecimal1 =  BigDecimal.valueOf(m);
            BigDecimal bigDecimal2 =BigDecimal.valueOf(1000000);
            BigDecimal multiply = bigDecimal1.multiply(bigDecimal2);
            //取前18位输出
            System.out.println("系统->关于->安装日期："+multiply.toPlainString().substring(0,18));


        }catch(Exception e){
        }
    }
}