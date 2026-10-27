package com.ss.android.downloadlib.addownload;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class m {
    public static final org.json.JSONObject a = null;
    private static android.content.Context b;
    private static v2.a c;
    private static v2.e d;
    private static v2.w e;
    private static v2.g f;
    private static v2.n g;
    private static v2.u h;
    private static com.ss.android.j.j.up.b i;
    private static v2.y j;
    private static w2.e k;
    private static v2.p l;
    private static v2.s m;
    private static v2.v n;
    private static v2.j o;
    private static v2.x p;
    private static v2.b q;
    private static v2.c r;
    private static v2.m s;
    private static u2.a t;
    private static v2.k u;
    private static v2.f v;
    private static v2.o w;

    static class a implements v2.e {
        a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static class b implements w2.e {
        b() {
                r0 = this;
                r0.<init>()
                return
        }

        public void j(com.ss.android.socialbase.downloader.ae.cw r1, com.ss.android.socialbase.downloader.up.j r2, int r3) {
                r0 = this;
                return
        }
    }

    static class c implements v2.m {
        c() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static class d implements u2.a {
        d() {
                r0 = this;
                r0.<init>()
                return
        }

        public void j(java.lang.Throwable r1, java.lang.String r2) {
                r0 = this;
                return
        }
    }

    static class e implements v2.f {
        e() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            com.ss.android.downloadlib.addownload.m.a = r0
            return
    }

    public m() {
            r1 = this;
            r1.<init>()
            return
    }

    public static v2.c A() {
            v2.c r0 = com.ss.android.downloadlib.addownload.m.r
            return r0
    }

    public static v2.g B() {
            v2.g r0 = com.ss.android.downloadlib.addownload.m.f
            return r0
    }

    @androidx.annotation.NonNull
    public static v2.f C() {
            v2.f r0 = com.ss.android.downloadlib.addownload.m.v
            if (r0 != 0) goto Lb
            com.ss.android.downloadlib.addownload.m$e r0 = new com.ss.android.downloadlib.addownload.m$e
            r0.<init>()
            com.ss.android.downloadlib.addownload.m.v = r0
        Lb:
            v2.f r0 = com.ss.android.downloadlib.addownload.m.v
            return r0
    }

    @androidx.annotation.NonNull
    public static v2.m D() {
            v2.m r0 = com.ss.android.downloadlib.addownload.m.s
            if (r0 != 0) goto Lb
            com.ss.android.downloadlib.addownload.m$c r0 = new com.ss.android.downloadlib.addownload.m$c
            r0.<init>()
            com.ss.android.downloadlib.addownload.m.s = r0
        Lb:
            v2.m r0 = com.ss.android.downloadlib.addownload.m.s
            return r0
    }

    @androidx.annotation.NonNull
    public static v2.n E() {
            v2.n r0 = com.ss.android.downloadlib.addownload.m.g
            if (r0 != 0) goto Lb
            com.ss.android.j.j.j.b r0 = new com.ss.android.j.j.j.b
            r0.<init>()
            com.ss.android.downloadlib.addownload.m.g = r0
        Lb:
            v2.n r0 = com.ss.android.downloadlib.addownload.m.g
            return r0
    }

    public static java.lang.String F() {
            android.content.Context r0 = getContext()     // Catch: java.lang.Throwable -> L52
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()     // Catch: java.lang.Throwable -> L52
            int r0 = r0.targetSdkVersion     // Catch: java.lang.Throwable -> L52
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L52
            r2 = 29
            if (r1 < r2) goto L29
            if (r0 != r2) goto L18
            boolean r1 = com.bumptech.glide.load.model.stream.g.a()     // Catch: java.lang.Throwable -> L52
            if (r1 == 0) goto L1a
        L18:
            if (r0 <= r2) goto L29
        L1a:
            android.content.Context r0 = getContext()     // Catch: java.lang.Throwable -> L52
            java.lang.String r1 = android.os.Environment.DIRECTORY_DOWNLOADS     // Catch: java.lang.Throwable -> L52
            java.io.File r0 = r0.getExternalFilesDir(r1)     // Catch: java.lang.Throwable -> L52
            java.lang.String r0 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L52
            return r0
        L29:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52
            r0.<init>()     // Catch: java.lang.Throwable -> L52
            java.io.File r1 = android.os.Environment.getExternalStorageDirectory()     // Catch: java.lang.Throwable -> L52
            java.lang.String r1 = r1.getPath()     // Catch: java.lang.Throwable -> L52
            r0.append(r1)     // Catch: java.lang.Throwable -> L52
            java.lang.String r1 = java.io.File.separator     // Catch: java.lang.Throwable -> L52
            r0.append(r1)     // Catch: java.lang.Throwable -> L52
            org.json.JSONObject r1 = f()     // Catch: java.lang.Throwable -> L52
            java.lang.String r2 = "default_save_dir_name"
            java.lang.String r3 = "ByteDownload"
            java.lang.String r1 = r1.optString(r2, r3)     // Catch: java.lang.Throwable -> L52
            r0.append(r1)     // Catch: java.lang.Throwable -> L52
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L52
            return r0
        L52:
            r0 = 0
            return r0
    }

    @androidx.annotation.Nullable
    public static v2.y G() {
            v2.y r0 = com.ss.android.downloadlib.addownload.m.j
            return r0
    }

    @androidx.annotation.NonNull
    public static v2.k H() {
            v2.k r0 = com.ss.android.downloadlib.addownload.m.u
            return r0
    }

    public static java.lang.String I() {
            java.lang.String r0 = "1.7.0"
            return r0
    }

    public static boolean J() {
            v2.a r0 = com.ss.android.downloadlib.addownload.m.c
            if (r0 == 0) goto L17
            v2.g r0 = com.ss.android.downloadlib.addownload.m.f
            if (r0 == 0) goto L17
            v2.u r0 = com.ss.android.downloadlib.addownload.m.h
            if (r0 == 0) goto L17
            v2.y r0 = com.ss.android.downloadlib.addownload.m.j
            if (r0 == 0) goto L17
            v2.k r0 = com.ss.android.downloadlib.addownload.m.u
            if (r0 != 0) goto L15
            goto L17
        L15:
            r0 = 1
            return r0
        L17:
            r0 = 0
            return r0
    }

    @androidx.annotation.NonNull
    public static v2.e K() {
            v2.e r0 = com.ss.android.downloadlib.addownload.m.d
            if (r0 != 0) goto Lb
            com.ss.android.downloadlib.addownload.m$a r0 = new com.ss.android.downloadlib.addownload.m$a
            r0.<init>()
            com.ss.android.downloadlib.addownload.m.d = r0
        Lb:
            v2.e r0 = com.ss.android.downloadlib.addownload.m.d
            return r0
    }

    public static void L(android.content.Context r1) {
            android.content.Context r0 = com.ss.android.downloadlib.addownload.m.b
            if (r0 != 0) goto L1a
            if (r1 == 0) goto L1a
            android.content.Context r0 = r1.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            if (r0 == 0) goto L1a
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            com.ss.android.downloadlib.addownload.m.b = r1
        L1a:
            return
    }

    public static v2.v a() {
            v2.v r0 = com.ss.android.downloadlib.addownload.m.n
            return r0
    }

    public static v2.s b() {
            v2.s r0 = com.ss.android.downloadlib.addownload.m.m
            return r0
    }

    public static v2.p c() {
            v2.p r0 = com.ss.android.downloadlib.addownload.m.l
            return r0
    }

    @androidx.annotation.NonNull
    public static v2.w d() {
            v2.w r0 = com.ss.android.downloadlib.addownload.m.e
            if (r0 != 0) goto Lb
            com.ss.android.j.j.j.a r0 = new com.ss.android.j.j.j.a
            r0.<init>()
            com.ss.android.downloadlib.addownload.m.e = r0
        Lb:
            v2.w r0 = com.ss.android.downloadlib.addownload.m.e
            return r0
    }

    public static v2.o e() {
            v2.o r0 = com.ss.android.downloadlib.addownload.m.w
            return r0
    }

    @androidx.annotation.NonNull
    public static org.json.JSONObject f() {
            v2.u r0 = com.ss.android.downloadlib.addownload.m.h
            if (r0 == 0) goto L12
            org.json.JSONObject r0 = r0.j()
            if (r0 != 0) goto Lb
            goto L12
        Lb:
            v2.u r0 = com.ss.android.downloadlib.addownload.m.h
            org.json.JSONObject r0 = r0.j()
            return r0
        L12:
            org.json.JSONObject r0 = com.ss.android.downloadlib.addownload.m.a
            return r0
    }

    public static v2.j g() {
            v2.j r0 = com.ss.android.downloadlib.addownload.m.o
            return r0
    }

    public static android.content.Context getContext() {
            android.content.Context r0 = com.ss.android.downloadlib.addownload.m.b
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Context is null"
            r0.<init>(r1)
            throw r0
    }

    public static v2.a h() {
            v2.a r0 = com.ss.android.downloadlib.addownload.m.c
            return r0
    }

    public static void i(android.content.Context r1) {
            if (r1 == 0) goto L17
            android.content.Context r0 = r1.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            if (r0 == 0) goto L17
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            com.ss.android.downloadlib.addownload.m.b = r1
            return
        L17:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Context is null"
            r1.<init>(r0)
            throw r1
    }

    public static void j(@androidx.annotation.NonNull com.ss.android.j.j.up.b r0) {
            com.ss.android.downloadlib.addownload.m.i = r0
            return
    }

    public static void k(java.lang.String r1) {
            com.ss.android.socialbase.appdownloader.f r0 = com.ss.android.socialbase.appdownloader.f.L()
            r0.z(r1)
            return
    }

    public static void l(u2.a r0) {
            com.ss.android.downloadlib.addownload.m.t = r0
            return
    }

    public static void m(@androidx.annotation.NonNull v2.a r0) {
            com.ss.android.downloadlib.addownload.m.c = r0
            return
    }

    public static void n(@androidx.annotation.NonNull v2.g r0) {
            com.ss.android.downloadlib.addownload.m.f = r0
            return
    }

    public static void o(v2.k r0) {
            com.ss.android.downloadlib.addownload.m.u = r0
            return
    }

    public static void p(@androidx.annotation.NonNull v2.n r0) {
            com.ss.android.downloadlib.addownload.m.g = r0
            return
    }

    public static void q(v2.o r0) {
            com.ss.android.downloadlib.addownload.m.w = r0
            return
    }

    public static void r(@androidx.annotation.NonNull v2.u r0) {
            com.ss.android.downloadlib.addownload.m.h = r0
            return
    }

    public static void s(@androidx.annotation.NonNull v2.w r0) {
            com.ss.android.downloadlib.addownload.m.e = r0
            return
    }

    public static void t(@androidx.annotation.NonNull v2.y r0) {
            com.ss.android.downloadlib.addownload.m.j = r0
            return
    }

    public static void u(w2.d r1) {
            com.ss.android.socialbase.appdownloader.f r0 = com.ss.android.socialbase.appdownloader.f.L()
            r0.C(r1)
            return
    }

    @androidx.annotation.Nullable
    public static v2.b v() {
            v2.b r0 = com.ss.android.downloadlib.addownload.m.q
            return r0
    }

    @androidx.annotation.NonNull
    public static u2.a w() {
            u2.a r0 = com.ss.android.downloadlib.addownload.m.t
            if (r0 != 0) goto Lb
            com.ss.android.downloadlib.addownload.m$d r0 = new com.ss.android.downloadlib.addownload.m$d
            r0.<init>()
            com.ss.android.downloadlib.addownload.m.t = r0
        Lb:
            u2.a r0 = com.ss.android.downloadlib.addownload.m.t
            return r0
    }

    public static w2.e x() {
            w2.e r0 = com.ss.android.downloadlib.addownload.m.k
            if (r0 != 0) goto Lb
            com.ss.android.downloadlib.addownload.m$b r0 = new com.ss.android.downloadlib.addownload.m$b
            r0.<init>()
            com.ss.android.downloadlib.addownload.m.k = r0
        Lb:
            w2.e r0 = com.ss.android.downloadlib.addownload.m.k
            return r0
    }

    public static v2.x y() {
            v2.x r0 = com.ss.android.downloadlib.addownload.m.p
            return r0
    }

    @androidx.annotation.NonNull
    public static com.ss.android.j.j.up.b z() {
            com.ss.android.j.j.up.b r0 = com.ss.android.downloadlib.addownload.m.i
            if (r0 != 0) goto Lf
            com.ss.android.j.j.up.b$a r0 = new com.ss.android.j.j.up.b$a
            r0.<init>()
            com.ss.android.j.j.up.b r0 = r0.d()
            com.ss.android.downloadlib.addownload.m.i = r0
        Lf:
            com.ss.android.j.j.up.b r0 = com.ss.android.downloadlib.addownload.m.i
            return r0
    }
}
