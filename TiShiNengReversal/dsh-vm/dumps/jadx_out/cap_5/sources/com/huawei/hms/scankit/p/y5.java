package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class y5 {
    private long a;
    private long b;
    private int c;
    private int d;
    private int e;
    private float f;
    private android.graphics.Rect g;
    private com.huawei.hms.scankit.p.b6 h;

    public y5(@androidx.annotation.NonNull com.huawei.hms.scankit.p.b6 r3, android.graphics.Rect r4, int r5, float r6, int[] r7) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.a = r0
            r2.b = r0
            r0 = 0
            r2.c = r0
            r2.d = r0
            r2.h = r3
            r2.g = r4
            r2.e = r5
            if (r7 == 0) goto L23
            int r3 = r7.length
            r4 = 2
            if (r3 < r4) goto L23
            r3 = r7[r0]
            r2.c = r3
            r3 = 1
            r3 = r7[r3]
            r2.d = r3
        L23:
            r2.f = r6
            r2.c()
            return
    }

    private void a() {
            r1 = this;
            com.huawei.hms.scankit.p.b6 r0 = r1.h
            if (r0 == 0) goto L7
            r0.a()
        L7:
            return
    }

    private void a(android.graphics.Canvas r6, android.graphics.Rect r7, java.util.List<com.huawei.hms.scankit.p.w5> r8) {
            r5 = this;
            java.util.Iterator r8 = r8.iterator()
        L4:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L94
            java.lang.Object r0 = r8.next()
            com.huawei.hms.scankit.p.w5 r0 = (com.huawei.hms.scankit.p.w5) r0
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            int r2 = r0.b()
            if (r2 != 0) goto L22
            int r2 = r5.b()
            r0.b(r2)
        L22:
            int r2 = r0.b()
            r1.setColor(r2)
            float r2 = r0.d()
            int r3 = r7.top
            int r4 = r7.bottom
            int r3 = java.lang.Math.max(r3, r4)
            float r3 = (float) r3
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 > 0) goto L4e
            float r2 = r0.d()
            int r3 = r7.top
            int r4 = r7.bottom
            int r3 = java.lang.Math.min(r3, r4)
            float r3 = (float) r3
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L4c
            goto L4e
        L4c:
            r2 = 0
            goto L4f
        L4e:
            r2 = 1
        L4f:
            int r3 = r7.height()
            r4 = 0
            if (r3 == 0) goto L6e
            int r3 = r7.width()
            if (r3 == 0) goto L6e
            if (r2 == 0) goto L5f
            goto L6e
        L5f:
            int r2 = r7.bottom
            float r2 = (float) r2
            float r3 = r0.d()
            float r2 = r2 - r3
            int r3 = r7.height()
            float r3 = (float) r3
            float r4 = r2 / r3
        L6e:
            int r2 = r0.a()
            float r2 = (float) r2
            float r3 = java.lang.Math.abs(r4)
            float r2 = r2 * r3
            int r2 = (int) r2
            if (r2 <= 0) goto L4
            r1.setAlpha(r2)
            float r2 = r0.c()
            float r3 = r0.d()
            float r0 = r0.f()
            float r4 = r5.f
            float r0 = r0 * r4
            r6.drawCircle(r2, r3, r0, r1)
            goto L4
        L94:
            return
    }

    private int b() {
            r8 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = com.huawei.hms.scankit.p.n6.a(r0)
            int r1 = r8.c
            int r1 = android.graphics.Color.red(r1)
            int r2 = r8.c
            int r2 = android.graphics.Color.blue(r2)
            int r3 = r8.c
            int r3 = android.graphics.Color.green(r3)
            int r4 = r8.d
            int r4 = android.graphics.Color.red(r4)
            int r5 = r8.d
            int r5 = android.graphics.Color.blue(r5)
            int r6 = r8.d
            int r6 = android.graphics.Color.green(r6)
            float r7 = (float) r1
            int r4 = r4 - r1
            float r1 = (float) r4
            float r1 = r1 * r0
            r4 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r4
            float r7 = r7 + r1
            int r1 = (int) r7
            float r7 = (float) r3
            int r6 = r6 - r3
            float r3 = (float) r6
            float r3 = r3 * r0
            float r3 = r3 + r4
            float r7 = r7 + r3
            int r3 = (int) r7
            float r6 = (float) r2
            int r5 = r5 - r2
            float r2 = (float) r5
            float r2 = r2 * r0
            float r2 = r2 + r4
            float r6 = r6 + r2
            int r0 = (int) r6
            int r0 = android.graphics.Color.rgb(r1, r3, r0)
            return r0
    }

    private void c() {
            r3 = this;
            r3.a()
            r0 = 0
            r3.b = r0
            long r0 = java.lang.System.currentTimeMillis()
            r3.a = r0
            com.huawei.hms.scankit.p.b6 r0 = r3.h
            if (r0 == 0) goto L1a
            android.graphics.Rect r1 = r3.g
            if (r1 == 0) goto L1a
            int r2 = r3.e
            r0.a(r1, r2)
        L1a:
            return
    }

    public void a(@androidx.annotation.NonNull android.graphics.Canvas r5, @androidx.annotation.NonNull android.graphics.Rect r6) {
            r4 = this;
            com.huawei.hms.scankit.p.b6 r0 = r4.h
            if (r0 == 0) goto L32
            if (r5 == 0) goto L32
            if (r6 != 0) goto L9
            goto L32
        L9:
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r4.a
            long r0 = r0 - r2
            long r2 = r4.b
            long r2 = r2 + r0
            r4.b = r2
            com.huawei.hms.scankit.p.b6 r0 = r4.h
            r0.b(r2)
            com.huawei.hms.scankit.p.b6 r0 = r4.h
            java.util.List r0 = r0.c()
            if (r0 == 0) goto L32
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L29
            goto L32
        L29:
            r4.a(r5, r6, r0)
            long r5 = java.lang.System.currentTimeMillis()
            r4.a = r5
        L32:
            return
    }
}
