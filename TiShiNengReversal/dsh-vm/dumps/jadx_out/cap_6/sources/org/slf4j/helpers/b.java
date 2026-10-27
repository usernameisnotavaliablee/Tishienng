package org.slf4j.helpers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class b implements org.slf4j.b {
    private final java.util.concurrent.ConcurrentMap<java.lang.String, org.slf4j.Marker> a;

    public b() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.a = r0
            return
    }

    @Override // org.slf4j.b
    public org.slf4j.Marker a(java.lang.String r3) {
            r2 = this;
            if (r3 == 0) goto L1d
            java.util.concurrent.ConcurrentMap<java.lang.String, org.slf4j.Marker> r0 = r2.a
            java.lang.Object r0 = r0.get(r3)
            org.slf4j.Marker r0 = (org.slf4j.Marker) r0
            if (r0 != 0) goto L1c
            org.slf4j.helpers.BasicMarker r0 = new org.slf4j.helpers.BasicMarker
            r0.<init>(r3)
            java.util.concurrent.ConcurrentMap<java.lang.String, org.slf4j.Marker> r1 = r2.a
            java.lang.Object r3 = r1.putIfAbsent(r3, r0)
            org.slf4j.Marker r3 = (org.slf4j.Marker) r3
            if (r3 == 0) goto L1c
            return r3
        L1c:
            return r0
        L1d:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Marker name cannot be null"
            r3.<init>(r0)
            throw r3
    }

    @Override // org.slf4j.b
    public boolean b(java.lang.String r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.util.concurrent.ConcurrentMap<java.lang.String, org.slf4j.Marker> r1 = r2.a
            java.lang.Object r3 = r1.remove(r3)
            if (r3 == 0) goto Le
            r3 = 1
            return r3
        Le:
            return r0
    }

    @Override // org.slf4j.b
    public org.slf4j.Marker c(java.lang.String r2) {
            r1 = this;
            org.slf4j.helpers.BasicMarker r0 = new org.slf4j.helpers.BasicMarker
            r0.<init>(r2)
            return r0
    }

    @Override // org.slf4j.b
    public boolean d(java.lang.String r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.util.concurrent.ConcurrentMap<java.lang.String, org.slf4j.Marker> r0 = r1.a
            boolean r2 = r0.containsKey(r2)
            return r2
    }
}
