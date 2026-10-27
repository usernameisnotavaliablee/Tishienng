package com.ss.android.downloadlib.addownload;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class o {
    private static volatile com.ss.android.downloadlib.addownload.o b;
    private android.os.Handler a;

    class a implements java.lang.Runnable {
        final /* synthetic */ java.lang.String a;
        final /* synthetic */ com.ss.android.downloadlib.addownload.o b;

        a(com.ss.android.downloadlib.addownload.o r1, java.lang.String r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r7 = this;
                v2.w r0 = com.ss.android.downloadlib.addownload.m.d()
                android.content.Context r2 = com.ss.android.downloadlib.addownload.m.getContext()
                r5 = 0
                r6 = 0
                r1 = 3
                r3 = 0
                java.lang.String r4 = "下载失败，请重试！"
                r0.j(r1, r2, r3, r4, r5, r6)
                com.ss.android.downloadlib.c r0 = com.ss.android.downloadlib.c.d()
                java.lang.String r1 = r7.a
                com.ss.android.downloadlib.addownload.l r0 = r0.c(r1)
                if (r0 == 0) goto L20
                r0.h()
            L20:
                return
        }
    }

    public class b {
        private int a;
        private int b;
        private java.lang.String c;

        public b(int r3) {
                r2 = this;
                r0 = 0
                r1 = 0
                r2.<init>(r3, r0, r1)
                return
        }

        public b(int r2, int r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r3, r0)
                return
        }

        public b(int r1, int r2, java.lang.String r3) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                r0.c = r3
                return
        }

        public b(int r2, java.lang.String r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0, r3)
                return
        }

        public int a() {
                r1 = this;
                int r0 = r1.b
                return r0
        }

        public java.lang.String b() {
                r1 = this;
                java.lang.String r0 = r1.c
                return r0
        }

        public int getType() {
                r1 = this;
                int r0 = r1.a
                return r0
        }
    }

    public class c {
        public static int g = 0;
        public static int h = 1;
        public static int i = 2;
        private int a;
        private long b;
        private org.json.JSONObject c;
        private int d;
        private java.lang.String e;
        private java.lang.String f;

        static {
                return
        }

        public c() {
                r2 = this;
                r2.<init>()
                int r0 = com.ss.android.downloadlib.addownload.o.c.g
                r2.a = r0
                r0 = 0
                r2.b = r0
                r0 = 0
                r2.c = r0
                r0 = 0
                r2.d = r0
                java.lang.String r0 = ""
                r2.e = r0
                r2.f = r0
                return
        }

        public com.ss.android.downloadlib.addownload.o.c a(int r1) {
                r0 = this;
                r0.a = r1
                return r0
        }

        public boolean b() {
                r2 = this;
                int r0 = r2.a
                int r1 = com.ss.android.downloadlib.addownload.o.c.h
                if (r0 != r1) goto L8
                r0 = 1
                return r0
            L8:
                r0 = 0
                return r0
        }

        public int c() {
                r1 = this;
                int r0 = r1.d
                return r0
        }

        public com.ss.android.downloadlib.addownload.o.c d(int r1) {
                r0 = this;
                r0.d = r1
                return r0
        }
    }

    public class d {

        class a implements java.lang.Runnable {
            final /* synthetic */ java.util.Collection a;
            final /* synthetic */ com.ss.android.downloadlib.addownload.o.d b;

            a(com.ss.android.downloadlib.addownload.o.d r1, java.util.Collection r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r8 = this;
                    com.ss.android.downloadlib.addownload.o$d r0 = r8.b
                    android.content.SharedPreferences r0 = com.ss.android.downloadlib.addownload.o.d.b(r0)
                    android.content.SharedPreferences$Editor r0 = r0.edit()
                    java.util.Collection r1 = r8.a
                    java.util.Iterator r1 = r1.iterator()
                L10:
                    boolean r2 = r1.hasNext()
                    if (r2 == 0) goto L3c
                    java.lang.Object r2 = r1.next()
                    com.ss.android.xt.j.xt.b r2 = (com.ss.android.xt.j.xt.b) r2
                    if (r2 == 0) goto L10
                    long r3 = r2.xt()
                    r5 = 0
                    int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                    if (r7 == 0) goto L10
                    long r3 = r2.xt()
                    java.lang.String r3 = java.lang.String.valueOf(r3)
                    org.json.JSONObject r2 = r2.z0()
                    java.lang.String r2 = r2.toString()
                    r0.putString(r3, r2)
                    goto L10
                L3c:
                    r0.apply()
                    return
            }
        }

        class b implements java.lang.Runnable {
            final /* synthetic */ java.util.List a;
            final /* synthetic */ com.ss.android.downloadlib.addownload.o.d b;

            b(com.ss.android.downloadlib.addownload.o.d r1, java.util.List r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r3 = this;
                    com.ss.android.downloadlib.addownload.o$d r0 = r3.b
                    android.content.SharedPreferences r0 = com.ss.android.downloadlib.addownload.o.d.b(r0)
                    android.content.SharedPreferences$Editor r0 = r0.edit()
                    java.util.List r1 = r3.a
                    java.util.Iterator r1 = r1.iterator()
                L10:
                    boolean r2 = r1.hasNext()
                    if (r2 == 0) goto L20
                    java.lang.Object r2 = r1.next()
                    java.lang.String r2 = (java.lang.String) r2
                    r0.remove(r2)
                    goto L10
                L20:
                    r0.apply()
                    return
            }
        }

        private static class c {
            private static com.ss.android.downloadlib.addownload.o.d a;

            static {
                    com.ss.android.downloadlib.addownload.o$d r0 = new com.ss.android.downloadlib.addownload.o$d
                    r1 = 0
                    r0.<init>(r1)
                    com.ss.android.downloadlib.addownload.o.d.c.a = r0
                    return
            }

            public c() {
                    r1 = this;
                    r1.<init>()
                    return
            }

            static /* synthetic */ com.ss.android.downloadlib.addownload.o.d a() {
                    com.ss.android.downloadlib.addownload.o$d r0 = com.ss.android.downloadlib.addownload.o.d.c.a
                    return r0
            }
        }

        private d() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ d(com.ss.android.downloadlib.addownload.o.d.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        private android.content.SharedPreferences a() {
                r3 = this;
                android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
                java.lang.String r1 = "sp_ad_download_event"
                r2 = 0
                android.content.SharedPreferences r0 = com.bytedance.sdk.openadsdk.ats.cw.j(r0, r1, r2)
                return r0
        }

        static /* synthetic */ android.content.SharedPreferences b(com.ss.android.downloadlib.addownload.o.d r0) {
                android.content.SharedPreferences r0 = r0.a()
                return r0
        }

        public static com.ss.android.downloadlib.addownload.o.d c() {
                com.ss.android.downloadlib.addownload.o$d r0 = com.ss.android.downloadlib.addownload.o.d.c.a()
                return r0
        }

        public void d(com.ss.android.xt.j.xt.b r2) {
                r1 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r2)
                r1.e(r0)
                return
        }

        public synchronized void e(java.util.Collection<com.ss.android.xt.j.xt.b> r3) {
                r2 = this;
                monitor-enter(r2)
                if (r3 == 0) goto L1c
                boolean r0 = r3.isEmpty()     // Catch: java.lang.Throwable -> L19
                if (r0 == 0) goto La
                goto L1c
            La:
                com.ss.android.downloadlib.e r0 = com.ss.android.downloadlib.e.c()     // Catch: java.lang.Throwable -> L19
                com.ss.android.downloadlib.addownload.o$d$a r1 = new com.ss.android.downloadlib.addownload.o$d$a     // Catch: java.lang.Throwable -> L19
                r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L19
                r3 = 1
                r0.f(r1, r3)     // Catch: java.lang.Throwable -> L19
                monitor-exit(r2)
                return
            L19:
                r3 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
                throw r3
            L1c:
                monitor-exit(r2)
                return
        }

        public void f(java.util.List<java.lang.String> r3) {
                r2 = this;
                if (r3 == 0) goto L16
                boolean r0 = r3.isEmpty()
                if (r0 == 0) goto L9
                goto L16
            L9:
                com.ss.android.downloadlib.e r0 = com.ss.android.downloadlib.e.c()
                com.ss.android.downloadlib.addownload.o$d$b r1 = new com.ss.android.downloadlib.addownload.o$d$b
                r1.<init>(r2, r3)
                r3 = 1
                r0.f(r1, r3)
            L16:
                return
        }

        @androidx.annotation.NonNull
        java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.ss.android.xt.j.xt.b> g() {
                r9 = this;
                java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
                r0.<init>()
                android.content.SharedPreferences r1 = r9.a()
                java.util.Map r1 = r1.getAll()
                if (r1 != 0) goto L10
                goto L5a
            L10:
                java.util.Set r1 = r1.entrySet()
                java.util.Iterator r1 = r1.iterator()
            L18:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L5a
                java.lang.Object r2 = r1.next()
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                java.lang.Object r3 = r2.getValue()
                if (r3 == 0) goto L18
                java.lang.Object r3 = r2.getKey()     // Catch: java.lang.Exception -> L55
                java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L55
                java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Exception -> L55
                long r4 = r3.longValue()     // Catch: java.lang.Exception -> L55
                org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Exception -> L55
                java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Exception -> L55
                java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Exception -> L55
                r6.<init>(r2)     // Catch: java.lang.Exception -> L55
                com.ss.android.xt.j.xt.b r2 = com.ss.android.xt.j.xt.b.V0(r6)     // Catch: java.lang.Exception -> L55
                r6 = 0
                int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r8 <= 0) goto L18
                if (r2 == 0) goto L18
                r0.put(r3, r2)     // Catch: java.lang.Exception -> L55
                goto L18
            L55:
                r2 = move-exception
                com.bytedance.sdk.component.utils.vl.j(r2)
                goto L18
            L5a:
                return r0
        }
    }

    public class e {
        public long a;
        public long b;
        public long c;
        public java.lang.String d;
        public java.lang.String e;
        public java.lang.String f;
        public java.lang.String g;
        public volatile long h;

        public e() {
                r0 = this;
                r0.<init>()
                return
        }

        public e(long r1, long r3, long r5, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r3
                r0.c = r5
                r0.d = r7
                r0.e = r8
                r0.f = r9
                r0.g = r10
                return
        }

        public static com.ss.android.downloadlib.addownload.o.e a(org.json.JSONObject r4) {
                r0 = 0
                if (r4 != 0) goto L4
                return r0
            L4:
                com.ss.android.downloadlib.addownload.o$e r1 = new com.ss.android.downloadlib.addownload.o$e
                r1.<init>()
                java.lang.String r2 = "mDownloadId"
                long r2 = com.ss.android.downloadlib.a.h.j(r4, r2)     // Catch: java.lang.Exception -> L4a
                r1.a = r2     // Catch: java.lang.Exception -> L4a
                java.lang.String r2 = "mAdId"
                long r2 = com.ss.android.downloadlib.a.h.j(r4, r2)     // Catch: java.lang.Exception -> L4a
                r1.b = r2     // Catch: java.lang.Exception -> L4a
                java.lang.String r2 = "mExtValue"
                long r2 = com.ss.android.downloadlib.a.h.j(r4, r2)     // Catch: java.lang.Exception -> L4a
                r1.c = r2     // Catch: java.lang.Exception -> L4a
                java.lang.String r2 = "mPackageName"
                java.lang.String r2 = r4.optString(r2)     // Catch: java.lang.Exception -> L4a
                r1.d = r2     // Catch: java.lang.Exception -> L4a
                java.lang.String r2 = "mAppName"
                java.lang.String r2 = r4.optString(r2)     // Catch: java.lang.Exception -> L4a
                r1.e = r2     // Catch: java.lang.Exception -> L4a
                java.lang.String r2 = "mLogExtra"
                java.lang.String r2 = r4.optString(r2)     // Catch: java.lang.Exception -> L4a
                r1.f = r2     // Catch: java.lang.Exception -> L4a
                java.lang.String r2 = "mFileName"
                java.lang.String r2 = r4.optString(r2)     // Catch: java.lang.Exception -> L4a
                r1.g = r2     // Catch: java.lang.Exception -> L4a
                java.lang.String r2 = "mTimeStamp"
                long r2 = com.ss.android.downloadlib.a.h.j(r4, r2)     // Catch: java.lang.Exception -> L4a
                r1.h = r2     // Catch: java.lang.Exception -> L4a
                return r1
            L4a:
                r4 = move-exception
                com.bytedance.sdk.component.utils.vl.j(r4)
                return r0
        }

        public org.json.JSONObject b() {
                r4 = this;
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>()
                java.lang.String r1 = "mDownloadId"
                long r2 = r4.a     // Catch: org.json.JSONException -> L3e
                r0.put(r1, r2)     // Catch: org.json.JSONException -> L3e
                java.lang.String r1 = "mAdId"
                long r2 = r4.b     // Catch: org.json.JSONException -> L3e
                r0.put(r1, r2)     // Catch: org.json.JSONException -> L3e
                java.lang.String r1 = "mExtValue"
                long r2 = r4.c     // Catch: org.json.JSONException -> L3e
                r0.put(r1, r2)     // Catch: org.json.JSONException -> L3e
                java.lang.String r1 = "mPackageName"
                java.lang.String r2 = r4.d     // Catch: org.json.JSONException -> L3e
                r0.put(r1, r2)     // Catch: org.json.JSONException -> L3e
                java.lang.String r1 = "mAppName"
                java.lang.String r2 = r4.e     // Catch: org.json.JSONException -> L3e
                r0.put(r1, r2)     // Catch: org.json.JSONException -> L3e
                java.lang.String r1 = "mLogExtra"
                java.lang.String r2 = r4.f     // Catch: org.json.JSONException -> L3e
                r0.put(r1, r2)     // Catch: org.json.JSONException -> L3e
                java.lang.String r1 = "mFileName"
                java.lang.String r2 = r4.g     // Catch: org.json.JSONException -> L3e
                r0.put(r1, r2)     // Catch: org.json.JSONException -> L3e
                java.lang.String r1 = "mTimeStamp"
                long r2 = r4.h     // Catch: org.json.JSONException -> L3e
                r0.put(r1, r2)     // Catch: org.json.JSONException -> L3e
                return r0
            L3e:
                r1 = move-exception
                com.bytedance.sdk.component.utils.vl.j(r1)
                return r0
        }
    }

    public class f {
        private volatile boolean a;
        private final java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.ss.android.j.j.cw.b> b;
        private final java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.ss.android.j.j.cw.g> c;
        private final java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.ss.android.j.j.cw.c> d;
        private final java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.ss.android.xt.j.xt.b> e;

        class a implements java.lang.Runnable {
            final /* synthetic */ com.ss.android.downloadlib.addownload.o.f a;

            a(com.ss.android.downloadlib.addownload.o.f r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r3 = this;
                    com.ss.android.downloadlib.addownload.o$f r0 = r3.a
                    boolean r0 = com.ss.android.downloadlib.addownload.o.f.n(r0)
                    if (r0 != 0) goto L31
                    java.lang.Class<com.ss.android.downloadlib.addownload.o$f> r0 = com.ss.android.downloadlib.addownload.o.f.class
                    monitor-enter(r0)
                    com.ss.android.downloadlib.addownload.o$f r1 = r3.a     // Catch: java.lang.Throwable -> L2b
                    boolean r1 = com.ss.android.downloadlib.addownload.o.f.n(r1)     // Catch: java.lang.Throwable -> L2b
                    if (r1 != 0) goto L2d
                    com.ss.android.downloadlib.addownload.o$f r1 = r3.a     // Catch: java.lang.Throwable -> L2b
                    java.util.concurrent.ConcurrentHashMap r1 = com.ss.android.downloadlib.addownload.o.f.u(r1)     // Catch: java.lang.Throwable -> L2b
                    com.ss.android.downloadlib.addownload.o$d r2 = com.ss.android.downloadlib.addownload.o.d.c()     // Catch: java.lang.Throwable -> L2b
                    java.util.concurrent.ConcurrentHashMap r2 = r2.g()     // Catch: java.lang.Throwable -> L2b
                    r1.putAll(r2)     // Catch: java.lang.Throwable -> L2b
                    com.ss.android.downloadlib.addownload.o$f r1 = r3.a     // Catch: java.lang.Throwable -> L2b
                    r2 = 1
                    com.ss.android.downloadlib.addownload.o.f.o(r1, r2)     // Catch: java.lang.Throwable -> L2b
                    goto L2d
                L2b:
                    r1 = move-exception
                    goto L2f
                L2d:
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
                    return
                L2f:
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
                    throw r1
                L31:
                    return
            }
        }

        private static class b {
            private static com.ss.android.downloadlib.addownload.o.f a;

            static {
                    com.ss.android.downloadlib.addownload.o$f r0 = new com.ss.android.downloadlib.addownload.o$f
                    r1 = 0
                    r0.<init>(r1)
                    com.ss.android.downloadlib.addownload.o.f.b.a = r0
                    return
            }

            public b() {
                    r1 = this;
                    r1.<init>()
                    return
            }

            static /* synthetic */ com.ss.android.downloadlib.addownload.o.f a() {
                    com.ss.android.downloadlib.addownload.o$f r0 = com.ss.android.downloadlib.addownload.o.f.b.a
                    return r0
            }
        }

        private f() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.a = r0
                java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
                r0.<init>()
                r1.b = r0
                java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
                r0.<init>()
                r1.c = r0
                java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
                r0.<init>()
                r1.d = r0
                java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
                r0.<init>()
                r1.e = r0
                return
        }

        /* synthetic */ f(com.ss.android.downloadlib.addownload.o.f.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public static com.ss.android.downloadlib.addownload.o.f c() {
                com.ss.android.downloadlib.addownload.o$f r0 = com.ss.android.downloadlib.addownload.o.f.b.a()
                return r0
        }

        static /* synthetic */ boolean n(com.ss.android.downloadlib.addownload.o.f r0) {
                boolean r0 = r0.a
                return r0
        }

        static /* synthetic */ boolean o(com.ss.android.downloadlib.addownload.o.f r0, boolean r1) {
                r0.a = r1
                return r1
        }

        static /* synthetic */ java.util.concurrent.ConcurrentHashMap u(com.ss.android.downloadlib.addownload.o.f r0) {
                java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.ss.android.xt.j.xt.b> r0 = r0.e
                return r0
        }

        public com.ss.android.j.j.cw.c a(long r2) {
                r1 = this;
                java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.ss.android.j.j.cw.c> r0 = r1.d
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                java.lang.Object r2 = r0.get(r2)
                com.ss.android.j.j.cw.c r2 = (com.ss.android.j.j.cw.c) r2
                return r2
        }

        public java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.ss.android.xt.j.xt.b> b() {
                r1 = this;
                java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.ss.android.xt.j.xt.b> r0 = r1.e
                return r0
        }

        public com.ss.android.j.j.cw.b d(long r2) {
                r1 = this;
                java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.ss.android.j.j.cw.b> r0 = r1.b
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                java.lang.Object r2 = r0.get(r2)
                com.ss.android.j.j.cw.b r2 = (com.ss.android.j.j.cw.b) r2
                return r2
        }

        public com.ss.android.xt.j.xt.b e(int r4) {
                r3 = this;
                java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.ss.android.xt.j.xt.b> r0 = r3.e
                java.util.Collection r0 = r0.values()
                java.util.Iterator r0 = r0.iterator()
            La:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1f
                java.lang.Object r1 = r0.next()
                com.ss.android.xt.j.xt.b r1 = (com.ss.android.xt.j.xt.b) r1
                if (r1 == 0) goto La
                int r2 = r1.mi()
                if (r2 != r4) goto La
                return r1
            L1f:
                r4 = 0
                return r4
        }

        public com.ss.android.xt.j.xt.b f(com.ss.android.socialbase.downloader.ae.cw r9) {
                r8 = this;
                r0 = 0
                if (r9 != 0) goto L4
                return r0
            L4:
                java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.ss.android.xt.j.xt.b> r1 = r8.e
                java.util.Collection r1 = r1.values()
                java.util.Iterator r1 = r1.iterator()
            Le:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L27
                java.lang.Object r2 = r1.next()
                com.ss.android.xt.j.xt.b r2 = (com.ss.android.xt.j.xt.b) r2
                if (r2 == 0) goto Le
                int r3 = r2.mi()
                int r4 = r9.ae()
                if (r3 != r4) goto Le
                return r2
            L27:
                java.lang.String r1 = r9.h()
                boolean r1 = android.text.TextUtils.isEmpty(r1)
                if (r1 != 0) goto L76
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L67
                java.lang.String r2 = r9.h()     // Catch: java.lang.Exception -> L67
                r1.<init>(r2)     // Catch: java.lang.Exception -> L67
                java.lang.String r2 = "extra"
                long r1 = com.ss.android.downloadlib.a.h.j(r1, r2)     // Catch: java.lang.Exception -> L67
                r3 = 0
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 == 0) goto L76
                java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.ss.android.xt.j.xt.b> r3 = r8.e     // Catch: java.lang.Exception -> L67
                java.util.Collection r3 = r3.values()     // Catch: java.lang.Exception -> L67
                java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Exception -> L67
            L50:
                boolean r4 = r3.hasNext()     // Catch: java.lang.Exception -> L67
                if (r4 == 0) goto L69
                java.lang.Object r4 = r3.next()     // Catch: java.lang.Exception -> L67
                com.ss.android.xt.j.xt.b r4 = (com.ss.android.xt.j.xt.b) r4     // Catch: java.lang.Exception -> L67
                if (r4 == 0) goto L50
                long r5 = r4.xt()     // Catch: java.lang.Exception -> L67
                int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r7 != 0) goto L50
                return r4
            L67:
                r1 = move-exception
                goto L73
            L69:
                com.ss.android.downloadlib.up.a r1 = com.ss.android.downloadlib.up.a.a()     // Catch: java.lang.Exception -> L67
                java.lang.String r2 = "getNativeModelByInfo"
                r1.c(r2)     // Catch: java.lang.Exception -> L67
                goto L76
            L73:
                com.bytedance.sdk.component.utils.vl.j(r1)
            L76:
                java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.ss.android.xt.j.xt.b> r1 = r8.e
                java.util.Collection r1 = r1.values()
                java.util.Iterator r1 = r1.iterator()
            L80:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L9d
                java.lang.Object r2 = r1.next()
                com.ss.android.xt.j.xt.b r2 = (com.ss.android.xt.j.xt.b) r2
                if (r2 == 0) goto L80
                java.lang.String r3 = r2.j()
                java.lang.String r4 = r9.oq()
                boolean r3 = android.text.TextUtils.equals(r3, r4)
                if (r3 == 0) goto L80
                return r2
            L9d:
                return r0
        }

        public com.ss.android.xt.j.xt.b g(java.lang.String r5) {
                r4 = this;
                boolean r0 = android.text.TextUtils.isEmpty(r5)
                r1 = 0
                if (r0 == 0) goto L8
                return r1
            L8:
                java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.ss.android.xt.j.xt.b> r0 = r4.e
                java.util.Collection r0 = r0.values()
                java.util.Iterator r0 = r0.iterator()
            L12:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L2b
                java.lang.Object r2 = r0.next()
                com.ss.android.xt.j.xt.b r2 = (com.ss.android.xt.j.xt.b) r2
                if (r2 == 0) goto L12
                java.lang.String r3 = r2.up()
                boolean r3 = r5.equals(r3)
                if (r3 == 0) goto L12
                return r2
            L2b:
                return r1
        }

        @androidx.annotation.NonNull
        public java.util.Map<java.lang.Long, com.ss.android.xt.j.xt.b> h(java.lang.String r6, java.lang.String r7) {
                r5 = this;
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                boolean r1 = android.text.TextUtils.isEmpty(r6)
                if (r1 != 0) goto L43
                boolean r1 = android.text.TextUtils.isEmpty(r7)
                if (r1 == 0) goto L12
                goto L43
            L12:
                java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.ss.android.xt.j.xt.b> r1 = r5.e
                java.util.Collection r1 = r1.values()
                java.util.Iterator r1 = r1.iterator()
            L1c:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L43
                java.lang.Object r2 = r1.next()
                com.ss.android.xt.j.xt.b r2 = (com.ss.android.xt.j.xt.b) r2
                if (r2 == 0) goto L1c
                java.lang.String r3 = r2.j()
                boolean r3 = android.text.TextUtils.equals(r3, r6)
                if (r3 == 0) goto L1c
                r2.Y0(r7)
                long r3 = r2.xt()
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                r0.put(r3, r2)
                goto L1c
            L43:
                return r0
        }

        public void i(long r2, com.ss.android.j.j.cw.c r4) {
                r1 = this;
                if (r4 == 0) goto Lb
                java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.ss.android.j.j.cw.c> r0 = r1.d
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                r0.put(r2, r4)
            Lb:
                return
        }

        public void j(long r2, com.ss.android.j.j.cw.g r4) {
                r1 = this;
                if (r4 == 0) goto Lb
                java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.ss.android.j.j.cw.g> r0 = r1.c
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                r0.put(r2, r4)
            Lb:
                return
        }

        public void k(com.ss.android.j.j.cw.b r4) {
                r3 = this;
                if (r4 == 0) goto L2b
                java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.ss.android.j.j.cw.b> r0 = r3.b
                long r1 = r4.r()
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r0.put(r1, r4)
                com.ss.android.j.j.up.f r0 = r4.l()
                if (r0 == 0) goto L2b
                com.ss.android.j.j.up.f r0 = r4.l()
                long r1 = r4.r()
                r0.c(r1)
                com.ss.android.j.j.up.f r0 = r4.l()
                java.lang.String r4 = r4.s()
                r0.e(r4)
            L2b:
                return
        }

        public synchronized void l(com.ss.android.xt.j.xt.b r4) {
                r3 = this;
                monitor-enter(r3)
                if (r4 != 0) goto L5
                monitor-exit(r3)
                return
            L5:
                java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.ss.android.xt.j.xt.b> r0 = r3.e     // Catch: java.lang.Throwable -> L1b
                long r1 = r4.xt()     // Catch: java.lang.Throwable -> L1b
                java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L1b
                r0.put(r1, r4)     // Catch: java.lang.Throwable -> L1b
                com.ss.android.downloadlib.addownload.o$d r0 = com.ss.android.downloadlib.addownload.o.d.c()     // Catch: java.lang.Throwable -> L1b
                r0.d(r4)     // Catch: java.lang.Throwable -> L1b
                monitor-exit(r3)
                return
            L1b:
                r4 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L1b
                throw r4
        }

        public synchronized void m(java.util.List<java.lang.Long> r5) {
                r4 = this;
                monitor-enter(r4)
                java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L27
                r0.<init>()     // Catch: java.lang.Throwable -> L27
                java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L27
            La:
                boolean r1 = r5.hasNext()     // Catch: java.lang.Throwable -> L27
                if (r1 == 0) goto L29
                java.lang.Object r1 = r5.next()     // Catch: java.lang.Throwable -> L27
                java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.Throwable -> L27
                long r2 = r1.longValue()     // Catch: java.lang.Throwable -> L27
                java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L27
                r0.add(r2)     // Catch: java.lang.Throwable -> L27
                java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.ss.android.xt.j.xt.b> r2 = r4.e     // Catch: java.lang.Throwable -> L27
                r2.remove(r1)     // Catch: java.lang.Throwable -> L27
                goto La
            L27:
                r5 = move-exception
                goto L32
            L29:
                com.ss.android.downloadlib.addownload.o$d r5 = com.ss.android.downloadlib.addownload.o.d.c()     // Catch: java.lang.Throwable -> L27
                r5.f(r0)     // Catch: java.lang.Throwable -> L27
                monitor-exit(r4)
                return
            L32:
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L27
                throw r5
        }

        public void p(long r3) {
                r2 = this;
                java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.ss.android.j.j.cw.b> r0 = r2.b
                java.lang.Long r1 = java.lang.Long.valueOf(r3)
                r0.remove(r1)
                java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.ss.android.j.j.cw.g> r0 = r2.c
                java.lang.Long r1 = java.lang.Long.valueOf(r3)
                r0.remove(r1)
                java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.ss.android.j.j.cw.c> r0 = r2.d
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                r0.remove(r3)
                return
        }

        public com.ss.android.xt.j.xt.b q(long r2) {
                r1 = this;
                java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.ss.android.xt.j.xt.b> r0 = r1.e
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                java.lang.Object r2 = r0.get(r2)
                com.ss.android.xt.j.xt.b r2 = (com.ss.android.xt.j.xt.b) r2
                return r2
        }

        @androidx.annotation.NonNull
        public com.ss.android.downloadlib.addownload.o.i r(long r3) {
                r2 = this;
                com.ss.android.downloadlib.addownload.o$i r0 = new com.ss.android.downloadlib.addownload.o$i
                r0.<init>()
                r0.a = r3
                com.ss.android.j.j.cw.b r1 = r2.d(r3)
                r0.b = r1
                com.ss.android.j.j.cw.g r1 = r2.s(r3)
                r0.c = r1
                if (r1 != 0) goto L1c
                com.ss.android.j.j.cw.a r1 = new com.ss.android.j.j.cw.a
                r1.<init>()
                r0.c = r1
            L1c:
                com.ss.android.j.j.cw.c r3 = r2.a(r3)
                r0.d = r3
                if (r3 != 0) goto L2b
                com.ss.android.j.j.cw.d r3 = new com.ss.android.j.j.cw.d
                r3.<init>()
                r0.d = r3
            L2b:
                return r0
        }

        public com.ss.android.j.j.cw.g s(long r2) {
                r1 = this;
                java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.ss.android.j.j.cw.g> r0 = r1.c
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                java.lang.Object r2 = r0.get(r2)
                com.ss.android.j.j.cw.g r2 = (com.ss.android.j.j.cw.g) r2
                return r2
        }

        public com.ss.android.xt.j.xt.b t(java.lang.String r5) {
                r4 = this;
                boolean r0 = android.text.TextUtils.isEmpty(r5)
                r1 = 0
                if (r0 == 0) goto L8
                return r1
            L8:
                java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.ss.android.xt.j.xt.b> r0 = r4.e
                java.util.Collection r0 = r0.values()
                java.util.Iterator r0 = r0.iterator()
            L12:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L2b
                java.lang.Object r2 = r0.next()
                com.ss.android.xt.j.xt.b r2 = (com.ss.android.xt.j.xt.b) r2
                if (r2 == 0) goto L12
                java.lang.String r3 = r2.j()
                boolean r3 = r5.equals(r3)
                if (r3 == 0) goto L12
                return r2
            L2b:
                return r1
        }

        public void v() {
                r3 = this;
                com.ss.android.downloadlib.e r0 = com.ss.android.downloadlib.e.c()
                com.ss.android.downloadlib.addownload.o$f$a r1 = new com.ss.android.downloadlib.addownload.o$f$a
                r1.<init>(r3)
                r2 = 1
                r0.f(r1, r2)
                return
        }

        public void w(java.lang.String r4, java.lang.String r5) {
                r3 = this;
                boolean r0 = android.text.TextUtils.isEmpty(r4)
                if (r0 != 0) goto L37
                boolean r0 = android.text.TextUtils.isEmpty(r5)
                if (r0 == 0) goto Ld
                goto L37
            Ld:
                java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.ss.android.j.j.cw.b> r0 = r3.b
                java.util.Collection r0 = r0.values()
                java.util.Iterator r0 = r0.iterator()
            L17:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L37
                java.lang.Object r1 = r0.next()
                com.ss.android.j.j.cw.b r1 = (com.ss.android.j.j.cw.b) r1
                boolean r2 = r1 instanceof com.ss.android.xt.j.j.a
                if (r2 == 0) goto L17
                java.lang.String r2 = r1.j()
                boolean r2 = android.text.TextUtils.equals(r2, r4)
                if (r2 == 0) goto L17
                com.ss.android.xt.j.j.a r1 = (com.ss.android.xt.j.j.a) r1
                r1.z(r5)
                goto L17
            L37:
                return
        }
    }

    public class g {
        private static volatile com.ss.android.downloadlib.addownload.o.g b;
        private static final java.lang.String[] c = null;
        private static final int[] d = null;
        private final java.util.LinkedList<com.ss.android.downloadlib.addownload.o.g.b> a;

        static /* synthetic */ class a {
            public a() {
                    r1 = this;
                    r1.<init>()
                    return
            }
        }

        public static class b {
            public final java.lang.String a;
            public final int b;
            public final java.lang.String c;
            public final java.lang.String d;
            public final long e;

            private b(java.lang.String r1, int r2, java.lang.String r3, java.lang.String r4, long r5) {
                    r0 = this;
                    r0.<init>()
                    r0.a = r1
                    r0.b = r2
                    r1 = 0
                    if (r3 == 0) goto Lf
                    java.lang.String r2 = r3.toLowerCase()
                    goto L10
                Lf:
                    r2 = r1
                L10:
                    r0.c = r2
                    if (r4 == 0) goto L18
                    java.lang.String r1 = r4.toLowerCase()
                L18:
                    r0.d = r1
                    r0.e = r5
                    return
            }

            /* synthetic */ b(java.lang.String r1, int r2, java.lang.String r3, java.lang.String r4, long r5, com.ss.android.downloadlib.addownload.o.g.a r7) {
                    r0 = this;
                    r0.<init>(r1, r2, r3, r4, r5)
                    return
            }
        }

        static {
                java.lang.String r0 = "android"
                java.lang.String r1 = "ss"
                java.lang.String r2 = "com"
                java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
                com.ss.android.downloadlib.addownload.o.g.c = r0
                r0 = 6
                int[] r0 = new int[r0]
                r0 = {x0016: FILL_ARRAY_DATA , data: [3101, 3102, 3103, 3201, 3202, 3203} // fill-array
                com.ss.android.downloadlib.addownload.o.g.d = r0
                return
        }

        private g() {
                r1 = this;
                r1.<init>()
                java.util.LinkedList r0 = new java.util.LinkedList
                r0.<init>()
                r1.a = r0
                return
        }

        private com.ss.android.downloadlib.addownload.o.g.b a(java.lang.String r11) {
                r10 = this;
                android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()     // Catch: java.lang.Throwable -> L28
                android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L28
                r1 = 0
                android.content.pm.PackageInfo r1 = r0.getPackageInfo(r11, r1)     // Catch: java.lang.Throwable -> L28
                if (r1 == 0) goto L2d
                com.ss.android.downloadlib.addownload.o$g$b r2 = new com.ss.android.downloadlib.addownload.o$g$b     // Catch: java.lang.Throwable -> L28
                int r4 = r1.versionCode     // Catch: java.lang.Throwable -> L28
                java.lang.String r5 = r1.versionName     // Catch: java.lang.Throwable -> L28
                android.content.pm.ApplicationInfo r1 = r1.applicationInfo     // Catch: java.lang.Throwable -> L28
                java.lang.CharSequence r0 = r0.getApplicationLabel(r1)     // Catch: java.lang.Throwable -> L28
                r6 = r0
                java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L28
                long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L28
                r9 = 0
                r3 = r11
                r2.<init>(r3, r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L28
                return r2
            L28:
                r0 = move-exception
                r11 = r0
                com.bytedance.sdk.component.utils.vl.j(r11)
            L2d:
                r11 = 0
                return r11
        }

        public static com.ss.android.downloadlib.addownload.o.g c() {
                com.ss.android.downloadlib.addownload.o$g r0 = com.ss.android.downloadlib.addownload.o.g.b
                if (r0 != 0) goto L19
                java.lang.Class<com.ss.android.downloadlib.addownload.o$g> r0 = com.ss.android.downloadlib.addownload.o.g.class
                monitor-enter(r0)
                com.ss.android.downloadlib.addownload.o$g r1 = com.ss.android.downloadlib.addownload.o.g.b     // Catch: java.lang.Throwable -> L13
                if (r1 != 0) goto L15
                com.ss.android.downloadlib.addownload.o$g r1 = new com.ss.android.downloadlib.addownload.o$g     // Catch: java.lang.Throwable -> L13
                r1.<init>()     // Catch: java.lang.Throwable -> L13
                com.ss.android.downloadlib.addownload.o.g.b = r1     // Catch: java.lang.Throwable -> L13
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
                com.ss.android.downloadlib.addownload.o$g r0 = com.ss.android.downloadlib.addownload.o.g.b
                return r0
        }

        private static boolean e(java.lang.String r12, java.lang.String r13) {
                java.lang.String r0 = "\\."
                r1 = 0
                java.lang.String[] r12 = r12.split(r0)     // Catch: java.lang.Throwable -> L37
                java.lang.String[] r13 = r13.split(r0)     // Catch: java.lang.Throwable -> L37
                int r0 = r12.length     // Catch: java.lang.Throwable -> L37
                if (r0 == 0) goto L60
                int r0 = r13.length     // Catch: java.lang.Throwable -> L37
                if (r0 != 0) goto L12
                goto L60
            L12:
                int r0 = r12.length     // Catch: java.lang.Throwable -> L37
                r2 = 0
                r3 = 0
                r4 = 0
            L16:
                if (r2 >= r0) goto L64
                r5 = r12[r2]     // Catch: java.lang.Throwable -> L37
                java.lang.String[] r6 = com.ss.android.downloadlib.addownload.o.g.c     // Catch: java.lang.Throwable -> L37
                int r7 = r6.length     // Catch: java.lang.Throwable -> L37
                r8 = 0
            L1e:
                r9 = 1
                if (r8 >= r7) goto L3e
                r10 = r6[r8]     // Catch: java.lang.Throwable -> L37
                boolean r11 = r10.equals(r5)     // Catch: java.lang.Throwable -> L37
                if (r11 == 0) goto L3b
                int r6 = r13.length     // Catch: java.lang.Throwable -> L37
                if (r3 >= r6) goto L39
                r6 = r13[r3]     // Catch: java.lang.Throwable -> L37
                boolean r6 = r10.equals(r6)     // Catch: java.lang.Throwable -> L37
                if (r6 == 0) goto L39
                int r3 = r3 + 1
                goto L39
            L37:
                r12 = move-exception
                goto L61
            L39:
                r6 = 1
                goto L3f
            L3b:
                int r8 = r8 + 1
                goto L1e
            L3e:
                r6 = 0
            L3f:
                if (r6 != 0) goto L5d
                r6 = r4
                r4 = r3
            L43:
                int r7 = r13.length     // Catch: java.lang.Throwable -> L37
                if (r3 >= r7) goto L5b
                r7 = r13[r3]     // Catch: java.lang.Throwable -> L37
                boolean r7 = r5.equals(r7)     // Catch: java.lang.Throwable -> L37
                if (r7 == 0) goto L58
                if (r3 != r4) goto L52
                int r4 = r4 + 1
            L52:
                int r6 = r6 + 1
                r7 = 2
                if (r6 < r7) goto L58
                return r9
            L58:
                int r3 = r3 + 1
                goto L43
            L5b:
                r3 = r4
                r4 = r6
            L5d:
                int r2 = r2 + 1
                goto L16
            L60:
                return r1
            L61:
                com.bytedance.sdk.component.utils.vl.j(r12)
            L64:
                return r1
        }

        private void g() {
                r9 = this;
                long r0 = java.lang.System.currentTimeMillis()
                java.util.LinkedList<com.ss.android.downloadlib.addownload.o$g$b> r2 = r9.a
                monitor-enter(r2)
                java.util.LinkedList<com.ss.android.downloadlib.addownload.o$g$b> r3 = r9.a     // Catch: java.lang.Throwable -> L28
                java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L28
            Ld:
                boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L28
                if (r4 == 0) goto L2a
                java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L28
                com.ss.android.downloadlib.addownload.o$g$b r4 = (com.ss.android.downloadlib.addownload.o.g.b) r4     // Catch: java.lang.Throwable -> L28
                long r4 = r4.e     // Catch: java.lang.Throwable -> L28
                long r4 = r0 - r4
                r6 = 1800000(0x1b7740, double:8.89318E-318)
                int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r8 <= 0) goto L2a
                r3.remove()     // Catch: java.lang.Throwable -> L28
                goto Ld
            L28:
                r0 = move-exception
                goto L2c
            L2a:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L28
                return
            L2c:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L28
                throw r0
        }

        public com.ss.android.downloadlib.addownload.o.g.b b(com.ss.android.xt.j.xt.b r10) {
                r9 = this;
                r0 = 0
                if (r10 != 0) goto L4
                return r0
            L4:
                r9.g()
                java.util.LinkedList<com.ss.android.downloadlib.addownload.o$g$b> r1 = r9.a
                monitor-enter(r1)
                java.util.LinkedList<com.ss.android.downloadlib.addownload.o$g$b> r2 = r9.a     // Catch: java.lang.Throwable -> L28
                java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L28
            L10:
                boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L28
                if (r3 == 0) goto L2a
                java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L28
                com.ss.android.downloadlib.addownload.o$g$b r3 = (com.ss.android.downloadlib.addownload.o.g.b) r3     // Catch: java.lang.Throwable -> L28
                long r4 = r3.e     // Catch: java.lang.Throwable -> L28
                long r6 = r10.g0()     // Catch: java.lang.Throwable -> L28
                int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r8 <= 0) goto L10
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L28
                return r3
            L28:
                r10 = move-exception
                goto L2c
            L2a:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L28
                return r0
            L2c:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L28
                throw r10
        }

        public void d(java.lang.String r3) {
                r2 = this;
                r2.g()
                boolean r0 = android.text.TextUtils.isEmpty(r3)
                if (r0 == 0) goto La
                goto L1d
            La:
                com.ss.android.downloadlib.addownload.o$g$b r3 = r2.a(r3)
                if (r3 == 0) goto L1d
                java.util.LinkedList<com.ss.android.downloadlib.addownload.o$g$b> r0 = r2.a
                monitor-enter(r0)
                java.util.LinkedList<com.ss.android.downloadlib.addownload.o$g$b> r1 = r2.a     // Catch: java.lang.Throwable -> L1a
                r1.add(r3)     // Catch: java.lang.Throwable -> L1a
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
                return
            L1a:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
                throw r3
            L1d:
                return
        }

        public android.util.Pair<com.ss.android.downloadlib.addownload.o.g.b, java.lang.Integer> f(com.ss.android.xt.j.xt.b r19) {
                r18 = this;
                r1 = r18
                r2 = 0
                if (r19 != 0) goto L6
                return r2
            L6:
                r1.g()     // Catch: java.lang.Throwable -> L149
                java.util.LinkedList<com.ss.android.downloadlib.addownload.o$g$b> r0 = r1.a     // Catch: java.lang.Throwable -> L149
                boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L149
                if (r0 == 0) goto L12
                return r2
            L12:
                java.lang.String r0 = r19.a0()     // Catch: java.lang.Throwable -> L149
                java.lang.String r3 = r19.up()     // Catch: java.lang.Throwable -> L149
                java.lang.String r4 = r19.t()     // Catch: java.lang.Throwable -> L149
                int r5 = r19.F0()     // Catch: java.lang.Throwable -> L149
                int[] r6 = com.ss.android.downloadlib.addownload.o.g.d     // Catch: java.lang.Throwable -> L149
                int r6 = r6.length     // Catch: java.lang.Throwable -> L149
                com.ss.android.downloadlib.addownload.o$g$b[] r7 = new com.ss.android.downloadlib.addownload.o.g.b[r6]     // Catch: java.lang.Throwable -> L149
                java.util.LinkedList<com.ss.android.downloadlib.addownload.o$g$b> r8 = r1.a     // Catch: java.lang.Throwable -> L149
                monitor-enter(r8)     // Catch: java.lang.Throwable -> L149
                java.util.LinkedList<com.ss.android.downloadlib.addownload.o$g$b> r9 = r1.a     // Catch: java.lang.Throwable -> L55
                java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L55
                r10 = r2
            L31:
                boolean r11 = r9.hasNext()     // Catch: java.lang.Throwable -> L55
                r12 = 0
                if (r11 == 0) goto L132
                java.lang.Object r11 = r9.next()     // Catch: java.lang.Throwable -> L55
                com.ss.android.downloadlib.addownload.o$g$b r11 = (com.ss.android.downloadlib.addownload.o.g.b) r11     // Catch: java.lang.Throwable -> L55
                long r13 = r11.e     // Catch: java.lang.Throwable -> L55
                long r15 = r19.g0()     // Catch: java.lang.Throwable -> L55
                int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                if (r17 < 0) goto L31
                boolean r13 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L55
                if (r13 == 0) goto L6b
                if (r10 != 0) goto L58
                android.content.pm.PackageInfo r10 = com.ss.android.downloadlib.a.h.k(r19)     // Catch: java.lang.Throwable -> L55
                goto L58
            L55:
                r0 = move-exception
                goto L14e
            L58:
                if (r10 == 0) goto L6b
                android.content.Context r13 = com.ss.android.downloadlib.addownload.m.getContext()     // Catch: java.lang.Throwable -> L6b
                android.content.pm.PackageManager r13 = r13.getPackageManager()     // Catch: java.lang.Throwable -> L6b
                android.content.pm.ApplicationInfo r14 = r10.applicationInfo     // Catch: java.lang.Throwable -> L6b
                java.lang.CharSequence r13 = r13.getApplicationLabel(r14)     // Catch: java.lang.Throwable -> L6b
                java.lang.String r13 = (java.lang.String) r13     // Catch: java.lang.Throwable -> L6b
                r0 = r13
            L6b:
                boolean r13 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L55
                if (r13 != 0) goto L9e
                java.lang.String r13 = r11.d     // Catch: java.lang.Throwable -> L55
                boolean r13 = android.text.TextUtils.isEmpty(r13)     // Catch: java.lang.Throwable -> L55
                if (r13 != 0) goto L9e
                java.lang.String r0 = r0.toLowerCase()     // Catch: java.lang.Throwable -> L55
                java.lang.String r13 = r11.d     // Catch: java.lang.Throwable -> L55
                boolean r13 = r0.equals(r13)     // Catch: java.lang.Throwable -> L55
                if (r13 == 0) goto L89
                r7[r12] = r11     // Catch: java.lang.Throwable -> L55
                goto L132
            L89:
                java.lang.String r13 = r11.d     // Catch: java.lang.Throwable -> L55
                boolean r13 = r0.contains(r13)     // Catch: java.lang.Throwable -> L55
                if (r13 != 0) goto L99
                java.lang.String r13 = r11.d     // Catch: java.lang.Throwable -> L55
                boolean r13 = r13.contains(r0)     // Catch: java.lang.Throwable -> L55
                if (r13 == 0) goto L9e
            L99:
                r0 = 1
                r7[r0] = r11     // Catch: java.lang.Throwable -> L55
                goto L132
            L9e:
                boolean r13 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L55
                if (r13 == 0) goto Lae
                if (r10 != 0) goto Laa
                android.content.pm.PackageInfo r10 = com.ss.android.downloadlib.a.h.k(r19)     // Catch: java.lang.Throwable -> L55
            Laa:
                if (r10 == 0) goto Lae
                java.lang.String r3 = r10.packageName     // Catch: java.lang.Throwable -> L55
            Lae:
                boolean r13 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L55
                if (r13 != 0) goto Le6
                java.lang.String r13 = r11.a     // Catch: java.lang.Throwable -> L55
                boolean r13 = android.text.TextUtils.isEmpty(r13)     // Catch: java.lang.Throwable -> L55
                if (r13 != 0) goto Le6
                java.lang.String r3 = r3.toLowerCase()     // Catch: java.lang.Throwable -> L55
                java.lang.String r13 = r11.a     // Catch: java.lang.Throwable -> L55
                boolean r13 = r3.contains(r13)     // Catch: java.lang.Throwable -> L55
                if (r13 != 0) goto Le2
                java.lang.String r13 = r11.a     // Catch: java.lang.Throwable -> L55
                boolean r13 = r13.contains(r3)     // Catch: java.lang.Throwable -> L55
                if (r13 == 0) goto Ld1
                goto Le2
            Ld1:
                r12 = 3
                r13 = r7[r12]     // Catch: java.lang.Throwable -> L55
                if (r13 != 0) goto L31
                java.lang.String r13 = r11.a     // Catch: java.lang.Throwable -> L55
                boolean r13 = e(r3, r13)     // Catch: java.lang.Throwable -> L55
                if (r13 == 0) goto Le6
                r7[r12] = r11     // Catch: java.lang.Throwable -> L55
                goto L31
            Le2:
                r0 = 2
                r7[r0] = r11     // Catch: java.lang.Throwable -> L55
                goto L132
            Le6:
                r12 = 4
                r13 = r7[r12]     // Catch: java.lang.Throwable -> L55
                if (r13 != 0) goto L31
                boolean r13 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L55
                if (r13 == 0) goto Lfb
                if (r10 != 0) goto Lf7
                android.content.pm.PackageInfo r10 = com.ss.android.downloadlib.a.h.k(r19)     // Catch: java.lang.Throwable -> L55
            Lf7:
                if (r10 == 0) goto Lfb
                java.lang.String r4 = r10.versionName     // Catch: java.lang.Throwable -> L55
            Lfb:
                boolean r13 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L55
                if (r13 != 0) goto L119
                java.lang.String r13 = r11.c     // Catch: java.lang.Throwable -> L55
                boolean r13 = android.text.TextUtils.isEmpty(r13)     // Catch: java.lang.Throwable -> L55
                if (r13 != 0) goto L119
                java.lang.String r4 = r4.toLowerCase()     // Catch: java.lang.Throwable -> L55
                java.lang.String r13 = r11.c     // Catch: java.lang.Throwable -> L55
                boolean r13 = r4.equals(r13)     // Catch: java.lang.Throwable -> L55
                if (r13 == 0) goto L119
                r7[r12] = r11     // Catch: java.lang.Throwable -> L55
                goto L31
            L119:
                r12 = 5
                r13 = r7[r12]     // Catch: java.lang.Throwable -> L55
                if (r13 != 0) goto L31
                if (r5 > 0) goto L12a
                if (r10 != 0) goto L126
                android.content.pm.PackageInfo r10 = com.ss.android.downloadlib.a.h.k(r19)     // Catch: java.lang.Throwable -> L55
            L126:
                if (r10 == 0) goto L12a
                int r5 = r10.versionCode     // Catch: java.lang.Throwable -> L55
            L12a:
                int r13 = r11.b     // Catch: java.lang.Throwable -> L55
                if (r5 != r13) goto L31
                r7[r12] = r11     // Catch: java.lang.Throwable -> L55
                goto L31
            L132:
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L55
            L133:
                if (r12 >= r6) goto L153
                r0 = r7[r12]     // Catch: java.lang.Throwable -> L149
                if (r0 == 0) goto L14b
                android.util.Pair r0 = new android.util.Pair     // Catch: java.lang.Throwable -> L149
                r3 = r7[r12]     // Catch: java.lang.Throwable -> L149
                int[] r4 = com.ss.android.downloadlib.addownload.o.g.d     // Catch: java.lang.Throwable -> L149
                r4 = r4[r12]     // Catch: java.lang.Throwable -> L149
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L149
                r0.<init>(r3, r4)     // Catch: java.lang.Throwable -> L149
                return r0
            L149:
                r0 = move-exception
                goto L150
            L14b:
                int r12 = r12 + 1
                goto L133
            L14e:
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L55
                throw r0     // Catch: java.lang.Throwable -> L149
            L150:
                com.bytedance.sdk.component.utils.vl.j(r0)
            L153:
                return r2
        }

        public void h(java.lang.String r4) {
                r3 = this;
                r3.g()
                boolean r0 = android.text.TextUtils.isEmpty(r4)
                if (r0 == 0) goto La
                return
            La:
                java.util.LinkedList<com.ss.android.downloadlib.addownload.o$g$b> r0 = r3.a
                monitor-enter(r0)
                java.util.LinkedList<com.ss.android.downloadlib.addownload.o$g$b> r1 = r3.a     // Catch: java.lang.Throwable -> L2c
                java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L2c
            L13:
                boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L2c
                if (r2 == 0) goto L2e
                java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L2c
                com.ss.android.downloadlib.addownload.o$g$b r2 = (com.ss.android.downloadlib.addownload.o.g.b) r2     // Catch: java.lang.Throwable -> L2c
                java.lang.String r2 = r2.a     // Catch: java.lang.Throwable -> L2c
                boolean r2 = r4.equals(r2)     // Catch: java.lang.Throwable -> L2c
                if (r2 == 0) goto L13
                r1.remove()     // Catch: java.lang.Throwable -> L2c
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
                return
            L2c:
                r4 = move-exception
                goto L30
            L2e:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
                return
            L30:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
                throw r4
        }
    }

    public class h {
        private static volatile com.ss.android.downloadlib.addownload.o.h a;

        private h() {
                r0 = this;
                r0.<init>()
                return
        }

        public static com.ss.android.downloadlib.addownload.o.h a() {
                com.ss.android.downloadlib.addownload.o$h r0 = com.ss.android.downloadlib.addownload.o.h.a
                if (r0 != 0) goto L19
                java.lang.Class<com.ss.android.downloadlib.addownload.o$g> r0 = com.ss.android.downloadlib.addownload.o.g.class
                monitor-enter(r0)
                com.ss.android.downloadlib.addownload.o$h r1 = com.ss.android.downloadlib.addownload.o.h.a     // Catch: java.lang.Throwable -> L13
                if (r1 != 0) goto L15
                com.ss.android.downloadlib.addownload.o$h r1 = new com.ss.android.downloadlib.addownload.o$h     // Catch: java.lang.Throwable -> L13
                r1.<init>()     // Catch: java.lang.Throwable -> L13
                com.ss.android.downloadlib.addownload.o.h.a = r1     // Catch: java.lang.Throwable -> L13
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
                com.ss.android.downloadlib.addownload.o$h r0 = com.ss.android.downloadlib.addownload.o.h.a
                return r0
        }

        public void b(int r4, int r5, com.ss.android.xt.j.xt.b r6) {
                r3 = this;
                if (r6 != 0) goto L3
                goto L46
            L3:
                int r0 = r6.mi()
                com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.j(r0)
                java.lang.String r1 = "report_api_hijack"
                r2 = 0
                int r1 = r0.j(r1, r2)
                if (r1 != 0) goto L15
                goto L46
            L15:
                int r1 = r5 - r4
                if (r4 <= 0) goto L46
                java.lang.String r4 = "check_api_hijack_version_code_diff"
                r2 = 500(0x1f4, float:7.0E-43)
                int r4 = r0.j(r4, r2)
                if (r1 <= r4) goto L46
                org.json.JSONObject r4 = new org.json.JSONObject
                r4.<init>()
                java.lang.String r0 = "version_code_diff"
                r4.put(r0, r1)     // Catch: org.json.JSONException -> L39
                java.lang.String r0 = "installed_version_code"
                r4.put(r0, r5)     // Catch: org.json.JSONException -> L39
                java.lang.String r5 = "hijack_type"
                r0 = 1
                r4.put(r5, r0)     // Catch: org.json.JSONException -> L39
                goto L3d
            L39:
                r5 = move-exception
                com.bytedance.sdk.component.utils.vl.j(r5)
            L3d:
                com.ss.android.downloadlib.r.b r5 = com.ss.android.downloadlib.r.b.a()
                java.lang.String r0 = "api_hijack"
                r5.x(r0, r4, r6)
            L46:
                return
        }
    }

    public class i implements com.ss.android.xt.j.xt.a {
        public long a;
        public com.ss.android.j.j.cw.b b;
        public com.ss.android.j.j.cw.g c;
        public com.ss.android.j.j.cw.c d;
        public com.ss.android.xt.j.xt.b e;

        public i() {
                r0 = this;
                r0.<init>()
                return
        }

        public i(long r1, @androidx.annotation.NonNull com.ss.android.j.j.cw.b r3, @androidx.annotation.NonNull com.ss.android.j.j.cw.g r4, @androidx.annotation.NonNull com.ss.android.j.j.cw.c r5) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r3
                r0.c = r4
                r0.d = r5
                return
        }

        public boolean a() {
                r3 = this;
                boolean r0 = r3.b()
                r1 = 0
                if (r0 == 0) goto L8
                return r1
            L8:
                com.ss.android.j.j.cw.b r0 = r3.b
                boolean r0 = r0.x()
                if (r0 == 0) goto L2f
                com.ss.android.j.j.cw.b r0 = r3.b
                boolean r2 = r0 instanceof com.ss.android.xt.j.j.a
                if (r2 == 0) goto L2e
                java.lang.String r0 = r0.ch()
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L2e
                com.ss.android.j.j.cw.g r0 = r3.c
                boolean r0 = r0 instanceof com.ss.android.xt.j.j.c
                if (r0 == 0) goto L2e
                com.ss.android.j.j.cw.c r0 = r3.d
                boolean r0 = r0 instanceof com.ss.android.xt.j.j.b
                if (r0 == 0) goto L2e
                r0 = 1
                return r0
            L2e:
                return r1
            L2f:
                com.ss.android.j.j.cw.b r0 = r3.b
                boolean r0 = r0 instanceof com.ss.android.xt.j.j.a
                return r0
        }

        public org.json.JSONObject ae() {
                r1 = this;
                com.ss.android.j.j.cw.b r0 = r1.b
                org.json.JSONObject r0 = r0.h()
                return r0
        }

        public org.json.JSONObject av() {
                r1 = this;
                com.ss.android.j.j.cw.g r0 = r1.c
                org.json.JSONObject r0 = r0.ws()
                return r0
        }

        public java.lang.Object az() {
                r1 = this;
                com.ss.android.j.j.cw.g r0 = r1.c
                java.lang.Object r0 = r0.oq()
                return r0
        }

        public boolean b() {
                r6 = this;
                long r0 = r6.a
                r2 = 1
                r3 = 0
                int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r5 == 0) goto L25
                com.ss.android.j.j.cw.b r0 = r6.b
                if (r0 == 0) goto L25
                com.ss.android.j.j.cw.g r1 = r6.c
                if (r1 == 0) goto L25
                com.ss.android.j.j.cw.c r1 = r6.d
                if (r1 != 0) goto L16
                goto L25
            L16:
                boolean r0 = r0.x()
                if (r0 == 0) goto L23
                long r0 = r6.a
                int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r5 > 0) goto L23
                return r2
            L23:
                r0 = 0
                return r0
            L25:
                return r2
        }

        public boolean cw() {
                r1 = this;
                com.ss.android.j.j.cw.b r0 = r1.b
                boolean r0 = r0.x()
                return r0
        }

        public com.ss.android.j.j.cw.g f() {
                r1 = this;
                com.ss.android.j.j.cw.g r0 = r1.c
                return r0
        }

        public java.lang.String g() {
                r1 = this;
                com.ss.android.j.j.cw.g r0 = r1.c
                java.lang.String r0 = r0.j()
                return r0
        }

        public boolean i() {
                r1 = this;
                com.ss.android.j.j.cw.c r0 = r1.d
                boolean r0 = r0.ws()
                return r0
        }

        public java.lang.String j() {
                r1 = this;
                com.ss.android.j.j.cw.b r0 = r1.b
                java.lang.String r0 = r0.j()
                return r0
        }

        public boolean jy() {
                r1 = this;
                com.ss.android.j.j.cw.g r0 = r1.c
                boolean r0 = r0.jy()
                return r0
        }

        public int kt() {
                r1 = this;
                com.ss.android.j.j.cw.g r0 = r1.c
                int r0 = r0.qv()
                return r0
        }

        public java.lang.String m() {
                r1 = this;
                com.ss.android.j.j.cw.b r0 = r1.b
                com.ss.android.j.j.up.f r0 = r0.l()
                if (r0 == 0) goto L13
                com.ss.android.j.j.cw.b r0 = r1.b
                com.ss.android.j.j.up.f r0 = r0.l()
                java.lang.String r0 = r0.f()
                return r0
            L13:
                r0 = 0
                return r0
        }

        public int mi() {
                r1 = this;
                r0 = 0
                return r0
        }

        public java.lang.String oq() {
                r1 = this;
                com.ss.android.j.j.cw.g r0 = r1.c
                java.lang.String r0 = r0.xt()
                return r0
        }

        public org.json.JSONObject qv() {
                r1 = this;
                com.ss.android.j.j.cw.g r0 = r1.c
                org.json.JSONObject r0 = r0.az()
                return r0
        }

        public java.lang.String r() {
                r1 = this;
                com.ss.android.j.j.cw.b r0 = r1.b
                java.lang.String r0 = r0.ch()
                return r0
        }

        public com.ss.android.j.j.cw.b tj() {
                r1 = this;
                com.ss.android.j.j.cw.b r0 = r1.b
                return r0
        }

        public int tl() {
                r2 = this;
                com.ss.android.j.j.cw.c r0 = r2.d
                int r0 = r0.xt()
                r1 = 2
                if (r0 != r1) goto La
                return r1
            La:
                com.ss.android.j.j.cw.b r0 = r2.b
                int r0 = r0.c()
                return r0
        }

        public java.lang.String up() {
                r1 = this;
                com.ss.android.j.j.cw.b r0 = r1.b
                java.lang.String r0 = r0.s()
                return r0
        }

        public com.ss.android.j.j.cw.c v() {
                r1 = this;
                com.ss.android.j.j.cw.c r0 = r1.d
                return r0
        }

        public long vl() {
                r2 = this;
                com.ss.android.j.j.cw.b r0 = r2.b
                long r0 = r0.ae()
                return r0
        }

        public org.json.JSONObject w() {
                r1 = this;
                com.ss.android.j.j.cw.b r0 = r1.b
                org.json.JSONObject r0 = r0.w()
                return r0
        }

        public java.util.List<java.lang.String> ws() {
                r1 = this;
                com.ss.android.j.j.cw.b r0 = r1.b
                java.util.List r0 = r0.p()
                return r0
        }

        public long xt() {
                r2 = this;
                com.ss.android.j.j.cw.b r0 = r2.b
                long r0 = r0.r()
                return r0
        }
    }

    public class j {
        public long a;
        public long b;
        public java.lang.String c;
        public java.lang.String d;
        public java.lang.String e;
        public java.lang.String f;
        public java.lang.String g;
        public final java.util.List<android.util.Pair<java.lang.String, java.lang.String>> h;
        public java.lang.String i;

        public j() {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.h = r0
                return
        }

        public static long b(long r3, long r5) {
                r0 = 0
                int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r2 <= 0) goto L7
                return r3
            L7:
                return r5
        }

        public long a() {
                r4 = this;
                long r0 = r4.a
                long r2 = r4.b
                long r0 = b(r0, r2)
                return r0
        }
    }

    public o() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            return
    }

    public static com.ss.android.downloadlib.addownload.o a() {
            com.ss.android.downloadlib.addownload.o r0 = com.ss.android.downloadlib.addownload.o.b
            if (r0 != 0) goto L19
            java.lang.Class<com.ss.android.downloadlib.addownload.o> r0 = com.ss.android.downloadlib.addownload.o.class
            monitor-enter(r0)
            com.ss.android.downloadlib.addownload.o r1 = com.ss.android.downloadlib.addownload.o.b     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.ss.android.downloadlib.addownload.o r1 = new com.ss.android.downloadlib.addownload.o     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.ss.android.downloadlib.addownload.o.b = r1     // Catch: java.lang.Throwable -> L13
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
            com.ss.android.downloadlib.addownload.o r0 = com.ss.android.downloadlib.addownload.o.b
            return r0
    }

    public void b(android.content.Context r4, com.ss.android.socialbase.downloader.ae.cw r5) {
            r3 = this;
            boolean r0 = r3.c()
            if (r0 != 0) goto L7
            goto L9
        L7:
            if (r5 != 0) goto La
        L9:
            return
        La:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L27
            java.lang.String r1 = r5.qv()     // Catch: java.lang.Exception -> L27
            java.lang.String r2 = r5.tl()     // Catch: java.lang.Exception -> L27
            r0.<init>(r1, r2)     // Catch: java.lang.Exception -> L27
            boolean r1 = r0.isFile()     // Catch: java.lang.Exception -> L27
            if (r1 == 0) goto L2b
            boolean r1 = r0.exists()     // Catch: java.lang.Exception -> L27
            if (r1 == 0) goto L2b
            r0.delete()     // Catch: java.lang.Exception -> L27
            goto L2b
        L27:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
        L2b:
            android.os.Handler r0 = r3.a
            if (r0 != 0) goto L3a
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r3.a = r0
        L3a:
            java.lang.String r0 = r5.oq()
            com.ss.android.socialbase.downloader.downloader.ae r4 = com.ss.android.socialbase.downloader.downloader.ae.xt(r4)
            int r5 = r5.ae()
            r4.oq(r5)
            android.os.Handler r4 = r3.a
            com.ss.android.downloadlib.addownload.o$a r5 = new com.ss.android.downloadlib.addownload.o$a
            r5.<init>(r3, r0)
            r4.post(r5)
            return
    }

    public boolean c() {
            r3 = this;
            org.json.JSONObject r0 = com.ss.android.downloadlib.addownload.m.f()
            java.lang.String r1 = "forbid_invalidte_download_file_install"
            r2 = 0
            int r0 = r0.optInt(r1, r2)
            r1 = 1
            if (r0 != r1) goto Lf
            return r1
        Lf:
            return r2
    }
}
