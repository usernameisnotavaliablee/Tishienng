package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/ThreadLocalEventLoop\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,543:1\n1#2:544\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class g3 {

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.g3 a = null;

    @org.jetbrains.annotations.NotNull
    private static final java.lang.ThreadLocal<kotlinx.coroutines.n1> b = null;

    static {
            kotlinx.coroutines.g3 r0 = new kotlinx.coroutines.g3
            r0.<init>()
            kotlinx.coroutines.g3.a = r0
            kotlinx.coroutines.internal.s0 r0 = new kotlinx.coroutines.internal.s0
            java.lang.String r1 = "ThreadLocalEventLoop"
            r0.<init>(r1)
            java.lang.ThreadLocal r0 = kotlinx.coroutines.internal.b1.b(r0)
            kotlinx.coroutines.g3.b = r0
            return
    }

    private g3() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.Nullable
    public final kotlinx.coroutines.n1 a() {
            r1 = this;
            java.lang.ThreadLocal<kotlinx.coroutines.n1> r0 = kotlinx.coroutines.g3.b
            java.lang.Object r0 = r0.get()
            kotlinx.coroutines.n1 r0 = (kotlinx.coroutines.n1) r0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.n1 b() {
            r2 = this;
            java.lang.ThreadLocal<kotlinx.coroutines.n1> r0 = kotlinx.coroutines.g3.b
            java.lang.Object r1 = r0.get()
            kotlinx.coroutines.n1 r1 = (kotlinx.coroutines.n1) r1
            if (r1 != 0) goto L11
            kotlinx.coroutines.n1 r1 = kotlinx.coroutines.q1.a()
            r0.set(r1)
        L11:
            return r1
    }

    public final void c() {
            r2 = this;
            java.lang.ThreadLocal<kotlinx.coroutines.n1> r0 = kotlinx.coroutines.g3.b
            r1 = 0
            r0.set(r1)
            return
    }

    public final void d(@org.jetbrains.annotations.NotNull kotlinx.coroutines.n1 r2) {
            r1 = this;
            java.lang.ThreadLocal<kotlinx.coroutines.n1> r0 = kotlinx.coroutines.g3.b
            r0.set(r2)
            return
    }
}
