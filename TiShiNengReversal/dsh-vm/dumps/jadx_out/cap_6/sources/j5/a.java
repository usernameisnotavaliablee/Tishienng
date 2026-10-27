package j5;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a implements j5.b {
    private float a;
    private android.graphics.Shader b;
    private final android.graphics.RectF c;

    public a(@androidx.annotation.FloatRange(from = 0.0d) float r2) {
            r1 = this;
            r1.<init>()
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r1.c = r0
            r1.f(r2)
            return
    }

    private void f(@androidx.annotation.FloatRange(from = 0.0d) float r2) {
            r1 = this;
            r0 = 0
            float r2 = java.lang.Math.max(r0, r2)
            float r0 = r1.a
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L10
            r1.a = r2
            r2 = 0
            r1.b = r2
        L10:
            return
    }

    @Override // j5.b
    public void a(android.graphics.Canvas r4, android.graphics.Paint r5, android.graphics.Bitmap r6) {
            r3 = this;
            float r0 = r3.a
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto Le
            r0 = 0
            android.graphics.RectF r1 = r3.c
            r4.drawBitmap(r6, r0, r1, r5)
            return
        Le:
            android.graphics.Shader r0 = r3.b
            if (r0 != 0) goto L49
            android.graphics.BitmapShader r0 = new android.graphics.BitmapShader
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.CLAMP
            r0.<init>(r6, r1, r1)
            r3.b = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            android.graphics.RectF r1 = r3.c
            float r2 = r1.left
            float r1 = r1.top
            r0.setTranslate(r2, r1)
            android.graphics.RectF r1 = r3.c
            float r1 = r1.width()
            int r2 = r6.getWidth()
            float r2 = (float) r2
            float r1 = r1 / r2
            android.graphics.RectF r2 = r3.c
            float r2 = r2.height()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            float r2 = r2 / r6
            r0.preScale(r1, r2)
            android.graphics.Shader r6 = r3.b
            r6.setLocalMatrix(r0)
        L49:
            android.graphics.Shader r6 = r3.b
            r5.setShader(r6)
            android.graphics.RectF r6 = r3.c
            float r0 = r3.a
            r4.drawRoundRect(r6, r0, r0, r5)
            return
    }

    @Override // j5.b
    public void b(android.graphics.Rect r2) {
            r1 = this;
            android.graphics.RectF r0 = r1.c
            r0.set(r2)
            r2 = 0
            r1.b = r2
            return
    }

    @androidx.annotation.NonNull
    public android.graphics.RectF c() {
            r1 = this;
            android.graphics.RectF r0 = r1.c
            return r0
    }

    @androidx.annotation.FloatRange(from = 0.0d)
    public float d() {
            r1 = this;
            float r0 = r1.a
            return r0
    }

    public void e(@androidx.annotation.FloatRange(from = 0.0d) float r1) {
            r0 = this;
            r0.f(r1)
            return
    }
}
