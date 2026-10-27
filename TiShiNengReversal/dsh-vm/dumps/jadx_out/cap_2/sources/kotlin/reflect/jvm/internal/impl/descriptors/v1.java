package kotlin.reflect.jvm.internal.impl.descriptors;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class v1 {

    @org.jetbrains.annotations.NotNull
    private final java.lang.String a;
    private final boolean b;

    protected v1(@org.jetbrains.annotations.NotNull java.lang.String r2, boolean r3) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            return
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Integer a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.v1 r2) {
            r1 = this;
            java.lang.String r0 = "visibility"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.u1 r0 = kotlin.reflect.jvm.internal.impl.descriptors.u1.a
            java.lang.Integer r2 = r0.a(r1, r2)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String b() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public final boolean c() {
            r1 = this;
            boolean r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.v1 d() {
            r0 = this;
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.b()
            return r0
    }
}
