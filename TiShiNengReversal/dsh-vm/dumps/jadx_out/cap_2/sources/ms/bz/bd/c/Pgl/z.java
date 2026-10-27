package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class z extends ms.bz.bd.c.Pgl.pbly.pgla {
    z() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // ms.bz.bd.c.Pgl.pbly.pgla
    protected final java.lang.Object b(long r1, java.lang.String r3, java.lang.Object r4) throws java.lang.Throwable {
            r0 = this;
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            ms.bz.bd.c.Pgl.pblv r2 = ms.bz.bd.c.Pgl.pblv.a()     // Catch: java.lang.Throwable -> L23
            android.content.Context r2 = r2.c()     // Catch: java.lang.Throwable -> L23
            if (r2 == 0) goto L23
            android.content.pm.ApplicationInfo r3 = r2.getApplicationInfo()     // Catch: java.lang.Throwable -> L23
            if (r3 == 0) goto L1e
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()     // Catch: java.lang.Throwable -> L23
            int r2 = r2.flags     // Catch: java.lang.Throwable -> L23
            r2 = r2 & 2
            if (r2 == 0) goto L1e
            r2 = 1
            goto L1f
        L1e:
            r2 = 0
        L1f:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L23
        L23:
            return r1
    }
}
