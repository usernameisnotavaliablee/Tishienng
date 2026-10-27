package com.bytedance.msdk.cw.tl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class m {
    public m() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.util.List<com.bytedance.msdk.core.oq.oq> cw(java.util.List<com.bytedance.msdk.core.oq.oq> r4) {
            if (r4 == 0) goto L33
            int r0 = r4.size()
            if (r0 != 0) goto L9
            goto L33
        L9:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L12:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L32
            java.lang.Object r1 = r4.next()
            com.bytedance.msdk.core.oq.oq r1 = (com.bytedance.msdk.core.oq.oq) r1
            if (r1 == 0) goto L12
            int r2 = r1.mi()
            r3 = 1
            if (r2 == r3) goto L2e
            int r2 = r1.mi()
            r3 = 3
            if (r2 != r3) goto L12
        L2e:
            r0.add(r1)
            goto L12
        L32:
            return r0
        L33:
            r4 = 0
            return r4
    }

    public static boolean cw(int r1) {
            r0 = -100
            if (r1 != r0) goto L6
            r1 = 1
            return r1
        L6:
            r1 = 0
            return r1
    }

    public static int j(com.bytedance.msdk.core.oq.xt r0, com.bytedance.msdk.core.oq.oq r1) {
            if (r0 == 0) goto L1b
            if (r1 != 0) goto L5
            goto L1b
        L5:
            boolean r0 = r0.qv()
            if (r0 == 0) goto L16
            boolean r0 = r1.uf()
            if (r0 == 0) goto L16
            int r0 = r1.ch()
            return r0
        L16:
            int r0 = r1.x()
            return r0
        L1b:
            r0 = -999(0xfffffffffffffc19, float:NaN)
            return r0
    }

    public static int j(com.bytedance.msdk.core.oq.xt r0, com.bytedance.msdk.xt.cw r1) {
            if (r0 == 0) goto L1b
            if (r1 != 0) goto L5
            goto L1b
        L5:
            boolean r0 = r0.qv()
            if (r0 == 0) goto L16
            boolean r0 = r1.qe()
            if (r0 == 0) goto L16
            int r0 = r1.d()
            return r0
        L16:
            int r0 = r1.wi()
            return r0
        L1b:
            r0 = -999(0xfffffffffffffc19, float:NaN)
            return r0
    }

    public static java.util.List<com.bytedance.msdk.core.oq.oq> j(java.util.List<com.bytedance.msdk.core.oq.oq> r4) {
            if (r4 == 0) goto L2d
            int r0 = r4.size()
            if (r0 != 0) goto L9
            goto L2d
        L9:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L12:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r4.next()
            com.bytedance.msdk.core.oq.oq r1 = (com.bytedance.msdk.core.oq.oq) r1
            if (r1 == 0) goto L12
            int r2 = r1.mi()
            r3 = 100
            if (r2 != r3) goto L12
            r0.add(r1)
            goto L12
        L2c:
            return r0
        L2d:
            r4 = 0
            return r4
    }

    public static java.util.Map<java.lang.Integer, java.util.List<com.bytedance.msdk.core.oq.oq>> j(java.util.List<com.bytedance.msdk.core.oq.oq> r5, boolean r6) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            boolean r1 = com.bytedance.msdk.tl.p.j(r5)
            if (r1 == 0) goto Lc
            goto L4a
        Lc:
            r1 = 0
        Ld:
            int r2 = r5.size()
            if (r1 >= r2) goto L4a
            java.lang.Object r2 = r5.get(r1)
            com.bytedance.msdk.core.oq.oq r2 = (com.bytedance.msdk.core.oq.oq) r2
            if (r2 == 0) goto L47
            if (r6 == 0) goto L28
            boolean r3 = r2.uf()
            if (r3 == 0) goto L28
            int r3 = r2.ch()
            goto L2c
        L28:
            int r3 = r2.x()
        L2c:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            java.lang.Object r4 = r0.get(r4)
            java.util.List r4 = (java.util.List) r4
            if (r4 != 0) goto L3d
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L3d:
            r4.add(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r0.put(r2, r4)
        L47:
            int r1 = r1 + 1
            goto Ld
        L4a:
            return r0
    }

    public static boolean j(int r1) {
            r0 = -299(0xfffffffffffffed5, float:NaN)
            if (r1 < r0) goto La
            r0 = -100
            if (r1 >= r0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    public static boolean j(int r3, java.util.List<java.lang.Integer> r4) {
            boolean r0 = com.bytedance.msdk.tl.p.j(r4)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            int r0 = r4.size()
            if (r3 < r0) goto Lf
            return r1
        Lf:
            java.lang.Object r0 = r4.get(r3)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 > 0) goto L1c
            return r1
        L1c:
            r0 = 0
        L1d:
            if (r0 >= r3) goto L2f
            java.lang.Object r2 = r4.get(r0)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r2 <= 0) goto L2c
            return r1
        L2c:
            int r0 = r0 + 1
            goto L1d
        L2f:
            r3 = 1
            return r3
    }

    public static java.util.List<com.bytedance.msdk.core.oq.oq> xt(java.util.List<com.bytedance.msdk.core.oq.oq> r3) {
            if (r3 == 0) goto L2b
            int r0 = r3.size()
            if (r0 != 0) goto L9
            goto L2b
        L9:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L12:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r3.next()
            com.bytedance.msdk.core.oq.oq r1 = (com.bytedance.msdk.core.oq.oq) r1
            if (r1 == 0) goto L12
            int r2 = r1.mi()
            if (r2 != 0) goto L12
            r0.add(r1)
            goto L12
        L2a:
            return r0
        L2b:
            r3 = 0
            return r3
    }

    public static boolean xt(int r0) {
            if (r0 != 0) goto L4
            r0 = 1
            return r0
        L4:
            r0 = 0
            return r0
    }
}
