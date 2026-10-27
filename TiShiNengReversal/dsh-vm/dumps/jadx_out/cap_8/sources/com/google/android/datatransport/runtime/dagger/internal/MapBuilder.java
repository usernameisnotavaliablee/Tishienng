package com.google.android.datatransport.runtime.dagger.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class MapBuilder<K, V> {
    private final java.util.Map<K, V> contributions;

    private MapBuilder(int r1) {
            r0 = this;
            r0.<init>()
            java.util.LinkedHashMap r1 = com.google.android.datatransport.runtime.dagger.internal.DaggerCollections.newLinkedHashMapWithExpectedSize(r1)
            r0.contributions = r1
            return
    }

    public static <K, V> com.google.android.datatransport.runtime.dagger.internal.MapBuilder<K, V> newMapBuilder(int r1) {
            com.google.android.datatransport.runtime.dagger.internal.MapBuilder r0 = new com.google.android.datatransport.runtime.dagger.internal.MapBuilder
            r0.<init>(r1)
            return r0
    }

    public java.util.Map<K, V> build() {
            r1 = this;
            java.util.Map<K, V> r0 = r1.contributions
            int r0 = r0.size()
            if (r0 == 0) goto Lf
            java.util.Map<K, V> r0 = r1.contributions
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            return r0
        Lf:
            java.util.Map r0 = java.util.Collections.EMPTY_MAP
            return r0
    }

    public com.google.android.datatransport.runtime.dagger.internal.MapBuilder<K, V> put(K r2, V r3) {
            r1 = this;
            java.util.Map<K, V> r0 = r1.contributions
            r0.put(r2, r3)
            return r1
    }

    public com.google.android.datatransport.runtime.dagger.internal.MapBuilder<K, V> putAll(java.util.Map<K, V> r2) {
            r1 = this;
            java.util.Map<K, V> r0 = r1.contributions
            r0.putAll(r2)
            return r1
    }
}
