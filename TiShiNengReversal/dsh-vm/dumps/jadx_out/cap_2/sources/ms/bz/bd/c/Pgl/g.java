package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class g extends ms.bz.bd.c.Pgl.pbly.pgla {
    g() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // ms.bz.bd.c.Pgl.pbly.pgla
    public final java.lang.Object b(long r7, java.lang.String r9, java.lang.Object r10) throws java.lang.Throwable {
            r6 = this;
            ms.bz.bd.c.Pgl.pblv r7 = ms.bz.bd.c.Pgl.pblv.a()
            android.content.Context r7 = r7.c()
            android.content.res.Resources r7 = r7.getResources()     // Catch: java.lang.Throwable -> L43
            android.content.res.Configuration r7 = r7.getConfiguration()     // Catch: java.lang.Throwable -> L43
            java.util.Locale r7 = r7.locale     // Catch: java.lang.Throwable -> L43
            java.lang.String r8 = r7.getLanguage()     // Catch: java.lang.Throwable -> L43
            java.lang.String r7 = r7.getCountry()     // Catch: java.lang.Throwable -> L43
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L43
            r9.<init>()     // Catch: java.lang.Throwable -> L43
            r9.append(r8)     // Catch: java.lang.Throwable -> L43
            java.lang.String r4 = "3a5166"
            r8 = 1
            byte[] r5 = new byte[r8]     // Catch: java.lang.Throwable -> L43
            r8 = 0
            r10 = 29
            r5[r8] = r10     // Catch: java.lang.Throwable -> L43
            r0 = 16777217(0x1000001, float:2.350989E-38)
            r1 = 0
            r2 = 0
            java.lang.Object r8 = com.volcengine.mobsecBiz.matrix.pgla.a(r0, r1, r2, r4, r5)     // Catch: java.lang.Throwable -> L43
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L43
            r9.append(r8)     // Catch: java.lang.Throwable -> L43
            r9.append(r7)     // Catch: java.lang.Throwable -> L43
            java.lang.String r7 = r9.toString()     // Catch: java.lang.Throwable -> L43
            goto L44
        L43:
            r7 = 0
        L44:
            java.lang.String r7 = ms.bz.bd.c.Pgl.q1.a(r7)
            return r7
    }
}
