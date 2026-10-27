package kotlinx.coroutines.flow;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,354:1\n107#2:355\n107#2:356\n107#2:357\n107#2:358\n107#2:359\n107#2:360\n107#2:361\n107#2:362\n107#2:363\n107#2:364\n107#2:365\n107#2:366\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n68#1:355\n82#1:356\n89#1:357\n98#1:358\n107#1:359\n122#1:360\n131#1:361\n153#1:362\n164#1:363\n175#1:364\n184#1:365\n193#1:366\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final /* synthetic */ class FlowKt__BuildersKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n1#1,113:1\n69#2,2:114\n*E\n"})
    public static final class a<T> implements kotlinx.coroutines.flow.i<T> {
        final /* synthetic */ kotlin.jvm.functions.Function0 a;

        public a(kotlin.jvm.functions.Function0 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // kotlinx.coroutines.flow.i
        @org.jetbrains.annotations.Nullable
        public java.lang.Object collect(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j<? super T> r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r3) {
                r1 = this;
                kotlin.jvm.functions.Function0 r0 = r1.a
                java.lang.Object r0 = r0.invoke()
                java.lang.Object r2 = r2.emit(r0, r3)
                java.lang.Object r3 = kotlin.coroutines.intrinsics.a.l()
                if (r2 != r3) goto L11
                return r2
            L11:
                kotlin.n1 r2 = kotlin.n1.a
                return r2
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n1#1,113:1\n136#2,2:114\n*E\n"})
    public static final class b<T> implements kotlinx.coroutines.flow.i<T> {
        final /* synthetic */ java.lang.Object a;

        public b(java.lang.Object r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // kotlinx.coroutines.flow.i
        @org.jetbrains.annotations.Nullable
        public java.lang.Object collect(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j<? super T> r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r3) {
                r1 = this;
                java.lang.Object r0 = r1.a
                java.lang.Object r2 = r2.emit(r0, r3)
                java.lang.Object r3 = kotlin.coroutines.intrinsics.a.l()
                if (r2 != r3) goto Ld
                return r2
            Ld:
                kotlin.n1 r2 = kotlin.n1.a
                return r2
        }
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> a(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r1) {
            kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3 r0 = new kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> b(@org.jetbrains.annotations.NotNull java.util.Iterator<? extends T> r1) {
            kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$4 r0 = new kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$4
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> c(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r1) {
            kotlinx.coroutines.flow.FlowKt__BuildersKt$a r0 = new kotlinx.coroutines.flow.FlowKt__BuildersKt$a
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> d(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.coroutines.e<? super T>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2 r0 = new kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.flow.i<java.lang.Integer> e(@org.jetbrains.annotations.NotNull kotlin.ranges.m r1) {
            kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$9 r0 = new kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$9
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.flow.i<java.lang.Long> f(@org.jetbrains.annotations.NotNull kotlin.ranges.p r1) {
            kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$10 r0 = new kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$10
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> g(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r1) {
            kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5 r0 = new kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.flow.i<java.lang.Integer> h(@org.jetbrains.annotations.NotNull int[] r1) {
            kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7 r0 = new kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.flow.i<java.lang.Long> i(@org.jetbrains.annotations.NotNull long[] r1) {
            kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8 r0 = new kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> j(@org.jetbrains.annotations.NotNull T[] r1) {
            kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6 r0 = new kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> k(@kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.channels.z<? super T>, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r7) {
            kotlinx.coroutines.flow.b r0 = new kotlinx.coroutines.flow.b
            r5 = 14
            r6 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> l(@kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.channels.z<? super T>, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r7) {
            kotlinx.coroutines.flow.f r0 = new kotlinx.coroutines.flow.f
            r5 = 14
            r6 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> m() {
            kotlinx.coroutines.flow.h r0 = kotlinx.coroutines.flow.h.a
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> n(@kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.flow.j<? super T>, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.w r0 = new kotlinx.coroutines.flow.w
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> o(T r1) {
            kotlinx.coroutines.flow.FlowKt__BuildersKt$b r0 = new kotlinx.coroutines.flow.FlowKt__BuildersKt$b
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> p(@org.jetbrains.annotations.NotNull T... r1) {
            kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1 r0 = new kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1
            r0.<init>(r1)
            return r0
    }
}
