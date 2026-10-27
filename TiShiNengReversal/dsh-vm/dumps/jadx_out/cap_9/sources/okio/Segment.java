package okio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSegment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Segment.kt\nokio/Segment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,187:1\n1#2:188\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class Segment {

    @org.jetbrains.annotations.NotNull
    public static final okio.Segment.Companion Companion = null;
    public static final int SHARE_MINIMUM = 1024;
    public static final int SIZE = 8192;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final byte[] data;

    @kotlin.jvm.JvmField
    public int limit;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.Nullable
    public okio.Segment next;

    @kotlin.jvm.JvmField
    public boolean owner;

    @kotlin.jvm.JvmField
    public int pos;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.Nullable
    public okio.Segment prev;

    @kotlin.jvm.JvmField
    public boolean shared;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            okio.Segment$Companion r0 = new okio.Segment$Companion
            r1 = 0
            r0.<init>(r1)
            okio.Segment.Companion = r0
            return
    }

    public Segment() {
            r1 = this;
            r1.<init>()
            r0 = 8192(0x2000, float:1.148E-41)
            byte[] r0 = new byte[r0]
            r1.data = r0
            r0 = 1
            r1.owner = r0
            r0 = 0
            r1.shared = r0
            return
    }

    public Segment(@org.jetbrains.annotations.NotNull byte[] r2, int r3, int r4, boolean r5, boolean r6) {
            r1 = this;
            java.lang.String r0 = "data"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.data = r2
            r1.pos = r3
            r1.limit = r4
            r1.shared = r5
            r1.owner = r6
            return
    }

    public final void compact() {
            r3 = this;
            okio.Segment r0 = r3.prev
            if (r0 == r3) goto L3f
            kotlin.jvm.internal.g0.m(r0)
            boolean r0 = r0.owner
            if (r0 != 0) goto Lc
            goto L2f
        Lc:
            int r0 = r3.limit
            int r1 = r3.pos
            int r0 = r0 - r1
            okio.Segment r1 = r3.prev
            kotlin.jvm.internal.g0.m(r1)
            int r1 = r1.limit
            int r1 = 8192 - r1
            okio.Segment r2 = r3.prev
            kotlin.jvm.internal.g0.m(r2)
            boolean r2 = r2.shared
            if (r2 == 0) goto L25
            r2 = 0
            goto L2c
        L25:
            okio.Segment r2 = r3.prev
            kotlin.jvm.internal.g0.m(r2)
            int r2 = r2.pos
        L2c:
            int r1 = r1 + r2
            if (r0 <= r1) goto L30
        L2f:
            return
        L30:
            okio.Segment r1 = r3.prev
            kotlin.jvm.internal.g0.m(r1)
            r3.writeTo(r1, r0)
            r3.pop()
            okio.SegmentPool.recycle(r3)
            return
        L3f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "cannot compact"
            r0.<init>(r1)
            throw r0
    }

    @org.jetbrains.annotations.Nullable
    public final okio.Segment pop() {
            r4 = this;
            okio.Segment r0 = r4.next
            r1 = 0
            if (r0 == r4) goto L6
            goto L7
        L6:
            r0 = r1
        L7:
            okio.Segment r2 = r4.prev
            kotlin.jvm.internal.g0.m(r2)
            okio.Segment r3 = r4.next
            r2.next = r3
            okio.Segment r2 = r4.next
            kotlin.jvm.internal.g0.m(r2)
            okio.Segment r3 = r4.prev
            r2.prev = r3
            r4.next = r1
            r4.prev = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okio.Segment push(@org.jetbrains.annotations.NotNull okio.Segment r2) {
            r1 = this;
            java.lang.String r0 = "segment"
            kotlin.jvm.internal.g0.p(r2, r0)
            r2.prev = r1
            okio.Segment r0 = r1.next
            r2.next = r0
            okio.Segment r0 = r1.next
            kotlin.jvm.internal.g0.m(r0)
            r0.prev = r2
            r1.next = r2
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final okio.Segment sharedCopy() {
            r7 = this;
            r0 = 1
            r7.shared = r0
            okio.Segment r1 = new okio.Segment
            byte[] r2 = r7.data
            int r3 = r7.pos
            int r4 = r7.limit
            r5 = 1
            r6 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final okio.Segment split(int r9) {
            r8 = this;
            if (r9 <= 0) goto L37
            int r0 = r8.limit
            int r1 = r8.pos
            int r0 = r0 - r1
            if (r9 > r0) goto L37
            r0 = 1024(0x400, float:1.435E-42)
            if (r9 < r0) goto L12
            okio.Segment r0 = r8.sharedCopy()
            goto L24
        L12:
            okio.Segment r0 = okio.SegmentPool.take()
            byte[] r1 = r8.data
            byte[] r2 = r0.data
            int r4 = r8.pos
            int r5 = r4 + r9
            r6 = 2
            r7 = 0
            r3 = 0
            kotlin.collections.n.E0(r1, r2, r3, r4, r5, r6, r7)
        L24:
            int r1 = r0.pos
            int r1 = r1 + r9
            r0.limit = r1
            int r1 = r8.pos
            int r1 = r1 + r9
            r8.pos = r1
            okio.Segment r9 = r8.prev
            kotlin.jvm.internal.g0.m(r9)
            r9.push(r0)
            return r0
        L37:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "byteCount out of range"
            r9.<init>(r0)
            throw r9
    }

    @org.jetbrains.annotations.NotNull
    public final okio.Segment unsharedCopy() {
            r6 = this;
            okio.Segment r0 = new okio.Segment
            byte[] r1 = r6.data
            int r2 = r1.length
            byte[] r1 = java.util.Arrays.copyOf(r1, r2)
            java.lang.String r2 = "copyOf(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            int r2 = r6.pos
            int r3 = r6.limit
            r4 = 0
            r5 = 1
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    public final void writeTo(@org.jetbrains.annotations.NotNull okio.Segment r9, int r10) {
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.g0.p(r9, r0)
            boolean r0 = r9.owner
            if (r0 == 0) goto L54
            int r5 = r9.limit
            int r0 = r5 + r10
            r1 = 8192(0x2000, float:1.148E-41)
            if (r0 <= r1) goto L3c
            boolean r0 = r9.shared
            if (r0 != 0) goto L36
            int r0 = r5 + r10
            int r4 = r9.pos
            int r0 = r0 - r4
            if (r0 > r1) goto L30
            byte[] r1 = r9.data
            r6 = 2
            r7 = 0
            r3 = 0
            r2 = r1
            kotlin.collections.n.E0(r1, r2, r3, r4, r5, r6, r7)
            int r0 = r9.limit
            int r1 = r9.pos
            int r0 = r0 - r1
            r9.limit = r0
            r0 = 0
            r9.pos = r0
            goto L3c
        L30:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>()
            throw r9
        L36:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>()
            throw r9
        L3c:
            byte[] r0 = r8.data
            byte[] r1 = r9.data
            int r2 = r9.limit
            int r3 = r8.pos
            int r4 = r3 + r10
            kotlin.collections.n.v0(r0, r1, r2, r3, r4)
            int r0 = r9.limit
            int r0 = r0 + r10
            r9.limit = r0
            int r9 = r8.pos
            int r9 = r9 + r10
            r8.pos = r9
            return
        L54:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "only owner can write"
            r9.<init>(r10)
            throw r9
    }
}
