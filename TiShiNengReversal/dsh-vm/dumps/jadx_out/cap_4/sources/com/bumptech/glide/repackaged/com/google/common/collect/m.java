package com.bumptech.glide.repackaged.com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class m<K, V> extends com.bumptech.glide.repackaged.com.google.common.collect.c<K, V> implements java.io.Serializable {
    final K a;
    final V b;

    m(K r1, V r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.c, java.util.Map.Entry
    public final K getKey() {
            r1 = this;
            K r0 = r1.a
            return r0
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.c, java.util.Map.Entry
    public final V getValue() {
            r1 = this;
            V r0 = r1.b
            return r0
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.c, java.util.Map.Entry
    public final V setValue(V r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }
}
