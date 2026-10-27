package com.kwad.components.core.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class a {
    private static volatile com.kwad.components.core.c.a Ns;
    private final android.database.sqlite.SQLiteDatabase Nq;
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, com.kwad.components.core.c.e> Nr;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.kwad.components.core.c.a$a, reason: collision with other inner class name */
    static class C0063a extends android.database.sqlite.SQLiteOpenHelper {
        private static int Nv = 1;
        private java.lang.String Nw;
        private java.lang.String Nx;

        static {
                return
        }

        public C0063a(@androidx.annotation.Nullable android.content.Context r4) {
                r3 = this;
                r0 = 0
                int r1 = com.kwad.components.core.c.a.C0063a.Nv
                java.lang.String r2 = "ksadcache.db"
                r3.<init>(r4, r2, r0, r1)
                java.lang.String r4 = "CREATE TABLE IF NOT EXISTS ksad_ad_cache (creativeId VARCHAR PRIMARY KEY NOT NULL, posId TEXT, adJson TEXT, ecpm INTEGER, playAgainJson TEXT, adSenseJson TEXT, createTime INTEGER, expireTime INTEGER)"
                r3.Nw = r4
                java.lang.String r4 = "CREATE TABLE IF NOT EXISTS ksad_ad_cache_strategy(posId VARCHAR PRIMARY KEY NOT NULL, cacheSize INTEGER, cacheSecond INTEGER, strategyCode INTEGER, enable INTEGER)"
                r3.Nx = r4
                return
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(android.database.sqlite.SQLiteDatabase r2) {
                r1 = this;
                java.lang.String r0 = r1.Nw
                r2.execSQL(r0)
                java.lang.String r0 = r1.Nx
                r2.execSQL(r0)
                return
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(android.database.sqlite.SQLiteDatabase r1, int r2, int r3) {
                r0 = this;
                return
        }
    }

    private a(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.Nr = r0
            com.kwad.components.core.c.a$a r0 = new com.kwad.components.core.c.a$a
            r0.<init>(r2)
            android.database.sqlite.SQLiteDatabase r2 = r0.getWritableDatabase()
            r1.Nq = r2
            return
    }

    static /* synthetic */ void a(com.kwad.components.core.c.a r0, java.util.List r1, java.lang.String r2) {
            r0.b(r1, r2)
            return
    }

    private <T extends com.kwad.components.core.c.i> void b(java.util.List<T> r6, java.lang.String r7) {
            r5 = this;
            android.database.sqlite.SQLiteDatabase r0 = r5.Nq     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L44
            r0.beginTransaction()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L44
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L44
        L9:
            boolean r0 = r6.hasNext()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L44
            if (r0 == 0) goto L46
            java.lang.Object r0 = r6.next()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L44
            com.kwad.components.core.c.i r0 = (com.kwad.components.core.c.i) r0     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L44
            android.content.ContentValues r0 = r0.ok()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L44
            android.database.sqlite.SQLiteDatabase r1 = r5.Nq     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            r2 = 0
            r3 = 5
            long r0 = r1.insertWithOnConflict(r7, r2, r0, r3)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            java.lang.String r2 = "AdCacheDBManager"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            java.lang.String r4 = "insertData: "
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            r3.append(r7)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            java.lang.String r4 = ", rowId: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            r3.append(r0)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            com.kwad.sdk.core.d.c.d(r2, r0)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            goto L9
        L3d:
            r6 = move-exception
            goto L61
        L3f:
            r0 = move-exception
            com.kwad.sdk.core.d.c.printStackTrace(r0)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L44
            goto L9
        L44:
            r6 = move-exception
            goto L58
        L46:
            android.database.sqlite.SQLiteDatabase r6 = r5.Nq     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L44
            r6.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L44
            android.database.sqlite.SQLiteDatabase r6 = r5.Nq
            if (r6 == 0) goto L60
        L4f:
            r6.endTransaction()     // Catch: java.lang.Exception -> L53
            goto L60
        L53:
            r6 = move-exception
            com.kwad.sdk.core.d.c.printStackTrace(r6)
            return
        L58:
            com.kwad.sdk.core.d.c.printStackTrace(r6)     // Catch: java.lang.Throwable -> L3d
            android.database.sqlite.SQLiteDatabase r6 = r5.Nq
            if (r6 == 0) goto L60
            goto L4f
        L60:
            return
        L61:
            android.database.sqlite.SQLiteDatabase r7 = r5.Nq
            if (r7 == 0) goto L6d
            r7.endTransaction()     // Catch: java.lang.Exception -> L69
            goto L6d
        L69:
            r7 = move-exception
            com.kwad.sdk.core.d.c.printStackTrace(r7)
        L6d:
            throw r6
    }

    @androidx.annotation.Nullable
    public static com.kwad.components.core.c.a nZ() {
            com.kwad.components.core.c.a r0 = com.kwad.components.core.c.a.Ns
            if (r0 != 0) goto L24
            java.lang.Class<com.kwad.components.core.c.a> r0 = com.kwad.components.core.c.a.class
            monitor-enter(r0)
            com.kwad.components.core.c.a r1 = com.kwad.components.core.c.a.Ns     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L20
            com.kwad.components.core.c.a r1 = new com.kwad.components.core.c.a     // Catch: java.lang.Throwable -> L17 android.database.sqlite.SQLiteException -> L19
            android.content.Context r2 = com.kwad.sdk.service.ServiceProvider.Pp()     // Catch: java.lang.Throwable -> L17 android.database.sqlite.SQLiteException -> L19
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L17 android.database.sqlite.SQLiteException -> L19
            com.kwad.components.core.c.a.Ns = r1     // Catch: java.lang.Throwable -> L17 android.database.sqlite.SQLiteException -> L19
            goto L20
        L17:
            r1 = move-exception
            goto L22
        L19:
            r1 = move-exception
            com.kwad.sdk.core.d.c.printStackTraceOnly(r1)     // Catch: java.lang.Throwable -> L17
            r1 = 0
            com.kwad.components.core.c.a.Ns = r1     // Catch: java.lang.Throwable -> L17
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            goto L24
        L22:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r1
        L24:
            com.kwad.components.core.c.a r0 = com.kwad.components.core.c.a.Ns
            return r0
    }

    @androidx.annotation.Nullable
    @androidx.annotation.WorkerThread
    public final java.util.List<com.kwad.components.core.c.h> a(java.lang.String r12, long r13, int r15) {
            r11 = this;
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r11.Nq     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e
            java.lang.String r2 = "select  * from ksad_ad_cache where posId=? order by createTime desc"
            java.lang.String[] r3 = new java.lang.String[]{r12}     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e
            java.util.List r2 = com.kwad.components.core.c.h.a(r1)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            if (r2 != 0) goto L17
            com.kwad.sdk.crash.utils.b.closeQuietly(r1)
            return r0
        L17:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            java.lang.String r5 = "(posId = "
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            r4.append(r12)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            java.lang.String r12 = ") AND ("
            r4.append(r12)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            java.lang.String r12 = r4.toString()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            r3.<init>(r12)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            r12.<init>()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            java.util.Iterator r4 = r2.iterator()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            r5 = 0
            r6 = 0
        L3a:
            boolean r7 = r4.hasNext()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            if (r7 == 0) goto L79
            java.lang.Object r7 = r4.next()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            com.kwad.components.core.c.h r7 = (com.kwad.components.core.c.h) r7     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            int r6 = r6 + 1
            if (r6 > r15) goto L5b
            long r8 = r7.oq()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            int r10 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r10 < 0) goto L3a
            r12.add(r7)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            goto L3a
        L56:
            r12 = move-exception
            r0 = r1
            goto L97
        L59:
            r12 = move-exception
            goto L90
        L5b:
            java.lang.String r8 = " creativeId = "
            r3.append(r8)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            java.lang.String r7 = r7.os()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            r3.append(r7)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            int r7 = r2.size()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            if (r6 != r7) goto L73
            java.lang.String r7 = ")"
            r3.append(r7)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            goto L3a
        L73:
            java.lang.String r7 = " OR"
            r3.append(r7)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            goto L3a
        L79:
            if (r6 <= r15) goto L88
            java.lang.String r13 = r3.toString()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            android.database.sqlite.SQLiteDatabase r14 = r11.Nq     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            java.lang.String r15 = "ksad_ad_cache"
            java.lang.String[] r2 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            r14.delete(r15, r13, r2)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
        L88:
            com.kwad.sdk.crash.utils.b.closeQuietly(r1)
            return r12
        L8c:
            r12 = move-exception
            goto L97
        L8e:
            r12 = move-exception
            r1 = r0
        L90:
            com.kwad.sdk.core.d.c.printStackTraceOnly(r12)     // Catch: java.lang.Throwable -> L56
            com.kwad.sdk.crash.utils.b.closeQuietly(r1)
            return r0
        L97:
            com.kwad.sdk.crash.utils.b.closeQuietly(r0)
            throw r12
    }

    public final void a(com.kwad.components.core.c.e r3) {
            r2 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.kwad.components.core.c.e> r0 = r2.Nr
            java.lang.String r1 = r3.og()
            r0.put(r1, r3)
            java.util.concurrent.ExecutorService r0 = com.kwad.sdk.core.threads.GlobalThreadPools.Jy()
            com.kwad.components.core.c.a$1 r1 = new com.kwad.components.core.c.a$1
            r1.<init>(r2, r3)
            r0.execute(r1)
            return
    }

    @androidx.annotation.WorkerThread
    public final com.kwad.components.core.c.e ad(java.lang.String r5) {
            r4 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.kwad.components.core.c.e> r0 = r4.Nr
            if (r0 == 0) goto L20
            java.lang.Object r0 = r0.get(r5)
            com.kwad.components.core.c.e r0 = (com.kwad.components.core.c.e) r0
            if (r0 == 0) goto L20
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "findCacheStrategyList from cache, posId: "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.lang.String r1 = "AdCacheDBManager"
            com.kwad.sdk.core.d.c.d(r1, r5)
            return r0
        L20:
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r4.Nq     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
            java.lang.String r2 = "select  * from ksad_ad_cache_strategy where posId=?"
            java.lang.String[] r3 = new java.lang.String[]{r5}     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
            java.util.List r2 = com.kwad.components.core.c.e.a(r1)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c
            if (r2 == 0) goto L4e
            int r3 = r2.size()     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c
            if (r3 <= 0) goto L4e
            r3 = 0
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c
            com.kwad.components.core.c.e r2 = (com.kwad.components.core.c.e) r2     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.kwad.components.core.c.e> r3 = r4.Nr     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c
            r3.put(r5, r2)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c
            com.kwad.sdk.crash.utils.b.closeQuietly(r1)
            return r2
        L49:
            r5 = move-exception
            r0 = r1
            goto L5b
        L4c:
            r5 = move-exception
            goto L56
        L4e:
            com.kwad.sdk.crash.utils.b.closeQuietly(r1)
            goto L5a
        L52:
            r5 = move-exception
            goto L5b
        L54:
            r5 = move-exception
            r1 = r0
        L56:
            com.kwad.sdk.core.d.c.printStackTraceOnly(r5)     // Catch: java.lang.Throwable -> L49
            goto L4e
        L5a:
            return r0
        L5b:
            com.kwad.sdk.crash.utils.b.closeQuietly(r0)
            throw r5
    }

    @androidx.annotation.WorkerThread
    public final void j(java.util.List<com.kwad.components.core.c.h> r2) {
            r1 = this;
            java.lang.String r0 = "ksad_ad_cache"
            r1.b(r2, r0)
            return
    }

    @androidx.annotation.WorkerThread
    public final void oa() {
            r5 = this;
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L19
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            android.database.sqlite.SQLiteDatabase r2 = r5.Nq     // Catch: java.lang.Exception -> L19
            java.lang.String r3 = "ksad_ad_cache"
            java.lang.String r4 = "expireTime<?"
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Exception -> L19
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch: java.lang.Exception -> L19
            r2.delete(r3, r4, r0)     // Catch: java.lang.Exception -> L19
            return
        L19:
            r0 = move-exception
            com.kwad.sdk.core.d.c.printStackTrace(r0)
            return
    }

    @androidx.annotation.WorkerThread
    public final void ob() {
            r6 = this;
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r6.Nq     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L49
            java.lang.String r2 = "select  * from ksad_ad_cache_strategy"
            android.database.Cursor r0 = r1.rawQuery(r2, r0)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L49
            java.util.List r1 = com.kwad.components.core.c.e.a(r0)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L49
            if (r1 == 0) goto L4f
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L49
            if (r2 == 0) goto L16
            goto L4f
        L16:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L49
        L1a:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L49
            if (r2 == 0) goto L4b
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L49
            com.kwad.components.core.c.e r2 = (com.kwad.components.core.c.e) r2     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L49
            java.lang.String r3 = "AdCacheDBManager"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L49
            java.lang.String r5 = "readCacheStrategyList:"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L49
            java.lang.String r5 = r2.og()     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L49
            r4.append(r5)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L49
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L49
            com.kwad.sdk.core.d.c.d(r3, r4)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L49
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.kwad.components.core.c.e> r3 = r6.Nr     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L49
            java.lang.String r4 = r2.og()     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L49
            r3.put(r4, r2)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L49
            goto L1a
        L47:
            r1 = move-exception
            goto L5a
        L49:
            r1 = move-exception
            goto L53
        L4b:
            com.kwad.sdk.crash.utils.b.closeQuietly(r0)
            return
        L4f:
            com.kwad.sdk.crash.utils.b.closeQuietly(r0)
            return
        L53:
            com.kwad.sdk.core.d.c.printStackTraceOnly(r1)     // Catch: java.lang.Throwable -> L47
            com.kwad.sdk.crash.utils.b.closeQuietly(r0)
            return
        L5a:
            com.kwad.sdk.crash.utils.b.closeQuietly(r0)
            throw r1
    }

    @androidx.annotation.WorkerThread
    public final void w(long r4) {
            r3 = this;
            android.database.sqlite.SQLiteDatabase r0 = r3.Nq     // Catch: java.lang.Exception -> L26
            java.lang.String r1 = "ksad_ad_cache"
            java.lang.String r2 = "creativeId=?"
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Exception -> L26
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Exception -> L26
            int r4 = r0.delete(r1, r2, r4)     // Catch: java.lang.Exception -> L26
            java.lang.String r5 = "AdCacheDBManager"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L26
            java.lang.String r1 = "deleteCachedAdByCreativeId result: "
            r0.<init>(r1)     // Catch: java.lang.Exception -> L26
            r0.append(r4)     // Catch: java.lang.Exception -> L26
            java.lang.String r4 = r0.toString()     // Catch: java.lang.Exception -> L26
            com.kwad.sdk.core.d.c.d(r5, r4)     // Catch: java.lang.Exception -> L26
            return
        L26:
            r4 = move-exception
            com.kwad.sdk.core.d.c.printStackTrace(r4)
            return
    }
}
