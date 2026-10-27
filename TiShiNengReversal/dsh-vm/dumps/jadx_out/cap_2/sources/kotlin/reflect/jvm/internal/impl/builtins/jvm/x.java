package kotlin.reflect.jvm.internal.impl.builtins.jvm;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nmappingUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 mappingUtil.kt\norg/jetbrains/kotlin/builtins/jvm/MappingUtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,24:1\n1563#2:25\n1634#2,3:26\n1563#2:29\n1634#2,3:30\n*S KotlinDebug\n*F\n+ 1 mappingUtil.kt\norg/jetbrains/kotlin/builtins/jvm/MappingUtilKt\n*L\n20#1:25\n20#1:26,3\n21#1:29\n21#1:30,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class x {
    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.types.x1 a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r5, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r6) {
            java.lang.String r0 = "from"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "to"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.util.List r0 = r5.t()
            r0.size()
            java.util.List r0 = r6.t()
            r0.size()
            kotlin.reflect.jvm.internal.impl.types.x1$a r0 = kotlin.reflect.jvm.internal.impl.types.x1.c
            java.util.List r5 = r5.t()
            java.lang.String r1 = "getDeclaredTypeParameters(...)"
            kotlin.jvm.internal.g0.o(r5, r1)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r4 = kotlin.collections.f0.d0(r5, r3)
            r2.<init>(r4)
            java.util.Iterator r5 = r5.iterator()
        L34:
            boolean r4 = r5.hasNext()
            if (r4 == 0) goto L48
            java.lang.Object r4 = r5.next()
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r4 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r4
            kotlin.reflect.jvm.internal.impl.types.w1 r4 = r4.o()
            r2.add(r4)
            goto L34
        L48:
            java.util.List r5 = r6.t()
            kotlin.jvm.internal.g0.o(r5, r1)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            int r1 = kotlin.collections.f0.d0(r5, r3)
            r6.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L5e:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L7b
            java.lang.Object r1 = r5.next()
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r1 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r1
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r1.s()
            java.lang.String r3 = "getDefaultType(...)"
            kotlin.jvm.internal.g0.o(r1, r3)
            kotlin.reflect.jvm.internal.impl.types.c2 r1 = kotlin.reflect.jvm.internal.impl.types.typeUtil.e.e(r1)
            r6.add(r1)
            goto L5e
        L7b:
            java.util.List r5 = kotlin.collections.f0.o6(r2, r6)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Map r5 = kotlin.collections.i1.B0(r5)
            r6 = 2
            r1 = 0
            r2 = 0
            kotlin.reflect.jvm.internal.impl.types.x1 r5 = kotlin.reflect.jvm.internal.impl.types.x1.a.e(r0, r5, r2, r6, r1)
            return r5
    }
}
