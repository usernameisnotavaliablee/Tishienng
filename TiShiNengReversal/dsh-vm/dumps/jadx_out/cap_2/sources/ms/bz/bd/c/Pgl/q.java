package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class q extends ms.bz.bd.c.Pgl.pbly.pgla {
    q() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // ms.bz.bd.c.Pgl.pbly.pgla
    public final java.lang.Object b(long r7, java.lang.String r9, java.lang.Object r10) throws java.lang.Throwable {
            r6 = this;
            ms.bz.bd.c.Pgl.pblv r7 = ms.bz.bd.c.Pgl.pblv.a()
            android.content.Context r7 = r7.c()
            java.lang.String r10 = (java.lang.String) r10
            r8 = 2
            byte[] r5 = new byte[r8]
            r5 = {x0038: FILL_ARRAY_DATA , data: [30, 127} // fill-array
            r2 = 0
            java.lang.String r4 = "3a0c32"
            r0 = 16777217(0x1000001, float:2.350989E-38)
            r1 = 0
            java.lang.Object r8 = com.volcengine.mobsecBiz.matrix.pgla.a(r0, r1, r2, r4, r5)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String[] r8 = r9.split(r8)
            r9 = 0
            r0 = r8[r9]
            r1 = 1
            r8 = r8[r1]
            android.content.SharedPreferences r7 = com.bytedance.sdk.openadsdk.api.plugin.xt.xt(r7, r0, r9)
            android.content.SharedPreferences$Editor r7 = r7.edit()
            r7.putString(r8, r10)
            r7.commit()
            r7 = 0
            return r7
    }
}
