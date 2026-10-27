package com.bxkj.student.v2.ai.fitness.posedetector;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class c extends com.bxkj.student.v2.ai.fitness.camera.t<com.bxkj.student.v2.ai.fitness.posedetector.c.b> {
    private static final java.lang.String G = "PoseDetectorProcessor";
    private final android.content.Context A;
    private final java.util.concurrent.Executor B;
    private j0.g C;
    private java.lang.String D;
    private java.lang.String[] E;
    private com.bxkj.student.v2.ai.fitness.posedetector.c.a F;

    /* renamed from: u, reason: collision with root package name */
    private final com.google.mlkit.vision.pose.PoseDetector f1325u;

    /* renamed from: v, reason: collision with root package name */
    private final boolean f1326v;

    /* renamed from: w, reason: collision with root package name */
    private final boolean f1327w;

    /* renamed from: x, reason: collision with root package name */
    private final boolean f1328x;

    /* renamed from: y, reason: collision with root package name */
    private final boolean f1329y;

    /* renamed from: z, reason: collision with root package name */
    private final boolean f1330z;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void a(java.util.List<java.lang.String> r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    protected static class b {
        private final com.google.mlkit.vision.pose.Pose a;
        private final java.util.List<java.lang.String> b;

        public b(com.google.mlkit.vision.pose.Pose r1, java.util.List<java.lang.String> r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }

        static /* bridge */ /* synthetic */ java.util.List a(com.bxkj.student.v2.ai.fitness.posedetector.c.b r0) {
                java.util.List<java.lang.String> r0 = r0.b
                return r0
        }

        static /* bridge */ /* synthetic */ com.google.mlkit.vision.pose.Pose b(com.bxkj.student.v2.ai.fitness.posedetector.c.b r0) {
                com.google.mlkit.vision.pose.Pose r0 = r0.a
                return r0
        }

        public java.util.List<java.lang.String> c() {
                r1 = this;
                java.util.List<java.lang.String> r0 = r1.b
                return r0
        }

        public com.google.mlkit.vision.pose.Pose d() {
                r1 = this;
                com.google.mlkit.vision.pose.Pose r0 = r1.a
                return r0
        }
    }

    public c(android.content.Context r3, boolean r4, boolean r5) {
            r2 = this;
            r2.<init>(r3)
            com.google.mlkit.vision.pose.PoseDetectorOptionsBase r0 = com.bxkj.student.v2.ai.fitness.preference.a.c(r3)
            java.util.Objects.toString(r0)
            boolean r1 = com.bxkj.student.v2.ai.fitness.preference.a.j(r3)
            r2.f1326v = r1
            boolean r1 = com.bxkj.student.v2.ai.fitness.preference.a.i(r3)
            r2.f1327w = r1
            boolean r1 = com.bxkj.student.v2.ai.fitness.preference.a.h(r3)
            r2.f1328x = r1
            com.google.mlkit.vision.pose.PoseDetector r0 = com.google.mlkit.vision.pose.PoseDetection.getClient(r0)
            r2.f1325u = r0
            r2.f1329y = r4
            r2.f1330z = r5
            r2.A = r3
            java.util.concurrent.ExecutorService r3 = java.util.concurrent.Executors.newSingleThreadExecutor()
            r2.B = r3
            return
    }

    public c(android.content.Context r1, boolean r2, boolean r3, java.lang.String r4, java.lang.String r5) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.D = r4
            java.lang.String[] r1 = new java.lang.String[]{r5}
            r0.E = r1
            return
    }

    public c(android.content.Context r1, boolean r2, boolean r3, java.lang.String r4, java.lang.String[] r5) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.D = r4
            r0.E = r5
            return
    }

    public static /* synthetic */ com.bxkj.student.v2.ai.fitness.posedetector.c.b B(com.bxkj.student.v2.ai.fitness.posedetector.c r0, com.google.android.gms.tasks.Task r1) {
            com.bxkj.student.v2.ai.fitness.posedetector.c$b r0 = r0.E(r1)
            return r0
    }

    public static /* synthetic */ com.bxkj.student.v2.ai.fitness.posedetector.c.b C(com.bxkj.student.v2.ai.fitness.posedetector.c r0, com.google.android.gms.tasks.Task r1) {
            com.bxkj.student.v2.ai.fitness.posedetector.c$b r0 = r0.D(r1)
            return r0
    }

    private /* synthetic */ com.bxkj.student.v2.ai.fitness.posedetector.c.b D(com.google.android.gms.tasks.Task r6) throws java.lang.Exception {
            r5 = this;
            java.lang.Object r6 = r6.getResult()
            com.google.mlkit.vision.pose.Pose r6 = (com.google.mlkit.vision.pose.Pose) r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = r5.f1329y
            if (r1 == 0) goto L28
            j0.g r0 = r5.C
            if (r0 != 0) goto L22
            j0.g r0 = new j0.g
            android.content.Context r1 = r5.A
            boolean r2 = r5.f1330z
            java.lang.String r3 = r5.D
            java.lang.String[] r4 = r5.E
            r0.<init>(r1, r2, r3, r4)
            r5.C = r0
        L22:
            j0.g r0 = r5.C
            java.util.List r0 = r0.a(r6)
        L28:
            com.bxkj.student.v2.ai.fitness.posedetector.c$b r1 = new com.bxkj.student.v2.ai.fitness.posedetector.c$b
            r1.<init>(r6, r0)
            return r1
    }

    private /* synthetic */ com.bxkj.student.v2.ai.fitness.posedetector.c.b E(com.google.android.gms.tasks.Task r6) throws java.lang.Exception {
            r5 = this;
            java.lang.Object r6 = r6.getResult()
            com.google.mlkit.vision.pose.Pose r6 = (com.google.mlkit.vision.pose.Pose) r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = r5.f1329y
            if (r1 == 0) goto L28
            j0.g r0 = r5.C
            if (r0 != 0) goto L22
            j0.g r0 = new j0.g
            android.content.Context r1 = r5.A
            boolean r2 = r5.f1330z
            java.lang.String r3 = r5.D
            java.lang.String[] r4 = r5.E
            r0.<init>(r1, r2, r3, r4)
            r5.C = r0
        L22:
            j0.g r0 = r5.C
            java.util.List r0 = r0.a(r6)
        L28:
            com.bxkj.student.v2.ai.fitness.posedetector.c$b r1 = new com.bxkj.student.v2.ai.fitness.posedetector.c$b
            r1.<init>(r6, r0)
            return r1
    }

    protected void F(@androidx.annotation.NonNull com.bxkj.student.v2.ai.fitness.posedetector.c.b r10, @androidx.annotation.NonNull com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay r11) {
            r9 = this;
            com.bxkj.student.v2.ai.fitness.posedetector.d r0 = new com.bxkj.student.v2.ai.fitness.posedetector.d
            com.google.mlkit.vision.pose.Pose r2 = com.bxkj.student.v2.ai.fitness.posedetector.c.b.b(r10)
            boolean r3 = r9.f1326v
            boolean r4 = r9.f1327w
            boolean r5 = r9.f1328x
            java.util.List r6 = com.bxkj.student.v2.ai.fitness.posedetector.c.b.a(r10)
            boolean r7 = r9.f1330z
            java.lang.String[] r1 = r9.E
            r8 = 0
            r8 = r1[r8]
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r1.g(r0)
            com.google.mlkit.vision.pose.Pose r11 = r10.d()
            java.util.List r11 = r11.getAllPoseLandmarks()
            boolean r11 = r11.isEmpty()
            if (r11 != 0) goto L37
            com.bxkj.student.v2.ai.fitness.posedetector.c$a r11 = r9.F
            if (r11 == 0) goto L37
            java.util.List r10 = r10.c()
            r11.a(r10)
        L37:
            return
    }

    public com.bxkj.student.v2.ai.fitness.posedetector.c G(com.bxkj.student.v2.ai.fitness.posedetector.c.a r1) {
            r0 = this;
            r0.F = r1
            return r0
    }

    @Override // com.bxkj.student.v2.ai.fitness.camera.t
    protected com.google.android.gms.tasks.Task<com.bxkj.student.v2.ai.fitness.posedetector.c.b> m(com.google.android.odml.image.MlImage r3) {
            r2 = this;
            com.google.mlkit.vision.pose.PoseDetector r0 = r2.f1325u
            com.google.android.gms.tasks.Task r3 = r0.process(r3)
            java.util.concurrent.Executor r0 = r2.B
            com.bxkj.student.v2.ai.fitness.posedetector.b r1 = new com.bxkj.student.v2.ai.fitness.posedetector.b
            r1.<init>(r2)
            com.google.android.gms.tasks.Task r3 = r3.continueWith(r0, r1)
            return r3
    }

    @Override // com.bxkj.student.v2.ai.fitness.camera.t
    protected com.google.android.gms.tasks.Task<com.bxkj.student.v2.ai.fitness.posedetector.c.b> n(com.google.mlkit.vision.common.InputImage r3) {
            r2 = this;
            com.google.mlkit.vision.pose.PoseDetector r0 = r2.f1325u
            com.google.android.gms.tasks.Task r3 = r0.process(r3)
            java.util.concurrent.Executor r0 = r2.B
            com.bxkj.student.v2.ai.fitness.posedetector.a r1 = new com.bxkj.student.v2.ai.fitness.posedetector.a
            r1.<init>(r2)
            com.google.android.gms.tasks.Task r3 = r3.continueWith(r0, r1)
            return r3
    }

    @Override // com.bxkj.student.v2.ai.fitness.camera.t
    protected boolean o(android.content.Context r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    @Override // com.bxkj.student.v2.ai.fitness.camera.t, com.bxkj.student.v2.ai.fitness.camera.m
    public void stop() {
            r1 = this;
            super.stop()
            com.google.mlkit.vision.pose.PoseDetector r0 = r1.f1325u
            r0.close()
            return
    }

    @Override // com.bxkj.student.v2.ai.fitness.camera.t
    protected void t(@androidx.annotation.NonNull java.lang.Exception r1) {
            r0 = this;
            return
    }

    @Override // com.bxkj.student.v2.ai.fitness.camera.t
    protected /* bridge */ /* synthetic */ void u(@androidx.annotation.NonNull com.bxkj.student.v2.ai.fitness.posedetector.c.b r1, @androidx.annotation.NonNull com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay r2) {
            r0 = this;
            com.bxkj.student.v2.ai.fitness.posedetector.c$b r1 = (com.bxkj.student.v2.ai.fitness.posedetector.c.b) r1
            r0.F(r1, r2)
            return
    }
}
