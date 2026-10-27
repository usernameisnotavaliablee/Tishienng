package androidx.core.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class TypedValueCompat {
    private static final float INCHES_PER_MM = 0.03937008f;
    private static final float INCHES_PER_PT = 0.013888889f;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(34)
    private static class Api34Impl {
        private Api34Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static float deriveDimension(int r0, float r1, android.util.DisplayMetrics r2) {
                float r0 = android.util.TypedValue.deriveDimension(r0, r1, r2)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public @interface ComplexDimensionUnit {
    }

    private TypedValueCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static float deriveDimension(int r2, float r3, @androidx.annotation.NonNull android.util.DisplayMetrics r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            float r2 = androidx.core.util.TypedValueCompat.Api34Impl.deriveDimension(r2, r3, r4)
            return r2
        Lb:
            if (r2 == 0) goto L67
            r0 = 1
            r1 = 0
            if (r2 == r0) goto L5f
            r0 = 2
            if (r2 == r0) goto L56
            r0 = 3
            if (r2 == r0) goto L4a
            r0 = 4
            if (r2 == r0) goto L41
            r0 = 5
            if (r2 != r0) goto L2a
            float r2 = r4.xdpi
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 != 0) goto L24
            return r1
        L24:
            float r3 = r3 / r2
            r2 = 1025589893(0x3d214285, float:0.03937008)
        L28:
            float r3 = r3 / r2
            return r3
        L2a:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Invalid unitToConvertTo "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.<init>(r2)
            throw r3
        L41:
            float r2 = r4.xdpi
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 != 0) goto L48
            return r1
        L48:
            float r3 = r3 / r2
            return r3
        L4a:
            float r2 = r4.xdpi
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 != 0) goto L51
            return r1
        L51:
            float r3 = r3 / r2
            r2 = 1013157433(0x3c638e39, float:0.013888889)
            goto L28
        L56:
            float r2 = r4.scaledDensity
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 != 0) goto L5d
            return r1
        L5d:
            float r3 = r3 / r2
            return r3
        L5f:
            float r2 = r4.density
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 != 0) goto L66
            return r1
        L66:
            float r3 = r3 / r2
        L67:
            return r3
    }

    public static float dpToPx(float r1, @androidx.annotation.NonNull android.util.DisplayMetrics r2) {
            r0 = 1
            float r1 = android.util.TypedValue.applyDimension(r0, r1, r2)
            return r1
    }

    @android.annotation.SuppressLint({"WrongConstant"})
    public static int getUnitFromComplexDimension(int r0) {
            r0 = r0 & 15
            return r0
    }

    public static float pxToDp(float r1, @androidx.annotation.NonNull android.util.DisplayMetrics r2) {
            r0 = 1
            float r1 = deriveDimension(r0, r1, r2)
            return r1
    }

    public static float pxToSp(float r1, @androidx.annotation.NonNull android.util.DisplayMetrics r2) {
            r0 = 2
            float r1 = deriveDimension(r0, r1, r2)
            return r1
    }

    public static float spToPx(float r1, @androidx.annotation.NonNull android.util.DisplayMetrics r2) {
            r0 = 2
            float r1 = android.util.TypedValue.applyDimension(r0, r1, r2)
            return r1
    }
}
