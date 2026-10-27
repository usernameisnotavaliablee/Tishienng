package cn.jiguang.av;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class o {
    private static java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, android.content.pm.PackageInfo>> a;

    /* renamed from: b, reason: collision with root package name */
    private static java.lang.String f712b;

    /* renamed from: c, reason: collision with root package name */
    private static int f713c;

    /* renamed from: d, reason: collision with root package name */
    private static final java.util.HashMap<java.lang.Integer, android.content.pm.PackageInfo> f714d = null;

    /* renamed from: e, reason: collision with root package name */
    private static int f715e;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            cn.jiguang.av.o.a = r0
            java.lang.String r1 = "com.huawei.hwid"
            r2 = 0
            r0.put(r1, r2)
            java.lang.String r0 = ""
            cn.jiguang.av.o.f712b = r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            cn.jiguang.av.o.f713c = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            cn.jiguang.av.o.f714d = r0
            r0 = 0
            cn.jiguang.av.o.f715e = r0
            return
    }

    public o() {
            r1 = this;
            r1.<init>()
            return
    }

    public static android.content.pm.PackageInfo a(android.content.Context r1, int r2) {
            java.lang.String r0 = a(r1)
            android.content.pm.PackageInfo r1 = a(r1, r0, r2)
            return r1
    }

    public static android.content.pm.PackageInfo a(android.content.Context r0, java.lang.String r1, int r2) {
            android.content.pm.PackageInfo r0 = cn.jiguang.f.b.a(r1, r2)
            return r0
    }

    public static java.lang.String a(android.content.Context r1) {
            java.lang.String r0 = cn.jiguang.av.o.f712b
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.String r1 = cn.jiguang.av.o.f712b
            return r1
        Lb:
            java.lang.String r1 = r1.getPackageName()
            cn.jiguang.av.o.f712b = r1
            return r1
    }
}
