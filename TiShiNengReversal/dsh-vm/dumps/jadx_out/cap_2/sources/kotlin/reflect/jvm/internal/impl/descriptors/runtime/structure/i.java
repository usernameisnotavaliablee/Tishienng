package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class i extends kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.h implements x3.c {

    @org.jetbrains.annotations.NotNull
    private final java.lang.annotation.Annotation c;

    public i(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.name.f r2, @org.jetbrains.annotations.NotNull java.lang.annotation.Annotation r3) {
            r1 = this;
            java.lang.String r0 = "annotation"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 0
            r1.<init>(r2, r0)
            r1.c = r3
            return
    }

    @org.jetbrains.annotations.NotNull
    public x3.a a() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.g r0 = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.g
            java.lang.annotation.Annotation r1 = r2.c
            r0.<init>(r1)
            return r0
    }
}
