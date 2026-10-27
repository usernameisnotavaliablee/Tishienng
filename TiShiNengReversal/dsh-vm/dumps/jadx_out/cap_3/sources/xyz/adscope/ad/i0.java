package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class i0 {
    private static final java.lang.String a = null;

    static {
            java.lang.String r0 = xyz.adscope.ad.f0.a()
            xyz.adscope.ad.i0.a = r0
            return
    }

    public i0() {
            r1 = this;
            r1.<init>()
            return
    }

    public static long a(android.content.Context r0, java.lang.String r1, java.lang.String r2, long r3) {
            long r0 = xyz.adscope.common.v2.persistent.sp.CommonSpHelper.getLong(r0, r1, r2, r3)
            return r0
    }

    public static java.lang.String a() {
            java.lang.String r0 = xyz.adscope.ad.i0.a
            java.lang.String r0 = xyz.adscope.common.v2.persistent.sp.CommonSpHelper.getBasicSPFile(r0)
            return r0
    }

    public static java.lang.String a(android.content.Context r0, java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            java.lang.String r0 = xyz.adscope.common.v2.persistent.sp.CommonSpHelper.getString(r0, r1, r2, r3)
            return r0
    }

    public static java.util.Map<java.lang.String, ?> a(android.content.Context r0, java.lang.String r1) {
            java.util.Map r0 = xyz.adscope.common.v2.persistent.sp.CommonSpHelper.getAll(r0, r1)
            return r0
    }

    public static void a(android.content.Context r0, java.lang.String r1, java.lang.String r2, boolean r3) {
            xyz.adscope.common.v2.persistent.sp.CommonSpHelper.putBoolean(r0, r1, r2, r3)
            return
    }

    public static boolean a(android.content.Context r0, java.lang.String r1, java.lang.String r2) {
            boolean r0 = xyz.adscope.common.v2.persistent.sp.CommonSpHelper.containKey(r0, r1, r2)
            return r0
    }

    public static boolean a(android.content.Context r0, java.lang.String r1, java.lang.String r2, java.util.Set<java.lang.String> r3) {
            boolean r0 = xyz.adscope.common.v2.persistent.sp.CommonSpHelper.putStringSet(r0, r1, r2, r3)
            return r0
    }

    public static java.lang.String b() {
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = xyz.adscope.ad.i0.a
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "asnp_cfg_%s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            return r0
    }

    public static void b(android.content.Context r0, java.lang.String r1, java.lang.String r2, long r3) {
            xyz.adscope.common.v2.persistent.sp.CommonSpHelper.putLong(r0, r1, r2, r3)
            return
    }

    public static void b(android.content.Context r0, java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            xyz.adscope.common.v2.persistent.sp.CommonSpHelper.putString(r0, r1, r2, r3)
            return
    }

    public static boolean b(android.content.Context r0, java.lang.String r1, java.lang.String r2) {
            boolean r0 = xyz.adscope.common.v2.persistent.sp.CommonSpHelper.getBoolean(r0, r1, r2)
            return r0
    }

    public static java.util.Set<java.lang.String> c(android.content.Context r0, java.lang.String r1, java.lang.String r2) {
            java.util.Set r0 = xyz.adscope.common.v2.persistent.sp.CommonSpHelper.getStringSet(r0, r1, r2)
            return r0
    }
}
