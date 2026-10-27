package com.umeng.analytics.pro;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class cw extends com.umeng.analytics.pro.ck {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a implements com.umeng.analytics.pro.cs {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.umeng.analytics.pro.cs
        public com.umeng.analytics.pro.cq a(com.umeng.analytics.pro.de r2) {
                r1 = this;
                com.umeng.analytics.pro.cw r0 = new com.umeng.analytics.pro.cw
                r0.<init>(r2)
                return r0
        }
    }

    public cw(com.umeng.analytics.pro.de r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static java.util.BitSet a(byte[] r5) {
            java.util.BitSet r0 = new java.util.BitSet
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r5.length
            int r2 = r2 * 8
            if (r1 >= r2) goto L1f
            int r2 = r5.length
            int r3 = r1 / 8
            int r2 = r2 - r3
            r3 = 1
            int r2 = r2 - r3
            r2 = r5[r2]
            int r4 = r1 % 8
            int r3 = r3 << r4
            r2 = r2 & r3
            if (r2 <= 0) goto L1c
            r0.set(r1)
        L1c:
            int r1 = r1 + 1
            goto L6
        L1f:
            return r0
    }

    public static byte[] b(java.util.BitSet r6, int r7) {
            double r0 = (double) r7
            r2 = 4620693217682128896(0x4020000000000000, double:8.0)
            double r0 = r0 / r2
            double r0 = java.lang.Math.ceil(r0)
            int r7 = (int) r0
            byte[] r0 = new byte[r7]
            r1 = 0
        Lc:
            int r2 = r6.length()
            if (r1 >= r2) goto L2a
            boolean r2 = r6.get(r1)
            if (r2 == 0) goto L27
            int r2 = r1 / 8
            int r2 = r7 - r2
            r3 = 1
            int r2 = r2 - r3
            r4 = r0[r2]
            int r5 = r1 % 8
            int r3 = r3 << r5
            r3 = r3 | r4
            byte r3 = (byte) r3
            r0[r2] = r3
        L27:
            int r1 = r1 + 1
            goto Lc
        L2a:
            return r0
    }

    @Override // com.umeng.analytics.pro.cq
    public java.lang.Class<? extends com.umeng.analytics.pro.cy> D() {
            r1 = this;
            java.lang.Class<com.umeng.analytics.pro.db> r0 = com.umeng.analytics.pro.db.class
            return r0
    }

    public void a(java.util.BitSet r3, int r4) throws com.umeng.analytics.pro.bx {
            r2 = this;
            byte[] r3 = b(r3, r4)
            int r4 = r3.length
            r0 = 0
        L6:
            if (r0 >= r4) goto L10
            r1 = r3[r0]
            r2.a(r1)
            int r0 = r0 + 1
            goto L6
        L10:
            return
    }

    public java.util.BitSet b(int r5) throws com.umeng.analytics.pro.bx {
            r4 = this;
            double r0 = (double) r5
            r2 = 4620693217682128896(0x4020000000000000, double:8.0)
            double r0 = r0 / r2
            double r0 = java.lang.Math.ceil(r0)
            int r5 = (int) r0
            byte[] r0 = new byte[r5]
            r1 = 0
        Lc:
            if (r1 >= r5) goto L17
            byte r2 = r4.u()
            r0[r1] = r2
            int r1 = r1 + 1
            goto Lc
        L17:
            java.util.BitSet r5 = a(r0)
            return r5
    }
}
