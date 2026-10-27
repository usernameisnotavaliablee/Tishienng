package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class v extends kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.h implements x3.m {

    @org.jetbrains.annotations.NotNull
    private final java.lang.Enum<?> c;

    public v(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.name.f r2, @org.jetbrains.annotations.NotNull java.lang.Enum<?> r3) {
            r1 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 0
            r1.<init>(r2, r0)
            r1.c = r3
            return
    }

    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.name.b c() {
            r2 = this;
            java.lang.Enum<?> r0 = r2.c
            java.lang.Class r0 = r0.getClass()
            boolean r1 = r0.isEnum()
            if (r1 == 0) goto Ld
            goto L11
        Ld:
            java.lang.Class r0 = r0.getEnclosingClass()
        L11:
            kotlin.jvm.internal.g0.m(r0)
            kotlin.reflect.jvm.internal.impl.name.b r0 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.f.e(r0)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.name.f d() {
            r1 = this;
            java.lang.Enum<?> r0 = r1.c
            java.lang.String r0 = r0.name()
            kotlin.reflect.jvm.internal.impl.name.f r0 = kotlin.reflect.jvm.internal.impl.name.f.h(r0)
            return r0
    }
}
