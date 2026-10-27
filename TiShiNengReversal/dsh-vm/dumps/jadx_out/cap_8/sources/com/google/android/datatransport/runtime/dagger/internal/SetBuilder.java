package com.google.android.datatransport.runtime.dagger.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class SetBuilder<T> {
    private static final java.lang.String SET_CONTRIBUTIONS_CANNOT_BE_NULL = "Set contributions cannot be null";
    private final java.util.List<T> contributions;

    private SetBuilder(int r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r1.contributions = r0
            return
    }

    public static <T> com.google.android.datatransport.runtime.dagger.internal.SetBuilder<T> newSetBuilder(int r1) {
            com.google.android.datatransport.runtime.dagger.internal.SetBuilder r0 = new com.google.android.datatransport.runtime.dagger.internal.SetBuilder
            r0.<init>(r1)
            return r0
    }

    public com.google.android.datatransport.runtime.dagger.internal.SetBuilder<T> add(T r3) {
            r2 = this;
            java.util.List<T> r0 = r2.contributions
            java.lang.String r1 = "Set contributions cannot be null"
            java.lang.Object r3 = com.google.android.datatransport.runtime.dagger.internal.Preconditions.checkNotNull(r3, r1)
            r0.add(r3)
            return r2
    }

    public com.google.android.datatransport.runtime.dagger.internal.SetBuilder<T> addAll(java.util.Collection<? extends T> r4) {
            r3 = this;
            java.util.Iterator r0 = r4.iterator()
        L4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L14
            java.lang.Object r1 = r0.next()
            java.lang.String r2 = "Set contributions cannot be null"
            com.google.android.datatransport.runtime.dagger.internal.Preconditions.checkNotNull(r1, r2)
            goto L4
        L14:
            java.util.List<T> r0 = r3.contributions
            r0.addAll(r4)
            return r3
    }

    public java.util.Set<T> build() {
            r2 = this;
            java.util.List<T> r0 = r2.contributions
            int r0 = r0.size()
            if (r0 == 0) goto L23
            r1 = 1
            if (r0 == r1) goto L17
            java.util.HashSet r0 = new java.util.HashSet
            java.util.List<T> r1 = r2.contributions
            r0.<init>(r1)
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            return r0
        L17:
            java.util.List<T> r0 = r2.contributions
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.util.Set r0 = java.util.Collections.singleton(r0)
            return r0
        L23:
            java.util.Set r0 = java.util.Collections.EMPTY_SET
            return r0
    }
}
