package com.umeng.analytics.pro;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ct {
    private static int a = Integer.MAX_VALUE;

    static {
            return
    }

    public ct() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.umeng.analytics.pro.cs a(byte[] r2, com.umeng.analytics.pro.cs r3) {
            r0 = 0
            r0 = r2[r0]
            r1 = 16
            if (r0 <= r1) goto Ld
            com.umeng.analytics.pro.ck$a r2 = new com.umeng.analytics.pro.ck$a
            r2.<init>()
            return r2
        Ld:
            int r0 = r2.length
            r1 = 1
            if (r0 <= r1) goto L1d
            r2 = r2[r1]
            r2 = r2 & 128(0x80, float:1.8E-43)
            if (r2 == 0) goto L1d
            com.umeng.analytics.pro.ck$a r2 = new com.umeng.analytics.pro.ck$a
            r2.<init>()
            return r2
        L1d:
            return r3
    }

    public static void a(int r0) {
            com.umeng.analytics.pro.ct.a = r0
            return
    }

    public static void a(com.umeng.analytics.pro.cq r1, byte r2) throws com.umeng.analytics.pro.bx {
            int r0 = com.umeng.analytics.pro.ct.a
            a(r1, r2, r0)
            return
    }

    public static void a(com.umeng.analytics.pro.cq r3, byte r4, int r5) throws com.umeng.analytics.pro.bx {
            if (r5 <= 0) goto L84
            r0 = 0
            switch(r4) {
                case 2: goto L80;
                case 3: goto L7c;
                case 4: goto L78;
                case 5: goto L6;
                case 6: goto L74;
                case 7: goto L6;
                case 8: goto L70;
                case 9: goto L6;
                case 10: goto L6c;
                case 11: goto L68;
                case 12: goto L4e;
                case 13: goto L33;
                case 14: goto L1d;
                case 15: goto L7;
                default: goto L6;
            }
        L6:
            return
        L7:
            com.umeng.analytics.pro.cm r4 = r3.p()
        Lb:
            int r1 = r4.b
            if (r0 >= r1) goto L19
            byte r1 = r4.a
            int r2 = r5 + (-1)
            a(r3, r1, r2)
            int r0 = r0 + 1
            goto Lb
        L19:
            r3.q()
            return
        L1d:
            com.umeng.analytics.pro.cu r4 = r3.r()
        L21:
            int r1 = r4.b
            if (r0 >= r1) goto L2f
            byte r1 = r4.a
            int r2 = r5 + (-1)
            a(r3, r1, r2)
            int r0 = r0 + 1
            goto L21
        L2f:
            r3.s()
            return
        L33:
            com.umeng.analytics.pro.cn r4 = r3.n()
        L37:
            int r1 = r4.c
            if (r0 >= r1) goto L4a
            byte r1 = r4.a
            int r2 = r5 + (-1)
            a(r3, r1, r2)
            byte r1 = r4.b
            a(r3, r1, r2)
            int r0 = r0 + 1
            goto L37
        L4a:
            r3.o()
            return
        L4e:
            r3.j()
        L51:
            com.umeng.analytics.pro.cl r4 = r3.l()
            byte r4 = r4.b
            if (r4 != 0) goto L5d
            r3.k()
            return
        L5d:
            int r0 = r5 + (-1)
            a(r3, r4, r0)     // Catch: java.lang.Throwable -> L66
            r3.m()
            goto L51
        L66:
            r3 = move-exception
            throw r3
        L68:
            r3.A()
            return
        L6c:
            r3.x()
            return
        L70:
            r3.w()
            return
        L74:
            r3.v()
            return
        L78:
            r3.y()
            return
        L7c:
            r3.u()
            return
        L80:
            r3.t()
            return
        L84:
            com.umeng.analytics.pro.bx r3 = new com.umeng.analytics.pro.bx
            java.lang.String r4 = "Maximum skip depth exceeded"
            r3.<init>(r4)
            throw r3
    }
}
