package okio.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.JvmName(name = "-Buffer")
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Buffer.kt\nokio/internal/-Buffer\n+ 2 Util.kt\nokio/-SegmentedByteString\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1712:1\n110#1,20:1735\n110#1,20:1768\n110#1:1788\n112#1,18:1790\n110#1,20:1808\n73#2:1713\n73#2:1714\n73#2:1715\n73#2:1716\n73#2:1717\n73#2:1718\n73#2:1719\n73#2:1720\n73#2:1721\n73#2:1722\n73#2:1723\n73#2:1724\n82#2:1725\n82#2:1726\n76#2:1727\n76#2:1728\n76#2:1729\n76#2:1730\n76#2:1731\n76#2:1732\n76#2:1733\n76#2:1734\n85#2:1755\n88#2:1757\n73#2:1758\n73#2:1759\n73#2:1760\n73#2:1761\n73#2:1762\n73#2:1763\n73#2:1764\n73#2:1765\n73#2:1766\n73#2:1767\n88#2:1789\n85#2:1828\n1#3:1756\n*S KotlinDebug\n*F\n+ 1 Buffer.kt\nokio/internal/-Buffer\n*L\n413#1:1735,20\n1262#1:1768,20\n1305#1:1788\n1305#1:1790,18\n1341#1:1808,20\n176#1:1713\n200#1:1714\n319#1:1715\n324#1:1716\n347#1:1717\n348#1:1718\n349#1:1719\n350#1:1720\n356#1:1721\n357#1:1722\n358#1:1723\n359#1:1724\n383#1:1725\n384#1:1726\n390#1:1727\n391#1:1728\n392#1:1729\n393#1:1730\n394#1:1731\n395#1:1732\n396#1:1733\n397#1:1734\n425#1:1755\n858#1:1757\n876#1:1758\n878#1:1759\n882#1:1760\n884#1:1761\n888#1:1762\n890#1:1763\n894#1:1764\n896#1:1765\n916#1:1766\n919#1:1767\n1317#1:1789\n1658#1:1828\n*E\n"})
/* renamed from: okio.internal.-Buffer, reason: invalid class name */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class Buffer {

    @org.jetbrains.annotations.NotNull
    private static final long[] DigitCountToLargestValue = null;

    @org.jetbrains.annotations.NotNull
    private static final byte[] HEX_DIGIT_BYTES = null;
    public static final long OVERFLOW_DIGIT_START = -7;
    public static final long OVERFLOW_ZONE = -922337203685477580L;
    public static final int SEGMENTING_THRESHOLD = 4096;

    static {
            java.lang.String r0 = "0123456789abcdef"
            byte[] r0 = okio._JvmPlatformKt.asUtf8ToByteArray(r0)
            okio.internal.Buffer.HEX_DIGIT_BYTES = r0
            r0 = 20
            long[] r0 = new long[r0]
            r0 = {x0012: FILL_ARRAY_DATA , data: [-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999, 99999999999, 999999999999, 9999999999999, 99999999999999, 999999999999999, 9999999999999999, 99999999999999999, 999999999999999999, 9223372036854775807} // fill-array
            okio.internal.Buffer.DigitCountToLargestValue = r0
            return
    }

    public Buffer() {
            r1 = this;
            r1.<init>()
            return
    }

    public static final /* synthetic */ int access$countDigitsIn(long r0) {
            int r0 = countDigitsIn(r0)
            return r0
    }

    public static final void commonClear(@org.jetbrains.annotations.NotNull okio.Buffer r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            long r0 = r2.size()
            r2.skip(r0)
            return
    }

    public static final void commonClose(@org.jetbrains.annotations.NotNull okio.Buffer.UnsafeCursor r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            okio.Buffer r0 = r3.buffer
            if (r0 == 0) goto L1b
            r0 = 0
            r3.buffer = r0
            r3.setSegment$okio(r0)
            r1 = -1
            r3.offset = r1
            r3.data = r0
            r0 = -1
            r3.start = r0
            r3.end = r0
            return
        L1b:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "not attached to a buffer"
            r3.<init>(r0)
            throw r3
    }

    public static final long commonCompleteSegmentByteCount(@org.jetbrains.annotations.NotNull okio.Buffer r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            long r0 = r5.size()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L10
            return r2
        L10:
            okio.Segment r5 = r5.head
            kotlin.jvm.internal.g0.m(r5)
            okio.Segment r5 = r5.prev
            kotlin.jvm.internal.g0.m(r5)
            int r2 = r5.limit
            r3 = 8192(0x2000, float:1.148E-41)
            if (r2 >= r3) goto L29
            boolean r3 = r5.owner
            if (r3 == 0) goto L29
            int r5 = r5.pos
            int r2 = r2 - r5
            long r2 = (long) r2
            long r0 = r0 - r2
        L29:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Buffer commonCopy(@org.jetbrains.annotations.NotNull okio.Buffer r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r6, r0)
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            long r1 = r6.size()
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L15
            return r0
        L15:
            okio.Segment r1 = r6.head
            kotlin.jvm.internal.g0.m(r1)
            okio.Segment r2 = r1.sharedCopy()
            r0.head = r2
            r2.prev = r2
            r2.next = r2
            okio.Segment r3 = r1.next
        L26:
            if (r3 == r1) goto L3a
            okio.Segment r4 = r2.prev
            kotlin.jvm.internal.g0.m(r4)
            kotlin.jvm.internal.g0.m(r3)
            okio.Segment r5 = r3.sharedCopy()
            r4.push(r5)
            okio.Segment r3 = r3.next
            goto L26
        L3a:
            long r1 = r6.size()
            r0.setSize$okio(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Buffer commonCopyTo(@org.jetbrains.annotations.NotNull okio.Buffer r8, @org.jetbrains.annotations.NotNull okio.Buffer r9, long r10, long r12) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "out"
            kotlin.jvm.internal.g0.p(r9, r0)
            long r1 = r8.size()
            r3 = r10
            r5 = r12
            okio.SegmentedByteString.checkOffsetAndCount(r1, r3, r5)
            r10 = 0
            int r12 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r12 != 0) goto L1a
            goto L76
        L1a:
            long r12 = r9.size()
            long r12 = r12 + r5
            r9.setSize$okio(r12)
            okio.Segment r12 = r8.head
        L24:
            kotlin.jvm.internal.g0.m(r12)
            int r13 = r12.limit
            int r0 = r12.pos
            int r1 = r13 - r0
            long r1 = (long) r1
            int r7 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r7 < 0) goto L38
            int r13 = r13 - r0
            long r0 = (long) r13
            long r3 = r3 - r0
            okio.Segment r12 = r12.next
            goto L24
        L38:
            r0 = r12
            r12 = r5
        L3a:
            int r1 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r1 <= 0) goto L76
            kotlin.jvm.internal.g0.m(r0)
            okio.Segment r1 = r0.sharedCopy()
            int r2 = r1.pos
            int r4 = (int) r3
            int r2 = r2 + r4
            r1.pos = r2
            int r3 = (int) r12
            int r2 = r2 + r3
            int r3 = r1.limit
            int r2 = java.lang.Math.min(r2, r3)
            r1.limit = r2
            okio.Segment r2 = r9.head
            if (r2 != 0) goto L60
            r1.prev = r1
            r1.next = r1
            r9.head = r1
            goto L6b
        L60:
            kotlin.jvm.internal.g0.m(r2)
            okio.Segment r2 = r2.prev
            kotlin.jvm.internal.g0.m(r2)
            r2.push(r1)
        L6b:
            int r2 = r1.limit
            int r1 = r1.pos
            int r2 = r2 - r1
            long r1 = (long) r2
            long r12 = r12 - r1
            okio.Segment r0 = r0.next
            r3 = r10
            goto L3a
        L76:
            return r8
    }

    public static final boolean commonEquals(@org.jetbrains.annotations.NotNull okio.Buffer r18, @org.jetbrains.annotations.Nullable java.lang.Object r19) {
            r0 = r18
            r1 = r19
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.g0.p(r0, r2)
            r2 = 1
            if (r0 != r1) goto Ld
            return r2
        Ld:
            boolean r3 = r1 instanceof okio.Buffer
            r4 = 0
            if (r3 != 0) goto L13
            return r4
        L13:
            long r5 = r0.size()
            okio.Buffer r1 = (okio.Buffer) r1
            long r7 = r1.size()
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L22
            return r4
        L22:
            long r5 = r0.size()
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L2d
            return r2
        L2d:
            okio.Segment r3 = r0.head
            kotlin.jvm.internal.g0.m(r3)
            okio.Segment r1 = r1.head
            kotlin.jvm.internal.g0.m(r1)
            int r5 = r3.pos
            int r6 = r1.pos
            r9 = r7
        L3c:
            long r11 = r0.size()
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 >= 0) goto L83
            int r11 = r3.limit
            int r11 = r11 - r5
            int r12 = r1.limit
            int r12 = r12 - r6
            int r11 = java.lang.Math.min(r11, r12)
            long r11 = (long) r11
            r13 = r7
        L50:
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 >= 0) goto L6b
            byte[] r15 = r3.data
            int r16 = r5 + 1
            r5 = r15[r5]
            byte[] r15 = r1.data
            int r17 = r6 + 1
            r6 = r15[r6]
            if (r5 == r6) goto L63
            return r4
        L63:
            r5 = 1
            long r13 = r13 + r5
            r5 = r16
            r6 = r17
            goto L50
        L6b:
            int r13 = r3.limit
            if (r5 != r13) goto L76
            okio.Segment r3 = r3.next
            kotlin.jvm.internal.g0.m(r3)
            int r5 = r3.pos
        L76:
            int r13 = r1.limit
            if (r6 != r13) goto L81
            okio.Segment r1 = r1.next
            kotlin.jvm.internal.g0.m(r1)
            int r6 = r1.pos
        L81:
            long r9 = r9 + r11
            goto L3c
        L83:
            return r2
    }

    public static final long commonExpandBuffer(@org.jetbrains.annotations.NotNull okio.Buffer.UnsafeCursor r9, int r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r9, r0)
            if (r10 <= 0) goto L62
            r0 = 8192(0x2000, float:1.148E-41)
            if (r10 > r0) goto L47
            okio.Buffer r1 = r9.buffer
            if (r1 == 0) goto L3f
            boolean r2 = r9.readWrite
            if (r2 == 0) goto L37
            long r2 = r1.size()
            okio.Segment r10 = r1.writableSegment$okio(r10)
            int r4 = r10.limit
            int r4 = 8192 - r4
            r10.limit = r0
            long r5 = (long) r4
            long r7 = r2 + r5
            r1.setSize$okio(r7)
            r9.setSegment$okio(r10)
            r9.offset = r2
            byte[] r10 = r10.data
            r9.data = r10
            int r10 = 8192 - r4
            r9.start = r10
            r9.end = r0
            return r5
        L37:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "expandBuffer() only permitted for read/write buffers"
            r9.<init>(r10)
            throw r9
        L3f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "not attached to a buffer"
            r9.<init>(r10)
            throw r9
        L47:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "minByteCount > Segment.SIZE: "
            r9.append(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        L62:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "minByteCount <= 0: "
            r9.append(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
    }

    public static final byte commonGet(@org.jetbrains.annotations.NotNull okio.Buffer r7, long r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            long r1 = r7.size()
            r5 = 1
            r3 = r8
            okio.SegmentedByteString.checkOffsetAndCount(r1, r3, r5)
            okio.Segment r8 = r7.head
            if (r8 == 0) goto L61
            long r0 = r7.size()
            long r0 = r0 - r3
            int r9 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r9 >= 0) goto L3f
            long r0 = r7.size()
        L20:
            int r7 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r7 <= 0) goto L31
            okio.Segment r8 = r8.prev
            kotlin.jvm.internal.g0.m(r8)
            int r7 = r8.limit
            int r9 = r8.pos
            int r7 = r7 - r9
            long r5 = (long) r7
            long r0 = r0 - r5
            goto L20
        L31:
            kotlin.jvm.internal.g0.m(r8)
            byte[] r7 = r8.data
            int r8 = r8.pos
            long r8 = (long) r8
            long r8 = r8 + r3
            long r8 = r8 - r0
            int r9 = (int) r8
            r7 = r7[r9]
            return r7
        L3f:
            r0 = 0
        L41:
            int r7 = r8.limit
            int r9 = r8.pos
            int r7 = r7 - r9
            long r5 = (long) r7
            long r5 = r5 + r0
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 > 0) goto L53
            okio.Segment r8 = r8.next
            kotlin.jvm.internal.g0.m(r8)
            r0 = r5
            goto L41
        L53:
            kotlin.jvm.internal.g0.m(r8)
            byte[] r7 = r8.data
            int r8 = r8.pos
            long r8 = (long) r8
            long r8 = r8 + r3
            long r8 = r8 - r0
            int r9 = (int) r8
            r7 = r7[r9]
            return r7
        L61:
            r7 = 0
            kotlin.jvm.internal.g0.m(r7)
            throw r7
    }

    public static final int commonHashCode(@org.jetbrains.annotations.NotNull okio.Buffer r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            okio.Segment r0 = r5.head
            if (r0 != 0) goto Lb
            r5 = 0
            return r5
        Lb:
            r1 = 1
        Lc:
            int r2 = r0.pos
            int r3 = r0.limit
        L10:
            if (r2 >= r3) goto L1c
            int r1 = r1 * 31
            byte[] r4 = r0.data
            r4 = r4[r2]
            int r1 = r1 + r4
            int r2 = r2 + 1
            goto L10
        L1c:
            okio.Segment r0 = r0.next
            kotlin.jvm.internal.g0.m(r0)
            okio.Segment r2 = r5.head
            if (r0 != r2) goto Lc
            return r1
    }

    public static final long commonIndexOf(@org.jetbrains.annotations.NotNull okio.Buffer r9, byte r10, long r11, long r13) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r9, r0)
            r0 = 0
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 > 0) goto Lc0
            int r2 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r2 > 0) goto Lc0
            long r2 = r9.size()
            int r4 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r4 <= 0) goto L1b
            long r13 = r9.size()
        L1b:
            r2 = -1
            int r4 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r4 != 0) goto L22
            return r2
        L22:
            okio.Segment r4 = r9.head
            if (r4 != 0) goto L27
            return r2
        L27:
            long r5 = r9.size()
            long r5 = r5 - r11
            int r7 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r7 >= 0) goto L7c
            long r0 = r9.size()
        L34:
            int r9 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r9 <= 0) goto L45
            okio.Segment r4 = r4.prev
            kotlin.jvm.internal.g0.m(r4)
            int r9 = r4.limit
            int r5 = r4.pos
            int r9 = r9 - r5
            long r5 = (long) r9
            long r0 = r0 - r5
            goto L34
        L45:
            int r9 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r9 >= 0) goto L7b
            byte[] r9 = r4.data
            int r5 = r4.limit
            long r5 = (long) r5
            int r7 = r4.pos
            long r7 = (long) r7
            long r7 = r7 + r13
            long r7 = r7 - r0
            long r5 = java.lang.Math.min(r5, r7)
            int r6 = (int) r5
            int r5 = r4.pos
            long r7 = (long) r5
            long r7 = r7 + r11
            long r7 = r7 - r0
            int r11 = (int) r7
        L5e:
            if (r11 >= r6) goto L6d
            r12 = r9[r11]
            if (r12 != r10) goto L6a
        L64:
            int r9 = r4.pos
            int r11 = r11 - r9
            long r9 = (long) r11
            long r9 = r9 + r0
            return r9
        L6a:
            int r11 = r11 + 1
            goto L5e
        L6d:
            int r9 = r4.limit
            int r11 = r4.pos
            int r9 = r9 - r11
            long r11 = (long) r9
            long r0 = r0 + r11
            okio.Segment r4 = r4.next
            kotlin.jvm.internal.g0.m(r4)
            r11 = r0
            goto L45
        L7b:
            return r2
        L7c:
            int r9 = r4.limit
            int r5 = r4.pos
            int r9 = r9 - r5
            long r5 = (long) r9
            long r5 = r5 + r0
            int r9 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r9 > 0) goto L8e
            okio.Segment r4 = r4.next
            kotlin.jvm.internal.g0.m(r4)
            r0 = r5
            goto L7c
        L8e:
            int r9 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r9 >= 0) goto Lbf
            byte[] r9 = r4.data
            int r5 = r4.limit
            long r5 = (long) r5
            int r7 = r4.pos
            long r7 = (long) r7
            long r7 = r7 + r13
            long r7 = r7 - r0
            long r5 = java.lang.Math.min(r5, r7)
            int r6 = (int) r5
            int r5 = r4.pos
            long r7 = (long) r5
            long r7 = r7 + r11
            long r7 = r7 - r0
            int r11 = (int) r7
        La7:
            if (r11 >= r6) goto Lb1
            r12 = r9[r11]
            if (r12 != r10) goto Lae
            goto L64
        Lae:
            int r11 = r11 + 1
            goto La7
        Lb1:
            int r9 = r4.limit
            int r11 = r4.pos
            int r9 = r9 - r11
            long r11 = (long) r9
            long r0 = r0 + r11
            okio.Segment r4 = r4.next
            kotlin.jvm.internal.g0.m(r4)
            r11 = r0
            goto L8e
        Lbf:
            return r2
        Lc0:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "size="
            r10.append(r0)
            long r0 = r9.size()
            r10.append(r0)
            java.lang.String r9 = " fromIndex="
            r10.append(r9)
            r10.append(r11)
            java.lang.String r9 = " toIndex="
            r10.append(r9)
            r10.append(r13)
            java.lang.String r9 = r10.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
    }

    public static final long commonIndexOf(@org.jetbrains.annotations.NotNull okio.Buffer r20, @org.jetbrains.annotations.NotNull okio.ByteString r21, long r22, long r24, int r26, int r27) {
            r0 = r20
            r1 = r22
            r3 = r24
            r5 = r26
            r6 = r27
            java.lang.String r7 = "<this>"
            kotlin.jvm.internal.g0.p(r0, r7)
            java.lang.String r7 = "bytes"
            r8 = r21
            kotlin.jvm.internal.g0.p(r8, r7)
            int r7 = r8.size()
            long r9 = (long) r7
            long r11 = (long) r5
            long r13 = (long) r6
            okio.SegmentedByteString.checkOffsetAndCount(r9, r11, r13)
            if (r6 <= 0) goto L163
            r9 = 0
            int r7 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r7 < 0) goto L148
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 > 0) goto L125
            long r11 = r0.size()
            int r7 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r7 <= 0) goto L38
            long r3 = r0.size()
        L38:
            r11 = -1
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 != 0) goto L3f
            return r11
        L3f:
            okio.Segment r7 = r0.head
            if (r7 != 0) goto L44
            return r11
        L44:
            long r15 = r0.size()
            long r15 = r15 - r1
            r17 = 1
            int r19 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r19 >= 0) goto Lc0
            long r9 = r0.size()
        L53:
            int r15 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r15 <= 0) goto L68
            okio.Segment r7 = r7.prev
            kotlin.jvm.internal.g0.m(r7)
            int r15 = r7.limit
            r24 = r11
            int r11 = r7.pos
            int r15 = r15 - r11
            long r11 = (long) r15
            long r9 = r9 - r11
            r11 = r24
            goto L53
        L68:
            r24 = r11
            byte[] r8 = r8.internalArray$okio()
            r11 = r8[r5]
            long r15 = r0.size()
            long r15 = r15 - r13
            long r12 = r15 + r17
            long r3 = java.lang.Math.min(r3, r12)
        L7b:
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 >= 0) goto Lbf
            byte[] r0 = r7.data
            int r12 = r7.limit
            int r13 = r7.pos
            long r13 = (long) r13
            long r13 = r13 + r3
            long r13 = r13 - r9
            r20 = r1
            r2 = r0
            long r0 = (long) r12
            long r0 = java.lang.Math.min(r0, r13)
            int r1 = (int) r0
            int r0 = r7.pos
            long r12 = (long) r0
            long r12 = r12 + r20
            long r12 = r12 - r9
            int r0 = (int) r12
        L98:
            if (r0 >= r1) goto Lb1
            r12 = r2[r0]
            if (r12 != r11) goto Lae
            int r12 = r0 + 1
            int r13 = r5 + 1
            boolean r12 = rangeEquals(r7, r12, r8, r13, r6)
            if (r12 == 0) goto Lae
        La8:
            int r1 = r7.pos
            int r0 = r0 - r1
            long r0 = (long) r0
            long r0 = r0 + r9
            return r0
        Lae:
            int r0 = r0 + 1
            goto L98
        Lb1:
            int r0 = r7.limit
            int r1 = r7.pos
            int r0 = r0 - r1
            long r0 = (long) r0
            long r9 = r9 + r0
            okio.Segment r7 = r7.next
            kotlin.jvm.internal.g0.m(r7)
            r1 = r9
            goto L7b
        Lbf:
            return r24
        Lc0:
            r24 = r11
        Lc2:
            int r11 = r7.limit
            int r12 = r7.pos
            int r11 = r11 - r12
            long r11 = (long) r11
            long r11 = r11 + r9
            int r15 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r15 > 0) goto Ld4
            okio.Segment r7 = r7.next
            kotlin.jvm.internal.g0.m(r7)
            r9 = r11
            goto Lc2
        Ld4:
            byte[] r8 = r8.internalArray$okio()
            r11 = r8[r5]
            long r15 = r0.size()
            long r15 = r15 - r13
            long r12 = r15 + r17
            long r3 = java.lang.Math.min(r3, r12)
        Le5:
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 >= 0) goto L124
            byte[] r0 = r7.data
            int r12 = r7.limit
            int r13 = r7.pos
            long r13 = (long) r13
            long r13 = r13 + r3
            long r13 = r13 - r9
            r20 = r1
            r2 = r0
            long r0 = (long) r12
            long r0 = java.lang.Math.min(r0, r13)
            int r1 = (int) r0
            int r0 = r7.pos
            long r12 = (long) r0
            long r12 = r12 + r20
            long r12 = r12 - r9
            int r0 = (int) r12
        L102:
            if (r0 >= r1) goto L116
            r12 = r2[r0]
            if (r12 != r11) goto L113
            int r12 = r0 + 1
            int r13 = r5 + 1
            boolean r12 = rangeEquals(r7, r12, r8, r13, r6)
            if (r12 == 0) goto L113
            goto La8
        L113:
            int r0 = r0 + 1
            goto L102
        L116:
            int r0 = r7.limit
            int r1 = r7.pos
            int r0 = r0 - r1
            long r0 = (long) r0
            long r9 = r9 + r0
            okio.Segment r7 = r7.next
            kotlin.jvm.internal.g0.m(r7)
            r1 = r9
            goto Le5
        L124:
            return r24
        L125:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "fromIndex > toIndex: "
            r0.append(r5)
            r0.append(r1)
            java.lang.String r1 = " > "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L148:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "fromIndex < 0: "
            r0.append(r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L163:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "byteCount == 0"
            r0.<init>(r1)
            throw r0
    }

    public static /* synthetic */ long commonIndexOf$default(okio.Buffer r8, okio.ByteString r9, long r10, long r12, int r14, int r15, int r16, java.lang.Object r17) {
            r0 = r16 & 4
            if (r0 == 0) goto L9
            r12 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L9:
            r4 = r12
            r12 = r16 & 8
            if (r12 == 0) goto L11
            r12 = 0
            r6 = 0
            goto L12
        L11:
            r6 = r14
        L12:
            r12 = r16 & 16
            if (r12 == 0) goto L1f
            int r12 = r9.size()
            r7 = r12
        L1b:
            r0 = r8
            r1 = r9
            r2 = r10
            goto L21
        L1f:
            r7 = r15
            goto L1b
        L21:
            long r8 = commonIndexOf(r0, r1, r2, r4, r6, r7)
            return r8
    }

    public static final long commonIndexOfElement(@org.jetbrains.annotations.NotNull okio.Buffer r11, @org.jetbrains.annotations.NotNull okio.ByteString r12, long r13) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r11, r0)
            java.lang.String r0 = "targetBytes"
            kotlin.jvm.internal.g0.p(r12, r0)
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 < 0) goto L138
            okio.Segment r2 = r11.head
            r3 = -1
            if (r2 != 0) goto L17
            return r3
        L17:
            long r5 = r11.size()
            long r5 = r5 - r13
            r7 = 2
            r8 = 0
            r9 = 1
            int r10 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r10 >= 0) goto Lb2
            long r0 = r11.size()
        L27:
            int r5 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r5 <= 0) goto L38
            okio.Segment r2 = r2.prev
            kotlin.jvm.internal.g0.m(r2)
            int r5 = r2.limit
            int r6 = r2.pos
            int r5 = r5 - r6
            long r5 = (long) r5
            long r0 = r0 - r5
            goto L27
        L38:
            int r5 = r12.size()
            if (r5 != r7) goto L78
            byte r5 = r12.getByte(r8)
            byte r12 = r12.getByte(r9)
        L46:
            long r6 = r11.size()
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 >= 0) goto Lb1
            byte[] r6 = r2.data
            int r7 = r2.pos
            long r7 = (long) r7
            long r7 = r7 + r13
            long r7 = r7 - r0
            int r13 = (int) r7
            int r14 = r2.limit
        L58:
            if (r13 >= r14) goto L6a
            r7 = r6[r13]
            if (r7 == r5) goto L64
            if (r7 != r12) goto L61
            goto L64
        L61:
            int r13 = r13 + 1
            goto L58
        L64:
            int r11 = r2.pos
        L66:
            int r13 = r13 - r11
            long r11 = (long) r13
            long r11 = r11 + r0
            return r11
        L6a:
            int r13 = r2.limit
            int r14 = r2.pos
            int r13 = r13 - r14
            long r13 = (long) r13
            long r0 = r0 + r13
            okio.Segment r2 = r2.next
            kotlin.jvm.internal.g0.m(r2)
            r13 = r0
            goto L46
        L78:
            byte[] r12 = r12.internalArray$okio()
        L7c:
            long r5 = r11.size()
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 >= 0) goto Lb1
            byte[] r5 = r2.data
            int r6 = r2.pos
            long r6 = (long) r6
            long r6 = r6 + r13
            long r6 = r6 - r0
            int r13 = (int) r6
            int r14 = r2.limit
        L8e:
            if (r13 >= r14) goto La3
            r6 = r5[r13]
            int r7 = r12.length
            r9 = 0
        L94:
            if (r9 >= r7) goto La0
            r10 = r12[r9]
            if (r6 != r10) goto L9d
        L9a:
            int r11 = r2.pos
            goto L66
        L9d:
            int r9 = r9 + 1
            goto L94
        La0:
            int r13 = r13 + 1
            goto L8e
        La3:
            int r13 = r2.limit
            int r14 = r2.pos
            int r13 = r13 - r14
            long r13 = (long) r13
            long r0 = r0 + r13
            okio.Segment r2 = r2.next
            kotlin.jvm.internal.g0.m(r2)
            r13 = r0
            goto L7c
        Lb1:
            return r3
        Lb2:
            int r5 = r2.limit
            int r6 = r2.pos
            int r5 = r5 - r6
            long r5 = (long) r5
            long r5 = r5 + r0
            int r10 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r10 > 0) goto Lc4
            okio.Segment r2 = r2.next
            kotlin.jvm.internal.g0.m(r2)
            r0 = r5
            goto Lb2
        Lc4:
            int r5 = r12.size()
            if (r5 != r7) goto Lff
            byte r5 = r12.getByte(r8)
            byte r12 = r12.getByte(r9)
        Ld2:
            long r6 = r11.size()
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 >= 0) goto L137
            byte[] r6 = r2.data
            int r7 = r2.pos
            long r7 = (long) r7
            long r7 = r7 + r13
            long r7 = r7 - r0
            int r13 = (int) r7
            int r14 = r2.limit
        Le4:
            if (r13 >= r14) goto Lf1
            r7 = r6[r13]
            if (r7 == r5) goto L64
            if (r7 != r12) goto Lee
            goto L64
        Lee:
            int r13 = r13 + 1
            goto Le4
        Lf1:
            int r13 = r2.limit
            int r14 = r2.pos
            int r13 = r13 - r14
            long r13 = (long) r13
            long r0 = r0 + r13
            okio.Segment r2 = r2.next
            kotlin.jvm.internal.g0.m(r2)
            r13 = r0
            goto Ld2
        Lff:
            byte[] r12 = r12.internalArray$okio()
        L103:
            long r5 = r11.size()
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 >= 0) goto L137
            byte[] r5 = r2.data
            int r6 = r2.pos
            long r6 = (long) r6
            long r6 = r6 + r13
            long r6 = r6 - r0
            int r13 = (int) r6
            int r14 = r2.limit
        L115:
            if (r13 >= r14) goto L129
            r6 = r5[r13]
            int r7 = r12.length
            r9 = 0
        L11b:
            if (r9 >= r7) goto L126
            r10 = r12[r9]
            if (r6 != r10) goto L123
            goto L9a
        L123:
            int r9 = r9 + 1
            goto L11b
        L126:
            int r13 = r13 + 1
            goto L115
        L129:
            int r13 = r2.limit
            int r14 = r2.pos
            int r13 = r13 - r14
            long r13 = (long) r13
            long r0 = r0 + r13
            okio.Segment r2 = r2.next
            kotlin.jvm.internal.g0.m(r2)
            r13 = r0
            goto L103
        L137:
            return r3
        L138:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "fromIndex < 0: "
            r11.append(r12)
            r11.append(r13)
            java.lang.String r11 = r11.toString()
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r11.toString()
            r12.<init>(r11)
            throw r12
    }

    public static final int commonNext(@org.jetbrains.annotations.NotNull okio.Buffer.UnsafeCursor r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            long r0 = r5.offset
            okio.Buffer r2 = r5.buffer
            kotlin.jvm.internal.g0.m(r2)
            long r2 = r2.size()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L2b
            long r0 = r5.offset
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L23
            r0 = 0
        L1e:
            int r5 = r5.seek(r0)
            return r5
        L23:
            int r2 = r5.end
            int r3 = r5.start
            int r2 = r2 - r3
            long r2 = (long) r2
            long r0 = r0 + r2
            goto L1e
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "no more bytes"
            r5.<init>(r0)
            throw r5
    }

    public static final boolean commonRangeEquals(@org.jetbrains.annotations.NotNull okio.Buffer r10, long r11, @org.jetbrains.annotations.NotNull okio.ByteString r13, int r14, int r15) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.g0.p(r13, r0)
            r8 = 0
            if (r15 >= 0) goto Le
            return r8
        Le:
            r3 = 0
            int r0 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r0 < 0) goto L42
            long r3 = (long) r15
            long r3 = r3 + r11
            long r5 = r10.size()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L1f
            goto L42
        L1f:
            if (r14 < 0) goto L42
            int r0 = r14 + r15
            int r3 = r13.size()
            if (r0 <= r3) goto L2a
            goto L42
        L2a:
            r9 = 1
            if (r15 != 0) goto L2e
            return r9
        L2e:
            r3 = 1
            long r3 = r3 + r11
            r0 = r10
            r1 = r13
            r6 = r14
            r7 = r15
            r4 = r3
            r2 = r11
            long r0 = commonIndexOf(r0, r1, r2, r4, r6, r7)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L42
            return r9
        L42:
            return r8
    }

    public static final int commonRead(@org.jetbrains.annotations.NotNull okio.Buffer r2, @org.jetbrains.annotations.NotNull byte[] r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 0
            int r1 = r3.length
            int r2 = r2.read(r3, r0, r1)
            return r2
    }

    public static final int commonRead(@org.jetbrains.annotations.NotNull okio.Buffer r7, @org.jetbrains.annotations.NotNull byte[] r8, int r9, int r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.g0.p(r8, r0)
            int r0 = r8.length
            long r1 = (long) r0
            long r3 = (long) r9
            long r5 = (long) r10
            okio.SegmentedByteString.checkOffsetAndCount(r1, r3, r5)
            okio.Segment r0 = r7.head
            if (r0 != 0) goto L17
            r7 = -1
            return r7
        L17:
            int r1 = r0.limit
            int r2 = r0.pos
            int r1 = r1 - r2
            int r10 = java.lang.Math.min(r10, r1)
            byte[] r1 = r0.data
            int r2 = r0.pos
            int r3 = r2 + r10
            kotlin.collections.n.v0(r1, r8, r9, r2, r3)
            int r8 = r0.pos
            int r8 = r8 + r10
            r0.pos = r8
            long r8 = r7.size()
            long r1 = (long) r10
            long r8 = r8 - r1
            r7.setSize$okio(r8)
            int r8 = r0.pos
            int r9 = r0.limit
            if (r8 != r9) goto L46
            okio.Segment r8 = r0.pop()
            r7.head = r8
            okio.SegmentPool.recycle(r0)
        L46:
            return r10
    }

    public static final long commonRead(@org.jetbrains.annotations.NotNull okio.Buffer r5, @org.jetbrains.annotations.NotNull okio.Buffer r6, long r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.g0.p(r6, r0)
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 < 0) goto L2b
            long r2 = r5.size()
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto L1b
            r5 = -1
            return r5
        L1b:
            long r0 = r5.size()
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 <= 0) goto L27
            long r7 = r5.size()
        L27:
            r6.write(r5, r7)
            return r7
        L2b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "byteCount < 0: "
            r5.append(r6)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
    }

    public static final long commonReadAll(@org.jetbrains.annotations.NotNull okio.Buffer r5, @org.jetbrains.annotations.NotNull okio.Sink r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.g0.p(r6, r0)
            long r0 = r5.size()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L17
            r6.write(r5, r0)
        L17:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Buffer.UnsafeCursor commonReadAndWriteUnsafe(@org.jetbrains.annotations.NotNull okio.Buffer r1, @org.jetbrains.annotations.NotNull okio.Buffer.UnsafeCursor r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "unsafeCursor"
            kotlin.jvm.internal.g0.p(r2, r0)
            okio.Buffer$UnsafeCursor r2 = okio.SegmentedByteString.resolveDefaultParameter(r2)
            okio.Buffer r0 = r2.buffer
            if (r0 != 0) goto L18
            r2.buffer = r1
            r1 = 1
            r2.readWrite = r1
            return r2
        L18:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "already attached to a buffer"
            r1.<init>(r2)
            throw r1
    }

    public static final byte commonReadByte(@org.jetbrains.annotations.NotNull okio.Buffer r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r9, r0)
            long r0 = r9.size()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L37
            okio.Segment r0 = r9.head
            kotlin.jvm.internal.g0.m(r0)
            int r1 = r0.pos
            int r2 = r0.limit
            byte[] r3 = r0.data
            int r4 = r1 + 1
            r1 = r3[r1]
            long r5 = r9.size()
            r7 = 1
            long r5 = r5 - r7
            r9.setSize$okio(r5)
            if (r4 != r2) goto L34
            okio.Segment r2 = r0.pop()
            r9.head = r2
            okio.SegmentPool.recycle(r0)
            return r1
        L34:
            r0.pos = r4
            return r1
        L37:
            java.io.EOFException r9 = new java.io.EOFException
            r9.<init>()
            throw r9
    }

    @org.jetbrains.annotations.NotNull
    public static final byte[] commonReadByteArray(@org.jetbrains.annotations.NotNull okio.Buffer r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            long r0 = r2.size()
            byte[] r2 = r2.readByteArray(r0)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final byte[] commonReadByteArray(@org.jetbrains.annotations.NotNull okio.Buffer r3, long r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L27
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L27
            long r0 = r3.size()
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 < 0) goto L21
            int r5 = (int) r4
            byte[] r4 = new byte[r5]
            r3.readFully(r4)
            return r4
        L21:
            java.io.EOFException r3 = new java.io.EOFException
            r3.<init>()
            throw r3
        L27:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "byteCount: "
            r3.append(r0)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.ByteString commonReadByteString(@org.jetbrains.annotations.NotNull okio.Buffer r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            long r0 = r2.size()
            okio.ByteString r2 = r2.readByteString(r0)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.ByteString commonReadByteString(@org.jetbrains.annotations.NotNull okio.Buffer r3, long r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L39
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L39
            long r0 = r3.size()
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 < 0) goto L33
            r0 = 4096(0x1000, double:2.0237E-320)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L29
            int r0 = (int) r4
            okio.ByteString r0 = r3.snapshot(r0)
            r3.skip(r4)
            return r0
        L29:
            okio.ByteString r0 = new okio.ByteString
            byte[] r3 = r3.readByteArray(r4)
            r0.<init>(r3)
            return r0
        L33:
            java.io.EOFException r3 = new java.io.EOFException
            r3.<init>()
            throw r3
        L39:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "byteCount: "
            r3.append(r0)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    public static final long commonReadDecimalLong(@org.jetbrains.annotations.NotNull okio.Buffer r19) {
            r0 = r19
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.g0.p(r0, r1)
            long r1 = r0.size()
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto Lf8
            r1 = 0
            r5 = -7
            r8 = r3
            r6 = r5
            r2 = 0
            r5 = 0
        L18:
            okio.Segment r10 = r0.head
            kotlin.jvm.internal.g0.m(r10)
            byte[] r11 = r10.data
            int r12 = r10.pos
            int r13 = r10.limit
        L23:
            if (r12 >= r13) goto L8f
            r15 = r11[r12]
            r14 = 48
            if (r15 < r14) goto L7a
            r14 = 57
            if (r15 > r14) goto L7a
            int r14 = 48 - r15
            r16 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r18 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r18 < 0) goto L4d
            if (r18 != 0) goto L44
            r17 = r3
            long r3 = (long) r14
            int r16 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r16 >= 0) goto L46
            goto L4d
        L44:
            r17 = r3
        L46:
            r3 = 10
            long r8 = r8 * r3
            long r3 = (long) r14
            long r8 = r8 + r3
            goto L86
        L4d:
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            okio.Buffer r0 = r0.writeDecimalLong(r8)
            okio.Buffer r0 = r0.writeByte(r15)
            if (r2 != 0) goto L5f
            r0.readByte()
        L5f:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.readUtf8()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L7a:
            r17 = r3
            r3 = 45
            if (r15 != r3) goto L8d
            if (r1 != 0) goto L8d
            r2 = 1
            long r6 = r6 - r2
            r2 = 1
        L86:
            int r12 = r12 + 1
            int r1 = r1 + 1
            r3 = r17
            goto L23
        L8d:
            r5 = 1
            goto L91
        L8f:
            r17 = r3
        L91:
            if (r12 != r13) goto L9d
            okio.Segment r3 = r10.pop()
            r0.head = r3
            okio.SegmentPool.recycle(r10)
            goto L9f
        L9d:
            r10.pos = r12
        L9f:
            if (r5 != 0) goto Laa
            okio.Segment r3 = r0.head
            if (r3 != 0) goto La6
            goto Laa
        La6:
            r3 = r17
            goto L18
        Laa:
            long r3 = r0.size()
            long r5 = (long) r1
            long r3 = r3 - r5
            r0.setSize$okio(r3)
            if (r2 == 0) goto Lb7
            r14 = 2
            goto Lb8
        Lb7:
            r14 = 1
        Lb8:
            if (r1 >= r14) goto Lf3
            long r3 = r0.size()
            int r1 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r1 == 0) goto Led
            if (r2 == 0) goto Lc7
            java.lang.String r1 = "Expected a digit"
            goto Lc9
        Lc7:
            java.lang.String r1 = "Expected a digit or '-'"
        Lc9:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = " but was 0x"
            r3.append(r1)
            r4 = r17
            byte r0 = r0.getByte(r4)
            java.lang.String r0 = okio.SegmentedByteString.toHexString(r0)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        Led:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        Lf3:
            if (r2 == 0) goto Lf6
            return r8
        Lf6:
            long r0 = -r8
            return r0
        Lf8:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
    }

    public static final void commonReadFully(@org.jetbrains.annotations.NotNull okio.Buffer r3, @org.jetbrains.annotations.NotNull okio.Buffer r4, long r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.g0.p(r4, r0)
            long r0 = r3.size()
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 < 0) goto L16
            r4.write(r3, r5)
            return
        L16:
            long r5 = r3.size()
            r4.write(r3, r5)
            java.io.EOFException r3 = new java.io.EOFException
            r3.<init>()
            throw r3
    }

    public static final void commonReadFully(@org.jetbrains.annotations.NotNull okio.Buffer r3, @org.jetbrains.annotations.NotNull byte[] r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.g0.p(r4, r0)
            r0 = 0
        Lb:
            int r1 = r4.length
            if (r0 >= r1) goto L1f
            int r1 = r4.length
            int r1 = r1 - r0
            int r1 = r3.read(r4, r0, r1)
            r2 = -1
            if (r1 == r2) goto L19
            int r0 = r0 + r1
            goto Lb
        L19:
            java.io.EOFException r3 = new java.io.EOFException
            r3.<init>()
            throw r3
        L1f:
            return
    }

    public static final long commonReadHexadecimalUnsignedLong(@org.jetbrains.annotations.NotNull okio.Buffer r15) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r15, r0)
            long r0 = r15.size()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lb6
            r0 = 0
            r4 = r2
            r1 = 0
        L12:
            okio.Segment r6 = r15.head
            kotlin.jvm.internal.g0.m(r6)
            byte[] r7 = r6.data
            int r8 = r6.pos
            int r9 = r6.limit
        L1d:
            if (r8 >= r9) goto L98
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L2c
            r11 = 57
            if (r10 > r11) goto L2c
            int r11 = r10 + (-48)
            goto L41
        L2c:
            r11 = 97
            if (r10 < r11) goto L37
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L37
            int r11 = r10 + (-87)
            goto L41
        L37:
            r11 = 65
            if (r10 < r11) goto L79
            r11 = 70
            if (r10 > r11) goto L79
            int r11 = r10 + (-55)
        L41:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L51
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L1d
        L51:
            okio.Buffer r15 = new okio.Buffer
            r15.<init>()
            okio.Buffer r15 = r15.writeHexadecimalUnsignedLong(r4)
            okio.Buffer r15 = r15.writeByte(r10)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Number too large: "
            r1.append(r2)
            java.lang.String r15 = r15.readUtf8()
            r1.append(r15)
            java.lang.String r15 = r1.toString()
            r0.<init>(r15)
            throw r0
        L79:
            if (r0 == 0) goto L7d
            r1 = 1
            goto L98
        L7d:
            java.lang.NumberFormatException r15 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            r0.append(r1)
            java.lang.String r1 = okio.SegmentedByteString.toHexString(r10)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L98:
            if (r8 != r9) goto La4
            okio.Segment r7 = r6.pop()
            r15.head = r7
            okio.SegmentPool.recycle(r6)
            goto La6
        La4:
            r6.pos = r8
        La6:
            if (r1 != 0) goto Lac
            okio.Segment r6 = r15.head
            if (r6 != 0) goto L12
        Lac:
            long r1 = r15.size()
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.setSize$okio(r1)
            return r4
        Lb6:
            java.io.EOFException r15 = new java.io.EOFException
            r15.<init>()
            throw r15
    }

    public static final int commonReadInt(@org.jetbrains.annotations.NotNull okio.Buffer r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r9, r0)
            long r0 = r9.size()
            r2 = 4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L7b
            okio.Segment r0 = r9.head
            kotlin.jvm.internal.g0.m(r0)
            int r1 = r0.pos
            int r4 = r0.limit
            int r5 = r4 - r1
            long r5 = (long) r5
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 >= 0) goto L41
            byte r0 = r9.readByte()
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 24
            byte r1 = r9.readByte()
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r0 = r0 | r1
            byte r1 = r9.readByte()
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            byte r9 = r9.readByte()
            r9 = r9 & 255(0xff, float:3.57E-43)
            r9 = r9 | r0
            return r9
        L41:
            byte[] r5 = r0.data
            int r6 = r1 + 1
            r7 = r5[r1]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 << 24
            int r8 = r1 + 2
            r6 = r5[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 16
            r6 = r6 | r7
            int r7 = r1 + 3
            r8 = r5[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << 8
            r6 = r6 | r8
            int r1 = r1 + 4
            r5 = r5[r7]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r5 = r5 | r6
            long r6 = r9.size()
            long r6 = r6 - r2
            r9.setSize$okio(r6)
            if (r1 != r4) goto L78
            okio.Segment r1 = r0.pop()
            r9.head = r1
            okio.SegmentPool.recycle(r0)
            return r5
        L78:
            r0.pos = r1
            return r5
        L7b:
            java.io.EOFException r9 = new java.io.EOFException
            r9.<init>()
            throw r9
    }

    public static final long commonReadLong(@org.jetbrains.annotations.NotNull okio.Buffer r15) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r15, r0)
            long r0 = r15.size()
            r2 = 8
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L9a
            okio.Segment r0 = r15.head
            kotlin.jvm.internal.g0.m(r0)
            int r1 = r0.pos
            int r4 = r0.limit
            int r5 = r4 - r1
            long r5 = (long) r5
            r7 = 32
            int r8 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r8 >= 0) goto L35
            int r0 = r15.readInt()
            long r0 = (long) r0
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            long r0 = r0 << r7
            int r15 = r15.readInt()
            long r4 = (long) r15
            long r2 = r2 & r4
            long r0 = r0 | r2
            return r0
        L35:
            byte[] r5 = r0.data
            int r6 = r1 + 1
            r8 = r5[r1]
            long r8 = (long) r8
            r10 = 255(0xff, double:1.26E-321)
            long r8 = r8 & r10
            r12 = 56
            long r8 = r8 << r12
            int r12 = r1 + 2
            r6 = r5[r6]
            long r13 = (long) r6
            long r13 = r13 & r10
            r6 = 48
            long r13 = r13 << r6
            long r8 = r8 | r13
            int r6 = r1 + 3
            r12 = r5[r12]
            long r12 = (long) r12
            long r12 = r12 & r10
            r14 = 40
            long r12 = r12 << r14
            long r8 = r8 | r12
            int r12 = r1 + 4
            r6 = r5[r6]
            long r13 = (long) r6
            long r13 = r13 & r10
            long r6 = r13 << r7
            long r6 = r6 | r8
            int r8 = r1 + 5
            r9 = r5[r12]
            long r12 = (long) r9
            long r12 = r12 & r10
            r9 = 24
            long r12 = r12 << r9
            long r6 = r6 | r12
            int r9 = r1 + 6
            r8 = r5[r8]
            long r12 = (long) r8
            long r12 = r12 & r10
            r8 = 16
            long r12 = r12 << r8
            long r6 = r6 | r12
            int r8 = r1 + 7
            r9 = r5[r9]
            long r12 = (long) r9
            long r12 = r12 & r10
            r9 = 8
            long r12 = r12 << r9
            long r6 = r6 | r12
            int r1 = r1 + r9
            r5 = r5[r8]
            long r8 = (long) r5
            long r8 = r8 & r10
            long r6 = r6 | r8
            long r8 = r15.size()
            long r8 = r8 - r2
            r15.setSize$okio(r8)
            if (r1 != r4) goto L97
            okio.Segment r1 = r0.pop()
            r15.head = r1
            okio.SegmentPool.recycle(r0)
            return r6
        L97:
            r0.pos = r1
            return r6
        L9a:
            java.io.EOFException r15 = new java.io.EOFException
            r15.<init>()
            throw r15
    }

    public static final short commonReadShort(@org.jetbrains.annotations.NotNull okio.Buffer r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r9, r0)
            long r0 = r9.size()
            r2 = 2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L56
            okio.Segment r0 = r9.head
            kotlin.jvm.internal.g0.m(r0)
            int r1 = r0.pos
            int r4 = r0.limit
            int r5 = r4 - r1
            r6 = 2
            if (r5 >= r6) goto L2e
            byte r0 = r9.readByte()
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            byte r9 = r9.readByte()
            r9 = r9 & 255(0xff, float:3.57E-43)
            r9 = r9 | r0
            short r9 = (short) r9
            return r9
        L2e:
            byte[] r5 = r0.data
            int r7 = r1 + 1
            r8 = r5[r1]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << 8
            int r1 = r1 + r6
            r5 = r5[r7]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r5 = r5 | r8
            long r6 = r9.size()
            long r6 = r6 - r2
            r9.setSize$okio(r6)
            if (r1 != r4) goto L52
            okio.Segment r1 = r0.pop()
            r9.head = r1
            okio.SegmentPool.recycle(r0)
            goto L54
        L52:
            r0.pos = r1
        L54:
            short r9 = (short) r5
            return r9
        L56:
            java.io.EOFException r9 = new java.io.EOFException
            r9.<init>()
            throw r9
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Buffer.UnsafeCursor commonReadUnsafe(@org.jetbrains.annotations.NotNull okio.Buffer r1, @org.jetbrains.annotations.NotNull okio.Buffer.UnsafeCursor r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "unsafeCursor"
            kotlin.jvm.internal.g0.p(r2, r0)
            okio.Buffer$UnsafeCursor r2 = okio.SegmentedByteString.resolveDefaultParameter(r2)
            okio.Buffer r0 = r2.buffer
            if (r0 != 0) goto L18
            r2.buffer = r1
            r1 = 0
            r2.readWrite = r1
            return r2
        L18:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "already attached to a buffer"
            r1.<init>(r2)
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String commonReadUtf8(@org.jetbrains.annotations.NotNull okio.Buffer r7, long r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 < 0) goto L67
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r3 > 0) goto L67
            long r0 = r7.size()
            int r3 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r3 < 0) goto L61
            if (r2 != 0) goto L1f
            java.lang.String r7 = ""
            return r7
        L1f:
            okio.Segment r0 = r7.head
            kotlin.jvm.internal.g0.m(r0)
            int r1 = r0.pos
            long r2 = (long) r1
            long r2 = r2 + r8
            int r4 = r0.limit
            long r4 = (long) r4
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L3b
            byte[] r7 = r7.readByteArray(r8)
            r8 = 3
            r9 = 0
            r0 = 0
            java.lang.String r7 = okio.internal._Utf8Kt.commonToUtf8String$default(r7, r0, r0, r8, r9)
            return r7
        L3b:
            byte[] r2 = r0.data
            int r3 = (int) r8
            int r4 = r1 + r3
            java.lang.String r1 = okio.internal._Utf8Kt.commonToUtf8String(r2, r1, r4)
            int r2 = r0.pos
            int r2 = r2 + r3
            r0.pos = r2
            long r2 = r7.size()
            long r2 = r2 - r8
            r7.setSize$okio(r2)
            int r8 = r0.pos
            int r9 = r0.limit
            if (r8 != r9) goto L60
            okio.Segment r8 = r0.pop()
            r7.head = r8
            okio.SegmentPool.recycle(r0)
        L60:
            return r1
        L61:
            java.io.EOFException r7 = new java.io.EOFException
            r7.<init>()
            throw r7
        L67:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "byteCount: "
            r7.append(r0)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
    }

    public static final int commonReadUtf8CodePoint(@org.jetbrains.annotations.NotNull okio.Buffer r12) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r12, r0)
            long r0 = r12.size()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lb8
            byte r0 = r12.getByte(r2)
            r1 = r0 & 128(0x80, float:1.8E-43)
            r2 = 1
            r3 = 128(0x80, float:1.8E-43)
            r4 = 65533(0xfffd, float:9.1831E-41)
            if (r1 != 0) goto L23
            r1 = r0 & 127(0x7f, float:1.78E-43)
            r5 = 0
            r5 = 1
            r6 = 0
            goto L46
        L23:
            r1 = r0 & 224(0xe0, float:3.14E-43)
            r5 = 192(0xc0, float:2.69E-43)
            if (r1 != r5) goto L2f
            r1 = r0 & 31
            r5 = 2
            r6 = 128(0x80, float:1.8E-43)
            goto L46
        L2f:
            r1 = r0 & 240(0xf0, float:3.36E-43)
            r5 = 224(0xe0, float:3.14E-43)
            if (r1 != r5) goto L3b
            r1 = r0 & 15
            r5 = 3
            r6 = 2048(0x800, float:2.87E-42)
            goto L46
        L3b:
            r1 = r0 & 248(0xf8, float:3.48E-43)
            r5 = 240(0xf0, float:3.36E-43)
            if (r1 != r5) goto Lb2
            r1 = r0 & 7
            r5 = 4
            r6 = 65536(0x10000, float:9.1835E-41)
        L46:
            long r7 = r12.size()
            long r9 = (long) r5
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 < 0) goto L7e
        L4f:
            if (r2 >= r5) goto L66
            long r7 = (long) r2
            byte r0 = r12.getByte(r7)
            r11 = r0 & 192(0xc0, float:2.69E-43)
            if (r11 != r3) goto L62
            int r1 = r1 << 6
            r0 = r0 & 63
            r1 = r1 | r0
            int r2 = r2 + 1
            goto L4f
        L62:
            r12.skip(r7)
            return r4
        L66:
            r12.skip(r9)
            r12 = 1114111(0x10ffff, float:1.561202E-39)
            if (r1 <= r12) goto L6f
            return r4
        L6f:
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r12 > r1) goto L7a
            r12 = 57344(0xe000, float:8.0356E-41)
            if (r1 >= r12) goto L7a
            return r4
        L7a:
            if (r1 >= r6) goto L7d
            return r4
        L7d:
            return r1
        L7e:
            java.io.EOFException r1 = new java.io.EOFException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "size < "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r3 = ": "
            r2.append(r3)
            long r3 = r12.size()
            r2.append(r3)
            java.lang.String r12 = " (to read code point prefixed 0x"
            r2.append(r12)
            java.lang.String r12 = okio.SegmentedByteString.toHexString(r0)
            r2.append(r12)
            r12 = 41
            r2.append(r12)
            java.lang.String r12 = r2.toString()
            r1.<init>(r12)
            throw r1
        Lb2:
            r0 = 1
            r12.skip(r0)
            return r4
        Lb8:
            java.io.EOFException r12 = new java.io.EOFException
            r12.<init>()
            throw r12
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.String commonReadUtf8Line(@org.jetbrains.annotations.NotNull okio.Buffer r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            r0 = 10
            long r0 = r5.indexOf(r0)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L16
            java.lang.String r5 = readUtf8Line(r5, r0)
            return r5
        L16:
            long r0 = r5.size()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L29
            long r0 = r5.size()
            java.lang.String r5 = r5.readUtf8(r0)
            return r5
        L29:
            r5 = 0
            return r5
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String commonReadUtf8LineStrict(@org.jetbrains.annotations.NotNull okio.Buffer r10, long r11) {
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.g0.p(r10, r1)
            r1 = 0
            int r3 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r3 < 0) goto L98
            r6 = 1
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r3 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r3 != 0) goto L18
        L16:
            r4 = r1
            goto L1b
        L18:
            long r1 = r11 + r6
            goto L16
        L1b:
            r1 = 10
            r2 = 0
            r0 = r10
            long r1 = r0.indexOf(r1, r2, r4)
            r8 = -1
            int r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r3 == 0) goto L2f
            java.lang.String r0 = readUtf8Line(r10, r1)
            return r0
        L2f:
            long r1 = r10.size()
            int r3 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r3 >= 0) goto L4e
            long r1 = r4 - r6
            byte r1 = r10.getByte(r1)
            r2 = 13
            if (r1 != r2) goto L4e
            byte r1 = r10.getByte(r4)
            r2 = 10
            if (r1 != r2) goto L4e
            java.lang.String r0 = readUtf8Line(r10, r4)
            return r0
        L4e:
            okio.Buffer r1 = new okio.Buffer
            r1.<init>()
            long r2 = r10.size()
            r4 = 32
            long r4 = (long) r4
            long r4 = java.lang.Math.min(r4, r2)
            r2 = 0
            r0 = r10
            r0.copyTo(r1, r2, r4)
            java.io.EOFException r0 = new java.io.EOFException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "\\n not found: limit="
            r2.append(r3)
            long r3 = r10.size()
            long r3 = java.lang.Math.min(r3, r11)
            r2.append(r3)
            java.lang.String r3 = " content="
            r2.append(r3)
            okio.ByteString r1 = r1.readByteString()
            java.lang.String r1 = r1.hex()
            r2.append(r1)
            r1 = 8230(0x2026, float:1.1533E-41)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L98:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "limit < 0: "
            r0.append(r1)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    public static final long commonResizeBuffer(@org.jetbrains.annotations.NotNull okio.Buffer.UnsafeCursor r15, long r16) {
            r1 = r16
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.g0.p(r15, r3)
            okio.Buffer r3 = r15.buffer
            if (r3 == 0) goto Lb2
            boolean r4 = r15.readWrite
            if (r4 == 0) goto Laa
            long r4 = r3.size()
            r6 = 0
            int r8 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r8 > 0) goto L70
            int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r8 < 0) goto L55
            long r8 = r4 - r1
        L1f:
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 <= 0) goto L47
            okio.Segment r10 = r3.head
            kotlin.jvm.internal.g0.m(r10)
            okio.Segment r10 = r10.prev
            kotlin.jvm.internal.g0.m(r10)
            int r11 = r10.limit
            int r12 = r10.pos
            int r12 = r11 - r12
            long r12 = (long) r12
            int r14 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r14 > 0) goto L43
            okio.Segment r11 = r10.pop()
            r3.head = r11
            okio.SegmentPool.recycle(r10)
            long r8 = r8 - r12
            goto L1f
        L43:
            int r6 = (int) r8
            int r11 = r11 - r6
            r10.limit = r11
        L47:
            r6 = 0
            r15.setSegment$okio(r6)
            r15.offset = r1
            r15.data = r6
            r6 = -1
            r15.start = r6
            r15.end = r6
            goto La6
        L55:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "newSize < 0: "
            r0.append(r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L70:
            if (r8 <= 0) goto La6
            long r8 = r1 - r4
            r10 = 1
            r11 = 1
        L76:
            int r12 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r12 <= 0) goto La6
            okio.Segment r12 = r3.writableSegment$okio(r10)
            int r13 = r12.limit
            int r13 = 8192 - r13
            long r13 = (long) r13
            long r13 = java.lang.Math.min(r8, r13)
            int r14 = (int) r13
            int r13 = r12.limit
            int r13 = r13 + r14
            r12.limit = r13
            long r6 = (long) r14
            long r8 = r8 - r6
            if (r11 == 0) goto La3
            r15.setSegment$okio(r12)
            r15.offset = r4
            byte[] r6 = r12.data
            r15.data = r6
            int r6 = r12.limit
            int r7 = r6 - r14
            r15.start = r7
            r15.end = r6
            r11 = 0
        La3:
            r6 = 0
            goto L76
        La6:
            r3.setSize$okio(r1)
            return r4
        Laa:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "resizeBuffer() only permitted for read/write buffers"
            r0.<init>(r1)
            throw r0
        Lb2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "not attached to a buffer"
            r0.<init>(r1)
            throw r0
    }

    public static final int commonSeek(@org.jetbrains.annotations.NotNull okio.Buffer.UnsafeCursor r12, long r13) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r12, r0)
            okio.Buffer r0 = r12.buffer
            if (r0 == 0) goto Lf2
            r1 = -1
            int r3 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r3 < 0) goto Lcf
            long r1 = r0.size()
            int r4 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r4 > 0) goto Lcf
            if (r3 == 0) goto Lc1
            long r1 = r0.size()
            int r3 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r3 != 0) goto L23
            goto Lc1
        L23:
            long r1 = r0.size()
            okio.Segment r3 = r0.head
            okio.Segment r4 = r12.getSegment$okio()
            r5 = 0
            if (r4 == 0) goto L53
            long r7 = r12.offset
            int r4 = r12.start
            okio.Segment r9 = r12.getSegment$okio()
            kotlin.jvm.internal.g0.m(r9)
            int r9 = r9.pos
            int r4 = r4 - r9
            long r9 = (long) r4
            long r7 = r7 - r9
            int r4 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r4 <= 0) goto L4d
            okio.Segment r1 = r12.getSegment$okio()
            r4 = r3
            r3 = r1
            r1 = r7
            goto L54
        L4d:
            okio.Segment r4 = r12.getSegment$okio()
            r5 = r7
            goto L54
        L53:
            r4 = r3
        L54:
            long r7 = r1 - r13
            long r9 = r13 - r5
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 <= 0) goto L71
        L5c:
            kotlin.jvm.internal.g0.m(r4)
            int r1 = r4.limit
            int r2 = r4.pos
            int r3 = r1 - r2
            long r7 = (long) r3
            long r7 = r7 + r5
            int r3 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r3 < 0) goto L87
            int r1 = r1 - r2
            long r1 = (long) r1
            long r5 = r5 + r1
            okio.Segment r4 = r4.next
            goto L5c
        L71:
            int r4 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r4 <= 0) goto L85
            kotlin.jvm.internal.g0.m(r3)
            okio.Segment r3 = r3.prev
            kotlin.jvm.internal.g0.m(r3)
            int r4 = r3.limit
            int r5 = r3.pos
            int r4 = r4 - r5
            long r4 = (long) r4
            long r1 = r1 - r4
            goto L71
        L85:
            r5 = r1
            r4 = r3
        L87:
            boolean r1 = r12.readWrite
            if (r1 == 0) goto La8
            kotlin.jvm.internal.g0.m(r4)
            boolean r1 = r4.shared
            if (r1 == 0) goto La8
            okio.Segment r1 = r4.unsharedCopy()
            okio.Segment r2 = r0.head
            if (r2 != r4) goto L9c
            r0.head = r1
        L9c:
            okio.Segment r4 = r4.push(r1)
            okio.Segment r0 = r4.prev
            kotlin.jvm.internal.g0.m(r0)
            r0.pop()
        La8:
            r12.setSegment$okio(r4)
            r12.offset = r13
            kotlin.jvm.internal.g0.m(r4)
            byte[] r0 = r4.data
            r12.data = r0
            int r0 = r4.pos
            long r13 = r13 - r5
            int r14 = (int) r13
            int r0 = r0 + r14
            r12.start = r0
            int r13 = r4.limit
            r12.end = r13
            int r13 = r13 - r0
            return r13
        Lc1:
            r0 = 0
            r12.setSegment$okio(r0)
            r12.offset = r13
            r12.data = r0
            r13 = -1
            r12.start = r13
            r12.end = r13
            return r13
        Lcf:
            java.lang.ArrayIndexOutOfBoundsException r12 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "offset="
            r1.append(r2)
            r1.append(r13)
            java.lang.String r13 = " > size="
            r1.append(r13)
            long r13 = r0.size()
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            r12.<init>(r13)
            throw r12
        Lf2:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "not attached to a buffer"
            r12.<init>(r13)
            throw r12
    }

    public static final int commonSelect(@org.jetbrains.annotations.NotNull okio.Buffer r3, @org.jetbrains.annotations.NotNull okio.Options r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.g0.p(r4, r0)
            r0 = 2
            r1 = 0
            r2 = 0
            int r0 = selectPrefix$default(r3, r4, r2, r0, r1)
            r1 = -1
            if (r0 != r1) goto L15
            return r1
        L15:
            okio.ByteString[] r4 = r4.getByteStrings$okio()
            r4 = r4[r0]
            int r4 = r4.size()
            long r1 = (long) r4
            r3.skip(r1)
            return r0
    }

    public static final void commonSkip(@org.jetbrains.annotations.NotNull okio.Buffer r7, long r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
        L5:
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 <= 0) goto L3d
            okio.Segment r0 = r7.head
            if (r0 == 0) goto L37
            int r1 = r0.limit
            int r2 = r0.pos
            int r1 = r1 - r2
            long r1 = (long) r1
            long r1 = java.lang.Math.min(r8, r1)
            int r2 = (int) r1
            long r3 = r7.size()
            long r5 = (long) r2
            long r3 = r3 - r5
            r7.setSize$okio(r3)
            long r8 = r8 - r5
            int r1 = r0.pos
            int r1 = r1 + r2
            r0.pos = r1
            int r2 = r0.limit
            if (r1 != r2) goto L5
            okio.Segment r1 = r0.pop()
            r7.head = r1
            okio.SegmentPool.recycle(r0)
            goto L5
        L37:
            java.io.EOFException r7 = new java.io.EOFException
            r7.<init>()
            throw r7
        L3d:
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.ByteString commonSnapshot(@org.jetbrains.annotations.NotNull okio.Buffer r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            long r0 = r5.size()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L1a
            long r0 = r5.size()
            int r1 = (int) r0
            okio.ByteString r5 = r5.snapshot(r1)
            return r5
        L1a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "size > Int.MAX_VALUE: "
            r0.append(r1)
            long r1 = r5.size()
            r0.append(r1)
            java.lang.String r5 = r0.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.ByteString commonSnapshot(@org.jetbrains.annotations.NotNull okio.Buffer r7, int r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            if (r8 != 0) goto La
            okio.ByteString r7 = okio.ByteString.EMPTY
            return r7
        La:
            long r0 = r7.size()
            r2 = 0
            long r4 = (long) r8
            okio.SegmentedByteString.checkOffsetAndCount(r0, r2, r4)
            okio.Segment r0 = r7.head
            r1 = 0
            r2 = 0
            r3 = 0
        L19:
            if (r2 >= r8) goto L33
            kotlin.jvm.internal.g0.m(r0)
            int r4 = r0.limit
            int r5 = r0.pos
            if (r4 == r5) goto L2b
            int r4 = r4 - r5
            int r2 = r2 + r4
            int r3 = r3 + 1
            okio.Segment r0 = r0.next
            goto L19
        L2b:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            java.lang.String r8 = "s.limit == s.pos"
            r7.<init>(r8)
            throw r7
        L33:
            byte[][] r0 = new byte[r3][]
            int r2 = r3 * 2
            int[] r2 = new int[r2]
            okio.Segment r7 = r7.head
            r4 = 0
        L3c:
            if (r1 >= r8) goto L5e
            kotlin.jvm.internal.g0.m(r7)
            byte[] r5 = r7.data
            r0[r4] = r5
            int r5 = r7.limit
            int r6 = r7.pos
            int r5 = r5 - r6
            int r1 = r1 + r5
            int r5 = java.lang.Math.min(r1, r8)
            r2[r4] = r5
            int r5 = r4 + r3
            int r6 = r7.pos
            r2[r5] = r6
            r5 = 1
            r7.shared = r5
            int r4 = r4 + r5
            okio.Segment r7 = r7.next
            goto L3c
        L5e:
            okio.SegmentedByteString r7 = new okio.SegmentedByteString
            r7.<init>(r0, r2)
            return r7
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Segment commonWritableSegment(@org.jetbrains.annotations.NotNull okio.Buffer r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 1
            if (r3 < r0) goto L37
            r0 = 8192(0x2000, float:1.148E-41)
            if (r3 > r0) goto L37
            okio.Segment r1 = r2.head
            if (r1 != 0) goto L1b
            okio.Segment r3 = okio.SegmentPool.take()
            r2.head = r3
            r3.prev = r3
            r3.next = r3
            return r3
        L1b:
            kotlin.jvm.internal.g0.m(r1)
            okio.Segment r2 = r1.prev
            kotlin.jvm.internal.g0.m(r2)
            int r1 = r2.limit
            int r1 = r1 + r3
            if (r1 > r0) goto L2e
            boolean r3 = r2.owner
            if (r3 != 0) goto L2d
            goto L2e
        L2d:
            return r2
        L2e:
            okio.Segment r3 = okio.SegmentPool.take()
            okio.Segment r2 = r2.push(r3)
            return r2
        L37:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "unexpected capacity"
            r2.<init>(r3)
            throw r2
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Buffer commonWrite(@org.jetbrains.annotations.NotNull okio.Buffer r1, @org.jetbrains.annotations.NotNull okio.ByteString r2, int r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "byteString"
            kotlin.jvm.internal.g0.p(r2, r0)
            r2.write$okio(r1, r3, r4)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Buffer commonWrite(@org.jetbrains.annotations.NotNull okio.Buffer r5, @org.jetbrains.annotations.NotNull okio.Source r6, long r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r6, r0)
        La:
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 <= 0) goto L22
            long r0 = r6.read(r5, r7)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L1c
            long r7 = r7 - r0
            goto La
        L1c:
            java.io.EOFException r5 = new java.io.EOFException
            r5.<init>()
            throw r5
        L22:
            return r5
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Buffer commonWrite(@org.jetbrains.annotations.NotNull okio.Buffer r2, @org.jetbrains.annotations.NotNull byte[] r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 0
            int r1 = r3.length
            okio.Buffer r2 = r2.write(r3, r0, r1)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Buffer commonWrite(@org.jetbrains.annotations.NotNull okio.Buffer r7, @org.jetbrains.annotations.NotNull byte[] r8, int r9, int r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r8, r0)
            int r0 = r8.length
            long r1 = (long) r0
            long r3 = (long) r9
            long r5 = (long) r10
            okio.SegmentedByteString.checkOffsetAndCount(r1, r3, r5)
            int r10 = r10 + r9
        L12:
            if (r9 >= r10) goto L33
            r0 = 1
            okio.Segment r0 = r7.writableSegment$okio(r0)
            int r1 = r10 - r9
            int r2 = r0.limit
            int r2 = 8192 - r2
            int r1 = java.lang.Math.min(r1, r2)
            byte[] r2 = r0.data
            int r3 = r0.limit
            int r4 = r9 + r1
            kotlin.collections.n.v0(r8, r2, r3, r9, r4)
            int r9 = r0.limit
            int r9 = r9 + r1
            r0.limit = r9
            r9 = r4
            goto L12
        L33:
            long r8 = r7.size()
            long r8 = r8 + r5
            r7.setSize$okio(r8)
            return r7
    }

    public static final void commonWrite(@org.jetbrains.annotations.NotNull okio.Buffer r7, @org.jetbrains.annotations.NotNull okio.Buffer r8, long r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r8, r0)
            if (r8 == r7) goto Lba
            long r1 = r8.size()
            r3 = 0
            r5 = r9
            okio.SegmentedByteString.checkOffsetAndCount(r1, r3, r5)
        L16:
            r0 = 0
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 <= 0) goto Lb9
            okio.Segment r0 = r8.head
            kotlin.jvm.internal.g0.m(r0)
            int r0 = r0.limit
            okio.Segment r1 = r8.head
            kotlin.jvm.internal.g0.m(r1)
            int r1 = r1.pos
            int r0 = r0 - r1
            long r0 = (long) r0
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 >= 0) goto L7b
            okio.Segment r0 = r7.head
            if (r0 == 0) goto L3a
            kotlin.jvm.internal.g0.m(r0)
            okio.Segment r0 = r0.prev
            goto L3b
        L3a:
            r0 = 0
        L3b:
            if (r0 == 0) goto L6f
            boolean r1 = r0.owner
            if (r1 == 0) goto L6f
            int r1 = r0.limit
            long r1 = (long) r1
            long r1 = r1 + r9
            boolean r3 = r0.shared
            if (r3 == 0) goto L4b
            r3 = 0
            goto L4d
        L4b:
            int r3 = r0.pos
        L4d:
            long r3 = (long) r3
            long r1 = r1 - r3
            r3 = 8192(0x2000, double:4.0474E-320)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L6f
            okio.Segment r1 = r8.head
            kotlin.jvm.internal.g0.m(r1)
            int r2 = (int) r9
            r1.writeTo(r0, r2)
            long r0 = r8.size()
            long r0 = r0 - r9
            r8.setSize$okio(r0)
            long r0 = r7.size()
            long r0 = r0 + r9
            r7.setSize$okio(r0)
            return
        L6f:
            okio.Segment r0 = r8.head
            kotlin.jvm.internal.g0.m(r0)
            int r1 = (int) r9
            okio.Segment r0 = r0.split(r1)
            r8.head = r0
        L7b:
            okio.Segment r0 = r8.head
            kotlin.jvm.internal.g0.m(r0)
            int r1 = r0.limit
            int r2 = r0.pos
            int r1 = r1 - r2
            long r1 = (long) r1
            okio.Segment r3 = r0.pop()
            r8.head = r3
            okio.Segment r3 = r7.head
            if (r3 != 0) goto L97
            r7.head = r0
            r0.prev = r0
            r0.next = r0
            goto La6
        L97:
            kotlin.jvm.internal.g0.m(r3)
            okio.Segment r3 = r3.prev
            kotlin.jvm.internal.g0.m(r3)
            okio.Segment r0 = r3.push(r0)
            r0.compact()
        La6:
            long r3 = r8.size()
            long r3 = r3 - r1
            r8.setSize$okio(r3)
            long r3 = r7.size()
            long r3 = r3 + r1
            r7.setSize$okio(r3)
            long r9 = r9 - r1
            goto L16
        Lb9:
            return
        Lba:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "source == this"
            r7.<init>(r8)
            throw r7
    }

    public static /* synthetic */ okio.Buffer commonWrite$default(okio.Buffer r0, okio.ByteString r1, int r2, int r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            int r3 = r1.size()
        Ld:
            java.lang.String r4 = "<this>"
            kotlin.jvm.internal.g0.p(r0, r4)
            java.lang.String r4 = "byteString"
            kotlin.jvm.internal.g0.p(r1, r4)
            r1.write$okio(r0, r2, r3)
            return r0
    }

    public static final long commonWriteAll(@org.jetbrains.annotations.NotNull okio.Buffer r7, @org.jetbrains.annotations.NotNull okio.Source r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r8, r0)
            r0 = 0
        Lc:
            r2 = 8192(0x2000, double:4.0474E-320)
            long r2 = r8.read(r7, r2)
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L1a
            long r0 = r0 + r2
            goto Lc
        L1a:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Buffer commonWriteByte(@org.jetbrains.annotations.NotNull okio.Buffer r4, int r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            r0 = 1
            okio.Segment r0 = r4.writableSegment$okio(r0)
            byte[] r1 = r0.data
            int r2 = r0.limit
            int r3 = r2 + 1
            r0.limit = r3
            byte r5 = (byte) r5
            r1[r2] = r5
            long r0 = r4.size()
            r2 = 1
            long r0 = r0 + r2
            r4.setSize$okio(r0)
            return r4
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Buffer commonWriteDecimalLong(@org.jetbrains.annotations.NotNull okio.Buffer r11, long r12) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r11, r0)
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 != 0) goto L12
            r12 = 48
            okio.Buffer r11 = r11.writeByte(r12)
            return r11
        L12:
            if (r2 >= 0) goto L22
            long r12 = -r12
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 >= 0) goto L20
            java.lang.String r12 = "-9223372036854775808"
            okio.Buffer r11 = r11.writeUtf8(r12)
            return r11
        L20:
            r2 = 1
            goto L23
        L22:
            r2 = 0
        L23:
            int r3 = access$countDigitsIn(r12)
            if (r2 == 0) goto L2b
            int r3 = r3 + 1
        L2b:
            okio.Segment r4 = r11.writableSegment$okio(r3)
            byte[] r5 = r4.data
            int r6 = r4.limit
            int r6 = r6 + r3
        L34:
            int r7 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r7 == 0) goto L4a
            r7 = 10
            long r7 = (long) r7
            long r9 = r12 % r7
            int r10 = (int) r9
            int r6 = r6 + (-1)
            byte[] r9 = getHEX_DIGIT_BYTES()
            r9 = r9[r10]
            r5[r6] = r9
            long r12 = r12 / r7
            goto L34
        L4a:
            if (r2 == 0) goto L52
            int r6 = r6 + (-1)
            r12 = 45
            r5[r6] = r12
        L52:
            int r12 = r4.limit
            int r12 = r12 + r3
            r4.limit = r12
            long r12 = r11.size()
            long r0 = (long) r3
            long r12 = r12 + r0
            r11.setSize$okio(r12)
            return r11
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Buffer commonWriteHexadecimalUnsignedLong(@org.jetbrains.annotations.NotNull okio.Buffer r12, long r13) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r12, r0)
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 != 0) goto L12
            r13 = 48
            okio.Buffer r12 = r12.writeByte(r13)
            return r12
        L12:
            r0 = 1
            long r1 = r13 >>> r0
            long r1 = r1 | r13
            r3 = 2
            long r4 = r1 >>> r3
            long r1 = r1 | r4
            r4 = 4
            long r5 = r1 >>> r4
            long r1 = r1 | r5
            r5 = 8
            long r6 = r1 >>> r5
            long r1 = r1 | r6
            r6 = 16
            long r7 = r1 >>> r6
            long r1 = r1 | r7
            r7 = 32
            long r8 = r1 >>> r7
            long r1 = r1 | r8
            long r8 = r1 >>> r0
            r10 = 6148914691236517205(0x5555555555555555, double:1.1945305291614955E103)
            long r8 = r8 & r10
            long r1 = r1 - r8
            long r8 = r1 >>> r3
            r10 = 3689348814741910323(0x3333333333333333, double:4.667261458395856E-62)
            long r8 = r8 & r10
            long r1 = r1 & r10
            long r8 = r8 + r1
            long r1 = r8 >>> r4
            long r1 = r1 + r8
            r8 = 1085102592571150095(0xf0f0f0f0f0f0f0f, double:3.815736827118017E-236)
            long r1 = r1 & r8
            long r8 = r1 >>> r5
            long r1 = r1 + r8
            long r5 = r1 >>> r6
            long r1 = r1 + r5
            r5 = 63
            long r8 = r1 & r5
            long r1 = r1 >>> r7
            long r1 = r1 & r5
            long r8 = r8 + r1
            r1 = 3
            long r1 = (long) r1
            long r8 = r8 + r1
            long r1 = (long) r4
            long r8 = r8 / r1
            int r1 = (int) r8
            okio.Segment r2 = r12.writableSegment$okio(r1)
            byte[] r3 = r2.data
            int r5 = r2.limit
            int r6 = r5 + r1
            int r6 = r6 - r0
        L67:
            if (r6 < r5) goto L79
            byte[] r0 = getHEX_DIGIT_BYTES()
            r7 = 15
            long r7 = r7 & r13
            int r8 = (int) r7
            r0 = r0[r8]
            r3[r6] = r0
            long r13 = r13 >>> r4
            int r6 = r6 + (-1)
            goto L67
        L79:
            int r13 = r2.limit
            int r13 = r13 + r1
            r2.limit = r13
            long r13 = r12.size()
            long r0 = (long) r1
            long r13 = r13 + r0
            r12.setSize$okio(r13)
            return r12
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Buffer commonWriteInt(@org.jetbrains.annotations.NotNull okio.Buffer r7, int r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            r0 = 4
            okio.Segment r1 = r7.writableSegment$okio(r0)
            byte[] r2 = r1.data
            int r3 = r1.limit
            int r4 = r3 + 1
            int r5 = r8 >>> 24
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            r2[r3] = r5
            int r5 = r3 + 2
            int r6 = r8 >>> 16
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6
            r2[r4] = r6
            int r4 = r3 + 3
            int r6 = r8 >>> 8
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6
            r2[r5] = r6
            int r3 = r3 + r0
            r8 = r8 & 255(0xff, float:3.57E-43)
            byte r8 = (byte) r8
            r2[r4] = r8
            r1.limit = r3
            long r0 = r7.size()
            r2 = 4
            long r0 = r0 + r2
            r7.setSize$okio(r0)
            return r7
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Buffer commonWriteLong(@org.jetbrains.annotations.NotNull okio.Buffer r11, long r12) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r11, r0)
            r0 = 8
            okio.Segment r1 = r11.writableSegment$okio(r0)
            byte[] r2 = r1.data
            int r3 = r1.limit
            int r4 = r3 + 1
            r5 = 56
            long r5 = r12 >>> r5
            r7 = 255(0xff, double:1.26E-321)
            long r5 = r5 & r7
            int r6 = (int) r5
            byte r5 = (byte) r6
            r2[r3] = r5
            int r5 = r3 + 2
            r6 = 48
            long r9 = r12 >>> r6
            long r9 = r9 & r7
            int r6 = (int) r9
            byte r6 = (byte) r6
            r2[r4] = r6
            int r4 = r3 + 3
            r6 = 40
            long r9 = r12 >>> r6
            long r9 = r9 & r7
            int r6 = (int) r9
            byte r6 = (byte) r6
            r2[r5] = r6
            int r5 = r3 + 4
            r6 = 32
            long r9 = r12 >>> r6
            long r9 = r9 & r7
            int r6 = (int) r9
            byte r6 = (byte) r6
            r2[r4] = r6
            int r4 = r3 + 5
            r6 = 24
            long r9 = r12 >>> r6
            long r9 = r9 & r7
            int r6 = (int) r9
            byte r6 = (byte) r6
            r2[r5] = r6
            int r5 = r3 + 6
            r6 = 16
            long r9 = r12 >>> r6
            long r9 = r9 & r7
            int r6 = (int) r9
            byte r6 = (byte) r6
            r2[r4] = r6
            int r4 = r3 + 7
            long r9 = r12 >>> r0
            long r9 = r9 & r7
            int r6 = (int) r9
            byte r6 = (byte) r6
            r2[r5] = r6
            int r3 = r3 + r0
            long r12 = r12 & r7
            int r13 = (int) r12
            byte r12 = (byte) r13
            r2[r4] = r12
            r1.limit = r3
            long r12 = r11.size()
            r0 = 8
            long r12 = r12 + r0
            r11.setSize$okio(r12)
            return r11
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Buffer commonWriteShort(@org.jetbrains.annotations.NotNull okio.Buffer r6, int r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r6, r0)
            r0 = 2
            okio.Segment r1 = r6.writableSegment$okio(r0)
            byte[] r2 = r1.data
            int r3 = r1.limit
            int r4 = r3 + 1
            int r5 = r7 >>> 8
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            r2[r3] = r5
            int r3 = r3 + r0
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r7 = (byte) r7
            r2[r4] = r7
            r1.limit = r3
            long r0 = r6.size()
            r2 = 2
            long r0 = r0 + r2
            r6.setSize$okio(r0)
            return r6
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Buffer commonWriteUtf8(@org.jetbrains.annotations.NotNull okio.Buffer r9, @org.jetbrains.annotations.NotNull java.lang.String r10, int r11, int r12) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "string"
            kotlin.jvm.internal.g0.p(r10, r0)
            if (r11 < 0) goto L16c
            if (r12 < r11) goto L149
            int r0 = r10.length()
            if (r12 > r0) goto L122
        L14:
            if (r11 >= r12) goto L121
            char r0 = r10.charAt(r11)
            r1 = 128(0x80, float:1.8E-43)
            if (r0 >= r1) goto L55
            r2 = 1
            okio.Segment r2 = r9.writableSegment$okio(r2)
            byte[] r3 = r2.data
            int r4 = r2.limit
            int r4 = r4 - r11
            int r5 = 8192 - r4
            int r5 = java.lang.Math.min(r12, r5)
            int r6 = r11 + 1
            int r11 = r11 + r4
            byte r0 = (byte) r0
            r3[r11] = r0
        L34:
            r11 = r6
            if (r11 >= r5) goto L44
            char r0 = r10.charAt(r11)
            if (r0 >= r1) goto L44
            int r6 = r11 + 1
            int r11 = r11 + r4
            byte r0 = (byte) r0
            r3[r11] = r0
            goto L34
        L44:
            int r4 = r4 + r11
            int r0 = r2.limit
            int r4 = r4 - r0
            int r0 = r0 + r4
            r2.limit = r0
            long r0 = r9.size()
            long r2 = (long) r4
            long r0 = r0 + r2
            r9.setSize$okio(r0)
            goto L14
        L55:
            r2 = 2048(0x800, float:2.87E-42)
            if (r0 >= r2) goto L81
            r2 = 2
            okio.Segment r3 = r9.writableSegment$okio(r2)
            byte[] r4 = r3.data
            int r5 = r3.limit
            int r6 = r0 >> 6
            r6 = r6 | 192(0xc0, float:2.69E-43)
            byte r6 = (byte) r6
            r4[r5] = r6
            int r6 = r5 + 1
            r0 = r0 & 63
            r0 = r0 | r1
            byte r0 = (byte) r0
            r4[r6] = r0
            int r5 = r5 + r2
            r3.limit = r5
            long r0 = r9.size()
            r2 = 2
            long r0 = r0 + r2
            r9.setSize$okio(r0)
        L7e:
            int r11 = r11 + 1
            goto L14
        L81:
            r2 = 55296(0xd800, float:7.7486E-41)
            r3 = 63
            if (r0 < r2) goto Lf1
            r2 = 57343(0xdfff, float:8.0355E-41)
            if (r0 <= r2) goto L8e
            goto Lf1
        L8e:
            int r2 = r11 + 1
            if (r2 >= r12) goto L97
            char r4 = r10.charAt(r2)
            goto L98
        L97:
            r4 = 0
        L98:
            r5 = 56319(0xdbff, float:7.892E-41)
            if (r0 > r5) goto Leb
            r5 = 56320(0xdc00, float:7.8921E-41)
            if (r5 > r4) goto Leb
            r5 = 57344(0xe000, float:8.0356E-41)
            if (r4 >= r5) goto Leb
            r0 = r0 & 1023(0x3ff, float:1.434E-42)
            int r0 = r0 << 10
            r2 = r4 & 1023(0x3ff, float:1.434E-42)
            r0 = r0 | r2
            r2 = 65536(0x10000, float:9.1835E-41)
            int r0 = r0 + r2
            r2 = 4
            okio.Segment r4 = r9.writableSegment$okio(r2)
            byte[] r5 = r4.data
            int r6 = r4.limit
            int r7 = r0 >> 18
            r7 = r7 | 240(0xf0, float:3.36E-43)
            byte r7 = (byte) r7
            r5[r6] = r7
            int r7 = r6 + 1
            int r8 = r0 >> 12
            r8 = r8 & r3
            r8 = r8 | r1
            byte r8 = (byte) r8
            r5[r7] = r8
            int r7 = r6 + 2
            int r8 = r0 >> 6
            r8 = r8 & r3
            r8 = r8 | r1
            byte r8 = (byte) r8
            r5[r7] = r8
            int r7 = r6 + 3
            r0 = r0 & r3
            r0 = r0 | r1
            byte r0 = (byte) r0
            r5[r7] = r0
            int r6 = r6 + r2
            r4.limit = r6
            long r0 = r9.size()
            r2 = 4
            long r0 = r0 + r2
            r9.setSize$okio(r0)
            int r11 = r11 + 2
            goto L14
        Leb:
            r9.writeByte(r3)
            r11 = r2
            goto L14
        Lf1:
            r2 = 3
            okio.Segment r4 = r9.writableSegment$okio(r2)
            byte[] r5 = r4.data
            int r6 = r4.limit
            int r7 = r0 >> 12
            r7 = r7 | 224(0xe0, float:3.14E-43)
            byte r7 = (byte) r7
            r5[r6] = r7
            int r7 = r6 + 1
            int r8 = r0 >> 6
            r3 = r3 & r8
            r3 = r3 | r1
            byte r3 = (byte) r3
            r5[r7] = r3
            int r3 = r6 + 2
            r0 = r0 & 63
            r0 = r0 | r1
            byte r0 = (byte) r0
            r5[r3] = r0
            int r6 = r6 + r2
            r4.limit = r6
            long r0 = r9.size()
            r2 = 3
            long r0 = r0 + r2
            r9.setSize$okio(r0)
            goto L7e
        L121:
            return r9
        L122:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "endIndex > string.length: "
            r9.append(r11)
            r9.append(r12)
            java.lang.String r11 = " > "
            r9.append(r11)
            int r10 = r10.length()
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        L149:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "endIndex < beginIndex: "
            r9.append(r10)
            r9.append(r12)
            java.lang.String r10 = " < "
            r9.append(r10)
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        L16c:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "beginIndex < 0: "
            r9.append(r10)
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Buffer commonWriteUtf8CodePoint(@org.jetbrains.annotations.NotNull okio.Buffer r8, int r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r8, r0)
            r0 = 128(0x80, float:1.8E-43)
            if (r9 >= r0) goto Ld
            r8.writeByte(r9)
            return r8
        Ld:
            r1 = 2048(0x800, float:2.87E-42)
            r2 = 63
            if (r9 >= r1) goto L38
            r1 = 2
            okio.Segment r3 = r8.writableSegment$okio(r1)
            byte[] r4 = r3.data
            int r5 = r3.limit
            int r6 = r9 >> 6
            r6 = r6 | 192(0xc0, float:2.69E-43)
            byte r6 = (byte) r6
            r4[r5] = r6
            int r6 = r5 + 1
            r9 = r9 & r2
            r9 = r9 | r0
            byte r9 = (byte) r9
            r4[r6] = r9
            int r5 = r5 + r1
            r3.limit = r5
            long r0 = r8.size()
            r2 = 2
            long r0 = r0 + r2
            r8.setSize$okio(r0)
            return r8
        L38:
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r1 > r9) goto L46
            r1 = 57344(0xe000, float:8.0356E-41)
            if (r9 >= r1) goto L46
            r8.writeByte(r2)
            return r8
        L46:
            r1 = 65536(0x10000, float:9.1835E-41)
            if (r9 >= r1) goto L78
            r1 = 3
            okio.Segment r3 = r8.writableSegment$okio(r1)
            byte[] r4 = r3.data
            int r5 = r3.limit
            int r6 = r9 >> 12
            r6 = r6 | 224(0xe0, float:3.14E-43)
            byte r6 = (byte) r6
            r4[r5] = r6
            int r6 = r5 + 1
            int r7 = r9 >> 6
            r7 = r7 & r2
            r7 = r7 | r0
            byte r7 = (byte) r7
            r4[r6] = r7
            int r6 = r5 + 2
            r9 = r9 & r2
            r9 = r9 | r0
            byte r9 = (byte) r9
            r4[r6] = r9
            int r5 = r5 + r1
            r3.limit = r5
            long r0 = r8.size()
            r2 = 3
            long r0 = r0 + r2
            r8.setSize$okio(r0)
            return r8
        L78:
            r1 = 1114111(0x10ffff, float:1.561202E-39)
            if (r9 > r1) goto Lb4
            r1 = 4
            okio.Segment r3 = r8.writableSegment$okio(r1)
            byte[] r4 = r3.data
            int r5 = r3.limit
            int r6 = r9 >> 18
            r6 = r6 | 240(0xf0, float:3.36E-43)
            byte r6 = (byte) r6
            r4[r5] = r6
            int r6 = r5 + 1
            int r7 = r9 >> 12
            r7 = r7 & r2
            r7 = r7 | r0
            byte r7 = (byte) r7
            r4[r6] = r7
            int r6 = r5 + 2
            int r7 = r9 >> 6
            r7 = r7 & r2
            r7 = r7 | r0
            byte r7 = (byte) r7
            r4[r6] = r7
            int r6 = r5 + 3
            r9 = r9 & r2
            r9 = r9 | r0
            byte r9 = (byte) r9
            r4[r6] = r9
            int r5 = r5 + r1
            r3.limit = r5
            long r0 = r8.size()
            r2 = 4
            long r0 = r0 + r2
            r8.setSize$okio(r0)
            return r8
        Lb4:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unexpected code point: 0x"
            r0.append(r1)
            java.lang.String r9 = okio.SegmentedByteString.toHexString(r9)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r8.<init>(r9)
            throw r8
    }

    private static final int countDigitsIn(long r4) {
            int r0 = java.lang.Long.numberOfLeadingZeros(r4)
            int r0 = 64 - r0
            int r0 = r0 * 10
            int r0 = r0 >>> 5
            long[] r1 = okio.internal.Buffer.DigitCountToLargestValue
            r2 = r1[r0]
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 <= 0) goto L14
            r4 = 1
            goto L15
        L14:
            r4 = 0
        L15:
            int r0 = r0 + r4
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final byte[] getHEX_DIGIT_BYTES() {
            byte[] r0 = okio.internal.Buffer.HEX_DIGIT_BYTES
            return r0
    }

    public static final boolean rangeEquals(@org.jetbrains.annotations.NotNull okio.Segment r5, int r6, @org.jetbrains.annotations.NotNull byte[] r7, int r8, int r9) {
            java.lang.String r0 = "segment"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.g0.p(r7, r0)
            int r0 = r5.limit
            byte[] r1 = r5.data
        Le:
            if (r8 >= r9) goto L2e
            if (r6 != r0) goto L21
            okio.Segment r5 = r5.next
            kotlin.jvm.internal.g0.m(r5)
            byte[] r6 = r5.data
            int r0 = r5.pos
            int r1 = r5.limit
            r4 = r1
            r1 = r6
            r6 = r0
            r0 = r4
        L21:
            r2 = r1[r6]
            r3 = r7[r8]
            if (r2 == r3) goto L29
            r5 = 0
            return r5
        L29:
            int r6 = r6 + 1
            int r8 = r8 + 1
            goto Le
        L2e:
            r5 = 1
            return r5
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String readUtf8Line(@org.jetbrains.annotations.NotNull okio.Buffer r6, long r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r6, r0)
            r0 = 0
            r2 = 1
            int r4 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r4 <= 0) goto L21
            long r0 = r7 - r2
            byte r4 = r6.getByte(r0)
            r5 = 13
            if (r4 != r5) goto L21
            java.lang.String r7 = r6.readUtf8(r0)
            r0 = 2
            r6.skip(r0)
            return r7
        L21:
            java.lang.String r7 = r6.readUtf8(r7)
            r6.skip(r2)
            return r7
    }

    public static final <T> T seek(@org.jetbrains.annotations.NotNull okio.Buffer r5, long r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super okio.Segment, ? super java.lang.Long, ? extends T> r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "lambda"
            kotlin.jvm.internal.g0.p(r8, r0)
            okio.Segment r0 = r5.head
            if (r0 != 0) goto L1a
            r5 = -1
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r6 = 0
            java.lang.Object r5 = r8.invoke(r6, r5)
            return r5
        L1a:
            long r1 = r5.size()
            long r1 = r1 - r6
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 >= 0) goto L41
            long r1 = r5.size()
        L27:
            int r5 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r5 <= 0) goto L38
            okio.Segment r0 = r0.prev
            kotlin.jvm.internal.g0.m(r0)
            int r5 = r0.limit
            int r3 = r0.pos
            int r5 = r5 - r3
            long r3 = (long) r5
            long r1 = r1 - r3
            goto L27
        L38:
            java.lang.Long r5 = java.lang.Long.valueOf(r1)
            java.lang.Object r5 = r8.invoke(r0, r5)
            return r5
        L41:
            r1 = 0
        L43:
            int r5 = r0.limit
            int r3 = r0.pos
            int r5 = r5 - r3
            long r3 = (long) r5
            long r3 = r3 + r1
            int r5 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r5 > 0) goto L55
            okio.Segment r0 = r0.next
            kotlin.jvm.internal.g0.m(r0)
            r1 = r3
            goto L43
        L55:
            java.lang.Long r5 = java.lang.Long.valueOf(r1)
            java.lang.Object r5 = r8.invoke(r0, r5)
            return r5
    }

    public static final int selectPrefix(@org.jetbrains.annotations.NotNull okio.Buffer r17, @org.jetbrains.annotations.NotNull okio.Options r18, boolean r19) {
            r0 = r17
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.g0.p(r0, r1)
            java.lang.String r1 = "options"
            r2 = r18
            kotlin.jvm.internal.g0.p(r2, r1)
            okio.Segment r0 = r0.head
            r1 = -2
            r3 = -1
            if (r0 != 0) goto L18
            if (r19 == 0) goto L17
            return r1
        L17:
            return r3
        L18:
            byte[] r4 = r0.data
            int r5 = r0.pos
            int r6 = r0.limit
            int[] r2 = r2.getTrie$okio()
            r7 = 0
            r9 = r0
            r8 = 0
            r10 = -1
        L26:
            int r11 = r8 + 1
            r12 = r2[r8]
            int r8 = r8 + 2
            r11 = r2[r11]
            if (r11 == r3) goto L31
            r10 = r11
        L31:
            if (r9 != 0) goto L34
            goto L64
        L34:
            r11 = 0
            if (r12 >= 0) goto L7d
            int r12 = r12 * (-1)
            int r13 = r8 + r12
        L3b:
            int r12 = r5 + 1
            r5 = r4[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r14 = r8 + 1
            r8 = r2[r8]
            if (r5 == r8) goto L48
            goto L87
        L48:
            if (r14 != r13) goto L4c
            r5 = 1
            goto L4d
        L4c:
            r5 = 0
        L4d:
            if (r12 != r6) goto L6d
            kotlin.jvm.internal.g0.m(r9)
            okio.Segment r4 = r9.next
            kotlin.jvm.internal.g0.m(r4)
            int r6 = r4.pos
            byte[] r8 = r4.data
            int r9 = r4.limit
            if (r4 != r0) goto L67
            if (r5 == 0) goto L64
            r4 = r8
            r8 = r11
            goto L70
        L64:
            if (r19 == 0) goto L87
            return r1
        L67:
            r16 = r8
            r8 = r4
            r4 = r16
            goto L70
        L6d:
            r8 = r9
            r9 = r6
            r6 = r12
        L70:
            if (r5 == 0) goto L78
            r5 = r2[r14]
            r13 = r6
            r6 = r9
            r9 = r8
            goto La2
        L78:
            r5 = r6
            r6 = r9
            r9 = r8
            r8 = r14
            goto L3b
        L7d:
            int r13 = r5 + 1
            r5 = r4[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r14 = r8 + r12
        L85:
            if (r8 != r14) goto L88
        L87:
            return r10
        L88:
            r15 = r2[r8]
            if (r5 != r15) goto La9
            int r8 = r8 + r12
            r5 = r2[r8]
            if (r13 != r6) goto La2
            okio.Segment r9 = r9.next
            kotlin.jvm.internal.g0.m(r9)
            int r4 = r9.pos
            byte[] r6 = r9.data
            int r8 = r9.limit
            r13 = r4
            r4 = r6
            r6 = r8
            if (r9 != r0) goto La2
            r9 = r11
        La2:
            if (r5 < 0) goto La5
            return r5
        La5:
            int r8 = -r5
            r5 = r13
            goto L26
        La9:
            int r8 = r8 + 1
            goto L85
    }

    public static /* synthetic */ int selectPrefix$default(okio.Buffer r0, okio.Options r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            int r0 = selectPrefix(r0, r1, r2)
            return r0
    }
}
