package androidx.core.os;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class PersistableBundleApi21ImplKt {

    @org.jetbrains.annotations.NotNull
    public static final androidx.core.os.PersistableBundleApi21ImplKt INSTANCE = null;

    static {
            androidx.core.os.PersistableBundleApi21ImplKt r0 = new androidx.core.os.PersistableBundleApi21ImplKt
            r0.<init>()
            androidx.core.os.PersistableBundleApi21ImplKt.INSTANCE = r0
            return
    }

    private PersistableBundleApi21ImplKt() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.jvm.JvmStatic
    @androidx.annotation.DoNotInline
    @org.jetbrains.annotations.NotNull
    public static final android.os.PersistableBundle createPersistableBundle(int r1) {
            android.os.PersistableBundle r0 = new android.os.PersistableBundle
            r0.<init>(r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    @androidx.annotation.DoNotInline
    public static final void putValue(@org.jetbrains.annotations.NotNull android.os.PersistableBundle r4, @org.jetbrains.annotations.Nullable java.lang.String r5, @org.jetbrains.annotations.Nullable java.lang.Object r6) {
            if (r6 != 0) goto L7
            r6 = 0
            r4.putString(r5, r6)
            return
        L7:
            boolean r0 = r6 instanceof java.lang.Boolean
            r1 = 22
            r2 = 34
            if (r0 == 0) goto L37
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r1) goto L1d
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            androidx.core.os.PersistableBundleApi22ImplKt.putBoolean(r4, r5, r6)
            return
        L1d:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "Illegal value type boolean for key \""
            r6.append(r0)
            r6.append(r5)
            r6.append(r2)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5)
            throw r4
        L37:
            boolean r0 = r6 instanceof java.lang.Double
            if (r0 == 0) goto L45
            java.lang.Number r6 = (java.lang.Number) r6
            double r0 = r6.doubleValue()
            r4.putDouble(r5, r0)
            return
        L45:
            boolean r0 = r6 instanceof java.lang.Integer
            if (r0 == 0) goto L53
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r4.putInt(r5, r6)
            return
        L53:
            boolean r0 = r6 instanceof java.lang.Long
            if (r0 == 0) goto L61
            java.lang.Number r6 = (java.lang.Number) r6
            long r0 = r6.longValue()
            r4.putLong(r5, r0)
            return
        L61:
            boolean r0 = r6 instanceof java.lang.String
            if (r0 == 0) goto L6b
            java.lang.String r6 = (java.lang.String) r6
            r4.putString(r5, r6)
            return
        L6b:
            boolean r0 = r6 instanceof boolean[]
            if (r0 == 0) goto L93
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r1) goto L79
            boolean[] r6 = (boolean[]) r6
            androidx.core.os.PersistableBundleApi22ImplKt.putBooleanArray(r4, r5, r6)
            return
        L79:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "Illegal value type boolean[] for key \""
            r6.append(r0)
            r6.append(r5)
            r6.append(r2)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5)
            throw r4
        L93:
            boolean r0 = r6 instanceof double[]
            if (r0 == 0) goto L9d
            double[] r6 = (double[]) r6
            r4.putDoubleArray(r5, r6)
            return
        L9d:
            boolean r0 = r6 instanceof int[]
            if (r0 == 0) goto La7
            int[] r6 = (int[]) r6
            r4.putIntArray(r5, r6)
            return
        La7:
            boolean r0 = r6 instanceof long[]
            if (r0 == 0) goto Lb1
            long[] r6 = (long[]) r6
            r4.putLongArray(r5, r6)
            return
        Lb1:
            boolean r0 = r6 instanceof java.lang.Object[]
            java.lang.String r1 = " for key \""
            if (r0 == 0) goto Lf9
            java.lang.Class r0 = r6.getClass()
            java.lang.Class r0 = r0.getComponentType()
            kotlin.jvm.internal.g0.m(r0)
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            boolean r3 = r3.isAssignableFrom(r0)
            if (r3 == 0) goto Ld5
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<kotlin.String>"
            kotlin.jvm.internal.g0.n(r6, r0)
            java.lang.String[] r6 = (java.lang.String[]) r6
            r4.putStringArray(r5, r6)
            return
        Ld5:
            java.lang.String r4 = r0.getCanonicalName()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Illegal value array type "
            r0.append(r3)
            r0.append(r4)
            r0.append(r1)
            r0.append(r5)
            r0.append(r2)
            java.lang.String r4 = r0.toString()
            r6.<init>(r4)
            throw r6
        Lf9:
            java.lang.Class r4 = r6.getClass()
            java.lang.String r4 = r4.getCanonicalName()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Illegal value type "
            r0.append(r3)
            r0.append(r4)
            r0.append(r1)
            r0.append(r5)
            r0.append(r2)
            java.lang.String r4 = r0.toString()
            r6.<init>(r4)
            throw r6
    }
}
