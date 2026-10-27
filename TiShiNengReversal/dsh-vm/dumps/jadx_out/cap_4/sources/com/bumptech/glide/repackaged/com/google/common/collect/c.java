package com.bumptech.glide.repackaged.com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
abstract class c<K, V> implements java.util.Map.Entry<K, V> {
    c() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.Map.Entry
    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 == 0) goto L25
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r0 = r3.getKey()
            java.lang.Object r2 = r4.getKey()
            boolean r0 = com.bumptech.glide.repackaged.com.google.common.base.c.a(r0, r2)
            if (r0 == 0) goto L25
            java.lang.Object r0 = r3.getValue()
            java.lang.Object r4 = r4.getValue()
            boolean r4 = com.bumptech.glide.repackaged.com.google.common.base.c.a(r0, r4)
            if (r4 == 0) goto L25
            r4 = 1
            return r4
        L25:
            return r1
    }

    @Override // java.util.Map.Entry
    public abstract K getKey();

    @Override // java.util.Map.Entry
    public abstract V getValue();

    @Override // java.util.Map.Entry
    public int hashCode() {
            r3 = this;
            java.lang.Object r0 = r3.getKey()
            java.lang.Object r1 = r3.getValue()
            r2 = 0
            if (r0 != 0) goto Ld
            r0 = 0
            goto L11
        Ld:
            int r0 = r0.hashCode()
        L11:
            if (r1 != 0) goto L14
            goto L18
        L14:
            int r2 = r1.hashCode()
        L18:
            r0 = r0 ^ r2
            return r0
    }

    @Override // java.util.Map.Entry
    public V setValue(V r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r1 = r2.getKey()
            r0.append(r1)
            java.lang.String r1 = "="
            r0.append(r1)
            java.lang.Object r1 = r2.getValue()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
