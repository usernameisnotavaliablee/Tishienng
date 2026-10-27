package com.bxkj.student.v2.ai.fitness.camera;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class i extends com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay.a {
    private static final int h = -1;
    private static final float i = 60.0f;
    private final android.graphics.Paint b;
    private final com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay c;
    private final long d;
    private final long e;

    @androidx.annotation.Nullable
    private final java.lang.Integer f;
    private boolean g;

    public i(com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay r8) {
            r7 = this;
            r4 = 0
            r6 = 0
            r2 = 0
            r0 = r7
            r1 = r8
            r0.<init>(r1, r2, r4, r6)
            r8 = 0
            r0.g = r8
            return
    }

    public i(com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay r2, long r3, long r5, @androidx.annotation.Nullable java.lang.Integer r7) {
            r1 = this;
            r1.<init>(r2)
            r0 = 1
            r1.g = r0
            r1.c = r2
            r1.d = r3
            r1.e = r5
            r1.f = r7
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r1.b = r2
            r3 = -1
            r2.setColor(r3)
            r3 = 1114636288(0x42700000, float:60.0)
            r2.setTextSize(r3)
            r3 = 0
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r5 = 1084227584(0x40a00000, float:5.0)
            r2.setShadowLayer(r5, r3, r3, r4)
            r1.e()
            return
    }

    @Override // com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay.a
    public synchronized void a(android.graphics.Canvas r6) {
            r5 = this;
            monitor-enter(r5)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L63
            r0.<init>()     // Catch: java.lang.Throwable -> L63
            java.lang.String r1 = "InputImage size: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L63
            com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay r1 = r5.c     // Catch: java.lang.Throwable -> L63
            int r1 = r1.getImageHeight()     // Catch: java.lang.Throwable -> L63
            r0.append(r1)     // Catch: java.lang.Throwable -> L63
            java.lang.String r1 = "x"
            r0.append(r1)     // Catch: java.lang.Throwable -> L63
            com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay r1 = r5.c     // Catch: java.lang.Throwable -> L63
            int r1 = r1.getImageWidth()     // Catch: java.lang.Throwable -> L63
            r0.append(r1)     // Catch: java.lang.Throwable -> L63
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L63
            android.graphics.Paint r1 = r5.b     // Catch: java.lang.Throwable -> L63
            r2 = 1106247680(0x41f00000, float:30.0)
            r3 = 1119092736(0x42b40000, float:90.0)
            r6.drawText(r0, r2, r3, r1)     // Catch: java.lang.Throwable -> L63
            boolean r0 = r5.g     // Catch: java.lang.Throwable -> L63
            if (r0 != 0) goto L35
            monitor-exit(r5)
            return
        L35:
            java.lang.Integer r0 = r5.f     // Catch: java.lang.Throwable -> L63
            r1 = 1125515264(0x43160000, float:150.0)
            if (r0 == 0) goto L65
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L63
            r0.<init>()     // Catch: java.lang.Throwable -> L63
            java.lang.String r3 = "FPS: "
            r0.append(r3)     // Catch: java.lang.Throwable -> L63
            java.lang.Integer r3 = r5.f     // Catch: java.lang.Throwable -> L63
            r0.append(r3)     // Catch: java.lang.Throwable -> L63
            java.lang.String r3 = ", Frame latency: "
            r0.append(r3)     // Catch: java.lang.Throwable -> L63
            long r3 = r5.d     // Catch: java.lang.Throwable -> L63
            r0.append(r3)     // Catch: java.lang.Throwable -> L63
            java.lang.String r3 = " ms"
            r0.append(r3)     // Catch: java.lang.Throwable -> L63
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L63
            android.graphics.Paint r3 = r5.b     // Catch: java.lang.Throwable -> L63
            r6.drawText(r0, r2, r1, r3)     // Catch: java.lang.Throwable -> L63
            goto L82
        L63:
            r6 = move-exception
            goto L8d
        L65:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L63
            r0.<init>()     // Catch: java.lang.Throwable -> L63
            java.lang.String r3 = "Frame latency: "
            r0.append(r3)     // Catch: java.lang.Throwable -> L63
            long r3 = r5.d     // Catch: java.lang.Throwable -> L63
            r0.append(r3)     // Catch: java.lang.Throwable -> L63
            java.lang.String r3 = " ms"
            r0.append(r3)     // Catch: java.lang.Throwable -> L63
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L63
            android.graphics.Paint r3 = r5.b     // Catch: java.lang.Throwable -> L63
            r6.drawText(r0, r2, r1, r3)     // Catch: java.lang.Throwable -> L63
        L82:
            java.lang.String r0 = "AI FITNESS"
            android.graphics.Paint r1 = r5.b     // Catch: java.lang.Throwable -> L63
            r3 = 1129447424(0x43520000, float:210.0)
            r6.drawText(r0, r2, r3, r1)     // Catch: java.lang.Throwable -> L63
            monitor-exit(r5)
            return
        L8d:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L63
            throw r6
    }
}
