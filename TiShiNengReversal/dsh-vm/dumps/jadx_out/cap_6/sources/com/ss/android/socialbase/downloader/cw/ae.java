package com.ss.android.socialbase.downloader.cw;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ae {
    private android.database.sqlite.SQLiteStatement ae;
    private final java.lang.String[] cw;
    private final android.database.sqlite.SQLiteDatabase j;
    private android.database.sqlite.SQLiteStatement m;
    private final java.lang.String[] r;
    private android.database.sqlite.SQLiteStatement tl;
    private android.database.sqlite.SQLiteStatement up;
    private final java.lang.String xt;

    public ae(android.database.sqlite.SQLiteDatabase r1, java.lang.String r2, java.lang.String[] r3, java.lang.String[] r4) {
            r0 = this;
            r0.<init>()
            r0.j = r1
            r0.xt = r2
            r0.cw = r3
            r0.r = r4
            return
    }

    public android.database.sqlite.SQLiteStatement cw() {
            r3 = this;
            android.database.sqlite.SQLiteStatement r0 = r3.m
            if (r0 != 0) goto L29
            java.lang.String r0 = r3.xt
            java.lang.String[] r1 = r3.cw
            java.lang.String[] r2 = r3.r
            java.lang.String r0 = com.ss.android.socialbase.downloader.az.g.j(r0, r1, r2)
            android.database.sqlite.SQLiteDatabase r1 = r3.j
            android.database.sqlite.SQLiteStatement r0 = r1.compileStatement(r0)
            monitor-enter(r3)
            android.database.sqlite.SQLiteStatement r1 = r3.m     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L1e
            r3.m = r0     // Catch: java.lang.Throwable -> L1c
            goto L1e
        L1c:
            r0 = move-exception
            goto L27
        L1e:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1c
            android.database.sqlite.SQLiteStatement r1 = r3.m
            if (r1 == r0) goto L29
            r0.close()
            goto L29
        L27:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1c
            throw r0
        L29:
            android.database.sqlite.SQLiteStatement r0 = r3.m
            return r0
    }

    public android.database.sqlite.SQLiteStatement j() {
            r3 = this;
            android.database.sqlite.SQLiteStatement r0 = r3.up
            if (r0 != 0) goto L29
            java.lang.String r0 = "INSERT INTO "
            java.lang.String r1 = r3.xt
            java.lang.String[] r2 = r3.cw
            java.lang.String r0 = com.ss.android.socialbase.downloader.az.g.j(r0, r1, r2)
            android.database.sqlite.SQLiteDatabase r1 = r3.j
            android.database.sqlite.SQLiteStatement r0 = r1.compileStatement(r0)
            monitor-enter(r3)
            android.database.sqlite.SQLiteStatement r1 = r3.up     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L1e
            r3.up = r0     // Catch: java.lang.Throwable -> L1c
            goto L1e
        L1c:
            r0 = move-exception
            goto L27
        L1e:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1c
            android.database.sqlite.SQLiteStatement r1 = r3.up
            if (r1 == r0) goto L29
            r0.close()
            goto L29
        L27:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1c
            throw r0
        L29:
            android.database.sqlite.SQLiteStatement r0 = r3.up
            return r0
    }

    public android.database.sqlite.SQLiteStatement r() {
            r3 = this;
            android.database.sqlite.SQLiteStatement r0 = r3.tl
            if (r0 != 0) goto L29
            java.lang.String r0 = r3.xt
            java.lang.String[] r1 = r3.cw
            java.lang.String[] r2 = r3.r
            java.lang.String r0 = com.ss.android.socialbase.downloader.az.g.xt(r0, r1, r2)
            android.database.sqlite.SQLiteDatabase r1 = r3.j
            android.database.sqlite.SQLiteStatement r0 = r1.compileStatement(r0)
            monitor-enter(r3)
            android.database.sqlite.SQLiteStatement r1 = r3.tl     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L1e
            r3.tl = r0     // Catch: java.lang.Throwable -> L1c
            goto L1e
        L1c:
            r0 = move-exception
            goto L27
        L1e:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1c
            android.database.sqlite.SQLiteStatement r1 = r3.tl
            if (r1 == r0) goto L29
            r0.close()
            goto L29
        L27:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1c
            throw r0
        L29:
            android.database.sqlite.SQLiteStatement r0 = r3.tl
            return r0
    }

    public android.database.sqlite.SQLiteStatement xt() {
            r2 = this;
            android.database.sqlite.SQLiteStatement r0 = r2.ae
            if (r0 != 0) goto L27
            java.lang.String r0 = r2.xt
            java.lang.String[] r1 = r2.r
            java.lang.String r0 = com.ss.android.socialbase.downloader.az.g.j(r0, r1)
            android.database.sqlite.SQLiteDatabase r1 = r2.j
            android.database.sqlite.SQLiteStatement r0 = r1.compileStatement(r0)
            monitor-enter(r2)
            android.database.sqlite.SQLiteStatement r1 = r2.ae     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L1c
            r2.ae = r0     // Catch: java.lang.Throwable -> L1a
            goto L1c
        L1a:
            r0 = move-exception
            goto L25
        L1c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1a
            android.database.sqlite.SQLiteStatement r1 = r2.ae
            if (r1 == r0) goto L27
            r0.close()
            goto L27
        L25:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1a
            throw r0
        L27:
            android.database.sqlite.SQLiteStatement r0 = r2.ae
            return r0
    }
}
