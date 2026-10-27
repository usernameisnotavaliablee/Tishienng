package cn.jpush.android.f;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class a {
    private static java.util.Map<cn.jpush.android.f.b, cn.jpush.android.e.a> a;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            cn.jpush.android.f.a.a = r0
            return
    }

    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static cn.jpush.android.e.a a(cn.jpush.android.f.b r1) {
            java.util.Map<cn.jpush.android.f.b, cn.jpush.android.e.a> r0 = cn.jpush.android.f.a.a
            java.lang.Object r1 = r0.get(r1)
            cn.jpush.android.e.a r1 = (cn.jpush.android.e.a) r1
            return r1
    }

    public static void a(cn.jpush.android.f.b r1, cn.jpush.android.e.a r2) {
            if (r2 == 0) goto L7
            java.util.Map<cn.jpush.android.f.b, cn.jpush.android.e.a> r0 = cn.jpush.android.f.a.a
            r0.put(r1, r2)
        L7:
            return
    }

    public static void b(cn.jpush.android.f.b r1) {
            java.util.Map<cn.jpush.android.f.b, cn.jpush.android.e.a> r0 = cn.jpush.android.f.a.a
            r0.remove(r1)
            return
    }
}
