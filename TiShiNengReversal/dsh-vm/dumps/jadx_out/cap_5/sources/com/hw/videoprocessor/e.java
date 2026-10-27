package com.hw.videoprocessor;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class e extends java.lang.Thread {
    private android.media.MediaExtractor a;
    private android.media.MediaCodec b;
    private java.lang.Integer c;
    private java.lang.Integer d;
    private java.lang.Float e;
    private java.util.concurrent.atomic.AtomicBoolean f;
    private java.lang.Exception g;
    private int h;
    private com.hw.videoprocessor.c i;
    private com.hw.videoprocessor.util.e j;
    private com.hw.videoprocessor.util.f k;
    private java.lang.Integer l;
    private java.lang.Integer m;
    private boolean n;
    private com.hw.videoprocessor.util.d o;

    public e(com.hw.videoprocessor.c r2, android.media.MediaExtractor r3, @androidx.annotation.Nullable java.lang.Integer r4, @androidx.annotation.Nullable java.lang.Integer r5, @androidx.annotation.Nullable java.lang.Integer r6, @androidx.annotation.Nullable java.lang.Integer r7, @androidx.annotation.Nullable java.lang.Float r8, boolean r9, int r10, java.util.concurrent.atomic.AtomicBoolean r11) {
            r1 = this;
            java.lang.String r0 = "VideoProcessDecodeThread"
            r1.<init>(r0)
            r1.a = r3
            r1.c = r4
            r1.d = r5
            r1.e = r8
            r1.h = r10
            r1.f = r11
            r1.i = r2
            r1.l = r7
            r1.m = r6
            r1.n = r9
            return
    }

    private void a() throws java.io.IOException {
            r27 = this;
            r1 = r27
            com.hw.videoprocessor.c r0 = r1.i
            java.util.concurrent.CountDownLatch r0 = r0.a()
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.InterruptedException -> L1c
            r3 = 5
            boolean r0 = r0.await(r3, r2)     // Catch: java.lang.InterruptedException -> L1c
            if (r0 != 0) goto L1f
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException     // Catch: java.lang.InterruptedException -> L1c
            java.lang.String r2 = "wait eglContext timeout!"
            r0.<init>(r2)     // Catch: java.lang.InterruptedException -> L1c
            r1.g = r0     // Catch: java.lang.InterruptedException -> L1c
            return
        L1c:
            r0 = move-exception
            goto L2ec
        L1f:
            com.hw.videoprocessor.c r0 = r1.i
            android.view.Surface r0 = r0.getSurface()
            com.hw.videoprocessor.util.e r2 = new com.hw.videoprocessor.util.e
            r2.<init>(r0)
            r1.j = r2
            r2.d()
            android.media.MediaExtractor r0 = r1.a
            int r2 = r1.h
            android.media.MediaFormat r0 = r0.getTrackFormat(r2)
            java.lang.String r2 = "mime"
            java.lang.String r2 = r0.getString(r2)
            android.media.MediaCodec r2 = android.media.MediaCodec.createDecoderByType(r2)
            r1.b = r2
            com.hw.videoprocessor.util.f r2 = new com.hw.videoprocessor.util.f
            r2.<init>()
            r1.k = r2
            android.media.MediaCodec r3 = r1.b
            android.view.Surface r2 = r2.g()
            r4 = 0
            r5 = 0
            r3.configure(r0, r2, r4, r5)
            android.media.MediaCodec r0 = r1.b
            r0.start()
            boolean r0 = r1.n
            if (r0 == 0) goto Lc1
            java.lang.Integer r0 = r1.m
            if (r0 == 0) goto Lc1
            java.lang.Integer r2 = r1.l
            if (r2 == 0) goto Lc1
            java.lang.Float r2 = r1.e
            if (r2 == 0) goto L7e
            int r0 = r0.intValue()
            float r0 = (float) r0
            java.lang.Float r2 = r1.e
            float r2 = r2.floatValue()
            float r0 = r0 * r2
            int r0 = (int) r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.m = r0
        L7e:
            java.lang.Integer r0 = r1.m
            int r0 = r0.intValue()
            java.lang.Integer r2 = r1.l
            int r2 = r2.intValue()
            if (r0 <= r2) goto Lc1
            com.hw.videoprocessor.util.d r0 = new com.hw.videoprocessor.util.d
            java.lang.Integer r2 = r1.m
            int r2 = r2.intValue()
            java.lang.Integer r3 = r1.l
            int r3 = r3.intValue()
            r0.<init>(r2, r3)
            r1.o = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "帧率过高，需要丢帧:"
            r0.append(r2)
            java.lang.Integer r2 = r1.m
            r0.append(r2)
            java.lang.String r2 = "->"
            r0.append(r2)
            java.lang.Integer r2 = r1.l
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r2 = new java.lang.Object[r5]
            com.hw.videoprocessor.util.c.t(r0, r2)
        Lc1:
            android.media.MediaCodec$BufferInfo r2 = new android.media.MediaCodec$BufferInfo
            r2.<init>()
            r0 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = -1
        Lcc:
            if (r0 != 0) goto L2e5
            r12 = -1
            r13 = 2500(0x9c4, double:1.235E-320)
            if (r6 != 0) goto L14a
            android.media.MediaExtractor r15 = r1.a
            int r15 = r15.getSampleTrackIndex()
            r16 = -1
            int r3 = r1.h
            if (r15 != r3) goto L122
            android.media.MediaCodec r3 = r1.b
            int r3 = r3.dequeueInputBuffer(r13)
            if (r3 < 0) goto L120
            android.media.MediaCodec r4 = r1.b
            java.nio.ByteBuffer r4 = r4.getInputBuffer(r3)
            android.media.MediaExtractor r15 = r1.a
            int r21 = r15.readSampleData(r4, r5)
            if (r21 >= 0) goto L108
            android.media.MediaCodec r0 = r1.b
            r22 = 0
            r24 = 4
            r20 = 0
            r21 = 0
            r18 = r0
            r19 = r3
            r18.queueInputBuffer(r19, r20, r21, r22, r24)
            r0 = 1
            goto L120
        L108:
            r19 = r3
            android.media.MediaExtractor r3 = r1.a
            long r22 = r3.getSampleTime()
            android.media.MediaCodec r3 = r1.b
            r20 = 0
            r24 = 0
            r18 = r3
            r18.queueInputBuffer(r19, r20, r21, r22, r24)
            android.media.MediaExtractor r3 = r1.a
            r3.advance()
        L120:
            r3 = 0
            goto L125
        L122:
            if (r15 != r12) goto L120
            r3 = 1
        L125:
            if (r3 == 0) goto L148
            java.lang.String r3 = "inputDone"
            java.lang.Object[] r4 = new java.lang.Object[r5]
            com.hw.videoprocessor.util.c.k(r3, r4)
            android.media.MediaCodec r3 = r1.b
            int r19 = r3.dequeueInputBuffer(r13)
            if (r19 < 0) goto L148
            android.media.MediaCodec r3 = r1.b
            r22 = 0
            r24 = 4
            r20 = 0
            r21 = 0
            r18 = r3
            r18.queueInputBuffer(r19, r20, r21, r22, r24)
            r3 = r0
            r6 = 1
            goto L14d
        L148:
            r3 = r0
            goto L14d
        L14a:
            r16 = -1
            goto L148
        L14d:
            r0 = r3 ^ 1
            if (r3 == 0) goto L167
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r15 = "decoderOutputAvailable:"
            r4.append(r15)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            java.lang.Object[] r4 = new java.lang.Object[r5]
            com.hw.videoprocessor.util.c.k(r0, r4)
        L167:
            r0 = r3
        L168:
            if (r3 != 0) goto Lcc
            android.media.MediaCodec r4 = r1.b
            int r4 = r4.dequeueOutputBuffer(r2, r13)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r13 = "outputBufferIndex = "
            r15.append(r13)
            r15.append(r4)
            java.lang.String r13 = r15.toString()
            java.lang.Object[] r14 = new java.lang.Object[r5]
            com.hw.videoprocessor.util.c.k(r13, r14)
            if (r6 == 0) goto L19a
            if (r4 != r12) goto L19a
            int r7 = r7 + 1
            r13 = 10
            if (r7 <= r13) goto L19b
            java.lang.String r0 = "INFO_TRY_AGAIN_LATER 10 times,force End!"
            java.lang.Object[] r3 = new java.lang.Object[r5]
            com.hw.videoprocessor.util.c.f(r0, r3)
        L197:
            r0 = 1
            goto Lcc
        L19a:
            r7 = 0
        L19b:
            if (r4 != r12) goto L19f
            goto Lcc
        L19f:
            r13 = -2
            if (r4 != r13) goto L1c0
            android.media.MediaCodec r4 = r1.b
            android.media.MediaFormat r4 = r4.getOutputFormat()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "decode newFormat = "
            r13.append(r14)
            r13.append(r4)
            java.lang.String r4 = r13.toString()
            java.lang.Object[] r13 = new java.lang.Object[r5]
            com.hw.videoprocessor.util.c.k(r4, r13)
            goto L2e0
        L1c0:
            if (r4 >= 0) goto L1da
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "unexpected result from decoder.dequeueOutputBuffer: "
            r13.append(r14)
            r13.append(r4)
            java.lang.String r4 = r13.toString()
            java.lang.Object[] r13 = new java.lang.Object[r5]
            com.hw.videoprocessor.util.c.f(r4, r13)
            goto L2e0
        L1da:
            java.lang.Integer r13 = r1.d
            r14 = 4
            if (r13 == 0) goto L1f9
            r20 = r13
            long r12 = r2.presentationTimeUs
            int r15 = r20.intValue()
            int r15 = r15 * 1000
            r22 = r12
            long r11 = (long) r15
            int r13 = (r22 > r11 ? 1 : (r22 == r11 ? 0 : -1))
            if (r13 < 0) goto L1f9
            int r0 = r2.flags
            r0 = r0 | r14
            r2.flags = r0
            r0 = 0
            r6 = 1
            r11 = 1
            goto L1fc
        L1f9:
            r11 = r6
            r6 = r0
            r0 = 1
        L1fc:
            java.lang.Integer r12 = r1.c
            r22 = 1000(0x3e8, double:4.94E-321)
            if (r12 == 0) goto L236
            long r14 = r2.presentationTimeUs
            int r12 = r12.intValue()
            int r12 = r12 * 1000
            r25 = r14
            long r13 = (long) r12
            int r12 = (r25 > r13 ? 1 : (r25 == r13 ? 0 : -1))
            if (r12 >= 0) goto L236
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r12 = "drop frame startTime = "
            r0.append(r12)
            java.lang.Integer r12 = r1.c
            r0.append(r12)
            java.lang.String r12 = " present time = "
            r0.append(r12)
            long r12 = r2.presentationTimeUs
            long r12 = r12 / r22
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r12 = new java.lang.Object[r5]
            com.hw.videoprocessor.util.c.f(r0, r12)
            r0 = 0
        L236:
            int r12 = r2.flags
            r13 = 4
            if (r12 != r13) goto L24a
            android.media.MediaCodec r0 = r1.b
            r0.releaseOutputBuffer(r4, r5)
            java.lang.String r0 = "decoderDone"
            java.lang.Object[] r3 = new java.lang.Object[r5]
            com.hw.videoprocessor.util.c.k(r0, r3)
            r6 = r11
            goto L197
        L24a:
            com.hw.videoprocessor.util.d r12 = r1.o
            if (r12 == 0) goto L26b
            boolean r12 = r12.a(r8)
            if (r12 == 0) goto L26b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r12 = "帧率过高，丢帧:"
            r0.append(r12)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r12 = new java.lang.Object[r5]
            com.hw.videoprocessor.util.c.t(r0, r12)
            r0 = 0
        L26b:
            int r8 = r8 + 1
            android.media.MediaCodec r12 = r1.b
            r12.releaseOutputBuffer(r4, r0)
            if (r0 == 0) goto L2de
            com.hw.videoprocessor.util.f r0 = r1.k     // Catch: java.lang.Exception -> L2d4
            r0.a()     // Catch: java.lang.Exception -> L2d4
            int r0 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r0 != 0) goto L297
            long r9 = r2.presentationTimeUs
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "videoStartTime:"
            r0.append(r3)
            long r3 = r9 / r22
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r3 = new java.lang.Object[r5]
            com.hw.videoprocessor.util.c.k(r0, r3)
        L297:
            com.hw.videoprocessor.util.f r0 = r1.k
            r0.d(r5)
            long r3 = r2.presentationTimeUs
            long r3 = r3 - r9
            long r3 = r3 * r22
            java.lang.Float r0 = r1.e
            if (r0 == 0) goto L2ac
            float r3 = (float) r3
            float r0 = r0.floatValue()
            float r3 = r3 / r0
            long r3 = (long) r3
        L2ac:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r12 = "drawImage,setPresentationTimeMs:"
            r0.append(r12)
            long r12 = r3 / r22
            long r12 = r12 / r22
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r12 = new java.lang.Object[r5]
            com.hw.videoprocessor.util.c.k(r0, r12)
            com.hw.videoprocessor.util.e r0 = r1.j
            r0.f(r3)
            com.hw.videoprocessor.util.e r0 = r1.j
            r0.g()
            r0 = r6
            r6 = r11
            goto Lcc
        L2d4:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.Object[] r4 = new java.lang.Object[r5]
            com.hw.videoprocessor.util.c.f(r0, r4)
        L2de:
            r0 = r6
            r6 = r11
        L2e0:
            r12 = -1
            r13 = 2500(0x9c4, double:1.235E-320)
            goto L168
        L2e5:
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.f
            r2 = 1
            r0.set(r2)
            return
        L2ec:
            com.hw.videoprocessor.util.c.g(r0)
            r1.g = r0
            return
    }

    public java.lang.Exception b() {
            r1 = this;
            java.lang.Exception r0 = r1.g
            return r0
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
            r3 = this;
            super.run()
            r3.a()     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            com.hw.videoprocessor.util.e r0 = r3.j
            if (r0 == 0) goto Ld
            r0.e()
        Ld:
            com.hw.videoprocessor.util.f r0 = r3.k
            if (r0 == 0) goto L14
            r0.i()
        L14:
            android.media.MediaCodec r0 = r3.b     // Catch: java.lang.Exception -> L21
            if (r0 == 0) goto L58
            r0.stop()     // Catch: java.lang.Exception -> L21
            android.media.MediaCodec r0 = r3.b     // Catch: java.lang.Exception -> L21
            r0.release()     // Catch: java.lang.Exception -> L21
            return
        L21:
            r0 = move-exception
            java.lang.Exception r1 = r3.g
            if (r1 != 0) goto L27
        L26:
            r1 = r0
        L27:
            r3.g = r1
            com.hw.videoprocessor.util.c.g(r0)
            goto L58
        L2d:
            r0 = move-exception
            goto L59
        L2f:
            r0 = move-exception
            r3.g = r0     // Catch: java.lang.Throwable -> L2d
            com.hw.videoprocessor.util.c.g(r0)     // Catch: java.lang.Throwable -> L2d
            com.hw.videoprocessor.util.e r0 = r3.j
            if (r0 == 0) goto L3e
            com.hw.videoprocessor.util.e r0 = r3.j
            r0.e()
        L3e:
            com.hw.videoprocessor.util.f r0 = r3.k
            if (r0 == 0) goto L45
            r0.i()
        L45:
            android.media.MediaCodec r0 = r3.b     // Catch: java.lang.Exception -> L52
            if (r0 == 0) goto L58
            r0.stop()     // Catch: java.lang.Exception -> L52
            android.media.MediaCodec r0 = r3.b     // Catch: java.lang.Exception -> L52
            r0.release()     // Catch: java.lang.Exception -> L52
            goto L58
        L52:
            r0 = move-exception
            java.lang.Exception r1 = r3.g
            if (r1 != 0) goto L27
            goto L26
        L58:
            return
        L59:
            com.hw.videoprocessor.util.e r1 = r3.j
            if (r1 == 0) goto L60
            r1.e()
        L60:
            com.hw.videoprocessor.util.f r1 = r3.k
            if (r1 == 0) goto L67
            r1.i()
        L67:
            android.media.MediaCodec r1 = r3.b     // Catch: java.lang.Exception -> L74
            if (r1 == 0) goto L7f
            r1.stop()     // Catch: java.lang.Exception -> L74
            android.media.MediaCodec r1 = r3.b     // Catch: java.lang.Exception -> L74
            r1.release()     // Catch: java.lang.Exception -> L74
            goto L7f
        L74:
            r1 = move-exception
            java.lang.Exception r2 = r3.g
            if (r2 != 0) goto L7a
            r2 = r1
        L7a:
            r3.g = r2
            com.hw.videoprocessor.util.c.g(r1)
        L7f:
            throw r0
    }
}
