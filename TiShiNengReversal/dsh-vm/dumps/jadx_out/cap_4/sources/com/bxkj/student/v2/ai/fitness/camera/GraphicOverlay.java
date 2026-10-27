package com.bxkj.student.v2.ai.fitness.camera;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class GraphicOverlay extends android.view.View {
    private final java.lang.Object a;
    private final java.util.List<com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay.a> b;
    private final android.graphics.Matrix c;
    private int d;
    private int e;
    private float f;
    private float g;
    private float h;
    private boolean i;
    private boolean j;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class a {
        private com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay a;

        public a(com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        public abstract void a(android.graphics.Canvas r1);

        public android.content.Context b() {
                r1 = this;
                com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay r0 = r1.a
                android.content.Context r0 = r0.getContext()
                android.content.Context r0 = r0.getApplicationContext()
                android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
                return r0
        }

        public android.graphics.Matrix c() {
                r1 = this;
                com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay r0 = r1.a
                android.graphics.Matrix r0 = com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay.f(r0)
                return r0
        }

        public boolean d() {
                r1 = this;
                com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay r0 = r1.a
                boolean r0 = com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay.b(r0)
                return r0
        }

        public void e() {
                r1 = this;
                com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay r0 = r1.a
                r0.postInvalidate()
                return
        }

        public float f(float r2) {
                r1 = this;
                com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay r0 = r1.a
                float r0 = com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay.e(r0)
                float r2 = r2 * r0
                return r2
        }

        public float g(float r3) {
                r2 = this;
                com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay r0 = r2.a
                boolean r0 = com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay.b(r0)
                if (r0 == 0) goto L1c
                com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay r0 = r2.a
                int r0 = r0.getWidth()
                float r0 = (float) r0
                float r3 = r2.f(r3)
                com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay r1 = r2.a
                float r1 = com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay.d(r1)
                float r3 = r3 - r1
                float r0 = r0 - r3
                return r0
            L1c:
                float r3 = r2.f(r3)
                com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay r0 = r2.a
                float r0 = com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay.d(r0)
                float r3 = r3 - r0
                return r3
        }

        public float h(float r2) {
                r1 = this;
                float r2 = r1.f(r2)
                com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay r0 = r1.a
                float r0 = com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay.c(r0)
                float r2 = r2 - r0
                return r2
        }
    }

    public GraphicOverlay(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.a = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.b = r1
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r0.c = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.f = r1
            r1 = 1
            r0.j = r1
            com.bxkj.student.v2.ai.fitness.camera.h r1 = new com.bxkj.student.v2.ai.fitness.camera.h
            r1.<init>(r0)
            r0.addOnLayoutChangeListener(r1)
            return
    }

    public static /* synthetic */ void a(com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay r0, android.view.View r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
            r0.i(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    static /* bridge */ /* synthetic */ boolean b(com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay r0) {
            boolean r0 = r0.i
            return r0
    }

    static /* bridge */ /* synthetic */ float c(com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay r0) {
            float r0 = r0.h
            return r0
    }

    static /* bridge */ /* synthetic */ float d(com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay r0) {
            float r0 = r0.g
            return r0
    }

    static /* bridge */ /* synthetic */ float e(com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay r0) {
            float r0 = r0.f
            return r0
    }

    static /* bridge */ /* synthetic */ android.graphics.Matrix f(com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay r0) {
            android.graphics.Matrix r0 = r0.c
            return r0
    }

    private /* synthetic */ void i(android.view.View r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
            r0 = this;
            r1 = 1
            r0.j = r1
            return
    }

    private void l() {
            r5 = this;
            boolean r0 = r5.j
            if (r0 == 0) goto L94
            int r0 = r5.d
            if (r0 <= 0) goto L94
            int r0 = r5.e
            if (r0 > 0) goto Le
            goto L94
        Le:
            int r0 = r5.getWidth()
            float r0 = (float) r0
            int r1 = r5.getHeight()
            float r1 = (float) r1
            float r0 = r0 / r1
            int r1 = r5.d
            float r1 = (float) r1
            int r2 = r5.e
            float r2 = (float) r2
            float r1 = r1 / r2
            r2 = 0
            r5.g = r2
            r5.h = r2
            r2 = 1073741824(0x40000000, float:2.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L46
            int r0 = r5.getWidth()
            float r0 = (float) r0
            int r3 = r5.d
            float r3 = (float) r3
            float r0 = r0 / r3
            r5.f = r0
            int r0 = r5.getWidth()
            float r0 = (float) r0
            float r0 = r0 / r1
            int r1 = r5.getHeight()
            float r1 = (float) r1
            float r0 = r0 - r1
            float r0 = r0 / r2
            r5.h = r0
            goto L61
        L46:
            int r0 = r5.getHeight()
            float r0 = (float) r0
            int r3 = r5.e
            float r3 = (float) r3
            float r0 = r0 / r3
            r5.f = r0
            int r0 = r5.getHeight()
            float r0 = (float) r0
            float r0 = r0 * r1
            int r1 = r5.getWidth()
            float r1 = (float) r1
            float r0 = r0 - r1
            float r0 = r0 / r2
            r5.g = r0
        L61:
            android.graphics.Matrix r0 = r5.c
            r0.reset()
            android.graphics.Matrix r0 = r5.c
            float r1 = r5.f
            r0.setScale(r1, r1)
            android.graphics.Matrix r0 = r5.c
            float r1 = r5.g
            float r1 = -r1
            float r3 = r5.h
            float r3 = -r3
            r0.postTranslate(r1, r3)
            boolean r0 = r5.i
            if (r0 == 0) goto L91
            android.graphics.Matrix r0 = r5.c
            int r1 = r5.getWidth()
            float r1 = (float) r1
            float r1 = r1 / r2
            int r3 = r5.getHeight()
            float r3 = (float) r3
            float r3 = r3 / r2
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4 = 1065353216(0x3f800000, float:1.0)
            r0.postScale(r2, r4, r1, r3)
        L91:
            r0 = 0
            r5.j = r0
        L94:
            return
    }

    public void g(com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay.a r3) {
            r2 = this;
            java.lang.Object r0 = r2.a
            monitor-enter(r0)
            java.util.List<com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay$a> r1 = r2.b     // Catch: java.lang.Throwable -> La
            r1.add(r3)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r3
    }

    public int getImageHeight() {
            r1 = this;
            int r0 = r1.e
            return r0
    }

    public int getImageWidth() {
            r1 = this;
            int r0 = r1.d
            return r0
    }

    public void h() {
            r2 = this;
            java.lang.Object r0 = r2.a
            monitor-enter(r0)
            java.util.List<com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay$a> r1 = r2.b     // Catch: java.lang.Throwable -> Ld
            r1.clear()     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            r2.postInvalidate()
            return
        Ld:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
    }

    public void j(com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay.a r3) {
            r2 = this;
            java.lang.Object r0 = r2.a
            monitor-enter(r0)
            java.util.List<com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay$a> r1 = r2.b     // Catch: java.lang.Throwable -> Ld
            r1.remove(r3)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            r2.postInvalidate()
            return
        Ld:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r3
    }

    public void k(int r5, int r6, boolean r7) {
            r4 = this;
            r0 = 0
            r1 = 1
            if (r5 <= 0) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            java.lang.String r3 = "image width must be positive"
            com.google.common.base.Preconditions.checkState(r2, r3)
            if (r6 <= 0) goto Lf
            r0 = 1
        Lf:
            java.lang.String r2 = "image height must be positive"
            com.google.common.base.Preconditions.checkState(r0, r2)
            java.lang.Object r0 = r4.a
            monitor-enter(r0)
            r4.d = r5     // Catch: java.lang.Throwable -> L24
            r4.e = r6     // Catch: java.lang.Throwable -> L24
            r4.i = r7     // Catch: java.lang.Throwable -> L24
            r4.j = r1     // Catch: java.lang.Throwable -> L24
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            r4.postInvalidate()
            return
        L24:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            throw r5
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r4) {
            r3 = this;
            super.onDraw(r4)
            java.lang.Object r0 = r3.a
            monitor-enter(r0)
            r3.l()     // Catch: java.lang.Throwable -> L1f
            java.util.List<com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay$a> r1 = r3.b     // Catch: java.lang.Throwable -> L1f
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1f
        Lf:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L1f
            if (r2 == 0) goto L21
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L1f
            com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay$a r2 = (com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay.a) r2     // Catch: java.lang.Throwable -> L1f
            r2.a(r4)     // Catch: java.lang.Throwable -> L1f
            goto Lf
        L1f:
            r4 = move-exception
            goto L23
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            return
        L23:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            throw r4
    }
}
