package kotlin.collections.unsigned;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class b {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a extends kotlin.collections.d<kotlin.z0> implements java.util.RandomAccess {
        final /* synthetic */ int[] a;

        a(int[] r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // kotlin.collections.b, java.util.Collection
        public final /* bridge */ boolean contains(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof kotlin.z0
                if (r0 != 0) goto L6
                r2 = 0
                return r2
            L6:
                kotlin.z0 r2 = (kotlin.z0) r2
                int r2 = r2.q0()
                boolean r2 = r1.e(r2)
                return r2
        }

        public boolean e(int r2) {
                r1 = this;
                int[] r0 = r1.a
                boolean r2 = kotlin.a1.j(r0, r2)
                return r2
        }

        public int f(int r2) {
                r1 = this;
                int[] r0 = r1.a
                int r2 = kotlin.a1.p(r0, r2)
                return r2
        }

        public int g(int r2) {
                r1 = this;
                int[] r0 = r1.a
                int r2 = kotlin.collections.n.Zf(r0, r2)
                return r2
        }

        @Override // kotlin.collections.d, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                r0 = this;
                int r1 = r0.f(r1)
                kotlin.z0 r1 = kotlin.z0.b(r1)
                return r1
        }

        @Override // kotlin.collections.d, kotlin.collections.b
        public int getSize() {
                r1 = this;
                int[] r0 = r1.a
                int r0 = kotlin.a1.r(r0)
                return r0
        }

        @Override // kotlin.collections.d, java.util.List
        public final /* bridge */ int indexOf(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof kotlin.z0
                if (r0 != 0) goto L6
                r2 = -1
                return r2
            L6:
                kotlin.z0 r2 = (kotlin.z0) r2
                int r2 = r2.q0()
                int r2 = r1.g(r2)
                return r2
        }

        @Override // kotlin.collections.b, java.util.Collection
        public boolean isEmpty() {
                r1 = this;
                int[] r0 = r1.a
                boolean r0 = kotlin.a1.v(r0)
                return r0
        }

        public int j(int r2) {
                r1 = this;
                int[] r0 = r1.a
                int r2 = kotlin.collections.n.di(r0, r2)
                return r2
        }

        @Override // kotlin.collections.d, java.util.List
        public final /* bridge */ int lastIndexOf(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof kotlin.z0
                if (r0 != 0) goto L6
                r2 = -1
                return r2
            L6:
                kotlin.z0 r2 = (kotlin.z0) r2
                int r2 = r2.q0()
                int r2 = r1.j(r2)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: kotlin.collections.unsigned.b$b, reason: collision with other inner class name */
    public static final class C0013b extends kotlin.collections.d<kotlin.d1> implements java.util.RandomAccess {
        final /* synthetic */ long[] a;

        C0013b(long[] r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // kotlin.collections.b, java.util.Collection
        public final /* bridge */ boolean contains(java.lang.Object r3) {
                r2 = this;
                boolean r0 = r3 instanceof kotlin.d1
                if (r0 != 0) goto L6
                r3 = 0
                return r3
            L6:
                kotlin.d1 r3 = (kotlin.d1) r3
                long r0 = r3.q0()
                boolean r3 = r2.e(r0)
                return r3
        }

        public boolean e(long r2) {
                r1 = this;
                long[] r0 = r1.a
                boolean r2 = kotlin.e1.j(r0, r2)
                return r2
        }

        public long f(int r3) {
                r2 = this;
                long[] r0 = r2.a
                long r0 = kotlin.e1.p(r0, r3)
                return r0
        }

        public int g(long r2) {
                r1 = this;
                long[] r0 = r1.a
                int r2 = kotlin.collections.n.ag(r0, r2)
                return r2
        }

        @Override // kotlin.collections.d, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object get(int r3) {
                r2 = this;
                long r0 = r2.f(r3)
                kotlin.d1 r3 = kotlin.d1.b(r0)
                return r3
        }

        @Override // kotlin.collections.d, kotlin.collections.b
        public int getSize() {
                r1 = this;
                long[] r0 = r1.a
                int r0 = kotlin.e1.r(r0)
                return r0
        }

        @Override // kotlin.collections.d, java.util.List
        public final /* bridge */ int indexOf(java.lang.Object r3) {
                r2 = this;
                boolean r0 = r3 instanceof kotlin.d1
                if (r0 != 0) goto L6
                r3 = -1
                return r3
            L6:
                kotlin.d1 r3 = (kotlin.d1) r3
                long r0 = r3.q0()
                int r3 = r2.g(r0)
                return r3
        }

        @Override // kotlin.collections.b, java.util.Collection
        public boolean isEmpty() {
                r1 = this;
                long[] r0 = r1.a
                boolean r0 = kotlin.e1.v(r0)
                return r0
        }

        public int j(long r2) {
                r1 = this;
                long[] r0 = r1.a
                int r2 = kotlin.collections.n.ei(r0, r2)
                return r2
        }

        @Override // kotlin.collections.d, java.util.List
        public final /* bridge */ int lastIndexOf(java.lang.Object r3) {
                r2 = this;
                boolean r0 = r3 instanceof kotlin.d1
                if (r0 != 0) goto L6
                r3 = -1
                return r3
            L6:
                kotlin.d1 r3 = (kotlin.d1) r3
                long r0 = r3.q0()
                int r3 = r2.j(r0)
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class c extends kotlin.collections.d<kotlin.v0> implements java.util.RandomAccess {
        final /* synthetic */ byte[] a;

        c(byte[] r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // kotlin.collections.b, java.util.Collection
        public final /* bridge */ boolean contains(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof kotlin.v0
                if (r0 != 0) goto L6
                r2 = 0
                return r2
            L6:
                kotlin.v0 r2 = (kotlin.v0) r2
                byte r2 = r2.o0()
                boolean r2 = r1.e(r2)
                return r2
        }

        public boolean e(byte r2) {
                r1 = this;
                byte[] r0 = r1.a
                boolean r2 = kotlin.w0.j(r0, r2)
                return r2
        }

        public byte f(int r2) {
                r1 = this;
                byte[] r0 = r1.a
                byte r2 = kotlin.w0.p(r0, r2)
                return r2
        }

        public int g(byte r2) {
                r1 = this;
                byte[] r0 = r1.a
                int r2 = kotlin.collections.n.Vf(r0, r2)
                return r2
        }

        @Override // kotlin.collections.d, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                r0 = this;
                byte r1 = r0.f(r1)
                kotlin.v0 r1 = kotlin.v0.b(r1)
                return r1
        }

        @Override // kotlin.collections.d, kotlin.collections.b
        public int getSize() {
                r1 = this;
                byte[] r0 = r1.a
                int r0 = kotlin.w0.r(r0)
                return r0
        }

        @Override // kotlin.collections.d, java.util.List
        public final /* bridge */ int indexOf(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof kotlin.v0
                if (r0 != 0) goto L6
                r2 = -1
                return r2
            L6:
                kotlin.v0 r2 = (kotlin.v0) r2
                byte r2 = r2.o0()
                int r2 = r1.g(r2)
                return r2
        }

        @Override // kotlin.collections.b, java.util.Collection
        public boolean isEmpty() {
                r1 = this;
                byte[] r0 = r1.a
                boolean r0 = kotlin.w0.v(r0)
                return r0
        }

        public int j(byte r2) {
                r1 = this;
                byte[] r0 = r1.a
                int r2 = kotlin.collections.n.Zh(r0, r2)
                return r2
        }

        @Override // kotlin.collections.d, java.util.List
        public final /* bridge */ int lastIndexOf(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof kotlin.v0
                if (r0 != 0) goto L6
                r2 = -1
                return r2
            L6:
                kotlin.v0 r2 = (kotlin.v0) r2
                byte r2 = r2.o0()
                int r2 = r1.j(r2)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class d extends kotlin.collections.d<kotlin.j1> implements java.util.RandomAccess {
        final /* synthetic */ short[] a;

        d(short[] r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // kotlin.collections.b, java.util.Collection
        public final /* bridge */ boolean contains(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof kotlin.j1
                if (r0 != 0) goto L6
                r2 = 0
                return r2
            L6:
                kotlin.j1 r2 = (kotlin.j1) r2
                short r2 = r2.o0()
                boolean r2 = r1.e(r2)
                return r2
        }

        public boolean e(short r2) {
                r1 = this;
                short[] r0 = r1.a
                boolean r2 = kotlin.k1.j(r0, r2)
                return r2
        }

        public short f(int r2) {
                r1 = this;
                short[] r0 = r1.a
                short r2 = kotlin.k1.p(r0, r2)
                return r2
        }

        public int g(short r2) {
                r1 = this;
                short[] r0 = r1.a
                int r2 = kotlin.collections.n.cg(r0, r2)
                return r2
        }

        @Override // kotlin.collections.d, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                r0 = this;
                short r1 = r0.f(r1)
                kotlin.j1 r1 = kotlin.j1.b(r1)
                return r1
        }

        @Override // kotlin.collections.d, kotlin.collections.b
        public int getSize() {
                r1 = this;
                short[] r0 = r1.a
                int r0 = kotlin.k1.r(r0)
                return r0
        }

        @Override // kotlin.collections.d, java.util.List
        public final /* bridge */ int indexOf(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof kotlin.j1
                if (r0 != 0) goto L6
                r2 = -1
                return r2
            L6:
                kotlin.j1 r2 = (kotlin.j1) r2
                short r2 = r2.o0()
                int r2 = r1.g(r2)
                return r2
        }

        @Override // kotlin.collections.b, java.util.Collection
        public boolean isEmpty() {
                r1 = this;
                short[] r0 = r1.a
                boolean r0 = kotlin.k1.v(r0)
                return r0
        }

        public int j(short r2) {
                r1 = this;
                short[] r0 = r1.a
                int r2 = kotlin.collections.n.gi(r0, r2)
                return r2
        }

        @Override // kotlin.collections.d, java.util.List
        public final /* bridge */ int lastIndexOf(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof kotlin.j1
                if (r0 != 0) goto L6
                r2 = -1
                return r2
            L6:
                kotlin.j1 r2 = (kotlin.j1) r2
                short r2 = r2.o0()
                int r2 = r1.j(r2)
                return r2
        }
    }

    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ kotlin.j1 A(short[] r1, java.util.Comparator r2) {
            java.lang.String r0 = "$v$c$kotlin-UShortArray$-$this$maxWith$0"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.j1 r1 = kotlin.collections.unsigned.g.I6(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ kotlin.d1 B(long[] r1, java.util.Comparator r2) {
            java.lang.String r0 = "$v$c$kotlin-ULongArray$-$this$maxWith$0"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.d1 r1 = kotlin.collections.unsigned.g.J6(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.Deprecated(message = "Use minOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ kotlin.z0 C(int[] r1) {
            java.lang.String r0 = "$v$c$kotlin-UIntArray$-$this$min$0"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.z0 r1 = kotlin.collections.unsigned.g.C7(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.Deprecated(message = "Use minOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ kotlin.v0 D(byte[] r1) {
            java.lang.String r0 = "$v$c$kotlin-UByteArray$-$this$min$0"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.v0 r1 = kotlin.collections.unsigned.g.D7(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.Deprecated(message = "Use minOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ kotlin.d1 E(long[] r1) {
            java.lang.String r0 = "$v$c$kotlin-ULongArray$-$this$min$0"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.d1 r1 = kotlin.collections.unsigned.g.E7(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.Deprecated(message = "Use minOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ kotlin.j1 F(short[] r1) {
            java.lang.String r0 = "$v$c$kotlin-UShortArray$-$this$min$0"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.j1 r1 = kotlin.collections.unsigned.g.F7(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.internal.InlineOnly
    @kotlin.Deprecated(message = "Use minByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    private static final /* synthetic */ <R extends java.lang.Comparable<? super R>> kotlin.v0 G(byte[] r7, kotlin.jvm.functions.Function1<? super kotlin.v0, ? extends R> r8) {
            java.lang.String r0 = "$v$c$kotlin-UByteArray$-$this$minBy$0"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r8, r0)
            boolean r0 = kotlin.w0.v(r7)
            if (r0 == 0) goto L12
            r7 = 0
            return r7
        L12:
            r0 = 0
            byte r0 = kotlin.w0.p(r7, r0)
            int r1 = kotlin.collections.n.Ie(r7)
            if (r1 != 0) goto L22
            kotlin.v0 r7 = kotlin.v0.b(r0)
            return r7
        L22:
            kotlin.v0 r2 = kotlin.v0.b(r0)
            java.lang.Object r2 = r8.invoke(r2)
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            r3 = 1
            if (r3 > r1) goto L4a
        L2f:
            byte r4 = kotlin.w0.p(r7, r3)
            kotlin.v0 r5 = kotlin.v0.b(r4)
            java.lang.Object r5 = r8.invoke(r5)
            java.lang.Comparable r5 = (java.lang.Comparable) r5
            int r6 = r2.compareTo(r5)
            if (r6 <= 0) goto L45
            r0 = r4
            r2 = r5
        L45:
            if (r3 == r1) goto L4a
            int r3 = r3 + 1
            goto L2f
        L4a:
            kotlin.v0 r7 = kotlin.v0.b(r0)
            return r7
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.internal.InlineOnly
    @kotlin.Deprecated(message = "Use minByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    private static final /* synthetic */ <R extends java.lang.Comparable<? super R>> kotlin.d1 H(long[] r9, kotlin.jvm.functions.Function1<? super kotlin.d1, ? extends R> r10) {
            java.lang.String r0 = "$v$c$kotlin-ULongArray$-$this$minBy$0"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r10, r0)
            boolean r0 = kotlin.e1.v(r9)
            if (r0 == 0) goto L12
            r9 = 0
            return r9
        L12:
            r0 = 0
            long r0 = kotlin.e1.p(r9, r0)
            int r2 = kotlin.collections.n.Ne(r9)
            if (r2 != 0) goto L22
            kotlin.d1 r9 = kotlin.d1.b(r0)
            return r9
        L22:
            kotlin.d1 r3 = kotlin.d1.b(r0)
            java.lang.Object r3 = r10.invoke(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = 1
            if (r4 > r2) goto L4a
        L2f:
            long r5 = kotlin.e1.p(r9, r4)
            kotlin.d1 r7 = kotlin.d1.b(r5)
            java.lang.Object r7 = r10.invoke(r7)
            java.lang.Comparable r7 = (java.lang.Comparable) r7
            int r8 = r3.compareTo(r7)
            if (r8 <= 0) goto L45
            r0 = r5
            r3 = r7
        L45:
            if (r4 == r2) goto L4a
            int r4 = r4 + 1
            goto L2f
        L4a:
            kotlin.d1 r9 = kotlin.d1.b(r0)
            return r9
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.internal.InlineOnly
    @kotlin.Deprecated(message = "Use minByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    private static final /* synthetic */ <R extends java.lang.Comparable<? super R>> kotlin.z0 I(int[] r7, kotlin.jvm.functions.Function1<? super kotlin.z0, ? extends R> r8) {
            java.lang.String r0 = "$v$c$kotlin-UIntArray$-$this$minBy$0"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r8, r0)
            boolean r0 = kotlin.a1.v(r7)
            if (r0 == 0) goto L12
            r7 = 0
            return r7
        L12:
            r0 = 0
            int r0 = kotlin.a1.p(r7, r0)
            int r1 = kotlin.collections.n.Me(r7)
            if (r1 != 0) goto L22
            kotlin.z0 r7 = kotlin.z0.b(r0)
            return r7
        L22:
            kotlin.z0 r2 = kotlin.z0.b(r0)
            java.lang.Object r2 = r8.invoke(r2)
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            r3 = 1
            if (r3 > r1) goto L4a
        L2f:
            int r4 = kotlin.a1.p(r7, r3)
            kotlin.z0 r5 = kotlin.z0.b(r4)
            java.lang.Object r5 = r8.invoke(r5)
            java.lang.Comparable r5 = (java.lang.Comparable) r5
            int r6 = r2.compareTo(r5)
            if (r6 <= 0) goto L45
            r0 = r4
            r2 = r5
        L45:
            if (r3 == r1) goto L4a
            int r3 = r3 + 1
            goto L2f
        L4a:
            kotlin.z0 r7 = kotlin.z0.b(r0)
            return r7
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.internal.InlineOnly
    @kotlin.Deprecated(message = "Use minByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    private static final /* synthetic */ <R extends java.lang.Comparable<? super R>> kotlin.j1 J(short[] r7, kotlin.jvm.functions.Function1<? super kotlin.j1, ? extends R> r8) {
            java.lang.String r0 = "$v$c$kotlin-UShortArray$-$this$minBy$0"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r8, r0)
            boolean r0 = kotlin.k1.v(r7)
            if (r0 == 0) goto L12
            r7 = 0
            return r7
        L12:
            r0 = 0
            short r0 = kotlin.k1.p(r7, r0)
            int r1 = kotlin.collections.n.Pe(r7)
            if (r1 != 0) goto L22
            kotlin.j1 r7 = kotlin.j1.b(r0)
            return r7
        L22:
            kotlin.j1 r2 = kotlin.j1.b(r0)
            java.lang.Object r2 = r8.invoke(r2)
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            r3 = 1
            if (r3 > r1) goto L4a
        L2f:
            short r4 = kotlin.k1.p(r7, r3)
            kotlin.j1 r5 = kotlin.j1.b(r4)
            java.lang.Object r5 = r8.invoke(r5)
            java.lang.Comparable r5 = (java.lang.Comparable) r5
            int r6 = r2.compareTo(r5)
            if (r6 <= 0) goto L45
            r0 = r4
            r2 = r5
        L45:
            if (r3 == r1) goto L4a
            int r3 = r3 + 1
            goto L2f
        L4a:
            kotlin.j1 r7 = kotlin.j1.b(r0)
            return r7
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.Deprecated(message = "Use minWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ kotlin.v0 K(byte[] r1, java.util.Comparator r2) {
            java.lang.String r0 = "$v$c$kotlin-UByteArray$-$this$minWith$0"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.v0 r1 = kotlin.collections.unsigned.g.K7(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.Deprecated(message = "Use minWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ kotlin.z0 L(int[] r1, java.util.Comparator r2) {
            java.lang.String r0 = "$v$c$kotlin-UIntArray$-$this$minWith$0"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.z0 r1 = kotlin.collections.unsigned.g.L7(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.Deprecated(message = "Use minWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ kotlin.j1 M(short[] r1, java.util.Comparator r2) {
            java.lang.String r0 = "$v$c$kotlin-UShortArray$-$this$minWith$0"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.j1 r1 = kotlin.collections.unsigned.g.M7(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.Deprecated(message = "Use minWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ kotlin.d1 N(long[] r1, java.util.Comparator r2) {
            java.lang.String r0 = "$v$c$kotlin-ULongArray$-$this$minWith$0"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.d1 r1 = kotlin.collections.unsigned.g.N7(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "sumOfBigDecimal")
    @kotlin.OverloadResolutionByLambdaReturnType
    private static final java.math.BigDecimal O(byte[] r4, kotlin.jvm.functions.Function1<? super kotlin.v0, ? extends java.math.BigDecimal> r5) {
            java.lang.String r0 = "$v$c$kotlin-UByteArray$-$this$sumOf$0"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r5, r0)
            r0 = 0
            java.math.BigDecimal r0 = java.math.BigDecimal.valueOf(r0)
            java.lang.String r1 = "valueOf(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            int r1 = kotlin.w0.r(r4)
            r2 = 0
        L1a:
            if (r2 >= r1) goto L36
            byte r3 = kotlin.w0.p(r4, r2)
            kotlin.v0 r3 = kotlin.v0.b(r3)
            java.lang.Object r3 = r5.invoke(r3)
            java.math.BigDecimal r3 = (java.math.BigDecimal) r3
            java.math.BigDecimal r0 = r0.add(r3)
            java.lang.String r3 = "add(...)"
            kotlin.jvm.internal.g0.o(r0, r3)
            int r2 = r2 + 1
            goto L1a
        L36:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "sumOfBigDecimal")
    @kotlin.OverloadResolutionByLambdaReturnType
    private static final java.math.BigDecimal P(int[] r4, kotlin.jvm.functions.Function1<? super kotlin.z0, ? extends java.math.BigDecimal> r5) {
            java.lang.String r0 = "$v$c$kotlin-UIntArray$-$this$sumOf$0"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r5, r0)
            r0 = 0
            java.math.BigDecimal r0 = java.math.BigDecimal.valueOf(r0)
            java.lang.String r1 = "valueOf(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            int r1 = kotlin.a1.r(r4)
            r2 = 0
        L1a:
            if (r2 >= r1) goto L36
            int r3 = kotlin.a1.p(r4, r2)
            kotlin.z0 r3 = kotlin.z0.b(r3)
            java.lang.Object r3 = r5.invoke(r3)
            java.math.BigDecimal r3 = (java.math.BigDecimal) r3
            java.math.BigDecimal r0 = r0.add(r3)
            java.lang.String r3 = "add(...)"
            kotlin.jvm.internal.g0.o(r0, r3)
            int r2 = r2 + 1
            goto L1a
        L36:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "sumOfBigDecimal")
    @kotlin.OverloadResolutionByLambdaReturnType
    private static final java.math.BigDecimal Q(long[] r5, kotlin.jvm.functions.Function1<? super kotlin.d1, ? extends java.math.BigDecimal> r6) {
            java.lang.String r0 = "$v$c$kotlin-ULongArray$-$this$sumOf$0"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r6, r0)
            r0 = 0
            java.math.BigDecimal r0 = java.math.BigDecimal.valueOf(r0)
            java.lang.String r1 = "valueOf(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            int r1 = kotlin.e1.r(r5)
            r2 = 0
        L1a:
            if (r2 >= r1) goto L36
            long r3 = kotlin.e1.p(r5, r2)
            kotlin.d1 r3 = kotlin.d1.b(r3)
            java.lang.Object r3 = r6.invoke(r3)
            java.math.BigDecimal r3 = (java.math.BigDecimal) r3
            java.math.BigDecimal r0 = r0.add(r3)
            java.lang.String r3 = "add(...)"
            kotlin.jvm.internal.g0.o(r0, r3)
            int r2 = r2 + 1
            goto L1a
        L36:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "sumOfBigDecimal")
    @kotlin.OverloadResolutionByLambdaReturnType
    private static final java.math.BigDecimal R(short[] r4, kotlin.jvm.functions.Function1<? super kotlin.j1, ? extends java.math.BigDecimal> r5) {
            java.lang.String r0 = "$v$c$kotlin-UShortArray$-$this$sumOf$0"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r5, r0)
            r0 = 0
            java.math.BigDecimal r0 = java.math.BigDecimal.valueOf(r0)
            java.lang.String r1 = "valueOf(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            int r1 = kotlin.k1.r(r4)
            r2 = 0
        L1a:
            if (r2 >= r1) goto L36
            short r3 = kotlin.k1.p(r4, r2)
            kotlin.j1 r3 = kotlin.j1.b(r3)
            java.lang.Object r3 = r5.invoke(r3)
            java.math.BigDecimal r3 = (java.math.BigDecimal) r3
            java.math.BigDecimal r0 = r0.add(r3)
            java.lang.String r3 = "add(...)"
            kotlin.jvm.internal.g0.o(r0, r3)
            int r2 = r2 + 1
            goto L1a
        L36:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "sumOfBigInteger")
    @kotlin.OverloadResolutionByLambdaReturnType
    private static final java.math.BigInteger S(byte[] r4, kotlin.jvm.functions.Function1<? super kotlin.v0, ? extends java.math.BigInteger> r5) {
            java.lang.String r0 = "$v$c$kotlin-UByteArray$-$this$sumOf$0"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r5, r0)
            r0 = 0
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            java.lang.String r1 = "valueOf(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            int r1 = kotlin.w0.r(r4)
            r2 = 0
        L1a:
            if (r2 >= r1) goto L36
            byte r3 = kotlin.w0.p(r4, r2)
            kotlin.v0 r3 = kotlin.v0.b(r3)
            java.lang.Object r3 = r5.invoke(r3)
            java.math.BigInteger r3 = (java.math.BigInteger) r3
            java.math.BigInteger r0 = r0.add(r3)
            java.lang.String r3 = "add(...)"
            kotlin.jvm.internal.g0.o(r0, r3)
            int r2 = r2 + 1
            goto L1a
        L36:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "sumOfBigInteger")
    @kotlin.OverloadResolutionByLambdaReturnType
    private static final java.math.BigInteger T(int[] r4, kotlin.jvm.functions.Function1<? super kotlin.z0, ? extends java.math.BigInteger> r5) {
            java.lang.String r0 = "$v$c$kotlin-UIntArray$-$this$sumOf$0"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r5, r0)
            r0 = 0
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            java.lang.String r1 = "valueOf(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            int r1 = kotlin.a1.r(r4)
            r2 = 0
        L1a:
            if (r2 >= r1) goto L36
            int r3 = kotlin.a1.p(r4, r2)
            kotlin.z0 r3 = kotlin.z0.b(r3)
            java.lang.Object r3 = r5.invoke(r3)
            java.math.BigInteger r3 = (java.math.BigInteger) r3
            java.math.BigInteger r0 = r0.add(r3)
            java.lang.String r3 = "add(...)"
            kotlin.jvm.internal.g0.o(r0, r3)
            int r2 = r2 + 1
            goto L1a
        L36:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "sumOfBigInteger")
    @kotlin.OverloadResolutionByLambdaReturnType
    private static final java.math.BigInteger U(long[] r5, kotlin.jvm.functions.Function1<? super kotlin.d1, ? extends java.math.BigInteger> r6) {
            java.lang.String r0 = "$v$c$kotlin-ULongArray$-$this$sumOf$0"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r6, r0)
            r0 = 0
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            java.lang.String r1 = "valueOf(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            int r1 = kotlin.e1.r(r5)
            r2 = 0
        L1a:
            if (r2 >= r1) goto L36
            long r3 = kotlin.e1.p(r5, r2)
            kotlin.d1 r3 = kotlin.d1.b(r3)
            java.lang.Object r3 = r6.invoke(r3)
            java.math.BigInteger r3 = (java.math.BigInteger) r3
            java.math.BigInteger r0 = r0.add(r3)
            java.lang.String r3 = "add(...)"
            kotlin.jvm.internal.g0.o(r0, r3)
            int r2 = r2 + 1
            goto L1a
        L36:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "sumOfBigInteger")
    @kotlin.OverloadResolutionByLambdaReturnType
    private static final java.math.BigInteger V(short[] r4, kotlin.jvm.functions.Function1<? super kotlin.j1, ? extends java.math.BigInteger> r5) {
            java.lang.String r0 = "$v$c$kotlin-UShortArray$-$this$sumOf$0"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r5, r0)
            r0 = 0
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            java.lang.String r1 = "valueOf(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            int r1 = kotlin.k1.r(r4)
            r2 = 0
        L1a:
            if (r2 >= r1) goto L36
            short r3 = kotlin.k1.p(r4, r2)
            kotlin.j1 r3 = kotlin.j1.b(r3)
            java.lang.Object r3 = r5.invoke(r3)
            java.math.BigInteger r3 = (java.math.BigInteger) r3
            java.math.BigInteger r0 = r0.add(r3)
            java.lang.String r3 = "add(...)"
            kotlin.jvm.internal.g0.o(r0, r3)
            int r2 = r2 + 1
            goto L1a
        L36:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @org.jetbrains.annotations.NotNull
    public static final java.util.List<kotlin.z0> a(@org.jetbrains.annotations.NotNull int[] r1) {
            java.lang.String r0 = "$v$c$kotlin-UIntArray$-$this$asList$0"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.collections.unsigned.b$a r0 = new kotlin.collections.unsigned.b$a
            r0.<init>(r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @org.jetbrains.annotations.NotNull
    public static final java.util.List<kotlin.v0> b(@org.jetbrains.annotations.NotNull byte[] r1) {
            java.lang.String r0 = "$v$c$kotlin-UByteArray$-$this$asList$0"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.collections.unsigned.b$c r0 = new kotlin.collections.unsigned.b$c
            r0.<init>(r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @org.jetbrains.annotations.NotNull
    public static final java.util.List<kotlin.d1> c(@org.jetbrains.annotations.NotNull long[] r1) {
            java.lang.String r0 = "$v$c$kotlin-ULongArray$-$this$asList$0"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.collections.unsigned.b$b r0 = new kotlin.collections.unsigned.b$b
            r0.<init>(r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @org.jetbrains.annotations.NotNull
    public static final java.util.List<kotlin.j1> d(@org.jetbrains.annotations.NotNull short[] r1) {
            java.lang.String r0 = "$v$c$kotlin-UShortArray$-$this$asList$0"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.collections.unsigned.b$d r0 = new kotlin.collections.unsigned.b$d
            r0.<init>(r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    public static final int e(@org.jetbrains.annotations.NotNull int[] r2, int r3, int r4, int r5) {
            java.lang.String r0 = "$v$c$kotlin-UIntArray$-$this$binarySearch$0"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.collections.d$a r0 = kotlin.collections.d.Companion
            int r1 = kotlin.a1.r(r2)
            r0.d(r4, r5, r1)
            int r5 = r5 + (-1)
        L10:
            if (r4 > r5) goto L27
            int r0 = r4 + r5
            int r0 = r0 >>> 1
            r1 = r2[r0]
            int r1 = kotlin.o1.e(r1, r3)
            if (r1 >= 0) goto L21
            int r4 = r0 + 1
            goto L10
        L21:
            if (r1 <= 0) goto L26
            int r5 = r0 + (-1)
            goto L10
        L26:
            return r0
        L27:
            int r4 = r4 + 1
            int r2 = -r4
            return r2
    }

    public static /* synthetic */ int f(int[] r0, int r1, int r2, int r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            int r3 = kotlin.a1.r(r0)
        Ld:
            int r0 = e(r0, r1, r2, r3)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    public static final int g(@org.jetbrains.annotations.NotNull short[] r2, short r3, int r4, int r5) {
            java.lang.String r0 = "$v$c$kotlin-UShortArray$-$this$binarySearch$0"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.collections.d$a r0 = kotlin.collections.d.Companion
            int r1 = kotlin.k1.r(r2)
            r0.d(r4, r5, r1)
            r0 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r0
            int r5 = r5 + (-1)
        L14:
            if (r4 > r5) goto L2b
            int r0 = r4 + r5
            int r0 = r0 >>> 1
            short r1 = r2[r0]
            int r1 = kotlin.o1.e(r1, r3)
            if (r1 >= 0) goto L25
            int r4 = r0 + 1
            goto L14
        L25:
            if (r1 <= 0) goto L2a
            int r5 = r0 + (-1)
            goto L14
        L2a:
            return r0
        L2b:
            int r4 = r4 + 1
            int r2 = -r4
            return r2
    }

    public static /* synthetic */ int h(short[] r0, short r1, int r2, int r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            int r3 = kotlin.k1.r(r0)
        Ld:
            int r0 = g(r0, r1, r2, r3)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    public static final int i(@org.jetbrains.annotations.NotNull long[] r3, long r4, int r6, int r7) {
            java.lang.String r0 = "$v$c$kotlin-ULongArray$-$this$binarySearch$0"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.collections.d$a r0 = kotlin.collections.d.Companion
            int r1 = kotlin.e1.r(r3)
            r0.d(r6, r7, r1)
            int r7 = r7 + (-1)
        L10:
            if (r6 > r7) goto L27
            int r0 = r6 + r7
            int r0 = r0 >>> 1
            r1 = r3[r0]
            int r1 = kotlin.o1.n(r1, r4)
            if (r1 >= 0) goto L21
            int r6 = r0 + 1
            goto L10
        L21:
            if (r1 <= 0) goto L26
            int r7 = r0 + (-1)
            goto L10
        L26:
            return r0
        L27:
            int r6 = r6 + 1
            int r3 = -r6
            return r3
    }

    public static /* synthetic */ int j(long[] r0, long r1, int r3, int r4, int r5, java.lang.Object r6) {
            r6 = r5 & 2
            if (r6 == 0) goto L5
            r3 = 0
        L5:
            r5 = r5 & 4
            if (r5 == 0) goto Ld
            int r4 = kotlin.e1.r(r0)
        Ld:
            int r0 = i(r0, r1, r3, r4)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    public static final int k(@org.jetbrains.annotations.NotNull byte[] r2, byte r3, int r4, int r5) {
            java.lang.String r0 = "$v$c$kotlin-UByteArray$-$this$binarySearch$0"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.collections.d$a r0 = kotlin.collections.d.Companion
            int r1 = kotlin.w0.r(r2)
            r0.d(r4, r5, r1)
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r5 = r5 + (-1)
        L12:
            if (r4 > r5) goto L29
            int r0 = r4 + r5
            int r0 = r0 >>> 1
            r1 = r2[r0]
            int r1 = kotlin.o1.e(r1, r3)
            if (r1 >= 0) goto L23
            int r4 = r0 + 1
            goto L12
        L23:
            if (r1 <= 0) goto L28
            int r5 = r0 + (-1)
            goto L12
        L28:
            return r0
        L29:
            int r4 = r4 + 1
            int r2 = -r4
            return r2
    }

    public static /* synthetic */ int l(byte[] r0, byte r1, int r2, int r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            int r3 = kotlin.w0.r(r0)
        Ld:
            int r0 = k(r0, r1, r2, r3)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.internal.InlineOnly
    private static final byte m(byte[] r1, int r2) {
            java.lang.String r0 = "$v$c$kotlin-UByteArray$-$this$elementAt$0"
            kotlin.jvm.internal.g0.p(r1, r0)
            byte r1 = kotlin.w0.p(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.internal.InlineOnly
    private static final short n(short[] r1, int r2) {
            java.lang.String r0 = "$v$c$kotlin-UShortArray$-$this$elementAt$0"
            kotlin.jvm.internal.g0.p(r1, r0)
            short r1 = kotlin.k1.p(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.internal.InlineOnly
    private static final int o(int[] r1, int r2) {
            java.lang.String r0 = "$v$c$kotlin-UIntArray$-$this$elementAt$0"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r1 = kotlin.a1.p(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.internal.InlineOnly
    private static final long p(long[] r1, int r2) {
            java.lang.String r0 = "$v$c$kotlin-ULongArray$-$this$elementAt$0"
            kotlin.jvm.internal.g0.p(r1, r0)
            long r1 = kotlin.e1.p(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.Deprecated(message = "Use maxOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ kotlin.z0 q(int[] r1) {
            java.lang.String r0 = "$v$c$kotlin-UIntArray$-$this$max$0"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.z0 r1 = kotlin.collections.unsigned.g.y6(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.Deprecated(message = "Use maxOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ kotlin.v0 r(byte[] r1) {
            java.lang.String r0 = "$v$c$kotlin-UByteArray$-$this$max$0"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.v0 r1 = kotlin.collections.unsigned.g.z6(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.Deprecated(message = "Use maxOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ kotlin.d1 s(long[] r1) {
            java.lang.String r0 = "$v$c$kotlin-ULongArray$-$this$max$0"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.d1 r1 = kotlin.collections.unsigned.g.A6(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.Deprecated(message = "Use maxOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ kotlin.j1 t(short[] r1) {
            java.lang.String r0 = "$v$c$kotlin-UShortArray$-$this$max$0"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.j1 r1 = kotlin.collections.unsigned.g.B6(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.internal.InlineOnly
    @kotlin.Deprecated(message = "Use maxByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    private static final /* synthetic */ <R extends java.lang.Comparable<? super R>> kotlin.v0 u(byte[] r7, kotlin.jvm.functions.Function1<? super kotlin.v0, ? extends R> r8) {
            java.lang.String r0 = "$v$c$kotlin-UByteArray$-$this$maxBy$0"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r8, r0)
            boolean r0 = kotlin.w0.v(r7)
            if (r0 == 0) goto L12
            r7 = 0
            return r7
        L12:
            r0 = 0
            byte r0 = kotlin.w0.p(r7, r0)
            int r1 = kotlin.collections.n.Ie(r7)
            if (r1 != 0) goto L22
            kotlin.v0 r7 = kotlin.v0.b(r0)
            return r7
        L22:
            kotlin.v0 r2 = kotlin.v0.b(r0)
            java.lang.Object r2 = r8.invoke(r2)
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            r3 = 1
            if (r3 > r1) goto L4a
        L2f:
            byte r4 = kotlin.w0.p(r7, r3)
            kotlin.v0 r5 = kotlin.v0.b(r4)
            java.lang.Object r5 = r8.invoke(r5)
            java.lang.Comparable r5 = (java.lang.Comparable) r5
            int r6 = r2.compareTo(r5)
            if (r6 >= 0) goto L45
            r0 = r4
            r2 = r5
        L45:
            if (r3 == r1) goto L4a
            int r3 = r3 + 1
            goto L2f
        L4a:
            kotlin.v0 r7 = kotlin.v0.b(r0)
            return r7
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.internal.InlineOnly
    @kotlin.Deprecated(message = "Use maxByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    private static final /* synthetic */ <R extends java.lang.Comparable<? super R>> kotlin.d1 v(long[] r9, kotlin.jvm.functions.Function1<? super kotlin.d1, ? extends R> r10) {
            java.lang.String r0 = "$v$c$kotlin-ULongArray$-$this$maxBy$0"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r10, r0)
            boolean r0 = kotlin.e1.v(r9)
            if (r0 == 0) goto L12
            r9 = 0
            return r9
        L12:
            r0 = 0
            long r0 = kotlin.e1.p(r9, r0)
            int r2 = kotlin.collections.n.Ne(r9)
            if (r2 != 0) goto L22
            kotlin.d1 r9 = kotlin.d1.b(r0)
            return r9
        L22:
            kotlin.d1 r3 = kotlin.d1.b(r0)
            java.lang.Object r3 = r10.invoke(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = 1
            if (r4 > r2) goto L4a
        L2f:
            long r5 = kotlin.e1.p(r9, r4)
            kotlin.d1 r7 = kotlin.d1.b(r5)
            java.lang.Object r7 = r10.invoke(r7)
            java.lang.Comparable r7 = (java.lang.Comparable) r7
            int r8 = r3.compareTo(r7)
            if (r8 >= 0) goto L45
            r0 = r5
            r3 = r7
        L45:
            if (r4 == r2) goto L4a
            int r4 = r4 + 1
            goto L2f
        L4a:
            kotlin.d1 r9 = kotlin.d1.b(r0)
            return r9
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.internal.InlineOnly
    @kotlin.Deprecated(message = "Use maxByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    private static final /* synthetic */ <R extends java.lang.Comparable<? super R>> kotlin.z0 w(int[] r7, kotlin.jvm.functions.Function1<? super kotlin.z0, ? extends R> r8) {
            java.lang.String r0 = "$v$c$kotlin-UIntArray$-$this$maxBy$0"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r8, r0)
            boolean r0 = kotlin.a1.v(r7)
            if (r0 == 0) goto L12
            r7 = 0
            return r7
        L12:
            r0 = 0
            int r0 = kotlin.a1.p(r7, r0)
            int r1 = kotlin.collections.n.Me(r7)
            if (r1 != 0) goto L22
            kotlin.z0 r7 = kotlin.z0.b(r0)
            return r7
        L22:
            kotlin.z0 r2 = kotlin.z0.b(r0)
            java.lang.Object r2 = r8.invoke(r2)
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            r3 = 1
            if (r3 > r1) goto L4a
        L2f:
            int r4 = kotlin.a1.p(r7, r3)
            kotlin.z0 r5 = kotlin.z0.b(r4)
            java.lang.Object r5 = r8.invoke(r5)
            java.lang.Comparable r5 = (java.lang.Comparable) r5
            int r6 = r2.compareTo(r5)
            if (r6 >= 0) goto L45
            r0 = r4
            r2 = r5
        L45:
            if (r3 == r1) goto L4a
            int r3 = r3 + 1
            goto L2f
        L4a:
            kotlin.z0 r7 = kotlin.z0.b(r0)
            return r7
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.internal.InlineOnly
    @kotlin.Deprecated(message = "Use maxByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    private static final /* synthetic */ <R extends java.lang.Comparable<? super R>> kotlin.j1 x(short[] r7, kotlin.jvm.functions.Function1<? super kotlin.j1, ? extends R> r8) {
            java.lang.String r0 = "$v$c$kotlin-UShortArray$-$this$maxBy$0"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r8, r0)
            boolean r0 = kotlin.k1.v(r7)
            if (r0 == 0) goto L12
            r7 = 0
            return r7
        L12:
            r0 = 0
            short r0 = kotlin.k1.p(r7, r0)
            int r1 = kotlin.collections.n.Pe(r7)
            if (r1 != 0) goto L22
            kotlin.j1 r7 = kotlin.j1.b(r0)
            return r7
        L22:
            kotlin.j1 r2 = kotlin.j1.b(r0)
            java.lang.Object r2 = r8.invoke(r2)
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            r3 = 1
            if (r3 > r1) goto L4a
        L2f:
            short r4 = kotlin.k1.p(r7, r3)
            kotlin.j1 r5 = kotlin.j1.b(r4)
            java.lang.Object r5 = r8.invoke(r5)
            java.lang.Comparable r5 = (java.lang.Comparable) r5
            int r6 = r2.compareTo(r5)
            if (r6 >= 0) goto L45
            r0 = r4
            r2 = r5
        L45:
            if (r3 == r1) goto L4a
            int r3 = r3 + 1
            goto L2f
        L4a:
            kotlin.j1 r7 = kotlin.j1.b(r0)
            return r7
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ kotlin.v0 y(byte[] r1, java.util.Comparator r2) {
            java.lang.String r0 = "$v$c$kotlin-UByteArray$-$this$maxWith$0"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.v0 r1 = kotlin.collections.unsigned.g.G6(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ kotlin.z0 z(int[] r1, java.util.Comparator r2) {
            java.lang.String r0 = "$v$c$kotlin-UIntArray$-$this$maxWith$0"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.z0 r1 = kotlin.collections.unsigned.g.H6(r1, r2)
            return r1
    }
}
