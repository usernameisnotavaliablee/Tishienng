package cn.jpush.android.ad;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a {
    private static java.util.List<java.lang.String> a;

    /* renamed from: b, reason: collision with root package name */
    private static java.util.LinkedHashMap<java.lang.String, java.lang.String> f1663b;

    /* renamed from: c, reason: collision with root package name */
    private static java.lang.String f1664c;

    /* renamed from: d, reason: collision with root package name */
    private static java.lang.Boolean f1665d;

    /* renamed from: e, reason: collision with root package name */
    private static java.lang.String f1666e;

    /* renamed from: f, reason: collision with root package name */
    private static final byte[] f1667f = null;

    /* renamed from: g, reason: collision with root package name */
    private static final byte[] f1668g = null;

    /* renamed from: h, reason: collision with root package name */
    private static final byte[] f1669h = null;

    /* renamed from: i, reason: collision with root package name */
    private static java.lang.String f1670i;

    /* renamed from: j, reason: collision with root package name */
    private static java.lang.Class<?> f1671j;

    /* renamed from: k, reason: collision with root package name */
    private static java.lang.reflect.Method f1672k;
    private static java.lang.String l;
    private static java.lang.String m;


    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            cn.jpush.android.ad.a.a = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            cn.jpush.android.ad.a.f1663b = r0
            java.util.List<java.lang.String> r0 = cn.jpush.android.ad.a.a
            java.lang.String r1 = "image/png"
            r0.add(r1)
            java.util.List<java.lang.String> r0 = cn.jpush.android.ad.a.a
            java.lang.String r1 = "image/jpg"
            r0.add(r1)
            java.util.List<java.lang.String> r0 = cn.jpush.android.ad.a.a
            java.lang.String r1 = "image/jpeg"
            r0.add(r1)
            java.util.List<java.lang.String> r0 = cn.jpush.android.ad.a.a
            java.lang.String r1 = "image/webp"
            r0.add(r1)
            java.lang.String r0 = ""
            cn.jpush.android.ad.a.f1664c = r0
            r1 = 26
            byte[] r1 = new byte[r1]
            r1 = {x0052: FILL_ARRAY_DATA , data: [105, 120, 117, 66, 79, 112, 108, 56, 102, 85, 66, 114, 97, 98, 63, 103, 69, 123, 91, 115, 101, 68, 73, 119, 111, 101} // fill-array
            cn.jpush.android.ad.a.f1667f = r1
            r1 = 18
            byte[] r1 = new byte[r1]
            r1 = {x0064: FILL_ARRAY_DATA , data: [83, 124, 124, 87, 125, 92, 79, 110, 78, 127, 125, 85, 97, 122, 107, 115, 98, 67} // fill-array
            cn.jpush.android.ad.a.f1668g = r1
            r1 = 20
            byte[] r1 = new byte[r1]
            r1 = {x0072: FILL_ARRAY_DATA , data: [123, 115, 101, 122, 65, 111, 105, 69, 114, 66, 73, 105, 124, 83, 127, 81, 66, 117, 109, 114} // fill-array
            cn.jpush.android.ad.a.f1669h = r1
            cn.jpush.android.ad.a.f1670i = r0
            java.lang.String r1 = "android.permission.POST_NOTIFICATIONS"
            cn.jpush.android.ad.a.l = r1
            cn.jpush.android.ad.a.m = r0
            return
    }

    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static int a(java.lang.String r11, java.lang.String r12) {
            java.lang.String r0 = "[._]"
            boolean r1 = r11.equals(r12)
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            java.lang.String[] r1 = r11.split(r0)     // Catch: java.lang.Throwable -> L5e
            java.lang.String[] r0 = r12.split(r0)     // Catch: java.lang.Throwable -> L5e
            int r3 = r1.length     // Catch: java.lang.Throwable -> L5e
            int r4 = r0.length     // Catch: java.lang.Throwable -> L5e
            if (r3 <= r4) goto L1e
            int r3 = r1.length     // Catch: java.lang.Throwable -> L5e
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)     // Catch: java.lang.Throwable -> L5e
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch: java.lang.Throwable -> L5e
            goto L29
        L1e:
            int r3 = r1.length     // Catch: java.lang.Throwable -> L5e
            int r4 = r0.length     // Catch: java.lang.Throwable -> L5e
            if (r3 >= r4) goto L29
            int r3 = r0.length     // Catch: java.lang.Throwable -> L5e
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r3)     // Catch: java.lang.Throwable -> L5e
            java.lang.String[] r1 = (java.lang.String[]) r1     // Catch: java.lang.Throwable -> L5e
        L29:
            r3 = 0
        L2a:
            int r4 = r1.length     // Catch: java.lang.Throwable -> L5e
            if (r3 >= r4) goto L5d
            r4 = r1[r3]     // Catch: java.lang.Throwable -> L5e
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L5e
            r5 = 0
            if (r4 == 0) goto L39
            r7 = r5
            goto L3f
        L39:
            r4 = r1[r3]     // Catch: java.lang.Throwable -> L5e
            long r7 = java.lang.Long.parseLong(r4)     // Catch: java.lang.Throwable -> L5e
        L3f:
            r4 = r0[r3]     // Catch: java.lang.Throwable -> L5e
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L5e
            if (r4 == 0) goto L49
            r9 = r5
            goto L4f
        L49:
            r4 = r0[r3]     // Catch: java.lang.Throwable -> L5e
            long r9 = java.lang.Long.parseLong(r4)     // Catch: java.lang.Throwable -> L5e
        L4f:
            long r7 = r7 - r9
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 <= 0) goto L56
            r11 = 1
            return r11
        L56:
            if (r4 >= 0) goto L5a
            r11 = -1
            return r11
        L5a:
            int r3 = r3 + 1
            goto L2a
        L5d:
            return r2
        L5e:
            int r11 = r11.compareTo(r12)
            return r11
    }

    public static android.content.Intent a(android.os.Bundle r5) {
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            if (r5 != 0) goto L8
            goto L72
        L8:
            java.lang.String r1 = "intent_action"
            java.lang.String r1 = r5.getString(r1)     // Catch: java.lang.Throwable -> L72
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L72
            if (r2 != 0) goto L17
            r0.setAction(r1)     // Catch: java.lang.Throwable -> L72
        L17:
            java.lang.String r1 = "intent_data"
            android.os.Parcelable r1 = r5.getParcelable(r1)     // Catch: java.lang.Throwable -> L72
            android.net.Uri r1 = (android.net.Uri) r1     // Catch: java.lang.Throwable -> L72
            if (r1 == 0) goto L24
            r0.setData(r1)     // Catch: java.lang.Throwable -> L72
        L24:
            java.lang.String r1 = "intent_categories"
            java.lang.String[] r1 = r5.getStringArray(r1)     // Catch: java.lang.Throwable -> L72
            if (r1 == 0) goto L3b
            int r2 = r1.length     // Catch: java.lang.Throwable -> L72
            if (r2 <= 0) goto L3b
            int r2 = r1.length     // Catch: java.lang.Throwable -> L72
            r3 = 0
        L31:
            if (r3 >= r2) goto L3b
            r4 = r1[r3]     // Catch: java.lang.Throwable -> L72
            r0.addCategory(r4)     // Catch: java.lang.Throwable -> L72
            int r3 = r3 + 1
            goto L31
        L3b:
            java.lang.String r1 = "intent_component"
            android.os.Parcelable r1 = r5.getParcelable(r1)     // Catch: java.lang.Throwable -> L72
            if (r1 == 0) goto L48
            android.content.ComponentName r1 = (android.content.ComponentName) r1     // Catch: java.lang.Throwable -> L72
            r0.setComponent(r1)     // Catch: java.lang.Throwable -> L72
        L48:
            r0.putExtras(r5)     // Catch: java.lang.Throwable -> L72
            java.lang.String r1 = "intent_flags"
            int r1 = r5.getInt(r1)     // Catch: java.lang.Throwable -> L72
            r0.setFlags(r1)     // Catch: java.lang.Throwable -> L72
            java.lang.String r1 = "intent_package"
            java.lang.String r1 = r5.getString(r1)     // Catch: java.lang.Throwable -> L72
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L72
            if (r2 != 0) goto L63
            r0.setPackage(r1)     // Catch: java.lang.Throwable -> L72
        L63:
            java.lang.String r1 = "intent_type"
            java.lang.String r5 = r5.getString(r1)     // Catch: java.lang.Throwable -> L72
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L72
            if (r1 != 0) goto L72
            r0.setType(r5)     // Catch: java.lang.Throwable -> L72
        L72:
            return r0
    }

    public static android.content.Intent a(java.lang.String r2, int r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            android.content.Intent r2 = android.content.Intent.parseUri(r2, r3)
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r2)
            java.lang.String r0 = "android.intent.category.BROWSABLE"
            r2.addCategory(r0)
            r2.setComponent(r1)
            r2.setSelector(r1)
            return r3
    }

    public static android.content.pm.ComponentInfo a(android.content.Context r8, java.lang.String r9, java.lang.Class<?> r10) {
            java.lang.String r0 = "AndroidUtil"
            r1 = 0
            if (r8 == 0) goto L93
            boolean r2 = android.text.TextUtils.isEmpty(r9)
            if (r2 != 0) goto L93
            if (r10 != 0) goto Lf
            goto L93
        Lf:
            java.lang.Class<android.app.Service> r2 = android.app.Service.class
            boolean r2 = r2.isAssignableFrom(r10)     // Catch: java.lang.Throwable -> L53
            r3 = 8
            r4 = 2
            r5 = 4
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L1f
            r2 = 4
            goto L3f
        L1f:
            java.lang.Class<android.content.BroadcastReceiver> r2 = android.content.BroadcastReceiver.class
            boolean r2 = r2.isAssignableFrom(r10)     // Catch: java.lang.Throwable -> L53
            if (r2 == 0) goto L29
            r2 = 2
            goto L3f
        L29:
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            boolean r2 = r2.isAssignableFrom(r10)     // Catch: java.lang.Throwable -> L53
            if (r2 == 0) goto L33
            r2 = 1
            goto L3f
        L33:
            java.lang.Class<android.content.ContentProvider> r2 = android.content.ContentProvider.class
            boolean r2 = r2.isAssignableFrom(r10)     // Catch: java.lang.Throwable -> L53
            if (r2 == 0) goto L3e
            r2 = 8
            goto L3f
        L3e:
            r2 = 0
        L3f:
            android.content.pm.PackageInfo r8 = cn.jpush.android.helper.JCoreHelper.getPackageInfo(r8, r9, r2)     // Catch: java.lang.Throwable -> L53
            if (r8 != 0) goto L46
            return r1
        L46:
            if (r2 == r6) goto L5b
            if (r2 == r4) goto L58
            if (r2 == r5) goto L55
            if (r2 == r3) goto L50
            r8 = r1
            goto L5d
        L50:
            android.content.pm.ProviderInfo[] r8 = r8.providers     // Catch: java.lang.Throwable -> L53
            goto L5d
        L53:
            r8 = move-exception
            goto L7a
        L55:
            android.content.pm.ServiceInfo[] r8 = r8.services     // Catch: java.lang.Throwable -> L53
            goto L5d
        L58:
            android.content.pm.ActivityInfo[] r8 = r8.receivers     // Catch: java.lang.Throwable -> L53
            goto L5d
        L5b:
            android.content.pm.ActivityInfo[] r8 = r8.activities     // Catch: java.lang.Throwable -> L53
        L5d:
            if (r8 != 0) goto L60
            return r1
        L60:
            int r9 = r8.length     // Catch: java.lang.Throwable -> L53
            r2 = 0
        L62:
            if (r2 >= r9) goto L92
            r3 = r8[r2]     // Catch: java.lang.Throwable -> L53
            java.lang.String r4 = r3.name     // Catch: java.lang.Throwable -> L77
            java.lang.ClassLoader r5 = r10.getClassLoader()     // Catch: java.lang.Throwable -> L77
            java.lang.Class r4 = java.lang.Class.forName(r4, r7, r5)     // Catch: java.lang.Throwable -> L77
            boolean r4 = r10.isAssignableFrom(r4)     // Catch: java.lang.Throwable -> L77
            if (r4 == 0) goto L77
            return r3
        L77:
            int r2 = r2 + 1
            goto L62
        L7a:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "hasComponent error:"
            r9.append(r10)
            java.lang.String r8 = r8.getMessage()
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            cn.jpush.android.helper.Logger.ww(r0, r8)
        L92:
            return r1
        L93:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Action - hasComponent, invalide param, context:"
            r2.append(r3)
            r2.append(r8)
            java.lang.String r8 = ",packageName:"
            r2.append(r8)
            r2.append(r9)
            java.lang.String r8 = ",cls:"
            r2.append(r8)
            r2.append(r10)
            java.lang.String r8 = r2.toString()
            cn.jpush.android.helper.Logger.w(r0, r8)
            return r1
    }

    public static android.os.Bundle a(android.content.Intent r4) {
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            if (r4 != 0) goto L8
            goto L77
        L8:
            java.lang.String r1 = r4.getAction()     // Catch: java.lang.Throwable -> L77
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L77
            if (r2 != 0) goto L17
            java.lang.String r2 = "intent_action"
            r0.putString(r2, r1)     // Catch: java.lang.Throwable -> L77
        L17:
            android.net.Uri r1 = r4.getData()     // Catch: java.lang.Throwable -> L77
            if (r1 == 0) goto L22
            java.lang.String r2 = "intent_data"
            r0.putParcelable(r2, r1)     // Catch: java.lang.Throwable -> L77
        L22:
            java.util.Set r1 = r4.getCategories()     // Catch: java.lang.Throwable -> L77
            if (r1 == 0) goto L3c
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L77
            if (r2 <= 0) goto L3c
            java.lang.String r2 = "intent_categories"
            r3 = 0
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L77
            java.lang.Object[] r1 = r1.toArray(r3)     // Catch: java.lang.Throwable -> L77
            java.lang.String[] r1 = (java.lang.String[]) r1     // Catch: java.lang.Throwable -> L77
            r0.putStringArray(r2, r1)     // Catch: java.lang.Throwable -> L77
        L3c:
            android.content.ComponentName r1 = r4.getComponent()     // Catch: java.lang.Throwable -> L77
            if (r1 == 0) goto L47
            java.lang.String r2 = "intent_component"
            r0.putParcelable(r2, r1)     // Catch: java.lang.Throwable -> L77
        L47:
            android.os.Bundle r1 = r4.getExtras()     // Catch: java.lang.Throwable -> L77
            if (r1 == 0) goto L50
            r0.putAll(r1)     // Catch: java.lang.Throwable -> L77
        L50:
            java.lang.String r1 = "intent_flags"
            int r2 = r4.getFlags()     // Catch: java.lang.Throwable -> L77
            r0.putInt(r1, r2)     // Catch: java.lang.Throwable -> L77
            java.lang.String r1 = r4.getPackage()     // Catch: java.lang.Throwable -> L77
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L77
            if (r2 != 0) goto L68
            java.lang.String r2 = "intent_package"
            r0.putString(r2, r1)     // Catch: java.lang.Throwable -> L77
        L68:
            java.lang.String r4 = r4.getType()     // Catch: java.lang.Throwable -> L77
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L77
            if (r1 != 0) goto L77
            java.lang.String r1 = "intent_type"
            r0.putString(r1, r4)     // Catch: java.lang.Throwable -> L77
        L77:
            return r0
    }

    public static java.lang.String a(java.lang.String r2) {
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r0 = cn.jpush.android.ad.a.f1663b     // Catch: java.lang.Throwable -> Le
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> Le
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> Le
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r1 = cn.jpush.android.ad.a.f1663b     // Catch: java.lang.Throwable -> Le
            r1.remove(r2)     // Catch: java.lang.Throwable -> Le
            return r0
        Le:
            java.lang.String r2 = ""
            return r2
    }

    public static java.lang.String a(byte[] r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = cn.jpush.android.ad.l.a     // Catch: java.lang.Throwable -> L16
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.lang.Throwable -> L16
            r1.update(r2)     // Catch: java.lang.Throwable -> L16
            byte[] r2 = r1.digest()     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = b(r2)     // Catch: java.lang.Throwable -> L16
            return r2
        L16:
            return r0
    }

    private static java.util.List<java.lang.String> a(android.content.Context r3, java.util.List<java.lang.String> r4) {
            if (r4 == 0) goto L29
            int r0 = r4.size()
            if (r0 != 0) goto L9
            goto L29
        L9:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L12:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r4.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = a(r3, r1)
            if (r2 != 0) goto L12
            r0.add(r1)
            goto L12
        L28:
            return r0
        L29:
            r3 = 0
            return r3
    }

    public static void a(android.content.Context r6, android.content.Intent r7, java.lang.String r8) {
            if (r7 != 0) goto L4
            goto L7d
        L4:
            java.lang.String r0 = r7.getAction()
            java.lang.String r1 = "cn.jpush.android.intent.NOTIFICATION_RECEIVED"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L18
            java.lang.String r1 = "cn.jpush.android.intent.NOTIFICATION_OPENED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L7d
        L18:
            java.util.List r0 = b(r6, r7, r8)
            java.lang.String r1 = "AndroidUtil"
            if (r0 == 0) goto L7e
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L7e
            java.util.Iterator r0 = r0.iterator()
        L2a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L7d
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r7.clone()     // Catch: java.lang.Exception -> L52
            android.content.Intent r3 = (android.content.Intent) r3     // Catch: java.lang.Exception -> L52
            android.content.ComponentName r4 = new android.content.ComponentName     // Catch: java.lang.Exception -> L52
            java.lang.String r5 = r6.getPackageName()     // Catch: java.lang.Exception -> L52
            r4.<init>(r5, r2)     // Catch: java.lang.Exception -> L52
            r3.setComponent(r4)     // Catch: java.lang.Exception -> L52
            boolean r2 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Exception -> L52
            if (r2 == 0) goto L54
            r6.sendBroadcast(r3)     // Catch: java.lang.Exception -> L52
            goto L2a
        L52:
            r2 = move-exception
            goto L58
        L54:
            r6.sendBroadcast(r3, r8)     // Catch: java.lang.Exception -> L52
            goto L2a
        L58:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "sendBroadcast failed again:"
            r3.append(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = ", action:"
            r3.append(r2)
            java.lang.String r2 = r7.getAction()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            cn.jpush.android.helper.Logger.ww(r1, r2)
            goto L2a
        L7d:
            return
        L7e:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "sendBroadcast failed again: receiver not found, action:"
            r6.append(r8)
            java.lang.String r7 = r7.getAction()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            cn.jpush.android.helper.Logger.ww(r1, r6)
            return
    }

    public static void a(android.webkit.WebSettings r7) {
            java.lang.String r0 = "AndroidUtil"
            java.lang.String r1 = "fix."
            cn.jpush.android.helper.Logger.d(r0, r1)     // Catch: java.lang.Throwable -> L30
            r1 = 0
            r7.setAllowFileAccess(r1)     // Catch: java.lang.Throwable -> L30
            byte[] r2 = cn.jpush.android.ad.a.f1667f     // Catch: java.lang.Throwable -> L30
            java.lang.String r2 = cn.jpush.android.ad.d.b(r2)     // Catch: java.lang.Throwable -> L30
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L30
            byte[] r3 = cn.jpush.android.ad.a.f1668g     // Catch: java.lang.Throwable -> L30
            java.lang.String r3 = cn.jpush.android.ad.d.b(r3)     // Catch: java.lang.Throwable -> L30
            r4 = 1
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L30
            java.lang.Class r6 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L30
            r5[r1] = r6     // Catch: java.lang.Throwable -> L30
            java.lang.reflect.Method r2 = r2.getMethod(r3, r5)     // Catch: java.lang.Throwable -> L30
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L30
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L30
            r3[r1] = r4     // Catch: java.lang.Throwable -> L30
            r2.invoke(r7, r3)     // Catch: java.lang.Throwable -> L30
            return
        L30:
            r7 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "something is wrong:"
            r1.append(r2)
            java.lang.String r7 = r7.getMessage()
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            cn.jpush.android.helper.Logger.w(r0, r7)
            return
    }

    public static void a(android.webkit.WebView r3) {
            java.lang.String r0 = "searchBoxJavaBridge_"
            r3.removeJavascriptInterface(r0)     // Catch: java.lang.Throwable -> L18
            java.lang.String r0 = "accessibility"
            r3.removeJavascriptInterface(r0)     // Catch: java.lang.Throwable -> L18
            java.lang.String r0 = "accessibilityTraversal"
            r3.removeJavascriptInterface(r0)     // Catch: java.lang.Throwable -> L18
            android.webkit.WebSettings r0 = r3.getSettings()     // Catch: java.lang.Throwable -> L18
            r1 = 0
            r0.setMixedContentMode(r1)     // Catch: java.lang.Throwable -> L18
            return
        L18:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "fixSecure failed, error:"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "AndroidUtil"
            cn.jpush.android.helper.Logger.e(r1, r0)
            cn.jpush.android.ad.a$1 r0 = new cn.jpush.android.ad.a$1
            r0.<init>(r3)
            r3.addOnAttachStateChangeListener(r0)
            return
    }

    private static void a(java.lang.StringBuffer r2, byte r3) {
            int r0 = r3 >> 4
            r0 = r0 & 15
            java.lang.String r1 = "0123456789ABCDEF"
            char r0 = r1.charAt(r0)
            r2.append(r0)
            r3 = r3 & 15
            char r3 = r1.charAt(r3)
            r2.append(r3)
            return
    }

    public static boolean a() {
            java.lang.String r0 = "AndroidUtil"
            java.lang.String r1 = android.os.Environment.getExternalStorageState()     // Catch: java.lang.Throwable -> Ld
            java.lang.String r2 = "mounted"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> Ld
            goto L23
        Ld:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "isSdcardExist exception: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            cn.jpush.android.helper.Logger.w(r0, r1)
            r1 = 0
        L23:
            if (r1 != 0) goto L2a
            java.lang.String r2 = "SDCard is not mounted"
            cn.jpush.android.helper.Logger.d(r0, r2)
        L2a:
            return r1
    }

    public static boolean a(android.content.Context r2) {
            r0 = 0
            java.lang.String r1 = "connectivity"
            java.lang.Object r2 = r2.getSystemService(r1)     // Catch: java.lang.Throwable -> L17
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2     // Catch: java.lang.Throwable -> L17
            android.net.NetworkInfo r2 = r2.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> L17
            if (r2 == 0) goto L17
            boolean r2 = r2.isConnected()     // Catch: java.lang.Throwable -> L17
            if (r2 == 0) goto L17
            r2 = 1
            return r2
        L17:
            return r0
    }

    public static boolean a(android.content.Context r3, java.lang.Class<?> r4) {
            r0 = 0
            if (r3 == 0) goto L41
            android.content.pm.PackageManager r1 = r3.getPackageManager()     // Catch: java.lang.Throwable -> L24
            android.content.Intent r2 = new android.content.Intent     // Catch: java.lang.Throwable -> L24
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L24
            android.content.pm.ResolveInfo r1 = r1.resolveActivity(r2, r0)     // Catch: java.lang.Throwable -> L24
            r2 = 1
            if (r1 == 0) goto L15
            r1 = 1
            goto L16
        L15:
            r1 = 0
        L16:
            if (r1 != 0) goto L26
            java.lang.String r1 = r3.getPackageName()     // Catch: java.lang.Throwable -> L24
            android.content.pm.ComponentInfo r3 = a(r3, r1, r4)     // Catch: java.lang.Throwable -> L24
            if (r3 == 0) goto L23
            return r2
        L23:
            return r0
        L24:
            r3 = move-exception
            goto L27
        L26:
            return r1
        L27:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = "hasActivityResolves error:"
            r4.append(r1)
            java.lang.String r3 = r3.getMessage()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "AndroidUtil"
            cn.jpush.android.helper.Logger.dd(r4, r3)
        L41:
            return r0
    }

    public static boolean a(android.content.Context r5, java.lang.String r6) {
            java.lang.String r0 = "AndroidUtil"
            r1 = 0
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L19
            r3 = 23
            r4 = 1
            if (r2 < r3) goto L38
            android.content.pm.ApplicationInfo r2 = r5.getApplicationInfo()     // Catch: java.lang.Throwable -> L19
            int r2 = r2.targetSdkVersion     // Catch: java.lang.Throwable -> L19
            if (r2 < r3) goto L1b
            int r5 = androidx.core.app.q.a(r5, r6)     // Catch: java.lang.Throwable -> L19
            if (r5 != 0) goto L39
            goto L38
        L19:
            r5 = move-exception
            goto L55
        L1b:
            java.lang.String r6 = cn.jiguang.av.f0.a(r6)     // Catch: java.lang.Throwable -> L19
            if (r6 != 0) goto L22
            goto L36
        L22:
            java.lang.String r2 = "appops"
            java.lang.Object r2 = r5.getSystemService(r2)     // Catch: java.lang.Throwable -> L19
            android.app.AppOpsManager r2 = (android.app.AppOpsManager) r2     // Catch: java.lang.Throwable -> L19
            java.lang.String r5 = r5.getPackageName()     // Catch: java.lang.Throwable -> L19
            int r5 = cn.jiguang.av.g0.a(r2, r6, r5)     // Catch: java.lang.Throwable -> L19
            if (r5 != 0) goto L35
            r1 = 1
        L35:
            r4 = r1
        L36:
            r1 = r4
            goto L39
        L38:
            r1 = 1
        L39:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L19
            r5.<init>()     // Catch: java.lang.Throwable -> L19
            java.lang.String r6 = "use "
            r5.append(r6)     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L48
            java.lang.String r6 = " had current permission,no need to request"
            goto L4a
        L48:
            java.lang.String r6 = " need to request permission"
        L4a:
            r5.append(r6)     // Catch: java.lang.Throwable -> L19
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L19
            cn.jpush.android.helper.Logger.w(r0, r5)     // Catch: java.lang.Throwable -> L19
            return r1
        L55:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r2 = "checkPermission error:"
            r6.append(r2)
            java.lang.String r5 = r5.getMessage()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            cn.jpush.android.helper.Logger.w(r0, r5)
            return r1
    }

    public static boolean a(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
            boolean r0 = c(r2, r3)
            if (r0 == 0) goto L8
            r2 = 1
            return r2
        L8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "p not:"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "AndroidUtil"
            cn.jpush.android.helper.Logger.d(r1, r0)
            boolean r2 = b(r2, r3, r4)     // Catch: java.lang.Throwable -> L23
            return r2
        L23:
            r2 = 0
            return r2
    }

    public static boolean a(java.lang.String r6, boolean r7) {
            java.lang.String r0 = "AndroidUtil"
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            r1 = 0
            java.net.URL r3 = new java.net.URL     // Catch: java.lang.Throwable -> L5a
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L5a
            java.net.URLConnection r3 = r3.openConnection()     // Catch: java.lang.Throwable -> L5a
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch: java.lang.Throwable -> L5a
            java.lang.String r1 = r3.getContentType()     // Catch: java.lang.Throwable -> L3a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3a
            r4.<init>()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r5 = "httpGetIconBytes contentType:"
            r4.append(r5)     // Catch: java.lang.Throwable -> L3a
            r4.append(r1)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L3a
            cn.jpush.android.helper.Logger.v(r0, r4)     // Catch: java.lang.Throwable -> L3a
            boolean r4 = f(r1)     // Catch: java.lang.Throwable -> L3a
            if (r4 == 0) goto L42
            if (r7 == 0) goto L3d
            c(r6, r1)     // Catch: java.lang.Throwable -> L3a
            goto L3d
        L3a:
            r1 = r3
            goto L5b
        L3d:
            r6 = 1
            r3.disconnect()     // Catch: java.lang.Throwable -> L41
        L41:
            return r6
        L42:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3a
            r6.<init>()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r7 = "only support suffix jpg/jpeg/png!! current type="
            r6.append(r7)     // Catch: java.lang.Throwable -> L3a
            r6.append(r1)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L3a
            cn.jpush.android.helper.Logger.ke(r0, r6)     // Catch: java.lang.Throwable -> L3a
            r3.disconnect()     // Catch: java.lang.Throwable -> L60
            goto L60
        L5a:
        L5b:
            if (r1 == 0) goto L60
            r1.disconnect()     // Catch: java.lang.Throwable -> L60
        L60:
            return r2
    }

    public static java.lang.String b(android.content.Context r3) {
            java.lang.String r0 = cn.jpush.android.ad.a.f1664c
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.String r3 = cn.jpush.android.ad.a.f1664c
            return r3
        Lb:
            android.content.pm.PackageManager r0 = r3.getPackageManager()     // Catch: java.lang.Throwable -> L26
            java.lang.String r1 = r3.getPackageName()     // Catch: java.lang.Throwable -> L26
            r2 = 0
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r1, r2)     // Catch: java.lang.Throwable -> L26
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: java.lang.Throwable -> L26
            java.lang.CharSequence r3 = r3.getApplicationLabel(r0)     // Catch: java.lang.Throwable -> L26
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L26
            cn.jpush.android.ad.a.f1664c = r3     // Catch: java.lang.Throwable -> L26
        L26:
            java.lang.String r3 = cn.jpush.android.ad.a.f1664c
            return r3
    }

    public static java.lang.String b(java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r1 = ""
            if (r0 == 0) goto L9
            return r1
        L9:
            java.lang.String r0 = "?"
            int r0 = r3.indexOf(r0)     // Catch: java.lang.Throwable -> L28
            if (r0 <= 0) goto L1d
            r2 = 0
            java.lang.String r3 = r3.substring(r2, r0)     // Catch: java.lang.Throwable -> L28
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L28
            if (r0 == 0) goto L1d
            return r1
        L1d:
            java.lang.String r0 = "."
            int r0 = r3.lastIndexOf(r0)     // Catch: java.lang.Throwable -> L28
            java.lang.String r3 = r3.substring(r0)     // Catch: java.lang.Throwable -> L28
            return r3
        L28:
            return r1
    }

    public static java.lang.String b(java.lang.String r7, java.lang.String r8) {
            java.lang.Class<?> r0 = cn.jpush.android.ad.a.f1671j     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto Lc
            java.lang.String r0 = "android.os.SystemProperties"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L35
            cn.jpush.android.ad.a.f1671j = r0     // Catch: java.lang.Throwable -> L35
        Lc:
            java.lang.reflect.Method r0 = cn.jpush.android.ad.a.f1672k     // Catch: java.lang.Throwable -> L35
            r1 = 1
            r2 = 0
            r3 = 2
            if (r0 != 0) goto L25
            java.lang.Class<?> r0 = cn.jpush.android.ad.a.f1671j     // Catch: java.lang.Throwable -> L35
            java.lang.String r4 = "get"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L35
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r5[r2] = r6     // Catch: java.lang.Throwable -> L35
            r5[r1] = r6     // Catch: java.lang.Throwable -> L35
            java.lang.reflect.Method r0 = r0.getMethod(r4, r5)     // Catch: java.lang.Throwable -> L35
            cn.jpush.android.ad.a.f1672k = r0     // Catch: java.lang.Throwable -> L35
        L25:
            java.lang.reflect.Method r0 = cn.jpush.android.ad.a.f1672k     // Catch: java.lang.Throwable -> L35
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L35
            r3[r2] = r7     // Catch: java.lang.Throwable -> L35
            r3[r1] = r8     // Catch: java.lang.Throwable -> L35
            r7 = 0
            java.lang.Object r7 = r0.invoke(r7, r3)     // Catch: java.lang.Throwable -> L35
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L35
            return r7
        L35:
            return r8
    }

    public static java.lang.String b(byte[] r4) {
            if (r4 != 0) goto L5
            java.lang.String r4 = ""
            return r4
        L5:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            int r1 = r4.length
            int r1 = r1 * 2
            r0.<init>(r1)
            int r1 = r4.length
            r2 = 0
        Lf:
            if (r2 >= r1) goto L19
            r3 = r4[r2]
            a(r0, r3)
            int r2 = r2 + 1
            goto Lf
        L19:
            java.lang.String r4 = r0.toString()
            return r4
    }

    public static java.util.List<java.lang.String> b(android.content.Context r4, android.content.Intent r5, java.lang.String r6) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch: java.lang.Throwable -> L43
            r2 = 0
            java.util.List r5 = r1.queryBroadcastReceivers(r5, r2)     // Catch: java.lang.Throwable -> L43
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch: java.lang.Throwable -> L43
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L43
        L16:
            boolean r1 = r5.hasNext()     // Catch: java.lang.Throwable -> L43
            if (r1 == 0) goto L43
            java.lang.Object r1 = r5.next()     // Catch: java.lang.Throwable -> L43
            android.content.pm.ResolveInfo r1 = (android.content.pm.ResolveInfo) r1     // Catch: java.lang.Throwable -> L43
            android.content.pm.ActivityInfo r2 = r1.activityInfo     // Catch: java.lang.Throwable -> L43
            if (r2 == 0) goto L16
            java.lang.String r2 = r2.name     // Catch: java.lang.Throwable -> L43
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L43
            if (r3 != 0) goto L16
            boolean r3 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L43
            if (r3 != 0) goto L3f
            android.content.pm.ActivityInfo r1 = r1.activityInfo     // Catch: java.lang.Throwable -> L43
            java.lang.String r1 = r1.packageName     // Catch: java.lang.Throwable -> L43
            int r1 = r4.checkPermission(r6, r1)     // Catch: java.lang.Throwable -> L43
            if (r1 == 0) goto L3f
            goto L16
        L3f:
            r0.add(r2)     // Catch: java.lang.Throwable -> L43
            goto L16
        L43:
            return r0
    }

    public static void b(android.content.Context r2, java.lang.String r3) {
            android.content.Intent r0 = g(r2)     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L14
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L11
            java.lang.String r1 = "extra"
            r0.putExtra(r1, r3)     // Catch: java.lang.Throwable -> L15
        L11:
            r2.startActivity(r0)     // Catch: java.lang.Throwable -> L15
        L14:
            return
        L15:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "startMainActivity error:"
            r3.append(r0)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "AndroidUtil"
            cn.jpush.android.helper.Logger.dd(r3, r2)
            return
    }

    public static void b(android.webkit.WebSettings r6) {
            byte[] r0 = cn.jpush.android.ad.a.f1667f     // Catch: java.lang.Throwable -> L26
            java.lang.String r0 = cn.jpush.android.ad.d.b(r0)     // Catch: java.lang.Throwable -> L26
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L26
            byte[] r1 = cn.jpush.android.ad.a.f1669h     // Catch: java.lang.Throwable -> L26
            java.lang.String r1 = cn.jpush.android.ad.d.b(r1)     // Catch: java.lang.Throwable -> L26
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L26
            java.lang.Class r4 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L26
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Throwable -> L26
            java.lang.reflect.Method r0 = r0.getMethod(r1, r3)     // Catch: java.lang.Throwable -> L26
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L26
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L26
            r1[r5] = r2     // Catch: java.lang.Throwable -> L26
            r0.invoke(r6, r1)     // Catch: java.lang.Throwable -> L26
            return
        L26:
            r6 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "something is wrong:"
            r0.append(r1)
            java.lang.String r6 = r6.getMessage()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "AndroidUtil"
            cn.jpush.android.helper.Logger.w(r0, r6)
            return
    }

    public static boolean b() {
            java.lang.String r0 = "AndroidUtil"
            java.lang.String r1 = d()     // Catch: java.lang.Throwable -> L57
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L57
            r2.<init>()     // Catch: java.lang.Throwable -> L57
            java.lang.String r3 = "vivoVersion:"
            r2.append(r3)     // Catch: java.lang.Throwable -> L57
            r2.append(r1)     // Catch: java.lang.Throwable -> L57
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L57
            cn.jpush.android.helper.Logger.d(r0, r2)     // Catch: java.lang.Throwable -> L57
            java.lang.String r2 = android.os.Build.MANUFACTURER     // Catch: java.lang.Throwable -> L57
            java.lang.String r3 = "vivo"
            boolean r2 = r2.equalsIgnoreCase(r3)     // Catch: java.lang.Throwable -> L57
            r3 = 1
            if (r2 != 0) goto L56
            java.lang.String r2 = "Funtouch"
            boolean r1 = r1.startsWith(r2)     // Catch: java.lang.Throwable -> L57
            if (r1 == 0) goto L30
            goto L56
        L30:
            java.lang.String r1 = "ro.iqoo.os.build.display.id"
            java.lang.String r1 = e(r1)     // Catch: java.lang.Throwable -> L57
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L57
            r2.<init>()     // Catch: java.lang.Throwable -> L57
            java.lang.String r4 = "iqooMonsterUI:"
            r2.append(r4)     // Catch: java.lang.Throwable -> L57
            r2.append(r1)     // Catch: java.lang.Throwable -> L57
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L57
            cn.jpush.android.helper.Logger.d(r0, r2)     // Catch: java.lang.Throwable -> L57
            if (r1 == 0) goto L57
            java.lang.String r0 = r1.trim()     // Catch: java.lang.Throwable -> L57
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L57
            if (r0 != 0) goto L57
        L56:
            return r3
        L57:
            r0 = 0
            return r0
    }

    public static boolean b(android.content.Context r4, java.lang.String r5, java.lang.String r6) {
            r0 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L3e
            if (r1 == 0) goto L8
            return r0
        L8:
            java.lang.String r1 = "AndroidUtil"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r2.<init>()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r3 = "try d:"
            r2.append(r3)     // Catch: java.lang.Throwable -> L3e
            r2.append(r6)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L3e
            cn.jpush.android.helper.Logger.d(r1, r2)     // Catch: java.lang.Throwable -> L3e
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Throwable -> L3e
            java.lang.String r2 = "android.intent.action.VIEW"
            android.net.Uri r6 = android.net.Uri.parse(r6)     // Catch: java.lang.Throwable -> L3e
            r1.<init>(r2, r6)     // Catch: java.lang.Throwable -> L3e
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L3e
            if (r6 != 0) goto L32
            r1.setPackage(r5)     // Catch: java.lang.Throwable -> L3e
        L32:
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch: java.lang.Throwable -> L3e
            android.content.pm.ResolveInfo r4 = r4.resolveActivity(r1, r0)     // Catch: java.lang.Throwable -> L3e
            if (r4 == 0) goto L3e
            r4 = 1
            return r4
        L3e:
            return r0
    }

    public static java.lang.String c() {
            java.lang.String r0 = cn.jpush.android.ad.a.m
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.String r0 = cn.jpush.android.ad.a.m
            return r0
        Lb:
            java.lang.String r0 = android.os.Build.MANUFACTURER     // Catch: java.lang.Throwable -> Lf
            cn.jpush.android.ad.a.m = r0     // Catch: java.lang.Throwable -> Lf
        Lf:
            java.lang.String r0 = cn.jpush.android.ad.a.m
            return r0
    }

    public static void c(android.webkit.WebSettings r3) {
            r0 = 0
            r3.setAllowFileAccess(r0)
            r1 = 1
            r3.setUseWideViewPort(r1)
            r3.setLoadWithOverviewMode(r1)
            r3.setDomStorageEnabled(r1)
            b(r3)
            java.lang.String r2 = "UTF-8"
            r3.setDefaultTextEncodingName(r2)
            r3.setSupportZoom(r1)
            r3.setBuiltInZoomControls(r1)
            r3.setDisplayZoomControls(r0)
            r1 = 2
            r3.setCacheMode(r1)
            r3.setSaveFormData(r0)
            r3.setSavePassword(r0)
            return
    }

    private static void c(java.lang.String r1, java.lang.String r2) {
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r0 = cn.jpush.android.ad.a.f1663b     // Catch: java.lang.Throwable -> Ld
            boolean r0 = r0.containsKey(r1)     // Catch: java.lang.Throwable -> Ld
            if (r0 != 0) goto Ld
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r0 = cn.jpush.android.ad.a.f1663b     // Catch: java.lang.Throwable -> Ld
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> Ld
        Ld:
            return
    }

    public static boolean c(android.content.Context r1) {
            java.lang.Boolean r0 = cn.jpush.android.ad.a.f1665d
            if (r0 != 0) goto L16
            java.lang.String r0 = r1.getPackageName()
            java.lang.String r1 = d(r1)
            boolean r1 = r0.equals(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            cn.jpush.android.ad.a.f1665d = r1
        L16:
            java.lang.Boolean r1 = cn.jpush.android.ad.a.f1665d
            boolean r1 = r1.booleanValue()
            return r1
    }

    public static boolean c(android.content.Context r2, java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            android.content.pm.PackageInfo r2 = cn.jpush.android.helper.JCoreHelper.getPackageInfo(r2, r3, r1)
            if (r2 == 0) goto L10
            r2 = 1
            return r2
        L10:
            return r1
    }

    public static boolean c(java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L8
            r3 = 0
            return r3
        L8:
            java.lang.String r3 = r3.trim()
            java.lang.String r0 = "^[http|https]+://.*"
            boolean r0 = r3.matches(r0)
            if (r0 != 0) goto L2a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid url - "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r1 = "AndroidUtil"
            cn.jpush.android.helper.Logger.w(r1, r3)
        L2a:
            return r0
    }

    private static java.lang.String d() {
            java.lang.String r0 = cn.jpush.android.ad.a.f1670i
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.String r0 = cn.jpush.android.ad.a.f1670i
            return r0
        Lb:
            java.lang.String r0 = "ro.vivo.os.build.display.id"
            java.lang.String r0 = e(r0)
            cn.jpush.android.ad.a.f1670i = r0
            return r0
    }

    public static java.lang.String d(android.content.Context r2) {
            java.lang.String r0 = cn.jpush.android.ad.a.f1666e
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.String r2 = cn.jpush.android.ad.a.f1666e
            return r2
        Lb:
            android.content.Context r2 = cn.jpush.android.local.JPushConstants.getAppContext(r2)     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = cn.jpush.android.ad.i.a(r2)     // Catch: java.lang.Throwable -> L16
            cn.jpush.android.ad.a.f1666e = r2     // Catch: java.lang.Throwable -> L16
            goto L31
        L16:
            r2 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "#unexcepted - getCurProcessName failed:"
            r0.append(r1)
            java.lang.String r2 = r2.getMessage()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "AndroidUtil"
            cn.jpush.android.helper.Logger.ww(r0, r2)
        L31:
            java.lang.String r2 = cn.jpush.android.ad.a.f1666e
            return r2
    }

    public static java.lang.String d(java.lang.String r1) {
            if (r1 == 0) goto L14
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb
            goto L14
        Lb:
            byte[] r1 = r1.getBytes()
            java.lang.String r1 = a(r1)
            return r1
        L14:
            r1 = 0
            return r1
    }

    public static boolean d(android.content.Context r2, java.lang.String r3) {
            android.content.pm.PackageManager r0 = r2.getPackageManager()     // Catch: java.lang.Throwable -> L18
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Throwable -> L18
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L18
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Throwable -> L18
            r1.addCategory(r2)     // Catch: java.lang.Throwable -> L18
            r2 = 0
            android.content.pm.ResolveInfo r3 = r0.resolveActivity(r1, r2)     // Catch: java.lang.Throwable -> L18
            if (r3 != 0) goto L33
            return r2
        L18:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "hasActivityIntentFilter error:"
            r3.append(r0)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "AndroidUtil"
            cn.jpush.android.helper.Logger.dd(r3, r2)
        L33:
            r2 = 1
            return r2
    }

    public static java.lang.String e(android.content.Context r1, java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r1.getPackageName()
            r0.append(r1)
            java.lang.String r1 = "."
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static java.lang.String e(java.lang.String r1) {
            java.lang.String r0 = ""
            java.lang.String r1 = b(r1, r0)
            return r1
    }

    public static void e(android.content.Context r3) {
            java.lang.String r0 = "AndroidUtil"
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L32
            r2 = 28
            if (r1 < r2) goto L34
            java.lang.String r1 = d(r3)     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = r3.getPackageName()     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L34
            if (r3 == 0) goto L34
            boolean r3 = r3.equals(r1)     // Catch: java.lang.Throwable -> L32
            if (r3 != 0) goto L34
            cn.jpush.android.ad.n.a(r1)     // Catch: java.lang.Throwable -> L32
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L32
            r3.<init>()     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = "setDataDirectorySuffix ="
            r3.append(r2)     // Catch: java.lang.Throwable -> L32
            r3.append(r1)     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L32
            cn.jpush.android.helper.Logger.d(r0, r3)     // Catch: java.lang.Throwable -> L32
            return
        L32:
            r3 = move-exception
            goto L35
        L34:
            return
        L35:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "fixWebViewProcess e:"
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            cn.jpush.android.helper.Logger.e(r0, r3)
            return
    }

    public static void f(android.content.Context r1) {
            r0 = 0
            b(r1, r0)
            return
    }

    private static boolean f(java.lang.String r1) {
            java.util.List<java.lang.String> r0 = cn.jpush.android.ad.a.a     // Catch: java.lang.Throwable -> L7
            boolean r1 = r0.contains(r1)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = 0
            return r1
    }

    public static android.content.Intent g(android.content.Context r5) {
            java.lang.String r0 = "AndroidUtil"
            r1 = 0
            android.content.pm.PackageManager r2 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L2d
            android.content.Context r5 = r5.getApplicationContext()     // Catch: java.lang.Throwable -> L2d
            android.content.Context r5 = com.stub.StubApp.getOrigApplicationContext(r5)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r5 = r5.getPackageName()     // Catch: java.lang.Throwable -> L2d
            boolean r3 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L2d
            if (r3 != 0) goto L32
            android.content.Intent r5 = r2.getLaunchIntentForPackage(r5)     // Catch: java.lang.Throwable -> L2d
            if (r5 != 0) goto L27
            java.lang.String r2 = "Can't get launch intent for this package!"
            cn.jpush.android.helper.Logger.ww(r0, r2)     // Catch: java.lang.Throwable -> L25
            return r1
        L25:
            r1 = move-exception
            goto L38
        L27:
            r1 = 268435456(0x10000000, float:2.524355E-29)
            r5.addFlags(r1)     // Catch: java.lang.Throwable -> L25
            return r5
        L2d:
            r5 = move-exception
            r4 = r1
            r1 = r5
            r5 = r4
            goto L38
        L32:
            java.lang.String r5 = "The package with the given name cannot be found!"
            cn.jpush.android.helper.Logger.ww(r0, r5)     // Catch: java.lang.Throwable -> L2d
            return r1
        L38:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getLaunchIntent error:"
            r2.append(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            cn.jpush.android.helper.Logger.w(r0, r1)
            return r5
    }

    public static boolean h(android.content.Context r4) {
            java.lang.String r0 = "action:checkValidManifest"
            java.lang.String r1 = "AndroidUtil"
            cn.jpush.android.helper.Logger.dd(r1, r0)
            java.lang.Class<cn.jpush.android.ui.PushActivity> r0 = cn.jpush.android.ui.PushActivity.class
            boolean r2 = a(r4, r0)
            if (r2 != 0) goto L2c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "AndroidManifest.xml missing required activity: "
            r2.append(r3)
            java.lang.String r0 = r0.getCanonicalName()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            cn.jpush.android.helper.Logger.ww(r1, r0)
            java.lang.String r0 = "You will unable to use rich push type."
            cn.jpush.android.helper.Logger.ww(r1, r0)
        L2c:
            java.lang.Class<cn.jpush.android.ui.PopWinActivity> r0 = cn.jpush.android.ui.PopWinActivity.class
            boolean r2 = a(r4, r0)
            if (r2 != 0) goto L51
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "AndroidManifest.xml missing activity: "
            r2.append(r3)
            java.lang.String r0 = r0.getCanonicalName()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            cn.jpush.android.helper.Logger.ww(r1, r0)
            java.lang.String r0 = "You will unable to use pop-window rich push type."
            cn.jpush.android.helper.Logger.ww(r1, r0)
        L51:
            java.lang.String r0 = "cn.jpush.android.ui.PushActivity"
            boolean r0 = d(r4, r0)
            if (r0 != 0) goto L5e
            java.lang.String r0 = "AndroidManifest.xml missing required intent filter for PushActivity: cn.jpush.android.ui.PushActivity"
            cn.jpush.android.helper.Logger.w(r1, r0)
        L5e:
            boolean r0 = i(r4)
            r2 = 0
            if (r0 != 0) goto L66
            return r2
        L66:
            java.lang.String r4 = cn.jpush.android.local.JPushConstants.getMessageReceiverClass(r4)
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L76
            java.lang.String r4 = "AndroidManifest.xml missing required receiver: please custom receiver extends JPushMessageReceiver. Otherwise no service"
            cn.jpush.android.helper.Logger.ke(r1, r4)
            return r2
        L76:
            r4 = 1
            return r4
    }

    public static boolean i(android.content.Context r8) {
            java.lang.String r0 = "AndroidUtil"
            r1 = 0
            if (r8 == 0) goto Lc7
            java.lang.Class<cn.jpush.android.service.JNotifyActivity> r2 = cn.jpush.android.service.JNotifyActivity.class
            java.lang.String r3 = r8.getPackageName()     // Catch: java.lang.Throwable -> L38
            android.content.pm.PackageManager r4 = r8.getPackageManager()     // Catch: java.lang.Throwable -> L38
            android.content.Intent r5 = new android.content.Intent     // Catch: java.lang.Throwable -> L38
            r5.<init>(r8, r2)     // Catch: java.lang.Throwable -> L38
            android.content.pm.ResolveInfo r5 = r4.resolveActivity(r5, r1)     // Catch: java.lang.Throwable -> L38
            if (r5 != 0) goto L3a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L38
            r8.<init>()     // Catch: java.lang.Throwable -> L38
            java.lang.String r3 = "AndroidManifest.xml missing required activity: "
            r8.append(r3)     // Catch: java.lang.Throwable -> L38
            java.lang.String r2 = r2.getCanonicalName()     // Catch: java.lang.Throwable -> L38
            r8.append(r2)     // Catch: java.lang.Throwable -> L38
            java.lang.String r2 = ", Otherwise no service"
            r8.append(r2)     // Catch: java.lang.Throwable -> L38
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L38
            cn.jpush.android.helper.Logger.ke(r0, r8)     // Catch: java.lang.Throwable -> L38
            return r1
        L38:
            r8 = move-exception
            goto Laf
        L3a:
            int r2 = cn.jpush.android.helper.JCoreHelper.getJCoreSDKVersionInt()     // Catch: java.lang.Throwable -> L38
            r6 = 336(0x150, float:4.71E-43)
            if (r2 >= r6) goto L64
            int r2 = cn.jpush.android.local.JPushConstants.SDK_VERSION_CODE     // Catch: java.lang.Throwable -> L38
            r6 = 483(0x1e3, float:6.77E-43)
            if (r2 < r6) goto L64
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L38
            r2.<init>()     // Catch: java.lang.Throwable -> L38
            java.lang.String r6 = "JPush current version is "
            r2.append(r6)     // Catch: java.lang.Throwable -> L38
            int r6 = cn.jpush.android.local.JPushConstants.SDK_VERSION_CODE     // Catch: java.lang.Throwable -> L38
            r2.append(r6)     // Catch: java.lang.Throwable -> L38
            java.lang.String r6 = "，must use JCore 336 or higher."
            r2.append(r6)     // Catch: java.lang.Throwable -> L38
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L38
            cn.jpush.android.helper.Logger.ke(r0, r2)     // Catch: java.lang.Throwable -> L38
        L64:
            android.content.pm.ActivityInfo r2 = r5.activityInfo     // Catch: java.lang.Throwable -> L38
            int r2 = r2.theme     // Catch: java.lang.Throwable -> L38
            android.content.res.Resources r5 = r8.getResources()     // Catch: java.lang.Throwable -> L38
            java.lang.String r6 = "JPushTheme"
            java.lang.String r7 = "style"
            int r3 = r5.getIdentifier(r6, r7, r3)     // Catch: java.lang.Throwable -> L38
            if (r3 == r2) goto L7c
            java.lang.String r8 = "JNotifyActivity theme must use android:theme=\\\"@style/JPushTheme\\\">\\n\" ,and the JPushTheme name not confused keep it. Otherwise no service"
            cn.jpush.android.helper.Logger.ke(r0, r8)     // Catch: java.lang.Throwable -> L38
            return r1
        L7c:
            android.content.Intent r2 = new android.content.Intent     // Catch: java.lang.Throwable -> L38
            r2.<init>()     // Catch: java.lang.Throwable -> L38
            java.lang.String r3 = "cn.jpush.android.intent.JNotifyActivity"
            r2.setAction(r3)     // Catch: java.lang.Throwable -> L38
            java.lang.String r3 = "android.intent.category.DEFAULT"
            r2.addCategory(r3)     // Catch: java.lang.Throwable -> L38
            java.lang.String r8 = r8.getPackageName()     // Catch: java.lang.Throwable -> L38
            r2.addCategory(r8)     // Catch: java.lang.Throwable -> L38
            android.content.pm.ResolveInfo r8 = r4.resolveActivity(r2, r1)     // Catch: java.lang.Throwable -> L38
            if (r8 != 0) goto Lad
            java.lang.String r8 = "AndroidManifest.xml activity JNotifyActivity Action Must be <action android:name=\"cn.jpush.android.intent.JNotifyActivity\" />"
            cn.jpush.android.helper.Logger.ke(r0, r8)     // Catch: java.lang.Throwable -> L38
            java.lang.String r8 = "AndroidManifest.xml activity JNotifyActivity Action Must be <category android:name=\"android.intent.category.DEFAULT\" />"
            cn.jpush.android.helper.Logger.ke(r0, r8)     // Catch: java.lang.Throwable -> L38
            java.lang.String r8 = "AndroidManifest.xml activity JNotifyActivity Action Must be <category android:name=\"${applicationId}\" />\n"
            cn.jpush.android.helper.Logger.ke(r0, r8)     // Catch: java.lang.Throwable -> L38
            java.lang.String r8 = "AndroidManifest.xml activity JNotifyActivity not set <data>. Otherwise no service"
            cn.jpush.android.helper.Logger.ke(r0, r8)     // Catch: java.lang.Throwable -> L38
            return r1
        Lad:
            r8 = 1
            return r8
        Laf:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "checkJNotifyActivity error:"
            r2.append(r3)
            java.lang.String r8 = r8.getMessage()
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            cn.jpush.android.helper.Logger.kd(r0, r8)
        Lc7:
            return r1
    }

    public static boolean j(android.content.Context r0) {
            int r0 = cn.jpush.android.local.JPushConstants.isForeGround
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public static android.app.Activity k(android.content.Context r7) {
            java.lang.String r0 = "AndroidUtil"
            r1 = 0
            if (r7 == 0) goto Ld0
            java.lang.String r2 = "android.app.ActivityThread"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r3 = "currentActivityThread"
            java.lang.reflect.Method r3 = r2.getMethod(r3, r1)     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r3 = r3.invoke(r1, r1)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r4 = "mActivities"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r4)     // Catch: java.lang.Throwable -> L2d
            r4 = 1
            r2.setAccessible(r4)     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L2d
            java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Throwable -> L2d
            if (r2 != 0) goto L30
            java.lang.String r7 = "get current activities for currentActivityThread, activities is null"
            cn.jpush.android.helper.Logger.w(r0, r7)     // Catch: java.lang.Throwable -> L2d
            return r1
        L2d:
            r7 = move-exception
            goto Lb8
        L30:
            java.util.Collection r2 = r2.values()     // Catch: java.lang.Throwable -> L2d
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L2d
        L38:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L2d
            if (r3 == 0) goto Ld0
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L2d
            java.lang.Class r5 = r3.getClass()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r6 = "paused"
            java.lang.reflect.Field r6 = r5.getDeclaredField(r6)     // Catch: java.lang.Throwable -> L2d
            r6.setAccessible(r4)     // Catch: java.lang.Throwable -> L2d
            boolean r6 = r6.getBoolean(r3)     // Catch: java.lang.Throwable -> L2d
            if (r6 != 0) goto L38
            java.lang.String r2 = "activity"
            java.lang.reflect.Field r2 = r5.getDeclaredField(r2)     // Catch: java.lang.Throwable -> L2d
            r2.setAccessible(r4)     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L2d
            android.app.Activity r2 = (android.app.Activity) r2     // Catch: java.lang.Throwable -> L2d
            if (r2 != 0) goto L6c
            java.lang.String r7 = "[getCurrentActivity] activity is null"
            cn.jpush.android.helper.Logger.w(r0, r7)     // Catch: java.lang.Throwable -> L2d
            return r1
        L6c:
            java.lang.String r3 = r2.getPackageName()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r4 = r7.getPackageName()     // Catch: java.lang.Throwable -> L2d
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L2d
            if (r3 != 0) goto L9f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2d
            r3.<init>()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r4 = "current activity packageName: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Throwable -> L2d
            r3.append(r2)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r2 = ", appPackageName: "
            r3.append(r2)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r7 = r7.getPackageName()     // Catch: java.lang.Throwable -> L2d
            r3.append(r7)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r7 = r3.toString()     // Catch: java.lang.Throwable -> L2d
            cn.jpush.android.helper.Logger.w(r0, r7)     // Catch: java.lang.Throwable -> L2d
            return r1
        L9f:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2d
            r7.<init>()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r3 = "getCurrentActivity: "
            r7.append(r3)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r3 = r2.getLocalClassName()     // Catch: java.lang.Throwable -> L2d
            r7.append(r3)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L2d
            cn.jpush.android.helper.Logger.d(r0, r7)     // Catch: java.lang.Throwable -> L2d
            return r2
        Lb8:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "[getCurrentActivity] error: "
            r2.append(r3)
            java.lang.String r7 = r7.getMessage()
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            cn.jpush.android.helper.Logger.w(r0, r7)
        Ld0:
            return r1
    }

    public static void l(android.content.Context r9) {
            boolean r0 = r9 instanceof android.app.Activity
            java.lang.String r1 = "AndroidUtil"
            if (r0 != 0) goto Lc
            java.lang.String r9 = "[requestRequiredPermission] context must instanceof Activity"
        L8:
            cn.jpush.android.helper.Logger.ww(r1, r9)
            return
        Lc:
            java.util.LinkedList r0 = new java.util.LinkedList     // Catch: java.lang.Exception -> L47
            r0.<init>()     // Catch: java.lang.Exception -> L47
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L47
            r3 = 33
            if (r2 < r3) goto L49
            java.lang.String r2 = cn.jpush.android.ad.a.l     // Catch: java.lang.Exception -> L47
            r0.add(r2)     // Catch: java.lang.Exception -> L47
            java.lang.String r2 = "notification"
            java.lang.Object r2 = r9.getSystemService(r2)     // Catch: java.lang.Exception -> L47
            android.app.NotificationManager r2 = (android.app.NotificationManager) r2     // Catch: java.lang.Exception -> L47
            boolean r2 = cn.jiguang.commons.L.f1.a(r2)     // Catch: java.lang.Exception -> L47
            if (r2 != 0) goto L62
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L47
            r2.<init>()     // Catch: java.lang.Exception -> L47
            java.lang.String r3 = "request "
            r2.append(r3)     // Catch: java.lang.Exception -> L47
            java.lang.String r3 = cn.jpush.android.ad.a.l     // Catch: java.lang.Exception -> L47
            r2.append(r3)     // Catch: java.lang.Exception -> L47
            java.lang.String r3 = "，need go to settings and turn on app notification switch"
            r2.append(r3)     // Catch: java.lang.Exception -> L47
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L47
            cn.jpush.android.helper.Logger.ww(r1, r2)     // Catch: java.lang.Exception -> L47
            goto L62
        L47:
            r9 = move-exception
            goto Lb4
        L49:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L47
            r3.<init>()     // Catch: java.lang.Exception -> L47
            java.lang.String r4 = " Build.VERSION.SDK_INT:"
            r3.append(r4)     // Catch: java.lang.Exception -> L47
            r3.append(r2)     // Catch: java.lang.Exception -> L47
            java.lang.String r2 = " < 33, not need to request POST_NOTIFICATIONS"
            r3.append(r2)     // Catch: java.lang.Exception -> L47
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Exception -> L47
            cn.jpush.android.helper.Logger.d(r1, r2)     // Catch: java.lang.Exception -> L47
        L62:
            java.util.List r0 = a(r9, r0)     // Catch: java.lang.Exception -> L47
            if (r0 == 0) goto Lb3
            boolean r2 = r0.isEmpty()     // Catch: java.lang.Exception -> L47
            if (r2 == 0) goto L6f
            goto Lb3
        L6f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L47
            r2.<init>()     // Catch: java.lang.Exception -> L47
            java.lang.String r3 = "lackPermissions:"
            r2.append(r3)     // Catch: java.lang.Exception -> L47
            r2.append(r0)     // Catch: java.lang.Exception -> L47
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L47
            cn.jpush.android.helper.Logger.v(r1, r2)     // Catch: java.lang.Exception -> L47
            java.lang.String r2 = "android.app.Activity"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Exception -> L47
            java.lang.String r3 = "requestPermissions"
            r4 = 2
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L47
            java.lang.Class<java.lang.String[]> r6 = java.lang.String[].class
            r7 = 0
            r5[r7] = r6     // Catch: java.lang.Exception -> L47
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L47
            r8 = 1
            r5[r8] = r6     // Catch: java.lang.Exception -> L47
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r5)     // Catch: java.lang.Exception -> L47
            int r3 = r0.size()     // Catch: java.lang.Exception -> L47
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Exception -> L47
            java.lang.Object[] r0 = r0.toArray(r3)     // Catch: java.lang.Exception -> L47
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Exception -> L47
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L47
            r4[r7] = r0     // Catch: java.lang.Exception -> L47
            r4[r8] = r3     // Catch: java.lang.Exception -> L47
            r2.invoke(r9, r4)     // Catch: java.lang.Exception -> L47
        Lb3:
            return
        Lb4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "#unexcepted - requestRequiredPermission e:"
            r0.append(r2)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            goto L8
    }
}
