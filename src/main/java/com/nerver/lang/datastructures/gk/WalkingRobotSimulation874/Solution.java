package com.nerver.lang.datastructures.gk.WalkingRobotSimulation874;

import com.nerver.lang.datastructures.gk.ValidParentheses20.Solution2;
import com.sun.xml.internal.ws.api.client.WSPortInfo;

import javax.sound.midi.Soundbank;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    /**
     * Input: commands = [4,-1,3], obstacles = []
     * Output: 25
     * Input: commands = [4,-1,4,-2,4], obstacles = [[2,4]]
     * Output: 65
     *
     * 注意方向控制
     * 注意 两个坐标降维处理
     * @param commands
     * @return
     */
    public int robotSim(int[] commands,int[][] obstacles){
        int[] dx = new int[]{0,1,0,-1};
        int[] dy = new int[]{1,0,-1,0};
        int x = 0,y = 0,di =0;
        Set<Long> obstacleSet = new HashSet<>();
        for (int[] obstacle:obstacles){
            long ox = (long) obstacle[0]+30000;
            long oy = (long) obstacle[1]+30000;
            obstacleSet.add((ox<<16)+oy);
        }
        int ans = 0;
        for (int cmd : commands){
            if(cmd == -2) {
                //left
                di = (di+3)%4;
            }else if(cmd == -1) {
                di = (di+1)%4;
            }else {
                for (int k =0;k<cmd;++k){
                    int nx = x+dx[di];
                    int ny = y+dy[di];
                    long code = (((long)nx+30000)<<16)+((long)ny+30000);
                    if(!obstacleSet.contains(code)){
                        x = nx;
                        y = ny;
                        ans = Math.max(ans,x*x+y*y);
                    }
                }
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int[] test = new int[]{4,-1,3};
        int[][] ob = new int[][]{};
        System.out.println(new Solution().robotSim(test,ob));
        System.out.println();

        /*System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(3%4);
        System.out.println(1%4);
        System.out.println(5%4);*/
    }
}
