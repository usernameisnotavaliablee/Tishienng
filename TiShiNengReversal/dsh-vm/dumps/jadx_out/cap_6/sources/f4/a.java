package f4;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nscopeUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 scopeUtils.kt\norg/jetbrains/kotlin/util/collectionUtils/ScopeUtilsKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 CollectionUtil.kt\norg/jetbrains/kotlin/utils/CollectionUtilKt\n*L\n1#1,111:1\n4344#2,2:112\n865#3,2:114\n9#4,6:116\n*S KotlinDebug\n*F\n+ 1 scopeUtils.kt\norg/jetbrains/kotlin/util/collectionUtils/ScopeUtilsKt\n*L\n85#1:112,2\n88#1:114,2\n109#1:116,6\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class a {
    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.util.Collection<T> a(@org.jetbrains.annotations.Nullable java.util.Collection<? extends T> r1, @org.jetbrains.annotations.NotNull java.util.Collection<? extends T> r2) {
            java.lang.String r0 = "collection"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Lc
            return r1
        Lc:
            if (r1 != 0) goto Lf
            return r2
        Lf:
            boolean r0 = r1 instanceof java.util.LinkedHashSet
            if (r0 == 0) goto L1a
            r0 = r1
            java.util.LinkedHashSet r0 = (java.util.LinkedHashSet) r0
            r0.addAll(r2)
            return r1
        L1a:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>(r1)
            r0.addAll(r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.utils.j<kotlin.reflect.jvm.internal.impl.resolve.scopes.k> b(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends kotlin.reflect.jvm.internal.impl.resolve.scopes.k> r4) {
            java.lang.String r0 = "scopes"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.reflect.jvm.internal.impl.utils.j r0 = new kotlin.reflect.jvm.internal.impl.utils.j
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        Le:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r4.next()
            r2 = r1
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r2 = (kotlin.reflect.jvm.internal.impl.resolve.scopes.k) r2
            if (r2 == 0) goto Le
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k$c r3 = kotlin.reflect.jvm.internal.impl.resolve.scopes.k.c.b
            if (r2 == r3) goto Le
            r0.add(r1)
            goto Le
        L25:
            return r0
    }
}
