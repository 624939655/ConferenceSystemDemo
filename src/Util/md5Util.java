package Util;
import java.security.MessageDigest;

public class md5Util {
    /**
     * 加密
     * @param pwd
     * @return encryptPwd
     */
	
	public static String MD5(String pwd){
		StringBuffer hexValue=new StringBuffer();
		try{
			MessageDigest mdigest=MessageDigest.getInstance("md5");
			char []c=pwd.toCharArray();
			byte []b=new byte[c.length];
			for(int i=0;i<c.length;i++){
				b[i]=(byte)c[i];
			}
			byte []md5b=mdigest.digest(b);
			for(int i=0;i<md5b.length;i++)
			{
				int val=((int) md5b[i])&0xff;
				if(val<16&&val>=0)
					hexValue.append("0");
				
				hexValue.append(Integer.toHexString(val));
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		String encryptPwd=hexValue.toString();
		return encryptPwd;
		
	}
	/**
	 * 
	 * @param inputPwd
	 * @return decryptMD5
	 */
  public static String decryptMD5(String inputPwd){
	
	  char[] a=inputPwd.toCharArray();
	  for(int i=0;i<a.length;i++){
		  a[i]=(char)(a[i]^'t');
	  }
	  String decryptPwd=new String(a);
	  return decryptPwd;
	  
  }
  public static boolean checkPwd(String pwd,String inputPwd){
	  if(MD5(pwd).equals(MD5(inputPwd)))
		  return true;
	  else
		  return false;	  
  }
 
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String("123");
		System.out.println("加密后:"+MD5(s));
		System.out.println("解密后:"+decryptMD5(decryptMD5(MD5(s))));
        System.out.print(checkPwd("1","123"));
	}

}
