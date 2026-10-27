package kotlin.collections;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nGroupingJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GroupingJVM.kt\nkotlin/collections/GroupingKt__GroupingJVMKt\n+ 2 Grouping.kt\nkotlin/collections/GroupingKt__GroupingKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,52:1\n143#2:53\n80#2,4:54\n85#2:59\n1#3:58\n1869#4,2:60\n*S KotlinDebug\n*F\n+ 1 GroupingJVM.kt\nkotlin/collections/GroupingKt__GroupingJVMKt\n*L\n22#1:53\n22#1:54,4\n22#1:59\n48#1:60,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class y0 {
    public y0() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.SinceKotlin(version = "1.1")
    @org.jetbrains.annotations.NotNull
    public static final <T, K> java.util.Map<K, java.lang.Integer> a(@org.jetbrains.annotations.NotNull kotlin.collections.w0<T, ? extends K> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Iterator r1 = r6.b()
        Le:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r1.next()
            java.lang.Object r2 = r6.a(r2)
            java.lang.Object r3 = r0.get(r2)
            r4 = 1
            if (r3 != 0) goto L2b
            boolean r5 = r0.containsKey(r2)
            if (r5 != 0) goto L2b
            r5 = 1
            goto L2c
        L2b:
            r5 = 0
        L2c:
            if (r5 == 0) goto L33
            kotlin.jvm.internal.Ref$IntRef r3 = new kotlin.jvm.internal.Ref$IntRef
            r3.<init>()
        L33:
            kotlin.jvm.internal.Ref$IntRef r3 = (kotlin.jvm.internal.Ref.IntRef) r3
            int r5 = r3.element
            int r5 = r5 + r4
            r3.element = r5
            r0.put(r2, r3)
            goto Le
        L3e:
            java.util.Set r6 = r0.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L46:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L6b
            java.lang.Object r1 = r6.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace>"
            kotlin.jvm.internal.g0.n(r1, r2)
            java.util.Map$Entry r2 = kotlin.jvm.internal.u0.m(r1)
            java.lang.Object r1 = r1.getValue()
            kotlin.jvm.internal.Ref$IntRef r1 = (kotlin.jvm.internal.Ref.IntRef) r1
            int r1 = r1.element
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.setValue(r1)
            goto L46
        L6b:
            java.util.Map r6 = kotlin.jvm.internal.u0.k(r0)
            return r6
    }

    @kotlin.PublishedApi
    @kotlin.internal.InlineOnly
    private static final <K, V, R> java.util.Map<K, R> b(java.util.Map<K, V> r3, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "f"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Set r0 = r3.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace>"
            kotlin.jvm.internal.g0.n(r1, r2)
            java.util.Map$Entry r2 = kotlin.jvm.internal.u0.m(r1)
            java.lang.Object r1 = r4.invoke(r1)
            r2.setValue(r1)
            goto L12
        L2f:
            java.util.Map r3 = kotlin.jvm.internal.u0.k(r3)
            return r3
    }
}
