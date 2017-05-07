/*
Static initialization blocks
Static initialization blocks are executed when the class is loaded, and you can initialize static variables in those blocks.

It's time to test your knowledge of Static initialization blocks
*/

static int B;
static int H;
static boolean flag=true;

static {
Scanner s = new Scanner(System.in);
    int str1 = s.nextInt();
    int str2 = s.nextInt();
    B = str1;
    H = str2;
 try {
       if(B<=0||H<=0)
        {
        flag =false;
        throw new Exception();
       }
   } catch(Exception e){
      System.out.println(e+": Breadth and height must be positive");
 }

}