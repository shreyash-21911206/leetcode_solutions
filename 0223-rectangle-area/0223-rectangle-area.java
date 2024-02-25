class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int finalArea =0;
        int xSide1 = ax2-ax1;
        int ySide1 = ay2-ay1;
        int xSide2 = bx2-bx1;
        int ySide2 = by2-by1;
        int area1 = xSide1 * ySide1;
        int area2 = xSide2 * ySide2;
        if(ax1>=bx2 || bx1>=ax2){
            finalArea = area1+area2;
            return finalArea;
        }
        if(ay1>=by2 || by1>=ay2){
            finalArea = area1+area2;
            return finalArea;
        }
        int ptAx = Math.max(ax1,bx1);
        int ptAy = Math.max(ay1,by1);
        int ptBx = Math.min(ax2,bx2);
        int ptBy = Math.min(ay2,by2);
        int xSide3 = ptBx - ptAx;
        int ySide3 = ptBy - ptAy;
        int area3 = xSide3*ySide3;
        return area1+area2-area3;
        
        
    }
}