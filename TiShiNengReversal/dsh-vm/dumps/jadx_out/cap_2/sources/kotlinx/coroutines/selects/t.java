package kotlinx.coroutines.selects;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nWhileSelect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WhileSelect.kt\nkotlinx/coroutines/selects/WhileSelectKt\n+ 2 Select.kt\nkotlinx/coroutines/selects/SelectKt\n*L\n1#1,33:1\n55#2,8:34\n*S KotlinDebug\n*F\n+ 1 WhileSelect.kt\nkotlinx/coroutines/selects/WhileSelectKt\n*L\n31#1:34,8\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class t {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.selects.WhileSelectKt", f = "WhileSelect.kt", i = {0}, l = {41}, m = "whileSelect", n = {"builder"}, s = {"L$0"})
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nWhileSelect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WhileSelect.kt\nkotlinx/coroutines/selects/WhileSelectKt$whileSelect$1\n*L\n1#1,33:1\n*E\n"})
    static final class a extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object a;
        /* synthetic */ java.lang.Object b;
        int c;

        a(kotlin.coroutines.e<? super kotlinx.coroutines.selects.t.a> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.b = r2
                int r2 = r1.c
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.c = r2
                r2 = 0
                java.lang.Object r2 = kotlinx.coroutines.selects.t.a(r2, r1)
                return r2
        }
    }

    @kotlinx.coroutines.ExperimentalCoroutinesApi
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object a(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlinx.coroutines.selects.c<? super java.lang.Boolean>, kotlin.n1> r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r5) {
            boolean r0 = r5 instanceof kotlinx.coroutines.selects.t.a
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.selects.t$a r0 = (kotlinx.coroutines.selects.t.a) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            kotlinx.coroutines.selects.t$a r0 = new kotlinx.coroutines.selects.t$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.a
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            kotlin.g0.n(r5)
            goto L4f
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.g0.n(r5)
        L38:
            kotlinx.coroutines.selects.l r5 = new kotlinx.coroutines.selects.l
            kotlin.coroutines.i r2 = r0.getContext()
            r5.<init>(r2)
            r4.invoke(r5)
            r0.a = r4
            r0.c = r3
            java.lang.Object r5 = r5.y(r0)
            if (r5 != r1) goto L4f
            return r1
        L4f:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L38
            kotlin.n1 r4 = kotlin.n1.a
            return r4
    }

    @kotlinx.coroutines.ExperimentalCoroutinesApi
    private static final java.lang.Object b(kotlin.jvm.functions.Function1<? super kotlinx.coroutines.selects.c<? super java.lang.Boolean>, kotlin.n1> r0, kotlin.coroutines.e<? super kotlin.n1> r1) {
            kotlinx.coroutines.selects.l r0 = new kotlinx.coroutines.selects.l
            r0 = 3
            kotlin.jvm.internal.d0.e(r0)
            r0 = 0
            throw r0
    }
}
