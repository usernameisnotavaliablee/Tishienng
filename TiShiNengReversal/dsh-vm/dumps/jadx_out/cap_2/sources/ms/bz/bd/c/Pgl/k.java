package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class k extends ms.bz.bd.c.Pgl.pbly.pgla {
    k() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // ms.bz.bd.c.Pgl.pbly.pgla
    public final java.lang.Object b(long r7, java.lang.String r9, java.lang.Object r10) throws java.lang.Throwable {
            r6 = this;
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            ms.bz.bd.c.Pgl.pblv r8 = ms.bz.bd.c.Pgl.pblv.a()
            android.content.Context r8 = r8.c()
            android.content.Context r8 = r8.getApplicationContext()
            android.content.Context r8 = com.stub.StubApp.getOrigApplicationContext(r8)
            r9 = 5
            byte[] r5 = new byte[r9]
            r5 = {x0038: FILL_ARRAY_DATA , data: [49, 50, 78, 28, 92} // fill-array
            r2 = 0
            java.lang.String r4 = "082ff5"
            r0 = 16777217(0x1000001, float:2.350989E-38)
            r1 = 0
            java.lang.Object r10 = com.volcengine.mobsecBiz.matrix.pgla.a(r0, r1, r2, r4, r5)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r8 = r8.getSystemService(r10)
            android.telephony.TelephonyManager r8 = (android.telephony.TelephonyManager) r8
            if (r8 == 0) goto L36
            int r8 = r8.getSimState()
            if (r8 != r9) goto L36
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
        L36:
            return r7
    }
}
