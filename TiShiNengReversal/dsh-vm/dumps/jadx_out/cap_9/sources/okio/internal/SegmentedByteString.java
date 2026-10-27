package okio.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.JvmName(name = "-SegmentedByteString")
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSegmentedByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedByteString.kt\nokio/internal/-SegmentedByteString\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,250:1\n63#1,12:252\n85#1,14:264\n85#1,14:278\n85#1,14:292\n85#1,14:306\n63#1,12:320\n1#2:251\n*S KotlinDebug\n*F\n+ 1 SegmentedByteString.kt\nokio/internal/-SegmentedByteString\n*L\n147#1:252,12\n160#1:264,14\n182#1:278,14\n202#1:292,14\n219#1:306,14\n239#1:320,12\n*E\n"})
/* renamed from: okio.internal.-SegmentedByteString, reason: invalid class name */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class SegmentedByteString {
    public SegmentedByteString() {
            r1 = this;
            r1.<init>()
            return
    }

    public static final int binarySearch(@org.jetbrains.annotations.NotNull int[] r2, int r3, int r4, int r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r5 = r5 + (-1)
        L7:
            if (r4 > r5) goto L1a
            int r0 = r4 + r5
            int r0 = r0 >>> 1
            r1 = r2[r0]
            if (r1 >= r3) goto L14
            int r4 = r0 + 1
            goto L7
        L14:
            if (r1 <= r3) goto L19
            int r5 = r0 + (-1)
            goto L7
        L19:
            return r0
        L1a:
            int r2 = -r4
            int r2 = r2 + (-1)
            return r2
    }

    public static final void commonCopyInto(@org.jetbrains.annotations.NotNull okio.C0029SegmentedByteString r11, int r12, @org.jetbrains.annotations.NotNull byte[] r13, int r14, int r15) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r11, r0)
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
            int r0 = segment(r11, r12)
        L21:
            if (r12 >= r15) goto L5b
            if (r0 != 0) goto L27
            r1 = 0
            goto L2f
        L27:
            int[] r1 = r11.getDirectory$okio()
            int r2 = r0 + (-1)
            r1 = r1[r2]
        L2f:
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
            goto L21
        L5b:
            return
    }

    public static final boolean commonEquals(@org.jetbrains.annotations.NotNull okio.C0029SegmentedByteString r4, @org.jetbrains.annotations.Nullable java.lang.Object r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            r0 = 1
            if (r5 != r4) goto L9
            return r0
        L9:
            boolean r1 = r5 instanceof okio.ByteString
            r2 = 0
            if (r1 == 0) goto L25
            okio.ByteString r5 = (okio.ByteString) r5
            int r1 = r5.size()
            int r3 = r4.size()
            if (r1 != r3) goto L25
            int r1 = r4.size()
            boolean r4 = r4.rangeEquals(r2, r5, r2, r1)
            if (r4 == 0) goto L25
            return r0
        L25:
            return r2
    }

    public static final int commonGetSize(@org.jetbrains.annotations.NotNull okio.C0029SegmentedByteString r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int[] r0 = r1.getDirectory$okio()
            byte[][] r1 = r1.getSegments$okio()
            int r1 = r1.length
            int r1 = r1 + (-1)
            r1 = r0[r1]
            return r1
    }

    public static final int commonHashCode(@org.jetbrains.annotations.NotNull okio.C0029SegmentedByteString r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r8, r0)
            int r0 = r8.getHashCode$okio()
            if (r0 == 0) goto Lc
            return r0
        Lc:
            byte[][] r0 = r8.getSegments$okio()
            int r0 = r0.length
            r1 = 0
            r2 = 1
            r2 = 0
            r3 = 1
        L15:
            if (r1 >= r0) goto L3c
            int[] r4 = r8.getDirectory$okio()
            int r5 = r0 + r1
            r4 = r4[r5]
            int[] r5 = r8.getDirectory$okio()
            r5 = r5[r1]
            byte[][] r6 = r8.getSegments$okio()
            r6 = r6[r1]
            int r2 = r5 - r2
            int r2 = r2 + r4
        L2e:
            if (r4 >= r2) goto L38
            int r3 = r3 * 31
            r7 = r6[r4]
            int r3 = r3 + r7
            int r4 = r4 + 1
            goto L2e
        L38:
            int r1 = r1 + 1
            r2 = r5
            goto L15
        L3c:
            r8.setHashCode$okio(r3)
            return r3
    }

    public static final byte commonInternalGet(@org.jetbrains.annotations.NotNull okio.C0029SegmentedByteString r7, int r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            int[] r0 = r7.getDirectory$okio()
            byte[][] r1 = r7.getSegments$okio()
            int r1 = r1.length
            int r1 = r1 + (-1)
            r0 = r0[r1]
            long r1 = (long) r0
            long r3 = (long) r8
            r5 = 1
            okio.SegmentedByteString.checkOffsetAndCount(r1, r3, r5)
            int r0 = segment(r7, r8)
            if (r0 != 0) goto L21
            r1 = 0
            goto L29
        L21:
            int[] r1 = r7.getDirectory$okio()
            int r2 = r0 + (-1)
            r1 = r1[r2]
        L29:
            int[] r2 = r7.getDirectory$okio()
            byte[][] r3 = r7.getSegments$okio()
            int r3 = r3.length
            int r3 = r3 + r0
            r2 = r2[r3]
            byte[][] r7 = r7.getSegments$okio()
            r7 = r7[r0]
            int r8 = r8 - r1
            int r8 = r8 + r2
            r7 = r7[r8]
            return r7
    }

    public static final boolean commonRangeEquals(@org.jetbrains.annotations.NotNull okio.C0029SegmentedByteString r6, int r7, @org.jetbrains.annotations.NotNull okio.ByteString r8, int r9, int r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r8, r0)
            r0 = 0
            if (r7 < 0) goto L58
            int r1 = r6.size()
            int r1 = r1 - r10
            if (r7 <= r1) goto L15
            goto L58
        L15:
            int r10 = r10 + r7
            int r1 = segment(r6, r7)
        L1a:
            if (r7 >= r10) goto L56
            if (r1 != 0) goto L20
            r2 = 0
            goto L28
        L20:
            int[] r2 = r6.getDirectory$okio()
            int r3 = r1 + (-1)
            r2 = r2[r3]
        L28:
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
            if (r2 != 0) goto L51
            return r0
        L51:
            int r9 = r9 + r3
            int r7 = r7 + r3
            int r1 = r1 + 1
            goto L1a
        L56:
            r6 = 1
            return r6
        L58:
            return r0
    }

    public static final boolean commonRangeEquals(@org.jetbrains.annotations.NotNull okio.C0029SegmentedByteString r6, int r7, @org.jetbrains.annotations.NotNull byte[] r8, int r9, int r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r8, r0)
            r0 = 0
            if (r7 < 0) goto L5e
            int r1 = r6.size()
            int r1 = r1 - r10
            if (r7 > r1) goto L5e
            if (r9 < 0) goto L5e
            int r1 = r8.length
            int r1 = r1 - r10
            if (r9 <= r1) goto L1b
            goto L5e
        L1b:
            int r10 = r10 + r7
            int r1 = segment(r6, r7)
        L20:
            if (r7 >= r10) goto L5c
            if (r1 != 0) goto L26
            r2 = 0
            goto L2e
        L26:
            int[] r2 = r6.getDirectory$okio()
            int r3 = r1 + (-1)
            r2 = r2[r3]
        L2e:
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
            if (r2 != 0) goto L57
            return r0
        L57:
            int r9 = r9 + r3
            int r7 = r7 + r3
            int r1 = r1 + 1
            goto L20
        L5c:
            r6 = 1
            return r6
        L5e:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.ByteString commonSubstring(@org.jetbrains.annotations.NotNull okio.C0029SegmentedByteString r10, int r11, int r12) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r10, r0)
            int r12 = okio.SegmentedByteString.resolveDefaultParameter(r10, r12)
            if (r11 < 0) goto Lcd
            int r0 = r10.size()
            java.lang.String r1 = "endIndex="
            if (r12 > r0) goto La3
            int r0 = r12 - r11
            if (r0 < 0) goto L82
            if (r11 != 0) goto L20
            int r1 = r10.size()
            if (r12 != r1) goto L20
            return r10
        L20:
            if (r11 != r12) goto L25
            okio.ByteString r10 = okio.ByteString.EMPTY
            return r10
        L25:
            int r1 = segment(r10, r11)
            int r12 = r12 + (-1)
            int r12 = segment(r10, r12)
            byte[][] r2 = r10.getSegments$okio()
            int r3 = r12 + 1
            java.lang.Object[] r2 = kotlin.collections.n.l1(r2, r1, r3)
            byte[][] r2 = (byte[][]) r2
            int r3 = r2.length
            int r3 = r3 * 2
            int[] r3 = new int[r3]
            r4 = 0
            if (r1 > r12) goto L6a
            r6 = r1
            r5 = 0
        L45:
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
            if (r6 == r12) goto L6a
            int r6 = r6 + 1
            r5 = r7
            goto L45
        L6a:
            if (r1 != 0) goto L6d
            goto L75
        L6d:
            int[] r10 = r10.getDirectory$okio()
            int r1 = r1 + (-1)
            r4 = r10[r1]
        L75:
            int r10 = r2.length
            r12 = r3[r10]
            int r11 = r11 - r4
            int r12 = r12 + r11
            r3[r10] = r12
            okio.SegmentedByteString r10 = new okio.SegmentedByteString
            r10.<init>(r2, r3)
            return r10
        L82:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r1)
            r10.append(r12)
            java.lang.String r12 = " < beginIndex="
            r10.append(r12)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r11.<init>(r10)
            throw r11
        La3:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r1)
            r11.append(r12)
            java.lang.String r12 = " > length("
            r11.append(r12)
            int r10 = r10.size()
            r11.append(r10)
            r10 = 41
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r11.<init>(r10)
            throw r11
        Lcd:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = "beginIndex="
            r10.append(r12)
            r10.append(r11)
            java.lang.String r11 = " < 0"
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r11.<init>(r10)
            throw r11
    }

    @org.jetbrains.annotations.NotNull
    public static final byte[] commonToByteArray(@org.jetbrains.annotations.NotNull okio.C0029SegmentedByteString r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r9, r0)
            int r0 = r9.size()
            byte[] r0 = new byte[r0]
            byte[][] r1 = r9.getSegments$okio()
            int r1 = r1.length
            r2 = 0
            r3 = 0
            r4 = 0
        L13:
            if (r2 >= r1) goto L35
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
            goto L13
        L35:
            return r0
    }

    public static final void commonWrite(@org.jetbrains.annotations.NotNull okio.C0029SegmentedByteString r11, @org.jetbrains.annotations.NotNull okio.Buffer r12, int r13, int r14) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r11, r0)
            java.lang.String r0 = "buffer"
            kotlin.jvm.internal.g0.p(r12, r0)
            int r0 = r13 + r14
            int r1 = segment(r11, r13)
        L10:
            if (r13 >= r0) goto L64
            if (r1 != 0) goto L16
            r2 = 0
            goto L1e
        L16:
            int[] r2 = r11.getDirectory$okio()
            int r3 = r1 + (-1)
            r2 = r2[r3]
        L1e:
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
            if (r2 != 0) goto L55
            r5.prev = r5
            r5.next = r5
            r12.head = r5
            goto L60
        L55:
            kotlin.jvm.internal.g0.m(r2)
            okio.Segment r2 = r2.prev
            kotlin.jvm.internal.g0.m(r2)
            r2.push(r5)
        L60:
            int r13 = r13 + r3
            int r1 = r1 + 1
            goto L10
        L64:
            long r0 = r12.size()
            long r13 = (long) r14
            long r0 = r0 + r13
            r12.setSize$okio(r0)
            return
    }

    private static final void forEachSegment(okio.C0029SegmentedByteString r5, int r6, int r7, kotlin.jvm.functions.Function3<? super byte[], ? super java.lang.Integer, ? super java.lang.Integer, kotlin.n1> r8) {
            int r0 = segment(r5, r6)
        L4:
            if (r6 >= r7) goto L43
            if (r0 != 0) goto La
            r1 = 0
            goto L12
        La:
            int[] r1 = r5.getDirectory$okio()
            int r2 = r0 + (-1)
            r1 = r1[r2]
        L12:
            int[] r2 = r5.getDirectory$okio()
            r2 = r2[r0]
            int r2 = r2 - r1
            int[] r3 = r5.getDirectory$okio()
            byte[][] r4 = r5.getSegments$okio()
            int r4 = r4.length
            int r4 = r4 + r0
            r3 = r3[r4]
            int r2 = r2 + r1
            int r2 = java.lang.Math.min(r7, r2)
            int r2 = r2 - r6
            int r1 = r6 - r1
            int r3 = r3 + r1
            byte[][] r1 = r5.getSegments$okio()
            r1 = r1[r0]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r8.invoke(r1, r3, r4)
            int r6 = r6 + r2
            int r0 = r0 + 1
            goto L4
        L43:
            return
    }

    public static final void forEachSegment(@org.jetbrains.annotations.NotNull okio.C0029SegmentedByteString r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super byte[], ? super java.lang.Integer, ? super java.lang.Integer, kotlin.n1> r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.g0.p(r7, r0)
            byte[][] r0 = r6.getSegments$okio()
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L11:
            if (r1 >= r0) goto L38
            int[] r3 = r6.getDirectory$okio()
            int r4 = r0 + r1
            r3 = r3[r4]
            int[] r4 = r6.getDirectory$okio()
            r4 = r4[r1]
            byte[][] r5 = r6.getSegments$okio()
            r5 = r5[r1]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r2 = r4 - r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r7.invoke(r5, r3, r2)
            int r1 = r1 + 1
            r2 = r4
            goto L11
        L38:
            return
    }

    public static final int segment(@org.jetbrains.annotations.NotNull okio.C0029SegmentedByteString r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            int[] r0 = r2.getDirectory$okio()
            int r3 = r3 + 1
            byte[][] r2 = r2.getSegments$okio()
            int r2 = r2.length
            r1 = 0
            int r2 = binarySearch(r0, r3, r1, r2)
            if (r2 < 0) goto L18
            return r2
        L18:
            int r2 = ~r2
            return r2
    }
}
