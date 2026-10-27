package com.bxkj.student.v2.ai.fitness.camera;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class b extends com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay.a {
    private final android.graphics.Bitmap b;

    public b(com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay r1, android.graphics.Bitmap r2) {
            r0 = this;
            r0.<init>(r1)
            r0.b = r2
            return
    }

    @Override // com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay.a
    public void a(android.graphics.Canvas r4) {
            r3 = this;
            android.graphics.Bitmap r0 = r3.b
            android.graphics.Matrix r1 = r3.c()
            r2 = 0
            r4.drawBitmap(r0, r1, r2)
            return
    }
}
