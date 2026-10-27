package top.zibin.luban;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class c implements android.os.Handler.Callback {
    private static final java.lang.String d = "Luban";
    private static final java.lang.String e = "luban_disk_cache";
    private static final int f = 0;
    private static final int g = 1;
    private static final int h = 2;
    private java.io.File a;
    private top.zibin.luban.d b;
    private android.os.Handler c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements java.lang.Runnable {
        final /* synthetic */ android.content.Context a;
        final /* synthetic */ top.zibin.luban.c b;

        a(top.zibin.luban.c r1, android.content.Context r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                top.zibin.luban.c r0 = r4.b     // Catch: java.io.IOException -> L40
                android.os.Handler r0 = top.zibin.luban.c.a(r0)     // Catch: java.io.IOException -> L40
                top.zibin.luban.c r1 = r4.b     // Catch: java.io.IOException -> L40
                android.os.Handler r1 = top.zibin.luban.c.a(r1)     // Catch: java.io.IOException -> L40
                r2 = 1
                android.os.Message r1 = r1.obtainMessage(r2)     // Catch: java.io.IOException -> L40
                r0.sendMessage(r1)     // Catch: java.io.IOException -> L40
                top.zibin.luban.b r0 = new top.zibin.luban.b     // Catch: java.io.IOException -> L40
                top.zibin.luban.c r1 = r4.b     // Catch: java.io.IOException -> L40
                java.io.File r1 = top.zibin.luban.c.b(r1)     // Catch: java.io.IOException -> L40
                top.zibin.luban.c r2 = r4.b     // Catch: java.io.IOException -> L40
                android.content.Context r3 = r4.a     // Catch: java.io.IOException -> L40
                java.io.File r2 = top.zibin.luban.c.c(r2, r3)     // Catch: java.io.IOException -> L40
                r0.<init>(r1, r2)     // Catch: java.io.IOException -> L40
                java.io.File r0 = r0.a()     // Catch: java.io.IOException -> L40
                top.zibin.luban.c r1 = r4.b     // Catch: java.io.IOException -> L40
                android.os.Handler r1 = top.zibin.luban.c.a(r1)     // Catch: java.io.IOException -> L40
                top.zibin.luban.c r2 = r4.b     // Catch: java.io.IOException -> L40
                android.os.Handler r2 = top.zibin.luban.c.a(r2)     // Catch: java.io.IOException -> L40
                r3 = 0
                android.os.Message r0 = r2.obtainMessage(r3, r0)     // Catch: java.io.IOException -> L40
                r1.sendMessage(r0)     // Catch: java.io.IOException -> L40
                return
            L40:
                r0 = move-exception
                top.zibin.luban.c r1 = r4.b
                android.os.Handler r1 = top.zibin.luban.c.a(r1)
                top.zibin.luban.c r2 = r4.b
                android.os.Handler r2 = top.zibin.luban.c.a(r2)
                r3 = 2
                android.os.Message r0 = r2.obtainMessage(r3, r0)
                r1.sendMessage(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class b {
        private android.content.Context a;
        private java.io.File b;
        private top.zibin.luban.d c;

        b(android.content.Context r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        static /* synthetic */ java.io.File a(top.zibin.luban.c.b r0) {
                java.io.File r0 = r0.b
                return r0
        }

        static /* synthetic */ top.zibin.luban.d b(top.zibin.luban.c.b r0) {
                top.zibin.luban.d r0 = r0.c
                return r0
        }

        private top.zibin.luban.c c() {
                r2 = this;
                top.zibin.luban.c r0 = new top.zibin.luban.c
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        public java.io.File d() throws java.io.IOException {
                r2 = this;
                top.zibin.luban.c r0 = r2.c()
                android.content.Context r1 = r2.a
                java.io.File r0 = top.zibin.luban.c.e(r0, r1)
                return r0
        }

        public void e() {
                r2 = this;
                top.zibin.luban.c r0 = r2.c()
                android.content.Context r1 = r2.a
                top.zibin.luban.c.d(r0, r1)
                return
        }

        public top.zibin.luban.c.b f(java.io.File r1) {
                r0 = this;
                r0.b = r1
                return r0
        }

        public top.zibin.luban.c.b g(int r1) {
                r0 = this;
                return r0
        }

        public top.zibin.luban.c.b h(top.zibin.luban.d r1) {
                r0 = this;
                r0.c = r1
                return r0
        }
    }

    private c(top.zibin.luban.c.b r2) {
            r1 = this;
            r1.<init>()
            java.io.File r0 = top.zibin.luban.c.b.a(r2)
            r1.a = r0
            top.zibin.luban.d r2 = top.zibin.luban.c.b.b(r2)
            r1.b = r2
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r2.<init>(r0, r1)
            r1.c = r2
            return
    }

    /* synthetic */ c(top.zibin.luban.c.b r1, top.zibin.luban.c.a r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    static /* synthetic */ android.os.Handler a(top.zibin.luban.c r0) {
            android.os.Handler r0 = r0.c
            return r0
    }

    static /* synthetic */ java.io.File b(top.zibin.luban.c r0) {
            java.io.File r0 = r0.a
            return r0
    }

    static /* synthetic */ java.io.File c(top.zibin.luban.c r0, android.content.Context r1) {
            java.io.File r0 = r0.i(r1)
            return r0
    }

    static /* synthetic */ void d(top.zibin.luban.c r0, android.content.Context r1) {
            r0.j(r1)
            return
    }

    static /* synthetic */ java.io.File e(top.zibin.luban.c r0, android.content.Context r1) throws java.io.IOException {
            java.io.File r0 = r0.f(r1)
            return r0
    }

    @androidx.annotation.WorkerThread
    private java.io.File f(android.content.Context r3) throws java.io.IOException {
            r2 = this;
            top.zibin.luban.b r0 = new top.zibin.luban.b
            java.io.File r1 = r2.a
            java.io.File r3 = r2.i(r3)
            r0.<init>(r1, r3)
            java.io.File r3 = r0.a()
            return r3
    }

    @androidx.annotation.Nullable
    private java.io.File g(android.content.Context r2) {
            r1 = this;
            java.lang.String r0 = "luban_disk_cache"
            java.io.File r2 = r1.h(r2, r0)
            return r2
    }

    @androidx.annotation.Nullable
    private java.io.File h(android.content.Context r3, java.lang.String r4) {
            r2 = this;
            java.io.File r3 = r3.getExternalCacheDir()
            r0 = 0
            if (r3 == 0) goto L20
            java.io.File r1 = new java.io.File
            r1.<init>(r3, r4)
            boolean r3 = r1.mkdirs()
            if (r3 != 0) goto L1f
            boolean r3 = r1.exists()
            if (r3 == 0) goto L1e
            boolean r3 = r1.isDirectory()
            if (r3 != 0) goto L1f
        L1e:
            return r0
        L1f:
            return r1
        L20:
            java.lang.String r3 = "Luban"
            r4 = 6
            android.util.Log.isLoggable(r3, r4)
            return r0
    }

    private java.io.File i(android.content.Context r7) {
            r6 = this;
            java.io.File r0 = r6.g(r7)
            if (r0 == 0) goto L3c
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.io.File r7 = r6.g(r7)
            r1.append(r7)
            java.lang.String r7 = "/"
            r1.append(r7)
            long r2 = java.lang.System.currentTimeMillis()
            r1.append(r2)
            double r2 = java.lang.Math.random()
            r4 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r2 = r2 * r4
            int r7 = (int) r2
            r1.append(r7)
            java.lang.String r7 = ".jpg"
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            return r0
        L3c:
            r7 = 0
            return r7
    }

    @androidx.annotation.UiThread
    private void j(android.content.Context r4) {
            r3 = this;
            java.io.File r0 = r3.a
            if (r0 != 0) goto L12
            top.zibin.luban.d r0 = r3.b
            if (r0 == 0) goto L12
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "image file cannot be null"
            r1.<init>(r2)
            r0.onError(r1)
        L12:
            java.lang.Thread r0 = new java.lang.Thread
            top.zibin.luban.c$a r1 = new top.zibin.luban.c$a
            r1.<init>(r3, r4)
            r0.<init>(r1)
            r0.start()
            return
    }

    public static top.zibin.luban.c.b k(android.content.Context r1) {
            top.zibin.luban.c$b r0 = new top.zibin.luban.c$b
            r0.<init>(r1)
            return r0
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message r5) {
            r4 = this;
            top.zibin.luban.d r0 = r4.b
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r2 = r5.what
            if (r2 == 0) goto L1d
            r3 = 1
            if (r2 == r3) goto L19
            r3 = 2
            if (r2 == r3) goto L11
            goto L24
        L11:
            java.lang.Object r5 = r5.obj
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            r0.onError(r5)
            goto L24
        L19:
            r0.onStart()
            goto L24
        L1d:
            java.lang.Object r5 = r5.obj
            java.io.File r5 = (java.io.File) r5
            r0.a(r5)
        L24:
            return r1
    }
}
