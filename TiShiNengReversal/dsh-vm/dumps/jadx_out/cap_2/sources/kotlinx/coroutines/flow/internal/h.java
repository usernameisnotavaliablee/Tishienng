package kotlinx.coroutines.flow.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class h<T> extends kotlinx.coroutines.flow.internal.g<T, T> {
    public h(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r2, int r3, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BufferOverflow r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public /* synthetic */ h(kotlinx.coroutines.flow.i r1, kotlin.coroutines.i r2, int r3, kotlinx.coroutines.channels.BufferOverflow r4, int r5, kotlin.jvm.internal.v r6) {
            r0 = this;
            r6 = r5 & 2
            if (r6 == 0) goto L6
            kotlin.coroutines.EmptyCoroutineContext r2 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
        L6:
            r6 = r5 & 4
            if (r6 == 0) goto Lb
            r3 = -3
        Lb:
            r5 = r5 & 8
            if (r5 == 0) goto L11
            kotlinx.coroutines.channels.BufferOverflow r4 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
        L11:
            r0.<init>(r1, r2, r3, r4)
            return
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @org.jetbrains.annotations.NotNull
    protected kotlinx.coroutines.flow.internal.d<T> i(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r3, int r4, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BufferOverflow r5) {
            r2 = this;
            kotlinx.coroutines.flow.internal.h r0 = new kotlinx.coroutines.flow.internal.h
            kotlinx.coroutines.flow.i<S> r1 = r2.d
            r0.<init>(r1, r3, r4, r5)
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.i<T> j() {
            r1 = this;
            kotlinx.coroutines.flow.i<S> r0 = r1.d
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.g
    @org.jetbrains.annotations.Nullable
    protected java.lang.Object r(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j<? super T> r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r3) {
            r1 = this;
            kotlinx.coroutines.flow.i<S> r0 = r1.d
            java.lang.Object r2 = r0.collect(r2, r3)
            java.lang.Object r3 = kotlin.coroutines.intrinsics.a.l()
            if (r2 != r3) goto Ld
            return r2
        Ld:
            kotlin.n1 r2 = kotlin.n1.a
            return r2
    }
}
