package kotlinx.coroutines.debug.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.PublishedApi
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class k implements kotlin.coroutines.jvm.internal.c {

    @org.jetbrains.annotations.Nullable
    private final kotlin.coroutines.jvm.internal.c a;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final java.lang.StackTraceElement b;

    public k(@org.jetbrains.annotations.Nullable kotlin.coroutines.jvm.internal.c r1, @org.jetbrains.annotations.NotNull java.lang.StackTraceElement r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // kotlin.coroutines.jvm.internal.c
    @org.jetbrains.annotations.Nullable
    public kotlin.coroutines.jvm.internal.c getCallerFrame() {
            r1 = this;
            kotlin.coroutines.jvm.internal.c r0 = r1.a
            return r0
    }

    @Override // kotlin.coroutines.jvm.internal.c
    @org.jetbrains.annotations.NotNull
    public java.lang.StackTraceElement getStackTraceElement() {
            r1 = this;
            java.lang.StackTraceElement r0 = r1.b
            return r0
    }
}
