package com.bxkj.student.v2.ai.fitness.camera;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class CameraSourcePreview extends android.view.ViewGroup {
    private static final java.lang.String g = "MIDemoApp:Preview";
    private final android.content.Context a;
    private final android.view.SurfaceView b;
    private boolean c;
    private boolean d;
    private com.bxkj.student.v2.ai.fitness.camera.c e;
    private com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay f;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class a implements android.view.SurfaceHolder.Callback {
        final /* synthetic */ com.bxkj.student.v2.ai.fitness.camera.CameraSourcePreview a;

        private a(com.bxkj.student.v2.ai.fitness.camera.CameraSourcePreview r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ a(com.bxkj.student.v2.ai.fitness.camera.CameraSourcePreview r1, com.bxkj.student.v2.ai.fitness.camera.e r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(android.view.SurfaceHolder r1, int r2, int r3, int r4) {
                r0 = this;
                return
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(android.view.SurfaceHolder r2) {
                r1 = this;
                com.bxkj.student.v2.ai.fitness.camera.CameraSourcePreview r2 = r1.a
                r0 = 1
                com.bxkj.student.v2.ai.fitness.camera.CameraSourcePreview.a(r2, r0)
                com.bxkj.student.v2.ai.fitness.camera.CameraSourcePreview r2 = r1.a     // Catch: java.io.IOException -> Lb
                com.bxkj.student.v2.ai.fitness.camera.CameraSourcePreview.b(r2)     // Catch: java.io.IOException -> Lb
            Lb:
                return
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(android.view.SurfaceHolder r2) {
                r1 = this;
                com.bxkj.student.v2.ai.fitness.camera.CameraSourcePreview r2 = r1.a
                r0 = 0
                com.bxkj.student.v2.ai.fitness.camera.CameraSourcePreview.a(r2, r0)
                return
        }
    }

    public CameraSourcePreview(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r2.<init>(r3, r4)
            r2.a = r3
            r4 = 0
            r2.c = r4
            r2.d = r4
            android.view.SurfaceView r4 = new android.view.SurfaceView
            r4.<init>(r3)
            r2.b = r4
            android.view.SurfaceHolder r3 = r4.getHolder()
            com.bxkj.student.v2.ai.fitness.camera.CameraSourcePreview$a r0 = new com.bxkj.student.v2.ai.fitness.camera.CameraSourcePreview$a
            r1 = 0
            r0.<init>(r2, r1)
            r3.addCallback(r0)
            r2.addView(r4)
            return
    }

    static /* bridge */ /* synthetic */ void a(com.bxkj.student.v2.ai.fitness.camera.CameraSourcePreview r0, boolean r1) {
            r0.d = r1
            return
    }

    static /* bridge */ /* synthetic */ void b(com.bxkj.student.v2.ai.fitness.camera.CameraSourcePreview r0) {
            r0.g()
            return
    }

    private boolean c() {
            r3 = this;
            android.content.Context r0 = r3.a
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.orientation
            r1 = 2
            r2 = 0
            if (r0 != r1) goto L11
            return r2
        L11:
            r1 = 1
            if (r0 != r1) goto L15
            return r1
        L15:
            return r2
    }

    private void e(com.bxkj.student.v2.ai.fitness.camera.c r1) throws java.io.IOException {
            r0 = this;
            r0.e = r1
            if (r1 == 0) goto La
            r1 = 1
            r0.c = r1
            r0.g()
        La:
            return
    }

    private void g() throws java.io.IOException, java.lang.SecurityException {
            r5 = this;
            boolean r0 = r5.c
            if (r0 == 0) goto L6a
            boolean r0 = r5.d
            if (r0 == 0) goto L6a
            android.content.Context r0 = r5.a
            boolean r0 = com.bxkj.student.v2.ai.fitness.preference.a.d(r0)
            if (r0 == 0) goto L1c
            com.bxkj.student.v2.ai.fitness.camera.c r0 = r5.e
            android.view.SurfaceView r1 = r5.b
            android.view.SurfaceHolder r1 = r1.getHolder()
            r0.w(r1)
            goto L21
        L1c:
            com.bxkj.student.v2.ai.fitness.camera.c r0 = r5.e
            r0.v()
        L21:
            r5.requestLayout()
            com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay r0 = r5.f
            r1 = 0
            if (r0 == 0) goto L68
            com.bxkj.student.v2.ai.fitness.camera.c r0 = r5.e
            com.google.android.gms.common.images.Size r0 = r0.o()
            int r2 = r0.getWidth()
            int r3 = r0.getHeight()
            int r2 = java.lang.Math.min(r2, r3)
            int r3 = r0.getWidth()
            int r0 = r0.getHeight()
            int r0 = java.lang.Math.max(r3, r0)
            com.bxkj.student.v2.ai.fitness.camera.c r3 = r5.e
            int r3 = r3.m()
            r4 = 1
            if (r3 != r4) goto L51
            goto L52
        L51:
            r4 = 0
        L52:
            boolean r3 = r5.c()
            if (r3 == 0) goto L5e
            com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay r3 = r5.f
            r3.k(r2, r0, r4)
            goto L63
        L5e:
            com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay r3 = r5.f
            r3.k(r0, r2, r4)
        L63:
            com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay r0 = r5.f
            r0.h()
        L68:
            r5.c = r1
        L6a:
            return
    }

    public void d() {
            r1 = this;
            com.bxkj.student.v2.ai.fitness.camera.c r0 = r1.e
            if (r0 == 0) goto La
            r0.p()
            r0 = 0
            r1.e = r0
        La:
            android.view.SurfaceView r0 = r1.b
            android.view.SurfaceHolder r0 = r0.getHolder()
            android.view.Surface r0 = r0.getSurface()
            r0.release()
            return
    }

    public void f(com.bxkj.student.v2.ai.fitness.camera.c r1, com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay r2) throws java.io.IOException {
            r0 = this;
            r0.f = r2
            r0.e(r1)
            return
    }

    public void h() {
            r1 = this;
            com.bxkj.student.v2.ai.fitness.camera.c r0 = r1.e
            if (r0 == 0) goto L7
            r0.x()
        L7:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r4, int r5, int r6, int r7, int r8) {
            r3 = this;
            com.bxkj.student.v2.ai.fitness.camera.c r4 = r3.e
            if (r4 == 0) goto L13
            com.google.android.gms.common.images.Size r4 = r4.o()
            if (r4 == 0) goto L13
            int r0 = r4.getWidth()
            int r4 = r4.getHeight()
            goto L17
        L13:
            r0 = 320(0x140, float:4.48E-43)
            r4 = 240(0xf0, float:3.36E-43)
        L17:
            boolean r1 = r3.c()
            if (r1 == 0) goto L1e
            goto L21
        L1e:
            r2 = r0
            r0 = r4
            r4 = r2
        L21:
            float r4 = (float) r4
            float r0 = (float) r0
            float r4 = r4 / r0
            int r7 = r7 - r5
            int r8 = r8 - r6
            float r5 = (float) r7
            float r6 = (float) r8
            float r0 = r5 / r6
            r1 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L3d
            float r4 = r4 * r6
            float r4 = r4 - r5
            int r4 = (int) r4
            int r4 = r4 / 2
            android.view.SurfaceView r5 = r3.b
            int r6 = -r4
            int r7 = r7 + r4
            r5.layout(r6, r1, r7, r8)
            return
        L3d:
            float r5 = r5 / r4
            float r5 = r5 - r6
            int r4 = (int) r5
            int r4 = r4 / 2
            android.view.SurfaceView r5 = r3.b
            int r6 = -r4
            int r8 = r8 + r4
            r5.layout(r1, r6, r7, r8)
            return
    }
}
