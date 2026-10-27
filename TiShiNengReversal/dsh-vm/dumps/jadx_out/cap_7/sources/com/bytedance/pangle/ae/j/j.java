package com.bytedance.pangle.ae.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
class j {
    private boolean ae;
    int cw;
    private int[] g;
    int j;
    private int m;
    private boolean oq;
    private com.bytedance.pangle.ae.j.m qv;
    int r;
    private com.bytedance.pangle.ae.j.xt tl;
    int up;
    private final com.bytedance.pangle.ae.j.cw vl;
    int xt;

    public j() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.oq = r0
            com.bytedance.pangle.ae.j.cw r1 = new com.bytedance.pangle.ae.j.cw
            r1.<init>()
            r2.vl = r1
            r2.j = r0
            r0 = 1
            r2.xt = r0
            r0 = 2
            r2.cw = r0
            r0 = 3
            r2.r = r0
            r0 = 4
            r2.up = r0
            r2.r()
            return
    }

    private void r() {
            r1 = this;
            r0 = 0
            r1.g = r0
            r0 = -1
            r1.m = r0
            return
    }

    private int up(int r4) {
            r3 = this;
            int r0 = r3.m
            r1 = 2
            if (r0 != r1) goto L26
            int r0 = r4 * 5
            int[] r1 = r3.g
            int r1 = r1.length
            if (r0 >= r1) goto Ld
            return r0
        Ld:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid attribute index ("
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = ")."
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L26:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            java.lang.String r0 = "Current event is not START_TAG."
            r4.<init>(r0)
            throw r4
    }

    private void up() throws java.io.IOException {
            r7 = this;
            com.bytedance.pangle.ae.j.m r0 = r7.qv
            r1 = 1
            if (r0 != 0) goto L21
            com.bytedance.pangle.ae.j.xt r0 = r7.tl
            r2 = 524291(0x80003, float:7.34688E-40)
            r0.xt(r2)
            com.bytedance.pangle.ae.j.xt r0 = r7.tl
            r0.cw()
            com.bytedance.pangle.ae.j.xt r0 = r7.tl
            com.bytedance.pangle.ae.j.m r0 = com.bytedance.pangle.ae.j.m.j(r0)
            r7.qv = r0
            com.bytedance.pangle.ae.j.cw r0 = r7.vl
            r0.up()
            r7.oq = r1
        L21:
            int r0 = r7.m
            int r2 = r7.xt
            if (r0 != r2) goto L28
            return
        L28:
            r7.r()
        L2b:
            boolean r2 = r7.ae
            if (r2 == 0) goto L37
            r2 = 0
            r7.ae = r2
            com.bytedance.pangle.ae.j.cw r2 = r7.vl
            r2.m()
        L37:
            int r2 = r7.r
            if (r0 != r2) goto L50
            com.bytedance.pangle.ae.j.cw r2 = r7.vl
            int r2 = r2.r()
            if (r2 != r1) goto L50
            com.bytedance.pangle.ae.j.cw r2 = r7.vl
            int r2 = r2.xt()
            if (r2 != 0) goto L50
            int r0 = r7.xt
            r7.m = r0
            return
        L50:
            int r2 = r7.j
            r3 = 1048834(0x100102, float:1.46973E-39)
            if (r0 != r2) goto L5b
            r2 = 1048834(0x100102, float:1.46973E-39)
            goto L61
        L5b:
            com.bytedance.pangle.ae.j.xt r2 = r7.tl
            int r2 = r2.xt()
        L61:
            r4 = 524672(0x80180, float:7.35222E-40)
            java.lang.String r5 = ")."
            if (r2 != r4) goto L97
            com.bytedance.pangle.ae.j.xt r2 = r7.tl
            int r2 = r2.xt()
            r3 = 8
            if (r2 < r3) goto L80
            int r3 = r2 % 4
            if (r3 != 0) goto L80
            com.bytedance.pangle.ae.j.xt r3 = r7.tl
            int r2 = r2 / 4
            int r2 = r2 + (-2)
            r3.j(r2)
            goto L2b
        L80:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid resource ids size ("
            r1.<init>(r3)
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L97:
            r4 = 1048832(0x100100, float:1.469727E-39)
            if (r2 < r4) goto L157
            r6 = 1048836(0x100104, float:1.469732E-39)
            if (r2 > r6) goto L157
            if (r2 != r3) goto Lab
            r5 = -1
            if (r0 != r5) goto Lab
            int r0 = r7.j
            r7.m = r0
            return
        Lab:
            com.bytedance.pangle.ae.j.xt r5 = r7.tl
            r5.cw()
            com.bytedance.pangle.ae.j.xt r5 = r7.tl
            r5.xt()
            com.bytedance.pangle.ae.j.xt r5 = r7.tl
            r5.cw()
            if (r2 == r4) goto L131
            r5 = 1048833(0x100101, float:1.469728E-39)
            if (r2 != r5) goto Lc2
            goto L131
        Lc2:
            if (r2 != r3) goto L105
            com.bytedance.pangle.ae.j.xt r0 = r7.tl
            r0.xt()
            com.bytedance.pangle.ae.j.xt r0 = r7.tl
            r0.xt()
            com.bytedance.pangle.ae.j.xt r0 = r7.tl
            r0.cw()
            com.bytedance.pangle.ae.j.xt r0 = r7.tl
            int r0 = r0.xt()
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            com.bytedance.pangle.ae.j.xt r1 = r7.tl
            r1.xt()
            com.bytedance.pangle.ae.j.xt r1 = r7.tl
            int r0 = r0 * 5
            int[] r0 = r1.j(r0)
            r7.g = r0
            r0 = 3
        Led:
            int[] r1 = r7.g
            int r2 = r1.length
            if (r0 >= r2) goto Lfb
            r2 = r1[r0]
            int r2 = r2 >>> 24
            r1[r0] = r2
            int r0 = r0 + 5
            goto Led
        Lfb:
            com.bytedance.pangle.ae.j.cw r0 = r7.vl
            r0.up()
            int r0 = r7.cw
            r7.m = r0
            return
        L105:
            r3 = 1048835(0x100103, float:1.469731E-39)
            if (r2 != r3) goto L11b
            com.bytedance.pangle.ae.j.xt r0 = r7.tl
            r0.xt()
            com.bytedance.pangle.ae.j.xt r0 = r7.tl
            r0.xt()
            int r0 = r7.r
            r7.m = r0
            r7.ae = r1
            return
        L11b:
            if (r2 != r6) goto L2b
            com.bytedance.pangle.ae.j.xt r0 = r7.tl
            r0.xt()
            com.bytedance.pangle.ae.j.xt r0 = r7.tl
            r0.cw()
            com.bytedance.pangle.ae.j.xt r0 = r7.tl
            r0.cw()
            int r0 = r7.up
            r7.m = r0
            return
        L131:
            if (r2 != r4) goto L146
            com.bytedance.pangle.ae.j.xt r2 = r7.tl
            int r2 = r2.xt()
            com.bytedance.pangle.ae.j.xt r3 = r7.tl
            int r3 = r3.xt()
            com.bytedance.pangle.ae.j.cw r4 = r7.vl
            r4.j(r2, r3)
            goto L2b
        L146:
            com.bytedance.pangle.ae.j.xt r2 = r7.tl
            r2.cw()
            com.bytedance.pangle.ae.j.xt r2 = r7.tl
            r2.cw()
            com.bytedance.pangle.ae.j.cw r2 = r7.vl
            r2.cw()
            goto L2b
        L157:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid chunk type ("
            r1.<init>(r3)
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public int cw() {
            r2 = this;
            int r0 = r2.m
            r1 = 2
            if (r0 == r1) goto L7
            r0 = -1
            return r0
        L7:
            int[] r0 = r2.g
            int r0 = r0.length
            int r0 = r0 / 5
            return r0
    }

    public int cw(int r2) {
            r1 = this;
            int r2 = r1.up(r2)
            int[] r0 = r1.g
            int r2 = r2 + 4
            r2 = r0[r2]
            return r2
    }

    public java.lang.String j(int r2) {
            r1 = this;
            int r2 = r1.up(r2)
            int[] r0 = r1.g
            int r2 = r2 + 1
            r2 = r0[r2]
            r0 = -1
            if (r2 != r0) goto L10
            java.lang.String r2 = ""
            return r2
        L10:
            com.bytedance.pangle.ae.j.m r0 = r1.qv
            java.lang.String r2 = r0.j(r2)
            return r2
    }

    public void j() {
            r1 = this;
            boolean r0 = r1.oq
            if (r0 == 0) goto L19
            r0 = 0
            r1.oq = r0
            com.bytedance.pangle.ae.j.xt r0 = r1.tl
            r0.j()
            r0 = 0
            r1.qv = r0
            r1.tl = r0
            com.bytedance.pangle.ae.j.cw r0 = r1.vl
            r0.j()
            r1.r()
        L19:
            return
    }

    public void j(java.io.InputStream r2) {
            r1 = this;
            r1.j()
            if (r2 == 0) goto Lc
            com.bytedance.pangle.ae.j.xt r0 = new com.bytedance.pangle.ae.j.xt
            r0.<init>(r2)
            r1.tl = r0
        Lc:
            return
    }

    public java.lang.String r(int r4) {
            r3 = this;
            int r4 = r3.up(r4)
            int[] r0 = r3.g
            int r1 = r4 + 3
            r1 = r0[r1]
            r2 = 3
            if (r1 != r2) goto L18
            int r4 = r4 + 2
            r4 = r0[r4]
            com.bytedance.pangle.ae.j.m r0 = r3.qv
            java.lang.String r4 = r0.j(r4)
            return r4
        L18:
            java.lang.String r4 = ""
            return r4
    }

    public int xt() throws java.io.IOException {
            r2 = this;
            com.bytedance.pangle.ae.j.xt r0 = r2.tl     // Catch: java.io.IOException -> La
            if (r0 == 0) goto Lc
            r2.up()     // Catch: java.io.IOException -> La
            int r0 = r2.m     // Catch: java.io.IOException -> La
            return r0
        La:
            r0 = move-exception
            goto L14
        Lc:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.io.IOException -> La
            java.lang.String r1 = "Parser is not opened."
            r0.<init>(r1)     // Catch: java.io.IOException -> La
            throw r0     // Catch: java.io.IOException -> La
        L14:
            r2.j()
            throw r0
    }

    public int xt(int r2) {
            r1 = this;
            int r2 = r1.up(r2)
            int[] r0 = r1.g
            int r2 = r2 + 3
            r2 = r0[r2]
            return r2
    }
}
