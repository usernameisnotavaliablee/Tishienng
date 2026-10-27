package kotlin.text;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nChar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Char.kt\nkotlin/text/CharsKt__CharKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,339:1\n1#2:340\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class d extends kotlin.text.c {
    public d() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.SinceKotlin(version = "1.5")
    public static final char D(int r3) {
            if (r3 < 0) goto La
            r0 = 10
            if (r3 >= r0) goto La
            int r3 = r3 + 48
            char r3 = (char) r3
            return r3
        La:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Int "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " is not a decimal digit"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    public static final char E(int r3, int r4) {
            r0 = 2
            if (r0 > r4) goto L37
            r0 = 37
            if (r4 >= r0) goto L37
            if (r3 < 0) goto L18
            if (r3 >= r4) goto L18
            r4 = 10
            if (r3 >= r4) goto L13
            int r3 = r3 + 48
        L11:
            char r3 = (char) r3
            return r3
        L13:
            int r3 = r3 + 65
            char r3 = (char) r3
            int r3 = r3 - r4
            goto L11
        L18:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Digit "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " does not represent a valid digit in radix "
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L37:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid radix: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = ". Valid radix values are in range 2..36"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
    }

    @kotlin.SinceKotlin(version = "1.5")
    public static final int F(char r3) {
            r0 = 10
            int r0 = kotlin.text.c.b(r3, r0)
            if (r0 < 0) goto L9
            return r0
        L9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Char "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " is not a decimal digit"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    public static final int G(char r3, int r4) {
            java.lang.Integer r0 = I(r3, r4)
            if (r0 == 0) goto Lb
            int r3 = r0.intValue()
            return r3
        Lb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Char "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " is not a digit in the given radix="
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Integer H(char r1) {
            r0 = 10
            int r1 = kotlin.text.c.b(r1, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r0 = r1.intValue()
            if (r0 < 0) goto L11
            return r1
        L11:
            r1 = 0
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Integer I(char r0, int r1) {
            kotlin.text.c.a(r1)
            int r0 = kotlin.text.c.b(r0, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = r0.intValue()
            if (r1 < 0) goto L12
            return r0
        L12:
            r0 = 0
            return r0
    }

    public static final boolean J(char r2, char r3, boolean r4) {
            r0 = 1
            if (r2 != r3) goto L4
            return r0
        L4:
            r1 = 0
            if (r4 != 0) goto L8
            return r1
        L8:
            char r2 = java.lang.Character.toUpperCase(r2)
            char r3 = java.lang.Character.toUpperCase(r3)
            if (r2 == r3) goto L1e
            char r2 = java.lang.Character.toLowerCase(r2)
            char r3 = java.lang.Character.toLowerCase(r3)
            if (r2 != r3) goto L1d
            goto L1e
        L1d:
            return r1
        L1e:
            return r0
    }

    public static /* synthetic */ boolean K(char r0, char r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            boolean r0 = J(r0, r1, r2)
            return r0
    }

    public static boolean L(char r2) {
            r0 = 55296(0xd800, float:7.7486E-41)
            r1 = 0
            if (r0 > r2) goto Ld
            r0 = 57344(0xe000, float:8.0356E-41)
            if (r2 >= r0) goto Ld
            r2 = 1
            return r2
        Ld:
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final java.lang.String M(char r1, java.lang.String r2) {
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String N(char r0) {
            java.lang.String r0 = kotlin.text.y0.a(r0)
            return r0
    }
}
