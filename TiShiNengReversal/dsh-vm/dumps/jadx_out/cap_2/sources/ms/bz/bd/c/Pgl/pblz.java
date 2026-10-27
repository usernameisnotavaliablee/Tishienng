package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class pblz extends ms.bz.bd.c.Pgl.pbly.pgla {
    pblz() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // ms.bz.bd.c.Pgl.pbly.pgla
    public final java.lang.Object b(long r7, java.lang.String r9, java.lang.Object r10) throws java.lang.Throwable {
            r6 = this;
            ms.bz.bd.c.Pgl.pblv r7 = ms.bz.bd.c.Pgl.pblv.a()
            android.content.Context r7 = r7.c()
            java.io.File r8 = new java.io.File
            java.io.File r7 = com.bytedance.sdk.openadsdk.api.plugin.xt.j(r7)
            r9 = 7
            byte[] r5 = new byte[r9]
            r5 = {x0034: FILL_ARRAY_DATA , data: [102, 106, 6, 18, 14, 59, 59} // fill-array
            r2 = 0
            java.lang.String r4 = "9efb08"
            r0 = 16777217(0x1000001, float:2.350989E-38)
            r1 = 0
            java.lang.Object r9 = com.volcengine.mobsecBiz.matrix.pgla.a(r0, r1, r2, r4, r5)
            java.lang.String r9 = (java.lang.String) r9
            r8.<init>(r7, r9)
            boolean r7 = r8.exists()
            if (r7 != 0) goto L2e
            r8.mkdirs()
        L2e:
            java.lang.String r7 = r8.getAbsolutePath()
            return r7
    }
}
