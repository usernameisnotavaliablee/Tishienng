package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class pblx extends ms.bz.bd.c.Pgl.pbly.pgla {
    public pblx() {
            r0 = this;
            r0.<init>()
            return
    }

    protected static void c(java.io.BufferedInputStream r6) {
            if (r6 == 0) goto L17
            r6.close()     // Catch: java.io.IOException -> L6
            return
        L6:
            r6 = 5
            byte[] r5 = new byte[r6]
            r5 = {x0018: FILL_ARRAY_DATA , data: [126, 51, 121, 71, 87} // fill-array
            r2 = 0
            java.lang.String r4 = "b250a5"
            r0 = 16777217(0x1000001, float:2.350989E-38)
            r1 = 0
            com.volcengine.mobsecBiz.matrix.pgla.a(r0, r1, r2, r4, r5)
        L17:
            return
    }

    protected static void d(java.io.DataOutputStream r6) {
            if (r6 == 0) goto L17
            r6.close()     // Catch: java.io.IOException -> L6
            return
        L6:
            r6 = 5
            byte[] r5 = new byte[r6]
            r5 = {x0018: FILL_ARRAY_DATA , data: [37, 57, 127, 17, 9} // fill-array
            r2 = 0
            java.lang.String r4 = "983f9c"
            r0 = 16777217(0x1000001, float:2.350989E-38)
            r1 = 0
            com.volcengine.mobsecBiz.matrix.pgla.a(r0, r1, r2, r4, r5)
        L17:
            return
    }

    @Override // ms.bz.bd.c.Pgl.pbly.pgla
    public final java.lang.Object a(int r8, int r9, long r10, java.lang.String r12, java.lang.Object r13) throws java.lang.Throwable {
            r7 = this;
            r0 = 27
            byte[] r6 = new byte[r0]
            r6 = {x006c: FILL_ARRAY_DATA , data: [41, 63, 78, 83, 5, 39, 62, 92, 120, 96, 58, 60, 67, 82, 25, 39, 53, 28, 38, 76, 6, 5, 111, 115, 36, 11, 14} // fill-array
            r3 = 0
            java.lang.String r5 = "939559"
            r1 = 16777217(0x1000001, float:2.350989E-38)
            r2 = 0
            java.lang.Object r0 = com.volcengine.mobsecBiz.matrix.pgla.a(r1, r2, r3, r5, r6)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String[] r0 = new java.lang.String[]{r0}
            boolean r0 = ms.bz.bd.c.Pgl.d1.a(r0)
            if (r0 != 0) goto L21
            r8 = 0
            return r8
        L21:
            r0 = 1
            r1 = 0
            switch(r8) {
                case 196609: goto L4c;
                case 196610: goto L3c;
                case 196611: goto L2c;
                default: goto L26;
            }
        L26:
            java.lang.Object r8 = super.a(r8, r9, r10, r12, r13)
            r9 = r7
            return r8
        L2c:
            r9 = r7
            java.lang.Object[] r13 = (java.lang.Object[]) r13
            r8 = r13[r1]
            java.lang.String r8 = (java.lang.String) r8
            r10 = r13[r0]
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object[] r8 = r7.g(r12, r8, r10)
            return r8
        L3c:
            r9 = r7
            java.lang.Object[] r13 = (java.lang.Object[]) r13
            r8 = r13[r1]
            java.lang.String r8 = (java.lang.String) r8
            r10 = r13[r0]
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object[] r8 = r7.e(r12, r8, r10)
            return r8
        L4c:
            r9 = r7
            java.lang.Object[] r13 = (java.lang.Object[]) r13
            r8 = r13[r1]
            byte[] r8 = (byte[]) r8
            r10 = r13[r0]
            java.lang.String r10 = (java.lang.String) r10
            r11 = 2
            r11 = r13[r11]
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object[] r8 = r7.f(r12, r8, r10, r11)
            return r8
    }

    public abstract java.lang.Object[] e(java.lang.String r1, java.lang.String r2, java.lang.String r3);

    public abstract java.lang.Object[] f(java.lang.String r1, byte[] r2, java.lang.String r3, java.lang.String r4);

    public abstract java.lang.Object[] g(java.lang.String r1, java.lang.String r2, java.lang.String r3);
}
