package kotlinx.coroutines.flow;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class f<T> extends kotlinx.coroutines.flow.internal.d<T> {

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.z<? super T>, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> d;

    public f(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.channels.z<? super T>, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r2, int r3, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BufferOverflow r4) {
            r0 = this;
            r0.<init>(r2, r3, r4)
            r0.d = r1
            return
    }

    public /* synthetic */ f(kotlin.jvm.functions.Function2 r1, kotlin.coroutines.i r2, int r3, kotlinx.coroutines.channels.BufferOverflow r4, int r5, kotlin.jvm.internal.v r6) {
            r0 = this;
            r6 = r5 & 2
            if (r6 == 0) goto L6
            kotlin.coroutines.EmptyCoroutineContext r2 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
        L6:
            r6 = r5 & 4
            if (r6 == 0) goto Lb
            r3 = -2
        Lb:
            r5 = r5 & 8
            if (r5 == 0) goto L11
            kotlinx.coroutines.channels.BufferOverflow r4 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
        L11:
            r0.<init>(r1, r2, r3, r4)
            return
    }

    static /* synthetic */ <T> java.lang.Object n(kotlinx.coroutines.flow.f<T> r0, kotlinx.coroutines.channels.z<? super T> r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
            kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.z<? super T>, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> r0 = r0.d
            java.lang.Object r0 = r0.invoke(r1, r2)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            if (r0 != r1) goto Ld
            return r0
        Ld:
            kotlin.n1 r0 = kotlin.n1.a
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @org.jetbrains.annotations.Nullable
    protected java.lang.Object h(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.z<? super T> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r2) {
            r0 = this;
            java.lang.Object r1 = n(r0, r1, r2)
            return r1
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @org.jetbrains.annotations.NotNull
    protected kotlinx.coroutines.flow.internal.d<T> i(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r3, int r4, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BufferOverflow r5) {
            r2 = this;
            kotlinx.coroutines.flow.f r0 = new kotlinx.coroutines.flow.f
            kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.z<? super T>, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> r1 = r2.d
            r0.<init>(r1, r3, r4, r5)
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "block["
            r0.append(r1)
            kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.z<? super T>, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = "] -> "
            r0.append(r1)
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
