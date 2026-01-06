// sum of all elements * ( subset of any element in array)
// 1 , 2 , 3, 4
for [] [1] [1,2] [1,3] [1,4] [1,2,3] [1,2,4] [1,3,4] =>8
for [] [2] [2,3] [1,2] [2,4] [1,2,3] [1,2,4] [2,3,4] =>8

Math.pow(2,n-1) * sum of the array

Math.pow(2,n-1) is replaced by (1<<(n-1))

for bigger values of n It is not used. so, handle this with mod
