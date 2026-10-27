package kotlinx.coroutines.flow;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nStateFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,428:1\n1#2:429\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class j0 {

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.internal.s0 a = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.internal.s0 b = null;

    static {
            kotlinx.coroutines.internal.s0 r0 = new kotlinx.coroutines.internal.s0
            java.lang.String r1 = "NONE"
            r0.<init>(r1)
            kotlinx.coroutines.flow.j0.a = r0
            kotlinx.coroutines.internal.s0 r0 = new kotlinx.coroutines.internal.s0
            java.lang.String r1 = "PENDING"
            r0.<init>(r1)
            kotlinx.coroutines.flow.j0.b = r0
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.t<T> a(T r1) {
            kotlinx.coroutines.flow.i0 r0 = new kotlinx.coroutines.flow.i0
            if (r1 != 0) goto L6
            kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.flow.internal.s.a
        L6:
            r0.<init>(r1)
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.s0 b() {
            kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.flow.j0.a
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.s0 c() {
            kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.flow.j0.b
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> d(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.h0<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r2, int r3, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BufferOverflow r4) {
            if (r3 < 0) goto L6
            r0 = 2
            if (r3 >= r0) goto L6
            goto L9
        L6:
            r0 = -2
            if (r3 != r0) goto Le
        L9:
            kotlinx.coroutines.channels.BufferOverflow r0 = kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST
            if (r4 != r0) goto Le
            return r1
        Le:
            kotlinx.coroutines.flow.i r1 = kotlinx.coroutines.flow.z.e(r1, r2, r3, r4)
            return r1
    }

    public static final <T> T e(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.t<T> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends T> r3) {
        L0:
            java.lang.Object r0 = r2.getValue()
            java.lang.Object r1 = r3.invoke(r0)
            boolean r1 = r2.compareAndSet(r0, r1)
            if (r1 == 0) goto L0
            return r0
    }

    public static final <T> T f(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.t<T> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends T> r3) {
        L0:
            java.lang.Object r0 = r2.getValue()
            java.lang.Object r1 = r3.invoke(r0)
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 == 0) goto L0
            return r1
    }

    public static final <T> void update(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.t<T> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends T> r3) {
        L0:
            java.lang.Object r0 = r2.getValue()
            java.lang.Object r1 = r3.invoke(r0)
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 == 0) goto L0
            return
    }
}
