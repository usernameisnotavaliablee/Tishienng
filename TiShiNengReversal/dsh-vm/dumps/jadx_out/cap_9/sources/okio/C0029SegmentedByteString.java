package okio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSegmentedByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedByteString.kt\nokio/SegmentedByteString\n+ 2 SegmentedByteString.kt\nokio/internal/-SegmentedByteString\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,140:1\n63#2,12:141\n63#2,12:153\n104#2,2:165\n106#2,26:168\n135#2,5:194\n142#2:199\n145#2,3:200\n63#2,8:203\n148#2,8:211\n71#2,4:219\n156#2:223\n63#2,12:224\n160#2:236\n85#2,10:237\n161#2,9:247\n95#2,4:256\n170#2,2:260\n179#2,4:262\n85#2,10:266\n183#2,3:276\n95#2,4:279\n186#2:283\n195#2,8:284\n85#2,10:292\n203#2,3:302\n95#2,4:305\n206#2:309\n215#2,5:310\n85#2,10:315\n220#2,3:325\n95#2,4:328\n223#2:332\n226#2,4:333\n234#2,6:337\n63#2,8:343\n240#2,7:351\n71#2,4:358\n247#2,2:362\n1#3:167\n*S KotlinDebug\n*F\n+ 1 SegmentedByteString.kt\nokio/SegmentedByteString\n*L\n54#1:141,12\n66#1:153,12\n78#1:165,2\n78#1:168,26\n80#1:194,5\n82#1:199\n84#1:200,3\n84#1:203,8\n84#1:211,8\n84#1:219,4\n84#1:223\n90#1:224,12\n96#1:236\n96#1:237,10\n96#1:247,9\n96#1:256,4\n96#1:260,2\n103#1:262,4\n103#1:266,10\n103#1:276,3\n103#1:279,4\n103#1:283\n110#1:284,8\n110#1:292,10\n110#1:302,3\n110#1:305,4\n110#1:309\n117#1:310,5\n117#1:315,10\n117#1:325,3\n117#1:328,4\n117#1:332\n131#1:333,4\n133#1:337,6\n133#1:343,8\n133#1:351,7\n133#1:358,4\n133#1:362,2\n78#1:167\n*E\n"})
/* renamed from: okio.SegmentedByteString, reason: case insensitive filesystem */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class C0029SegmentedByteString extends okio.ByteString {

    @org.jetbrains.annotations.NotNull
    private final transient int[] directory;

    @org.jetbrains.annotations.NotNull
    private final transient byte[][] segments;

    public C0029SegmentedByteString(@org.jetbrains.annotations.NotNull byte[][] r2, @org.jetbrains.annotations.NotNull int[] r3) {
            r1 = this;
            java.lang.String r0 = "segments"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "directory"
            kotlin.jvm.internal.g0.p(r3, r0)
            okio.ByteString r0 = okio.ByteString.EMPTY
            byte[] r0 = r0.getData$okio()
            r1.<init>(r0)
            r1.segments = r2
            r1.directory = r3
            return
    }

    private final okio.ByteString toByteString() {
            r2 = this;
            okio.ByteString r0 = new okio.ByteString
            byte[] r1 = r2.toByteArray()
            r0.<init>(r1)
            return r0
    }

    private final java.lang.Object writeReplace() {
            r2 = this;
            okio.ByteString r0 = r2.toByteString()
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.g0.n(r0, r1)
            return r0
    }

    @Override // okio.ByteString
    @org.jetbrains.annotations.NotNull
    public java.nio.ByteBuffer asByteBuffer() {
            r2 = this;
            byte[] r0 = r2.toByteArray()
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            java.nio.ByteBuffer r0 = r0.asReadOnlyBuffer()
            java.lang.String r1 = "asReadOnlyBuffer(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    @Override // okio.ByteString
    @org.jetbrains.annotations.NotNull
    public java.lang.String base64() {
            r1 = this;
            okio.ByteString r0 = r1.toByteString()
            java.lang.String r0 = r0.base64()
            return r0
    }

    @Override // okio.ByteString
    @org.jetbrains.annotations.NotNull
    public java.lang.String base64Url() {
            r1 = this;
            okio.ByteString r0 = r1.toByteString()
            java.lang.String r0 = r0.base64Url()
            return r0
    }

    @Override // okio.ByteString
    public void copyInto(int r12, @org.jetbrains.annotations.NotNull byte[] r13, int r14, int r15) {
            r11 = this;
            java.lang.String r0 = "target"
            kotlin.jvm.internal.g0.p(r13, r0)
            int r0 = r11.size()
            long r1 = (long) r0
            long r3 = (long) r12
            long r5 = (long) r15
            okio.SegmentedByteString.checkOffsetAndCount(r1, r3, r5)
            int r0 = r13.length
            long r0 = (long) r0
            long r7 = (long) r14
            r9 = r5
            r5 = r0
            okio.SegmentedByteString.checkOffsetAndCount(r5, r7, r9)
            int r15 = r15 + r12
            int r0 = okio.internal.SegmentedByteString.segment(r11, r12)
        L1c:
            if (r12 >= r15) goto L56
            if (r0 != 0) goto L22
            r1 = 0
            goto L2a
        L22:
            int[] r1 = r11.getDirectory$okio()
            int r2 = r0 + (-1)
            r1 = r1[r2]
        L2a:
            int[] r2 = r11.getDirectory$okio()
            r2 = r2[r0]
            int r2 = r2 - r1
            int[] r3 = r11.getDirectory$okio()
            byte[][] r4 = r11.getSegments$okio()
            int r4 = r4.length
            int r4 = r4 + r0
            r3 = r3[r4]
            int r2 = r2 + r1
            int r2 = java.lang.Math.min(r15, r2)
            int r2 = r2 - r12
            int r1 = r12 - r1
            int r3 = r3 + r1
            byte[][] r1 = r11.getSegments$okio()
            r1 = r1[r0]
            int r4 = r3 + r2
            kotlin.collections.n.v0(r1, r13, r14, r3, r4)
            int r14 = r14 + r2
            int r12 = r12 + r2
            int r0 = r0 + 1
            goto L1c
        L56:
            return
    }

    @Override // okio.ByteString
    @org.jetbrains.annotations.NotNull
    public okio.ByteString digest$okio(@org.jetbrains.annotations.NotNull java.lang.String r7) {
            r6 = this;
            java.lang.String r0 = "algorithm"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.security.MessageDigest r7 = java.security.MessageDigest.getInstance(r7)
            byte[][] r0 = r6.getSegments$okio()
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L10:
            if (r1 >= r0) goto L2f
            int[] r3 = r6.getDirectory$okio()
            int r4 = r0 + r1
            r3 = r3[r4]
            int[] r4 = r6.getDirectory$okio()
            r4 = r4[r1]
            byte[][] r5 = r6.getSegments$okio()
            r5 = r5[r1]
            int r2 = r4 - r2
            r7.update(r5, r3, r2)
            int r1 = r1 + 1
            r2 = r4
            goto L10
        L2f:
            byte[] r7 = r7.digest()
            okio.ByteString r0 = new okio.ByteString
            kotlin.jvm.internal.g0.m(r7)
            r0.<init>(r7)
            return r0
    }

    @Override // okio.ByteString
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof okio.ByteString
            r2 = 0
            if (r1 == 0) goto L20
            okio.ByteString r5 = (okio.ByteString) r5
            int r1 = r5.size()
            int r3 = r4.size()
            if (r1 != r3) goto L20
            int r1 = r4.size()
            boolean r5 = r4.rangeEquals(r2, r5, r2, r1)
            if (r5 == 0) goto L20
            return r0
        L20:
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final int[] getDirectory$okio() {
            r1 = this;
            int[] r0 = r1.directory
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final byte[][] getSegments$okio() {
            r1 = this;
            byte[][] r0 = r1.segments
            return r0
    }

    @Override // okio.ByteString
    public int getSize$okio() {
            r2 = this;
            int[] r0 = r2.getDirectory$okio()
            byte[][] r1 = r2.getSegments$okio()
            int r1 = r1.length
            int r1 = r1 + (-1)
            r0 = r0[r1]
            return r0
    }

    @Override // okio.ByteString
    public int hashCode() {
            r8 = this;
            int r0 = r8.getHashCode$okio()
            if (r0 == 0) goto L7
            return r0
        L7:
            byte[][] r0 = r8.getSegments$okio()
            int r0 = r0.length
            r1 = 0
            r2 = 1
            r2 = 0
            r3 = 1
        L10:
            if (r1 >= r0) goto L37
            int[] r4 = r8.getDirectory$okio()
            int r5 = r0 + r1
            r4 = r4[r5]
            int[] r5 = r8.getDirectory$okio()
            r5 = r5[r1]
            byte[][] r6 = r8.getSegments$okio()
            r6 = r6[r1]
            int r2 = r5 - r2
            int r2 = r2 + r4
        L29:
            if (r4 >= r2) goto L33
            int r3 = r3 * 31
            r7 = r6[r4]
            int r3 = r3 + r7
            int r4 = r4 + 1
            goto L29
        L33:
            int r1 = r1 + 1
            r2 = r5
            goto L10
        L37:
            r8.setHashCode$okio(r3)
            return r3
    }

    @Override // okio.ByteString
    @org.jetbrains.annotations.NotNull
    public java.lang.String hex() {
            r1 = this;
            okio.ByteString r0 = r1.toByteString()
            java.lang.String r0 = r0.hex()
            return r0
    }

    @Override // okio.ByteString
    @org.jetbrains.annotations.NotNull
    public okio.ByteString hmac$okio(@org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.NotNull okio.ByteString r7) {
            r5 = this;
            java.lang.String r0 = "algorithm"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.g0.p(r7, r0)
            javax.crypto.Mac r0 = javax.crypto.Mac.getInstance(r6)     // Catch: java.security.InvalidKeyException -> L40
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec     // Catch: java.security.InvalidKeyException -> L40
            byte[] r7 = r7.toByteArray()     // Catch: java.security.InvalidKeyException -> L40
            r1.<init>(r7, r6)     // Catch: java.security.InvalidKeyException -> L40
            r0.init(r1)     // Catch: java.security.InvalidKeyException -> L40
            byte[][] r6 = r5.getSegments$okio()     // Catch: java.security.InvalidKeyException -> L40
            int r6 = r6.length     // Catch: java.security.InvalidKeyException -> L40
            r7 = 0
            r1 = 0
        L21:
            if (r7 >= r6) goto L42
            int[] r2 = r5.getDirectory$okio()     // Catch: java.security.InvalidKeyException -> L40
            int r3 = r6 + r7
            r2 = r2[r3]     // Catch: java.security.InvalidKeyException -> L40
            int[] r3 = r5.getDirectory$okio()     // Catch: java.security.InvalidKeyException -> L40
            r3 = r3[r7]     // Catch: java.security.InvalidKeyException -> L40
            byte[][] r4 = r5.getSegments$okio()     // Catch: java.security.InvalidKeyException -> L40
            r4 = r4[r7]     // Catch: java.security.InvalidKeyException -> L40
            int r1 = r3 - r1
            r0.update(r4, r2, r1)     // Catch: java.security.InvalidKeyException -> L40
            int r7 = r7 + 1
            r1 = r3
            goto L21
        L40:
            r6 = move-exception
            goto L51
        L42:
            okio.ByteString r6 = new okio.ByteString     // Catch: java.security.InvalidKeyException -> L40
            byte[] r7 = r0.doFinal()     // Catch: java.security.InvalidKeyException -> L40
            java.lang.String r0 = "doFinal(...)"
            kotlin.jvm.internal.g0.o(r7, r0)     // Catch: java.security.InvalidKeyException -> L40
            r6.<init>(r7)     // Catch: java.security.InvalidKeyException -> L40
            return r6
        L51:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>(r6)
            throw r7
    }

    @Override // okio.ByteString
    public int indexOf(@org.jetbrains.annotations.NotNull byte[] r2, int r3) {
            r1 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r2, r0)
            okio.ByteString r0 = r1.toByteString()
            int r2 = r0.indexOf(r2, r3)
            return r2
    }

    @Override // okio.ByteString
    @org.jetbrains.annotations.NotNull
    public byte[] internalArray$okio() {
            r1 = this;
            byte[] r0 = r1.toByteArray()
            return r0
    }

    @Override // okio.ByteString
    public byte internalGet$okio(int r8) {
            r7 = this;
            int[] r0 = r7.getDirectory$okio()
            byte[][] r1 = r7.getSegments$okio()
            int r1 = r1.length
            int r1 = r1 + (-1)
            r0 = r0[r1]
            long r1 = (long) r0
            long r3 = (long) r8
            r5 = 1
            okio.SegmentedByteString.checkOffsetAndCount(r1, r3, r5)
            int r0 = okio.internal.SegmentedByteString.segment(r7, r8)
            if (r0 != 0) goto L1c
            r1 = 0
            goto L24
        L1c:
            int[] r1 = r7.getDirectory$okio()
            int r2 = r0 + (-1)
            r1 = r1[r2]
        L24:
            int[] r2 = r7.getDirectory$okio()
            byte[][] r3 = r7.getSegments$okio()
            int r3 = r3.length
            int r3 = r3 + r0
            r2 = r2[r3]
            byte[][] r3 = r7.getSegments$okio()
            r0 = r3[r0]
            int r8 = r8 - r1
            int r8 = r8 + r2
            r8 = r0[r8]
            return r8
    }

    @Override // okio.ByteString
    public int lastIndexOf(@org.jetbrains.annotations.NotNull byte[] r2, int r3) {
            r1 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r2, r0)
            okio.ByteString r0 = r1.toByteString()
            int r2 = r0.lastIndexOf(r2, r3)
            return r2
    }

    @Override // okio.ByteString
    public boolean rangeEquals(int r7, @org.jetbrains.annotations.NotNull okio.ByteString r8, int r9, int r10) {
            r6 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r8, r0)
            r0 = 0
            if (r7 < 0) goto L53
            int r1 = r6.size()
            int r1 = r1 - r10
            if (r7 <= r1) goto L10
            goto L53
        L10:
            int r10 = r10 + r7
            int r1 = okio.internal.SegmentedByteString.segment(r6, r7)
        L15:
            if (r7 >= r10) goto L51
            if (r1 != 0) goto L1b
            r2 = 0
            goto L23
        L1b:
            int[] r2 = r6.getDirectory$okio()
            int r3 = r1 + (-1)
            r2 = r2[r3]
        L23:
            int[] r3 = r6.getDirectory$okio()
            r3 = r3[r1]
            int r3 = r3 - r2
            int[] r4 = r6.getDirectory$okio()
            byte[][] r5 = r6.getSegments$okio()
            int r5 = r5.length
            int r5 = r5 + r1
            r4 = r4[r5]
            int r3 = r3 + r2
            int r3 = java.lang.Math.min(r10, r3)
            int r3 = r3 - r7
            int r2 = r7 - r2
            int r4 = r4 + r2
            byte[][] r2 = r6.getSegments$okio()
            r2 = r2[r1]
            boolean r2 = r8.rangeEquals(r9, r2, r4, r3)
            if (r2 != 0) goto L4c
            return r0
        L4c:
            int r9 = r9 + r3
            int r7 = r7 + r3
            int r1 = r1 + 1
            goto L15
        L51:
            r7 = 1
            return r7
        L53:
            return r0
    }

    @Override // okio.ByteString
    public boolean rangeEquals(int r7, @org.jetbrains.annotations.NotNull byte[] r8, int r9, int r10) {
            r6 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r8, r0)
            r0 = 0
            if (r7 < 0) goto L59
            int r1 = r6.size()
            int r1 = r1 - r10
            if (r7 > r1) goto L59
            if (r9 < 0) goto L59
            int r1 = r8.length
            int r1 = r1 - r10
            if (r9 <= r1) goto L16
            goto L59
        L16:
            int r10 = r10 + r7
            int r1 = okio.internal.SegmentedByteString.segment(r6, r7)
        L1b:
            if (r7 >= r10) goto L57
            if (r1 != 0) goto L21
            r2 = 0
            goto L29
        L21:
            int[] r2 = r6.getDirectory$okio()
            int r3 = r1 + (-1)
            r2 = r2[r3]
        L29:
            int[] r3 = r6.getDirectory$okio()
            r3 = r3[r1]
            int r3 = r3 - r2
            int[] r4 = r6.getDirectory$okio()
            byte[][] r5 = r6.getSegments$okio()
            int r5 = r5.length
            int r5 = r5 + r1
            r4 = r4[r5]
            int r3 = r3 + r2
            int r3 = java.lang.Math.min(r10, r3)
            int r3 = r3 - r7
            int r2 = r7 - r2
            int r4 = r4 + r2
            byte[][] r2 = r6.getSegments$okio()
            r2 = r2[r1]
            boolean r2 = okio.SegmentedByteString.arrayRangeEquals(r2, r4, r8, r9, r3)
            if (r2 != 0) goto L52
            return r0
        L52:
            int r9 = r9 + r3
            int r7 = r7 + r3
            int r1 = r1 + 1
            goto L1b
        L57:
            r7 = 1
            return r7
        L59:
            return r0
    }

    @Override // okio.ByteString
    @org.jetbrains.annotations.NotNull
    public java.lang.String string(@org.jetbrains.annotations.NotNull java.nio.charset.Charset r2) {
            r1 = this;
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.g0.p(r2, r0)
            okio.ByteString r0 = r1.toByteString()
            java.lang.String r2 = r0.string(r2)
            return r2
    }

    @Override // okio.ByteString
    @org.jetbrains.annotations.NotNull
    public okio.ByteString substring(int r11, int r12) {
            r10 = this;
            int r12 = okio.SegmentedByteString.resolveDefaultParameter(r10, r12)
            if (r11 < 0) goto Lc8
            int r0 = r10.size()
            java.lang.String r1 = "endIndex="
            if (r12 > r0) goto L9e
            int r0 = r12 - r11
            if (r0 < 0) goto L7d
            if (r11 != 0) goto L1b
            int r1 = r10.size()
            if (r12 != r1) goto L1b
            return r10
        L1b:
            if (r11 != r12) goto L20
            okio.ByteString r11 = okio.ByteString.EMPTY
            return r11
        L20:
            int r1 = okio.internal.SegmentedByteString.segment(r10, r11)
            int r12 = r12 + (-1)
            int r12 = okio.internal.SegmentedByteString.segment(r10, r12)
            byte[][] r2 = r10.getSegments$okio()
            int r3 = r12 + 1
            java.lang.Object[] r2 = kotlin.collections.n.l1(r2, r1, r3)
            byte[][] r2 = (byte[][]) r2
            int r3 = r2.length
            int r3 = r3 * 2
            int[] r3 = new int[r3]
            r4 = 0
            if (r1 > r12) goto L65
            r6 = r1
            r5 = 0
        L40:
            int[] r7 = r10.getDirectory$okio()
            r7 = r7[r6]
            int r7 = r7 - r11
            int r7 = java.lang.Math.min(r7, r0)
            r3[r5] = r7
            int r7 = r5 + 1
            int r8 = r2.length
            int r5 = r5 + r8
            int[] r8 = r10.getDirectory$okio()
            byte[][] r9 = r10.getSegments$okio()
            int r9 = r9.length
            int r9 = r9 + r6
            r8 = r8[r9]
            r3[r5] = r8
            if (r6 == r12) goto L65
            int r6 = r6 + 1
            r5 = r7
            goto L40
        L65:
            if (r1 != 0) goto L68
            goto L70
        L68:
            int[] r12 = r10.getDirectory$okio()
            int r1 = r1 + (-1)
            r4 = r12[r1]
        L70:
            int r12 = r2.length
            r0 = r3[r12]
            int r11 = r11 - r4
            int r0 = r0 + r11
            r3[r12] = r0
            okio.SegmentedByteString r11 = new okio.SegmentedByteString
            r11.<init>(r2, r3)
            return r11
        L7d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r12)
            java.lang.String r12 = " < beginIndex="
            r0.append(r12)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r11.toString()
            r12.<init>(r11)
            throw r12
        L9e:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r1)
            r11.append(r12)
            java.lang.String r12 = " > length("
            r11.append(r12)
            int r12 = r10.size()
            r11.append(r12)
            r12 = 41
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r11.toString()
            r12.<init>(r11)
            throw r12
        Lc8:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "beginIndex="
            r12.append(r0)
            r12.append(r11)
            java.lang.String r11 = " < 0"
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r11.toString()
            r12.<init>(r11)
            throw r12
    }

    @Override // okio.ByteString
    @org.jetbrains.annotations.NotNull
    public okio.ByteString toAsciiLowercase() {
            r1 = this;
            okio.ByteString r0 = r1.toByteString()
            okio.ByteString r0 = r0.toAsciiLowercase()
            return r0
    }

    @Override // okio.ByteString
    @org.jetbrains.annotations.NotNull
    public okio.ByteString toAsciiUppercase() {
            r1 = this;
            okio.ByteString r0 = r1.toByteString()
            okio.ByteString r0 = r0.toAsciiUppercase()
            return r0
    }

    @Override // okio.ByteString
    @org.jetbrains.annotations.NotNull
    public byte[] toByteArray() {
            r9 = this;
            int r0 = r9.size()
            byte[] r0 = new byte[r0]
            byte[][] r1 = r9.getSegments$okio()
            int r1 = r1.length
            r2 = 0
            r3 = 0
            r4 = 0
        Le:
            if (r2 >= r1) goto L30
            int[] r5 = r9.getDirectory$okio()
            int r6 = r1 + r2
            r5 = r5[r6]
            int[] r6 = r9.getDirectory$okio()
            r6 = r6[r2]
            byte[][] r7 = r9.getSegments$okio()
            r7 = r7[r2]
            int r3 = r6 - r3
            int r8 = r5 + r3
            kotlin.collections.n.v0(r7, r0, r4, r5, r8)
            int r4 = r4 + r3
            int r2 = r2 + 1
            r3 = r6
            goto Le
        L30:
            return r0
    }

    @Override // okio.ByteString
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            okio.ByteString r0 = r1.toByteString()
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // okio.ByteString
    public void write(@org.jetbrains.annotations.NotNull java.io.OutputStream r7) throws java.io.IOException {
            r6 = this;
            java.lang.String r0 = "out"
            kotlin.jvm.internal.g0.p(r7, r0)
            byte[][] r0 = r6.getSegments$okio()
            int r0 = r0.length
            r1 = 0
            r2 = 0
        Lc:
            if (r1 >= r0) goto L2b
            int[] r3 = r6.getDirectory$okio()
            int r4 = r0 + r1
            r3 = r3[r4]
            int[] r4 = r6.getDirectory$okio()
            r4 = r4[r1]
            byte[][] r5 = r6.getSegments$okio()
            r5 = r5[r1]
            int r2 = r4 - r2
            r7.write(r5, r3, r2)
            int r1 = r1 + 1
            r2 = r4
            goto Lc
        L2b:
            return
    }

    @Override // okio.ByteString
    public void write$okio(@org.jetbrains.annotations.NotNull okio.Buffer r12, int r13, int r14) {
            r11 = this;
            java.lang.String r0 = "buffer"
            kotlin.jvm.internal.g0.p(r12, r0)
            int r0 = r13 + r14
            int r1 = okio.internal.SegmentedByteString.segment(r11, r13)
        Lb:
            if (r13 >= r0) goto L5f
            if (r1 != 0) goto L11
            r2 = 0
            goto L19
        L11:
            int[] r2 = r11.getDirectory$okio()
            int r3 = r1 + (-1)
            r2 = r2[r3]
        L19:
            int[] r3 = r11.getDirectory$okio()
            r3 = r3[r1]
            int r3 = r3 - r2
            int[] r4 = r11.getDirectory$okio()
            byte[][] r5 = r11.getSegments$okio()
            int r5 = r5.length
            int r5 = r5 + r1
            r4 = r4[r5]
            int r3 = r3 + r2
            int r3 = java.lang.Math.min(r0, r3)
            int r3 = r3 - r13
            int r2 = r13 - r2
            int r7 = r4 + r2
            byte[][] r2 = r11.getSegments$okio()
            r6 = r2[r1]
            okio.Segment r5 = new okio.Segment
            int r8 = r7 + r3
            r9 = 1
            r10 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            okio.Segment r2 = r12.head
            if (r2 != 0) goto L50
            r5.prev = r5
            r5.next = r5
            r12.head = r5
            goto L5b
        L50:
            kotlin.jvm.internal.g0.m(r2)
            okio.Segment r2 = r2.prev
            kotlin.jvm.internal.g0.m(r2)
            r2.push(r5)
        L5b:
            int r13 = r13 + r3
            int r1 = r1 + 1
            goto Lb
        L5f:
            long r0 = r12.size()
            long r13 = (long) r14
            long r0 = r0 + r13
            r12.setSize$okio(r0)
            return
    }
}
