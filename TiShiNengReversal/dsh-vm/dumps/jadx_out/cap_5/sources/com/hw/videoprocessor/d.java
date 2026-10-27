package com.hw.videoprocessor;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class d extends java.lang.Thread implements com.hw.videoprocessor.c {
    private android.media.MediaCodec a;
    private android.media.MediaMuxer b;
    private java.util.concurrent.atomic.AtomicBoolean c;
    private java.lang.Exception d;
    private int e;
    private int f;
    private int g;
    private int h;
    private android.media.MediaExtractor i;
    private int j;
    private volatile java.util.concurrent.CountDownLatch k;
    private volatile android.view.Surface l;
    private long m;
    private boolean n;
    private boolean o;
    private long p;
    private int q;

    public d(android.media.MediaExtractor r2, android.media.MediaMuxer r3, int r4, int r5, int r6, int r7, int r8, java.util.concurrent.atomic.AtomicBoolean r9, long r10, boolean r12, boolean r13, int r14) {
            r1 = this;
            java.lang.String r0 = "VideoProcessEncodeThread"
            r1.<init>(r0)
            r1.b = r3
            r1.c = r9
            r1.i = r2
            r1.e = r4
            r1.g = r6
            r1.f = r5
            r1.h = r7
            r1.j = r8
            java.util.concurrent.CountDownLatch r2 = new java.util.concurrent.CountDownLatch
            r3 = 1
            r2.<init>(r3)
            r1.k = r2
            r1.m = r10
            r1.p = r10
            r1.n = r12
            r1.o = r13
            r1.q = r14
            return
    }

    private void b() throws java.io.IOException {
            r14 = this;
            android.media.MediaExtractor r0 = r14.i
            int r1 = r14.j
            android.media.MediaFormat r0 = r0.getTrackFormat(r1)
            java.lang.String r1 = "frame-rate"
            boolean r2 = r0.containsKey(r1)
            if (r2 == 0) goto L15
            int r0 = r0.getInteger(r1)
            goto L17
        L15:
            int r0 = com.hw.videoprocessor.h.c
        L17:
            int r2 = r14.f
            int r3 = r14.g
            java.lang.String r4 = "video/avc"
            android.media.MediaFormat r2 = android.media.MediaFormat.createVideoFormat(r4, r2, r3)
            java.lang.String r3 = "color-format"
            r5 = 2130708361(0x7f000789, float:1.701803E38)
            r2.setInteger(r3, r5)
            java.lang.String r3 = "bitrate"
            int r5 = r14.e
            r2.setInteger(r3, r5)
            r2.setInteger(r1, r0)
            java.lang.String r0 = "i-frame-interval"
            int r1 = r14.h
            r2.setInteger(r0, r1)
            android.media.MediaCodec r0 = android.media.MediaCodec.createEncoderByType(r4)
            r14.a = r0
            r1 = 0
            r3 = 1
            r0.configure(r2, r1, r1, r3)
            android.media.MediaCodec r0 = r14.a
            android.view.Surface r0 = r0.createInputSurface()
            r14.l = r0
            android.media.MediaCodec r0 = r14.a
            r0.start()
            java.util.concurrent.CountDownLatch r0 = r14.k
            r0.countDown()
            android.media.MediaCodec$BufferInfo r0 = new android.media.MediaCodec$BufferInfo
            r0.<init>()
            r1 = 0
            r2 = 0
            r4 = 0
        L5f:
            java.util.concurrent.atomic.AtomicBoolean r5 = r14.c
            boolean r5 = r5.get()
            if (r5 == 0) goto L6f
            if (r2 != 0) goto L6f
            android.media.MediaCodec r2 = r14.a
            r2.signalEndOfInputStream()
            r2 = 1
        L6f:
            android.media.MediaCodec r5 = r14.a
            r6 = 2500(0x9c4, double:1.235E-320)
            int r5 = r5.dequeueOutputBuffer(r0, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "encode outputBufferIndex = "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            java.lang.Object[] r7 = new java.lang.Object[r1]
            com.hw.videoprocessor.util.c.k(r6, r7)
            r6 = -1
            if (r2 == 0) goto L9f
            if (r5 != r6) goto L9f
            int r4 = r4 + r3
            r7 = 10
            if (r4 <= r7) goto La0
            java.lang.String r0 = "INFO_TRY_AGAIN_LATER 10 times,force End!"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.hw.videoprocessor.util.c.f(r0, r1)
            return
        L9f:
            r4 = 0
        La0:
            if (r5 != r6) goto La3
            goto L5f
        La3:
            r6 = -2
            if (r5 != r6) goto Lc3
            android.media.MediaCodec r5 = r14.a
            android.media.MediaFormat r5 = r5.getOutputFormat()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "encode newFormat = "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.Object[] r6 = new java.lang.Object[r1]
            com.hw.videoprocessor.util.c.k(r5, r6)
            goto L5f
        Lc3:
            if (r5 >= 0) goto Ldc
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "unexpected result from decoder.dequeueOutputBuffer: "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.Object[] r6 = new java.lang.Object[r1]
            com.hw.videoprocessor.util.c.f(r5, r6)
            goto L5f
        Ldc:
            android.media.MediaCodec r6 = r14.a
            java.nio.ByteBuffer r6 = r6.getOutputBuffer(r5)
            long r7 = r0.presentationTimeUs
            long r9 = r14.m
            long r7 = r7 + r9
            r0.presentationTimeUs = r7
            boolean r9 = r14.n
            if (r9 != 0) goto Lf4
            int r9 = r0.flags
            r10 = 2
            if (r9 != r10) goto Lf4
            goto L5f
        Lf4:
            boolean r9 = r14.o
            java.lang.String r10 = "encoderDone"
            r11 = 4
            if (r9 != 0) goto L10a
            int r9 = r0.flags
            if (r9 != r11) goto L10a
            java.lang.Object[] r0 = new java.lang.Object[r1]
            com.hw.videoprocessor.util.c.k(r10, r0)
            android.media.MediaCodec r0 = r14.a
            r0.releaseOutputBuffer(r5, r1)
            return
        L10a:
            int r9 = r0.flags
            if (r9 != r11) goto L116
            r12 = 0
            int r9 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r9 >= 0) goto L116
            r0.presentationTimeUs = r12
        L116:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "writeSampleData,size:"
            r7.append(r8)
            int r8 = r0.size
            r7.append(r8)
            java.lang.String r8 = " time:"
            r7.append(r8)
            long r8 = r0.presentationTimeUs
            r12 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 / r12
            r7.append(r8)
            java.lang.String r8 = " flag:"
            r7.append(r8)
            int r8 = r0.flags
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.Object[] r8 = new java.lang.Object[r1]
            com.hw.videoprocessor.util.c.k(r7, r8)
            android.media.MediaMuxer r7 = r14.b
            int r8 = r14.q
            r7.writeSampleData(r8, r6, r0)
            long r6 = r14.p
            long r8 = r0.presentationTimeUs
            int r12 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r12 >= 0) goto L156
            r14.p = r8
        L156:
            android.media.MediaCodec r6 = r14.a
            r6.releaseOutputBuffer(r5, r1)
            int r5 = r0.flags
            if (r5 != r11) goto L5f
            java.lang.Object[] r0 = new java.lang.Object[r1]
            com.hw.videoprocessor.util.c.k(r10, r0)
            return
    }

    @Override // com.hw.videoprocessor.c
    public java.util.concurrent.CountDownLatch a() {
            r1 = this;
            java.util.concurrent.CountDownLatch r0 = r1.k
            return r0
    }

    public java.lang.Exception c() {
            r1 = this;
            java.lang.Exception r0 = r1.d
            return r0
    }

    public long d() {
            r2 = this;
            long r0 = r2.p
            return r0
    }

    @Override // com.hw.videoprocessor.c
    public android.view.Surface getSurface() {
            r1 = this;
            android.view.Surface r0 = r1.l
            return r0
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
            r2 = this;
            super.run()
            r2.b()     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L15
            android.media.MediaCodec r0 = r2.a
            if (r0 == 0) goto L29
            r0.stop()
            android.media.MediaCodec r0 = r2.a
            r0.release()
            return
        L13:
            r0 = move-exception
            goto L2a
        L15:
            r0 = move-exception
            com.hw.videoprocessor.util.c.g(r0)     // Catch: java.lang.Throwable -> L13
            r2.d = r0     // Catch: java.lang.Throwable -> L13
            android.media.MediaCodec r0 = r2.a
            if (r0 == 0) goto L29
            android.media.MediaCodec r0 = r2.a
            r0.stop()
            android.media.MediaCodec r0 = r2.a
            r0.release()
        L29:
            return
        L2a:
            android.media.MediaCodec r1 = r2.a
            if (r1 == 0) goto L36
            r1.stop()
            android.media.MediaCodec r1 = r2.a
            r1.release()
        L36:
            throw r0
    }
}
