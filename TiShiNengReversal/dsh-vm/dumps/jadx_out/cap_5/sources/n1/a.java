package n1;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class a {
    private static final java.lang.String e = "a";
    private static final java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>> f = null;
    private final java.util.Map<java.lang.String, java.lang.Long> a;
    private final n1.c b;
    private final n1.c c;
    private final com.huawei.hms.framework.network.grs.g.g d;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r1 = 16
            r0.<init>(r1)
            n1.a.f = r0
            return
    }

    public a(n1.c r3, n1.c r4, com.huawei.hms.framework.network.grs.g.g r5) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r1 = 16
            r0.<init>(r1)
            r2.a = r0
            r2.c = r4
            r2.b = r3
            r2.d = r5
            r5.g(r2)
            return
    }

    private void e(com.huawei.hms.framework.network.grs.GrsBaseInfo r7, java.lang.String r8, android.content.Context r9) {
            r6 = this;
            java.util.Map<java.lang.String, java.lang.Long> r0 = r6.a
            java.lang.Object r8 = r0.get(r8)
            java.lang.Long r8 = (java.lang.Long) r8
            r0 = 300000(0x493e0, double:1.482197E-318)
            boolean r8 = q1.e.b(r8, r0)
            if (r8 == 0) goto L20
            p1.c r1 = new p1.c
            r1.<init>(r7, r9)
            com.huawei.hms.framework.network.grs.g.g r0 = r6.d
            n1.c r4 = r6.c
            r3 = 0
            r5 = -1
            r2 = 0
            r0.h(r1, r2, r3, r4, r5)
        L20:
            return
    }

    private void f(com.huawei.hms.framework.network.grs.GrsBaseInfo r9, n1.b r10, android.content.Context r11, java.lang.String r12) {
            r8 = this;
            r0 = 1
            java.lang.String r1 = r9.getGrsParasKey(r0, r0, r11)
            java.util.Map<java.lang.String, java.lang.Long> r2 = r8.a
            java.lang.Object r1 = r2.get(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            boolean r2 = q1.e.a(r1)
            if (r2 == 0) goto L18
            r9 = 2
            r10.a(r9)
            return
        L18:
            r2 = 300000(0x493e0, double:1.482197E-318)
            boolean r1 = q1.e.b(r1, r2)
            if (r1 == 0) goto L30
            p1.c r3 = new p1.c
            r3.<init>(r9, r11)
            com.huawei.hms.framework.network.grs.g.g r2 = r8.d
            n1.c r6 = r8.c
            r4 = 0
            r7 = -1
            r5 = r12
            r2.h(r3, r4, r5, r6, r7)
        L30:
            r10.a(r0)
            return
    }

    public java.util.Map<java.lang.String, java.lang.String> a(com.huawei.hms.framework.network.grs.GrsBaseInfo r4, java.lang.String r5, n1.b r6, android.content.Context r7) {
            r3 = this;
            r0 = 1
            java.lang.String r0 = r4.getGrsParasKey(r0, r0, r7)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>> r1 = n1.a.f
            java.lang.Object r0 = r1.get(r0)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L20
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L16
            goto L20
        L16:
            r3.f(r4, r6, r7, r5)
            java.lang.Object r4 = r0.get(r5)
            java.util.Map r4 = (java.util.Map) r4
            return r4
        L20:
            java.lang.String r4 = n1.a.e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Cache size is: "
            r5.append(r6)
            int r6 = r1.size()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.huawei.hms.framework.common.Logger.d(r4, r5)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            return r4
    }

    public n1.c b() {
            r1 = this;
            n1.c r0 = r1.b
            return r0
    }

    public void c(com.huawei.hms.framework.network.grs.GrsBaseInfo r4, android.content.Context r5) {
            r3 = this;
            r0 = 1
            java.lang.String r4 = r4.getGrsParasKey(r0, r0, r5)
            n1.c r5 = r3.b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r1 = "time"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "0"
            r5.f(r0, r2)
            java.util.Map<java.lang.String, java.lang.Long> r5 = r3.a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.remove(r0)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>> r5 = n1.a.f
            r5.remove(r4)
            java.lang.String r0 = n1.a.e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cache size is: "
            r1.append(r2)
            int r5 = r5.size()
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            com.huawei.hms.framework.common.Logger.d(r0, r5)
            com.huawei.hms.framework.network.grs.g.g r5 = r3.d
            r5.f(r4)
            return
    }

    public void d(com.huawei.hms.framework.network.grs.GrsBaseInfo r3, com.huawei.hms.framework.network.grs.g.d r4, android.content.Context r5, p1.c r6) {
            r2 = this;
            int r0 = r4.t()
            r1 = 2
            if (r0 != r1) goto Lf
            java.lang.String r3 = n1.a.e
            java.lang.String r4 = "update cache from server failed"
            com.huawei.hms.framework.common.Logger.w(r3, r4)
            return
        Lf:
            java.util.Set r6 = r6.e()
            int r6 = r6.size()
            if (r6 != 0) goto L9c
            r6 = 1
            java.lang.String r3 = r3.getGrsParasKey(r6, r6, r5)
            boolean r5 = r4.B()
            if (r5 == 0) goto L36
            n1.c r5 = r2.b
            java.lang.String r6 = ""
            java.lang.String r5 = r5.a(r3, r6)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>> r6 = n1.a.f
            java.util.Map r5 = com.huawei.hms.framework.network.grs.a.e(r5)
            r6.put(r3, r5)
            goto L4c
        L36:
            n1.c r5 = r2.b
            java.lang.String r6 = r4.y()
            r5.f(r3, r6)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>> r5 = n1.a.f
            java.lang.String r6 = r4.y()
            java.util.Map r6 = com.huawei.hms.framework.network.grs.a.e(r6)
            r5.put(r3, r6)
        L4c:
            java.lang.String r5 = r4.r()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L70
            n1.c r5 = r2.b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            java.lang.String r0 = "ETag"
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.String r0 = r4.r()
            r5.f(r6, r0)
        L70:
            n1.c r5 = r2.b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            java.lang.String r0 = "time"
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.String r0 = r4.a()
            r5.f(r6, r0)
            java.util.Map<java.lang.String, java.lang.Long> r5 = r2.a
            java.lang.String r4 = r4.a()
            long r0 = java.lang.Long.parseLong(r4)
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            r5.put(r3, r4)
            goto Lb2
        L9c:
            n1.c r3 = r2.b
            java.lang.String r5 = r4.y()
            java.lang.String r6 = "geoipCountryCode"
            r3.f(r6, r5)
            n1.c r3 = r2.b
            java.lang.String r4 = r4.a()
            java.lang.String r5 = "geoipCountryCodetime"
            r3.f(r5, r4)
        Lb2:
            java.lang.String r3 = n1.a.e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Cache size is: "
            r4.append(r5)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>> r5 = n1.a.f
            int r5 = r5.size()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.huawei.hms.framework.common.Logger.d(r3, r4)
            return
    }

    public com.huawei.hms.framework.network.grs.g.g g() {
            r1 = this;
            com.huawei.hms.framework.network.grs.g.g r0 = r1.d
            return r0
    }

    public void h(com.huawei.hms.framework.network.grs.GrsBaseInfo r8, android.content.Context r9) {
            r7 = this;
            r0 = 1
            java.lang.String r0 = r8.getGrsParasKey(r0, r0, r9)
            n1.c r1 = r7.b
            java.lang.String r2 = ""
            java.lang.String r1 = r1.a(r0, r2)
            n1.c r2 = r7.b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r4 = "time"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "0"
            java.lang.String r2 = r2.a(r3, r4)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            r4 = 0
            if (r3 != 0) goto L43
            java.lang.String r3 = "\\d+"
            boolean r3 = r2.matches(r3)
            if (r3 == 0) goto L43
            long r4 = java.lang.Long.parseLong(r2)     // Catch: java.lang.NumberFormatException -> L3b
            goto L43
        L3b:
            r2 = move-exception
            java.lang.String r3 = n1.a.e
            java.lang.String r6 = "convert urlParamKey from String to Long catch NumberFormatException."
            com.huawei.hms.framework.common.Logger.w(r3, r6, r2)
        L43:
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>> r2 = n1.a.f
            java.util.Map r1 = com.huawei.hms.framework.network.grs.a.e(r1)
            r2.put(r0, r1)
            java.lang.String r1 = n1.a.e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "Cache size is: "
            r3.append(r6)
            int r2 = r2.size()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.huawei.hms.framework.common.Logger.d(r1, r2)
            java.util.Map<java.lang.String, java.lang.Long> r1 = r7.a
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r1.put(r0, r2)
            r7.e(r8, r0, r9)
            return
    }

    public n1.c i() {
            r1 = this;
            n1.c r0 = r1.c
            return r0
    }
}
