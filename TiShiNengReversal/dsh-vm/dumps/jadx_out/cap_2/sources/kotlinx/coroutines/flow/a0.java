package kotlinx.coroutines.flow;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedFlow.kt\nkotlinx/coroutines/flow/SharedFlowSlot\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,731:1\n1#2:732\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class a0 extends kotlinx.coroutines.flow.internal.c<kotlinx.coroutines.flow.y<?>> {

    @kotlin.jvm.JvmField
    public long a;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.Nullable
    public kotlin.coroutines.e<? super kotlin.n1> b;

    public a0() {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.a = r0
            return
    }

    @Override // kotlinx.coroutines.flow.internal.c
    public /* bridge */ /* synthetic */ boolean a(kotlinx.coroutines.flow.y<?> r1) {
            r0 = this;
            kotlinx.coroutines.flow.y r1 = (kotlinx.coroutines.flow.y) r1
            boolean r1 = r0.c(r1)
            return r1
    }

    @Override // kotlinx.coroutines.flow.internal.c
    public /* bridge */ /* synthetic */ kotlin.coroutines.e[] b(kotlinx.coroutines.flow.y<?> r1) {
            r0 = this;
            kotlinx.coroutines.flow.y r1 = (kotlinx.coroutines.flow.y) r1
            kotlin.coroutines.e[] r1 = r0.d(r1)
            return r1
    }

    public boolean c(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.y<?> r6) {
            r5 = this;
            long r0 = r5.a
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto La
            r6 = 0
            return r6
        La:
            long r0 = r6.b0()
            r5.a = r0
            r6 = 1
            return r6
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.coroutines.e<kotlin.n1>[] d(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.y<?> r5) {
            r4 = this;
            long r0 = r4.a
            r2 = -1
            r4.a = r2
            r2 = 0
            r4.b = r2
            kotlin.coroutines.e[] r5 = r5.a0(r0)
            return r5
    }
}
