package master.flame.danmaku.danmaku.model.android;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class g {
    public android.graphics.Canvas a;
    public android.graphics.Bitmap b;
    public android.graphics.Bitmap[][] c;
    public java.lang.Object d;
    public int e;
    public int f;
    public boolean g;
    private int h;

    public g() {
            r0 = this;
            r0.<init>()
            return
    }

    private void d(android.graphics.Bitmap r2) {
            r1 = this;
            if (r2 == 0) goto L6
            r0 = 0
            r2.eraseColor(r0)
        L6:
            return
    }

    private void e() {
            r5 = this;
            android.graphics.Bitmap[][] r0 = r5.c
            if (r0 == 0) goto L1e
            r0 = 0
            r1 = 0
        L6:
            android.graphics.Bitmap[][] r2 = r5.c
            int r2 = r2.length
            if (r1 >= r2) goto L1e
            r2 = 0
        Lc:
            android.graphics.Bitmap[][] r3 = r5.c
            r3 = r3[r1]
            int r4 = r3.length
            if (r2 >= r4) goto L1b
            r3 = r3[r2]
            r5.d(r3)
            int r2 = r2 + 1
            goto Lc
        L1b:
            int r1 = r1 + 1
            goto L6
        L1e:
            return
    }

    private void g() {
            r7 = this;
            android.graphics.Bitmap[][] r0 = r7.c
            r1 = 0
            r7.c = r1
            if (r0 == 0) goto L23
            r2 = 0
            r3 = 0
        L9:
            int r4 = r0.length
            if (r3 >= r4) goto L23
            r4 = 0
        Ld:
            r5 = r0[r3]
            int r6 = r5.length
            if (r4 >= r6) goto L20
            r5 = r5[r4]
            if (r5 == 0) goto L1d
            r5.recycle()
            r5 = r0[r3]
            r5[r4] = r1
        L1d:
            int r4 = r4 + 1
            goto Ld
        L20:
            int r3 = r3 + 1
            goto L9
        L23:
            return
    }

    public void a(int r2, int r3, int r4, boolean r5, int r6) {
            r1 = this;
            if (r5 == 0) goto Lb
            int r5 = r1.e
            if (r2 != r5) goto L26
            int r5 = r1.f
            if (r3 != r5) goto L26
            goto L13
        Lb:
            int r5 = r1.e
            if (r2 > r5) goto L26
            int r5 = r1.f
            if (r3 > r5) goto L26
        L13:
            android.graphics.Bitmap r5 = r1.b
            if (r5 == 0) goto L26
            r2 = 0
            r5.eraseColor(r2)
            android.graphics.Canvas r2 = r1.a
            android.graphics.Bitmap r3 = r1.b
            r2.setBitmap(r3)
            r1.g()
            return
        L26:
            android.graphics.Bitmap r5 = r1.b
            if (r5 == 0) goto L2d
            r1.f()
        L2d:
            r1.e = r2
            r1.f = r3
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_4444
            r0 = 32
            if (r6 != r0) goto L39
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888
        L39:
            android.graphics.Bitmap r2 = tv.cjump.jni.NativeBitmapFactory.a(r2, r3, r5)
            r1.b = r2
            if (r4 <= 0) goto L46
            r1.h = r4
            r2.setDensity(r4)
        L46:
            android.graphics.Canvas r2 = r1.a
            if (r2 != 0) goto L57
            android.graphics.Canvas r2 = new android.graphics.Canvas
            android.graphics.Bitmap r3 = r1.b
            r2.<init>(r3)
            r1.a = r2
            r2.setDensity(r4)
            return
        L57:
            android.graphics.Bitmap r3 = r1.b
            r2.setBitmap(r3)
            return
    }

    public final synchronized boolean b(android.graphics.Canvas r10, float r11, float r12, android.graphics.Paint r13) {
            r9 = this;
            monitor-enter(r9)
            android.graphics.Bitmap[][] r0 = r9.c     // Catch: java.lang.Throwable -> L56
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L60
            r0 = 0
        L8:
            android.graphics.Bitmap[][] r3 = r9.c     // Catch: java.lang.Throwable -> L56
            int r3 = r3.length     // Catch: java.lang.Throwable -> L56
            if (r0 >= r3) goto L5e
            r3 = 0
        Le:
            android.graphics.Bitmap[][] r4 = r9.c     // Catch: java.lang.Throwable -> L56
            r4 = r4[r0]     // Catch: java.lang.Throwable -> L56
            int r5 = r4.length     // Catch: java.lang.Throwable -> L56
            if (r3 >= r5) goto L5b
            r4 = r4[r3]     // Catch: java.lang.Throwable -> L56
            if (r4 == 0) goto L58
            int r5 = r4.getWidth()     // Catch: java.lang.Throwable -> L56
            int r5 = r5 * r3
            float r5 = (float) r5     // Catch: java.lang.Throwable -> L56
            float r5 = r5 + r11
            int r6 = r10.getWidth()     // Catch: java.lang.Throwable -> L56
            float r6 = (float) r6     // Catch: java.lang.Throwable -> L56
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 > 0) goto L58
            int r6 = r4.getWidth()     // Catch: java.lang.Throwable -> L56
            float r6 = (float) r6     // Catch: java.lang.Throwable -> L56
            float r6 = r6 + r5
            r7 = 0
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 >= 0) goto L36
            goto L58
        L36:
            int r6 = r4.getHeight()     // Catch: java.lang.Throwable -> L56
            int r6 = r6 * r0
            float r6 = (float) r6     // Catch: java.lang.Throwable -> L56
            float r6 = r6 + r12
            int r8 = r10.getHeight()     // Catch: java.lang.Throwable -> L56
            float r8 = (float) r8     // Catch: java.lang.Throwable -> L56
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 > 0) goto L58
            int r8 = r4.getHeight()     // Catch: java.lang.Throwable -> L56
            float r8 = (float) r8     // Catch: java.lang.Throwable -> L56
            float r8 = r8 + r6
            int r7 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r7 >= 0) goto L52
            goto L58
        L52:
            r10.drawBitmap(r4, r5, r6, r13)     // Catch: java.lang.Throwable -> L56
            goto L58
        L56:
            r10 = move-exception
            goto L6b
        L58:
            int r3 = r3 + 1
            goto Le
        L5b:
            int r0 = r0 + 1
            goto L8
        L5e:
            monitor-exit(r9)
            return r2
        L60:
            android.graphics.Bitmap r0 = r9.b     // Catch: java.lang.Throwable -> L56
            if (r0 == 0) goto L69
            r10.drawBitmap(r0, r11, r12, r13)     // Catch: java.lang.Throwable -> L56
            monitor-exit(r9)
            return r2
        L69:
            monitor-exit(r9)
            return r1
        L6b:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L56
            throw r10
    }

    public void c() {
            r1 = this;
            android.graphics.Bitmap r0 = r1.b
            r1.d(r0)
            r1.e()
            return
    }

    public synchronized void f() {
            r3 = this;
            monitor-enter(r3)
            android.graphics.Bitmap r0 = r3.b     // Catch: java.lang.Throwable -> L11
            r1 = 0
            r3.b = r1     // Catch: java.lang.Throwable -> L11
            r2 = 0
            r3.f = r2     // Catch: java.lang.Throwable -> L11
            r3.e = r2     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L13
            r0.recycle()     // Catch: java.lang.Throwable -> L11
            goto L13
        L11:
            r0 = move-exception
            goto L1a
        L13:
            r3.g()     // Catch: java.lang.Throwable -> L11
            r3.d = r1     // Catch: java.lang.Throwable -> L11
            monitor-exit(r3)
            return
        L1a:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L11
            throw r0
    }

    @android.annotation.SuppressLint({"NewApi"})
    public void h(int r12, int r13, int r14, int r15) {
            r11 = this;
            r11.g()
            int r0 = r11.e
            if (r0 <= 0) goto Laf
            int r1 = r11.f
            if (r1 <= 0) goto Laf
            android.graphics.Bitmap r2 = r11.b
            if (r2 != 0) goto L11
            goto Laf
        L11:
            if (r0 > r14) goto L17
            if (r1 > r15) goto L17
            goto Laf
        L17:
            int r12 = java.lang.Math.min(r14, r12)
            int r13 = java.lang.Math.min(r15, r13)
            int r14 = r11.e
            int r15 = r14 / r12
            int r12 = r14 % r12
            r0 = 1
            r1 = 0
            if (r12 != 0) goto L2b
            r12 = 0
            goto L2c
        L2b:
            r12 = 1
        L2c:
            int r15 = r15 + r12
            int r12 = r11.f
            int r2 = r12 / r13
            int r13 = r12 % r13
            if (r13 != 0) goto L37
            r13 = 0
            goto L38
        L37:
            r13 = 1
        L38:
            int r2 = r2 + r13
            int r14 = r14 / r15
            int r12 = r12 / r2
            r13 = 2
            int[] r13 = new int[r13]
            r13[r0] = r15
            r13[r1] = r2
            java.lang.Class<android.graphics.Bitmap> r0 = android.graphics.Bitmap.class
            java.lang.Object r13 = java.lang.reflect.Array.newInstance(r0, r13)
            android.graphics.Bitmap[][] r13 = (android.graphics.Bitmap[][]) r13
            android.graphics.Canvas r0 = r11.a
            if (r0 != 0) goto L5c
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>()
            r11.a = r0
            int r3 = r11.h
            if (r3 <= 0) goto L5c
            r0.setDensity(r3)
        L5c:
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r4 = 0
        L67:
            if (r4 >= r2) goto La6
            r5 = 0
        L6a:
            if (r5 >= r15) goto La3
            r6 = r13[r4]
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r7 = tv.cjump.jni.NativeBitmapFactory.a(r14, r12, r7)
            r6[r5] = r7
            int r6 = r11.h
            if (r6 <= 0) goto L7d
            r7.setDensity(r6)
        L7d:
            android.graphics.Canvas r6 = r11.a
            r6.setBitmap(r7)
            int r6 = r5 * r14
            int r8 = r4 * r12
            int r9 = r6 + r14
            int r10 = r8 + r12
            r0.set(r6, r8, r9, r10)
            int r6 = r7.getWidth()
            int r7 = r7.getHeight()
            r3.set(r1, r1, r6, r7)
            android.graphics.Canvas r6 = r11.a
            android.graphics.Bitmap r7 = r11.b
            r8 = 0
            r6.drawBitmap(r7, r0, r3, r8)
            int r5 = r5 + 1
            goto L6a
        La3:
            int r4 = r4 + 1
            goto L67
        La6:
            android.graphics.Canvas r12 = r11.a
            android.graphics.Bitmap r14 = r11.b
            r12.setBitmap(r14)
            r11.c = r13
        Laf:
            return
    }
}
