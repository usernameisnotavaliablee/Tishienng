package kotlinx.coroutines.channels;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class m {
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.4.0, binary compatibility with earlier versions")
    public static final /* synthetic */ kotlinx.coroutines.channels.j a(int r2) {
            r0 = 0
            r1 = 6
            kotlinx.coroutines.channels.j r2 = d(r2, r0, r0, r1, r0)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final <E> kotlinx.coroutines.channels.j<E> b(int r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BufferOverflow r3, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super E, kotlin.n1> r4) {
            r0 = -2
            r1 = 1
            if (r2 == r0) goto L49
            r0 = -1
            if (r2 == r0) goto L35
            if (r2 == 0) goto L24
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r2 == r0) goto L1e
            kotlinx.coroutines.channels.BufferOverflow r0 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            if (r3 != r0) goto L18
            kotlinx.coroutines.channels.BufferedChannel r3 = new kotlinx.coroutines.channels.BufferedChannel
            r3.<init>(r2, r4)
            return r3
        L18:
            kotlinx.coroutines.channels.u r0 = new kotlinx.coroutines.channels.u
            r0.<init>(r2, r3, r4)
            return r0
        L1e:
            kotlinx.coroutines.channels.BufferedChannel r2 = new kotlinx.coroutines.channels.BufferedChannel
            r2.<init>(r0, r4)
            return r2
        L24:
            kotlinx.coroutines.channels.BufferOverflow r2 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            if (r3 != r2) goto L2f
            kotlinx.coroutines.channels.BufferedChannel r2 = new kotlinx.coroutines.channels.BufferedChannel
            r3 = 0
            r2.<init>(r3, r4)
            return r2
        L2f:
            kotlinx.coroutines.channels.u r2 = new kotlinx.coroutines.channels.u
            r2.<init>(r1, r3, r4)
            return r2
        L35:
            kotlinx.coroutines.channels.BufferOverflow r2 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            if (r3 != r2) goto L41
            kotlinx.coroutines.channels.u r2 = new kotlinx.coroutines.channels.u
            kotlinx.coroutines.channels.BufferOverflow r3 = kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST
            r2.<init>(r1, r3, r4)
            return r2
        L41:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "CONFLATED capacity cannot be used with non-default onBufferOverflow"
            r2.<init>(r3)
            throw r2
        L49:
            kotlinx.coroutines.channels.BufferOverflow r2 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            if (r3 != r2) goto L59
            kotlinx.coroutines.channels.BufferedChannel r2 = new kotlinx.coroutines.channels.BufferedChannel
            kotlinx.coroutines.channels.j$b r3 = kotlinx.coroutines.channels.j.t0
            int r3 = r3.a()
            r2.<init>(r3, r4)
            return r2
        L59:
            kotlinx.coroutines.channels.u r2 = new kotlinx.coroutines.channels.u
            r2.<init>(r1, r3, r4)
            return r2
    }

    public static /* synthetic */ kotlinx.coroutines.channels.j c(int r0, int r1, java.lang.Object r2) {
            r1 = r1 & 1
            if (r1 == 0) goto L5
            r0 = 0
        L5:
            kotlinx.coroutines.channels.j r0 = a(r0)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.channels.j d(int r0, kotlinx.coroutines.channels.BufferOverflow r1, kotlin.jvm.functions.Function1 r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r0 = 0
        L5:
            r4 = r3 & 2
            if (r4 == 0) goto Lb
            kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
        Lb:
            r3 = r3 & 4
            if (r3 == 0) goto L10
            r2 = 0
        L10:
            kotlinx.coroutines.channels.j r0 = b(r0, r1, r2)
            return r0
    }

    public static final <T> T e(@org.jetbrains.annotations.NotNull java.lang.Object r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Throwable, ? extends T> r2) {
            boolean r0 = r1 instanceof kotlinx.coroutines.channels.n.c
            if (r0 == 0) goto Lc
            java.lang.Throwable r1 = kotlinx.coroutines.channels.n.f(r1)
            java.lang.Object r1 = r2.invoke(r1)
        Lc:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.lang.Object f(@org.jetbrains.annotations.NotNull java.lang.Object r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.n1> r2) {
            boolean r0 = r1 instanceof kotlinx.coroutines.channels.n.a
            if (r0 == 0) goto Lb
            java.lang.Throwable r0 = kotlinx.coroutines.channels.n.f(r1)
            r2.invoke(r0)
        Lb:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.lang.Object g(@org.jetbrains.annotations.NotNull java.lang.Object r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.n1> r2) {
            boolean r0 = r1 instanceof kotlinx.coroutines.channels.n.c
            if (r0 == 0) goto Lb
            java.lang.Throwable r0 = kotlinx.coroutines.channels.n.f(r1)
            r2.invoke(r0)
        Lb:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.lang.Object h(@org.jetbrains.annotations.NotNull java.lang.Object r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, kotlin.n1> r2) {
            boolean r0 = r1 instanceof kotlinx.coroutines.channels.n.c
            if (r0 != 0) goto L7
            r2.invoke(r1)
        L7:
            return r1
    }
}
