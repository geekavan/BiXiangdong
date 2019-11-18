class Test{
    public static void main(String[] args){
        BoundedBuffer b = new BoundedBuffer();

        Thread t0 = new Thread( new Runnable(){
            public void run(){
                while(true){
                    try{
                    b.put("xixi");
                    }
                    catch(Exception e){}
                }
            }
        });

        Thread t1 = new Thread( new Runnable(){
            public void run(){
                while(true){
                    try{
                    b.take();
                    }
                    catch(Exception e){}
                }
            }
        });

        Thread t2 = new Thread( new Runnable(){
            public void run(){
                while(true){
                    try{
                    b.take();
                    }
                    catch(Exception e){}
                }
            }
        });

        t0.start();
        t1.start();
        t2.start();
    }
}