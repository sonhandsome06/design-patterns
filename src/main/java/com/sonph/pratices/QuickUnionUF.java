package com.sonph.pratices;

public class QuickUnionUF {
    private int [] id;

    public QuickUnionUF(int N) {
        id = new int[N];
        for (int i=0; i < N; i++) {
            id[i] = i;
        }
    }
    private int root(int i) {
        while (i !=id[i])
            i = id[i];
        return i;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }

    public static void main(String[] args) {
        QuickUnionUF quickUnionUF = new QuickUnionUF(1000000);
        quickUnionUF.union(999999,5);
    }
}
