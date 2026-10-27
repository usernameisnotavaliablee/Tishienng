package com.bxkj.student.v2.ai.fitness.camera;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class t<T> implements com.bxkj.student.v2.ai.fitness.camera.m {

    /* renamed from: s, reason: collision with root package name */
    protected static final java.lang.String f1316s = "LogTagForTest";

    /* renamed from: t, reason: collision with root package name */
    private static final java.lang.String f1317t = "VisionProcessorBase";
    private final android.app.ActivityManager a;
    private final java.util.Timer b;
    private final com.bxkj.student.v2.ai.fitness.camera.k c;
    private final com.bxkj.student.v2.ai.fitness.camera.l d;
    private boolean e;
    private int f;
    private long g;
    private long h;
    private long i;
    private long j;
    private long k;

    /* renamed from: l, reason: collision with root package name */
    private long f1318l;

    /* renamed from: m, reason: collision with root package name */
    private int f1319m;

    /* renamed from: n, reason: collision with root package name */
    private int f1320n;

    /* renamed from: o, reason: collision with root package name */
    @androidx.annotation.GuardedBy("this")
    private java.nio.ByteBuffer f1321o;

    /* renamed from: p, reason: collision with root package name */
    @androidx.annotation.GuardedBy("this")
    private com.bxkj.student.v2.ai.fitness.camera.f f1322p;

    /* renamed from: q, reason: collision with root package name */
    @androidx.annotation.GuardedBy("this")
    private java.nio.ByteBuffer f1323q;

    /* renamed from: r, reason: collision with root package name */
    @androidx.annotation.GuardedBy("this")
    private com.bxkj.student.v2.ai.fitness.camera.f f1324r;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends java.util.TimerTask {
        final /* synthetic */ com.bxkj.student.v2.ai.fitness.camera.t a;

        a(com.bxkj.student.v2.ai.fitness.camera.t r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
                r2 = this;
                com.bxkj.student.v2.ai.fitness.camera.t r0 = r2.a
                int r1 = com.bxkj.student.v2.ai.fitness.camera.t.j(r0)
                com.bxkj.student.v2.ai.fitness.camera.t.l(r0, r1)
                com.bxkj.student.v2.ai.fitness.camera.t r0 = r2.a
                r1 = 0
                com.bxkj.student.v2.ai.fitness.camera.t.k(r0, r1)
                return
        }
    }

    protected t(android.content.Context r7) {
            r6 = this;
            r6.<init>()
            java.util.Timer r0 = new java.util.Timer
            r0.<init>()
            r6.b = r0
            r1 = 0
            r6.f = r1
            r2 = 0
            r6.g = r2
            r6.h = r2
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6.i = r4
            r6.j = r2
            r6.k = r2
            r6.f1318l = r4
            r6.f1319m = r1
            r6.f1320n = r1
            java.lang.String r1 = "activity"
            java.lang.Object r1 = r7.getSystemService(r1)
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1
            r6.a = r1
            com.bxkj.student.v2.ai.fitness.camera.k r1 = new com.bxkj.student.v2.ai.fitness.camera.k
            java.util.concurrent.Executor r2 = com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD
            r1.<init>(r2)
            r6.c = r1
            com.bxkj.student.v2.ai.fitness.camera.t$a r1 = new com.bxkj.student.v2.ai.fitness.camera.t$a
            r1.<init>(r6)
            r2 = 0
            r4 = 1000(0x3e8, double:4.94E-321)
            r0.scheduleAtFixedRate(r1, r2, r4)
            com.bxkj.student.v2.ai.fitness.camera.l r0 = new com.bxkj.student.v2.ai.fitness.camera.l
            r0.<init>(r7)
            r6.d = r0
            return
    }

    private com.google.android.gms.tasks.Task<T> A(com.google.android.gms.tasks.Task<T> r11, com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay r12, @androidx.annotation.Nullable android.graphics.Bitmap r13, boolean r14, long r15) {
            r10 = this;
            long r4 = android.os.SystemClock.elapsedRealtime()
            com.bxkj.student.v2.ai.fitness.camera.k r9 = r10.c
            com.bxkj.student.v2.ai.fitness.camera.n r0 = new com.bxkj.student.v2.ai.fitness.camera.n
            r1 = r10
            r6 = r12
            r7 = r13
            r8 = r14
            r2 = r15
            r0.<init>(r1, r2, r4, r6, r7, r8)
            com.google.android.gms.tasks.Task r11 = r11.addOnSuccessListener(r9, r0)
            com.bxkj.student.v2.ai.fitness.camera.k r13 = r10.c
            com.bxkj.student.v2.ai.fitness.camera.o r14 = new com.bxkj.student.v2.ai.fitness.camera.o
            r14.<init>(r10, r12)
            com.google.android.gms.tasks.Task r11 = r11.addOnFailureListener(r13, r14)
            return r11
    }

    public static /* synthetic */ void d(androidx.camera.core.ImageProxy r0, com.google.android.gms.tasks.Task r1) {
            r0.close()
            return
    }

    public static /* synthetic */ void e(com.bxkj.student.v2.ai.fitness.camera.t r0, com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay r1, java.lang.Exception r2) {
            r0.s(r1, r2)
            return
    }

    public static /* synthetic */ void f(androidx.camera.core.ImageProxy r0, com.google.android.gms.tasks.Task r1) {
            r0.close()
            return
    }

    public static /* synthetic */ void g(com.bxkj.student.v2.ai.fitness.camera.t r0, long r1, long r3, com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay r5, android.graphics.Bitmap r6, boolean r7, java.lang.Object r8) {
            r0.r(r1, r3, r5, r6, r7, r8)
            return
    }

    public static /* synthetic */ void h(com.bxkj.student.v2.ai.fitness.camera.t r0, com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay r1, java.lang.Object r2) {
            r0.p(r1, r2)
            return
    }

    public static /* synthetic */ void i(com.bxkj.student.v2.ai.fitness.camera.t r0, com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay r1, java.lang.Object r2) {
            r0.q(r1, r2)
            return
    }

    static /* bridge */ /* synthetic */ int j(com.bxkj.student.v2.ai.fitness.camera.t r0) {
            int r0 = r0.f1319m
            return r0
    }

    static /* bridge */ /* synthetic */ void k(com.bxkj.student.v2.ai.fitness.camera.t r0, int r1) {
            r0.f1319m = r1
            return
    }

    static /* bridge */ /* synthetic */ void l(com.bxkj.student.v2.ai.fitness.camera.t r0, int r1) {
            r0.f1320n = r1
            return
    }

    private /* synthetic */ void p(com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay r1, java.lang.Object r2) {
            r0 = this;
            r0.w(r1)
            return
    }

    private /* synthetic */ void q(com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay r1, java.lang.Object r2) {
            r0 = this;
            r0.w(r1)
            return
    }

    private /* synthetic */ void r(long r5, long r7, com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay r9, android.graphics.Bitmap r10, boolean r11, java.lang.Object r12) {
            r4 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r5 = r0 - r5
            long r0 = r0 - r7
            int r7 = r4.f
            r8 = 500(0x1f4, float:7.0E-43)
            if (r7 < r8) goto L10
            r4.z()
        L10:
            int r7 = r4.f
            r8 = 1
            int r7 = r7 + r8
            r4.f = r7
            int r7 = r4.f1319m
            int r7 = r7 + r8
            r4.f1319m = r7
            long r2 = r4.g
            long r2 = r2 + r5
            r4.g = r2
            long r2 = r4.h
            long r2 = java.lang.Math.max(r5, r2)
            r4.h = r2
            long r2 = r4.i
            long r2 = java.lang.Math.min(r5, r2)
            r4.i = r2
            long r2 = r4.j
            long r2 = r2 + r0
            r4.j = r2
            long r2 = r4.k
            long r2 = java.lang.Math.max(r0, r2)
            r4.k = r2
            long r2 = r4.f1318l
            long r2 = java.lang.Math.min(r0, r2)
            r4.f1318l = r2
            int r7 = r4.f1319m
            if (r7 != r8) goto L64
            long r7 = r4.g
            int r2 = r4.f
            long r2 = (long) r2
            long r7 = r7 / r2
            long r7 = r4.j
            int r2 = r4.f
            long r2 = (long) r2
            long r7 = r7 / r2
            android.app.ActivityManager$MemoryInfo r7 = new android.app.ActivityManager$MemoryInfo
            r7.<init>()
            android.app.ActivityManager r8 = r4.a
            r8.getMemoryInfo(r7)
            com.bxkj.student.v2.ai.fitness.camera.l r7 = r4.d
            r7.a()
        L64:
            r9.h()
            if (r10 == 0) goto L71
            com.bxkj.student.v2.ai.fitness.camera.b r7 = new com.bxkj.student.v2.ai.fitness.camera.b
            r7.<init>(r9, r10)
            r9.g(r7)
        L71:
            r4.u(r12, r9)
            android.content.Context r7 = r9.getContext()
            boolean r7 = com.bxkj.student.v2.ai.fitness.preference.a.g(r7)
            if (r7 != 0) goto L96
            r7 = r5
            com.bxkj.student.v2.ai.fitness.camera.i r5 = new com.bxkj.student.v2.ai.fitness.camera.i
            if (r11 == 0) goto L8d
            int r6 = r4.f1320n
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
        L89:
            r11 = r6
            r6 = r9
            r9 = r0
            goto L8f
        L8d:
            r6 = 0
            goto L89
        L8f:
            r5.<init>(r6, r7, r9, r11)
            r6.g(r5)
            goto L97
        L96:
            r6 = r9
        L97:
            r6.postInvalidate()
            return
    }

    private /* synthetic */ void s(com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay r3, java.lang.Exception r4) {
            r2 = this;
            r3.h()
            r3.postInvalidate()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to process. Error: "
            r0.append(r1)
            java.lang.String r1 = r4.getLocalizedMessage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.content.Context r3 = r3.getContext()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "\nCause: "
            r1.append(r0)
            java.lang.Throwable r0 = r4.getCause()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 0
            android.widget.Toast r3 = android.widget.Toast.makeText(r3, r0, r1)
            r3.show()
            r2.t(r4)
            return
    }

    private void v(java.nio.ByteBuffer r8, com.bxkj.student.v2.ai.fitness.camera.f r9, com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay r10) {
            r7 = this;
            long r5 = android.os.SystemClock.elapsedRealtime()
            android.content.Context r0 = r10.getContext()
            boolean r0 = com.bxkj.student.v2.ai.fitness.preference.a.d(r0)
            if (r0 == 0) goto L11
            r0 = 0
        Lf:
            r3 = r0
            goto L16
        L11:
            android.graphics.Bitmap r0 = com.bxkj.student.v2.ai.fitness.camera.a.c(r8, r9)
            goto Lf
        L16:
            android.content.Context r0 = r10.getContext()
            boolean r0 = r7.o(r0)
            if (r0 == 0) goto L4f
            com.google.android.odml.image.ByteBufferMlImageBuilder r0 = new com.google.android.odml.image.ByteBufferMlImageBuilder
            int r1 = r9.c()
            int r2 = r9.a()
            r4 = 4
            r0.<init>(r8, r1, r2, r4)
            int r8 = r9.b()
            com.google.android.odml.image.ByteBufferMlImageBuilder r8 = r0.setRotation(r8)
            com.google.android.odml.image.MlImage r1 = r8.build()
            r4 = 1
            r0 = r7
            r2 = r10
            com.google.android.gms.tasks.Task r8 = r0.x(r1, r2, r3, r4, r5)
            com.bxkj.student.v2.ai.fitness.camera.k r9 = r0.c
            com.bxkj.student.v2.ai.fitness.camera.r r10 = new com.bxkj.student.v2.ai.fitness.camera.r
            r10.<init>(r7, r2)
            r8.addOnSuccessListener(r9, r10)
            r1.close()
            return
        L4f:
            r0 = r7
            r2 = r10
            int r10 = r9.c()
            int r1 = r9.a()
            int r9 = r9.b()
            r4 = 17
            com.google.mlkit.vision.common.InputImage r1 = com.google.mlkit.vision.common.InputImage.fromByteBuffer(r8, r10, r1, r9, r4)
            r4 = 1
            com.google.android.gms.tasks.Task r8 = r0.y(r1, r2, r3, r4, r5)
            com.bxkj.student.v2.ai.fitness.camera.k r9 = r0.c
            com.bxkj.student.v2.ai.fitness.camera.s r10 = new com.bxkj.student.v2.ai.fitness.camera.s
            r10.<init>(r7, r2)
            r8.addOnSuccessListener(r9, r10)
            return
    }

    private synchronized void w(com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay r4) {
            r3 = this;
            monitor-enter(r3)
            java.nio.ByteBuffer r0 = r3.f1321o     // Catch: java.lang.Throwable -> L1a
            r3.f1323q = r0     // Catch: java.lang.Throwable -> L1a
            com.bxkj.student.v2.ai.fitness.camera.f r1 = r3.f1322p     // Catch: java.lang.Throwable -> L1a
            r3.f1324r = r1     // Catch: java.lang.Throwable -> L1a
            r2 = 0
            r3.f1321o = r2     // Catch: java.lang.Throwable -> L1a
            r3.f1322p = r2     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L1c
            if (r1 == 0) goto L1c
            boolean r2 = r3.e     // Catch: java.lang.Throwable -> L1a
            if (r2 != 0) goto L1c
            r3.v(r0, r1, r4)     // Catch: java.lang.Throwable -> L1a
            goto L1c
        L1a:
            r4 = move-exception
            goto L1e
        L1c:
            monitor-exit(r3)
            return
        L1e:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1a
            throw r4
    }

    private com.google.android.gms.tasks.Task<T> x(com.google.android.odml.image.MlImage r8, com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay r9, @androidx.annotation.Nullable android.graphics.Bitmap r10, boolean r11, long r12) {
            r7 = this;
            com.google.android.gms.tasks.Task r1 = r7.m(r8)
            r0 = r7
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            com.google.android.gms.tasks.Task r8 = r0.A(r1, r2, r3, r4, r5)
            return r8
    }

    private com.google.android.gms.tasks.Task<T> y(com.google.mlkit.vision.common.InputImage r8, com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay r9, @androidx.annotation.Nullable android.graphics.Bitmap r10, boolean r11, long r12) {
            r7 = this;
            com.google.android.gms.tasks.Task r1 = r7.n(r8)
            r0 = r7
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            com.google.android.gms.tasks.Task r8 = r0.A(r1, r2, r3, r4, r5)
            return r8
    }

    private void z() {
            r4 = this;
            r0 = 0
            r4.f = r0
            r0 = 0
            r4.g = r0
            r4.h = r0
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r4.i = r2
            r4.j = r0
            r4.k = r0
            r4.f1318l = r2
            return
    }

    @Override // com.bxkj.student.v2.ai.fitness.camera.m
    public synchronized void a(java.nio.ByteBuffer r1, com.bxkj.student.v2.ai.fitness.camera.f r2, com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay r3) {
            r0 = this;
            monitor-enter(r0)
            r0.f1321o = r1     // Catch: java.lang.Throwable -> L11
            r0.f1322p = r2     // Catch: java.lang.Throwable -> L11
            java.nio.ByteBuffer r1 = r0.f1323q     // Catch: java.lang.Throwable -> L11
            if (r1 != 0) goto L13
            com.bxkj.student.v2.ai.fitness.camera.f r1 = r0.f1324r     // Catch: java.lang.Throwable -> L11
            if (r1 != 0) goto L13
            r0.w(r3)     // Catch: java.lang.Throwable -> L11
            goto L13
        L11:
            r1 = move-exception
            goto L15
        L13:
            monitor-exit(r0)
            return
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r1
    }

    @Override // com.bxkj.student.v2.ai.fitness.camera.m
    @androidx.camera.core.ExperimentalGetImage
    @androidx.annotation.RequiresApi(21)
    public void b(androidx.camera.core.ImageProxy r8, com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay r9) {
            r7 = this;
            long r5 = android.os.SystemClock.elapsedRealtime()
            boolean r0 = r7.e
            if (r0 == 0) goto Lc
            r8.close()
            return
        Lc:
            android.content.Context r0 = r9.getContext()
            boolean r0 = com.bxkj.student.v2.ai.fitness.preference.a.d(r0)
            if (r0 != 0) goto L1c
            android.graphics.Bitmap r0 = com.bxkj.student.v2.ai.fitness.camera.a.b(r8)
        L1a:
            r3 = r0
            goto L1e
        L1c:
            r0 = 0
            goto L1a
        L1e:
            android.content.Context r0 = r9.getContext()
            boolean r0 = r7.o(r0)
            if (r0 == 0) goto L51
            com.google.android.odml.image.MediaMlImageBuilder r0 = new com.google.android.odml.image.MediaMlImageBuilder
            android.media.Image r1 = r8.getImage()
            r0.<init>(r1)
            androidx.camera.core.ImageInfo r1 = r8.getImageInfo()
            int r1 = r1.getRotationDegrees()
            com.google.android.odml.image.MediaMlImageBuilder r0 = r0.setRotation(r1)
            com.google.android.odml.image.MlImage r1 = r0.build()
            r4 = 1
            r0 = r7
            r2 = r9
            com.google.android.gms.tasks.Task r9 = r0.x(r1, r2, r3, r4, r5)
            com.bxkj.student.v2.ai.fitness.camera.p r0 = new com.bxkj.student.v2.ai.fitness.camera.p
            r0.<init>(r8)
            r9.addOnCompleteListener(r0)
            return
        L51:
            r2 = r9
            android.media.Image r9 = r8.getImage()
            androidx.camera.core.ImageInfo r0 = r8.getImageInfo()
            int r0 = r0.getRotationDegrees()
            com.google.mlkit.vision.common.InputImage r1 = com.google.mlkit.vision.common.InputImage.fromMediaImage(r9, r0)
            r4 = 1
            r0 = r7
            com.google.android.gms.tasks.Task r9 = r0.y(r1, r2, r3, r4, r5)
            com.bxkj.student.v2.ai.fitness.camera.q r0 = new com.bxkj.student.v2.ai.fitness.camera.q
            r0.<init>(r8)
            r9.addOnCompleteListener(r0)
            return
    }

    @Override // com.bxkj.student.v2.ai.fitness.camera.m
    public void c(android.graphics.Bitmap r8, com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay r9) {
            r7 = this;
            long r5 = android.os.SystemClock.elapsedRealtime()
            android.content.Context r0 = r9.getContext()
            boolean r0 = r7.o(r0)
            if (r0 == 0) goto L22
            com.google.android.odml.image.BitmapMlImageBuilder r0 = new com.google.android.odml.image.BitmapMlImageBuilder
            r0.<init>(r8)
            com.google.android.odml.image.MlImage r1 = r0.build()
            r3 = 0
            r4 = 0
            r0 = r7
            r2 = r9
            r0.x(r1, r2, r3, r4, r5)
            r1.close()
            return
        L22:
            r2 = r9
            r9 = 0
            com.google.mlkit.vision.common.InputImage r1 = com.google.mlkit.vision.common.InputImage.fromBitmap(r8, r9)
            r3 = 0
            r4 = 0
            r0 = r7
            r0.y(r1, r2, r3, r4, r5)
            return
    }

    protected com.google.android.gms.tasks.Task<T> m(com.google.android.odml.image.MlImage r3) {
            r2 = this;
            com.google.mlkit.common.MlKitException r3 = new com.google.mlkit.common.MlKitException
            java.lang.String r0 = "MlImage is currently not demonstrated for this feature"
            r1 = 3
            r3.<init>(r0, r1)
            com.google.android.gms.tasks.Task r3 = com.google.android.gms.tasks.Tasks.forException(r3)
            return r3
    }

    protected abstract com.google.android.gms.tasks.Task<T> n(com.google.mlkit.vision.common.InputImage r1);

    protected boolean o(android.content.Context r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.bxkj.student.v2.ai.fitness.camera.m
    public void stop() {
            r1 = this;
            com.bxkj.student.v2.ai.fitness.camera.k r0 = r1.c
            r0.shutdown()
            r0 = 1
            r1.e = r0
            r1.z()
            java.util.Timer r0 = r1.b
            r0.cancel()
            com.bxkj.student.v2.ai.fitness.camera.l r0 = r1.d
            r0.b()
            return
    }

    protected abstract void t(@androidx.annotation.NonNull java.lang.Exception r1);

    protected abstract void u(@androidx.annotation.NonNull T r1, @androidx.annotation.NonNull com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay r2);
}
