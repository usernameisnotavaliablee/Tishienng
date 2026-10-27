package com.umeng.analytics.pro;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class bq extends com.umeng.analytics.pro.bx {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    public static final int g = 6;
    public static final int h = 7;
    private static final com.umeng.analytics.pro.cv j = null;
    private static final com.umeng.analytics.pro.cl k = null;
    private static final com.umeng.analytics.pro.cl l = null;
    private static final long m = 1;
    protected int i;

    static {
            com.umeng.analytics.pro.cv r0 = new com.umeng.analytics.pro.cv
            java.lang.String r1 = "TApplicationException"
            r0.<init>(r1)
            com.umeng.analytics.pro.bq.j = r0
            com.umeng.analytics.pro.cl r0 = new com.umeng.analytics.pro.cl
            r1 = 11
            r2 = 1
            java.lang.String r3 = "message"
            r0.<init>(r3, r1, r2)
            com.umeng.analytics.pro.bq.k = r0
            com.umeng.analytics.pro.cl r0 = new com.umeng.analytics.pro.cl
            r1 = 8
            r2 = 2
            java.lang.String r3 = "type"
            r0.<init>(r3, r1, r2)
            com.umeng.analytics.pro.bq.l = r0
            return
    }

    public bq() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.i = r0
            return
    }

    public bq(int r1) {
            r0 = this;
            r0.<init>()
            r0.i = r1
            return
    }

    public bq(int r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r2)
            r0.i = r1
            return
    }

    public bq(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.i = r1
            return
    }

    public static com.umeng.analytics.pro.bq a(com.umeng.analytics.pro.cq r5) throws com.umeng.analytics.pro.bx {
            r5.j()
            r0 = 0
            r1 = 0
        L5:
            com.umeng.analytics.pro.cl r2 = r5.l()
            byte r3 = r2.b
            if (r3 != 0) goto L16
            r5.k()
            com.umeng.analytics.pro.bq r5 = new com.umeng.analytics.pro.bq
            r5.<init>(r1, r0)
            return r5
        L16:
            short r2 = r2.c
            r4 = 1
            if (r2 == r4) goto L2f
            r4 = 2
            if (r2 == r4) goto L22
            com.umeng.analytics.pro.ct.a(r5, r3)
            goto L3b
        L22:
            r2 = 8
            if (r3 != r2) goto L2b
            int r1 = r5.w()
            goto L3b
        L2b:
            com.umeng.analytics.pro.ct.a(r5, r3)
            goto L3b
        L2f:
            r2 = 11
            if (r3 != r2) goto L38
            java.lang.String r0 = r5.z()
            goto L3b
        L38:
            com.umeng.analytics.pro.ct.a(r5, r3)
        L3b:
            r5.m()
            goto L5
    }

    public int a() {
            r1 = this;
            int r0 = r1.i
            return r0
    }

    public void b(com.umeng.analytics.pro.cq r2) throws com.umeng.analytics.pro.bx {
            r1 = this;
            com.umeng.analytics.pro.cv r0 = com.umeng.analytics.pro.bq.j
            r2.a(r0)
            java.lang.String r0 = r1.getMessage()
            if (r0 == 0) goto L1a
            com.umeng.analytics.pro.cl r0 = com.umeng.analytics.pro.bq.k
            r2.a(r0)
            java.lang.String r0 = r1.getMessage()
            r2.a(r0)
            r2.c()
        L1a:
            com.umeng.analytics.pro.cl r0 = com.umeng.analytics.pro.bq.l
            r2.a(r0)
            int r0 = r1.i
            r2.a(r0)
            r2.c()
            r2.d()
            r2.b()
            return
    }
}
