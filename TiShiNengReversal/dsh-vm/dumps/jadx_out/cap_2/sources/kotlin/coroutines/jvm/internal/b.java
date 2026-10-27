package kotlin.coroutines.jvm.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class b implements kotlin.coroutines.e<java.lang.Object> {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.coroutines.jvm.internal.b a = null;

    static {
            kotlin.coroutines.jvm.internal.b r0 = new kotlin.coroutines.jvm.internal.b
            r0.<init>()
            kotlin.coroutines.jvm.internal.b.a = r0
            return
    }

    private b() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // kotlin.coroutines.e
    @org.jetbrains.annotations.NotNull
    public kotlin.coroutines.i getContext() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This continuation is already complete"
            r0.<init>(r1)
            throw r0
    }

    @Override // kotlin.coroutines.e
    public void resumeWith(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
            r1 = this;
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "This continuation is already complete"
            r2.<init>(r0)
            throw r2
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "This continuation is already complete"
            return r0
    }
}
