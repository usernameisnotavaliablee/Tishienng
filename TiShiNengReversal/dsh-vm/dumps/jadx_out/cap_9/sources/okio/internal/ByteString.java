package okio.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.JvmName(name = "-ByteString")
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteString.kt\nokio/internal/-ByteString\n+ 2 Util.kt\nokio/-SegmentedByteString\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Utf8.kt\nokio/Utf8\n*L\n1#1,342:1\n129#1,2:348\n131#1,9:351\n67#2:343\n73#2:344\n73#2:346\n73#2:347\n67#2:375\n73#2:387\n1#3:345\n1#3:350\n212#4,7:360\n122#4:367\n219#4,5:368\n122#4:373\n226#4:374\n228#4:376\n397#4,2:377\n122#4:379\n400#4,6:380\n127#4:386\n406#4:388\n122#4:389\n407#4,13:390\n122#4:403\n422#4:404\n122#4:405\n425#4:406\n230#4,3:407\n440#4,3:410\n122#4:413\n443#4:414\n127#4:415\n446#4,10:416\n127#4:426\n456#4:427\n122#4:428\n457#4,4:429\n127#4:433\n461#4:434\n122#4:435\n462#4,14:436\n122#4:450\n477#4,2:451\n122#4:453\n481#4:454\n122#4:455\n484#4:456\n234#4,3:457\n500#4,3:460\n122#4:463\n503#4:464\n127#4:465\n506#4,2:466\n127#4:468\n510#4,10:469\n127#4:479\n520#4:480\n122#4:481\n521#4,4:482\n127#4:486\n525#4:487\n122#4:488\n526#4,4:489\n127#4:493\n530#4:494\n122#4:495\n531#4,15:496\n122#4:511\n547#4,2:512\n122#4:514\n550#4,2:515\n122#4:517\n554#4:518\n122#4:519\n557#4:520\n241#4:521\n122#4:522\n242#4,5:523\n*S KotlinDebug\n*F\n+ 1 ByteString.kt\nokio/internal/-ByteString\n*L\n308#1:348,2\n308#1:351,9\n65#1:343\n66#1:344\n256#1:346\n257#1:347\n327#1:375\n327#1:387\n308#1:350\n327#1:360,7\n332#1:367\n327#1:368,5\n332#1:373\n327#1:374\n327#1:376\n327#1:377,2\n332#1:379\n327#1:380,6\n327#1:386\n327#1:388\n332#1:389\n327#1:390,13\n332#1:403\n327#1:404\n332#1:405\n327#1:406\n327#1:407,3\n327#1:410,3\n332#1:413\n327#1:414\n327#1:415\n327#1:416,10\n327#1:426\n327#1:427\n332#1:428\n327#1:429,4\n327#1:433\n327#1:434\n332#1:435\n327#1:436,14\n332#1:450\n327#1:451,2\n332#1:453\n327#1:454\n332#1:455\n327#1:456\n327#1:457,3\n327#1:460,3\n332#1:463\n327#1:464\n327#1:465\n327#1:466,2\n327#1:468\n327#1:469,10\n327#1:479\n327#1:480\n332#1:481\n327#1:482,4\n327#1:486\n327#1:487\n332#1:488\n327#1:489,4\n327#1:493\n327#1:494\n332#1:495\n327#1:496,15\n332#1:511\n327#1:512,2\n332#1:514\n327#1:515,2\n332#1:517\n327#1:518\n332#1:519\n327#1:520\n327#1:521\n332#1:522\n327#1:523,5\n*E\n"})
/* renamed from: okio.internal.-ByteString, reason: invalid class name */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class ByteString {

    @org.jetbrains.annotations.NotNull
    private static final char[] HEX_DIGIT_CHARS = null;

    static {
            r0 = 16
            char[] r0 = new char[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102} // fill-array
            okio.internal.ByteString.HEX_DIGIT_CHARS = r0
            return
    }

    public ByteString() {
            r1 = this;
            r1.<init>()
            return
    }

    public static final /* synthetic */ int access$codePointIndexToCharIndex(byte[] r0, int r1) {
            int r0 = codePointIndexToCharIndex(r0, r1)
            return r0
    }

    private static final int codePointIndexToCharIndex(byte[] r18, int r19) {
            r0 = r18
            r1 = r19
            int r2 = r0.length
            r3 = 0
            r4 = 0
            r5 = 0
        L8:
            if (r3 >= r2) goto L1af
            r6 = r0[r3]
            r7 = 65533(0xfffd, float:9.1831E-41)
            r8 = 160(0xa0, float:2.24E-43)
            r9 = 127(0x7f, float:1.78E-43)
            r10 = 32
            r11 = 13
            r12 = 10
            r13 = 65536(0x10000, float:9.1835E-41)
            r16 = -1
            if (r6 < 0) goto L68
            int r17 = r5 + 1
            if (r5 != r1) goto L25
            goto L1af
        L25:
            if (r6 == r12) goto L33
            if (r6 == r11) goto L33
            if (r6 < 0) goto L2e
            if (r6 >= r10) goto L2e
            goto L35
        L2e:
            if (r9 > r6) goto L33
            if (r6 >= r8) goto L33
            goto L35
        L33:
            if (r6 != r7) goto L36
        L35:
            return r16
        L36:
            if (r6 >= r13) goto L3a
            r5 = 1
            goto L3b
        L3a:
            r5 = 2
        L3b:
            int r4 = r4 + r5
            int r3 = r3 + 1
        L3e:
            r5 = r17
            if (r3 >= r2) goto L65
            r6 = r0[r3]
            if (r6 < 0) goto L65
            int r3 = r3 + 1
            int r17 = r5 + 1
            if (r5 != r1) goto L4d
            return r4
        L4d:
            if (r6 == r12) goto L5b
            if (r6 == r11) goto L5b
            if (r6 < 0) goto L56
            if (r6 >= r10) goto L56
            goto L5d
        L56:
            if (r9 > r6) goto L5b
            if (r6 >= r8) goto L5b
            goto L5d
        L5b:
            if (r6 != r7) goto L5e
        L5d:
            return r16
        L5e:
            if (r6 >= r13) goto L62
            r5 = 1
            goto L63
        L62:
            r5 = 2
        L63:
            int r4 = r4 + r5
            goto L3e
        L65:
            kotlin.n1 r6 = kotlin.n1.a
            goto L8
        L68:
            int r14 = r6 >> 5
            r15 = -2
            r13 = 128(0x80, float:1.8E-43)
            if (r14 != r15) goto Lb5
            int r14 = r3 + 1
            if (r2 > r14) goto L78
            if (r5 != r1) goto L77
            goto L1af
        L77:
            return r16
        L78:
            r14 = r0[r14]
            r15 = r14 & 192(0xc0, float:2.69E-43)
            if (r15 != r13) goto Lb0
            r14 = r14 ^ 3968(0xf80, float:5.56E-42)
            int r6 = r6 << 6
            r6 = r6 ^ r14
            if (r6 >= r13) goto L8a
            if (r5 != r1) goto L89
            goto L1af
        L89:
            return r16
        L8a:
            int r13 = r5 + 1
            if (r5 != r1) goto L90
            goto L1af
        L90:
            if (r6 == r12) goto L9e
            if (r6 == r11) goto L9e
            if (r6 < 0) goto L99
            if (r6 >= r10) goto L99
            goto La0
        L99:
            if (r9 > r6) goto L9e
            if (r6 >= r8) goto L9e
            goto La0
        L9e:
            if (r6 != r7) goto La1
        La0:
            return r16
        La1:
            r5 = 65536(0x10000, float:9.1835E-41)
            if (r6 >= r5) goto La7
            r14 = 1
            goto La8
        La7:
            r14 = 2
        La8:
            int r4 = r4 + r14
            kotlin.n1 r5 = kotlin.n1.a
            int r3 = r3 + 2
            r5 = r13
            goto L8
        Lb0:
            if (r5 != r1) goto Lb4
            goto L1af
        Lb4:
            return r16
        Lb5:
            int r14 = r6 >> 4
            r7 = 57344(0xe000, float:8.0356E-41)
            r8 = 55296(0xd800, float:7.7486E-41)
            if (r14 != r15) goto L129
            int r14 = r3 + 2
            if (r2 > r14) goto Lc8
            if (r5 != r1) goto Lc7
            goto L1af
        Lc7:
            return r16
        Lc8:
            int r15 = r3 + 1
            r15 = r0[r15]
            r9 = r15 & 192(0xc0, float:2.69E-43)
            if (r9 != r13) goto L124
            r9 = r0[r14]
            r14 = r9 & 192(0xc0, float:2.69E-43)
            if (r14 != r13) goto L11f
            r13 = -123008(0xfffffffffffe1f80, float:NaN)
            r9 = r9 ^ r13
            int r13 = r15 << 6
            r9 = r9 ^ r13
            int r6 = r6 << 12
            r6 = r6 ^ r9
            r9 = 2048(0x800, float:2.87E-42)
            if (r6 >= r9) goto Le9
            if (r5 != r1) goto Le8
            goto L1af
        Le8:
            return r16
        Le9:
            if (r8 > r6) goto Lf2
            if (r6 >= r7) goto Lf2
            if (r5 != r1) goto Lf1
            goto L1af
        Lf1:
            return r16
        Lf2:
            int r7 = r5 + 1
            if (r5 != r1) goto Lf8
            goto L1af
        Lf8:
            if (r6 == r12) goto L10a
            if (r6 == r11) goto L10a
            if (r6 < 0) goto L101
            if (r6 >= r10) goto L101
            goto L10f
        L101:
            r5 = 127(0x7f, float:1.78E-43)
            if (r5 > r6) goto L10a
            r5 = 160(0xa0, float:2.24E-43)
            if (r6 >= r5) goto L10a
            goto L10f
        L10a:
            r5 = 65533(0xfffd, float:9.1831E-41)
            if (r6 != r5) goto L110
        L10f:
            return r16
        L110:
            r5 = 65536(0x10000, float:9.1835E-41)
            if (r6 >= r5) goto L116
            r14 = 1
            goto L117
        L116:
            r14 = 2
        L117:
            int r4 = r4 + r14
            kotlin.n1 r5 = kotlin.n1.a
            int r3 = r3 + 3
        L11c:
            r5 = r7
            goto L8
        L11f:
            if (r5 != r1) goto L123
            goto L1af
        L123:
            return r16
        L124:
            if (r5 != r1) goto L128
            goto L1af
        L128:
            return r16
        L129:
            int r9 = r6 >> 3
            if (r9 != r15) goto L1ab
            int r9 = r3 + 3
            if (r2 > r9) goto L136
            if (r5 != r1) goto L135
            goto L1af
        L135:
            return r16
        L136:
            int r14 = r3 + 1
            r14 = r0[r14]
            r15 = r14 & 192(0xc0, float:2.69E-43)
            if (r15 != r13) goto L1a7
            int r15 = r3 + 2
            r15 = r0[r15]
            r10 = r15 & 192(0xc0, float:2.69E-43)
            if (r10 != r13) goto L1a3
            r9 = r0[r9]
            r10 = r9 & 192(0xc0, float:2.69E-43)
            if (r10 != r13) goto L19f
            r10 = 3678080(0x381f80, float:5.154088E-39)
            r9 = r9 ^ r10
            int r10 = r15 << 6
            r9 = r9 ^ r10
            int r10 = r14 << 12
            r9 = r9 ^ r10
            int r6 = r6 << 18
            r6 = r6 ^ r9
            r9 = 1114111(0x10ffff, float:1.561202E-39)
            if (r6 <= r9) goto L162
            if (r5 != r1) goto L161
            goto L1af
        L161:
            return r16
        L162:
            if (r8 > r6) goto L16a
            if (r6 >= r7) goto L16a
            if (r5 != r1) goto L169
            goto L1af
        L169:
            return r16
        L16a:
            r7 = 65536(0x10000, float:9.1835E-41)
            if (r6 >= r7) goto L172
            if (r5 != r1) goto L171
            goto L1af
        L171:
            return r16
        L172:
            int r7 = r5 + 1
            if (r5 != r1) goto L177
            goto L1af
        L177:
            if (r6 == r12) goto L18b
            if (r6 == r11) goto L18b
            if (r6 < 0) goto L182
            r5 = 32
            if (r6 >= r5) goto L182
            goto L190
        L182:
            r5 = 127(0x7f, float:1.78E-43)
            if (r5 > r6) goto L18b
            r5 = 160(0xa0, float:2.24E-43)
            if (r6 >= r5) goto L18b
            goto L190
        L18b:
            r5 = 65533(0xfffd, float:9.1831E-41)
            if (r6 != r5) goto L191
        L190:
            return r16
        L191:
            r5 = 65536(0x10000, float:9.1835E-41)
            if (r6 >= r5) goto L197
            r14 = 1
            goto L198
        L197:
            r14 = 2
        L198:
            int r4 = r4 + r14
            kotlin.n1 r5 = kotlin.n1.a
            int r3 = r3 + 4
            goto L11c
        L19f:
            if (r5 != r1) goto L1a2
            goto L1af
        L1a2:
            return r16
        L1a3:
            if (r5 != r1) goto L1a6
            goto L1af
        L1a6:
            return r16
        L1a7:
            if (r5 != r1) goto L1aa
            goto L1af
        L1aa:
            return r16
        L1ab:
            if (r5 != r1) goto L1ae
            goto L1af
        L1ae:
            return r16
        L1af:
            return r4
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String commonBase64(@org.jetbrains.annotations.NotNull okio.ByteString r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            byte[] r2 = r2.getData$okio()
            r0 = 0
            r1 = 1
            java.lang.String r2 = okio.Base64.encodeBase64$default(r2, r0, r1, r0)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String commonBase64Url(@org.jetbrains.annotations.NotNull okio.ByteString r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            byte[] r1 = r1.getData$okio()
            byte[] r0 = okio.Base64.getBASE64_URL_SAFE()
            java.lang.String r1 = okio.Base64.encodeBase64(r1, r0)
            return r1
    }

    public static final int commonCompareTo(@org.jetbrains.annotations.NotNull okio.ByteString r9, @org.jetbrains.annotations.NotNull okio.ByteString r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r10, r0)
            int r0 = r9.size()
            int r1 = r10.size()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = 0
        L18:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L31
            byte r7 = r9.getByte(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.getByte(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L2d
            int r4 = r4 + 1
            goto L18
        L2d:
            if (r7 >= r8) goto L30
            return r5
        L30:
            return r6
        L31:
            if (r0 != r1) goto L34
            return r3
        L34:
            if (r0 >= r1) goto L37
            return r5
        L37:
            return r6
    }

    public static final void commonCopyInto(@org.jetbrains.annotations.NotNull okio.ByteString r1, int r2, @org.jetbrains.annotations.NotNull byte[] r3, int r4, int r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.g0.p(r3, r0)
            byte[] r1 = r1.getData$okio()
            int r5 = r5 + r2
            kotlin.collections.n.v0(r1, r3, r4, r2, r5)
            return
    }

    @org.jetbrains.annotations.Nullable
    public static final okio.ByteString commonDecodeBase64(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            byte[] r1 = okio.Base64.decodeBase64ToArray(r1)
            if (r1 == 0) goto L11
            okio.ByteString r0 = new okio.ByteString
            r0.<init>(r1)
            return r0
        L11:
            r1 = 0
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.ByteString commonEncodeUtf8(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            okio.ByteString r0 = new okio.ByteString
            byte[] r1 = okio._JvmPlatformKt.asUtf8ToByteArray(r2)
            r0.<init>(r1)
            r0.setUtf8$okio(r2)
            return r0
    }

    public static final boolean commonEndsWith(@org.jetbrains.annotations.NotNull okio.ByteString r3, @org.jetbrains.annotations.NotNull okio.ByteString r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "suffix"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r3.size()
            int r1 = r4.size()
            int r0 = r0 - r1
            r1 = 0
            int r2 = r4.size()
            boolean r3 = r3.rangeEquals(r0, r4, r1, r2)
            return r3
    }

    public static final boolean commonEndsWith(@org.jetbrains.annotations.NotNull okio.ByteString r3, @org.jetbrains.annotations.NotNull byte[] r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "suffix"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r3.size()
            int r1 = r4.length
            int r0 = r0 - r1
            r1 = 0
            int r2 = r4.length
            boolean r3 = r3.rangeEquals(r0, r4, r1, r2)
            return r3
    }

    public static final boolean commonEquals(@org.jetbrains.annotations.NotNull okio.ByteString r4, @org.jetbrains.annotations.Nullable java.lang.Object r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            r0 = 1
            if (r5 != r4) goto L9
            return r0
        L9:
            boolean r1 = r5 instanceof okio.ByteString
            r2 = 0
            if (r1 == 0) goto L2b
            okio.ByteString r5 = (okio.ByteString) r5
            int r1 = r5.size()
            byte[] r3 = r4.getData$okio()
            int r3 = r3.length
            if (r1 != r3) goto L2b
            byte[] r1 = r4.getData$okio()
            byte[] r4 = r4.getData$okio()
            int r4 = r4.length
            boolean r4 = r5.rangeEquals(r2, r1, r2, r4)
            if (r4 == 0) goto L2b
            return r0
        L2b:
            return r2
    }

    public static final byte commonGetByte(@org.jetbrains.annotations.NotNull okio.ByteString r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            byte[] r1 = r1.getData$okio()
            r1 = r1[r2]
            return r1
    }

    public static final int commonGetSize(@org.jetbrains.annotations.NotNull okio.ByteString r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            byte[] r1 = r1.getData$okio()
            int r1 = r1.length
            return r1
    }

    public static final int commonHashCode(@org.jetbrains.annotations.NotNull okio.ByteString r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r0 = r1.getHashCode$okio()
            if (r0 == 0) goto Lc
            return r0
        Lc:
            byte[] r0 = r1.getData$okio()
            int r0 = java.util.Arrays.hashCode(r0)
            r1.setHashCode$okio(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String commonHex(@org.jetbrains.annotations.NotNull okio.ByteString r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r8, r0)
            byte[] r0 = r8.getData$okio()
            int r0 = r0.length
            int r0 = r0 * 2
            char[] r0 = new char[r0]
            byte[] r8 = r8.getData$okio()
            int r1 = r8.length
            r2 = 0
            r3 = 0
        L15:
            if (r2 >= r1) goto L36
            r4 = r8[r2]
            int r5 = r3 + 1
            char[] r6 = getHEX_DIGIT_CHARS()
            int r7 = r4 >> 4
            r7 = r7 & 15
            char r6 = r6[r7]
            r0[r3] = r6
            int r3 = r3 + 2
            char[] r6 = getHEX_DIGIT_CHARS()
            r4 = r4 & 15
            char r4 = r6[r4]
            r0[r5] = r4
            int r2 = r2 + 1
            goto L15
        L36:
            java.lang.String r8 = kotlin.text.u.J1(r0)
            return r8
    }

    public static final int commonIndexOf(@org.jetbrains.annotations.NotNull okio.ByteString r4, @org.jetbrains.annotations.NotNull byte[] r5, int r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r5, r0)
            byte[] r0 = r4.getData$okio()
            int r0 = r0.length
            int r1 = r5.length
            int r0 = r0 - r1
            r1 = 0
            int r6 = java.lang.Math.max(r6, r1)
            if (r6 > r0) goto L29
        L18:
            byte[] r2 = r4.getData$okio()
            int r3 = r5.length
            boolean r2 = okio.SegmentedByteString.arrayRangeEquals(r2, r6, r5, r1, r3)
            if (r2 == 0) goto L24
            return r6
        L24:
            if (r6 == r0) goto L29
            int r6 = r6 + 1
            goto L18
        L29:
            r4 = -1
            return r4
    }

    @org.jetbrains.annotations.NotNull
    public static final byte[] commonInternalArray(@org.jetbrains.annotations.NotNull okio.ByteString r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            byte[] r1 = r1.getData$okio()
            return r1
    }

    public static final int commonLastIndexOf(@org.jetbrains.annotations.NotNull okio.ByteString r1, @org.jetbrains.annotations.NotNull okio.ByteString r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r2, r0)
            byte[] r2 = r2.internalArray$okio()
            int r1 = r1.lastIndexOf(r2, r3)
            return r1
    }

    public static final int commonLastIndexOf(@org.jetbrains.annotations.NotNull okio.ByteString r3, @org.jetbrains.annotations.NotNull byte[] r4, int r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r5 = okio.SegmentedByteString.resolveDefaultParameter(r3, r5)
            byte[] r0 = r3.getData$okio()
            int r0 = r0.length
            int r1 = r4.length
            int r0 = r0 - r1
            int r5 = java.lang.Math.min(r5, r0)
        L19:
            r0 = -1
            if (r0 >= r5) goto L2c
            byte[] r0 = r3.getData$okio()
            r1 = 0
            int r2 = r4.length
            boolean r0 = okio.SegmentedByteString.arrayRangeEquals(r0, r5, r4, r1, r2)
            if (r0 == 0) goto L29
            return r5
        L29:
            int r5 = r5 + (-1)
            goto L19
        L2c:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.ByteString commonOf(@org.jetbrains.annotations.NotNull byte[] r2) {
            java.lang.String r0 = "data"
            kotlin.jvm.internal.g0.p(r2, r0)
            okio.ByteString r0 = new okio.ByteString
            int r1 = r2.length
            byte[] r2 = java.util.Arrays.copyOf(r2, r1)
            java.lang.String r1 = "copyOf(...)"
            kotlin.jvm.internal.g0.o(r2, r1)
            r0.<init>(r2)
            return r0
    }

    public static final boolean commonRangeEquals(@org.jetbrains.annotations.NotNull okio.ByteString r1, int r2, @org.jetbrains.annotations.NotNull okio.ByteString r3, int r4, int r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r3, r0)
            byte[] r1 = r1.getData$okio()
            boolean r1 = r3.rangeEquals(r4, r1, r2, r5)
            return r1
    }

    public static final boolean commonRangeEquals(@org.jetbrains.annotations.NotNull okio.ByteString r1, int r2, @org.jetbrains.annotations.NotNull byte[] r3, int r4, int r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r3, r0)
            if (r2 < 0) goto L26
            byte[] r0 = r1.getData$okio()
            int r0 = r0.length
            int r0 = r0 - r5
            if (r2 > r0) goto L26
            if (r4 < 0) goto L26
            int r0 = r3.length
            int r0 = r0 - r5
            if (r4 > r0) goto L26
            byte[] r1 = r1.getData$okio()
            boolean r1 = okio.SegmentedByteString.arrayRangeEquals(r1, r2, r3, r4, r5)
            if (r1 == 0) goto L26
            r1 = 1
            return r1
        L26:
            r1 = 0
            return r1
    }

    public static final boolean commonStartsWith(@org.jetbrains.annotations.NotNull okio.ByteString r2, @org.jetbrains.annotations.NotNull okio.ByteString r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 0
            int r1 = r3.size()
            boolean r2 = r2.rangeEquals(r0, r3, r0, r1)
            return r2
    }

    public static final boolean commonStartsWith(@org.jetbrains.annotations.NotNull okio.ByteString r2, @org.jetbrains.annotations.NotNull byte[] r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 0
            int r1 = r3.length
            boolean r2 = r2.rangeEquals(r0, r3, r0, r1)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.ByteString commonSubstring(@org.jetbrains.annotations.NotNull okio.ByteString r1, int r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r3 = okio.SegmentedByteString.resolveDefaultParameter(r1, r3)
            if (r2 < 0) goto L5b
            byte[] r0 = r1.getData$okio()
            int r0 = r0.length
            if (r3 > r0) goto L36
            int r0 = r3 - r2
            if (r0 < 0) goto L2e
            if (r2 != 0) goto L20
            byte[] r0 = r1.getData$okio()
            int r0 = r0.length
            if (r3 != r0) goto L20
            return r1
        L20:
            okio.ByteString r0 = new okio.ByteString
            byte[] r1 = r1.getData$okio()
            byte[] r1 = kotlin.collections.n.f1(r1, r2, r3)
            r0.<init>(r1)
            return r0
        L2e:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "endIndex < beginIndex"
            r1.<init>(r2)
            throw r1
        L36:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "endIndex > length("
            r2.append(r3)
            byte[] r1 = r1.getData$okio()
            int r1 = r1.length
            r2.append(r1)
            r1 = 41
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L5b:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "beginIndex < 0"
            r1.<init>(r2)
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.ByteString commonToAsciiLowercase(@org.jetbrains.annotations.NotNull okio.ByteString r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            r0 = 0
        L6:
            byte[] r1 = r5.getData$okio()
            int r1 = r1.length
            if (r0 >= r1) goto L4c
            byte[] r1 = r5.getData$okio()
            r1 = r1[r0]
            r2 = 65
            if (r1 < r2) goto L49
            r3 = 90
            if (r1 <= r3) goto L1c
            goto L49
        L1c:
            byte[] r5 = r5.getData$okio()
            int r4 = r5.length
            byte[] r5 = java.util.Arrays.copyOf(r5, r4)
            java.lang.String r4 = "copyOf(...)"
            kotlin.jvm.internal.g0.o(r5, r4)
            int r4 = r0 + 1
            int r1 = r1 + 32
            byte r1 = (byte) r1
            r5[r0] = r1
        L31:
            int r0 = r5.length
            if (r4 >= r0) goto L43
            r0 = r5[r4]
            if (r0 < r2) goto L40
            if (r0 <= r3) goto L3b
            goto L40
        L3b:
            int r0 = r0 + 32
            byte r0 = (byte) r0
            r5[r4] = r0
        L40:
            int r4 = r4 + 1
            goto L31
        L43:
            okio.ByteString r0 = new okio.ByteString
            r0.<init>(r5)
            return r0
        L49:
            int r0 = r0 + 1
            goto L6
        L4c:
            return r5
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.ByteString commonToAsciiUppercase(@org.jetbrains.annotations.NotNull okio.ByteString r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            r0 = 0
        L6:
            byte[] r1 = r5.getData$okio()
            int r1 = r1.length
            if (r0 >= r1) goto L4c
            byte[] r1 = r5.getData$okio()
            r1 = r1[r0]
            r2 = 97
            if (r1 < r2) goto L49
            r3 = 122(0x7a, float:1.71E-43)
            if (r1 <= r3) goto L1c
            goto L49
        L1c:
            byte[] r5 = r5.getData$okio()
            int r4 = r5.length
            byte[] r5 = java.util.Arrays.copyOf(r5, r4)
            java.lang.String r4 = "copyOf(...)"
            kotlin.jvm.internal.g0.o(r5, r4)
            int r4 = r0 + 1
            int r1 = r1 + (-32)
            byte r1 = (byte) r1
            r5[r0] = r1
        L31:
            int r0 = r5.length
            if (r4 >= r0) goto L43
            r0 = r5[r4]
            if (r0 < r2) goto L40
            if (r0 <= r3) goto L3b
            goto L40
        L3b:
            int r0 = r0 + (-32)
            byte r0 = (byte) r0
            r5[r4] = r0
        L40:
            int r4 = r4 + 1
            goto L31
        L43:
            okio.ByteString r0 = new okio.ByteString
            r0.<init>(r5)
            return r0
        L49:
            int r0 = r0 + 1
            goto L6
        L4c:
            return r5
    }

    @org.jetbrains.annotations.NotNull
    public static final byte[] commonToByteArray(@org.jetbrains.annotations.NotNull okio.ByteString r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            byte[] r1 = r1.getData$okio()
            int r0 = r1.length
            byte[] r1 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String r0 = "copyOf(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.ByteString commonToByteString(@org.jetbrains.annotations.NotNull byte[] r7, int r8, int r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            int r9 = okio.SegmentedByteString.resolveDefaultParameter(r7, r9)
            int r0 = r7.length
            long r1 = (long) r0
            long r3 = (long) r8
            long r5 = (long) r9
            okio.SegmentedByteString.checkOffsetAndCount(r1, r3, r5)
            okio.ByteString r0 = new okio.ByteString
            int r9 = r9 + r8
            byte[] r7 = kotlin.collections.n.f1(r7, r8, r9)
            r0.<init>(r7)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String commonToString(@org.jetbrains.annotations.NotNull okio.ByteString r20) {
            r0 = r20
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.g0.p(r0, r1)
            byte[] r1 = r0.getData$okio()
            int r1 = r1.length
            if (r1 != 0) goto L11
            java.lang.String r0 = "[size=0]"
            return r0
        L11:
            byte[] r1 = r0.getData$okio()
            r2 = 64
            int r1 = access$codePointIndexToCharIndex(r1, r2)
            r3 = -1
            java.lang.String r4 = "…]"
            r5 = 0
            java.lang.String r6 = "[size="
            r7 = 93
            if (r1 != r3) goto Lb9
            byte[] r1 = r0.getData$okio()
            int r1 = r1.length
            if (r1 > r2) goto L45
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[hex="
            r1.append(r2)
            java.lang.String r0 = r0.hex()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = r1.toString()
            return r0
        L45:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            byte[] r3 = r0.getData$okio()
            int r3 = r3.length
            r1.append(r3)
            java.lang.String r3 = " hex="
            r1.append(r3)
            int r2 = okio.SegmentedByteString.resolveDefaultParameter(r0, r2)
            byte[] r3 = r0.getData$okio()
            int r3 = r3.length
            if (r2 > r3) goto L94
            if (r2 < 0) goto L8c
            byte[] r3 = r0.getData$okio()
            int r3 = r3.length
            if (r2 != r3) goto L6f
            goto L7d
        L6f:
            okio.ByteString r3 = new okio.ByteString
            byte[] r0 = r0.getData$okio()
            byte[] r0 = kotlin.collections.n.f1(r0, r5, r2)
            r3.<init>(r0)
            r0 = r3
        L7d:
            java.lang.String r0 = r0.hex()
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            return r0
        L8c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "endIndex < beginIndex"
            r0.<init>(r1)
            throw r0
        L94:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "endIndex > length("
            r1.append(r2)
            byte[] r0 = r0.getData$okio()
            int r0 = r0.length
            r1.append(r0)
            r0 = 41
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        Lb9:
            java.lang.String r2 = r0.utf8()
            java.lang.String r8 = r2.substring(r5, r1)
            java.lang.String r3 = "substring(...)"
            kotlin.jvm.internal.g0.o(r8, r3)
            r12 = 4
            r13 = 0
            java.lang.String r9 = "\\"
            java.lang.String r10 = "\\\\"
            r11 = 0
            java.lang.String r14 = kotlin.text.u.x2(r8, r9, r10, r11, r12, r13)
            r18 = 4
            r19 = 0
            java.lang.String r15 = "\n"
            java.lang.String r16 = "\\n"
            r17 = 0
            java.lang.String r8 = kotlin.text.u.x2(r14, r15, r16, r17, r18, r19)
            java.lang.String r9 = "\r"
            java.lang.String r10 = "\\r"
            java.lang.String r3 = kotlin.text.u.x2(r8, r9, r10, r11, r12, r13)
            int r2 = r2.length()
            if (r1 >= r2) goto L10d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            byte[] r0 = r0.getData$okio()
            int r0 = r0.length
            r1.append(r0)
            java.lang.String r0 = " text="
            r1.append(r0)
            r1.append(r3)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            return r0
        L10d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[text="
            r0.append(r1)
            r0.append(r3)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String commonUtf8(@org.jetbrains.annotations.NotNull okio.ByteString r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = r1.getUtf8$okio()
            if (r0 != 0) goto L16
            byte[] r0 = r1.internalArray$okio()
            java.lang.String r0 = okio._JvmPlatformKt.toUtf8String(r0)
            r1.setUtf8$okio(r0)
        L16:
            return r0
    }

    public static final void commonWrite(@org.jetbrains.annotations.NotNull okio.ByteString r1, @org.jetbrains.annotations.NotNull okio.Buffer r2, int r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "buffer"
            kotlin.jvm.internal.g0.p(r2, r0)
            byte[] r1 = r1.getData$okio()
            r2.write(r1, r3, r4)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final char[] getHEX_DIGIT_CHARS() {
            char[] r0 = okio.internal.ByteString.HEX_DIGIT_CHARS
            return r0
    }
}
