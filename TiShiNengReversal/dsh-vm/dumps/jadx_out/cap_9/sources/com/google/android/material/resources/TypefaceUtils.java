package com.google.android.material.resources;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class TypefaceUtils {
    private TypefaceUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    public static android.graphics.Typeface maybeCopyWithFontWeightAdjustment(@androidx.annotation.NonNull android.content.Context r0, @androidx.annotation.NonNull android.graphics.Typeface r1) {
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            android.graphics.Typeface r0 = maybeCopyWithFontWeightAdjustment(r0, r1)
            return r0
    }

    @androidx.annotation.Nullable
    public static android.graphics.Typeface maybeCopyWithFontWeightAdjustment(@androidx.annotation.NonNull android.content.res.Configuration r2, @androidx.annotation.NonNull android.graphics.Typeface r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L30
            int r0 = com.google.android.material.resources.b.a(r2)
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L30
            int r0 = com.google.android.material.resources.b.a(r2)
            if (r0 == 0) goto L30
            if (r3 == 0) goto L30
            int r0 = com.google.android.material.resources.c.a(r3)
            int r2 = com.google.android.material.resources.b.a(r2)
            int r0 = r0 + r2
            r2 = 1
            r1 = 1000(0x3e8, float:1.401E-42)
            int r2 = androidx.core.math.MathUtils.clamp(r0, r2, r1)
            boolean r0 = r3.isItalic()
            android.graphics.Typeface r2 = com.bytedance.adsdk.ugeno.widget.text.c.a(r3, r2, r0)
            return r2
        L30:
            r2 = 0
            return r2
    }
}
