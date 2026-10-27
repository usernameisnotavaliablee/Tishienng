package androidx.core.graphics;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class CanvasKt {
    public static final void withClip(@org.jetbrains.annotations.NotNull android.graphics.Canvas r1, float r2, float r3, float r4, float r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.n1> r6) {
            int r0 = r1.save()
            r1.clipRect(r2, r3, r4, r5)
            r2 = 1
            r6.invoke(r1)     // Catch: java.lang.Throwable -> L15
            kotlin.jvm.internal.d0.d(r2)
            r1.restoreToCount(r0)
            kotlin.jvm.internal.d0.c(r2)
            return
        L15:
            r3 = move-exception
            kotlin.jvm.internal.d0.d(r2)
            r1.restoreToCount(r0)
            kotlin.jvm.internal.d0.c(r2)
            throw r3
    }

    public static final void withClip(@org.jetbrains.annotations.NotNull android.graphics.Canvas r1, int r2, int r3, int r4, int r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.n1> r6) {
            int r0 = r1.save()
            r1.clipRect(r2, r3, r4, r5)
            r2 = 1
            r6.invoke(r1)     // Catch: java.lang.Throwable -> L15
            kotlin.jvm.internal.d0.d(r2)
            r1.restoreToCount(r0)
            kotlin.jvm.internal.d0.c(r2)
            return
        L15:
            r3 = move-exception
            kotlin.jvm.internal.d0.d(r2)
            r1.restoreToCount(r0)
            kotlin.jvm.internal.d0.c(r2)
            throw r3
    }

    public static final void withClip(@org.jetbrains.annotations.NotNull android.graphics.Canvas r1, @org.jetbrains.annotations.NotNull android.graphics.Path r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.n1> r3) {
            int r0 = r1.save()
            r1.clipPath(r2)
            r2 = 1
            r3.invoke(r1)     // Catch: java.lang.Throwable -> L15
            kotlin.jvm.internal.d0.d(r2)
            r1.restoreToCount(r0)
            kotlin.jvm.internal.d0.c(r2)
            return
        L15:
            r3 = move-exception
            kotlin.jvm.internal.d0.d(r2)
            r1.restoreToCount(r0)
            kotlin.jvm.internal.d0.c(r2)
            throw r3
    }

    public static final void withClip(@org.jetbrains.annotations.NotNull android.graphics.Canvas r1, @org.jetbrains.annotations.NotNull android.graphics.Rect r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.n1> r3) {
            int r0 = r1.save()
            r1.clipRect(r2)
            r2 = 1
            r3.invoke(r1)     // Catch: java.lang.Throwable -> L15
            kotlin.jvm.internal.d0.d(r2)
            r1.restoreToCount(r0)
            kotlin.jvm.internal.d0.c(r2)
            return
        L15:
            r3 = move-exception
            kotlin.jvm.internal.d0.d(r2)
            r1.restoreToCount(r0)
            kotlin.jvm.internal.d0.c(r2)
            throw r3
    }

    public static final void withClip(@org.jetbrains.annotations.NotNull android.graphics.Canvas r1, @org.jetbrains.annotations.NotNull android.graphics.RectF r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.n1> r3) {
            int r0 = r1.save()
            r1.clipRect(r2)
            r2 = 1
            r3.invoke(r1)     // Catch: java.lang.Throwable -> L15
            kotlin.jvm.internal.d0.d(r2)
            r1.restoreToCount(r0)
            kotlin.jvm.internal.d0.c(r2)
            return
        L15:
            r3 = move-exception
            kotlin.jvm.internal.d0.d(r2)
            r1.restoreToCount(r0)
            kotlin.jvm.internal.d0.c(r2)
            throw r3
    }

    public static final void withMatrix(@org.jetbrains.annotations.NotNull android.graphics.Canvas r1, @org.jetbrains.annotations.NotNull android.graphics.Matrix r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.n1> r3) {
            int r0 = r1.save()
            r1.concat(r2)
            r2 = 1
            r3.invoke(r1)     // Catch: java.lang.Throwable -> L15
            kotlin.jvm.internal.d0.d(r2)
            r1.restoreToCount(r0)
            kotlin.jvm.internal.d0.c(r2)
            return
        L15:
            r3 = move-exception
            kotlin.jvm.internal.d0.d(r2)
            r1.restoreToCount(r0)
            kotlin.jvm.internal.d0.c(r2)
            throw r3
    }

    public static /* synthetic */ void withMatrix$default(android.graphics.Canvas r0, android.graphics.Matrix r1, kotlin.jvm.functions.Function1 r2, int r3, java.lang.Object r4) {
            r4 = 1
            r3 = r3 & r4
            if (r3 == 0) goto L9
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
        L9:
            int r3 = r0.save()
            r0.concat(r1)
            r2.invoke(r0)     // Catch: java.lang.Throwable -> L1d
            kotlin.jvm.internal.d0.d(r4)
            r0.restoreToCount(r3)
            kotlin.jvm.internal.d0.c(r4)
            return
        L1d:
            r1 = move-exception
            kotlin.jvm.internal.d0.d(r4)
            r0.restoreToCount(r3)
            kotlin.jvm.internal.d0.c(r4)
            throw r1
    }

    public static final void withRotation(@org.jetbrains.annotations.NotNull android.graphics.Canvas r1, float r2, float r3, float r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.n1> r5) {
            int r0 = r1.save()
            r1.rotate(r2, r3, r4)
            r2 = 1
            r5.invoke(r1)     // Catch: java.lang.Throwable -> L15
            kotlin.jvm.internal.d0.d(r2)
            r1.restoreToCount(r0)
            kotlin.jvm.internal.d0.c(r2)
            return
        L15:
            r3 = move-exception
            kotlin.jvm.internal.d0.d(r2)
            r1.restoreToCount(r0)
            kotlin.jvm.internal.d0.c(r2)
            throw r3
    }

    public static /* synthetic */ void withRotation$default(android.graphics.Canvas r1, float r2, float r3, float r4, kotlin.jvm.functions.Function1 r5, int r6, java.lang.Object r7) {
            r7 = r6 & 1
            r0 = 0
            if (r7 == 0) goto L6
            r2 = 0
        L6:
            r7 = r6 & 2
            if (r7 == 0) goto Lb
            r3 = 0
        Lb:
            r6 = r6 & 4
            if (r6 == 0) goto L10
            r4 = 0
        L10:
            int r6 = r1.save()
            r1.rotate(r2, r3, r4)
            r2 = 1
            r5.invoke(r1)     // Catch: java.lang.Throwable -> L25
            kotlin.jvm.internal.d0.d(r2)
            r1.restoreToCount(r6)
            kotlin.jvm.internal.d0.c(r2)
            return
        L25:
            r3 = move-exception
            kotlin.jvm.internal.d0.d(r2)
            r1.restoreToCount(r6)
            kotlin.jvm.internal.d0.c(r2)
            throw r3
    }

    public static final void withSave(@org.jetbrains.annotations.NotNull android.graphics.Canvas r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.n1> r3) {
            int r0 = r2.save()
            r1 = 1
            r3.invoke(r2)     // Catch: java.lang.Throwable -> L12
            kotlin.jvm.internal.d0.d(r1)
            r2.restoreToCount(r0)
            kotlin.jvm.internal.d0.c(r1)
            return
        L12:
            r3 = move-exception
            kotlin.jvm.internal.d0.d(r1)
            r2.restoreToCount(r0)
            kotlin.jvm.internal.d0.c(r1)
            throw r3
    }

    public static final void withScale(@org.jetbrains.annotations.NotNull android.graphics.Canvas r1, float r2, float r3, float r4, float r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.n1> r6) {
            int r0 = r1.save()
            r1.scale(r2, r3, r4, r5)
            r2 = 1
            r6.invoke(r1)     // Catch: java.lang.Throwable -> L15
            kotlin.jvm.internal.d0.d(r2)
            r1.restoreToCount(r0)
            kotlin.jvm.internal.d0.c(r2)
            return
        L15:
            r3 = move-exception
            kotlin.jvm.internal.d0.d(r2)
            r1.restoreToCount(r0)
            kotlin.jvm.internal.d0.c(r2)
            throw r3
    }

    public static /* synthetic */ void withScale$default(android.graphics.Canvas r1, float r2, float r3, float r4, float r5, kotlin.jvm.functions.Function1 r6, int r7, java.lang.Object r8) {
            r8 = r7 & 1
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L8
            r2 = 1065353216(0x3f800000, float:1.0)
        L8:
            r8 = r7 & 2
            if (r8 == 0) goto Le
            r3 = 1065353216(0x3f800000, float:1.0)
        Le:
            r8 = r7 & 4
            r0 = 0
            if (r8 == 0) goto L14
            r4 = 0
        L14:
            r7 = r7 & 8
            if (r7 == 0) goto L19
            r5 = 0
        L19:
            int r7 = r1.save()
            r1.scale(r2, r3, r4, r5)
            r2 = 1
            r6.invoke(r1)     // Catch: java.lang.Throwable -> L2e
            kotlin.jvm.internal.d0.d(r2)
            r1.restoreToCount(r7)
            kotlin.jvm.internal.d0.c(r2)
            return
        L2e:
            r3 = move-exception
            kotlin.jvm.internal.d0.d(r2)
            r1.restoreToCount(r7)
            kotlin.jvm.internal.d0.c(r2)
            throw r3
    }

    public static final void withSkew(@org.jetbrains.annotations.NotNull android.graphics.Canvas r1, float r2, float r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.n1> r4) {
            int r0 = r1.save()
            r1.skew(r2, r3)
            r2 = 1
            r4.invoke(r1)     // Catch: java.lang.Throwable -> L15
            kotlin.jvm.internal.d0.d(r2)
            r1.restoreToCount(r0)
            kotlin.jvm.internal.d0.c(r2)
            return
        L15:
            r3 = move-exception
            kotlin.jvm.internal.d0.d(r2)
            r1.restoreToCount(r0)
            kotlin.jvm.internal.d0.c(r2)
            throw r3
    }

    public static /* synthetic */ void withSkew$default(android.graphics.Canvas r1, float r2, float r3, kotlin.jvm.functions.Function1 r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            r0 = 0
            if (r6 == 0) goto L6
            r2 = 0
        L6:
            r5 = r5 & 2
            if (r5 == 0) goto Lb
            r3 = 0
        Lb:
            int r5 = r1.save()
            r1.skew(r2, r3)
            r2 = 1
            r4.invoke(r1)     // Catch: java.lang.Throwable -> L20
            kotlin.jvm.internal.d0.d(r2)
            r1.restoreToCount(r5)
            kotlin.jvm.internal.d0.c(r2)
            return
        L20:
            r3 = move-exception
            kotlin.jvm.internal.d0.d(r2)
            r1.restoreToCount(r5)
            kotlin.jvm.internal.d0.c(r2)
            throw r3
    }

    public static final void withTranslation(@org.jetbrains.annotations.NotNull android.graphics.Canvas r1, float r2, float r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.n1> r4) {
            int r0 = r1.save()
            r1.translate(r2, r3)
            r2 = 1
            r4.invoke(r1)     // Catch: java.lang.Throwable -> L15
            kotlin.jvm.internal.d0.d(r2)
            r1.restoreToCount(r0)
            kotlin.jvm.internal.d0.c(r2)
            return
        L15:
            r3 = move-exception
            kotlin.jvm.internal.d0.d(r2)
            r1.restoreToCount(r0)
            kotlin.jvm.internal.d0.c(r2)
            throw r3
    }

    public static /* synthetic */ void withTranslation$default(android.graphics.Canvas r1, float r2, float r3, kotlin.jvm.functions.Function1 r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            r0 = 0
            if (r6 == 0) goto L6
            r2 = 0
        L6:
            r5 = r5 & 2
            if (r5 == 0) goto Lb
            r3 = 0
        Lb:
            int r5 = r1.save()
            r1.translate(r2, r3)
            r2 = 1
            r4.invoke(r1)     // Catch: java.lang.Throwable -> L20
            kotlin.jvm.internal.d0.d(r2)
            r1.restoreToCount(r5)
            kotlin.jvm.internal.d0.c(r2)
            return
        L20:
            r3 = move-exception
            kotlin.jvm.internal.d0.d(r2)
            r1.restoreToCount(r5)
            kotlin.jvm.internal.d0.c(r2)
            throw r3
    }
}
