package com.bxkj.student.common.utils.video;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class g {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void a(java.lang.String r1, android.graphics.Bitmap r2);
    }

    public g() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void a(com.bxkj.student.common.utils.video.g r0, com.bxkj.student.common.utils.video.g.a r1, int r2, android.content.Intent r3) {
            r0.d(r1, r2, r3)
            return
    }

    private com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration b(int r4) {
            r3 = this;
            com.jmolsmobile.landscapevideocapture.configuration.PredefinedCaptureConfigurations$CaptureResolution r0 = com.jmolsmobile.landscapevideocapture.configuration.PredefinedCaptureConfigurations.CaptureResolution.RES_720P
            com.jmolsmobile.landscapevideocapture.configuration.PredefinedCaptureConfigurations$CaptureQuality r1 = com.jmolsmobile.landscapevideocapture.configuration.PredefinedCaptureConfigurations.CaptureQuality.HIGH
            com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration$b r2 = new com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration$b
            r2.<init>(r0, r1)
            r2.f()
            r2.c(r4)
            com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration r4 = r2.a()
            return r4
    }

    private android.graphics.Bitmap c(java.lang.String r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            r0 = 2
            android.graphics.Bitmap r2 = android.media.ThumbnailUtils.createVideoThumbnail(r2, r0)
            return r2
    }

    private /* synthetic */ void d(com.bxkj.student.common.utils.video.g.a r2, int r3, android.content.Intent r4) {
            r1 = this;
            r0 = -1
            if (r3 != r0) goto L12
            java.lang.String r3 = "com.jmolsmobile.extraoutputfilename"
            java.lang.String r3 = r4.getStringExtra(r3)
            android.graphics.Bitmap r4 = r1.c(r3)
            if (r2 == 0) goto L12
            r2.a(r3, r4)
        L12:
            return
    }

    public void e(androidx.fragment.app.FragmentActivity r5, int r6, com.bxkj.student.common.utils.video.g.a r7) {
            r4 = this;
            com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration r6 = r4.b(r6)
            java.io.File r0 = new java.io.File
            java.io.File r1 = r5.getCacheDir()
            java.lang.String r2 = "video"
            r0.<init>(r1, r2)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L18
            r0.mkdirs()
        L18:
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "record_video"
            r2.append(r3)
            java.lang.String r3 = ".mp4"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r0, r2)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L3c
            r1.delete()     // Catch: java.lang.Exception -> L3c
            r1.createNewFile()     // Catch: java.lang.Exception -> L3c
        L3c:
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.jmolsmobile.landscapevideocapture.VideoCaptureActivity> r2 = com.jmolsmobile.landscapevideocapture.VideoCaptureActivity.class
            r0.<init>(r5, r2)
            java.lang.String r2 = "com.jmolsmobile.extracaptureconfiguration"
            r0.putExtra(r2, r6)
            java.lang.String r6 = "com.jmolsmobile.extraoutputfilename"
            java.lang.String r1 = r1.getPath()
            r0.putExtra(r6, r1)
            t.b r6 = new t.b
            r6.<init>(r5)
            t.b r5 = r6.startActivityForResult(r0)
            com.bxkj.student.common.utils.video.f r6 = new com.bxkj.student.common.utils.video.f
            r6.<init>(r4, r7)
            r5.c(r6)
            return
    }
}
