/**    
 * 文件名：TestSocket.java    
 *    
 * 版本信息：    
 * 日期：2019年5月24日    
 * Copyright 足下 Corporation 2019     
 * 版权所有    
 *    
 */
package Test;

import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/**    
 *     
 * 项目名称：judt    
 * 类名称：TestSocket    
 * 类描述：    
 * 创建人：jinyu    
 * 创建时间：2019年5月24日 下午2:35:04    
 * 修改人：jinyu    
 * 修改时间：2019年5月24日 下午2:35:04    
 * 修改备注：    
 * @version     
 *     
 */
public class TestSocket {

	/**
	* @Title: main
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param args    参数
	* @return void    返回类型
	 * @throws SocketException 
	 * @throws UnknownHostException 
	*/
	public static void main(String[] args) throws SocketException, UnknownHostException {
		DatagramSocket dgp=new DatagramSocket(0);
		int port=dgp.getLocalPort();
		InetAddress local=	dgp.getLocalAddress();
		SocketAddress addr=dgp.getLocalSocketAddress();
		
		System.out.println("sss");

	}

}
