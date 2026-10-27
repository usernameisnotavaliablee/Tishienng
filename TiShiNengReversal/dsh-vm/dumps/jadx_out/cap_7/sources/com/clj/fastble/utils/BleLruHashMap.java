package com.clj.fastble.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class BleLruHashMap<K, V> extends java.util.LinkedHashMap<K, V> {
    private final int MAX_SIZE;

    public BleLruHashMap(int r5) {
            r4 = this;
            double r0 = (double) r5
            r2 = 4604930618986332160(0x3fe8000000000000, double:0.75)
            double r0 = r0 / r2
            double r0 = java.lang.Math.ceil(r0)
            int r0 = (int) r0
            r1 = 1
            int r0 = r0 + r1
            r2 = 1061158912(0x3f400000, float:0.75)
            r4.<init>(r0, r2, r1)
            r4.MAX_SIZE = r5
            return
    }

    @Override // java.util.LinkedHashMap
    protected boolean removeEldestEntry(java.util.Map.Entry r3) {
            r2 = this;
            int r0 = r2.size()
            int r1 = r2.MAX_SIZE
            if (r0 <= r1) goto L19
            java.lang.Object r0 = r3.getValue()
            boolean r0 = r0 instanceof com.clj.fastble.bluetooth.b
            if (r0 == 0) goto L19
            java.lang.Object r3 = r3.getValue()
            com.clj.fastble.bluetooth.b r3 = (com.clj.fastble.bluetooth.b) r3
            r3.G()
        L19:
            int r3 = r2.size()
            int r0 = r2.MAX_SIZE
            if (r3 <= r0) goto L23
            r3 = 1
            return r3
        L23:
            r3 = 0
            return r3
    }

    @Override // java.util.AbstractMap
    public java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Set r1 = r6.entrySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L34
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r3
            r3 = 1
            r4[r3] = r2
            java.lang.String r2 = "%s:%s "
            java.lang.String r2 = java.lang.String.format(r2, r4)
            r0.append(r2)
            goto Ld
        L34:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
