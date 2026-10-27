package x0;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class a {
    private static volatile x0.a c;
    private com.bytedance.j.xt.xt.xt.b a;
    private android.database.sqlite.SQLiteDatabase b;

    private a() {
            r0 = this;
            r0.<init>()
            return
    }

    public static x0.a a() {
            x0.a r0 = x0.a.c
            if (r0 != 0) goto L19
            java.lang.Class<x0.a> r0 = x0.a.class
            monitor-enter(r0)
            x0.a r1 = x0.a.c     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            x0.a r1 = new x0.a     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            x0.a.c = r1     // Catch: java.lang.Throwable -> L13
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
            x0.a r0 = x0.a.c
            return r0
    }

    public void b(android.content.Context r2) {
            r1 = this;
            x0.b r0 = new x0.b     // Catch: java.lang.Throwable -> Lc
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lc
            android.database.sqlite.SQLiteDatabase r2 = r0.getWritableDatabase()     // Catch: java.lang.Throwable -> Lc
            r1.b = r2     // Catch: java.lang.Throwable -> Lc
            goto L10
        Lc:
            r2 = move-exception
            com.bytedance.j.xt.tl.i.c(r2)
        L10:
            com.bytedance.j.xt.xt.xt.b r2 = new com.bytedance.j.xt.xt.xt.b
            r2.<init>()
            r1.a = r2
            return
    }

    public synchronized void c(y0.a r3) {
            r2 = this;
            monitor-enter(r2)
            com.bytedance.j.xt.xt.xt.b r0 = r2.a     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto Ld
            android.database.sqlite.SQLiteDatabase r1 = r2.b     // Catch: java.lang.Throwable -> Lb
            r0.insert(r1, r3)     // Catch: java.lang.Throwable -> Lb
            goto Ld
        Lb:
            r3 = move-exception
            goto Lf
        Ld:
            monitor-exit(r2)
            return
        Lf:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lb
            throw r3
    }

    public synchronized boolean d(java.lang.String r3) {
            r2 = this;
            monitor-enter(r2)
            com.bytedance.j.xt.xt.xt.b r0 = r2.a     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto Lf
            android.database.sqlite.SQLiteDatabase r1 = r2.b     // Catch: java.lang.Throwable -> Ld
            boolean r3 = r0.e(r1, r3)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r2)
            return r3
        Ld:
            r3 = move-exception
            goto L12
        Lf:
            monitor-exit(r2)
            r3 = 0
            return r3
        L12:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            throw r3
    }
}
