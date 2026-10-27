package com.huawei.hms.framework.common.hianalytics;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class LinkedHashMapPack {
    private java.util.LinkedHashMap<java.lang.String, java.lang.String> a;

    public LinkedHashMapPack() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.a = r0
            return
    }

    public java.util.LinkedHashMap<java.lang.String, java.lang.String> getAll() {
            r1 = this;
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r0 = r1.a
            return r0
    }

    public com.huawei.hms.framework.common.hianalytics.LinkedHashMapPack put(java.lang.String r4, long r5) {
            r3 = this;
            if (r4 == 0) goto L18
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r0 = r3.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = ""
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.put(r4, r5)
        L18:
            return r3
    }

    public com.huawei.hms.framework.common.hianalytics.LinkedHashMapPack put(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            if (r2 == 0) goto L9
            if (r3 == 0) goto L9
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r0 = r1.a
            r0.put(r2, r3)
        L9:
            return r1
    }

    public com.huawei.hms.framework.common.hianalytics.LinkedHashMapPack put(java.lang.String r2, boolean r3) {
            r1 = this;
            if (r2 == 0) goto L13
            if (r3 == 0) goto Lc
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r3 = r1.a
            java.lang.String r0 = "1"
            r3.put(r2, r0)
            return r1
        Lc:
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r3 = r1.a
            java.lang.String r0 = "0"
            r3.put(r2, r0)
        L13:
            return r1
    }

    public com.huawei.hms.framework.common.hianalytics.LinkedHashMapPack putIfNotDefault(java.lang.String r2, long r3, long r5) {
            r1 = this;
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L5
            return r1
        L5:
            com.huawei.hms.framework.common.hianalytics.LinkedHashMapPack r2 = r1.put(r2, r3)
            return r2
    }
}
