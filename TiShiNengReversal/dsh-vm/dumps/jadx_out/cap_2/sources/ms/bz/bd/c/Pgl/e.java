package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class e extends ms.bz.bd.c.Pgl.pbly.pgla {
    e() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // ms.bz.bd.c.Pgl.pbly.pgla
    public final java.lang.Object b(long r1, java.lang.String r3, java.lang.Object r4) throws java.lang.Throwable {
            r0 = this;
            ms.bz.bd.c.Pgl.pblv r1 = ms.bz.bd.c.Pgl.pblv.a()
            android.content.Context r1 = r1.c()
            ms.bz.bd.c.Pgl.l1 r1 = ms.bz.bd.c.Pgl.l1.c(r1)
            r1.getClass()
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
            int r2 = r1.b()     // Catch: java.lang.Throwable -> L16
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16
            goto L1c
        L16:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16
            throw r2     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
        L19:
            r1 = move-exception
            throw r1
        L1b:
            r2 = -1
        L1c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = ""
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            return r1
    }
}
