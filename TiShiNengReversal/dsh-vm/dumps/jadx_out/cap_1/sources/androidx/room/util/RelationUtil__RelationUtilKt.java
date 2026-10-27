package androidx.room.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final /* synthetic */ class RelationUtil__RelationUtilKt {
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final <V> void recursiveFetchLongSparseArray(@org.jetbrains.annotations.NotNull androidx.collection.LongSparseArray<V> r9, boolean r10, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.collection.LongSparseArray<V>, kotlin.n1> r11) {
            java.lang.String r0 = "map"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "fetchBlock"
            kotlin.jvm.internal.g0.p(r11, r0)
            androidx.collection.LongSparseArray r0 = new androidx.collection.LongSparseArray
            r1 = 999(0x3e7, float:1.4E-42)
            r0.<init>(r1)
            int r2 = r9.size()
            r3 = 0
            r4 = 0
        L17:
            r5 = 0
        L18:
            if (r4 >= r2) goto L42
            if (r10 == 0) goto L28
            long r6 = r9.keyAt(r4)
            java.lang.Object r8 = r9.valueAt(r4)
            r0.put(r6, r8)
            goto L30
        L28:
            long r6 = r9.keyAt(r4)
            r8 = 0
            r0.put(r6, r8)
        L30:
            int r4 = r4 + 1
            int r5 = r5 + 1
            if (r5 != r1) goto L18
            r11.invoke(r0)
            if (r10 != 0) goto L3e
            r9.putAll(r0)
        L3e:
            r0.clear()
            goto L17
        L42:
            if (r5 <= 0) goto L4c
            r11.invoke(r0)
            if (r10 != 0) goto L4c
            r9.putAll(r0)
        L4c:
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final <K, V> void recursiveFetchMap(@org.jetbrains.annotations.NotNull java.util.Map<K, V> r6, boolean r7, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.util.Map<K, V>, kotlin.n1> r8) {
            java.lang.String r0 = "map"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "fetchBlock"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Set r1 = r6.keySet()
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        L18:
            r3 = 0
        L19:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L43
            java.lang.Object r4 = r1.next()
            if (r7 == 0) goto L2d
            java.lang.Object r5 = r6.get(r4)
            r0.put(r4, r5)
            goto L31
        L2d:
            r5 = 0
            r0.put(r4, r5)
        L31:
            int r3 = r3 + 1
            r4 = 999(0x3e7, float:1.4E-42)
            if (r3 != r4) goto L19
            r8.invoke(r0)
            if (r7 != 0) goto L3f
            r6.putAll(r0)
        L3f:
            r0.clear()
            goto L18
        L43:
            if (r3 <= 0) goto L4d
            r8.invoke(r0)
            if (r7 != 0) goto L4d
            r6.putAll(r0)
        L4d:
            return
    }
}
