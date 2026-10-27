package androidx.core.graphics;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"ClassVerificationFailure"})
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nPath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Path.kt\nandroidx/core/graphics/PathKt\n*L\n1#1,80:1\n43#1,3:81\n*S KotlinDebug\n*F\n+ 1 Path.kt\nandroidx/core/graphics/PathKt\n*L\n60#1:81,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class PathKt {
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Path and(@org.jetbrains.annotations.NotNull android.graphics.Path r2, @org.jetbrains.annotations.NotNull android.graphics.Path r3) {
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            android.graphics.Path$Op r1 = android.graphics.Path.Op.INTERSECT
            r0.op(r2, r3, r1)
            return r0
    }

    @androidx.annotation.RequiresApi(26)
    @org.jetbrains.annotations.NotNull
    public static final java.lang.Iterable<androidx.core.graphics.PathSegment> flatten(@org.jetbrains.annotations.NotNull android.graphics.Path r0, float r1) {
            java.util.Collection r0 = androidx.core.graphics.PathUtils.flatten(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            return r0
    }

    public static /* synthetic */ java.lang.Iterable flatten$default(android.graphics.Path r0, float r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            r1 = 1056964608(0x3f000000, float:0.5)
        L6:
            java.lang.Iterable r0 = flatten(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Path minus(@org.jetbrains.annotations.NotNull android.graphics.Path r1, @org.jetbrains.annotations.NotNull android.graphics.Path r2) {
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>(r1)
            android.graphics.Path$Op r1 = android.graphics.Path.Op.DIFFERENCE
            r0.op(r2, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Path or(@org.jetbrains.annotations.NotNull android.graphics.Path r1, @org.jetbrains.annotations.NotNull android.graphics.Path r2) {
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>(r1)
            android.graphics.Path$Op r1 = android.graphics.Path.Op.UNION
            r0.op(r2, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Path plus(@org.jetbrains.annotations.NotNull android.graphics.Path r1, @org.jetbrains.annotations.NotNull android.graphics.Path r2) {
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>(r1)
            android.graphics.Path$Op r1 = android.graphics.Path.Op.UNION
            r0.op(r2, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Path xor(@org.jetbrains.annotations.NotNull android.graphics.Path r1, @org.jetbrains.annotations.NotNull android.graphics.Path r2) {
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>(r1)
            android.graphics.Path$Op r1 = android.graphics.Path.Op.XOR
            r0.op(r2, r1)
            return r0
    }
}
