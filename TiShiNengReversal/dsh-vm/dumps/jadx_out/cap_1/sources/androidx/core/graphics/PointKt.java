package androidx.core.graphics;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class PointKt {
    public static final float component1(@org.jetbrains.annotations.NotNull android.graphics.PointF r0) {
            float r0 = r0.x
            return r0
    }

    public static final int component1(@org.jetbrains.annotations.NotNull android.graphics.Point r0) {
            int r0 = r0.x
            return r0
    }

    public static final float component2(@org.jetbrains.annotations.NotNull android.graphics.PointF r0) {
            float r0 = r0.y
            return r0
    }

    public static final int component2(@org.jetbrains.annotations.NotNull android.graphics.Point r0) {
            int r0 = r0.y
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Point div(@org.jetbrains.annotations.NotNull android.graphics.Point r2, float r3) {
            android.graphics.Point r0 = new android.graphics.Point
            int r1 = r2.x
            float r1 = (float) r1
            float r1 = r1 / r3
            int r1 = java.lang.Math.round(r1)
            int r2 = r2.y
            float r2 = (float) r2
            float r2 = r2 / r3
            int r2 = java.lang.Math.round(r2)
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.PointF div(@org.jetbrains.annotations.NotNull android.graphics.PointF r2, float r3) {
            android.graphics.PointF r0 = new android.graphics.PointF
            float r1 = r2.x
            float r1 = r1 / r3
            float r2 = r2.y
            float r2 = r2 / r3
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Point minus(@org.jetbrains.annotations.NotNull android.graphics.Point r2, int r3) {
            android.graphics.Point r0 = new android.graphics.Point
            int r1 = r2.x
            int r2 = r2.y
            r0.<init>(r1, r2)
            int r2 = -r3
            r0.offset(r2, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Point minus(@org.jetbrains.annotations.NotNull android.graphics.Point r2, @org.jetbrains.annotations.NotNull android.graphics.Point r3) {
            android.graphics.Point r0 = new android.graphics.Point
            int r1 = r2.x
            int r2 = r2.y
            r0.<init>(r1, r2)
            int r2 = r3.x
            int r2 = -r2
            int r3 = r3.y
            int r3 = -r3
            r0.offset(r2, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.PointF minus(@org.jetbrains.annotations.NotNull android.graphics.PointF r2, float r3) {
            android.graphics.PointF r0 = new android.graphics.PointF
            float r1 = r2.x
            float r2 = r2.y
            r0.<init>(r1, r2)
            float r2 = -r3
            r0.offset(r2, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.PointF minus(@org.jetbrains.annotations.NotNull android.graphics.PointF r2, @org.jetbrains.annotations.NotNull android.graphics.PointF r3) {
            android.graphics.PointF r0 = new android.graphics.PointF
            float r1 = r2.x
            float r2 = r2.y
            r0.<init>(r1, r2)
            float r2 = r3.x
            float r2 = -r2
            float r3 = r3.y
            float r3 = -r3
            r0.offset(r2, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Point plus(@org.jetbrains.annotations.NotNull android.graphics.Point r2, int r3) {
            android.graphics.Point r0 = new android.graphics.Point
            int r1 = r2.x
            int r2 = r2.y
            r0.<init>(r1, r2)
            r0.offset(r3, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Point plus(@org.jetbrains.annotations.NotNull android.graphics.Point r2, @org.jetbrains.annotations.NotNull android.graphics.Point r3) {
            android.graphics.Point r0 = new android.graphics.Point
            int r1 = r2.x
            int r2 = r2.y
            r0.<init>(r1, r2)
            int r2 = r3.x
            int r3 = r3.y
            r0.offset(r2, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.PointF plus(@org.jetbrains.annotations.NotNull android.graphics.PointF r2, float r3) {
            android.graphics.PointF r0 = new android.graphics.PointF
            float r1 = r2.x
            float r2 = r2.y
            r0.<init>(r1, r2)
            r0.offset(r3, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.PointF plus(@org.jetbrains.annotations.NotNull android.graphics.PointF r2, @org.jetbrains.annotations.NotNull android.graphics.PointF r3) {
            android.graphics.PointF r0 = new android.graphics.PointF
            float r1 = r2.x
            float r2 = r2.y
            r0.<init>(r1, r2)
            float r2 = r3.x
            float r3 = r3.y
            r0.offset(r2, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Point times(@org.jetbrains.annotations.NotNull android.graphics.Point r2, float r3) {
            android.graphics.Point r0 = new android.graphics.Point
            int r1 = r2.x
            float r1 = (float) r1
            float r1 = r1 * r3
            int r1 = java.lang.Math.round(r1)
            int r2 = r2.y
            float r2 = (float) r2
            float r2 = r2 * r3
            int r2 = java.lang.Math.round(r2)
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.PointF times(@org.jetbrains.annotations.NotNull android.graphics.PointF r2, float r3) {
            android.graphics.PointF r0 = new android.graphics.PointF
            float r1 = r2.x
            float r1 = r1 * r3
            float r2 = r2.y
            float r2 = r2 * r3
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Point toPoint(@org.jetbrains.annotations.NotNull android.graphics.PointF r2) {
            android.graphics.Point r0 = new android.graphics.Point
            float r1 = r2.x
            int r1 = (int) r1
            float r2 = r2.y
            int r2 = (int) r2
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.PointF toPointF(@org.jetbrains.annotations.NotNull android.graphics.Point r1) {
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Point unaryMinus(@org.jetbrains.annotations.NotNull android.graphics.Point r2) {
            android.graphics.Point r0 = new android.graphics.Point
            int r1 = r2.x
            int r1 = -r1
            int r2 = r2.y
            int r2 = -r2
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.PointF unaryMinus(@org.jetbrains.annotations.NotNull android.graphics.PointF r2) {
            android.graphics.PointF r0 = new android.graphics.PointF
            float r1 = r2.x
            float r1 = -r1
            float r2 = r2.y
            float r2 = -r2
            r0.<init>(r1, r2)
            return r0
    }
}
