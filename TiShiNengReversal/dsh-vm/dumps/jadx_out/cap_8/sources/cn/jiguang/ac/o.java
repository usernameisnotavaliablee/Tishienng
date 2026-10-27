package cn.jiguang.ac;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class o {
    protected long a;

    /* renamed from: b, reason: collision with root package name */
    protected java.nio.channels.SelectionKey f377b;

    public o(long r2) {
            r1 = this;
            r1.<init>()
            r1.a = r2
            java.nio.channels.SocketChannel r2 = java.nio.channels.SocketChannel.open()
            java.nio.channels.Selector r3 = java.nio.channels.Selector.open()     // Catch: java.lang.Throwable -> L1e
            r0 = 0
            r2.configureBlocking(r0)     // Catch: java.lang.Throwable -> L24
            r0 = 1
            java.nio.channels.SelectionKey r0 = r2.register(r3, r0)     // Catch: java.lang.Throwable -> L24
            r1.f377b = r0     // Catch: java.lang.Throwable -> L24
            if (r3 == 0) goto L20
            r3.close()     // Catch: java.lang.Throwable -> L1e
            goto L20
        L1e:
            r3 = move-exception
            goto L30
        L20:
            r2.close()
            return
        L24:
            r0 = move-exception
            if (r3 == 0) goto L2f
            r3.close()     // Catch: java.lang.Throwable -> L2b
            goto L2f
        L2b:
            r3 = move-exception
            r0.addSuppressed(r3)     // Catch: java.lang.Throwable -> L1e
        L2f:
            throw r0     // Catch: java.lang.Throwable -> L1e
        L30:
            if (r2 == 0) goto L3a
            r2.close()     // Catch: java.lang.Throwable -> L36
            goto L3a
        L36:
            r2 = move-exception
            r3.addSuppressed(r2)
        L3a:
            throw r3
    }

    protected static void a(java.nio.channels.SelectionKey r3, long r4) {
            long r0 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r0
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L14
            java.nio.channels.Selector r3 = r3.selector()
            int r3 = r3.select(r4)
            goto L20
        L14:
            if (r2 != 0) goto L1f
            java.nio.channels.Selector r3 = r3.selector()
            int r3 = r3.selectNow()
            goto L20
        L1f:
            r3 = 0
        L20:
            if (r3 == 0) goto L23
            return
        L23:
            java.net.SocketTimeoutException r3 = new java.net.SocketTimeoutException
            r3.<init>()
            throw r3
    }

    private byte[] a(int r11) {
            r10 = this;
            java.nio.channels.SelectionKey r0 = r10.f377b
            java.nio.channels.SelectableChannel r0 = r0.channel()
            java.nio.channels.SocketChannel r0 = (java.nio.channels.SocketChannel) r0
            byte[] r1 = new byte[r11]
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r1)
            java.nio.channels.SelectionKey r3 = r10.f377b
            r4 = 1
            r3.interestOps(r4)
            r3 = 0
            r4 = 0
        L16:
            if (r4 >= r11) goto L5e
            java.nio.channels.SelectionKey r5 = r10.f377b     // Catch: java.lang.Throwable -> L40
            boolean r5 = r5.isReadable()     // Catch: java.lang.Throwable -> L40
            if (r5 == 0) goto L48
            int r5 = r0.read(r2)     // Catch: java.lang.Throwable -> L40
            long r5 = (long) r5     // Catch: java.lang.Throwable -> L40
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 < 0) goto L42
            int r6 = (int) r5     // Catch: java.lang.Throwable -> L40
            int r4 = r4 + r6
            if (r4 >= r11) goto L16
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L40
            long r7 = r10.a     // Catch: java.lang.Throwable -> L40
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 > 0) goto L3a
            goto L16
        L3a:
            java.net.SocketTimeoutException r11 = new java.net.SocketTimeoutException     // Catch: java.lang.Throwable -> L40
            r11.<init>()     // Catch: java.lang.Throwable -> L40
            throw r11     // Catch: java.lang.Throwable -> L40
        L40:
            r11 = move-exception
            goto L50
        L42:
            java.io.EOFException r11 = new java.io.EOFException     // Catch: java.lang.Throwable -> L40
            r11.<init>()     // Catch: java.lang.Throwable -> L40
            throw r11     // Catch: java.lang.Throwable -> L40
        L48:
            java.nio.channels.SelectionKey r5 = r10.f377b     // Catch: java.lang.Throwable -> L40
            long r6 = r10.a     // Catch: java.lang.Throwable -> L40
            a(r5, r6)     // Catch: java.lang.Throwable -> L40
            goto L16
        L50:
            java.nio.channels.SelectionKey r0 = r10.f377b
            boolean r0 = r0.isValid()
            if (r0 == 0) goto L5d
            java.nio.channels.SelectionKey r0 = r10.f377b
            r0.interestOps(r3)
        L5d:
            throw r11
        L5e:
            java.nio.channels.SelectionKey r11 = r10.f377b
            boolean r11 = r11.isValid()
            if (r11 == 0) goto L6b
            java.nio.channels.SelectionKey r11 = r10.f377b
            r11.interestOps(r3)
        L6b:
            return r1
    }

    public static byte[] a(java.net.SocketAddress r1, java.net.SocketAddress r2, byte[] r3, long r4) {
            cn.jiguang.ac.o r0 = new cn.jiguang.ac.o
            r0.<init>(r4)
            if (r1 == 0) goto Ld
            r0.a(r1)     // Catch: java.lang.Throwable -> Lb
            goto Ld
        Lb:
            r1 = move-exception
            goto L1b
        Ld:
            r0.b(r2)     // Catch: java.lang.Throwable -> Lb
            r0.a(r3)     // Catch: java.lang.Throwable -> Lb
            byte[] r1 = r0.a()     // Catch: java.lang.Throwable -> Lb
            r0.b()
            return r1
        L1b:
            r0.b()
            throw r1
    }

    void a(java.net.SocketAddress r2) {
            r1 = this;
            java.nio.channels.SelectionKey r0 = r1.f377b
            java.nio.channels.SelectableChannel r0 = r0.channel()
            java.nio.channels.SocketChannel r0 = (java.nio.channels.SocketChannel) r0
            java.net.Socket r0 = r0.socket()
            r0.bind(r2)
            return
    }

    void a(byte[] r12) {
            r11 = this;
            java.nio.channels.SelectionKey r0 = r11.f377b
            java.nio.channels.SelectableChannel r0 = r0.channel()
            java.nio.channels.SocketChannel r0 = (java.nio.channels.SocketChannel) r0
            int r1 = r12.length
            int r1 = r1 >>> 8
            byte r1 = (byte) r1
            int r2 = r12.length
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r3 = 2
            byte[] r4 = new byte[r3]
            r5 = 0
            r4[r5] = r1
            r1 = 1
            r4[r1] = r2
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r4)
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r12)
            java.nio.ByteBuffer[] r6 = new java.nio.ByteBuffer[r3]
            r6[r5] = r2
            r6[r1] = r4
            java.nio.channels.SelectionKey r1 = r11.f377b
            r2 = 4
            r1.interestOps(r2)
            r1 = 0
        L2e:
            int r2 = r12.length     // Catch: java.lang.Throwable -> L5b
            int r2 = r2 + r3
            if (r1 >= r2) goto L6b
            java.nio.channels.SelectionKey r2 = r11.f377b     // Catch: java.lang.Throwable -> L5b
            boolean r2 = r2.isWritable()     // Catch: java.lang.Throwable -> L5b
            if (r2 == 0) goto L63
            long r7 = r0.write(r6)     // Catch: java.lang.Throwable -> L5b
            r9 = 0
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 < 0) goto L5d
            int r2 = (int) r7     // Catch: java.lang.Throwable -> L5b
            int r1 = r1 + r2
            int r2 = r12.length     // Catch: java.lang.Throwable -> L5b
            int r2 = r2 + r3
            if (r1 >= r2) goto L2e
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L5b
            long r9 = r11.a     // Catch: java.lang.Throwable -> L5b
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 > 0) goto L55
            goto L2e
        L55:
            java.net.SocketTimeoutException r12 = new java.net.SocketTimeoutException     // Catch: java.lang.Throwable -> L5b
            r12.<init>()     // Catch: java.lang.Throwable -> L5b
            throw r12     // Catch: java.lang.Throwable -> L5b
        L5b:
            r12 = move-exception
            goto L79
        L5d:
            java.io.EOFException r12 = new java.io.EOFException     // Catch: java.lang.Throwable -> L5b
            r12.<init>()     // Catch: java.lang.Throwable -> L5b
            throw r12     // Catch: java.lang.Throwable -> L5b
        L63:
            java.nio.channels.SelectionKey r2 = r11.f377b     // Catch: java.lang.Throwable -> L5b
            long r7 = r11.a     // Catch: java.lang.Throwable -> L5b
            a(r2, r7)     // Catch: java.lang.Throwable -> L5b
            goto L2e
        L6b:
            java.nio.channels.SelectionKey r12 = r11.f377b
            boolean r12 = r12.isValid()
            if (r12 == 0) goto L78
            java.nio.channels.SelectionKey r12 = r11.f377b
            r12.interestOps(r5)
        L78:
            return
        L79:
            java.nio.channels.SelectionKey r0 = r11.f377b
            boolean r0 = r0.isValid()
            if (r0 == 0) goto L86
            java.nio.channels.SelectionKey r0 = r11.f377b
            r0.interestOps(r5)
        L86:
            throw r12
    }

    byte[] a() {
            r3 = this;
            r0 = 2
            byte[] r0 = r3.a(r0)
            r1 = 0
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r2 = 1
            r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r1 + r0
            byte[] r0 = r3.a(r1)
            java.nio.channels.SelectionKey r1 = r3.f377b
            java.nio.channels.SelectableChannel r1 = r1.channel()
            java.nio.channels.SocketChannel r1 = (java.nio.channels.SocketChannel) r1
            return r0
    }

    void b() {
            r1 = this;
            java.nio.channels.SelectionKey r0 = r1.f377b
            java.nio.channels.Selector r0 = r0.selector()
            r0.close()
            java.nio.channels.SelectionKey r0 = r1.f377b
            java.nio.channels.SelectableChannel r0 = r0.channel()
            r0.close()
            return
    }

    void b(java.net.SocketAddress r5) {
            r4 = this;
            java.nio.channels.SelectionKey r0 = r4.f377b
            java.nio.channels.SelectableChannel r0 = r0.channel()
            java.nio.channels.SocketChannel r0 = (java.nio.channels.SocketChannel) r0
            boolean r5 = r0.connect(r5)
            if (r5 == 0) goto Lf
            goto L3c
        Lf:
            java.nio.channels.SelectionKey r5 = r4.f377b
            r1 = 8
            r5.interestOps(r1)
        L16:
            r5 = 0
            boolean r1 = r0.finishConnect()     // Catch: java.lang.Throwable -> L2d
            if (r1 != 0) goto L2f
            java.nio.channels.SelectionKey r1 = r4.f377b     // Catch: java.lang.Throwable -> L2d
            boolean r1 = r1.isConnectable()     // Catch: java.lang.Throwable -> L2d
            if (r1 != 0) goto L16
            java.nio.channels.SelectionKey r1 = r4.f377b     // Catch: java.lang.Throwable -> L2d
            long r2 = r4.a     // Catch: java.lang.Throwable -> L2d
            a(r1, r2)     // Catch: java.lang.Throwable -> L2d
            goto L16
        L2d:
            r0 = move-exception
            goto L3d
        L2f:
            java.nio.channels.SelectionKey r0 = r4.f377b
            boolean r0 = r0.isValid()
            if (r0 == 0) goto L3c
            java.nio.channels.SelectionKey r0 = r4.f377b
            r0.interestOps(r5)
        L3c:
            return
        L3d:
            java.nio.channels.SelectionKey r1 = r4.f377b
            boolean r1 = r1.isValid()
            if (r1 == 0) goto L4a
            java.nio.channels.SelectionKey r1 = r4.f377b
            r1.interestOps(r5)
        L4a:
            throw r0
    }
}
