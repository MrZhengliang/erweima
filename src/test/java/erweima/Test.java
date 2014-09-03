package erweima;

import java.net.URL;

import org.htmlparser.Node;
import org.htmlparser.NodeFilter;
import org.htmlparser.Parser;
import org.htmlparser.filters.AndFilter;
import org.htmlparser.filters.HasAttributeFilter;
import org.htmlparser.filters.HasChildFilter;
import org.htmlparser.filters.TagNameFilter;
import org.htmlparser.util.NodeIterator;
import org.htmlparser.util.NodeList;
import org.htmlparser.util.ParserException;
import org.htmlparser.visitors.TextExtractingVisitor;


public class Test {
	
	public static void main(String[] args) throws ParserException {
		//System.out.print("我");
		System.out.println(getPlusResult(100,1));
		
		System.out.println(getMinusResult(20,10));
	
//		  try{
//	            Parser parser = new Parser((new URL("http://127.0.0.1:8080/lncs-web/test.shtml")).openConnection() );
//	        
//	            for (NodeIterator i = parser.elements (); i.hasMoreNodes(); ) {
//	                Node node = i.nextNode();
//	                message("getText:"+node.getText());
//	                message("getPlainText:"+node.toPlainTextString());
//	                message("toHtml:"+node.toHtml());
//	                message("toHtml(true):"+node.toHtml(true));
//	                message("toHtml(false):"+node.toHtml(false));
//	                message("toString:"+node.toString());
//	                message("=================================================");
//	            }            
//	        }
//	        catch( Exception e ) {     
//	            System.out.println( "Exception:"+e );
//	            e.printStackTrace();
//	        }
//		String s = getHtml("http://127.0.0.1:8080/lncs-web/test.shtml");
//		System.out.println("s:"+s);
	}
	private static void message( String szMsg ) {
        try{ System.out.println(new String(szMsg.getBytes("UTF-8"), System.getProperty("file.encoding"))); }     catch(Exception e ){}
    }
	
	 private static String getHtml(String urlString) {  
		  try {
		   StringBuffer html = new StringBuffer();  
		   java.net.URL url = new java.net.URL(urlString);  //根据 String 表示形式创建 URL 对象。
		   java.net.HttpURLConnection conn = (java.net.HttpURLConnection) url.openConnection();// 返回一个 URLConnection 对象，它表示到 URL 所引用的远程对象的连接。
		   java.io.InputStreamReader isr = new java.io.InputStreamReader(conn.getInputStream());//返回从此打开的连接读取的输入流。
		   java.io.BufferedReader br = new java.io.BufferedReader(isr);//创建一个使用默认大小输入缓冲区的缓冲字符输入流。
		   
		   String temp;
		   while ((temp = br.readLine()) != null) {  //按行读取输出流
		    if(!temp.trim().equals("")){
		     html.append(temp).append("\n");  //读完每行后换行
		    }
		   }
		  // System.out.println(temp);
		    br.close();   //关闭
		    isr.close();  //关闭
		   return html.toString();   //返回此序列中数据的字符串表示形式。
		  } catch (Exception e) {
		   e.printStackTrace();
		   return null;
		  }
		 }
	
	 /**
	  * 计算num1到num2的和
	  * @param num1
	  * @param num2
	  * @return
	  */
	 public static int getPlusResult(int num1,int num2){
		 int result = 0;
		 int tmp;
		 if(num2<num1){
			 tmp=num1;
			 num1=num2;
			 num2=tmp;
		 }
		 for(int i=0;i<=(num2-num1);i++){
			 result+=num1+i;
		 }
		 return result;
	 }
	 /**
	  * 计算num1到num2的差
	  * @param num1
	  * @param num2
	  * @return
	  */
	 public static int getMinusResult(int num1,int num2){
		 int result = 0;
		 int tmp;
		 //将值比较大的放到num1里
		 if(num2>num1){
			 tmp=num1;
			 num1=num2;
			 num2=tmp;
		 }
		 result = num1;
		 for(int i=num1-1;i>=num2;i--){
			 result-=i;//5-4
		 }
		 return result;
	 }
	
}