package androidx.core.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class Preconditions {
    private Preconditions() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void checkArgument(boolean r0) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
    }

    public static void checkArgument(boolean r0, @androidx.annotation.NonNull java.lang.Object r1) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            throw r0
    }

    public static void checkArgument(boolean r0, @androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull java.lang.Object... r2) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.<init>(r1)
            throw r0
    }

    public static float checkArgumentFinite(float r1, @androidx.annotation.NonNull java.lang.String r2) {
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto L24
            boolean r0 = java.lang.Float.isInfinite(r1)
            if (r0 != 0) goto Ld
            return r1
        Ld:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = " must not be infinite"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r1.<init>(r2)
            throw r1
        L24:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = " must not be NaN"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r1.<init>(r2)
            throw r1
    }

    public static double checkArgumentInRange(double r5, double r7, double r9, @androidx.annotation.NonNull java.lang.String r11) {
            r0 = 2
            r1 = 1
            r2 = 0
            r3 = 3
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r4 < 0) goto L2b
            int r4 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r4 > 0) goto Ld
            return r5
        Ld:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.util.Locale r6 = java.util.Locale.US
            java.lang.Double r7 = java.lang.Double.valueOf(r7)
            java.lang.Double r8 = java.lang.Double.valueOf(r9)
            java.lang.Object[] r9 = new java.lang.Object[r3]
            r9[r2] = r11
            r9[r1] = r7
            r9[r0] = r8
            java.lang.String r7 = "%s is out of range of [%f, %f] (too high)"
            java.lang.String r6 = java.lang.String.format(r6, r7, r9)
            r5.<init>(r6)
            throw r5
        L2b:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.util.Locale r6 = java.util.Locale.US
            java.lang.Double r7 = java.lang.Double.valueOf(r7)
            java.lang.Double r8 = java.lang.Double.valueOf(r9)
            java.lang.Object[] r9 = new java.lang.Object[r3]
            r9[r2] = r11
            r9[r1] = r7
            r9[r0] = r8
            java.lang.String r7 = "%s is out of range of [%f, %f] (too low)"
            java.lang.String r6 = java.lang.String.format(r6, r7, r9)
            r5.<init>(r6)
            throw r5
    }

    public static float checkArgumentInRange(float r5, float r6, float r7, @androidx.annotation.NonNull java.lang.String r8) {
            r0 = 2
            r1 = 1
            r2 = 0
            r3 = 3
            int r4 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r4 < 0) goto L2b
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r4 > 0) goto Ld
            return r5
        Ld:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.util.Locale r4 = java.util.Locale.US
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r8
            r3[r1] = r6
            r3[r0] = r7
            java.lang.String r6 = "%s is out of range of [%f, %f] (too high)"
            java.lang.String r6 = java.lang.String.format(r4, r6, r3)
            r5.<init>(r6)
            throw r5
        L2b:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.util.Locale r4 = java.util.Locale.US
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r8
            r3[r1] = r6
            r3[r0] = r7
            java.lang.String r6 = "%s is out of range of [%f, %f] (too low)"
            java.lang.String r6 = java.lang.String.format(r4, r6, r3)
            r5.<init>(r6)
            throw r5
    }

    public static int checkArgumentInRange(int r5, int r6, int r7, @androidx.annotation.NonNull java.lang.String r8) {
            r0 = 2
            r1 = 1
            r2 = 0
            r3 = 3
            if (r5 < r6) goto L27
            if (r5 > r7) goto L9
            return r5
        L9:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.util.Locale r4 = java.util.Locale.US
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r8
            r3[r1] = r6
            r3[r0] = r7
            java.lang.String r6 = "%s is out of range of [%d, %d] (too high)"
            java.lang.String r6 = java.lang.String.format(r4, r6, r3)
            r5.<init>(r6)
            throw r5
        L27:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.util.Locale r4 = java.util.Locale.US
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r8
            r3[r1] = r6
            r3[r0] = r7
            java.lang.String r6 = "%s is out of range of [%d, %d] (too low)"
            java.lang.String r6 = java.lang.String.format(r4, r6, r3)
            r5.<init>(r6)
            throw r5
    }

    public static long checkArgumentInRange(long r5, long r7, long r9, @androidx.annotation.NonNull java.lang.String r11) {
            r0 = 2
            r1 = 1
            r2 = 0
            r3 = 3
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r4 < 0) goto L2b
            int r4 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r4 > 0) goto Ld
            return r5
        Ld:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.util.Locale r6 = java.util.Locale.US
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            java.lang.Long r8 = java.lang.Long.valueOf(r9)
            java.lang.Object[] r9 = new java.lang.Object[r3]
            r9[r2] = r11
            r9[r1] = r7
            r9[r0] = r8
            java.lang.String r7 = "%s is out of range of [%d, %d] (too high)"
            java.lang.String r6 = java.lang.String.format(r6, r7, r9)
            r5.<init>(r6)
            throw r5
        L2b:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.util.Locale r6 = java.util.Locale.US
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            java.lang.Long r8 = java.lang.Long.valueOf(r9)
            java.lang.Object[] r9 = new java.lang.Object[r3]
            r9[r2] = r11
            r9[r1] = r7
            r9[r0] = r8
            java.lang.String r7 = "%s is out of range of [%d, %d] (too low)"
            java.lang.String r6 = java.lang.String.format(r6, r7, r9)
            r5.<init>(r6)
            throw r5
    }

    @androidx.annotation.IntRange(from = 0)
    public static int checkArgumentNonnegative(int r0) {
            if (r0 < 0) goto L3
            return r0
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
    }

    @androidx.annotation.IntRange(from = 0)
    public static int checkArgumentNonnegative(int r0, @androidx.annotation.Nullable java.lang.String r1) {
            if (r0 < 0) goto L3
            return r0
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
    }

    public static int checkFlagsArgument(int r3, int r4) {
            r0 = r3 & r4
            if (r0 != r3) goto L5
            return r3
        L5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Requested flags 0x"
            r1.append(r2)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r1.append(r3)
            java.lang.String r3 = ", but only 0x"
            r1.append(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r4)
            r1.append(r3)
            java.lang.String r3 = " are allowed"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @androidx.annotation.NonNull
    public static <T> T checkNotNull(@androidx.annotation.Nullable T r0) {
            r0.getClass()
            return r0
    }

    @androidx.annotation.NonNull
    public static <T> T checkNotNull(@androidx.annotation.Nullable T r0, @androidx.annotation.NonNull java.lang.Object r1) {
            if (r0 == 0) goto L3
            return r0
        L3:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            throw r0
    }

    public static void checkState(boolean r1) {
            r0 = 0
            checkState(r1, r0)
            return
    }

    public static void checkState(boolean r0, @androidx.annotation.Nullable java.lang.String r1) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
    }

    @androidx.annotation.NonNull
    public static <T extends java.lang.CharSequence> T checkStringNotEmpty(@androidx.annotation.Nullable T r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L7
            return r1
        L7:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
    }

    @androidx.annotation.NonNull
    public static <T extends java.lang.CharSequence> T checkStringNotEmpty(@androidx.annotation.Nullable T r1, @androidx.annotation.NonNull java.lang.Object r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L7
            return r1
        L7:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.<init>(r2)
            throw r1
    }

    @androidx.annotation.NonNull
    public static <T extends java.lang.CharSequence> T checkStringNotEmpty(@androidx.annotation.Nullable T r1, @androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.lang.Object... r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L7
            return r1
        L7:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = java.lang.String.format(r2, r3)
            r1.<init>(r2)
            throw r1
    }
}
