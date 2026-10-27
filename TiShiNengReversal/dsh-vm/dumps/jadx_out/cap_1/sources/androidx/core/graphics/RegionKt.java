package androidx.core.graphics;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nRegion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Region.kt\nandroidx/core/graphics/RegionKt\n*L\n1#1,158:1\n71#1,3:159\n35#1,3:162\n44#1,3:165\n*S KotlinDebug\n*F\n+ 1 Region.kt\nandroidx/core/graphics/RegionKt\n*L\n79#1:159,3\n84#1:162,3\n89#1:165,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class RegionKt {
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Region and(@org.jetbrains.annotations.NotNull android.graphics.Region r1, @org.jetbrains.annotations.NotNull android.graphics.Rect r2) {
            android.graphics.Region r0 = new android.graphics.Region
            r0.<init>(r1)
            android.graphics.Region$Op r1 = android.graphics.Region.Op.INTERSECT
            r0.op(r2, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Region and(@org.jetbrains.annotations.NotNull android.graphics.Region r1, @org.jetbrains.annotations.NotNull android.graphics.Region r2) {
            android.graphics.Region r0 = new android.graphics.Region
            r0.<init>(r1)
            android.graphics.Region$Op r1 = android.graphics.Region.Op.INTERSECT
            r0.op(r2, r1)
            return r0
    }

    public static final boolean contains(@org.jetbrains.annotations.NotNull android.graphics.Region r1, @org.jetbrains.annotations.NotNull android.graphics.Point r2) {
            int r0 = r2.x
            int r2 = r2.y
            boolean r1 = r1.contains(r0, r2)
            return r1
    }

    public static final void forEach(@org.jetbrains.annotations.NotNull android.graphics.Region r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.graphics.Rect, kotlin.n1> r3) {
            android.graphics.RegionIterator r0 = new android.graphics.RegionIterator
            r0.<init>(r2)
        L5:
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            boolean r1 = r0.next(r2)
            if (r1 != 0) goto L11
            return
        L11:
            r3.invoke(r2)
            goto L5
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.Iterator<android.graphics.Rect> iterator(@org.jetbrains.annotations.NotNull android.graphics.Region r1) {
            androidx.core.graphics.RegionKt$iterator$1 r0 = new androidx.core.graphics.RegionKt$iterator$1
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Region minus(@org.jetbrains.annotations.NotNull android.graphics.Region r1, @org.jetbrains.annotations.NotNull android.graphics.Rect r2) {
            android.graphics.Region r0 = new android.graphics.Region
            r0.<init>(r1)
            android.graphics.Region$Op r1 = android.graphics.Region.Op.DIFFERENCE
            r0.op(r2, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Region minus(@org.jetbrains.annotations.NotNull android.graphics.Region r1, @org.jetbrains.annotations.NotNull android.graphics.Region r2) {
            android.graphics.Region r0 = new android.graphics.Region
            r0.<init>(r1)
            android.graphics.Region$Op r1 = android.graphics.Region.Op.DIFFERENCE
            r0.op(r2, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Region not(@org.jetbrains.annotations.NotNull android.graphics.Region r2) {
            android.graphics.Region r0 = new android.graphics.Region
            android.graphics.Rect r1 = r2.getBounds()
            r0.<init>(r1)
            android.graphics.Region$Op r1 = android.graphics.Region.Op.DIFFERENCE
            r0.op(r2, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Region or(@org.jetbrains.annotations.NotNull android.graphics.Region r1, @org.jetbrains.annotations.NotNull android.graphics.Rect r2) {
            android.graphics.Region r0 = new android.graphics.Region
            r0.<init>(r1)
            r0.union(r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Region or(@org.jetbrains.annotations.NotNull android.graphics.Region r1, @org.jetbrains.annotations.NotNull android.graphics.Region r2) {
            android.graphics.Region r0 = new android.graphics.Region
            r0.<init>(r1)
            android.graphics.Region$Op r1 = android.graphics.Region.Op.UNION
            r0.op(r2, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Region plus(@org.jetbrains.annotations.NotNull android.graphics.Region r1, @org.jetbrains.annotations.NotNull android.graphics.Rect r2) {
            android.graphics.Region r0 = new android.graphics.Region
            r0.<init>(r1)
            r0.union(r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Region plus(@org.jetbrains.annotations.NotNull android.graphics.Region r1, @org.jetbrains.annotations.NotNull android.graphics.Region r2) {
            android.graphics.Region r0 = new android.graphics.Region
            r0.<init>(r1)
            android.graphics.Region$Op r1 = android.graphics.Region.Op.UNION
            r0.op(r2, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Region unaryMinus(@org.jetbrains.annotations.NotNull android.graphics.Region r2) {
            android.graphics.Region r0 = new android.graphics.Region
            android.graphics.Rect r1 = r2.getBounds()
            r0.<init>(r1)
            android.graphics.Region$Op r1 = android.graphics.Region.Op.DIFFERENCE
            r0.op(r2, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Region xor(@org.jetbrains.annotations.NotNull android.graphics.Region r1, @org.jetbrains.annotations.NotNull android.graphics.Rect r2) {
            android.graphics.Region r0 = new android.graphics.Region
            r0.<init>(r1)
            android.graphics.Region$Op r1 = android.graphics.Region.Op.XOR
            r0.op(r2, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Region xor(@org.jetbrains.annotations.NotNull android.graphics.Region r1, @org.jetbrains.annotations.NotNull android.graphics.Region r2) {
            android.graphics.Region r0 = new android.graphics.Region
            r0.<init>(r1)
            android.graphics.Region$Op r1 = android.graphics.Region.Op.XOR
            r0.op(r2, r1)
            return r0
    }
}
