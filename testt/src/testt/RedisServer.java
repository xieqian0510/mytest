package testt;

import org.omg.CORBA.PUBLIC_MEMBER;

public class RedisServer {


	public void redisPool(){
		System.out.print("begin");
		
		System.out.print("getPool");
		
		System.out.print("end");
	}
	
	public void set(){
		System.out.print("begin");

		System.out.print("set 1");
		
		System.out.print("end");
	}

	
	public void get(){
		RedisServers.comPool(new IRedis(){
			public  void  fun(){
				System.out.print("get 1");
			}
			
		});
	}

}

class RedisServers{
	public static void comPool(IRedis rrss){
		System.out.print("begin");
		rrss.fun();
		System.out.print("end");
	}
}



