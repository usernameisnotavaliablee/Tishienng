package com.ss.android.socialbase.downloader.qv;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class g {
    private int ae;
    private final long cw;
    volatile com.ss.android.socialbase.downloader.qv.jy j;
    private long m;
    private final java.util.concurrent.atomic.AtomicLong r;
    private org.json.JSONObject tl;
    private volatile long up;
    int xt;


    public g(long r3, long r5) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>()
            r2.r = r0
            r1 = 0
            r2.xt = r1
            r2.cw = r3
            r0.set(r3)
            r2.up = r3
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L1b
            r2.m = r5
            return
        L1b:
            r3 = -1
            r2.m = r3
            return
    }

    public g(com.ss.android.socialbase.downloader.qv.g r4) {
            r3 = this;
            r3.<init>()
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>()
            r3.r = r0
            r1 = 0
            r3.xt = r1
            long r1 = r4.cw
            r3.cw = r1
            long r1 = r4.m
            r3.m = r1
            java.util.concurrent.atomic.AtomicLong r1 = r4.r
            long r1 = r1.get()
            r0.set(r1)
            long r0 = r0.get()
            r3.up = r0
            int r4 = r4.ae
            r3.ae = r4
            return
    }

    public g(org.json.JSONObject r3) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>()
            r2.r = r0
            r0 = 0
            r2.xt = r0
            java.lang.String r0 = "st"
            long r0 = r3.optLong(r0)
            r2.cw = r0
            java.lang.String r0 = "en"
            long r0 = r3.optLong(r0)
            r2.cw(r0)
            java.lang.String r0 = "cu"
            long r0 = r3.optLong(r0)
            r2.j(r0)
            long r0 = r2.r()
            r2.r(r0)
            return
    }

    public static java.lang.String j(java.util.List<com.ss.android.socialbase.downloader.qv.g> r2) {
            if (r2 == 0) goto L34
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L9
            goto L34
        L9:
            com.ss.android.socialbase.downloader.qv.g$1 r0 = new com.ss.android.socialbase.downloader.qv.g$1
            r0.<init>()
            java.util.Collections.sort(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Iterator r2 = r2.iterator()
        L1a:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r2.next()
            com.ss.android.socialbase.downloader.qv.g r1 = (com.ss.android.socialbase.downloader.qv.g) r1
            r0.append(r1)
            java.lang.String r1 = "\r\n"
            r0.append(r1)
            goto L1a
        L2f:
            java.lang.String r2 = r0.toString()
            return r2
        L34:
            r2 = 0
            return r2
    }

    public int ae() {
            r1 = this;
            int r0 = r1.ae
            return r0
    }

    public long cw() {
            r2 = this;
            long r0 = r2.cw
            return r0
    }

    void cw(long r4) {
            r3 = this;
            long r0 = r3.cw
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L9
            r3.m = r4
            return
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "setEndOffset: endOffset = "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r1 = ", segment = "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Segment"
            com.bytedance.sdk.component.utils.vl.xt(r1, r0)
            r0 = -1
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto L2c
            r3.m = r4
        L2c:
            return
    }

    void g() {
            r1 = this;
            int r0 = r1.xt
            int r0 = r0 + (-1)
            r1.xt = r0
            return
    }

    public long j() {
            r4 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r4.r
            long r0 = r0.get()
            long r2 = r4.cw
            long r0 = r0 - r2
            return r0
    }

    void j(int r1) {
            r0 = this;
            r0.ae = r1
            return
    }

    public void j(long r6) {
            r5 = this;
            long r0 = r5.cw
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 >= 0) goto L7
            r6 = r0
        L7:
            long r0 = r5.m
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L17
            r2 = 1
            long r0 = r0 + r2
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 <= 0) goto L17
            r6 = r0
        L17:
            java.util.concurrent.atomic.AtomicLong r0 = r5.r
            r0.set(r6)
            return
    }

    public long m() {
            r2 = this;
            long r0 = r2.m
            return r0
    }

    int oq() {
            r1 = this;
            int r0 = r1.xt
            return r0
    }

    public org.json.JSONObject qv() throws org.json.JSONException {
            r4 = this;
            org.json.JSONObject r0 = r4.tl
            if (r0 != 0) goto Lb
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            r4.tl = r0
        Lb:
            java.lang.String r1 = "st"
            long r2 = r4.cw()
            r0.put(r1, r2)
            java.lang.String r1 = "cu"
            long r2 = r4.r()
            r0.put(r1, r2)
            java.lang.String r1 = "en"
            long r2 = r4.m()
            r0.put(r1, r2)
            return r0
    }

    public long r() {
            r7 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r7.r
            long r0 = r0.get()
            long r2 = r7.m
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L16
            r4 = 1
            long r2 = r2 + r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L16
            return r2
        L16:
            return r0
    }

    public void r(long r4) {
            r3 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r3.r
            long r0 = r0.get()
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto Lc
            r3.up = r4
        Lc:
            return
    }

    void tl() {
            r1 = this;
            int r0 = r1.xt
            int r0 = r0 + 1
            r1.xt = r0
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Segment{startOffset="
            r0.<init>(r1)
            long r1 = r3.cw
            r0.append(r1)
            java.lang.String r1 = ",\t currentOffset="
            r0.append(r1)
            java.util.concurrent.atomic.AtomicLong r1 = r3.r
            r0.append(r1)
            java.lang.String r1 = ",\t currentOffsetRead="
            r0.append(r1)
            long r1 = r3.up()
            r0.append(r1)
            java.lang.String r1 = ",\t endOffset="
            r0.append(r1)
            long r1 = r3.m
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public long up() {
            r5 = this;
            com.ss.android.socialbase.downloader.qv.jy r0 = r5.j
            if (r0 == 0) goto Lf
            long r0 = r0.r()
            long r2 = r5.up
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto Lf
            return r0
        Lf:
            long r0 = r5.up
            return r0
    }

    public long xt() {
            r5 = this;
            long r0 = r5.m
            long r2 = r5.cw
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L11
            long r2 = r5.up()
            long r0 = r0 - r2
            r2 = 1
            long r0 = r0 + r2
            return r0
        L11:
            r0 = -1
            return r0
    }

    void xt(int r1) {
            r0 = this;
            r0.xt = r1
            return
    }

    void xt(long r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r1.r
            r0.addAndGet(r2)
            return
    }
}
