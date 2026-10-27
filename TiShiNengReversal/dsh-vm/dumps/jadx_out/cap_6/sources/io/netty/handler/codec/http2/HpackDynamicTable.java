package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class HpackDynamicTable {
    private long capacity;
    int head;
    io.netty.handler.codec.http2.HpackHeaderField[] hpackHeaderFields;
    private long size;
    int tail;

    HpackDynamicTable(long r3) {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.capacity = r0
            r2.setCapacity(r3)
            return
    }

    public void add(io.netty.handler.codec.http2.HpackHeaderField r8) {
            r7 = this;
            int r0 = r8.size()
            long r0 = (long) r0
            long r2 = r7.capacity
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto Lf
            r7.clear()
            return
        Lf:
            long r2 = r7.capacity
            long r4 = r7.size
            long r2 = r2 - r4
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 >= 0) goto L1c
            r7.remove()
            goto Lf
        L1c:
            io.netty.handler.codec.http2.HpackHeaderField[] r0 = r7.hpackHeaderFields
            int r1 = r7.head
            int r2 = r1 + 1
            r7.head = r2
            r0[r1] = r8
            int r8 = r8.size()
            long r0 = (long) r8
            long r4 = r4 + r0
            r7.size = r4
            int r8 = r7.head
            io.netty.handler.codec.http2.HpackHeaderField[] r0 = r7.hpackHeaderFields
            int r0 = r0.length
            if (r8 != r0) goto L38
            r8 = 0
            r7.head = r8
        L38:
            return
    }

    public long capacity() {
            r2 = this;
            long r0 = r2.capacity
            return r0
    }

    public void clear() {
            r5 = this;
        L0:
            int r0 = r5.tail
            int r1 = r5.head
            r2 = 0
            if (r0 == r1) goto L16
            io.netty.handler.codec.http2.HpackHeaderField[] r1 = r5.hpackHeaderFields
            int r3 = r0 + 1
            r5.tail = r3
            r4 = 0
            r1[r0] = r4
            int r0 = r1.length
            if (r3 != r0) goto L0
            r5.tail = r2
            goto L0
        L16:
            r5.head = r2
            r5.tail = r2
            r0 = 0
            r5.size = r0
            return
    }

    public io.netty.handler.codec.http2.HpackHeaderField getEntry(int r3) {
            r2 = this;
            if (r3 <= 0) goto L19
            int r0 = r2.length()
            if (r3 > r0) goto L19
            int r0 = r2.head
            int r0 = r0 - r3
            if (r0 >= 0) goto L14
            io.netty.handler.codec.http2.HpackHeaderField[] r3 = r2.hpackHeaderFields
            int r1 = r3.length
            int r0 = r0 + r1
            r3 = r3[r0]
            return r3
        L14:
            io.netty.handler.codec.http2.HpackHeaderField[] r3 = r2.hpackHeaderFields
            r3 = r3[r0]
            return r3
        L19:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            r3.<init>()
            throw r3
    }

    public int length() {
            r3 = this;
            int r0 = r3.head
            int r1 = r3.tail
            if (r0 >= r1) goto Lc
            io.netty.handler.codec.http2.HpackHeaderField[] r2 = r3.hpackHeaderFields
            int r2 = r2.length
            int r2 = r2 - r1
            int r2 = r2 + r0
            return r2
        Lc:
            int r0 = r0 - r1
            return r0
    }

    public io.netty.handler.codec.http2.HpackHeaderField remove() {
            r6 = this;
            io.netty.handler.codec.http2.HpackHeaderField[] r0 = r6.hpackHeaderFields
            int r1 = r6.tail
            r0 = r0[r1]
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            long r2 = r6.size
            int r4 = r0.size()
            long r4 = (long) r4
            long r2 = r2 - r4
            r6.size = r2
            io.netty.handler.codec.http2.HpackHeaderField[] r2 = r6.hpackHeaderFields
            int r3 = r6.tail
            int r4 = r3 + 1
            r6.tail = r4
            r2[r3] = r1
            int r1 = r2.length
            if (r4 != r1) goto L24
            r1 = 0
            r6.tail = r1
        L24:
            return r0
    }

    public void setCapacity(long r7) {
            r6 = this;
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 < 0) goto L60
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 > 0) goto L60
            long r3 = r6.capacity
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 != 0) goto L16
            goto L3b
        L16:
            r6.capacity = r7
            if (r2 != 0) goto L1e
            r6.clear()
            goto L28
        L1e:
            long r2 = r6.size
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 <= 0) goto L28
            r6.remove()
            goto L1e
        L28:
            r2 = 32
            long r4 = r7 / r2
            int r5 = (int) r4
            long r7 = r7 % r2
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 == 0) goto L34
            int r5 = r5 + 1
        L34:
            io.netty.handler.codec.http2.HpackHeaderField[] r7 = r6.hpackHeaderFields
            if (r7 == 0) goto L3c
            int r7 = r7.length
            if (r7 != r5) goto L3c
        L3b:
            return
        L3c:
            io.netty.handler.codec.http2.HpackHeaderField[] r7 = new io.netty.handler.codec.http2.HpackHeaderField[r5]
            int r8 = r6.length()
            int r0 = r6.tail
            r1 = 0
            r2 = 0
        L46:
            if (r2 >= r8) goto L59
            io.netty.handler.codec.http2.HpackHeaderField[] r3 = r6.hpackHeaderFields
            int r4 = r0 + 1
            r0 = r3[r0]
            r7[r2] = r0
            int r0 = r3.length
            if (r4 != r0) goto L55
            r0 = 0
            goto L56
        L55:
            r0 = r4
        L56:
            int r2 = r2 + 1
            goto L46
        L59:
            r6.tail = r1
            r6.head = r8
            r6.hpackHeaderFields = r7
            return
        L60:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "capacity is invalid: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
    }

    public long size() {
            r2 = this;
            long r0 = r2.size
            return r0
    }
}
