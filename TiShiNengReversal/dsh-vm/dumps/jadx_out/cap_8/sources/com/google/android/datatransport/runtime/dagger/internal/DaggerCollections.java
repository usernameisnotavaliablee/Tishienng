package com.google.android.datatransport.runtime.dagger.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class DaggerCollections {
    private static final int MAX_POWER_OF_TWO = 1073741824;

    private DaggerCollections() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int calculateInitialCapacity(int r1) {
            r0 = 3
            if (r1 >= r0) goto L6
            int r1 = r1 + 1
            return r1
        L6:
            r0 = 1073741824(0x40000000, float:2.0)
            if (r1 >= r0) goto L13
            float r1 = (float) r1
            r0 = 1061158912(0x3f400000, float:0.75)
            float r1 = r1 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 + r0
            int r1 = (int) r1
            return r1
        L13:
            r1 = 2147483647(0x7fffffff, float:NaN)
            return r1
    }

    public static boolean hasDuplicates(java.util.List<?> r3) {
            int r0 = r3.size()
            r1 = 2
            r2 = 0
            if (r0 >= r1) goto L9
            return r2
        L9:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r3)
            int r3 = r3.size()
            int r0 = r0.size()
            if (r3 == r0) goto L1a
            r3 = 1
            return r3
        L1a:
            return r2
    }

    static <T> java.util.HashSet<T> newHashSetWithExpectedSize(int r1) {
            java.util.HashSet r0 = new java.util.HashSet
            int r1 = calculateInitialCapacity(r1)
            r0.<init>(r1)
            return r0
    }

    public static <K, V> java.util.LinkedHashMap<K, V> newLinkedHashMapWithExpectedSize(int r1) {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r1 = calculateInitialCapacity(r1)
            r0.<init>(r1)
            return r0
    }

    public static <T> java.util.List<T> presizedList(int r1) {
            if (r1 != 0) goto L5
            java.util.List r1 = java.util.Collections.EMPTY_LIST
            return r1
        L5:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            return r0
    }
}
