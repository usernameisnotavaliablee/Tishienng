package com.bytedance.pangle.res.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class xt {
    int ae;
    private int[] av;
    private int az;
    int cw;
    private final byte[] g;
    private int i;
    java.util.HashMap<java.lang.Integer, java.lang.Integer> j;
    private final com.bytedance.pangle.res.j.xt.j jy;
    int m;
    private com.bytedance.pangle.res.j.ae oq;
    private boolean qv;
    int r;
    private final com.bytedance.pangle.res.j.tl tl;
    int up;
    private int[] vl;
    private boolean ws;
    boolean xt;

    private static final class j {
        private int cw;
        private int[] j;
        private int xt;

        public j() {
                r1 = this;
                r1.<init>()
                r0 = 32
                int[] r0 = new int[r0]
                r1.j = r0
                return
        }

        private void j(int r4) {
                r3 = this;
                int[] r0 = r3.j
                int r1 = r0.length
                int r2 = r3.xt
                int r1 = r1 - r2
                if (r1 <= r4) goto L9
                return
            L9:
                int r4 = r0.length
                int r4 = r4 + r1
                int r4 = r4 * 2
                int[] r4 = new int[r4]
                r1 = 0
                java.lang.System.arraycopy(r0, r1, r4, r1, r2)
                r3.j = r4
                return
        }

        public boolean cw() {
                r6 = this;
                int r0 = r6.xt
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                int r2 = r0 + (-1)
                int[] r3 = r6.j
                r2 = r3[r2]
                if (r2 != 0) goto Lf
                return r1
            Lf:
                int r2 = r2 + (-1)
                int r1 = r0 + (-3)
                r3[r1] = r2
                int r4 = r2 * 2
                r5 = 1
                int r4 = r4 + r5
                int r1 = r1 - r4
                r3[r1] = r2
                int r0 = r0 + (-2)
                r6.xt = r0
                return r5
        }

        public void j() {
                r1 = this;
                r0 = 0
                r1.xt = r0
                r1.cw = r0
                return
        }

        public void j(int r8, int r9) {
                r7 = this;
                int r0 = r7.cw
                if (r0 != 0) goto L7
                r7.up()
            L7:
                r0 = 2
                r7.j(r0)
                int r1 = r7.xt
                int r2 = r1 + (-1)
                int[] r3 = r7.j
                r4 = r3[r2]
                int r5 = r1 + (-2)
                int r6 = r4 * 2
                int r5 = r5 - r6
                int r4 = r4 + 1
                r3[r5] = r4
                r3[r2] = r8
                r3[r1] = r9
                int r8 = r1 + 1
                r3[r8] = r4
                int r1 = r1 + r0
                r7.xt = r1
                return
        }

        public void m() {
                r3 = this;
                int r0 = r3.xt
                if (r0 != 0) goto L5
                goto L12
            L5:
                int r1 = r0 + (-1)
                int[] r2 = r3.j
                r1 = r2[r1]
                int r2 = r0 + (-2)
                int r1 = r1 * 2
                int r2 = r2 - r1
                if (r2 != 0) goto L13
            L12:
                return
            L13:
                int r1 = r1 + 2
                int r0 = r0 - r1
                r3.xt = r0
                int r0 = r3.cw
                int r0 = r0 + (-1)
                r3.cw = r0
                return
        }

        public int r() {
                r1 = this;
                int r0 = r1.cw
                return r0
        }

        public void up() {
                r5 = this;
                r0 = 2
                r5.j(r0)
                int r1 = r5.xt
                int[] r2 = r5.j
                r3 = 0
                r2[r1] = r3
                int r4 = r1 + 1
                r2[r4] = r3
                int r1 = r1 + r0
                r5.xt = r1
                int r0 = r5.cw
                int r0 = r0 + 1
                r5.cw = r0
                return
        }

        public int xt() {
                r2 = this;
                int r0 = r2.xt
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                int r0 = r0 + (-1)
                int[] r1 = r2.j
                r0 = r1[r0]
                return r0
        }
    }

    public xt(byte[] r3, com.bytedance.pangle.res.j.tl r4) {
            r2 = this;
            r2.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.j = r0
            r0 = 0
            r2.xt = r0
            r2.qv = r0
            com.bytedance.pangle.res.j.xt$j r1 = new com.bytedance.pangle.res.j.xt$j
            r1.<init>()
            r2.jy = r1
            r2.cw = r0
            r0 = 1
            r2.r = r0
            r0 = 2
            r2.up = r0
            r0 = 3
            r2.m = r0
            r0 = 4
            r2.ae = r0
            r2.tl = r4
            r2.g = r3
            r2.r()
            return
    }

    private void r() {
            r2 = this;
            r0 = -1
            r2.az = r0
            r1 = 0
            r2.av = r1
            r2.i = r0
            return
    }

    private void up() throws java.io.IOException {
            r10 = this;
            boolean r0 = r10.qv
            r1 = 1
            if (r0 != 0) goto L21
            com.bytedance.pangle.res.j.ae r0 = r10.oq
            r2 = 524291(0x80003, float:7.34688E-40)
            r3 = 524289(0x80001, float:7.34685E-40)
            r0.j(r2, r3)
            com.bytedance.pangle.res.j.ae r0 = r10.oq
            r0.j()
            com.bytedance.pangle.res.j.ae r0 = r10.oq
            com.bytedance.pangle.res.j.vl.j(r0)
            com.bytedance.pangle.res.j.xt$j r0 = r10.jy
            r0.up()
            r10.qv = r1
        L21:
            int r0 = r10.az
            int r2 = r10.r
            if (r0 != r2) goto L28
            return
        L28:
            r10.r()
        L2b:
            boolean r2 = r10.ws
            r3 = 0
            if (r2 == 0) goto L37
            r10.ws = r3
            com.bytedance.pangle.res.j.xt$j r2 = r10.jy
            r2.m()
        L37:
            int r2 = r10.m
            if (r0 != r2) goto L50
            com.bytedance.pangle.res.j.xt$j r2 = r10.jy
            int r2 = r2.r()
            if (r2 != r1) goto L50
            com.bytedance.pangle.res.j.xt$j r2 = r10.jy
            int r2 = r2.xt()
            if (r2 != 0) goto L50
            int r0 = r10.r
            r10.az = r0
            return
        L50:
            int r2 = r10.cw
            r4 = 1048834(0x100102, float:1.46973E-39)
            if (r0 != r2) goto L5b
            r2 = 1048834(0x100102, float:1.46973E-39)
            goto L61
        L5b:
            com.bytedance.pangle.res.j.ae r2 = r10.oq
            int r2 = r2.readInt()
        L61:
            r5 = 524672(0x80180, float:7.35222E-40)
            java.lang.String r6 = ")."
            r7 = 2
            if (r2 != r5) goto Le8
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r2 = r10.j
            r2.clear()
            com.bytedance.pangle.res.j.ae r2 = r10.oq
            int r2 = r2.readInt()
            r4 = 8
            if (r2 < r4) goto Ld1
            int r4 = r2 % 4
            if (r4 != 0) goto Ld1
            com.bytedance.pangle.res.j.ae r4 = r10.oq
            int r4 = com.bytedance.pangle.res.j.qv.j(r4)
            com.bytedance.pangle.res.j.ae r5 = r10.oq
            int r2 = r2 / 4
            int r2 = r2 - r7
            int[] r2 = r5.j(r2)
            r10.vl = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L92:
            int[] r5 = r10.vl
            int r6 = r5.length
            if (r3 >= r6) goto Lbf
            byte[] r6 = r10.g
            r5 = r5[r3]
            int r7 = r3 * 4
            int r7 = r7 + r4
            com.bytedance.pangle.res.j.tl r8 = r10.tl
            int r5 = com.bytedance.pangle.res.j.qv.j(r6, r5, r7, r8)
            r6 = 2130706432(0x7f000000, float:1.7014118E38)
            if (r5 < r6) goto Lbc
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r6 = r10.j
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            r6.put(r7, r8)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r2.add(r5)
        Lbc:
            int r3 = r3 + 1
            goto L92
        Lbf:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r2)
            java.util.Collections.sort(r3)
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L2b
            r10.xt = r1
            goto L2b
        Ld1:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid resource ids size ("
            r1.<init>(r3)
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        Le8:
            r5 = 1048832(0x100100, float:1.469727E-39)
            if (r2 < r5) goto L1ff
            r8 = 1048836(0x100104, float:1.469732E-39)
            if (r2 > r8) goto L1ff
            if (r2 != r4) goto Lfc
            r6 = -1
            if (r0 != r6) goto Lfc
            int r0 = r10.cw
            r10.az = r0
            return
        Lfc:
            com.bytedance.pangle.res.j.ae r6 = r10.oq
            r6.j()
            com.bytedance.pangle.res.j.ae r6 = r10.oq
            r6.readInt()
            com.bytedance.pangle.res.j.ae r6 = r10.oq
            r6.j()
            if (r2 == r5) goto L1d9
            r6 = 1048833(0x100101, float:1.469728E-39)
            if (r2 != r6) goto L114
            goto L1d9
        L114:
            if (r2 != r4) goto L1ad
            com.bytedance.pangle.res.j.ae r0 = r10.oq
            r0.readInt()
            com.bytedance.pangle.res.j.ae r0 = r10.oq
            r0.readInt()
            com.bytedance.pangle.res.j.ae r0 = r10.oq
            r0.j()
            com.bytedance.pangle.res.j.ae r0 = r10.oq
            int r0 = r0.readInt()
            r2 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r2
            com.bytedance.pangle.res.j.ae r4 = r10.oq
            int r4 = r4.readInt()
            r2 = r2 & r4
            int r2 = r2 - r1
            r10.i = r2
            com.bytedance.pangle.res.j.ae r2 = r10.oq
            int r2 = com.bytedance.pangle.res.j.qv.j(r2)
            com.bytedance.pangle.res.j.ae r4 = r10.oq
            int r5 = r0 * 5
            int[] r4 = r4.j(r5)
            r10.av = r4
            r4 = 3
        L14a:
            int[] r6 = r10.av
            int r8 = r6.length
            if (r4 >= r8) goto L158
            r8 = r6[r4]
            int r8 = r8 >>> 24
            r6[r4] = r8
            int r4 = r4 + 5
            goto L14a
        L158:
            int r4 = r6.length
            if (r4 != r5) goto L1a7
            r4 = 0
        L15c:
            if (r3 >= r0) goto L18e
            int[] r5 = r10.av
            int r6 = r3 * 5
            int r8 = r6 + 1
            r5 = r5[r8]
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r8 = r10.j
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            boolean r5 = r8.containsKey(r5)
            if (r5 == 0) goto L173
            r4 = 1
        L173:
            int[] r5 = r10.av
            int r8 = r6 + 3
            r8 = r5[r8]
            if (r8 == r1) goto L17d
            if (r8 != r7) goto L18b
        L17d:
            int r6 = r6 + 4
            r5 = r5[r6]
            byte[] r8 = r10.g
            int r6 = r6 * 4
            int r6 = r6 + r2
            com.bytedance.pangle.res.j.tl r9 = r10.tl
            com.bytedance.pangle.res.j.qv.j(r8, r5, r6, r9)
        L18b:
            int r3 = r3 + 1
            goto L15c
        L18e:
            if (r4 == 0) goto L19d
            boolean r1 = r10.xt
            if (r1 == 0) goto L19d
            byte[] r1 = r10.g
            int[] r3 = r10.av
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r4 = r10.j
            com.bytedance.pangle.res.j.qv.j(r2, r1, r3, r0, r4)
        L19d:
            com.bytedance.pangle.res.j.xt$j r0 = r10.jy
            r0.up()
            int r0 = r10.up
            r10.az = r0
            return
        L1a7:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L1ad:
            r3 = 1048835(0x100103, float:1.469731E-39)
            if (r2 != r3) goto L1c3
            com.bytedance.pangle.res.j.ae r0 = r10.oq
            r0.readInt()
            com.bytedance.pangle.res.j.ae r0 = r10.oq
            r0.readInt()
            int r0 = r10.m
            r10.az = r0
            r10.ws = r1
            return
        L1c3:
            if (r2 != r8) goto L2b
            com.bytedance.pangle.res.j.ae r0 = r10.oq
            r0.readInt()
            com.bytedance.pangle.res.j.ae r0 = r10.oq
            r0.j()
            com.bytedance.pangle.res.j.ae r0 = r10.oq
            r0.j()
            int r0 = r10.ae
            r10.az = r0
            return
        L1d9:
            if (r2 != r5) goto L1ee
            com.bytedance.pangle.res.j.ae r2 = r10.oq
            int r2 = r2.readInt()
            com.bytedance.pangle.res.j.ae r3 = r10.oq
            int r3 = r3.readInt()
            com.bytedance.pangle.res.j.xt$j r4 = r10.jy
            r4.j(r2, r3)
            goto L2b
        L1ee:
            com.bytedance.pangle.res.j.ae r2 = r10.oq
            r2.j()
            com.bytedance.pangle.res.j.ae r2 = r10.oq
            r2.j()
            com.bytedance.pangle.res.j.xt$j r2 = r10.jy
            r2.cw()
            goto L2b
        L1ff:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid chunk type ("
            r1.<init>(r3)
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public int cw() throws java.io.IOException {
            r1 = this;
            int r0 = r1.xt()
            return r0
    }

    public void j() {
            r1 = this;
            boolean r0 = r1.qv
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 0
            r1.qv = r0
            r0 = 0
            r1.oq = r0
            r1.vl = r0
            com.bytedance.pangle.res.j.xt$j r0 = r1.jy
            r0.j()
            r1.r()
            return
    }

    public void j(java.io.InputStream r4) {
            r3 = this;
            r3.j()
            if (r4 == 0) goto L16
            com.bytedance.pangle.res.j.ae r0 = new com.bytedance.pangle.res.j.ae
            com.bytedance.pangle.res.j.g r1 = new com.bytedance.pangle.res.j.g
            com.bytedance.pangle.res.j.up r2 = new com.bytedance.pangle.res.j.up
            r2.<init>(r4)
            r1.<init>(r2)
            r0.<init>(r1)
            r3.oq = r0
        L16:
            return
    }

    public int xt() throws java.io.IOException {
            r2 = this;
            com.bytedance.pangle.res.j.ae r0 = r2.oq
            if (r0 == 0) goto Lf
            r2.up()     // Catch: java.io.IOException -> La
            int r0 = r2.az     // Catch: java.io.IOException -> La
            return r0
        La:
            r0 = move-exception
            r2.j()
            throw r0
        Lf:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Parser is not opened."
            r0.<init>(r1)
            throw r0
    }

    public void xt(java.io.InputStream r1) {
            r0 = this;
            r0.j(r1)
            return
    }
}
