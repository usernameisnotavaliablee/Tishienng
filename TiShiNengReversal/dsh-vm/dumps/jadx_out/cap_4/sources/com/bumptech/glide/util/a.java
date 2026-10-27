package com.bumptech.glide.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class a {
    private static final int a = 16384;
    private static final java.util.concurrent.atomic.AtomicReference<byte[]> b = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.bumptech.glide.util.a$a, reason: collision with other inner class name */
    private static class C0042a extends java.io.InputStream {
        private static final int c = -1;

        @androidx.annotation.NonNull
        private final java.nio.ByteBuffer a;
        private int b;

        C0042a(@androidx.annotation.NonNull java.nio.ByteBuffer r2) {
                r1 = this;
                r1.<init>()
                r0 = -1
                r1.b = r0
                r1.a = r2
                return
        }

        @Override // java.io.InputStream
        public int available() {
                r1 = this;
                java.nio.ByteBuffer r0 = r1.a
                int r0 = r0.remaining()
                return r0
        }

        @Override // java.io.InputStream
        public synchronized void mark(int r1) {
                r0 = this;
                monitor-enter(r0)
                java.nio.ByteBuffer r1 = r0.a     // Catch: java.lang.Throwable -> Lb
                int r1 = r1.position()     // Catch: java.lang.Throwable -> Lb
                r0.b = r1     // Catch: java.lang.Throwable -> Lb
                monitor-exit(r0)
                return
            Lb:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
                throw r1
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // java.io.InputStream
        public int read() {
                r1 = this;
                java.nio.ByteBuffer r0 = r1.a
                boolean r0 = r0.hasRemaining()
                if (r0 != 0) goto La
                r0 = -1
                return r0
            La:
                java.nio.ByteBuffer r0 = r1.a
                byte r0 = r0.get()
                r0 = r0 & 255(0xff, float:3.57E-43)
                return r0
        }

        @Override // java.io.InputStream
        public int read(@androidx.annotation.NonNull byte[] r2, int r3, int r4) throws java.io.IOException {
                r1 = this;
                java.nio.ByteBuffer r0 = r1.a
                boolean r0 = r0.hasRemaining()
                if (r0 != 0) goto La
                r2 = -1
                return r2
            La:
                int r0 = r1.available()
                int r4 = java.lang.Math.min(r4, r0)
                java.nio.ByteBuffer r0 = r1.a
                r0.get(r2, r3, r4)
                return r4
        }

        @Override // java.io.InputStream
        public synchronized void reset() throws java.io.IOException {
                r2 = this;
                monitor-enter(r2)
                int r0 = r2.b     // Catch: java.lang.Throwable -> Ld
                r1 = -1
                if (r0 == r1) goto Lf
                java.nio.ByteBuffer r1 = r2.a     // Catch: java.lang.Throwable -> Ld
                r1.position(r0)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r2)
                return
            Ld:
                r0 = move-exception
                goto L17
            Lf:
                java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> Ld
                java.lang.String r1 = "Cannot reset to unset mark position"
                r0.<init>(r1)     // Catch: java.lang.Throwable -> Ld
                throw r0     // Catch: java.lang.Throwable -> Ld
            L17:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                throw r0
        }

        @Override // java.io.InputStream
        public long skip(long r4) throws java.io.IOException {
                r3 = this;
                java.nio.ByteBuffer r0 = r3.a
                boolean r0 = r0.hasRemaining()
                if (r0 != 0) goto Lb
                r4 = -1
                return r4
            Lb:
                int r0 = r3.available()
                long r0 = (long) r0
                long r4 = java.lang.Math.min(r4, r0)
                java.nio.ByteBuffer r0 = r3.a
                int r1 = r0.position()
                long r1 = (long) r1
                long r1 = r1 + r4
                int r2 = (int) r1
                r0.position(r2)
                return r4
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b {
        final int a;
        final int b;
        final byte[] c;

        b(@androidx.annotation.NonNull byte[] r1, int r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.c = r1
                r0.a = r2
                r0.b = r3
                return
        }
    }

    static {
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            com.bumptech.glide.util.a.b = r0
            return
    }

    private a() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static java.nio.ByteBuffer a(@androidx.annotation.NonNull java.io.File r9) throws java.io.IOException {
            r1 = 0
            long r6 = r9.length()     // Catch: java.lang.Throwable -> L37
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 > 0) goto L43
            r2 = 0
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 == 0) goto L3b
            java.io.RandomAccessFile r8 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L37
            java.lang.String r0 = "r"
            r8.<init>(r9, r0)     // Catch: java.lang.Throwable -> L37
            java.nio.channels.FileChannel r2 = r8.getChannel()     // Catch: java.lang.Throwable -> L34
            java.nio.channels.FileChannel$MapMode r3 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> L30
            r4 = 0
            java.nio.MappedByteBuffer r9 = r2.map(r3, r4, r6)     // Catch: java.lang.Throwable -> L30
            java.nio.MappedByteBuffer r9 = r9.load()     // Catch: java.lang.Throwable -> L30
            r2.close()     // Catch: java.io.IOException -> L2c
        L2c:
            r8.close()     // Catch: java.io.IOException -> L2f
        L2f:
            return r9
        L30:
            r0 = move-exception
            r9 = r0
            r1 = r2
            goto L4b
        L34:
            r0 = move-exception
            r9 = r0
            goto L4b
        L37:
            r0 = move-exception
            r9 = r0
            r8 = r1
            goto L4b
        L3b:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L37
            java.lang.String r0 = "File unsuitable for memory mapping"
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L37
            throw r9     // Catch: java.lang.Throwable -> L37
        L43:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L37
            java.lang.String r0 = "File too large to map into memory"
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L37
            throw r9     // Catch: java.lang.Throwable -> L37
        L4b:
            if (r1 == 0) goto L52
            r1.close()     // Catch: java.io.IOException -> L51
            goto L52
        L51:
        L52:
            if (r8 == 0) goto L57
            r8.close()     // Catch: java.io.IOException -> L57
        L57:
            throw r9
    }

    @androidx.annotation.NonNull
    public static java.nio.ByteBuffer b(@androidx.annotation.NonNull java.io.InputStream r4) throws java.io.IOException {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r1 = 16384(0x4000, float:2.2959E-41)
            r0.<init>(r1)
            java.util.concurrent.atomic.AtomicReference<byte[]> r2 = com.bumptech.glide.util.a.b
            r3 = 0
            java.lang.Object r2 = r2.getAndSet(r3)
            byte[] r2 = (byte[]) r2
            if (r2 != 0) goto L14
            byte[] r2 = new byte[r1]
        L14:
            int r1 = r4.read(r2)
            r3 = 0
            if (r1 < 0) goto L1f
            r0.write(r2, r3, r1)
            goto L14
        L1f:
            java.util.concurrent.atomic.AtomicReference<byte[]> r4 = com.bumptech.glide.util.a.b
            r4.set(r2)
            byte[] r4 = r0.toByteArray()
            int r0 = r4.length
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r0)
            java.nio.ByteBuffer r4 = r0.put(r4)
            java.nio.Buffer r4 = r4.position(r3)
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            return r4
    }

    @androidx.annotation.Nullable
    private static com.bumptech.glide.util.a.b c(@androidx.annotation.NonNull java.nio.ByteBuffer r3) {
            boolean r0 = r3.isReadOnly()
            if (r0 != 0) goto L1e
            boolean r0 = r3.hasArray()
            if (r0 == 0) goto L1e
            com.bumptech.glide.util.a$b r0 = new com.bumptech.glide.util.a$b
            byte[] r1 = r3.array()
            int r2 = r3.arrayOffset()
            int r3 = r3.limit()
            r0.<init>(r1, r2, r3)
            return r0
        L1e:
            r3 = 0
            return r3
    }

    @androidx.annotation.NonNull
    public static byte[] d(@androidx.annotation.NonNull java.nio.ByteBuffer r2) {
            com.bumptech.glide.util.a$b r0 = c(r2)
            if (r0 == 0) goto L16
            int r1 = r0.a
            if (r1 != 0) goto L16
            int r1 = r0.b
            byte[] r0 = r0.c
            int r0 = r0.length
            if (r1 != r0) goto L16
            byte[] r2 = r2.array()
            return r2
        L16:
            java.nio.ByteBuffer r2 = r2.asReadOnlyBuffer()
            int r0 = r2.limit()
            byte[] r0 = new byte[r0]
            r1 = 0
            r2.position(r1)
            r2.get(r0)
            return r0
    }

    public static void e(@androidx.annotation.NonNull java.nio.ByteBuffer r4, @androidx.annotation.NonNull java.io.File r5) throws java.io.IOException {
            r0 = 0
            r4.position(r0)
            r1 = 0
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L25
            java.lang.String r3 = "rw"
            r2.<init>(r5, r3)     // Catch: java.lang.Throwable -> L25
            java.nio.channels.FileChannel r1 = r2.getChannel()     // Catch: java.lang.Throwable -> L23
            r1.write(r4)     // Catch: java.lang.Throwable -> L23
            r1.force(r0)     // Catch: java.lang.Throwable -> L23
            r1.close()     // Catch: java.lang.Throwable -> L23
            r2.close()     // Catch: java.lang.Throwable -> L23
            r1.close()     // Catch: java.io.IOException -> L1f
        L1f:
            r2.close()     // Catch: java.io.IOException -> L22
        L22:
            return
        L23:
            r4 = move-exception
            goto L27
        L25:
            r4 = move-exception
            r2 = r1
        L27:
            if (r1 == 0) goto L2e
            r1.close()     // Catch: java.io.IOException -> L2d
            goto L2e
        L2d:
        L2e:
            if (r2 == 0) goto L33
            r2.close()     // Catch: java.io.IOException -> L33
        L33:
            throw r4
    }

    @androidx.annotation.NonNull
    public static java.io.InputStream f(@androidx.annotation.NonNull java.nio.ByteBuffer r1) {
            com.bumptech.glide.util.a$a r0 = new com.bumptech.glide.util.a$a
            r0.<init>(r1)
            return r0
    }

    public static void g(@androidx.annotation.NonNull java.nio.ByteBuffer r3, @androidx.annotation.NonNull java.io.OutputStream r4) throws java.io.IOException {
            com.bumptech.glide.util.a$b r0 = c(r3)
            if (r0 == 0) goto L11
            byte[] r3 = r0.c
            int r1 = r0.a
            int r0 = r0.b
            int r0 = r0 + r1
            r4.write(r3, r1, r0)
            return
        L11:
            java.util.concurrent.atomic.AtomicReference<byte[]> r0 = com.bumptech.glide.util.a.b
            r1 = 0
            java.lang.Object r0 = r0.getAndSet(r1)
            byte[] r0 = (byte[]) r0
            if (r0 != 0) goto L20
            r0 = 16384(0x4000, float:2.2959E-41)
            byte[] r0 = new byte[r0]
        L20:
            int r1 = r3.remaining()
            if (r1 <= 0) goto L37
            int r1 = r3.remaining()
            int r2 = r0.length
            int r1 = java.lang.Math.min(r1, r2)
            r2 = 0
            r3.get(r0, r2, r1)
            r4.write(r0, r2, r1)
            goto L20
        L37:
            java.util.concurrent.atomic.AtomicReference<byte[]> r3 = com.bumptech.glide.util.a.b
            r3.set(r0)
            return
    }
}
