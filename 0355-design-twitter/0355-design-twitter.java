class Twitter {
    Map<Integer,Set<Integer>> follows; 
    List<int[]> tweets; 

    public Twitter() {
        follows=new HashMap<>();
        tweets=new ArrayList<>();
        
    }
    
    public void postTweet(int userId, int tweetId) {
        tweets.add(new int[]{userId,tweetId});
    }
    // ya kendi twetlerin ya da takip ettiklerinin tweetleri
    // 10 tane 

    public List<Integer> getNewsFeed(int userId) {
        List<Integer> list=new ArrayList<>();
        Set<Integer> followControl=follows.getOrDefault(userId,new HashSet<>());
        for(int i=tweets.size()-1;i>=0;i--){
            int uId=tweets.get(i)[0];
            int tweetId=tweets.get(i)[1];

            if((uId==userId || followControl.contains(uId)) && list.size()<10){
                list.add(tweetId);
            }
        }
        return list;
        
    }
    
    public void follow(int followerId, int followeeId) {
        follows.putIfAbsent(followerId,new HashSet<>()); 
        follows.get(followerId).add(followeeId);
     
    }
    
    public void unfollow(int followerId , int followeeId) {
        if(follows.containsKey(followerId)){
            follows.get(followerId).remove(followeeId);
        }
        
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */