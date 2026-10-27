package okio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nAsyncTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncTimeout.kt\nokio/PriorityQueue\n*L\n1#1,504:1\n499#1,3:505\n499#1,3:508\n499#1,3:511\n499#1,3:514\n*S KotlinDebug\n*F\n+ 1 AsyncTimeout.kt\nokio/PriorityQueue\n*L\n408#1:505,3\n441#1:508,3\n474#1:511,3\n484#1:514,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class PriorityQueue {

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public okio.AsyncTimeout[] array;

    @kotlin.jvm.JvmField
    public int size;

    public PriorityQueue() {
            r1 = this;
            r1.<init>()
            r0 = 8
            okio.AsyncTimeout[] r0 = new okio.AsyncTimeout[r0]
            r1.array = r0
            return
    }

    private final int compareTo(okio.AsyncTimeout r5, okio.AsyncTimeout r6) {
            r4 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            long r0 = r5.timeoutNanos()
            long r5 = r6.timeoutNanos()
            r2 = 0
            long r5 = r5 - r0
            int r5 = kotlin.jvm.internal.g0.u(r2, r5)
            return r5
    }

    private final void heapifyDown(int r10, okio.AsyncTimeout r11) {
            r9 = this;
        L0:
            int r0 = r10 << 1
            int r1 = r0 + 1
            int r2 = r9.size
            r3 = 0
            if (r1 > r2) goto L2a
            okio.AsyncTimeout[] r2 = r9.array
            r0 = r2[r0]
            kotlin.jvm.internal.g0.m(r0)
            okio.AsyncTimeout[] r2 = r9.array
            r1 = r2[r1]
            kotlin.jvm.internal.g0.m(r1)
            long r5 = r0.timeoutNanos()
            long r7 = r1.timeoutNanos()
            long r7 = r7 - r5
            int r2 = kotlin.jvm.internal.g0.u(r3, r7)
            if (r2 >= 0) goto L28
            goto L33
        L28:
            r0 = r1
            goto L33
        L2a:
            if (r0 > r2) goto L4c
            okio.AsyncTimeout[] r1 = r9.array
            r0 = r1[r0]
            kotlin.jvm.internal.g0.m(r0)
        L33:
            long r1 = r11.timeoutNanos()
            long r5 = r0.timeoutNanos()
            long r5 = r5 - r1
            int r1 = kotlin.jvm.internal.g0.u(r3, r5)
            if (r1 <= 0) goto L4c
            int r1 = r0.index
            r0.index = r10
            okio.AsyncTimeout[] r2 = r9.array
            r2[r10] = r0
            r10 = r1
            goto L0
        L4c:
            okio.AsyncTimeout[] r0 = r9.array
            r0[r10] = r11
            r11.index = r10
            return
    }

    private final void heapifyUp(int r9, okio.AsyncTimeout r10) {
            r8 = this;
        L0:
            int r0 = r9 >> 1
            if (r0 == 0) goto L24
            okio.AsyncTimeout[] r1 = r8.array
            r1 = r1[r0]
            kotlin.jvm.internal.g0.m(r1)
            long r2 = r1.timeoutNanos()
            long r4 = r10.timeoutNanos()
            r6 = 0
            long r4 = r4 - r2
            int r2 = kotlin.jvm.internal.g0.u(r6, r4)
            if (r2 <= 0) goto L24
            r1.index = r9
            okio.AsyncTimeout[] r2 = r8.array
            r2[r9] = r1
            r9 = r0
            goto L0
        L24:
            okio.AsyncTimeout[] r0 = r8.array
            r0[r9] = r10
            r10.index = r9
            return
    }

    public final void add(@org.jetbrains.annotations.NotNull okio.AsyncTimeout r9) {
            r8 = this;
            java.lang.String r0 = "node"
            kotlin.jvm.internal.g0.p(r9, r0)
            int r0 = r8.size
            int r0 = r0 + 1
            r8.size = r0
            okio.AsyncTimeout[] r1 = r8.array
            int r2 = r1.length
            if (r0 != r2) goto L1f
            int r2 = r0 * 2
            okio.AsyncTimeout[] r2 = new okio.AsyncTimeout[r2]
            r6 = 14
            r7 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            kotlin.collections.n.K0(r1, r2, r3, r4, r5, r6, r7)
            r8.array = r2
        L1f:
            r8.heapifyUp(r0, r9)
            return
    }

    @org.jetbrains.annotations.Nullable
    public final okio.AsyncTimeout first() {
            r2 = this;
            okio.AsyncTimeout[] r0 = r2.array
            r1 = 1
            r0 = r0[r1]
            return r0
    }

    public final void remove(@org.jetbrains.annotations.NotNull okio.AsyncTimeout r9) {
            r8 = this;
            java.lang.String r0 = "node"
            kotlin.jvm.internal.g0.p(r9, r0)
            int r0 = r9.index
            r1 = -1
            if (r0 == r1) goto L43
            int r2 = r8.size
            okio.AsyncTimeout[] r3 = r8.array
            r3 = r3[r2]
            kotlin.jvm.internal.g0.m(r3)
            r9.index = r1
            okio.AsyncTimeout[] r1 = r8.array
            r4 = 0
            r1[r2] = r4
            int r2 = r2 + (-1)
            r8.size = r2
            if (r9 != r3) goto L21
            return
        L21:
            long r1 = r9.timeoutNanos()
            long r4 = r3.timeoutNanos()
            r6 = 0
            long r4 = r4 - r1
            int r9 = kotlin.jvm.internal.g0.u(r6, r4)
            if (r9 != 0) goto L39
            okio.AsyncTimeout[] r9 = r8.array
            r9[r0] = r3
            r3.index = r0
            return
        L39:
            if (r9 >= 0) goto L3f
            r8.heapifyDown(r0, r3)
            return
        L3f:
            r8.heapifyUp(r0, r3)
            return
        L43:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed requirement."
            r9.<init>(r0)
            throw r9
    }
}
