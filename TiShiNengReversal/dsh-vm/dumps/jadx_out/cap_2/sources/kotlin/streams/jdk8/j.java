package kotlin.streams.jdk8;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.JvmName(name = "StreamsKt")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class j {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,731:1\n31#2:732\n*E\n"})
    public static final class a<T> implements kotlin.sequences.m<T> {
        final /* synthetic */ java.util.stream.Stream a;

        public a(java.util.stream.Stream r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // kotlin.sequences.m
        public java.util.Iterator<T> iterator() {
                r2 = this;
                java.util.stream.Stream r0 = r2.a
                java.util.Iterator r0 = kotlin.streams.jdk8.i.a(r0)
                java.lang.String r1 = "iterator(...)"
                kotlin.jvm.internal.g0.o(r0, r1)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,731:1\n39#2:732\n*E\n"})
    public static final class b implements kotlin.sequences.m<java.lang.Integer> {
        final /* synthetic */ java.util.stream.IntStream a;

        public b(java.util.stream.IntStream r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // kotlin.sequences.m
        public java.util.Iterator<java.lang.Integer> iterator() {
                r2 = this;
                java.util.stream.IntStream r0 = r2.a
                java.util.PrimitiveIterator$OfInt r0 = kotlin.streams.jdk8.k.a(r0)
                java.lang.String r1 = "iterator(...)"
                kotlin.jvm.internal.g0.o(r0, r1)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,731:1\n47#2:732\n*E\n"})
    public static final class c implements kotlin.sequences.m<java.lang.Long> {
        final /* synthetic */ java.util.stream.LongStream a;

        public c(java.util.stream.LongStream r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // kotlin.sequences.m
        public java.util.Iterator<java.lang.Long> iterator() {
                r2 = this;
                java.util.stream.LongStream r0 = r2.a
                java.util.PrimitiveIterator$OfLong r0 = kotlin.streams.jdk8.l.a(r0)
                java.lang.String r1 = "iterator(...)"
                kotlin.jvm.internal.g0.o(r0, r1)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,731:1\n55#2:732\n*E\n"})
    public static final class d implements kotlin.sequences.m<java.lang.Double> {
        final /* synthetic */ java.util.stream.DoubleStream a;

        public d(java.util.stream.DoubleStream r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // kotlin.sequences.m
        public java.util.Iterator<java.lang.Double> iterator() {
                r2 = this;
                java.util.stream.DoubleStream r0 = r2.a
                java.util.PrimitiveIterator$OfDouble r0 = kotlin.streams.jdk8.m.a(r0)
                java.lang.String r1 = "iterator(...)"
                kotlin.jvm.internal.g0.o(r0, r1)
                return r0
        }
    }

    public static /* synthetic */ java.util.Spliterator a(kotlin.sequences.m r0) {
            java.util.Spliterator r0 = g(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @org.jetbrains.annotations.NotNull
    public static final kotlin.sequences.m<java.lang.Double> b(@org.jetbrains.annotations.NotNull java.util.stream.DoubleStream r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.streams.jdk8.j$d r0 = new kotlin.streams.jdk8.j$d
            r0.<init>(r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @org.jetbrains.annotations.NotNull
    public static final kotlin.sequences.m<java.lang.Integer> c(@org.jetbrains.annotations.NotNull java.util.stream.IntStream r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.streams.jdk8.j$b r0 = new kotlin.streams.jdk8.j$b
            r0.<init>(r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @org.jetbrains.annotations.NotNull
    public static final kotlin.sequences.m<java.lang.Long> d(@org.jetbrains.annotations.NotNull java.util.stream.LongStream r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.streams.jdk8.j$c r0 = new kotlin.streams.jdk8.j$c
            r0.<init>(r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlin.sequences.m<T> e(@org.jetbrains.annotations.NotNull java.util.stream.Stream<T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.streams.jdk8.j$a r0 = new kotlin.streams.jdk8.j$a
            r0.<init>(r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.stream.Stream<T> f(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.streams.jdk8.h r0 = new kotlin.streams.jdk8.h
            r0.<init>(r2)
            r2 = 16
            r1 = 0
            java.util.stream.Stream r2 = kotlin.streams.jdk8.b.a(r0, r2, r1)
            java.lang.String r0 = "stream(...)"
            kotlin.jvm.internal.g0.o(r2, r0)
            return r2
    }

    private static final java.util.Spliterator g(kotlin.sequences.m r1) {
            java.util.Iterator r1 = r1.iterator()
            r0 = 16
            java.util.Spliterator r1 = kotlin.streams.jdk8.a.a(r1, r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.2")
    @org.jetbrains.annotations.NotNull
    public static final java.util.List<java.lang.Double> h(@org.jetbrains.annotations.NotNull java.util.stream.DoubleStream r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            double[] r1 = kotlin.streams.jdk8.g.a(r1)
            java.lang.String r0 = "toArray(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            java.util.List r1 = kotlin.collections.n.p(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.2")
    @org.jetbrains.annotations.NotNull
    public static final java.util.List<java.lang.Integer> i(@org.jetbrains.annotations.NotNull java.util.stream.IntStream r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int[] r1 = kotlin.streams.jdk8.f.a(r1)
            java.lang.String r0 = "toArray(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            java.util.List r1 = kotlin.collections.n.r(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.2")
    @org.jetbrains.annotations.NotNull
    public static final java.util.List<java.lang.Long> j(@org.jetbrains.annotations.NotNull java.util.stream.LongStream r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            long[] r1 = kotlin.streams.jdk8.e.a(r1)
            java.lang.String r0 = "toArray(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            java.util.List r1 = kotlin.collections.n.s(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.2")
    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.List<T> k(@org.jetbrains.annotations.NotNull java.util.stream.Stream<T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.stream.Collector r0 = kotlin.streams.jdk8.c.a()
            java.lang.Object r1 = kotlin.streams.jdk8.d.a(r1, r0)
            java.lang.String r0 = "collect(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            java.util.List r1 = (java.util.List) r1
            return r1
    }
}
