package com.bumptech.glide.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class CachedHashCodeArrayMap<K, V> extends androidx.collection.ArrayMap<K, V> {
    private int a;

    public CachedHashCodeArrayMap() {
            r0 = this;
            r0.<init>()
            return
    }

    public void clear() {
            r1 = this;
            r0 = 0
            r1.a = r0
            super/*androidx.collection.SimpleArrayMap*/.clear()
            return
    }

    public int hashCode() {
            r1 = this;
            int r0 = r1.a
            if (r0 != 0) goto La
            int r0 = super/*androidx.collection.SimpleArrayMap*/.hashCode()
            r1.a = r0
        La:
            int r0 = r1.a
            return r0
    }

    public V put(K r2, V r3) {
            r1 = this;
            r0 = 0
            r1.a = r0
            java.lang.Object r2 = super/*androidx.collection.SimpleArrayMap*/.put(r2, r3)
            return r2
    }

    public void putAll(androidx.collection.SimpleArrayMap<? extends K, ? extends V> r2) {
            r1 = this;
            r0 = 0
            r1.a = r0
            super/*androidx.collection.SimpleArrayMap*/.putAll(r2)
            return
    }

    public V removeAt(int r2) {
            r1 = this;
            r0 = 0
            r1.a = r0
            java.lang.Object r2 = super/*androidx.collection.SimpleArrayMap*/.removeAt(r2)
            return r2
    }

    public V setValueAt(int r2, V r3) {
            r1 = this;
            r0 = 0
            r1.a = r0
            java.lang.Object r2 = super/*androidx.collection.SimpleArrayMap*/.setValueAt(r2, r3)
            return r2
    }
}
