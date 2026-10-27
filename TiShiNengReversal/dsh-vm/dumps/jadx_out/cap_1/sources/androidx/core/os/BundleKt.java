package androidx.core.os;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class BundleKt {
    @org.jetbrains.annotations.NotNull
    public static final android.os.Bundle bundleOf() {
            android.os.Bundle r0 = new android.os.Bundle
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.os.Bundle bundleOf(@org.jetbrains.annotations.NotNull kotlin.Pair<java.lang.String, ? extends java.lang.Object>... r9) {
            android.os.Bundle r0 = new android.os.Bundle
            int r1 = r9.length
            r0.<init>(r1)
            int r1 = r9.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L1e1
            r3 = r9[r2]
            java.lang.Object r4 = r3.component1()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.component2()
            if (r3 != 0) goto L1e
            r3 = 0
            r0.putString(r4, r3)
            goto L1b5
        L1e:
            boolean r5 = r3 instanceof java.lang.Boolean
            if (r5 == 0) goto L2d
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r0.putBoolean(r4, r3)
            goto L1b5
        L2d:
            boolean r5 = r3 instanceof java.lang.Byte
            if (r5 == 0) goto L3c
            java.lang.Number r3 = (java.lang.Number) r3
            byte r3 = r3.byteValue()
            r0.putByte(r4, r3)
            goto L1b5
        L3c:
            boolean r5 = r3 instanceof java.lang.Character
            if (r5 == 0) goto L4b
            java.lang.Character r3 = (java.lang.Character) r3
            char r3 = r3.charValue()
            r0.putChar(r4, r3)
            goto L1b5
        L4b:
            boolean r5 = r3 instanceof java.lang.Double
            if (r5 == 0) goto L5a
            java.lang.Number r3 = (java.lang.Number) r3
            double r5 = r3.doubleValue()
            r0.putDouble(r4, r5)
            goto L1b5
        L5a:
            boolean r5 = r3 instanceof java.lang.Float
            if (r5 == 0) goto L69
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            r0.putFloat(r4, r3)
            goto L1b5
        L69:
            boolean r5 = r3 instanceof java.lang.Integer
            if (r5 == 0) goto L78
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r0.putInt(r4, r3)
            goto L1b5
        L78:
            boolean r5 = r3 instanceof java.lang.Long
            if (r5 == 0) goto L87
            java.lang.Number r3 = (java.lang.Number) r3
            long r5 = r3.longValue()
            r0.putLong(r4, r5)
            goto L1b5
        L87:
            boolean r5 = r3 instanceof java.lang.Short
            if (r5 == 0) goto L96
            java.lang.Number r3 = (java.lang.Number) r3
            short r3 = r3.shortValue()
            r0.putShort(r4, r3)
            goto L1b5
        L96:
            boolean r5 = r3 instanceof android.os.Bundle
            if (r5 == 0) goto La1
            android.os.Bundle r3 = (android.os.Bundle) r3
            r0.putBundle(r4, r3)
            goto L1b5
        La1:
            boolean r5 = r3 instanceof java.lang.CharSequence
            if (r5 == 0) goto Lac
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r0.putCharSequence(r4, r3)
            goto L1b5
        Lac:
            boolean r5 = r3 instanceof android.os.Parcelable
            if (r5 == 0) goto Lb7
            android.os.Parcelable r3 = (android.os.Parcelable) r3
            r0.putParcelable(r4, r3)
            goto L1b5
        Lb7:
            boolean r5 = r3 instanceof boolean[]
            if (r5 == 0) goto Lc2
            boolean[] r3 = (boolean[]) r3
            r0.putBooleanArray(r4, r3)
            goto L1b5
        Lc2:
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto Lcd
            byte[] r3 = (byte[]) r3
            r0.putByteArray(r4, r3)
            goto L1b5
        Lcd:
            boolean r5 = r3 instanceof char[]
            if (r5 == 0) goto Ld8
            char[] r3 = (char[]) r3
            r0.putCharArray(r4, r3)
            goto L1b5
        Ld8:
            boolean r5 = r3 instanceof double[]
            if (r5 == 0) goto Le3
            double[] r3 = (double[]) r3
            r0.putDoubleArray(r4, r3)
            goto L1b5
        Le3:
            boolean r5 = r3 instanceof float[]
            if (r5 == 0) goto Lee
            float[] r3 = (float[]) r3
            r0.putFloatArray(r4, r3)
            goto L1b5
        Lee:
            boolean r5 = r3 instanceof int[]
            if (r5 == 0) goto Lf9
            int[] r3 = (int[]) r3
            r0.putIntArray(r4, r3)
            goto L1b5
        Lf9:
            boolean r5 = r3 instanceof long[]
            if (r5 == 0) goto L104
            long[] r3 = (long[]) r3
            r0.putLongArray(r4, r3)
            goto L1b5
        L104:
            boolean r5 = r3 instanceof short[]
            if (r5 == 0) goto L10f
            short[] r3 = (short[]) r3
            r0.putShortArray(r4, r3)
            goto L1b5
        L10f:
            boolean r5 = r3 instanceof java.lang.Object[]
            r6 = 34
            java.lang.String r7 = " for key \""
            if (r5 == 0) goto L18e
            java.lang.Class r5 = r3.getClass()
            java.lang.Class r5 = r5.getComponentType()
            kotlin.jvm.internal.g0.m(r5)
            java.lang.Class<android.os.Parcelable> r8 = android.os.Parcelable.class
            boolean r8 = r8.isAssignableFrom(r5)
            if (r8 == 0) goto L136
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>"
            kotlin.jvm.internal.g0.n(r3, r5)
            android.os.Parcelable[] r3 = (android.os.Parcelable[]) r3
            r0.putParcelableArray(r4, r3)
            goto L1b5
        L136:
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            boolean r8 = r8.isAssignableFrom(r5)
            if (r8 == 0) goto L149
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Array<kotlin.String>"
            kotlin.jvm.internal.g0.n(r3, r5)
            java.lang.String[] r3 = (java.lang.String[]) r3
            r0.putStringArray(r4, r3)
            goto L1b5
        L149:
            java.lang.Class<java.lang.CharSequence> r8 = java.lang.CharSequence.class
            boolean r8 = r8.isAssignableFrom(r5)
            if (r8 == 0) goto L15c
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>"
            kotlin.jvm.internal.g0.n(r3, r5)
            java.lang.CharSequence[] r3 = (java.lang.CharSequence[]) r3
            r0.putCharSequenceArray(r4, r3)
            goto L1b5
        L15c:
            java.lang.Class<java.io.Serializable> r8 = java.io.Serializable.class
            boolean r8 = r8.isAssignableFrom(r5)
            if (r8 == 0) goto L16a
            java.io.Serializable r3 = (java.io.Serializable) r3
            r0.putSerializable(r4, r3)
            goto L1b5
        L16a:
            java.lang.String r9 = r5.getCanonicalName()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Illegal value array type "
            r1.append(r2)
            r1.append(r9)
            r1.append(r7)
            r1.append(r4)
            r1.append(r6)
            java.lang.String r9 = r1.toString()
            r0.<init>(r9)
            throw r0
        L18e:
            boolean r5 = r3 instanceof java.io.Serializable
            if (r5 == 0) goto L198
            java.io.Serializable r3 = (java.io.Serializable) r3
            r0.putSerializable(r4, r3)
            goto L1b5
        L198:
            boolean r5 = r3 instanceof android.os.IBinder
            if (r5 == 0) goto L1a2
            android.os.IBinder r3 = (android.os.IBinder) r3
            r0.putBinder(r4, r3)
            goto L1b5
        L1a2:
            boolean r5 = r3 instanceof android.util.Size
            if (r5 == 0) goto L1ac
            android.util.Size r3 = (android.util.Size) r3
            androidx.core.os.BundleApi21ImplKt.putSize(r0, r4, r3)
            goto L1b5
        L1ac:
            boolean r5 = r3 instanceof android.util.SizeF
            if (r5 == 0) goto L1b9
            android.util.SizeF r3 = (android.util.SizeF) r3
            androidx.core.os.BundleApi21ImplKt.putSizeF(r0, r4, r3)
        L1b5:
            int r2 = r2 + 1
            goto L8
        L1b9:
            java.lang.Class r9 = r3.getClass()
            java.lang.String r9 = r9.getCanonicalName()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Illegal value type "
            r1.append(r2)
            r1.append(r9)
            r1.append(r7)
            r1.append(r4)
            r1.append(r6)
            java.lang.String r9 = r1.toString()
            r0.<init>(r9)
            throw r0
        L1e1:
            return r0
    }
}
