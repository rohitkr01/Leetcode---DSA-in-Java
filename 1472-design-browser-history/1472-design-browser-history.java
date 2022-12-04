class BrowserHistory {
    Stack<String> s;
    Stack<String> aux;

    public BrowserHistory(String homepage) {
        s = new Stack<String>();
        aux = new Stack<String>();
        s.push(homepage);
    }
    
    public void visit(String url) {
        s.push(url);
        aux.clear();
    }
    
    public String back(int steps) {
        String url;
        for(int i =0;i<steps;i++){
            if(s.size()==1)  
                break;
            aux.push(s.pop());
        }
        return s.peek();
    }
    
    public String forward(int steps) {
        for(int i=0;i<steps;i++){
            if(aux.isEmpty())
                break;
            s.push(aux.pop());
        }
        return s.peek();
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */