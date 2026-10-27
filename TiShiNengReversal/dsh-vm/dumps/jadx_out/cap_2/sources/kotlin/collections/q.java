package kotlin.collections;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\n_ArraysJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,3051:1\n14484#2,14:3052\n14514#2,14:3066\n14544#2,14:3080\n14574#2,14:3094\n14604#2,14:3108\n14634#2,14:3122\n14664#2,14:3136\n14694#2,14:3150\n14724#2,14:3164\n17456#2,14:3178\n17486#2,14:3192\n17516#2,14:3206\n17546#2,14:3220\n17576#2,14:3234\n17606#2,14:3248\n17636#2,14:3262\n17666#2,14:3276\n17696#2,14:3290\n*S KotlinDebug\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt\n*L\n2443#1:3052,14\n2450#1:3066,14\n2457#1:3080,14\n2464#1:3094,14\n2471#1:3108,14\n2478#1:3122,14\n2485#1:3136,14\n2492#1:3150,14\n2499#1:3164,14\n2641#1:3178,14\n2648#1:3192,14\n2655#1:3206,14\n2662#1:3220,14\n2669#1:3234,14\n2676#1:3248,14\n2683#1:3262,14\n2690#1:3276,14\n2697#1:3290,14\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class q extends kotlin.collections.p {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a extends kotlin.collections.d<java.lang.Byte> implements java.util.RandomAccess {
        final /* synthetic */ byte[] a;

        a(byte[] r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // kotlin.collections.b, java.util.Collection
        public final /* bridge */ boolean contains(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.lang.Byte
                if (r0 != 0) goto L6
                r2 = 0
                return r2
            L6:
                java.lang.Number r2 = (java.lang.Number) r2
                byte r2 = r2.byteValue()
                boolean r2 = r1.e(r2)
                return r2
        }

        public boolean e(byte r2) {
                r1 = this;
                byte[] r0 = r1.a
                boolean r2 = kotlin.collections.a0.v8(r0, r2)
                return r2
        }

        public java.lang.Byte f(int r2) {
                r1 = this;
                byte[] r0 = r1.a
                r2 = r0[r2]
                java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
                return r2
        }

        public int g(byte r2) {
                r1 = this;
                byte[] r0 = r1.a
                int r2 = kotlin.collections.a0.Vf(r0, r2)
                return r2
        }

        @Override // kotlin.collections.d, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                r0 = this;
                java.lang.Byte r1 = r0.f(r1)
                return r1
        }

        @Override // kotlin.collections.d, kotlin.collections.b
        public int getSize() {
                r1 = this;
                byte[] r0 = r1.a
                int r0 = r0.length
                return r0
        }

        @Override // kotlin.collections.d, java.util.List
        public final /* bridge */ int indexOf(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.lang.Byte
                if (r0 != 0) goto L6
                r2 = -1
                return r2
            L6:
                java.lang.Number r2 = (java.lang.Number) r2
                byte r2 = r2.byteValue()
                int r2 = r1.g(r2)
                return r2
        }

        @Override // kotlin.collections.b, java.util.Collection
        public boolean isEmpty() {
                r1 = this;
                byte[] r0 = r1.a
                int r0 = r0.length
                if (r0 != 0) goto L7
                r0 = 1
                return r0
            L7:
                r0 = 0
                return r0
        }

        public int j(byte r2) {
                r1 = this;
                byte[] r0 = r1.a
                int r2 = kotlin.collections.a0.Zh(r0, r2)
                return r2
        }

        @Override // kotlin.collections.d, java.util.List
        public final /* bridge */ int lastIndexOf(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.lang.Byte
                if (r0 != 0) goto L6
                r2 = -1
                return r2
            L6:
                java.lang.Number r2 = (java.lang.Number) r2
                byte r2 = r2.byteValue()
                int r2 = r1.j(r2)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b extends kotlin.collections.d<java.lang.Short> implements java.util.RandomAccess {
        final /* synthetic */ short[] a;

        b(short[] r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // kotlin.collections.b, java.util.Collection
        public final /* bridge */ boolean contains(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.lang.Short
                if (r0 != 0) goto L6
                r2 = 0
                return r2
            L6:
                java.lang.Number r2 = (java.lang.Number) r2
                short r2 = r2.shortValue()
                boolean r2 = r1.e(r2)
                return r2
        }

        public boolean e(short r2) {
                r1 = this;
                short[] r0 = r1.a
                boolean r2 = kotlin.collections.a0.C8(r0, r2)
                return r2
        }

        public java.lang.Short f(int r2) {
                r1 = this;
                short[] r0 = r1.a
                short r2 = r0[r2]
                java.lang.Short r2 = java.lang.Short.valueOf(r2)
                return r2
        }

        public int g(short r2) {
                r1 = this;
                short[] r0 = r1.a
                int r2 = kotlin.collections.a0.cg(r0, r2)
                return r2
        }

        @Override // kotlin.collections.d, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                r0 = this;
                java.lang.Short r1 = r0.f(r1)
                return r1
        }

        @Override // kotlin.collections.d, kotlin.collections.b
        public int getSize() {
                r1 = this;
                short[] r0 = r1.a
                int r0 = r0.length
                return r0
        }

        @Override // kotlin.collections.d, java.util.List
        public final /* bridge */ int indexOf(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.lang.Short
                if (r0 != 0) goto L6
                r2 = -1
                return r2
            L6:
                java.lang.Number r2 = (java.lang.Number) r2
                short r2 = r2.shortValue()
                int r2 = r1.g(r2)
                return r2
        }

        @Override // kotlin.collections.b, java.util.Collection
        public boolean isEmpty() {
                r1 = this;
                short[] r0 = r1.a
                int r0 = r0.length
                if (r0 != 0) goto L7
                r0 = 1
                return r0
            L7:
                r0 = 0
                return r0
        }

        public int j(short r2) {
                r1 = this;
                short[] r0 = r1.a
                int r2 = kotlin.collections.a0.gi(r0, r2)
                return r2
        }

        @Override // kotlin.collections.d, java.util.List
        public final /* bridge */ int lastIndexOf(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.lang.Short
                if (r0 != 0) goto L6
                r2 = -1
                return r2
            L6:
                java.lang.Number r2 = (java.lang.Number) r2
                short r2 = r2.shortValue()
                int r2 = r1.j(r2)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class c extends kotlin.collections.d<java.lang.Integer> implements java.util.RandomAccess {
        final /* synthetic */ int[] a;

        c(int[] r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // kotlin.collections.b, java.util.Collection
        public final /* bridge */ boolean contains(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.lang.Integer
                if (r0 != 0) goto L6
                r2 = 0
                return r2
            L6:
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                boolean r2 = r1.e(r2)
                return r2
        }

        public boolean e(int r2) {
                r1 = this;
                int[] r0 = r1.a
                boolean r2 = kotlin.collections.a0.z8(r0, r2)
                return r2
        }

        public java.lang.Integer f(int r2) {
                r1 = this;
                int[] r0 = r1.a
                r2 = r0[r2]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                return r2
        }

        public int g(int r2) {
                r1 = this;
                int[] r0 = r1.a
                int r2 = kotlin.collections.a0.Zf(r0, r2)
                return r2
        }

        @Override // kotlin.collections.d, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                r0 = this;
                java.lang.Integer r1 = r0.f(r1)
                return r1
        }

        @Override // kotlin.collections.d, kotlin.collections.b
        public int getSize() {
                r1 = this;
                int[] r0 = r1.a
                int r0 = r0.length
                return r0
        }

        @Override // kotlin.collections.d, java.util.List
        public final /* bridge */ int indexOf(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.lang.Integer
                if (r0 != 0) goto L6
                r2 = -1
                return r2
            L6:
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                int r2 = r1.g(r2)
                return r2
        }

        @Override // kotlin.collections.b, java.util.Collection
        public boolean isEmpty() {
                r1 = this;
                int[] r0 = r1.a
                int r0 = r0.length
                if (r0 != 0) goto L7
                r0 = 1
                return r0
            L7:
                r0 = 0
                return r0
        }

        public int j(int r2) {
                r1 = this;
                int[] r0 = r1.a
                int r2 = kotlin.collections.a0.di(r0, r2)
                return r2
        }

        @Override // kotlin.collections.d, java.util.List
        public final /* bridge */ int lastIndexOf(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.lang.Integer
                if (r0 != 0) goto L6
                r2 = -1
                return r2
            L6:
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                int r2 = r1.j(r2)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class d extends kotlin.collections.d<java.lang.Long> implements java.util.RandomAccess {
        final /* synthetic */ long[] a;

        d(long[] r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // kotlin.collections.b, java.util.Collection
        public final /* bridge */ boolean contains(java.lang.Object r3) {
                r2 = this;
                boolean r0 = r3 instanceof java.lang.Long
                if (r0 != 0) goto L6
                r3 = 0
                return r3
            L6:
                java.lang.Number r3 = (java.lang.Number) r3
                long r0 = r3.longValue()
                boolean r3 = r2.e(r0)
                return r3
        }

        public boolean e(long r2) {
                r1 = this;
                long[] r0 = r1.a
                boolean r2 = kotlin.collections.a0.A8(r0, r2)
                return r2
        }

        public java.lang.Long f(int r4) {
                r3 = this;
                long[] r0 = r3.a
                r1 = r0[r4]
                java.lang.Long r4 = java.lang.Long.valueOf(r1)
                return r4
        }

        public int g(long r2) {
                r1 = this;
                long[] r0 = r1.a
                int r2 = kotlin.collections.a0.ag(r0, r2)
                return r2
        }

        @Override // kotlin.collections.d, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                r0 = this;
                java.lang.Long r1 = r0.f(r1)
                return r1
        }

        @Override // kotlin.collections.d, kotlin.collections.b
        public int getSize() {
                r1 = this;
                long[] r0 = r1.a
                int r0 = r0.length
                return r0
        }

        @Override // kotlin.collections.d, java.util.List
        public final /* bridge */ int indexOf(java.lang.Object r3) {
                r2 = this;
                boolean r0 = r3 instanceof java.lang.Long
                if (r0 != 0) goto L6
                r3 = -1
                return r3
            L6:
                java.lang.Number r3 = (java.lang.Number) r3
                long r0 = r3.longValue()
                int r3 = r2.g(r0)
                return r3
        }

        @Override // kotlin.collections.b, java.util.Collection
        public boolean isEmpty() {
                r1 = this;
                long[] r0 = r1.a
                int r0 = r0.length
                if (r0 != 0) goto L7
                r0 = 1
                return r0
            L7:
                r0 = 0
                return r0
        }

        public int j(long r2) {
                r1 = this;
                long[] r0 = r1.a
                int r2 = kotlin.collections.a0.ei(r0, r2)
                return r2
        }

        @Override // kotlin.collections.d, java.util.List
        public final /* bridge */ int lastIndexOf(java.lang.Object r3) {
                r2 = this;
                boolean r0 = r3 instanceof java.lang.Long
                if (r0 != 0) goto L6
                r3 = -1
                return r3
            L6:
                java.lang.Number r3 = (java.lang.Number) r3
                long r0 = r3.longValue()
                int r3 = r2.j(r0)
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\n_ArraysJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt$asList$5\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,3051:1\n13020#2,2:3052\n1832#2,6:3054\n1940#2,6:3060\n*S KotlinDebug\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt$asList$5\n*L\n199#1:3052,2\n201#1:3054,6\n202#1:3060,6\n*E\n"})
    public static final class e extends kotlin.collections.d<java.lang.Float> implements java.util.RandomAccess {
        final /* synthetic */ float[] a;

        e(float[] r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // kotlin.collections.b, java.util.Collection
        public final /* bridge */ boolean contains(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.lang.Float
                if (r0 != 0) goto L6
                r2 = 0
                return r2
            L6:
                java.lang.Number r2 = (java.lang.Number) r2
                float r2 = r2.floatValue()
                boolean r2 = r1.e(r2)
                return r2
        }

        public boolean e(float r7) {
                r6 = this;
                float[] r0 = r6.a
                int r1 = r0.length
                r2 = 0
                r3 = 0
            L5:
                if (r3 >= r1) goto L18
                r4 = r0[r3]
                int r4 = java.lang.Float.floatToIntBits(r4)
                int r5 = java.lang.Float.floatToIntBits(r7)
                if (r4 != r5) goto L15
                r7 = 1
                return r7
            L15:
                int r3 = r3 + 1
                goto L5
            L18:
                return r2
        }

        public java.lang.Float f(int r2) {
                r1 = this;
                float[] r0 = r1.a
                r2 = r0[r2]
                java.lang.Float r2 = java.lang.Float.valueOf(r2)
                return r2
        }

        public int g(float r6) {
                r5 = this;
                float[] r0 = r5.a
                int r1 = r0.length
                r2 = 0
            L4:
                if (r2 >= r1) goto L16
                r3 = r0[r2]
                int r3 = java.lang.Float.floatToIntBits(r3)
                int r4 = java.lang.Float.floatToIntBits(r6)
                if (r3 != r4) goto L13
                return r2
            L13:
                int r2 = r2 + 1
                goto L4
            L16:
                r6 = -1
                return r6
        }

        @Override // kotlin.collections.d, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                r0 = this;
                java.lang.Float r1 = r0.f(r1)
                return r1
        }

        @Override // kotlin.collections.d, kotlin.collections.b
        public int getSize() {
                r1 = this;
                float[] r0 = r1.a
                int r0 = r0.length
                return r0
        }

        @Override // kotlin.collections.d, java.util.List
        public final /* bridge */ int indexOf(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.lang.Float
                if (r0 != 0) goto L6
                r2 = -1
                return r2
            L6:
                java.lang.Number r2 = (java.lang.Number) r2
                float r2 = r2.floatValue()
                int r2 = r1.g(r2)
                return r2
        }

        @Override // kotlin.collections.b, java.util.Collection
        public boolean isEmpty() {
                r1 = this;
                float[] r0 = r1.a
                int r0 = r0.length
                if (r0 != 0) goto L7
                r0 = 1
                return r0
            L7:
                r0 = 0
                return r0
        }

        public int j(float r7) {
                r6 = this;
                float[] r0 = r6.a
                int r1 = r0.length
                r2 = -1
                int r1 = r1 + r2
                if (r1 < 0) goto L1b
            L7:
                int r3 = r1 + (-1)
                r4 = r0[r1]
                int r4 = java.lang.Float.floatToIntBits(r4)
                int r5 = java.lang.Float.floatToIntBits(r7)
                if (r4 != r5) goto L16
                return r1
            L16:
                if (r3 >= 0) goto L19
                goto L1b
            L19:
                r1 = r3
                goto L7
            L1b:
                return r2
        }

        @Override // kotlin.collections.d, java.util.List
        public final /* bridge */ int lastIndexOf(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.lang.Float
                if (r0 != 0) goto L6
                r2 = -1
                return r2
            L6:
                java.lang.Number r2 = (java.lang.Number) r2
                float r2 = r2.floatValue()
                int r2 = r1.j(r2)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\n_ArraysJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt$asList$6\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,3051:1\n13030#2,2:3052\n1844#2,6:3054\n1952#2,6:3060\n*S KotlinDebug\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt$asList$6\n*L\n213#1:3052,2\n215#1:3054,6\n216#1:3060,6\n*E\n"})
    public static final class f extends kotlin.collections.d<java.lang.Double> implements java.util.RandomAccess {
        final /* synthetic */ double[] a;

        f(double[] r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // kotlin.collections.b, java.util.Collection
        public final /* bridge */ boolean contains(java.lang.Object r3) {
                r2 = this;
                boolean r0 = r3 instanceof java.lang.Double
                if (r0 != 0) goto L6
                r3 = 0
                return r3
            L6:
                java.lang.Number r3 = (java.lang.Number) r3
                double r0 = r3.doubleValue()
                boolean r3 = r2.e(r0)
                return r3
        }

        public boolean e(double r10) {
                r9 = this;
                double[] r0 = r9.a
                int r1 = r0.length
                r2 = 0
                r3 = 0
            L5:
                if (r3 >= r1) goto L1a
                r4 = r0[r3]
                long r4 = java.lang.Double.doubleToLongBits(r4)
                long r6 = java.lang.Double.doubleToLongBits(r10)
                int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r8 != 0) goto L17
                r10 = 1
                return r10
            L17:
                int r3 = r3 + 1
                goto L5
            L1a:
                return r2
        }

        public java.lang.Double f(int r4) {
                r3 = this;
                double[] r0 = r3.a
                r1 = r0[r4]
                java.lang.Double r4 = java.lang.Double.valueOf(r1)
                return r4
        }

        public int g(double r9) {
                r8 = this;
                double[] r0 = r8.a
                int r1 = r0.length
                r2 = 0
            L4:
                if (r2 >= r1) goto L18
                r3 = r0[r2]
                long r3 = java.lang.Double.doubleToLongBits(r3)
                long r5 = java.lang.Double.doubleToLongBits(r9)
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 != 0) goto L15
                return r2
            L15:
                int r2 = r2 + 1
                goto L4
            L18:
                r9 = -1
                return r9
        }

        @Override // kotlin.collections.d, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                r0 = this;
                java.lang.Double r1 = r0.f(r1)
                return r1
        }

        @Override // kotlin.collections.d, kotlin.collections.b
        public int getSize() {
                r1 = this;
                double[] r0 = r1.a
                int r0 = r0.length
                return r0
        }

        @Override // kotlin.collections.d, java.util.List
        public final /* bridge */ int indexOf(java.lang.Object r3) {
                r2 = this;
                boolean r0 = r3 instanceof java.lang.Double
                if (r0 != 0) goto L6
                r3 = -1
                return r3
            L6:
                java.lang.Number r3 = (java.lang.Number) r3
                double r0 = r3.doubleValue()
                int r3 = r2.g(r0)
                return r3
        }

        @Override // kotlin.collections.b, java.util.Collection
        public boolean isEmpty() {
                r1 = this;
                double[] r0 = r1.a
                int r0 = r0.length
                if (r0 != 0) goto L7
                r0 = 1
                return r0
            L7:
                r0 = 0
                return r0
        }

        public int j(double r10) {
                r9 = this;
                double[] r0 = r9.a
                int r1 = r0.length
                r2 = -1
                int r1 = r1 + r2
                if (r1 < 0) goto L1d
            L7:
                int r3 = r1 + (-1)
                r4 = r0[r1]
                long r4 = java.lang.Double.doubleToLongBits(r4)
                long r6 = java.lang.Double.doubleToLongBits(r10)
                int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r8 != 0) goto L18
                return r1
            L18:
                if (r3 >= 0) goto L1b
                goto L1d
            L1b:
                r1 = r3
                goto L7
            L1d:
                return r2
        }

        @Override // kotlin.collections.d, java.util.List
        public final /* bridge */ int lastIndexOf(java.lang.Object r3) {
                r2 = this;
                boolean r0 = r3 instanceof java.lang.Double
                if (r0 != 0) goto L6
                r3 = -1
                return r3
            L6:
                java.lang.Number r3 = (java.lang.Number) r3
                double r0 = r3.doubleValue()
                int r3 = r2.j(r0)
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class g extends kotlin.collections.d<java.lang.Boolean> implements java.util.RandomAccess {
        final /* synthetic */ boolean[] a;

        g(boolean[] r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // kotlin.collections.b, java.util.Collection
        public final /* bridge */ boolean contains(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.lang.Boolean
                if (r0 != 0) goto L6
                r2 = 0
                return r2
            L6:
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                boolean r2 = r1.e(r2)
                return r2
        }

        public boolean e(boolean r2) {
                r1 = this;
                boolean[] r0 = r1.a
                boolean r2 = kotlin.collections.a0.D8(r0, r2)
                return r2
        }

        public java.lang.Boolean f(int r2) {
                r1 = this;
                boolean[] r0 = r1.a
                boolean r2 = r0[r2]
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                return r2
        }

        public int g(boolean r2) {
                r1 = this;
                boolean[] r0 = r1.a
                int r2 = kotlin.collections.a0.dg(r0, r2)
                return r2
        }

        @Override // kotlin.collections.d, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                r0 = this;
                java.lang.Boolean r1 = r0.f(r1)
                return r1
        }

        @Override // kotlin.collections.d, kotlin.collections.b
        public int getSize() {
                r1 = this;
                boolean[] r0 = r1.a
                int r0 = r0.length
                return r0
        }

        @Override // kotlin.collections.d, java.util.List
        public final /* bridge */ int indexOf(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.lang.Boolean
                if (r0 != 0) goto L6
                r2 = -1
                return r2
            L6:
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                int r2 = r1.g(r2)
                return r2
        }

        @Override // kotlin.collections.b, java.util.Collection
        public boolean isEmpty() {
                r1 = this;
                boolean[] r0 = r1.a
                int r0 = r0.length
                if (r0 != 0) goto L7
                r0 = 1
                return r0
            L7:
                r0 = 0
                return r0
        }

        public int j(boolean r2) {
                r1 = this;
                boolean[] r0 = r1.a
                int r2 = kotlin.collections.a0.hi(r0, r2)
                return r2
        }

        @Override // kotlin.collections.d, java.util.List
        public final /* bridge */ int lastIndexOf(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.lang.Boolean
                if (r0 != 0) goto L6
                r2 = -1
                return r2
            L6:
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                int r2 = r1.j(r2)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class h extends kotlin.collections.d<java.lang.Character> implements java.util.RandomAccess {
        final /* synthetic */ char[] a;

        h(char[] r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // kotlin.collections.b, java.util.Collection
        public final /* bridge */ boolean contains(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.lang.Character
                if (r0 != 0) goto L6
                r2 = 0
                return r2
            L6:
                java.lang.Character r2 = (java.lang.Character) r2
                char r2 = r2.charValue()
                boolean r2 = r1.e(r2)
                return r2
        }

        public boolean e(char r2) {
                r1 = this;
                char[] r0 = r1.a
                boolean r2 = kotlin.collections.a0.w8(r0, r2)
                return r2
        }

        public java.lang.Character f(int r2) {
                r1 = this;
                char[] r0 = r1.a
                char r2 = r0[r2]
                java.lang.Character r2 = java.lang.Character.valueOf(r2)
                return r2
        }

        public int g(char r2) {
                r1 = this;
                char[] r0 = r1.a
                int r2 = kotlin.collections.a0.Wf(r0, r2)
                return r2
        }

        @Override // kotlin.collections.d, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                r0 = this;
                java.lang.Character r1 = r0.f(r1)
                return r1
        }

        @Override // kotlin.collections.d, kotlin.collections.b
        public int getSize() {
                r1 = this;
                char[] r0 = r1.a
                int r0 = r0.length
                return r0
        }

        @Override // kotlin.collections.d, java.util.List
        public final /* bridge */ int indexOf(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.lang.Character
                if (r0 != 0) goto L6
                r2 = -1
                return r2
            L6:
                java.lang.Character r2 = (java.lang.Character) r2
                char r2 = r2.charValue()
                int r2 = r1.g(r2)
                return r2
        }

        @Override // kotlin.collections.b, java.util.Collection
        public boolean isEmpty() {
                r1 = this;
                char[] r0 = r1.a
                int r0 = r0.length
                if (r0 != 0) goto L7
                r0 = 1
                return r0
            L7:
                r0 = 0
                return r0
        }

        public int j(char r2) {
                r1 = this;
                char[] r0 = r1.a
                int r2 = kotlin.collections.a0.ai(r0, r2)
                return r2
        }

        @Override // kotlin.collections.d, java.util.List
        public final /* bridge */ int lastIndexOf(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.lang.Character
                if (r0 != 0) goto L6
                r2 = -1
                return r2
            L6:
                java.lang.Character r2 = (java.lang.Character) r2
                char r2 = r2.charValue()
                int r2 = r1.j(r2)
                return r2
        }
    }

    public q() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final int A(@org.jetbrains.annotations.NotNull int[] r1, int r2, int r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r1 = java.util.Arrays.binarySearch(r1, r3, r4, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @org.jetbrains.annotations.NotNull
    public static long[] A0(@org.jetbrains.annotations.NotNull long[] r1, @org.jetbrains.annotations.NotNull long[] r2, int r3, int r4, int r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r5 = r5 - r4
            java.lang.System.arraycopy(r1, r4, r2, r3, r5)
            return r2
    }

    @kotlin.internal.InlineOnly
    private static final float A1(float[] r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r1 = r1[r2]
            return r1
    }

    @kotlin.Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Object A2(java.lang.Object[] r1, java.util.Comparator r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.Object r1 = kotlin.collections.a0.Bl(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static short[] A3(@org.jetbrains.annotations.NotNull short[] r2, short r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r2.length
            int r1 = r0 + 1
            short[] r2 = java.util.Arrays.copyOf(r2, r1)
            r2[r0] = r3
            kotlin.jvm.internal.g0.m(r2)
            return r2
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "sumOfBigInteger")
    @kotlin.OverloadResolutionByLambdaReturnType
    private static final java.math.BigInteger A4(short[] r4, kotlin.jvm.functions.Function1<? super java.lang.Short, ? extends java.math.BigInteger> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r5, r0)
            r0 = 0
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            java.lang.String r1 = "valueOf(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            int r1 = r4.length
            r2 = 0
        L17:
            if (r2 >= r1) goto L31
            short r3 = r4[r2]
            java.lang.Short r3 = java.lang.Short.valueOf(r3)
            java.lang.Object r3 = r5.invoke(r3)
            java.math.BigInteger r3 = (java.math.BigInteger) r3
            java.math.BigInteger r0 = r0.add(r3)
            java.lang.String r3 = "add(...)"
            kotlin.jvm.internal.g0.o(r0, r3)
            int r2 = r2 + 1
            goto L17
        L31:
            return r0
    }

    public static final int B(@org.jetbrains.annotations.NotNull long[] r1, long r2, int r4, int r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r1 = java.util.Arrays.binarySearch(r1, r4, r5, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @org.jetbrains.annotations.NotNull
    public static <T> T[] B0(@org.jetbrains.annotations.NotNull T[] r1, @org.jetbrains.annotations.NotNull T[] r2, int r3, int r4, int r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r5 = r5 - r4
            java.lang.System.arraycopy(r1, r4, r2, r3, r5)
            return r2
    }

    @kotlin.internal.InlineOnly
    private static final int B1(int[] r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r1 = r1[r2]
            return r1
    }

    @kotlin.Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Short B2(short[] r1, java.util.Comparator r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.Short r1 = kotlin.collections.a0.Cl(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static short[] B3(@org.jetbrains.annotations.NotNull short[] r3, @org.jetbrains.annotations.NotNull short[] r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r3.length
            int r1 = r4.length
            int r2 = r0 + r1
            short[] r3 = java.util.Arrays.copyOf(r3, r2)
            r2 = 0
            java.lang.System.arraycopy(r4, r2, r3, r0, r1)
            kotlin.jvm.internal.g0.m(r3)
            return r3
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "sumOfBigInteger")
    @kotlin.OverloadResolutionByLambdaReturnType
    private static final java.math.BigInteger B4(boolean[] r4, kotlin.jvm.functions.Function1<? super java.lang.Boolean, ? extends java.math.BigInteger> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r5, r0)
            r0 = 0
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            java.lang.String r1 = "valueOf(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            int r1 = r4.length
            r2 = 0
        L17:
            if (r2 >= r1) goto L31
            boolean r3 = r4[r2]
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.Object r3 = r5.invoke(r3)
            java.math.BigInteger r3 = (java.math.BigInteger) r3
            java.math.BigInteger r0 = r0.add(r3)
            java.lang.String r3 = "add(...)"
            kotlin.jvm.internal.g0.o(r0, r3)
            int r2 = r2 + 1
            goto L17
        L31:
            return r0
    }

    public static final <T> int C(@org.jetbrains.annotations.NotNull T[] r1, T r2, int r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r1 = java.util.Arrays.binarySearch(r1, r3, r4, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @org.jetbrains.annotations.NotNull
    public static short[] C0(@org.jetbrains.annotations.NotNull short[] r1, @org.jetbrains.annotations.NotNull short[] r2, int r3, int r4, int r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r5 = r5 - r4
            java.lang.System.arraycopy(r1, r4, r2, r3, r5)
            return r2
    }

    @kotlin.internal.InlineOnly
    private static final long C1(long[] r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = r2[r3]
            return r0
    }

    @kotlin.Deprecated(message = "Use minOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Byte C2(byte[] r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Byte r1 = kotlin.collections.a0.yn(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final boolean[] C3(@org.jetbrains.annotations.NotNull boolean[] r3, @org.jetbrains.annotations.NotNull java.util.Collection<java.lang.Boolean> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r3.length
            int r1 = r4.size()
            int r1 = r1 + r0
            boolean[] r3 = java.util.Arrays.copyOf(r3, r1)
            java.util.Iterator r4 = r4.iterator()
        L18:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r4.next()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            int r2 = r0 + 1
            r3[r0] = r1
            r0 = r2
            goto L18
        L2e:
            kotlin.jvm.internal.g0.m(r3)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.SortedSet<java.lang.Byte> C4(@org.jetbrains.annotations.NotNull byte[] r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>()
            java.util.Collection r1 = kotlin.collections.a0.Cy(r1, r0)
            java.util.SortedSet r1 = (java.util.SortedSet) r1
            return r1
    }

    public static final <T> int D(@org.jetbrains.annotations.NotNull T[] r1, T r2, @org.jetbrains.annotations.NotNull java.util.Comparator<? super T> r3, int r4, int r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r3, r0)
            int r1 = java.util.Arrays.binarySearch(r1, r4, r5, r2, r3)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @org.jetbrains.annotations.NotNull
    public static final boolean[] D0(@org.jetbrains.annotations.NotNull boolean[] r1, @org.jetbrains.annotations.NotNull boolean[] r2, int r3, int r4, int r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r5 = r5 - r4
            java.lang.System.arraycopy(r1, r4, r2, r3, r5)
            return r2
    }

    @kotlin.internal.InlineOnly
    private static final <T> T D1(T[] r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r1 = r1[r2]
            return r1
    }

    @kotlin.Deprecated(message = "Use minOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Character D2(char[] r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Character r1 = kotlin.collections.a0.zn(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final boolean[] D3(@org.jetbrains.annotations.NotNull boolean[] r2, boolean r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r2.length
            int r1 = r0 + 1
            boolean[] r2 = java.util.Arrays.copyOf(r2, r1)
            r2[r0] = r3
            kotlin.jvm.internal.g0.m(r2)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.SortedSet<java.lang.Character> D4(@org.jetbrains.annotations.NotNull char[] r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>()
            java.util.Collection r1 = kotlin.collections.a0.Dy(r1, r0)
            java.util.SortedSet r1 = (java.util.SortedSet) r1
            return r1
    }

    public static final int E(@org.jetbrains.annotations.NotNull short[] r1, short r2, int r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r1 = java.util.Arrays.binarySearch(r1, r3, r4, r2)
            return r1
    }

    public static /* synthetic */ byte[] E0(byte[] r1, byte[] r2, int r3, int r4, int r5, int r6, java.lang.Object r7) {
            r7 = r6 & 2
            r0 = 0
            if (r7 == 0) goto L6
            r3 = 0
        L6:
            r7 = r6 & 4
            if (r7 == 0) goto Lb
            r4 = 0
        Lb:
            r6 = r6 & 8
            if (r6 == 0) goto L10
            int r5 = r1.length
        L10:
            byte[] r1 = v0(r1, r2, r3, r4, r5)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final short E1(short[] r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            short r1 = r1[r2]
            return r1
    }

    @kotlin.Deprecated(message = "Use minOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Comparable E2(java.lang.Comparable[] r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Comparable r1 = kotlin.collections.a0.An(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final boolean[] E3(@org.jetbrains.annotations.NotNull boolean[] r3, @org.jetbrains.annotations.NotNull boolean[] r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r3.length
            int r1 = r4.length
            int r2 = r0 + r1
            boolean[] r3 = java.util.Arrays.copyOf(r3, r2)
            r2 = 0
            java.lang.System.arraycopy(r4, r2, r3, r0, r1)
            kotlin.jvm.internal.g0.m(r3)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.SortedSet<java.lang.Double> E4(@org.jetbrains.annotations.NotNull double[] r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>()
            java.util.Collection r1 = kotlin.collections.a0.Ey(r1, r0)
            java.util.SortedSet r1 = (java.util.SortedSet) r1
            return r1
    }

    public static /* synthetic */ int F(byte[] r0, byte r1, int r2, int r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto La
            int r3 = r0.length
        La:
            int r0 = w(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ char[] F0(char[] r1, char[] r2, int r3, int r4, int r5, int r6, java.lang.Object r7) {
            r7 = r6 & 2
            r0 = 0
            if (r7 == 0) goto L6
            r3 = 0
        L6:
            r7 = r6 & 4
            if (r7 == 0) goto Lb
            r4 = 0
        Lb:
            r6 = r6 & 8
            if (r6 == 0) goto L10
            int r5 = r1.length
        L10:
            char[] r1 = w0(r1, r2, r3, r4, r5)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final boolean F1(boolean[] r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r1 = r1[r2]
            return r1
    }

    @kotlin.Deprecated(message = "Use minOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Double F2(double[] r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Double r1 = kotlin.collections.a0.Bn(r1)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final <T> T[] F3(T[] r1, T r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Object[] r1 = w3(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.SortedSet<java.lang.Float> F4(@org.jetbrains.annotations.NotNull float[] r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>()
            java.util.Collection r1 = kotlin.collections.a0.Fy(r1, r0)
            java.util.SortedSet r1 = (java.util.SortedSet) r1
            return r1
    }

    public static /* synthetic */ int G(char[] r0, char r1, int r2, int r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto La
            int r3 = r0.length
        La:
            int r0 = x(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ double[] G0(double[] r1, double[] r2, int r3, int r4, int r5, int r6, java.lang.Object r7) {
            r7 = r6 & 2
            r0 = 0
            if (r7 == 0) goto L6
            r3 = 0
        L6:
            r7 = r6 & 4
            if (r7 == 0) goto Lb
            r4 = 0
        Lb:
            r6 = r6 & 8
            if (r6 == 0) goto L10
            int r5 = r1.length
        L10:
            double[] r1 = x0(r1, r2, r3, r4, r5)
            return r1
    }

    public static void G1(@org.jetbrains.annotations.NotNull byte[] r1, byte r2, int r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.Arrays.fill(r1, r3, r4, r2)
            return
    }

    @kotlin.Deprecated(message = "Use minOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Double G2(java.lang.Double[] r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Double r1 = kotlin.collections.a0.Cn(r1)
            return r1
    }

    public static final void G3(@org.jetbrains.annotations.NotNull byte[] r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r2.length
            r1 = 1
            if (r0 <= r1) goto Lc
            java.util.Arrays.sort(r2)
        Lc:
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.SortedSet<java.lang.Integer> G4(@org.jetbrains.annotations.NotNull int[] r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>()
            java.util.Collection r1 = kotlin.collections.a0.Gy(r1, r0)
            java.util.SortedSet r1 = (java.util.SortedSet) r1
            return r1
    }

    public static /* synthetic */ int H(double[] r0, double r1, int r3, int r4, int r5, java.lang.Object r6) {
            r6 = r5 & 2
            if (r6 == 0) goto L5
            r3 = 0
        L5:
            r5 = r5 & 4
            if (r5 == 0) goto La
            int r4 = r0.length
        La:
            int r0 = y(r0, r1, r3, r4)
            return r0
    }

    public static /* synthetic */ float[] H0(float[] r1, float[] r2, int r3, int r4, int r5, int r6, java.lang.Object r7) {
            r7 = r6 & 2
            r0 = 0
            if (r7 == 0) goto L6
            r3 = 0
        L6:
            r7 = r6 & 4
            if (r7 == 0) goto Lb
            r4 = 0
        Lb:
            r6 = r6 & 8
            if (r6 == 0) goto L10
            int r5 = r1.length
        L10:
            float[] r1 = y0(r1, r2, r3, r4, r5)
            return r1
    }

    public static void H1(@org.jetbrains.annotations.NotNull char[] r1, char r2, int r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.Arrays.fill(r1, r3, r4, r2)
            return
    }

    @kotlin.Deprecated(message = "Use minOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Float H2(float[] r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Float r1 = kotlin.collections.a0.Dn(r1)
            return r1
    }

    public static final void H3(@org.jetbrains.annotations.NotNull byte[] r1, int r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.Arrays.sort(r1, r2, r3)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.SortedSet<java.lang.Long> H4(@org.jetbrains.annotations.NotNull long[] r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>()
            java.util.Collection r1 = kotlin.collections.a0.Hy(r1, r0)
            java.util.SortedSet r1 = (java.util.SortedSet) r1
            return r1
    }

    public static /* synthetic */ int I(float[] r0, float r1, int r2, int r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto La
            int r3 = r0.length
        La:
            int r0 = z(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ int[] I0(int[] r1, int[] r2, int r3, int r4, int r5, int r6, java.lang.Object r7) {
            r7 = r6 & 2
            r0 = 0
            if (r7 == 0) goto L6
            r3 = 0
        L6:
            r7 = r6 & 4
            if (r7 == 0) goto Lb
            r4 = 0
        Lb:
            r6 = r6 & 8
            if (r6 == 0) goto L10
            int r5 = r1.length
        L10:
            int[] r1 = z0(r1, r2, r3, r4, r5)
            return r1
    }

    public static final void I1(@org.jetbrains.annotations.NotNull double[] r1, double r2, int r4, int r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.Arrays.fill(r1, r4, r5, r2)
            return
    }

    @kotlin.Deprecated(message = "Use minOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Float I2(java.lang.Float[] r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Float r1 = kotlin.collections.a0.En(r1)
            return r1
    }

    public static final void I3(@org.jetbrains.annotations.NotNull char[] r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r2.length
            r1 = 1
            if (r0 <= r1) goto Lc
            java.util.Arrays.sort(r2)
        Lc:
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final <T extends java.lang.Comparable<? super T>> java.util.SortedSet<T> I4(@org.jetbrains.annotations.NotNull T[] r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>()
            java.util.Collection r1 = kotlin.collections.a0.Iy(r1, r0)
            java.util.SortedSet r1 = (java.util.SortedSet) r1
            return r1
    }

    public static /* synthetic */ int J(int[] r0, int r1, int r2, int r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto La
            int r3 = r0.length
        La:
            int r0 = A(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ long[] J0(long[] r1, long[] r2, int r3, int r4, int r5, int r6, java.lang.Object r7) {
            r7 = r6 & 2
            r0 = 0
            if (r7 == 0) goto L6
            r3 = 0
        L6:
            r7 = r6 & 4
            if (r7 == 0) goto Lb
            r4 = 0
        Lb:
            r6 = r6 & 8
            if (r6 == 0) goto L10
            int r5 = r1.length
        L10:
            long[] r1 = A0(r1, r2, r3, r4, r5)
            return r1
    }

    public static final void J1(@org.jetbrains.annotations.NotNull float[] r1, float r2, int r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.Arrays.fill(r1, r3, r4, r2)
            return
    }

    @kotlin.Deprecated(message = "Use minOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Integer J2(int[] r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Integer r1 = kotlin.collections.a0.Fn(r1)
            return r1
    }

    public static final void J3(@org.jetbrains.annotations.NotNull char[] r1, int r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.Arrays.sort(r1, r2, r3)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.SortedSet<T> J4(@org.jetbrains.annotations.NotNull T[] r1, @org.jetbrains.annotations.NotNull java.util.Comparator<? super T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>(r2)
            java.util.Collection r1 = kotlin.collections.a0.Iy(r1, r0)
            java.util.SortedSet r1 = (java.util.SortedSet) r1
            return r1
    }

    public static /* synthetic */ int K(long[] r0, long r1, int r3, int r4, int r5, java.lang.Object r6) {
            r6 = r5 & 2
            if (r6 == 0) goto L5
            r3 = 0
        L5:
            r5 = r5 & 4
            if (r5 == 0) goto La
            int r4 = r0.length
        La:
            int r0 = B(r0, r1, r3, r4)
            return r0
    }

    public static /* synthetic */ java.lang.Object[] K0(java.lang.Object[] r1, java.lang.Object[] r2, int r3, int r4, int r5, int r6, java.lang.Object r7) {
            r7 = r6 & 2
            r0 = 0
            if (r7 == 0) goto L6
            r3 = 0
        L6:
            r7 = r6 & 4
            if (r7 == 0) goto Lb
            r4 = 0
        Lb:
            r6 = r6 & 8
            if (r6 == 0) goto L10
            int r5 = r1.length
        L10:
            java.lang.Object[] r1 = B0(r1, r2, r3, r4, r5)
            return r1
    }

    public static void K1(@org.jetbrains.annotations.NotNull int[] r1, int r2, int r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.Arrays.fill(r1, r3, r4, r2)
            return
    }

    @kotlin.Deprecated(message = "Use minOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Long K2(long[] r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Long r1 = kotlin.collections.a0.Gn(r1)
            return r1
    }

    public static final void K3(@org.jetbrains.annotations.NotNull double[] r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r2.length
            r1 = 1
            if (r0 <= r1) goto Lc
            java.util.Arrays.sort(r2)
        Lc:
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.SortedSet<java.lang.Short> K4(@org.jetbrains.annotations.NotNull short[] r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>()
            java.util.Collection r1 = kotlin.collections.a0.Jy(r1, r0)
            java.util.SortedSet r1 = (java.util.SortedSet) r1
            return r1
    }

    public static /* synthetic */ int L(java.lang.Object[] r0, java.lang.Object r1, int r2, int r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto La
            int r3 = r0.length
        La:
            int r0 = C(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ short[] L0(short[] r1, short[] r2, int r3, int r4, int r5, int r6, java.lang.Object r7) {
            r7 = r6 & 2
            r0 = 0
            if (r7 == 0) goto L6
            r3 = 0
        L6:
            r7 = r6 & 4
            if (r7 == 0) goto Lb
            r4 = 0
        Lb:
            r6 = r6 & 8
            if (r6 == 0) goto L10
            int r5 = r1.length
        L10:
            short[] r1 = C0(r1, r2, r3, r4, r5)
            return r1
    }

    public static void L1(@org.jetbrains.annotations.NotNull long[] r1, long r2, int r4, int r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.Arrays.fill(r1, r4, r5, r2)
            return
    }

    @kotlin.Deprecated(message = "Use minOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Short L2(short[] r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Short r1 = kotlin.collections.a0.Hn(r1)
            return r1
    }

    public static final void L3(@org.jetbrains.annotations.NotNull double[] r1, int r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.Arrays.sort(r1, r2, r3)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.SortedSet<java.lang.Boolean> L4(@org.jetbrains.annotations.NotNull boolean[] r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>()
            java.util.Collection r1 = kotlin.collections.a0.Ky(r1, r0)
            java.util.SortedSet r1 = (java.util.SortedSet) r1
            return r1
    }

    public static /* synthetic */ int M(java.lang.Object[] r0, java.lang.Object r1, java.util.Comparator r2, int r3, int r4, int r5, java.lang.Object r6) {
            r6 = r5 & 4
            if (r6 == 0) goto L5
            r3 = 0
        L5:
            r5 = r5 & 8
            if (r5 == 0) goto La
            int r4 = r0.length
        La:
            int r0 = D(r0, r1, r2, r3, r4)
            return r0
    }

    public static /* synthetic */ boolean[] M0(boolean[] r1, boolean[] r2, int r3, int r4, int r5, int r6, java.lang.Object r7) {
            r7 = r6 & 2
            r0 = 0
            if (r7 == 0) goto L6
            r3 = 0
        L6:
            r7 = r6 & 4
            if (r7 == 0) goto Lb
            r4 = 0
        Lb:
            r6 = r6 & 8
            if (r6 == 0) goto L10
            int r5 = r1.length
        L10:
            boolean[] r1 = D0(r1, r2, r3, r4, r5)
            return r1
    }

    public static <T> void M1(@org.jetbrains.annotations.NotNull T[] r1, T r2, int r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.Arrays.fill(r1, r3, r4, r2)
            return
    }

    @kotlin.Deprecated(message = "Use minByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends java.lang.Comparable<? super R>> java.lang.Boolean M2(boolean[] r7, kotlin.jvm.functions.Function1<? super java.lang.Boolean, ? extends R> r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r8, r0)
            int r0 = r7.length
            if (r0 != 0) goto Lf
            r7 = 0
            return r7
        Lf:
            r0 = 0
            boolean r0 = r7[r0]
            int r1 = kotlin.collections.a0.Qe(r7)
            if (r1 != 0) goto L1d
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
            return r7
        L1d:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            java.lang.Object r2 = r8.invoke(r2)
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            r3 = 1
            if (r3 > r1) goto L43
        L2a:
            boolean r4 = r7[r3]
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            java.lang.Object r5 = r8.invoke(r5)
            java.lang.Comparable r5 = (java.lang.Comparable) r5
            int r6 = r2.compareTo(r5)
            if (r6 <= 0) goto L3e
            r0 = r4
            r2 = r5
        L3e:
            if (r3 == r1) goto L43
            int r3 = r3 + 1
            goto L2a
        L43:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
            return r7
    }

    public static final void M3(@org.jetbrains.annotations.NotNull float[] r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r2.length
            r1 = 1
            if (r0 <= r1) goto Lc
            java.util.Arrays.sort(r2)
        Lc:
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.Boolean[] M4(@org.jetbrains.annotations.NotNull boolean[] r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r4.length
            java.lang.Boolean[] r0 = new java.lang.Boolean[r0]
            int r1 = r4.length
            r2 = 0
        La:
            if (r2 >= r1) goto L17
            boolean r3 = r4[r2]
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r0[r2] = r3
            int r2 = r2 + 1
            goto La
        L17:
            return r0
    }

    public static /* synthetic */ int N(short[] r0, short r1, int r2, int r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto La
            int r3 = r0.length
        La:
            int r0 = E(r0, r1, r2, r3)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final byte[] N0(byte[] r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r0 = r1.length
            byte[] r1 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String r0 = "copyOf(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }

    public static void N1(@org.jetbrains.annotations.NotNull short[] r1, short r2, int r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.Arrays.fill(r1, r3, r4, r2)
            return
    }

    @kotlin.Deprecated(message = "Use minByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends java.lang.Comparable<? super R>> java.lang.Byte N2(byte[] r7, kotlin.jvm.functions.Function1<? super java.lang.Byte, ? extends R> r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r8, r0)
            int r0 = r7.length
            if (r0 != 0) goto Lf
            r7 = 0
            return r7
        Lf:
            r0 = 0
            r0 = r7[r0]
            int r1 = kotlin.collections.a0.Ie(r7)
            if (r1 != 0) goto L1d
            java.lang.Byte r7 = java.lang.Byte.valueOf(r0)
            return r7
        L1d:
            java.lang.Byte r2 = java.lang.Byte.valueOf(r0)
            java.lang.Object r2 = r8.invoke(r2)
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            r3 = 1
            if (r3 > r1) goto L43
        L2a:
            r4 = r7[r3]
            java.lang.Byte r5 = java.lang.Byte.valueOf(r4)
            java.lang.Object r5 = r8.invoke(r5)
            java.lang.Comparable r5 = (java.lang.Comparable) r5
            int r6 = r2.compareTo(r5)
            if (r6 <= 0) goto L3e
            r0 = r4
            r2 = r5
        L3e:
            if (r3 == r1) goto L43
            int r3 = r3 + 1
            goto L2a
        L43:
            java.lang.Byte r7 = java.lang.Byte.valueOf(r0)
            return r7
    }

    public static void N3(@org.jetbrains.annotations.NotNull float[] r1, int r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.Arrays.sort(r1, r2, r3)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.Byte[] N4(@org.jetbrains.annotations.NotNull byte[] r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r4.length
            java.lang.Byte[] r0 = new java.lang.Byte[r0]
            int r1 = r4.length
            r2 = 0
        La:
            if (r2 >= r1) goto L17
            r3 = r4[r2]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r0[r2] = r3
            int r2 = r2 + 1
            goto La
        L17:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "contentDeepEqualsInline")
    @kotlin.internal.LowPriorityInOverloadResolution
    private static final <T> boolean O(T[] r1, T[] r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r1 = kotlin.collections.p.g(r1, r2)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final byte[] O0(byte[] r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            byte[] r1 = java.util.Arrays.copyOf(r1, r2)
            java.lang.String r2 = "copyOf(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    public static final void O1(@org.jetbrains.annotations.NotNull boolean[] r1, boolean r2, int r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.Arrays.fill(r1, r3, r4, r2)
            return
    }

    @kotlin.Deprecated(message = "Use minByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends java.lang.Comparable<? super R>> java.lang.Character O2(char[] r7, kotlin.jvm.functions.Function1<? super java.lang.Character, ? extends R> r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r8, r0)
            int r0 = r7.length
            if (r0 != 0) goto Lf
            r7 = 0
            return r7
        Lf:
            r0 = 0
            char r0 = r7[r0]
            int r1 = kotlin.collections.a0.Je(r7)
            if (r1 != 0) goto L1d
            java.lang.Character r7 = java.lang.Character.valueOf(r0)
            return r7
        L1d:
            java.lang.Character r2 = java.lang.Character.valueOf(r0)
            java.lang.Object r2 = r8.invoke(r2)
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            r3 = 1
            if (r3 > r1) goto L43
        L2a:
            char r4 = r7[r3]
            java.lang.Character r5 = java.lang.Character.valueOf(r4)
            java.lang.Object r5 = r8.invoke(r5)
            java.lang.Comparable r5 = (java.lang.Comparable) r5
            int r6 = r2.compareTo(r5)
            if (r6 <= 0) goto L3e
            r0 = r4
            r2 = r5
        L3e:
            if (r3 == r1) goto L43
            int r3 = r3 + 1
            goto L2a
        L43:
            java.lang.Character r7 = java.lang.Character.valueOf(r0)
            return r7
    }

    public static final void O3(@org.jetbrains.annotations.NotNull int[] r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r2.length
            r1 = 1
            if (r0 <= r1) goto Lc
            java.util.Arrays.sort(r2)
        Lc:
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.Character[] O4(@org.jetbrains.annotations.NotNull char[] r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r4.length
            java.lang.Character[] r0 = new java.lang.Character[r0]
            int r1 = r4.length
            r2 = 0
        La:
            if (r2 >= r1) goto L17
            char r3 = r4[r2]
            java.lang.Character r3 = java.lang.Character.valueOf(r3)
            r0[r2] = r3
            int r2 = r2 + 1
            goto La
        L17:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "contentDeepEqualsNullable")
    private static final <T> boolean P(T[] r0, T[] r1) {
            boolean r0 = kotlin.collections.p.g(r0, r1)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final char[] P0(char[] r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r0 = r1.length
            char[] r1 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String r0 = "copyOf(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }

    public static /* synthetic */ void P1(byte[] r0, byte r1, int r2, int r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto La
            int r3 = r0.length
        La:
            G1(r0, r1, r2, r3)
            return
    }

    @kotlin.Deprecated(message = "Use minByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends java.lang.Comparable<? super R>> java.lang.Double P2(double[] r9, kotlin.jvm.functions.Function1<? super java.lang.Double, ? extends R> r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r10, r0)
            int r0 = r9.length
            if (r0 != 0) goto Lf
            r9 = 0
            return r9
        Lf:
            r0 = 0
            r0 = r9[r0]
            int r2 = kotlin.collections.a0.Ke(r9)
            if (r2 != 0) goto L1d
            java.lang.Double r9 = java.lang.Double.valueOf(r0)
            return r9
        L1d:
            java.lang.Double r3 = java.lang.Double.valueOf(r0)
            java.lang.Object r3 = r10.invoke(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = 1
            if (r4 > r2) goto L43
        L2a:
            r5 = r9[r4]
            java.lang.Double r7 = java.lang.Double.valueOf(r5)
            java.lang.Object r7 = r10.invoke(r7)
            java.lang.Comparable r7 = (java.lang.Comparable) r7
            int r8 = r3.compareTo(r7)
            if (r8 <= 0) goto L3e
            r0 = r5
            r3 = r7
        L3e:
            if (r4 == r2) goto L43
            int r4 = r4 + 1
            goto L2a
        L43:
            java.lang.Double r9 = java.lang.Double.valueOf(r0)
            return r9
    }

    public static void P3(@org.jetbrains.annotations.NotNull int[] r1, int r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.Arrays.sort(r1, r2, r3)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.Double[] P4(@org.jetbrains.annotations.NotNull double[] r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            int r0 = r5.length
            java.lang.Double[] r0 = new java.lang.Double[r0]
            int r1 = r5.length
            r2 = 0
        La:
            if (r2 >= r1) goto L17
            r3 = r5[r2]
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            r0[r2] = r3
            int r2 = r2 + 1
            goto La
        L17:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "contentDeepHashCodeInline")
    @kotlin.internal.LowPriorityInOverloadResolution
    private static final <T> int Q(T[] r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r1 = kotlin.collections.o.b(r1)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final char[] Q0(char[] r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            char[] r1 = java.util.Arrays.copyOf(r1, r2)
            java.lang.String r2 = "copyOf(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    public static /* synthetic */ void Q1(char[] r0, char r1, int r2, int r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto La
            int r3 = r0.length
        La:
            H1(r0, r1, r2, r3)
            return
    }

    @kotlin.Deprecated(message = "Use minByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends java.lang.Comparable<? super R>> java.lang.Float Q2(float[] r7, kotlin.jvm.functions.Function1<? super java.lang.Float, ? extends R> r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r8, r0)
            int r0 = r7.length
            if (r0 != 0) goto Lf
            r7 = 0
            return r7
        Lf:
            r0 = 0
            r0 = r7[r0]
            int r1 = kotlin.collections.a0.Le(r7)
            if (r1 != 0) goto L1d
            java.lang.Float r7 = java.lang.Float.valueOf(r0)
            return r7
        L1d:
            java.lang.Float r2 = java.lang.Float.valueOf(r0)
            java.lang.Object r2 = r8.invoke(r2)
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            r3 = 1
            if (r3 > r1) goto L43
        L2a:
            r4 = r7[r3]
            java.lang.Float r5 = java.lang.Float.valueOf(r4)
            java.lang.Object r5 = r8.invoke(r5)
            java.lang.Comparable r5 = (java.lang.Comparable) r5
            int r6 = r2.compareTo(r5)
            if (r6 <= 0) goto L3e
            r0 = r4
            r2 = r5
        L3e:
            if (r3 == r1) goto L43
            int r3 = r3 + 1
            goto L2a
        L43:
            java.lang.Float r7 = java.lang.Float.valueOf(r0)
            return r7
    }

    public static final void Q3(@org.jetbrains.annotations.NotNull long[] r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r2.length
            r1 = 1
            if (r0 <= r1) goto Lc
            java.util.Arrays.sort(r2)
        Lc:
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.Float[] Q4(@org.jetbrains.annotations.NotNull float[] r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r4.length
            java.lang.Float[] r0 = new java.lang.Float[r0]
            int r1 = r4.length
            r2 = 0
        La:
            if (r2 >= r1) goto L17
            r3 = r4[r2]
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r0[r2] = r3
            int r2 = r2 + 1
            goto La
        L17:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "contentDeepHashCodeNullable")
    private static final <T> int R(T[] r0) {
            int r0 = kotlin.collections.o.b(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final double[] R0(double[] r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r0 = r1.length
            double[] r1 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String r0 = "copyOf(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }

    public static /* synthetic */ void R1(double[] r0, double r1, int r3, int r4, int r5, java.lang.Object r6) {
            r6 = r5 & 2
            if (r6 == 0) goto L5
            r3 = 0
        L5:
            r5 = r5 & 4
            if (r5 == 0) goto La
            int r4 = r0.length
        La:
            I1(r0, r1, r3, r4)
            return
    }

    @kotlin.Deprecated(message = "Use minByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends java.lang.Comparable<? super R>> java.lang.Integer R2(int[] r7, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends R> r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r8, r0)
            int r0 = r7.length
            if (r0 != 0) goto Lf
            r7 = 0
            return r7
        Lf:
            r0 = 0
            r0 = r7[r0]
            int r1 = kotlin.collections.a0.Me(r7)
            if (r1 != 0) goto L1d
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            return r7
        L1d:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Object r2 = r8.invoke(r2)
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            r3 = 1
            if (r3 > r1) goto L43
        L2a:
            r4 = r7[r3]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            java.lang.Object r5 = r8.invoke(r5)
            java.lang.Comparable r5 = (java.lang.Comparable) r5
            int r6 = r2.compareTo(r5)
            if (r6 <= 0) goto L3e
            r0 = r4
            r2 = r5
        L3e:
            if (r3 == r1) goto L43
            int r3 = r3 + 1
            goto L2a
        L43:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            return r7
    }

    public static void R3(@org.jetbrains.annotations.NotNull long[] r1, int r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.Arrays.sort(r1, r2, r3)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.Integer[] R4(@org.jetbrains.annotations.NotNull int[] r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r4.length
            java.lang.Integer[] r0 = new java.lang.Integer[r0]
            int r1 = r4.length
            r2 = 0
        La:
            if (r2 >= r1) goto L17
            r3 = r4[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r2] = r3
            int r2 = r2 + 1
            goto La
        L17:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "contentDeepToStringInline")
    @kotlin.internal.LowPriorityInOverloadResolution
    private static final <T> java.lang.String S(T[] r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r1 = kotlin.collections.p.h(r1)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final double[] S0(double[] r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            double[] r1 = java.util.Arrays.copyOf(r1, r2)
            java.lang.String r2 = "copyOf(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    public static /* synthetic */ void S1(float[] r0, float r1, int r2, int r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto La
            int r3 = r0.length
        La:
            J1(r0, r1, r2, r3)
            return
    }

    @kotlin.Deprecated(message = "Use minByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends java.lang.Comparable<? super R>> java.lang.Long S2(long[] r9, kotlin.jvm.functions.Function1<? super java.lang.Long, ? extends R> r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r10, r0)
            int r0 = r9.length
            if (r0 != 0) goto Lf
            r9 = 0
            return r9
        Lf:
            r0 = 0
            r0 = r9[r0]
            int r2 = kotlin.collections.a0.Ne(r9)
            if (r2 != 0) goto L1d
            java.lang.Long r9 = java.lang.Long.valueOf(r0)
            return r9
        L1d:
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            java.lang.Object r3 = r10.invoke(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = 1
            if (r4 > r2) goto L43
        L2a:
            r5 = r9[r4]
            java.lang.Long r7 = java.lang.Long.valueOf(r5)
            java.lang.Object r7 = r10.invoke(r7)
            java.lang.Comparable r7 = (java.lang.Comparable) r7
            int r8 = r3.compareTo(r7)
            if (r8 <= 0) goto L3e
            r0 = r5
            r3 = r7
        L3e:
            if (r4 == r2) goto L43
            int r4 = r4 + 1
            goto L2a
        L43:
            java.lang.Long r9 = java.lang.Long.valueOf(r0)
            return r9
    }

    @kotlin.internal.InlineOnly
    private static final <T extends java.lang.Comparable<? super T>> void S3(T[] r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            U3(r1)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.Long[] S4(@org.jetbrains.annotations.NotNull long[] r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            int r0 = r5.length
            java.lang.Long[] r0 = new java.lang.Long[r0]
            int r1 = r5.length
            r2 = 0
        La:
            if (r2 >= r1) goto L17
            r3 = r5[r2]
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r0[r2] = r3
            int r2 = r2 + 1
            goto La
        L17:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "contentDeepToStringNullable")
    private static final <T> java.lang.String T(T[] r0) {
            java.lang.String r0 = kotlin.collections.p.h(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final float[] T0(float[] r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r0 = r1.length
            float[] r1 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String r0 = "copyOf(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }

    public static /* synthetic */ void T1(int[] r0, int r1, int r2, int r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto La
            int r3 = r0.length
        La:
            K1(r0, r1, r2, r3)
            return
    }

    @kotlin.Deprecated(message = "Use minByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <T, R extends java.lang.Comparable<? super R>> T T2(T[] r7, kotlin.jvm.functions.Function1<? super T, ? extends R> r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r8, r0)
            int r0 = r7.length
            if (r0 != 0) goto Lf
            r7 = 0
            return r7
        Lf:
            r0 = 0
            r0 = r7[r0]
            int r1 = kotlin.collections.a0.Oe(r7)
            if (r1 != 0) goto L19
            goto L37
        L19:
            java.lang.Object r2 = r8.invoke(r0)
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            r3 = 1
            if (r3 > r1) goto L37
        L22:
            r4 = r7[r3]
            java.lang.Object r5 = r8.invoke(r4)
            java.lang.Comparable r5 = (java.lang.Comparable) r5
            int r6 = r2.compareTo(r5)
            if (r6 <= 0) goto L32
            r0 = r4
            r2 = r5
        L32:
            if (r3 == r1) goto L37
            int r3 = r3 + 1
            goto L22
        L37:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    public static final <T extends java.lang.Comparable<? super T>> void T3(@org.jetbrains.annotations.NotNull T[] r1, int r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.Arrays.sort(r1, r2, r3)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.Short[] T4(@org.jetbrains.annotations.NotNull short[] r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r4.length
            java.lang.Short[] r0 = new java.lang.Short[r0]
            int r1 = r4.length
            r2 = 0
        La:
            if (r2 >= r1) goto L17
            short r3 = r4[r2]
            java.lang.Short r3 = java.lang.Short.valueOf(r3)
            r0[r2] = r3
            int r2 = r2 + 1
            goto La
        L17:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final boolean U(byte[] r0, byte[] r1) {
            boolean r0 = java.util.Arrays.equals(r0, r1)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final float[] U0(float[] r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            float[] r1 = java.util.Arrays.copyOf(r1, r2)
            java.lang.String r2 = "copyOf(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    public static /* synthetic */ void U1(long[] r0, long r1, int r3, int r4, int r5, java.lang.Object r6) {
            r6 = r5 & 2
            if (r6 == 0) goto L5
            r3 = 0
        L5:
            r5 = r5 & 4
            if (r5 == 0) goto La
            int r4 = r0.length
        La:
            L1(r0, r1, r3, r4)
            return
    }

    @kotlin.Deprecated(message = "Use minByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends java.lang.Comparable<? super R>> java.lang.Short U2(short[] r7, kotlin.jvm.functions.Function1<? super java.lang.Short, ? extends R> r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r8, r0)
            int r0 = r7.length
            if (r0 != 0) goto Lf
            r7 = 0
            return r7
        Lf:
            r0 = 0
            short r0 = r7[r0]
            int r1 = kotlin.collections.a0.Pe(r7)
            if (r1 != 0) goto L1d
            java.lang.Short r7 = java.lang.Short.valueOf(r0)
            return r7
        L1d:
            java.lang.Short r2 = java.lang.Short.valueOf(r0)
            java.lang.Object r2 = r8.invoke(r2)
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            r3 = 1
            if (r3 > r1) goto L43
        L2a:
            short r4 = r7[r3]
            java.lang.Short r5 = java.lang.Short.valueOf(r4)
            java.lang.Object r5 = r8.invoke(r5)
            java.lang.Comparable r5 = (java.lang.Comparable) r5
            int r6 = r2.compareTo(r5)
            if (r6 <= 0) goto L3e
            r0 = r4
            r2 = r5
        L3e:
            if (r3 == r1) goto L43
            int r3 = r3 + 1
            goto L2a
        L43:
            java.lang.Short r7 = java.lang.Short.valueOf(r0)
            return r7
    }

    public static final <T> void U3(@org.jetbrains.annotations.NotNull T[] r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r2.length
            r1 = 1
            if (r0 <= r1) goto Lc
            java.util.Arrays.sort(r2)
        Lc:
            return
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final boolean V(char[] r0, char[] r1) {
            boolean r0 = java.util.Arrays.equals(r0, r1)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final int[] V0(int[] r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r0 = r1.length
            int[] r1 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String r0 = "copyOf(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }

    public static /* synthetic */ void V1(java.lang.Object[] r0, java.lang.Object r1, int r2, int r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto La
            int r3 = r0.length
        La:
            M1(r0, r1, r2, r3)
            return
    }

    @kotlin.Deprecated(message = "Use minWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Boolean V2(boolean[] r1, java.util.Comparator r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.Boolean r1 = kotlin.collections.a0.Sn(r1, r2)
            return r1
    }

    public static final <T> void V3(@org.jetbrains.annotations.NotNull T[] r1, int r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.Arrays.sort(r1, r2, r3)
            return
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final boolean W(double[] r0, double[] r1) {
            boolean r0 = java.util.Arrays.equals(r0, r1)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final int[] W0(int[] r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int[] r1 = java.util.Arrays.copyOf(r1, r2)
            java.lang.String r2 = "copyOf(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    public static /* synthetic */ void W1(short[] r0, short r1, int r2, int r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto La
            int r3 = r0.length
        La:
            N1(r0, r1, r2, r3)
            return
    }

    @kotlin.Deprecated(message = "Use minWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Byte W2(byte[] r1, java.util.Comparator r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.Byte r1 = kotlin.collections.a0.Tn(r1, r2)
            return r1
    }

    public static final void W3(@org.jetbrains.annotations.NotNull short[] r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r2.length
            r1 = 1
            if (r0 <= r1) goto Lc
            java.util.Arrays.sort(r2)
        Lc:
            return
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final boolean X(float[] r0, float[] r1) {
            boolean r0 = java.util.Arrays.equals(r0, r1)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final long[] X0(long[] r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r0 = r1.length
            long[] r1 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String r0 = "copyOf(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }

    public static /* synthetic */ void X1(boolean[] r0, boolean r1, int r2, int r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto La
            int r3 = r0.length
        La:
            O1(r0, r1, r2, r3)
            return
    }

    @kotlin.Deprecated(message = "Use minWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Character X2(char[] r1, java.util.Comparator r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.Character r1 = kotlin.collections.a0.Un(r1, r2)
            return r1
    }

    public static final void X3(@org.jetbrains.annotations.NotNull short[] r1, int r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.Arrays.sort(r1, r2, r3)
            return
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final boolean Y(int[] r0, int[] r1) {
            boolean r0 = java.util.Arrays.equals(r0, r1)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final long[] Y0(long[] r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            long[] r1 = java.util.Arrays.copyOf(r1, r2)
            java.lang.String r2 = "copyOf(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <R> java.util.List<R> Y1(@org.jetbrains.annotations.NotNull java.lang.Object[] r1, @org.jetbrains.annotations.NotNull java.lang.Class<R> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "klass"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Collection r1 = Z1(r1, r0, r2)
            java.util.List r1 = (java.util.List) r1
            return r1
    }

    @kotlin.Deprecated(message = "Use minWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Double Y2(double[] r1, java.util.Comparator r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.Double r1 = kotlin.collections.a0.Vn(r1, r2)
            return r1
    }

    public static /* synthetic */ void Y3(byte[] r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto La
            int r2 = r0.length
        La:
            H3(r0, r1, r2)
            return
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final boolean Z(long[] r0, long[] r1) {
            boolean r0 = java.util.Arrays.equals(r0, r1)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final <T> T[] Z0(T[] r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r0 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String r0 = "copyOf(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <C extends java.util.Collection<? super R>, R> C Z1(@org.jetbrains.annotations.NotNull java.lang.Object[] r4, @org.jetbrains.annotations.NotNull C r5, @org.jetbrains.annotations.NotNull java.lang.Class<R> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "klass"
            kotlin.jvm.internal.g0.p(r6, r0)
            int r0 = r4.length
            r1 = 0
        L11:
            if (r1 >= r0) goto L21
            r2 = r4[r1]
            boolean r3 = r6.isInstance(r2)
            if (r3 == 0) goto L1e
            r5.add(r2)
        L1e:
            int r1 = r1 + 1
            goto L11
        L21:
            return r5
    }

    @kotlin.Deprecated(message = "Use minWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Float Z2(float[] r1, java.util.Comparator r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.Float r1 = kotlin.collections.a0.Wn(r1, r2)
            return r1
    }

    public static /* synthetic */ void Z3(char[] r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto La
            int r2 = r0.length
        La:
            J3(r0, r1, r2)
            return
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final <T> boolean a0(T[] r0, T[] r1) {
            boolean r0 = java.util.Arrays.equals(r0, r1)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final <T> T[] a1(T[] r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            java.lang.String r2 = "copyOf(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    @kotlin.Deprecated(message = "Use maxOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Byte a2(byte[] r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Byte r1 = kotlin.collections.a0.al(r1)
            return r1
    }

    @kotlin.Deprecated(message = "Use minWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Integer a3(int[] r1, java.util.Comparator r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.Integer r1 = kotlin.collections.a0.Xn(r1, r2)
            return r1
    }

    public static /* synthetic */ void a4(double[] r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto La
            int r2 = r0.length
        La:
            L3(r0, r1, r2)
            return
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final boolean b0(short[] r0, short[] r1) {
            boolean r0 = java.util.Arrays.equals(r0, r1)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final short[] b1(short[] r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r0 = r1.length
            short[] r1 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String r0 = "copyOf(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }

    @kotlin.Deprecated(message = "Use maxOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Character b2(char[] r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Character r1 = kotlin.collections.a0.bl(r1)
            return r1
    }

    @kotlin.Deprecated(message = "Use minWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Long b3(long[] r1, java.util.Comparator r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.Long r1 = kotlin.collections.a0.Yn(r1, r2)
            return r1
    }

    public static /* synthetic */ void b4(float[] r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto La
            int r2 = r0.length
        La:
            N3(r0, r1, r2)
            return
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final boolean c0(boolean[] r0, boolean[] r1) {
            boolean r0 = java.util.Arrays.equals(r0, r1)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final short[] c1(short[] r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            short[] r1 = java.util.Arrays.copyOf(r1, r2)
            java.lang.String r2 = "copyOf(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    @kotlin.Deprecated(message = "Use maxOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Comparable c2(java.lang.Comparable[] r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Comparable r1 = kotlin.collections.a0.cl(r1)
            return r1
    }

    @kotlin.Deprecated(message = "Use minWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Object c3(java.lang.Object[] r1, java.util.Comparator r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.Object r1 = kotlin.collections.a0.Zn(r1, r2)
            return r1
    }

    public static /* synthetic */ void c4(int[] r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto La
            int r2 = r0.length
        La:
            P3(r0, r1, r2)
            return
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final int d0(byte[] r0) {
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final boolean[] d1(boolean[] r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r0 = r1.length
            boolean[] r1 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String r0 = "copyOf(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }

    @kotlin.Deprecated(message = "Use maxOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Double d2(double[] r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Double r1 = kotlin.collections.a0.dl(r1)
            return r1
    }

    @kotlin.Deprecated(message = "Use minWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Short d3(short[] r1, java.util.Comparator r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.Short r1 = kotlin.collections.a0.ao(r1, r2)
            return r1
    }

    public static /* synthetic */ void d4(long[] r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto La
            int r2 = r0.length
        La:
            R3(r0, r1, r2)
            return
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final int e0(char[] r0) {
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final boolean[] e1(boolean[] r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean[] r1 = java.util.Arrays.copyOf(r1, r2)
            java.lang.String r2 = "copyOf(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    @kotlin.Deprecated(message = "Use maxOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Double e2(java.lang.Double[] r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Double r1 = kotlin.collections.a0.el(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static byte[] e3(@org.jetbrains.annotations.NotNull byte[] r2, byte r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r2.length
            int r1 = r0 + 1
            byte[] r2 = java.util.Arrays.copyOf(r2, r1)
            r2[r0] = r3
            kotlin.jvm.internal.g0.m(r2)
            return r2
    }

    public static /* synthetic */ void e4(java.lang.Comparable[] r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto La
            int r2 = r0.length
        La:
            T3(r0, r1, r2)
            return
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final int f0(double[] r0) {
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.jvm.JvmName(name = "copyOfRange")
    @org.jetbrains.annotations.NotNull
    @kotlin.PublishedApi
    public static byte[] f1(@org.jetbrains.annotations.NotNull byte[] r1, int r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r0 = r1.length
            kotlin.collections.o.c(r3, r0)
            byte[] r1 = java.util.Arrays.copyOfRange(r1, r2, r3)
            java.lang.String r2 = "copyOfRange(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    @kotlin.Deprecated(message = "Use maxOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Float f2(float[] r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Float r1 = kotlin.collections.a0.fl(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final byte[] f3(@org.jetbrains.annotations.NotNull byte[] r3, @org.jetbrains.annotations.NotNull java.util.Collection<java.lang.Byte> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r3.length
            int r1 = r4.size()
            int r1 = r1 + r0
            byte[] r3 = java.util.Arrays.copyOf(r3, r1)
            java.util.Iterator r4 = r4.iterator()
        L18:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r4.next()
            java.lang.Number r1 = (java.lang.Number) r1
            byte r1 = r1.byteValue()
            int r2 = r0 + 1
            r3[r0] = r1
            r0 = r2
            goto L18
        L2e:
            kotlin.jvm.internal.g0.m(r3)
            return r3
    }

    public static /* synthetic */ void f4(java.lang.Object[] r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto La
            int r2 = r0.length
        La:
            V3(r0, r1, r2)
            return
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final int g0(float[] r0) {
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.jvm.JvmName(name = "copyOfRange")
    @org.jetbrains.annotations.NotNull
    @kotlin.PublishedApi
    public static final char[] g1(@org.jetbrains.annotations.NotNull char[] r1, int r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r0 = r1.length
            kotlin.collections.o.c(r3, r0)
            char[] r1 = java.util.Arrays.copyOfRange(r1, r2, r3)
            java.lang.String r2 = "copyOfRange(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    @kotlin.Deprecated(message = "Use maxOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Float g2(java.lang.Float[] r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Float r1 = kotlin.collections.a0.gl(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static byte[] g3(@org.jetbrains.annotations.NotNull byte[] r3, @org.jetbrains.annotations.NotNull byte[] r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r3.length
            int r1 = r4.length
            int r2 = r0 + r1
            byte[] r3 = java.util.Arrays.copyOf(r3, r2)
            r2 = 0
            java.lang.System.arraycopy(r4, r2, r3, r0, r1)
            kotlin.jvm.internal.g0.m(r3)
            return r3
    }

    public static /* synthetic */ void g4(short[] r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto La
            int r2 = r0.length
        La:
            X3(r0, r1, r2)
            return
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final int h0(int[] r0) {
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.jvm.JvmName(name = "copyOfRange")
    @org.jetbrains.annotations.NotNull
    @kotlin.PublishedApi
    public static final double[] h1(@org.jetbrains.annotations.NotNull double[] r1, int r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r0 = r1.length
            kotlin.collections.o.c(r3, r0)
            double[] r1 = java.util.Arrays.copyOfRange(r1, r2, r3)
            java.lang.String r2 = "copyOfRange(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    @kotlin.Deprecated(message = "Use maxOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Integer h2(int[] r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Integer r1 = kotlin.collections.a0.hl(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final char[] h3(@org.jetbrains.annotations.NotNull char[] r2, char r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r2.length
            int r1 = r0 + 1
            char[] r2 = java.util.Arrays.copyOf(r2, r1)
            r2[r0] = r3
            kotlin.jvm.internal.g0.m(r2)
            return r2
    }

    public static final <T> void h4(@org.jetbrains.annotations.NotNull T[] r2, @org.jetbrains.annotations.NotNull java.util.Comparator<? super T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r3, r0)
            int r0 = r2.length
            r1 = 1
            if (r0 <= r1) goto L11
            java.util.Arrays.sort(r2, r3)
        L11:
            return
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final int i0(long[] r0) {
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.jvm.JvmName(name = "copyOfRange")
    @org.jetbrains.annotations.NotNull
    @kotlin.PublishedApi
    public static final float[] i1(@org.jetbrains.annotations.NotNull float[] r1, int r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r0 = r1.length
            kotlin.collections.o.c(r3, r0)
            float[] r1 = java.util.Arrays.copyOfRange(r1, r2, r3)
            java.lang.String r2 = "copyOfRange(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    @kotlin.Deprecated(message = "Use maxOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Long i2(long[] r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Long r1 = kotlin.collections.a0.il(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final char[] i3(@org.jetbrains.annotations.NotNull char[] r3, @org.jetbrains.annotations.NotNull java.util.Collection<java.lang.Character> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r3.length
            int r1 = r4.size()
            int r1 = r1 + r0
            char[] r3 = java.util.Arrays.copyOf(r3, r1)
            java.util.Iterator r4 = r4.iterator()
        L18:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r4.next()
            java.lang.Character r1 = (java.lang.Character) r1
            char r1 = r1.charValue()
            int r2 = r0 + 1
            r3[r0] = r1
            r0 = r2
            goto L18
        L2e:
            kotlin.jvm.internal.g0.m(r3)
            return r3
    }

    public static final <T> void i4(@org.jetbrains.annotations.NotNull T[] r1, @org.jetbrains.annotations.NotNull java.util.Comparator<? super T> r2, int r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Arrays.sort(r1, r3, r4, r2)
            return
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final <T> int j0(T[] r0) {
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.jvm.JvmName(name = "copyOfRange")
    @org.jetbrains.annotations.NotNull
    @kotlin.PublishedApi
    public static int[] j1(@org.jetbrains.annotations.NotNull int[] r1, int r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r0 = r1.length
            kotlin.collections.o.c(r3, r0)
            int[] r1 = java.util.Arrays.copyOfRange(r1, r2, r3)
            java.lang.String r2 = "copyOfRange(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    @kotlin.Deprecated(message = "Use maxOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Short j2(short[] r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Short r1 = kotlin.collections.a0.jl(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final char[] j3(@org.jetbrains.annotations.NotNull char[] r3, @org.jetbrains.annotations.NotNull char[] r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r3.length
            int r1 = r4.length
            int r2 = r0 + r1
            char[] r3 = java.util.Arrays.copyOf(r3, r2)
            r2 = 0
            java.lang.System.arraycopy(r4, r2, r3, r0, r1)
            kotlin.jvm.internal.g0.m(r3)
            return r3
    }

    public static /* synthetic */ void j4(java.lang.Object[] r0, java.util.Comparator r1, int r2, int r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto La
            int r3 = r0.length
        La:
            i4(r0, r1, r2, r3)
            return
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final int k0(short[] r0) {
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.jvm.JvmName(name = "copyOfRange")
    @org.jetbrains.annotations.NotNull
    @kotlin.PublishedApi
    public static long[] k1(@org.jetbrains.annotations.NotNull long[] r1, int r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r0 = r1.length
            kotlin.collections.o.c(r3, r0)
            long[] r1 = java.util.Arrays.copyOfRange(r1, r2, r3)
            java.lang.String r2 = "copyOfRange(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    @kotlin.Deprecated(message = "Use maxByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends java.lang.Comparable<? super R>> java.lang.Boolean k2(boolean[] r7, kotlin.jvm.functions.Function1<? super java.lang.Boolean, ? extends R> r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r8, r0)
            int r0 = r7.length
            if (r0 != 0) goto Lf
            r7 = 0
            return r7
        Lf:
            r0 = 0
            boolean r0 = r7[r0]
            int r1 = kotlin.collections.a0.Qe(r7)
            if (r1 != 0) goto L1d
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
            return r7
        L1d:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            java.lang.Object r2 = r8.invoke(r2)
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            r3 = 1
            if (r3 > r1) goto L43
        L2a:
            boolean r4 = r7[r3]
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            java.lang.Object r5 = r8.invoke(r5)
            java.lang.Comparable r5 = (java.lang.Comparable) r5
            int r6 = r2.compareTo(r5)
            if (r6 >= 0) goto L3e
            r0 = r4
            r2 = r5
        L3e:
            if (r3 == r1) goto L43
            int r3 = r3 + 1
            goto L2a
        L43:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
            return r7
    }

    @org.jetbrains.annotations.NotNull
    public static final double[] k3(@org.jetbrains.annotations.NotNull double[] r2, double r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r2.length
            int r1 = r0 + 1
            double[] r2 = java.util.Arrays.copyOf(r2, r1)
            r2[r0] = r3
            kotlin.jvm.internal.g0.m(r2)
            return r2
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "sumOfBigDecimal")
    @kotlin.OverloadResolutionByLambdaReturnType
    private static final java.math.BigDecimal k4(byte[] r4, kotlin.jvm.functions.Function1<? super java.lang.Byte, ? extends java.math.BigDecimal> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r5, r0)
            r0 = 0
            java.math.BigDecimal r0 = java.math.BigDecimal.valueOf(r0)
            java.lang.String r1 = "valueOf(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            int r1 = r4.length
            r2 = 0
        L17:
            if (r2 >= r1) goto L31
            r3 = r4[r2]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            java.lang.Object r3 = r5.invoke(r3)
            java.math.BigDecimal r3 = (java.math.BigDecimal) r3
            java.math.BigDecimal r0 = r0.add(r3)
            java.lang.String r3 = "add(...)"
            kotlin.jvm.internal.g0.o(r0, r3)
            int r2 = r2 + 1
            goto L17
        L31:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final int l0(boolean[] r0) {
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.jvm.JvmName(name = "copyOfRange")
    @org.jetbrains.annotations.NotNull
    @kotlin.PublishedApi
    public static <T> T[] l1(@org.jetbrains.annotations.NotNull T[] r1, int r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r0 = r1.length
            kotlin.collections.o.c(r3, r0)
            java.lang.Object[] r1 = java.util.Arrays.copyOfRange(r1, r2, r3)
            java.lang.String r2 = "copyOfRange(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    @kotlin.Deprecated(message = "Use maxByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends java.lang.Comparable<? super R>> java.lang.Byte l2(byte[] r7, kotlin.jvm.functions.Function1<? super java.lang.Byte, ? extends R> r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r8, r0)
            int r0 = r7.length
            if (r0 != 0) goto Lf
            r7 = 0
            return r7
        Lf:
            r0 = 0
            r0 = r7[r0]
            int r1 = kotlin.collections.a0.Ie(r7)
            if (r1 != 0) goto L1d
            java.lang.Byte r7 = java.lang.Byte.valueOf(r0)
            return r7
        L1d:
            java.lang.Byte r2 = java.lang.Byte.valueOf(r0)
            java.lang.Object r2 = r8.invoke(r2)
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            r3 = 1
            if (r3 > r1) goto L43
        L2a:
            r4 = r7[r3]
            java.lang.Byte r5 = java.lang.Byte.valueOf(r4)
            java.lang.Object r5 = r8.invoke(r5)
            java.lang.Comparable r5 = (java.lang.Comparable) r5
            int r6 = r2.compareTo(r5)
            if (r6 >= 0) goto L3e
            r0 = r4
            r2 = r5
        L3e:
            if (r3 == r1) goto L43
            int r3 = r3 + 1
            goto L2a
        L43:
            java.lang.Byte r7 = java.lang.Byte.valueOf(r0)
            return r7
    }

    @org.jetbrains.annotations.NotNull
    public static final double[] l3(@org.jetbrains.annotations.NotNull double[] r4, @org.jetbrains.annotations.NotNull java.util.Collection<java.lang.Double> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r5, r0)
            int r0 = r4.length
            int r1 = r5.size()
            int r1 = r1 + r0
            double[] r4 = java.util.Arrays.copyOf(r4, r1)
            java.util.Iterator r5 = r5.iterator()
        L18:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r5.next()
            java.lang.Number r1 = (java.lang.Number) r1
            double r1 = r1.doubleValue()
            int r3 = r0 + 1
            r4[r0] = r1
            r0 = r3
            goto L18
        L2e:
            kotlin.jvm.internal.g0.m(r4)
            return r4
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "sumOfBigDecimal")
    @kotlin.OverloadResolutionByLambdaReturnType
    private static final java.math.BigDecimal l4(char[] r4, kotlin.jvm.functions.Function1<? super java.lang.Character, ? extends java.math.BigDecimal> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r5, r0)
            r0 = 0
            java.math.BigDecimal r0 = java.math.BigDecimal.valueOf(r0)
            java.lang.String r1 = "valueOf(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            int r1 = r4.length
            r2 = 0
        L17:
            if (r2 >= r1) goto L31
            char r3 = r4[r2]
            java.lang.Character r3 = java.lang.Character.valueOf(r3)
            java.lang.Object r3 = r5.invoke(r3)
            java.math.BigDecimal r3 = (java.math.BigDecimal) r3
            java.math.BigDecimal r0 = r0.add(r3)
            java.lang.String r3 = "add(...)"
            kotlin.jvm.internal.g0.o(r0, r3)
            int r2 = r2 + 1
            goto L17
        L31:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final java.lang.String m0(byte[] r1) {
            java.lang.String r1 = java.util.Arrays.toString(r1)
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.jvm.JvmName(name = "copyOfRange")
    @org.jetbrains.annotations.NotNull
    @kotlin.PublishedApi
    public static short[] m1(@org.jetbrains.annotations.NotNull short[] r1, int r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r0 = r1.length
            kotlin.collections.o.c(r3, r0)
            short[] r1 = java.util.Arrays.copyOfRange(r1, r2, r3)
            java.lang.String r2 = "copyOfRange(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    @kotlin.Deprecated(message = "Use maxByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends java.lang.Comparable<? super R>> java.lang.Character m2(char[] r7, kotlin.jvm.functions.Function1<? super java.lang.Character, ? extends R> r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r8, r0)
            int r0 = r7.length
            if (r0 != 0) goto Lf
            r7 = 0
            return r7
        Lf:
            r0 = 0
            char r0 = r7[r0]
            int r1 = kotlin.collections.a0.Je(r7)
            if (r1 != 0) goto L1d
            java.lang.Character r7 = java.lang.Character.valueOf(r0)
            return r7
        L1d:
            java.lang.Character r2 = java.lang.Character.valueOf(r0)
            java.lang.Object r2 = r8.invoke(r2)
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            r3 = 1
            if (r3 > r1) goto L43
        L2a:
            char r4 = r7[r3]
            java.lang.Character r5 = java.lang.Character.valueOf(r4)
            java.lang.Object r5 = r8.invoke(r5)
            java.lang.Comparable r5 = (java.lang.Comparable) r5
            int r6 = r2.compareTo(r5)
            if (r6 >= 0) goto L3e
            r0 = r4
            r2 = r5
        L3e:
            if (r3 == r1) goto L43
            int r3 = r3 + 1
            goto L2a
        L43:
            java.lang.Character r7 = java.lang.Character.valueOf(r0)
            return r7
    }

    @org.jetbrains.annotations.NotNull
    public static final double[] m3(@org.jetbrains.annotations.NotNull double[] r3, @org.jetbrains.annotations.NotNull double[] r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r3.length
            int r1 = r4.length
            int r2 = r0 + r1
            double[] r3 = java.util.Arrays.copyOf(r3, r2)
            r2 = 0
            java.lang.System.arraycopy(r4, r2, r3, r0, r1)
            kotlin.jvm.internal.g0.m(r3)
            return r3
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "sumOfBigDecimal")
    @kotlin.OverloadResolutionByLambdaReturnType
    private static final java.math.BigDecimal m4(double[] r5, kotlin.jvm.functions.Function1<? super java.lang.Double, ? extends java.math.BigDecimal> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r6, r0)
            r0 = 0
            java.math.BigDecimal r0 = java.math.BigDecimal.valueOf(r0)
            java.lang.String r1 = "valueOf(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            int r1 = r5.length
            r2 = 0
        L17:
            if (r2 >= r1) goto L31
            r3 = r5[r2]
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            java.lang.Object r3 = r6.invoke(r3)
            java.math.BigDecimal r3 = (java.math.BigDecimal) r3
            java.math.BigDecimal r0 = r0.add(r3)
            java.lang.String r3 = "add(...)"
            kotlin.jvm.internal.g0.o(r0, r3)
            int r2 = r2 + 1
            goto L17
        L31:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.List<java.lang.Byte> n(@org.jetbrains.annotations.NotNull byte[] r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.collections.q$a r0 = new kotlin.collections.q$a
            r0.<init>(r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final java.lang.String n0(char[] r1) {
            java.lang.String r1 = java.util.Arrays.toString(r1)
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.jvm.JvmName(name = "copyOfRange")
    @org.jetbrains.annotations.NotNull
    @kotlin.PublishedApi
    public static final boolean[] n1(@org.jetbrains.annotations.NotNull boolean[] r1, int r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r0 = r1.length
            kotlin.collections.o.c(r3, r0)
            boolean[] r1 = java.util.Arrays.copyOfRange(r1, r2, r3)
            java.lang.String r2 = "copyOfRange(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    @kotlin.Deprecated(message = "Use maxByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends java.lang.Comparable<? super R>> java.lang.Double n2(double[] r9, kotlin.jvm.functions.Function1<? super java.lang.Double, ? extends R> r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r10, r0)
            int r0 = r9.length
            if (r0 != 0) goto Lf
            r9 = 0
            return r9
        Lf:
            r0 = 0
            r0 = r9[r0]
            int r2 = kotlin.collections.a0.Ke(r9)
            if (r2 != 0) goto L1d
            java.lang.Double r9 = java.lang.Double.valueOf(r0)
            return r9
        L1d:
            java.lang.Double r3 = java.lang.Double.valueOf(r0)
            java.lang.Object r3 = r10.invoke(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = 1
            if (r4 > r2) goto L43
        L2a:
            r5 = r9[r4]
            java.lang.Double r7 = java.lang.Double.valueOf(r5)
            java.lang.Object r7 = r10.invoke(r7)
            java.lang.Comparable r7 = (java.lang.Comparable) r7
            int r8 = r3.compareTo(r7)
            if (r8 >= 0) goto L3e
            r0 = r5
            r3 = r7
        L3e:
            if (r4 == r2) goto L43
            int r4 = r4 + 1
            goto L2a
        L43:
            java.lang.Double r9 = java.lang.Double.valueOf(r0)
            return r9
    }

    @org.jetbrains.annotations.NotNull
    public static final float[] n3(@org.jetbrains.annotations.NotNull float[] r2, float r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r2.length
            int r1 = r0 + 1
            float[] r2 = java.util.Arrays.copyOf(r2, r1)
            r2[r0] = r3
            kotlin.jvm.internal.g0.m(r2)
            return r2
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "sumOfBigDecimal")
    @kotlin.OverloadResolutionByLambdaReturnType
    private static final java.math.BigDecimal n4(float[] r4, kotlin.jvm.functions.Function1<? super java.lang.Float, ? extends java.math.BigDecimal> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r5, r0)
            r0 = 0
            java.math.BigDecimal r0 = java.math.BigDecimal.valueOf(r0)
            java.lang.String r1 = "valueOf(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            int r1 = r4.length
            r2 = 0
        L17:
            if (r2 >= r1) goto L31
            r3 = r4[r2]
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            java.lang.Object r3 = r5.invoke(r3)
            java.math.BigDecimal r3 = (java.math.BigDecimal) r3
            java.math.BigDecimal r0 = r0.add(r3)
            java.lang.String r3 = "add(...)"
            kotlin.jvm.internal.g0.o(r0, r3)
            int r2 = r2 + 1
            goto L17
        L31:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.List<java.lang.Character> o(@org.jetbrains.annotations.NotNull char[] r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.collections.q$h r0 = new kotlin.collections.q$h
            r0.<init>(r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final java.lang.String o0(double[] r1) {
            java.lang.String r1 = java.util.Arrays.toString(r1)
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }

    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "copyOfRangeInline")
    private static final byte[] o1(byte[] r1, int r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            byte[] r1 = f1(r1, r2, r3)
            return r1
    }

    @kotlin.Deprecated(message = "Use maxByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends java.lang.Comparable<? super R>> java.lang.Float o2(float[] r7, kotlin.jvm.functions.Function1<? super java.lang.Float, ? extends R> r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r8, r0)
            int r0 = r7.length
            if (r0 != 0) goto Lf
            r7 = 0
            return r7
        Lf:
            r0 = 0
            r0 = r7[r0]
            int r1 = kotlin.collections.a0.Le(r7)
            if (r1 != 0) goto L1d
            java.lang.Float r7 = java.lang.Float.valueOf(r0)
            return r7
        L1d:
            java.lang.Float r2 = java.lang.Float.valueOf(r0)
            java.lang.Object r2 = r8.invoke(r2)
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            r3 = 1
            if (r3 > r1) goto L43
        L2a:
            r4 = r7[r3]
            java.lang.Float r5 = java.lang.Float.valueOf(r4)
            java.lang.Object r5 = r8.invoke(r5)
            java.lang.Comparable r5 = (java.lang.Comparable) r5
            int r6 = r2.compareTo(r5)
            if (r6 >= 0) goto L3e
            r0 = r4
            r2 = r5
        L3e:
            if (r3 == r1) goto L43
            int r3 = r3 + 1
            goto L2a
        L43:
            java.lang.Float r7 = java.lang.Float.valueOf(r0)
            return r7
    }

    @org.jetbrains.annotations.NotNull
    public static final float[] o3(@org.jetbrains.annotations.NotNull float[] r3, @org.jetbrains.annotations.NotNull java.util.Collection<java.lang.Float> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r3.length
            int r1 = r4.size()
            int r1 = r1 + r0
            float[] r3 = java.util.Arrays.copyOf(r3, r1)
            java.util.Iterator r4 = r4.iterator()
        L18:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r4.next()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            int r2 = r0 + 1
            r3[r0] = r1
            r0 = r2
            goto L18
        L2e:
            kotlin.jvm.internal.g0.m(r3)
            return r3
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "sumOfBigDecimal")
    @kotlin.OverloadResolutionByLambdaReturnType
    private static final java.math.BigDecimal o4(int[] r4, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.math.BigDecimal> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r5, r0)
            r0 = 0
            java.math.BigDecimal r0 = java.math.BigDecimal.valueOf(r0)
            java.lang.String r1 = "valueOf(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            int r1 = r4.length
            r2 = 0
        L17:
            if (r2 >= r1) goto L31
            r3 = r4[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r3 = r5.invoke(r3)
            java.math.BigDecimal r3 = (java.math.BigDecimal) r3
            java.math.BigDecimal r0 = r0.add(r3)
            java.lang.String r3 = "add(...)"
            kotlin.jvm.internal.g0.o(r0, r3)
            int r2 = r2 + 1
            goto L17
        L31:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static java.util.List<java.lang.Double> p(@org.jetbrains.annotations.NotNull double[] r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.collections.q$f r0 = new kotlin.collections.q$f
            r0.<init>(r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final java.lang.String p0(float[] r1) {
            java.lang.String r1 = java.util.Arrays.toString(r1)
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }

    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "copyOfRangeInline")
    private static final char[] p1(char[] r1, int r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            char[] r1 = g1(r1, r2, r3)
            return r1
    }

    @kotlin.Deprecated(message = "Use maxByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends java.lang.Comparable<? super R>> java.lang.Integer p2(int[] r7, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends R> r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r8, r0)
            int r0 = r7.length
            if (r0 != 0) goto Lf
            r7 = 0
            return r7
        Lf:
            r0 = 0
            r0 = r7[r0]
            int r1 = kotlin.collections.a0.Me(r7)
            if (r1 != 0) goto L1d
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            return r7
        L1d:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Object r2 = r8.invoke(r2)
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            r3 = 1
            if (r3 > r1) goto L43
        L2a:
            r4 = r7[r3]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            java.lang.Object r5 = r8.invoke(r5)
            java.lang.Comparable r5 = (java.lang.Comparable) r5
            int r6 = r2.compareTo(r5)
            if (r6 >= 0) goto L3e
            r0 = r4
            r2 = r5
        L3e:
            if (r3 == r1) goto L43
            int r3 = r3 + 1
            goto L2a
        L43:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            return r7
    }

    @org.jetbrains.annotations.NotNull
    public static final float[] p3(@org.jetbrains.annotations.NotNull float[] r3, @org.jetbrains.annotations.NotNull float[] r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r3.length
            int r1 = r4.length
            int r2 = r0 + r1
            float[] r3 = java.util.Arrays.copyOf(r3, r2)
            r2 = 0
            java.lang.System.arraycopy(r4, r2, r3, r0, r1)
            kotlin.jvm.internal.g0.m(r3)
            return r3
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "sumOfBigDecimal")
    @kotlin.OverloadResolutionByLambdaReturnType
    private static final java.math.BigDecimal p4(long[] r5, kotlin.jvm.functions.Function1<? super java.lang.Long, ? extends java.math.BigDecimal> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r6, r0)
            r0 = 0
            java.math.BigDecimal r0 = java.math.BigDecimal.valueOf(r0)
            java.lang.String r1 = "valueOf(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            int r1 = r5.length
            r2 = 0
        L17:
            if (r2 >= r1) goto L31
            r3 = r5[r2]
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Object r3 = r6.invoke(r3)
            java.math.BigDecimal r3 = (java.math.BigDecimal) r3
            java.math.BigDecimal r0 = r0.add(r3)
            java.lang.String r3 = "add(...)"
            kotlin.jvm.internal.g0.o(r0, r3)
            int r2 = r2 + 1
            goto L17
        L31:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.List<java.lang.Float> q(@org.jetbrains.annotations.NotNull float[] r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.collections.q$e r0 = new kotlin.collections.q$e
            r0.<init>(r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final java.lang.String q0(int[] r1) {
            java.lang.String r1 = java.util.Arrays.toString(r1)
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }

    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "copyOfRangeInline")
    private static final double[] q1(double[] r1, int r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            double[] r1 = h1(r1, r2, r3)
            return r1
    }

    @kotlin.Deprecated(message = "Use maxByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends java.lang.Comparable<? super R>> java.lang.Long q2(long[] r9, kotlin.jvm.functions.Function1<? super java.lang.Long, ? extends R> r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r10, r0)
            int r0 = r9.length
            if (r0 != 0) goto Lf
            r9 = 0
            return r9
        Lf:
            r0 = 0
            r0 = r9[r0]
            int r2 = kotlin.collections.a0.Ne(r9)
            if (r2 != 0) goto L1d
            java.lang.Long r9 = java.lang.Long.valueOf(r0)
            return r9
        L1d:
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            java.lang.Object r3 = r10.invoke(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = 1
            if (r4 > r2) goto L43
        L2a:
            r5 = r9[r4]
            java.lang.Long r7 = java.lang.Long.valueOf(r5)
            java.lang.Object r7 = r10.invoke(r7)
            java.lang.Comparable r7 = (java.lang.Comparable) r7
            int r8 = r3.compareTo(r7)
            if (r8 >= 0) goto L3e
            r0 = r5
            r3 = r7
        L3e:
            if (r4 == r2) goto L43
            int r4 = r4 + 1
            goto L2a
        L43:
            java.lang.Long r9 = java.lang.Long.valueOf(r0)
            return r9
    }

    @org.jetbrains.annotations.NotNull
    public static int[] q3(@org.jetbrains.annotations.NotNull int[] r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r2.length
            int r1 = r0 + 1
            int[] r2 = java.util.Arrays.copyOf(r2, r1)
            r2[r0] = r3
            kotlin.jvm.internal.g0.m(r2)
            return r2
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "sumOfBigDecimal")
    @kotlin.OverloadResolutionByLambdaReturnType
    private static final <T> java.math.BigDecimal q4(T[] r4, kotlin.jvm.functions.Function1<? super T, ? extends java.math.BigDecimal> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r5, r0)
            r0 = 0
            java.math.BigDecimal r0 = java.math.BigDecimal.valueOf(r0)
            java.lang.String r1 = "valueOf(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            int r1 = r4.length
            r2 = 0
        L17:
            if (r2 >= r1) goto L2d
            r3 = r4[r2]
            java.lang.Object r3 = r5.invoke(r3)
            java.math.BigDecimal r3 = (java.math.BigDecimal) r3
            java.math.BigDecimal r0 = r0.add(r3)
            java.lang.String r3 = "add(...)"
            kotlin.jvm.internal.g0.o(r0, r3)
            int r2 = r2 + 1
            goto L17
        L2d:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static java.util.List<java.lang.Integer> r(@org.jetbrains.annotations.NotNull int[] r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.collections.q$c r0 = new kotlin.collections.q$c
            r0.<init>(r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final java.lang.String r0(long[] r1) {
            java.lang.String r1 = java.util.Arrays.toString(r1)
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }

    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "copyOfRangeInline")
    private static final float[] r1(float[] r1, int r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            float[] r1 = i1(r1, r2, r3)
            return r1
    }

    @kotlin.Deprecated(message = "Use maxByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <T, R extends java.lang.Comparable<? super R>> T r2(T[] r7, kotlin.jvm.functions.Function1<? super T, ? extends R> r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r8, r0)
            int r0 = r7.length
            if (r0 != 0) goto Lf
            r7 = 0
            return r7
        Lf:
            r0 = 0
            r0 = r7[r0]
            int r1 = kotlin.collections.a0.Oe(r7)
            if (r1 != 0) goto L19
            goto L37
        L19:
            java.lang.Object r2 = r8.invoke(r0)
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            r3 = 1
            if (r3 > r1) goto L37
        L22:
            r4 = r7[r3]
            java.lang.Object r5 = r8.invoke(r4)
            java.lang.Comparable r5 = (java.lang.Comparable) r5
            int r6 = r2.compareTo(r5)
            if (r6 >= 0) goto L32
            r0 = r4
            r2 = r5
        L32:
            if (r3 == r1) goto L37
            int r3 = r3 + 1
            goto L22
        L37:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final int[] r3(@org.jetbrains.annotations.NotNull int[] r3, @org.jetbrains.annotations.NotNull java.util.Collection<java.lang.Integer> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r3.length
            int r1 = r4.size()
            int r1 = r1 + r0
            int[] r3 = java.util.Arrays.copyOf(r3, r1)
            java.util.Iterator r4 = r4.iterator()
        L18:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r4.next()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r2 = r0 + 1
            r3[r0] = r1
            r0 = r2
            goto L18
        L2e:
            kotlin.jvm.internal.g0.m(r3)
            return r3
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "sumOfBigDecimal")
    @kotlin.OverloadResolutionByLambdaReturnType
    private static final java.math.BigDecimal r4(short[] r4, kotlin.jvm.functions.Function1<? super java.lang.Short, ? extends java.math.BigDecimal> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r5, r0)
            r0 = 0
            java.math.BigDecimal r0 = java.math.BigDecimal.valueOf(r0)
            java.lang.String r1 = "valueOf(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            int r1 = r4.length
            r2 = 0
        L17:
            if (r2 >= r1) goto L31
            short r3 = r4[r2]
            java.lang.Short r3 = java.lang.Short.valueOf(r3)
            java.lang.Object r3 = r5.invoke(r3)
            java.math.BigDecimal r3 = (java.math.BigDecimal) r3
            java.math.BigDecimal r0 = r0.add(r3)
            java.lang.String r3 = "add(...)"
            kotlin.jvm.internal.g0.o(r0, r3)
            int r2 = r2 + 1
            goto L17
        L31:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static java.util.List<java.lang.Long> s(@org.jetbrains.annotations.NotNull long[] r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.collections.q$d r0 = new kotlin.collections.q$d
            r0.<init>(r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final <T> java.lang.String s0(T[] r1) {
            java.lang.String r1 = java.util.Arrays.toString(r1)
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }

    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "copyOfRangeInline")
    private static final int[] s1(int[] r1, int r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int[] r1 = j1(r1, r2, r3)
            return r1
    }

    @kotlin.Deprecated(message = "Use maxByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends java.lang.Comparable<? super R>> java.lang.Short s2(short[] r7, kotlin.jvm.functions.Function1<? super java.lang.Short, ? extends R> r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r8, r0)
            int r0 = r7.length
            if (r0 != 0) goto Lf
            r7 = 0
            return r7
        Lf:
            r0 = 0
            short r0 = r7[r0]
            int r1 = kotlin.collections.a0.Pe(r7)
            if (r1 != 0) goto L1d
            java.lang.Short r7 = java.lang.Short.valueOf(r0)
            return r7
        L1d:
            java.lang.Short r2 = java.lang.Short.valueOf(r0)
            java.lang.Object r2 = r8.invoke(r2)
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            r3 = 1
            if (r3 > r1) goto L43
        L2a:
            short r4 = r7[r3]
            java.lang.Short r5 = java.lang.Short.valueOf(r4)
            java.lang.Object r5 = r8.invoke(r5)
            java.lang.Comparable r5 = (java.lang.Comparable) r5
            int r6 = r2.compareTo(r5)
            if (r6 >= 0) goto L3e
            r0 = r4
            r2 = r5
        L3e:
            if (r3 == r1) goto L43
            int r3 = r3 + 1
            goto L2a
        L43:
            java.lang.Short r7 = java.lang.Short.valueOf(r0)
            return r7
    }

    @org.jetbrains.annotations.NotNull
    public static int[] s3(@org.jetbrains.annotations.NotNull int[] r3, @org.jetbrains.annotations.NotNull int[] r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r3.length
            int r1 = r4.length
            int r2 = r0 + r1
            int[] r3 = java.util.Arrays.copyOf(r3, r2)
            r2 = 0
            java.lang.System.arraycopy(r4, r2, r3, r0, r1)
            kotlin.jvm.internal.g0.m(r3)
            return r3
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "sumOfBigDecimal")
    @kotlin.OverloadResolutionByLambdaReturnType
    private static final java.math.BigDecimal s4(boolean[] r4, kotlin.jvm.functions.Function1<? super java.lang.Boolean, ? extends java.math.BigDecimal> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r5, r0)
            r0 = 0
            java.math.BigDecimal r0 = java.math.BigDecimal.valueOf(r0)
            java.lang.String r1 = "valueOf(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            int r1 = r4.length
            r2 = 0
        L17:
            if (r2 >= r1) goto L31
            boolean r3 = r4[r2]
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.Object r3 = r5.invoke(r3)
            java.math.BigDecimal r3 = (java.math.BigDecimal) r3
            java.math.BigDecimal r0 = r0.add(r3)
            java.lang.String r3 = "add(...)"
            kotlin.jvm.internal.g0.o(r0, r3)
            int r2 = r2 + 1
            goto L17
        L31:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static <T> java.util.List<T> t(@org.jetbrains.annotations.NotNull T[] r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.List r1 = kotlin.collections.b0.a(r1)
            java.lang.String r0 = "asList(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final java.lang.String t0(short[] r1) {
            java.lang.String r1 = java.util.Arrays.toString(r1)
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }

    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "copyOfRangeInline")
    private static final long[] t1(long[] r1, int r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            long[] r1 = k1(r1, r2, r3)
            return r1
    }

    @kotlin.Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Boolean t2(boolean[] r1, java.util.Comparator r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.Boolean r1 = kotlin.collections.a0.ul(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static long[] t3(@org.jetbrains.annotations.NotNull long[] r2, long r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r2.length
            int r1 = r0 + 1
            long[] r2 = java.util.Arrays.copyOf(r2, r1)
            r2[r0] = r3
            kotlin.jvm.internal.g0.m(r2)
            return r2
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "sumOfBigInteger")
    @kotlin.OverloadResolutionByLambdaReturnType
    private static final java.math.BigInteger t4(byte[] r4, kotlin.jvm.functions.Function1<? super java.lang.Byte, ? extends java.math.BigInteger> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r5, r0)
            r0 = 0
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            java.lang.String r1 = "valueOf(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            int r1 = r4.length
            r2 = 0
        L17:
            if (r2 >= r1) goto L31
            r3 = r4[r2]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            java.lang.Object r3 = r5.invoke(r3)
            java.math.BigInteger r3 = (java.math.BigInteger) r3
            java.math.BigInteger r0 = r0.add(r3)
            java.lang.String r3 = "add(...)"
            kotlin.jvm.internal.g0.o(r0, r3)
            int r2 = r2 + 1
            goto L17
        L31:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.List<java.lang.Short> u(@org.jetbrains.annotations.NotNull short[] r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.collections.q$b r0 = new kotlin.collections.q$b
            r0.<init>(r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final java.lang.String u0(boolean[] r1) {
            java.lang.String r1 = java.util.Arrays.toString(r1)
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }

    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "copyOfRangeInline")
    private static final <T> T[] u1(T[] r1, int r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Object[] r1 = l1(r1, r2, r3)
            return r1
    }

    @kotlin.Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Byte u2(byte[] r1, java.util.Comparator r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.Byte r1 = kotlin.collections.a0.vl(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final long[] u3(@org.jetbrains.annotations.NotNull long[] r4, @org.jetbrains.annotations.NotNull java.util.Collection<java.lang.Long> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r5, r0)
            int r0 = r4.length
            int r1 = r5.size()
            int r1 = r1 + r0
            long[] r4 = java.util.Arrays.copyOf(r4, r1)
            java.util.Iterator r5 = r5.iterator()
        L18:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r5.next()
            java.lang.Number r1 = (java.lang.Number) r1
            long r1 = r1.longValue()
            int r3 = r0 + 1
            r4[r0] = r1
            r0 = r3
            goto L18
        L2e:
            kotlin.jvm.internal.g0.m(r4)
            return r4
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "sumOfBigInteger")
    @kotlin.OverloadResolutionByLambdaReturnType
    private static final java.math.BigInteger u4(char[] r4, kotlin.jvm.functions.Function1<? super java.lang.Character, ? extends java.math.BigInteger> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r5, r0)
            r0 = 0
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            java.lang.String r1 = "valueOf(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            int r1 = r4.length
            r2 = 0
        L17:
            if (r2 >= r1) goto L31
            char r3 = r4[r2]
            java.lang.Character r3 = java.lang.Character.valueOf(r3)
            java.lang.Object r3 = r5.invoke(r3)
            java.math.BigInteger r3 = (java.math.BigInteger) r3
            java.math.BigInteger r0 = r0.add(r3)
            java.lang.String r3 = "add(...)"
            kotlin.jvm.internal.g0.o(r0, r3)
            int r2 = r2 + 1
            goto L17
        L31:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.List<java.lang.Boolean> v(@org.jetbrains.annotations.NotNull boolean[] r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.collections.q$g r0 = new kotlin.collections.q$g
            r0.<init>(r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    @org.jetbrains.annotations.NotNull
    public static byte[] v0(@org.jetbrains.annotations.NotNull byte[] r1, @org.jetbrains.annotations.NotNull byte[] r2, int r3, int r4, int r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r5 = r5 - r4
            java.lang.System.arraycopy(r1, r4, r2, r3, r5)
            return r2
    }

    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "copyOfRangeInline")
    private static final short[] v1(short[] r1, int r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            short[] r1 = m1(r1, r2, r3)
            return r1
    }

    @kotlin.Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Character v2(char[] r1, java.util.Comparator r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.Character r1 = kotlin.collections.a0.wl(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static long[] v3(@org.jetbrains.annotations.NotNull long[] r3, @org.jetbrains.annotations.NotNull long[] r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r3.length
            int r1 = r4.length
            int r2 = r0 + r1
            long[] r3 = java.util.Arrays.copyOf(r3, r2)
            r2 = 0
            java.lang.System.arraycopy(r4, r2, r3, r0, r1)
            kotlin.jvm.internal.g0.m(r3)
            return r3
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "sumOfBigInteger")
    @kotlin.OverloadResolutionByLambdaReturnType
    private static final java.math.BigInteger v4(double[] r5, kotlin.jvm.functions.Function1<? super java.lang.Double, ? extends java.math.BigInteger> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r6, r0)
            r0 = 0
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            java.lang.String r1 = "valueOf(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            int r1 = r5.length
            r2 = 0
        L17:
            if (r2 >= r1) goto L31
            r3 = r5[r2]
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            java.lang.Object r3 = r6.invoke(r3)
            java.math.BigInteger r3 = (java.math.BigInteger) r3
            java.math.BigInteger r0 = r0.add(r3)
            java.lang.String r3 = "add(...)"
            kotlin.jvm.internal.g0.o(r0, r3)
            int r2 = r2 + 1
            goto L17
        L31:
            return r0
    }

    public static final int w(@org.jetbrains.annotations.NotNull byte[] r1, byte r2, int r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r1 = java.util.Arrays.binarySearch(r1, r3, r4, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @org.jetbrains.annotations.NotNull
    public static final char[] w0(@org.jetbrains.annotations.NotNull char[] r1, @org.jetbrains.annotations.NotNull char[] r2, int r3, int r4, int r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r5 = r5 - r4
            java.lang.System.arraycopy(r1, r4, r2, r3, r5)
            return r2
    }

    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "copyOfRangeInline")
    private static final boolean[] w1(boolean[] r1, int r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean[] r1 = n1(r1, r2, r3)
            return r1
    }

    @kotlin.Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Double w2(double[] r1, java.util.Comparator r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.Double r1 = kotlin.collections.a0.xl(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> T[] w3(@org.jetbrains.annotations.NotNull T[] r2, T r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r2.length
            int r1 = r0 + 1
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r1)
            r2[r0] = r3
            kotlin.jvm.internal.g0.m(r2)
            return r2
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "sumOfBigInteger")
    @kotlin.OverloadResolutionByLambdaReturnType
    private static final java.math.BigInteger w4(float[] r4, kotlin.jvm.functions.Function1<? super java.lang.Float, ? extends java.math.BigInteger> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r5, r0)
            r0 = 0
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            java.lang.String r1 = "valueOf(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            int r1 = r4.length
            r2 = 0
        L17:
            if (r2 >= r1) goto L31
            r3 = r4[r2]
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            java.lang.Object r3 = r5.invoke(r3)
            java.math.BigInteger r3 = (java.math.BigInteger) r3
            java.math.BigInteger r0 = r0.add(r3)
            java.lang.String r3 = "add(...)"
            kotlin.jvm.internal.g0.o(r0, r3)
            int r2 = r2 + 1
            goto L17
        L31:
            return r0
    }

    public static final int x(@org.jetbrains.annotations.NotNull char[] r1, char r2, int r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r1 = java.util.Arrays.binarySearch(r1, r3, r4, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @org.jetbrains.annotations.NotNull
    public static final double[] x0(@org.jetbrains.annotations.NotNull double[] r1, @org.jetbrains.annotations.NotNull double[] r2, int r3, int r4, int r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r5 = r5 - r4
            java.lang.System.arraycopy(r1, r4, r2, r3, r5)
            return r2
    }

    @kotlin.internal.InlineOnly
    private static final byte x1(byte[] r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r1 = r1[r2]
            return r1
    }

    @kotlin.Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Float x2(float[] r1, java.util.Comparator r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.Float r1 = kotlin.collections.a0.yl(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> T[] x3(@org.jetbrains.annotations.NotNull T[] r3, @org.jetbrains.annotations.NotNull java.util.Collection<? extends T> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r3.length
            int r1 = r4.size()
            int r1 = r1 + r0
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r1)
            java.util.Iterator r4 = r4.iterator()
        L18:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r4.next()
            int r2 = r0 + 1
            r3[r0] = r1
            r0 = r2
            goto L18
        L28:
            kotlin.jvm.internal.g0.m(r3)
            return r3
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "sumOfBigInteger")
    @kotlin.OverloadResolutionByLambdaReturnType
    private static final java.math.BigInteger x4(int[] r4, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.math.BigInteger> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r5, r0)
            r0 = 0
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            java.lang.String r1 = "valueOf(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            int r1 = r4.length
            r2 = 0
        L17:
            if (r2 >= r1) goto L31
            r3 = r4[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r3 = r5.invoke(r3)
            java.math.BigInteger r3 = (java.math.BigInteger) r3
            java.math.BigInteger r0 = r0.add(r3)
            java.lang.String r3 = "add(...)"
            kotlin.jvm.internal.g0.o(r0, r3)
            int r2 = r2 + 1
            goto L17
        L31:
            return r0
    }

    public static final int y(@org.jetbrains.annotations.NotNull double[] r1, double r2, int r4, int r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r1 = java.util.Arrays.binarySearch(r1, r4, r5, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @org.jetbrains.annotations.NotNull
    public static float[] y0(@org.jetbrains.annotations.NotNull float[] r1, @org.jetbrains.annotations.NotNull float[] r2, int r3, int r4, int r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r5 = r5 - r4
            java.lang.System.arraycopy(r1, r4, r2, r3, r5)
            return r2
    }

    @kotlin.internal.InlineOnly
    private static final char y1(char[] r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            char r1 = r1[r2]
            return r1
    }

    @kotlin.Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Integer y2(int[] r1, java.util.Comparator r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.Integer r1 = kotlin.collections.a0.zl(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static <T> T[] y3(@org.jetbrains.annotations.NotNull T[] r3, @org.jetbrains.annotations.NotNull T[] r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r3.length
            int r1 = r4.length
            int r2 = r0 + r1
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r2)
            r2 = 0
            java.lang.System.arraycopy(r4, r2, r3, r0, r1)
            kotlin.jvm.internal.g0.m(r3)
            return r3
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "sumOfBigInteger")
    @kotlin.OverloadResolutionByLambdaReturnType
    private static final java.math.BigInteger y4(long[] r5, kotlin.jvm.functions.Function1<? super java.lang.Long, ? extends java.math.BigInteger> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r6, r0)
            r0 = 0
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            java.lang.String r1 = "valueOf(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            int r1 = r5.length
            r2 = 0
        L17:
            if (r2 >= r1) goto L31
            r3 = r5[r2]
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Object r3 = r6.invoke(r3)
            java.math.BigInteger r3 = (java.math.BigInteger) r3
            java.math.BigInteger r0 = r0.add(r3)
            java.lang.String r3 = "add(...)"
            kotlin.jvm.internal.g0.o(r0, r3)
            int r2 = r2 + 1
            goto L17
        L31:
            return r0
    }

    public static final int z(@org.jetbrains.annotations.NotNull float[] r1, float r2, int r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r1 = java.util.Arrays.binarySearch(r1, r3, r4, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @org.jetbrains.annotations.NotNull
    public static int[] z0(@org.jetbrains.annotations.NotNull int[] r1, @org.jetbrains.annotations.NotNull int[] r2, int r3, int r4, int r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r5 = r5 - r4
            java.lang.System.arraycopy(r1, r4, r2, r3, r5)
            return r2
    }

    @kotlin.internal.InlineOnly
    private static final double z1(double[] r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = r2[r3]
            return r0
    }

    @kotlin.Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Long z2(long[] r1, java.util.Comparator r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.Long r1 = kotlin.collections.a0.Al(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final short[] z3(@org.jetbrains.annotations.NotNull short[] r3, @org.jetbrains.annotations.NotNull java.util.Collection<java.lang.Short> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r3.length
            int r1 = r4.size()
            int r1 = r1 + r0
            short[] r3 = java.util.Arrays.copyOf(r3, r1)
            java.util.Iterator r4 = r4.iterator()
        L18:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r4.next()
            java.lang.Number r1 = (java.lang.Number) r1
            short r1 = r1.shortValue()
            int r2 = r0 + 1
            r3[r0] = r1
            r0 = r2
            goto L18
        L2e:
            kotlin.jvm.internal.g0.m(r3)
            return r3
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "sumOfBigInteger")
    @kotlin.OverloadResolutionByLambdaReturnType
    private static final <T> java.math.BigInteger z4(T[] r4, kotlin.jvm.functions.Function1<? super T, ? extends java.math.BigInteger> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r5, r0)
            r0 = 0
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            java.lang.String r1 = "valueOf(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            int r1 = r4.length
            r2 = 0
        L17:
            if (r2 >= r1) goto L2d
            r3 = r4[r2]
            java.lang.Object r3 = r5.invoke(r3)
            java.math.BigInteger r3 = (java.math.BigInteger) r3
            java.math.BigInteger r0 = r0.add(r3)
            java.lang.String r3 = "add(...)"
            kotlin.jvm.internal.g0.o(r0, r3)
            int r2 = r2 + 1
            goto L17
        L2d:
            return r0
    }
}
