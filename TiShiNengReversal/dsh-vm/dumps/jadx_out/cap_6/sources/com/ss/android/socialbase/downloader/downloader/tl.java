package com.ss.android.socialbase.downloader.downloader;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class tl {
    private boolean a;
    private com.ss.android.socialbase.downloader.g.tl ae;
    private java.util.concurrent.ExecutorService av;
    private java.util.concurrent.ExecutorService az;
    private int ch;
    private com.ss.android.socialbase.downloader.downloader.jy cw;
    private java.util.concurrent.ExecutorService f;
    private com.ss.android.socialbase.downloader.downloader.ws g;
    private java.util.concurrent.ExecutorService i;
    private final android.content.Context j;
    private java.util.List<com.ss.android.socialbase.downloader.r.ws> jy;
    private java.util.concurrent.ExecutorService kt;
    private int l;
    private com.ss.android.socialbase.downloader.g.oq m;
    private java.util.concurrent.ExecutorService mi;
    private com.ss.android.socialbase.downloader.downloader.g oq;
    private com.ss.android.socialbase.downloader.downloader.w qv;
    private com.ss.android.socialbase.downloader.downloader.oq r;
    private boolean s;
    private java.util.concurrent.ExecutorService tj;
    private com.ss.android.socialbase.downloader.g.m tl;
    private com.ss.android.socialbase.downloader.r.wq up;
    private com.ss.android.socialbase.downloader.downloader.f v;
    private com.ss.android.socialbase.downloader.tl.xt vl;
    private java.util.concurrent.ExecutorService w;
    private com.ss.android.socialbase.downloader.r.la ws;
    private int x;
    private com.ss.android.socialbase.downloader.downloader.vl xt;

    public tl(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.jy = r0
            r0 = 1
            r1.a = r0
            r0 = 1056964607(0x3effffff, float:0.49999997)
            r1.l = r0
            r1.j = r2
            return
    }

    public com.ss.android.socialbase.downloader.g.m a() {
            r1 = this;
            com.ss.android.socialbase.downloader.g.m r0 = r1.tl
            return r0
    }

    public java.util.concurrent.ExecutorService ae() {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.av
            return r0
    }

    public com.ss.android.socialbase.downloader.downloader.oq av() {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.oq r0 = r1.r
            return r0
    }

    public int az() {
            r1 = this;
            int r0 = r1.x
            return r0
    }

    public com.ss.android.socialbase.downloader.r.la ch() {
            r1 = this;
            com.ss.android.socialbase.downloader.r.la r0 = r1.ws
            return r0
    }

    public com.ss.android.socialbase.downloader.g.oq cw() {
            r1 = this;
            com.ss.android.socialbase.downloader.g.oq r0 = r1.m
            return r0
    }

    public com.ss.android.socialbase.downloader.downloader.f f() {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.f r0 = r1.v
            return r0
    }

    public java.util.concurrent.ExecutorService g() {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.w
            return r0
    }

    public android.content.Context getContext() {
            r1 = this;
            android.content.Context r0 = r1.j
            return r0
    }

    public com.ss.android.socialbase.downloader.downloader.g i() {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.g r0 = r1.oq
            return r0
    }

    public com.ss.android.socialbase.downloader.downloader.tl j(com.ss.android.socialbase.downloader.g.oq r1) {
            r0 = this;
            r0.m = r1
            return r0
    }

    public com.ss.android.socialbase.downloader.downloader.tl j(com.ss.android.socialbase.downloader.r.la r1) {
            r0 = this;
            r0.ws = r1
            return r0
    }

    public com.ss.android.socialbase.downloader.downloader.tl j(com.ss.android.socialbase.downloader.r.wq r1) {
            r0 = this;
            r0.up = r1
            return r0
    }

    public com.ss.android.socialbase.downloader.downloader.tl j(com.ss.android.socialbase.downloader.r.ws r3) {
            r2 = this;
            java.util.List<com.ss.android.socialbase.downloader.r.ws> r0 = r2.jy
            monitor-enter(r0)
            if (r3 == 0) goto L17
            java.util.List<com.ss.android.socialbase.downloader.r.ws> r1 = r2.jy     // Catch: java.lang.Throwable -> L15
            boolean r1 = r1.contains(r3)     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto Le
            goto L17
        Le:
            java.util.List<com.ss.android.socialbase.downloader.r.ws> r1 = r2.jy     // Catch: java.lang.Throwable -> L15
            r1.add(r3)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return r2
        L15:
            r3 = move-exception
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return r2
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r3
    }

    public com.ss.android.socialbase.downloader.downloader.vl j() {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.vl r0 = r1.xt
            return r0
    }

    public java.util.concurrent.ExecutorService jy() {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.f
            return r0
    }

    public com.ss.android.socialbase.downloader.downloader.w kt() {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.w r0 = r1.qv
            return r0
    }

    public com.ss.android.socialbase.downloader.downloader.ae l() {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.ae r0 = new com.ss.android.socialbase.downloader.downloader.ae
            r0.<init>(r1)
            return r0
    }

    public java.util.concurrent.ExecutorService m() {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.az
            return r0
    }

    public boolean mi() {
            r1 = this;
            boolean r0 = r1.s
            return r0
    }

    public java.util.concurrent.ExecutorService oq() {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.mi
            return r0
    }

    public java.util.concurrent.ExecutorService qv() {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.kt
            return r0
    }

    public com.ss.android.socialbase.downloader.g.tl r() {
            r1 = this;
            com.ss.android.socialbase.downloader.g.tl r0 = r1.ae
            return r0
    }

    public com.ss.android.socialbase.downloader.tl.xt s() {
            r1 = this;
            com.ss.android.socialbase.downloader.tl.xt r0 = r1.vl
            return r0
    }

    public int tj() {
            r1 = this;
            int r0 = r1.l
            return r0
    }

    public java.util.concurrent.ExecutorService tl() {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.i
            return r0
    }

    public com.ss.android.socialbase.downloader.downloader.ws up() {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.ws r0 = r1.g
            return r0
    }

    public boolean v() {
            r1 = this;
            boolean r0 = r1.a
            return r0
    }

    public java.util.concurrent.ExecutorService vl() {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.tj
            return r0
    }

    public int w() {
            r1 = this;
            int r0 = r1.ch
            return r0
    }

    public java.util.List<com.ss.android.socialbase.downloader.r.ws> ws() {
            r1 = this;
            java.util.List<com.ss.android.socialbase.downloader.r.ws> r0 = r1.jy
            return r0
    }

    public com.ss.android.socialbase.downloader.r.wq x() {
            r1 = this;
            com.ss.android.socialbase.downloader.r.wq r0 = r1.up
            return r0
    }

    public com.ss.android.socialbase.downloader.downloader.jy xt() {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.jy r0 = r1.cw
            return r0
    }
}
