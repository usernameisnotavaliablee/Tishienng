package okio.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\n-Utf8.kt\nKotlin\n*S Kotlin\n*F\n+ 1 -Utf8.kt\nokio/internal/_Utf8Kt\n+ 2 Utf8.kt\nokio/Utf8\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,60:1\n260#2,16:61\n277#2:78\n397#2,9:79\n127#2:88\n406#2,20:90\n279#2,3:110\n440#2,4:113\n127#2:117\n446#2,10:118\n127#2:128\n456#2,5:129\n127#2:134\n461#2,24:135\n283#2,3:159\n500#2,3:162\n286#2,12:165\n503#2:177\n127#2:178\n506#2,2:179\n127#2:181\n510#2,10:182\n127#2:192\n520#2,5:193\n127#2:198\n525#2,5:199\n127#2:204\n530#2,28:205\n302#2,6:233\n138#2,67:239\n67#3:77\n73#3:89\n*S KotlinDebug\n*F\n+ 1 -Utf8.kt\nokio/internal/_Utf8Kt\n*L\n34#1:61,16\n34#1:78\n34#1:79,9\n34#1:88\n34#1:90,20\n34#1:110,3\n34#1:113,4\n34#1:117\n34#1:118,10\n34#1:128\n34#1:129,5\n34#1:134\n34#1:135,24\n34#1:159,3\n34#1:162,3\n34#1:165,12\n34#1:177\n34#1:178\n34#1:179,2\n34#1:181\n34#1:182,10\n34#1:192\n34#1:193,5\n34#1:198\n34#1:199,5\n34#1:204\n34#1:205,28\n34#1:233,6\n50#1:239,67\n34#1:77\n34#1:89\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class _Utf8Kt {
    public _Utf8Kt() {
            r1 = this;
            r1.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final byte[] commonAsUtf8ToByteArray(@org.jetbrains.annotations.NotNull java.lang.String r12) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r12, r0)
            int r0 = r12.length()
            int r0 = r0 * 4
            byte[] r0 = new byte[r0]
            int r1 = r12.length()
            r2 = 0
        L12:
            java.lang.String r3 = "copyOf(...)"
            if (r2 >= r1) goto Lf8
            char r4 = r12.charAt(r2)
            r5 = 128(0x80, float:1.8E-43)
            int r6 = kotlin.jvm.internal.g0.t(r4, r5)
            if (r6 < 0) goto Lf1
            int r1 = r12.length()
            r4 = r2
        L27:
            if (r2 >= r1) goto Le9
            char r6 = r12.charAt(r2)
            int r7 = kotlin.jvm.internal.g0.t(r6, r5)
            if (r7 >= 0) goto L54
            byte r6 = (byte) r6
            int r7 = r4 + 1
            r0[r4] = r6
            int r2 = r2 + 1
        L3a:
            r4 = r7
            if (r2 >= r1) goto L27
            char r6 = r12.charAt(r2)
            int r6 = kotlin.jvm.internal.g0.t(r6, r5)
            if (r6 >= 0) goto L27
            int r6 = r2 + 1
            char r2 = r12.charAt(r2)
            byte r2 = (byte) r2
            int r7 = r4 + 1
            r0[r4] = r2
            r2 = r6
            goto L3a
        L54:
            r7 = 2048(0x800, float:2.87E-42)
            int r7 = kotlin.jvm.internal.g0.t(r6, r7)
            if (r7 >= 0) goto L70
            int r7 = r6 >> 6
            r7 = r7 | 192(0xc0, float:2.69E-43)
            byte r7 = (byte) r7
            int r8 = r4 + 1
            r0[r4] = r7
            r6 = r6 & 63
            r6 = r6 | r5
            byte r6 = (byte) r6
            int r4 = r4 + 2
            r0[r8] = r6
        L6d:
            int r2 = r2 + 1
            goto L27
        L70:
            r7 = 55296(0xd800, float:7.7486E-41)
            r8 = 63
            if (r7 > r6) goto Lce
            r7 = 57344(0xe000, float:8.0356E-41)
            if (r6 >= r7) goto Lce
            r9 = 56319(0xdbff, float:7.892E-41)
            int r9 = kotlin.jvm.internal.g0.t(r6, r9)
            if (r9 > 0) goto Lc5
            int r9 = r2 + 1
            if (r1 <= r9) goto Lc5
            char r10 = r12.charAt(r9)
            r11 = 56320(0xdc00, float:7.8921E-41)
            if (r11 > r10) goto Lc5
            if (r10 >= r7) goto Lc5
            int r6 = r6 << 10
            char r7 = r12.charAt(r9)
            int r6 = r6 + r7
            r7 = -56613888(0xfffffffffca02400, float:-6.651981E36)
            int r6 = r6 + r7
            int r7 = r6 >> 18
            r7 = r7 | 240(0xf0, float:3.36E-43)
            byte r7 = (byte) r7
            int r9 = r4 + 1
            r0[r4] = r7
            int r7 = r6 >> 12
            r7 = r7 & r8
            r7 = r7 | r5
            byte r7 = (byte) r7
            int r10 = r4 + 2
            r0[r9] = r7
            int r7 = r6 >> 6
            r7 = r7 & r8
            r7 = r7 | r5
            byte r7 = (byte) r7
            int r9 = r4 + 3
            r0[r10] = r7
            r6 = r6 & r8
            r6 = r6 | r5
            byte r6 = (byte) r6
            int r4 = r4 + 4
            r0[r9] = r6
            int r2 = r2 + 2
            goto L27
        Lc5:
            int r6 = r4 + 1
            r0[r4] = r8
            int r2 = r2 + 1
            r4 = r6
            goto L27
        Lce:
            int r7 = r6 >> 12
            r7 = r7 | 224(0xe0, float:3.14E-43)
            byte r7 = (byte) r7
            int r9 = r4 + 1
            r0[r4] = r7
            int r7 = r6 >> 6
            r7 = r7 & r8
            r7 = r7 | r5
            byte r7 = (byte) r7
            int r8 = r4 + 2
            r0[r9] = r7
            r6 = r6 & 63
            r6 = r6 | r5
            byte r6 = (byte) r6
            int r4 = r4 + 3
            r0[r8] = r6
            goto L6d
        Le9:
            byte[] r12 = java.util.Arrays.copyOf(r0, r4)
            kotlin.jvm.internal.g0.o(r12, r3)
            return r12
        Lf1:
            byte r3 = (byte) r4
            r0[r2] = r3
            int r2 = r2 + 1
            goto L12
        Lf8:
            int r12 = r12.length()
            byte[] r12 = java.util.Arrays.copyOf(r0, r12)
            kotlin.jvm.internal.g0.o(r12, r3)
            return r12
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String commonToUtf8String(@org.jetbrains.annotations.NotNull byte[] r16, int r17, int r18) {
            r0 = r16
            r1 = r17
            r2 = r18
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.g0.p(r0, r3)
            if (r1 < 0) goto L19c
            int r3 = r0.length
            if (r2 > r3) goto L19c
            if (r1 > r2) goto L19c
            int r3 = r2 - r1
            char[] r3 = new char[r3]
            r4 = 0
            r5 = 0
        L18:
            if (r1 >= r2) goto L197
            r6 = r0[r1]
            if (r6 < 0) goto L38
            char r6 = (char) r6
            int r7 = r5 + 1
            r3[r5] = r6
            int r1 = r1 + 1
        L25:
            if (r1 >= r2) goto L34
            r5 = r0[r1]
            if (r5 < 0) goto L34
            int r1 = r1 + 1
            char r5 = (char) r5
            int r6 = r7 + 1
            r3[r7] = r5
            r7 = r6
            goto L25
        L34:
            kotlin.n1 r5 = kotlin.n1.a
        L36:
            r5 = r7
            goto L18
        L38:
            int r7 = r6 >> 5
            r8 = -2
            r10 = 128(0x80, float:1.8E-43)
            r11 = 65533(0xfffd, float:9.1831E-41)
            r12 = 1
            if (r7 != r8) goto L77
            int r7 = r1 + 1
            if (r2 > r7) goto L50
            char r6 = (char) r11
            int r7 = r5 + 1
            r3[r5] = r6
        L4c:
            kotlin.n1 r5 = kotlin.n1.a
            r9 = 1
            goto L73
        L50:
            r7 = r0[r7]
            r8 = r7 & 192(0xc0, float:2.69E-43)
            if (r8 != r10) goto L6d
            r7 = r7 ^ 3968(0xf80, float:5.56E-42)
            int r6 = r6 << 6
            r6 = r6 ^ r7
            if (r6 >= r10) goto L65
            char r6 = (char) r11
            int r7 = r5 + 1
            r3[r5] = r6
        L62:
            kotlin.n1 r5 = kotlin.n1.a
            goto L6b
        L65:
            char r6 = (char) r6
            int r7 = r5 + 1
            r3[r5] = r6
            goto L62
        L6b:
            r9 = 2
            goto L73
        L6d:
            char r6 = (char) r11
            int r7 = r5 + 1
            r3[r5] = r6
            goto L4c
        L73:
            int r1 = r1 + r9
            kotlin.n1 r5 = kotlin.n1.a
            goto L36
        L77:
            int r7 = r6 >> 4
            r13 = 57344(0xe000, float:8.0356E-41)
            r14 = 55296(0xd800, float:7.7486E-41)
            r15 = 3
            if (r7 != r8) goto Le6
            int r7 = r1 + 2
            if (r2 > r7) goto L9b
            char r6 = (char) r11
            int r7 = r5 + 1
            r3[r5] = r6
            kotlin.n1 r5 = kotlin.n1.a
            int r5 = r1 + 1
            if (r2 <= r5) goto L99
            r5 = r0[r5]
            r5 = r5 & 192(0xc0, float:2.69E-43)
            if (r5 != r10) goto L99
        L97:
            r9 = 2
            goto Le1
        L99:
            r9 = 1
            goto Le1
        L9b:
            int r8 = r1 + 1
            r8 = r0[r8]
            r9 = r8 & 192(0xc0, float:2.69E-43)
            if (r9 != r10) goto Ld9
            r7 = r0[r7]
            r9 = r7 & 192(0xc0, float:2.69E-43)
            if (r9 != r10) goto Ld1
            r9 = -123008(0xfffffffffffe1f80, float:NaN)
            r7 = r7 ^ r9
            int r8 = r8 << 6
            r7 = r7 ^ r8
            int r6 = r6 << 12
            r6 = r6 ^ r7
            r7 = 2048(0x800, float:2.87E-42)
            if (r6 >= r7) goto Lbf
            char r6 = (char) r11
            int r7 = r5 + 1
            r3[r5] = r6
        Lbc:
            kotlin.n1 r5 = kotlin.n1.a
            goto Lcf
        Lbf:
            if (r14 > r6) goto Lc9
            if (r6 >= r13) goto Lc9
            char r6 = (char) r11
            int r7 = r5 + 1
            r3[r5] = r6
            goto Lbc
        Lc9:
            char r6 = (char) r6
            int r7 = r5 + 1
            r3[r5] = r6
            goto Lbc
        Lcf:
            r9 = 3
            goto Le1
        Ld1:
            char r6 = (char) r11
            int r7 = r5 + 1
            r3[r5] = r6
            kotlin.n1 r5 = kotlin.n1.a
            goto L97
        Ld9:
            char r6 = (char) r11
            int r7 = r5 + 1
            r3[r5] = r6
            kotlin.n1 r5 = kotlin.n1.a
            goto L99
        Le1:
            int r1 = r1 + r9
            kotlin.n1 r5 = kotlin.n1.a
            goto L36
        Le6:
            int r7 = r6 >> 3
            if (r7 != r8) goto L190
            int r7 = r1 + 3
            if (r2 > r7) goto L111
            int r6 = r5 + 1
            r3[r5] = r11
            kotlin.n1 r5 = kotlin.n1.a
            int r5 = r1 + 1
            if (r2 <= r5) goto L10e
            r5 = r0[r5]
            r5 = r5 & 192(0xc0, float:2.69E-43)
            if (r5 != r10) goto L10e
            int r5 = r1 + 2
            if (r2 <= r5) goto L10b
            r5 = r0[r5]
            r5 = r5 & 192(0xc0, float:2.69E-43)
            if (r5 != r10) goto L10b
        L108:
            r9 = 3
            goto L18a
        L10b:
            r9 = 2
            goto L18a
        L10e:
            r9 = 1
            goto L18a
        L111:
            int r8 = r1 + 1
            r8 = r0[r8]
            r9 = r8 & 192(0xc0, float:2.69E-43)
            if (r9 != r10) goto L183
            int r9 = r1 + 2
            r9 = r0[r9]
            r12 = r9 & 192(0xc0, float:2.69E-43)
            if (r12 != r10) goto L17c
            r7 = r0[r7]
            r12 = r7 & 192(0xc0, float:2.69E-43)
            if (r12 != r10) goto L175
            r10 = 3678080(0x381f80, float:5.154088E-39)
            r7 = r7 ^ r10
            int r9 = r9 << 6
            r7 = r7 ^ r9
            int r8 = r8 << 12
            r7 = r7 ^ r8
            int r6 = r6 << 18
            r6 = r6 ^ r7
            r7 = 1114111(0x10ffff, float:1.561202E-39)
            if (r6 <= r7) goto L140
            int r6 = r5 + 1
            r3[r5] = r11
        L13d:
            kotlin.n1 r5 = kotlin.n1.a
            goto L173
        L140:
            if (r14 > r6) goto L149
            if (r6 >= r13) goto L149
            int r6 = r5 + 1
            r3[r5] = r11
            goto L13d
        L149:
            r7 = 65536(0x10000, float:9.1835E-41)
            if (r6 >= r7) goto L152
            int r6 = r5 + 1
            r3[r5] = r11
            goto L13d
        L152:
            if (r6 == r11) goto L16b
            int r7 = r6 >>> 10
            r8 = 55232(0xd7c0, float:7.7397E-41)
            int r7 = r7 + r8
            char r7 = (char) r7
            int r8 = r5 + 1
            r3[r5] = r7
            r6 = r6 & 1023(0x3ff, float:1.434E-42)
            r7 = 56320(0xdc00, float:7.8921E-41)
            int r6 = r6 + r7
            char r6 = (char) r6
            int r5 = r5 + 2
            r3[r8] = r6
            goto L170
        L16b:
            int r6 = r5 + 1
            r3[r5] = r11
            r5 = r6
        L170:
            kotlin.n1 r6 = kotlin.n1.a
            r6 = r5
        L173:
            r9 = 4
            goto L18a
        L175:
            int r6 = r5 + 1
            r3[r5] = r11
            kotlin.n1 r5 = kotlin.n1.a
            goto L108
        L17c:
            int r6 = r5 + 1
            r3[r5] = r11
            kotlin.n1 r5 = kotlin.n1.a
            goto L10b
        L183:
            int r6 = r5 + 1
            r3[r5] = r11
            kotlin.n1 r5 = kotlin.n1.a
            goto L10e
        L18a:
            int r1 = r1 + r9
            kotlin.n1 r5 = kotlin.n1.a
        L18d:
            r5 = r6
            goto L18
        L190:
            int r6 = r5 + 1
            r3[r5] = r11
            int r1 = r1 + 1
            goto L18d
        L197:
            java.lang.String r0 = kotlin.text.u.K1(r3, r4, r5)
            return r0
        L19c:
            java.lang.ArrayIndexOutOfBoundsException r3 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "size="
            r4.append(r5)
            int r0 = r0.length
            r4.append(r0)
            java.lang.String r0 = " beginIndex="
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = " endIndex="
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = r4.toString()
            r3.<init>(r0)
            throw r3
    }

    public static /* synthetic */ java.lang.String commonToUtf8String$default(byte[] r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto La
            int r2 = r0.length
        La:
            java.lang.String r0 = commonToUtf8String(r0, r1, r2)
            return r0
    }
}
