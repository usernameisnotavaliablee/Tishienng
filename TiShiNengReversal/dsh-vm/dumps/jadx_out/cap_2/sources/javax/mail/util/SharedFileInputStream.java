package javax.mail.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class SharedFileInputStream extends java.io.BufferedInputStream implements javax.mail.internet.SharedInputStream {
    private static int defaultBufferSize = 2048;
    protected long bufpos;
    protected int bufsize;
    protected long datalen;
    protected java.io.RandomAccessFile in;

    /* renamed from: master, reason: collision with root package name */
    private boolean f0master;
    private javax.mail.util.SharedFileInputStream.SharedFile sf;
    protected long start;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class SharedFile {
        private int cnt;
        private java.io.RandomAccessFile in;

        SharedFile(java.io.File r3) throws java.io.IOException {
                r2 = this;
                r2.<init>()
                java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
                java.lang.String r1 = "r"
                r0.<init>(r3, r1)
                r2.in = r0
                return
        }

        SharedFile(java.lang.String r3) throws java.io.IOException {
                r2 = this;
                r2.<init>()
                java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
                java.lang.String r1 = "r"
                r0.<init>(r3, r1)
                r2.in = r0
                return
        }

        public synchronized void close() throws java.io.IOException {
                r1 = this;
                monitor-enter(r1)
                int r0 = r1.cnt     // Catch: java.lang.Throwable -> L11
                if (r0 <= 0) goto L13
                int r0 = r0 + (-1)
                r1.cnt = r0     // Catch: java.lang.Throwable -> L11
                if (r0 > 0) goto L13
                java.io.RandomAccessFile r0 = r1.in     // Catch: java.lang.Throwable -> L11
                r0.close()     // Catch: java.lang.Throwable -> L11
                goto L13
            L11:
                r0 = move-exception
                goto L15
            L13:
                monitor-exit(r1)
                return
            L15:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L11
                throw r0
        }

        protected void finalize() throws java.lang.Throwable {
                r1 = this;
                super.finalize()
                java.io.RandomAccessFile r0 = r1.in
                r0.close()
                return
        }

        public synchronized void forceClose() throws java.io.IOException {
                r1 = this;
                monitor-enter(r1)
                int r0 = r1.cnt     // Catch: java.lang.Throwable -> Le
                if (r0 <= 0) goto L10
                r0 = 0
                r1.cnt = r0     // Catch: java.lang.Throwable -> Le
                java.io.RandomAccessFile r0 = r1.in     // Catch: java.lang.Throwable -> Le
                r0.close()     // Catch: java.lang.Throwable -> Le
                goto L15
            Le:
                r0 = move-exception
                goto L17
            L10:
                java.io.RandomAccessFile r0 = r1.in     // Catch: java.lang.Throwable -> Le java.io.IOException -> L15
                r0.close()     // Catch: java.lang.Throwable -> Le java.io.IOException -> L15
            L15:
                monitor-exit(r1)
                return
            L17:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Le
                throw r0
        }

        public java.io.RandomAccessFile open() {
                r1 = this;
                int r0 = r1.cnt
                int r0 = r0 + 1
                r1.cnt = r0
                java.io.RandomAccessFile r0 = r1.in
                return r0
        }
    }

    static {
            return
    }

    public SharedFileInputStream(java.io.File r2) throws java.io.IOException {
            r1 = this;
            int r0 = javax.mail.util.SharedFileInputStream.defaultBufferSize
            r1.<init>(r2, r0)
            return
    }

    public SharedFileInputStream(java.io.File r3, int r4) throws java.io.IOException {
            r2 = this;
            r0 = 0
            r2.<init>(r0)
            r0 = 0
            r2.start = r0
            r0 = 1
            r2.f0master = r0
            if (r4 <= 0) goto L16
            javax.mail.util.SharedFileInputStream$SharedFile r0 = new javax.mail.util.SharedFileInputStream$SharedFile
            r0.<init>(r3)
            r2.init(r0, r4)
            return
        L16:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Buffer size <= 0"
            r3.<init>(r4)
            throw r3
    }

    public SharedFileInputStream(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            int r0 = javax.mail.util.SharedFileInputStream.defaultBufferSize
            r1.<init>(r2, r0)
            return
    }

    public SharedFileInputStream(java.lang.String r3, int r4) throws java.io.IOException {
            r2 = this;
            r0 = 0
            r2.<init>(r0)
            r0 = 0
            r2.start = r0
            r0 = 1
            r2.f0master = r0
            if (r4 <= 0) goto L16
            javax.mail.util.SharedFileInputStream$SharedFile r0 = new javax.mail.util.SharedFileInputStream$SharedFile
            r0.<init>(r3)
            r2.init(r0, r4)
            return
        L16:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Buffer size <= 0"
            r3.<init>(r4)
            throw r3
    }

    private SharedFileInputStream(javax.mail.util.SharedFileInputStream.SharedFile r3, long r4, long r6, int r8) {
            r2 = this;
            r0 = 0
            r2.<init>(r0)
            r0 = 0
            r2.start = r0
            r0 = 0
            r2.f0master = r0
            r2.sf = r3
            java.io.RandomAccessFile r3 = r3.open()
            r2.in = r3
            r2.start = r4
            r2.bufpos = r4
            r2.datalen = r6
            r2.bufsize = r8
            byte[] r3 = new byte[r8]
            r2.buf = r3
            return
    }

    private void ensureOpen() throws java.io.IOException {
            r2 = this;
            java.io.RandomAccessFile r0 = r2.in
            if (r0 == 0) goto L5
            return
        L5:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Stream closed"
            r0.<init>(r1)
            throw r0
    }

    private void fill() throws java.io.IOException {
            r11 = this;
            int r0 = r11.markpos
            r1 = 0
            if (r0 >= 0) goto L10
            r11.pos = r1
            long r0 = r11.bufpos
            int r2 = r11.count
            long r2 = (long) r2
            long r0 = r0 + r2
            r11.bufpos = r0
            goto L5c
        L10:
            int r0 = r11.pos
            byte[] r2 = r11.buf
            int r2 = r2.length
            if (r0 < r2) goto L5c
            int r0 = r11.markpos
            if (r0 <= 0) goto L34
            int r2 = r11.pos
            int r2 = r2 - r0
            byte[] r0 = r11.buf
            int r3 = r11.markpos
            byte[] r4 = r11.buf
            java.lang.System.arraycopy(r0, r3, r4, r1, r2)
            r11.pos = r2
            long r2 = r11.bufpos
            int r0 = r11.markpos
            long r4 = (long) r0
            long r2 = r2 + r4
            r11.bufpos = r2
            r11.markpos = r1
            goto L5c
        L34:
            byte[] r0 = r11.buf
            int r0 = r0.length
            int r2 = r11.marklimit
            if (r0 < r2) goto L49
            r0 = -1
            r11.markpos = r0
            r11.pos = r1
            long r0 = r11.bufpos
            int r2 = r11.count
            long r2 = (long) r2
            long r0 = r0 + r2
            r11.bufpos = r0
            goto L5c
        L49:
            int r0 = r11.pos
            int r0 = r0 * 2
            if (r0 <= r2) goto L50
            goto L51
        L50:
            r2 = r0
        L51:
            byte[] r0 = new byte[r2]
            byte[] r2 = r11.buf
            int r3 = r11.pos
            java.lang.System.arraycopy(r2, r1, r0, r1, r3)
            r11.buf = r0
        L5c:
            int r0 = r11.pos
            r11.count = r0
            java.io.RandomAccessFile r1 = r11.in
            long r2 = r11.bufpos
            long r4 = (long) r0
            long r2 = r2 + r4
            r1.seek(r2)
            byte[] r0 = r11.buf
            int r0 = r0.length
            int r1 = r11.pos
            int r0 = r0 - r1
            long r2 = r11.bufpos
            long r4 = r11.start
            long r6 = r2 - r4
            long r8 = (long) r1
            long r6 = r6 + r8
            long r8 = (long) r0
            long r6 = r6 + r8
            long r8 = r11.datalen
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 <= 0) goto L84
            long r2 = r2 - r4
            long r0 = (long) r1
            long r2 = r2 + r0
            long r8 = r8 - r2
            int r0 = (int) r8
        L84:
            java.io.RandomAccessFile r1 = r11.in
            byte[] r2 = r11.buf
            int r3 = r11.pos
            int r0 = r1.read(r2, r3, r0)
            if (r0 <= 0) goto L95
            int r1 = r11.pos
            int r0 = r0 + r1
            r11.count = r0
        L95:
            return
    }

    private int in_available() throws java.io.IOException {
            r6 = this;
            long r0 = r6.start
            long r2 = r6.datalen
            long r0 = r0 + r2
            long r2 = r6.bufpos
            int r4 = r6.count
            long r4 = (long) r4
            long r2 = r2 + r4
            long r0 = r0 - r2
            int r1 = (int) r0
            return r1
    }

    private void init(javax.mail.util.SharedFileInputStream.SharedFile r3, int r4) throws java.io.IOException {
            r2 = this;
            r2.sf = r3
            java.io.RandomAccessFile r3 = r3.open()
            r2.in = r3
            r0 = 0
            r2.start = r0
            long r0 = r3.length()
            r2.datalen = r0
            r2.bufsize = r4
            byte[] r3 = new byte[r4]
            r2.buf = r3
            return
    }

    private int read1(byte[] r3, int r4, int r5) throws java.io.IOException {
            r2 = this;
            int r0 = r2.count
            int r1 = r2.pos
            int r0 = r0 - r1
            if (r0 > 0) goto L13
            r2.fill()
            int r0 = r2.count
            int r1 = r2.pos
            int r0 = r0 - r1
            if (r0 > 0) goto L13
            r3 = -1
            return r3
        L13:
            if (r0 >= r5) goto L16
            r5 = r0
        L16:
            byte[] r0 = r2.buf
            int r1 = r2.pos
            java.lang.System.arraycopy(r0, r1, r3, r4, r5)
            int r3 = r2.pos
            int r3 = r3 + r5
            r2.pos = r3
            return r5
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            r2.ensureOpen()     // Catch: java.lang.Throwable -> L10
            int r0 = r2.count     // Catch: java.lang.Throwable -> L10
            int r1 = r2.pos     // Catch: java.lang.Throwable -> L10
            int r0 = r0 - r1
            int r1 = r2.in_available()     // Catch: java.lang.Throwable -> L10
            int r0 = r0 + r1
            monitor-exit(r2)
            return r0
        L10:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L10
            throw r0
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r2 = this;
            java.io.RandomAccessFile r0 = r2.in
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 0
            boolean r1 = r2.f0master     // Catch: java.lang.Throwable -> L10
            if (r1 == 0) goto L12
            javax.mail.util.SharedFileInputStream$SharedFile r1 = r2.sf     // Catch: java.lang.Throwable -> L10
            r1.forceClose()     // Catch: java.lang.Throwable -> L10
            goto L17
        L10:
            r1 = move-exception
            goto L1e
        L12:
            javax.mail.util.SharedFileInputStream$SharedFile r1 = r2.sf     // Catch: java.lang.Throwable -> L10
            r1.close()     // Catch: java.lang.Throwable -> L10
        L17:
            r2.sf = r0
            r2.in = r0
            r2.buf = r0
            return
        L1e:
            r2.sf = r0
            r2.in = r0
            r2.buf = r0
            throw r1
    }

    protected void finalize() throws java.lang.Throwable {
            r0 = this;
            super.finalize()
            r0.close()
            return
    }

    @Override // javax.mail.internet.SharedInputStream
    public long getPosition() {
            r4 = this;
            java.io.RandomAccessFile r0 = r4.in
            if (r0 == 0) goto Le
            long r0 = r4.bufpos
            int r2 = r4.pos
            long r2 = (long) r2
            long r0 = r0 + r2
            long r2 = r4.start
            long r0 = r0 - r2
            return r0
        Le:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Stream closed"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int r1) {
            r0 = this;
            monitor-enter(r0)
            r0.marklimit = r1     // Catch: java.lang.Throwable -> L9
            int r1 = r0.pos     // Catch: java.lang.Throwable -> L9
            r0.markpos = r1     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)
            return
        L9:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r1
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // javax.mail.internet.SharedInputStream
    public java.io.InputStream newStream(long r8, long r10) {
            r7 = this;
            java.io.RandomAccessFile r0 = r7.in
            if (r0 == 0) goto L2c
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 < 0) goto L24
            r0 = -1
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 != 0) goto L12
            long r10 = r7.datalen
        L12:
            javax.mail.util.SharedFileInputStream r0 = new javax.mail.util.SharedFileInputStream
            javax.mail.util.SharedFileInputStream$SharedFile r1 = r7.sf
            long r2 = r7.start
            int r4 = (int) r8
            long r4 = (long) r4
            long r2 = r2 + r4
            long r10 = r10 - r8
            int r8 = (int) r10
            long r4 = (long) r8
            int r6 = r7.bufsize
            r0.<init>(r1, r2, r4, r6)
            return r0
        L24:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "start < 0"
            r8.<init>(r9)
            throw r8
        L2c:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.String r9 = "Stream closed"
            r8.<init>(r9)
            throw r8
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws java.io.IOException {
            r3 = this;
            monitor-enter(r3)
            r3.ensureOpen()     // Catch: java.lang.Throwable -> L16
            int r0 = r3.pos     // Catch: java.lang.Throwable -> L16
            int r1 = r3.count     // Catch: java.lang.Throwable -> L16
            if (r0 < r1) goto L18
            r3.fill()     // Catch: java.lang.Throwable -> L16
            int r0 = r3.pos     // Catch: java.lang.Throwable -> L16
            int r1 = r3.count     // Catch: java.lang.Throwable -> L16
            if (r0 < r1) goto L18
            monitor-exit(r3)
            r0 = -1
            return r0
        L16:
            r0 = move-exception
            goto L26
        L18:
            byte[] r0 = r3.buf     // Catch: java.lang.Throwable -> L16
            int r1 = r3.pos     // Catch: java.lang.Throwable -> L16
            int r2 = r1 + 1
            r3.pos = r2     // Catch: java.lang.Throwable -> L16
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L16
            r0 = r0 & 255(0xff, float:3.57E-43)
            monitor-exit(r3)
            return r0
        L26:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L16
            throw r0
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] r4, int r5, int r6) throws java.io.IOException {
            r3 = this;
            monitor-enter(r3)
            r3.ensureOpen()     // Catch: java.lang.Throwable -> L2c
            r0 = r5 | r6
            int r1 = r5 + r6
            r0 = r0 | r1
            int r2 = r4.length     // Catch: java.lang.Throwable -> L2c
            int r2 = r2 - r1
            r0 = r0 | r2
            if (r0 < 0) goto L2e
            if (r6 != 0) goto L13
            monitor-exit(r3)
            r4 = 0
            return r4
        L13:
            int r0 = r3.read1(r4, r5, r6)     // Catch: java.lang.Throwable -> L2c
            if (r0 > 0) goto L1b
            monitor-exit(r3)
            return r0
        L1b:
            if (r0 < r6) goto L1e
            goto L28
        L1e:
            int r1 = r5 + r0
            int r2 = r6 - r0
            int r1 = r3.read1(r4, r1, r2)     // Catch: java.lang.Throwable -> L2c
            if (r1 > 0) goto L2a
        L28:
            monitor-exit(r3)
            return r0
        L2a:
            int r0 = r0 + r1
            goto L1b
        L2c:
            r4 = move-exception
            goto L34
        L2e:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException     // Catch: java.lang.Throwable -> L2c
            r4.<init>()     // Catch: java.lang.Throwable -> L2c
            throw r4     // Catch: java.lang.Throwable -> L2c
        L34:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2c
            throw r4
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            r2.ensureOpen()     // Catch: java.lang.Throwable -> Lc
            int r0 = r2.markpos     // Catch: java.lang.Throwable -> Lc
            if (r0 < 0) goto Le
            r2.pos = r0     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return
        Lc:
            r0 = move-exception
            goto L16
        Le:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> Lc
            java.lang.String r1 = "Resetting to invalid mark"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lc
            throw r0     // Catch: java.lang.Throwable -> Lc
        L16:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r0
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long r6) throws java.io.IOException {
            r5 = this;
            monitor-enter(r5)
            r5.ensureOpen()     // Catch: java.lang.Throwable -> L25
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 > 0) goto Lc
            monitor-exit(r5)
            return r0
        Lc:
            int r2 = r5.count     // Catch: java.lang.Throwable -> L25
            int r3 = r5.pos     // Catch: java.lang.Throwable -> L25
            int r2 = r2 - r3
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L25
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 > 0) goto L27
            r5.fill()     // Catch: java.lang.Throwable -> L25
            int r2 = r5.count     // Catch: java.lang.Throwable -> L25
            int r3 = r5.pos     // Catch: java.lang.Throwable -> L25
            int r2 = r2 - r3
            long r2 = (long) r2
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 > 0) goto L27
            monitor-exit(r5)
            return r0
        L25:
            r6 = move-exception
            goto L35
        L27:
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 >= 0) goto L2c
            r6 = r2
        L2c:
            int r0 = r5.pos     // Catch: java.lang.Throwable -> L25
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L25
            long r0 = r0 + r6
            int r1 = (int) r0     // Catch: java.lang.Throwable -> L25
            r5.pos = r1     // Catch: java.lang.Throwable -> L25
            monitor-exit(r5)
            return r6
        L35:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L25
            throw r6
    }
}
