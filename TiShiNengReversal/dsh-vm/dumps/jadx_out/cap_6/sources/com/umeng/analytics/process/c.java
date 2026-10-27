package com.umeng.analytics.process;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class c {
    private static com.umeng.analytics.process.c a;
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, com.umeng.analytics.process.c.a> b;
    private android.content.Context c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a {
        private java.util.concurrent.atomic.AtomicInteger a;
        private android.database.sqlite.SQLiteOpenHelper b;
        private android.database.sqlite.SQLiteDatabase c;

        private a() {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
                r0.<init>()
                r1.a = r0
                return
        }

        static com.umeng.analytics.process.c.a a(android.content.Context r1, java.lang.String r2) {
                android.content.Context r1 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext(r1)
                com.umeng.analytics.process.c$a r0 = new com.umeng.analytics.process.c$a
                r0.<init>()
                com.umeng.analytics.process.b r1 = com.umeng.analytics.process.b.a(r1, r2)
                r0.b = r1
                return r0
        }

        synchronized android.database.sqlite.SQLiteDatabase a() {
                r2 = this;
                monitor-enter(r2)
                java.util.concurrent.atomic.AtomicInteger r0 = r2.a     // Catch: java.lang.Throwable -> L13
                int r0 = r0.incrementAndGet()     // Catch: java.lang.Throwable -> L13
                r1 = 1
                if (r0 != r1) goto L15
                android.database.sqlite.SQLiteOpenHelper r0 = r2.b     // Catch: java.lang.Throwable -> L13
                android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()     // Catch: java.lang.Throwable -> L13
                r2.c = r0     // Catch: java.lang.Throwable -> L13
                goto L15
            L13:
                r0 = move-exception
                goto L19
            L15:
                android.database.sqlite.SQLiteDatabase r0 = r2.c     // Catch: java.lang.Throwable -> L13
                monitor-exit(r2)
                return r0
            L19:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L13
                throw r0
        }

        synchronized void b() {
                r1 = this;
                monitor-enter(r1)
                java.util.concurrent.atomic.AtomicInteger r0 = r1.a     // Catch: java.lang.Throwable -> Le
                int r0 = r0.decrementAndGet()     // Catch: java.lang.Throwable -> Le
                if (r0 != 0) goto Le
                android.database.sqlite.SQLiteDatabase r0 = r1.c     // Catch: java.lang.Throwable -> Le
                r0.close()     // Catch: java.lang.Throwable -> Le
            Le:
                monitor-exit(r1)
                return
        }
    }

    private c() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.b = r0
            return
    }

    static com.umeng.analytics.process.c a(android.content.Context r2) {
            com.umeng.analytics.process.c r0 = com.umeng.analytics.process.c.a
            if (r0 != 0) goto L19
            java.lang.Class<com.umeng.analytics.process.c> r0 = com.umeng.analytics.process.c.class
            monitor-enter(r0)
            com.umeng.analytics.process.c r1 = com.umeng.analytics.process.c.a     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.umeng.analytics.process.c r1 = new com.umeng.analytics.process.c     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.umeng.analytics.process.c.a = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r2 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r2
        L19:
            com.umeng.analytics.process.c r0 = com.umeng.analytics.process.c.a
            r0.c = r2
            return r0
    }

    private com.umeng.analytics.process.c.a c(java.lang.String r3) {
            r2 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.umeng.analytics.process.c$a> r0 = r2.b
            java.lang.Object r0 = r0.get(r3)
            if (r0 != 0) goto L14
            android.content.Context r0 = r2.c
            com.umeng.analytics.process.c$a r0 = com.umeng.analytics.process.c.a.a(r0, r3)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.umeng.analytics.process.c$a> r1 = r2.b
            r1.put(r3, r0)
            return r0
        L14:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.umeng.analytics.process.c$a> r0 = r2.b
            java.lang.Object r3 = r0.get(r3)
            com.umeng.analytics.process.c$a r3 = (com.umeng.analytics.process.c.a) r3
            return r3
    }

    synchronized android.database.sqlite.SQLiteDatabase a(java.lang.String r1) {
            r0 = this;
            monitor-enter(r0)
            com.umeng.analytics.process.c$a r1 = r0.c(r1)     // Catch: java.lang.Throwable -> Lb
            android.database.sqlite.SQLiteDatabase r1 = r1.a()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)
            return r1
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    synchronized void b(java.lang.String r1) {
            r0 = this;
            monitor-enter(r0)
            com.umeng.analytics.process.c$a r1 = r0.c(r1)     // Catch: java.lang.Throwable -> La
            r1.b()     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)
            return
        La:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }
}
