/**    
 * 文件名：TestRecFile.java    
 *    
 * 版本信息：    
 * 日期：2017年8月27日    
 * Copyright 足下 Corporation 2017     
 * 版权所有    
 *    
 */
package Test;

import java.io.IOException;

import judp.judpRecviceFile;

/**    
 *     
 * 项目名称：judp    
 * 类名称：TestRecFile    
 * 类描述：    
 * 创建人：jinyu    
 * 创建时间：2017年8月27日 下午6:32:42    
 * 修改人：jinyu    
 * 修改时间：2017年8月27日 下午6:32:42    
 * 修改备注：    
 * @version     
 *     
 */
public class TestRecFile {
    
    public static void main(String[] args) {
        judpRecviceFile rec=new judpRecviceFile("192.168.3.104", 5555, "E:\\Study\\java\\filesudt\\send\\12.qlv", "E:\\Study\\java\\filesudt\\rec\\13.rmvb");
        rec.start();
        try {
            System.in.read();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
