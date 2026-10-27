package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class k0 extends ms.bz.bd.c.Pgl.pbly.pgla {
    k0() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // ms.bz.bd.c.Pgl.pbly.pgla
    public final java.lang.Object b(long r7, java.lang.String r9, java.lang.Object r10) throws java.lang.Throwable {
            r6 = this;
            r7 = 0
            java.util.TimeZone r8 = java.util.TimeZone.getDefault()     // Catch: java.lang.Throwable -> L14
            java.lang.String r9 = r8.getID()     // Catch: java.lang.Throwable -> L14
            int r8 = r8.getRawOffset()     // Catch: java.lang.Throwable -> L15
            int r8 = r8 / 60
            int r8 = r8 / 60
            int r8 = r8 / 1000
            goto L16
        L14:
            r9 = 0
        L15:
            r8 = 0
        L16:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            r9 = 1
            byte[] r5 = new byte[r9]
            r9 = 108(0x6c, float:1.51E-43)
            r5[r7] = r9
            r2 = 0
            java.lang.String r4 = "11a32f"
            r0 = 16777217(0x1000001, float:2.350989E-38)
            r1 = 0
            java.lang.Object r7 = com.volcengine.mobsecBiz.matrix.pgla.a(r0, r1, r2, r4, r5)
            java.lang.String r7 = (java.lang.String) r7
            r10.append(r7)
            r10.append(r8)
            java.lang.String r7 = r10.toString()
            return r7
    }
}
