package kotlin.reflect.jvm.internal.impl.descriptors;

import d4.h;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class g0<Type extends d4.h> extends kotlin.reflect.jvm.internal.impl.descriptors.o1<Type> {

    @org.jetbrains.annotations.NotNull
    private final java.util.List<kotlin.Pair<kotlin.reflect.jvm.internal.impl.name.f, Type>> a;

    @org.jetbrains.annotations.NotNull
    private final java.util.Map<kotlin.reflect.jvm.internal.impl.name.f, Type> b;

    public g0(@org.jetbrains.annotations.NotNull java.util.List<? extends kotlin.Pair<kotlin.reflect.jvm.internal.impl.name.f, ? extends Type>> r2) {
            r1 = this;
            java.lang.String r0 = "underlyingPropertyNamesToTypes"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 0
            r1.<init>(r0)
            r1.a = r2
            java.util.List r2 = r1.c()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Map r2 = kotlin.collections.i1.B0(r2)
            r1.b = r2
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.o1
    public boolean a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Map<kotlin.reflect.jvm.internal.impl.name.f, Type extends d4.h> r0 = r1.b
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.Pair<kotlin.reflect.jvm.internal.impl.name.f, Type>> c() {
            r1 = this;
            java.util.List<kotlin.Pair<kotlin.reflect.jvm.internal.impl.name.f, Type extends d4.h>> r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes="
            r0.append(r1)
            java.util.List r1 = r2.c()
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
