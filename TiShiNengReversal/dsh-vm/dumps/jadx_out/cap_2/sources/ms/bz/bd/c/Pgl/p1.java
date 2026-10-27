package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class p1 {
    private static volatile ms.bz.bd.c.Pgl.p1 b;
    private java.lang.Throwable a;

    private p1() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            return
    }

    public static ms.bz.bd.c.Pgl.p1 a() {
            ms.bz.bd.c.Pgl.p1 r0 = ms.bz.bd.c.Pgl.p1.b
            if (r0 != 0) goto L19
            java.lang.Class<ms.bz.bd.c.Pgl.p1> r0 = ms.bz.bd.c.Pgl.p1.class
            monitor-enter(r0)
            ms.bz.bd.c.Pgl.p1 r1 = ms.bz.bd.c.Pgl.p1.b     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            ms.bz.bd.c.Pgl.p1 r1 = new ms.bz.bd.c.Pgl.p1     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            ms.bz.bd.c.Pgl.p1.b = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            ms.bz.bd.c.Pgl.p1 r0 = ms.bz.bd.c.Pgl.p1.b
            return r0
    }

    public final synchronized java.lang.Throwable b() {
            r1 = this;
            monitor-enter(r1)
            java.lang.Throwable r0 = r1.a     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }
}
