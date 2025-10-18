def grid(m,n):
  dp = [ [1]*n for _ in range (m)]
  for i in range(1,n):
    for j in range(1,m):
      dp[i][j] = dp[i-1][j] + dp[i][j-1]
  return dp
print(grid(3,3)) 