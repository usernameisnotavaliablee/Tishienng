package kotlinx.coroutines.flow;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedFlow.kt\nkotlinx/coroutines/flow/SharedFlowKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,731:1\n1#2:732\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class z {

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.internal.s0 a = null;

    static {
            kotlinx.coroutines.internal.s0 r0 = new kotlinx.coroutines.internal.s0
            java.lang.String r1 = "NO_VALUE"
            r0.<init>(r1)
            kotlinx.coroutines.flow.z.a = r0
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.s<T> a(int r1, int r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BufferOverflow r3) {
            if (r1 < 0) goto L4f
            if (r2 < 0) goto L34
            if (r1 > 0) goto L28
            if (r2 > 0) goto L28
            kotlinx.coroutines.channels.BufferOverflow r0 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            if (r3 != r0) goto Ld
            goto L28
        Ld:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L28:
            int r2 = r2 + r1
            if (r2 >= 0) goto L2e
            r2 = 2147483647(0x7fffffff, float:NaN)
        L2e:
            kotlinx.coroutines.flow.y r0 = new kotlinx.coroutines.flow.y
            r0.<init>(r1, r2, r3)
            return r0
        L34:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "extraBufferCapacity cannot be negative, but was "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L4f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "replay cannot be negative, but was "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
    }

    public static /* synthetic */ kotlinx.coroutines.flow.s b(int r1, int r2, kotlinx.coroutines.channels.BufferOverflow r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            r0 = 0
            if (r5 == 0) goto L6
            r1 = 0
        L6:
            r5 = r4 & 2
            if (r5 == 0) goto Lb
            r2 = 0
        Lb:
            r4 = r4 & 4
            if (r4 == 0) goto L11
            kotlinx.coroutines.channels.BufferOverflow r3 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
        L11:
            kotlinx.coroutines.flow.s r1 = a(r1, r2, r3)
            return r1
    }

    public static final /* synthetic */ java.lang.Object c(java.lang.Object[] r0, long r1) {
            java.lang.Object r0 = f(r0, r1)
            return r0
    }

    public static final /* synthetic */ void d(java.lang.Object[] r0, long r1, java.lang.Object r3) {
            g(r0, r1, r3)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> e(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.x<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r2, int r3, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BufferOverflow r4) {
            if (r3 == 0) goto L5
            r0 = -3
            if (r3 != r0) goto La
        L5:
            kotlinx.coroutines.channels.BufferOverflow r0 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            if (r4 != r0) goto La
            return r1
        La:
            kotlinx.coroutines.flow.internal.h r0 = new kotlinx.coroutines.flow.internal.h
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    private static final java.lang.Object f(java.lang.Object[] r0, long r1) {
            int r2 = (int) r1
            int r1 = r0.length
            int r1 = r1 + (-1)
            r1 = r1 & r2
            r0 = r0[r1]
            return r0
    }

    private static final void g(java.lang.Object[] r0, long r1, java.lang.Object r3) {
            int r2 = (int) r1
            int r1 = r0.length
            int r1 = r1 + (-1)
            r1 = r1 & r2
            r0[r1] = r3
            return
    }
}
