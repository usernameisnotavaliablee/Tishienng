package cn.jiguang.ag;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b extends cn.jiguang.ag.a {

    /* renamed from: k, reason: collision with root package name */
    public static final java.lang.String f463k = null;

    /* renamed from: j, reason: collision with root package name */
    protected javax.net.ssl.SSLContext f464j;
    private javax.net.ssl.SSLEngine l;
    private java.nio.ByteBuffer m;
    private java.nio.ByteBuffer n;
    private java.nio.ByteBuffer o;
    private java.nio.ByteBuffer p;
    private final int q;
    private boolean r;

    /* renamed from: cn.jiguang.ag.b$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = null;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f465b = null;

        static {
                javax.net.ssl.SSLEngineResult$HandshakeStatus[] r0 = javax.net.ssl.SSLEngineResult.HandshakeStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                cn.jiguang.ag.b.AnonymousClass1.f465b = r0
                r1 = 1
                javax.net.ssl.SSLEngineResult$HandshakeStatus r2 = javax.net.ssl.SSLEngineResult.HandshakeStatus.FINISHED     // Catch: java.lang.NoSuchFieldError -> L12
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                r0 = 2
                int[] r2 = cn.jiguang.ag.b.AnonymousClass1.f465b     // Catch: java.lang.NoSuchFieldError -> L1d
                javax.net.ssl.SSLEngineResult$HandshakeStatus r3 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_TASK     // Catch: java.lang.NoSuchFieldError -> L1d
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                r2 = 3
                int[] r3 = cn.jiguang.ag.b.AnonymousClass1.f465b     // Catch: java.lang.NoSuchFieldError -> L28
                javax.net.ssl.SSLEngineResult$HandshakeStatus r4 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_UNWRAP     // Catch: java.lang.NoSuchFieldError -> L28
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                r3 = 4
                int[] r4 = cn.jiguang.ag.b.AnonymousClass1.f465b     // Catch: java.lang.NoSuchFieldError -> L33
                javax.net.ssl.SSLEngineResult$HandshakeStatus r5 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_WRAP     // Catch: java.lang.NoSuchFieldError -> L33
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r4[r5] = r3     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r4 = cn.jiguang.ag.b.AnonymousClass1.f465b     // Catch: java.lang.NoSuchFieldError -> L3e
                javax.net.ssl.SSLEngineResult$HandshakeStatus r5 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING     // Catch: java.lang.NoSuchFieldError -> L3e
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r6 = 5
                r4[r5] = r6     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                javax.net.ssl.SSLEngineResult$Status[] r4 = javax.net.ssl.SSLEngineResult.Status.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                cn.jiguang.ag.b.AnonymousClass1.a = r4
                javax.net.ssl.SSLEngineResult$Status r5 = javax.net.ssl.SSLEngineResult.Status.OK     // Catch: java.lang.NoSuchFieldError -> L4f
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4f
                r4[r5] = r1     // Catch: java.lang.NoSuchFieldError -> L4f
            L4f:
                int[] r1 = cn.jiguang.ag.b.AnonymousClass1.a     // Catch: java.lang.NoSuchFieldError -> L59
                javax.net.ssl.SSLEngineResult$Status r4 = javax.net.ssl.SSLEngineResult.Status.BUFFER_OVERFLOW     // Catch: java.lang.NoSuchFieldError -> L59
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L59
                r1[r4] = r0     // Catch: java.lang.NoSuchFieldError -> L59
            L59:
                int[] r0 = cn.jiguang.ag.b.AnonymousClass1.a     // Catch: java.lang.NoSuchFieldError -> L63
                javax.net.ssl.SSLEngineResult$Status r1 = javax.net.ssl.SSLEngineResult.Status.BUFFER_UNDERFLOW     // Catch: java.lang.NoSuchFieldError -> L63
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L63
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L63
            L63:
                int[] r0 = cn.jiguang.ag.b.AnonymousClass1.a     // Catch: java.lang.NoSuchFieldError -> L6d
                javax.net.ssl.SSLEngineResult$Status r1 = javax.net.ssl.SSLEngineResult.Status.CLOSED     // Catch: java.lang.NoSuchFieldError -> L6d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6d
                r0[r1] = r3     // Catch: java.lang.NoSuchFieldError -> L6d
            L6d:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    static {
            r0 = 3
            byte[] r0 = new byte[r0]
            r0 = {x000e: FILL_ARRAY_DATA , data: [66, 93, 99} // fill-array
            java.lang.String r0 = cn.jiguang.av.k.b(r0)
            cn.jiguang.ag.b.f463k = r0
            return
    }

    public b(int r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.q = r1
            r1 = 8192(0x2000, float:1.148E-41)
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)
            r0.o = r1
            r0.f459f = r2
            return
    }

    private int a(java.nio.channels.SocketChannel r5, javax.net.ssl.SSLEngine r6) {
            r4 = this;
            java.lang.String r0 = "NioSSLSocketClient"
            java.nio.ByteBuffer r1 = r4.p
            r1.clear()
            java.nio.ByteBuffer r1 = r4.o
            int r5 = r5.read(r1)
            if (r5 < 0) goto Lda
        Lf:
            java.nio.ByteBuffer r5 = r4.o
            boolean r5 = r5.hasRemaining()
            r1 = 0
            if (r5 == 0) goto Ld9
            java.nio.ByteBuffer r5 = r4.o     // Catch: java.lang.Throwable -> La0
            r5.flip()     // Catch: java.lang.Throwable -> La0
            java.nio.ByteBuffer r5 = r4.o     // Catch: java.lang.Throwable -> La0
            java.nio.ByteBuffer r2 = r4.p     // Catch: java.lang.Throwable -> La0
            javax.net.ssl.SSLEngineResult r5 = r6.unwrap(r5, r2)     // Catch: java.lang.Throwable -> La0
            java.nio.ByteBuffer r2 = r4.o     // Catch: java.lang.Throwable -> La0
            r2.compact()     // Catch: java.lang.Throwable -> La0
            int[] r2 = cn.jiguang.ag.b.AnonymousClass1.a
            javax.net.ssl.SSLEngineResult$Status r3 = r5.getStatus()
            int r3 = r3.ordinal()
            r2 = r2[r3]
            r3 = 1
            if (r2 == r3) goto Lf
            r3 = 2
            if (r2 == r3) goto L96
            r3 = 3
            if (r2 == r3) goto L8d
            r6 = 4
            if (r2 != r6) goto L69
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "ssl connect need to close["
            r5.append(r6)
            java.lang.String r6 = r4.f461h
            r5.append(r6)
            java.lang.String r6 = ":"
            r5.append(r6)
            int r6 = r4.f462i
            r5.append(r6)
            java.lang.String r6 = "]"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            cn.jiguang.w.f.i(r0, r5)
            r5 = -1
            return r5
        L69:
            cn.jiguang.as.a r6 = cn.jiguang.as.a.a()
            r0 = 11
            r6.a(r0)
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid SSL status: "
            r0.append(r1)
            javax.net.ssl.SSLEngineResult$Status r5 = r5.getStatus()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
        L8d:
            java.nio.ByteBuffer r5 = r4.o
            java.nio.ByteBuffer r5 = r4.c(r6, r5)
            r4.o = r5
            return r1
        L96:
            java.nio.ByteBuffer r5 = r4.p
            java.nio.ByteBuffer r5 = r4.b(r6, r5)
            r4.p = r5
            goto Lf
        La0:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = "recv data failed for unwrap net data, "
            r6.append(r1)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            cn.jiguang.w.f.i(r0, r6)
            cn.jiguang.as.a r6 = cn.jiguang.as.a.a()
            r0 = 10
            r6.a(r0)
            javax.net.ssl.SSLException r6 = new javax.net.ssl.SSLException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "unwrap ssl net data failed: "
            r0.append(r1)
            java.lang.String r5 = r5.getMessage()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
        Ld9:
            return r1
        Lda:
            cn.jiguang.as.a r6 = cn.jiguang.as.a.a()
            r0 = 12
            r6.a(r0)
            cn.jiguang.ad.e r6 = new cn.jiguang.ad.e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "read len < 0: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r0 = -996(0xfffffffffffffc1c, float:NaN)
            r6.<init>(r0, r5)
            throw r6
    }

    private java.nio.ByteBuffer a(java.nio.ByteBuffer r2, int r3) {
            r1 = this;
            int r0 = r2.capacity()
            if (r3 <= r0) goto Lb
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r3)
            return r2
        Lb:
            int r2 = r2.capacity()
            int r2 = r2 * 2
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)
            return r2
    }

    private java.nio.ByteBuffer a(javax.net.ssl.SSLEngine r1, java.nio.ByteBuffer r2) {
            r0 = this;
            javax.net.ssl.SSLSession r1 = r1.getSession()
            int r1 = r1.getPacketBufferSize()
            java.nio.ByteBuffer r1 = r0.a(r2, r1)
            return r1
    }

    private boolean a(java.nio.channels.SocketChannel r11) {
            r10 = this;
            long r0 = java.lang.System.currentTimeMillis()
            javax.net.ssl.SSLEngine r2 = r10.l
            r2.beginHandshake()
            javax.net.ssl.SSLEngine r2 = r10.l
            javax.net.ssl.SSLEngineResult$HandshakeStatus r2 = r2.getHandshakeStatus()
        Lf:
            boolean r3 = r10.f458e
            r4 = 0
            if (r3 == 0) goto L8f
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r0
            r7 = 15000(0x3a98, double:7.411E-320)
            java.lang.String r3 = "NioSSLSocketClient"
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L30
            java.lang.String r11 = "ssl hand shake time out"
            cn.jiguang.w.f.c(r3, r11)
            cn.jiguang.as.a r11 = cn.jiguang.as.a.a()
            r0 = 14
            r11.a(r0)
            return r4
        L30:
            int[] r5 = cn.jiguang.ag.b.AnonymousClass1.f465b
            int r6 = r2.ordinal()
            r5 = r5[r6]
            r6 = 2
            if (r5 == r6) goto L8a
            r6 = 3
            if (r5 == r6) goto L5e
            r3 = 4
            if (r5 == r3) goto L4f
            r3 = 5
            if (r5 == r3) goto L45
            goto Lf
        L45:
            r11.configureBlocking(r4)
            java.nio.channels.Selector r0 = r10.f457d
            r1 = 1
            r11.register(r0, r1)
            return r1
        L4f:
            javax.net.ssl.SSLEngineResult$HandshakeStatus r2 = r10.g()
            java.nio.ByteBuffer r3 = r10.n
            r11.write(r3)
            java.nio.ByteBuffer r3 = r10.n
            r3.clear()
            goto Lf
        L5e:
            java.nio.ByteBuffer r2 = r10.o
            int r2 = r11.read(r2)
            if (r2 <= 0) goto L80
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "NEED_UNWRAP read:"
            r2.append(r4)
            java.nio.ByteBuffer r4 = r10.o
            java.lang.String r4 = r4.toString()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            cn.jiguang.w.f.c(r3, r2)
        L80:
            java.nio.ByteBuffer r2 = r10.o
            r2.flip()
            javax.net.ssl.SSLEngineResult$HandshakeStatus r2 = r10.f()
            goto Lf
        L8a:
            javax.net.ssl.SSLEngineResult$HandshakeStatus r2 = r10.e()
            goto Lf
        L8f:
            return r4
    }

    private java.nio.ByteBuffer b(javax.net.ssl.SSLEngine r1, java.nio.ByteBuffer r2) {
            r0 = this;
            javax.net.ssl.SSLSession r1 = r1.getSession()
            int r1 = r1.getApplicationBufferSize()
            java.nio.ByteBuffer r1 = r0.a(r2, r1)
            return r1
    }

    private boolean b(byte[] r5) {
            r4 = this;
            java.lang.String r0 = "NioSSLSocketClient"
            r1 = 0
            boolean r2 = r4.b()     // Catch: java.lang.Exception -> Lf
            if (r2 != 0) goto L11
            java.lang.String r5 = "send error - connect was invalid"
            cn.jiguang.w.f.k(r0, r5)     // Catch: java.lang.Exception -> Lf
            return r1
        Lf:
            r5 = move-exception
            goto L22
        L11:
            if (r5 == 0) goto L1c
            int r2 = r5.length     // Catch: java.lang.Exception -> Lf
            if (r2 > 0) goto L17
            goto L1c
        L17:
            boolean r5 = r4.c(r5)     // Catch: java.lang.Exception -> Lf
            return r5
        L1c:
            java.lang.String r5 = "send error - invalide buffer"
            cn.jiguang.w.f.c(r0, r5)     // Catch: java.lang.Exception -> Lf
            return r1
        L22:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "send data error:"
            r2.append(r3)
            java.lang.String r5 = r5.getMessage()
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            cn.jiguang.w.f.j(r0, r5)
            r4.close()
            return r1
    }

    private java.nio.ByteBuffer c(javax.net.ssl.SSLEngine r3, java.nio.ByteBuffer r4) {
            r2 = this;
            javax.net.ssl.SSLSession r0 = r3.getSession()
            int r0 = r0.getPacketBufferSize()
            int r1 = r4.limit()
            if (r0 >= r1) goto Lf
            return r4
        Lf:
            java.nio.ByteBuffer r3 = r2.a(r3, r4)
            r4.flip()
            r3.put(r4)
            return r3
    }

    private boolean c(byte[] r4) {
            r3 = this;
            java.nio.ByteBuffer r0 = r3.m
            r0.clear()
            java.nio.ByteBuffer r0 = r3.m
            r0.put(r4)
            java.nio.ByteBuffer r4 = r3.m
            r4.flip()
        Lf:
            java.nio.ByteBuffer r4 = r3.m
            boolean r4 = r4.hasRemaining()
            r0 = 1
            if (r4 == 0) goto Lc4
            java.nio.ByteBuffer r4 = r3.n
            r4.clear()
            javax.net.ssl.SSLEngine r4 = r3.l
            java.nio.ByteBuffer r1 = r3.m
            java.nio.ByteBuffer r2 = r3.n
            javax.net.ssl.SSLEngineResult r4 = r4.wrap(r1, r2)
            int[] r1 = cn.jiguang.ag.b.AnonymousClass1.a
            javax.net.ssl.SSLEngineResult$Status r2 = r4.getStatus()
            int r2 = r2.ordinal()
            r1 = r1[r2]
            if (r1 == r0) goto L86
            r0 = 2
            if (r1 == r0) goto L7b
            r0 = 3
            if (r1 == r0) goto L6a
            r0 = 4
            if (r1 == r0) goto L62
            cn.jiguang.as.a r0 = cn.jiguang.as.a.a()
            r1 = 11
            r0.a(r1)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid SSL status: "
            r1.append(r2)
            javax.net.ssl.SSLEngineResult$Status r4 = r4.getStatus()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L62:
            java.lang.Exception r4 = new java.lang.Exception
            java.lang.String r0 = "connect close"
            r4.<init>(r0)
            throw r4
        L6a:
            cn.jiguang.as.a r4 = cn.jiguang.as.a.a()
            r0 = 13
            r4.a(r0)
            javax.net.ssl.SSLException r4 = new javax.net.ssl.SSLException
            java.lang.String r0 = "Buffer underflow occured after a wrap. I don't think we should ever get here."
            r4.<init>(r0)
            throw r4
        L7b:
            javax.net.ssl.SSLEngine r4 = r3.l
            java.nio.ByteBuffer r0 = r3.n
            java.nio.ByteBuffer r4 = r3.a(r4, r0)
            r3.n = r4
            goto Lf
        L86:
            java.nio.ByteBuffer r4 = r3.n
            r4.flip()
            r4 = 0
        L8c:
            java.nio.ByteBuffer r0 = r3.n
            boolean r0 = r0.hasRemaining()
            if (r0 == 0) goto L9e
            java.nio.channels.SocketChannel r0 = r3.f455b
            java.nio.ByteBuffer r1 = r3.n
            int r0 = r0.write(r1)
            int r4 = r4 + r0
            goto L8c
        L9e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "send data to server, writeLen: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = ", isRemaining: "
            r0.append(r4)
            java.nio.ByteBuffer r4 = r3.m
            boolean r4 = r4.hasRemaining()
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "NioSSLSocketClient"
            cn.jiguang.w.f.c(r0, r4)
            goto Lf
        Lc4:
            return r0
    }

    private javax.net.ssl.SSLEngineResult.HandshakeStatus e() {
            r3 = this;
        L0:
            boolean r0 = r3.f458e
            java.lang.String r1 = "NioSSLSocketClient"
            if (r0 == 0) goto L17
            javax.net.ssl.SSLEngine r0 = r3.l
            java.lang.Runnable r0 = r0.getDelegatedTask()
            if (r0 == 0) goto L17
            java.lang.String r2 = "running delegated task..."
            cn.jiguang.w.f.a(r1, r2)
            r0.run()
            goto L0
        L17:
            javax.net.ssl.SSLEngine r0 = r3.l
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = r0.getHandshakeStatus()
            javax.net.ssl.SSLEngineResult$HandshakeStatus r2 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_TASK
            if (r0 != r2) goto L26
            java.lang.String r2 = "handshake shouldn't need additional tasks"
            cn.jiguang.w.f.a(r1, r2)
        L26:
            return r0
    }

    private javax.net.ssl.SSLEngineResult.HandshakeStatus f() {
            r3 = this;
        L0:
            javax.net.ssl.SSLEngine r0 = r3.l
            java.nio.ByteBuffer r1 = r3.o
            java.nio.ByteBuffer r2 = r3.p
            javax.net.ssl.SSLEngineResult r0 = r0.unwrap(r1, r2)
            javax.net.ssl.SSLEngineResult$HandshakeStatus r1 = r3.e()
            javax.net.ssl.SSLEngineResult$Status r0 = r0.getStatus()
            javax.net.ssl.SSLEngineResult$Status r2 = javax.net.ssl.SSLEngineResult.Status.BUFFER_UNDERFLOW
            if (r0 != r2) goto L17
            goto L27
        L17:
            boolean r0 = r3.f458e
            if (r0 == 0) goto L27
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_UNWRAP
            if (r1 != r0) goto L27
            java.nio.ByteBuffer r0 = r3.o
            int r0 = r0.remaining()
            if (r0 > 0) goto L0
        L27:
            java.nio.ByteBuffer r0 = r3.o
            r0.compact()
            return r1
    }

    private javax.net.ssl.SSLEngineResult.HandshakeStatus g() {
            r3 = this;
            java.lang.String r0 = ""
            byte[] r0 = r0.getBytes()
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            javax.net.ssl.SSLEngine r1 = r3.l
            java.nio.ByteBuffer r2 = r3.n
            r1.wrap(r0, r2)
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = r3.e()
            java.nio.ByteBuffer r1 = r3.n
            r1.flip()
            return r0
    }

    @Override // cn.jiguang.ag.a
    public synchronized int a(java.lang.String r12, int r13) {
            r11 = this;
            monitor-enter(r11)
            super.a(r12, r13)     // Catch: java.lang.Throwable -> Lfd
            r0 = 3
            r1 = -994(0xfffffffffffffc1e, float:NaN)
            boolean r2 = r11.d()     // Catch: java.lang.Throwable -> L18
            r3 = -992(0xfffffffffffffc20, float:NaN)
            if (r2 != 0) goto L1b
            java.lang.String r12 = "NioSSLSocketClient"
            java.lang.String r13 = "#unexcepted - create SSL failed"
            cn.jiguang.w.f.a(r12, r13)     // Catch: java.lang.Throwable -> L18
            monitor-exit(r11)
            return r3
        L18:
            r12 = move-exception
            goto Lce
        L1b:
            java.lang.String r2 = "NioSSLSocketClient"
            java.lang.String r4 = "tcp connecting..."
            cn.jiguang.w.f.a(r2, r4)     // Catch: java.lang.Throwable -> L18
            java.nio.channels.SocketChannel r2 = java.nio.channels.SocketChannel.open()     // Catch: java.lang.Throwable -> L18
            r11.f455b = r2     // Catch: java.lang.Throwable -> L18
            java.nio.channels.Selector r2 = java.nio.channels.Selector.open()     // Catch: java.lang.Throwable -> L18
            r11.f457d = r2     // Catch: java.lang.Throwable -> L18
            java.nio.channels.SocketChannel r2 = r11.f455b     // Catch: java.lang.Throwable -> L18
            r4 = 0
            r2.configureBlocking(r4)     // Catch: java.lang.Throwable -> L18
            java.net.InetSocketAddress r2 = new java.net.InetSocketAddress     // Catch: java.lang.Throwable -> L18
            r2.<init>(r12, r13)     // Catch: java.lang.Throwable -> L18
            java.nio.channels.SocketChannel r5 = r11.f455b     // Catch: java.lang.Throwable -> L18
            r5.connect(r2)     // Catch: java.lang.Throwable -> L18
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L18
        L42:
            java.nio.channels.SocketChannel r2 = r11.f455b     // Catch: java.lang.Throwable -> L18
            boolean r2 = r2.finishConnect()     // Catch: java.lang.Throwable -> L18
            r7 = -991(0xfffffffffffffc21, float:NaN)
            if (r2 != 0) goto L76
            boolean r2 = r11.f458e     // Catch: java.lang.Throwable -> L18
            if (r2 != 0) goto L59
            java.lang.String r12 = "NioSSLSocketClient"
            java.lang.String r13 = "has close channel when connect..."
            cn.jiguang.w.f.c(r12, r13)     // Catch: java.lang.Throwable -> L18
            monitor-exit(r11)
            return r7
        L59:
            r7 = 10
            java.lang.Thread.sleep(r7)     // Catch: java.lang.Throwable -> L18
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L18
            long r7 = r7 - r5
            r9 = 3000(0xbb8, double:1.482E-320)
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 <= 0) goto L42
            r11.close()     // Catch: java.lang.Throwable -> L18
            cn.jiguang.as.a r12 = cn.jiguang.as.a.a()     // Catch: java.lang.Throwable -> L18
            r13 = 2
            r12.a(r13)     // Catch: java.lang.Throwable -> L18
            monitor-exit(r11)
            return r1
        L76:
            boolean r2 = r11.f458e     // Catch: java.lang.Throwable -> L18
            if (r2 != 0) goto L83
            java.lang.String r12 = "NioSSLSocketClient"
            java.lang.String r13 = "has close channel when connected..."
            cn.jiguang.w.f.c(r12, r13)     // Catch: java.lang.Throwable -> L18
            monitor-exit(r11)
            return r7
        L83:
            java.lang.String r2 = "NioSSLSocketClient"
            java.lang.String r5 = "begin doHandShake"
            cn.jiguang.w.f.c(r2, r5)     // Catch: java.lang.Throwable -> L18
            java.nio.channels.SocketChannel r2 = r11.f455b     // Catch: java.lang.Throwable -> L18
            boolean r2 = r11.a(r2)     // Catch: java.lang.Throwable -> L18
            r11.r = r2     // Catch: java.lang.Throwable -> L18
            if (r2 != 0) goto La4
            java.lang.String r12 = "NioSSLSocketClient"
            java.lang.String r13 = "handShake failed"
            cn.jiguang.w.f.c(r12, r13)     // Catch: java.lang.Throwable -> L18
            cn.jiguang.as.a r12 = cn.jiguang.as.a.a()     // Catch: java.lang.Throwable -> L18
            r12.a(r0)     // Catch: java.lang.Throwable -> L18
            monitor-exit(r11)
            return r3
        La4:
            java.nio.ByteBuffer r2 = r11.o     // Catch: java.lang.Throwable -> L18
            r2.clear()     // Catch: java.lang.Throwable -> L18
            java.lang.String r2 = "NioSSLSocketClient"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L18
            r3.<init>()     // Catch: java.lang.Throwable -> L18
            java.lang.String r5 = "tcp connected ["
            r3.append(r5)     // Catch: java.lang.Throwable -> L18
            r3.append(r12)     // Catch: java.lang.Throwable -> L18
            java.lang.String r12 = ":"
            r3.append(r12)     // Catch: java.lang.Throwable -> L18
            r3.append(r13)     // Catch: java.lang.Throwable -> L18
            java.lang.String r12 = "]"
            r3.append(r12)     // Catch: java.lang.Throwable -> L18
            java.lang.String r12 = r3.toString()     // Catch: java.lang.Throwable -> L18
            cn.jiguang.w.f.c(r2, r12)     // Catch: java.lang.Throwable -> L18
            monitor-exit(r11)
            return r4
        Lce:
            java.lang.String r13 = "NioSSLSocketClient"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lfd
            r2.<init>()     // Catch: java.lang.Throwable -> Lfd
            java.lang.String r3 = "tcp connect has failed:"
            r2.append(r3)     // Catch: java.lang.Throwable -> Lfd
            r2.append(r12)     // Catch: java.lang.Throwable -> Lfd
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Lfd
            cn.jiguang.w.f.j(r13, r2)     // Catch: java.lang.Throwable -> Lfd
            cn.jiguang.as.a r13 = cn.jiguang.as.a.a()     // Catch: java.lang.Throwable -> Lfd
            boolean r2 = r12 instanceof java.net.SocketTimeoutException     // Catch: java.lang.Throwable -> Lfd
            if (r2 == 0) goto Led
            goto Lee
        Led:
            r0 = 4
        Lee:
            r13.a(r0)     // Catch: java.lang.Throwable -> Lfd
            r11.close()     // Catch: java.lang.Throwable -> Lfd
            boolean r12 = r12 instanceof java.net.SocketTimeoutException     // Catch: java.lang.Throwable -> Lfd
            if (r12 == 0) goto Lf9
            goto Lfb
        Lf9:
            r1 = -1000(0xfffffffffffffc18, float:NaN)
        Lfb:
            monitor-exit(r11)
            return r1
        Lfd:
            r12 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> Lfd
            throw r12
    }

    @Override // cn.jiguang.ag.a
    public synchronized int a(byte[] r5) {
            r4 = this;
            monitor-enter(r4)
            r0 = 103(0x67, float:1.44E-43)
            if (r5 != 0) goto L10
            java.lang.String r5 = "NioSSLSocketClient"
            java.lang.String r1 = "sendData failed, send data was null"
            cn.jiguang.w.f.c(r5, r1)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r4)
            return r0
        Le:
            r5 = move-exception
            goto L51
        L10:
            java.lang.String r1 = "NioSSLSocketClient"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le
            r2.<init>()     // Catch: java.lang.Throwable -> Le
            java.lang.String r3 = "send data length:"
            r2.append(r3)     // Catch: java.lang.Throwable -> Le
            int r3 = r5.length     // Catch: java.lang.Throwable -> Le
            r2.append(r3)     // Catch: java.lang.Throwable -> Le
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Le
            cn.jiguang.w.f.c(r1, r2)     // Catch: java.lang.Throwable -> Le
            int r1 = r5.length     // Catch: java.lang.Throwable -> Le
            int r2 = r4.q     // Catch: java.lang.Throwable -> Le
            if (r1 < r2) goto L48
            java.lang.String r5 = "NioSSLSocketClient"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le
            r0.<init>()     // Catch: java.lang.Throwable -> Le
            java.lang.String r1 = "sendData failed, data length must less than "
            r0.append(r1)     // Catch: java.lang.Throwable -> Le
            int r1 = r4.q     // Catch: java.lang.Throwable -> Le
            r0.append(r1)     // Catch: java.lang.Throwable -> Le
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Le
            cn.jiguang.w.f.c(r5, r0)     // Catch: java.lang.Throwable -> Le
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
    public java.nio.ByteBuffer a(int r17) {
            r16 = this;
            r1 = r16
            r0 = r17
            boolean r2 = r1.b()
            if (r2 == 0) goto L1f6
            int r2 = r1.c()
            r3 = 0
            if (r2 <= 0) goto L1f
            java.nio.ByteBuffer r2 = r1.b(r2)
            if (r2 == 0) goto L1f
            cn.jiguang.as.a r0 = cn.jiguang.as.a.a()
            r0.a(r3)
            return r2
        L1f:
            r2 = -997(0xfffffffffffffc1b, float:NaN)
            r4 = -994(0xfffffffffffffc1e, float:NaN)
            r5 = 2
            boolean r6 = r1.b()     // Catch: java.lang.Throwable -> L3b
            r7 = 4
            r8 = 0
            java.lang.String r9 = "NioSSLSocketClient"
            if (r6 != 0) goto L3e
            java.lang.String r0 = "recv register error,the connect is invalid"
            cn.jiguang.w.f.c(r9, r0)     // Catch: java.lang.Throwable -> L3b
            cn.jiguang.as.a r0 = cn.jiguang.as.a.a()     // Catch: java.lang.Throwable -> L3b
            r0.a(r7)     // Catch: java.lang.Throwable -> L3b
            return r8
        L3b:
            r0 = move-exception
            goto L1c8
        L3e:
            r6 = 1048576(0x100000, float:1.469368E-39)
            r10 = 1048576(0x100000, float:1.469368E-39)
            r11 = 0
        L43:
            boolean r12 = r1.b()     // Catch: java.lang.Throwable -> L3b
            if (r12 == 0) goto L16e
            int r12 = r1.f456c     // Catch: java.lang.Throwable -> L3b
            if (r12 >= r10) goto L16e
            if (r0 <= 0) goto L57
            java.nio.channels.Selector r12 = r1.f457d     // Catch: java.lang.Throwable -> L3b
            long r13 = (long) r0     // Catch: java.lang.Throwable -> L3b
            int r12 = r12.select(r13)     // Catch: java.lang.Throwable -> L3b
            goto L5d
        L57:
            java.nio.channels.Selector r12 = r1.f457d     // Catch: java.lang.Throwable -> L3b
            int r12 = r12.select()     // Catch: java.lang.Throwable -> L3b
        L5d:
            if (r12 != 0) goto L8d
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3b
            r13.<init>()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r14 = "readSelect:"
            r13.append(r14)     // Catch: java.lang.Throwable -> L3b
            r13.append(r12)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r12 = ", time out:"
            r13.append(r12)     // Catch: java.lang.Throwable -> L3b
            r13.append(r0)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r12 = r13.toString()     // Catch: java.lang.Throwable -> L3b
            cn.jiguang.w.f.c(r9, r12)     // Catch: java.lang.Throwable -> L3b
            if (r0 > 0) goto L7e
            goto L43
        L7e:
            cn.jiguang.as.a r0 = cn.jiguang.as.a.a()     // Catch: java.lang.Throwable -> L3b
            r0.a(r5)     // Catch: java.lang.Throwable -> L3b
            cn.jiguang.ad.e r0 = new cn.jiguang.ad.e     // Catch: java.lang.Throwable -> L3b
            java.lang.String r3 = "recv time out"
            r0.<init>(r4, r3)     // Catch: java.lang.Throwable -> L3b
            throw r0     // Catch: java.lang.Throwable -> L3b
        L8d:
            java.nio.channels.Selector r12 = r1.f457d     // Catch: java.lang.Throwable -> L3b
            java.util.Set r12 = r12.selectedKeys()     // Catch: java.lang.Throwable -> L3b
            java.util.Iterator r12 = r12.iterator()     // Catch: java.lang.Throwable -> L3b
        L97:
            boolean r13 = r12.hasNext()     // Catch: java.lang.Throwable -> L3b
            if (r13 == 0) goto L43
            java.lang.Object r13 = r12.next()     // Catch: java.lang.Throwable -> L3b
            java.nio.channels.SelectionKey r13 = (java.nio.channels.SelectionKey) r13     // Catch: java.lang.Throwable -> L3b
            r12.remove()     // Catch: java.lang.Throwable -> L3b
            java.nio.channels.SelectableChannel r14 = r13.channel()     // Catch: java.lang.Throwable -> L3b
            java.nio.channels.SocketChannel r14 = (java.nio.channels.SocketChannel) r14     // Catch: java.lang.Throwable -> L3b
            boolean r15 = r1.b()     // Catch: java.lang.Throwable -> L3b
            if (r15 != 0) goto Lbf
            java.lang.String r0 = "tcp connect has set false in select key"
            cn.jiguang.w.f.c(r9, r0)     // Catch: java.lang.Throwable -> L3b
            cn.jiguang.as.a r0 = cn.jiguang.as.a.a()     // Catch: java.lang.Throwable -> L3b
            r0.a(r7)     // Catch: java.lang.Throwable -> L3b
            return r8
        Lbf:
            boolean r15 = r13.isReadable()     // Catch: java.lang.Throwable -> L3b
            if (r15 == 0) goto L168
            javax.net.ssl.SSLEngine r15 = r1.l     // Catch: java.lang.Throwable -> L3b
            javax.net.ssl.SSLEngineResult$HandshakeStatus r15 = r15.getHandshakeStatus()     // Catch: java.lang.Throwable -> L3b
            javax.net.ssl.SSLEngineResult$HandshakeStatus r7 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING     // Catch: java.lang.Throwable -> L3b
            if (r15 != r7) goto L16b
            javax.net.ssl.SSLEngine r7 = r1.l     // Catch: java.lang.Throwable -> L3b
            int r7 = r1.a(r14, r7)     // Catch: java.lang.Throwable -> L3b
            if (r7 != 0) goto L164
            java.nio.ByteBuffer r11 = r1.p     // Catch: java.lang.Throwable -> L3b
            r11.flip()     // Catch: java.lang.Throwable -> L3b
            java.nio.ByteBuffer r11 = r1.p     // Catch: java.lang.Throwable -> L3b
            int r11 = r11.limit()     // Catch: java.lang.Throwable -> L3b
            java.nio.ByteBuffer r13 = r1.a     // Catch: java.lang.Throwable -> L3b
            int r13 = r13.remaining()     // Catch: java.lang.Throwable -> L3b
            if (r13 < r11) goto L135
            java.nio.ByteBuffer r13 = r1.a     // Catch: java.lang.Throwable -> L3b
            java.nio.ByteBuffer r14 = r1.p     // Catch: java.lang.Throwable -> L3b
            r13.put(r14)     // Catch: java.lang.Throwable -> L3b
            int r13 = r1.f456c     // Catch: java.lang.Throwable -> L3b
            int r13 = r13 + r11
            r1.f456c = r13     // Catch: java.lang.Throwable -> L3b
            java.nio.ByteBuffer r13 = r1.p     // Catch: java.lang.Throwable -> L3b
            r13.compact()     // Catch: java.lang.Throwable -> L3b
            int r13 = r1.f456c     // Catch: java.lang.Throwable -> L3b
            int r14 = r1.f459f     // Catch: java.lang.Throwable -> L3b
            if (r13 >= r14) goto L130
            cn.jiguang.as.a r13 = cn.jiguang.as.a.a()     // Catch: java.lang.Throwable -> L3b
            r14 = 6
            r13.a(r14)     // Catch: java.lang.Throwable -> L3b
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3b
            r13.<init>()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r14 = "totalbuf can not parse head:"
            r13.append(r14)     // Catch: java.lang.Throwable -> L3b
            int r14 = r1.f456c     // Catch: java.lang.Throwable -> L3b
            r13.append(r14)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r14 = ",peerNetData len:"
            r13.append(r14)     // Catch: java.lang.Throwable -> L3b
            r13.append(r11)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r14 = ",read:"
            r13.append(r14)     // Catch: java.lang.Throwable -> L3b
            r13.append(r7)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r7 = r13.toString()     // Catch: java.lang.Throwable -> L3b
            cn.jiguang.w.f.c(r9, r7)     // Catch: java.lang.Throwable -> L3b
            goto L16b
        L130:
            int r10 = r1.c()     // Catch: java.lang.Throwable -> L3b
            goto L16b
        L135:
            cn.jiguang.as.a r0 = cn.jiguang.as.a.a()     // Catch: java.lang.Throwable -> L3b
            r3 = 5
            r0.a(r3)     // Catch: java.lang.Throwable -> L3b
            cn.jiguang.ad.e r0 = new cn.jiguang.ad.e     // Catch: java.lang.Throwable -> L3b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3b
            r3.<init>()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r6 = "the total buf remaining less than readLen,remaining:"
            r3.append(r6)     // Catch: java.lang.Throwable -> L3b
            java.nio.ByteBuffer r6 = r1.a     // Catch: java.lang.Throwable -> L3b
            int r6 = r6.remaining()     // Catch: java.lang.Throwable -> L3b
            r3.append(r6)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r6 = ",readLen:"
            r3.append(r6)     // Catch: java.lang.Throwable -> L3b
            r3.append(r11)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L3b
            r6 = -996(0xfffffffffffffc1c, float:NaN)
            r0.<init>(r6, r3)     // Catch: java.lang.Throwable -> L3b
            throw r0     // Catch: java.lang.Throwable -> L3b
        L164:
            r13.cancel()     // Catch: java.lang.Throwable -> L3b
            return r8
        L168:
            r13.isWritable()     // Catch: java.lang.Throwable -> L3b
        L16b:
            r7 = 4
            goto L97
        L16e:
            if (r10 == r6) goto L1b7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "read len:"
            r0.append(r2)
            r0.append(r11)
            java.lang.String r2 = ",recvTotalLen:"
            r0.append(r2)
            int r2 = r1.f456c
            r0.append(r2)
            java.lang.String r2 = ",shouldLen:"
            r0.append(r2)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            cn.jiguang.w.f.c(r9, r0)
            java.nio.ByteBuffer r0 = r1.b(r10)
            if (r0 == 0) goto L1a4
            cn.jiguang.as.a r2 = cn.jiguang.as.a.a()
            r2.a(r3)
            return r0
        L1a4:
            cn.jiguang.as.a r0 = cn.jiguang.as.a.a()
            r2 = 8
            r0.a(r2)
            cn.jiguang.ad.e r0 = new cn.jiguang.ad.e
            r2 = -1001(0xfffffffffffffc17, float:NaN)
            java.lang.String r3 = "parse error"
            r0.<init>(r2, r3)
            throw r0
        L1b7:
            cn.jiguang.as.a r0 = cn.jiguang.as.a.a()
            r3 = 9
            r0.a(r3)
            cn.jiguang.ad.e r0 = new cn.jiguang.ad.e
            java.lang.String r3 = "recv empty data or tcp has close"
            r0.<init>(r2, r3)
            throw r0
        L1c8:
            boolean r3 = r0 instanceof java.net.SocketTimeoutException
            if (r3 != 0) goto L1e5
            boolean r3 = r0 instanceof cn.jiguang.ad.e
            if (r3 == 0) goto L1d3
            cn.jiguang.ad.e r0 = (cn.jiguang.ad.e) r0
            throw r0
        L1d3:
            cn.jiguang.as.a r3 = cn.jiguang.as.a.a()
            r4 = 7
            r3.a(r4)
            cn.jiguang.ad.e r3 = new cn.jiguang.ad.e
            java.lang.String r0 = r0.getMessage()
            r3.<init>(r2, r0)
            throw r3
        L1e5:
            cn.jiguang.as.a r2 = cn.jiguang.as.a.a()
            r2.a(r5)
            cn.jiguang.ad.e r2 = new cn.jiguang.ad.e
            java.lang.String r0 = r0.getMessage()
            r2.<init>(r4, r0)
            throw r2
        L1f6:
            cn.jiguang.ad.e r0 = new cn.jiguang.ad.e
            r2 = -991(0xfffffffffffffc21, float:NaN)
            java.lang.String r3 = "recv error,the connect is invalid"
            r0.<init>(r2, r3)
            throw r0
    }

    @Override // cn.jiguang.ag.a
    public boolean b() {
            r1 = this;
            boolean r0 = super.b()
            if (r0 == 0) goto Lc
            boolean r0 = r1.r
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    @Override // cn.jiguang.ag.a, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r4 = this;
            java.lang.String r0 = "close this connect..."
            java.lang.String r1 = "NioSSLSocketClient"
            cn.jiguang.w.f.a(r1, r0)
            super.close()
            java.nio.ByteBuffer r0 = r4.m
            if (r0 == 0) goto L11
            r0.clear()
        L11:
            java.nio.ByteBuffer r0 = r4.n
            if (r0 == 0) goto L18
            r0.clear()
        L18:
            java.nio.ByteBuffer r0 = r4.p
            if (r0 == 0) goto L1f
            r0.clear()
        L1f:
            java.nio.ByteBuffer r0 = r4.o
            if (r0 == 0) goto L26
            r0.clear()
        L26:
            java.nio.channels.Selector r0 = r4.f457d
            if (r0 == 0) goto L47
            r0.close()     // Catch: java.lang.Exception -> L2e
            goto L47
        L2e:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "selector close error："
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            cn.jiguang.w.f.c(r1, r0)
        L47:
            java.nio.channels.SocketChannel r0 = r4.f455b
            cn.jiguang.av.x.a(r0)
            r0 = 0
            r4.f455b = r0
            java.lang.String r0 = "tcp has closed"
            cn.jiguang.w.f.a(r1, r0)
            return
    }

    protected boolean d() {
            r7 = this;
            java.lang.String r0 = "NioSSLSocketClient"
            r1 = 0
            r2 = 1
            java.lang.String r3 = cn.jiguang.ag.b.f463k     // Catch: java.lang.Throwable -> L7a
            javax.net.ssl.SSLContext r3 = javax.net.ssl.SSLContext.getInstance(r3)     // Catch: java.lang.Throwable -> L7a
            r7.f464j = r3     // Catch: java.lang.Throwable -> L7a
            cn.jiguang.net.JGTrustManager r4 = new cn.jiguang.net.JGTrustManager     // Catch: java.lang.Throwable -> L7a
            java.lang.String r5 = cn.jiguang.v.j.a()     // Catch: java.lang.Throwable -> L7a
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L7a
            javax.net.ssl.TrustManager[] r5 = new javax.net.ssl.TrustManager[r2]     // Catch: java.lang.Throwable -> L7a
            r5[r1] = r4     // Catch: java.lang.Throwable -> L7a
            java.security.SecureRandom r4 = new java.security.SecureRandom     // Catch: java.lang.Throwable -> L7a
            r4.<init>()     // Catch: java.lang.Throwable -> L7a
            r6 = 0
            r3.init(r6, r5, r4)     // Catch: java.lang.Throwable -> L7a
            javax.net.ssl.SSLContext r3 = r7.f464j     // Catch: java.lang.Throwable -> L7a
            javax.net.ssl.SSLEngine r3 = r3.createSSLEngine()     // Catch: java.lang.Throwable -> L7a
            r7.l = r3     // Catch: java.lang.Throwable -> L7a
            r3.setUseClientMode(r2)     // Catch: java.lang.Throwable -> L7a
            javax.net.ssl.SSLEngine r3 = r7.l     // Catch: java.lang.Throwable -> L7a
            javax.net.ssl.SSLSession r3 = r3.getSession()     // Catch: java.lang.Throwable -> L7a
            int r4 = r3.getApplicationBufferSize()     // Catch: java.lang.Throwable -> L7a
            int r5 = r3.getPacketBufferSize()     // Catch: java.lang.Throwable -> L7a
            int r4 = r4 + 10
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r4)     // Catch: java.lang.Throwable -> L7a
            r7.p = r4     // Catch: java.lang.Throwable -> L7a
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r5)     // Catch: java.lang.Throwable -> L7a
            r7.o = r4     // Catch: java.lang.Throwable -> L7a
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r5)     // Catch: java.lang.Throwable -> L7a
            r7.m = r4     // Catch: java.lang.Throwable -> L7a
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r5)     // Catch: java.lang.Throwable -> L7a
            r7.n = r4     // Catch: java.lang.Throwable -> L7a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7a
            r4.<init>()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r5 = "application size:"
            r4.append(r5)     // Catch: java.lang.Throwable -> L7a
            int r5 = r3.getApplicationBufferSize()     // Catch: java.lang.Throwable -> L7a
            r4.append(r5)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r5 = ",package size:"
            r4.append(r5)     // Catch: java.lang.Throwable -> L7a
            int r3 = r3.getPacketBufferSize()     // Catch: java.lang.Throwable -> L7a
            r4.append(r3)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> L7a
            cn.jiguang.w.f.a(r0, r3)     // Catch: java.lang.Throwable -> L7a
            return r2
        L7a:
            r3 = move-exception
            cn.jiguang.as.a r4 = cn.jiguang.as.a.a()
            r4.a(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "NioSSLSocketClient create ssl error, cur time is:"
            r2.append(r4)
            long r4 = java.lang.System.currentTimeMillis()
            r2.append(r4)
            java.lang.String r4 = ",error:"
            r2.append(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            cn.jiguang.w.f.j(r0, r2)
            return r1
    }
}
