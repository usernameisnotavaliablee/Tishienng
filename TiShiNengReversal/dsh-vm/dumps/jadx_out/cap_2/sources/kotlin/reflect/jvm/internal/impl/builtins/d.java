package kotlin.reflect.jvm.internal.impl.builtins;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nCompanionObjectMapping.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompanionObjectMapping.kt\norg/jetbrains/kotlin/builtins/CompanionObjectMapping\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,20:1\n1563#2:21\n1634#2,3:22\n1634#2,3:25\n*S KotlinDebug\n*F\n+ 1 CompanionObjectMapping.kt\norg/jetbrains/kotlin/builtins/CompanionObjectMapping\n*L\n12#1:21\n12#1:22,3\n16#1:25,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class d {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.builtins.d a = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.Set<kotlin.reflect.jvm.internal.impl.name.b> b = null;

    static {
            kotlin.reflect.jvm.internal.impl.builtins.d r0 = new kotlin.reflect.jvm.internal.impl.builtins.d
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.builtins.d.a = r0
            java.util.Set<kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType> r0 = kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.NUMBER_TYPES
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.f0.d0(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r0.next()
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r2 = (kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType) r2
            kotlin.reflect.jvm.internal.impl.name.c r2 = kotlin.reflect.jvm.internal.impl.builtins.o.c(r2)
            r1.add(r2)
            goto L18
        L2c:
            kotlin.reflect.jvm.internal.impl.name.d r0 = kotlin.reflect.jvm.internal.impl.builtins.o.a.h
            kotlin.reflect.jvm.internal.impl.name.c r0 = r0.m()
            java.util.List r0 = kotlin.collections.f0.J4(r1, r0)
            java.util.Collection r0 = (java.util.Collection) r0
            kotlin.reflect.jvm.internal.impl.name.d r1 = kotlin.reflect.jvm.internal.impl.builtins.o.a.j
            kotlin.reflect.jvm.internal.impl.name.c r1 = r1.m()
            java.util.List r0 = kotlin.collections.f0.J4(r0, r1)
            java.util.Collection r0 = (java.util.Collection) r0
            kotlin.reflect.jvm.internal.impl.name.d r1 = kotlin.reflect.jvm.internal.impl.builtins.o.a.s
            kotlin.reflect.jvm.internal.impl.name.c r1 = r1.m()
            java.util.List r0 = kotlin.collections.f0.J4(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            kotlin.reflect.jvm.internal.impl.name.b$a r2 = kotlin.reflect.jvm.internal.impl.name.b.d
            java.util.Iterator r0 = r0.iterator()
        L5b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L6f
            java.lang.Object r3 = r0.next()
            kotlin.reflect.jvm.internal.impl.name.c r3 = (kotlin.reflect.jvm.internal.impl.name.c) r3
            kotlin.reflect.jvm.internal.impl.name.b r3 = r2.c(r3)
            r1.add(r3)
            goto L5b
        L6f:
            kotlin.reflect.jvm.internal.impl.builtins.d.b = r1
            return
    }

    private d() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Set<kotlin.reflect.jvm.internal.impl.name.b> a() {
            r1 = this;
            java.util.Set<kotlin.reflect.jvm.internal.impl.name.b> r0 = kotlin.reflect.jvm.internal.impl.builtins.d.b
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Set<kotlin.reflect.jvm.internal.impl.name.b> b() {
            r1 = this;
            java.util.Set<kotlin.reflect.jvm.internal.impl.name.b> r0 = kotlin.reflect.jvm.internal.impl.builtins.d.b
            return r0
    }
}
