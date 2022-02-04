package ie.jtapia.staircasesspring.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class StaircasesController {
	long [][] dp = new long[501][501];
    int minValue = 5;
    int maxValue = 500;
	

    @GetMapping("/result")
    public long Staircases1017(@RequestParam(name = "number", required = true) int number){
        
        int n = number; 
    
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= n; j++){
                dp[i][j]= -1;
            }
        }
            
        return  Solve(n,n-1); 
    }
    
    public long Solve(int i, int j){
    
        if(i == 0) return 1;
        if(j == 0) return 0;
        if(dp[i][j] == -1){
            dp[i][j]=Solve(i,j-1);
            if(i >= j){
                dp[i][j] += Solve(i - j, j - 1);
            }
        }
        return dp[i][j];
        
    }

}
