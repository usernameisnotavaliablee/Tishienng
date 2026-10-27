package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class r extends kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.h implements x3.h {

    @org.jetbrains.annotations.NotNull
    private final java.lang.Class<?> c;

    public r(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.name.f r2, @org.jetbrains.annotations.NotNull java.lang.Class<?> r3) {
            r1 = this;
            java.lang.String r0 = "klass"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 0
            r1.<init>(r2, r0)
            r1.c = r3
            return
    }

    @org.jetbrains.annotations.NotNull
    public x3.x b() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e0$a r0 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e0.a
            java.lang.Class<?> r1 = r2.c
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e0 r0 = r0.a(r1)
            return r0
    }
}
