package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class w implements xyz.adscope.ad.r3 {
    private final android.content.Context a;
    private final java.util.Map<java.lang.String, xyz.adscope.ad.q3> b;

    w(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            java.util.Map r1 = r0.a()
            r0.b = r1
            return
    }

    private java.util.Map<java.lang.String, xyz.adscope.ad.q3> a() {
            r3 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            xyz.adscope.ad.e1 r1 = new xyz.adscope.ad.e1
            android.content.Context r2 = r3.a
            r1.<init>(r2)
            java.lang.String r2 = "AttentionListUpdater"
            r0.put(r2, r1)
            xyz.adscope.ad.p4 r1 = new xyz.adscope.ad.p4
            android.content.Context r2 = r3.a
            r1.<init>(r2)
            java.lang.String r2 = "InvokeRequestByUpdate"
            r0.put(r2, r1)
            xyz.adscope.ad.q4 r1 = new xyz.adscope.ad.q4
            android.content.Context r2 = r3.a
            r1.<init>(r2)
            java.lang.String r2 = "LocalTemplateUpdater"
            r0.put(r2, r1)
            return r0
    }

    @Override // xyz.adscope.ad.r3
    public void a(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "plugins_all"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L2c
            java.util.Map<java.lang.String, xyz.adscope.ad.q3> r2 = r1.b
            if (r2 == 0) goto L46
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L46
            java.util.Map<java.lang.String, xyz.adscope.ad.q3> r2 = r1.b
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L1c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L46
            java.lang.Object r0 = r2.next()
            xyz.adscope.ad.q3 r0 = (xyz.adscope.ad.q3) r0
            r0.a()
            goto L1c
        L2c:
            java.util.Map<java.lang.String, xyz.adscope.ad.q3> r0 = r1.b
            if (r0 == 0) goto L46
            java.lang.Object r0 = r0.get(r2)
            if (r0 == 0) goto L46
            java.util.Map<java.lang.String, xyz.adscope.ad.q3> r0 = r1.b
            java.lang.Object r2 = r0.get(r2)
            xyz.adscope.ad.q3 r2 = (xyz.adscope.ad.q3) r2
            java.util.Objects.requireNonNull(r2)
            xyz.adscope.ad.q3 r2 = (xyz.adscope.ad.q3) r2
            r2.a()
        L46:
            return
    }
}
