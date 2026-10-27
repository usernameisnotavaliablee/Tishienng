package com.bykv.vk.openvk.component.video.j.j.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class xt implements com.bykv.vk.openvk.component.video.j.j.j.cw {
    private static final java.util.HashMap<java.lang.String, com.bykv.vk.openvk.component.video.j.j.j.xt> j = null;
    private volatile long ae;
    private final java.lang.Object cw;
    private volatile boolean g;

    /* renamed from: m, reason: collision with root package name */
    private long f1691m;
    private java.io.RandomAccessFile oq;
    private final com.bykv.vk.openvk.component.video.api.cw.r qv;

    /* renamed from: r, reason: collision with root package name */
    private java.io.File f1692r;
    private volatile boolean tl;
    private java.io.File up;
    private com.bykv.vk.openvk.component.video.j.j.j.xt vl;
    private volatile long xt;


    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.bykv.vk.openvk.component.video.j.j.j.xt.j = r0
            return
    }

    public xt(android.content.Context r4, com.bykv.vk.openvk.component.video.api.cw.r r5) {
            r3 = this;
            r3.<init>()
            r0 = -2147483648(0xffffffff80000000, double:NaN)
            r3.xt = r0
            java.lang.Object r4 = new java.lang.Object
            r4.<init>()
            r3.cw = r4
            r0 = 0
            r3.f1691m = r0
            r0 = -1
            r3.ae = r0
            r4 = 0
            r3.tl = r4
            r3.g = r4
            r0 = 0
            r3.oq = r0
            r3.qv = r5
            java.lang.String r0 = r5.up()     // Catch: java.lang.Throwable -> La4
            java.lang.String r1 = r5.i()     // Catch: java.lang.Throwable -> La4
            java.io.File r0 = com.bykv.vk.openvk.component.video.j.up.cw.xt(r0, r1)     // Catch: java.lang.Throwable -> La4
            r3.f1692r = r0     // Catch: java.lang.Throwable -> La4
            java.lang.String r0 = r5.up()     // Catch: java.lang.Throwable -> La4
            java.lang.String r1 = r5.i()     // Catch: java.lang.Throwable -> La4
            java.io.File r0 = com.bykv.vk.openvk.component.video.j.up.cw.cw(r0, r1)     // Catch: java.lang.Throwable -> La4
            r3.up = r0     // Catch: java.lang.Throwable -> La4
            boolean r0 = r3.tl()     // Catch: java.lang.Throwable -> La4
            if (r0 == 0) goto L4f
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> La4
            java.io.File r1 = r3.up     // Catch: java.lang.Throwable -> La4
            java.lang.String r2 = "r"
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> La4
            r3.oq = r0     // Catch: java.lang.Throwable -> La4
            goto L5a
        L4f:
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> La4
            java.io.File r1 = r3.f1692r     // Catch: java.lang.Throwable -> La4
            java.lang.String r2 = "rw"
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> La4
            r3.oq = r0     // Catch: java.lang.Throwable -> La4
        L5a:
            boolean r0 = r3.tl()     // Catch: java.lang.Throwable -> La4
            if (r0 != 0) goto La3
            java.io.File r0 = r3.f1692r     // Catch: java.lang.Throwable -> La4
            long r0 = r0.length()     // Catch: java.lang.Throwable -> La4
            r3.f1691m = r0     // Catch: java.lang.Throwable -> La4
            boolean r0 = r3.up()     // Catch: java.lang.Throwable -> La4
            if (r0 != 0) goto L86
            java.lang.String r0 = "CSJ_MediaDLPlay"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La4
            java.lang.String r2 = "no process lock, no download "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> La4
            java.lang.String r2 = r3.m()     // Catch: java.lang.Throwable -> La4
            r1.append(r2)     // Catch: java.lang.Throwable -> La4
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> La4
            com.bykv.vk.openvk.component.video.api.m.cw.xt(r0, r1)     // Catch: java.lang.Throwable -> La4
            return
        L86:
            java.lang.Class<com.bykv.vk.openvk.component.video.j.j.j.xt> r0 = com.bykv.vk.openvk.component.video.j.j.j.xt.class
            monitor-enter(r0)     // Catch: java.lang.Throwable -> La4
            boolean r1 = r3.ae()     // Catch: java.lang.Throwable -> L93
            if (r1 == 0) goto L95
            r3.xt()     // Catch: java.lang.Throwable -> L93
            goto L9f
        L93:
            r1 = move-exception
            goto La1
        L95:
            com.bykv.vk.openvk.component.video.j.j.j.xt r1 = r3.vl     // Catch: java.lang.Throwable -> L93
            if (r1 == 0) goto L9f
            long r1 = r1.j()     // Catch: java.lang.Throwable -> L93
            r3.xt = r1     // Catch: java.lang.Throwable -> L93
        L9f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L93
            return
        La1:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L93
            throw r1     // Catch: java.lang.Throwable -> La4
        La3:
            return
        La4:
            java.lang.String r0 = "CSJ_MediaDLPlay"
            java.lang.String r5 = r5.av()
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Error using file "
            r1[r4] = r2
            r4 = 1
            r1[r4] = r5
            java.lang.String r4 = " as disc cache"
            r5 = 2
            r1[r5] = r4
            com.bykv.vk.openvk.component.video.api.m.cw.xt(r0, r1)
            return
    }

    private boolean ae() {
            r4 = this;
            java.lang.String r0 = r4.m()
            java.lang.Class<com.bykv.vk.openvk.component.video.j.j.j.xt> r1 = com.bykv.vk.openvk.component.video.j.j.j.xt.class
            monitor-enter(r1)
            java.util.HashMap<java.lang.String, com.bykv.vk.openvk.component.video.j.j.j.xt> r2 = com.bykv.vk.openvk.component.video.j.j.j.xt.j     // Catch: java.lang.Throwable -> L16
            java.lang.Object r3 = r2.get(r0)     // Catch: java.lang.Throwable -> L16
            com.bykv.vk.openvk.component.video.j.j.j.xt r3 = (com.bykv.vk.openvk.component.video.j.j.j.xt) r3     // Catch: java.lang.Throwable -> L16
            r4.vl = r3     // Catch: java.lang.Throwable -> L16
            if (r3 == 0) goto L18
            r0 = 0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16
            return r0
        L16:
            r0 = move-exception
            goto L1e
        L18:
            r2.put(r0, r4)     // Catch: java.lang.Throwable -> L16
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16
            r0 = 1
            return r0
        L1e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16
            throw r0
    }

    static /* synthetic */ boolean ae(com.bykv.vk.openvk.component.video.j.j.j.xt r0) {
            boolean r0 = r0.tl
            return r0
    }

    static /* synthetic */ java.io.RandomAccessFile cw(com.bykv.vk.openvk.component.video.j.j.j.xt r0) {
            java.io.RandomAccessFile r0 = r0.oq
            return r0
    }

    private long g() {
            r2 = this;
            boolean r0 = r2.tl()
            if (r0 == 0) goto Ld
            java.io.File r0 = r2.up
            long r0 = r0.length()
            return r0
        Ld:
            java.io.File r0 = r2.f1692r
            long r0 = r0.length()
            return r0
    }

    static /* synthetic */ java.io.File g(com.bykv.vk.openvk.component.video.j.j.j.xt r0) {
            java.io.File r0 = r0.f1692r
            return r0
    }

    static /* synthetic */ long j(com.bykv.vk.openvk.component.video.j.j.j.xt r0, long r1) {
            r0.xt = r1
            return r1
    }

    private void j(long r5) throws java.io.IOException {
            r4 = this;
            java.lang.Object r0 = r4.cw
            monitor-enter(r0)
            java.io.File r1 = r4.up     // Catch: java.lang.Throwable -> L21
            boolean r1 = r1.exists()     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L23
            java.io.File r1 = r4.up     // Catch: java.lang.Throwable -> L21
            long r1 = r1.length()     // Catch: java.lang.Throwable -> L21
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 < 0) goto L23
            com.bykv.vk.openvk.component.video.api.cw.r r5 = r4.qv     // Catch: java.lang.Throwable -> L21
            r5.av()     // Catch: java.lang.Throwable -> L21
            com.bykv.vk.openvk.component.video.api.cw.r r5 = r4.qv     // Catch: java.lang.Throwable -> L21
            r5.i()     // Catch: java.lang.Throwable -> L21
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            return
        L21:
            r5 = move-exception
            goto L81
        L23:
            java.io.File r5 = r4.f1692r     // Catch: java.lang.Throwable -> L35
            java.io.File r6 = r4.up     // Catch: java.lang.Throwable -> L35
            boolean r5 = r5.renameTo(r6)     // Catch: java.lang.Throwable -> L35
            if (r5 == 0) goto L51
            java.io.RandomAccessFile r5 = r4.oq     // Catch: java.lang.Throwable -> L35
            if (r5 == 0) goto L37
            r5.close()     // Catch: java.lang.Throwable -> L35
            goto L37
        L35:
            r5 = move-exception
            goto L76
        L37:
            boolean r5 = r4.tl     // Catch: java.lang.Throwable -> L35
            if (r5 != 0) goto L46
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L35
            java.io.File r6 = r4.up     // Catch: java.lang.Throwable -> L35
            java.lang.String r1 = "rw"
            r5.<init>(r6, r1)     // Catch: java.lang.Throwable -> L35
            r4.oq = r5     // Catch: java.lang.Throwable -> L35
        L46:
            com.bykv.vk.openvk.component.video.api.cw.r r5 = r4.qv     // Catch: java.lang.Throwable -> L35
            r5.i()     // Catch: java.lang.Throwable -> L35
            com.bykv.vk.openvk.component.video.api.cw.r r5 = r4.qv     // Catch: java.lang.Throwable -> L35
            r5.av()     // Catch: java.lang.Throwable -> L35
            goto L7d
        L51:
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.Throwable -> L35
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            java.lang.String r1 = "Error renaming file "
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L35
            java.io.File r1 = r4.f1692r     // Catch: java.lang.Throwable -> L35
            r6.append(r1)     // Catch: java.lang.Throwable -> L35
            java.lang.String r1 = " to "
            r6.append(r1)     // Catch: java.lang.Throwable -> L35
            java.io.File r1 = r4.up     // Catch: java.lang.Throwable -> L35
            r6.append(r1)     // Catch: java.lang.Throwable -> L35
            java.lang.String r1 = " for completion!"
            r6.append(r1)     // Catch: java.lang.Throwable -> L35
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L35
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L35
            throw r5     // Catch: java.lang.Throwable -> L35
        L76:
            java.lang.String r6 = "CSJ_MediaDLPlay"
            java.lang.String r1 = "complete error"
            com.bykv.vk.openvk.component.video.api.m.cw.xt(r6, r1, r5)     // Catch: java.lang.Throwable -> L7f
        L7d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            return
        L7f:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L21
        L81:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r5
    }

    private void j(boolean r4) {
            r3 = this;
            java.lang.String r0 = r3.m()
            java.lang.Class<com.bykv.vk.openvk.component.video.j.j.j.xt> r1 = com.bykv.vk.openvk.component.video.j.j.j.xt.class
            monitor-enter(r1)
            if (r4 == 0) goto L11
            java.util.HashMap<java.lang.String, com.bykv.vk.openvk.component.video.j.j.j.xt> r4 = com.bykv.vk.openvk.component.video.j.j.j.xt.j     // Catch: java.lang.Throwable -> Lf
            r4.remove(r0)     // Catch: java.lang.Throwable -> Lf
            goto L1e
        Lf:
            r4 = move-exception
            goto L20
        L11:
            java.util.HashMap<java.lang.String, com.bykv.vk.openvk.component.video.j.j.j.xt> r4 = com.bykv.vk.openvk.component.video.j.j.j.xt.j     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r2 = r4.get(r0)     // Catch: java.lang.Throwable -> Lf
            com.bykv.vk.openvk.component.video.j.j.j.xt r2 = (com.bykv.vk.openvk.component.video.j.j.j.xt) r2     // Catch: java.lang.Throwable -> Lf
            if (r2 != r3) goto L1e
            r4.remove(r0)     // Catch: java.lang.Throwable -> Lf
        L1e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            return
        L20:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            throw r4
    }

    static /* synthetic */ boolean j(com.bykv.vk.openvk.component.video.j.j.j.xt r0) {
            boolean r0 = r0.g
            return r0
    }

    static /* synthetic */ boolean j(com.bykv.vk.openvk.component.video.j.j.j.xt r0, boolean r1) {
            r0.g = r1
            return r1
    }

    static /* synthetic */ java.lang.Object m(com.bykv.vk.openvk.component.video.j.j.j.xt r0) {
            java.lang.Object r0 = r0.cw
            return r0
    }

    private java.lang.String m() {
            r1 = this;
            com.bykv.vk.openvk.component.video.api.cw.r r0 = r1.qv
            if (r0 != 0) goto L7
            java.lang.String r0 = ""
            return r0
        L7:
            java.lang.String r0 = r0.i()
            return r0
    }

    static /* synthetic */ com.bykv.vk.openvk.component.video.api.cw.r r(com.bykv.vk.openvk.component.video.j.j.j.xt r0) {
            com.bykv.vk.openvk.component.video.api.cw.r r0 = r0.qv
            return r0
    }

    static /* synthetic */ long tl(com.bykv.vk.openvk.component.video.j.j.j.xt r2) {
            long r0 = r2.ae
            return r0
    }

    private boolean tl() {
            r5 = this;
            java.io.File r0 = r5.up
            boolean r0 = r0.exists()
            if (r0 == 0) goto L16
            java.io.File r0 = r5.up
            long r0 = r0.length()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L16
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    static /* synthetic */ long up(com.bykv.vk.openvk.component.video.j.j.j.xt r2) {
            long r0 = r2.xt
            return r0
    }

    private boolean up() {
            r2 = this;
            java.io.RandomAccessFile r0 = r2.oq
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.nio.channels.FileChannel r0 = r0.getChannel()     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L1d
            java.nio.channels.FileLock r0 = r0.tryLock()     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L1d
            if (r0 != 0) goto L16
            if (r0 == 0) goto L15
            r0.close()     // Catch: java.io.IOException -> L15
        L15:
            return r1
        L16:
            r0.close()     // Catch: java.io.IOException -> L19
        L19:
            r0 = 1
            return r0
        L1b:
            r0 = move-exception
            throw r0
        L1d:
            return r1
    }

    static /* synthetic */ long xt(com.bykv.vk.openvk.component.video.j.j.j.xt r2) {
            long r0 = r2.f1691m
            return r0
    }

    static /* synthetic */ void xt(com.bykv.vk.openvk.component.video.j.j.j.xt r0, long r1) throws java.io.IOException {
            r0.j(r1)
            return
    }

    static /* synthetic */ void xt(com.bykv.vk.openvk.component.video.j.j.j.xt r0, boolean r1) {
            r0.j(r1)
            return
    }

    @Override // com.bykv.vk.openvk.component.video.j.j.j.cw
    public void cw() {
            r4 = this;
            r0 = 0
            boolean r1 = r4.tl     // Catch: java.lang.Throwable -> Lb
            if (r1 != 0) goto Ld
            java.io.RandomAccessFile r1 = r4.oq     // Catch: java.lang.Throwable -> Lb
            r1.close()     // Catch: java.lang.Throwable -> Lb
            goto Ld
        Lb:
            r1 = move-exception
            goto L27
        Ld:
            java.io.File r1 = r4.f1692r     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto L18
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lb
            r1.setLastModified(r2)     // Catch: java.lang.Throwable -> Lb
        L18:
            java.io.File r1 = r4.up     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto L23
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lb
            r1.setLastModified(r2)     // Catch: java.lang.Throwable -> Lb
        L23:
            r4.j(r0)
            goto L2f
        L27:
            java.lang.String r2 = "CSJ_MediaDLPlay"
            java.lang.String r3 = "close error"
            com.bykv.vk.openvk.component.video.api.m.cw.xt(r2, r3, r1)     // Catch: java.lang.Throwable -> L3a
            goto L23
        L2f:
            java.lang.Object r1 = r4.cw
            monitor-enter(r1)
            r0 = 1
            r4.tl = r0     // Catch: java.lang.Throwable -> L37
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L37
            return
        L37:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L37
            throw r0
        L3a:
            r1 = move-exception
            r4.j(r0)
            throw r1
    }

    @Override // com.bykv.vk.openvk.component.video.j.j.j.cw
    public int j(long r8, byte[] r10, int r11, int r12) throws java.io.IOException {
            r7 = this;
            long r0 = r7.xt     // Catch: java.lang.Throwable -> L3f
            r2 = -1
            int r3 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r3 != 0) goto L8
            return r2
        L8:
            r0 = 0
            r1 = 0
        La:
            boolean r3 = r7.tl     // Catch: java.lang.Throwable -> L3f
            if (r3 != 0) goto L43
            java.lang.Object r3 = r7.cw     // Catch: java.lang.Throwable -> L3f
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L3f
            long r4 = r7.g()     // Catch: java.lang.Throwable -> L25
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 >= 0) goto L27
            java.io.RandomAccessFile r1 = r7.oq     // Catch: java.lang.Throwable -> L25
            r1.seek(r8)     // Catch: java.lang.Throwable -> L25
            java.io.RandomAccessFile r1 = r7.oq     // Catch: java.lang.Throwable -> L25
            int r1 = r1.read(r10, r11, r12)     // Catch: java.lang.Throwable -> L25
            goto L30
        L25:
            r8 = move-exception
            goto L41
        L27:
            int r0 = r0 + 33
            java.lang.Object r4 = r7.cw     // Catch: java.lang.Throwable -> L25
            r5 = 33
            r4.wait(r5)     // Catch: java.lang.Throwable -> L25
        L30:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L25
            if (r1 <= 0) goto L34
            return r1
        L34:
            r3 = 10000(0x2710, float:1.4013E-41)
            if (r0 >= r3) goto L39
            goto La
        L39:
            java.net.SocketTimeoutException r8 = new java.net.SocketTimeoutException     // Catch: java.lang.Throwable -> L3f
            r8.<init>()     // Catch: java.lang.Throwable -> L3f
            throw r8     // Catch: java.lang.Throwable -> L3f
        L3f:
            r8 = move-exception
            goto L44
        L41:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L25
            throw r8     // Catch: java.lang.Throwable -> L3f
        L43:
            return r2
        L44:
            boolean r9 = r8 instanceof java.io.IOException
            if (r9 == 0) goto L4b
            java.io.IOException r8 = (java.io.IOException) r8
            throw r8
        L4b:
            java.io.IOException r8 = new java.io.IOException
            r8.<init>()
            throw r8
    }

    public long j() {
            r2 = this;
            long r0 = r2.xt
            return r0
    }

    @Override // com.bykv.vk.openvk.component.video.j.j.j.cw
    public long r() throws java.io.IOException {
            r8 = this;
            boolean r0 = r8.tl()
            r1 = 0
            if (r0 == 0) goto L10
            java.io.File r0 = r8.up
            long r2 = r0.length()
            r8.xt = r2
            goto L49
        L10:
            java.lang.Object r0 = r8.cw
            monitor-enter(r0)
            r2 = 0
        L14:
            long r3 = r8.xt     // Catch: java.lang.Throwable -> L28
            r5 = -2147483648(0xffffffff80000000, double:NaN)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L48
            com.bykv.vk.openvk.component.video.j.j.j.xt r3 = r8.vl     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L2a
            if (r3 == 0) goto L2c
            long r3 = r3.j()     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L2a
            r8.xt = r3     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L2a
            goto L2c
        L28:
            r1 = move-exception
            goto L61
        L2a:
            r1 = move-exception
            goto L3d
        L2c:
            int r2 = r2 + 15
            java.lang.Object r3 = r8.cw     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L2a
            r4 = 5
            r3.wait(r4)     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L2a
            r3 = 10000(0x2710, float:1.4013E-41)
            if (r2 <= r3) goto L14
            r1 = -1
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            return r1
        L3d:
            com.bytedance.sdk.component.utils.vl.j(r1)     // Catch: java.lang.Throwable -> L28
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = "total length InterruptException"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L28
            throw r1     // Catch: java.lang.Throwable -> L28
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
        L49:
            java.lang.String r0 = "CSJ_MediaDLPlay"
            long r2 = r8.xt
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "totalLength= "
            r3[r1] = r4
            r1 = 1
            r3[r1] = r2
            com.bykv.vk.openvk.component.video.api.m.cw.j(r0, r3)
            long r0 = r8.xt
            return r0
        L61:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            throw r1
    }

    public void xt() {
            r6 = this;
            com.bytedance.sdk.component.xt.j.vl r0 = com.bykv.vk.openvk.component.video.api.cw.cw()
            if (r0 == 0) goto Lf
            com.bytedance.sdk.component.xt.j.vl r0 = com.bykv.vk.openvk.component.video.api.cw.cw()
            com.bytedance.sdk.component.xt.j.vl$j r0 = r0.xt()
            goto L16
        Lf:
            com.bytedance.sdk.component.xt.j.vl$j r0 = new com.bytedance.sdk.component.xt.j.vl$j
            java.lang.String r1 = "v_cache"
            r0.<init>(r1)
        L16:
            com.bykv.vk.openvk.component.video.api.cw.r r1 = r6.qv
            int r1 = r1.mi()
            long r1 = (long) r1
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.bytedance.sdk.component.xt.j.vl$j r1 = r0.j(r1, r3)
            com.bykv.vk.openvk.component.video.api.cw.r r2 = r6.qv
            int r2 = r2.kt()
            long r4 = (long) r2
            com.bytedance.sdk.component.xt.j.vl$j r1 = r1.xt(r4, r3)
            com.bykv.vk.openvk.component.video.api.cw.r r2 = r6.qv
            int r2 = r2.tj()
            long r4 = (long) r2
            r1.cw(r4, r3)
            com.bytedance.sdk.component.xt.j.vl r0 = r0.j()
            com.bykv.vk.openvk.component.video.api.cw.r r1 = r6.qv
            r1.i()
            com.bytedance.sdk.component.xt.j.ws$j r1 = new com.bytedance.sdk.component.xt.j.ws$j
            r1.<init>()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "bytes="
            r2.<init>(r3)
            long r3 = r6.f1691m
            r2.append(r3)
            java.lang.String r3 = "-"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "RANGE"
            com.bytedance.sdk.component.xt.j.ws$j r1 = r1.j(r3, r2)
            com.bykv.vk.openvk.component.video.api.cw.r r2 = r6.qv
            java.lang.String r2 = r2.av()
            com.bytedance.sdk.component.xt.j.ws$j r1 = r1.j(r2)
            com.bytedance.sdk.component.xt.j.ws$j r1 = r1.j()
            com.bytedance.sdk.component.xt.j.ws r1 = r1.xt()
            com.bytedance.sdk.component.xt.j.xt r0 = r0.j(r1)
            com.bykv.vk.openvk.component.video.j.j.j.xt$1 r1 = new com.bykv.vk.openvk.component.video.j.j.j.xt$1
            r1.<init>(r6)
            r0.j(r1)
            return
    }
}
