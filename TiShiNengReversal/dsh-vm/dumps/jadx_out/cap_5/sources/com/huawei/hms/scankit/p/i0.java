package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class i0 implements android.hardware.Camera.AutoFocusCallback {
    private static final java.util.Set<java.lang.String> i = null;
    private final boolean a;
    private android.hardware.Camera b;
    private android.os.AsyncTask<?, ?, ?> c;
    private boolean d;
    private boolean e;
    private int f;
    private int g;
    private java.lang.String h;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class a extends android.os.AsyncTask<java.lang.Object, java.lang.Object, java.lang.Object> {
        private java.lang.ref.WeakReference<com.huawei.hms.scankit.p.i0> a;

        a(com.huawei.hms.scankit.p.i0 r2) {
                r1 = this;
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.a = r0
                return
        }

        @Override // android.os.AsyncTask
        protected java.lang.Object doInBackground(java.lang.Object... r4) {
                r3 = this;
                java.lang.ref.WeakReference<com.huawei.hms.scankit.p.i0> r4 = r3.a
                java.lang.Object r4 = r4.get()
                com.huawei.hms.scankit.p.i0 r4 = (com.huawei.hms.scankit.p.i0) r4
                r0 = 0
                if (r4 != 0) goto Lc
                return r0
            Lc:
                r4.d()
                int r4 = com.huawei.hms.scankit.p.i0.a(r4)     // Catch: java.lang.InterruptedException -> L1c
                r1 = 0
                int r4 = java.lang.Math.max(r4, r1)     // Catch: java.lang.InterruptedException -> L1c
                long r1 = (long) r4     // Catch: java.lang.InterruptedException -> L1c
                java.lang.Thread.sleep(r1)     // Catch: java.lang.InterruptedException -> L1c
            L1c:
                return r0
        }
    }

    static {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            com.huawei.hms.scankit.p.i0.i = r0
            java.lang.String r1 = "auto"
            r0.add(r1)
            java.lang.String r1 = "macro"
            r0.add(r1)
            return
    }

    i0(android.hardware.Camera r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.d = r0
            r1.e = r0
            r0 = -1
            r1.f = r0
            r0 = 2
            r1.g = r0
            r0 = 0
            r1.h = r0
            r1.b = r2
            android.hardware.Camera$Parameters r2 = r2.getParameters()     // Catch: java.lang.RuntimeException -> L1c
            java.lang.String r2 = r2.getFocusMode()     // Catch: java.lang.RuntimeException -> L1c
            goto L22
        L1c:
            r2 = move-exception
            r2.getMessage()
            java.lang.String r2 = "auto"
        L22:
            java.util.Set<java.lang.String> r0 = com.huawei.hms.scankit.p.i0.i
            boolean r2 = r0.contains(r2)
            r1.a = r2
            return
    }

    private static int a(int r1) {
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r1 <= r0) goto L5
            return r0
        L5:
            r0 = -1000(0xfffffffffffffc18, float:NaN)
            int r1 = java.lang.Math.max(r1, r0)
            return r1
    }

    static /* synthetic */ int a(com.huawei.hms.scankit.p.i0 r0) {
            int r0 = r0.c()
            return r0
    }

    private static android.graphics.Rect a(float r0, float r1, float r2, int r3, int r4, boolean r5, int r6) {
            float r2 = (float) r3
            float r0 = r0 / r2
            r2 = 1157234688(0x44fa0000, float:2000.0)
            float r0 = r0 * r2
            r3 = 1148846080(0x447a0000, float:1000.0)
            float r0 = r0 - r3
            int r0 = (int) r0
            float r4 = (float) r4
            float r1 = r1 / r4
            float r1 = r1 * r2
            float r1 = r1 - r3
            int r1 = (int) r1
            android.graphics.RectF r2 = new android.graphics.RectF
            int r3 = r0 + (-150)
            int r3 = a(r3)
            float r3 = (float) r3
            int r4 = r1 + (-150)
            int r4 = a(r4)
            float r4 = (float) r4
            int r0 = r0 + 150
            int r0 = a(r0)
            float r0 = (float) r0
            int r1 = r1 + 150
            int r1 = a(r1)
            float r1 = (float) r1
            r2.<init>(r3, r4, r0, r1)
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            a(r0, r5, r6)     // Catch: java.lang.RuntimeException -> L5a
            r0.mapRect(r2)     // Catch: java.lang.RuntimeException -> L5a
            android.graphics.Rect r0 = new android.graphics.Rect
            float r1 = r2.left
            int r1 = java.lang.Math.round(r1)
            float r3 = r2.top
            int r3 = java.lang.Math.round(r3)
            float r4 = r2.right
            int r4 = java.lang.Math.round(r4)
            float r2 = r2.bottom
            int r2 = java.lang.Math.round(r2)
            r0.<init>(r1, r3, r4, r2)
            return r0
        L5a:
            r0 = move-exception
            r0.getMessage()
            r0 = 0
            return r0
    }

    private synchronized void a() {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.d     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L22
            android.os.AsyncTask<?, ?, ?> r0 = r3.c     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto La
            goto L22
        La:
            com.huawei.hms.scankit.p.i0$a r0 = new com.huawei.hms.scankit.p.i0$a     // Catch: java.lang.Throwable -> L1a
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L1a
            java.util.concurrent.Executor r1 = android.os.AsyncTask.THREAD_POOL_EXECUTOR     // Catch: java.lang.Throwable -> L1a java.util.concurrent.RejectedExecutionException -> L1c
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L1a java.util.concurrent.RejectedExecutionException -> L1c
            r0.executeOnExecutor(r1, r2)     // Catch: java.lang.Throwable -> L1a java.util.concurrent.RejectedExecutionException -> L1c
            r3.c = r0     // Catch: java.lang.Throwable -> L1a java.util.concurrent.RejectedExecutionException -> L1c
            goto L20
        L1a:
            r0 = move-exception
            goto L24
        L1c:
            r0 = move-exception
            r0.getMessage()     // Catch: java.lang.Throwable -> L1a
        L20:
            monitor-exit(r3)
            return
        L22:
            monitor-exit(r3)
            return
        L24:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1a
            throw r0
    }

    public static void a(android.graphics.Matrix r2, boolean r3, int r4) {
            if (r2 != 0) goto L3
            return
        L3:
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r2.reset()     // Catch: java.lang.RuntimeException -> L1f
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r3 == 0) goto L12
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L14
        L12:
            r3 = 1065353216(0x3f800000, float:1.0)
        L14:
            r0.setScale(r3, r1)     // Catch: java.lang.RuntimeException -> L1f
            float r3 = (float) r4     // Catch: java.lang.RuntimeException -> L1f
            r0.postRotate(r3)     // Catch: java.lang.RuntimeException -> L1f
            r0.invert(r2)     // Catch: java.lang.RuntimeException -> L1f
            return
        L1f:
            r2 = move-exception
            r2.getMessage()
            return
    }

    private synchronized void b() {
            r2 = this;
            monitor-enter(r2)
            android.os.AsyncTask<?, ?, ?> r0 = r2.c     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L19
            android.os.AsyncTask$Status r0 = r0.getStatus()     // Catch: java.lang.Throwable -> L14
            android.os.AsyncTask$Status r1 = android.os.AsyncTask.Status.FINISHED     // Catch: java.lang.Throwable -> L14
            if (r0 == r1) goto L16
            android.os.AsyncTask<?, ?, ?> r0 = r2.c     // Catch: java.lang.Throwable -> L14
            r1 = 1
            r0.cancel(r1)     // Catch: java.lang.Throwable -> L14
            goto L16
        L14:
            r0 = move-exception
            goto L1b
        L16:
            r0 = 0
            r2.c = r0     // Catch: java.lang.Throwable -> L14
        L19:
            monitor-exit(r2)
            return
        L1b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
            throw r0
    }

    private synchronized int c() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.f     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public void a(android.graphics.Rect r10, int r11, int r12, boolean r13, boolean r14) {
            r9 = this;
            int r14 = r9.g
            r1 = 1
            if (r14 >= r1) goto L7
            goto L8b
        L7:
            int r14 = r14 - r1
            r9.g = r14
            int r14 = r10.centerX()
            float r2 = (float) r14
            int r10 = r10.centerY()
            float r3 = (float) r10
            if (r13 == 0) goto L1b
            r10 = 90
            r8 = 90
            goto L1d
        L1b:
            r10 = 0
            r8 = 0
        L1d:
            r4 = 1065353216(0x3f800000, float:1.0)
            r7 = 0
            r6 = r11
            r5 = r12
            android.graphics.Rect r10 = a(r2, r3, r4, r5, r6, r7, r8)
            if (r10 != 0) goto L2e
            int r10 = r9.g
            int r10 = r10 - r1
            r9.g = r10
            return
        L2e:
            android.hardware.Camera r11 = r9.b
            if (r11 == 0) goto L8b
            r11.cancelAutoFocus()     // Catch: java.lang.RuntimeException -> L54
            android.hardware.Camera r11 = r9.b     // Catch: java.lang.RuntimeException -> L54
            android.hardware.Camera$Parameters r11 = r11.getParameters()     // Catch: java.lang.RuntimeException -> L54
            int r12 = r11.getMaxNumFocusAreas()     // Catch: java.lang.RuntimeException -> L54
            r13 = 1000(0x3e8, float:1.401E-42)
            if (r12 <= 0) goto L57
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch: java.lang.RuntimeException -> L54
            r12.<init>()     // Catch: java.lang.RuntimeException -> L54
            android.hardware.Camera$Area r14 = new android.hardware.Camera$Area     // Catch: java.lang.RuntimeException -> L54
            r14.<init>(r10, r13)     // Catch: java.lang.RuntimeException -> L54
            r12.add(r14)     // Catch: java.lang.RuntimeException -> L54
            r11.setFocusAreas(r12)     // Catch: java.lang.RuntimeException -> L54
            goto L57
        L54:
            r0 = move-exception
            r10 = r0
            goto L83
        L57:
            int r12 = r11.getMaxNumMeteringAreas()     // Catch: java.lang.RuntimeException -> L54
            if (r12 <= 0) goto L6d
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch: java.lang.RuntimeException -> L54
            r12.<init>()     // Catch: java.lang.RuntimeException -> L54
            android.hardware.Camera$Area r14 = new android.hardware.Camera$Area     // Catch: java.lang.RuntimeException -> L54
            r14.<init>(r10, r13)     // Catch: java.lang.RuntimeException -> L54
            r12.add(r14)     // Catch: java.lang.RuntimeException -> L54
            r11.setMeteringAreas(r12)     // Catch: java.lang.RuntimeException -> L54
        L6d:
            java.lang.String r10 = r11.getFocusMode()     // Catch: java.lang.RuntimeException -> L54
            r9.h = r10     // Catch: java.lang.RuntimeException -> L54
            java.lang.String r10 = "macro"
            r11.setFocusMode(r10)     // Catch: java.lang.RuntimeException -> L54
            android.hardware.Camera r10 = r9.b     // Catch: java.lang.RuntimeException -> L54
            r10.setParameters(r11)     // Catch: java.lang.RuntimeException -> L54
            android.hardware.Camera r10 = r9.b     // Catch: java.lang.RuntimeException -> L54
            r10.autoFocus(r9)     // Catch: java.lang.RuntimeException -> L54
            return
        L83:
            r10.getMessage()
            int r10 = r9.g
            int r10 = r10 + r1
            r9.g = r10
        L8b:
            return
    }

    public synchronized void d() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.a     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L7
            monitor-exit(r1)
            return
        L7:
            r0 = 0
            r1.c = r0     // Catch: java.lang.Throwable -> L1b
            boolean r0 = r1.d     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L24
            boolean r0 = r1.e     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L24
            android.hardware.Camera r0 = r1.b     // Catch: java.lang.Throwable -> L1b java.lang.RuntimeException -> L1d
            r0.autoFocus(r1)     // Catch: java.lang.Throwable -> L1b java.lang.RuntimeException -> L1d
            r0 = 1
            r1.e = r0     // Catch: java.lang.Throwable -> L1b java.lang.RuntimeException -> L1d
            goto L24
        L1b:
            r0 = move-exception
            goto L26
        L1d:
            r0 = move-exception
            r0.getMessage()     // Catch: java.lang.Throwable -> L1b
            r1.a()     // Catch: java.lang.Throwable -> L1b
        L24:
            monitor-exit(r1)
            return
        L26:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1b
            throw r0
    }

    synchronized void e() {
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            r1.d = r0     // Catch: java.lang.Throwable -> L15
            boolean r0 = r1.a     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto La
            monitor-exit(r1)
            return
        La:
            r1.b()     // Catch: java.lang.Throwable -> L15
            android.hardware.Camera r0 = r1.b     // Catch: java.lang.Throwable -> L15 java.lang.RuntimeException -> L17
            if (r0 == 0) goto L1b
            r0.cancelAutoFocus()     // Catch: java.lang.Throwable -> L15 java.lang.RuntimeException -> L17
            goto L1b
        L15:
            r0 = move-exception
            goto L1d
        L17:
            r0 = move-exception
            r0.getMessage()     // Catch: java.lang.Throwable -> L15
        L1b:
            monitor-exit(r1)
            return
        L1d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L15
            throw r0
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public synchronized void onAutoFocus(boolean r2, android.hardware.Camera r3) {
            r1 = this;
            monitor-enter(r1)
            r2 = 0
            r1.e = r2     // Catch: java.lang.Throwable -> Ld
            r1.a()     // Catch: java.lang.Throwable -> Ld
            if (r3 == 0) goto L24
            r3.cancelAutoFocus()     // Catch: java.lang.Throwable -> Ld java.lang.RuntimeException -> Lf
            goto L13
        Ld:
            r2 = move-exception
            goto L26
        Lf:
            r2 = move-exception
            r2.getMessage()     // Catch: java.lang.Throwable -> Ld
        L13:
            android.hardware.Camera$Parameters r2 = r3.getParameters()     // Catch: java.lang.Throwable -> Ld java.lang.RuntimeException -> L20
            java.lang.String r0 = r1.h     // Catch: java.lang.Throwable -> Ld java.lang.RuntimeException -> L20
            r2.setFocusMode(r0)     // Catch: java.lang.Throwable -> Ld java.lang.RuntimeException -> L20
            r3.setParameters(r2)     // Catch: java.lang.Throwable -> Ld java.lang.RuntimeException -> L20
            goto L24
        L20:
            r2 = move-exception
            r2.getMessage()     // Catch: java.lang.Throwable -> Ld
        L24:
            monitor-exit(r1)
            return
        L26:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r2
    }
}
