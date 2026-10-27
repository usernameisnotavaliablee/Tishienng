package kotlin.sequences;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class q {
    private static final int a = 0;
    private static final int b = 1;
    private static final int c = 2;
    private static final int d = 3;
    private static final int e = 4;
    private static final int f = 5;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 SequenceBuilder.kt\nkotlin/sequences/SequencesKt__SequenceBuilderKt\n*L\n1#1,731:1\n26#2:732\n*E\n"})
    public static final class a<T> implements kotlin.sequences.m<T> {
        final /* synthetic */ kotlin.jvm.functions.Function2 a;

        public a(kotlin.jvm.functions.Function2 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // kotlin.sequences.m
        public java.util.Iterator<T> iterator() {
                r1 = this;
                kotlin.jvm.functions.Function2 r0 = r1.a
                java.util.Iterator r0 = kotlin.sequences.q.a(r0)
                return r0
        }
    }

    public q() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.SinceKotlin(version = "1.3")
    @org.jetbrains.annotations.NotNull
    public static <T> java.util.Iterator<T> a(@kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlin.sequences.o<? super T>, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r1) {
            java.lang.String r0 = "block"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.sequences.n r0 = new kotlin.sequences.n
            r0.<init>()
            kotlin.coroutines.e r1 = kotlin.coroutines.intrinsics.a.c(r1, r0, r0)
            r0.m(r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    @org.jetbrains.annotations.NotNull
    public static <T> kotlin.sequences.m<T> b(@kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlin.sequences.o<? super T>, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r1) {
            java.lang.String r0 = "block"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.sequences.q$a r0 = new kotlin.sequences.q$a
            r0.<init>(r1)
            return r0
    }
}
