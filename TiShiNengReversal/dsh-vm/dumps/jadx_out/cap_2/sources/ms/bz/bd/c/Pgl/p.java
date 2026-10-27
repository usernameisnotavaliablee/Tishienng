package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class p extends ms.bz.bd.c.Pgl.pbly.pgla {
    p() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // ms.bz.bd.c.Pgl.pbly.pgla
    public final java.lang.Object b(long r1, java.lang.String r3, java.lang.Object r4) throws java.lang.Throwable {
            r0 = this;
            ms.bz.bd.c.Pgl.pblv r1 = ms.bz.bd.c.Pgl.pblv.a()
            android.content.Context r1 = r1.c()
            java.lang.String r4 = (java.lang.String) r4
            r2 = 0
            android.content.SharedPreferences r1 = com.bytedance.sdk.openadsdk.api.plugin.xt.xt(r1, r3, r2)
            r2 = 0
            java.lang.String r1 = r1.getString(r4, r2)
            return r1
    }
}
