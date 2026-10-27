package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class b implements kotlin.reflect.jvm.internal.impl.descriptors.e1 {

    @org.jetbrains.annotations.NotNull
    private final java.lang.annotation.Annotation b;

    public b(@org.jetbrains.annotations.NotNull java.lang.annotation.Annotation r2) {
            r1 = this;
            java.lang.String r0 = "annotation"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.b = r2
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e1
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.f1 b() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.f1 r0 = kotlin.reflect.jvm.internal.impl.descriptors.f1.a
            java.lang.String r1 = "NO_SOURCE_FILE"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.annotation.Annotation d() {
            r1 = this;
            java.lang.annotation.Annotation r0 = r1.b
            return r0
    }
}
