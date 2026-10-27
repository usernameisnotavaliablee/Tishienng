package kotlin.reflect.jvm.internal.impl.types.checker;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nKotlinTypeRefiner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinTypeRefiner.kt\norg/jetbrains/kotlin/types/checker/KotlinTypeRefinerKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,90:1\n1563#2:91\n1634#2,3:92\n*S KotlinDebug\n*F\n+ 1 KotlinTypeRefiner.kt\norg/jetbrains/kotlin/types/checker/KotlinTypeRefinerKt\n*L\n78#1:91\n78#1:92,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class h {

    @org.jetbrains.annotations.NotNull
    private static final kotlin.reflect.jvm.internal.impl.descriptors.e0<kotlin.reflect.jvm.internal.impl.types.checker.t<kotlin.reflect.jvm.internal.impl.types.checker.c0>> a = null;

    static {
            kotlin.reflect.jvm.internal.impl.descriptors.e0 r0 = new kotlin.reflect.jvm.internal.impl.descriptors.e0
            java.lang.String r1 = "KotlinTypeRefiner"
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.types.checker.h.a = r0
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.descriptors.e0<kotlin.reflect.jvm.internal.impl.types.checker.t<kotlin.reflect.jvm.internal.impl.types.checker.c0>> a() {
            kotlin.reflect.jvm.internal.impl.descriptors.e0<kotlin.reflect.jvm.internal.impl.types.checker.t<kotlin.reflect.jvm.internal.impl.types.checker.c0>> r0 = kotlin.reflect.jvm.internal.impl.types.checker.h.a
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.List<kotlin.reflect.jvm.internal.impl.types.t0> b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.g r2, @org.jetbrains.annotations.NotNull java.lang.Iterable<? extends kotlin.reflect.jvm.internal.impl.types.t0> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "types"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.f0.d0(r3, r1)
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        L19:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r3.next()
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = (kotlin.reflect.jvm.internal.impl.types.t0) r1
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = r2.h(r1)
            r0.add(r1)
            goto L19
        L2d:
            return r0
    }
}
