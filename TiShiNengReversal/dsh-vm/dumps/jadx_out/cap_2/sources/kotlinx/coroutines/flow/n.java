package kotlinx.coroutines.flow;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final /* synthetic */ class n {
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.4.0, binary compatibility with earlier versions")
    public static final /* synthetic */ kotlinx.coroutines.flow.i a(kotlinx.coroutines.flow.i r2, int r3) {
            r0 = 0
            r1 = 2
            kotlinx.coroutines.flow.i r2 = kotlinx.coroutines.flow.k.q(r2, r3, r0, r1, r0)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> b(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r7, int r8, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BufferOverflow r9) {
            r0 = -1
            if (r8 >= 0) goto L24
            r1 = -2
            if (r8 == r1) goto L24
            if (r8 != r0) goto L9
            goto L24
        L9:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was "
            r7.append(r9)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        L24:
            if (r8 != r0) goto L33
            kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            if (r9 != r1) goto L2b
            goto L33
        L2b:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "CONFLATED capacity cannot be used with non-default onBufferOverflow"
            r7.<init>(r8)
            throw r7
        L33:
            if (r8 != r0) goto L3b
            kotlinx.coroutines.channels.BufferOverflow r9 = kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST
            r8 = 0
            r2 = 0
        L39:
            r3 = r9
            goto L3d
        L3b:
            r2 = r8
            goto L39
        L3d:
            boolean r8 = r7 instanceof kotlinx.coroutines.flow.internal.p
            if (r8 == 0) goto L4c
            r0 = r7
            kotlinx.coroutines.flow.internal.p r0 = (kotlinx.coroutines.flow.internal.p) r0
            r4 = 1
            r5 = 0
            r1 = 0
            kotlinx.coroutines.flow.i r7 = kotlinx.coroutines.flow.internal.p.a.a(r0, r1, r2, r3, r4, r5)
            return r7
        L4c:
            kotlinx.coroutines.flow.internal.h r0 = new kotlinx.coroutines.flow.internal.h
            r5 = 2
            r6 = 0
            r4 = r3
            r3 = r2
            r2 = 0
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.flow.i c(kotlinx.coroutines.flow.i r0, int r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = -2
        L5:
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.k.n(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.flow.i d(kotlinx.coroutines.flow.i r0, int r1, kotlinx.coroutines.channels.BufferOverflow r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = -2
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Lb
            kotlinx.coroutines.channels.BufferOverflow r2 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
        Lb:
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.k.o(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> e(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r1) {
            boolean r0 = r1 instanceof kotlinx.coroutines.flow.c
            if (r0 == 0) goto L5
            return r1
        L5:
            kotlinx.coroutines.flow.d r0 = new kotlinx.coroutines.flow.d
            r0.<init>(r1)
            return r0
    }

    private static final void f(kotlin.coroutines.i r2) {
            kotlinx.coroutines.e2$b r0 = kotlinx.coroutines.e2.s0
            kotlin.coroutines.i$b r0 = r2.get(r0)
            if (r0 != 0) goto L9
            return
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Flow context cannot contain job in it. Had "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> g(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r3) {
            r0 = 0
            r1 = 2
            r2 = -1
            kotlinx.coroutines.flow.i r3 = kotlinx.coroutines.flow.k.q(r3, r2, r0, r1, r0)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> h(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r8) {
            f(r8)
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            boolean r0 = kotlin.jvm.internal.g0.g(r8, r0)
            if (r0 == 0) goto Lc
            return r7
        Lc:
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.internal.p
            if (r0 == 0) goto L1d
            r1 = r7
            kotlinx.coroutines.flow.internal.p r1 = (kotlinx.coroutines.flow.internal.p) r1
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r2 = r8
            kotlinx.coroutines.flow.i r7 = kotlinx.coroutines.flow.internal.p.a.a(r1, r2, r3, r4, r5, r6)
            return r7
        L1d:
            r2 = r8
            kotlinx.coroutines.flow.internal.h r0 = new kotlinx.coroutines.flow.internal.h
            r5 = 12
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
    }
}
