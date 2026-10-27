package okio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.JvmName(name = "Utf8")
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nUtf8.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utf8.kt\nokio/Utf8\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,559:1\n397#1,9:563\n127#1:572\n406#1,20:574\n440#1,4:595\n127#1:599\n446#1,10:601\n127#1:611\n456#1,5:612\n127#1:617\n461#1,24:618\n500#1,4:643\n127#1:647\n506#1,2:649\n127#1:651\n510#1,10:652\n127#1:662\n520#1,5:663\n127#1:668\n525#1,5:669\n127#1:674\n530#1,28:675\n397#1,9:704\n127#1:713\n406#1,20:715\n440#1,4:736\n127#1:740\n446#1,10:742\n127#1:752\n456#1,5:753\n127#1:758\n461#1,24:759\n500#1,4:784\n127#1:788\n506#1,2:790\n127#1:792\n510#1,10:793\n127#1:803\n520#1,5:804\n127#1:809\n525#1,5:810\n127#1:815\n530#1,28:816\n127#1:844\n127#1:846\n127#1:848\n127#1:850\n127#1:852\n127#1:854\n127#1:856\n127#1:858\n127#1:860\n1#2:560\n73#3:561\n67#3:562\n73#3:573\n67#3:594\n73#3:600\n67#3:642\n73#3:648\n67#3:703\n73#3:714\n67#3:735\n73#3:741\n67#3:783\n73#3:789\n73#3:845\n73#3:847\n73#3:849\n73#3:851\n73#3:853\n73#3:855\n73#3:857\n73#3:859\n73#3:861\n*S KotlinDebug\n*F\n+ 1 Utf8.kt\nokio/Utf8\n*L\n228#1:563,9\n228#1:572\n228#1:574,20\n232#1:595,4\n232#1:599\n232#1:601,10\n232#1:611\n232#1:612,5\n232#1:617\n232#1:618,24\n236#1:643,4\n236#1:647\n236#1:649,2\n236#1:651\n236#1:652,10\n236#1:662\n236#1:663,5\n236#1:668\n236#1:669,5\n236#1:674\n236#1:675,28\n277#1:704,9\n277#1:713\n277#1:715,20\n281#1:736,4\n281#1:740\n281#1:742,10\n281#1:752\n281#1:753,5\n281#1:758\n281#1:759,24\n285#1:784,4\n285#1:788\n285#1:790,2\n285#1:792\n285#1:793,10\n285#1:803\n285#1:804,5\n285#1:809\n285#1:810,5\n285#1:815\n285#1:816,28\n405#1:844\n443#1:846\n455#1:848\n460#1:850\n503#1:852\n507#1:854\n519#1:856\n524#1:858\n529#1:860\n127#1:561\n226#1:562\n228#1:573\n230#1:594\n232#1:600\n234#1:642\n236#1:648\n275#1:703\n277#1:714\n279#1:735\n281#1:741\n283#1:783\n285#1:789\n405#1:845\n443#1:847\n455#1:849\n460#1:851\n503#1:853\n507#1:855\n519#1:857\n524#1:859\n529#1:861\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class Utf8 {
    public static final int HIGH_SURROGATE_HEADER = 55232;
    public static final int LOG_SURROGATE_HEADER = 56320;
    public static final int MASK_2BYTES = 3968;
    public static final int MASK_3BYTES = -123008;
    public static final int MASK_4BYTES = 3678080;
    public static final byte REPLACEMENT_BYTE = 63;
    public static final char REPLACEMENT_CHARACTER = 65533;
    public static final int REPLACEMENT_CODE_POINT = 65533;

    public Utf8() {
            r1 = this;
            r1.<init>()
            return
    }

    public static final boolean isIsoControl(int r1) {
            if (r1 < 0) goto L7
            r0 = 32
            if (r1 >= r0) goto L7
            goto Lf
        L7:
            r0 = 127(0x7f, float:1.78E-43)
            if (r0 > r1) goto L11
            r0 = 160(0xa0, float:2.24E-43)
            if (r1 >= r0) goto L11
        Lf:
            r1 = 1
            return r1
        L11:
            r1 = 0
            return r1
    }

    public static final boolean isUtf8Continuation(byte r1) {
            r1 = r1 & 192(0xc0, float:2.69E-43)
            r0 = 128(0x80, float:1.8E-43)
            if (r1 != r0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    public static final int process2Utf8Bytes(@org.jetbrains.annotations.NotNull byte[] r3, int r4, int r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.n1> r6) {
            r0 = 65533(0xfffd, float:9.1831E-41)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r1)
            java.lang.String r1 = "yield"
            kotlin.jvm.internal.g0.p(r6, r1)
            int r1 = r4 + 1
            r2 = 1
            if (r5 > r1) goto L1a
            r6.invoke(r0)
            return r2
        L1a:
            r4 = r3[r4]
            r3 = r3[r1]
            r5 = r3 & 192(0xc0, float:2.69E-43)
            r1 = 128(0x80, float:1.8E-43)
            if (r5 != r1) goto L38
            r3 = r3 ^ 3968(0xf80, float:5.56E-42)
            int r4 = r4 << 6
            r3 = r3 ^ r4
            if (r3 >= r1) goto L2f
            r6.invoke(r0)
            goto L36
        L2f:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6.invoke(r3)
        L36:
            r3 = 2
            return r3
        L38:
            r6.invoke(r0)
            return r2
    }

    public static final int process3Utf8Bytes(@org.jetbrains.annotations.NotNull byte[] r6, int r7, int r8, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.n1> r9) {
            r0 = 65533(0xfffd, float:9.1831E-41)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.g0.p(r6, r1)
            java.lang.String r1 = "yield"
            kotlin.jvm.internal.g0.p(r9, r1)
            int r1 = r7 + 2
            r2 = 128(0x80, float:1.8E-43)
            r3 = 1
            r4 = 2
            if (r8 > r1) goto L27
            r9.invoke(r0)
            int r7 = r7 + r3
            if (r8 <= r7) goto L26
            r6 = r6[r7]
            r6 = r6 & 192(0xc0, float:2.69E-43)
            if (r6 != r2) goto L26
            return r4
        L26:
            return r3
        L27:
            r8 = r6[r7]
            int r7 = r7 + r3
            r7 = r6[r7]
            r5 = r7 & 192(0xc0, float:2.69E-43)
            if (r5 != r2) goto L63
            r6 = r6[r1]
            r1 = r6 & 192(0xc0, float:2.69E-43)
            if (r1 != r2) goto L5f
            r1 = -123008(0xfffffffffffe1f80, float:NaN)
            r6 = r6 ^ r1
            int r7 = r7 << 6
            r6 = r6 ^ r7
            int r7 = r8 << 12
            r6 = r6 ^ r7
            r7 = 2048(0x800, float:2.87E-42)
            if (r6 >= r7) goto L48
            r9.invoke(r0)
            goto L5d
        L48:
            r7 = 55296(0xd800, float:7.7486E-41)
            if (r7 > r6) goto L56
            r7 = 57344(0xe000, float:8.0356E-41)
            if (r6 >= r7) goto L56
            r9.invoke(r0)
            goto L5d
        L56:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r9.invoke(r6)
        L5d:
            r6 = 3
            return r6
        L5f:
            r9.invoke(r0)
            return r4
        L63:
            r9.invoke(r0)
            return r3
    }

    public static final int process4Utf8Bytes(@org.jetbrains.annotations.NotNull byte[] r8, int r9, int r10, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.n1> r11) {
            r0 = 65533(0xfffd, float:9.1831E-41)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.g0.p(r8, r1)
            java.lang.String r1 = "yield"
            kotlin.jvm.internal.g0.p(r11, r1)
            int r1 = r9 + 3
            r2 = 2
            r3 = 1
            r4 = 128(0x80, float:1.8E-43)
            r5 = 3
            if (r10 > r1) goto L33
            r11.invoke(r0)
            int r11 = r9 + 1
            if (r10 <= r11) goto L32
            r11 = r8[r11]
            r11 = r11 & 192(0xc0, float:2.69E-43)
            if (r11 != r4) goto L32
            int r9 = r9 + r2
            if (r10 <= r9) goto L31
            r8 = r8[r9]
            r8 = r8 & 192(0xc0, float:2.69E-43)
            if (r8 != r4) goto L31
            return r5
        L31:
            return r2
        L32:
            return r3
        L33:
            r10 = r8[r9]
            int r6 = r9 + 1
            r6 = r8[r6]
            r7 = r6 & 192(0xc0, float:2.69E-43)
            if (r7 != r4) goto L87
            int r9 = r9 + r2
            r9 = r8[r9]
            r3 = r9 & 192(0xc0, float:2.69E-43)
            if (r3 != r4) goto L83
            r8 = r8[r1]
            r1 = r8 & 192(0xc0, float:2.69E-43)
            if (r1 != r4) goto L7f
            r1 = 3678080(0x381f80, float:5.154088E-39)
            r8 = r8 ^ r1
            int r9 = r9 << 6
            r8 = r8 ^ r9
            int r9 = r6 << 12
            r8 = r8 ^ r9
            int r9 = r10 << 18
            r8 = r8 ^ r9
            r9 = 1114111(0x10ffff, float:1.561202E-39)
            if (r8 <= r9) goto L60
            r11.invoke(r0)
            goto L7d
        L60:
            r9 = 55296(0xd800, float:7.7486E-41)
            if (r9 > r8) goto L6e
            r9 = 57344(0xe000, float:8.0356E-41)
            if (r8 >= r9) goto L6e
            r11.invoke(r0)
            goto L7d
        L6e:
            r9 = 65536(0x10000, float:9.1835E-41)
            if (r8 >= r9) goto L76
            r11.invoke(r0)
            goto L7d
        L76:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r11.invoke(r8)
        L7d:
            r8 = 4
            return r8
        L7f:
            r11.invoke(r0)
            return r5
        L83:
            r11.invoke(r0)
            return r2
        L87:
            r11.invoke(r0)
            return r3
    }

    public static final void processUtf16Chars(@org.jetbrains.annotations.NotNull byte[] r12, int r13, int r14, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Character, kotlin.n1> r15) {
            r0 = 65533(0xfffd, float:9.1831E-41)
            java.lang.Character r1 = java.lang.Character.valueOf(r0)
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.g0.p(r12, r2)
            java.lang.String r2 = "yield"
            kotlin.jvm.internal.g0.p(r15, r2)
        L11:
            if (r13 >= r14) goto L169
            r2 = r12[r13]
            if (r2 < 0) goto L32
            char r2 = (char) r2
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            r15.invoke(r2)
            int r13 = r13 + 1
        L21:
            if (r13 >= r14) goto L11
            r2 = r12[r13]
            if (r2 < 0) goto L11
            int r13 = r13 + 1
            char r2 = (char) r2
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            r15.invoke(r2)
            goto L21
        L32:
            int r3 = r2 >> 5
            r4 = -2
            r5 = 2
            r6 = 128(0x80, float:1.8E-43)
            r7 = 1
            if (r3 != r4) goto L67
            int r3 = r13 + 1
            if (r14 > r3) goto L4b
        L3f:
            char r2 = (char) r0
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            r15.invoke(r2)
            kotlin.n1 r2 = kotlin.n1.a
        L49:
            r5 = 1
            goto L65
        L4b:
            r3 = r12[r3]
            r4 = r3 & 192(0xc0, float:2.69E-43)
            if (r4 != r6) goto L3f
            r3 = r3 ^ 3968(0xf80, float:5.56E-42)
            int r2 = r2 << 6
            r2 = r2 ^ r3
            if (r2 >= r6) goto L63
            char r2 = (char) r0
        L59:
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            r15.invoke(r2)
            kotlin.n1 r2 = kotlin.n1.a
            goto L65
        L63:
            char r2 = (char) r2
            goto L59
        L65:
            int r13 = r13 + r5
            goto L11
        L67:
            int r3 = r2 >> 4
            r8 = 57344(0xe000, float:8.0356E-41)
            r9 = 55296(0xd800, float:7.7486E-41)
            r10 = 3
            if (r3 != r4) goto Ld2
            int r3 = r13 + 2
            if (r14 > r3) goto L8b
            char r2 = (char) r0
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            r15.invoke(r2)
            kotlin.n1 r2 = kotlin.n1.a
            int r2 = r13 + 1
            if (r14 <= r2) goto L49
            r2 = r12[r2]
            r2 = r2 & 192(0xc0, float:2.69E-43)
            if (r2 != r6) goto L49
            goto L65
        L8b:
            int r4 = r13 + 1
            r4 = r12[r4]
            r11 = r4 & 192(0xc0, float:2.69E-43)
            if (r11 != r6) goto Lc6
            r3 = r12[r3]
            r7 = r3 & 192(0xc0, float:2.69E-43)
            if (r7 != r6) goto Lbb
            r5 = -123008(0xfffffffffffe1f80, float:NaN)
            r3 = r3 ^ r5
            int r4 = r4 << 6
            r3 = r3 ^ r4
            int r2 = r2 << 12
            r2 = r2 ^ r3
            r3 = 2048(0x800, float:2.87E-42)
            if (r2 >= r3) goto Lb2
        La7:
            char r2 = (char) r0
        La8:
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            r15.invoke(r2)
            kotlin.n1 r2 = kotlin.n1.a
            goto Lb9
        Lb2:
            if (r9 > r2) goto Lb7
            if (r2 >= r8) goto Lb7
            goto La7
        Lb7:
            char r2 = (char) r2
            goto La8
        Lb9:
            r5 = 3
            goto L65
        Lbb:
            char r2 = (char) r0
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            r15.invoke(r2)
            kotlin.n1 r2 = kotlin.n1.a
            goto L65
        Lc6:
            char r2 = (char) r0
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            r15.invoke(r2)
            kotlin.n1 r2 = kotlin.n1.a
            goto L49
        Ld2:
            int r3 = r2 >> 3
            if (r3 != r4) goto L162
            int r3 = r13 + 3
            if (r14 > r3) goto Lf4
            r15.invoke(r1)
            kotlin.n1 r2 = kotlin.n1.a
            int r2 = r13 + 1
            if (r14 <= r2) goto L49
            r2 = r12[r2]
            r2 = r2 & 192(0xc0, float:2.69E-43)
            if (r2 != r6) goto L49
            int r2 = r13 + 2
            if (r14 <= r2) goto L65
            r2 = r12[r2]
            r2 = r2 & 192(0xc0, float:2.69E-43)
            if (r2 != r6) goto L65
        Lf3:
            goto Lb9
        Lf4:
            int r4 = r13 + 1
            r4 = r12[r4]
            r11 = r4 & 192(0xc0, float:2.69E-43)
            if (r11 != r6) goto L15b
            int r7 = r13 + 2
            r7 = r12[r7]
            r11 = r7 & 192(0xc0, float:2.69E-43)
            if (r11 != r6) goto L154
            r3 = r12[r3]
            r5 = r3 & 192(0xc0, float:2.69E-43)
            if (r5 != r6) goto L14e
            r5 = 3678080(0x381f80, float:5.154088E-39)
            r3 = r3 ^ r5
            int r5 = r7 << 6
            r3 = r3 ^ r5
            int r4 = r4 << 12
            r3 = r3 ^ r4
            int r2 = r2 << 18
            r2 = r2 ^ r3
            r3 = 1114111(0x10ffff, float:1.561202E-39)
            if (r2 <= r3) goto L122
        L11c:
            r15.invoke(r1)
        L11f:
            kotlin.n1 r2 = kotlin.n1.a
            goto L14b
        L122:
            if (r9 > r2) goto L127
            if (r2 >= r8) goto L127
            goto L11c
        L127:
            r3 = 65536(0x10000, float:9.1835E-41)
            if (r2 >= r3) goto L12c
            goto L11c
        L12c:
            if (r2 == r0) goto L11c
            int r3 = r2 >>> 10
            r4 = 55232(0xd7c0, float:7.7397E-41)
            int r3 = r3 + r4
            char r3 = (char) r3
            java.lang.Character r3 = java.lang.Character.valueOf(r3)
            r15.invoke(r3)
            r2 = r2 & 1023(0x3ff, float:1.434E-42)
            r3 = 56320(0xdc00, float:7.8921E-41)
            int r2 = r2 + r3
            char r2 = (char) r2
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            r15.invoke(r2)
            goto L11f
        L14b:
            r5 = 4
            goto L65
        L14e:
            r15.invoke(r1)
            kotlin.n1 r2 = kotlin.n1.a
            goto Lf3
        L154:
            r15.invoke(r1)
            kotlin.n1 r2 = kotlin.n1.a
            goto L65
        L15b:
            r15.invoke(r1)
            kotlin.n1 r2 = kotlin.n1.a
            goto L49
        L162:
            r15.invoke(r1)
            int r13 = r13 + 1
            goto L11
        L169:
            return
    }

    public static final void processUtf8Bytes(@org.jetbrains.annotations.NotNull java.lang.String r7, int r8, int r9, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Byte, kotlin.n1> r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "yield"
            kotlin.jvm.internal.g0.p(r10, r0)
        La:
            if (r8 >= r9) goto Lee
            char r0 = r7.charAt(r8)
            r1 = 128(0x80, float:1.8E-43)
            int r2 = kotlin.jvm.internal.g0.t(r0, r1)
            if (r2 >= 0) goto L3e
            byte r0 = (byte) r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r10.invoke(r0)
            int r8 = r8 + 1
        L22:
            if (r8 >= r9) goto La
            char r0 = r7.charAt(r8)
            int r0 = kotlin.jvm.internal.g0.t(r0, r1)
            if (r0 >= 0) goto La
            int r0 = r8 + 1
            char r8 = r7.charAt(r8)
            byte r8 = (byte) r8
            java.lang.Byte r8 = java.lang.Byte.valueOf(r8)
            r10.invoke(r8)
            r8 = r0
            goto L22
        L3e:
            r2 = 2048(0x800, float:2.87E-42)
            int r2 = kotlin.jvm.internal.g0.t(r0, r2)
            if (r2 >= 0) goto L60
            int r2 = r0 >> 6
            r2 = r2 | 192(0xc0, float:2.69E-43)
            byte r2 = (byte) r2
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            r10.invoke(r2)
            r0 = r0 & 63
            r0 = r0 | r1
            byte r0 = (byte) r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r10.invoke(r0)
        L5d:
            int r8 = r8 + 1
            goto La
        L60:
            r2 = 55296(0xd800, float:7.7486E-41)
            r3 = 63
            if (r2 > r0) goto Lc9
            r2 = 57344(0xe000, float:8.0356E-41)
            if (r0 >= r2) goto Lc9
            r4 = 56319(0xdbff, float:7.892E-41)
            int r4 = kotlin.jvm.internal.g0.t(r0, r4)
            if (r4 > 0) goto Lc1
            int r4 = r8 + 1
            if (r9 <= r4) goto Lc1
            char r5 = r7.charAt(r4)
            r6 = 56320(0xdc00, float:7.8921E-41)
            if (r6 > r5) goto Lc1
            if (r5 >= r2) goto Lc1
            int r0 = r0 << 10
            char r2 = r7.charAt(r4)
            int r0 = r0 + r2
            r2 = -56613888(0xfffffffffca02400, float:-6.651981E36)
            int r0 = r0 + r2
            int r2 = r0 >> 18
            r2 = r2 | 240(0xf0, float:3.36E-43)
            byte r2 = (byte) r2
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            r10.invoke(r2)
            int r2 = r0 >> 12
            r2 = r2 & r3
            r2 = r2 | r1
            byte r2 = (byte) r2
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            r10.invoke(r2)
            int r2 = r0 >> 6
            r2 = r2 & r3
            r2 = r2 | r1
            byte r2 = (byte) r2
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            r10.invoke(r2)
            r0 = r0 & r3
            r0 = r0 | r1
            byte r0 = (byte) r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r10.invoke(r0)
            int r8 = r8 + 2
            goto La
        Lc1:
            java.lang.Byte r0 = java.lang.Byte.valueOf(r3)
            r10.invoke(r0)
            goto L5d
        Lc9:
            int r2 = r0 >> 12
            r2 = r2 | 224(0xe0, float:3.14E-43)
            byte r2 = (byte) r2
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            r10.invoke(r2)
            int r2 = r0 >> 6
            r2 = r2 & r3
            r2 = r2 | r1
            byte r2 = (byte) r2
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            r10.invoke(r2)
            r0 = r0 & 63
            r0 = r0 | r1
            byte r0 = (byte) r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r10.invoke(r0)
            goto L5d
        Lee:
            return
    }

    public static final void processUtf8CodePoints(@org.jetbrains.annotations.NotNull byte[] r11, int r12, int r13, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.n1> r14) {
            r0 = 65533(0xfffd, float:9.1831E-41)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.g0.p(r11, r1)
            java.lang.String r1 = "yield"
            kotlin.jvm.internal.g0.p(r14, r1)
        L11:
            if (r12 >= r13) goto L13d
            r1 = r11[r12]
            if (r1 < 0) goto L30
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r14.invoke(r1)
            int r12 = r12 + 1
        L20:
            if (r12 >= r13) goto L11
            r1 = r11[r12]
            if (r1 < 0) goto L11
            int r12 = r12 + 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r14.invoke(r1)
            goto L20
        L30:
            int r2 = r1 >> 5
            r3 = -2
            r4 = 2
            r5 = 128(0x80, float:1.8E-43)
            r6 = 1
            if (r2 != r3) goto L61
            int r2 = r12 + 1
            if (r13 > r2) goto L44
        L3d:
            r14.invoke(r0)
            kotlin.n1 r1 = kotlin.n1.a
        L42:
            r4 = 1
            goto L5f
        L44:
            r2 = r11[r2]
            r3 = r2 & 192(0xc0, float:2.69E-43)
            if (r3 != r5) goto L3d
            r2 = r2 ^ 3968(0xf80, float:5.56E-42)
            int r1 = r1 << 6
            r1 = r1 ^ r2
            if (r1 >= r5) goto L57
            r14.invoke(r0)
        L54:
            kotlin.n1 r1 = kotlin.n1.a
            goto L5f
        L57:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r14.invoke(r1)
            goto L54
        L5f:
            int r12 = r12 + r4
            goto L11
        L61:
            int r2 = r1 >> 4
            r7 = 57344(0xe000, float:8.0356E-41)
            r8 = 55296(0xd800, float:7.7486E-41)
            r9 = 3
            if (r2 != r3) goto Lbd
            int r2 = r12 + 2
            if (r13 > r2) goto L80
            r14.invoke(r0)
            kotlin.n1 r1 = kotlin.n1.a
            int r1 = r12 + 1
            if (r13 <= r1) goto L42
            r1 = r11[r1]
            r1 = r1 & 192(0xc0, float:2.69E-43)
            if (r1 != r5) goto L42
            goto L5f
        L80:
            int r3 = r12 + 1
            r3 = r11[r3]
            r10 = r3 & 192(0xc0, float:2.69E-43)
            if (r10 != r5) goto Lb7
            r2 = r11[r2]
            r6 = r2 & 192(0xc0, float:2.69E-43)
            if (r6 != r5) goto Lb1
            r4 = -123008(0xfffffffffffe1f80, float:NaN)
            r2 = r2 ^ r4
            int r3 = r3 << 6
            r2 = r2 ^ r3
            int r1 = r1 << 12
            r1 = r1 ^ r2
            r2 = 2048(0x800, float:2.87E-42)
            if (r1 >= r2) goto La2
        L9c:
            r14.invoke(r0)
        L9f:
            kotlin.n1 r1 = kotlin.n1.a
            goto Laf
        La2:
            if (r8 > r1) goto La7
            if (r1 >= r7) goto La7
            goto L9c
        La7:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r14.invoke(r1)
            goto L9f
        Laf:
            r4 = 3
            goto L5f
        Lb1:
            r14.invoke(r0)
            kotlin.n1 r1 = kotlin.n1.a
            goto L5f
        Lb7:
            r14.invoke(r0)
            kotlin.n1 r1 = kotlin.n1.a
            goto L42
        Lbd:
            int r2 = r1 >> 3
            if (r2 != r3) goto L136
            int r2 = r12 + 3
            if (r13 > r2) goto Ldf
            r14.invoke(r0)
            kotlin.n1 r1 = kotlin.n1.a
            int r1 = r12 + 1
            if (r13 <= r1) goto L42
            r1 = r11[r1]
            r1 = r1 & 192(0xc0, float:2.69E-43)
            if (r1 != r5) goto L42
            int r1 = r12 + 2
            if (r13 <= r1) goto L5f
            r1 = r11[r1]
            r1 = r1 & 192(0xc0, float:2.69E-43)
            if (r1 != r5) goto L5f
        Lde:
            goto Laf
        Ldf:
            int r3 = r12 + 1
            r3 = r11[r3]
            r10 = r3 & 192(0xc0, float:2.69E-43)
            if (r10 != r5) goto L12f
            int r6 = r12 + 2
            r6 = r11[r6]
            r10 = r6 & 192(0xc0, float:2.69E-43)
            if (r10 != r5) goto L128
            r2 = r11[r2]
            r4 = r2 & 192(0xc0, float:2.69E-43)
            if (r4 != r5) goto L122
            r4 = 3678080(0x381f80, float:5.154088E-39)
            r2 = r2 ^ r4
            int r4 = r6 << 6
            r2 = r2 ^ r4
            int r3 = r3 << 12
            r2 = r2 ^ r3
            int r1 = r1 << 18
            r1 = r1 ^ r2
            r2 = 1114111(0x10ffff, float:1.561202E-39)
            if (r1 <= r2) goto L10d
        L107:
            r14.invoke(r0)
        L10a:
            kotlin.n1 r1 = kotlin.n1.a
            goto L11f
        L10d:
            if (r8 > r1) goto L112
            if (r1 >= r7) goto L112
            goto L107
        L112:
            r2 = 65536(0x10000, float:9.1835E-41)
            if (r1 >= r2) goto L117
            goto L107
        L117:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r14.invoke(r1)
            goto L10a
        L11f:
            r4 = 4
            goto L5f
        L122:
            r14.invoke(r0)
            kotlin.n1 r1 = kotlin.n1.a
            goto Lde
        L128:
            r14.invoke(r0)
            kotlin.n1 r1 = kotlin.n1.a
            goto L5f
        L12f:
            r14.invoke(r0)
            kotlin.n1 r1 = kotlin.n1.a
            goto L42
        L136:
            r14.invoke(r0)
            int r12 = r12 + 1
            goto L11
        L13d:
            return
    }

    @kotlin.jvm.JvmOverloads
    @kotlin.jvm.JvmName(name = "size")
    public static final long size(@org.jetbrains.annotations.NotNull java.lang.String r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 3
            r1 = 0
            r2 = 0
            long r0 = size$default(r3, r2, r2, r0, r1)
            return r0
    }

    @kotlin.jvm.JvmOverloads
    @kotlin.jvm.JvmName(name = "size")
    public static final long size(@org.jetbrains.annotations.NotNull java.lang.String r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 2
            r1 = 0
            r2 = 0
            long r3 = size$default(r3, r4, r2, r0, r1)
            return r3
    }

    @kotlin.jvm.JvmOverloads
    @kotlin.jvm.JvmName(name = "size")
    public static final long size(@org.jetbrains.annotations.NotNull java.lang.String r9, int r10, int r11) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r9, r0)
            if (r10 < 0) goto La1
            if (r11 < r10) goto L7e
            int r0 = r9.length()
            if (r11 > r0) goto L57
            r0 = 0
        L11:
            if (r10 >= r11) goto L56
            char r2 = r9.charAt(r10)
            r3 = 128(0x80, float:1.8E-43)
            r4 = 1
            if (r2 >= r3) goto L21
            long r0 = r0 + r4
        L1e:
            int r10 = r10 + 1
            goto L11
        L21:
            r3 = 2048(0x800, float:2.87E-42)
            if (r2 >= r3) goto L29
            r2 = 2
        L26:
            long r2 = (long) r2
            long r0 = r0 + r2
            goto L1e
        L29:
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r2 < r3) goto L54
            r3 = 57343(0xdfff, float:8.0355E-41)
            if (r2 <= r3) goto L34
            goto L54
        L34:
            int r6 = r10 + 1
            if (r6 >= r11) goto L3d
            char r7 = r9.charAt(r6)
            goto L3e
        L3d:
            r7 = 0
        L3e:
            r8 = 56319(0xdbff, float:7.892E-41)
            if (r2 > r8) goto L51
            r2 = 56320(0xdc00, float:7.8921E-41)
            if (r7 < r2) goto L51
            if (r7 <= r3) goto L4b
            goto L51
        L4b:
            r2 = 4
            long r2 = (long) r2
            long r0 = r0 + r2
            int r10 = r10 + 2
            goto L11
        L51:
            long r0 = r0 + r4
            r10 = r6
            goto L11
        L54:
            r2 = 3
            goto L26
        L56:
            return r0
        L57:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "endIndex > string.length: "
            r10.append(r0)
            r10.append(r11)
            java.lang.String r11 = " > "
            r10.append(r11)
            int r9 = r9.length()
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        L7e:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "endIndex < beginIndex: "
            r9.append(r0)
            r9.append(r11)
            java.lang.String r11 = " < "
            r9.append(r11)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        La1:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "beginIndex < 0: "
            r9.append(r11)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
    }

    public static /* synthetic */ long size$default(java.lang.String r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Ld
            int r2 = r0.length()
        Ld:
            long r0 = size(r0, r1, r2)
            return r0
    }
}
