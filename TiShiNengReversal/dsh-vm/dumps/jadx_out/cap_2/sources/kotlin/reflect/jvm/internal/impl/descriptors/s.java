package kotlin.reflect.jvm.internal.impl.descriptors;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class s {
    protected s() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.s r2) {
            r1 = this;
            java.lang.String r0 = "visibility"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.v1 r0 = r1.b()
            kotlin.reflect.jvm.internal.impl.descriptors.v1 r2 = r2.b()
            java.lang.Integer r2 = r0.a(r2)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public abstract kotlin.reflect.jvm.internal.impl.descriptors.v1 b();

    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String c();

    public final boolean d() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.v1 r0 = r1.b()
            boolean r0 = r0.c()
            return r0
    }

    public abstract boolean e(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.o r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r3, boolean r4);

    @org.jetbrains.annotations.NotNull
    public abstract kotlin.reflect.jvm.internal.impl.descriptors.s f();

    @org.jetbrains.annotations.NotNull
    public final java.lang.String toString() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.v1 r0 = r1.b()
            java.lang.String r0 = r0.toString()
            return r0
    }
}
