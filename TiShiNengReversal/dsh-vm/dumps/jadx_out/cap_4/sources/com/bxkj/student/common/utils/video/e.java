package com.bxkj.student.common.utils.video;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class e {
    private com.bxkj.student.common.utils.video.e.b a;
    private android.os.Handler b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends android.os.Handler {
        final /* synthetic */ com.bxkj.student.common.utils.video.e a;

        a(com.bxkj.student.common.utils.video.e r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r3) {
                r2 = this;
                super.handleMessage(r3)
                int r0 = r3.what
                if (r0 != 0) goto L19
                com.bxkj.student.common.utils.video.e r3 = r2.a
                com.bxkj.student.common.utils.video.e$b r3 = com.bxkj.student.common.utils.video.e.c(r3)
                if (r3 == 0) goto L5c
                com.bxkj.student.common.utils.video.e r3 = r2.a
                com.bxkj.student.common.utils.video.e$b r3 = com.bxkj.student.common.utils.video.e.c(r3)
                r3.onStart()
                return
            L19:
                r1 = 1
                if (r0 != r1) goto L30
                com.bxkj.student.common.utils.video.e r0 = r2.a
                com.bxkj.student.common.utils.video.e$b r0 = com.bxkj.student.common.utils.video.e.c(r0)
                if (r0 == 0) goto L5c
                com.bxkj.student.common.utils.video.e r0 = r2.a
                com.bxkj.student.common.utils.video.e$b r0 = com.bxkj.student.common.utils.video.e.c(r0)
                int r3 = r3.arg1
                r0.b(r3)
                return
            L30:
                r1 = 2
                if (r0 != r1) goto L4b
                com.bxkj.student.common.utils.video.e r0 = r2.a
                com.bxkj.student.common.utils.video.e$b r0 = com.bxkj.student.common.utils.video.e.c(r0)
                if (r0 == 0) goto L5c
                com.bxkj.student.common.utils.video.e r0 = r2.a
                com.bxkj.student.common.utils.video.e$b r0 = com.bxkj.student.common.utils.video.e.c(r0)
                java.lang.Object r3 = r3.obj
                java.lang.String r3 = r3.toString()
                r0.onSuccess(r3)
                return
            L4b:
                com.bxkj.student.common.utils.video.e r3 = r2.a
                com.bxkj.student.common.utils.video.e$b r3 = com.bxkj.student.common.utils.video.e.c(r3)
                if (r3 == 0) goto L5c
                com.bxkj.student.common.utils.video.e r3 = r2.a
                com.bxkj.student.common.utils.video.e$b r3 = com.bxkj.student.common.utils.video.e.c(r3)
                r3.a()
            L5c:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b {
        void a();

        void b(int r1);

        void onStart();

        void onSuccess(java.lang.String r1);
    }

    public e() {
            r1 = this;
            r1.<init>()
            com.bxkj.student.common.utils.video.e$a r0 = new com.bxkj.student.common.utils.video.e$a
            r0.<init>(r1)
            r1.b = r0
            return
    }

    public static /* synthetic */ void a(com.bxkj.student.common.utils.video.e r0, java.lang.String r1, android.content.Context r2, java.lang.String r3, java.io.File r4) {
            r0.f(r1, r2, r3, r4)
            return
    }

    public static /* synthetic */ void b(com.bxkj.student.common.utils.video.e r0, float r1) {
            r0.e(r1)
            return
    }

    static /* bridge */ /* synthetic */ com.bxkj.student.common.utils.video.e.b c(com.bxkj.student.common.utils.video.e r0) {
            com.bxkj.student.common.utils.video.e$b r0 = r0.a
            return r0
    }

    private /* synthetic */ void e(float r3) {
            r2 = this;
            android.os.Message r0 = new android.os.Message
            r0.<init>()
            r1 = 1
            r0.what = r1
            r1 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 * r1
            int r3 = (int) r3
            r0.arg1 = r3
            android.os.Handler r3 = r2.b
            r3.sendMessage(r0)
            return
    }

    private /* synthetic */ void f(java.lang.String r7, android.content.Context r8, java.lang.String r9, java.io.File r10) {
            r6 = this;
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L8c
            android.os.Handler r2 = r6.b     // Catch: java.lang.Exception -> L8c
            r3 = 0
            r2.sendEmptyMessage(r3)     // Catch: java.lang.Exception -> L8c
            android.media.MediaMetadataRetriever r2 = new android.media.MediaMetadataRetriever     // Catch: java.lang.Exception -> L8c
            r2.<init>()     // Catch: java.lang.Exception -> L8c
            r2.setDataSource(r7)     // Catch: java.lang.Exception -> L8c
            r3 = 18
            java.lang.String r3 = r2.extractMetadata(r3)     // Catch: java.lang.Exception -> L8c
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.Exception -> L8c
            r4 = 19
            java.lang.String r2 = r2.extractMetadata(r4)     // Catch: java.lang.Exception -> L8c
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Exception -> L8c
            r4 = 720(0x2d0, float:1.009E-42)
            r5 = 1280(0x500, float:1.794E-42)
            if (r3 <= r2) goto L30
            r4 = 1280(0x500, float:1.794E-42)
            r5 = 720(0x2d0, float:1.009E-42)
        L30:
            com.hw.videoprocessor.h$c r8 = com.hw.videoprocessor.h.f(r8)     // Catch: java.lang.Exception -> L8c
            com.hw.videoprocessor.h$c r7 = r8.v(r7)     // Catch: java.lang.Exception -> L8c
            com.hw.videoprocessor.h$c r7 = r7.y(r9)     // Catch: java.lang.Exception -> L8c
            com.hw.videoprocessor.h$c r7 = r7.x(r4)     // Catch: java.lang.Exception -> L8c
            com.hw.videoprocessor.h$c r7 = r7.w(r5)     // Catch: java.lang.Exception -> L8c
            r8 = 600000(0x927c0, float:8.40779E-40)
            com.hw.videoprocessor.h$c r7 = r7.p(r8)     // Catch: java.lang.Exception -> L8c
            com.bxkj.student.common.utils.video.d r8 = new com.bxkj.student.common.utils.video.d     // Catch: java.lang.Exception -> L8c
            r8.<init>(r6)     // Catch: java.lang.Exception -> L8c
            com.hw.videoprocessor.h$c r7 = r7.A(r8)     // Catch: java.lang.Exception -> L8c
            r7.z()     // Catch: java.lang.Exception -> L8c
            android.os.Message r7 = new android.os.Message     // Catch: java.lang.Exception -> L8c
            r7.<init>()     // Catch: java.lang.Exception -> L8c
            r8 = 2
            r7.what = r8     // Catch: java.lang.Exception -> L8c
            java.lang.String r8 = r10.getPath()     // Catch: java.lang.Exception -> L8c
            r7.obj = r8     // Catch: java.lang.Exception -> L8c
            android.os.Handler r8 = r6.b     // Catch: java.lang.Exception -> L8c
            r8.sendMessage(r7)     // Catch: java.lang.Exception -> L8c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L8c
            r7.<init>()     // Catch: java.lang.Exception -> L8c
            java.lang.String r8 = "本次压缩共耗时"
            r7.append(r8)     // Catch: java.lang.Exception -> L8c
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L8c
            long r8 = r8 - r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 / r0
            r7.append(r8)     // Catch: java.lang.Exception -> L8c
            java.lang.String r8 = "秒"
            r7.append(r8)     // Catch: java.lang.Exception -> L8c
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> L8c
            com.orhanobut.logger.j.c(r7)     // Catch: java.lang.Exception -> L8c
            return
        L8c:
            android.os.Handler r7 = r6.b
            r8 = 3
            r7.sendEmptyMessage(r8)
            return
    }

    public void d(android.content.Context r8, java.lang.String r9, com.bxkj.student.common.utils.video.e.b r10) {
            r7 = this;
            java.io.File r0 = new java.io.File
            r0.<init>(r9)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L1a
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r9 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            r9.<init>(r8)
            java.lang.String r8 = "您选取的该视频文件不存在,请重新选取"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r8 = r9.setMessage(r8)
            r8.show()
            return
        L1a:
            r7.a = r10
            java.io.File r10 = new java.io.File
            java.io.File r0 = r8.getCacheDir()
            java.lang.String r1 = "video"
            r10.<init>(r0, r1)
            boolean r0 = r10.exists()
            if (r0 != 0) goto L30
            r10.mkdirs()
        L30:
            java.io.File r6 = new java.io.File
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "scale_video"
            r0.append(r1)
            java.lang.String r1 = ".mp4"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r10, r0)
            boolean r10 = r6.exists()
            if (r10 == 0) goto L54
            r6.delete()     // Catch: java.lang.Exception -> L54
            r6.createNewFile()     // Catch: java.lang.Exception -> L54
        L54:
            java.lang.String r5 = r6.getAbsolutePath()
            java.util.concurrent.ExecutorService r10 = java.util.concurrent.Executors.newSingleThreadExecutor()
            com.bxkj.student.common.utils.video.c r1 = new com.bxkj.student.common.utils.video.c
            r2 = r7
            r4 = r8
            r3 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            r10.execute(r1)
            return
    }
}
