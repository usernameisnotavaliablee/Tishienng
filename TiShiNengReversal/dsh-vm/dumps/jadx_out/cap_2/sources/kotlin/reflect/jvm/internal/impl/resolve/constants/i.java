package kotlin.reflect.jvm.internal.impl.resolve.constants;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nConstantValueFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstantValueFactory.kt\norg/jetbrains/kotlin/resolve/constants/ConstantValueFactory\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,103:1\n1617#2,9:104\n1869#2:113\n1870#2:115\n1626#2:116\n1#3:114\n*S KotlinDebug\n*F\n+ 1 ConstantValueFactory.kt\norg/jetbrains/kotlin/resolve/constants/ConstantValueFactory\n*L\n64#1:104,9\n64#1:113\n64#1:115\n64#1:116\n64#1:114\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class i {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.resolve.constants.i a = null;

    static {
            kotlin.reflect.jvm.internal.impl.resolve.constants.i r0 = new kotlin.reflect.jvm.internal.impl.resolve.constants.i
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.resolve.constants.i.a = r0
            return
    }

    private i() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.t0 a(kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r0, kotlin.reflect.jvm.internal.impl.descriptors.f0 r1) {
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = d(r0, r1)
            return r0
    }

    private final kotlin.reflect.jvm.internal.impl.resolve.constants.b b(java.util.List<?> r5, kotlin.reflect.jvm.internal.impl.descriptors.f0 r6, kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r7) {
            r4 = this;
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.List r5 = kotlin.collections.f0.a6(r5)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L11:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r5.next()
            r2 = 2
            r3 = 0
            kotlin.reflect.jvm.internal.impl.resolve.constants.g r1 = f(r4, r1, r3, r2, r3)
            if (r1 == 0) goto L11
            r0.add(r1)
            goto L11
        L27:
            if (r6 == 0) goto L3c
            kotlin.reflect.jvm.internal.impl.resolve.constants.a0 r5 = new kotlin.reflect.jvm.internal.impl.resolve.constants.a0
            kotlin.reflect.jvm.internal.impl.builtins.j r6 = r6.p()
            kotlin.reflect.jvm.internal.impl.types.e1 r6 = r6.P(r7)
            java.lang.String r7 = "getPrimitiveArrayKotlinType(...)"
            kotlin.jvm.internal.g0.o(r6, r7)
            r5.<init>(r0, r6)
            return r5
        L3c:
            kotlin.reflect.jvm.internal.impl.resolve.constants.b r5 = new kotlin.reflect.jvm.internal.impl.resolve.constants.b
            kotlin.reflect.jvm.internal.impl.resolve.constants.h r6 = new kotlin.reflect.jvm.internal.impl.resolve.constants.h
            r6.<init>(r7)
            r5.<init>(r0, r6)
            return r5
    }

    private static final kotlin.reflect.jvm.internal.impl.types.t0 d(kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r1, kotlin.reflect.jvm.internal.impl.descriptors.f0 r2) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.builtins.j r2 = r2.p()
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r2.P(r1)
            java.lang.String r2 = "getPrimitiveArrayKotlinType(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.resolve.constants.g f(kotlin.reflect.jvm.internal.impl.resolve.constants.i r0, java.lang.Object r1, kotlin.reflect.jvm.internal.impl.descriptors.f0 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            kotlin.reflect.jvm.internal.impl.resolve.constants.g r0 = r0.e(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.resolve.constants.b c(@org.jetbrains.annotations.NotNull java.util.List<? extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r3) {
            r1 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "type"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.resolve.constants.a0 r0 = new kotlin.reflect.jvm.internal.impl.resolve.constants.a0
            r0.<init>(r2, r3)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> e(@org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.f0 r4) {
            r2 = this;
            boolean r0 = r3 instanceof java.lang.Byte
            if (r0 == 0) goto L10
            kotlin.reflect.jvm.internal.impl.resolve.constants.d r4 = new kotlin.reflect.jvm.internal.impl.resolve.constants.d
            java.lang.Number r3 = (java.lang.Number) r3
            byte r3 = r3.byteValue()
            r4.<init>(r3)
            return r4
        L10:
            boolean r0 = r3 instanceof java.lang.Short
            if (r0 == 0) goto L20
            kotlin.reflect.jvm.internal.impl.resolve.constants.x r4 = new kotlin.reflect.jvm.internal.impl.resolve.constants.x
            java.lang.Number r3 = (java.lang.Number) r3
            short r3 = r3.shortValue()
            r4.<init>(r3)
            return r4
        L20:
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 == 0) goto L30
            kotlin.reflect.jvm.internal.impl.resolve.constants.n r4 = new kotlin.reflect.jvm.internal.impl.resolve.constants.n
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r4.<init>(r3)
            return r4
        L30:
            boolean r0 = r3 instanceof java.lang.Long
            if (r0 == 0) goto L40
            kotlin.reflect.jvm.internal.impl.resolve.constants.u r4 = new kotlin.reflect.jvm.internal.impl.resolve.constants.u
            java.lang.Number r3 = (java.lang.Number) r3
            long r0 = r3.longValue()
            r4.<init>(r0)
            return r4
        L40:
            boolean r0 = r3 instanceof java.lang.Character
            if (r0 == 0) goto L50
            kotlin.reflect.jvm.internal.impl.resolve.constants.e r4 = new kotlin.reflect.jvm.internal.impl.resolve.constants.e
            java.lang.Character r3 = (java.lang.Character) r3
            char r3 = r3.charValue()
            r4.<init>(r3)
            return r4
        L50:
            boolean r0 = r3 instanceof java.lang.Float
            if (r0 == 0) goto L60
            kotlin.reflect.jvm.internal.impl.resolve.constants.m r4 = new kotlin.reflect.jvm.internal.impl.resolve.constants.m
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            r4.<init>(r3)
            return r4
        L60:
            boolean r0 = r3 instanceof java.lang.Double
            if (r0 == 0) goto L70
            kotlin.reflect.jvm.internal.impl.resolve.constants.j r4 = new kotlin.reflect.jvm.internal.impl.resolve.constants.j
            java.lang.Number r3 = (java.lang.Number) r3
            double r0 = r3.doubleValue()
            r4.<init>(r0)
            return r4
        L70:
            boolean r0 = r3 instanceof java.lang.Boolean
            if (r0 == 0) goto L80
            kotlin.reflect.jvm.internal.impl.resolve.constants.c r4 = new kotlin.reflect.jvm.internal.impl.resolve.constants.c
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r4.<init>(r3)
            return r4
        L80:
            boolean r0 = r3 instanceof java.lang.String
            if (r0 == 0) goto L8c
            kotlin.reflect.jvm.internal.impl.resolve.constants.y r4 = new kotlin.reflect.jvm.internal.impl.resolve.constants.y
            java.lang.String r3 = (java.lang.String) r3
            r4.<init>(r3)
            return r4
        L8c:
            boolean r0 = r3 instanceof byte[]
            if (r0 == 0) goto L9d
            byte[] r3 = (byte[]) r3
            java.util.List r3 = kotlin.collections.n.Xy(r3)
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r0 = kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.BYTE
            kotlin.reflect.jvm.internal.impl.resolve.constants.b r3 = r2.b(r3, r4, r0)
            return r3
        L9d:
            boolean r0 = r3 instanceof short[]
            if (r0 == 0) goto Lae
            short[] r3 = (short[]) r3
            java.util.List r3 = kotlin.collections.n.ez(r3)
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r0 = kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.SHORT
            kotlin.reflect.jvm.internal.impl.resolve.constants.b r3 = r2.b(r3, r4, r0)
            return r3
        Lae:
            boolean r0 = r3 instanceof int[]
            if (r0 == 0) goto Lbf
            int[] r3 = (int[]) r3
            java.util.List r3 = kotlin.collections.n.bz(r3)
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r0 = kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.INT
            kotlin.reflect.jvm.internal.impl.resolve.constants.b r3 = r2.b(r3, r4, r0)
            return r3
        Lbf:
            boolean r0 = r3 instanceof long[]
            if (r0 == 0) goto Ld0
            long[] r3 = (long[]) r3
            java.util.List r3 = kotlin.collections.n.cz(r3)
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r0 = kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.LONG
            kotlin.reflect.jvm.internal.impl.resolve.constants.b r3 = r2.b(r3, r4, r0)
            return r3
        Ld0:
            boolean r0 = r3 instanceof char[]
            if (r0 == 0) goto Le1
            char[] r3 = (char[]) r3
            java.util.List r3 = kotlin.collections.n.Yy(r3)
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r0 = kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.CHAR
            kotlin.reflect.jvm.internal.impl.resolve.constants.b r3 = r2.b(r3, r4, r0)
            return r3
        Le1:
            boolean r0 = r3 instanceof float[]
            if (r0 == 0) goto Lf2
            float[] r3 = (float[]) r3
            java.util.List r3 = kotlin.collections.n.az(r3)
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r0 = kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.FLOAT
            kotlin.reflect.jvm.internal.impl.resolve.constants.b r3 = r2.b(r3, r4, r0)
            return r3
        Lf2:
            boolean r0 = r3 instanceof double[]
            if (r0 == 0) goto L103
            double[] r3 = (double[]) r3
            java.util.List r3 = kotlin.collections.n.Zy(r3)
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r0 = kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.DOUBLE
            kotlin.reflect.jvm.internal.impl.resolve.constants.b r3 = r2.b(r3, r4, r0)
            return r3
        L103:
            boolean r0 = r3 instanceof boolean[]
            if (r0 == 0) goto L114
            boolean[] r3 = (boolean[]) r3
            java.util.List r3 = kotlin.collections.n.fz(r3)
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r0 = kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.BOOLEAN
            kotlin.reflect.jvm.internal.impl.resolve.constants.b r3 = r2.b(r3, r4, r0)
            return r3
        L114:
            if (r3 != 0) goto L11c
            kotlin.reflect.jvm.internal.impl.resolve.constants.v r3 = new kotlin.reflect.jvm.internal.impl.resolve.constants.v
            r3.<init>()
            return r3
        L11c:
            r3 = 0
            return r3
    }
}
