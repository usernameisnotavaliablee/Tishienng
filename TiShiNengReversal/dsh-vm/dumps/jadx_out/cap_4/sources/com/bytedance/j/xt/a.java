package com.bytedance.j.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class a {
    private static boolean a;
    private static boolean b;
    private static boolean c;
    private static boolean d;

    /* renamed from: com.bytedance.j.xt.a$a, reason: collision with other inner class name */
    static class RunnableC0210a implements java.lang.Runnable {
        final /* synthetic */ android.content.Context a;
        final /* synthetic */ boolean b;

        RunnableC0210a(android.content.Context r1, boolean r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                x0.a r0 = x0.a.a()
                android.content.Context r1 = r2.a
                r0.b(r1)
                android.content.Context r0 = r2.a
                com.bytedance.j.xt.a.f.a(r0)
                boolean r0 = r2.b
                if (r0 == 0) goto L1b
                android.content.Context r0 = r2.a
                com.bytedance.j.xt.j.c r0 = com.bytedance.j.xt.j.c.a(r0)
                r0.b()
            L1b:
                return
        }
    }

    static class b implements java.lang.Runnable {
        final /* synthetic */ com.bytedance.j.j.b a;

        b(com.bytedance.j.j.b r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                com.bytedance.j.j.b r0 = r1.a
                com.bytedance.j.j.a.c(r0)
                return
        }
    }

    public interface c {
        java.lang.String j(java.lang.String r1, byte[] r2);
    }

    public class d {

        @android.annotation.SuppressLint({"StaticFieldLeak"})
        private static volatile com.bytedance.j.xt.a.d b;
        private volatile android.content.Context a;

        /* renamed from: com.bytedance.j.xt.a$d$a, reason: collision with other inner class name */
        class RunnableC0211a implements java.lang.Runnable {
            final /* synthetic */ org.json.JSONObject a;
            final /* synthetic */ com.bytedance.j.xt.a.d b;

            RunnableC0211a(com.bytedance.j.xt.a.d r1, org.json.JSONObject r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r4 = this;
                    com.bytedance.j.xt.up.c r0 = com.bytedance.j.xt.e.d()
                    java.util.Map r0 = r0.b()
                    java.lang.String r0 = com.bytedance.j.xt.ae.xt.g(r0)
                    org.json.JSONObject r1 = r4.a     // Catch: org.json.JSONException -> L16
                    java.lang.String r2 = "upload_scene"
                    java.lang.String r3 = "direct"
                    r1.put(r2, r3)     // Catch: org.json.JSONException -> L16
                    goto L1a
                L16:
                    r1 = move-exception
                    com.bytedance.sdk.component.utils.vl.j(r1)
                L1a:
                    org.json.JSONObject r1 = r4.a
                    java.lang.String r1 = r1.toString()
                    com.bytedance.j.xt.ae.xt.d(r0, r1)
                    return
            }
        }

        private d(@androidx.annotation.NonNull android.content.Context r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        public static com.bytedance.j.xt.a.d b() {
                com.bytedance.j.xt.a$d r0 = com.bytedance.j.xt.a.d.b
                if (r0 != 0) goto Lf
                com.bytedance.j.xt.a$d r0 = new com.bytedance.j.xt.a$d
                android.content.Context r1 = com.bytedance.j.xt.e.i()
                r0.<init>(r1)
                com.bytedance.j.xt.a.d.b = r0
            Lf:
                com.bytedance.j.xt.a$d r0 = com.bytedance.j.xt.a.d.b
                return r0
        }

        public void a(org.json.JSONObject r2) {
                r1 = this;
                if (r2 == 0) goto L11
                int r0 = r2.length()
                if (r0 != 0) goto L9
                goto L11
            L9:
                com.bytedance.j.xt.a$d$a r0 = new com.bytedance.j.xt.a$d$a
                r0.<init>(r1, r2)
                com.bytedance.j.xt.tl.b.a(r0)
            L11:
                return
        }

        @androidx.annotation.Nullable
        public java.lang.String c(org.json.JSONObject r6) {
                r5 = this;
                r0 = 0
                if (r6 == 0) goto L29
                int r1 = r6.length()
                if (r1 > 0) goto La
                goto L29
            La:
                com.bytedance.j.xt.up.c r1 = com.bytedance.j.xt.e.d()     // Catch: java.lang.Throwable -> L29
                java.util.Map r1 = r1.b()     // Catch: java.lang.Throwable -> L29
                java.lang.String r1 = com.bytedance.j.xt.ae.xt.g(r1)     // Catch: java.lang.Throwable -> L29
                android.content.Context r2 = r5.a     // Catch: java.lang.Throwable -> L29
                java.io.File r2 = com.bytedance.j.xt.tl.l.b(r2)     // Catch: java.lang.Throwable -> L29
                java.lang.String r3 = com.bytedance.j.xt.tl.l.c()     // Catch: java.lang.Throwable -> L29
                boolean r4 = com.bytedance.j.xt.ae.xt.h()     // Catch: java.lang.Throwable -> L29
                java.lang.String r6 = com.bytedance.j.xt.tl.k.c(r2, r3, r1, r6, r4)     // Catch: java.lang.Throwable -> L29
                return r6
            L29:
                return r0
        }

        public void d(org.json.JSONObject r5) {
                r4 = this;
                if (r5 == 0) goto L3f
                int r0 = r5.length()
                if (r0 > 0) goto L9
                goto L3f
            L9:
                com.bytedance.j.xt.up.c r0 = com.bytedance.j.xt.e.d()     // Catch: java.lang.Throwable -> L3f
                java.util.Map r0 = r0.b()     // Catch: java.lang.Throwable -> L3f
                java.lang.String r0 = com.bytedance.j.xt.ae.xt.g(r0)     // Catch: java.lang.Throwable -> L3f
                android.content.Context r1 = r4.a     // Catch: java.lang.Throwable -> L3f
                java.io.File r1 = com.bytedance.j.xt.tl.l.b(r1)     // Catch: java.lang.Throwable -> L3f
                java.lang.String r2 = com.bytedance.j.xt.tl.l.e()     // Catch: java.lang.Throwable -> L3f
                boolean r3 = com.bytedance.j.xt.ae.xt.l()     // Catch: java.lang.Throwable -> L3f
                java.lang.String r1 = com.bytedance.j.xt.tl.k.c(r1, r2, r0, r5, r3)     // Catch: java.lang.Throwable -> L3f
                java.lang.String r2 = "upload_scene"
                java.lang.String r3 = "direct"
                r5.put(r2, r3)     // Catch: java.lang.Throwable -> L3f
                java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L3f
                com.bytedance.j.xt.a$e r5 = com.bytedance.j.xt.ae.xt.d(r0, r5)     // Catch: java.lang.Throwable -> L3f
                boolean r5 = r5.a()     // Catch: java.lang.Throwable -> L3f
                if (r5 == 0) goto L3f
                com.bytedance.j.xt.tl.k.h(r1)     // Catch: java.lang.Throwable -> L3f
            L3f:
                return
        }
    }

    public class e {
        private final int a;
        private java.lang.String b;
        private org.json.JSONObject c;

        public e(int r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        public e(int r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }

        public e(int r1, java.lang.Throwable r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                if (r2 == 0) goto Ld
                java.lang.String r1 = r2.getMessage()
                r0.b = r1
            Ld:
                return
        }

        public e(int r1, org.json.JSONObject r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.c = r2
                return
        }

        public boolean a() {
                r1 = this;
                int r0 = r1.a
                if (r0 != 0) goto L6
                r0 = 1
                return r0
            L6:
                r0 = 0
                return r0
        }
    }

    public final class f implements java.lang.Runnable {
        private android.content.Context a;

        private f(android.content.Context r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        public static void a(android.content.Context r1) {
                r0 = 0
                b(r1, r0)
                return
        }

        public static void b(android.content.Context r2, int r3) {
                com.bytedance.j.xt.up.c r0 = com.bytedance.j.xt.e.d()     // Catch: java.lang.Exception -> L13
                java.lang.String r0 = r0.d()     // Catch: java.lang.Exception -> L13
                java.lang.String r1 = r2.getPackageName()     // Catch: java.lang.Exception -> L13
                boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L13
                if (r0 != 0) goto L13
                return
            L13:
                android.os.Handler r0 = com.bytedance.j.xt.up.a.b()
                com.bytedance.j.xt.a$f r1 = new com.bytedance.j.xt.a$f
                r1.<init>(r2)
                long r2 = (long) r3
                r0.postDelayed(r1, r2)
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                com.bytedance.j.xt.up.b r0 = new com.bytedance.j.xt.up.b     // Catch: java.lang.Throwable -> L1e
                android.content.Context r1 = r3.a     // Catch: java.lang.Throwable -> L1e
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L1e
                android.content.Context r1 = r3.a     // Catch: java.lang.Throwable -> L1e
                boolean r1 = com.bytedance.j.xt.tl.e.d(r1)     // Catch: java.lang.Throwable -> L1e
                r0.c(r1)     // Catch: java.lang.Throwable -> L1e
            L10:
                android.os.Handler r0 = com.bytedance.j.xt.up.a.b()
                android.content.Context r1 = r3.a
                com.bytedance.j.xt.m.a r0 = com.bytedance.j.xt.m.a.a(r0, r1)
                r0.b()
                return
            L1e:
                r0 = move-exception
                com.bytedance.j.xt.tl.i.c(r0)     // Catch: java.lang.Throwable -> L23
                goto L10
            L23:
                r0 = move-exception
                android.os.Handler r1 = com.bytedance.j.xt.up.a.b()
                android.content.Context r2 = r3.a
                com.bytedance.j.xt.m.a r1 = com.bytedance.j.xt.m.a.a(r1, r2)
                r1.b()
                throw r0
        }
    }

    public class g {
        private java.lang.String a;
        private java.lang.String b;
        private boolean c;
        private boolean d;
        private byte[] e;

        /* renamed from: com.bytedance.j.xt.a$g$a, reason: collision with other inner class name */
        public static class C0212a {
            private java.lang.String a;
            private java.lang.String b;
            private boolean c;
            private boolean d;
            private byte[] e;

            public C0212a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public com.bytedance.j.xt.a.g.C0212a a(java.lang.String r1) {
                    r0 = this;
                    r0.a = r1
                    return r0
            }

            public com.bytedance.j.xt.a.g.C0212a b(boolean r1) {
                    r0 = this;
                    r0.d = r1
                    return r0
            }

            public com.bytedance.j.xt.a.g.C0212a c(byte[] r1) {
                    r0 = this;
                    r0.e = r1
                    return r0
            }

            public com.bytedance.j.xt.a.g d() {
                    r2 = this;
                    com.bytedance.j.xt.a$g r0 = new com.bytedance.j.xt.a$g
                    r0.<init>()
                    java.lang.String r1 = r2.a
                    com.bytedance.j.xt.a.g.c(r0, r1)
                    java.lang.String r1 = r2.b
                    com.bytedance.j.xt.a.g.f(r0, r1)
                    boolean r1 = r2.c
                    com.bytedance.j.xt.a.g.d(r0, r1)
                    boolean r1 = r2.d
                    com.bytedance.j.xt.a.g.h(r0, r1)
                    byte[] r1 = r2.e
                    com.bytedance.j.xt.a.g.e(r0, r1)
                    return r0
            }
        }

        public g() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ java.lang.String c(com.bytedance.j.xt.a.g r0, java.lang.String r1) {
                r0.a = r1
                return r1
        }

        static /* synthetic */ boolean d(com.bytedance.j.xt.a.g r0, boolean r1) {
                r0.c = r1
                return r1
        }

        static /* synthetic */ byte[] e(com.bytedance.j.xt.a.g r0, byte[] r1) {
                r0.e = r1
                return r1
        }

        static /* synthetic */ java.lang.String f(com.bytedance.j.xt.a.g r0, java.lang.String r1) {
                r0.b = r1
                return r1
        }

        static /* synthetic */ boolean h(com.bytedance.j.xt.a.g r0, boolean r1) {
                r0.d = r1
                return r1
        }

        public byte[] a() {
                r1 = this;
                byte[] r0 = r1.e
                return r0
        }

        public java.lang.String b() {
                r1 = this;
                java.lang.String r0 = r1.a
                return r0
        }

        public boolean g() {
                r1 = this;
                boolean r0 = r1.d
                return r0
        }
    }

    static {
            return
    }

    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static synchronized void a(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull com.bytedance.j.xt.f r3, boolean r4, boolean r5) {
            java.lang.Class<com.bytedance.j.xt.a> r0 = com.bytedance.j.xt.a.class
            monitor-enter(r0)
            r1 = 0
            b(r2, r3, r4, r1, r5)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)
            return
        L9:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r2
    }

    public static synchronized void b(@androidx.annotation.NonNull android.content.Context r8, @androidx.annotation.NonNull com.bytedance.j.xt.f r9, boolean r10, boolean r11, boolean r12) {
            java.lang.Class<com.bytedance.j.xt.a> r1 = com.bytedance.j.xt.a.class
            monitor-enter(r1)
            r5 = r10
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r11
            r7 = r12
            c(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r1)
            return
        Le:
            r0 = move-exception
            r8 = r0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le
            throw r8
    }

    public static synchronized void c(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull com.bytedance.j.xt.f r3, boolean r4, boolean r5, boolean r6, boolean r7) {
            java.lang.Class<com.bytedance.j.xt.a> r0 = com.bytedance.j.xt.a.class
            monitor-enter(r0)
            boolean r1 = com.bytedance.j.xt.a.a     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L9
            monitor-exit(r0)
            return
        L9:
            if (r2 == 0) goto L5b
            if (r3 == 0) goto L53
            boolean r1 = r2 instanceof android.app.Application     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L1c
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L1a
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)     // Catch: java.lang.Throwable -> L1a
            goto L1c
        L1a:
            r2 = move-exception
            goto L63
        L1c:
            boolean r1 = com.bytedance.j.xt.tl.f.b(r2)     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L24
            monitor-exit(r0)
            return
        L24:
            com.bytedance.j.xt.e.e(r2, r3)     // Catch: java.lang.Throwable -> L1a
            com.bytedance.j.xt.up.j.f.d(r2)     // Catch: java.lang.Throwable -> L1a
            r3 = 1
            if (r4 != 0) goto L2f
            if (r5 == 0) goto L3f
        L2f:
            com.bytedance.j.xt.r.b r5 = com.bytedance.j.xt.r.b.b()     // Catch: java.lang.Throwable -> L1a
            if (r4 == 0) goto L3d
            com.bytedance.j.xt.r.a r4 = new com.bytedance.j.xt.r.a     // Catch: java.lang.Throwable -> L1a
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L1a
            r5.c(r4)     // Catch: java.lang.Throwable -> L1a
        L3d:
            com.bytedance.j.xt.a.b = r3     // Catch: java.lang.Throwable -> L1a
        L3f:
            com.bytedance.j.xt.a.d = r6     // Catch: java.lang.Throwable -> L1a
            com.bytedance.j.xt.a.a = r3     // Catch: java.lang.Throwable -> L1a
            com.bytedance.j.xt.a.c = r7     // Catch: java.lang.Throwable -> L1a
            android.os.Handler r3 = com.bytedance.j.xt.up.a.b()     // Catch: java.lang.Throwable -> L1a
            com.bytedance.j.xt.a$a r4 = new com.bytedance.j.xt.a$a     // Catch: java.lang.Throwable -> L1a
            r4.<init>(r2, r7)     // Catch: java.lang.Throwable -> L1a
            r3.post(r4)     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)
            return
        L53:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L1a
            java.lang.String r3 = "params must be not null."
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L1a
            throw r2     // Catch: java.lang.Throwable -> L1a
        L5b:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L1a
            java.lang.String r3 = "context must be not null."
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L1a
            throw r2     // Catch: java.lang.Throwable -> L1a
        L63:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r2
    }

    public static void d(com.bytedance.j.j.b r2) {
            android.os.Handler r0 = com.bytedance.j.xt.up.a.b()
            com.bytedance.j.xt.a$b r1 = new com.bytedance.j.xt.a$b
            r1.<init>(r2)
            r0.post(r1)
            return
    }

    public static void e(com.bytedance.j.xt.c r1) {
            com.bytedance.j.xt.g r0 = com.bytedance.j.xt.e.l()
            r0.d(r1)
            return
    }

    @java.lang.Deprecated
    public static void f(java.lang.String r1) {
            com.bytedance.j.xt.up.i r0 = com.bytedance.j.xt.e.k()
            boolean r0 = r0.b()
            if (r0 != 0) goto Lb
            return
        Lb:
            com.bytedance.j.xt.r.b.d(r1)
            return
    }

    public static void g(java.util.Map<? extends java.lang.String, ? extends java.lang.String> r1) {
            if (r1 == 0) goto Lf
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto Lf
            com.bytedance.j.xt.g r0 = com.bytedance.j.xt.e.l()
            r0.e(r1)
        Lf:
            return
    }
}
