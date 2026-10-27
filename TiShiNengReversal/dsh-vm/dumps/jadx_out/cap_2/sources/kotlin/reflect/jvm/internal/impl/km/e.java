package kotlin.reflect.jvm.internal.impl.km;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class e {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a extends kotlin.reflect.jvm.internal.impl.km.e {

        @org.jetbrains.annotations.NotNull
        private final kotlin.reflect.jvm.internal.impl.km.d a;

        public a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.d r2) {
                r1 = this;
                java.lang.String r0 = "annotation"
                kotlin.jvm.internal.g0.p(r2, r0)
                r0 = 0
                r1.<init>(r0)
                r1.a = r2
                return
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.jvm.internal.impl.km.d a() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.km.d r0 = r1.a
                return r0
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
                r3 = this;
                r0 = 1
                if (r3 != r4) goto L4
                return r0
            L4:
                boolean r1 = r4 instanceof kotlin.reflect.jvm.internal.impl.km.e.a
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                kotlin.reflect.jvm.internal.impl.km.e$a r4 = (kotlin.reflect.jvm.internal.impl.km.e.a) r4
                kotlin.reflect.jvm.internal.impl.km.d r1 = r3.a
                kotlin.reflect.jvm.internal.impl.km.d r4 = r4.a
                boolean r4 = kotlin.jvm.internal.g0.g(r1, r4)
                if (r4 != 0) goto L17
                return r2
            L17:
                return r0
        }

        public int hashCode() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.km.d r0 = r1.a
                int r0 = r0.hashCode()
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.e
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "AnnotationValue("
                r0.append(r1)
                kotlin.reflect.jvm.internal.impl.km.d r1 = r2.a
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nAnnotations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Annotations.kt\nkotlin/metadata/KmAnnotationArgument$ArrayKClassValue\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,202:1\n1#2:203\n*E\n"})
    public static final class b extends kotlin.reflect.jvm.internal.impl.km.e {

        @org.jetbrains.annotations.NotNull
        private final java.lang.String a;
        private final int b;

        @org.jetbrains.annotations.NotNull
        private final java.lang.String c;

        public b(@org.jetbrains.annotations.NotNull java.lang.String r4, int r5) {
                r3 = this;
                java.lang.String r0 = "className"
                kotlin.jvm.internal.g0.p(r4, r0)
                r0 = 0
                r3.<init>(r0)
                r3.a = r4
                r3.b = r5
                if (r5 <= 0) goto L42
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r0 = "ArrayKClassValue("
                r4.append(r0)
                r0 = 0
                r1 = 0
            L1b:
                if (r1 >= r5) goto L25
                java.lang.String r2 = "kotlin/Array<"
                r4.append(r2)
                int r1 = r1 + 1
                goto L1b
            L25:
                java.lang.String r5 = r3.a
                r4.append(r5)
                int r5 = r3.b
            L2c:
                if (r0 >= r5) goto L36
                java.lang.String r1 = ">"
                r4.append(r1)
                int r0 = r0 + 1
                goto L2c
            L36:
                java.lang.String r5 = ")"
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                r3.c = r4
                return
            L42:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r5 = "ArrayKClassValue must have at least one dimension. For regular X::class argument, use KClassValue."
                r4.<init>(r5)
                throw r4
        }

        public final int a() {
                r1 = this;
                int r0 = r1.b
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String b() {
                r1 = this;
                java.lang.String r0 = r1.a
                return r0
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof kotlin.reflect.jvm.internal.impl.km.e.b
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                kotlin.reflect.jvm.internal.impl.km.e$b r5 = (kotlin.reflect.jvm.internal.impl.km.e.b) r5
                java.lang.String r1 = r4.a
                java.lang.String r3 = r5.a
                boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                int r1 = r4.b
                int r5 = r5.b
                if (r1 == r5) goto L1e
                return r2
            L1e:
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.String r0 = r2.a
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                int r1 = r2.b
                int r0 = r0 + r1
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.e
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = r1.c
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class c extends kotlin.reflect.jvm.internal.impl.km.e {

        @org.jetbrains.annotations.NotNull
        private final java.util.List<kotlin.reflect.jvm.internal.impl.km.e> a;

        public c(@org.jetbrains.annotations.NotNull java.util.List<? extends kotlin.reflect.jvm.internal.impl.km.e> r2) {
                r1 = this;
                java.lang.String r0 = "elements"
                kotlin.jvm.internal.g0.p(r2, r0)
                r0 = 0
                r1.<init>(r0)
                r1.a = r2
                return
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.List<kotlin.reflect.jvm.internal.impl.km.e> a() {
                r1 = this;
                java.util.List<kotlin.reflect.jvm.internal.impl.km.e> r0 = r1.a
                return r0
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
                r3 = this;
                r0 = 1
                if (r3 != r4) goto L4
                return r0
            L4:
                boolean r1 = r4 instanceof kotlin.reflect.jvm.internal.impl.km.e.c
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                kotlin.reflect.jvm.internal.impl.km.e$c r4 = (kotlin.reflect.jvm.internal.impl.km.e.c) r4
                java.util.List<kotlin.reflect.jvm.internal.impl.km.e> r1 = r3.a
                java.util.List<kotlin.reflect.jvm.internal.impl.km.e> r4 = r4.a
                boolean r4 = kotlin.jvm.internal.g0.g(r1, r4)
                if (r4 != 0) goto L17
                return r2
            L17:
                return r0
        }

        public int hashCode() {
                r1 = this;
                java.util.List<kotlin.reflect.jvm.internal.impl.km.e> r0 = r1.a
                int r0 = r0.hashCode()
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.e
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "ArrayValue("
                r0.append(r1)
                java.util.List<kotlin.reflect.jvm.internal.impl.km.e> r1 = r2.a
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class d extends kotlin.reflect.jvm.internal.impl.km.e.l<java.lang.Boolean> {
        private final boolean a;

        public d(boolean r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.a = r2
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.e.l
        public /* bridge */ /* synthetic */ java.lang.Boolean a() {
                r1 = this;
                java.lang.Boolean r0 = r1.b()
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.Boolean b() {
                r1 = this;
                boolean r0 = r1.a
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
                r3 = this;
                r0 = 1
                if (r3 != r4) goto L4
                return r0
            L4:
                boolean r1 = r4 instanceof kotlin.reflect.jvm.internal.impl.km.e.d
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                kotlin.reflect.jvm.internal.impl.km.e$d r4 = (kotlin.reflect.jvm.internal.impl.km.e.d) r4
                boolean r1 = r3.a
                boolean r4 = r4.a
                if (r1 == r4) goto L13
                return r2
            L13:
                return r0
        }

        public int hashCode() {
                r1 = this;
                boolean r0 = r1.a
                int r0 = kotlin.reflect.jvm.internal.impl.km.f.a(r0)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: kotlin.reflect.jvm.internal.impl.km.e$e, reason: collision with other inner class name */
    public static final class C0036e extends kotlin.reflect.jvm.internal.impl.km.e.l<java.lang.Byte> {
        private final byte a;

        public C0036e(byte r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.a = r2
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.e.l
        public /* bridge */ /* synthetic */ java.lang.Byte a() {
                r1 = this;
                java.lang.Byte r0 = r1.b()
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.Byte b() {
                r1 = this;
                byte r0 = r1.a
                java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
                return r0
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
                r3 = this;
                r0 = 1
                if (r3 != r4) goto L4
                return r0
            L4:
                boolean r1 = r4 instanceof kotlin.reflect.jvm.internal.impl.km.e.C0036e
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                kotlin.reflect.jvm.internal.impl.km.e$e r4 = (kotlin.reflect.jvm.internal.impl.km.e.C0036e) r4
                byte r1 = r3.a
                byte r4 = r4.a
                if (r1 == r4) goto L13
                return r2
            L13:
                return r0
        }

        public int hashCode() {
                r1 = this;
                byte r0 = r1.a
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class f extends kotlin.reflect.jvm.internal.impl.km.e.l<java.lang.Character> {
        private final char a;

        public f(char r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.a = r2
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.e.l
        public /* bridge */ /* synthetic */ java.lang.Character a() {
                r1 = this;
                java.lang.Character r0 = r1.b()
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.Character b() {
                r1 = this;
                char r0 = r1.a
                java.lang.Character r0 = java.lang.Character.valueOf(r0)
                return r0
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
                r3 = this;
                r0 = 1
                if (r3 != r4) goto L4
                return r0
            L4:
                boolean r1 = r4 instanceof kotlin.reflect.jvm.internal.impl.km.e.f
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                kotlin.reflect.jvm.internal.impl.km.e$f r4 = (kotlin.reflect.jvm.internal.impl.km.e.f) r4
                char r1 = r3.a
                char r4 = r4.a
                if (r1 == r4) goto L13
                return r2
            L13:
                return r0
        }

        public int hashCode() {
                r1 = this;
                char r0 = r1.a
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class g extends kotlin.reflect.jvm.internal.impl.km.e.l<java.lang.Double> {
        private final double a;

        public g(double r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.a = r2
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.e.l
        public /* bridge */ /* synthetic */ java.lang.Double a() {
                r1 = this;
                java.lang.Double r0 = r1.b()
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.Double b() {
                r2 = this;
                double r0 = r2.a
                java.lang.Double r0 = java.lang.Double.valueOf(r0)
                return r0
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r8) {
                r7 = this;
                r0 = 1
                if (r7 != r8) goto L4
                return r0
            L4:
                boolean r1 = r8 instanceof kotlin.reflect.jvm.internal.impl.km.e.g
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                kotlin.reflect.jvm.internal.impl.km.e$g r8 = (kotlin.reflect.jvm.internal.impl.km.e.g) r8
                double r3 = r7.a
                double r5 = r8.a
                int r8 = java.lang.Double.compare(r3, r5)
                if (r8 == 0) goto L17
                return r2
            L17:
                return r0
        }

        public int hashCode() {
                r2 = this;
                double r0 = r2.a
                int r0 = kotlin.ranges.d.a(r0)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class h extends kotlin.reflect.jvm.internal.impl.km.e {

        @org.jetbrains.annotations.NotNull
        private final java.lang.String a;

        @org.jetbrains.annotations.NotNull
        private final java.lang.String b;

        public h(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "enumClassName"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "enumEntryName"
                kotlin.jvm.internal.g0.p(r3, r0)
                r0 = 0
                r1.<init>(r0)
                r1.a = r2
                r1.b = r3
                return
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String a() {
                r1 = this;
                java.lang.String r0 = r1.a
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String b() {
                r1 = this;
                java.lang.String r0 = r1.b
                return r0
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof kotlin.reflect.jvm.internal.impl.km.e.h
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                kotlin.reflect.jvm.internal.impl.km.e$h r5 = (kotlin.reflect.jvm.internal.impl.km.e.h) r5
                java.lang.String r1 = r4.a
                java.lang.String r3 = r5.a
                boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                java.lang.String r1 = r4.b
                java.lang.String r5 = r5.b
                boolean r5 = kotlin.jvm.internal.g0.g(r1, r5)
                if (r5 != 0) goto L22
                return r2
            L22:
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.String r0 = r2.a
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.lang.String r1 = r2.b
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.e
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "EnumValue("
                r0.append(r1)
                java.lang.String r1 = r2.a
                r0.append(r1)
                r1 = 46
                r0.append(r1)
                java.lang.String r1 = r2.b
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class i extends kotlin.reflect.jvm.internal.impl.km.e.l<java.lang.Float> {
        private final float a;

        public i(float r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.a = r2
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.e.l
        public /* bridge */ /* synthetic */ java.lang.Float a() {
                r1 = this;
                java.lang.Float r0 = r1.b()
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.Float b() {
                r1 = this;
                float r0 = r1.a
                java.lang.Float r0 = java.lang.Float.valueOf(r0)
                return r0
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
                r3 = this;
                r0 = 1
                if (r3 != r4) goto L4
                return r0
            L4:
                boolean r1 = r4 instanceof kotlin.reflect.jvm.internal.impl.km.e.i
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                kotlin.reflect.jvm.internal.impl.km.e$i r4 = (kotlin.reflect.jvm.internal.impl.km.e.i) r4
                float r1 = r3.a
                float r4 = r4.a
                int r4 = java.lang.Float.compare(r1, r4)
                if (r4 == 0) goto L17
                return r2
            L17:
                return r0
        }

        public int hashCode() {
                r1 = this;
                float r0 = r1.a
                int r0 = java.lang.Float.floatToIntBits(r0)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class j extends kotlin.reflect.jvm.internal.impl.km.e.l<java.lang.Integer> {
        private final int a;

        public j(int r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.a = r2
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.e.l
        public /* bridge */ /* synthetic */ java.lang.Integer a() {
                r1 = this;
                java.lang.Integer r0 = r1.b()
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.Integer b() {
                r1 = this;
                int r0 = r1.a
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                return r0
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
                r3 = this;
                r0 = 1
                if (r3 != r4) goto L4
                return r0
            L4:
                boolean r1 = r4 instanceof kotlin.reflect.jvm.internal.impl.km.e.j
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                kotlin.reflect.jvm.internal.impl.km.e$j r4 = (kotlin.reflect.jvm.internal.impl.km.e.j) r4
                int r1 = r3.a
                int r4 = r4.a
                if (r1 == r4) goto L13
                return r2
            L13:
                return r0
        }

        public int hashCode() {
                r1 = this;
                int r0 = r1.a
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class k extends kotlin.reflect.jvm.internal.impl.km.e {

        @org.jetbrains.annotations.NotNull
        private final java.lang.String a;

        public k(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "className"
                kotlin.jvm.internal.g0.p(r2, r0)
                r0 = 0
                r1.<init>(r0)
                r1.a = r2
                return
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String a() {
                r1 = this;
                java.lang.String r0 = r1.a
                return r0
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
                r3 = this;
                r0 = 1
                if (r3 != r4) goto L4
                return r0
            L4:
                boolean r1 = r4 instanceof kotlin.reflect.jvm.internal.impl.km.e.k
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                kotlin.reflect.jvm.internal.impl.km.e$k r4 = (kotlin.reflect.jvm.internal.impl.km.e.k) r4
                java.lang.String r1 = r3.a
                java.lang.String r4 = r4.a
                boolean r4 = kotlin.jvm.internal.g0.g(r1, r4)
                if (r4 != 0) goto L17
                return r2
            L17:
                return r0
        }

        public int hashCode() {
                r1 = this;
                java.lang.String r0 = r1.a
                int r0 = r0.hashCode()
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.e
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "KClassValue("
                r0.append(r1)
                java.lang.String r1 = r2.a
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class l<T> extends kotlin.reflect.jvm.internal.impl.km.e {
        private l() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        public /* synthetic */ l(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @org.jetbrains.annotations.NotNull
        public abstract T a();

        @Override // kotlin.reflect.jvm.internal.impl.km.e
        @org.jetbrains.annotations.NotNull
        public final java.lang.String toString() {
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.Class r1 = r4.getClass()
                java.lang.String r1 = r1.getSimpleName()
                r0.append(r1)
                r1 = 40
                r0.append(r1)
                boolean r1 = r4 instanceof kotlin.reflect.jvm.internal.impl.km.e.o
                if (r1 == 0) goto L35
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r2 = 34
                r1.append(r2)
                r3 = r4
                kotlin.reflect.jvm.internal.impl.km.e$o r3 = (kotlin.reflect.jvm.internal.impl.km.e.o) r3
                java.lang.String r3 = r3.b()
                r1.append(r3)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                goto L3d
            L35:
                java.lang.Object r1 = r4.a()
                java.lang.String r1 = r1.toString()
            L3d:
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class m extends kotlin.reflect.jvm.internal.impl.km.e.l<java.lang.Long> {
        private final long a;

        public m(long r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.a = r2
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.e.l
        public /* bridge */ /* synthetic */ java.lang.Long a() {
                r1 = this;
                java.lang.Long r0 = r1.b()
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.Long b() {
                r2 = this;
                long r0 = r2.a
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                return r0
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r8) {
                r7 = this;
                r0 = 1
                if (r7 != r8) goto L4
                return r0
            L4:
                boolean r1 = r8 instanceof kotlin.reflect.jvm.internal.impl.km.e.m
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                kotlin.reflect.jvm.internal.impl.km.e$m r8 = (kotlin.reflect.jvm.internal.impl.km.e.m) r8
                long r3 = r7.a
                long r5 = r8.a
                int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r8 == 0) goto L15
                return r2
            L15:
                return r0
        }

        public int hashCode() {
                r2 = this;
                long r0 = r2.a
                int r0 = androidx.camera.camera2.internal.compat.params.e.a(r0)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class n extends kotlin.reflect.jvm.internal.impl.km.e.l<java.lang.Short> {
        private final short a;

        public n(short r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.a = r2
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.e.l
        public /* bridge */ /* synthetic */ java.lang.Short a() {
                r1 = this;
                java.lang.Short r0 = r1.b()
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.Short b() {
                r1 = this;
                short r0 = r1.a
                java.lang.Short r0 = java.lang.Short.valueOf(r0)
                return r0
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
                r3 = this;
                r0 = 1
                if (r3 != r4) goto L4
                return r0
            L4:
                boolean r1 = r4 instanceof kotlin.reflect.jvm.internal.impl.km.e.n
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                kotlin.reflect.jvm.internal.impl.km.e$n r4 = (kotlin.reflect.jvm.internal.impl.km.e.n) r4
                short r1 = r3.a
                short r4 = r4.a
                if (r1 == r4) goto L13
                return r2
            L13:
                return r0
        }

        public int hashCode() {
                r1 = this;
                short r0 = r1.a
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class o extends kotlin.reflect.jvm.internal.impl.km.e.l<java.lang.String> {

        @org.jetbrains.annotations.NotNull
        private final java.lang.String a;

        public o(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.g0.p(r2, r0)
                r0 = 0
                r1.<init>(r0)
                r1.a = r2
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.e.l
        public /* bridge */ /* synthetic */ java.lang.String a() {
                r1 = this;
                java.lang.String r0 = r1.b()
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String b() {
                r1 = this;
                java.lang.String r0 = r1.a
                return r0
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
                r3 = this;
                r0 = 1
                if (r3 != r4) goto L4
                return r0
            L4:
                boolean r1 = r4 instanceof kotlin.reflect.jvm.internal.impl.km.e.o
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                kotlin.reflect.jvm.internal.impl.km.e$o r4 = (kotlin.reflect.jvm.internal.impl.km.e.o) r4
                java.lang.String r1 = r3.a
                java.lang.String r4 = r4.a
                boolean r4 = kotlin.jvm.internal.g0.g(r1, r4)
                if (r4 != 0) goto L17
                return r2
            L17:
                return r0
        }

        public int hashCode() {
                r1 = this;
                java.lang.String r0 = r1.a
                int r0 = r0.hashCode()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class p extends kotlin.reflect.jvm.internal.impl.km.e.l<kotlin.v0> {
        private final byte a;

        private p(byte r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.a = r2
                return
        }

        public /* synthetic */ p(byte r1, kotlin.jvm.internal.v r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.e.l
        public /* bridge */ /* synthetic */ kotlin.v0 a() {
                r1 = this;
                byte r0 = r1.b()
                kotlin.v0 r0 = kotlin.v0.b(r0)
                return r0
        }

        public byte b() {
                r1 = this;
                byte r0 = r1.a
                return r0
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
                r3 = this;
                r0 = 1
                if (r3 != r4) goto L4
                return r0
            L4:
                boolean r1 = r4 instanceof kotlin.reflect.jvm.internal.impl.km.e.p
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                kotlin.reflect.jvm.internal.impl.km.e$p r4 = (kotlin.reflect.jvm.internal.impl.km.e.p) r4
                byte r1 = r3.a
                byte r4 = r4.a
                if (r1 == r4) goto L13
                return r2
            L13:
                return r0
        }

        public int hashCode() {
                r1 = this;
                byte r0 = r1.a
                int r0 = kotlin.v0.x(r0)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class q extends kotlin.reflect.jvm.internal.impl.km.e.l<kotlin.z0> {
        private final int a;

        private q(int r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.a = r2
                return
        }

        public /* synthetic */ q(int r1, kotlin.jvm.internal.v r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.e.l
        public /* bridge */ /* synthetic */ kotlin.z0 a() {
                r1 = this;
                int r0 = r1.b()
                kotlin.z0 r0 = kotlin.z0.b(r0)
                return r0
        }

        public int b() {
                r1 = this;
                int r0 = r1.a
                return r0
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
                r3 = this;
                r0 = 1
                if (r3 != r4) goto L4
                return r0
            L4:
                boolean r1 = r4 instanceof kotlin.reflect.jvm.internal.impl.km.e.q
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                kotlin.reflect.jvm.internal.impl.km.e$q r4 = (kotlin.reflect.jvm.internal.impl.km.e.q) r4
                int r1 = r3.a
                int r4 = r4.a
                if (r1 == r4) goto L13
                return r2
            L13:
                return r0
        }

        public int hashCode() {
                r1 = this;
                int r0 = r1.a
                int r0 = kotlin.z0.x(r0)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class r extends kotlin.reflect.jvm.internal.impl.km.e.l<kotlin.d1> {
        private final long a;

        private r(long r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.a = r2
                return
        }

        public /* synthetic */ r(long r1, kotlin.jvm.internal.v r3) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.e.l
        public /* bridge */ /* synthetic */ kotlin.d1 a() {
                r2 = this;
                long r0 = r2.b()
                kotlin.d1 r0 = kotlin.d1.b(r0)
                return r0
        }

        public long b() {
                r2 = this;
                long r0 = r2.a
                return r0
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r8) {
                r7 = this;
                r0 = 1
                if (r7 != r8) goto L4
                return r0
            L4:
                boolean r1 = r8 instanceof kotlin.reflect.jvm.internal.impl.km.e.r
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                kotlin.reflect.jvm.internal.impl.km.e$r r8 = (kotlin.reflect.jvm.internal.impl.km.e.r) r8
                long r3 = r7.a
                long r5 = r8.a
                int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r8 == 0) goto L15
                return r2
            L15:
                return r0
        }

        public int hashCode() {
                r2 = this;
                long r0 = r2.a
                int r0 = kotlin.d1.x(r0)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class s extends kotlin.reflect.jvm.internal.impl.km.e.l<kotlin.j1> {
        private final short a;

        private s(short r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.a = r2
                return
        }

        public /* synthetic */ s(short r1, kotlin.jvm.internal.v r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.e.l
        public /* bridge */ /* synthetic */ kotlin.j1 a() {
                r1 = this;
                short r0 = r1.b()
                kotlin.j1 r0 = kotlin.j1.b(r0)
                return r0
        }

        public short b() {
                r1 = this;
                short r0 = r1.a
                return r0
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
                r3 = this;
                r0 = 1
                if (r3 != r4) goto L4
                return r0
            L4:
                boolean r1 = r4 instanceof kotlin.reflect.jvm.internal.impl.km.e.s
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                kotlin.reflect.jvm.internal.impl.km.e$s r4 = (kotlin.reflect.jvm.internal.impl.km.e.s) r4
                short r1 = r3.a
                short r4 = r4.a
                if (r1 == r4) goto L13
                return r2
            L13:
                return r0
        }

        public int hashCode() {
                r1 = this;
                short r0 = r1.a
                int r0 = kotlin.j1.x(r0)
                return r0
        }
    }

    private e() {
            r0 = this;
            r0.<init>()
            return
    }

    public /* synthetic */ e(kotlin.jvm.internal.v r1) {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String toString();
}
