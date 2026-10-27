package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class r extends ms.bz.bd.c.Pgl.pbly.pgla {
    r() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // ms.bz.bd.c.Pgl.pbly.pgla
    public final java.lang.Object b(long r3, java.lang.String r5, java.lang.Object r6) throws java.lang.Throwable {
            r2 = this;
            ms.bz.bd.c.Pgl.pblv r3 = ms.bz.bd.c.Pgl.pblv.a()
            android.content.Context r3 = r3.c()
            java.lang.String[] r6 = (java.lang.String[]) r6
            if (r3 == 0) goto L34
            if (r5 == 0) goto L34
            if (r6 == 0) goto L34
            int r4 = r6.length
            int r4 = r4 % 2
            if (r4 != 0) goto L34
            android.content.Intent r4 = new android.content.Intent
            r4.<init>(r5)
            java.lang.String r5 = r3.getPackageName()
            r4.setPackage(r5)
            r5 = 0
        L22:
            int r0 = r6.length
            if (r5 >= r0) goto L31
            r0 = r6[r5]
            int r1 = r5 + 1
            r1 = r6[r1]
            r4.putExtra(r0, r1)
            int r5 = r5 + 2
            goto L22
        L31:
            r3.sendBroadcast(r4)
        L34:
            r3 = 0
            return r3
    }
}
