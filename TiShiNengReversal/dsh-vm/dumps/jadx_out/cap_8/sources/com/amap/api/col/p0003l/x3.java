package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class x3 {
    private static android.content.res.AssetManager a = null;

    /* renamed from: b, reason: collision with root package name */
    private static android.content.res.Resources f4131b = null;

    /* renamed from: c, reason: collision with root package name */
    private static android.content.res.Resources f4132c = null;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f4133d = true;

    /* renamed from: e, reason: collision with root package name */
    private static android.content.Context f4134e = null;

    /* renamed from: f, reason: collision with root package name */
    private static java.lang.String f4135f = "amap_resource";

    /* renamed from: g, reason: collision with root package name */
    private static java.lang.String f4136g = "1_0_0";

    /* renamed from: h, reason: collision with root package name */
    private static java.lang.String f4137h = ".png";

    /* renamed from: i, reason: collision with root package name */
    private static java.lang.String f4138i = ".jar";

    /* renamed from: j, reason: collision with root package name */
    private static java.lang.String f4139j;

    /* renamed from: k, reason: collision with root package name */
    private static java.lang.String f4140k;
    private static java.lang.String l;
    private static java.lang.String m;
    private static android.content.res.Resources.Theme n;
    private static android.content.res.Resources.Theme o;
    private static java.lang.reflect.Field p;
    private static java.lang.reflect.Field q;
    private static android.app.Activity r;
    public static int s;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a implements java.io.FilenameFilter {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.io.FilenameFilter
        public final boolean accept(java.io.File r2, java.lang.String r3) {
                r1 = this;
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r0 = com.amap.api.col.p0003l.x3.h()
                r2.append(r0)
                java.lang.String r0 = com.amap.api.col.p0003l.x3.j()
                r2.append(r0)
                java.lang.String r2 = r2.toString()
                java.lang.String r0 = com.amap.api.col.p0003l.x3.l()
                boolean r0 = r3.startsWith(r0)
                if (r0 == 0) goto L29
                boolean r2 = r3.endsWith(r2)
                if (r2 != 0) goto L29
                r2 = 1
                return r2
            L29:
                r2 = 0
                return r2
        }
    }

    static {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = com.amap.api.col.p0003l.x3.f4135f
            r0.append(r1)
            java.lang.String r1 = com.amap.api.col.p0003l.x3.f4136g
            r0.append(r1)
            java.lang.String r1 = com.amap.api.col.p0003l.x3.f4138i
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.amap.api.col.p0003l.x3.f4139j = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = com.amap.api.col.p0003l.x3.f4135f
            r0.append(r1)
            java.lang.String r1 = com.amap.api.col.p0003l.x3.f4136g
            r0.append(r1)
            java.lang.String r1 = com.amap.api.col.p0003l.x3.f4137h
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.amap.api.col.p0003l.x3.f4140k = r0
            java.lang.String r0 = ""
            com.amap.api.col.p0003l.x3.l = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = com.amap.api.col.p0003l.x3.l
            r0.append(r1)
            java.lang.String r1 = com.amap.api.col.p0003l.x3.f4139j
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.amap.api.col.p0003l.x3.m = r0
            r0 = 0
            com.amap.api.col.p0003l.x3.n = r0
            com.amap.api.col.p0003l.x3.o = r0
            com.amap.api.col.p0003l.x3.p = r0
            com.amap.api.col.p0003l.x3.q = r0
            com.amap.api.col.p0003l.x3.r = r0
            r0 = -1
            com.amap.api.col.p0003l.x3.s = r0
            return
    }

    public x3() {
            r0 = this;
            r0.<init>()
            return
    }

    private static android.content.res.AssetManager a(java.lang.String r7) {
            r0 = 0
            java.lang.String r1 = "android.content.res.AssetManager"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L2a
            java.lang.reflect.Constructor r2 = r1.getConstructor(r0)     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r2 = r2.newInstance(r0)     // Catch: java.lang.Throwable -> L2a
            android.content.res.AssetManager r2 = (android.content.res.AssetManager) r2     // Catch: java.lang.Throwable -> L2a
            java.lang.String r0 = "addAssetPath"
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L27
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r6 = 0
            r4[r6] = r5     // Catch: java.lang.Throwable -> L27
            java.lang.reflect.Method r0 = r1.getDeclaredMethod(r0, r4)     // Catch: java.lang.Throwable -> L27
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L27
            r1[r6] = r7     // Catch: java.lang.Throwable -> L27
            r0.invoke(r2, r1)     // Catch: java.lang.Throwable -> L27
            return r2
        L27:
            r7 = move-exception
            r0 = r2
            goto L2b
        L2a:
            r7 = move-exception
        L2b:
            java.lang.String r1 = "ResourcesUtil"
            java.lang.String r2 = "getAssetManager(String apkPath)"
            com.amap.api.col.p0003l.w5.p(r7, r1, r2)
            return r0
    }

    public static android.content.res.Resources b() {
            android.content.res.Resources r0 = com.amap.api.col.p0003l.x3.f4131b
            if (r0 != 0) goto La
            android.content.Context r0 = com.amap.api.col.p0003l.x3.f4134e
            android.content.res.Resources r0 = r0.getResources()
        La:
            return r0
    }

    private static android.content.res.Resources c(android.content.Context r2, android.content.res.AssetManager r3) {
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics
            r0.<init>()
            r0.setToDefaults()
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            android.content.res.Resources r1 = new android.content.res.Resources
            r1.<init>(r3, r0, r2)
            return r1
    }

    public static android.view.View d(android.content.Context r4, int r5) {
            android.content.res.Resources r0 = b()
            android.content.res.XmlResourceParser r5 = r0.getXml(r5)
            boolean r0 = com.amap.api.col.p0003l.x3.f4133d
            r1 = 0
            if (r0 != 0) goto L16
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            android.view.View r4 = r4.inflate(r5, r1)
            return r4
        L16:
            com.amap.api.col.3l.w3 r0 = new com.amap.api.col.3l.w3     // Catch: java.lang.Throwable -> L33
            int r2 = com.amap.api.col.p0003l.x3.s     // Catch: java.lang.Throwable -> L33
            r3 = -1
            if (r2 != r3) goto L1e
            r2 = 0
        L1e:
            java.lang.Class<com.amap.api.col.3l.x3> r3 = com.amap.api.col.p0003l.x3.class
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch: java.lang.Throwable -> L33
            r0.<init>(r4, r2, r3)     // Catch: java.lang.Throwable -> L33
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r0)     // Catch: java.lang.Throwable -> L33
            android.view.View r4 = r4.inflate(r5, r1)     // Catch: java.lang.Throwable -> L33
            r5.close()
            return r4
        L33:
            r4 = move-exception
            java.lang.String r0 = "ResourcesUtil"
            java.lang.String r2 = "selfInflate(Activity activity, int resource, ViewGroup root)"
            com.amap.api.col.p0003l.w5.p(r4, r0, r2)     // Catch: java.lang.Throwable -> L3f
            r5.close()
            return r1
        L3f:
            r4 = move-exception
            r5.close()
            throw r4
    }

    private static java.io.OutputStream e(java.io.InputStream r4) throws java.io.IOException {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = com.amap.api.col.p0003l.x3.l
            java.lang.String r2 = com.amap.api.col.p0003l.x3.f4139j
            r0.<init>(r1, r2)
            java.io.FileOutputStream r1 = new java.io.FileOutputStream
            r1.<init>(r0)
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]
        L12:
            int r2 = r4.read(r0)
            if (r2 <= 0) goto L1d
            r3 = 0
            r1.write(r0, r3, r2)
            goto L12
        L1d:
            return r1
    }

    public static boolean f(android.content.Context r3) {
            r0 = 1
            com.amap.api.col.p0003l.x3.f4134e = r3     // Catch: java.lang.Throwable -> L50
            java.io.File r1 = g(r3)     // Catch: java.lang.Throwable -> L50
            if (r1 == 0) goto L20
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L50
            r2.<init>()     // Catch: java.lang.Throwable -> L50
            java.lang.String r1 = r1.getAbsolutePath()     // Catch: java.lang.Throwable -> L50
            r2.append(r1)     // Catch: java.lang.Throwable -> L50
            java.lang.String r1 = "/"
            r2.append(r1)     // Catch: java.lang.Throwable -> L50
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L50
            com.amap.api.col.p0003l.x3.l = r1     // Catch: java.lang.Throwable -> L50
        L20:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L50
            r1.<init>()     // Catch: java.lang.Throwable -> L50
            java.lang.String r2 = com.amap.api.col.p0003l.x3.l     // Catch: java.lang.Throwable -> L50
            r1.append(r2)     // Catch: java.lang.Throwable -> L50
            java.lang.String r2 = com.amap.api.col.p0003l.x3.f4139j     // Catch: java.lang.Throwable -> L50
            r1.append(r2)     // Catch: java.lang.Throwable -> L50
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L50
            com.amap.api.col.p0003l.x3.m = r1     // Catch: java.lang.Throwable -> L50
            boolean r1 = com.amap.api.col.p0003l.x3.f4133d     // Catch: java.lang.Throwable -> L50
            if (r1 != 0) goto L3a
            return r0
        L3a:
            boolean r1 = k(r3)     // Catch: java.lang.Throwable -> L50
            if (r1 != 0) goto L42
            r3 = 0
            return r3
        L42:
            java.lang.String r1 = com.amap.api.col.p0003l.x3.m     // Catch: java.lang.Throwable -> L50
            android.content.res.AssetManager r1 = a(r1)     // Catch: java.lang.Throwable -> L50
            com.amap.api.col.p0003l.x3.a = r1     // Catch: java.lang.Throwable -> L50
            android.content.res.Resources r3 = c(r3, r1)     // Catch: java.lang.Throwable -> L50
            com.amap.api.col.p0003l.x3.f4131b = r3     // Catch: java.lang.Throwable -> L50
        L50:
            return r0
    }

    private static java.io.File g(android.content.Context r3) {
            r0 = 0
            if (r3 != 0) goto L9
            if (r3 == 0) goto L8
            r3.getFilesDir()
        L8:
            return r0
        L9:
            java.lang.String r1 = android.os.Environment.getExternalStorageState()     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L28
            java.lang.String r2 = "mounted"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L28
            if (r1 == 0) goto L2a
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L28
            boolean r1 = r0.canWrite()     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L28
            if (r1 == 0) goto L2a
            java.lang.String r1 = "LBS"
            java.io.File r0 = r3.getExternalFilesDir(r1)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L28
            goto L2e
        L26:
            r1 = move-exception
            goto L34
        L28:
            goto L3a
        L2a:
            java.io.File r0 = r3.getFilesDir()     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L28
        L2e:
            if (r0 != 0) goto L33
            r3.getFilesDir()
        L33:
            return r0
        L34:
            if (r0 != 0) goto L39
            r3.getFilesDir()
        L39:
            throw r1
        L3a:
            if (r0 != 0) goto L40
            java.io.File r0 = r3.getFilesDir()
        L40:
            return r0
    }

    static /* synthetic */ java.lang.String h() {
            java.lang.String r0 = com.amap.api.col.p0003l.x3.f4136g
            return r0
    }

    private static boolean i(java.io.InputStream r5) throws java.io.IOException {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = com.amap.api.col.p0003l.x3.m
            r0.<init>(r1)
            long r1 = r0.length()
            int r3 = r5.available()
            boolean r0 = r0.exists()
            if (r0 == 0) goto L1f
            long r3 = (long) r3
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L1f
            r5.close()
            r5 = 1
            return r5
        L1f:
            r5 = 0
            return r5
    }

    static /* synthetic */ java.lang.String j() {
            java.lang.String r0 = com.amap.api.col.p0003l.x3.f4138i
            return r0
    }

    private static boolean k(android.content.Context r4) {
            java.lang.String r0 = "copyResourceJarToAppFilesDir(Context ctx)"
            java.lang.String r1 = "ResourcesUtil"
            m(r4)
            r2 = 0
            android.content.res.Resources r4 = r4.getResources()     // Catch: java.lang.Throwable -> L3f
            android.content.res.AssetManager r4 = r4.getAssets()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r3 = com.amap.api.col.p0003l.x3.f4140k     // Catch: java.lang.Throwable -> L3f
            java.io.InputStream r2 = r4.open(r3)     // Catch: java.lang.Throwable -> L3f
            boolean r4 = i(r2)     // Catch: java.lang.Throwable -> L3f
            r3 = 1
            if (r4 == 0) goto L28
            if (r2 == 0) goto L27
            r2.close()     // Catch: java.io.IOException -> L23
            goto L27
        L23:
            r4 = move-exception
            com.amap.api.col.p0003l.w5.p(r4, r1, r0)
        L27:
            return r3
        L28:
            n()     // Catch: java.lang.Throwable -> L3f
            java.io.OutputStream r4 = e(r2)     // Catch: java.lang.Throwable -> L3f
            if (r2 == 0) goto L37
            r2.close()     // Catch: java.io.IOException -> L35
            goto L37
        L35:
            r4 = move-exception
            goto L3b
        L37:
            r4.close()     // Catch: java.io.IOException -> L35
            goto L3e
        L3b:
            com.amap.api.col.p0003l.w5.p(r4, r1, r0)
        L3e:
            return r3
        L3f:
            r4 = move-exception
            com.amap.api.col.p0003l.w5.p(r4, r1, r0)     // Catch: java.lang.Throwable -> L4f
            if (r2 == 0) goto L4d
            r2.close()     // Catch: java.io.IOException -> L49
            goto L4d
        L49:
            r4 = move-exception
            com.amap.api.col.p0003l.w5.p(r4, r1, r0)
        L4d:
            r4 = 0
            return r4
        L4f:
            r4 = move-exception
            if (r2 == 0) goto L5a
            r2.close()     // Catch: java.io.IOException -> L56
            goto L5a
        L56:
            r2 = move-exception
            com.amap.api.col.p0003l.w5.p(r2, r1, r0)
        L5a:
            throw r4
    }

    static /* synthetic */ java.lang.String l() {
            java.lang.String r0 = com.amap.api.col.p0003l.x3.f4135f
            return r0
    }

    private static void m(android.content.Context r1) {
            java.io.File r1 = r1.getFilesDir()
            java.lang.String r1 = r1.getAbsolutePath()
            com.amap.api.col.p0003l.x3.l = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = com.amap.api.col.p0003l.x3.l
            r1.append(r0)
            java.lang.String r0 = "/"
            r1.append(r0)
            java.lang.String r0 = com.amap.api.col.p0003l.x3.f4139j
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.amap.api.col.p0003l.x3.m = r1
            return
    }

    private static void n() {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = com.amap.api.col.p0003l.x3.l
            r0.<init>(r1)
            com.amap.api.col.3l.x3$a r1 = new com.amap.api.col.3l.x3$a
            r1.<init>()
            java.io.File[] r0 = r0.listFiles(r1)
            if (r0 == 0) goto L21
            int r1 = r0.length
            if (r1 <= 0) goto L21
            int r1 = r0.length
            r2 = 0
        L17:
            if (r2 >= r1) goto L21
            r3 = r0[r2]
            r3.delete()
            int r2 = r2 + 1
            goto L17
        L21:
            return
    }
}
