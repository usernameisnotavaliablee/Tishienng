package com.hw.videoprocessor;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class g extends java.lang.Thread implements com.hw.videoprocessor.c {
    private android.media.MediaCodec a;
    private android.media.MediaMuxer b;
    private java.util.concurrent.atomic.AtomicBoolean c;
    private java.util.concurrent.CountDownLatch d;
    private java.lang.Exception e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private android.media.MediaExtractor k;
    private int l;
    private volatile java.util.concurrent.CountDownLatch m;
    private volatile android.view.Surface n;
    private com.hw.videoprocessor.util.j o;

    public g(android.media.MediaExtractor r2, android.media.MediaMuxer r3, int r4, int r5, int r6, int r7, int r8, int r9, java.util.concurrent.atomic.AtomicBoolean r10, java.util.concurrent.CountDownLatch r11) {
            r1 = this;
            java.lang.String r0 = "VideoProcessEncodeThread"
            r1.<init>(r0)
            r1.b = r3
            r1.c = r10
            r1.d = r11
            r1.k = r2
            r1.f = r4
            r1.h = r6
            r1.g = r5
            r1.i = r7
            r1.l = r9
            r1.j = r8
            java.util.concurrent.CountDownLatch r2 = new java.util.concurrent.CountDownLatch
            r3 = 1
            r2.<init>(r3)
            r1.m = r2
            return
    }

    private void b() throws java.io.IOException {
            r21 = this;
            r0 = r21
            android.media.MediaExtractor r1 = r0.k
            int r2 = r0.l
            android.media.MediaFormat r1 = r1.getTrackFormat(r2)
            int r2 = r0.j
            java.lang.String r3 = "frame-rate"
            if (r2 <= 0) goto L11
            goto L20
        L11:
            boolean r2 = r1.containsKey(r3)
            if (r2 == 0) goto L1d
            int r1 = r1.getInteger(r3)
        L1b:
            r2 = r1
            goto L20
        L1d:
            int r1 = com.hw.videoprocessor.h.c
            goto L1b
        L20:
            int r1 = r0.g
            int r4 = r0.h
            java.lang.String r5 = "video/avc"
            android.media.MediaFormat r1 = android.media.MediaFormat.createVideoFormat(r5, r1, r4)
            java.lang.String r4 = "color-format"
            r6 = 2130708361(0x7f000789, float:1.701803E38)
            r1.setInteger(r4, r6)
            r1.setInteger(r3, r2)
            java.lang.String r3 = "i-frame-interval"
            int r4 = r0.i
            r1.setInteger(r3, r4)
            android.media.MediaCodec r3 = android.media.MediaCodec.createEncoderByType(r5)
            r0.a = r3
            r4 = 8
            r6 = 512(0x200, float:7.17E-43)
            boolean r3 = com.hw.videoprocessor.i.m(r3, r5, r1, r4, r6)
            r4 = 0
            if (r3 == 0) goto L54
            java.lang.String r3 = "supportProfileHigh,enable ProfileHigh"
            java.lang.Object[] r6 = new java.lang.Object[r4]
            com.hw.videoprocessor.util.c.k(r3, r6)
        L54:
            android.media.MediaCodec r3 = r0.a
            int r3 = com.hw.videoprocessor.i.g(r3, r5)
            if (r3 <= 0) goto L84
            int r5 = r0.f
            if (r5 <= r3) goto L84
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            int r6 = r0.f
            r5.append(r6)
            java.lang.String r6 = " bitrate too large,set to:"
            r5.append(r6)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            java.lang.Object[] r6 = new java.lang.Object[r4]
            com.hw.videoprocessor.util.c.f(r5, r6)
            float r3 = (float) r3
            r5 = 1061997773(0x3f4ccccd, float:0.8)
            float r3 = r3 * r5
            int r3 = (int) r3
            r0.f = r3
        L84:
            java.lang.String r3 = "bitrate"
            int r5 = r0.f
            r1.setInteger(r3, r5)
            android.media.MediaCodec r3 = r0.a
            r5 = 0
            r6 = 1
            r3.configure(r1, r5, r5, r6)
            android.media.MediaCodec r1 = r0.a
            android.view.Surface r1 = r1.createInputSurface()
            r0.n = r1
            android.media.MediaCodec r1 = r0.a
            r1.start()
            java.util.concurrent.CountDownLatch r1 = r0.m
            r1.countDown()
            android.media.MediaCodec$BufferInfo r1 = new android.media.MediaCodec$BufferInfo
            r1.<init>()
            r3 = 1232348160(0x49742400, float:1000000.0)
            float r2 = (float) r2
            float r3 = r3 / r2
            int r2 = (int) r3
            r3 = -5
            r5 = 0
            r9 = 0
            r10 = -5
            r11 = 0
            r12 = -1
        Lb6:
            java.util.concurrent.atomic.AtomicBoolean r14 = r0.c
            boolean r14 = r14.get()
            if (r14 == 0) goto Lc6
            if (r5 != 0) goto Lc6
            android.media.MediaCodec r5 = r0.a
            r5.signalEndOfInputStream()
            r5 = 1
        Lc6:
            android.media.MediaCodec r14 = r0.a
            r15 = 1
            r16 = -1
            r6 = 2500(0x9c4, double:1.235E-320)
            int r6 = r14.dequeueOutputBuffer(r1, r6)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "encode outputBufferIndex = "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            java.lang.Object[] r8 = new java.lang.Object[r4]
            com.hw.videoprocessor.util.c.k(r7, r8)
            r7 = -1
            if (r5 == 0) goto Lf9
            if (r6 != r7) goto Lf9
            int r9 = r9 + r15
            r8 = 10
            if (r9 <= r8) goto Lfa
            java.lang.String r1 = "INFO_TRY_AGAIN_LATER 10 times,force End!"
            java.lang.Object[] r2 = new java.lang.Object[r4]
            com.hw.videoprocessor.util.c.f(r1, r2)
            return
        Lf9:
            r9 = 0
        Lfa:
            if (r6 != r7) goto Lfe
        Lfc:
            r6 = 1
            goto Lb6
        Lfe:
            r7 = -2
            if (r6 != r7) goto L133
            android.media.MediaCodec r6 = r0.a
            android.media.MediaFormat r6 = r6.getOutputFormat()
            if (r10 != r3) goto L119
            android.media.MediaMuxer r7 = r0.b
            int r10 = r7.addTrack(r6)
            android.media.MediaMuxer r7 = r0.b
            r7.start()
            java.util.concurrent.CountDownLatch r7 = r0.d
            r7.countDown()
        L119:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "encode newFormat = "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.Object[] r7 = new java.lang.Object[r4]
            com.hw.videoprocessor.util.c.k(r6, r7)
        L12f:
            r18 = r9
            goto L205
        L133:
            if (r6 >= 0) goto L14c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "unexpected result from decoder.dequeueOutputBuffer: "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.Object[] r7 = new java.lang.Object[r4]
            com.hw.videoprocessor.util.c.f(r6, r7)
            goto L12f
        L14c:
            android.media.MediaCodec r7 = r0.a
            java.nio.ByteBuffer r7 = r7.getOutputBuffer(r6)
            int r8 = r1.flags
            r14 = 4
            if (r8 != r14) goto L164
            long r14 = r1.presentationTimeUs
            r18 = r9
            r8 = 0
            int r19 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r19 >= 0) goto L166
            r1.presentationTimeUs = r8
            goto L166
        L164:
            r18 = r9
        L166:
            if (r11 != 0) goto L19f
            int r8 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r8 == 0) goto L19f
            long r8 = r1.presentationTimeUs
            int r14 = r2 / 2
            long r14 = (long) r14
            long r14 = r14 + r12
            int r19 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r19 >= 0) goto L19f
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "video 时间戳错误，lastVideoFrameTimeUs:"
            r8.append(r9)
            r8.append(r12)
            java.lang.String r9 = " info.presentationTimeUs:"
            r8.append(r9)
            long r14 = r1.presentationTimeUs
            r8.append(r14)
            java.lang.String r9 = " VIDEO_FRAME_TIME_US:"
            r8.append(r9)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.lang.Object[] r9 = new java.lang.Object[r4]
            com.hw.videoprocessor.util.c.f(r8, r9)
            r11 = 1
        L19f:
            if (r11 == 0) goto L1be
            long r8 = (long) r2
            long r8 = r8 + r12
            r1.presentationTimeUs = r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "video 时间戳错误，使用修正的时间戳:"
            r8.append(r9)
            long r14 = r1.presentationTimeUs
            r8.append(r14)
            java.lang.String r8 = r8.toString()
            java.lang.Object[] r9 = new java.lang.Object[r4]
            com.hw.videoprocessor.util.c.f(r8, r9)
            r11 = 0
        L1be:
            int r8 = r1.flags
            r9 = 2
            if (r8 == r9) goto L1c5
            long r12 = r1.presentationTimeUs
        L1c5:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "writeSampleData,size:"
            r8.append(r9)
            int r9 = r1.size
            r8.append(r9)
            java.lang.String r9 = " time:"
            r8.append(r9)
            long r14 = r1.presentationTimeUs
            r19 = 1000(0x3e8, double:4.94E-321)
            long r14 = r14 / r19
            r8.append(r14)
            java.lang.String r8 = r8.toString()
            java.lang.Object[] r9 = new java.lang.Object[r4]
            com.hw.videoprocessor.util.c.k(r8, r9)
            android.media.MediaMuxer r8 = r0.b
            r8.writeSampleData(r10, r7, r1)
            r0.d(r1)
            android.media.MediaCodec r7 = r0.a
            r7.releaseOutputBuffer(r6, r4)
            int r6 = r1.flags
            r7 = 4
            if (r6 != r7) goto L205
            java.lang.String r1 = "encoderDone"
            java.lang.Object[] r2 = new java.lang.Object[r4]
            com.hw.videoprocessor.util.c.k(r1, r2)
            return
        L205:
            r9 = r18
            goto Lfc
    }

    private void d(android.media.MediaCodec.BufferInfo r4) {
            r3 = this;
            com.hw.videoprocessor.util.j r0 = r3.o
            if (r0 != 0) goto L5
            return
        L5:
            int r1 = r4.flags
            r1 = r1 & 4
            if (r1 <= 0) goto L11
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L13
        L11:
            long r1 = r4.presentationTimeUs
        L13:
            r0.b(r1)
            return
    }

    @Override // com.hw.videoprocessor.c
    public java.util.concurrent.CountDownLatch a() {
            r1 = this;
            java.util.concurrent.CountDownLatch r0 = r1.m
            return r0
    }

    public java.lang.Exception c() {
            r1 = this;
            java.lang.Exception r0 = r1.e
            return r0
    }

    public void e(com.hw.videoprocessor.util.j r1) {
            r0 = this;
            r0.o = r1
            return
    }

    @Override // com.hw.videoprocessor.c
    public android.view.Surface getSurface() {
            r1 = this;
            android.view.Surface r0 = r1.n
            return r0
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
            r3 = this;
            super.run()
            r3.b()     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L21
            android.media.MediaCodec r0 = r3.a     // Catch: java.lang.Exception -> L13
            if (r0 == 0) goto L3c
            r0.stop()     // Catch: java.lang.Exception -> L13
            android.media.MediaCodec r0 = r3.a     // Catch: java.lang.Exception -> L13
            r0.release()     // Catch: java.lang.Exception -> L13
            return
        L13:
            r0 = move-exception
            java.lang.Exception r1 = r3.e
            if (r1 != 0) goto L19
        L18:
            r1 = r0
        L19:
            r3.e = r1
            com.hw.videoprocessor.util.c.g(r0)
            goto L3c
        L1f:
            r0 = move-exception
            goto L3d
        L21:
            r0 = move-exception
            com.hw.videoprocessor.util.c.g(r0)     // Catch: java.lang.Throwable -> L1f
            r3.e = r0     // Catch: java.lang.Throwable -> L1f
            android.media.MediaCodec r0 = r3.a     // Catch: java.lang.Exception -> L36
            if (r0 == 0) goto L3c
            android.media.MediaCodec r0 = r3.a     // Catch: java.lang.Exception -> L36
            r0.stop()     // Catch: java.lang.Exception -> L36
            android.media.MediaCodec r0 = r3.a     // Catch: java.lang.Exception -> L36
            r0.release()     // Catch: java.lang.Exception -> L36
            goto L3c
        L36:
            r0 = move-exception
            java.lang.Exception r1 = r3.e
            if (r1 != 0) goto L19
            goto L18
        L3c:
            return
        L3d:
            android.media.MediaCodec r1 = r3.a     // Catch: java.lang.Exception -> L4a
            if (r1 == 0) goto L55
            r1.stop()     // Catch: java.lang.Exception -> L4a
            android.media.MediaCodec r1 = r3.a     // Catch: java.lang.Exception -> L4a
            r1.release()     // Catch: java.lang.Exception -> L4a
            goto L55
        L4a:
            r1 = move-exception
            java.lang.Exception r2 = r3.e
            if (r2 != 0) goto L50
            r2 = r1
        L50:
            r3.e = r2
            com.hw.videoprocessor.util.c.g(r1)
        L55:
            throw r0
    }
}
