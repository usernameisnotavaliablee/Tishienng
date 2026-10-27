package com.hw.videoprocessor.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class b {
    private static final java.util.Map<java.lang.Integer, java.lang.Integer> a = null;
    static final java.lang.String b = "VideoProcessor";
    public static int c;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.hw.videoprocessor.util.b.a = r0
            r1 = 96000(0x17700, float:1.34525E-40)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            r1 = 88200(0x15888, float:1.23595E-40)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r3)
            r1 = 64000(0xfa00, float:8.9683E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3 = 2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.put(r1, r3)
            r1 = 48000(0xbb80, float:6.7262E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3 = 3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.put(r1, r3)
            r1 = 44100(0xac44, float:6.1797E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3 = 4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.put(r1, r3)
            r1 = 32000(0x7d00, float:4.4842E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3 = 5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.put(r1, r3)
            r1 = 24000(0x5dc0, float:3.3631E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3 = 6
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.put(r1, r3)
            r1 = 22050(0x5622, float:3.0899E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3 = 7
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.put(r1, r3)
            r1 = 16000(0x3e80, float:2.2421E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3 = 8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.put(r1, r3)
            r1 = 12000(0x2ee0, float:1.6816E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3 = 9
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.put(r1, r3)
            r1 = 11025(0x2b11, float:1.545E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3 = 10
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.put(r1, r3)
            r1 = 8000(0x1f40, float:1.121E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3 = 11
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.put(r1, r3)
            r1 = 7350(0x1cb6, float:1.03E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3 = 12
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.put(r1, r3)
            com.hw.videoprocessor.util.b.c = r2
            return
    }

    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void a(android.content.Context r6, java.lang.String r7, java.lang.String r8, @androidx.annotation.IntRange(from = 0, to = 100) int r9, @androidx.annotation.Nullable com.hw.videoprocessor.util.k r10) throws java.io.IOException {
            java.io.File r0 = new java.io.File
            r0.<init>(r7)
            java.lang.String r0 = r0.getName()
            java.io.File r1 = new java.io.File
            java.io.File r2 = com.hw.videoprocessor.i.h(r6)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r4 = ".pcm"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.<init>(r2, r3)
            java.io.File r2 = new java.io.File
            java.io.File r3 = com.hw.videoprocessor.i.h(r6)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r5 = "_2.pcm"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r2.<init>(r3, r4)
            java.io.File r3 = new java.io.File
            java.io.File r6 = com.hw.videoprocessor.i.h(r6)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r0 = ".wav"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3.<init>(r6, r0)
            java.lang.String r6 = r1.getAbsolutePath()
            r0 = 0
            g(r7, r6, r0, r0)
            java.lang.String r6 = r1.getAbsolutePath()
            java.lang.String r0 = r2.getAbsolutePath()
            b(r6, r0, r9)
            android.media.MediaExtractor r6 = new android.media.MediaExtractor
            r6.<init>()
            r6.setDataSource(r7)
            r7 = 1
            int r7 = com.hw.videoprocessor.i.k(r6, r7)
            android.media.MediaFormat r6 = r6.getTrackFormat(r7)
            java.lang.String r7 = "sample-rate"
            int r7 = r6.getInteger(r7)
            java.lang.String r9 = "channel-count"
            int r9 = r6.getInteger(r9)
            r0 = 2
            if (r9 != r0) goto L8d
            r1 = 12
            goto L8f
        L8d:
            r1 = 16
        L8f:
            com.hw.videoprocessor.util.g r4 = new com.hw.videoprocessor.util.g
            r4.<init>(r7, r1, r9, r0)
            java.lang.String r7 = r2.getAbsolutePath()
            java.lang.String r9 = r3.getAbsolutePath()
            r4.a(r7, r9)
            java.lang.String r7 = r3.getPath()
            h(r7, r8, r6, r10)
            return
    }

    public static void b(java.lang.String r6, java.lang.String r7, @androidx.annotation.IntRange(from = 0, to = 100) int r8) throws java.io.IOException {
            r0 = 100
            if (r8 != r0) goto L8
            f(r6, r7)
            return
        L8:
            float r8 = m(r8)
            r0 = 2048(0x800, float:2.87E-42)
            byte[] r1 = new byte[r0]
            java.io.FileInputStream r2 = new java.io.FileInputStream
            r2.<init>(r6)
            java.io.FileOutputStream r6 = new java.io.FileOutputStream
            r6.<init>(r7)
        L1a:
            int r7 = r2.read(r1)     // Catch: java.lang.Throwable -> L52
            r3 = -1
            if (r7 == r3) goto L58
            r7 = 0
        L22:
            if (r7 >= r0) goto L54
            r3 = r1[r7]     // Catch: java.lang.Throwable -> L52
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r4 = r7 + 1
            r5 = r1[r4]     // Catch: java.lang.Throwable -> L52
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 8
            r3 = r3 | r5
            short r3 = (short) r3     // Catch: java.lang.Throwable -> L52
            float r3 = (float) r3     // Catch: java.lang.Throwable -> L52
            float r3 = r3 * r8
            int r3 = (int) r3     // Catch: java.lang.Throwable -> L52
            r5 = 32767(0x7fff, float:4.5916E-41)
            if (r3 <= r5) goto L3d
            r3 = 32767(0x7fff, float:4.5916E-41)
            goto L43
        L3d:
            r5 = -32768(0xffffffffffff8000, float:NaN)
            if (r3 >= r5) goto L43
            r3 = -32768(0xffffffffffff8000, float:NaN)
        L43:
            r5 = r3 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L52
            r1[r7] = r5     // Catch: java.lang.Throwable -> L52
            int r3 = r3 >>> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L52
            r1[r4] = r3     // Catch: java.lang.Throwable -> L52
            int r7 = r7 + 2
            goto L22
        L52:
            r7 = move-exception
            goto L5f
        L54:
            r6.write(r1)     // Catch: java.lang.Throwable -> L52
            goto L1a
        L58:
            r2.close()
            r6.close()
            return
        L5f:
            r2.close()
            r6.close()
            throw r7
    }

    public static android.util.Pair<java.lang.Integer, java.lang.Integer> c(java.lang.String r8, java.lang.String r9, android.media.MediaFormat r10, android.media.MediaFormat r11) {
            java.lang.String r0 = "channel-count"
            boolean r1 = r10.containsKey(r0)
            r2 = 1
            if (r1 == 0) goto Le
            int r1 = r10.getInteger(r0)
            goto Lf
        Le:
            r1 = 1
        Lf:
            boolean r3 = r11.containsKey(r0)
            if (r3 == 0) goto L1a
            int r0 = r11.getInteger(r0)
            goto L1b
        L1a:
            r0 = 1
        L1b:
            java.lang.String r3 = "sample-rate"
            boolean r4 = r10.containsKey(r3)
            r5 = 44100(0xac44, float:6.1797E-41)
            if (r4 == 0) goto L2b
            int r10 = r10.getInteger(r3)
            goto L2e
        L2b:
            r10 = 44100(0xac44, float:6.1797E-41)
        L2e:
            boolean r4 = r11.containsKey(r3)
            if (r4 == 0) goto L38
            int r5 = r11.getInteger(r3)
        L38:
            r11 = 2
            if (r1 != r0) goto L4d
            if (r10 != r5) goto L4d
            if (r1 > r11) goto L4d
            android.util.Pair r8 = new android.util.Pair
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r8.<init>(r9, r10)
            return r8
        L4d:
            java.io.File r3 = new java.io.File
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r8)
            java.lang.String r6 = ".temp"
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            java.io.File r4 = new java.io.File
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r9)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r4.<init>(r6)
            if (r1 != r0) goto L80
            if (r1 > r11) goto L80
            if (r0 <= r11) goto L7e
            goto L80
        L7e:
            r2 = r1
            goto Lb2
        L80:
            if (r1 <= r2) goto L9b
            java.lang.String r11 = r3.getAbsolutePath()     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L99
            s(r8, r11, r1)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L99
            java.io.File r11 = new java.io.File     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L99
            r11.<init>(r8)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L99
            r11.delete()     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L99
            r3.renameTo(r11)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L99
            r11 = 1
            goto L9c
        L96:
            r8 = move-exception
            goto L114
        L99:
            r8 = move-exception
            goto Lfd
        L9b:
            r11 = r1
        L9c:
            if (r0 <= r2) goto Lb1
            java.lang.String r6 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L99
            s(r9, r6, r0)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L99
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L99
            r0.<init>(r9)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L99
            r0.delete()     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L99
            r4.renameTo(r0)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L99
            r0 = 1
        Lb1:
            r1 = r11
        Lb2:
            if (r10 == r5) goto Le9
            int r11 = java.lang.Math.min(r10, r5)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> Le7
            if (r10 == r11) goto Ld1
            java.lang.String r6 = r3.getAbsolutePath()     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> Lcd
            n(r8, r6, r10, r11, r1)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> Lcd
            java.io.File r10 = new java.io.File     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> Lcd
            r10.<init>(r8)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> Lcd
            r10.delete()     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> Lcd
            r3.renameTo(r10)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> Lcd
            goto Ld1
        Lcd:
            r8 = move-exception
            r10 = r11
        Lcf:
            r1 = r2
            goto Lfd
        Ld1:
            if (r5 == r11) goto Le5
            java.lang.String r8 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> Lcd
            n(r9, r8, r5, r11, r0)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> Lcd
            java.io.File r8 = new java.io.File     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> Lcd
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> Lcd
            r8.delete()     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> Lcd
            r4.renameTo(r8)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> Lcd
        Le5:
            r10 = r11
            goto Le9
        Le7:
            r8 = move-exception
            goto Lcf
        Le9:
            android.util.Pair r8 = new android.util.Pair     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> Le7
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> Le7
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> Le7
            r8.<init>(r9, r11)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> Le7
            r3.delete()
            r4.exists()
            return r8
        Lfd:
            com.hw.videoprocessor.util.c.g(r8)     // Catch: java.lang.Throwable -> L96
            android.util.Pair r8 = new android.util.Pair     // Catch: java.lang.Throwable -> L96
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L96
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L96
            r8.<init>(r9, r10)     // Catch: java.lang.Throwable -> L96
            r3.delete()
            r4.exists()
            return r8
        L114:
            r3.delete()
            r4.exists()
            throw r8
    }

    public static java.io.File d(java.io.File r10, int r11, int r12) {
            if (r11 < r12) goto L3
            return r10
        L3:
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r10.getAbsolutePath()
            r1.append(r2)
            java.lang.String r2 = ".concat"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            float r12 = (float) r12
            float r11 = (float) r11
            float r12 = r12 / r11
            int r11 = (int) r12
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L93 java.lang.Exception -> L99
            r2.<init>(r10)     // Catch: java.lang.Throwable -> L93 java.lang.Exception -> L99
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L90
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L90
            java.nio.channels.FileChannel r4 = r2.getChannel()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L88
            java.nio.channels.FileChannel r9 = r3.getChannel()     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L81
            r1 = 0
        L35:
            if (r1 >= r11) goto L50
            long r7 = r4.size()     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4d
            r5 = 0
            r4.transferTo(r5, r7, r9)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4d
            r5 = 0
            r4.position(r5)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4d
            int r1 = r1 + 1
            goto L35
        L48:
            r0 = move-exception
            r10 = r0
        L4a:
            r1 = r2
            goto Lb6
        L4d:
            r1 = r2
            goto L9c
        L50:
            float r11 = (float) r11     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4d
            float r12 = r12 - r11
            long r5 = r10.length()     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4d
            float r11 = (float) r5     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4d
            float r11 = r11 * r12
            int r11 = (int) r11     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4d
            r12 = 1024(0x400, float:1.435E-42)
            if (r11 <= r12) goto L64
            r5 = 0
            long r7 = (long) r11     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4d
            r4.transferTo(r5, r7, r9)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4d
        L64:
            r4.close()     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4d
            r9.close()     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4d
            r10.delete()     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4d
            r0.renameTo(r10)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4d
            r2.close()     // Catch: java.io.IOException -> Lb3
            r3.close()     // Catch: java.io.IOException -> Lb3
            r4.close()     // Catch: java.io.IOException -> Lb3
            r9.close()     // Catch: java.io.IOException -> Lb3
            return r10
        L7d:
            r0 = move-exception
            r10 = r0
            r9 = r1
            goto L4a
        L81:
            r9 = r1
            goto L4d
        L83:
            r0 = move-exception
            r10 = r0
            r4 = r1
        L86:
            r9 = r4
            goto L4a
        L88:
            r4 = r1
        L89:
            r9 = r4
            goto L4d
        L8b:
            r0 = move-exception
            r10 = r0
            r3 = r1
            r4 = r3
            goto L86
        L90:
            r3 = r1
            r4 = r3
            goto L89
        L93:
            r0 = move-exception
            r10 = r0
            r3 = r1
            r4 = r3
            r9 = r4
            goto Lb6
        L99:
            r3 = r1
            r4 = r3
            r9 = r4
        L9c:
            r0.delete()     // Catch: java.lang.Throwable -> Lb4
            if (r1 == 0) goto La4
            r1.close()     // Catch: java.io.IOException -> Lb3
        La4:
            if (r3 == 0) goto La9
            r3.close()     // Catch: java.io.IOException -> Lb3
        La9:
            if (r4 == 0) goto Lae
            r4.close()     // Catch: java.io.IOException -> Lb3
        Lae:
            if (r9 == 0) goto Lb3
            r9.close()     // Catch: java.io.IOException -> Lb3
        Lb3:
            return r10
        Lb4:
            r0 = move-exception
            r10 = r0
        Lb6:
            if (r1 == 0) goto Lbb
            r1.close()     // Catch: java.io.IOException -> Lca
        Lbb:
            if (r3 == 0) goto Lc0
            r3.close()     // Catch: java.io.IOException -> Lca
        Lc0:
            if (r4 == 0) goto Lc5
            r4.close()     // Catch: java.io.IOException -> Lca
        Lc5:
            if (r9 == 0) goto Lca
            r9.close()     // Catch: java.io.IOException -> Lca
        Lca:
            throw r10
    }

    public static void e(android.media.MediaFormat r2, int r3, int r4, int r5) {
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = com.hw.videoprocessor.util.b.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            boolean r1 = r0.containsKey(r1)
            if (r1 == 0) goto L1b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r0.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            goto L1c
        L1b:
            r4 = 4
        L1c:
            r0 = 2
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            int r3 = r3 << 3
            int r1 = r4 >> 1
            r3 = r3 | r1
            byte r3 = (byte) r3
            r1 = 0
            r0.put(r1, r3)
            r3 = 1
            r4 = r4 & r3
            int r4 = r4 << 7
            int r5 = r5 << 3
            r4 = r4 | r5
            byte r4 = (byte) r4
            r0.put(r3, r4)
            java.lang.String r3 = "csd-0"
            r2.setByteBuffer(r3, r0)
            return
    }

    public static void f(java.lang.String r7, java.lang.String r8) throws java.io.IOException {
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r8)
            java.nio.channels.FileChannel r6 = r0.getChannel()
            java.io.FileInputStream r8 = new java.io.FileInputStream
            r8.<init>(r7)
            java.nio.channels.FileChannel r1 = r8.getChannel()
            r2 = 0
            long r4 = r1.size()
            r1.transferTo(r2, r4, r6)
            return
    }

    public static void g(java.lang.String r22, java.lang.String r23, java.lang.Integer r24, java.lang.Integer r25) throws java.io.IOException {
            android.media.MediaExtractor r1 = new android.media.MediaExtractor
            r1.<init>()
            r0 = r22
            r1.setDataSource(r0)
            r0 = 1
            int r2 = com.hw.videoprocessor.i.k(r1, r0)
            r1.selectTrack(r2)
            r3 = 0
            if (r24 != 0) goto L1a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            goto L1c
        L1a:
            r4 = r24
        L1c:
            int r5 = r4.intValue()
            long r5 = (long) r5
            r7 = 2
            r1.seekTo(r5, r7)
            android.media.MediaFormat r2 = r1.getTrackFormat(r2)
            java.lang.String r5 = "max-input-size"
            boolean r6 = r2.containsKey(r5)
            if (r6 == 0) goto L36
            int r5 = r2.getInteger(r5)
            goto L39
        L36:
            r5 = 100000(0x186a0, float:1.4013E-40)
        L39:
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocateDirect(r5)
            android.media.MediaCodec$BufferInfo r6 = new android.media.MediaCodec$BufferInfo
            r6.<init>()
            java.lang.String r7 = "mime"
            java.lang.String r7 = r2.getString(r7)
            android.media.MediaCodec r8 = android.media.MediaCodec.createDecoderByType(r7)
            r7 = 0
            r8.configure(r2, r7, r7, r3)
            r8.start()
            java.io.File r2 = new java.io.File
            r7 = r23
            r2.<init>(r7)
            java.io.FileOutputStream r7 = new java.io.FileOutputStream
            r7.<init>(r2)
            java.nio.channels.FileChannel r2 = r7.getChannel()
            r7 = 0
            r15 = 0
        L65:
            if (r7 != 0) goto L191
            r16 = 1000(0x3e8, double:4.94E-321)
            r9 = 2500(0x9c4, double:1.235E-320)
            java.lang.String r11 = "VideoProcessor"
            if (r15 != 0) goto L10b
            r12 = r9
            int r9 = r8.dequeueInputBuffer(r12)     // Catch: java.lang.Throwable -> L100
            if (r9 < 0) goto L105
            long r12 = r1.getSampleTime()     // Catch: java.lang.Throwable -> L100
            r18 = -1
            int r10 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r10 != 0) goto L83
            r18 = r1
            goto La3
        L83:
            int r10 = r4.intValue()     // Catch: java.lang.Throwable -> L100
            r18 = r1
            long r0 = (long) r10
            int r10 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r10 >= 0) goto L98
            r18.advance()     // Catch: java.lang.Throwable -> L95
        L91:
            r1 = r18
            r0 = 1
            goto L65
        L95:
            r0 = move-exception
            goto L184
        L98:
            if (r25 == 0) goto Lb3
            int r0 = r25.intValue()     // Catch: java.lang.Throwable -> L95
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L95
            int r10 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r10 <= 0) goto Lb3
        La3:
            r12 = 0
            r14 = 4
            r10 = 0
            r0 = r11
            r11 = 0
            r15 = r0
            r0 = 2500(0x9c4, double:1.235E-320)
            r8.queueInputBuffer(r9, r10, r11, r12, r14)     // Catch: java.lang.Throwable -> L95
            r21 = r15
            r15 = 1
            goto L110
        Lb3:
            r10 = r11
            r0 = 2500(0x9c4, double:1.235E-320)
            r11 = r18
            int r14 = r11.readSampleData(r5, r3)     // Catch: java.lang.Throwable -> Lfb
            r6.size = r14     // Catch: java.lang.Throwable -> Lfb
            r6.presentationTimeUs = r12     // Catch: java.lang.Throwable -> Lfb
            int r12 = r11.getSampleFlags()     // Catch: java.lang.Throwable -> Lfb
            r6.flags = r12     // Catch: java.lang.Throwable -> Lfb
            java.nio.ByteBuffer r12 = r8.getInputBuffer(r9)     // Catch: java.lang.Throwable -> Lfb
            r12.put(r5)     // Catch: java.lang.Throwable -> Lfb
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lfb
            r12.<init>()     // Catch: java.lang.Throwable -> Lfb
            java.lang.String r13 = "audio decode queueInputBuffer "
            r12.append(r13)     // Catch: java.lang.Throwable -> Lfb
            long r13 = r6.presentationTimeUs     // Catch: java.lang.Throwable -> Lfb
            long r13 = r13 / r16
            r12.append(r13)     // Catch: java.lang.Throwable -> Lfb
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> Lfb
            java.lang.Object[] r13 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> Lfb
            com.hw.videoprocessor.util.c.n(r10, r12, r13)     // Catch: java.lang.Throwable -> Lfb
            r18 = r11
            int r11 = r6.size     // Catch: java.lang.Throwable -> L95
            long r12 = r6.presentationTimeUs     // Catch: java.lang.Throwable -> L95
            int r14 = r6.flags     // Catch: java.lang.Throwable -> L95
            r20 = r10
            r10 = 0
            r21 = r20
            r8.queueInputBuffer(r9, r10, r11, r12, r14)     // Catch: java.lang.Throwable -> L95
            r18.advance()     // Catch: java.lang.Throwable -> L95
            goto L110
        Lfb:
            r0 = move-exception
            r18 = r11
            goto L184
        L100:
            r0 = move-exception
            r18 = r1
            goto L184
        L105:
            r18 = r1
            r21 = r11
            r0 = r12
            goto L110
        L10b:
            r18 = r1
            r0 = r9
            goto L181
        L110:
            if (r7 != 0) goto L91
            int r9 = r8.dequeueOutputBuffer(r6, r0)     // Catch: java.lang.Throwable -> L95
            r10 = -1
            if (r9 != r10) goto L11b
            goto L91
        L11b:
            r10 = -2
            if (r9 != r10) goto L13b
            android.media.MediaFormat r9 = r8.getOutputFormat()     // Catch: java.lang.Throwable -> L95
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L95
            r10.<init>()     // Catch: java.lang.Throwable -> L95
            java.lang.String r11 = "audio decode newFormat = "
            r10.append(r11)     // Catch: java.lang.Throwable -> L95
            r10.append(r9)     // Catch: java.lang.Throwable -> L95
            java.lang.String r9 = r10.toString()     // Catch: java.lang.Throwable -> L95
            java.lang.Object[] r10 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L95
            r11 = r21
            com.hw.videoprocessor.util.c.n(r11, r9, r10)     // Catch: java.lang.Throwable -> L95
            goto L181
        L13b:
            r11 = r21
            if (r9 >= 0) goto L156
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L95
            r10.<init>()     // Catch: java.lang.Throwable -> L95
            java.lang.String r12 = "unexpected result from audio decoder.dequeueOutputBuffer: "
            r10.append(r12)     // Catch: java.lang.Throwable -> L95
            r10.append(r9)     // Catch: java.lang.Throwable -> L95
            java.lang.String r9 = r10.toString()     // Catch: java.lang.Throwable -> L95
            java.lang.Object[] r10 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L95
            com.hw.videoprocessor.util.c.h(r11, r9, r10)     // Catch: java.lang.Throwable -> L95
            goto L181
        L156:
            int r10 = r6.flags     // Catch: java.lang.Throwable -> L95
            r12 = 4
            if (r10 != r12) goto L15d
            r7 = 1
            goto L17e
        L15d:
            java.nio.ByteBuffer r10 = r8.getOutputBuffer(r9)     // Catch: java.lang.Throwable -> L95
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L95
            r12.<init>()     // Catch: java.lang.Throwable -> L95
            java.lang.String r13 = "audio decode saveFrame "
            r12.append(r13)     // Catch: java.lang.Throwable -> L95
            long r13 = r6.presentationTimeUs     // Catch: java.lang.Throwable -> L95
            long r13 = r13 / r16
            r12.append(r13)     // Catch: java.lang.Throwable -> L95
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L95
            java.lang.Object[] r13 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L95
            com.hw.videoprocessor.util.c.n(r11, r12, r13)     // Catch: java.lang.Throwable -> L95
            r2.write(r10)     // Catch: java.lang.Throwable -> L95
        L17e:
            r8.releaseOutputBuffer(r9, r3)     // Catch: java.lang.Throwable -> L95
        L181:
            r21 = r11
            goto L110
        L184:
            r2.close()
            r18.release()
            r8.stop()
            r8.release()
            throw r0
        L191:
            r18 = r1
            r2.close()
            r18.release()
            r8.stop()
            r8.release()
            return
    }

    public static void h(java.lang.String r31, java.lang.String r32, android.media.MediaFormat r33, @androidx.annotation.Nullable com.hw.videoprocessor.util.k r34) throws java.io.IOException {
            r0 = r33
            r1 = r34
            java.lang.String r2 = "sample-rate"
            int r2 = r0.getInteger(r2)
            java.lang.String r3 = "channel-count"
            int r3 = r0.getInteger(r3)
            int r4 = i(r0)
            int r5 = j(r0)
            java.lang.String r6 = "audio/mp4a-latm"
            android.media.MediaCodec r7 = android.media.MediaCodec.createEncoderByType(r6)
            android.media.MediaFormat r3 = android.media.MediaFormat.createAudioFormat(r6, r2, r3)
            java.lang.String r6 = "bitrate"
            r3.setInteger(r6, r4)
            java.lang.String r4 = "aac-profile"
            r6 = 2
            r3.setInteger(r4, r6)
            java.lang.String r4 = "max-input-size"
            r3.setInteger(r4, r5)
            r4 = 0
            r5 = 1
            r7.configure(r3, r4, r4, r5)
            r7.start()
            android.media.MediaExtractor r3 = new android.media.MediaExtractor
            r3.<init>()
            r4 = r31
            r3.setDataSource(r4)
            int r4 = com.hw.videoprocessor.i.k(r3, r5)
            r3.selectTrack(r4)
            android.media.MediaFormat r4 = r3.getTrackFormat(r4)
            android.media.MediaCodec$BufferInfo r14 = new android.media.MediaCodec$BufferInfo
            r14.<init>()
            int r8 = j(r4)
            java.nio.ByteBuffer r15 = java.nio.ByteBuffer.allocateDirect(r8)
            java.lang.String r8 = "durationUs"
            long r8 = r4.getLong(r8)
            r4 = 1024000000(0x3d090000, float:0.033447266)
            int r4 = r4 / r2
            android.media.MediaMuxer r2 = new android.media.MediaMuxer
            r10 = 0
            r11 = r32
            r2.<init>(r11, r10)
            int r0 = r2.addTrack(r0)
            r2.start()
            r16 = -1
            r21 = r16
            r18 = 0
            r19 = 0
            r20 = 0
        L7e:
            if (r18 != 0) goto L246
            r11 = 2500(0x9c4, double:1.235E-320)
            r23 = r8
            int r8 = r7.dequeueInputBuffer(r11)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r9 = " size:"
            if (r19 != 0) goto L106
            if (r8 < 0) goto L106
            r25 = r11
            long r11 = r3.getSampleTime()     // Catch: java.lang.Throwable -> Lb2
            r27 = 0
            int r13 = (r11 > r27 ? 1 : (r11 == r27 ? 0 : -1))
            if (r13 >= 0) goto Lb8
            r11 = 0
            r13 = 4
            r19 = r9
            r9 = 0
            r27 = 0
            r10 = 0
            r6 = r19
            r29 = r23
            r5 = 0
            r7.queueInputBuffer(r8, r9, r10, r11, r13)     // Catch: java.lang.Throwable -> Lb2
            r8 = r21
            r10 = 2500(0x9c4, double:1.235E-320)
            r19 = 1
            goto L10d
        Lb2:
            r0 = move-exception
        Lb3:
            r31 = r2
            r11 = r3
            goto L23c
        Lb8:
            r6 = r9
            r29 = r23
            r5 = 0
            int r13 = r3.getSampleFlags()     // Catch: java.lang.Throwable -> Lb2
            r15.clear()     // Catch: java.lang.Throwable -> Lb2
            int r10 = r3.readSampleData(r15, r5)     // Catch: java.lang.Throwable -> Lb2
            java.nio.ByteBuffer r9 = r7.getInputBuffer(r8)     // Catch: java.lang.Throwable -> Lb2
            r9.clear()     // Catch: java.lang.Throwable -> Lb2
            r9.put(r15)     // Catch: java.lang.Throwable -> Lb2
            r9.position(r5)     // Catch: java.lang.Throwable -> Lb2
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb2
            r9.<init>()     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r5 = "audio queuePcmBuffer "
            r9.append(r5)     // Catch: java.lang.Throwable -> Lb2
            r24 = 1000(0x3e8, double:4.94E-321)
            r5 = r7
            r26 = r8
            long r7 = r11 / r24
            r9.append(r7)     // Catch: java.lang.Throwable -> L103
            r9.append(r6)     // Catch: java.lang.Throwable -> L103
            r9.append(r10)     // Catch: java.lang.Throwable -> L103
            java.lang.String r7 = r9.toString()     // Catch: java.lang.Throwable -> L103
            r8 = 0
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L103
            com.hw.videoprocessor.util.c.k(r7, r9)     // Catch: java.lang.Throwable -> L103
            r9 = 0
            r7 = r5
            r8 = r26
            r7.queueInputBuffer(r8, r9, r10, r11, r13)     // Catch: java.lang.Throwable -> Lb2
            r3.advance()     // Catch: java.lang.Throwable -> Lb2
            goto L109
        L103:
            r0 = move-exception
            r7 = r5
            goto Lb3
        L106:
            r6 = r9
            r29 = r23
        L109:
            r8 = r21
            r10 = 2500(0x9c4, double:1.235E-320)
        L10d:
            int r5 = r7.dequeueOutputBuffer(r14, r10)     // Catch: java.lang.Throwable -> Lb2
            r12 = -1
            if (r5 != r12) goto L115
            goto L15c
        L115:
            r12 = -2
            if (r5 != r12) goto L134
            android.media.MediaFormat r5 = r7.getOutputFormat()     // Catch: java.lang.Throwable -> Lb2
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb2
            r12.<init>()     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r13 = "audio decode newFormat = "
            r12.append(r13)     // Catch: java.lang.Throwable -> Lb2
            r12.append(r5)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r5 = r12.toString()     // Catch: java.lang.Throwable -> Lb2
            r12 = 0
            java.lang.Object[] r13 = new java.lang.Object[r12]     // Catch: java.lang.Throwable -> Lb2
            com.hw.videoprocessor.util.c.k(r5, r13)     // Catch: java.lang.Throwable -> Lb2
            goto L14d
        L134:
            if (r5 >= 0) goto L155
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb2
            r12.<init>()     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r13 = "unexpected result from audio decoder.dequeueOutputBuffer: "
            r12.append(r13)     // Catch: java.lang.Throwable -> Lb2
            r12.append(r5)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r5 = r12.toString()     // Catch: java.lang.Throwable -> Lb2
            r12 = 0
            java.lang.Object[] r13 = new java.lang.Object[r12]     // Catch: java.lang.Throwable -> Lb2
            com.hw.videoprocessor.util.c.f(r5, r13)     // Catch: java.lang.Throwable -> Lb2
        L14d:
            r31 = r2
            r11 = r3
            r2 = r29
            r12 = 0
            goto L233
        L155:
            int r12 = r14.flags     // Catch: java.lang.Throwable -> Lb2
            r13 = 4
            if (r12 != r13) goto L165
            r18 = 1
        L15c:
            r21 = r8
            r8 = r29
            r5 = 1
            r6 = 2
            r10 = 0
            goto L7e
        L165:
            java.nio.ByteBuffer r12 = r7.getOutputBuffer(r5)     // Catch: java.lang.Throwable -> Lb2
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb2
            r13.<init>()     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r10 = "audio writeSampleData "
            r13.append(r10)     // Catch: java.lang.Throwable -> Lb2
            long r10 = r14.presentationTimeUs     // Catch: java.lang.Throwable -> Lb2
            r13.append(r10)     // Catch: java.lang.Throwable -> Lb2
            r13.append(r6)     // Catch: java.lang.Throwable -> Lb2
            int r10 = r14.size     // Catch: java.lang.Throwable -> Lb2
            r13.append(r10)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r10 = " flags:"
            r13.append(r10)     // Catch: java.lang.Throwable -> Lb2
            int r10 = r14.flags     // Catch: java.lang.Throwable -> Lb2
            r13.append(r10)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r10 = r13.toString()     // Catch: java.lang.Throwable -> Lb2
            r11 = 0
            java.lang.Object[] r13 = new java.lang.Object[r11]     // Catch: java.lang.Throwable -> Lb2
            com.hw.videoprocessor.util.c.k(r10, r13)     // Catch: java.lang.Throwable -> Lb2
            if (r20 != 0) goto L1c9
            int r10 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r10 == 0) goto L1c9
            long r10 = r14.presentationTimeUs     // Catch: java.lang.Throwable -> Lb2
            r21 = r10
            long r10 = (long) r4     // Catch: java.lang.Throwable -> Lb2
            long r10 = r10 + r8
            int r13 = (r21 > r10 ? 1 : (r21 == r10 ? 0 : -1))
            if (r13 >= 0) goto L1c9
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb2
            r10.<init>()     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r11 = "audio 时间戳错误，lastAudioFrameTimeUs:"
            r10.append(r11)     // Catch: java.lang.Throwable -> Lb2
            r10.append(r8)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r11 = " info.presentationTimeUs:"
            r10.append(r11)     // Catch: java.lang.Throwable -> Lb2
            r31 = r8
            long r8 = r14.presentationTimeUs     // Catch: java.lang.Throwable -> Lb2
            r10.append(r8)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r8 = r10.toString()     // Catch: java.lang.Throwable -> Lb2
            r11 = 0
            java.lang.Object[] r9 = new java.lang.Object[r11]     // Catch: java.lang.Throwable -> Lb2
            com.hw.videoprocessor.util.c.f(r8, r9)     // Catch: java.lang.Throwable -> Lb2
            r10 = 1
            goto L1cd
        L1c9:
            r31 = r8
            r10 = r20
        L1cd:
            if (r10 == 0) goto L1ee
            long r8 = (long) r4     // Catch: java.lang.Throwable -> Lb2
            long r8 = r31 + r8
            r14.presentationTimeUs = r8     // Catch: java.lang.Throwable -> Lb2
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb2
            r8.<init>()     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r9 = "audio 时间戳错误，使用修正的时间戳:"
            r8.append(r9)     // Catch: java.lang.Throwable -> Lb2
            long r9 = r14.presentationTimeUs     // Catch: java.lang.Throwable -> Lb2
            r8.append(r9)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> Lb2
            r11 = 0
            java.lang.Object[] r9 = new java.lang.Object[r11]     // Catch: java.lang.Throwable -> Lb2
            com.hw.videoprocessor.util.c.f(r8, r9)     // Catch: java.lang.Throwable -> Lb2
            r10 = 0
        L1ee:
            int r8 = r14.flags     // Catch: java.lang.Throwable -> Lb2
            r9 = 2
            if (r8 == r9) goto L1f9
            r33 = r10
            long r9 = r14.presentationTimeUs     // Catch: java.lang.Throwable -> Lb2
            r8 = r9
            goto L1fd
        L1f9:
            r33 = r10
            r8 = r31
        L1fd:
            r2.writeSampleData(r0, r12, r14)     // Catch: java.lang.Throwable -> Lb2
            if (r1 == 0) goto L225
            long r10 = r14.presentationTimeUs     // Catch: java.lang.Throwable -> Lb2
            float r10 = (float) r10
            r31 = r2
            r11 = r3
            r2 = r29
            float r13 = (float) r2
            float r10 = r10 / r13
            r13 = 0
            int r20 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r20 >= 0) goto L212
            r10 = 0
        L212:
            r13 = 1065353216(0x3f800000, float:1.0)
            int r20 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r20 <= 0) goto L21a
            r10 = 1065353216(0x3f800000, float:1.0)
        L21a:
            r13 = 1056964608(0x3f000000, float:0.5)
            float r10 = r10 * r13
            float r10 = r10 + r13
            r1.a(r10)     // Catch: java.lang.Throwable -> L223
            goto L22a
        L223:
            r0 = move-exception
            goto L23c
        L225:
            r31 = r2
            r11 = r3
            r2 = r29
        L22a:
            r12.clear()     // Catch: java.lang.Throwable -> L223
            r12 = 0
            r7.releaseOutputBuffer(r5, r12)     // Catch: java.lang.Throwable -> L223
            r20 = r33
        L233:
            r29 = r2
            r3 = r11
            r10 = 2500(0x9c4, double:1.235E-320)
            r2 = r31
            goto L10d
        L23c:
            r11.release()
            r7.release()
            r31.release()
            throw r0
        L246:
            r31 = r2
            r11 = r3
            r11.release()
            r7.release()
            r31.release()
            return
    }

    public static int i(android.media.MediaFormat r2) {
            java.lang.String r0 = "bitrate"
            boolean r1 = r2.containsKey(r0)
            if (r1 == 0) goto Ld
            int r2 = r2.getInteger(r0)
            return r2
        Ld:
            r2 = 192000(0x2ee00, float:2.6905E-40)
            return r2
    }

    public static int j(android.media.MediaFormat r2) {
            java.lang.String r0 = "max-input-size"
            boolean r1 = r2.containsKey(r0)
            if (r1 == 0) goto Ld
            int r2 = r2.getInteger(r0)
            return r2
        Ld:
            r2 = 100000(0x186a0, float:1.4013E-40)
            return r2
    }

    public static boolean k(java.lang.String r6) throws java.io.IOException {
            android.media.MediaExtractor r0 = new android.media.MediaExtractor
            r0.<init>()
            r0.setDataSource(r6)
            int r6 = r0.getTrackCount()
            r1 = 0
            r2 = 0
            r3 = 0
        Lf:
            if (r3 >= r6) goto L27
            android.media.MediaFormat r1 = r0.getTrackFormat(r3)
            java.lang.String r4 = "mime"
            java.lang.String r4 = r1.getString(r4)
            java.lang.String r5 = "audio/"
            boolean r4 = r4.startsWith(r5)
            if (r4 == 0) goto L24
            goto L27
        L24:
            int r3 = r3 + 1
            goto Lf
        L27:
            r0.release()
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r6 = "channel-count"
            int r6 = r1.getInteger(r6)
            r0 = 1
            if (r6 <= r0) goto L37
            return r0
        L37:
            return r2
    }

    public static void l(java.lang.String r16, java.lang.String r17, java.lang.String r18, @androidx.annotation.IntRange(from = 0, to = 100) int r19, @androidx.annotation.IntRange(from = 0, to = 100) int r20) throws java.io.IOException {
            float r0 = m(r19)
            float r1 = m(r20)
            r2 = 2048(0x800, float:2.87E-42)
            byte[] r3 = new byte[r2]
            byte[] r4 = new byte[r2]
            byte[] r5 = new byte[r2]
            java.io.FileInputStream r6 = new java.io.FileInputStream
            r7 = r16
            r6.<init>(r7)
            java.io.FileInputStream r7 = new java.io.FileInputStream
            r8 = r17
            r7.<init>(r8)
            java.io.FileOutputStream r8 = new java.io.FileOutputStream
            r9 = r18
            r8.<init>(r9)
            r9 = 0
            r10 = 0
            r11 = 0
        L28:
            if (r10 == 0) goto L37
            if (r11 != 0) goto L2d
            goto L37
        L2d:
            r6.close()
            r7.close()
            r8.close()
            return
        L37:
            r12 = -1
            r13 = 1
            if (r10 != 0) goto L4a
            int r10 = r6.read(r3)     // Catch: java.lang.Throwable -> L48
            if (r10 != r12) goto L43
            r10 = 1
            goto L44
        L43:
            r10 = 0
        L44:
            java.lang.System.arraycopy(r3, r9, r5, r9, r2)     // Catch: java.lang.Throwable -> L48
            goto L4a
        L48:
            r0 = move-exception
            goto L9e
        L4a:
            if (r11 != 0) goto L98
            int r11 = r7.read(r4)     // Catch: java.lang.Throwable -> L48
            if (r11 != r12) goto L54
            r11 = 1
            goto L55
        L54:
            r11 = 0
        L55:
            r12 = 0
        L56:
            if (r12 >= r2) goto L98
            r13 = r3[r12]     // Catch: java.lang.Throwable -> L48
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r14 = r12 + 1
            r15 = r3[r14]     // Catch: java.lang.Throwable -> L48
            r15 = r15 & 255(0xff, float:3.57E-43)
            int r15 = r15 << 8
            r13 = r13 | r15
            short r13 = (short) r13     // Catch: java.lang.Throwable -> L48
            r15 = r4[r12]     // Catch: java.lang.Throwable -> L48
            r15 = r15 & 255(0xff, float:3.57E-43)
            r2 = r4[r14]     // Catch: java.lang.Throwable -> L48
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r2 = r2 | r15
            short r2 = (short) r2     // Catch: java.lang.Throwable -> L48
            float r2 = (float) r2     // Catch: java.lang.Throwable -> L48
            float r2 = r2 * r1
            float r13 = (float) r13     // Catch: java.lang.Throwable -> L48
            float r13 = r13 * r0
            float r2 = r2 + r13
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L48
            r13 = 32767(0x7fff, float:4.5916E-41)
            if (r2 <= r13) goto L81
            r2 = 32767(0x7fff, float:4.5916E-41)
            goto L87
        L81:
            r13 = -32768(0xffffffffffff8000, float:NaN)
            if (r2 >= r13) goto L87
            r2 = -32768(0xffffffffffff8000, float:NaN)
        L87:
            r13 = r2 & 255(0xff, float:3.57E-43)
            byte r13 = (byte) r13     // Catch: java.lang.Throwable -> L48
            r5[r12] = r13     // Catch: java.lang.Throwable -> L48
            int r2 = r2 >>> 8
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2     // Catch: java.lang.Throwable -> L48
            r5[r14] = r2     // Catch: java.lang.Throwable -> L48
            int r12 = r12 + 2
            r2 = 2048(0x800, float:2.87E-42)
            goto L56
        L98:
            r8.write(r5)     // Catch: java.lang.Throwable -> L48
            r2 = 2048(0x800, float:2.87E-42)
            goto L28
        L9e:
            r6.close()
            r7.close()
            r8.close()
            throw r0
    }

    private static float m(@androidx.annotation.IntRange(from = 0, to = 100) int r1) {
            float r1 = (float) r1
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r0
            int r0 = com.hw.videoprocessor.util.b.c
            float r0 = (float) r0
            float r1 = r1 * r0
            return r1
    }

    public static boolean n(java.lang.String r13, java.lang.String r14, int r15, int r16, int r17) {
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.io.IOException -> L25
            r1.<init>(r13)     // Catch: java.io.IOException -> L25
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L25
            r2.<init>(r14)     // Catch: java.io.IOException -> L25
            com.hw.videoprocessor.jssrc.b r0 = new com.hw.videoprocessor.jssrc.b     // Catch: java.io.IOException -> L25
            java.io.File r14 = new java.io.File     // Catch: java.io.IOException -> L25
            r14.<init>(r13)     // Catch: java.io.IOException -> L25
            long r13 = r14.length()     // Catch: java.io.IOException -> L25
            int r8 = (int) r13     // Catch: java.io.IOException -> L25
            r11 = 0
            r12 = 1
            r5 = 2
            r6 = 2
            r9 = 0
            r3 = r15
            r4 = r16
            r7 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12)     // Catch: java.io.IOException -> L25
            goto L2a
        L25:
            r0 = move-exception
            r13 = r0
            com.hw.videoprocessor.util.c.g(r13)
        L2a:
            r13 = 1
            return r13
    }

    public static void o(java.lang.String r9, java.lang.String r10) throws java.io.IOException {
            android.media.MediaExtractor r0 = new android.media.MediaExtractor
            r0.<init>()
            r0.setDataSource(r9)
            r9 = 0
            int r1 = com.hw.videoprocessor.i.k(r0, r9)     // Catch: java.lang.Throwable -> L43
            r0.selectTrack(r1)     // Catch: java.lang.Throwable -> L43
            android.media.MediaFormat r1 = r0.getTrackFormat(r1)     // Catch: java.lang.Throwable -> L43
            android.media.MediaMuxer r2 = new android.media.MediaMuxer     // Catch: java.lang.Throwable -> L43
            r2.<init>(r10, r9)     // Catch: java.lang.Throwable -> L43
            int r10 = r2.addTrack(r1)     // Catch: java.lang.Throwable -> L43
            r2.start()     // Catch: java.lang.Throwable -> L43
            android.media.MediaCodec$BufferInfo r3 = new android.media.MediaCodec$BufferInfo     // Catch: java.lang.Throwable -> L43
            r3.<init>()     // Catch: java.lang.Throwable -> L43
            java.lang.String r4 = "max-input-size"
            int r1 = r1.getInteger(r4)     // Catch: java.lang.Throwable -> L43
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocateDirect(r1)     // Catch: java.lang.Throwable -> L43
        L2f:
            long r4 = r0.getSampleTime()     // Catch: java.lang.Throwable -> L43
            r6 = -1
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L45
            r2.stop()     // Catch: java.lang.Throwable -> L43
            r2.release()     // Catch: java.lang.Throwable -> L43
            r0.release()
            return
        L43:
            r9 = move-exception
            goto L5a
        L45:
            int r6 = r0.getSampleFlags()     // Catch: java.lang.Throwable -> L43
            int r7 = r0.readSampleData(r1, r9)     // Catch: java.lang.Throwable -> L43
            r3.presentationTimeUs = r4     // Catch: java.lang.Throwable -> L43
            r3.flags = r6     // Catch: java.lang.Throwable -> L43
            r3.size = r7     // Catch: java.lang.Throwable -> L43
            r2.writeSampleData(r10, r1, r3)     // Catch: java.lang.Throwable -> L43
            r0.advance()     // Catch: java.lang.Throwable -> L43
            goto L2f
        L5a:
            r0.release()
            throw r9
    }

    public static void p(java.lang.String r21, java.lang.String r22, java.lang.String r23, boolean r24) throws java.io.IOException {
            android.media.MediaExtractor r1 = new android.media.MediaExtractor
            r1.<init>()
            r0 = r21
            r1.setDataSource(r0)
            android.media.MediaExtractor r2 = new android.media.MediaExtractor
            r2.<init>()
            r0 = r22
            r2.setDataSource(r0)
            r0 = 0
            int r3 = com.hw.videoprocessor.i.k(r1, r0)     // Catch: java.lang.Throwable -> La5
            r4 = 1
            int r4 = com.hw.videoprocessor.i.k(r2, r4)     // Catch: java.lang.Throwable -> La5
            r1.selectTrack(r3)     // Catch: java.lang.Throwable -> La5
            r2.selectTrack(r4)     // Catch: java.lang.Throwable -> La5
            android.media.MediaFormat r4 = r2.getTrackFormat(r4)     // Catch: java.lang.Throwable -> La5
            android.media.MediaFormat r3 = r1.getTrackFormat(r3)     // Catch: java.lang.Throwable -> La5
            android.media.MediaMuxer r5 = new android.media.MediaMuxer     // Catch: java.lang.Throwable -> La5
            r6 = r23
            r5.<init>(r6, r0)     // Catch: java.lang.Throwable -> La5
            int r6 = r5.addTrack(r4)     // Catch: java.lang.Throwable -> La5
            int r7 = r5.addTrack(r3)     // Catch: java.lang.Throwable -> La5
            r5.start()     // Catch: java.lang.Throwable -> La5
            android.media.MediaCodec$BufferInfo r8 = new android.media.MediaCodec$BufferInfo     // Catch: java.lang.Throwable -> La5
            r8.<init>()     // Catch: java.lang.Throwable -> La5
            java.lang.String r9 = "max-input-size"
            int r3 = r3.getInteger(r9)     // Catch: java.lang.Throwable -> La5
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocateDirect(r3)     // Catch: java.lang.Throwable -> La5
            r9 = 0
            r11 = r9
        L50:
            long r13 = r1.getSampleTime()     // Catch: java.lang.Throwable -> La5
            r15 = -1
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 != 0) goto Lb4
            java.lang.String r3 = "sample-rate"
            int r3 = r4.getInteger(r3)     // Catch: java.lang.Throwable -> La5
            r7 = 1024000000(0x3d090000, float:0.033447266)
            int r7 = r7 / r3
            int r3 = j(r4)     // Catch: java.lang.Throwable -> La5
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocateDirect(r3)     // Catch: java.lang.Throwable -> La5
            r13 = r9
            r17 = r13
        L6e:
            int r4 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r4 >= 0) goto La7
            r4 = 2
            r2.seekTo(r9, r4)     // Catch: java.lang.Throwable -> La5
        L76:
            long r19 = r2.getSampleTime()     // Catch: java.lang.Throwable -> La5
            int r4 = (r19 > r15 ? 1 : (r19 == r15 ? 0 : -1))
            if (r4 != 0) goto L7f
            goto L85
        L7f:
            long r13 = r19 + r17
            int r4 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r4 <= 0) goto L8e
        L85:
            long r9 = (long) r7     // Catch: java.lang.Throwable -> La5
            long r17 = r13 + r9
            if (r24 != 0) goto L8b
            goto La7
        L8b:
            r9 = 0
            goto L6e
        L8e:
            int r4 = r2.getSampleFlags()     // Catch: java.lang.Throwable -> La5
            int r9 = r2.readSampleData(r3, r0)     // Catch: java.lang.Throwable -> La5
            r8.presentationTimeUs = r13     // Catch: java.lang.Throwable -> La5
            r8.flags = r4     // Catch: java.lang.Throwable -> La5
            r8.size = r9     // Catch: java.lang.Throwable -> La5
            r5.writeSampleData(r6, r3, r8)     // Catch: java.lang.Throwable -> La5
            r2.advance()     // Catch: java.lang.Throwable -> La5
            r9 = 0
            goto L76
        La5:
            r0 = move-exception
            goto Lcc
        La7:
            r5.stop()     // Catch: java.lang.Throwable -> La5
            r5.release()     // Catch: java.lang.Throwable -> La5
            r1.release()
            r2.release()
            return
        Lb4:
            int r9 = r1.getSampleFlags()     // Catch: java.lang.Throwable -> La5
            int r10 = r1.readSampleData(r3, r0)     // Catch: java.lang.Throwable -> La5
            r8.presentationTimeUs = r13     // Catch: java.lang.Throwable -> La5
            r8.flags = r9     // Catch: java.lang.Throwable -> La5
            r8.size = r10     // Catch: java.lang.Throwable -> La5
            r5.writeSampleData(r7, r3, r8)     // Catch: java.lang.Throwable -> La5
            r1.advance()     // Catch: java.lang.Throwable -> La5
            r11 = r13
            r9 = 0
            goto L50
        Lcc:
            r1.release()
            r2.release()
            throw r0
    }

    public static void q(java.lang.String r8, java.lang.String r9) throws java.io.IOException {
            r0 = 0
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L34
            java.lang.String r2 = "r"
            r1.<init>(r8, r2)     // Catch: java.lang.Throwable -> L34
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L31
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L31
            long r2 = r1.length()     // Catch: java.lang.Throwable -> L27
            r9 = 2
            long r4 = (long) r9     // Catch: java.lang.Throwable -> L27
            long r2 = r2 - r4
            byte[] r9 = new byte[r9]     // Catch: java.lang.Throwable -> L27
        L16:
            r6 = 0
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 < 0) goto L2a
            r1.seek(r2)     // Catch: java.lang.Throwable -> L27
            r1.read(r9)     // Catch: java.lang.Throwable -> L27
            r8.write(r9)     // Catch: java.lang.Throwable -> L27
            long r2 = r2 - r4
            goto L16
        L27:
            r9 = move-exception
        L28:
            r0 = r1
            goto L36
        L2a:
            r1.close()
            r8.close()
            return
        L31:
            r9 = move-exception
            r8 = r0
            goto L28
        L34:
            r9 = move-exception
            r8 = r0
        L36:
            if (r0 == 0) goto L3b
            r0.close()
        L3b:
            if (r8 == 0) goto L40
            r8.close()
        L40:
            throw r9
    }

    public static void r(java.lang.String r1, java.lang.String r2) throws java.io.IOException {
            r0 = 2
            s(r1, r2, r0)
            return
    }

    public static void s(java.lang.String r6, java.lang.String r7, @androidx.annotation.IntRange(from = 2) int r8) throws java.io.IOException {
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r6)
            java.io.FileOutputStream r6 = new java.io.FileOutputStream
            r6.<init>(r7)
            int r7 = r8 * 1024
            byte[] r7 = new byte[r7]
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r1]
        L12:
            int r3 = r0.read(r7)
            r4 = -1
            if (r3 == r4) goto L31
            r3 = 0
        L1a:
            if (r3 >= r1) goto L2d
            int r4 = r8 * r3
            r5 = r7[r4]
            r2[r3] = r5
            int r5 = r3 + 1
            int r4 = r4 + 1
            r4 = r7[r4]
            r2[r5] = r4
            int r3 = r3 + 2
            goto L1a
        L2d:
            r6.write(r2)
            goto L12
        L31:
            r0.close()
            r6.close()
            return
    }

    public static long t(android.media.MediaExtractor r14, android.media.MediaMuxer r15, int r16, java.lang.Integer r17, java.lang.Integer r18, long r19, com.hw.videoprocessor.util.k r21) throws java.io.IOException {
            r0 = r21
            r1 = 1
            int r1 = com.hw.videoprocessor.i.k(r14, r1)
            r14.selectTrack(r1)
            r2 = 0
            if (r17 != 0) goto L12
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            goto L14
        L12:
            r3 = r17
        L14:
            int r4 = r3.intValue()
            long r4 = (long) r4
            r6 = 2
            r14.seekTo(r4, r6)
            android.media.MediaFormat r1 = r14.getTrackFormat(r1)
            java.lang.String r4 = "durationUs"
            long r4 = r1.getLong(r4)
            java.lang.String r6 = "max-input-size"
            int r1 = r1.getInteger(r6)
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocateDirect(r1)
            android.media.MediaCodec$BufferInfo r6 = new android.media.MediaCodec$BufferInfo
            r6.<init>()
            r7 = r19
        L38:
            long r9 = r14.getSampleTime()
            r11 = -1
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 != 0) goto L43
            goto L9f
        L43:
            int r11 = r3.intValue()
            long r11 = (long) r11
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 >= 0) goto L50
            r14.advance()
            goto L38
        L50:
            if (r18 == 0) goto L5c
            int r11 = r18.intValue()
            long r11 = (long) r11
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 <= 0) goto L5c
            goto L9f
        L5c:
            if (r0 == 0) goto L87
            int r11 = r3.intValue()
            long r11 = (long) r11
            long r11 = r9 - r11
            float r11 = (float) r11
            if (r18 != 0) goto L6a
            r12 = r4
            goto L74
        L6a:
            int r12 = r18.intValue()
            int r13 = r3.intValue()
            int r12 = r12 - r13
            long r12 = (long) r12
        L74:
            float r12 = (float) r12
            float r11 = r11 / r12
            r12 = 0
            int r13 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r13 >= 0) goto L7c
            r11 = 0
        L7c:
            r12 = 1065353216(0x3f800000, float:1.0)
            int r13 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r13 <= 0) goto L84
            r11 = 1065353216(0x3f800000, float:1.0)
        L84:
            r0.a(r11)
        L87:
            int r11 = r3.intValue()
            long r11 = (long) r11
            long r9 = r9 - r11
            long r9 = r9 + r19
            r6.presentationTimeUs = r9
            int r9 = r14.getSampleFlags()
            r6.flags = r9
            int r9 = r14.readSampleData(r1, r2)
            r6.size = r9
            if (r9 >= 0) goto La0
        L9f:
            return r7
        La0:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "writeAudioSampleData,time:"
            r7.append(r8)
            long r8 = r6.presentationTimeUs
            float r8 = (float) r8
            r9 = 1148846080(0x447a0000, float:1000.0)
            float r8 = r8 / r9
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.Object[] r8 = new java.lang.Object[r2]
            com.hw.videoprocessor.util.c.k(r7, r8)
            r7 = r16
            r15.writeSampleData(r7, r1, r6)
            long r8 = r6.presentationTimeUs
            r14.advance()
            r7 = r8
            goto L38
    }

    public static long u(android.media.MediaExtractor r8, android.media.MediaMuxer r9, int r10, java.lang.Integer r11, java.lang.Integer r12, com.hw.videoprocessor.util.k r13) throws java.io.IOException {
            r5 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r7 = r13
            long r8 = t(r0, r1, r2, r3, r4, r5, r7)
            return r8
    }

    public static void v(android.content.Context r37, android.media.MediaExtractor r38, android.media.MediaMuxer r39, int r40, java.lang.Integer r41, java.lang.Integer r42, @androidx.annotation.NonNull java.lang.Float r43, @androidx.annotation.Nullable com.hw.videoprocessor.util.k r44) throws java.lang.Exception {
            r1 = r38
            r0 = r44
            r2 = 1
            int r3 = com.hw.videoprocessor.i.k(r1, r2)
            r1.selectTrack(r3)
            r4 = 0
            if (r41 != 0) goto L14
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            goto L16
        L14:
            r5 = r41
        L16:
            int r6 = r5.intValue()
            long r6 = (long) r6
            r8 = 2
            r1.seekTo(r6, r8)
            android.media.MediaFormat r3 = r1.getTrackFormat(r3)
            java.lang.String r6 = "durationUs"
            long r9 = r3.getLong(r6)
            int r7 = j(r3)
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.allocateDirect(r7)
            android.media.MediaCodec$BufferInfo r11 = new android.media.MediaCodec$BufferInfo
            r11.<init>()
            java.lang.String r12 = "mime"
            java.lang.String r12 = r3.getString(r12)
            android.media.MediaCodec r13 = android.media.MediaCodec.createDecoderByType(r12)
            r12 = 0
            r13.configure(r3, r12, r12, r4)
            r13.start()
            java.io.File r14 = new java.io.File
            java.io.File r15 = r37.getCacheDir()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r20 = r9
            long r8 = java.lang.System.currentTimeMillis()
            r12.append(r8)
            java.lang.String r8 = ".pcm"
            r12.append(r8)
            java.lang.String r8 = r12.toString()
            r14.<init>(r15, r8)
            java.io.FileOutputStream r8 = new java.io.FileOutputStream
            r8.<init>(r14)
            java.nio.channels.FileChannel r8 = r8.getChannel()
            r9 = 0
            r10 = 0
        L72:
            java.lang.String r15 = "unexpected result from audio decoder.dequeueOutputBuffer: "
            java.lang.String r2 = "audio decode newFormat = "
            r22 = 1056964608(0x3f000000, float:0.5)
            r23 = 1000(0x3e8, double:4.94E-321)
            r16 = -1
            r25 = r5
            r4 = 2500(0x9c4, double:1.235E-320)
            if (r9 != 0) goto L212
            if (r10 != 0) goto L13f
            r18 = r14
            int r14 = r13.dequeueInputBuffer(r4)     // Catch: java.lang.Throwable -> L131
            if (r14 < 0) goto L139
            r19 = r13
            long r12 = r1.getSampleTime()     // Catch: java.lang.Throwable -> L135
            int r26 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r26 != 0) goto L99
        L96:
            r4 = r18
            goto Lc0
        L99:
            int r4 = r25.intValue()     // Catch: java.lang.Throwable -> L135
            long r4 = (long) r4
            int r16 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r16 >= 0) goto Lb4
            r1.advance()     // Catch: java.lang.Throwable -> Lae
            r14 = r18
            r13 = r19
            r5 = r25
        Lab:
            r2 = 1
            r4 = 0
            goto L72
        Lae:
            r0 = move-exception
            r14 = r8
            r13 = r19
            goto L1fc
        Lb4:
            if (r42 == 0) goto Ld9
            int r4 = r42.intValue()     // Catch: java.lang.Throwable -> Le3
            long r4 = (long) r4
            int r16 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r16 <= 0) goto Ld9
            goto L96
        Lc0:
            r17 = 0
            r13 = r19
            r19 = 4
            r5 = r15
            r15 = 0
            r16 = 0
            r13.queueInputBuffer(r14, r15, r16, r17, r19)     // Catch: java.lang.Throwable -> Ld4
            r14 = r13
            r27 = r4
            r13 = r14
            r10 = 1
            goto L146
        Ld4:
            r0 = move-exception
            r14 = r13
        Ld6:
            r14 = r8
            goto L1fc
        Ld9:
            r5 = r15
            r15 = r14
            r14 = r19
            r28 = r9
            r27 = r18
            r4 = 0
            goto Le8
        Le3:
            r0 = move-exception
            r14 = r19
        Le6:
            r13 = r14
            goto Ld6
        Le8:
            int r9 = r1.readSampleData(r7, r4)     // Catch: java.lang.Throwable -> L133
            r11.size = r9     // Catch: java.lang.Throwable -> L133
            r11.presentationTimeUs = r12     // Catch: java.lang.Throwable -> L133
            int r4 = r1.getSampleFlags()     // Catch: java.lang.Throwable -> L133
            r11.flags = r4     // Catch: java.lang.Throwable -> L133
            java.nio.ByteBuffer r4 = r14.getInputBuffer(r15)     // Catch: java.lang.Throwable -> L133
            r4.put(r7)     // Catch: java.lang.Throwable -> L133
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L133
            r4.<init>()     // Catch: java.lang.Throwable -> L133
            java.lang.String r9 = "audio decode queueInputBuffer "
            r4.append(r9)     // Catch: java.lang.Throwable -> L133
            long r12 = r11.presentationTimeUs     // Catch: java.lang.Throwable -> L133
            long r12 = r12 / r23
            r4.append(r12)     // Catch: java.lang.Throwable -> L133
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L133
            r9 = 0
            java.lang.Object[] r12 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L133
            com.hw.videoprocessor.util.c.k(r4, r12)     // Catch: java.lang.Throwable -> L133
            int r4 = r11.size     // Catch: java.lang.Throwable -> L133
            long r12 = r11.presentationTimeUs     // Catch: java.lang.Throwable -> L133
            int r9 = r11.flags     // Catch: java.lang.Throwable -> L133
            r19 = r14
            r14 = r15
            r15 = 0
            r16 = r4
            r17 = r12
            r13 = r19
            r19 = r9
            r13.queueInputBuffer(r14, r15, r16, r17, r19)     // Catch: java.lang.Throwable -> L131
            r1.advance()     // Catch: java.lang.Throwable -> L131
            goto L144
        L131:
            r0 = move-exception
            goto Ld6
        L133:
            r0 = move-exception
            goto Le6
        L135:
            r0 = move-exception
            r13 = r19
            goto Ld6
        L139:
            r28 = r9
            r5 = r15
            r27 = r18
            goto L144
        L13f:
            r28 = r9
            r27 = r14
            r5 = r15
        L144:
            r9 = r28
        L146:
            if (r9 != 0) goto L151
            r14 = 2500(0x9c4, double:1.235E-320)
            int r4 = r13.dequeueOutputBuffer(r11, r14)     // Catch: java.lang.Throwable -> L131
            r12 = -1
            if (r4 != r12) goto L159
        L151:
            r18 = r7
            r14 = r8
            r15 = r9
            r16 = r10
            goto L206
        L159:
            r12 = -2
            if (r4 != r12) goto L176
            android.media.MediaFormat r4 = r13.getOutputFormat()     // Catch: java.lang.Throwable -> L131
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L131
            r12.<init>()     // Catch: java.lang.Throwable -> L131
            r12.append(r2)     // Catch: java.lang.Throwable -> L131
            r12.append(r4)     // Catch: java.lang.Throwable -> L131
            java.lang.String r4 = r12.toString()     // Catch: java.lang.Throwable -> L131
            r12 = 0
            java.lang.Object[] r14 = new java.lang.Object[r12]     // Catch: java.lang.Throwable -> L131
            com.hw.videoprocessor.util.c.k(r4, r14)     // Catch: java.lang.Throwable -> L131
            goto L18d
        L176:
            if (r4 >= 0) goto L194
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L131
            r12.<init>()     // Catch: java.lang.Throwable -> L131
            r12.append(r5)     // Catch: java.lang.Throwable -> L131
            r12.append(r4)     // Catch: java.lang.Throwable -> L131
            java.lang.String r4 = r12.toString()     // Catch: java.lang.Throwable -> L131
            r12 = 0
            java.lang.Object[] r14 = new java.lang.Object[r12]     // Catch: java.lang.Throwable -> L131
            com.hw.videoprocessor.util.c.f(r4, r14)     // Catch: java.lang.Throwable -> L131
        L18d:
            r18 = r7
            r14 = r8
            r16 = r10
            goto L1f5
        L194:
            int r12 = r11.flags     // Catch: java.lang.Throwable -> L131
            r14 = 4
            if (r12 != r14) goto L1a1
            r18 = r7
            r14 = r8
            r16 = r10
            r15 = 1
        L19f:
            r12 = 0
            goto L1f1
        L1a1:
            java.nio.ByteBuffer r12 = r13.getOutputBuffer(r4)     // Catch: java.lang.Throwable -> L131
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L131
            r14.<init>()     // Catch: java.lang.Throwable -> L131
            java.lang.String r15 = "audio decode saveFrame "
            r14.append(r15)     // Catch: java.lang.Throwable -> L131
            r15 = r9
            r16 = r10
            long r9 = r11.presentationTimeUs     // Catch: java.lang.Throwable -> L131
            long r9 = r9 / r23
            r14.append(r9)     // Catch: java.lang.Throwable -> L131
            java.lang.String r9 = r14.toString()     // Catch: java.lang.Throwable -> L131
            r10 = 0
            java.lang.Object[] r14 = new java.lang.Object[r10]     // Catch: java.lang.Throwable -> L131
            com.hw.videoprocessor.util.c.k(r9, r14)     // Catch: java.lang.Throwable -> L131
            r8.write(r12)     // Catch: java.lang.Throwable -> L131
            if (r0 == 0) goto L1ed
            long r9 = r11.presentationTimeUs     // Catch: java.lang.Throwable -> L131
            int r12 = r25.intValue()     // Catch: java.lang.Throwable -> L131
            r18 = r7
            r14 = r8
            long r7 = (long) r12
            long r9 = r9 - r7
            float r7 = (float) r9
            if (r42 != 0) goto L1d9
            r8 = r20
            goto L1e3
        L1d9:
            int r8 = r42.intValue()     // Catch: java.lang.Throwable -> L1eb
            int r9 = r25.intValue()     // Catch: java.lang.Throwable -> L1eb
            int r8 = r8 - r9
            long r8 = (long) r8     // Catch: java.lang.Throwable -> L1eb
        L1e3:
            float r8 = (float) r8     // Catch: java.lang.Throwable -> L1eb
            float r7 = r7 / r8
            float r7 = r7 * r22
            r0.a(r7)     // Catch: java.lang.Throwable -> L1eb
            goto L19f
        L1eb:
            r0 = move-exception
            goto L1fc
        L1ed:
            r18 = r7
            r14 = r8
            goto L19f
        L1f1:
            r13.releaseOutputBuffer(r4, r12)     // Catch: java.lang.Throwable -> L1eb
            r9 = r15
        L1f5:
            r8 = r14
            r10 = r16
            r7 = r18
            goto L146
        L1fc:
            r14.close()
            r1.release()
            r13.release()
            throw r0
        L206:
            r8 = r14
            r9 = r15
            r10 = r16
            r7 = r18
            r5 = r25
            r14 = r27
            goto Lab
        L212:
            r27 = r14
            r5 = r15
            r14 = r8
            r14.close()
            r1.release()
            r13.release()
            java.lang.String r1 = "sample-rate"
            int r1 = r3.getInteger(r1)
            java.lang.String r4 = "channel-count"
            int r7 = r3.getInteger(r4)
            java.io.File r8 = new java.io.File
            java.io.File r9 = r37.getCacheDir()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = r27.getName()
            r10.append(r12)
            java.lang.String r12 = ".wav"
            r10.append(r12)
            java.lang.String r10 = r10.toString()
            r8.<init>(r9, r10)
            r9 = 2
            if (r7 != r9) goto L24f
            r10 = 12
            goto L251
        L24f:
            r10 = 16
        L251:
            com.hw.videoprocessor.util.g r12 = new com.hw.videoprocessor.util.g
            r12.<init>(r1, r10, r7, r9)
            java.lang.String r7 = r27.getAbsolutePath()
            java.lang.String r9 = r8.getAbsolutePath()
            r12.a(r7, r9)
            java.lang.String r7 = "start process pcm speed"
            r12 = 0
            java.lang.Object[] r9 = new java.lang.Object[r12]
            com.hw.videoprocessor.util.c.k(r7, r9)
            java.io.File r7 = new java.io.File
            java.io.File r9 = r37.getCacheDir()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = r27.getName()
            r10.append(r12)
            java.lang.String r12 = ".outpcm"
            r10.append(r12)
            java.lang.String r10 = r10.toString()
            r7.<init>(r9, r10)
            net.surina.soundtouch.SoundTouch r9 = new net.surina.soundtouch.SoundTouch
            r9.<init>()
            float r10 = r43.floatValue()
            r9.e(r10)
            java.lang.String r10 = r8.getAbsolutePath()
            java.lang.String r12 = r7.getAbsolutePath()
            int r9 = r9.b(r10, r12)
            if (r9 >= 0) goto L2ab
            r27.delete()
            r8.delete()
            r7.delete()
            return
        L2ab:
            android.media.MediaExtractor r9 = new android.media.MediaExtractor
            r9.<init>()
            java.lang.String r10 = r7.getAbsolutePath()
            r9.setDataSource(r10)
            r10 = 1
            int r12 = com.hw.videoprocessor.i.k(r9, r10)
            r9.selectTrack(r12)
            android.media.MediaFormat r10 = r9.getTrackFormat(r12)
            int r12 = j(r10)
            long r13 = r10.getLong(r6)
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.allocateDirect(r12)
            int r10 = i(r3)
            int r3 = r3.getInteger(r4)
            java.lang.String r4 = "audio/mp4a-latm"
            android.media.MediaFormat r3 = android.media.MediaFormat.createAudioFormat(r4, r1, r3)
            java.lang.String r15 = "bitrate"
            r3.setInteger(r15, r10)
            java.lang.String r10 = "aac-profile"
            r15 = 2
            r3.setInteger(r10, r15)
            java.lang.String r10 = "max-input-size"
            r3.setInteger(r10, r12)
            android.media.MediaCodec r4 = android.media.MediaCodec.createEncoderByType(r4)
            r10 = 1
            r12 = 0
            r4.configure(r3, r12, r12, r10)
            r4.start()
            r3 = 1024000000(0x3d090000, float:0.033447266)
            int r3 = r3 / r1
            r18 = r16
            r1 = 0
            r12 = 0
            r15 = 0
        L301:
            if (r1 != 0) goto L533
            r41 = r11
            r10 = 2500(0x9c4, double:1.235E-320)
            int r29 = r4.dequeueInputBuffer(r10)     // Catch: java.lang.Throwable -> L520
            java.lang.String r10 = " size:"
            if (r12 != 0) goto L3b5
            if (r29 < 0) goto L3b5
            long r32 = r9.getSampleTime()     // Catch: java.lang.Throwable -> L3b0
            r20 = 0
            int r11 = (r32 > r20 ? 1 : (r32 == r20 ? 0 : -1))
            if (r11 >= 0) goto L349
            r32 = 0
            r34 = 4
            r30 = 0
            r31 = 0
            r28 = r4
            r28.queueInputBuffer(r29, r30, r31, r32, r34)     // Catch: java.lang.Throwable -> L33d
            r37 = r1
            r1 = r4
            r38 = r7
            r43 = r9
            r11 = 2500(0x9c4, double:1.235E-320)
            r9 = r41
            r41 = 1
            r35 = r18
            r18 = r8
            r7 = r35
            goto L3c7
        L33d:
            r0 = move-exception
            r4 = r28
        L340:
            r1 = r4
            r38 = r7
            r18 = r8
            r43 = r9
            goto L523
        L349:
            r11 = r29
            int r34 = r9.getSampleFlags()     // Catch: java.lang.Throwable -> L3b0
            r6.clear()     // Catch: java.lang.Throwable -> L3b0
            r37 = r1
            r38 = r7
            r1 = 0
            int r7 = r9.readSampleData(r6, r1)     // Catch: java.lang.Throwable -> L3aa
            java.nio.ByteBuffer r1 = r4.getInputBuffer(r11)     // Catch: java.lang.Throwable -> L3aa
            r1.clear()     // Catch: java.lang.Throwable -> L3aa
            r1.put(r6)     // Catch: java.lang.Throwable -> L3aa
            r28 = r4
            r4 = 0
            r1.position(r4)     // Catch: java.lang.Throwable -> L3a5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3a5
            r1.<init>()     // Catch: java.lang.Throwable -> L3a5
            java.lang.String r4 = "audio queuePcmBuffer "
            r1.append(r4)     // Catch: java.lang.Throwable -> L3a5
            r4 = r8
            r43 = r9
            long r8 = r32 / r23
            r1.append(r8)     // Catch: java.lang.Throwable -> L3a1
            r1.append(r10)     // Catch: java.lang.Throwable -> L3a1
            r1.append(r7)     // Catch: java.lang.Throwable -> L3a1
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L3a1
            r9 = 0
            java.lang.Object[] r8 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L3a1
            com.hw.videoprocessor.util.c.k(r1, r8)     // Catch: java.lang.Throwable -> L3a1
            r30 = 0
            r31 = r7
            r29 = r11
            r28.queueInputBuffer(r29, r30, r31, r32, r34)     // Catch: java.lang.Throwable -> L3a1
            r1 = r28
            r43.advance()     // Catch: java.lang.Throwable -> L39c
            goto L3bd
        L39c:
            r0 = move-exception
        L39d:
            r18 = r4
            goto L523
        L3a1:
            r0 = move-exception
        L3a2:
            r1 = r28
            goto L39d
        L3a5:
            r0 = move-exception
            r4 = r8
            r43 = r9
            goto L3a2
        L3aa:
            r0 = move-exception
            r1 = r4
        L3ac:
            r4 = r8
            r43 = r9
            goto L39d
        L3b0:
            r0 = move-exception
            r1 = r4
            r38 = r7
            goto L3ac
        L3b5:
            r37 = r1
            r1 = r4
            r38 = r7
            r4 = r8
            r43 = r9
        L3bd:
            r9 = r41
            r41 = r12
            r7 = r18
            r11 = 2500(0x9c4, double:1.235E-320)
            r18 = r4
        L3c7:
            int r4 = r1.dequeueOutputBuffer(r9, r11)     // Catch: java.lang.Throwable -> L3ef
            r11 = -1
            if (r4 != r11) goto L3d2
            r4 = r37
            r12 = 4
            goto L41e
        L3d2:
            r12 = -2
            if (r4 != r12) goto L3f2
            android.media.MediaFormat r4 = r1.getOutputFormat()     // Catch: java.lang.Throwable -> L3ef
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3ef
            r11.<init>()     // Catch: java.lang.Throwable -> L3ef
            r11.append(r2)     // Catch: java.lang.Throwable -> L3ef
            r11.append(r4)     // Catch: java.lang.Throwable -> L3ef
            java.lang.String r4 = r11.toString()     // Catch: java.lang.Throwable -> L3ef
            r11 = 0
            java.lang.Object[] r12 = new java.lang.Object[r11]     // Catch: java.lang.Throwable -> L3ef
            com.hw.videoprocessor.util.c.k(r4, r12)     // Catch: java.lang.Throwable -> L3ef
            goto L409
        L3ef:
            r0 = move-exception
            goto L523
        L3f2:
            if (r4 >= 0) goto L418
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3ef
            r11.<init>()     // Catch: java.lang.Throwable -> L3ef
            r11.append(r5)     // Catch: java.lang.Throwable -> L3ef
            r11.append(r4)     // Catch: java.lang.Throwable -> L3ef
            java.lang.String r4 = r11.toString()     // Catch: java.lang.Throwable -> L3ef
            r12 = 0
            java.lang.Object[] r11 = new java.lang.Object[r12]     // Catch: java.lang.Throwable -> L3ef
            com.hw.videoprocessor.util.c.f(r4, r11)     // Catch: java.lang.Throwable -> L3ef
        L409:
            r12 = r40
            r19 = r2
            r21 = r3
            r30 = r5
            r20 = r6
            r11 = 0
            r5 = r39
            goto L514
        L418:
            int r11 = r9.flags     // Catch: java.lang.Throwable -> L3ef
            r12 = 4
            if (r11 != r12) goto L430
            r4 = 1
        L41e:
            r10 = r7
            r8 = r18
            r18 = r10
            r10 = r4
            r4 = r1
            r1 = r10
            r7 = r38
            r12 = r41
            r11 = r9
            r10 = 1
            r9 = r43
            goto L301
        L430:
            java.nio.ByteBuffer r11 = r1.getOutputBuffer(r4)     // Catch: java.lang.Throwable -> L3ef
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3ef
            r12.<init>()     // Catch: java.lang.Throwable -> L3ef
            r19 = r2
            java.lang.String r2 = "audio writeSampleData "
            r12.append(r2)     // Catch: java.lang.Throwable -> L3ef
            r2 = r5
            r20 = r6
            long r5 = r9.presentationTimeUs     // Catch: java.lang.Throwable -> L3ef
            r12.append(r5)     // Catch: java.lang.Throwable -> L3ef
            r12.append(r10)     // Catch: java.lang.Throwable -> L3ef
            int r5 = r9.size     // Catch: java.lang.Throwable -> L3ef
            r12.append(r5)     // Catch: java.lang.Throwable -> L3ef
            java.lang.String r5 = " flags:"
            r12.append(r5)     // Catch: java.lang.Throwable -> L3ef
            int r5 = r9.flags     // Catch: java.lang.Throwable -> L3ef
            r12.append(r5)     // Catch: java.lang.Throwable -> L3ef
            java.lang.String r5 = r12.toString()     // Catch: java.lang.Throwable -> L3ef
            r12 = 0
            java.lang.Object[] r6 = new java.lang.Object[r12]     // Catch: java.lang.Throwable -> L3ef
            com.hw.videoprocessor.util.c.k(r5, r6)     // Catch: java.lang.Throwable -> L3ef
            if (r15 != 0) goto L499
            int r5 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r5 == 0) goto L499
            long r5 = r9.presentationTimeUs     // Catch: java.lang.Throwable -> L3ef
            r28 = r5
            long r5 = (long) r3     // Catch: java.lang.Throwable -> L3ef
            long r5 = r5 + r7
            int r12 = (r28 > r5 ? 1 : (r28 == r5 ? 0 : -1))
            if (r12 >= 0) goto L499
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3ef
            r5.<init>()     // Catch: java.lang.Throwable -> L3ef
            java.lang.String r6 = "audio 时间戳错误，lastAudioFrameTimeUs:"
            r5.append(r6)     // Catch: java.lang.Throwable -> L3ef
            r5.append(r7)     // Catch: java.lang.Throwable -> L3ef
            java.lang.String r6 = " info.presentationTimeUs:"
            r5.append(r6)     // Catch: java.lang.Throwable -> L3ef
            r28 = r7
            long r6 = r9.presentationTimeUs     // Catch: java.lang.Throwable -> L3ef
            r5.append(r6)     // Catch: java.lang.Throwable -> L3ef
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L3ef
            r12 = 0
            java.lang.Object[] r6 = new java.lang.Object[r12]     // Catch: java.lang.Throwable -> L3ef
            com.hw.videoprocessor.util.c.f(r5, r6)     // Catch: java.lang.Throwable -> L3ef
            r15 = 1
            goto L49b
        L499:
            r28 = r7
        L49b:
            if (r15 == 0) goto L4bc
            long r5 = (long) r3     // Catch: java.lang.Throwable -> L3ef
            long r7 = r28 + r5
            r9.presentationTimeUs = r7     // Catch: java.lang.Throwable -> L3ef
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3ef
            r5.<init>()     // Catch: java.lang.Throwable -> L3ef
            java.lang.String r6 = "audio 时间戳错误，使用修正的时间戳:"
            r5.append(r6)     // Catch: java.lang.Throwable -> L3ef
            long r6 = r9.presentationTimeUs     // Catch: java.lang.Throwable -> L3ef
            r5.append(r6)     // Catch: java.lang.Throwable -> L3ef
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L3ef
            r12 = 0
            java.lang.Object[] r6 = new java.lang.Object[r12]     // Catch: java.lang.Throwable -> L3ef
            com.hw.videoprocessor.util.c.f(r5, r6)     // Catch: java.lang.Throwable -> L3ef
            r15 = 0
        L4bc:
            int r5 = r9.flags     // Catch: java.lang.Throwable -> L3ef
            r6 = 2
            if (r5 == r6) goto L4c8
            long r7 = r9.presentationTimeUs     // Catch: java.lang.Throwable -> L3ef
        L4c3:
            r5 = r39
            r12 = r40
            goto L4cb
        L4c8:
            r7 = r28
            goto L4c3
        L4cb:
            r5.writeSampleData(r12, r11, r9)     // Catch: java.lang.Throwable -> L3ef
            if (r0 == 0) goto L505
            r28 = r7
            long r6 = r9.presentationTimeUs     // Catch: java.lang.Throwable -> L3ef
            int r8 = r25.intValue()     // Catch: java.lang.Throwable -> L3ef
            r30 = r2
            r21 = r3
            long r2 = (long) r8     // Catch: java.lang.Throwable -> L3ef
            long r6 = r6 - r2
            float r2 = (float) r6     // Catch: java.lang.Throwable -> L3ef
            if (r42 != 0) goto L4e3
            r6 = r13
            goto L4ed
        L4e3:
            int r3 = r42.intValue()     // Catch: java.lang.Throwable -> L3ef
            int r6 = r25.intValue()     // Catch: java.lang.Throwable -> L3ef
            int r3 = r3 - r6
            long r6 = (long) r3     // Catch: java.lang.Throwable -> L3ef
        L4ed:
            float r3 = (float) r6     // Catch: java.lang.Throwable -> L3ef
            float r2 = r2 / r3
            r3 = 0
            int r6 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r6 >= 0) goto L4f5
            r2 = 0
        L4f5:
            r3 = 1065353216(0x3f800000, float:1.0)
            int r6 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r6 <= 0) goto L4fd
            r2 = 1065353216(0x3f800000, float:1.0)
        L4fd:
            float r2 = r2 * r22
            float r2 = r2 + r22
            r0.a(r2)     // Catch: java.lang.Throwable -> L3ef
            goto L50b
        L505:
            r30 = r2
            r21 = r3
            r28 = r7
        L50b:
            r11.clear()     // Catch: java.lang.Throwable -> L3ef
            r11 = 0
            r1.releaseOutputBuffer(r4, r11)     // Catch: java.lang.Throwable -> L3ef
            r7 = r28
        L514:
            r2 = r19
            r6 = r20
            r3 = r21
            r5 = r30
            r11 = 2500(0x9c4, double:1.235E-320)
            goto L3c7
        L520:
            r0 = move-exception
            goto L340
        L523:
            r27.delete()
            r18.delete()
            r38.delete()
            r43.release()
            r1.release()
            throw r0
        L533:
            r1 = r4
            r38 = r7
            r18 = r8
            r43 = r9
            r27.delete()
            r18.delete()
            r38.delete()
            r43.release()
            r1.release()
            return
    }
}
