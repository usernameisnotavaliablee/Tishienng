package cn.jpush.android.y;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    private static final char[] f2034d = null;

    /* renamed from: e, reason: collision with root package name */
    private static final java.util.Map<java.lang.String, java.lang.String> f2035e = null;
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private android.content.res.Resources f2036b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.ClassLoader f2037c;

    static {
            r0 = 16
            char[] r0 = new char[r0]
            r0 = {x0012: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70} // fill-array
            cn.jpush.android.y.a.f2034d = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            cn.jpush.android.y.a.f2035e = r0
            return
    }

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    private static android.content.pm.PackageInfo a(android.content.Context r1, java.lang.String r2) {
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            r0 = 1
            android.content.pm.PackageInfo r1 = r1.getPackageArchiveInfo(r2, r0)
            return r1
    }

    public static cn.jpush.android.y.a a(android.content.Context r5) {
            java.lang.String r0 = "LoadedResource"
            r1 = 2
            java.lang.Object r1 = cn.jpush.android.helper.JCoreHelper.getDyInfo(r5, r1)     // Catch: java.lang.Throwable -> L5b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5b
            r2.<init>()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r3 = "load resouce:"
            r2.append(r3)     // Catch: java.lang.Throwable -> L5b
            r2.append(r1)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L5b
            cn.jpush.android.helper.Logger.d(r0, r2)     // Catch: java.lang.Throwable -> L5b
            if (r1 == 0) goto L74
            boolean r2 = r1 instanceof java.util.Map     // Catch: java.lang.Throwable -> L5b
            if (r2 == 0) goto L74
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Throwable -> L5b
            java.lang.String r2 = "p"
            java.lang.Object r2 = r1.get(r2)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L5b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5b
            r3.<init>()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r4 = "jpush dex path:"
            r3.append(r4)     // Catch: java.lang.Throwable -> L5b
            r3.append(r2)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L5b
            cn.jpush.android.helper.Logger.d(r0, r3)     // Catch: java.lang.Throwable -> L5b
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L5b
            if (r3 != 0) goto L74
            java.lang.String r3 = "o"
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L5b
            java.lang.String r4 = "l"
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L5b
            r4 = 0
            cn.jpush.android.y.a r5 = a(r5, r2, r3, r1, r4)     // Catch: java.lang.Throwable -> L5b
            return r5
        L5b:
            r5 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "l r failed:"
            r1.append(r2)
            java.lang.String r5 = r5.getMessage()
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            cn.jpush.android.helper.Logger.ww(r0, r5)
        L74:
            java.lang.String r5 = "load resource failed"
            cn.jpush.android.helper.Logger.d(r0, r5)
            r5 = 0
            return r5
    }

    private static cn.jpush.android.y.a a(android.content.Context r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, boolean r13) {
            java.lang.String r0 = a(r9, r10, r13)
            android.content.pm.PackageInfo r1 = a(r9, r0)
            java.lang.String r2 = "LoadedResource"
            if (r1 == 0) goto L8d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "pkg name:"
            r3.append(r4)
            java.lang.String r4 = r1.packageName
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            cn.jpush.android.helper.Logger.d(r2, r3)
            java.lang.Class<android.content.res.AssetManager> r3 = android.content.res.AssetManager.class
            java.lang.Object r4 = r3.newInstance()
            android.content.res.AssetManager r4 = (android.content.res.AssetManager) r4
            r5 = 1
            java.lang.Class[] r6 = new java.lang.Class[r5]
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r8 = 0
            r6[r8] = r7
            java.lang.String r7 = "addAssetPath"
            java.lang.reflect.Method r3 = r3.getMethod(r7, r6)
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r8] = r0
            r3.invoke(r4, r5)
            android.content.res.Resources r3 = new android.content.res.Resources
            android.content.res.Resources r5 = r9.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            android.content.res.Resources r6 = r9.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            r3.<init>(r4, r5, r6)
            cn.jpush.android.y.a r4 = new cn.jpush.android.y.a
            r4.<init>()
            r4.a(r3)
            java.lang.String r1 = r1.packageName
            r4.a(r1)
            cn.jpush.android.y.b r1 = new cn.jpush.android.y.b
            java.lang.ClassLoader r3 = r9.getClassLoader()
            r1.<init>(r0, r11, r12, r3)
            r4.a(r1)
            a(r9, r10, r0, r13)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "build resource:"
            r9.append(r11)
            r9.append(r0)
            java.lang.String r11 = ", o: "
            r9.append(r11)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            cn.jpush.android.helper.Logger.d(r2, r9)
            return r4
        L8d:
            java.lang.String r9 = "info is null"
            cn.jpush.android.helper.Logger.d(r2, r9)
            r9 = 0
            return r9
    }

    private static java.lang.String a(android.content.Context r8, java.lang.String r9, boolean r10) {
            java.lang.String r0 = "LoadedResource"
            r1 = 0
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L22
            r3 = 34
            if (r2 < r3) goto L129
            android.content.pm.ApplicationInfo r2 = r8.getApplicationInfo()     // Catch: java.lang.Throwable -> L22
            int r2 = r2.targetSdkVersion     // Catch: java.lang.Throwable -> L22
            if (r2 >= r3) goto L13
            goto L129
        L13:
            if (r10 != 0) goto L26
            int r10 = cn.jiguang.internal.JConstants.SDK_VERSION_INT     // Catch: java.lang.Throwable -> L22
            r2 = 440(0x1b8, float:6.17E-43)
            if (r10 < r2) goto L26
            cn.jpush.android.ad.m.a(r1)
            cn.jpush.android.ad.m.a(r1)
            return r9
        L22:
            r8 = move-exception
            r10 = r1
            goto L130
        L26:
            java.lang.String r10 = c(r9)     // Catch: java.lang.Throwable -> L22
            java.util.Map<java.lang.String, java.lang.String> r2 = cn.jpush.android.y.a.f2035e     // Catch: java.lang.Throwable -> L22
            boolean r3 = r2.containsKey(r10)     // Catch: java.lang.Throwable -> L22
            if (r3 == 0) goto L44
            java.lang.String r8 = "use d f cache"
            cn.jpush.android.helper.Logger.d(r0, r8)     // Catch: java.lang.Throwable -> L22
            java.lang.Object r8 = r2.get(r10)     // Catch: java.lang.Throwable -> L22
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L22
            cn.jpush.android.ad.m.a(r1)
            cn.jpush.android.ad.m.a(r1)
            return r8
        L44:
            java.lang.String r2 = cn.jpush.android.ad.a.d(r8)     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = c(r2)     // Catch: java.lang.Throwable -> L22
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L22
            if (r3 == 0) goto L5e
            java.lang.String r8 = "process name to hash failed"
            cn.jpush.android.helper.Logger.w(r0, r8)     // Catch: java.lang.Throwable -> L22
            cn.jpush.android.ad.m.a(r1)
            cn.jpush.android.ad.m.a(r1)
            return r9
        L5e:
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L22
            r3.<init>(r9)     // Catch: java.lang.Throwable -> L22
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L22
            r4.<init>()     // Catch: java.lang.Throwable -> L22
            r4.append(r2)     // Catch: java.lang.Throwable -> L22
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> L22
            r4.append(r3)     // Catch: java.lang.Throwable -> L22
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> L22
            java.lang.String r3 = c(r3)     // Catch: java.lang.Throwable -> L22
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L22
            if (r4 == 0) goto L8c
            java.lang.String r8 = "process + fileName to hash failed"
            cn.jpush.android.helper.Logger.w(r0, r8)     // Catch: java.lang.Throwable -> L22
            cn.jpush.android.ad.m.a(r1)
            cn.jpush.android.ad.m.a(r1)
            return r9
        L8c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L22
            r4.<init>()     // Catch: java.lang.Throwable -> L22
            java.io.File r8 = r8.getCacheDir()     // Catch: java.lang.Throwable -> L22
            r4.append(r8)     // Catch: java.lang.Throwable -> L22
            java.lang.String r8 = java.io.File.separator     // Catch: java.lang.Throwable -> L22
            r4.append(r8)     // Catch: java.lang.Throwable -> L22
            java.lang.String r5 = ".p"
            r4.append(r5)     // Catch: java.lang.Throwable -> L22
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L22
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L22
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L22
            r6.<init>()     // Catch: java.lang.Throwable -> L22
            r6.append(r2)     // Catch: java.lang.Throwable -> L22
            r6.append(r8)     // Catch: java.lang.Throwable -> L22
            r6.append(r3)     // Catch: java.lang.Throwable -> L22
            java.lang.String r8 = ".d"
            r6.append(r8)     // Catch: java.lang.Throwable -> L22
            java.lang.String r8 = r6.toString()     // Catch: java.lang.Throwable -> L22
            r5.<init>(r4, r8)     // Catch: java.lang.Throwable -> L22
            boolean r8 = r5.exists()     // Catch: java.lang.Throwable -> L22
            if (r8 == 0) goto Lcb
            r5.delete()     // Catch: java.lang.Throwable -> L22
        Lcb:
            java.io.File r8 = r5.getParentFile()     // Catch: java.lang.Throwable -> L22
            r8.mkdirs()     // Catch: java.lang.Throwable -> L22
            r5.createNewFile()     // Catch: java.lang.Throwable -> L22
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L22
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L22
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L124
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L124
            r1 = 8192(0x2000, float:1.148E-41)
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> Lef
        Le3:
            int r3 = r8.read(r1)     // Catch: java.lang.Throwable -> Lef
            r4 = -1
            if (r3 == r4) goto Lf5
            r4 = 0
            r2.write(r1, r4, r3)     // Catch: java.lang.Throwable -> Lef
            goto Le3
        Lef:
            r10 = move-exception
            r1 = r10
            r10 = r8
            r8 = r1
            r1 = r2
            goto L130
        Lf5:
            r5.setReadOnly()     // Catch: java.lang.Throwable -> Lef
            java.util.Map<java.lang.String, java.lang.String> r1 = cn.jpush.android.y.a.f2035e     // Catch: java.lang.Throwable -> Lef
            java.lang.String r3 = r5.getAbsolutePath()     // Catch: java.lang.Throwable -> Lef
            r1.put(r10, r3)     // Catch: java.lang.Throwable -> Lef
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lef
            r10.<init>()     // Catch: java.lang.Throwable -> Lef
            java.lang.String r1 = "fix d success, name: "
            r10.append(r1)     // Catch: java.lang.Throwable -> Lef
            java.lang.String r1 = r5.getName()     // Catch: java.lang.Throwable -> Lef
            r10.append(r1)     // Catch: java.lang.Throwable -> Lef
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> Lef
            cn.jpush.android.helper.Logger.d(r0, r10)     // Catch: java.lang.Throwable -> Lef
            java.lang.String r9 = r5.getAbsolutePath()     // Catch: java.lang.Throwable -> Lef
            cn.jpush.android.ad.m.a(r2)
            cn.jpush.android.ad.m.a(r8)
            return r9
        L124:
            r10 = move-exception
            r7 = r10
            r10 = r8
            r8 = r7
            goto L130
        L129:
            cn.jpush.android.ad.m.a(r1)
            cn.jpush.android.ad.m.a(r1)
            return r9
        L130:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L14f
            r2.<init>()     // Catch: java.lang.Throwable -> L14f
            java.lang.String r3 = "fix d file failed, "
            r2.append(r3)     // Catch: java.lang.Throwable -> L14f
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L14f
            r2.append(r8)     // Catch: java.lang.Throwable -> L14f
            java.lang.String r8 = r2.toString()     // Catch: java.lang.Throwable -> L14f
            cn.jpush.android.helper.Logger.w(r0, r8)     // Catch: java.lang.Throwable -> L14f
            cn.jpush.android.ad.m.a(r1)
            cn.jpush.android.ad.m.a(r10)
            return r9
        L14f:
            r8 = move-exception
            cn.jpush.android.ad.m.a(r1)
            cn.jpush.android.ad.m.a(r10)
            throw r8
    }

    private static java.lang.String a(byte[] r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r4.length
            int r1 = r1 * 2
            r0.<init>(r1)
            r1 = 0
        L9:
            int r2 = r4.length
            if (r1 >= r2) goto L25
            char[] r2 = cn.jpush.android.y.a.f2034d
            r3 = r4[r1]
            r3 = r3 & 240(0xf0, float:3.36E-43)
            int r3 = r3 >>> 4
            char r3 = r2[r3]
            r0.append(r3)
            r3 = r4[r1]
            r3 = r3 & 15
            char r2 = r2[r3]
            r0.append(r2)
            int r1 = r1 + 1
            goto L9
        L25:
            java.lang.String r4 = r0.toString()
            return r4
    }

    private static void a(android.content.Context r3, java.lang.String r4, java.lang.String r5, boolean r6) {
            java.lang.String r0 = "LoadedResource"
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 34
            if (r1 < r2) goto L7c
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo()
            int r3 = r3.targetSdkVersion
            if (r3 >= r2) goto L11
            goto L7c
        L11:
            boolean r3 = android.text.TextUtils.isEmpty(r4)
            if (r3 != 0) goto L7c
            boolean r3 = android.text.TextUtils.isEmpty(r5)
            if (r3 == 0) goto L1e
            goto L7c
        L1e:
            if (r6 != 0) goto L27
            int r3 = cn.jiguang.internal.JConstants.SDK_VERSION_INT
            r6 = 440(0x1b8, float:6.17E-43)
            if (r3 < r6) goto L27
            goto L7c
        L27:
            java.lang.String r3 = c(r4)     // Catch: java.lang.Throwable -> L63
            java.util.Map<java.lang.String, java.lang.String> r6 = cn.jpush.android.y.a.f2035e     // Catch: java.lang.Throwable -> L63
            boolean r1 = r6.containsKey(r3)     // Catch: java.lang.Throwable -> L63
            if (r1 == 0) goto L7c
            boolean r4 = android.text.TextUtils.equals(r4, r5)     // Catch: java.lang.Throwable -> L63
            if (r4 != 0) goto L7c
            r6.remove(r3)     // Catch: java.lang.Throwable -> L63
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L63
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L63
            boolean r4 = r3.exists()     // Catch: java.lang.Throwable -> L63
            if (r4 == 0) goto L7c
            r3.delete()     // Catch: java.lang.Throwable -> L63
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L63
            r4.<init>()     // Catch: java.lang.Throwable -> L63
            java.lang.String r5 = "d d file success:"
            r4.append(r5)     // Catch: java.lang.Throwable -> L63
            java.lang.String r3 = r3.getAbsolutePath()     // Catch: java.lang.Throwable -> L63
            r4.append(r3)     // Catch: java.lang.Throwable -> L63
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> L63
            cn.jpush.android.helper.Logger.d(r0, r3)     // Catch: java.lang.Throwable -> L63
            return
        L63:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "d dex f failed, "
            r4.append(r5)
            java.lang.String r3 = r3.getMessage()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            cn.jpush.android.helper.Logger.w(r0, r3)
        L7c:
            return
    }

    private static java.lang.String c(java.lang.String r2) {
            r0 = 0
            if (r2 == 0) goto L22
            java.lang.String r1 = ""
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Lc
            goto L22
        Lc:
            java.lang.String r1 = cn.jpush.android.ad.l.a     // Catch: java.lang.Throwable -> L22
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.lang.Throwable -> L22
            byte[] r2 = r2.getBytes()     // Catch: java.lang.Throwable -> L22
            r1.update(r2)     // Catch: java.lang.Throwable -> L22
            byte[] r2 = r1.digest()     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = a(r2)     // Catch: java.lang.Throwable -> L22
            return r2
        L22:
            return r0
    }

    public int a(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ".R$"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "resource class:"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = ",fieldName:"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "LoadedResource"
            cn.jpush.android.helper.Logger.d(r1, r0)
            java.lang.ClassLoader r0 = r2.f2037c     // Catch: java.lang.Throwable -> L4a
            java.lang.Class r3 = r0.loadClass(r3)     // Catch: java.lang.Throwable -> L4a
            java.lang.reflect.Field r3 = r3.getField(r4)     // Catch: java.lang.Throwable -> L4a
            r4 = 0
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L4a
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L4a
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L4a
            return r3
        L4a:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "[getResourceID] failed:"
            r4.append(r0)
            java.lang.String r3 = r3.getMessage()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            cn.jpush.android.helper.Logger.ww(r1, r3)
            r3 = 0
            return r3
    }

    public void a(android.content.res.Resources r1) {
            r0 = this;
            r0.f2036b = r1
            return
    }

    public void a(java.lang.ClassLoader r1) {
            r0 = this;
            r0.f2037c = r1
            return
    }

    public void a(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public java.lang.Class b(java.lang.String r3) {
            r2 = this;
            java.lang.ClassLoader r0 = r2.f2037c     // Catch: java.lang.ClassNotFoundException -> L7
            java.lang.Class r3 = r0.loadClass(r3)     // Catch: java.lang.ClassNotFoundException -> L7
            return r3
        L7:
            r3 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[getClass] failed:"
            r0.append(r1)
            java.lang.String r3 = r3.getMessage()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "LoadedResource"
            cn.jpush.android.helper.Logger.ww(r0, r3)
            r3 = 0
            return r3
    }
}
