package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class f2 {
    private java.util.Map<java.lang.Integer, com.autonavi.base.ae.gmap.style.StyleItem> a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.Object f3273b;

    /* renamed from: c, reason: collision with root package name */
    private com.autonavi.base.ae.gmap.style.StyleItem[] f3274c;

    public f2() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.a = r0
            r0 = 0
            r1.f3273b = r0
            return
    }

    public final java.util.Map<java.lang.Integer, com.autonavi.base.ae.gmap.style.StyleItem> a() {
            r1 = this;
            java.util.Map<java.lang.Integer, com.autonavi.base.ae.gmap.style.StyleItem> r0 = r1.a
            return r0
    }

    public final com.autonavi.base.ae.gmap.style.StyleItem[] b() {
            r5 = this;
            java.util.Map<java.lang.Integer, com.autonavi.base.ae.gmap.style.StyleItem> r0 = r5.a
            r1 = 0
            if (r0 == 0) goto L42
            int r0 = r0.size()
            if (r0 != 0) goto Lc
            goto L42
        Lc:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Map<java.lang.Integer, com.autonavi.base.ae.gmap.style.StyleItem> r2 = r5.a
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L1b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L31
            java.lang.Object r3 = r2.next()
            com.autonavi.base.ae.gmap.style.StyleItem r3 = (com.autonavi.base.ae.gmap.style.StyleItem) r3
            boolean r4 = r3.isValid()
            if (r4 == 0) goto L1b
            r0.add(r3)
            goto L1b
        L31:
            int r2 = r0.size()
            if (r2 <= 0) goto L42
            com.autonavi.base.ae.gmap.style.StyleItem[] r1 = new com.autonavi.base.ae.gmap.style.StyleItem[r2]
            java.lang.Object[] r0 = r0.toArray(r1)
            com.autonavi.base.ae.gmap.style.StyleItem[] r0 = (com.autonavi.base.ae.gmap.style.StyleItem[]) r0
            r5.f3274c = r0
            return r0
        L42:
            return r1
    }

    public final com.autonavi.base.ae.gmap.style.StyleItem[] c() {
            r1 = this;
            com.autonavi.base.ae.gmap.style.StyleItem[] r0 = r1.f3274c
            return r0
    }

    public final java.lang.Object d() {
            r1 = this;
            java.lang.Object r0 = r1.f3273b
            return r0
    }
}
