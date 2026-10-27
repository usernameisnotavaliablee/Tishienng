package com.umeng.analytics.pro;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class g {
    private static android.database.sqlite.SQLiteOpenHelper b;
    private static android.content.Context d;
    private java.util.concurrent.atomic.AtomicInteger a;
    private android.database.sqlite.SQLiteDatabase c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.umeng.analytics.pro.g$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class a {
        private static final com.umeng.analytics.pro.g a = null;

        static {
                com.umeng.analytics.pro.g r0 = new com.umeng.analytics.pro.g
                r1 = 0
                r0.<init>(r1)
                com.umeng.analytics.pro.g.a.a = r0
                return
        }

        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ com.umeng.analytics.pro.g a() {
                com.umeng.analytics.pro.g r0 = com.umeng.analytics.pro.g.a.a
                return r0
        }
    }

    private g() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            r1.a = r0
            return
    }

    /* synthetic */ g(com.umeng.analytics.pro.g.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.umeng.analytics.pro.g a(android.content.Context r1) {
            android.content.Context r0 = com.umeng.analytics.pro.g.d
            if (r0 != 0) goto L16
            if (r1 == 0) goto L16
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            com.umeng.analytics.pro.g.d = r1
            com.umeng.analytics.pro.f r1 = com.umeng.analytics.pro.f.a(r1)
            com.umeng.analytics.pro.g.b = r1
        L16:
            com.umeng.analytics.pro.g r1 = com.umeng.analytics.pro.g.a.a()
            return r1
    }

    public synchronized android.database.sqlite.SQLiteDatabase a() {
            r2 = this;
            monitor-enter(r2)
            java.util.concurrent.atomic.AtomicInteger r0 = r2.a     // Catch: java.lang.Throwable -> L13
            int r0 = r0.incrementAndGet()     // Catch: java.lang.Throwable -> L13
            r1 = 1
            if (r0 != r1) goto L15
            android.database.sqlite.SQLiteOpenHelper r0 = com.umeng.analytics.pro.g.b     // Catch: java.lang.Throwable -> L13
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

    public synchronized void b() {
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
