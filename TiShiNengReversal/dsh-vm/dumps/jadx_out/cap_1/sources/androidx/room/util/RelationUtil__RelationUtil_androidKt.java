package androidx.room.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final /* synthetic */ class RelationUtil__RelationUtil_androidKt {
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final <K, V> void recursiveFetchArrayMap(@org.jetbrains.annotations.NotNull androidx.collection.ArrayMap<K, V> r8, boolean r9, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.collection.ArrayMap<K, V>, kotlin.n1> r10) {
            java.lang.String r0 = "map"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "fetchBlock"
            kotlin.jvm.internal.g0.p(r10, r0)
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r1 = 999(0x3e7, float:1.4E-42)
            r0.<init>(r1)
            int r2 = r8.size()
            r3 = 0
            r4 = 0
        L17:
            r5 = 0
        L18:
            if (r4 >= r2) goto L42
            if (r9 == 0) goto L28
            java.lang.Object r6 = r8.keyAt(r4)
            java.lang.Object r7 = r8.valueAt(r4)
            r0.put(r6, r7)
            goto L30
        L28:
            java.lang.Object r6 = r8.keyAt(r4)
            r7 = 0
            r0.put(r6, r7)
        L30:
            int r4 = r4 + 1
            int r5 = r5 + 1
            if (r5 != r1) goto L18
            r10.invoke(r0)
            if (r9 != 0) goto L3e
            r8.putAll(r0)
        L3e:
            r0.clear()
            goto L17
        L42:
            if (r5 <= 0) goto L4c
            r10.invoke(r0)
            if (r9 != 0) goto L4c
            r8.putAll(r0)
        L4c:
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final <K, V> void recursiveFetchHashMap(@org.jetbrains.annotations.NotNull java.util.HashMap<K, V> r7, boolean r8, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.util.HashMap<K, V>, kotlin.n1> r9) {
            java.lang.String r0 = "map"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "fetchBlock"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.util.HashMap r0 = new java.util.HashMap
            r1 = 999(0x3e7, float:1.4E-42)
            r0.<init>(r1)
            java.util.Set r2 = r7.keySet()
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
        L1a:
            r4 = 0
        L1b:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L48
            java.lang.Object r5 = r2.next()
            java.lang.String r6 = "next(...)"
            kotlin.jvm.internal.g0.o(r5, r6)
            if (r8 == 0) goto L34
            java.lang.Object r6 = r7.get(r5)
            r0.put(r5, r6)
            goto L38
        L34:
            r6 = 0
            r0.put(r5, r6)
        L38:
            int r4 = r4 + 1
            if (r4 != r1) goto L1b
            r9.invoke(r0)
            if (r8 != 0) goto L44
            r7.putAll(r0)
        L44:
            r0.clear()
            goto L1a
        L48:
            if (r4 <= 0) goto L52
            r9.invoke(r0)
            if (r8 != 0) goto L52
            r7.putAll(r0)
        L52:
            return
    }
}
