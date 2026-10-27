package kotlin.collections;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nArrays.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrays.kt\nkotlin/collections/ArraysKt__ArraysKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,165:1\n1#2:166\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class p extends kotlin.collections.o {
    public p() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.PublishedApi
    @kotlin.jvm.JvmName(name = "contentDeepEquals")
    public static final <T> boolean g(@org.jetbrains.annotations.Nullable T[] r7, @org.jetbrains.annotations.Nullable T[] r8) {
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            r1 = 0
            if (r7 == 0) goto L145
            if (r8 == 0) goto L145
            int r2 = r7.length
            int r3 = r8.length
            if (r2 == r3) goto Lf
            goto L145
        Lf:
            int r2 = r7.length
            r3 = 0
        L11:
            if (r3 >= r2) goto L144
            r4 = r7[r3]
            r5 = r8[r3]
            if (r4 != r5) goto L1b
            goto L13f
        L1b:
            if (r4 == 0) goto L143
            if (r5 != 0) goto L21
            goto L143
        L21:
            boolean r6 = r4 instanceof java.lang.Object[]
            if (r6 == 0) goto L34
            boolean r6 = r5 instanceof java.lang.Object[]
            if (r6 == 0) goto L34
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            boolean r4 = g(r4, r5)
            if (r4 != 0) goto L13f
            return r1
        L34:
            boolean r6 = r4 instanceof byte[]
            if (r6 == 0) goto L47
            boolean r6 = r5 instanceof byte[]
            if (r6 == 0) goto L47
            byte[] r4 = (byte[]) r4
            byte[] r5 = (byte[]) r5
            boolean r4 = java.util.Arrays.equals(r4, r5)
            if (r4 != 0) goto L13f
            return r1
        L47:
            boolean r6 = r4 instanceof short[]
            if (r6 == 0) goto L5a
            boolean r6 = r5 instanceof short[]
            if (r6 == 0) goto L5a
            short[] r4 = (short[]) r4
            short[] r5 = (short[]) r5
            boolean r4 = java.util.Arrays.equals(r4, r5)
            if (r4 != 0) goto L13f
            return r1
        L5a:
            boolean r6 = r4 instanceof int[]
            if (r6 == 0) goto L6d
            boolean r6 = r5 instanceof int[]
            if (r6 == 0) goto L6d
            int[] r4 = (int[]) r4
            int[] r5 = (int[]) r5
            boolean r4 = java.util.Arrays.equals(r4, r5)
            if (r4 != 0) goto L13f
            return r1
        L6d:
            boolean r6 = r4 instanceof long[]
            if (r6 == 0) goto L80
            boolean r6 = r5 instanceof long[]
            if (r6 == 0) goto L80
            long[] r4 = (long[]) r4
            long[] r5 = (long[]) r5
            boolean r4 = java.util.Arrays.equals(r4, r5)
            if (r4 != 0) goto L13f
            return r1
        L80:
            boolean r6 = r4 instanceof float[]
            if (r6 == 0) goto L93
            boolean r6 = r5 instanceof float[]
            if (r6 == 0) goto L93
            float[] r4 = (float[]) r4
            float[] r5 = (float[]) r5
            boolean r4 = java.util.Arrays.equals(r4, r5)
            if (r4 != 0) goto L13f
            return r1
        L93:
            boolean r6 = r4 instanceof double[]
            if (r6 == 0) goto La6
            boolean r6 = r5 instanceof double[]
            if (r6 == 0) goto La6
            double[] r4 = (double[]) r4
            double[] r5 = (double[]) r5
            boolean r4 = java.util.Arrays.equals(r4, r5)
            if (r4 != 0) goto L13f
            return r1
        La6:
            boolean r6 = r4 instanceof char[]
            if (r6 == 0) goto Lb9
            boolean r6 = r5 instanceof char[]
            if (r6 == 0) goto Lb9
            char[] r4 = (char[]) r4
            char[] r5 = (char[]) r5
            boolean r4 = java.util.Arrays.equals(r4, r5)
            if (r4 != 0) goto L13f
            return r1
        Lb9:
            boolean r6 = r4 instanceof boolean[]
            if (r6 == 0) goto Lcc
            boolean r6 = r5 instanceof boolean[]
            if (r6 == 0) goto Lcc
            boolean[] r4 = (boolean[]) r4
            boolean[] r5 = (boolean[]) r5
            boolean r4 = java.util.Arrays.equals(r4, r5)
            if (r4 != 0) goto L13f
            return r1
        Lcc:
            boolean r6 = r4 instanceof kotlin.w0
            if (r6 == 0) goto Le7
            boolean r6 = r5 instanceof kotlin.w0
            if (r6 == 0) goto Le7
            kotlin.w0 r4 = (kotlin.w0) r4
            byte[] r4 = r4.z()
            kotlin.w0 r5 = (kotlin.w0) r5
            byte[] r5 = r5.z()
            boolean r4 = kotlin.collections.unsigned.a.Y0(r4, r5)
            if (r4 != 0) goto L13f
            return r1
        Le7:
            boolean r6 = r4 instanceof kotlin.k1
            if (r6 == 0) goto L102
            boolean r6 = r5 instanceof kotlin.k1
            if (r6 == 0) goto L102
            kotlin.k1 r4 = (kotlin.k1) r4
            short[] r4 = r4.z()
            kotlin.k1 r5 = (kotlin.k1) r5
            short[] r5 = r5.z()
            boolean r4 = kotlin.collections.unsigned.a.W0(r4, r5)
            if (r4 != 0) goto L13f
            return r1
        L102:
            boolean r6 = r4 instanceof kotlin.a1
            if (r6 == 0) goto L11d
            boolean r6 = r5 instanceof kotlin.a1
            if (r6 == 0) goto L11d
            kotlin.a1 r4 = (kotlin.a1) r4
            int[] r4 = r4.z()
            kotlin.a1 r5 = (kotlin.a1) r5
            int[] r5 = r5.z()
            boolean r4 = kotlin.collections.unsigned.a.X0(r4, r5)
            if (r4 != 0) goto L13f
            return r1
        L11d:
            boolean r6 = r4 instanceof kotlin.e1
            if (r6 == 0) goto L138
            boolean r6 = r5 instanceof kotlin.e1
            if (r6 == 0) goto L138
            kotlin.e1 r4 = (kotlin.e1) r4
            long[] r4 = r4.z()
            kotlin.e1 r5 = (kotlin.e1) r5
            long[] r5 = r5.z()
            boolean r4 = kotlin.collections.unsigned.a.Z0(r4, r5)
            if (r4 != 0) goto L13f
            return r1
        L138:
            boolean r4 = kotlin.jvm.internal.g0.g(r4, r5)
            if (r4 != 0) goto L13f
            return r1
        L13f:
            int r3 = r3 + 1
            goto L11
        L143:
            return r1
        L144:
            return r0
        L145:
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.jvm.JvmName(name = "contentDeepToString")
    @org.jetbrains.annotations.NotNull
    @kotlin.PublishedApi
    public static final <T> java.lang.String h(@org.jetbrains.annotations.Nullable T[] r2) {
            if (r2 != 0) goto L5
            java.lang.String r2 = "null"
            return r2
        L5:
            int r0 = r2.length
            r1 = 429496729(0x19999999, float:1.5881867E-23)
            int r0 = kotlin.ranges.t.B(r0, r1)
            int r0 = r0 * 5
            int r0 = r0 + 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            i(r2, r1, r0)
            java.lang.String r2 = r1.toString()
            return r2
    }

    private static final <T> void i(T[] r5, java.lang.StringBuilder r6, java.util.List<java.lang.Object[]> r7) {
            boolean r0 = r7.contains(r5)
            if (r0 == 0) goto Lc
            java.lang.String r5 = "[...]"
            r6.append(r5)
            return
        Lc:
            r7.add(r5)
            r0 = 91
            r6.append(r0)
            int r0 = r5.length
            r1 = 0
        L16:
            if (r1 >= r0) goto L11a
            if (r1 == 0) goto L1f
            java.lang.String r2 = ", "
            r6.append(r2)
        L1f:
            r2 = r5[r1]
            if (r2 != 0) goto L2a
            java.lang.String r2 = "null"
            r6.append(r2)
            goto L116
        L2a:
            boolean r3 = r2 instanceof java.lang.Object[]
            if (r3 == 0) goto L37
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            i(r2, r6, r7)
            kotlin.n1 r2 = kotlin.n1.a
            goto L116
        L37:
            boolean r3 = r2 instanceof byte[]
            java.lang.String r4 = "toString(...)"
            if (r3 == 0) goto L4b
            byte[] r2 = (byte[]) r2
            java.lang.String r2 = java.util.Arrays.toString(r2)
            kotlin.jvm.internal.g0.o(r2, r4)
            r6.append(r2)
            goto L116
        L4b:
            boolean r3 = r2 instanceof short[]
            if (r3 == 0) goto L5d
            short[] r2 = (short[]) r2
            java.lang.String r2 = java.util.Arrays.toString(r2)
            kotlin.jvm.internal.g0.o(r2, r4)
            r6.append(r2)
            goto L116
        L5d:
            boolean r3 = r2 instanceof int[]
            if (r3 == 0) goto L6f
            int[] r2 = (int[]) r2
            java.lang.String r2 = java.util.Arrays.toString(r2)
            kotlin.jvm.internal.g0.o(r2, r4)
            r6.append(r2)
            goto L116
        L6f:
            boolean r3 = r2 instanceof long[]
            if (r3 == 0) goto L81
            long[] r2 = (long[]) r2
            java.lang.String r2 = java.util.Arrays.toString(r2)
            kotlin.jvm.internal.g0.o(r2, r4)
            r6.append(r2)
            goto L116
        L81:
            boolean r3 = r2 instanceof float[]
            if (r3 == 0) goto L93
            float[] r2 = (float[]) r2
            java.lang.String r2 = java.util.Arrays.toString(r2)
            kotlin.jvm.internal.g0.o(r2, r4)
            r6.append(r2)
            goto L116
        L93:
            boolean r3 = r2 instanceof double[]
            if (r3 == 0) goto La5
            double[] r2 = (double[]) r2
            java.lang.String r2 = java.util.Arrays.toString(r2)
            kotlin.jvm.internal.g0.o(r2, r4)
            r6.append(r2)
            goto L116
        La5:
            boolean r3 = r2 instanceof char[]
            if (r3 == 0) goto Lb6
            char[] r2 = (char[]) r2
            java.lang.String r2 = java.util.Arrays.toString(r2)
            kotlin.jvm.internal.g0.o(r2, r4)
            r6.append(r2)
            goto L116
        Lb6:
            boolean r3 = r2 instanceof boolean[]
            if (r3 == 0) goto Lc7
            boolean[] r2 = (boolean[]) r2
            java.lang.String r2 = java.util.Arrays.toString(r2)
            kotlin.jvm.internal.g0.o(r2, r4)
            r6.append(r2)
            goto L116
        Lc7:
            boolean r3 = r2 instanceof kotlin.w0
            if (r3 == 0) goto Ld9
            kotlin.w0 r2 = (kotlin.w0) r2
            byte[] r2 = r2.z()
            java.lang.String r2 = kotlin.collections.unsigned.a.e1(r2)
            r6.append(r2)
            goto L116
        Ld9:
            boolean r3 = r2 instanceof kotlin.k1
            if (r3 == 0) goto Leb
            kotlin.k1 r2 = (kotlin.k1) r2
            short[] r2 = r2.z()
            java.lang.String r2 = kotlin.collections.unsigned.a.g1(r2)
            r6.append(r2)
            goto L116
        Leb:
            boolean r3 = r2 instanceof kotlin.a1
            if (r3 == 0) goto Lfd
            kotlin.a1 r2 = (kotlin.a1) r2
            int[] r2 = r2.z()
            java.lang.String r2 = kotlin.collections.unsigned.a.f1(r2)
            r6.append(r2)
            goto L116
        Lfd:
            boolean r3 = r2 instanceof kotlin.e1
            if (r3 == 0) goto L10f
            kotlin.e1 r2 = (kotlin.e1) r2
            long[] r2 = r2.z()
            java.lang.String r2 = kotlin.collections.unsigned.a.h1(r2)
            r6.append(r2)
            goto L116
        L10f:
            java.lang.String r2 = r2.toString()
            r6.append(r2)
        L116:
            int r1 = r1 + 1
            goto L16
        L11a:
            r5 = 93
            r6.append(r5)
            int r5 = kotlin.collections.h0.L(r7)
            r7.remove(r5)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.List<T> j(@org.jetbrains.annotations.NotNull T[][] r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            int r0 = r5.length
            r1 = 0
            r2 = 0
            r3 = 0
        L9:
            if (r2 >= r0) goto L12
            r4 = r5[r2]
            int r4 = r4.length
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L9
        L12:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r3)
            int r2 = r5.length
        L18:
            if (r1 >= r2) goto L22
            r3 = r5[r1]
            kotlin.collections.m0.u0(r0, r3)
            int r1 = r1 + 1
            goto L18
        L22:
            return r0
    }

    /* JADX WARN: Incorrect types in method signature: <C:[Ljava/lang/Object;:TR;R:Ljava/lang/Object;>(TC;Lkotlin/jvm/functions/Function0<+TR;>;)TR; */
    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.internal.InlineOnly
    private static final java.lang.Object k(java.lang.Object[] r1, kotlin.jvm.functions.Function0 r2) {
            java.lang.String r0 = "defaultValue"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r1.length
            if (r0 != 0) goto Lc
            java.lang.Object r1 = r2.invoke()
        Lc:
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.internal.InlineOnly
    private static final boolean l(java.lang.Object[] r0) {
            if (r0 == 0) goto L8
            int r0 = r0.length
            if (r0 != 0) goto L6
            goto L8
        L6:
            r0 = 0
            return r0
        L8:
            r0 = 1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlin.Pair<java.util.List<T>, java.util.List<R>> m(@org.jetbrains.annotations.NotNull kotlin.Pair<? extends T, ? extends R>[] r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r6.length
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r6.length
            r1.<init>(r2)
            int r2 = r6.length
            r3 = 0
        L13:
            if (r3 >= r2) goto L28
            r4 = r6[r3]
            java.lang.Object r5 = r4.getFirst()
            r0.add(r5)
            java.lang.Object r4 = r4.getSecond()
            r1.add(r4)
            int r3 = r3 + 1
            goto L13
        L28:
            kotlin.Pair r6 = kotlin.o0.a(r0, r1)
            return r6
    }
}
