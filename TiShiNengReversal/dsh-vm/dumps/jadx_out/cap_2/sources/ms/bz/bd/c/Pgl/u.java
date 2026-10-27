package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class u extends ms.bz.bd.c.Pgl.pbly.pgla {
    u() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // ms.bz.bd.c.Pgl.pbly.pgla
    public final java.lang.Object b(long r1, java.lang.String r3, java.lang.Object r4) throws java.lang.Throwable {
            r0 = this;
            ms.bz.bd.c.Pgl.pblv r1 = ms.bz.bd.c.Pgl.pblv.a()
            android.content.Context r1 = r1.c()
            android.content.pm.PackageManager r2 = r1.getPackageManager()
            java.lang.String r1 = r1.getPackageName()
            r3 = 0
            android.content.pm.ApplicationInfo r1 = r2.getApplicationInfo(r1, r3)
            java.lang.String r2 = r1.sourceDir
            if (r2 != 0) goto L1c
            java.lang.String r1 = r1.publicSourceDir
            return r1
        L1c:
            return r2
    }
}
