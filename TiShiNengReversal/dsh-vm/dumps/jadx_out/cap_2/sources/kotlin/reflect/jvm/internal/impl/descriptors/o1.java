package kotlin.reflect.jvm.internal.impl.descriptors;

import d4.h;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nValueClassRepresentation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValueClassRepresentation.kt\norg/jetbrains/kotlin/descriptors/ValueClassRepresentation\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,51:1\n1563#2:52\n1634#2,3:53\n*S KotlinDebug\n*F\n+ 1 ValueClassRepresentation.kt\norg/jetbrains/kotlin/descriptors/ValueClassRepresentation\n*L\n23#1:52\n23#1:53,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class o1<Type extends d4.h> {
    private o1() {
            r0 = this;
            r0.<init>()
            return
    }

    public /* synthetic */ o1(kotlin.jvm.internal.v r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract boolean a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r1);

    @org.jetbrains.annotations.NotNull
    public final <Other extends d4.i> kotlin.reflect.jvm.internal.impl.descriptors.o1<Other> b(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super Type, ? extends Other> r5) {
            r4 = this;
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r5, r0)
            boolean r0 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.z
            if (r0 == 0) goto L20
            kotlin.reflect.jvm.internal.impl.descriptors.z r0 = new kotlin.reflect.jvm.internal.impl.descriptors.z
            r1 = r4
            kotlin.reflect.jvm.internal.impl.descriptors.z r1 = (kotlin.reflect.jvm.internal.impl.descriptors.z) r1
            kotlin.reflect.jvm.internal.impl.name.f r2 = r1.c()
            d4.h r1 = r1.d()
            java.lang.Object r5 = r5.invoke(r1)
            d4.h r5 = (d4.h) r5
            r0.<init>(r2, r5)
            return r0
        L20:
            boolean r0 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.g0
            if (r0 == 0) goto L66
            r0 = r4
            kotlin.reflect.jvm.internal.impl.descriptors.g0 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.g0) r0
            java.util.List r0 = r0.c()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.f0.d0(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L3c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L60
            java.lang.Object r2 = r0.next()
            kotlin.Pair r2 = (kotlin.Pair) r2
            java.lang.Object r3 = r2.component1()
            kotlin.reflect.jvm.internal.impl.name.f r3 = (kotlin.reflect.jvm.internal.impl.name.f) r3
            java.lang.Object r2 = r2.component2()
            d4.h r2 = (d4.h) r2
            java.lang.Object r2 = r5.invoke(r2)
            kotlin.Pair r2 = kotlin.o0.a(r3, r2)
            r1.add(r2)
            goto L3c
        L60:
            kotlin.reflect.jvm.internal.impl.descriptors.g0 r5 = new kotlin.reflect.jvm.internal.impl.descriptors.g0
            r5.<init>(r1)
            return r5
        L66:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
    }
}
