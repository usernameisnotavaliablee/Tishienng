package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class j extends ms.bz.bd.c.Pgl.pbly.pgla {
    j() {
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
            r3 = 64
            android.content.pm.PackageInfo r1 = r2.getPackageInfo(r1, r3)
            android.content.pm.Signature[] r1 = r1.signatures
            if (r1 == 0) goto L25
            int r2 = r1.length
            if (r2 <= 0) goto L25
            r2 = 0
            r1 = r1[r2]
            byte[] r1 = r1.toByteArray()
            return r1
        L25:
            r1 = 0
            return r1
    }
}
