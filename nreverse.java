     class nreverse
	{
          public static void main(String args[])
		{
		  int no=153 ,a,b,c,tn=0;
                  	a=no%10;
        		tn=tn*10+a;
                        b=no/10;
                        b=b%10;
                        tn=tn*10+b;
                        c=no/10;
                        c=c/10;
                        tn=tn*10+c;
                        System.out.println(tn);

		}
	}
                  