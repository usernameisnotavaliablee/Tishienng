package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class f0 {
    private com.huawei.hms.scankit.p.e0 a;
    private android.graphics.Point b;
    private android.graphics.Point c;

    public f0() {
            r0 = this;
            r0.<init>()
            return
    }

    private android.graphics.Point a(android.hardware.Camera.Parameters r1, android.graphics.Point r2, boolean r3) {
            r0 = this;
            if (r3 != 0) goto L7
            java.util.List r1 = r1.getSupportedPreviewSizes()
            goto Lb
        L7:
            java.util.List r1 = r1.getSupportedPictureSizes()
        Lb:
            if (r1 == 0) goto L19
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L14
            goto L19
        L14:
            android.graphics.Point r1 = r0.a(r1, r2)
            return r1
        L19:
            android.graphics.Point r1 = new android.graphics.Point
            r2 = 0
            r1.<init>(r2, r2)
            return r1
    }

    private android.graphics.Point a(java.util.List<android.hardware.Camera.Size> r14, android.graphics.Point r15) {
            r13 = this;
            int r0 = r15.x
            double r0 = (double) r0
            int r2 = r15.y
            double r2 = (double) r2
            double r0 = r0 / r2
            java.util.Iterator r14 = r14.iterator()
            r2 = 0
            r3 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            r4 = r3
            r3 = 0
        L13:
            boolean r6 = r14.hasNext()
            if (r6 == 0) goto L51
            java.lang.Object r6 = r14.next()
            android.hardware.Camera$Size r6 = (android.hardware.Camera.Size) r6
            int r7 = r6.width
            int r6 = r6.height
            int r8 = r15.x
            if (r7 != r8) goto L31
            int r8 = r15.y
            if (r6 != r8) goto L31
            android.graphics.Point r14 = new android.graphics.Point
            r14.<init>(r7, r6)
            return r14
        L31:
            int r8 = r7 * r6
            double r8 = (double) r8
            r10 = 4684517668651270144(0x4102c00000000000, double:153600.0)
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 >= 0) goto L3e
            goto L13
        L3e:
            double r8 = (double) r7
            double r10 = (double) r6
            double r8 = r8 / r10
            double r8 = r8 - r0
            double r10 = java.lang.Math.abs(r8)
            int r12 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r12 >= 0) goto L13
            double r4 = java.lang.Math.abs(r8)
            r3 = r6
            r2 = r7
            goto L13
        L51:
            android.graphics.Point r14 = new android.graphics.Point
            r14.<init>(r2, r3)
            return r14
    }

    private void a(android.hardware.Camera.Parameters r4) {
            r3 = this;
            com.huawei.hms.scankit.p.e0 r0 = r3.a
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.String r0 = r0.f()
            java.lang.String r1 = "off"
            boolean r2 = r0.equals(r1)
            if (r2 != 0) goto L1a
            java.lang.String r2 = "torch"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L1a
            r0 = r1
        L1a:
            r4.setFlashMode(r0)
            return
    }

    public static void a(android.hardware.Camera.Parameters r6, boolean r7) {
            java.lang.Class<android.hardware.Camera$Parameters> r0 = android.hardware.Camera.Parameters.class
            java.lang.String r1 = "setScanOptEnable"
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L1d
            java.lang.Class r4 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L1d
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Throwable -> L1d
            java.lang.reflect.Method r0 = r0.getMethod(r1, r3)     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L1d
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.Throwable -> L1d
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L1d
            r1[r5] = r7     // Catch: java.lang.Throwable -> L1d
            r0.invoke(r6, r1)     // Catch: java.lang.Throwable -> L1d
        L1d:
            return
    }

    private void a(android.hardware.Camera r3, android.graphics.Point r4, android.graphics.Point r5) {
            r2 = this;
            com.huawei.hms.scankit.p.e0 r0 = r2.a
            if (r0 != 0) goto L5
            return
        L5:
            android.hardware.Camera$Parameters r0 = r3.getParameters()
            int r1 = r4.x
            int r4 = r4.y
            r0.setPreviewSize(r1, r4)
            com.huawei.hms.scankit.p.e0 r4 = r2.a
            int r4 = r4.c()
            if (r4 != 0) goto L1f
            int r4 = r5.x
            int r5 = r5.y
            r0.setPictureSize(r4, r5)
        L1f:
            com.huawei.hms.scankit.p.e0 r4 = r2.a
            int r4 = r4.b()
            r5 = 1
            if (r4 == r5) goto L2b
            r2.a(r0)
        L2b:
            r2.c(r0)
            r2.b(r0)
            com.huawei.hms.scankit.p.e0 r4 = r2.a
            boolean r4 = r4.e()
            if (r4 == 0) goto L3c
            r0.setRecordingHint(r5)
        L3c:
            int r4 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r4 < r1) goto L45
            a(r0, r5)
        L45:
            r3.setParameters(r0)
            return
    }

    private void b(android.hardware.Camera.Parameters r2) {
            r1 = this;
            boolean r0 = r2.isZoomSupported()
            if (r0 == 0) goto La
            r0 = 1
            r2.setZoom(r0)
        La:
            return
    }

    private void c(android.hardware.Camera.Parameters r6) {
            r5 = this;
            java.lang.String r0 = "continuous-video"
            java.lang.String r1 = "auto"
            java.lang.String r2 = "continuous-picture"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            java.util.List r1 = r6.getSupportedFocusModes()
            if (r1 != 0) goto L11
            return
        L11:
            r2 = 0
        L12:
            r3 = 3
            if (r2 >= r3) goto L21
            r3 = r0[r2]
            boolean r4 = r1.contains(r3)
            if (r4 == 0) goto L1e
            goto L22
        L1e:
            int r2 = r2 + 1
            goto L12
        L21:
            r3 = 0
        L22:
            if (r3 == 0) goto L27
            r6.setFocusMode(r3)
        L27:
            return
    }

    android.graphics.Point a() {
            r1 = this;
            android.graphics.Point r0 = r1.b
            return r0
    }

    void a(android.hardware.Camera r4, com.huawei.hms.scankit.p.e0 r5) {
            r3 = this;
            if (r4 == 0) goto L38
            if (r5 == 0) goto L38
            android.hardware.Camera$Parameters r0 = r4.getParameters()
            r3.a = r5
            android.graphics.Point r1 = r5.a()
            r2 = 0
            android.graphics.Point r1 = r3.a(r0, r1, r2)
            r3.b = r1
            android.graphics.Point r1 = r3.b
            r1.toString()
            int r1 = r5.c()
            if (r1 != 0) goto L30
            android.graphics.Point r5 = r5.a()
            r1 = 1
            android.graphics.Point r5 = r3.a(r0, r5, r1)
            r3.c = r5
            android.graphics.Point r5 = r3.c
            r5.toString()
        L30:
            android.graphics.Point r5 = r3.b
            android.graphics.Point r0 = r3.c
            r3.a(r4, r5, r0)
            return
        L38:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "initCameraParameters param is invalid"
            r4.<init>(r5)
            throw r4
    }
}
