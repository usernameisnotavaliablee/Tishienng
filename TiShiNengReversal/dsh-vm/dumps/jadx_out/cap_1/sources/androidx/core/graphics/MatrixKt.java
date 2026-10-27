package androidx.core.graphics;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Matrix.kt\nandroidx/core/graphics/MatrixKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,54:1\n1#2:55\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class MatrixKt {
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Matrix rotationMatrix(float r1, float r2, float r3) {
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r0.setRotate(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ android.graphics.Matrix rotationMatrix$default(float r1, float r2, float r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            r0 = 0
            if (r5 == 0) goto L6
            r2 = 0
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            android.graphics.Matrix r1 = rotationMatrix(r1, r2, r3)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Matrix scaleMatrix(float r1, float r2) {
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r0.setScale(r1, r2)
            return r0
    }

    public static /* synthetic */ android.graphics.Matrix scaleMatrix$default(float r1, float r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r4 == 0) goto L8
            r1 = 1065353216(0x3f800000, float:1.0)
        L8:
            r3 = r3 & 2
            if (r3 == 0) goto Le
            r2 = 1065353216(0x3f800000, float:1.0)
        Le:
            android.graphics.Matrix r1 = scaleMatrix(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Matrix times(@org.jetbrains.annotations.NotNull android.graphics.Matrix r1, @org.jetbrains.annotations.NotNull android.graphics.Matrix r2) {
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>(r1)
            r0.preConcat(r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Matrix translationMatrix(float r1, float r2) {
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r0.setTranslate(r1, r2)
            return r0
    }

    public static /* synthetic */ android.graphics.Matrix translationMatrix$default(float r1, float r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            r0 = 0
            if (r4 == 0) goto L6
            r1 = 0
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lb
            r2 = 0
        Lb:
            android.graphics.Matrix r1 = translationMatrix(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final float[] values(@org.jetbrains.annotations.NotNull android.graphics.Matrix r1) {
            r0 = 9
            float[] r0 = new float[r0]
            r1.getValues(r0)
            return r0
    }
}
