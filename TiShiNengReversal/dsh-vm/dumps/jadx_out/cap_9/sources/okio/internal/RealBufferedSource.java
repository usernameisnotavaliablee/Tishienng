package okio.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.JvmName(name = "-RealBufferedSource")
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nRealBufferedSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSource.kt\nokio/internal/-RealBufferedSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 4 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,472:1\n1#2:473\n63#3:474\n63#3:475\n63#3:476\n63#3:477\n63#3:478\n63#3:479\n63#3:480\n63#3:481\n63#3:482\n63#3:483\n63#3:484\n63#3:485\n63#3:486\n63#3:487\n63#3:488\n63#3:489\n63#3:490\n63#3:491\n63#3:492\n63#3:493\n63#3:494\n63#3:495\n63#3:496\n63#3:498\n63#3:499\n63#3:500\n63#3:501\n63#3:502\n63#3:503\n63#3:504\n63#3:505\n63#3:506\n63#3:507\n63#3:508\n63#3:509\n63#3:510\n63#3:511\n63#3:512\n63#3:513\n63#3:514\n63#3:515\n63#3:516\n63#3:517\n63#3:519\n63#3:520\n63#3:521\n63#3:522\n63#3:523\n63#3:524\n63#3:525\n63#3:526\n63#3:527\n63#3:528\n63#3:529\n63#3:530\n63#3:531\n63#3:532\n63#3:533\n63#3:534\n63#3:535\n63#3:536\n63#3:537\n63#3:538\n63#3:539\n63#3:540\n63#3:541\n63#3:543\n63#3:544\n63#3:545\n63#3:546\n88#4:497\n88#4:518\n88#4:542\n*S KotlinDebug\n*F\n+ 1 RealBufferedSource.kt\nokio/internal/-RealBufferedSource\n*L\n42#1:474\n44#1:475\n48#1:476\n49#1:477\n54#1:478\n64#1:479\n65#1:480\n72#1:481\n76#1:482\n77#1:483\n82#1:484\n89#1:485\n96#1:486\n101#1:487\n109#1:488\n110#1:489\n115#1:490\n124#1:491\n125#1:492\n132#1:493\n138#1:494\n140#1:495\n144#1:496\n145#1:498\n153#1:499\n157#1:500\n162#1:501\n163#1:502\n166#1:503\n169#1:504\n170#1:505\n171#1:506\n177#1:507\n178#1:508\n183#1:509\n190#1:510\n191#1:511\n196#1:512\n204#1:513\n206#1:514\n207#1:515\n209#1:516\n212#1:517\n214#1:519\n222#1:520\n229#1:521\n234#1:522\n239#1:523\n244#1:524\n249#1:525\n254#1:526\n259#1:527\n267#1:528\n278#1:529\n286#1:530\n300#1:531\n307#1:532\n310#1:533\n311#1:534\n322#1:535\n327#1:536\n328#1:537\n349#1:538\n358#1:539\n362#1:540\n372#1:541\n425#1:543\n428#1:544\n429#1:545\n466#1:546\n144#1:497\n212#1:518\n406#1:542\n*E\n"})
/* renamed from: okio.internal.-RealBufferedSource, reason: invalid class name */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class RealBufferedSource {
    public RealBufferedSource() {
            r1 = this;
            r1.<init>()
            return
    }

    public static final void commonClose(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1.closed
            if (r0 == 0) goto La
            return
        La:
            r0 = 1
            r1.closed = r0
            okio.Source r0 = r1.source
            r0.close()
            okio.Buffer r1 = r1.bufferField
            r1.clear()
            return
    }

    public static final boolean commonExhausted(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            boolean r0 = r4.closed
            if (r0 != 0) goto L25
            okio.Buffer r0 = r4.bufferField
            boolean r0 = r0.exhausted()
            if (r0 == 0) goto L23
            okio.Source r0 = r4.source
            okio.Buffer r4 = r4.bufferField
            r1 = 8192(0x2000, double:4.0474E-320)
            long r0 = r0.read(r4, r1)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L23
            r4 = 1
            return r4
        L23:
            r4 = 0
            return r4
        L25:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            r4.<init>(r0)
            throw r4
    }

    public static final long commonIndexOf(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r9, byte r10, long r11, long r13) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r9, r0)
            boolean r0 = r9.closed
            if (r0 != 0) goto L6c
            r0 = 0
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 > 0) goto L48
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 > 0) goto L48
            r3 = r11
        L14:
            r11 = -1
            int r0 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r0 >= 0) goto L47
            okio.Buffer r1 = r9.bufferField
            r2 = r10
            r5 = r13
            long r13 = r1.indexOf(r2, r3, r5)
            int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r10 == 0) goto L27
            return r13
        L27:
            okio.Buffer r10 = r9.bufferField
            long r13 = r10.size()
            int r10 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r10 >= 0) goto L47
            okio.Source r10 = r9.source
            okio.Buffer r0 = r9.bufferField
            r7 = 8192(0x2000, double:4.0474E-320)
            long r0 = r10.read(r0, r7)
            int r10 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r10 != 0) goto L40
            goto L47
        L40:
            long r3 = java.lang.Math.max(r3, r13)
            r10 = r2
            r13 = r5
            goto L14
        L47:
            return r11
        L48:
            r5 = r13
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "fromIndex="
            r9.append(r10)
            r9.append(r11)
            java.lang.String r10 = " toIndex="
            r9.append(r10)
            r9.append(r5)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        L6c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            r9.<init>(r10)
            throw r9
    }

    public static final long commonIndexOf(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r16, @org.jetbrains.annotations.NotNull okio.ByteString r17, int r18, int r19, long r20, long r22) {
            r0 = r16
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.g0.p(r0, r1)
            java.lang.String r1 = "bytes"
            r3 = r17
            kotlin.jvm.internal.g0.p(r3, r1)
            int r1 = r3.size()
            long r4 = (long) r1
            r1 = r18
            long r6 = (long) r1
            r2 = r19
            long r8 = (long) r2
            okio.SegmentedByteString.checkOffsetAndCount(r4, r6, r8)
            r10 = r8
            boolean r4 = r0.closed
            if (r4 != 0) goto L70
            r4 = r20
        L23:
            okio.Buffer r2 = r0.bufferField
            r9 = r19
            r6 = r22
            r8 = r1
            long r1 = okio.internal.Buffer.commonIndexOf(r2, r3, r4, r6, r8, r9)
            r12 = -1
            int r3 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r3 == 0) goto L35
            return r1
        L35:
            okio.Buffer r1 = r0.bufferField
            long r1 = r1.size()
            long r1 = r1 - r10
            r6 = 1
            long r14 = r1 + r6
            int r1 = (r14 > r22 ? 1 : (r14 == r22 ? 0 : -1))
            if (r1 < 0) goto L45
            return r12
        L45:
            okio.Buffer r2 = r0.bufferField
            r3 = r17
            r8 = r22
            r6 = r4
            r4 = r18
            r5 = r19
            boolean r1 = isMatchPossibleByExpandingBuffer(r2, r3, r4, r5, r6, r8)
            r4 = r6
            if (r1 != 0) goto L58
            return r12
        L58:
            okio.Source r1 = r0.source
            okio.Buffer r2 = r0.bufferField
            r6 = 8192(0x2000, double:4.0474E-320)
            long r1 = r1.read(r2, r6)
            int r3 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r3 != 0) goto L67
            return r12
        L67:
            long r4 = java.lang.Math.max(r4, r14)
            r3 = r17
            r1 = r18
            goto L23
        L70:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "closed"
            r0.<init>(r1)
            throw r0
    }

    public static /* synthetic */ long commonIndexOf$default(okio.RealBufferedSource r8, okio.ByteString r9, int r10, int r11, long r12, long r14, int r16, java.lang.Object r17) {
            r0 = r16 & 2
            if (r0 == 0) goto L7
            r10 = 0
            r2 = 0
            goto L8
        L7:
            r2 = r10
        L8:
            r10 = r16 & 4
            if (r10 == 0) goto L10
            int r11 = r9.size()
        L10:
            r3 = r11
            r10 = r16 & 16
            if (r10 == 0) goto L1f
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6 = r10
        L1b:
            r0 = r8
            r1 = r9
            r4 = r12
            goto L21
        L1f:
            r6 = r14
            goto L1b
        L21:
            long r8 = commonIndexOf(r0, r1, r2, r3, r4, r6)
            return r8
    }

    public static final long commonIndexOfElement(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r8, @org.jetbrains.annotations.NotNull okio.ByteString r9, long r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "targetBytes"
            kotlin.jvm.internal.g0.p(r9, r0)
            boolean r0 = r8.closed
            if (r0 != 0) goto L35
        Le:
            okio.Buffer r0 = r8.bufferField
            long r0 = r0.indexOfElement(r9, r10)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L1b
            return r0
        L1b:
            okio.Buffer r0 = r8.bufferField
            long r0 = r0.size()
            okio.Source r4 = r8.source
            okio.Buffer r5 = r8.bufferField
            r6 = 8192(0x2000, double:4.0474E-320)
            long r4 = r4.read(r5, r6)
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L30
            return r2
        L30:
            long r10 = java.lang.Math.max(r10, r0)
            goto Le
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "closed"
            r8.<init>(r9)
            throw r8
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.BufferedSource commonPeek(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            okio.PeekSource r0 = new okio.PeekSource
            r0.<init>(r1)
            okio.BufferedSource r1 = okio.Okio.buffer(r0)
            return r1
    }

    public static final boolean commonRangeEquals(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r10, long r11, @org.jetbrains.annotations.NotNull okio.ByteString r13, int r14, int r15) {
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.g0.p(r10, r1)
            java.lang.String r1 = "bytes"
            kotlin.jvm.internal.g0.p(r13, r1)
            boolean r1 = r10.closed
            if (r1 != 0) goto L3d
            r8 = 0
            if (r15 >= 0) goto L12
            return r8
        L12:
            r3 = 0
            int r1 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r1 >= 0) goto L19
            return r8
        L19:
            if (r14 < 0) goto L3c
            int r1 = r14 + r15
            int r3 = r13.size()
            if (r1 <= r3) goto L24
            goto L3c
        L24:
            r9 = 1
            if (r15 != 0) goto L28
            return r9
        L28:
            r3 = 1
            long r6 = r11 + r3
            r0 = r10
            r4 = r11
            r1 = r13
            r2 = r14
            r3 = r15
            long r0 = commonIndexOf(r0, r1, r2, r3, r4, r6)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L3c
            return r9
        L3c:
            return r8
        L3d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "closed"
            r0.<init>(r1)
            throw r0
    }

    public static final int commonRead(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r7, @org.jetbrains.annotations.NotNull byte[] r8, int r9, int r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.g0.p(r8, r0)
            int r0 = r8.length
            long r1 = (long) r0
            long r3 = (long) r9
            long r5 = (long) r10
            okio.SegmentedByteString.checkOffsetAndCount(r1, r3, r5)
            okio.Buffer r0 = r7.bufferField
            long r0 = r0.size()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L33
            if (r10 != 0) goto L21
            r7 = 0
            return r7
        L21:
            okio.Source r10 = r7.source
            okio.Buffer r0 = r7.bufferField
            r1 = 8192(0x2000, double:4.0474E-320)
            long r0 = r10.read(r0, r1)
            r2 = -1
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 != 0) goto L33
            r7 = -1
            return r7
        L33:
            okio.Buffer r10 = r7.bufferField
            long r0 = r10.size()
            long r0 = java.lang.Math.min(r5, r0)
            int r10 = (int) r0
            okio.Buffer r7 = r7.bufferField
            int r7 = r7.read(r8, r9, r10)
            return r7
    }

    public static final long commonRead(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r6, @org.jetbrains.annotations.NotNull okio.Buffer r7, long r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.g0.p(r7, r0)
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 < 0) goto L4b
            boolean r3 = r6.closed
            if (r3 != 0) goto L43
            okio.Buffer r3 = r6.bufferField
            long r3 = r3.size()
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 != 0) goto L32
            if (r2 != 0) goto L21
            return r0
        L21:
            okio.Source r0 = r6.source
            okio.Buffer r1 = r6.bufferField
            r2 = 8192(0x2000, double:4.0474E-320)
            long r0 = r0.read(r1, r2)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L32
            return r2
        L32:
            okio.Buffer r0 = r6.bufferField
            long r0 = r0.size()
            long r8 = java.lang.Math.min(r8, r0)
            okio.Buffer r6 = r6.bufferField
            long r6 = r6.read(r7, r8)
            return r6
        L43:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "closed"
            r6.<init>(r7)
            throw r6
        L4b:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "byteCount < 0: "
            r6.append(r7)
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
    }

    public static final long commonReadAll(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r9, @org.jetbrains.annotations.NotNull okio.Sink r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.g0.p(r10, r0)
            r0 = 0
            r2 = r0
        Ld:
            okio.Source r4 = r9.source
            okio.Buffer r5 = r9.bufferField
            r6 = 8192(0x2000, double:4.0474E-320)
            long r4 = r4.read(r5, r6)
            r6 = -1
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L2e
            okio.Buffer r4 = r9.bufferField
            long r4 = r4.completeSegmentByteCount()
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 <= 0) goto Ld
            long r2 = r2 + r4
            okio.Buffer r6 = r9.bufferField
            r10.write(r6, r4)
            goto Ld
        L2e:
            okio.Buffer r4 = r9.bufferField
            long r4 = r4.size()
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 <= 0) goto L48
            okio.Buffer r0 = r9.bufferField
            long r0 = r0.size()
            long r2 = r2 + r0
            okio.Buffer r9 = r9.bufferField
            long r0 = r9.size()
            r10.write(r9, r0)
        L48:
            return r2
    }

    public static final byte commonReadByte(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 1
            r2.require(r0)
            okio.Buffer r2 = r2.bufferField
            byte r2 = r2.readByte()
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final byte[] commonReadByteArray(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            okio.Buffer r0 = r2.bufferField
            okio.Source r1 = r2.source
            r0.writeAll(r1)
            okio.Buffer r2 = r2.bufferField
            byte[] r2 = r2.readByteArray()
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final byte[] commonReadByteArray(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r1, long r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r1.require(r2)
            okio.Buffer r1 = r1.bufferField
            byte[] r1 = r1.readByteArray(r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.ByteString commonReadByteString(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            okio.Buffer r0 = r2.bufferField
            okio.Source r1 = r2.source
            r0.writeAll(r1)
            okio.Buffer r2 = r2.bufferField
            okio.ByteString r2 = r2.readByteString()
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.ByteString commonReadByteString(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r1, long r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r1.require(r2)
            okio.Buffer r1 = r1.bufferField
            okio.ByteString r1 = r1.readByteString(r2)
            return r1
    }

    public static final long commonReadDecimalLong(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r10, r0)
            r0 = 1
            r10.require(r0)
            r2 = 0
            r4 = r2
        Ld:
            long r6 = r4 + r0
            boolean r8 = r10.request(r6)
            if (r8 == 0) goto L57
            okio.Buffer r8 = r10.bufferField
            byte r8 = r8.getByte(r4)
            r9 = 48
            if (r8 < r9) goto L23
            r9 = 57
            if (r8 <= r9) goto L2c
        L23:
            int r9 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r9 != 0) goto L2e
            r4 = 45
            if (r8 == r4) goto L2c
            goto L2e
        L2c:
            r4 = r6
            goto Ld
        L2e:
            if (r9 == 0) goto L31
            goto L57
        L31:
            java.lang.NumberFormatException r10 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected a digit or '-' but was 0x"
            r0.append(r1)
            r1 = 16
            int r1 = kotlin.text.b.a(r1)
            java.lang.String r1 = java.lang.Integer.toString(r8, r1)
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L57:
            okio.Buffer r10 = r10.bufferField
            long r0 = r10.readDecimalLong()
            return r0
    }

    public static final void commonReadFully(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r1, @org.jetbrains.annotations.NotNull okio.Buffer r2, long r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.require(r3)     // Catch: java.io.EOFException -> L13
            okio.Buffer r1 = r1.bufferField
            r1.readFully(r2, r3)
            return
        L13:
            r3 = move-exception
            okio.Buffer r1 = r1.bufferField
            r2.writeAll(r1)
            throw r3
    }

    public static final void commonReadFully(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r7, @org.jetbrains.annotations.NotNull byte[] r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.g0.p(r8, r0)
            int r0 = r8.length     // Catch: java.io.EOFException -> L15
            long r0 = (long) r0     // Catch: java.io.EOFException -> L15
            r7.require(r0)     // Catch: java.io.EOFException -> L15
            okio.Buffer r7 = r7.bufferField
            r7.readFully(r8)
            return
        L15:
            r0 = move-exception
            r1 = 0
        L17:
            okio.Buffer r2 = r7.bufferField
            long r2 = r2.size()
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L39
            okio.Buffer r2 = r7.bufferField
            long r3 = r2.size()
            int r4 = (int) r3
            int r2 = r2.read(r8, r1, r4)
            r3 = -1
            if (r2 == r3) goto L33
            int r1 = r1 + r2
            goto L17
        L33:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            r7.<init>()
            throw r7
        L39:
            throw r0
    }

    public static final long commonReadHexadecimalUnsignedLong(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            r0 = 1
            r5.require(r0)
            r0 = 0
        Lb:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r5.request(r2)
            if (r2 == 0) goto L5f
            okio.Buffer r2 = r5.bufferField
            long r3 = (long) r0
            byte r2 = r2.getByte(r3)
            r3 = 48
            if (r2 < r3) goto L23
            r3 = 57
            if (r2 <= r3) goto L34
        L23:
            r3 = 97
            if (r2 < r3) goto L2b
            r3 = 102(0x66, float:1.43E-43)
            if (r2 <= r3) goto L34
        L2b:
            r3 = 65
            if (r2 < r3) goto L36
            r3 = 70
            if (r2 <= r3) goto L34
            goto L36
        L34:
            r0 = r1
            goto Lb
        L36:
            if (r0 == 0) goto L39
            goto L5f
        L39:
            java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            r0.append(r1)
            r1 = 16
            int r1 = kotlin.text.b.a(r1)
            java.lang.String r1 = java.lang.Integer.toString(r2, r1)
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L5f:
            okio.Buffer r5 = r5.bufferField
            long r0 = r5.readHexadecimalUnsignedLong()
            return r0
    }

    public static final int commonReadInt(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 4
            r2.require(r0)
            okio.Buffer r2 = r2.bufferField
            int r2 = r2.readInt()
            return r2
    }

    public static final int commonReadIntLe(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 4
            r2.require(r0)
            okio.Buffer r2 = r2.bufferField
            int r2 = r2.readIntLe()
            return r2
    }

    public static final long commonReadLong(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 8
            r2.require(r0)
            okio.Buffer r2 = r2.bufferField
            long r0 = r2.readLong()
            return r0
    }

    public static final long commonReadLongLe(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 8
            r2.require(r0)
            okio.Buffer r2 = r2.bufferField
            long r0 = r2.readLongLe()
            return r0
    }

    public static final short commonReadShort(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 2
            r2.require(r0)
            okio.Buffer r2 = r2.bufferField
            short r2 = r2.readShort()
            return r2
    }

    public static final short commonReadShortLe(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 2
            r2.require(r0)
            okio.Buffer r2 = r2.bufferField
            short r2 = r2.readShortLe()
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String commonReadUtf8(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            okio.Buffer r0 = r2.bufferField
            okio.Source r1 = r2.source
            r0.writeAll(r1)
            okio.Buffer r2 = r2.bufferField
            java.lang.String r2 = r2.readUtf8()
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String commonReadUtf8(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r1, long r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r1.require(r2)
            okio.Buffer r1 = r1.bufferField
            java.lang.String r1 = r1.readUtf8(r2)
            return r1
    }

    public static final int commonReadUtf8CodePoint(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 1
            r3.require(r0)
            okio.Buffer r0 = r3.bufferField
            r1 = 0
            byte r0 = r0.getByte(r1)
            r1 = r0 & 224(0xe0, float:3.14E-43)
            r2 = 192(0xc0, float:2.69E-43)
            if (r1 != r2) goto L1e
            r0 = 2
            r3.require(r0)
            goto L35
        L1e:
            r1 = r0 & 240(0xf0, float:3.36E-43)
            r2 = 224(0xe0, float:3.14E-43)
            if (r1 != r2) goto L2a
            r0 = 3
            r3.require(r0)
            goto L35
        L2a:
            r0 = r0 & 248(0xf8, float:3.48E-43)
            r1 = 240(0xf0, float:3.36E-43)
            if (r0 != r1) goto L35
            r0 = 4
            r3.require(r0)
        L35:
            okio.Buffer r3 = r3.bufferField
            int r3 = r3.readUtf8CodePoint()
            return r3
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.String commonReadUtf8Line(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            r0 = 10
            long r0 = r5.indexOf(r0)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L2a
            okio.Buffer r0 = r5.bufferField
            long r0 = r0.size()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L28
            okio.Buffer r0 = r5.bufferField
            long r0 = r0.size()
            java.lang.String r5 = r5.readUtf8(r0)
            return r5
        L28:
            r5 = 0
            return r5
        L2a:
            okio.Buffer r5 = r5.bufferField
            java.lang.String r5 = okio.internal.Buffer.readUtf8Line(r5, r0)
            return r5
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String commonReadUtf8LineStrict(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r12, long r13) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r12, r0)
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 < 0) goto Lac
            r0 = 1
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r4 != 0) goto L18
            r10 = r2
            goto L1b
        L18:
            long r4 = r13 + r0
            r10 = r4
        L1b:
            r7 = 10
            r8 = 0
            r6 = r12
            long r4 = r6.indexOf(r7, r8, r10)
            r7 = -1
            int r12 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r12 == 0) goto L31
            okio.Buffer r12 = r6.bufferField
            java.lang.String r12 = okio.internal.Buffer.readUtf8Line(r12, r4)
            return r12
        L31:
            int r12 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r12 >= 0) goto L5f
            boolean r12 = r6.request(r10)
            if (r12 == 0) goto L5f
            okio.Buffer r12 = r6.bufferField
            long r2 = r10 - r0
            byte r12 = r12.getByte(r2)
            r2 = 13
            if (r12 != r2) goto L5f
            long r0 = r0 + r10
            boolean r12 = r6.request(r0)
            if (r12 == 0) goto L5f
            okio.Buffer r12 = r6.bufferField
            byte r12 = r12.getByte(r10)
            r0 = 10
            if (r12 != r0) goto L5f
            okio.Buffer r12 = r6.bufferField
            java.lang.String r12 = okio.internal.Buffer.readUtf8Line(r12, r10)
            return r12
        L5f:
            okio.Buffer r1 = new okio.Buffer
            r1.<init>()
            okio.Buffer r0 = r6.bufferField
            long r2 = r0.size()
            r12 = 32
            long r4 = (long) r12
            long r4 = java.lang.Math.min(r4, r2)
            r2 = 0
            r0.copyTo(r1, r2, r4)
            java.io.EOFException r12 = new java.io.EOFException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "\\n not found: limit="
            r0.append(r2)
            okio.Buffer r2 = r6.bufferField
            long r2 = r2.size()
            long r13 = java.lang.Math.min(r2, r13)
            r0.append(r13)
            java.lang.String r13 = " content="
            r0.append(r13)
            okio.ByteString r13 = r1.readByteString()
            java.lang.String r13 = r13.hex()
            r0.append(r13)
            r13 = 8230(0x2026, float:1.1533E-41)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r12.<init>(r13)
            throw r12
        Lac:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "limit < 0: "
            r12.append(r0)
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r12 = r12.toString()
            r13.<init>(r12)
            throw r13
    }

    public static final boolean commonRequest(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r5, long r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 < 0) goto L35
            boolean r0 = r5.closed
            if (r0 != 0) goto L2d
        Lf:
            okio.Buffer r0 = r5.bufferField
            long r0 = r0.size()
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 >= 0) goto L2b
            okio.Source r0 = r5.source
            okio.Buffer r1 = r5.bufferField
            r2 = 8192(0x2000, double:4.0474E-320)
            long r0 = r0.read(r1, r2)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lf
            r5 = 0
            return r5
        L2b:
            r5 = 1
            return r5
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "closed"
            r5.<init>(r6)
            throw r5
        L35:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "byteCount < 0: "
            r5.append(r0)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
    }

    public static final void commonRequire(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r1, long r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r1 = r1.request(r2)
            if (r1 == 0) goto Lc
            return
        Lc:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
    }

    public static final int commonSelect(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r6, @org.jetbrains.annotations.NotNull okio.Options r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.g0.p(r7, r0)
            boolean r0 = r6.closed
            if (r0 != 0) goto L3e
        Le:
            okio.Buffer r0 = r6.bufferField
            r1 = 1
            int r0 = okio.internal.Buffer.selectPrefix(r0, r7, r1)
            r1 = -2
            r2 = -1
            if (r0 == r1) goto L2d
            if (r0 == r2) goto L2c
            okio.ByteString[] r7 = r7.getByteStrings$okio()
            r7 = r7[r0]
            int r7 = r7.size()
            okio.Buffer r6 = r6.bufferField
            long r1 = (long) r7
            r6.skip(r1)
            return r0
        L2c:
            return r2
        L2d:
            okio.Source r0 = r6.source
            okio.Buffer r1 = r6.bufferField
            r3 = 8192(0x2000, double:4.0474E-320)
            long r0 = r0.read(r1, r3)
            r3 = -1
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 != 0) goto Le
            return r2
        L3e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "closed"
            r6.<init>(r7)
            throw r6
    }

    public static final void commonSkip(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r5, long r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            boolean r0 = r5.closed
            if (r0 != 0) goto L42
        L9:
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 <= 0) goto L41
            okio.Buffer r2 = r5.bufferField
            long r2 = r2.size()
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto L30
            okio.Source r0 = r5.source
            okio.Buffer r1 = r5.bufferField
            r2 = 8192(0x2000, double:4.0474E-320)
            long r0 = r0.read(r1, r2)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L2a
            goto L30
        L2a:
            java.io.EOFException r5 = new java.io.EOFException
            r5.<init>()
            throw r5
        L30:
            okio.Buffer r0 = r5.bufferField
            long r0 = r0.size()
            long r0 = java.lang.Math.min(r6, r0)
            okio.Buffer r2 = r5.bufferField
            r2.skip(r0)
            long r6 = r6 - r0
            goto L9
        L41:
            return
        L42:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "closed"
            r5.<init>(r6)
            throw r5
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Timeout commonTimeout(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            okio.Source r1 = r1.source
            okio.Timeout r1 = r1.timeout()
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String commonToString(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "buffer("
            r0.append(r1)
            okio.Source r2 = r2.source
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    private static final boolean isMatchPossibleByExpandingBuffer(okio.Buffer r9, okio.ByteString r10, int r11, int r12, long r13, long r15) {
            long r0 = r9.size()
            r2 = 1
            int r3 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r3 >= 0) goto La
            return r2
        La:
            long r0 = r9.size()
            long r0 = r0 - r15
            r3 = 1
            long r0 = r0 + r3
            long r0 = java.lang.Math.max(r3, r0)
            int r1 = (int) r0
            long r5 = r9.size()
            long r5 = r5 - r13
            long r5 = r5 + r3
            long r12 = (long) r12
            long r12 = java.lang.Math.min(r12, r5)
            int r13 = (int) r12
            int r13 = r13 - r2
            if (r1 > r13) goto L3d
            r8 = r13
        L27:
            long r12 = r9.size()
            long r3 = (long) r8
            long r12 = r12 - r3
            r3 = r9
            r6 = r10
            r7 = r11
            r4 = r12
            boolean r12 = r3.rangeEquals(r4, r6, r7, r8)
            if (r12 == 0) goto L38
            return r2
        L38:
            if (r8 == r1) goto L3d
            int r8 = r8 + (-1)
            goto L27
        L3d:
            r9 = 0
            return r9
    }
}
