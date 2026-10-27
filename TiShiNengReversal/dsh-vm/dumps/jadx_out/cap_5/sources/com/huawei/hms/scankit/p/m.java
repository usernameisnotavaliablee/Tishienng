package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
final class m {
    private final java.util.Map<java.lang.Integer, java.lang.Integer> a;

    m() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.a = r0
            return
    }

    void a(int r3) {
            r2 = this;
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r2.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L13
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L13:
            int r0 = r0.intValue()
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.util.Map<java.lang.Integer, java.lang.Integer> r1 = r2.a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.put(r3, r0)
            return
    }

    int[] a() {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Map<java.lang.Integer, java.lang.Integer> r1 = r5.a
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
            r2 = -1
        L10:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L55
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getValue()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r4 <= r2) goto L3f
            java.lang.Object r2 = r3.getValue()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.clear()
            java.lang.Object r3 = r3.getKey()
            java.lang.Integer r3 = (java.lang.Integer) r3
            r0.add(r3)
            goto L10
        L3f:
            java.lang.Object r4 = r3.getValue()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r4 != r2) goto L10
            java.lang.Object r3 = r3.getKey()
            java.lang.Integer r3 = (java.lang.Integer) r3
            r0.add(r3)
            goto L10
        L55:
            int[] r0 = com.huawei.hms.scankit.p.n5.a(r0)
            return r0
    }
}
