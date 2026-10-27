package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class m {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.m a = null;

    static {
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.m r0 = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.m
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.m.a = r0
            return
    }

    private m() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String a(@org.jetbrains.annotations.NotNull java.lang.reflect.Constructor<?> r3) {
            r2 = this;
            java.lang.String r0 = "constructor"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "("
            r0.append(r1)
            java.lang.Class[] r3 = r3.getParameterTypes()
            java.util.Iterator r3 = kotlin.jvm.internal.h.a(r3)
        L17:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r3.next()
            java.lang.Class r1 = (java.lang.Class) r1
            kotlin.jvm.internal.g0.m(r1)
            java.lang.String r1 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.f.f(r1)
            r0.append(r1)
            goto L17
        L2e:
            java.lang.String r3 = ")V"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.g0.o(r3, r0)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String b(@org.jetbrains.annotations.NotNull java.lang.reflect.Field r2) {
            r1 = this;
            java.lang.String r0 = "field"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.Class r2 = r2.getType()
            java.lang.String r0 = "getType(...)"
            kotlin.jvm.internal.g0.o(r2, r0)
            java.lang.String r2 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.f.f(r2)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String c(@org.jetbrains.annotations.NotNull java.lang.reflect.Method r4) {
            r3 = this;
            java.lang.String r0 = "method"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "("
            r0.append(r1)
            java.lang.Class[] r1 = r4.getParameterTypes()
            java.util.Iterator r1 = kotlin.jvm.internal.h.a(r1)
        L17:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r1.next()
            java.lang.Class r2 = (java.lang.Class) r2
            kotlin.jvm.internal.g0.m(r2)
            java.lang.String r2 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.f.f(r2)
            r0.append(r2)
            goto L17
        L2e:
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.Class r4 = r4.getReturnType()
            java.lang.String r1 = "getReturnType(...)"
            kotlin.jvm.internal.g0.o(r4, r1)
            java.lang.String r4 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.f.f(r4)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.g0.o(r4, r0)
            return r4
    }
}
