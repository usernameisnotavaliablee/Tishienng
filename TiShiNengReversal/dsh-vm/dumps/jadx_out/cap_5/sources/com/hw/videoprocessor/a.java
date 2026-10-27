package com.hw.videoprocessor;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class a extends java.lang.Thread implements com.hw.videoprocessor.util.k {
    private java.lang.String a;
    private java.lang.Integer b;
    private java.lang.Integer c;
    private java.lang.Float d;
    private android.content.Context e;
    private java.lang.Exception f;
    private android.media.MediaMuxer g;
    private int h;
    private android.media.MediaExtractor i;
    private java.util.concurrent.CountDownLatch j;
    private com.hw.videoprocessor.util.j k;

    public a(android.content.Context r2, java.lang.String r3, android.media.MediaMuxer r4, @androidx.annotation.Nullable java.lang.Integer r5, @androidx.annotation.Nullable java.lang.Integer r6, @androidx.annotation.Nullable java.lang.Float r7, int r8, java.util.concurrent.CountDownLatch r9) {
            r1 = this;
            java.lang.String r0 = "VideoProcessDecodeThread"
            r1.<init>(r0)
            r1.a = r3
            r1.b = r5
            r1.c = r6
            r1.d = r7
            r1.g = r4
            r1.e = r2
            r1.h = r8
            android.media.MediaExtractor r2 = new android.media.MediaExtractor
            r2.<init>()
            r1.i = r2
            r1.j = r9
            return
    }

    private void b() throws java.lang.Exception {
            r13 = this;
            android.media.MediaExtractor r0 = r13.i
            java.lang.String r1 = r13.a
            r0.setDataSource(r1)
            android.media.MediaExtractor r0 = r13.i
            r1 = 1
            int r0 = com.hw.videoprocessor.i.k(r0, r1)
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 < 0) goto L9b
            android.media.MediaExtractor r2 = r13.i
            r2.selectTrack(r0)
            android.media.MediaExtractor r2 = r13.i
            android.media.MediaFormat r0 = r2.getTrackFormat(r0)
            java.lang.String r2 = "mime"
            boolean r3 = r0.containsKey(r2)
            java.lang.String r4 = "audio/mp4a-latm"
            if (r3 == 0) goto L2c
            java.lang.String r0 = r0.getString(r2)
            goto L2d
        L2c:
            r0 = r4
        L2d:
            java.lang.Integer r2 = r13.b
            r3 = 0
            if (r2 != 0) goto L34
            r8 = r3
            goto L3f
        L34:
            int r2 = r2.intValue()
            int r2 = r2 * 1000
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r8 = r2
        L3f:
            java.lang.Integer r2 = r13.c
            if (r2 != 0) goto L45
        L43:
            r9 = r3
            goto L50
        L45:
            int r2 = r2.intValue()
            int r2 = r2 * 1000
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            goto L43
        L50:
            java.util.concurrent.CountDownLatch r2 = r13.j
            r5 = 3
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            boolean r2 = r2.await(r5, r3)
            if (r2 == 0) goto L92
            java.lang.Float r2 = r13.d
            if (r2 != 0) goto L66
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L68
        L66:
            r10 = r13
            goto L73
        L68:
            android.media.MediaExtractor r5 = r13.i
            android.media.MediaMuxer r6 = r13.g
            int r7 = r13.h
            r10 = r13
            com.hw.videoprocessor.util.b.u(r5, r6, r7, r8, r9, r10)
            goto L9c
        L73:
            android.content.Context r5 = r10.e
            android.media.MediaExtractor r6 = r10.i
            android.media.MediaMuxer r7 = r10.g
            r12 = r10
            r10 = r9
            r9 = r8
            int r8 = r12.h
            java.lang.Float r0 = r12.d
            if (r0 != 0) goto L85
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L89
        L85:
            float r0 = r0.floatValue()
        L89:
            java.lang.Float r11 = java.lang.Float.valueOf(r0)
            com.hw.videoprocessor.util.b.v(r5, r6, r7, r8, r9, r10, r11, r12)
            r10 = r12
            goto L9c
        L92:
            r10 = r13
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException
            java.lang.String r1 = "wait muxerStartLatch timeout!"
            r0.<init>(r1)
            throw r0
        L9b:
            r10 = r13
        L9c:
            com.hw.videoprocessor.util.j r0 = r10.k
            if (r0 == 0) goto La3
            r0.a(r1)
        La3:
            return
    }

    @Override // com.hw.videoprocessor.util.k
    public void a(float r2) {
            r1 = this;
            com.hw.videoprocessor.util.j r0 = r1.k
            if (r0 == 0) goto L7
            r0.a(r2)
        L7:
            return
    }

    public java.lang.Exception c() {
            r1 = this;
            java.lang.Exception r0 = r1.f
            return r0
    }

    public void d(com.hw.videoprocessor.util.j r1) {
            r0 = this;
            r0.k = r1
            return
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
            r2 = this;
            super.run()
            r2.b()     // Catch: java.lang.Throwable -> Lc java.lang.Exception -> Le
        L6:
            android.media.MediaExtractor r0 = r2.i
            r0.release()
            return
        Lc:
            r0 = move-exception
            goto L15
        Le:
            r0 = move-exception
            r2.f = r0     // Catch: java.lang.Throwable -> Lc
            com.hw.videoprocessor.util.c.g(r0)     // Catch: java.lang.Throwable -> Lc
            goto L6
        L15:
            android.media.MediaExtractor r1 = r2.i
            r1.release()
            throw r0
    }
}
