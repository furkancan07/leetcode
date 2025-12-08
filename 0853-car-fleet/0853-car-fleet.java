class Solution {
   /* public int carFleet(int target, int[] position, int[] speed) {
        int n=position.length;
        if(n==0) return 0;
        if(n==1) return 1;
        double[][] cars=new double[n][2]; // arabaların konumları ile ulaşma sürelerini tutacağız


        for(int i=0;i<n;i++){
            cars[i][0]=position[i]; // ilk satıra konum veriyoruz
            cars[i][1]=(double) (target-position[i])/speed[i]; // kaç saniyede ulaşacağını buluyoz
        }
        Arrays.sort(cars,(a,b)->Double.compare(b[0],a[0]));
        
      
     
      double lastTime=-1;
      int filo=0;
       for(int i=0;i<n;i++){
          double currentTime=cars[i][1];
          if(currentTime>lastTime){
            filo++;
            lastTime=currentTime;
          }
       }
       return filo;
        

    }*/
     public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
       if(n==0) return 0;
       if(n==1) return 1;
        

        
        int[][] cars = new int[n][2];
        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i]; // konum
            cars[i][1] = speed[i];    // hız
        }

        // Pozisyona göre azalan sırada sıralama
        Arrays.sort(cars, (a, b) -> b[0] - a[0]);

        int filo = 0;
        float lastTime = -1;

        
        for (int i = 0; i < n; i++) {
            float time = (float) (target - cars[i][0]) / cars[i][1];
            if (time > lastTime) {
                filo++;
                lastTime = time;
            }
        }

        return filo;
    }
}