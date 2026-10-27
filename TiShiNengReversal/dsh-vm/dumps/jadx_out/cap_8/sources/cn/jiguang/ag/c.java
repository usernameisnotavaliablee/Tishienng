package cn.jiguang.ag;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c extends cn.jiguang.ag.a {

    /* renamed from: j, reason: collision with root package name */
    private final int f466j;

    /* renamed from: k, reason: collision with root package name */
    private java.nio.ByteBuffer f467k;

    public c(int r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f466j = r1
            r1 = 8192(0x2000, float:1.148E-41)
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)
            r0.f467k = r1
            r0.f459f = r2
            return
    }

    private boolean b(byte[] r5) {
            r4 = this;
            java.lang.String r0 = "NioSocketClient"
            r1 = 0
            boolean r2 = r4.b()     // Catch: java.lang.Exception -> Lf
            if (r2 != 0) goto L11
            java.lang.String r5 = "send error -tcp connect was invalid"
            cn.jiguang.w.f.k(r0, r5)     // Catch: java.lang.Exception -> Lf
            return r1
        Lf:
            r5 = move-exception
            goto L57
        L11:
            if (r5 == 0) goto L51
            int r2 = r5.length     // Catch: java.lang.Exception -> Lf
            if (r2 > 0) goto L17
            goto L51
        L17:
            java.nio.channels.SocketChannel r2 = r4.f455b     // Catch: java.lang.Exception -> Lf
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r5)     // Catch: java.lang.Exception -> Lf
            int r5 = r2.write(r5)     // Catch: java.lang.Exception -> Lf
            if (r5 <= 0) goto L38
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lf
            r2.<init>()     // Catch: java.lang.Exception -> Lf
            java.lang.String r3 = "isWritable has send len:"
            r2.append(r3)     // Catch: java.lang.Exception -> Lf
            r2.append(r5)     // Catch: java.lang.Exception -> Lf
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Exception -> Lf
            cn.jiguang.w.f.a(r0, r5)     // Catch: java.lang.Exception -> Lf
            goto L4f
        L38:
            if (r5 >= 0) goto L4f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lf
            r2.<init>()     // Catch: java.lang.Exception -> Lf
            java.lang.String r3 = "isWritable error:"
            r2.append(r3)     // Catch: java.lang.Exception -> Lf
            r2.append(r5)     // Catch: java.lang.Exception -> Lf
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Exception -> Lf
            cn.jiguang.w.f.a(r0, r5)     // Catch: java.lang.Exception -> Lf
            return r1
        L4f:
            r5 = 1
            return r5
        L51:
            java.lang.String r5 = "send error - invalide buffer"
            cn.jiguang.w.f.c(r0, r5)     // Catch: java.lang.Exception -> Lf
            return r1
        L57:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "send data error:"
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            cn.jiguang.w.f.j(r0, r5)
            r4.close()
            return r1
    }

    @Override // cn.jiguang.ag.a
    public synchronized int a(java.lang.String r10, int r11) {
            r9 = this;
            monitor-enter(r9)
            super.a(r10, r11)     // Catch: java.lang.Throwable -> Lb7
            r0 = -994(0xfffffffffffffc1e, float:NaN)
            java.nio.channels.SocketChannel r1 = java.nio.channels.SocketChannel.open()     // Catch: java.lang.Throwable -> L44
            r9.f455b = r1     // Catch: java.lang.Throwable -> L44
            java.nio.channels.Selector r1 = java.nio.channels.Selector.open()     // Catch: java.lang.Throwable -> L44
            r9.f457d = r1     // Catch: java.lang.Throwable -> L44
            java.nio.channels.SocketChannel r1 = r9.f455b     // Catch: java.lang.Throwable -> L44
            r2 = 0
            r1.configureBlocking(r2)     // Catch: java.lang.Throwable -> L44
            java.net.InetSocketAddress r1 = new java.net.InetSocketAddress     // Catch: java.lang.Throwable -> L44
            r1.<init>(r10, r11)     // Catch: java.lang.Throwable -> L44
            java.nio.channels.SocketChannel r3 = r9.f455b     // Catch: java.lang.Throwable -> L44
            r3.connect(r1)     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = "NioSocketClient"
            java.lang.String r3 = "tcp connecting..."
            cn.jiguang.w.f.c(r1, r3)     // Catch: java.lang.Throwable -> L44
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L44
        L2d:
            java.nio.channels.SocketChannel r1 = r9.f455b     // Catch: java.lang.Throwable -> L44
            boolean r1 = r1.finishConnect()     // Catch: java.lang.Throwable -> L44
            r5 = -991(0xfffffffffffffc21, float:NaN)
            if (r1 != 0) goto L5b
            boolean r1 = r9.f458e     // Catch: java.lang.Throwable -> L44
            if (r1 != 0) goto L46
            java.lang.String r10 = "NioSocketClient"
            java.lang.String r11 = "has close channel when connect..."
            cn.jiguang.w.f.c(r10, r11)     // Catch: java.lang.Throwable -> L44
            monitor-exit(r9)
            return r5
        L44:
            r10 = move-exception
            goto L95
        L46:
            r5 = 10
            java.lang.Thread.sleep(r5)     // Catch: java.lang.Throwable -> L44
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L44
            long r5 = r5 - r3
            r7 = 3000(0xbb8, double:1.482E-320)
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 <= 0) goto L2d
            r9.close()     // Catch: java.lang.Throwable -> L44
            monitor-exit(r9)
            return r0
        L5b:
            boolean r1 = r9.f458e     // Catch: java.lang.Throwable -> L44
            if (r1 != 0) goto L68
            java.lang.String r10 = "NioSocketClient"
            java.lang.String r11 = "has close channel when connected..."
            cn.jiguang.w.f.c(r10, r11)     // Catch: java.lang.Throwable -> L44
            monitor-exit(r9)
            return r5
        L68:
            java.lang.String r1 = "NioSocketClient"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L44
            r3.<init>()     // Catch: java.lang.Throwable -> L44
            java.lang.String r4 = "tcp connected ["
            r3.append(r4)     // Catch: java.lang.Throwable -> L44
            r3.append(r10)     // Catch: java.lang.Throwable -> L44
            java.lang.String r10 = ":"
            r3.append(r10)     // Catch: java.lang.Throwable -> L44
            r3.append(r11)     // Catch: java.lang.Throwable -> L44
            java.lang.String r10 = "]"
            r3.append(r10)     // Catch: java.lang.Throwable -> L44
            java.lang.String r10 = r3.toString()     // Catch: java.lang.Throwable -> L44
            cn.jiguang.w.f.c(r1, r10)     // Catch: java.lang.Throwable -> L44
            java.nio.channels.SocketChannel r10 = r9.f455b     // Catch: java.lang.Throwable -> L44
            java.nio.channels.Selector r11 = r9.f457d     // Catch: java.lang.Throwable -> L44
            r1 = 1
            r10.register(r11, r1)     // Catch: java.lang.Throwable -> L44
            monitor-exit(r9)
            return r2
        L95:
            java.lang.String r11 = "NioSocketClient"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb7
            r1.<init>()     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r2 = "tcp connect has failed:"
            r1.append(r2)     // Catch: java.lang.Throwable -> Lb7
            r1.append(r10)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lb7
            cn.jiguang.w.f.j(r11, r1)     // Catch: java.lang.Throwable -> Lb7
            r9.close()     // Catch: java.lang.Throwable -> Lb7
            boolean r10 = r10 instanceof java.net.SocketTimeoutException     // Catch: java.lang.Throwable -> Lb7
            if (r10 == 0) goto Lb3
            goto Lb5
        Lb3:
            r0 = -1000(0xfffffffffffffc18, float:NaN)
        Lb5:
            monitor-exit(r9)
            return r0
        Lb7:
            r10 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> Lb7
            throw r10
    }

    @Override // cn.jiguang.ag.a
    public synchronized int a(byte[] r5) {
            r4 = this;
            monitor-enter(r4)
            r0 = 103(0x67, float:1.44E-43)
            if (r5 != 0) goto L10
            java.lang.String r5 = "NioSocketClient"
            java.lang.String r1 = "sendData failed, send data was null"
            cn.jiguang.w.f.i(r5, r1)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r4)
            return r0
        Le:
            r5 = move-exception
            goto L51
        L10:
            java.lang.String r1 = "NioSocketClient"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le
            r2.<init>()     // Catch: java.lang.Throwable -> Le
            java.lang.String r3 = "send data length:"
            r2.append(r3)     // Catch: java.lang.Throwable -> Le
            int r3 = r5.length     // Catch: java.lang.Throwable -> Le
            r2.append(r3)     // Catch: java.lang.Throwable -> Le
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Le
            cn.jiguang.w.f.c(r1, r2)     // Catch: java.lang.Throwable -> Le
            int r1 = r5.length     // Catch: java.lang.Throwable -> Le
            int r2 = r4.f466j     // Catch: java.lang.Throwable -> Le
            if (r1 < r2) goto L48
            java.lang.String r5 = "NioSocketClient"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le
            r0.<init>()     // Catch: java.lang.Throwable -> Le
            java.lang.String r1 = "sendData failed, data length must less than "
            r0.append(r1)     // Catch: java.lang.Throwable -> Le
            int r1 = r4.f466j     // Catch: java.lang.Throwable -> Le
            r0.append(r1)     // Catch: java.lang.Throwable -> Le
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Le
            cn.jiguang.w.f.i(r5, r0)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r4)
            r5 = 6026(0x178a, float:8.444E-42)
            return r5
        L48:
            boolean r5 = r4.b(r5)     // Catch: java.lang.Throwable -> Le
            if (r5 == 0) goto L4f
            r0 = 0
        L4f:
            monitor-exit(r4)
            return r0
        L51:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Le
            throw r5
    }

    @Override // cn.jiguang.ag.a
    public java.nio.ByteBuffer a(int r11) {
            r10 = this;
            r0 = -997(0xfffffffffffffc1b, float:NaN)
            r1 = -994(0xfffffffffffffc1e, float:NaN)
            boolean r2 = r10.b()     // Catch: java.lang.Throwable -> L17
            if (r2 == 0) goto L16c
            int r2 = r10.c()     // Catch: java.lang.Throwable -> L17
            if (r2 <= 0) goto L1a
            java.nio.ByteBuffer r2 = r10.b(r2)     // Catch: java.lang.Throwable -> L17
            if (r2 == 0) goto L1a
            return r2
        L17:
            r11 = move-exception
            goto L176
        L1a:
            r2 = 1048576(0x100000, float:1.469368E-39)
            r3 = 0
            r4 = 1048576(0x100000, float:1.469368E-39)
        L1f:
            boolean r5 = r10.b()     // Catch: java.lang.Throwable -> L17
            java.lang.String r6 = "NioSocketClient"
            if (r5 == 0) goto L12b
            int r5 = r10.f456c     // Catch: java.lang.Throwable -> L17
            if (r5 >= r4) goto L12b
            if (r11 <= 0) goto L35
            java.nio.channels.Selector r5 = r10.f457d     // Catch: java.lang.Throwable -> L17
            long r7 = (long) r11     // Catch: java.lang.Throwable -> L17
            int r5 = r5.select(r7)     // Catch: java.lang.Throwable -> L17
            goto L3b
        L35:
            java.nio.channels.Selector r5 = r10.f457d     // Catch: java.lang.Throwable -> L17
            int r5 = r5.select()     // Catch: java.lang.Throwable -> L17
        L3b:
            if (r5 != 0) goto L64
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L17
            r7.<init>()     // Catch: java.lang.Throwable -> L17
            java.lang.String r8 = "readSelect:"
            r7.append(r8)     // Catch: java.lang.Throwable -> L17
            r7.append(r5)     // Catch: java.lang.Throwable -> L17
            java.lang.String r5 = ",time out:"
            r7.append(r5)     // Catch: java.lang.Throwable -> L17
            r7.append(r11)     // Catch: java.lang.Throwable -> L17
            java.lang.String r5 = r7.toString()     // Catch: java.lang.Throwable -> L17
            cn.jiguang.w.f.c(r6, r5)     // Catch: java.lang.Throwable -> L17
            if (r11 > 0) goto L5c
            goto L1f
        L5c:
            cn.jiguang.ad.e r11 = new cn.jiguang.ad.e     // Catch: java.lang.Throwable -> L17
            java.lang.String r2 = "recv time out"
            r11.<init>(r1, r2)     // Catch: java.lang.Throwable -> L17
            throw r11     // Catch: java.lang.Throwable -> L17
        L64:
            java.nio.channels.Selector r5 = r10.f457d     // Catch: java.lang.Throwable -> L17
            java.util.Set r5 = r5.selectedKeys()     // Catch: java.lang.Throwable -> L17
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L17
        L6e:
            boolean r7 = r5.hasNext()     // Catch: java.lang.Throwable -> L17
            if (r7 == 0) goto L1f
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> L17
            java.nio.channels.SelectionKey r7 = (java.nio.channels.SelectionKey) r7     // Catch: java.lang.Throwable -> L17
            java.nio.channels.SelectableChannel r8 = r7.channel()     // Catch: java.lang.Throwable -> L17
            java.nio.channels.SocketChannel r8 = (java.nio.channels.SocketChannel) r8     // Catch: java.lang.Throwable -> L17
            boolean r9 = r7.isReadable()     // Catch: java.lang.Throwable -> L17
            if (r9 == 0) goto L123
            java.nio.ByteBuffer r3 = r10.f467k     // Catch: java.lang.Throwable -> L17
            int r3 = r8.read(r3)     // Catch: java.lang.Throwable -> L17
            r7 = -996(0xfffffffffffffc1c, float:NaN)
            if (r3 < 0) goto L10c
            java.nio.ByteBuffer r8 = r10.f467k     // Catch: java.lang.Throwable -> L17
            r8.flip()     // Catch: java.lang.Throwable -> L17
            java.nio.ByteBuffer r8 = r10.f467k     // Catch: java.lang.Throwable -> L17
            int r8 = r8.limit()     // Catch: java.lang.Throwable -> L17
            java.nio.ByteBuffer r9 = r10.a     // Catch: java.lang.Throwable -> L17
            int r9 = r9.remaining()     // Catch: java.lang.Throwable -> L17
            if (r9 < r8) goto Le7
            java.nio.ByteBuffer r7 = r10.a     // Catch: java.lang.Throwable -> L17
            java.nio.ByteBuffer r9 = r10.f467k     // Catch: java.lang.Throwable -> L17
            r7.put(r9)     // Catch: java.lang.Throwable -> L17
            int r7 = r10.f456c     // Catch: java.lang.Throwable -> L17
            int r7 = r7 + r8
            r10.f456c = r7     // Catch: java.lang.Throwable -> L17
            java.nio.ByteBuffer r7 = r10.f467k     // Catch: java.lang.Throwable -> L17
            r7.compact()     // Catch: java.lang.Throwable -> L17
            int r7 = r10.f456c     // Catch: java.lang.Throwable -> L17
            int r9 = r10.f459f     // Catch: java.lang.Throwable -> L17
            if (r7 >= r9) goto Le1
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L17
            r7.<init>()     // Catch: java.lang.Throwable -> L17
            java.lang.String r9 = "totalbuf can not parse head:"
            r7.append(r9)     // Catch: java.lang.Throwable -> L17
            int r9 = r10.f456c     // Catch: java.lang.Throwable -> L17
            r7.append(r9)     // Catch: java.lang.Throwable -> L17
            java.lang.String r9 = ",peerNetData len:"
            r7.append(r9)     // Catch: java.lang.Throwable -> L17
            r7.append(r8)     // Catch: java.lang.Throwable -> L17
            java.lang.String r9 = ",read:"
            r7.append(r9)     // Catch: java.lang.Throwable -> L17
            r7.append(r3)     // Catch: java.lang.Throwable -> L17
            java.lang.String r3 = r7.toString()     // Catch: java.lang.Throwable -> L17
            cn.jiguang.w.f.c(r6, r3)     // Catch: java.lang.Throwable -> L17
            goto Le5
        Le1:
            int r4 = r10.c()     // Catch: java.lang.Throwable -> L17
        Le5:
            r3 = r8
            goto L126
        Le7:
            cn.jiguang.ad.e r11 = new cn.jiguang.ad.e     // Catch: java.lang.Throwable -> L17
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L17
            r2.<init>()     // Catch: java.lang.Throwable -> L17
            java.lang.String r3 = "the total buf remaining less than readLen,remaining:"
            r2.append(r3)     // Catch: java.lang.Throwable -> L17
            java.nio.ByteBuffer r3 = r10.a     // Catch: java.lang.Throwable -> L17
            int r3 = r3.remaining()     // Catch: java.lang.Throwable -> L17
            r2.append(r3)     // Catch: java.lang.Throwable -> L17
            java.lang.String r3 = ",readLen:"
            r2.append(r3)     // Catch: java.lang.Throwable -> L17
            r2.append(r8)     // Catch: java.lang.Throwable -> L17
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L17
            r11.<init>(r7, r2)     // Catch: java.lang.Throwable -> L17
            throw r11     // Catch: java.lang.Throwable -> L17
        L10c:
            cn.jiguang.ad.e r11 = new cn.jiguang.ad.e     // Catch: java.lang.Throwable -> L17
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L17
            r2.<init>()     // Catch: java.lang.Throwable -> L17
            java.lang.String r4 = "read len < 0:"
            r2.append(r4)     // Catch: java.lang.Throwable -> L17
            r2.append(r3)     // Catch: java.lang.Throwable -> L17
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L17
            r11.<init>(r7, r2)     // Catch: java.lang.Throwable -> L17
            throw r11     // Catch: java.lang.Throwable -> L17
        L123:
            r7.isWritable()     // Catch: java.lang.Throwable -> L17
        L126:
            r5.remove()     // Catch: java.lang.Throwable -> L17
            goto L6e
        L12b:
            if (r4 == r2) goto L164
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "read len:"
            r11.append(r0)
            r11.append(r3)
            java.lang.String r0 = ",recvTotalLen:"
            r11.append(r0)
            int r0 = r10.f456c
            r11.append(r0)
            java.lang.String r0 = ",shouldLen:"
            r11.append(r0)
            r11.append(r4)
            java.lang.String r11 = r11.toString()
            cn.jiguang.w.f.c(r6, r11)
            java.nio.ByteBuffer r11 = r10.b(r4)
            if (r11 == 0) goto L15a
            return r11
        L15a:
            cn.jiguang.ad.e r11 = new cn.jiguang.ad.e
            r0 = -1001(0xfffffffffffffc17, float:NaN)
            java.lang.String r1 = "parse error"
            r11.<init>(r0, r1)
            throw r11
        L164:
            cn.jiguang.ad.e r11 = new cn.jiguang.ad.e
            java.lang.String r1 = "recv empty data or tcp has close"
            r11.<init>(r0, r1)
            throw r11
        L16c:
            cn.jiguang.ad.e r11 = new cn.jiguang.ad.e     // Catch: java.lang.Throwable -> L17
            java.lang.String r2 = "recv error,the connect is invalid"
            r3 = -991(0xfffffffffffffc21, float:NaN)
            r11.<init>(r3, r2)     // Catch: java.lang.Throwable -> L17
            throw r11     // Catch: java.lang.Throwable -> L17
        L176:
            boolean r2 = r11 instanceof java.net.SocketTimeoutException
            if (r2 != 0) goto L18b
            boolean r1 = r11 instanceof cn.jiguang.ad.e
            if (r1 == 0) goto L181
            cn.jiguang.ad.e r11 = (cn.jiguang.ad.e) r11
            throw r11
        L181:
            cn.jiguang.ad.e r1 = new cn.jiguang.ad.e
            java.lang.String r11 = r11.getMessage()
            r1.<init>(r0, r11)
            throw r1
        L18b:
            cn.jiguang.ad.e r0 = new cn.jiguang.ad.e
            java.lang.String r11 = r11.getMessage()
            r0.<init>(r1, r11)
            throw r0
    }

    @Override // cn.jiguang.ag.a, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r2 = this;
            java.lang.String r0 = "NioSocketClient"
            java.lang.String r1 = "close this connect"
            cn.jiguang.w.f.c(r0, r1)
            super.close()
            java.nio.channels.Selector r0 = r2.f457d
            if (r0 == 0) goto L11
            r0.close()     // Catch: java.io.IOException -> L11
        L11:
            java.nio.channels.SocketChannel r0 = r2.f455b
            cn.jiguang.av.x.a(r0)
            r0 = 0
            r2.f455b = r0
            return
    }
}
