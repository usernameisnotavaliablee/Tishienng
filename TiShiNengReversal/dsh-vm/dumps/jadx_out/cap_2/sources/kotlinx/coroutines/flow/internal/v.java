package kotlinx.coroutines.flow.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class v<T> implements kotlin.coroutines.e<T>, kotlin.coroutines.jvm.internal.c {

    @org.jetbrains.annotations.NotNull
    private final kotlin.coroutines.e<T> a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.coroutines.i b;

    public v(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // kotlin.coroutines.jvm.internal.c
    @org.jetbrains.annotations.Nullable
    public kotlin.coroutines.jvm.internal.c getCallerFrame() {
            r2 = this;
            kotlin.coroutines.e<T> r0 = r2.a
            boolean r1 = r0 instanceof kotlin.coroutines.jvm.internal.c
            if (r1 == 0) goto L9
            kotlin.coroutines.jvm.internal.c r0 = (kotlin.coroutines.jvm.internal.c) r0
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // kotlin.coroutines.e
    @org.jetbrains.annotations.NotNull
    public kotlin.coroutines.i getContext() {
            r1 = this;
            kotlin.coroutines.i r0 = r1.b
            return r0
    }

    @Override // kotlin.coroutines.jvm.internal.c
    @org.jetbrains.annotations.Nullable
    public java.lang.StackTraceElement getStackTraceElement() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlin.coroutines.e
    public void resumeWith(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
            r1 = this;
            kotlin.coroutines.e<T> r0 = r1.a
            r0.resumeWith(r2)
            return
    }
}
