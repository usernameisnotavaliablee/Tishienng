package com.bxkj.student.v2.ai.fitness;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class LivePreviewActivity extends androidx.appcompat.app.AppCompatActivity implements androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback {
    private static final java.lang.String U = "LivePreviewActivity";
    private static final java.lang.String V = "深蹲";
    private static final java.lang.String W = "开合跳";
    private static final int X = 1;
    private com.bxkj.student.v2.ai.fitness.camera.c O;
    private com.bxkj.student.v2.ai.fitness.camera.CameraSourcePreview P;
    private com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay Q;
    private com.bxkj.student.v2.ai.fitness.data.FitnessModel R;
    private android.widget.Chronometer S;
    private boolean T;

    static {
            r0 = 17460(0x4434, float:2.4467E-41)
            com.stub.StubApp.interface11(r0)
            return
    }

    public LivePreviewActivity() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.O = r0
            com.bxkj.student.v2.ai.fitness.data.FitnessModelConfig r0 = com.bxkj.student.v2.ai.fitness.data.FitnessModelConfig.SQUAT
            com.bxkj.student.v2.ai.fitness.data.FitnessModel r0 = r0.getFitnessModel()
            r1.R = r0
            r0 = 0
            r1.T = r0
            return
    }

    private void L() {
            r2 = this;
            r0 = 2131297108(0x7f090354, float:1.8212152E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            com.bxkj.student.v2.ai.fitness.c r1 = new com.bxkj.student.v2.ai.fitness.c
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            return
    }

    private long M(java.lang.String r11) {
            r10 = this;
            java.lang.String r0 = ":"
            java.lang.String[] r11 = r11.split(r0)
            int r0 = r11.length
            r1 = 2
            r2 = 1000(0x3e8, double:4.94E-321)
            r4 = 1
            r5 = 60000(0xea60, double:2.9644E-319)
            r7 = 0
            if (r0 != r1) goto L23
            r0 = r11[r7]
            long r0 = java.lang.Long.parseLong(r0)
            long r0 = r0 * r5
            r11 = r11[r4]
            long r4 = java.lang.Long.parseLong(r11)
        L1f:
            long r4 = r4 * r2
            long r0 = r0 + r4
            goto L44
        L23:
            int r0 = r11.length
            r1 = 3
            if (r0 != r1) goto L42
            r0 = r11[r7]
            long r0 = java.lang.Long.parseLong(r0)
            r8 = 3600000(0x36ee80, double:1.7786363E-317)
            long r0 = r0 * r8
            r4 = r11[r4]
            long r8 = java.lang.Long.parseLong(r4)
            long r8 = r8 * r5
            long r0 = r0 + r8
            r11 = r11[r7]
            long r4 = java.lang.Long.parseLong(r11)
            goto L1f
        L42:
            r0 = 0
        L44:
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r2 = r2 - r0
            return r2
    }

    private void N(com.bxkj.student.v2.ai.fitness.data.FitnessModel r8) {
            r7 = this;
            com.bxkj.student.v2.ai.fitness.camera.c r0 = r7.O
            if (r0 != 0) goto Ld
            com.bxkj.student.v2.ai.fitness.camera.c r0 = new com.bxkj.student.v2.ai.fitness.camera.c
            com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay r1 = r7.Q
            r0.<init>(r7, r1)
            r7.O = r0
        Ld:
            com.bxkj.student.v2.ai.fitness.camera.c r0 = r7.O     // Catch: java.lang.RuntimeException -> L31
            com.bxkj.student.v2.ai.fitness.posedetector.c r1 = new com.bxkj.student.v2.ai.fitness.posedetector.c     // Catch: java.lang.RuntimeException -> L31
            boolean r4 = r8.e()     // Catch: java.lang.RuntimeException -> L31
            java.lang.String r5 = r8.d()     // Catch: java.lang.RuntimeException -> L31
            java.lang.String r6 = r8.c()     // Catch: java.lang.RuntimeException -> L31
            r3 = 1
            r2 = r7
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.RuntimeException -> L2f
            com.bxkj.student.v2.ai.fitness.b r3 = new com.bxkj.student.v2.ai.fitness.b     // Catch: java.lang.RuntimeException -> L2f
            r3.<init>(r7, r8)     // Catch: java.lang.RuntimeException -> L2f
            com.bxkj.student.v2.ai.fitness.posedetector.c r1 = r1.G(r3)     // Catch: java.lang.RuntimeException -> L2f
            r0.t(r1)     // Catch: java.lang.RuntimeException -> L2f
            return
        L2f:
            r0 = move-exception
            goto L33
        L31:
            r0 = move-exception
            r2 = r7
        L33:
            r8.b()
            android.content.Context r8 = r7.getApplicationContext()
            android.content.Context r8 = com.stub.StubApp.getOrigApplicationContext(r8)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "创建图像处理器失败: "
            r1.append(r3)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 1
            android.widget.Toast r8 = android.widget.Toast.makeText(r8, r0, r1)
            r8.show()
            return
    }

    private /* synthetic */ void O(android.view.View r2) {
            r1 = this;
            com.bxkj.student.v2.ai.fitness.camera.c r2 = r1.O
            if (r2 == 0) goto L17
            int r2 = r2.m()
            if (r2 != 0) goto L11
            com.bxkj.student.v2.ai.fitness.camera.c r2 = r1.O
            r0 = 1
            r2.s(r0)
            goto L17
        L11:
            com.bxkj.student.v2.ai.fitness.camera.c r2 = r1.O
            r0 = 0
            r2.s(r0)
        L17:
            com.bxkj.student.v2.ai.fitness.camera.CameraSourcePreview r2 = r1.P
            r2.h()
            r1.R()
            return
    }

    private /* synthetic */ void P(com.bxkj.student.v2.ai.fitness.data.FitnessModel r5, java.util.List r6) {
            r4 = this;
            boolean r0 = r5.e()
            if (r0 == 0) goto L7
            goto Le
        L7:
            int r0 = r6.size()
            r1 = 2
            if (r0 >= r1) goto Lf
        Le:
            return
        Lf:
            r0 = 0
            java.lang.Object r1 = r6.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            r2 = 1
            java.lang.Object r6 = r6.get(r2)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r5 = r5.c()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L57
            int r5 = java.lang.Integer.parseInt(r6)
            r3 = 100
            if (r5 < r3) goto L57
            boolean r5 = r4.T
            if (r5 != 0) goto L5e
            r4.T = r2
            android.media.ToneGenerator r5 = new android.media.ToneGenerator
            r0 = 5
            r5.<init>(r0, r3)
            r0 = 24
            r5.startTone(r0)
            android.widget.Chronometer r5 = r4.S
            java.lang.CharSequence r0 = r5.getText()
            java.lang.String r0 = r0.toString()
            long r2 = r4.M(r0)
            r5.setBase(r2)
            android.widget.Chronometer r5 = r4.S
            r5.start()
            goto L5e
        L57:
            r4.T = r0
            android.widget.Chronometer r5 = r4.S
            r5.stop()
        L5e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "分类结果："
            r5.append(r0)
            r5.append(r1)
            java.lang.String r0 = " 置信度："
            r5.append(r0)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.orhanobut.logger.j.c(r5)
            return
    }

    private /* synthetic */ void Q(android.view.View r1) {
            r0 = this;
            r0.finish()
            return
    }

    private void R() {
            r3 = this;
            com.bxkj.student.v2.ai.fitness.camera.c r0 = r3.O
            if (r0 == 0) goto L14
            com.bxkj.student.v2.ai.fitness.camera.CameraSourcePreview r1 = r3.P     // Catch: java.io.IOException -> Lc
            com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay r2 = r3.Q     // Catch: java.io.IOException -> Lc
            r1.f(r0, r2)     // Catch: java.io.IOException -> Lc
            return
        Lc:
            com.bxkj.student.v2.ai.fitness.camera.c r0 = r3.O
            r0.p()
            r0 = 0
            r3.O = r0
        L14:
            return
    }

    public static /* synthetic */ void e(com.bxkj.student.v2.ai.fitness.LivePreviewActivity r0, com.bxkj.student.v2.ai.fitness.data.FitnessModel r1, java.util.List r2) {
            r0.P(r1, r2)
            return
    }

    public static /* synthetic */ void f(com.bxkj.student.v2.ai.fitness.LivePreviewActivity r0, android.view.View r1) {
            r0.O(r1)
            return
    }

    public static /* synthetic */ void g(com.bxkj.student.v2.ai.fitness.LivePreviewActivity r0, android.view.View r1) {
            r0.Q(r1)
            return
    }

    protected native void onCreate(android.os.Bundle r1);

    public void onDestroy() {
            r2 = this;
            super.onDestroy()
            com.bxkj.student.v2.ai.fitness.camera.c r0 = r2.O
            if (r0 == 0) goto La
            r0.p()
        La:
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.google.mlkit.common.internal.MlKitComponentDiscoveryService> r1 = com.google.mlkit.common.internal.MlKitComponentDiscoveryService.class
            r0.<init>(r2, r1)
            r2.stopService(r0)
            java.lang.String r0 = "MlKitComponentDiscoveryService----------stop"
            com.orhanobut.logger.j.c(r0)
            r0 = 0
            com.google.mlkit.common.sdkinternal.MlKitContext.initializeIfNeeded(r0)
            android.widget.Chronometer r0 = r2.S
            r0.stop()
            return
    }

    protected void onPause() {
            r1 = this;
            super/*androidx.fragment.app.FragmentActivity*/.onPause()
            com.bxkj.student.v2.ai.fitness.camera.CameraSourcePreview r0 = r1.P
            r0.h()
            return
    }

    public void onResume() {
            r1 = this;
            super/*androidx.fragment.app.FragmentActivity*/.onResume()
            com.bxkj.student.v2.ai.fitness.data.FitnessModel r0 = r1.R
            r1.N(r0)
            r1.R()
            return
    }
}
