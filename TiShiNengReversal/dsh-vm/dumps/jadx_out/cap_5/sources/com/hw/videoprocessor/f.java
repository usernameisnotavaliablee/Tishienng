package com.hw.videoprocessor;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class f {
    public f() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void a(android.content.Context r15, java.lang.String r16, java.lang.String r17, @androidx.annotation.Nullable java.lang.Integer r18, float r19, int r20) throws java.lang.Exception {
            long r1 = java.lang.System.currentTimeMillis()
            java.io.File r3 = new java.io.File
            java.io.File r0 = r15.getCacheDir()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "kichiku_"
            r4.append(r5)
            long r5 = java.lang.System.currentTimeMillis()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r0, r4)
            r3.mkdir()
            if (r18 != 0) goto L44
            android.media.MediaMetadataRetriever r0 = new android.media.MediaMetadataRetriever
            r0.<init>()
            r5 = r16
            r0.setDataSource(r5)
            r4 = 20
            java.lang.String r4 = r0.extractMetadata(r4)
            int r4 = java.lang.Integer.parseInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.release()
            r12 = r4
            goto L48
        L44:
            r5 = r16
            r12 = r18
        L48:
            int r13 = com.hw.videoprocessor.i.d(r5)
            r14 = 0
            java.lang.String r0 = "切割视频+"
            java.lang.Object[] r4 = new java.lang.Object[r14]     // Catch: android.media.MediaCodec.CodecException -> L6c
            com.hw.videoprocessor.util.c.t(r0, r4)     // Catch: android.media.MediaCodec.CodecException -> L6c
            java.lang.String r6 = r3.getAbsolutePath()     // Catch: android.media.MediaCodec.CodecException -> L6c
            java.lang.Integer r9 = java.lang.Integer.valueOf(r13)     // Catch: android.media.MediaCodec.CodecException -> L6c
            java.lang.Integer r11 = java.lang.Integer.valueOf(r14)     // Catch: android.media.MediaCodec.CodecException -> L6c
            r8 = 500(0x1f4, float:7.0E-43)
            r4 = r15
            r10 = r19
            r7 = r20
            java.util.List r15 = com.hw.videoprocessor.i.l(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: android.media.MediaCodec.CodecException -> L6c
            goto L8a
        L6c:
            r0 = move-exception
            com.hw.videoprocessor.util.c.g(r0)
            java.lang.String r6 = r3.getAbsolutePath()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r13)
            r0 = -1
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            r8 = 500(0x1f4, float:7.0E-43)
            r4 = r15
            r5 = r16
            r10 = r19
            r7 = r20
            java.util.List r15 = com.hw.videoprocessor.i.l(r4, r5, r6, r7, r8, r9, r10, r11)
        L8a:
            java.lang.String r0 = "切割视频-"
            java.lang.Object[] r3 = new java.lang.Object[r14]
            com.hw.videoprocessor.util.c.t(r0, r3)
            java.lang.String r0 = "合并视频+"
            java.lang.Object[] r3 = new java.lang.Object[r14]
            com.hw.videoprocessor.util.c.t(r0, r3)
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3 = r17
            com.hw.videoprocessor.i.b(r15, r3, r12, r0)
            java.lang.String r15 = "合并视频-"
            java.lang.Object[] r0 = new java.lang.Object[r14]
            com.hw.videoprocessor.util.c.t(r15, r0)
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r0 = "鬼畜已完成,耗时:"
            r15.append(r0)
            long r3 = r3 - r1
            float r0 = (float) r3
            r1 = 1148846080(0x447a0000, float:1000.0)
            float r0 = r0 / r1
            r15.append(r0)
            java.lang.String r0 = "s"
            r15.append(r0)
            java.lang.String r15 = r15.toString()
            java.lang.Object[] r0 = new java.lang.Object[r14]
            com.hw.videoprocessor.util.c.f(r15, r0)
            return
    }
}
