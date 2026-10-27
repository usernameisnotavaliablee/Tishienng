package q1;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class d {
    private static final java.util.Map<java.lang.String, q1.d.a> a = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a {
        private final long a;
        private final long b;

        public a(long r1, long r3) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r3
                return
        }

        public boolean a() {
                r5 = this;
                long r0 = android.os.SystemClock.elapsedRealtime()
                long r2 = r5.b
                long r0 = r0 - r2
                long r2 = r5.a
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 > 0) goto Lf
                r0 = 1
                return r0
            Lf:
                r0 = 0
                return r0
        }
    }

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r1 = 16
            r0.<init>(r1)
            q1.d.a = r0
            return
    }

    public d() {
            r1 = this;
            r1.<init>()
            return
    }

    public static q1.d.a a(java.lang.String r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "map size of get is before: "
            r0.append(r1)
            java.util.Map<java.lang.String, q1.d$a> r1 = q1.d.a
            int r2 = r1.size()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "RequestUtil"
            com.huawei.hms.framework.common.Logger.v(r2, r0)
            java.lang.Object r4 = r1.get(r4)
            q1.d$a r4 = (q1.d.a) r4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "map size of get is after: "
            r0.append(r3)
            int r1 = r1.size()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.huawei.hms.framework.common.Logger.v(r2, r0)
            return r4
    }

    public static void b(java.lang.String r3, q1.d.a r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "map size of put is before: "
            r0.append(r1)
            java.util.Map<java.lang.String, q1.d$a> r1 = q1.d.a
            int r2 = r1.size()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "RequestUtil"
            com.huawei.hms.framework.common.Logger.v(r2, r0)
            r1.put(r3, r4)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "map size of put is after: "
            r3.append(r4)
            int r4 = r1.size()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.huawei.hms.framework.common.Logger.v(r2, r3)
            return
    }
}
