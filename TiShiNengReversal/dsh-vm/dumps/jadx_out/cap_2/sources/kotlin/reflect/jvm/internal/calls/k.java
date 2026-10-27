package kotlin.reflect.jvm.internal.calls;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class k implements kotlin.reflect.jvm.internal.calls.g {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.calls.k a = null;

    static {
            kotlin.reflect.jvm.internal.calls.k r0 = new kotlin.reflect.jvm.internal.calls.k
            r0.<init>()
            kotlin.reflect.jvm.internal.calls.k.a = r0
            return
    }

    private k() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // kotlin.reflect.jvm.internal.calls.g
    public boolean a() {
            r1 = this;
            boolean r0 = r1.d()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.calls.g
    @org.jetbrains.annotations.NotNull
    public java.util.List<java.lang.reflect.Type> b() {
            r1 = this;
            java.util.List r0 = kotlin.collections.f0.J()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.calls.g
    public /* bridge */ /* synthetic */ java.lang.reflect.Member c() {
            r1 = this;
            java.lang.Void r0 = r1.e()
            java.lang.reflect.Member r0 = (java.lang.reflect.Member) r0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.calls.g
    @org.jetbrains.annotations.Nullable
    public java.lang.Object call(@org.jetbrains.annotations.NotNull java.lang.Object[] r2) {
            r1 = this;
            java.lang.String r0 = "args"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "call/callBy are not supported for this declaration."
            r2.<init>(r0)
            throw r2
    }

    public boolean d() {
            r1 = this;
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Void e() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.calls.g
    @org.jetbrains.annotations.NotNull
    public java.lang.reflect.Type getReturnType() {
            r2 = this;
            java.lang.String r0 = "TYPE"
            java.lang.Class r1 = java.lang.Void.TYPE
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }
}
