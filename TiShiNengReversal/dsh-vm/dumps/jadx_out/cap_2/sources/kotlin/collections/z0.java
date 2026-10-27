package kotlin.collections;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nGrouping.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Grouping.kt\nkotlin/collections/GroupingKt__GroupingKt\n*L\n1#1,291:1\n80#1,6:292\n53#1:298\n80#1,6:299\n80#1,6:305\n53#1:311\n80#1,6:312\n80#1,6:318\n53#1:324\n80#1,6:325\n80#1,6:331\n189#1:337\n80#1,6:338\n*S KotlinDebug\n*F\n+ 1 Grouping.kt\nkotlin/collections/GroupingKt__GroupingKt\n*L\n53#1:292,6\n112#1:298\n112#1:299,6\n143#1:305,6\n164#1:311\n164#1:312,6\n189#1:318,6\n211#1:324\n211#1:325,6\n239#1:331,6\n257#1:337\n257#1:338,6\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class z0 extends kotlin.collections.y0 {
    public z0() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.SinceKotlin(version = "1.1")
    @org.jetbrains.annotations.NotNull
    public static final <T, K, R> java.util.Map<K, R> c(@org.jetbrains.annotations.NotNull kotlin.collections.w0<T, ? extends K> r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function4<? super K, ? super R, ? super T, ? super java.lang.Boolean, ? extends R> r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Iterator r1 = r6.b()
        L13:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r1.next()
            java.lang.Object r3 = r6.a(r2)
            java.lang.Object r4 = r0.get(r3)
            if (r4 != 0) goto L2f
            boolean r5 = r0.containsKey(r3)
            if (r5 != 0) goto L2f
            r5 = 1
            goto L30
        L2f:
            r5 = 0
        L30:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            java.lang.Object r2 = r7.invoke(r3, r4, r2, r5)
            r0.put(r3, r2)
            goto L13
        L3c:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    @org.jetbrains.annotations.NotNull
    public static final <T, K, R, M extends java.util.Map<? super K, R>> M d(@org.jetbrains.annotations.NotNull kotlin.collections.w0<T, ? extends K> r5, @org.jetbrains.annotations.NotNull M r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function4<? super K, ? super R, ? super T, ? super java.lang.Boolean, ? extends R> r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.util.Iterator r0 = r5.b()
        L13:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3c
            java.lang.Object r1 = r0.next()
            java.lang.Object r2 = r5.a(r1)
            java.lang.Object r3 = r6.get(r2)
            if (r3 != 0) goto L2f
            boolean r4 = r6.containsKey(r2)
            if (r4 != 0) goto L2f
            r4 = 1
            goto L30
        L2f:
            r4 = 0
        L30:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            java.lang.Object r1 = r7.invoke(r2, r3, r1, r4)
            r6.put(r2, r1)
            goto L13
        L3c:
            return r6
    }

    @kotlin.SinceKotlin(version = "1.1")
    @org.jetbrains.annotations.NotNull
    public static final <T, K, M extends java.util.Map<? super K, java.lang.Integer>> M e(@org.jetbrains.annotations.NotNull kotlin.collections.w0<T, ? extends K> r7, @org.jetbrains.annotations.NotNull M r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r8, r0)
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.util.Iterator r2 = r7.b()
        L13:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L43
            java.lang.Object r3 = r2.next()
            java.lang.Object r3 = r7.a(r3)
            java.lang.Object r4 = r8.get(r3)
            r5 = 1
            if (r4 != 0) goto L30
            boolean r6 = r8.containsKey(r3)
            if (r6 != 0) goto L30
            r6 = 1
            goto L31
        L30:
            r6 = 0
        L31:
            if (r6 == 0) goto L34
            r4 = r1
        L34:
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            int r4 = r4 + r5
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r8.put(r3, r4)
            goto L13
        L43:
            return r8
    }

    @kotlin.SinceKotlin(version = "1.1")
    @org.jetbrains.annotations.NotNull
    public static final <T, K, R> java.util.Map<K, R> f(@org.jetbrains.annotations.NotNull kotlin.collections.w0<T, ? extends K> r6, R r7, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super R, ? super T, ? extends R> r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Iterator r1 = r6.b()
        L13:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3b
            java.lang.Object r2 = r1.next()
            java.lang.Object r3 = r6.a(r2)
            java.lang.Object r4 = r0.get(r3)
            if (r4 != 0) goto L2f
            boolean r5 = r0.containsKey(r3)
            if (r5 != 0) goto L2f
            r5 = 1
            goto L30
        L2f:
            r5 = 0
        L30:
            if (r5 == 0) goto L33
            r4 = r7
        L33:
            java.lang.Object r2 = r8.invoke(r4, r2)
            r0.put(r3, r2)
            goto L13
        L3b:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    @org.jetbrains.annotations.NotNull
    public static final <T, K, R> java.util.Map<K, R> g(@org.jetbrains.annotations.NotNull kotlin.collections.w0<T, ? extends K> r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super K, ? super T, ? extends R> r7, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super K, ? super R, ? super T, ? extends R> r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "initialValueSelector"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Iterator r1 = r6.b()
        L18:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L43
            java.lang.Object r2 = r1.next()
            java.lang.Object r3 = r6.a(r2)
            java.lang.Object r4 = r0.get(r3)
            if (r4 != 0) goto L34
            boolean r5 = r0.containsKey(r3)
            if (r5 != 0) goto L34
            r5 = 1
            goto L35
        L34:
            r5 = 0
        L35:
            if (r5 == 0) goto L3b
            java.lang.Object r4 = r7.invoke(r3, r2)
        L3b:
            java.lang.Object r2 = r8.invoke(r3, r4, r2)
            r0.put(r3, r2)
            goto L18
        L43:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    @org.jetbrains.annotations.NotNull
    public static final <T, K, R, M extends java.util.Map<? super K, R>> M h(@org.jetbrains.annotations.NotNull kotlin.collections.w0<T, ? extends K> r5, @org.jetbrains.annotations.NotNull M r6, R r7, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super R, ? super T, ? extends R> r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.util.Iterator r0 = r5.b()
        L13:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3b
            java.lang.Object r1 = r0.next()
            java.lang.Object r2 = r5.a(r1)
            java.lang.Object r3 = r6.get(r2)
            if (r3 != 0) goto L2f
            boolean r4 = r6.containsKey(r2)
            if (r4 != 0) goto L2f
            r4 = 1
            goto L30
        L2f:
            r4 = 0
        L30:
            if (r4 == 0) goto L33
            r3 = r7
        L33:
            java.lang.Object r1 = r8.invoke(r3, r1)
            r6.put(r2, r1)
            goto L13
        L3b:
            return r6
    }

    @kotlin.SinceKotlin(version = "1.1")
    @org.jetbrains.annotations.NotNull
    public static final <T, K, R, M extends java.util.Map<? super K, R>> M i(@org.jetbrains.annotations.NotNull kotlin.collections.w0<T, ? extends K> r5, @org.jetbrains.annotations.NotNull M r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super K, ? super T, ? extends R> r7, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super K, ? super R, ? super T, ? extends R> r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "initialValueSelector"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.util.Iterator r0 = r5.b()
        L18:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L43
            java.lang.Object r1 = r0.next()
            java.lang.Object r2 = r5.a(r1)
            java.lang.Object r3 = r6.get(r2)
            if (r3 != 0) goto L34
            boolean r4 = r6.containsKey(r2)
            if (r4 != 0) goto L34
            r4 = 1
            goto L35
        L34:
            r4 = 0
        L35:
            if (r4 == 0) goto L3b
            java.lang.Object r3 = r7.invoke(r2, r1)
        L3b:
            java.lang.Object r1 = r8.invoke(r2, r3, r1)
            r6.put(r2, r1)
            goto L18
        L43:
            return r6
    }

    @kotlin.SinceKotlin(version = "1.1")
    @org.jetbrains.annotations.NotNull
    public static final <S, T extends S, K> java.util.Map<K, S> j(@org.jetbrains.annotations.NotNull kotlin.collections.w0<T, ? extends K> r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super K, ? super S, ? super T, ? extends S> r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Iterator r1 = r6.b()
        L13:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3b
            java.lang.Object r2 = r1.next()
            java.lang.Object r3 = r6.a(r2)
            java.lang.Object r4 = r0.get(r3)
            if (r4 != 0) goto L2f
            boolean r5 = r0.containsKey(r3)
            if (r5 != 0) goto L2f
            r5 = 1
            goto L30
        L2f:
            r5 = 0
        L30:
            if (r5 == 0) goto L33
            goto L37
        L33:
            java.lang.Object r2 = r7.invoke(r3, r4, r2)
        L37:
            r0.put(r3, r2)
            goto L13
        L3b:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    @org.jetbrains.annotations.NotNull
    public static final <S, T extends S, K, M extends java.util.Map<? super K, S>> M k(@org.jetbrains.annotations.NotNull kotlin.collections.w0<T, ? extends K> r5, @org.jetbrains.annotations.NotNull M r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super K, ? super S, ? super T, ? extends S> r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.util.Iterator r0 = r5.b()
        L13:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3b
            java.lang.Object r1 = r0.next()
            java.lang.Object r2 = r5.a(r1)
            java.lang.Object r3 = r6.get(r2)
            if (r3 != 0) goto L2f
            boolean r4 = r6.containsKey(r2)
            if (r4 != 0) goto L2f
            r4 = 1
            goto L30
        L2f:
            r4 = 0
        L30:
            if (r4 == 0) goto L33
            goto L37
        L33:
            java.lang.Object r1 = r7.invoke(r2, r3, r1)
        L37:
            r6.put(r2, r1)
            goto L13
        L3b:
            return r6
    }
}
