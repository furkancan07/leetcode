/*
 tek sekmelş ana sayfa 
ilk sayfa her zaman homepage
/
//  a  pointer 2 
 //   pointer =0 size 3 
 // list.add() a
 */
class BrowserHistory {
    int pointer;
    List<String> pages; 

    public BrowserHistory(String homepage) {
        pages=new ArrayList<>();
        pages.add(homepage);
        pointer=0;
        
    }
    // ileriye dönülk silmek lazım
    public void visit(String url) {
         while(pages.size()>pointer+1){
           pages.remove(pages.size()-1);
        }
        pages.add(url);
        pointer++;
        
    }
    
    public String back(int steps) {
        pointer=Math.max(0,pointer-steps);
        return pages.get(pointer);
        
    }
    
    public String forward(int steps) {
        pointer=Math.min(pages.size()-1,pointer+steps);
        return pages.get(pointer);
        
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */