package androidx.core.content;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ContextKt {
    public static final /* synthetic */ <T> T getSystemService(android.content.Context r2) {
            r0 = 4
            java.lang.String r1 = "T"
            kotlin.jvm.internal.g0.y(r0, r1)
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.Object r2 = androidx.core.content.ContextCompat.getSystemService(r2, r0)
            return r2
    }

    public static final void withStyledAttributes(@org.jetbrains.annotations.NotNull android.content.Context r0, @androidx.annotation.StyleRes int r1, @org.jetbrains.annotations.NotNull int[] r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.content.res.TypedArray, kotlin.n1> r3) {
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r1, r2)
            r3.invoke(r0)
            r0.recycle()
            return
    }

    public static final void withStyledAttributes(@org.jetbrains.annotations.NotNull android.content.Context r0, @org.jetbrains.annotations.Nullable android.util.AttributeSet r1, @org.jetbrains.annotations.NotNull int[] r2, @androidx.annotation.AttrRes int r3, @androidx.annotation.StyleRes int r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.content.res.TypedArray, kotlin.n1> r5) {
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r1, r2, r3, r4)
            r5.invoke(r0)
            r0.recycle()
            return
    }

    public static /* synthetic */ void withStyledAttributes$default(android.content.Context r1, android.util.AttributeSet r2, int[] r3, int r4, int r5, kotlin.jvm.functions.Function1 r6, int r7, java.lang.Object r8) {
            r8 = r7 & 1
            if (r8 == 0) goto L5
            r2 = 0
        L5:
            r8 = r7 & 4
            r0 = 0
            if (r8 == 0) goto Lb
            r4 = 0
        Lb:
            r7 = r7 & 8
            if (r7 == 0) goto L10
            r5 = 0
        L10:
            android.content.res.TypedArray r1 = r1.obtainStyledAttributes(r2, r3, r4, r5)
            r6.invoke(r1)
            r1.recycle()
            return
    }
}
