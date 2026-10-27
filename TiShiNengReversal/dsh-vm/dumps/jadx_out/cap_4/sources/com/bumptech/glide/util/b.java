package com.bumptech.glide.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class b extends java.io.FilterInputStream {
    private static final java.lang.String c = "ContentLengthStream";
    private static final int d = -1;
    private final long a;
    private int b;

    private b(@androidx.annotation.NonNull java.io.InputStream r1, long r2) {
            r0 = this;
            r0.<init>(r1)
            r0.a = r2
            return
    }

    private int a(int r6) throws java.io.IOException {
            r5 = this;
            if (r6 < 0) goto L8
            int r0 = r5.b
            int r0 = r0 + r6
            r5.b = r0
            return r6
        L8:
            long r0 = r5.a
            int r2 = r5.b
            long r2 = (long) r2
            long r0 = r0 - r2
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L15
            return r6
        L15:
            java.io.IOException r6 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to read all expected data, expected: "
            r0.append(r1)
            long r1 = r5.a
            r0.append(r1)
            java.lang.String r1 = ", but read: "
            r0.append(r1)
            int r1 = r5.b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
    }

    @androidx.annotation.NonNull
    public static java.io.InputStream b(@androidx.annotation.NonNull java.io.InputStream r1, long r2) {
            com.bumptech.glide.util.b r0 = new com.bumptech.glide.util.b
            r0.<init>(r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public static java.io.InputStream c(@androidx.annotation.NonNull java.io.InputStream r2, @androidx.annotation.Nullable java.lang.String r3) {
            int r3 = d(r3)
            long r0 = (long) r3
            java.io.InputStream r2 = b(r2, r0)
            return r2
    }

    private static int d(@androidx.annotation.Nullable java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L11
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> Lb
            return r1
        Lb:
            java.lang.String r1 = "ContentLengthStream"
            r0 = 3
            android.util.Log.isLoggable(r1, r0)
        L11:
            r1 = -1
            return r1
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws java.io.IOException {
            r4 = this;
            monitor-enter(r4)
            long r0 = r4.a     // Catch: java.lang.Throwable -> L15
            int r2 = r4.b     // Catch: java.lang.Throwable -> L15
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L15
            long r0 = r0 - r2
            java.io.InputStream r2 = r4.in     // Catch: java.lang.Throwable -> L15
            int r2 = r2.available()     // Catch: java.lang.Throwable -> L15
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L15
            long r0 = java.lang.Math.max(r0, r2)     // Catch: java.lang.Throwable -> L15
            int r1 = (int) r0
            monitor-exit(r4)
            return r1
        L15:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L15
            throw r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            int r0 = super.read()     // Catch: java.lang.Throwable -> Lf
            if (r0 < 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = -1
        La:
            r2.a(r1)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r2)
            return r0
        Lf:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lf
            throw r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] r3) throws java.io.IOException {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            int r3 = r2.read(r3, r0, r1)
            return r3
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] r1, int r2, int r3) throws java.io.IOException {
            r0 = this;
            monitor-enter(r0)
            int r1 = super.read(r1, r2, r3)     // Catch: java.lang.Throwable -> Lb
            int r1 = r0.a(r1)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)
            return r1
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }
}
