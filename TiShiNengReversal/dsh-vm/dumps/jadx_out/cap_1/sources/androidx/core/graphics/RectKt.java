package androidx.core.graphics;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nRect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rect.kt\nandroidx/core/graphics/RectKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,365:1\n344#1,3:366\n344#1,3:369\n257#1,6:372\n122#1,3:378\n132#1,3:381\n344#1,3:384\n344#1,3:387\n344#1,3:390\n1#2:393\n*S KotlinDebug\n*F\n+ 1 Rect.kt\nandroidx/core/graphics/RectKt\n*L\n191#1:366,3\n192#1:369,3\n251#1:372,6\n268#1:378,3\n273#1:381,3\n313#1:384,3\n314#1:387,3\n358#1:390,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class RectKt {
    @android.annotation.SuppressLint({"CheckResult"})
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Rect and(@org.jetbrains.annotations.NotNull android.graphics.Rect r1, @org.jetbrains.annotations.NotNull android.graphics.Rect r2) {
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r1)
            r0.intersect(r2)
            return r0
    }

    @android.annotation.SuppressLint({"CheckResult"})
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.RectF and(@org.jetbrains.annotations.NotNull android.graphics.RectF r1, @org.jetbrains.annotations.NotNull android.graphics.RectF r2) {
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r1)
            r0.intersect(r2)
            return r0
    }

    public static final float component1(@org.jetbrains.annotations.NotNull android.graphics.RectF r0) {
            float r0 = r0.left
            return r0
    }

    public static final int component1(@org.jetbrains.annotations.NotNull android.graphics.Rect r0) {
            int r0 = r0.left
            return r0
    }

    public static final float component2(@org.jetbrains.annotations.NotNull android.graphics.RectF r0) {
            float r0 = r0.top
            return r0
    }

    public static final int component2(@org.jetbrains.annotations.NotNull android.graphics.Rect r0) {
            int r0 = r0.top
            return r0
    }

    public static final float component3(@org.jetbrains.annotations.NotNull android.graphics.RectF r0) {
            float r0 = r0.right
            return r0
    }

    public static final int component3(@org.jetbrains.annotations.NotNull android.graphics.Rect r0) {
            int r0 = r0.right
            return r0
    }

    public static final float component4(@org.jetbrains.annotations.NotNull android.graphics.RectF r0) {
            float r0 = r0.bottom
            return r0
    }

    public static final int component4(@org.jetbrains.annotations.NotNull android.graphics.Rect r0) {
            int r0 = r0.bottom
            return r0
    }

    public static final boolean contains(@org.jetbrains.annotations.NotNull android.graphics.Rect r1, @org.jetbrains.annotations.NotNull android.graphics.Point r2) {
            int r0 = r2.x
            int r2 = r2.y
            boolean r1 = r1.contains(r0, r2)
            return r1
    }

    public static final boolean contains(@org.jetbrains.annotations.NotNull android.graphics.RectF r1, @org.jetbrains.annotations.NotNull android.graphics.PointF r2) {
            float r0 = r2.x
            float r2 = r2.y
            boolean r1 = r1.contains(r0, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Rect minus(@org.jetbrains.annotations.NotNull android.graphics.Rect r1, int r2) {
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r1)
            int r1 = -r2
            r0.offset(r1, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Rect minus(@org.jetbrains.annotations.NotNull android.graphics.Rect r1, @org.jetbrains.annotations.NotNull android.graphics.Point r2) {
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r1)
            int r1 = r2.x
            int r1 = -r1
            int r2 = r2.y
            int r2 = -r2
            r0.offset(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.RectF minus(@org.jetbrains.annotations.NotNull android.graphics.RectF r1, float r2) {
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r1)
            float r1 = -r2
            r0.offset(r1, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.RectF minus(@org.jetbrains.annotations.NotNull android.graphics.RectF r1, @org.jetbrains.annotations.NotNull android.graphics.PointF r2) {
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r1)
            float r1 = r2.x
            float r1 = -r1
            float r2 = r2.y
            float r2 = -r2
            r0.offset(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Region minus(@org.jetbrains.annotations.NotNull android.graphics.Rect r1, @org.jetbrains.annotations.NotNull android.graphics.Rect r2) {
            android.graphics.Region r0 = new android.graphics.Region
            r0.<init>(r1)
            android.graphics.Region$Op r1 = android.graphics.Region.Op.DIFFERENCE
            r0.op(r2, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Region minus(@org.jetbrains.annotations.NotNull android.graphics.RectF r2, @org.jetbrains.annotations.NotNull android.graphics.RectF r3) {
            android.graphics.Region r0 = new android.graphics.Region
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r2.roundOut(r1)
            r0.<init>(r1)
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r3.roundOut(r2)
            android.graphics.Region$Op r3 = android.graphics.Region.Op.DIFFERENCE
            r0.op(r2, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Rect or(@org.jetbrains.annotations.NotNull android.graphics.Rect r1, @org.jetbrains.annotations.NotNull android.graphics.Rect r2) {
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r1)
            r0.union(r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.RectF or(@org.jetbrains.annotations.NotNull android.graphics.RectF r1, @org.jetbrains.annotations.NotNull android.graphics.RectF r2) {
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r1)
            r0.union(r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Rect plus(@org.jetbrains.annotations.NotNull android.graphics.Rect r1, int r2) {
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r1)
            r0.offset(r2, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Rect plus(@org.jetbrains.annotations.NotNull android.graphics.Rect r1, @org.jetbrains.annotations.NotNull android.graphics.Point r2) {
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r1)
            int r1 = r2.x
            int r2 = r2.y
            r0.offset(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Rect plus(@org.jetbrains.annotations.NotNull android.graphics.Rect r1, @org.jetbrains.annotations.NotNull android.graphics.Rect r2) {
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r1)
            r0.union(r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.RectF plus(@org.jetbrains.annotations.NotNull android.graphics.RectF r1, float r2) {
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r1)
            r0.offset(r2, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.RectF plus(@org.jetbrains.annotations.NotNull android.graphics.RectF r1, @org.jetbrains.annotations.NotNull android.graphics.PointF r2) {
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r1)
            float r1 = r2.x
            float r2 = r2.y
            r0.offset(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.RectF plus(@org.jetbrains.annotations.NotNull android.graphics.RectF r1, @org.jetbrains.annotations.NotNull android.graphics.RectF r2) {
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r1)
            r0.union(r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Rect times(@org.jetbrains.annotations.NotNull android.graphics.Rect r1, int r2) {
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r1)
            int r1 = r0.top
            int r1 = r1 * r2
            r0.top = r1
            int r1 = r0.left
            int r1 = r1 * r2
            r0.left = r1
            int r1 = r0.right
            int r1 = r1 * r2
            r0.right = r1
            int r1 = r0.bottom
            int r1 = r1 * r2
            r0.bottom = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.RectF times(@org.jetbrains.annotations.NotNull android.graphics.RectF r1, float r2) {
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r1)
            float r1 = r0.top
            float r1 = r1 * r2
            r0.top = r1
            float r1 = r0.left
            float r1 = r1 * r2
            r0.left = r1
            float r1 = r0.right
            float r1 = r1 * r2
            r0.right = r1
            float r1 = r0.bottom
            float r1 = r1 * r2
            r0.bottom = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.RectF times(@org.jetbrains.annotations.NotNull android.graphics.RectF r1, int r2) {
            float r2 = (float) r2
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r1)
            float r1 = r0.top
            float r1 = r1 * r2
            r0.top = r1
            float r1 = r0.left
            float r1 = r1 * r2
            r0.left = r1
            float r1 = r0.right
            float r1 = r1 * r2
            r0.right = r1
            float r1 = r0.bottom
            float r1 = r1 * r2
            r0.bottom = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Rect toRect(@org.jetbrains.annotations.NotNull android.graphics.RectF r1) {
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.roundOut(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.RectF toRectF(@org.jetbrains.annotations.NotNull android.graphics.Rect r1) {
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Region toRegion(@org.jetbrains.annotations.NotNull android.graphics.Rect r1) {
            android.graphics.Region r0 = new android.graphics.Region
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Region toRegion(@org.jetbrains.annotations.NotNull android.graphics.RectF r2) {
            android.graphics.Region r0 = new android.graphics.Region
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r2.roundOut(r1)
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.RectF transform(@org.jetbrains.annotations.NotNull android.graphics.RectF r0, @org.jetbrains.annotations.NotNull android.graphics.Matrix r1) {
            r1.mapRect(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Region xor(@org.jetbrains.annotations.NotNull android.graphics.Rect r1, @org.jetbrains.annotations.NotNull android.graphics.Rect r2) {
            android.graphics.Region r0 = new android.graphics.Region
            r0.<init>(r1)
            android.graphics.Region$Op r1 = android.graphics.Region.Op.XOR
            r0.op(r2, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Region xor(@org.jetbrains.annotations.NotNull android.graphics.RectF r2, @org.jetbrains.annotations.NotNull android.graphics.RectF r3) {
            android.graphics.Region r0 = new android.graphics.Region
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r2.roundOut(r1)
            r0.<init>(r1)
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r3.roundOut(r2)
            android.graphics.Region$Op r3 = android.graphics.Region.Op.XOR
            r0.op(r2, r3)
            return r0
    }
}
