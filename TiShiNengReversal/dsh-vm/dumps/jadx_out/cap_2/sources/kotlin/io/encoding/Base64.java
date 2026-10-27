package kotlin.io.encoding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.SinceKotlin(version = "2.2")
@kotlin.WasExperimental(markerClass = {kotlin.io.encoding.ExperimentalEncodingApi.class})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class Base64 {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.io.encoding.Base64.a f = null;
    private static final int g = 8;
    private static final int h = 6;
    public static final int i = 3;
    public static final int j = 4;
    public static final byte k = 61;
    private static final int l = 76;
    private static final int m = 64;

    @org.jetbrains.annotations.NotNull
    private static final byte[] n = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.io.encoding.Base64 o = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.io.encoding.Base64 p = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.io.encoding.Base64 q = null;
    private final boolean a;
    private final boolean b;
    private final int c;

    @org.jetbrains.annotations.NotNull
    private final kotlin.io.encoding.Base64.PaddingOption d;
    private final int e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.SinceKotlin(version = "2.0")
    public enum PaddingOption extends java.lang.Enum<kotlin.io.encoding.Base64.PaddingOption> {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
        private static final /* synthetic */ kotlin.io.encoding.Base64.PaddingOption[] $VALUES = null;
        public static final kotlin.io.encoding.Base64.PaddingOption ABSENT = null;
        public static final kotlin.io.encoding.Base64.PaddingOption ABSENT_OPTIONAL = null;
        public static final kotlin.io.encoding.Base64.PaddingOption PRESENT = null;
        public static final kotlin.io.encoding.Base64.PaddingOption PRESENT_OPTIONAL = null;

        private static final /* synthetic */ kotlin.io.encoding.Base64.PaddingOption[] $values() {
                r0 = 4
                kotlin.io.encoding.Base64$PaddingOption[] r0 = new kotlin.io.encoding.Base64.PaddingOption[r0]
                kotlin.io.encoding.Base64$PaddingOption r1 = kotlin.io.encoding.Base64.PaddingOption.PRESENT
                r2 = 0
                r0[r2] = r1
                kotlin.io.encoding.Base64$PaddingOption r1 = kotlin.io.encoding.Base64.PaddingOption.ABSENT
                r2 = 1
                r0[r2] = r1
                kotlin.io.encoding.Base64$PaddingOption r1 = kotlin.io.encoding.Base64.PaddingOption.PRESENT_OPTIONAL
                r2 = 2
                r0[r2] = r1
                kotlin.io.encoding.Base64$PaddingOption r1 = kotlin.io.encoding.Base64.PaddingOption.ABSENT_OPTIONAL
                r2 = 3
                r0[r2] = r1
                return r0
        }

        static {
                kotlin.io.encoding.Base64$PaddingOption r0 = new kotlin.io.encoding.Base64$PaddingOption
                java.lang.String r1 = "PRESENT"
                r2 = 0
                r0.<init>(r1, r2)
                kotlin.io.encoding.Base64.PaddingOption.PRESENT = r0
                kotlin.io.encoding.Base64$PaddingOption r0 = new kotlin.io.encoding.Base64$PaddingOption
                java.lang.String r1 = "ABSENT"
                r2 = 1
                r0.<init>(r1, r2)
                kotlin.io.encoding.Base64.PaddingOption.ABSENT = r0
                kotlin.io.encoding.Base64$PaddingOption r0 = new kotlin.io.encoding.Base64$PaddingOption
                java.lang.String r1 = "PRESENT_OPTIONAL"
                r2 = 2
                r0.<init>(r1, r2)
                kotlin.io.encoding.Base64.PaddingOption.PRESENT_OPTIONAL = r0
                kotlin.io.encoding.Base64$PaddingOption r0 = new kotlin.io.encoding.Base64$PaddingOption
                java.lang.String r1 = "ABSENT_OPTIONAL"
                r2 = 3
                r0.<init>(r1, r2)
                kotlin.io.encoding.Base64.PaddingOption.ABSENT_OPTIONAL = r0
                kotlin.io.encoding.Base64$PaddingOption[] r0 = $values()
                kotlin.io.encoding.Base64.PaddingOption.$VALUES = r0
                kotlin.enums.a r0 = kotlin.enums.c.c(r0)
                kotlin.io.encoding.Base64.PaddingOption.$ENTRIES = r0
                return
        }

        PaddingOption(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @org.jetbrains.annotations.NotNull
        public static kotlin.enums.a<kotlin.io.encoding.Base64.PaddingOption> getEntries() {
                kotlin.enums.a r0 = kotlin.io.encoding.Base64.PaddingOption.$ENTRIES
                return r0
        }

        public static kotlin.io.encoding.Base64.PaddingOption valueOf(java.lang.String r1) {
                java.lang.Class<kotlin.io.encoding.Base64$PaddingOption> r0 = kotlin.io.encoding.Base64.PaddingOption.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                kotlin.io.encoding.Base64$PaddingOption r1 = (kotlin.io.encoding.Base64.PaddingOption) r1
                return r1
        }

        public static kotlin.io.encoding.Base64.PaddingOption[] values() {
                kotlin.io.encoding.Base64$PaddingOption[] r0 = kotlin.io.encoding.Base64.PaddingOption.$VALUES
                java.lang.Object r0 = r0.clone()
                kotlin.io.encoding.Base64$PaddingOption[] r0 = (kotlin.io.encoding.Base64.PaddingOption[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a extends kotlin.io.encoding.Base64 {
        private a() {
                r6 = this;
                kotlin.io.encoding.Base64$PaddingOption r4 = kotlin.io.encoding.Base64.PaddingOption.PRESENT
                r5 = 0
                r1 = 0
                r2 = 0
                r3 = -1
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        public /* synthetic */ a(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.io.encoding.Base64 M() {
                r1 = this;
                kotlin.io.encoding.Base64 r0 = kotlin.io.encoding.Base64.a()
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final byte[] N() {
                r1 = this;
                byte[] r0 = kotlin.io.encoding.Base64.b()
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.io.encoding.Base64 O() {
                r1 = this;
                kotlin.io.encoding.Base64 r0 = kotlin.io.encoding.Base64.c()
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.io.encoding.Base64 P() {
                r1 = this;
                kotlin.io.encoding.Base64 r0 = kotlin.io.encoding.Base64.d()
                return r0
        }
    }

    static {
            kotlin.io.encoding.Base64$a r0 = new kotlin.io.encoding.Base64$a
            r1 = 0
            r0.<init>(r1)
            kotlin.io.encoding.Base64.f = r0
            r0 = 2
            byte[] r0 = new byte[r0]
            r0 = {x0030: FILL_ARRAY_DATA , data: [13, 10} // fill-array
            kotlin.io.encoding.Base64.n = r0
            kotlin.io.encoding.Base64 r0 = new kotlin.io.encoding.Base64
            kotlin.io.encoding.Base64$PaddingOption r1 = kotlin.io.encoding.Base64.PaddingOption.PRESENT
            r2 = 1
            r3 = 0
            r4 = -1
            r0.<init>(r2, r3, r4, r1)
            kotlin.io.encoding.Base64.o = r0
            kotlin.io.encoding.Base64 r0 = new kotlin.io.encoding.Base64
            r4 = 76
            r0.<init>(r3, r2, r4, r1)
            kotlin.io.encoding.Base64.p = r0
            kotlin.io.encoding.Base64 r0 = new kotlin.io.encoding.Base64
            r4 = 64
            r0.<init>(r3, r2, r4, r1)
            kotlin.io.encoding.Base64.q = r0
            return
    }

    private Base64(boolean r1, boolean r2, int r3, kotlin.io.encoding.Base64.PaddingOption r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            if (r1 == 0) goto L18
            if (r2 != 0) goto L10
            goto L18
        L10:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Failed requirement."
            r1.<init>(r2)
            throw r1
        L18:
            int r3 = r3 / 4
            r0.e = r3
            return
    }

    public /* synthetic */ Base64(boolean r1, boolean r2, int r3, kotlin.io.encoding.Base64.PaddingOption r4, kotlin.jvm.internal.v r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public static /* synthetic */ java.lang.Appendable A(kotlin.io.encoding.Base64 r0, byte[] r1, java.lang.Appendable r2, int r3, int r4, int r5, java.lang.Object r6) {
            if (r6 != 0) goto L11
            r6 = r5 & 4
            if (r6 == 0) goto L7
            r3 = 0
        L7:
            r5 = r5 & 8
            if (r5 == 0) goto Lc
            int r4 = r1.length
        Lc:
            java.lang.Appendable r0 = r0.z(r1, r2, r3, r4)
            return r0
        L11:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: encodeToAppendable"
            r0.<init>(r1)
            throw r0
    }

    public static /* synthetic */ byte[] C(kotlin.io.encoding.Base64 r0, byte[] r1, int r2, int r3, int r4, java.lang.Object r5) {
            if (r5 != 0) goto L11
            r5 = r4 & 2
            if (r5 == 0) goto L7
            r2 = 0
        L7:
            r4 = r4 & 4
            if (r4 == 0) goto Lc
            int r3 = r1.length
        Lc:
            byte[] r0 = r0.B(r1, r2, r3)
            return r0
        L11:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: encodeToByteArray"
            r0.<init>(r1)
            throw r0
    }

    private final int G(byte[] r2, int r3, int r4, int r5) {
            r1 = this;
            r0 = -8
            if (r5 == r0) goto L48
            r0 = -6
            if (r5 == r0) goto L42
            r0 = -4
            if (r5 == r0) goto L17
            r2 = -2
            if (r5 != r2) goto Lf
            int r3 = r3 + 1
            return r3
        Lf:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Unreachable"
            r2.<init>(r3)
            throw r2
        L17:
            r1.h(r3)
            int r3 = r3 + 1
            int r3 = r1.K(r2, r3, r4)
            if (r3 == r4) goto L2b
            r2 = r2[r3]
            r4 = 61
            if (r2 != r4) goto L2b
            int r3 = r3 + 1
            return r3
        L2b:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Missing one pad character at index "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3)
            throw r2
        L42:
            r1.h(r3)
            int r3 = r3 + 1
            return r3
        L48:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Redundant pad character at index "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3)
            throw r2
    }

    private final boolean J() {
            r2 = this;
            kotlin.io.encoding.Base64$PaddingOption r0 = r2.d
            kotlin.io.encoding.Base64$PaddingOption r1 = kotlin.io.encoding.Base64.PaddingOption.PRESENT
            if (r0 == r1) goto Ld
            kotlin.io.encoding.Base64$PaddingOption r1 = kotlin.io.encoding.Base64.PaddingOption.PRESENT_OPTIONAL
            if (r0 != r1) goto Lb
            goto Ld
        Lb:
            r0 = 0
            return r0
        Ld:
            r0 = 1
            return r0
    }

    private final int K(byte[] r3, int r4, int r5) {
            r2 = this;
            boolean r0 = r2.b
            if (r0 != 0) goto L5
            return r4
        L5:
            if (r4 >= r5) goto L18
            r0 = r3[r4]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int[] r1 = kotlin.io.encoding.b.a()
            r0 = r1[r0]
            r1 = -1
            if (r0 == r1) goto L15
            goto L18
        L15:
            int r4 = r4 + 1
            goto L5
        L18:
            return r4
    }

    public static final /* synthetic */ kotlin.io.encoding.Base64 a() {
            kotlin.io.encoding.Base64 r0 = kotlin.io.encoding.Base64.p
            return r0
    }

    public static final /* synthetic */ byte[] b() {
            byte[] r0 = kotlin.io.encoding.Base64.n
            return r0
    }

    public static final /* synthetic */ kotlin.io.encoding.Base64 c() {
            kotlin.io.encoding.Base64 r0 = kotlin.io.encoding.Base64.q
            return r0
    }

    public static final /* synthetic */ kotlin.io.encoding.Base64 d() {
            kotlin.io.encoding.Base64 r0 = kotlin.io.encoding.Base64.o
            return r0
    }

    private final void g(int r5, int r6, int r7) {
            r4 = this;
            java.lang.String r0 = ", destination size: "
            if (r6 < 0) goto L32
            if (r6 > r5) goto L32
            int r1 = r6 + r7
            if (r1 < 0) goto Ld
            if (r1 > r5) goto Ld
            return
        Ld:
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "The destination array does not have enough capacity, destination offset: "
            r2.append(r3)
            r2.append(r6)
            r2.append(r0)
            r2.append(r5)
            java.lang.String r5 = ", capacity needed: "
            r2.append(r5)
            r2.append(r7)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5)
            throw r1
        L32:
            java.lang.IndexOutOfBoundsException r7 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "destination offset: "
            r1.append(r2)
            r1.append(r6)
            r1.append(r0)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r7.<init>(r5)
            throw r7
    }

    private final void h(int r4) {
            r3 = this;
            kotlin.io.encoding.Base64$PaddingOption r0 = r3.d
            kotlin.io.encoding.Base64$PaddingOption r1 = kotlin.io.encoding.Base64.PaddingOption.ABSENT
            if (r0 == r1) goto L7
            return
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "The padding option is set to ABSENT, but the input has a pad character at index "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public static /* synthetic */ byte[] l(kotlin.io.encoding.Base64 r0, java.lang.CharSequence r1, int r2, int r3, int r4, java.lang.Object r5) {
            if (r5 != 0) goto L14
            r5 = r4 & 2
            if (r5 == 0) goto L7
            r2 = 0
        L7:
            r4 = r4 & 4
            if (r4 == 0) goto Lf
            int r3 = r1.length()
        Lf:
            byte[] r0 = r0.j(r1, r2, r3)
            return r0
        L14:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: decode"
            r0.<init>(r1)
            throw r0
    }

    public static /* synthetic */ byte[] m(kotlin.io.encoding.Base64 r0, byte[] r1, int r2, int r3, int r4, java.lang.Object r5) {
            if (r5 != 0) goto L11
            r5 = r4 & 2
            if (r5 == 0) goto L7
            r2 = 0
        L7:
            r4 = r4 & 4
            if (r4 == 0) goto Lc
            int r3 = r1.length
        Lc:
            byte[] r0 = r0.k(r1, r2, r3)
            return r0
        L11:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: decode"
            r0.<init>(r1)
            throw r0
    }

    private final int n(byte[] r20, byte[] r21, int r22, int r23, int r24) {
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r24
            boolean r3 = r0.a
            if (r3 == 0) goto Lf
            int[] r3 = kotlin.io.encoding.b.c()
            goto L13
        Lf:
            int[] r3 = kotlin.io.encoding.b.a()
        L13:
            r5 = -8
            r9 = r22
            r6 = r23
            r7 = -8
            r8 = 0
        L1a:
            java.lang.String r10 = ") at index "
            java.lang.String r11 = "toString(...)"
            java.lang.String r12 = "'("
            r13 = -2
            if (r6 >= r2) goto Ld5
            if (r7 != r5) goto L6f
            int r4 = r6 + 3
            if (r4 >= r2) goto L6f
            int r4 = r6 + 1
            r23 = 8
            r14 = r1[r6]
            r14 = r14 & 255(0xff, float:3.57E-43)
            r14 = r3[r14]
            int r16 = r6 + 2
            r4 = r1[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r4 = r3[r4]
            int r17 = r6 + 3
            r18 = 1
            r15 = r1[r16]
            r15 = r15 & 255(0xff, float:3.57E-43)
            r15 = r3[r15]
            int r16 = r6 + 4
            r5 = r1[r17]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r5 = r3[r5]
            int r14 = r14 << 18
            int r4 = r4 << 12
            r4 = r4 | r14
            int r14 = r15 << 6
            r4 = r4 | r14
            r4 = r4 | r5
            if (r4 < 0) goto L73
            int r5 = r9 + 1
            int r6 = r4 >> 16
            byte r6 = (byte) r6
            r21[r9] = r6
            int r6 = r9 + 2
            int r10 = r4 >> 8
            byte r10 = (byte) r10
            r21[r5] = r10
            int r9 = r9 + 3
            byte r4 = (byte) r4
            r21[r6] = r4
            r6 = r16
        L6d:
            r5 = -8
            goto L1a
        L6f:
            r23 = 8
            r18 = 1
        L73:
            r4 = r1[r6]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r5 = r3[r4]
            if (r5 >= 0) goto Lb9
            if (r5 != r13) goto L83
            int r6 = r0.G(r1, r6, r2, r7)
            r4 = 1
            goto Lda
        L83:
            boolean r5 = r0.b
            if (r5 == 0) goto L8a
            int r6 = r6 + 1
            goto L6d
        L8a:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid symbol '"
            r2.append(r3)
            char r3 = (char) r4
            r2.append(r3)
            r2.append(r12)
            int r3 = kotlin.text.b.a(r23)
            java.lang.String r3 = java.lang.Integer.toString(r4, r3)
            kotlin.jvm.internal.g0.o(r3, r11)
            r2.append(r3)
            r2.append(r10)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        Lb9:
            int r6 = r6 + 1
            int r4 = r8 << 6
            r8 = r4 | r5
            int r4 = r7 + 6
            if (r4 < 0) goto Ld3
            int r5 = r9 + 1
            int r10 = r8 >>> r4
            byte r10 = (byte) r10
            r21[r9] = r10
            int r4 = r18 << r4
            int r4 = r4 + (-1)
            r8 = r8 & r4
            int r7 = r7 + (-2)
            r9 = r5
            goto L6d
        Ld3:
            r7 = r4
            goto L6d
        Ld5:
            r23 = 8
            r18 = 1
            r4 = 0
        Lda:
            if (r7 == r13) goto L13d
            r3 = -8
            if (r7 == r3) goto Lf0
            if (r4 != 0) goto Lf0
            kotlin.io.encoding.Base64$PaddingOption r3 = r0.d
            kotlin.io.encoding.Base64$PaddingOption r4 = kotlin.io.encoding.Base64.PaddingOption.PRESENT
            if (r3 == r4) goto Le8
            goto Lf0
        Le8:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "The padding option is set to PRESENT, but the input is not properly padded"
            r1.<init>(r2)
            throw r1
        Lf0:
            if (r8 != 0) goto L135
            int r3 = r0.K(r1, r6, r2)
            if (r3 < r2) goto Lfb
            int r9 = r9 - r22
            return r9
        Lfb:
            r1 = r1[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Symbol '"
            r4.append(r5)
            char r5 = (char) r1
            r4.append(r5)
            r4.append(r12)
            int r5 = kotlin.text.b.a(r23)
            java.lang.String r1 = java.lang.Integer.toString(r1, r5)
            kotlin.jvm.internal.g0.o(r1, r11)
            r4.append(r1)
            r4.append(r10)
            int r3 = r3 + (-1)
            r4.append(r3)
            java.lang.String r1 = " is prohibited after the pad character"
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r2.<init>(r1)
            throw r2
        L135:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "The pad bits must be zeros"
            r1.<init>(r2)
            throw r1
        L13d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "The last unit of input does not have enough bits"
            r1.<init>(r2)
            throw r1
    }

    public static /* synthetic */ int q(kotlin.io.encoding.Base64 r1, java.lang.CharSequence r2, byte[] r3, int r4, int r5, int r6, int r7, java.lang.Object r8) {
            if (r8 != 0) goto L1a
            r8 = r7 & 4
            r0 = 0
            if (r8 == 0) goto L8
            r4 = 0
        L8:
            r8 = r7 & 8
            if (r8 == 0) goto Ld
            r5 = 0
        Ld:
            r7 = r7 & 16
            if (r7 == 0) goto L15
            int r6 = r2.length()
        L15:
            int r1 = r1.o(r2, r3, r4, r5, r6)
            return r1
        L1a:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Super calls with default arguments not supported in this target, function: decodeIntoByteArray"
            r1.<init>(r2)
            throw r1
    }

    public static /* synthetic */ int r(kotlin.io.encoding.Base64 r1, byte[] r2, byte[] r3, int r4, int r5, int r6, int r7, java.lang.Object r8) {
            if (r8 != 0) goto L17
            r8 = r7 & 4
            r0 = 0
            if (r8 == 0) goto L8
            r4 = 0
        L8:
            r8 = r7 & 8
            if (r8 == 0) goto Ld
            r5 = 0
        Ld:
            r7 = r7 & 16
            if (r7 == 0) goto L12
            int r6 = r2.length
        L12:
            int r1 = r1.p(r2, r3, r4, r5, r6)
            return r1
        L17:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Super calls with default arguments not supported in this target, function: decodeIntoByteArray"
            r1.<init>(r2)
            throw r1
    }

    public static /* synthetic */ java.lang.String u(kotlin.io.encoding.Base64 r0, byte[] r1, int r2, int r3, int r4, java.lang.Object r5) {
            if (r5 != 0) goto L11
            r5 = r4 & 2
            if (r5 == 0) goto L7
            r2 = 0
        L7:
            r4 = r4 & 4
            if (r4 == 0) goto Lc
            int r3 = r1.length
        Lc:
            java.lang.String r0 = r0.t(r1, r2, r3)
            return r0
        L11:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: encode"
            r0.<init>(r1)
            throw r0
    }

    public static /* synthetic */ int w(kotlin.io.encoding.Base64 r1, byte[] r2, byte[] r3, int r4, int r5, int r6, int r7, java.lang.Object r8) {
            if (r8 != 0) goto L17
            r8 = r7 & 4
            r0 = 0
            if (r8 == 0) goto L8
            r4 = 0
        L8:
            r8 = r7 & 8
            if (r8 == 0) goto Ld
            r5 = 0
        Ld:
            r7 = r7 & 16
            if (r7 == 0) goto L12
            int r6 = r2.length
        L12:
            int r1 = r1.v(r2, r3, r4, r5, r6)
            return r1
        L17:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Super calls with default arguments not supported in this target, function: encodeIntoByteArray"
            r1.<init>(r2)
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public final byte[] B(@org.jetbrains.annotations.NotNull byte[] r2, int r3, int r4) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r2, r0)
            byte[] r2 = r1.D(r2, r3, r4)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final byte[] D(@org.jetbrains.annotations.NotNull byte[] r8, int r9, int r10) {
            r7 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r8, r0)
            int r0 = r8.length
            r7.i(r0, r9, r10)
            int r0 = r10 - r9
            int r0 = r7.y(r0)
            byte[] r3 = new byte[r0]
            r4 = 0
            r1 = r7
            r2 = r8
            r5 = r9
            r6 = r10
            r1.x(r2, r3, r4, r5, r6)
            return r3
    }

    public final int E() {
            r1 = this;
            int r0 = r1.c
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.io.encoding.Base64.PaddingOption F() {
            r1 = this;
            kotlin.io.encoding.Base64$PaddingOption r0 = r1.d
            return r0
    }

    public final boolean H() {
            r1 = this;
            boolean r0 = r1.b
            return r0
    }

    public final boolean I() {
            r1 = this;
            boolean r0 = r1.a
            return r0
    }

    @kotlin.SinceKotlin(version = "2.0")
    @org.jetbrains.annotations.NotNull
    public final kotlin.io.encoding.Base64 L(@org.jetbrains.annotations.NotNull kotlin.io.encoding.Base64.PaddingOption r5) {
            r4 = this;
            java.lang.String r0 = "option"
            kotlin.jvm.internal.g0.p(r5, r0)
            kotlin.io.encoding.Base64$PaddingOption r0 = r4.d
            if (r0 != r5) goto La
            return r4
        La:
            kotlin.io.encoding.Base64 r0 = new kotlin.io.encoding.Base64
            boolean r1 = r4.a
            boolean r2 = r4.b
            int r3 = r4.c
            r0.<init>(r1, r2, r3, r5)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String e(@org.jetbrains.annotations.NotNull byte[] r5) {
            r4 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r5.length
            r0.<init>(r1)
            int r1 = r5.length
            r2 = 0
        Ld:
            if (r2 >= r1) goto L18
            r3 = r5[r2]
            char r3 = (char) r3
            r0.append(r3)
            int r2 = r2 + 1
            goto Ld
        L18:
            java.lang.String r5 = r0.toString()
            return r5
    }

    @org.jetbrains.annotations.NotNull
    public final byte[] f(@org.jetbrains.annotations.NotNull java.lang.CharSequence r5, int r6, int r7) {
            r4 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r5, r0)
            int r0 = r5.length()
            r4.i(r0, r6, r7)
            int r0 = r7 - r6
            byte[] r0 = new byte[r0]
            r1 = 0
        L11:
            if (r6 >= r7) goto L2c
            char r2 = r5.charAt(r6)
            r3 = 255(0xff, float:3.57E-43)
            if (r2 > r3) goto L22
            int r3 = r1 + 1
            byte r2 = (byte) r2
            r0[r1] = r2
            r1 = r3
            goto L29
        L22:
            int r2 = r1 + 1
            r3 = 63
            r0[r1] = r3
            r1 = r2
        L29:
            int r6 = r6 + 1
            goto L11
        L2c:
            return r0
    }

    public final void i(int r2, int r3, int r4) {
            r1 = this;
            kotlin.collections.d$a r0 = kotlin.collections.d.Companion
            r0.a(r3, r4, r2)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final byte[] j(@org.jetbrains.annotations.NotNull java.lang.CharSequence r7, int r8, int r9) {
            r6 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r7, r0)
            boolean r0 = r7 instanceof java.lang.String
            if (r0 == 0) goto L2d
            java.lang.String r7 = (java.lang.String) r7
            int r0 = r7.length()
            r6.i(r0, r8, r9)
            java.lang.String r7 = r7.substring(r8, r9)
            java.lang.String r8 = "substring(...)"
            kotlin.jvm.internal.g0.o(r7, r8)
            java.nio.charset.Charset r8 = kotlin.text.e.g
            java.lang.String r9 = "null cannot be cast to non-null type java.lang.String"
            kotlin.jvm.internal.g0.n(r7, r9)
            byte[] r7 = r7.getBytes(r8)
            java.lang.String r8 = "getBytes(...)"
            kotlin.jvm.internal.g0.o(r7, r8)
        L2b:
            r1 = r7
            goto L32
        L2d:
            byte[] r7 = r6.f(r7, r8, r9)
            goto L2b
        L32:
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            byte[] r7 = m(r0, r1, r2, r3, r4, r5)
            return r7
    }

    @org.jetbrains.annotations.NotNull
    public final byte[] k(@org.jetbrains.annotations.NotNull byte[] r8, int r9, int r10) {
            r7 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r8, r0)
            int r0 = r8.length
            r7.i(r0, r9, r10)
            int r0 = r7.s(r8, r9, r10)
            byte[] r3 = new byte[r0]
            r4 = 0
            r1 = r7
            r2 = r8
            r5 = r9
            r6 = r10
            int r8 = r1.n(r2, r3, r4, r5, r6)
            if (r8 != r0) goto L1b
            return r3
        L1b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Check failed."
            r8.<init>(r9)
            throw r8
    }

    public final int o(@org.jetbrains.annotations.NotNull java.lang.CharSequence r9, @org.jetbrains.annotations.NotNull byte[] r10, int r11, int r12, int r13) {
            r8 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r10, r0)
            boolean r0 = r9 instanceof java.lang.String
            if (r0 == 0) goto L32
            java.lang.String r9 = (java.lang.String) r9
            int r0 = r9.length()
            r8.i(r0, r12, r13)
            java.lang.String r9 = r9.substring(r12, r13)
            java.lang.String r12 = "substring(...)"
            kotlin.jvm.internal.g0.o(r9, r12)
            java.nio.charset.Charset r12 = kotlin.text.e.g
            java.lang.String r13 = "null cannot be cast to non-null type java.lang.String"
            kotlin.jvm.internal.g0.n(r9, r13)
            byte[] r9 = r9.getBytes(r12)
            java.lang.String r12 = "getBytes(...)"
            kotlin.jvm.internal.g0.o(r9, r12)
        L30:
            r1 = r9
            goto L37
        L32:
            byte[] r9 = r8.f(r9, r12, r13)
            goto L30
        L37:
            r6 = 24
            r7 = 0
            r4 = 0
            r5 = 0
            r0 = r8
            r2 = r10
            r3 = r11
            int r9 = r(r0, r1, r2, r3, r4, r5, r6, r7)
            return r9
    }

    public final int p(@org.jetbrains.annotations.NotNull byte[] r3, @org.jetbrains.annotations.NotNull byte[] r4, int r5, int r6, int r7) {
            r2 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r3.length
            r2.i(r0, r6, r7)
            int r0 = r4.length
            int r1 = r2.s(r3, r6, r7)
            r2.g(r0, r5, r1)
            int r3 = r2.n(r3, r4, r5, r6, r7)
            return r3
    }

    public final int s(@org.jetbrains.annotations.NotNull byte[] r4, int r5, int r6) {
            r3 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r6 - r5
            if (r0 != 0) goto Lb
            r4 = 0
            return r4
        Lb:
            r1 = 1
            if (r0 == r1) goto L4a
            boolean r1 = r3.b
            if (r1 == 0) goto L2b
        L12:
            if (r5 >= r6) goto L3f
            r1 = r4[r5]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int[] r2 = kotlin.io.encoding.b.a()
            r1 = r2[r1]
            if (r1 >= 0) goto L28
            r2 = -2
            if (r1 != r2) goto L26
            int r6 = r6 - r5
            int r0 = r0 - r6
            goto L3f
        L26:
            int r0 = r0 + (-1)
        L28:
            int r5 = r5 + 1
            goto L12
        L2b:
            int r5 = r6 + (-1)
            r5 = r4[r5]
            r1 = 61
            if (r5 != r1) goto L3f
            int r5 = r0 + (-1)
            int r6 = r6 + (-2)
            r4 = r4[r6]
            if (r4 != r1) goto L3e
            int r0 = r0 + (-2)
            goto L3f
        L3e:
            r0 = r5
        L3f:
            long r4 = (long) r0
            r6 = 6
            long r0 = (long) r6
            long r4 = r4 * r0
            r6 = 8
            long r0 = (long) r6
            long r4 = r4 / r0
            int r5 = (int) r4
            return r5
        L4a:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Input should have at least 2 symbols for Base64 decoding, startIndex: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = ", endIndex: "
            r0.append(r5)
            r0.append(r6)
            java.lang.String r5 = r0.toString()
            r4.<init>(r5)
            throw r4
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String t(@org.jetbrains.annotations.NotNull byte[] r2, int r3, int r4) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r2, r0)
            byte[] r2 = r1.D(r2, r3, r4)
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = kotlin.text.e.g
            r3.<init>(r2, r4)
            return r3
    }

    public final int v(@org.jetbrains.annotations.NotNull byte[] r2, @org.jetbrains.annotations.NotNull byte[] r3, int r4, int r5, int r6) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r3, r0)
            int r2 = r1.x(r2, r3, r4, r5, r6)
            return r2
    }

    public final int x(@org.jetbrains.annotations.NotNull byte[] r18, @org.jetbrains.annotations.NotNull byte[] r19, int r20, int r21, int r22) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            java.lang.String r6 = "source"
            kotlin.jvm.internal.g0.p(r1, r6)
            java.lang.String r6 = "destination"
            kotlin.jvm.internal.g0.p(r2, r6)
            int r6 = r1.length
            r0.i(r6, r4, r5)
            int r6 = r2.length
            int r7 = r5 - r4
            int r7 = r0.y(r7)
            r0.g(r6, r3, r7)
            boolean r6 = r0.a
            if (r6 == 0) goto L2d
            byte[] r6 = kotlin.io.encoding.b.d()
            goto L31
        L2d:
            byte[] r6 = kotlin.io.encoding.b.b()
        L31:
            boolean r7 = r0.b
            if (r7 == 0) goto L38
            int r7 = r0.e
            goto L3b
        L38:
            r7 = 2147483647(0x7fffffff, float:NaN)
        L3b:
            r8 = r3
        L3c:
            int r9 = r4 + 2
            r10 = 1
            if (r9 >= r5) goto L9f
            int r9 = r5 - r4
            int r9 = r9 / 3
            int r9 = java.lang.Math.min(r9, r7)
            r11 = 0
            r12 = 0
        L4b:
            if (r12 >= r9) goto L8c
            int r13 = r4 + 1
            r14 = r1[r4]
            r14 = r14 & 255(0xff, float:3.57E-43)
            int r15 = r4 + 2
            r13 = r1[r13]
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r4 = r4 + 3
            r15 = r1[r15]
            r15 = r15 & 255(0xff, float:3.57E-43)
            int r14 = r14 << 16
            int r13 = r13 << 8
            r13 = r13 | r14
            r13 = r13 | r15
            int r14 = r8 + 1
            int r15 = r13 >>> 18
            r15 = r6[r15]
            r2[r8] = r15
            int r15 = r8 + 2
            int r16 = r13 >>> 12
            r16 = r16 & 63
            r16 = r6[r16]
            r2[r14] = r16
            int r14 = r8 + 3
            int r16 = r13 >>> 6
            r16 = r16 & 63
            r16 = r6[r16]
            r2[r15] = r16
            int r8 = r8 + 4
            r13 = r13 & 63
            r13 = r6[r13]
            r2[r14] = r13
            int r12 = r12 + 1
            goto L4b
        L8c:
            if (r9 != r7) goto L3c
            if (r4 == r5) goto L3c
            int r9 = r8 + 1
            byte[] r12 = kotlin.io.encoding.Base64.n
            r11 = r12[r11]
            r2[r8] = r11
            int r8 = r8 + 2
            r10 = r12[r10]
            r2[r9] = r10
            goto L3c
        L9f:
            int r7 = r5 - r4
            r9 = 61
            if (r7 == r10) goto Le0
            r10 = 2
            if (r7 == r10) goto La9
            goto L10a
        La9:
            int r7 = r4 + 1
            r11 = r1[r4]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r4 = r4 + 2
            r1 = r1[r7]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r7 = r11 << 10
            int r1 = r1 << r10
            r1 = r1 | r7
            int r7 = r8 + 1
            int r10 = r1 >>> 12
            r10 = r6[r10]
            r2[r8] = r10
            int r10 = r8 + 2
            int r11 = r1 >>> 6
            r11 = r11 & 63
            r11 = r6[r11]
            r2[r7] = r11
            int r7 = r8 + 3
            r1 = r1 & 63
            r1 = r6[r1]
            r2[r10] = r1
            boolean r1 = r0.J()
            if (r1 == 0) goto Lde
            int r8 = r8 + 4
            r2[r7] = r9
            goto L10a
        Lde:
            r8 = r7
            goto L10a
        Le0:
            int r7 = r4 + 1
            r1 = r1[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 4
            int r4 = r8 + 1
            int r10 = r1 >>> 6
            r10 = r6[r10]
            r2[r8] = r10
            int r10 = r8 + 2
            r1 = r1 & 63
            r1 = r6[r1]
            r2[r4] = r1
            boolean r1 = r0.J()
            if (r1 == 0) goto L108
            int r1 = r8 + 3
            r2[r10] = r9
            int r8 = r8 + 4
            r2[r1] = r9
            r4 = r7
            goto L10a
        L108:
            r4 = r7
            r8 = r10
        L10a:
            if (r4 != r5) goto L10e
            int r8 = r8 - r3
            return r8
        L10e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Check failed."
            r1.<init>(r2)
            throw r1
    }

    public final int y(int r4) {
            r3 = this;
            int r0 = r4 / 3
            int r4 = r4 % 3
            r1 = 4
            int r0 = r0 * 4
            if (r4 == 0) goto L13
            boolean r2 = r3.J()
            if (r2 == 0) goto L10
            goto L12
        L10:
            int r1 = r4 + 1
        L12:
            int r0 = r0 + r1
        L13:
            java.lang.String r4 = "Input is too big"
            if (r0 < 0) goto L2c
            boolean r1 = r3.b
            if (r1 == 0) goto L23
            int r1 = r0 + (-1)
            int r2 = r3.c
            int r1 = r1 / r2
            int r1 = r1 * 2
            int r0 = r0 + r1
        L23:
            if (r0 < 0) goto L26
            return r0
        L26:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r4)
            throw r0
        L2c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r4)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public final <A extends java.lang.Appendable> A z(@org.jetbrains.annotations.NotNull byte[] r2, @org.jetbrains.annotations.NotNull A r3, int r4, int r5) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r3, r0)
            byte[] r2 = r1.D(r2, r4, r5)
            java.lang.String r4 = new java.lang.String
            java.nio.charset.Charset r5 = kotlin.text.e.g
            r4.<init>(r2, r5)
            r3.append(r4)
            return r3
    }
}
