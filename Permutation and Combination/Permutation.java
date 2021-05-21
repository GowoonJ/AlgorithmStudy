package org.inu.practice;

/*
    알고리즘 문제에서 자주 이용하는 순열 알고리즘 구현
    1. SWAP 이용
    2. DFS 이용
**/
public class Permutation {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,4,5};
        int n = arr.length;

        boolean[] visited = new boolean[n];
        int[] output = new int[n];
    }

    // 1. 배열 처음부터 순서대로 바꾸면서 swap
    // 순서보장 X
    static void swapPermutation(int[] arr, int depth, int n, int r){
        if(depth == r){
            return;
        }
        for (int i = depth ; i<n ; i++) {
            swap(arr, depth, i);
            swapPermutation(arr, depth+1, n, r);
            swap(arr, depth, i);
        }
    }

    static void swap(int[] arr, int depth, int i){
        int temp = arr[depth];
        arr[depth] = arr[i];
        arr[i] = temp;
    }

    // 2. DFS 사용한 순열
    // 순서 유지 가능
    // depth == output에 들어간 숫자 길이
    static void dfsPermutation(int[] arr, int[] output, boolean[] visited, int depth, int n, int r){
        if(depth == r){
            // 순열 출력
            return;
        }
        for (int i = 0; i < n; i++) {
            if(visited[i] != true) {
                visited[i] = true; // true로 바꾸어 중복 방지
                output[depth] = arr[i];
                dfsPermutation(arr, output, visited, depth+1, n, r);
                visited[i] = false;
            }
        }
    }

//    public static void sequentialPermutation (int depth, int r){
//        if(depth == r){
//            for(int n : output){
//
//            }
//            return ;
//        }
//        for(int i = 0; i<4; i++){
//            output[depth] = i;
//            sequentialPermutation(depth+1, r);
//        }
//    }
}
