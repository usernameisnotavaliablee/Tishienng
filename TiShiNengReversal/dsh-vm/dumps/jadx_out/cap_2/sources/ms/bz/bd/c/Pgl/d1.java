package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class d1 {
    public d1() {
            r1 = this;
            r1.<init>()
            return
    }

    public static boolean a(java.lang.String... r7) {
            r0 = 0
            ms.bz.bd.c.Pgl.pblv r1 = ms.bz.bd.c.Pgl.pblv.a()     // Catch: java.lang.Throwable -> L23
            android.content.Context r1 = r1.c()     // Catch: java.lang.Throwable -> L23
            int r2 = r7.length     // Catch: java.lang.Throwable -> L23
            r3 = 0
        Lb:
            if (r3 >= r2) goto L21
            r4 = r7[r3]     // Catch: java.lang.Throwable -> L23
            int r5 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L23
            int r6 = android.os.Process.myUid()     // Catch: java.lang.Throwable -> L23
            int r4 = r1.checkPermission(r4, r5, r6)     // Catch: java.lang.Throwable -> L23
            if (r4 == 0) goto L1e
            return r0
        L1e:
            int r3 = r3 + 1
            goto Lb
        L21:
            r7 = 1
            return r7
        L23:
            return r0
    }
}
