package kotlinx.coroutines.flow;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class m0<T> implements kotlinx.coroutines.flow.x<T> {

    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.x<T> a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.j<? super T>, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.SubscribedSharedFlow", f = "Share.kt", i = {}, l = {409}, m = "collect", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        /* synthetic */ java.lang.Object a;
        final /* synthetic */ kotlinx.coroutines.flow.m0<T> b;
        int c;

        a(kotlinx.coroutines.flow.m0<T> r1, kotlin.coroutines.e<? super kotlinx.coroutines.flow.m0.a> r2) {
                r0 = this;
                r0.b = r1
                r0.<init>(r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.a = r2
                int r2 = r1.c
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.c = r2
                kotlinx.coroutines.flow.m0<T> r2 = r1.b
                r0 = 0
                java.lang.Object r2 = r2.collect(r0, r1)
                return r2
        }
    }

    public m0(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.x<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.flow.j<? super T>, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // kotlinx.coroutines.flow.x
    @org.jetbrains.annotations.NotNull
    public java.util.List<T> a() {
            r1 = this;
            kotlinx.coroutines.flow.x<T> r0 = r1.a
            java.util.List r0 = r0.a()
            return r0
    }

    @Override // kotlinx.coroutines.flow.x, kotlinx.coroutines.flow.i
    @org.jetbrains.annotations.Nullable
    public java.lang.Object collect(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j<? super T> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r7) {
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.m0.a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.m0$a r0 = (kotlinx.coroutines.flow.m0.a) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.m0$a r0 = new kotlinx.coroutines.flow.m0$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2d:
            kotlin.g0.n(r7)
            goto L46
        L31:
            kotlin.g0.n(r7)
            kotlinx.coroutines.flow.x<T> r7 = r5.a
            kotlinx.coroutines.flow.l0 r2 = new kotlinx.coroutines.flow.l0
            kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.j<? super T>, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> r4 = r5.b
            r2.<init>(r6, r4)
            r0.c = r3
            java.lang.Object r6 = r7.collect(r2, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException
            r6.<init>()
            throw r6
    }
}
