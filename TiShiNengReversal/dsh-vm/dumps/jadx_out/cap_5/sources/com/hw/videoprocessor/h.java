package com.hw.videoprocessor;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.TargetApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class h {
    static final java.lang.String a = "VideoProcessor";
    static final java.lang.String b = "video/avc";
    public static int c = 15;
    public static final int d = 1;
    public static final int e = 192000;
    public static boolean f = true;
    static final int g = 2500;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a implements java.lang.Runnable {
        final /* synthetic */ java.lang.String a;
        final /* synthetic */ java.io.File b;
        final /* synthetic */ java.lang.Integer c;
        final /* synthetic */ java.lang.Integer d;
        final /* synthetic */ java.util.concurrent.CountDownLatch e;

        a(java.lang.String r1, java.io.File r2, java.lang.Integer r3, java.lang.Integer r4, java.util.concurrent.CountDownLatch r5) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.d = r4
                r0.e = r5
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                java.lang.String r0 = r4.a     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L17
                java.io.File r1 = r4.b     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L17
                java.lang.String r1 = r1.getAbsolutePath()     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L17
                java.lang.Integer r2 = r4.c     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L17
                java.lang.Integer r3 = r4.d     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L17
                com.hw.videoprocessor.util.b.g(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L17
                java.util.concurrent.CountDownLatch r0 = r4.e
                r0.countDown()
                return
            L15:
                r0 = move-exception
                goto L1e
            L17:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L15
                r1.<init>(r0)     // Catch: java.lang.Throwable -> L15
                throw r1     // Catch: java.lang.Throwable -> L15
            L1e:
                java.util.concurrent.CountDownLatch r1 = r4.e
                r1.countDown()
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class b implements java.lang.Runnable {
        final /* synthetic */ java.lang.String a;
        final /* synthetic */ java.io.File b;
        final /* synthetic */ int c;
        final /* synthetic */ int d;
        final /* synthetic */ java.util.concurrent.CountDownLatch e;

        b(java.lang.String r1, java.io.File r2, int r3, int r4, java.util.concurrent.CountDownLatch r5) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.d = r4
                r0.e = r5
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r5 = this;
                java.lang.String r0 = r5.a     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L27
                java.io.File r1 = r5.b     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L27
                java.lang.String r1 = r1.getAbsolutePath()     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L27
                r2 = 0
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L27
                int r3 = r5.c     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L27
                int r4 = r5.d     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L27
                if (r3 <= r4) goto L16
                int r4 = r4 * 1000
                goto L18
            L16:
                int r4 = r3 * 1000
            L18:
                java.lang.Integer r3 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L27
                com.hw.videoprocessor.util.b.g(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L27
                java.util.concurrent.CountDownLatch r0 = r5.e
                r0.countDown()
                return
            L25:
                r0 = move-exception
                goto L2e
            L27:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L25
                r1.<init>(r0)     // Catch: java.lang.Throwable -> L25
                throw r1     // Catch: java.lang.Throwable -> L25
            L2e:
                java.util.concurrent.CountDownLatch r1 = r5.e
                r1.countDown()
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class c {
        private android.content.Context a;
        private java.lang.String b;
        private java.lang.String c;

        @androidx.annotation.Nullable
        private java.lang.Integer d;

        @androidx.annotation.Nullable
        private java.lang.Integer e;

        @androidx.annotation.Nullable
        private java.lang.Integer f;

        @androidx.annotation.Nullable
        private java.lang.Integer g;

        @androidx.annotation.Nullable
        private java.lang.Float h;

        @androidx.annotation.Nullable
        private java.lang.Boolean i;

        @androidx.annotation.Nullable
        private java.lang.Integer j;

        @androidx.annotation.Nullable
        private java.lang.Integer k;

        @androidx.annotation.Nullable
        private java.lang.Integer l;

        @androidx.annotation.Nullable
        private com.hw.videoprocessor.util.k m;
        private boolean n;

        public c(android.content.Context r2) {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.n = r0
                r1.a = r2
                return
        }

        static /* synthetic */ java.lang.String a(com.hw.videoprocessor.h.c r0) {
                java.lang.String r0 = r0.b
                return r0
        }

        static /* synthetic */ java.lang.Integer b(com.hw.videoprocessor.h.c r0) {
                java.lang.Integer r0 = r0.j
                return r0
        }

        static /* synthetic */ com.hw.videoprocessor.util.k c(com.hw.videoprocessor.h.c r0) {
                com.hw.videoprocessor.util.k r0 = r0.m
                return r0
        }

        static /* synthetic */ java.lang.Integer d(com.hw.videoprocessor.h.c r0, java.lang.Integer r1) {
                r0.j = r1
                return r1
        }

        static /* synthetic */ java.lang.Integer e(com.hw.videoprocessor.h.c r0) {
                java.lang.Integer r0 = r0.k
                return r0
        }

        static /* synthetic */ boolean f(com.hw.videoprocessor.h.c r0) {
                boolean r0 = r0.n
                return r0
        }

        static /* synthetic */ java.lang.Integer g(com.hw.videoprocessor.h.c r0) {
                java.lang.Integer r0 = r0.l
                return r0
        }

        static /* synthetic */ java.lang.Integer h(com.hw.videoprocessor.h.c r0, java.lang.Integer r1) {
                r0.l = r1
                return r1
        }

        static /* synthetic */ java.lang.Integer i(com.hw.videoprocessor.h.c r0) {
                java.lang.Integer r0 = r0.d
                return r0
        }

        static /* synthetic */ java.lang.Integer j(com.hw.videoprocessor.h.c r0) {
                java.lang.Integer r0 = r0.e
                return r0
        }

        static /* synthetic */ java.lang.String k(com.hw.videoprocessor.h.c r0) {
                java.lang.String r0 = r0.c
                return r0
        }

        static /* synthetic */ java.lang.Boolean l(com.hw.videoprocessor.h.c r0) {
                java.lang.Boolean r0 = r0.i
                return r0
        }

        static /* synthetic */ java.lang.Integer m(com.hw.videoprocessor.h.c r0) {
                java.lang.Integer r0 = r0.g
                return r0
        }

        static /* synthetic */ java.lang.Integer n(com.hw.videoprocessor.h.c r0) {
                java.lang.Integer r0 = r0.f
                return r0
        }

        static /* synthetic */ java.lang.Float o(com.hw.videoprocessor.h.c r0) {
                java.lang.Float r0 = r0.h
                return r0
        }

        public com.hw.videoprocessor.h.c A(com.hw.videoprocessor.util.k r1) {
                r0 = this;
                r0.m = r1
                return r0
        }

        public com.hw.videoprocessor.h.c B(float r1) {
                r0 = this;
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                r0.h = r1
                return r0
        }

        public com.hw.videoprocessor.h.c C(int r1) {
                r0 = this;
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.f = r1
                return r0
        }

        public com.hw.videoprocessor.h.c p(int r1) {
                r0 = this;
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.j = r1
                return r0
        }

        public com.hw.videoprocessor.h.c q(boolean r1) {
                r0 = this;
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                r0.i = r1
                return r0
        }

        public com.hw.videoprocessor.h.c r(boolean r1) {
                r0 = this;
                r0.n = r1
                return r0
        }

        public com.hw.videoprocessor.h.c s(int r1) {
                r0 = this;
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.g = r1
                return r0
        }

        public com.hw.videoprocessor.h.c t(int r1) {
                r0 = this;
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.k = r1
                return r0
        }

        public com.hw.videoprocessor.h.c u(int r1) {
                r0 = this;
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.l = r1
                return r0
        }

        public com.hw.videoprocessor.h.c v(java.lang.String r1) {
                r0 = this;
                r0.b = r1
                return r0
        }

        public com.hw.videoprocessor.h.c w(int r1) {
                r0 = this;
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.e = r1
                return r0
        }

        public com.hw.videoprocessor.h.c x(int r1) {
                r0 = this;
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.d = r1
                return r0
        }

        public com.hw.videoprocessor.h.c y(java.lang.String r1) {
                r0 = this;
                r0.c = r1
                return r0
        }

        public void z() throws java.lang.Exception {
                r1 = this;
                android.content.Context r0 = r1.a
                com.hw.videoprocessor.h.e(r0, r1)
                return
        }
    }

    static {
            return
    }

    public h() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void a(android.content.Context r35, java.lang.String r36, java.lang.String r37, @androidx.annotation.IntRange(from = 0, to = 100) int r38, float r39, float r40) throws java.io.IOException {
            r0 = r36
            r1 = r38
            r2 = r39
            r3 = r40
            java.lang.String r4 = "frame-rate"
            r5 = 100
            r6 = 0
            if (r1 != r5) goto L1b
            int r5 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r5 != 0) goto L1b
            int r5 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r5 != 0) goto L1b
            com.hw.videoprocessor.util.b.f(r36, r37)
            return
        L1b:
            java.io.File r5 = new java.io.File
            java.io.File r7 = r35.getCacheDir()
            java.lang.String r8 = "pcm"
            r5.<init>(r7, r8)
            r5.mkdir()
            android.media.MediaExtractor r7 = new android.media.MediaExtractor
            r7.<init>()
            r7.setDataSource(r0)
            r8 = 1
            int r9 = com.hw.videoprocessor.i.k(r7, r8)
            r10 = 0
            if (r9 >= 0) goto L44
            java.lang.String r1 = "no audio stream!"
            java.lang.Object[] r2 = new java.lang.Object[r10]
            com.hw.videoprocessor.util.c.f(r1, r2)
            com.hw.videoprocessor.util.b.f(r36, r37)
            return
        L44:
            long r11 = java.lang.System.currentTimeMillis()
            java.io.File r13 = new java.io.File
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "video_"
            r14.append(r15)
            r14.append(r11)
            r16 = 0
            java.lang.String r6 = ".pcm"
            r14.append(r6)
            java.lang.String r6 = r14.toString()
            r13.<init>(r5, r6)
            java.io.File r6 = new java.io.File
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r15)
            r14.append(r11)
            java.lang.String r8 = "_adjust.pcm"
            r14.append(r8)
            java.lang.String r8 = r14.toString()
            r6.<init>(r5, r8)
            java.io.File r8 = new java.io.File
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r15)
            r14.append(r11)
            java.lang.String r11 = ".wav"
            r14.append(r11)
            java.lang.String r11 = r14.toString()
            r8.<init>(r5, r11)
            java.lang.String r5 = r13.getAbsolutePath()
            r11 = 0
            com.hw.videoprocessor.util.b.g(r0, r5, r11, r11)
            java.lang.String r5 = r13.getAbsolutePath()
            java.lang.String r12 = r6.getAbsolutePath()
            com.hw.videoprocessor.util.b.b(r5, r12, r1)
            android.media.MediaFormat r1 = r7.getTrackFormat(r9)
            java.lang.String r5 = "sample-rate"
            int r5 = r1.getInteger(r5)
            java.lang.String r12 = "channel-count"
            boolean r14 = r1.containsKey(r12)
            if (r14 == 0) goto Lc1
            int r12 = r1.getInteger(r12)
            goto Lc2
        Lc1:
            r12 = 1
        Lc2:
            r14 = 2
            if (r12 != r14) goto Lc8
            r15 = 12
            goto Lca
        Lc8:
            r15 = 16
        Lca:
            int r17 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r17 > 0) goto Ld2
            int r16 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r16 <= 0) goto Ld9
        Ld2:
            java.lang.String r11 = r6.getAbsolutePath()
            com.hw.videoprocessor.util.a.a(r11, r5, r12, r2, r3)
        Ld9:
            com.hw.videoprocessor.util.g r2 = new com.hw.videoprocessor.util.g
            r2.<init>(r5, r15, r12, r14)
            java.lang.String r3 = r6.getAbsolutePath()
            java.lang.String r11 = r8.getAbsolutePath()
            r2.a(r3, r11)
            int r2 = com.hw.videoprocessor.util.b.i(r1)
            int r3 = com.hw.videoprocessor.i.k(r7, r10)
            android.media.MediaFormat r11 = r7.getTrackFormat(r3)
            java.lang.String r15 = "rotation-degrees"
            boolean r17 = r11.containsKey(r15)
            if (r17 == 0) goto L102
            int r15 = r11.getInteger(r15)
            goto L103
        L102:
            r15 = 0
        L103:
            android.media.MediaMuxer r14 = new android.media.MediaMuxer
            r0 = r37
            r14.<init>(r0, r10)
            r14.setOrientationHint(r15)
            int r0 = r14.addTrack(r11)
            int r1 = r14.addTrack(r1)
            r14.start()
            android.media.MediaExtractor r15 = new android.media.MediaExtractor
            r15.<init>()
            java.lang.String r10 = r8.getAbsolutePath()
            r15.setDataSource(r10)
            r18 = r6
            r10 = 1
            int r6 = com.hw.videoprocessor.i.k(r15, r10)
            r15.selectTrack(r6)
            android.media.MediaFormat r6 = r15.getTrackFormat(r6)
            int r6 = com.hw.videoprocessor.util.b.j(r6)
            java.nio.ByteBuffer r10 = java.nio.ByteBuffer.allocateDirect(r6)
            r19 = r8
            android.media.MediaCodec$BufferInfo r8 = new android.media.MediaCodec$BufferInfo
            r8.<init>()
            r20 = r13
            java.lang.String r13 = "audio/mp4a-latm"
            android.media.MediaFormat r12 = android.media.MediaFormat.createAudioFormat(r13, r5, r12)
            r21 = r5
            java.lang.String r5 = "bitrate"
            r12.setInteger(r5, r2)
            java.lang.String r2 = "aac-profile"
            r5 = 2
            r12.setInteger(r2, r5)
            java.lang.String r2 = "max-input-size"
            r12.setInteger(r2, r6)
            android.media.MediaCodec r5 = android.media.MediaCodec.createEncoderByType(r13)
            r6 = 1
            r13 = 0
            r5.configure(r12, r13, r13, r6)
            r5.start()
            r12 = 1024000000(0x3d090000, float:0.033447266)
            int r12 = r12 / r21
            r29 = -1
            r31 = r29
            r13 = 0
            r16 = 0
            r21 = 0
        L174:
            java.lang.String r6 = " info.presentationTimeUs:"
            r37 = r2
            r39 = r3
            r22 = 0
            java.lang.String r2 = " size:"
            java.lang.String r3 = "VideoProcessor"
            if (r13 != 0) goto L334
            r40 = r0
            r33 = r1
            r0 = 2500(0x9c4, double:1.235E-320)
            r24 = r22
            int r23 = r5.dequeueInputBuffer(r0)     // Catch: java.lang.Throwable -> L20c
            if (r16 != 0) goto L212
            if (r23 < 0) goto L212
            long r26 = r15.getSampleTime()     // Catch: java.lang.Throwable -> L20c
            int r22 = (r26 > r24 ? 1 : (r26 == r24 ? 0 : -1))
            if (r22 >= 0) goto L1bb
            r26 = 0
            r28 = 4
            r24 = 0
            r25 = 0
            r22 = r5
            r22.queueInputBuffer(r23, r24, r25, r26, r28)     // Catch: java.lang.Throwable -> L1b5
            r23 = r4
            r22 = r10
            r34 = r13
            r16 = 1
            r13 = r11
            r10 = r0
            r0 = r31
            goto L21e
        L1b5:
            r0 = move-exception
            r5 = r22
        L1b8:
            r1 = r0
            goto L459
        L1bb:
            r0 = r23
            int r28 = r15.getSampleFlags()     // Catch: java.lang.Throwable -> L20c
            r10.clear()     // Catch: java.lang.Throwable -> L20c
            r34 = r13
            r1 = 0
            int r13 = r15.readSampleData(r10, r1)     // Catch: java.lang.Throwable -> L20c
            java.nio.ByteBuffer r1 = r5.getInputBuffer(r0)     // Catch: java.lang.Throwable -> L20c
            r1.clear()     // Catch: java.lang.Throwable -> L20c
            r1.put(r10)     // Catch: java.lang.Throwable -> L20c
            r23 = r0
            r0 = 0
            r1.position(r0)     // Catch: java.lang.Throwable -> L20c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L20c
            r0.<init>()     // Catch: java.lang.Throwable -> L20c
            java.lang.String r1 = "audio queuePcmBuffer "
            r0.append(r1)     // Catch: java.lang.Throwable -> L20c
            r24 = 1000(0x3e8, double:4.94E-321)
            r1 = r4
            r22 = r5
            long r4 = r26 / r24
            r0.append(r4)     // Catch: java.lang.Throwable -> L1b5
            r0.append(r2)     // Catch: java.lang.Throwable -> L1b5
            r0.append(r13)     // Catch: java.lang.Throwable -> L1b5
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L1b5
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L1b5
            com.hw.videoprocessor.util.c.n(r3, r0, r5)     // Catch: java.lang.Throwable -> L1b5
            r24 = 0
            r25 = r13
            r22.queueInputBuffer(r23, r24, r25, r26, r28)     // Catch: java.lang.Throwable -> L1b5
            r5 = r22
            r15.advance()     // Catch: java.lang.Throwable -> L20c
            goto L215
        L20c:
            r0 = move-exception
        L20d:
            r1 = r0
            r22 = r5
            goto L459
        L212:
            r1 = r4
            r34 = r13
        L215:
            r23 = r1
            r22 = r10
            r13 = r11
            r0 = r31
        L21c:
            r10 = 2500(0x9c4, double:1.235E-320)
        L21e:
            int r4 = r5.dequeueOutputBuffer(r8, r10)     // Catch: java.lang.Throwable -> L20c
            r10 = -1
            if (r4 != r10) goto L226
            goto L26b
        L226:
            r10 = -2
            if (r4 != r10) goto L245
            android.media.MediaFormat r4 = r5.getOutputFormat()     // Catch: java.lang.Throwable -> L20c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L20c
            r10.<init>()     // Catch: java.lang.Throwable -> L20c
            java.lang.String r11 = "audio decode newFormat = "
            r10.append(r11)     // Catch: java.lang.Throwable -> L20c
            r10.append(r4)     // Catch: java.lang.Throwable -> L20c
            java.lang.String r4 = r10.toString()     // Catch: java.lang.Throwable -> L20c
            r10 = 0
            java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch: java.lang.Throwable -> L20c
            com.hw.videoprocessor.util.c.n(r3, r4, r11)     // Catch: java.lang.Throwable -> L20c
            goto L25e
        L245:
            if (r4 >= 0) goto L264
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L20c
            r10.<init>()     // Catch: java.lang.Throwable -> L20c
            java.lang.String r11 = "unexpected result from audio decoder.dequeueOutputBuffer: "
            r10.append(r11)     // Catch: java.lang.Throwable -> L20c
            r10.append(r4)     // Catch: java.lang.Throwable -> L20c
            java.lang.String r4 = r10.toString()     // Catch: java.lang.Throwable -> L20c
            r10 = 0
            java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch: java.lang.Throwable -> L20c
            com.hw.videoprocessor.util.c.h(r3, r4, r11)     // Catch: java.lang.Throwable -> L20c
        L25e:
            r26 = r13
            r4 = r33
            goto L32a
        L264:
            int r10 = r8.flags     // Catch: java.lang.Throwable -> L20c
            r11 = 4
            if (r10 != r11) goto L27e
            r34 = 1
        L26b:
            r2 = r37
            r3 = r39
            r31 = r0
            r11 = r13
            r10 = r22
            r4 = r23
            r1 = r33
            r13 = r34
            r0 = r40
            goto L174
        L27e:
            java.nio.ByteBuffer r10 = r5.getOutputBuffer(r4)     // Catch: java.lang.Throwable -> L20c
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L20c
            r11.<init>()     // Catch: java.lang.Throwable -> L20c
            r26 = r13
            java.lang.String r13 = "audio writeSampleData "
            r11.append(r13)     // Catch: java.lang.Throwable -> L20c
            r24 = r4
            r13 = r5
            long r4 = r8.presentationTimeUs     // Catch: java.lang.Throwable -> L330
            r11.append(r4)     // Catch: java.lang.Throwable -> L330
            r11.append(r2)     // Catch: java.lang.Throwable -> L330
            int r4 = r8.size     // Catch: java.lang.Throwable -> L330
            r11.append(r4)     // Catch: java.lang.Throwable -> L330
            java.lang.String r4 = " flags:"
            r11.append(r4)     // Catch: java.lang.Throwable -> L330
            int r4 = r8.flags     // Catch: java.lang.Throwable -> L330
            r11.append(r4)     // Catch: java.lang.Throwable -> L330
            java.lang.String r4 = r11.toString()     // Catch: java.lang.Throwable -> L330
            r5 = 0
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L330
            com.hw.videoprocessor.util.c.n(r3, r4, r11)     // Catch: java.lang.Throwable -> L330
            if (r21 != 0) goto L2ec
            int r4 = (r0 > r29 ? 1 : (r0 == r29 ? 0 : -1))
            if (r4 == 0) goto L2ec
            long r4 = r8.presentationTimeUs     // Catch: java.lang.Throwable -> L2e6
            r27 = r4
            long r4 = (long) r12     // Catch: java.lang.Throwable -> L2e6
            long r4 = r4 + r0
            int r11 = (r27 > r4 ? 1 : (r27 == r4 ? 0 : -1))
            if (r11 >= 0) goto L2ec
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e6
            r4.<init>()     // Catch: java.lang.Throwable -> L2e6
            java.lang.String r5 = "audio 时间戳错误，lastAudioFrameTimeUs:"
            r4.append(r5)     // Catch: java.lang.Throwable -> L2e6
            r4.append(r0)     // Catch: java.lang.Throwable -> L2e6
            r4.append(r6)     // Catch: java.lang.Throwable -> L2e6
            r27 = r0
            long r0 = r8.presentationTimeUs     // Catch: java.lang.Throwable -> L2e6
            r4.append(r0)     // Catch: java.lang.Throwable -> L2e6
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L2e6
            r1 = 0
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L2e6
            com.hw.videoprocessor.util.c.h(r3, r0, r4)     // Catch: java.lang.Throwable -> L2e6
            r21 = 1
            goto L2ee
        L2e6:
            r0 = move-exception
            r1 = r0
            r22 = r13
            goto L459
        L2ec:
            r27 = r0
        L2ee:
            if (r21 == 0) goto L310
            long r0 = (long) r12     // Catch: java.lang.Throwable -> L2e6
            long r0 = r27 + r0
            r8.presentationTimeUs = r0     // Catch: java.lang.Throwable -> L2e6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e6
            r0.<init>()     // Catch: java.lang.Throwable -> L2e6
            java.lang.String r1 = "audio 时间戳错误，使用修正的时间戳:"
            r0.append(r1)     // Catch: java.lang.Throwable -> L2e6
            long r4 = r8.presentationTimeUs     // Catch: java.lang.Throwable -> L2e6
            r0.append(r4)     // Catch: java.lang.Throwable -> L2e6
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L2e6
            r1 = 0
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L2e6
            com.hw.videoprocessor.util.c.h(r3, r0, r4)     // Catch: java.lang.Throwable -> L2e6
            r21 = 0
        L310:
            int r0 = r8.flags     // Catch: java.lang.Throwable -> L330
            r5 = 2
            if (r0 == r5) goto L31a
            long r0 = r8.presentationTimeUs     // Catch: java.lang.Throwable -> L2e6
        L317:
            r4 = r33
            goto L31d
        L31a:
            r0 = r27
            goto L317
        L31d:
            r14.writeSampleData(r4, r10, r8)     // Catch: java.lang.Throwable -> L330
            r10.clear()     // Catch: java.lang.Throwable -> L330
            r5 = r13
            r10 = r24
            r11 = 0
            r5.releaseOutputBuffer(r10, r11)     // Catch: java.lang.Throwable -> L20c
        L32a:
            r33 = r4
            r13 = r26
            goto L21c
        L330:
            r0 = move-exception
            r5 = r13
            goto L20d
        L334:
            r40 = r0
            r26 = r11
            r24 = r22
            r23 = r4
            if (r9 < 0) goto L341
            r7.unselectTrack(r9)     // Catch: java.lang.Throwable -> L20c
        L341:
            r0 = r39
            r7.selectTrack(r0)     // Catch: java.lang.Throwable -> L3ee
            r0 = r24
            r10 = 0
            r7.seekTo(r0, r10)     // Catch: java.lang.Throwable -> L3ee
            r0 = r37
            r13 = r26
            int r0 = r13.getInteger(r0)     // Catch: java.lang.Throwable -> L3ee
            r1 = r23
            boolean r4 = r13.containsKey(r1)     // Catch: java.lang.Throwable -> L3ee
            if (r4 == 0) goto L361
            int r1 = r13.getInteger(r1)     // Catch: java.lang.Throwable -> L20c
            goto L36b
        L361:
            float r1 = com.hw.videoprocessor.i.c(r36)     // Catch: java.lang.Throwable -> L3ee
            double r9 = (double) r1     // Catch: java.lang.Throwable -> L3ee
            double r9 = java.lang.Math.ceil(r9)     // Catch: java.lang.Throwable -> L3ee
            int r1 = (int) r9     // Catch: java.lang.Throwable -> L3ee
        L36b:
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r0)     // Catch: java.lang.Throwable -> L3ee
            r4 = 1232348160(0x49742400, float:1000000.0)
            float r1 = (float) r1     // Catch: java.lang.Throwable -> L3ee
            float r4 = r4 / r1
            int r1 = (int) r4     // Catch: java.lang.Throwable -> L3ee
            r9 = r29
            r4 = 0
        L378:
            long r11 = r7.getSampleTime()     // Catch: java.lang.Throwable -> L3ee
            int r13 = (r11 > r29 ? 1 : (r11 == r29 ? 0 : -1))
            if (r13 != 0) goto L381
            goto L392
        L381:
            r8.presentationTimeUs = r11     // Catch: java.lang.Throwable -> L3ee
            int r11 = r7.getSampleFlags()     // Catch: java.lang.Throwable -> L3ee
            r8.flags = r11     // Catch: java.lang.Throwable -> L3ee
            r11 = 0
            int r12 = r7.readSampleData(r0, r11)     // Catch: java.lang.Throwable -> L3ee
            r8.size = r12     // Catch: java.lang.Throwable -> L3ee
            if (r12 >= 0) goto L3b0
        L392:
            r20.delete()
            r18.delete()
            r19.delete()
            r15.release()     // Catch: java.lang.Exception -> L3ab
            r7.release()     // Catch: java.lang.Exception -> L3ab
            r14.release()     // Catch: java.lang.Exception -> L3ab
            r5.stop()     // Catch: java.lang.Exception -> L3ab
            r5.release()     // Catch: java.lang.Exception -> L3ab
            return
        L3ab:
            r0 = move-exception
            com.hw.videoprocessor.util.c.g(r0)
            return
        L3b0:
            if (r4 != 0) goto L3f3
            int r11 = (r9 > r29 ? 1 : (r9 == r29 ? 0 : -1))
            if (r11 == 0) goto L3f3
            long r11 = r8.presentationTimeUs     // Catch: java.lang.Throwable -> L3ee
            r36 = r4
            r22 = r5
            long r4 = (long) r1
            long r4 = r4 + r9
            int r13 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r13 >= 0) goto L3f7
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3eb
            r4.<init>()     // Catch: java.lang.Throwable -> L3eb
            java.lang.String r5 = "video 时间戳错误，lastVideoFrameTimeUs:"
            r4.append(r5)     // Catch: java.lang.Throwable -> L3eb
            r4.append(r9)     // Catch: java.lang.Throwable -> L3eb
            r4.append(r6)     // Catch: java.lang.Throwable -> L3eb
            long r11 = r8.presentationTimeUs     // Catch: java.lang.Throwable -> L3eb
            r4.append(r11)     // Catch: java.lang.Throwable -> L3eb
            java.lang.String r5 = " VIDEO_FRAME_TIME_US:"
            r4.append(r5)     // Catch: java.lang.Throwable -> L3eb
            r4.append(r1)     // Catch: java.lang.Throwable -> L3eb
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L3eb
            r11 = 0
            java.lang.Object[] r5 = new java.lang.Object[r11]     // Catch: java.lang.Throwable -> L3eb
            com.hw.videoprocessor.util.c.h(r3, r4, r5)     // Catch: java.lang.Throwable -> L3eb
            r4 = 1
            goto L3f9
        L3eb:
            r0 = move-exception
            goto L1b8
        L3ee:
            r0 = move-exception
            r22 = r5
            goto L1b8
        L3f3:
            r36 = r4
            r22 = r5
        L3f7:
            r4 = r36
        L3f9:
            if (r4 == 0) goto L419
            long r4 = (long) r1     // Catch: java.lang.Throwable -> L3eb
            long r4 = r4 + r9
            r8.presentationTimeUs = r4     // Catch: java.lang.Throwable -> L3eb
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3eb
            r4.<init>()     // Catch: java.lang.Throwable -> L3eb
            java.lang.String r5 = "video 时间戳错误，使用修正的时间戳:"
            r4.append(r5)     // Catch: java.lang.Throwable -> L3eb
            long r11 = r8.presentationTimeUs     // Catch: java.lang.Throwable -> L3eb
            r4.append(r11)     // Catch: java.lang.Throwable -> L3eb
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L3eb
            r11 = 0
            java.lang.Object[] r5 = new java.lang.Object[r11]     // Catch: java.lang.Throwable -> L3eb
            com.hw.videoprocessor.util.c.h(r3, r4, r5)     // Catch: java.lang.Throwable -> L3eb
            r4 = 0
        L419:
            int r5 = r8.flags     // Catch: java.lang.Throwable -> L3eb
            r11 = 2
            if (r5 == r11) goto L420
            long r9 = r8.presentationTimeUs     // Catch: java.lang.Throwable -> L3eb
        L420:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3eb
            r5.<init>()     // Catch: java.lang.Throwable -> L3eb
            java.lang.String r12 = "video writeSampleData:"
            r5.append(r12)     // Catch: java.lang.Throwable -> L3eb
            long r12 = r8.presentationTimeUs     // Catch: java.lang.Throwable -> L3eb
            r5.append(r12)     // Catch: java.lang.Throwable -> L3eb
            java.lang.String r12 = " type:"
            r5.append(r12)     // Catch: java.lang.Throwable -> L3eb
            int r12 = r8.flags     // Catch: java.lang.Throwable -> L3eb
            r5.append(r12)     // Catch: java.lang.Throwable -> L3eb
            r5.append(r2)     // Catch: java.lang.Throwable -> L3eb
            int r12 = r8.size     // Catch: java.lang.Throwable -> L3eb
            r5.append(r12)     // Catch: java.lang.Throwable -> L3eb
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L3eb
            r12 = 0
            java.lang.Object[] r13 = new java.lang.Object[r12]     // Catch: java.lang.Throwable -> L3eb
            com.hw.videoprocessor.util.c.v(r3, r5, r13)     // Catch: java.lang.Throwable -> L3eb
            r5 = r40
            r14.writeSampleData(r5, r0, r8)     // Catch: java.lang.Throwable -> L3eb
            r7.advance()     // Catch: java.lang.Throwable -> L3eb
            r40 = r5
            r5 = r22
            goto L378
        L459:
            r20.delete()
            r18.delete()
            r19.delete()
            r15.release()     // Catch: java.lang.Exception -> L472
            r7.release()     // Catch: java.lang.Exception -> L472
            r14.release()     // Catch: java.lang.Exception -> L472
            r22.stop()     // Catch: java.lang.Exception -> L472
            r22.release()     // Catch: java.lang.Exception -> L472
            goto L476
        L472:
            r0 = move-exception
            com.hw.videoprocessor.util.c.g(r0)
        L476:
            throw r1
    }

    public static void b(android.content.Context r0, java.lang.String r1, java.lang.String r2, float r3) throws java.lang.Exception {
            com.hw.videoprocessor.h$c r0 = f(r0)
            com.hw.videoprocessor.h$c r0 = r0.v(r1)
            com.hw.videoprocessor.h$c r0 = r0.y(r2)
            com.hw.videoprocessor.h$c r0 = r0.B(r3)
            r0.z()
            return
    }

    public static void c(android.content.Context r0, java.lang.String r1, java.lang.String r2, int r3, int r4) throws java.lang.Exception {
            com.hw.videoprocessor.h$c r0 = f(r0)
            com.hw.videoprocessor.h$c r0 = r0.v(r1)
            com.hw.videoprocessor.h$c r0 = r0.y(r2)
            com.hw.videoprocessor.h$c r0 = r0.C(r3)
            com.hw.videoprocessor.h$c r0 = r0.s(r4)
            r0.z()
            return
    }

    public static void d(android.content.Context r45, java.lang.String r46, java.lang.String r47, java.lang.String r48, java.lang.Integer r49, java.lang.Integer r50, @androidx.annotation.IntRange(from = 0, to = 100) int r51, @androidx.annotation.IntRange(from = 0, to = 100) int r52, float r53, float r54) throws java.io.IOException {
            r1 = r46
            r6 = r47
            r7 = r52
            java.lang.String r10 = "frame-rate"
            java.io.File r11 = new java.io.File
            java.io.File r0 = r45.getCacheDir()
            java.lang.String r2 = "pcm"
            r11.<init>(r0, r2)
            r11.mkdir()
            java.io.File r2 = new java.io.File
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "video_"
            r0.append(r3)
            long r3 = java.lang.System.currentTimeMillis()
            r0.append(r3)
            java.lang.String r12 = ".pcm"
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            r2.<init>(r11, r0)
            java.io.File r13 = new java.io.File
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "aac_"
            r0.append(r3)
            long r3 = java.lang.System.currentTimeMillis()
            r0.append(r3)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            r13.<init>(r11, r0)
            if (r49 != 0) goto L56
            r15 = 0
            goto L5d
        L56:
            int r0 = r49.intValue()
            int r0 = r0 * 1000
            r15 = r0
        L5d:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r15)
            if (r50 != 0) goto L65
            r4 = 0
            goto L6f
        L65:
            int r4 = r50.intValue()
            int r4 = r4 * 1000
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L6f:
            r5 = 9
            if (r4 != 0) goto L86
            android.media.MediaMetadataRetriever r0 = new android.media.MediaMetadataRetriever
            r0.<init>()
            r0.setDataSource(r1)
            java.lang.String r0 = r0.extractMetadata(r5)
            int r0 = java.lang.Integer.parseInt(r0)
        L83:
            r16 = r0
            goto L8e
        L86:
            int r0 = r4.intValue()
            int r0 = r0 - r15
            int r0 = r0 / 1000
            goto L83
        L8e:
            android.media.MediaMetadataRetriever r0 = new android.media.MediaMetadataRetriever
            r0.<init>()
            r0.setDataSource(r6)
            java.lang.String r5 = r0.extractMetadata(r5)
            int r17 = java.lang.Integer.parseInt(r5)
            r0.release()
            android.media.MediaExtractor r5 = new android.media.MediaExtractor
            r5.<init>()
            r5.setDataSource(r1)
            r0 = 1
            int r14 = com.hw.videoprocessor.i.k(r5, r0)
            android.media.MediaExtractor r0 = new android.media.MediaExtractor
            r0.<init>()
            r0.setDataSource(r6)
            r1 = 1
            int r6 = com.hw.videoprocessor.i.k(r0, r1)
            r19 = r13
            r1 = 0
            int r13 = com.hw.videoprocessor.i.k(r5, r1)
            android.media.MediaFormat r1 = r5.getTrackFormat(r13)
            r20 = r0
            java.lang.String r0 = "rotation-degrees"
            boolean r21 = r1.containsKey(r0)
            if (r21 == 0) goto Ld7
            int r0 = r1.getInteger(r0)
        Ld4:
            r21 = r10
            goto Ld9
        Ld7:
            r0 = 0
            goto Ld4
        Ld9:
            android.media.MediaMuxer r10 = new android.media.MediaMuxer
            r22 = r2
            r23 = r3
            r3 = 0
            r2 = r48
            r10.<init>(r2, r3)
            r10.setOrientationHint(r0)
            int r0 = r10.addTrack(r1)
            r2 = 4
            java.lang.String r3 = "mime"
            r24 = 12
            r25 = 16
            r26 = r15
            java.lang.String r15 = ".wav"
            r27 = r13
            java.lang.String r13 = "adjusted_"
            r28 = r10
            java.lang.String r10 = "audio/mp4a-latm"
            r29 = 0
            r48 = r10
            r10 = 2
            if (r14 < 0) goto L255
            long r30 = java.lang.System.currentTimeMillis()
            r32 = r5
            java.util.concurrent.CountDownLatch r5 = new java.util.concurrent.CountDownLatch
            r5.<init>(r10)
            java.lang.Thread r10 = new java.lang.Thread
            r33 = r0
            com.hw.videoprocessor.h$a r0 = new com.hw.videoprocessor.h$a
            r35 = r1
            r37 = r3
            r9 = r20
            r2 = r22
            r3 = r23
            r8 = r32
            r36 = r33
            r1 = r46
            r0.<init>(r1, r2, r3, r4, r5)
            r20 = r4
            r10.<init>(r0)
            r10.start()
            java.lang.Thread r10 = new java.lang.Thread
            com.hw.videoprocessor.h$b r0 = new com.hw.videoprocessor.h$b
            r1 = r47
            r4 = r16
            r3 = r17
            r2 = r19
            r0.<init>(r1, r2, r3, r4, r5)
            r10.<init>(r0)
            r10.start()
            r5.await()     // Catch: java.lang.InterruptedException -> L14b
            goto L14c
        L14b:
        L14c:
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r5 = r22.getAbsolutePath()
            java.lang.String r10 = r2.getAbsolutePath()
            r49 = r0
            android.media.MediaFormat r0 = r8.getTrackFormat(r14)
            android.media.MediaFormat r1 = r9.getTrackFormat(r6)
            android.util.Pair r0 = com.hw.videoprocessor.util.b.c(r5, r10, r0, r1)
            java.lang.Object r1 = r0.first
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.lang.Object r0 = r0.second
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r9.release()
            long r5 = java.lang.System.currentTimeMillis()
            boolean r9 = com.hw.videoprocessor.h.f
            if (r9 == 0) goto L185
            java.io.File r2 = com.hw.videoprocessor.util.b.d(r2, r3, r4)
        L185:
            java.io.File r3 = new java.io.File
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r13)
            long r9 = java.lang.System.currentTimeMillis()
            r4.append(r9)
            r4.append(r12)
            java.lang.String r4 = r4.toString()
            r3.<init>(r11, r4)
            java.lang.String r4 = r22.getAbsolutePath()
            java.lang.String r9 = r2.getAbsolutePath()
            java.lang.String r10 = r3.getAbsolutePath()
            r11 = r51
            com.hw.videoprocessor.util.b.l(r4, r9, r10, r11, r7)
            java.io.File r4 = new java.io.File
            java.io.File r7 = r45.getCacheDir()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r3.getName()
            r9.append(r10)
            r9.append(r15)
            java.lang.String r9 = r9.toString()
            r4.<init>(r7, r9)
            long r9 = java.lang.System.currentTimeMillis()
            r7 = 2
            if (r1 != r7) goto L1d7
            r7 = 12
            goto L1d9
        L1d7:
            r7 = 16
        L1d9:
            int r11 = (r53 > r29 ? 1 : (r53 == r29 ? 0 : -1))
            if (r11 != 0) goto L1e1
            int r11 = (r54 > r29 ? 1 : (r54 == r29 ? 0 : -1))
            if (r11 == 0) goto L1ec
        L1e1:
            java.lang.String r11 = r3.getAbsolutePath()
            r12 = r53
            r13 = r54
            com.hw.videoprocessor.util.a.a(r11, r0, r1, r12, r13)
        L1ec:
            com.hw.videoprocessor.util.g r11 = new com.hw.videoprocessor.util.g
            r12 = 2
            r11.<init>(r0, r7, r1, r12)
            java.lang.String r7 = r3.getAbsolutePath()
            java.lang.String r12 = r4.getAbsolutePath()
            r11.a(r7, r12)
            long r11 = java.lang.System.currentTimeMillis()
            long r15 = r49 - r30
            java.lang.Long r7 = java.lang.Long.valueOf(r15)
            long r15 = r5 - r49
            java.lang.Long r13 = java.lang.Long.valueOf(r15)
            long r5 = r9 - r5
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            long r11 = r11 - r9
            java.lang.Long r6 = java.lang.Long.valueOf(r11)
            r10 = 4
            java.lang.Object[] r9 = new java.lang.Object[r10]
            r11 = 0
            r9[r11] = r7
            r34 = 1
            r9[r34] = r13
            r7 = 2
            r9[r7] = r5
            r5 = 3
            r9[r5] = r6
            java.lang.String r5 = "decode:%dms,resample:%dms,mix:%dms,fade:%dms"
            java.lang.String r5 = java.lang.String.format(r5, r9)
            java.lang.Object[] r6 = new java.lang.Object[r11]
            java.lang.String r9 = "hwLog"
            com.hw.videoprocessor.util.c.h(r9, r5, r6)
            android.media.MediaFormat r5 = r8.getTrackFormat(r14)
            int r6 = com.hw.videoprocessor.util.b.i(r5)
            r12 = r48
            r9 = r37
            r5.setString(r9, r12)
            com.hw.videoprocessor.util.b.e(r5, r7, r0, r1)
            r7 = r28
            int r5 = r7.addTrack(r5)
            r10 = r7
            r32 = r8
            r49 = r14
            r14 = r12
            goto L36c
        L255:
            r36 = r0
            r35 = r1
            r8 = r3
            r32 = r5
            r49 = r14
            r3 = r17
            r2 = r19
            r9 = r20
            r10 = r28
            r18 = 0
            r1 = r47
            r14 = r48
            r20 = r4
            r4 = r16
            java.lang.String r0 = r2.getAbsolutePath()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r18)
            if (r3 <= r4) goto L27d
            int r3 = r4 * 1000
            goto L27f
        L27d:
            int r3 = r3 * 1000
        L27f:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.hw.videoprocessor.util.b.g(r1, r0, r5, r3)
            android.media.MediaFormat r0 = r9.getTrackFormat(r6)
            int r6 = com.hw.videoprocessor.util.b.i(r0)
            java.lang.String r1 = "channel-count"
            boolean r3 = r0.containsKey(r1)
            if (r3 == 0) goto L29b
            int r3 = r0.getInteger(r1)
            goto L29c
        L29b:
            r3 = 1
        L29c:
            java.lang.String r4 = "sample-rate"
            boolean r5 = r0.containsKey(r4)
            if (r5 == 0) goto L2aa
            int r5 = r0.getInteger(r4)
        L2a8:
            r9 = 2
            goto L2ae
        L2aa:
            r5 = 44100(0xac44, float:6.1797E-41)
            goto L2a8
        L2ae:
            com.hw.videoprocessor.util.b.e(r0, r9, r5, r3)
            r0.setString(r8, r14)
            int r5 = r10.addTrack(r0)
            int r3 = r0.getInteger(r4)
            boolean r4 = r0.containsKey(r1)
            if (r4 == 0) goto L2c7
            int r0 = r0.getInteger(r1)
            goto L2c8
        L2c7:
            r0 = 1
        L2c8:
            if (r0 <= r9) goto L2f0
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r8 = ".channel"
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            r1.<init>(r4)
            java.lang.String r4 = r2.getAbsolutePath()
            java.lang.String r8 = r1.getAbsolutePath()
            com.hw.videoprocessor.util.b.s(r4, r8, r0)
            r2.delete()
            r0 = 1
            goto L2f1
        L2f0:
            r1 = r2
        L2f1:
            r2 = 50
            if (r7 == r2) goto L31d
            java.io.File r2 = new java.io.File
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r13)
            long r8 = java.lang.System.currentTimeMillis()
            r4.append(r8)
            r4.append(r12)
            java.lang.String r4 = r4.toString()
            r2.<init>(r11, r4)
            java.lang.String r4 = r1.getAbsolutePath()
            java.lang.String r8 = r2.getAbsolutePath()
            com.hw.videoprocessor.util.b.b(r4, r8, r7)
        L31b:
            r7 = 2
            goto L31f
        L31d:
            r2 = r1
            goto L31b
        L31f:
            if (r0 != r7) goto L324
            r4 = 12
            goto L326
        L324:
            r4 = 16
        L326:
            java.io.File r7 = new java.io.File
            java.io.File r8 = r45.getCacheDir()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = r2.getName()
            r9.append(r11)
            r9.append(r15)
            java.lang.String r9 = r9.toString()
            r7.<init>(r8, r9)
            int r8 = (r53 > r29 ? 1 : (r53 == r29 ? 0 : -1))
            if (r8 != 0) goto L34a
            int r8 = (r54 > r29 ? 1 : (r54 == r29 ? 0 : -1))
            if (r8 == 0) goto L355
        L34a:
            java.lang.String r8 = r2.getAbsolutePath()
            r12 = r53
            r9 = r54
            com.hw.videoprocessor.util.a.a(r8, r3, r0, r12, r9)
        L355:
            com.hw.videoprocessor.util.g r8 = new com.hw.videoprocessor.util.g
            r9 = 2
            r8.<init>(r3, r4, r0, r9)
            java.lang.String r4 = r2.getAbsolutePath()
            java.lang.String r9 = r7.getAbsolutePath()
            r8.a(r4, r9)
            r4 = r1
            r1 = r0
            r0 = r3
            r3 = r2
            r2 = r4
            r4 = r7
        L36c:
            r10.start()
            android.media.MediaExtractor r7 = new android.media.MediaExtractor
            r7.<init>()
            java.lang.String r8 = r4.getAbsolutePath()
            r7.setDataSource(r8)
            r8 = 1
            int r9 = com.hw.videoprocessor.i.k(r7, r8)
            r7.selectTrack(r9)
            android.media.MediaFormat r9 = r7.getTrackFormat(r9)
            int r9 = com.hw.videoprocessor.util.b.j(r9)
            java.nio.ByteBuffer r11 = java.nio.ByteBuffer.allocateDirect(r9)
            android.media.MediaCodec$BufferInfo r12 = new android.media.MediaCodec$BufferInfo
            r12.<init>()
            android.media.MediaFormat r1 = android.media.MediaFormat.createAudioFormat(r14, r0, r1)
            java.lang.String r13 = "bitrate"
            r1.setInteger(r13, r6)
            java.lang.String r6 = "aac-profile"
            r13 = 2
            r1.setInteger(r6, r13)
            java.lang.String r6 = "max-input-size"
            r1.setInteger(r6, r9)
            android.media.MediaCodec r9 = android.media.MediaCodec.createEncoderByType(r14)
            r13 = 0
            r9.configure(r1, r13, r13, r8)
            r9.start()
            r1 = 1024000000(0x3d090000, float:0.033447266)
            int r1 = r1 / r0
            r0 = 0
            r15 = 0
            r16 = 0
            r23 = -1
        L3bc:
            java.lang.String r8 = " info.presentationTimeUs:"
            r47 = -1
            java.lang.String r13 = " size:"
            java.lang.String r14 = "VideoProcessor"
            if (r0 != 0) goto L573
            r45 = r2
            r51 = r3
            r2 = 2500(0x9c4, double:1.235E-320)
            int r39 = r9.dequeueInputBuffer(r2)     // Catch: java.lang.Throwable -> L56c
            if (r15 != 0) goto L45e
            if (r39 < 0) goto L45e
            long r42 = r7.getSampleTime()     // Catch: java.lang.Throwable -> L45a
            r28 = 0
            int r17 = (r42 > r28 ? 1 : (r42 == r28 ? 0 : -1))
            if (r17 >= 0) goto L403
            r42 = 0
            r44 = 4
            r40 = 0
            r41 = 0
            r38 = r9
            r38.queueInputBuffer(r39, r40, r41, r42, r44)     // Catch: java.lang.Throwable -> L3f9
            r54 = r0
            r17 = r4
            r53 = r6
            r52 = r7
            r15 = 1
            r6 = r2
            r2 = r23
            goto L46a
        L3f9:
            r0 = move-exception
            r9 = r38
            r1 = r0
            r17 = r4
        L3ff:
            r52 = r7
            goto L6ba
        L403:
            r2 = r39
            int r44 = r7.getSampleFlags()     // Catch: java.lang.Throwable -> L45a
            r11.clear()     // Catch: java.lang.Throwable -> L45a
            r54 = r0
            r3 = 0
            int r0 = r7.readSampleData(r11, r3)     // Catch: java.lang.Throwable -> L45a
            java.nio.ByteBuffer r3 = r9.getInputBuffer(r2)     // Catch: java.lang.Throwable -> L45a
            r3.clear()     // Catch: java.lang.Throwable -> L45a
            r3.put(r11)     // Catch: java.lang.Throwable -> L45a
            r39 = r2
            r2 = 0
            r3.position(r2)     // Catch: java.lang.Throwable -> L45a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L45a
            r2.<init>()     // Catch: java.lang.Throwable -> L45a
            java.lang.String r3 = "audio queuePcmBuffer "
            r2.append(r3)     // Catch: java.lang.Throwable -> L45a
            r28 = 1000(0x3e8, double:4.94E-321)
            r17 = r4
            long r3 = r42 / r28
            r2.append(r3)     // Catch: java.lang.Throwable -> L453
            r2.append(r13)     // Catch: java.lang.Throwable -> L453
            r2.append(r0)     // Catch: java.lang.Throwable -> L453
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L453
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L453
            com.hw.videoprocessor.util.c.n(r14, r2, r4)     // Catch: java.lang.Throwable -> L453
            r40 = 0
            r41 = r0
            r38 = r9
            r38.queueInputBuffer(r39, r40, r41, r42, r44)     // Catch: java.lang.Throwable -> L456
            r7.advance()     // Catch: java.lang.Throwable -> L453
            goto L462
        L453:
            r0 = move-exception
        L454:
            r1 = r0
            goto L3ff
        L456:
            r0 = move-exception
            r9 = r38
            goto L454
        L45a:
            r0 = move-exception
            r17 = r4
            goto L454
        L45e:
            r54 = r0
            r17 = r4
        L462:
            r53 = r6
            r52 = r7
            r2 = r23
        L468:
            r6 = 2500(0x9c4, double:1.235E-320)
        L46a:
            int r0 = r9.dequeueOutputBuffer(r12, r6)     // Catch: java.lang.Throwable -> L494
            r4 = -1
            if (r0 != r4) goto L475
            r0 = r54
            r6 = 4
            goto L4ba
        L475:
            r4 = -2
            if (r0 != r4) goto L498
            android.media.MediaFormat r0 = r9.getOutputFormat()     // Catch: java.lang.Throwable -> L494
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L494
            r4.<init>()     // Catch: java.lang.Throwable -> L494
            java.lang.String r6 = "audio decode newFormat = "
            r4.append(r6)     // Catch: java.lang.Throwable -> L494
            r4.append(r0)     // Catch: java.lang.Throwable -> L494
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L494
            r4 = 0
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L494
            com.hw.videoprocessor.util.c.n(r14, r0, r6)     // Catch: java.lang.Throwable -> L494
            goto L4b1
        L494:
            r0 = move-exception
        L495:
            r1 = r0
            goto L6ba
        L498:
            if (r0 >= 0) goto L4b4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L494
            r4.<init>()     // Catch: java.lang.Throwable -> L494
            java.lang.String r6 = "unexpected result from audio decoder.dequeueOutputBuffer: "
            r4.append(r6)     // Catch: java.lang.Throwable -> L494
            r4.append(r0)     // Catch: java.lang.Throwable -> L494
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L494
            r4 = 0
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L494
            com.hw.videoprocessor.util.c.h(r14, r0, r6)     // Catch: java.lang.Throwable -> L494
        L4b1:
            r6 = r5
            goto L569
        L4b4:
            int r4 = r12.flags     // Catch: java.lang.Throwable -> L494
            r6 = 4
            if (r4 != r6) goto L4c8
            r0 = 1
        L4ba:
            r7 = r52
            r6 = r53
            r23 = r2
            r4 = r17
            r2 = r45
            r3 = r51
            goto L3bc
        L4c8:
            java.nio.ByteBuffer r4 = r9.getOutputBuffer(r0)     // Catch: java.lang.Throwable -> L494
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L494
            r7.<init>()     // Catch: java.lang.Throwable -> L494
            java.lang.String r6 = "audio writeSampleData "
            r7.append(r6)     // Catch: java.lang.Throwable -> L494
            r19 = r4
            r6 = r5
            long r4 = r12.presentationTimeUs     // Catch: java.lang.Throwable -> L494
            r7.append(r4)     // Catch: java.lang.Throwable -> L494
            r7.append(r13)     // Catch: java.lang.Throwable -> L494
            int r4 = r12.size     // Catch: java.lang.Throwable -> L494
            r7.append(r4)     // Catch: java.lang.Throwable -> L494
            java.lang.String r4 = " flags:"
            r7.append(r4)     // Catch: java.lang.Throwable -> L494
            int r4 = r12.flags     // Catch: java.lang.Throwable -> L494
            r7.append(r4)     // Catch: java.lang.Throwable -> L494
            java.lang.String r4 = r7.toString()     // Catch: java.lang.Throwable -> L494
            r5 = 0
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L494
            com.hw.videoprocessor.util.c.n(r14, r4, r7)     // Catch: java.lang.Throwable -> L494
            if (r16 != 0) goto L52e
            int r4 = (r2 > r47 ? 1 : (r2 == r47 ? 0 : -1))
            if (r4 == 0) goto L52e
            long r4 = r12.presentationTimeUs     // Catch: java.lang.Throwable -> L494
            r28 = r4
            long r4 = (long) r1     // Catch: java.lang.Throwable -> L494
            long r4 = r4 + r2
            int r7 = (r28 > r4 ? 1 : (r28 == r4 ? 0 : -1))
            if (r7 >= 0) goto L52e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L494
            r4.<init>()     // Catch: java.lang.Throwable -> L494
            java.lang.String r5 = "audio 时间戳错误，lastAudioFrameTimeUs:"
            r4.append(r5)     // Catch: java.lang.Throwable -> L494
            r4.append(r2)     // Catch: java.lang.Throwable -> L494
            r4.append(r8)     // Catch: java.lang.Throwable -> L494
            r28 = r2
            long r2 = r12.presentationTimeUs     // Catch: java.lang.Throwable -> L494
            r4.append(r2)     // Catch: java.lang.Throwable -> L494
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> L494
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L494
            com.hw.videoprocessor.util.c.h(r14, r2, r4)     // Catch: java.lang.Throwable -> L494
            r16 = 1
            goto L530
        L52e:
            r28 = r2
        L530:
            if (r16 == 0) goto L552
            long r2 = (long) r1     // Catch: java.lang.Throwable -> L494
            long r2 = r28 + r2
            r12.presentationTimeUs = r2     // Catch: java.lang.Throwable -> L494
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L494
            r2.<init>()     // Catch: java.lang.Throwable -> L494
            java.lang.String r3 = "audio 时间戳错误，使用修正的时间戳:"
            r2.append(r3)     // Catch: java.lang.Throwable -> L494
            long r3 = r12.presentationTimeUs     // Catch: java.lang.Throwable -> L494
            r2.append(r3)     // Catch: java.lang.Throwable -> L494
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L494
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L494
            com.hw.videoprocessor.util.c.h(r14, r2, r4)     // Catch: java.lang.Throwable -> L494
            r16 = 0
        L552:
            int r2 = r12.flags     // Catch: java.lang.Throwable -> L494
            r7 = 2
            if (r2 == r7) goto L55c
            long r2 = r12.presentationTimeUs     // Catch: java.lang.Throwable -> L494
        L559:
            r4 = r19
            goto L55f
        L55c:
            r2 = r28
            goto L559
        L55f:
            r10.writeSampleData(r6, r4, r12)     // Catch: java.lang.Throwable -> L494
            r4.clear()     // Catch: java.lang.Throwable -> L494
            r4 = 0
            r9.releaseOutputBuffer(r0, r4)     // Catch: java.lang.Throwable -> L494
        L569:
            r5 = r6
            goto L468
        L56c:
            r0 = move-exception
            r17 = r4
            r52 = r7
            goto L495
        L573:
            r45 = r2
            r51 = r3
            r17 = r4
            r53 = r6
            r52 = r7
            if (r49 < 0) goto L58e
            r0 = r49
            r1 = r32
            r1.unselectTrack(r0)     // Catch: java.lang.Throwable -> L589
        L586:
            r0 = r27
            goto L591
        L589:
            r0 = move-exception
            r32 = r1
            goto L495
        L58e:
            r1 = r32
            goto L586
        L591:
            r1.selectTrack(r0)     // Catch: java.lang.Throwable -> L589
            r0 = r26
            long r2 = (long) r0     // Catch: java.lang.Throwable -> L589
            r4 = 0
            r1.seekTo(r2, r4)     // Catch: java.lang.Throwable -> L589
            r4 = r53
            r0 = r35
            int r4 = r0.getInteger(r4)     // Catch: java.lang.Throwable -> L589
            r5 = r21
            boolean r6 = r0.containsKey(r5)     // Catch: java.lang.Throwable -> L589
            if (r6 == 0) goto L5b0
            int r0 = r0.getInteger(r5)     // Catch: java.lang.Throwable -> L589
            goto L5ba
        L5b0:
            float r0 = com.hw.videoprocessor.i.c(r46)     // Catch: java.lang.Throwable -> L589
            double r5 = (double) r0     // Catch: java.lang.Throwable -> L589
            double r5 = java.lang.Math.ceil(r5)     // Catch: java.lang.Throwable -> L589
            int r0 = (int) r5     // Catch: java.lang.Throwable -> L589
        L5ba:
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocateDirect(r4)     // Catch: java.lang.Throwable -> L589
            r5 = 1232348160(0x49742400, float:1000000.0)
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L589
            float r5 = r5 / r0
            int r0 = (int) r5     // Catch: java.lang.Throwable -> L589
            r6 = r47
            r5 = 0
        L5c7:
            long r15 = r1.getSampleTime()     // Catch: java.lang.Throwable -> L589
            int r11 = (r15 > r47 ? 1 : (r15 == r47 ? 0 : -1))
            if (r11 != 0) goto L5d0
            goto L5fb
        L5d0:
            int r11 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r11 >= 0) goto L5d8
            r1.advance()     // Catch: java.lang.Throwable -> L589
            goto L5c7
        L5d8:
            if (r20 == 0) goto L5e6
            int r11 = r20.intValue()     // Catch: java.lang.Throwable -> L589
            r23 = r2
            long r2 = (long) r11     // Catch: java.lang.Throwable -> L589
            int r11 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r11 <= 0) goto L5e8
            goto L5fb
        L5e6:
            r23 = r2
        L5e8:
            long r2 = r15 - r23
            r12.presentationTimeUs = r2     // Catch: java.lang.Throwable -> L589
            int r2 = r1.getSampleFlags()     // Catch: java.lang.Throwable -> L589
            r12.flags = r2     // Catch: java.lang.Throwable -> L589
            r3 = 0
            int r2 = r1.readSampleData(r4, r3)     // Catch: java.lang.Throwable -> L589
            r12.size = r2     // Catch: java.lang.Throwable -> L589
            if (r2 >= 0) goto L61c
        L5fb:
            r45.delete()
            r22.delete()
            r51.delete()
            r17.delete()
            r52.release()     // Catch: java.lang.Exception -> L617
            r1.release()     // Catch: java.lang.Exception -> L617
            r9.stop()     // Catch: java.lang.Exception -> L617
            r9.release()     // Catch: java.lang.Exception -> L617
            r10.release()     // Catch: java.lang.Exception -> L617
            goto L61b
        L617:
            r0 = move-exception
            com.hw.videoprocessor.util.c.g(r0)
        L61b:
            return
        L61c:
            if (r5 != 0) goto L656
            int r2 = (r6 > r47 ? 1 : (r6 == r47 ? 0 : -1))
            if (r2 == 0) goto L656
            long r2 = r12.presentationTimeUs     // Catch: java.lang.Throwable -> L589
            r32 = r1
            r15 = r2
            long r1 = (long) r0
            long r1 = r1 + r6
            int r3 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r3 >= 0) goto L658
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L494
            r1.<init>()     // Catch: java.lang.Throwable -> L494
            java.lang.String r2 = "video 时间戳错误，lastVideoFrameTimeUs:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L494
            r1.append(r6)     // Catch: java.lang.Throwable -> L494
            r1.append(r8)     // Catch: java.lang.Throwable -> L494
            long r2 = r12.presentationTimeUs     // Catch: java.lang.Throwable -> L494
            r1.append(r2)     // Catch: java.lang.Throwable -> L494
            java.lang.String r2 = " VIDEO_FRAME_TIME_US:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L494
            r1.append(r0)     // Catch: java.lang.Throwable -> L494
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L494
            r3 = 0
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L494
            com.hw.videoprocessor.util.c.h(r14, r1, r2)     // Catch: java.lang.Throwable -> L494
            r5 = 1
            goto L658
        L656:
            r32 = r1
        L658:
            if (r5 == 0) goto L678
            long r1 = (long) r0     // Catch: java.lang.Throwable -> L494
            long r1 = r1 + r6
            r12.presentationTimeUs = r1     // Catch: java.lang.Throwable -> L494
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L494
            r1.<init>()     // Catch: java.lang.Throwable -> L494
            java.lang.String r2 = "video 时间戳错误，使用修正的时间戳:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L494
            long r2 = r12.presentationTimeUs     // Catch: java.lang.Throwable -> L494
            r1.append(r2)     // Catch: java.lang.Throwable -> L494
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L494
            r3 = 0
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L494
            com.hw.videoprocessor.util.c.h(r14, r1, r2)     // Catch: java.lang.Throwable -> L494
            r5 = 0
        L678:
            int r1 = r12.flags     // Catch: java.lang.Throwable -> L494
            r2 = 2
            if (r1 == r2) goto L67f
            long r6 = r12.presentationTimeUs     // Catch: java.lang.Throwable -> L494
        L67f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L494
            r1.<init>()     // Catch: java.lang.Throwable -> L494
            java.lang.String r3 = "video writeSampleData:"
            r1.append(r3)     // Catch: java.lang.Throwable -> L494
            long r2 = r12.presentationTimeUs     // Catch: java.lang.Throwable -> L494
            r1.append(r2)     // Catch: java.lang.Throwable -> L494
            java.lang.String r2 = " type:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L494
            int r2 = r12.flags     // Catch: java.lang.Throwable -> L494
            r1.append(r2)     // Catch: java.lang.Throwable -> L494
            r1.append(r13)     // Catch: java.lang.Throwable -> L494
            int r2 = r12.size     // Catch: java.lang.Throwable -> L494
            r1.append(r2)     // Catch: java.lang.Throwable -> L494
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L494
            r3 = 0
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L494
            com.hw.videoprocessor.util.c.v(r14, r1, r2)     // Catch: java.lang.Throwable -> L494
            r1 = r36
            r10.writeSampleData(r1, r4, r12)     // Catch: java.lang.Throwable -> L494
            r32.advance()     // Catch: java.lang.Throwable -> L494
            r36 = r1
            r2 = r23
            r1 = r32
            goto L5c7
        L6ba:
            r45.delete()
            r22.delete()
            r51.delete()
            r17.delete()
            r52.release()     // Catch: java.lang.Exception -> L6d6
            r32.release()     // Catch: java.lang.Exception -> L6d6
            r9.stop()     // Catch: java.lang.Exception -> L6d6
            r9.release()     // Catch: java.lang.Exception -> L6d6
            r10.release()     // Catch: java.lang.Exception -> L6d6
            goto L6da
        L6d6:
            r0 = move-exception
            com.hw.videoprocessor.util.c.g(r0)
        L6da:
            throw r1
    }

    public static void e(@androidx.annotation.NonNull android.content.Context r26, @androidx.annotation.NonNull com.hw.videoprocessor.h.c r27) throws java.lang.Exception {
            r0 = r27
            android.media.MediaMetadataRetriever r1 = new android.media.MediaMetadataRetriever
            r1.<init>()
            java.lang.String r2 = com.hw.videoprocessor.h.c.a(r0)
            r1.setDataSource(r2)
            r2 = 18
            java.lang.String r2 = r1.extractMetadata(r2)
            int r2 = java.lang.Integer.parseInt(r2)
            r3 = 19
            java.lang.String r3 = r1.extractMetadata(r3)
            int r3 = java.lang.Integer.parseInt(r3)
            r4 = 24
            java.lang.String r4 = r1.extractMetadata(r4)
            int r4 = java.lang.Integer.parseInt(r4)
            r5 = 20
            java.lang.String r5 = r1.extractMetadata(r5)
            int r5 = java.lang.Integer.parseInt(r5)
            r6 = 9
            java.lang.String r6 = r1.extractMetadata(r6)
            int r6 = java.lang.Integer.parseInt(r6)
            r1.release()
            java.lang.Integer r1 = com.hw.videoprocessor.h.c.b(r0)
            if (r1 != 0) goto L50
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            com.hw.videoprocessor.h.c.d(r0, r1)
        L50:
            java.lang.Integer r1 = com.hw.videoprocessor.h.c.g(r0)
            r5 = 1
            if (r1 != 0) goto L5e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            com.hw.videoprocessor.h.c.h(r0, r1)
        L5e:
            java.lang.Integer r1 = com.hw.videoprocessor.h.c.i(r0)
            if (r1 != 0) goto L65
            goto L6d
        L65:
            java.lang.Integer r1 = com.hw.videoprocessor.h.c.i(r0)
            int r2 = r1.intValue()
        L6d:
            java.lang.Integer r1 = com.hw.videoprocessor.h.c.j(r0)
            if (r1 != 0) goto L74
            goto L7c
        L74:
            java.lang.Integer r1 = com.hw.videoprocessor.h.c.j(r0)
            int r3 = r1.intValue()
        L7c:
            int r1 = r2 % 2
            if (r1 != 0) goto L81
            goto L83
        L81:
            int r2 = r2 + 1
        L83:
            int r1 = r3 % 2
            if (r1 != 0) goto L88
            goto L8a
        L88:
            int r3 = r3 + 1
        L8a:
            r1 = 90
            if (r4 == r1) goto L96
            r1 = 270(0x10e, float:3.78E-43)
            if (r4 != r1) goto L93
            goto L96
        L93:
            r11 = r2
            r12 = r3
            goto L98
        L96:
            r12 = r2
            r11 = r3
        L98:
            android.media.MediaExtractor r15 = new android.media.MediaExtractor
            r15.<init>()
            java.lang.String r1 = com.hw.videoprocessor.h.c.a(r0)
            r15.setDataSource(r1)
            r1 = 0
            int r2 = com.hw.videoprocessor.i.k(r15, r1)
            int r3 = com.hw.videoprocessor.i.k(r15, r5)
            android.media.MediaMuxer r9 = new android.media.MediaMuxer
            java.lang.String r4 = com.hw.videoprocessor.h.c.k(r0)
            r9.<init>(r4, r1)
            java.lang.Boolean r4 = com.hw.videoprocessor.h.c.l(r0)
            if (r4 != 0) goto Lbe
            r4 = 1
            goto Lc6
        Lbe:
            java.lang.Boolean r4 = com.hw.videoprocessor.h.c.l(r0)
            boolean r4 = r4.booleanValue()
        Lc6:
            java.lang.Integer r7 = com.hw.videoprocessor.h.c.m(r0)
            if (r3 < 0) goto L1d3
            android.media.MediaFormat r3 = r15.getTrackFormat(r3)
            int r10 = com.hw.videoprocessor.util.b.i(r3)
            java.lang.String r13 = "channel-count"
            int r13 = r3.getInteger(r13)
            java.lang.String r14 = "sample-rate"
            int r14 = r3.getInteger(r14)
            int r5 = com.hw.videoprocessor.util.b.j(r3)
            java.lang.String r1 = "audio/mp4a-latm"
            android.media.MediaFormat r1 = android.media.MediaFormat.createAudioFormat(r1, r14, r13)
            java.lang.String r8 = "bitrate"
            r1.setInteger(r8, r10)
            java.lang.String r8 = "aac-profile"
            r10 = 2
            r1.setInteger(r8, r10)
            java.lang.String r8 = "max-input-size"
            r1.setInteger(r8, r5)
            java.lang.String r5 = "durationUs"
            if (r4 == 0) goto L156
            java.lang.Integer r8 = com.hw.videoprocessor.h.c.n(r0)
            if (r8 != 0) goto L116
            java.lang.Integer r8 = com.hw.videoprocessor.h.c.m(r0)
            if (r8 != 0) goto L116
            java.lang.Float r8 = com.hw.videoprocessor.h.c.o(r0)
            if (r8 == 0) goto L111
            goto L116
        L111:
            r24 = r4
        L113:
            r8 = r6
            r10 = r7
            goto L174
        L116:
            long r17 = r3.getLong(r5)
            java.lang.Integer r3 = com.hw.videoprocessor.h.c.n(r0)
            if (r3 == 0) goto L13d
            java.lang.Integer r3 = com.hw.videoprocessor.h.c.m(r0)
            if (r3 == 0) goto L13d
            java.lang.Integer r3 = com.hw.videoprocessor.h.c.m(r0)
            int r3 = r3.intValue()
            java.lang.Integer r8 = com.hw.videoprocessor.h.c.n(r0)
            int r8 = r8.intValue()
            int r3 = r3 - r8
            int r3 = r3 * 1000
            r24 = r4
            long r3 = (long) r3
            goto L141
        L13d:
            r24 = r4
            r3 = r17
        L141:
            java.lang.Float r8 = com.hw.videoprocessor.h.c.o(r0)
            if (r8 == 0) goto L152
            float r3 = (float) r3
            java.lang.Float r4 = com.hw.videoprocessor.h.c.o(r0)
            float r4 = r4.floatValue()
            float r3 = r3 / r4
            long r3 = (long) r3
        L152:
            r1.setLong(r5, r3)
            goto L113
        L156:
            r24 = r4
            int r4 = r6 * 1000
            r8 = r6
            r10 = r7
            long r6 = (long) r4
            long r3 = r3.getLong(r5)
            java.lang.Integer r17 = com.hw.videoprocessor.h.c.n(r0)
            if (r17 != 0) goto L177
            java.lang.Integer r17 = com.hw.videoprocessor.h.c.m(r0)
            if (r17 != 0) goto L177
            java.lang.Float r17 = com.hw.videoprocessor.h.c.o(r0)
            if (r17 == 0) goto L174
            goto L177
        L174:
            r7 = r10
        L175:
            r3 = 2
            goto L1ca
        L177:
            java.lang.Integer r10 = com.hw.videoprocessor.h.c.n(r0)
            if (r10 == 0) goto L197
            java.lang.Integer r10 = com.hw.videoprocessor.h.c.m(r0)
            if (r10 == 0) goto L197
            java.lang.Integer r6 = com.hw.videoprocessor.h.c.m(r0)
            int r6 = r6.intValue()
            java.lang.Integer r7 = com.hw.videoprocessor.h.c.n(r0)
            int r7 = r7.intValue()
            int r6 = r6 - r7
            int r6 = r6 * 1000
            long r6 = (long) r6
        L197:
            java.lang.Float r10 = com.hw.videoprocessor.h.c.o(r0)
            if (r10 == 0) goto L1a8
            float r6 = (float) r6
            java.lang.Float r7 = com.hw.videoprocessor.h.c.o(r0)
            float r7 = r7.floatValue()
            float r6 = r6 / r7
            long r6 = (long) r6
        L1a8:
            int r10 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r10 >= 0) goto L1ad
            r3 = r6
        L1ad:
            r1.setLong(r5, r3)
            java.lang.Integer r5 = com.hw.videoprocessor.h.c.n(r0)
            if (r5 != 0) goto L1b8
            r5 = 0
            goto L1c0
        L1b8:
            java.lang.Integer r5 = com.hw.videoprocessor.h.c.n(r0)
            int r5 = r5.intValue()
        L1c0:
            r6 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r6
            int r4 = (int) r3
            int r5 = r5 + r4
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            goto L175
        L1ca:
            com.hw.videoprocessor.util.b.e(r1, r3, r14, r13)
            int r1 = r9.addTrack(r1)
            r4 = r7
            goto L1da
        L1d3:
            r24 = r4
            r8 = r6
            r10 = r7
            r3 = 2
            r4 = r10
            r1 = 0
        L1da:
            r15.selectTrack(r2)
            java.lang.Integer r5 = com.hw.videoprocessor.h.c.n(r0)
            if (r5 == 0) goto L1f3
            java.lang.Integer r5 = com.hw.videoprocessor.h.c.n(r0)
            int r5 = r5.intValue()
            int r5 = r5 * 1000
            long r5 = (long) r5
            r7 = 0
            r15.seekTo(r5, r7)
            goto L1f9
        L1f3:
            r7 = 0
            r5 = 0
            r15.seekTo(r5, r7)
        L1f9:
            com.hw.videoprocessor.util.j r5 = new com.hw.videoprocessor.util.j
            com.hw.videoprocessor.util.k r6 = com.hw.videoprocessor.h.c.c(r0)
            r5.<init>(r6)
            java.lang.Float r6 = com.hw.videoprocessor.h.c.o(r0)
            r5.d(r6)
            java.lang.Integer r6 = com.hw.videoprocessor.h.c.n(r0)
            if (r6 != 0) goto L211
            r6 = 0
            goto L219
        L211:
            java.lang.Integer r6 = com.hw.videoprocessor.h.c.n(r0)
            int r6 = r6.intValue()
        L219:
            r5.e(r6)
            java.lang.Integer r6 = com.hw.videoprocessor.h.c.m(r0)
            if (r6 != 0) goto L224
            r6 = r8
            goto L22c
        L224:
            java.lang.Integer r6 = com.hw.videoprocessor.h.c.m(r0)
            int r6 = r6.intValue()
        L22c:
            r5.c(r6)
            java.util.concurrent.atomic.AtomicBoolean r6 = new java.util.concurrent.atomic.AtomicBoolean
            r7 = 0
            r6.<init>(r7)
            java.util.concurrent.CountDownLatch r7 = new java.util.concurrent.CountDownLatch
            r8 = 1
            r7.<init>(r8)
            com.hw.videoprocessor.g r14 = new com.hw.videoprocessor.g
            java.lang.Integer r8 = com.hw.videoprocessor.h.c.b(r0)
            int r10 = r8.intValue()
            java.lang.Integer r8 = com.hw.videoprocessor.h.c.g(r0)
            int r13 = r8.intValue()
            java.lang.Integer r8 = com.hw.videoprocessor.h.c.e(r0)
            if (r8 != 0) goto L25e
            int r8 = com.hw.videoprocessor.h.c
        L255:
            r16 = r6
            r17 = r7
            r7 = r14
            r14 = r8
            r8 = r15
            r15 = r2
            goto L267
        L25e:
            java.lang.Integer r8 = com.hw.videoprocessor.h.c.e(r0)
            int r8 = r8.intValue()
            goto L255
        L267:
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r14 = r7
            r22 = r15
            r2 = r24
            r15 = r8
            r24 = r17
            java.lang.String r6 = com.hw.videoprocessor.h.c.a(r0)
            int r6 = com.hw.videoprocessor.i.e(r6)
            if (r6 > 0) goto L28a
            java.lang.String r6 = com.hw.videoprocessor.h.c.a(r0)
            float r6 = com.hw.videoprocessor.i.c(r6)
            double r6 = (double) r6
            double r6 = java.lang.Math.ceil(r6)
            int r6 = (int) r6
        L28a:
            com.hw.videoprocessor.e r13 = new com.hw.videoprocessor.e
            r23 = r16
            java.lang.Integer r16 = com.hw.videoprocessor.h.c.n(r0)
            java.lang.Integer r17 = com.hw.videoprocessor.h.c.m(r0)
            java.lang.Integer r18 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r6 = com.hw.videoprocessor.h.c.e(r0)
            if (r6 != 0) goto L2a3
            int r6 = com.hw.videoprocessor.h.c
            goto L2ab
        L2a3:
            java.lang.Integer r6 = com.hw.videoprocessor.h.c.e(r0)
            int r6 = r6.intValue()
        L2ab:
            java.lang.Integer r19 = java.lang.Integer.valueOf(r6)
            java.lang.Float r20 = com.hw.videoprocessor.h.c.o(r0)
            boolean r21 = com.hw.videoprocessor.h.c.f(r0)
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            com.hw.videoprocessor.a r16 = new com.hw.videoprocessor.a
            java.lang.String r18 = com.hw.videoprocessor.h.c.a(r0)
            java.lang.Integer r20 = com.hw.videoprocessor.h.c.n(r0)
            if (r2 == 0) goto L2d5
            java.lang.Float r0 = com.hw.videoprocessor.h.c.o(r0)
        L2ca:
            r17 = r26
            r22 = r0
            r23 = r1
            r21 = r4
            r19 = r9
            goto L2d7
        L2d5:
            r0 = 0
            goto L2ca
        L2d7:
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            r1 = r16
            r9 = r19
            r14.e(r5)
            r1.d(r5)
            r13.start()
            r14.start()
            r1.start()
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.InterruptedException -> L320
            r13.join()     // Catch: java.lang.InterruptedException -> L320
            r14.join()     // Catch: java.lang.InterruptedException -> L320
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.InterruptedException -> L320
            r1.join()     // Catch: java.lang.InterruptedException -> L320
            long r10 = java.lang.System.currentTimeMillis()     // Catch: java.lang.InterruptedException -> L320
            java.lang.String r0 = "编解码:%dms,音频:%dms"
            long r6 = r6 - r4
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch: java.lang.InterruptedException -> L320
            long r10 = r10 - r4
            java.lang.Long r4 = java.lang.Long.valueOf(r10)     // Catch: java.lang.InterruptedException -> L320
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.InterruptedException -> L320
            r7 = 0
            r3[r7] = r2     // Catch: java.lang.InterruptedException -> L320
            r25 = 1
            r3[r25] = r4     // Catch: java.lang.InterruptedException -> L320
            java.lang.String r0 = java.lang.String.format(r0, r3)     // Catch: java.lang.InterruptedException -> L320
            java.lang.Object[] r2 = new java.lang.Object[r7]     // Catch: java.lang.InterruptedException -> L320
            com.hw.videoprocessor.util.c.t(r0, r2)     // Catch: java.lang.InterruptedException -> L320
        L320:
            r9.release()     // Catch: java.lang.Exception -> L327
            r15.release()     // Catch: java.lang.Exception -> L327
            goto L32b
        L327:
            r0 = move-exception
            com.hw.videoprocessor.util.c.g(r0)
        L32b:
            java.lang.Exception r0 = r14.c()
            if (r0 != 0) goto L348
            java.lang.Exception r0 = r13.b()
            if (r0 != 0) goto L343
            java.lang.Exception r0 = r1.c()
            if (r0 != 0) goto L33e
            return
        L33e:
            java.lang.Exception r0 = r1.c()
            throw r0
        L343:
            java.lang.Exception r0 = r13.b()
            throw r0
        L348:
            java.lang.Exception r0 = r14.c()
            throw r0
    }

    public static com.hw.videoprocessor.h.c f(android.content.Context r1) {
            com.hw.videoprocessor.h$c r0 = new com.hw.videoprocessor.h$c
            r0.<init>(r1)
            return r0
    }

    public static void g(android.content.Context r16, java.lang.String r17, java.lang.String r18, boolean r19, @androidx.annotation.Nullable com.hw.videoprocessor.util.k r20) throws java.lang.Exception {
            r1 = r17
            r2 = r18
            r3 = r19
            r0 = r20
            java.io.File r4 = new java.io.File
            java.io.File r5 = r16.getCacheDir()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            long r7 = java.lang.System.currentTimeMillis()
            r6.append(r7)
            java.lang.String r7 = ".temp"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r4.<init>(r5, r6)
            java.io.File r5 = new java.io.File
            java.io.File r6 = r16.getCacheDir()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            long r8 = java.lang.System.currentTimeMillis()
            r7.append(r8)
            java.lang.String r8 = ".temp2"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r5.<init>(r6, r7)
            android.media.MediaExtractor r6 = new android.media.MediaExtractor     // Catch: java.lang.Throwable -> Ld1
            r6.<init>()     // Catch: java.lang.Throwable -> Ld1
            r6.setDataSource(r1)     // Catch: java.lang.Throwable -> Ld1
            r7 = 0
            int r8 = com.hw.videoprocessor.i.k(r6, r7)     // Catch: java.lang.Throwable -> Ld1
            r6.selectTrack(r8)     // Catch: java.lang.Throwable -> Ld1
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Ld1
            r8.<init>()     // Catch: java.lang.Throwable -> Ld1
            r9 = 0
            r10 = 0
        L5b:
            int r11 = r6.getSampleFlags()     // Catch: java.lang.Throwable -> Ld1
            if (r11 <= 0) goto L67
            r11 = r11 & 1
            if (r11 == 0) goto L67
            int r9 = r9 + 1
        L67:
            long r11 = r6.getSampleTime()     // Catch: java.lang.Throwable -> Ld1
            r13 = 0
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 >= 0) goto L144
            r6.release()     // Catch: java.lang.Throwable -> Ld1
            if (r10 == r9) goto L13a
            int r6 = r9 + 1
            if (r10 != r6) goto L7c
            goto L13a
        L7c:
            com.hw.videoprocessor.util.i r6 = new com.hw.videoprocessor.util.i     // Catch: java.lang.Throwable -> Ld1
            r8 = 3
            float[] r8 = new float[r8]     // Catch: java.lang.Throwable -> Ld1
            r8 = {x015a: FILL_ARRAY_DATA , data: [1055286886, 1036831949, 1055286886} // fill-array     // Catch: java.lang.Throwable -> Ld1
            r6.<init>(r8, r0)     // Catch: java.lang.Throwable -> Ld1
            r6.b(r7)     // Catch: java.lang.Throwable -> Ld1
            int r10 = r10 - r9
            float r0 = (float) r10     // Catch: java.lang.Throwable -> Ld1
            float r8 = (float) r9     // Catch: java.lang.Throwable -> Ld1
            float r0 = r0 / r8
            r9 = 1065353216(0x3f800000, float:1.0)
            float r9 = r9 + r0
            android.media.MediaMetadataRetriever r0 = new android.media.MediaMetadataRetriever     // Catch: java.lang.Throwable -> Ld1
            r0.<init>()     // Catch: java.lang.Throwable -> Ld1
            r0.setDataSource(r1)     // Catch: java.lang.Throwable -> Ld1
            r10 = 20
            java.lang.String r10 = r0.extractMetadata(r10)     // Catch: java.lang.Throwable -> Ld1
            int r10 = java.lang.Integer.parseInt(r10)     // Catch: java.lang.Throwable -> Ld1
            r11 = 9
            java.lang.String r0 = r0.extractMetadata(r11)     // Catch: java.lang.Throwable -> Ld1
            int r11 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> Ld1
            com.hw.videoprocessor.h$c r0 = f(r16)     // Catch: java.lang.Throwable -> Ld1 android.media.MediaCodec.CodecException -> Ld4
            com.hw.videoprocessor.h$c r0 = r0.v(r1)     // Catch: java.lang.Throwable -> Ld1 android.media.MediaCodec.CodecException -> Ld4
            java.lang.String r12 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> Ld1 android.media.MediaCodec.CodecException -> Ld4
            com.hw.videoprocessor.h$c r0 = r0.y(r12)     // Catch: java.lang.Throwable -> Ld1 android.media.MediaCodec.CodecException -> Ld4
            float r12 = (float) r10     // Catch: java.lang.Throwable -> Ld1 android.media.MediaCodec.CodecException -> Ld4
            float r12 = r12 * r9
            int r12 = (int) r12     // Catch: java.lang.Throwable -> Ld1 android.media.MediaCodec.CodecException -> Ld4
            com.hw.videoprocessor.h$c r0 = r0.p(r12)     // Catch: java.lang.Throwable -> Ld1 android.media.MediaCodec.CodecException -> Ld4
            com.hw.videoprocessor.h$c r0 = r0.u(r7)     // Catch: java.lang.Throwable -> Ld1 android.media.MediaCodec.CodecException -> Ld4
            com.hw.videoprocessor.h$c r0 = r0.A(r6)     // Catch: java.lang.Throwable -> Ld1 android.media.MediaCodec.CodecException -> Ld4
            r0.z()     // Catch: java.lang.Throwable -> Ld1 android.media.MediaCodec.CodecException -> Ld4
            goto Lfc
        Ld1:
            r0 = move-exception
            goto L152
        Ld4:
            r0 = move-exception
            com.hw.videoprocessor.util.c.g(r0)     // Catch: java.lang.Throwable -> Ld1
            com.hw.videoprocessor.h$c r0 = f(r16)     // Catch: java.lang.Throwable -> Ld1
            com.hw.videoprocessor.h$c r0 = r0.v(r1)     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r1 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> Ld1
            com.hw.videoprocessor.h$c r0 = r0.y(r1)     // Catch: java.lang.Throwable -> Ld1
            float r1 = (float) r10     // Catch: java.lang.Throwable -> Ld1
            float r1 = r1 * r9
            int r1 = (int) r1     // Catch: java.lang.Throwable -> Ld1
            com.hw.videoprocessor.h$c r0 = r0.p(r1)     // Catch: java.lang.Throwable -> Ld1
            r1 = -1
            com.hw.videoprocessor.h$c r0 = r0.u(r1)     // Catch: java.lang.Throwable -> Ld1
            com.hw.videoprocessor.h$c r0 = r0.A(r6)     // Catch: java.lang.Throwable -> Ld1
            r0.z()     // Catch: java.lang.Throwable -> Ld1
        Lfc:
            r0 = 1
            r6.b(r0)     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r1 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r7 = r5.getAbsolutePath()     // Catch: java.lang.Throwable -> Ld1
            r9 = 0
            i(r1, r7, r3, r9, r6)     // Catch: java.lang.Throwable -> Ld1
            float r1 = (float) r11     // Catch: java.lang.Throwable -> Ld1
            r3 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 / r3
            float r8 = r8 / r1
            int r1 = (int) r8     // Catch: java.lang.Throwable -> Ld1
            if (r1 != 0) goto L115
            goto L116
        L115:
            r0 = r1
        L116:
            r1 = 2
            r6.b(r1)     // Catch: java.lang.Throwable -> Ld1
            com.hw.videoprocessor.h$c r1 = f(r16)     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r3 = r5.getAbsolutePath()     // Catch: java.lang.Throwable -> Ld1
            com.hw.videoprocessor.h$c r1 = r1.v(r3)     // Catch: java.lang.Throwable -> Ld1
            com.hw.videoprocessor.h$c r1 = r1.y(r2)     // Catch: java.lang.Throwable -> Ld1
            com.hw.videoprocessor.h$c r1 = r1.p(r10)     // Catch: java.lang.Throwable -> Ld1
            com.hw.videoprocessor.h$c r0 = r1.u(r0)     // Catch: java.lang.Throwable -> Ld1
            com.hw.videoprocessor.h$c r0 = r0.A(r6)     // Catch: java.lang.Throwable -> Ld1
            r0.z()     // Catch: java.lang.Throwable -> Ld1
            goto L13d
        L13a:
            i(r1, r2, r3, r8, r0)     // Catch: java.lang.Throwable -> Ld1
        L13d:
            r4.delete()
            r5.delete()
            return
        L144:
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch: java.lang.Throwable -> Ld1
            r8.add(r11)     // Catch: java.lang.Throwable -> Ld1
            int r10 = r10 + 1
            r6.advance()     // Catch: java.lang.Throwable -> Ld1
            goto L5b
        L152:
            r4.delete()
            r5.delete()
            throw r0
    }

    public static void h(java.lang.String r1, java.lang.String r2, boolean r3) throws java.io.IOException {
            r0 = 0
            i(r1, r2, r3, r0, r0)
            return
    }

    public static void i(java.lang.String r30, java.lang.String r31, boolean r32, java.util.List<java.lang.Long> r33, @androidx.annotation.Nullable com.hw.videoprocessor.util.k r34) throws java.io.IOException {
            r0 = r30
            r2 = r34
            android.media.MediaMetadataRetriever r3 = new android.media.MediaMetadataRetriever
            r3.<init>()
            r3.setDataSource(r0)
            r4 = 9
            java.lang.String r4 = r3.extractMetadata(r4)
            int r4 = java.lang.Integer.parseInt(r4)
            r3.release()
            android.media.MediaExtractor r3 = new android.media.MediaExtractor
            r3.<init>()
            r3.setDataSource(r0)
            r0 = 0
            int r5 = com.hw.videoprocessor.i.k(r3, r0)
            r6 = 1
            int r7 = com.hw.videoprocessor.i.k(r3, r6)
            if (r7 < 0) goto L2f
            r8 = 1
            goto L30
        L2f:
            r8 = 0
        L30:
            android.media.MediaMuxer r9 = new android.media.MediaMuxer
            r10 = r31
            r9.<init>(r10, r0)
            r3.selectTrack(r5)
            android.media.MediaFormat r10 = r3.getTrackFormat(r5)
            java.lang.String r11 = "durationUs"
            long r12 = r10.getLong(r11)
            int r14 = r9.addTrack(r10)
            if (r8 == 0) goto L5d
            android.media.MediaFormat r15 = r3.getTrackFormat(r7)
            int r16 = r9.addTrack(r15)
            long r17 = r15.getLong(r11)
            r11 = r16
            r0 = r17
        L5a:
            r15 = 0
            goto L61
        L5d:
            r0 = 0
            r11 = 0
            goto L5a
        L61:
            r9.start()
            r17 = 1
            java.lang.String r6 = "max-input-size"
            int r6 = r10.getInteger(r6)
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.allocateDirect(r6)
            com.hw.videoprocessor.i.j(r3, r5, r4)
            android.media.MediaCodec$BufferInfo r4 = new android.media.MediaCodec$BufferInfo
            r4.<init>()
            r18 = 1060320051(0x3f333333, float:0.7)
            r19 = -1
            r21 = r15
            if (r33 == 0) goto Lf2
            int r16 = r33.size()     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
            if (r16 <= 0) goto Lf2
            int r16 = r33.size()     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
            int r16 = r16 + (-1)
            r15 = r16
            r23 = r19
            r31 = 1065353216(0x3f800000, float:1.0)
        L93:
            if (r15 < 0) goto Led
            r10 = r33
            java.lang.Object r25 = r10.get(r15)     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
            java.lang.Long r25 = (java.lang.Long) r25     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
            r26 = r0
            long r0 = r25.longValue()     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
            r25 = r8
            r8 = 2
            r3.seekTo(r0, r8)     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
            long r0 = r3.getSampleTime()     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
            int r8 = (r23 > r19 ? 1 : (r23 == r19 ? 0 : -1))
            if (r8 != 0) goto Lb3
            r23 = r0
        Lb3:
            long r0 = r23 - r0
            r4.presentationTimeUs = r0     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
            r0 = 0
            int r1 = r3.readSampleData(r6, r0)     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
            r4.size = r1     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
            int r0 = r3.getSampleFlags()     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
            r4.flags = r0     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
            int r0 = r4.size     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
            if (r0 >= 0) goto Lca
            goto L13a
        Lca:
            r9.writeSampleData(r14, r6, r4)     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
            if (r2 == 0) goto Le6
            long r0 = r4.presentationTimeUs     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
            float r0 = (float) r0     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
            float r1 = (float) r12     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
            float r0 = r0 / r1
            int r1 = (r0 > r31 ? 1 : (r0 == r31 ? 0 : -1))
            if (r1 <= 0) goto Lda
            r0 = 1065353216(0x3f800000, float:1.0)
        Lda:
            float r0 = r0 * r18
            r2.a(r0)     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
            goto Le6
        Le0:
            r0 = move-exception
            goto L205
        Le3:
            r0 = move-exception
            goto L201
        Le6:
            int r15 = r15 + (-1)
            r8 = r25
            r0 = r26
            goto L93
        Led:
            r26 = r0
            r25 = r8
            goto L13a
        Lf2:
            r26 = r0
            r25 = r8
            r31 = 1065353216(0x3f800000, float:1.0)
            r0 = r19
        Lfa:
            long r23 = r3.getSampleTime()     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
            int r8 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r8 != 0) goto L105
            r28 = r23
            goto L107
        L105:
            r28 = r0
        L107:
            long r0 = r28 - r23
            r4.presentationTimeUs = r0     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
            r0 = 0
            int r1 = r3.readSampleData(r6, r0)     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
            r4.size = r1     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
            int r0 = r3.getSampleFlags()     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
            r4.flags = r0     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
            int r0 = r4.size     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
            if (r0 >= 0) goto L11d
            goto L13a
        L11d:
            r9.writeSampleData(r14, r6, r4)     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
            if (r2 == 0) goto L132
            long r0 = r4.presentationTimeUs     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
            float r0 = (float) r0     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
            float r1 = (float) r12     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
            float r0 = r0 / r1
            int r1 = (r0 > r31 ? 1 : (r0 == r31 ? 0 : -1))
            if (r1 <= 0) goto L12d
            r0 = 1065353216(0x3f800000, float:1.0)
        L12d:
            float r0 = r0 * r18
            r2.a(r0)     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
        L132:
            r0 = 10000(0x2710, double:4.9407E-320)
            long r0 = r23 - r0
            int r8 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r8 > 0) goto L1f1
        L13a:
            if (r25 == 0) goto L1e3
            r3.unselectTrack(r5)     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
            r3.selectTrack(r7)     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
            r0 = 1050253722(0x3e99999a, float:0.3)
            if (r32 == 0) goto L1a3
            java.util.List r1 = com.hw.videoprocessor.i.f(r3)     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
            int r5 = r1.size()     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
            int r5 = r5 + (-1)
            r7 = r19
        L153:
            if (r5 < 0) goto L1e3
            java.lang.Object r10 = r1.get(r5)     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
            java.lang.Long r10 = (java.lang.Long) r10     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
            long r12 = r10.longValue()     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
            r10 = 2
            r3.seekTo(r12, r10)     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
            long r12 = r3.getSampleTime()     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
            int r10 = (r7 > r19 ? 1 : (r7 == r19 ? 0 : -1))
            if (r10 != 0) goto L16c
            r7 = r12
        L16c:
            long r12 = r7 - r12
            r4.presentationTimeUs = r12     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
            r10 = 0
            int r12 = r3.readSampleData(r6, r10)     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
            r4.size = r12     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
            int r10 = r3.getSampleFlags()     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
            r4.flags = r10     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
            int r10 = r4.size     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
            if (r10 >= 0) goto L182
            goto L1e3
        L182:
            r9.writeSampleData(r11, r6, r4)     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
            if (r2 == 0) goto L19c
            long r12 = r4.presentationTimeUs     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
            float r10 = (float) r12     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
            r12 = r26
            float r14 = (float) r12     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
            float r10 = r10 / r14
            int r14 = (r10 > r31 ? 1 : (r10 == r31 ? 0 : -1))
            if (r14 <= 0) goto L194
            r10 = 1065353216(0x3f800000, float:1.0)
        L194:
            float r10 = r10 * r0
            float r10 = r10 + r18
            r2.a(r10)     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
            goto L19e
        L19c:
            r12 = r26
        L19e:
            int r5 = r5 + (-1)
            r26 = r12
            goto L153
        L1a3:
            r14 = r21
            r12 = r26
            r8 = 2
            r3.seekTo(r14, r8)     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
        L1ab:
            long r7 = r3.getSampleTime()     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
            int r1 = (r7 > r19 ? 1 : (r7 == r19 ? 0 : -1))
            if (r1 != 0) goto L1b4
            goto L1e3
        L1b4:
            r4.presentationTimeUs = r7     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
            r10 = 0
            int r1 = r3.readSampleData(r6, r10)     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
            r4.size = r1     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
            int r1 = r3.getSampleFlags()     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
            r4.flags = r1     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
            int r1 = r4.size     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
            if (r1 >= 0) goto L1c8
            goto L1e3
        L1c8:
            r9.writeSampleData(r11, r6, r4)     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
            if (r2 == 0) goto L1df
            long r7 = r4.presentationTimeUs     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
            float r1 = (float) r7     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
            float r5 = (float) r12     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
            float r1 = r1 / r5
            int r5 = (r1 > r31 ? 1 : (r1 == r31 ? 0 : -1))
            if (r5 <= 0) goto L1d8
            r1 = 1065353216(0x3f800000, float:1.0)
        L1d8:
            float r1 = r1 * r0
            float r1 = r1 + r18
            r2.a(r1)     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
        L1df:
            r3.advance()     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
            goto L1ab
        L1e3:
            if (r2 == 0) goto L1ea
            r10 = 1065353216(0x3f800000, float:1.0)
            r2.a(r10)     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
        L1ea:
            r3.release()
            r9.release()
            return
        L1f1:
            r15 = r21
            r8 = 0
            r10 = 1065353216(0x3f800000, float:1.0)
            r3.seekTo(r0, r8)     // Catch: java.lang.Throwable -> Le0 java.lang.Exception -> Le3
            r21 = r15
            r0 = r28
            r31 = 1065353216(0x3f800000, float:1.0)
            goto Lfa
        L201:
            com.hw.videoprocessor.util.c.g(r0)     // Catch: java.lang.Throwable -> Le0
            goto L1ea
        L205:
            r3.release()
            r9.release()
            throw r0
    }

    public static void j(android.content.Context r0, java.lang.String r1, java.lang.String r2, int r3, int r4) throws java.lang.Exception {
            com.hw.videoprocessor.h$c r0 = f(r0)
            com.hw.videoprocessor.h$c r0 = r0.v(r1)
            com.hw.videoprocessor.h$c r0 = r0.y(r2)
            com.hw.videoprocessor.h$c r0 = r0.x(r3)
            com.hw.videoprocessor.h$c r0 = r0.w(r4)
            r0.z()
            return
    }
}
