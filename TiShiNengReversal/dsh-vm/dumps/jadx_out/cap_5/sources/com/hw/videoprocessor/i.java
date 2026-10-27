package com.hw.videoprocessor;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class i {
    public i() {
            r0 = this;
            r0.<init>()
            return
    }

    static long a(android.media.MediaExtractor r17, android.media.MediaMuxer r18, int r19, java.lang.Integer r20, java.lang.Integer r21, long r22, int r24, int r25, boolean r26, boolean r27) throws java.lang.Exception {
            r2 = r17
            r0 = 0
            int r8 = k(r2, r0)
            r2.selectTrack(r8)
            if (r20 != 0) goto L12
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r15 = r1
            goto L14
        L12:
            r15 = r20
        L14:
            int r1 = r15.intValue()
            long r3 = (long) r1
            r1 = 2
            r2.seekTo(r3, r1)
            android.media.MediaFormat r1 = r2.getTrackFormat(r8)
            java.lang.String r3 = "width"
            int r5 = r1.getInteger(r3)
            java.lang.String r3 = "height"
            int r6 = r1.getInteger(r3)
            java.util.concurrent.atomic.AtomicBoolean r9 = new java.util.concurrent.atomic.AtomicBoolean
            r9.<init>(r0)
            com.hw.videoprocessor.d r1 = new com.hw.videoprocessor.d
            r3 = r18
            r14 = r19
            r10 = r22
            r4 = r24
            r7 = r25
            r12 = r26
            r13 = r27
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13, r14)
            com.hw.videoprocessor.e r2 = new com.hw.videoprocessor.e
            int r0 = r15.intValue()
            int r0 = r0 / 1000
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            if (r21 != 0) goto L57
            r0 = 0
        L54:
            r5 = r0
            r10 = r8
            goto L62
        L57:
            int r0 = r21.intValue()
            int r0 = r0 / 1000
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L54
        L62:
            r8 = 0
            r11 = r9
            r9 = 0
            r6 = 0
            r7 = 0
            r3 = r2
            r2 = r1
            r1 = r3
            r3 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r16 = r2
            r2 = r1
            r1 = r16
            r2.start()
            r1.start()
            r2.join()     // Catch: java.lang.InterruptedException -> L80
            r1.join()     // Catch: java.lang.InterruptedException -> L80
        L80:
            r17.release()     // Catch: java.lang.Exception -> L84
            goto L88
        L84:
            r0 = move-exception
            com.hw.videoprocessor.util.c.g(r0)
        L88:
            java.lang.Exception r0 = r1.c()
            if (r0 != 0) goto L9e
            java.lang.Exception r0 = r2.b()
            if (r0 != 0) goto L99
            long r0 = r1.d()
            return r0
        L99:
            java.lang.Exception r0 = r2.b()
            throw r0
        L9e:
            java.lang.Exception r0 = r1.c()
            throw r0
    }

    public static void b(java.util.List<java.io.File> r29, java.lang.String r30, java.lang.Integer r31, java.lang.Integer r32) throws java.lang.Exception {
            r0 = r29
            if (r0 == 0) goto L1ed
            int r1 = r0.size()
            if (r1 != 0) goto Lc
            goto L1ed
        Lc:
            android.media.MediaMetadataRetriever r1 = new android.media.MediaMetadataRetriever
            r1.<init>()
            r2 = 0
            java.lang.Object r3 = r0.get(r2)
            java.io.File r3 = (java.io.File) r3
            java.lang.String r3 = r3.getAbsolutePath()
            r1.setDataSource(r3)
            if (r31 != 0) goto L2d
            r3 = 20
            java.lang.String r1 = r1.extractMetadata(r3)
            int r1 = java.lang.Integer.parseInt(r1)
        L2b:
            r10 = r1
            goto L32
        L2d:
            int r1 = r31.intValue()
            goto L2b
        L32:
            android.media.MediaExtractor r1 = new android.media.MediaExtractor
            r1.<init>()
            java.lang.Object r3 = r0.get(r2)
            java.io.File r3 = (java.io.File) r3
            java.lang.String r3 = r3.getAbsolutePath()
            r1.setDataSource(r3)
            int r3 = k(r1, r2)
            r14 = 1
            int r4 = k(r1, r14)
            android.media.MediaMuxer r5 = new android.media.MediaMuxer
            r6 = r30
            r5.<init>(r6, r2)
            android.media.MediaFormat r3 = r1.getTrackFormat(r3)
            int r3 = r5.addTrack(r3)
            if (r4 < 0) goto L61
            r23 = 1
            goto L63
        L61:
            r23 = 0
        L63:
            if (r23 == 0) goto L70
            android.media.MediaFormat r6 = r1.getTrackFormat(r4)
            int r6 = r5.addTrack(r6)
            r17 = r6
            goto L72
        L70:
            r17 = 0
        L72:
            r5.start()
            r6 = 0
            r20 = r6
            r8 = 0
        L7a:
            int r9 = r0.size()
            if (r8 >= r9) goto L1e9
            if (r8 <= 0) goto L98
            android.media.MediaExtractor r1 = new android.media.MediaExtractor
            r1.<init>()
            java.lang.Object r4 = r0.get(r8)
            java.io.File r4 = (java.io.File) r4
            java.lang.String r4 = r4.getAbsolutePath()
            r1.setDataSource(r4)
            int r4 = k(r1, r14)
        L98:
            r15 = r1
            r1 = r4
            if (r23 == 0) goto Lac
            r19 = 0
            r22 = 0
            r18 = 0
            r16 = r5
            long r6 = com.hw.videoprocessor.util.b.t(r15, r16, r17, r18, r19, r20, r22)
            r15.unselectTrack(r1)
            goto Lae
        Lac:
            r16 = r5
        Lae:
            int r11 = r32.intValue()
            if (r8 != 0) goto Lb6
            r12 = 1
            goto Lb7
        Lb6:
            r12 = 0
        Lb7:
            r13 = 0
            r4 = r6
            r6 = 0
            r7 = 0
            r27 = r4
            r5 = r3
            r3 = r15
            r14 = r27
            r2 = r8
            r4 = r16
            r8 = r20
            long r6 = a(r3, r4, r5, r6, r7, r8, r10, r11, r12, r13)
            int r4 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r4 <= 0) goto Ld0
            r8 = r6
            goto Ld1
        Ld0:
            r8 = r14
        Ld1:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r11 = "片段"
            r4.append(r11)
            r4.append(r2)
            java.lang.String r11 = "已合成,audioFrameTime:"
            r4.append(r11)
            float r12 = (float) r14
            r24 = 1148846080(0x447a0000, float:1000.0)
            float r12 = r12 / r24
            r4.append(r12)
            java.lang.String r12 = " videoFrameTime:"
            r4.append(r12)
            float r6 = (float) r6
            float r6 = r6 / r24
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r6 = 0
            java.lang.Object[] r7 = new java.lang.Object[r6]
            com.hw.videoprocessor.util.c.k(r4, r7)
            r25 = 33000(0x80e8, double:1.6304E-319)
            long r20 = r8 + r25
            r3.release()
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.Object r7 = r0.get(r2)
            java.io.File r7 = (java.io.File) r7
            java.lang.String r7 = r7.getAbsolutePath()
            r6.append(r7)
            java.lang.String r7 = ".rev"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.Object r7 = r0.get(r2)
            java.io.File r7 = (java.io.File) r7
            java.lang.String r7 = r7.getAbsolutePath()
            r8 = 1
            com.hw.videoprocessor.h.h(r7, r6, r8)
            long r7 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r13 = "reverseVideoNoDecode:"
            r9.append(r13)
            long r7 = r7 - r3
            r9.append(r7)
            java.lang.String r3 = "ms"
            r9.append(r3)
            java.lang.String r3 = r9.toString()
            r4 = 0
            java.lang.Object[] r7 = new java.lang.Object[r4]
            com.hw.videoprocessor.util.c.f(r3, r7)
            android.media.MediaExtractor r3 = new android.media.MediaExtractor
            r3.<init>()
            r3.setDataSource(r6)
            r4 = 1
            if (r23 == 0) goto L174
            int r1 = k(r3, r4)
            r19 = 0
            r22 = 0
            r18 = 0
            r15 = r3
            long r7 = com.hw.videoprocessor.util.b.t(r15, r16, r17, r18, r19, r20, r22)
            r3.unselectTrack(r1)
            r14 = r7
        L174:
            r7 = r11
            int r11 = r32.intValue()
            int r8 = r0.size()
            int r8 = r8 - r4
            if (r2 != r8) goto L183
            r13 = 1
        L181:
            r8 = r6
            goto L185
        L183:
            r13 = 0
            goto L181
        L185:
            r6 = 0
            r9 = r7
            r7 = 0
            r18 = r12
            r12 = 0
            r30 = r1
            r0 = r9
            r4 = r16
            r1 = r18
            r18 = 1
            r16 = r8
            r8 = r20
            long r6 = a(r3, r4, r5, r6, r7, r8, r10, r11, r12, r13)
            int r8 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r8 <= 0) goto L1a2
            r8 = r6
            goto L1a3
        L1a2:
            r8 = r14
        L1a3:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "反序片段"
            r11.append(r12)
            r11.append(r2)
            r11.append(r0)
            float r0 = (float) r14
            float r0 = r0 / r24
            r11.append(r0)
            r11.append(r1)
            float r0 = (float) r6
            float r0 = r0 / r24
            r11.append(r0)
            java.lang.String r0 = r11.toString()
            r6 = 0
            java.lang.Object[] r1 = new java.lang.Object[r6]
            com.hw.videoprocessor.util.c.k(r0, r1)
            long r20 = r8 + r25
            r3.release()
            java.io.File r0 = new java.io.File
            r8 = r16
            r0.<init>(r8)
            r0.delete()
            int r8 = r2 + 1
            r0 = r29
            r1 = r3
            r3 = r5
            r6 = r14
            r2 = 0
            r14 = 1
            r5 = r4
            r4 = r30
            goto L7a
        L1e9:
            r4 = r5
            r4.release()
        L1ed:
            return
    }

    public static float c(java.lang.String r8) throws java.io.IOException {
            android.media.MediaExtractor r0 = new android.media.MediaExtractor
            r0.<init>()
            r0.setDataSource(r8)
            r8 = 0
            int r1 = k(r0, r8)
            r0.selectTrack(r1)
            r1 = 0
            r3 = r1
        L13:
            long r5 = r0.getSampleTime()
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 >= 0) goto L26
            r0.release()
            float r8 = (float) r8
            float r0 = (float) r3
            r1 = 1148846080(0x447a0000, float:1000.0)
            float r0 = r0 / r1
            float r0 = r0 / r1
            float r8 = r8 / r0
            return r8
        L26:
            int r8 = r8 + 1
            r0.advance()
            r3 = r5
            goto L13
    }

    public static int d(java.lang.String r8) throws java.io.IOException {
            android.media.MediaExtractor r0 = new android.media.MediaExtractor
            r0.<init>()
            r0.setDataSource(r8)
            r1 = 0
            int r2 = k(r0, r1)
            r0.selectTrack(r2)
            r2 = 0
        L11:
            int r3 = r0.getSampleFlags()
            if (r3 <= 0) goto L1d
            r3 = r3 & 1
            if (r3 == 0) goto L1d
            int r1 = r1 + 1
        L1d:
            long r3 = r0.getSampleTime()
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L4f
            r0.release()
            int r0 = r2 - r1
            float r0 = (float) r0
            float r3 = (float) r1
            float r0 = r0 / r3
            r3 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 + r3
            android.media.MediaMetadataRetriever r3 = new android.media.MediaMetadataRetriever
            r3.<init>()
            r3.setDataSource(r8)
            r8 = 20
            java.lang.String r8 = r3.extractMetadata(r8)
            int r8 = java.lang.Integer.parseInt(r8)
            r3.release()
            if (r2 != r1) goto L4a
            return r8
        L4a:
            float r8 = (float) r8
            float r0 = r0 * r8
            int r8 = (int) r0
            return r8
        L4f:
            int r2 = r2 + 1
            r0.advance()
            goto L11
    }

    public static int e(java.lang.String r4) {
            java.lang.String r0 = "frame-rate"
            android.media.MediaExtractor r1 = new android.media.MediaExtractor
            r1.<init>()
            r2 = -1
            r1.setDataSource(r4)     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L21
            r4 = 0
            int r4 = k(r1, r4)     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L21
            android.media.MediaFormat r4 = r1.getTrackFormat(r4)     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L21
            boolean r3 = r4.containsKey(r0)     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L21
            if (r3 == 0) goto L23
            int r2 = r4.getInteger(r0)     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L21
            goto L23
        L1f:
            r4 = move-exception
            goto L2e
        L21:
            r4 = move-exception
            goto L27
        L23:
            r1.release()
            return r2
        L27:
            com.hw.videoprocessor.util.c.g(r4)     // Catch: java.lang.Throwable -> L1f
            r1.release()
            return r2
        L2e:
            r1.release()
            throw r4
    }

    static java.util.List<java.lang.Long> f(android.media.MediaExtractor r6) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            long r1 = r6.getSampleTime()
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L10
            return r0
        L10:
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.add(r1)
            r6.advance()
            goto L5
    }

    public static int g(android.media.MediaCodec r0, java.lang.String r1) {
            android.media.MediaCodecInfo r0 = r0.getCodecInfo()     // Catch: java.lang.Exception -> L1b
            android.media.MediaCodecInfo$CodecCapabilities r0 = r0.getCapabilitiesForType(r1)     // Catch: java.lang.Exception -> L1b
            android.media.MediaCodecInfo$VideoCapabilities r0 = r0.getVideoCapabilities()     // Catch: java.lang.Exception -> L1b
            android.util.Range r0 = r0.getBitrateRange()     // Catch: java.lang.Exception -> L1b
            java.lang.Comparable r0 = r0.getUpper()     // Catch: java.lang.Exception -> L1b
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Exception -> L1b
            int r0 = r0.intValue()     // Catch: java.lang.Exception -> L1b
            return r0
        L1b:
            r0 = move-exception
            com.hw.videoprocessor.util.c.g(r0)
            r0 = -1
            return r0
    }

    public static java.io.File h(android.content.Context r2) {
            java.io.File r0 = new java.io.File
            java.io.File r2 = r2.getCacheDir()
            java.lang.String r1 = "video/"
            r0.<init>(r2, r1)
            r0.mkdirs()
            return r0
    }

    public static android.util.Pair<java.lang.Integer, java.lang.Integer> i(java.lang.String r7) throws java.io.IOException {
            android.media.MediaExtractor r0 = new android.media.MediaExtractor
            r0.<init>()
            r0.setDataSource(r7)
            r7 = 0
            int r1 = k(r0, r7)
            r0.selectTrack(r1)
            r1 = 0
        L11:
            int r2 = r0.getSampleFlags()
            if (r2 <= 0) goto L1d
            r2 = r2 & 1
            if (r2 == 0) goto L1d
            int r7 = r7 + 1
        L1d:
            long r2 = r0.getSampleTime()
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L38
            r0.release()
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.<init>(r7, r1)
            return r0
        L38:
            int r1 = r1 + 1
            r0.advance()
            goto L11
    }

    public static void j(android.media.MediaExtractor r3, int r4, int r5) {
            int r5 = r5 * 1000
            int r0 = r3.getSampleTrackIndex()
            if (r0 == r4) goto Lb
            r3.selectTrack(r4)
        Lb:
            long r0 = (long) r5
            r2 = 0
            r3.seekTo(r0, r2)
        L10:
            if (r5 <= 0) goto L1f
            int r0 = r3.getSampleTrackIndex()
            if (r0 == r4) goto L1f
            int r5 = r5 + (-10000)
            long r0 = (long) r5
            r3.seekTo(r0, r2)
            goto L10
        L1f:
            return
    }

    public static int k(android.media.MediaExtractor r4, boolean r5) {
            int r0 = r4.getTrackCount()
            r1 = 0
        L5:
            if (r1 >= r0) goto L28
            android.media.MediaFormat r2 = r4.getTrackFormat(r1)
            java.lang.String r3 = "mime"
            java.lang.String r2 = r2.getString(r3)
            if (r5 == 0) goto L1c
            java.lang.String r3 = "audio/"
            boolean r2 = r2.startsWith(r3)
            if (r2 == 0) goto L25
            goto L24
        L1c:
            java.lang.String r3 = "video/"
            boolean r2 = r2.startsWith(r3)
            if (r2 == 0) goto L25
        L24:
            return r1
        L25:
            int r1 = r1 + 1
            goto L5
        L28:
            r4 = -5
            return r4
    }

    public static java.util.List<java.io.File> l(android.content.Context r6, java.lang.String r7, java.lang.String r8, int r9, int r10, java.lang.Integer r11, float r12, java.lang.Integer r13) throws java.lang.Exception {
            float r9 = (float) r9
            float r9 = r9 * r12
            int r9 = (int) r9
            android.media.MediaMetadataRetriever r0 = new android.media.MediaMetadataRetriever
            r0.<init>()
            r0.setDataSource(r7)
            r1 = 9
            java.lang.String r0 = r0.extractMetadata(r1)
            int r0 = java.lang.Integer.parseInt(r0)
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            r2 = 0
        L1c:
            if (r0 <= 0) goto L46
            int r0 = r0 - r9
            if (r0 >= r10) goto L34
            android.util.Pair r10 = new android.util.Pair
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            int r2 = r2 + r9
            int r2 = r2 + r0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
            r10.<init>(r3, r9)
            r1.add(r10)
            goto L46
        L34:
            android.util.Pair r3 = new android.util.Pair
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            int r2 = r2 + r9
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r3.<init>(r4, r5)
            r1.add(r3)
            goto L1c
        L46:
            java.util.ArrayList r9 = new java.util.ArrayList
            int r10 = r1.size()
            r9.<init>(r10)
            java.util.Iterator r10 = r1.iterator()
        L53:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto Lba
            java.lang.Object r0 = r10.next()
            android.util.Pair r0 = (android.util.Pair) r0
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Object r3 = r0.first
            r2.append(r3)
            java.lang.String r3 = ".mp4"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r8, r2)
            com.hw.videoprocessor.h$c r2 = com.hw.videoprocessor.h.f(r6)
            com.hw.videoprocessor.h$c r2 = r2.v(r7)
            java.lang.String r3 = r1.getAbsolutePath()
            com.hw.videoprocessor.h$c r2 = r2.y(r3)
            java.lang.Object r3 = r0.first
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            com.hw.videoprocessor.h$c r2 = r2.C(r3)
            java.lang.Object r0 = r0.second
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            com.hw.videoprocessor.h$c r0 = r2.s(r0)
            com.hw.videoprocessor.h$c r0 = r0.B(r12)
            int r2 = r11.intValue()
            com.hw.videoprocessor.h$c r0 = r0.p(r2)
            int r2 = r13.intValue()
            com.hw.videoprocessor.h$c r0 = r0.u(r2)
            r0.z()
            r9.add(r1)
            goto L53
        Lba:
            return r9
    }

    public static boolean m(android.media.MediaCodec r4, java.lang.String r5, android.media.MediaFormat r6, int r7, int r8) {
            android.media.MediaCodecInfo r4 = r4.getCodecInfo()
            android.media.MediaCodecInfo$CodecCapabilities r4 = r4.getCapabilitiesForType(r5)
            android.media.MediaCodecInfo$CodecProfileLevel[] r4 = r4.profileLevels
            r5 = 0
            if (r4 != 0) goto Le
            return r5
        Le:
            int r0 = r4.length
            r1 = 0
        L10:
            if (r1 >= r0) goto L2b
            r2 = r4[r1]
            int r3 = r2.profile
            if (r3 != r7) goto L28
            int r2 = r2.level
            if (r2 != r8) goto L28
            java.lang.String r4 = "profile"
            r6.setInteger(r4, r7)
            java.lang.String r4 = "level"
            r6.setInteger(r4, r8)
            r4 = 1
            return r4
        L28:
            int r1 = r1 + 1
            goto L10
        L2b:
            return r5
    }
}
