package androidx.work;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class Data {
    public static final androidx.work.Data EMPTY = null;

    @android.annotation.SuppressLint({"MinMaxConstant"})
    public static final int MAX_DATA_BYTES = 10240;
    private static final java.lang.String TAG = null;
    java.util.Map<java.lang.String, java.lang.Object> mValues;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Builder {
        private java.util.Map<java.lang.String, java.lang.Object> mValues;

        public Builder() {
                r1 = this;
                r1.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.mValues = r0
                return
        }

        @androidx.annotation.NonNull
        public androidx.work.Data build() {
                r2 = this;
                androidx.work.Data r0 = new androidx.work.Data
                java.util.Map<java.lang.String, java.lang.Object> r1 = r2.mValues
                r0.<init>(r1)
                androidx.work.Data.toByteArrayInternal(r0)
                return r0
        }

        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.work.Data.Builder put(@androidx.annotation.NonNull java.lang.String r4, @androidx.annotation.Nullable java.lang.Object r5) {
                r3 = this;
                if (r5 != 0) goto L9
                java.util.Map<java.lang.String, java.lang.Object> r5 = r3.mValues
                r0 = 0
                r5.put(r4, r0)
                return r3
            L9:
                java.lang.Class r0 = r5.getClass()
                java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
                if (r0 == r1) goto Lbb
                java.lang.Class<java.lang.Byte> r1 = java.lang.Byte.class
                if (r0 == r1) goto Lbb
                java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
                if (r0 == r1) goto Lbb
                java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
                if (r0 == r1) goto Lbb
                java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
                if (r0 == r1) goto Lbb
                java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
                if (r0 == r1) goto Lbb
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                if (r0 == r1) goto Lbb
                java.lang.Class<java.lang.Boolean[]> r1 = java.lang.Boolean[].class
                if (r0 == r1) goto Lbb
                java.lang.Class<java.lang.Byte[]> r1 = java.lang.Byte[].class
                if (r0 == r1) goto Lbb
                java.lang.Class<java.lang.Integer[]> r1 = java.lang.Integer[].class
                if (r0 == r1) goto Lbb
                java.lang.Class<java.lang.Long[]> r1 = java.lang.Long[].class
                if (r0 == r1) goto Lbb
                java.lang.Class<java.lang.Float[]> r1 = java.lang.Float[].class
                if (r0 == r1) goto Lbb
                java.lang.Class<java.lang.Double[]> r1 = java.lang.Double[].class
                if (r0 == r1) goto Lbb
                java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
                if (r0 != r1) goto L46
                goto Lbb
            L46:
                java.lang.Class<boolean[]> r1 = boolean[].class
                if (r0 != r1) goto L56
                java.util.Map<java.lang.String, java.lang.Object> r0 = r3.mValues
                boolean[] r5 = (boolean[]) r5
                java.lang.Boolean[] r5 = androidx.work.Data.convertPrimitiveBooleanArray(r5)
                r0.put(r4, r5)
                return r3
            L56:
                java.lang.Class<byte[]> r1 = byte[].class
                if (r0 != r1) goto L66
                java.util.Map<java.lang.String, java.lang.Object> r0 = r3.mValues
                byte[] r5 = (byte[]) r5
                java.lang.Byte[] r5 = androidx.work.Data.convertPrimitiveByteArray(r5)
                r0.put(r4, r5)
                return r3
            L66:
                java.lang.Class<int[]> r1 = int[].class
                if (r0 != r1) goto L76
                java.util.Map<java.lang.String, java.lang.Object> r0 = r3.mValues
                int[] r5 = (int[]) r5
                java.lang.Integer[] r5 = androidx.work.Data.convertPrimitiveIntArray(r5)
                r0.put(r4, r5)
                return r3
            L76:
                java.lang.Class<long[]> r1 = long[].class
                if (r0 != r1) goto L86
                java.util.Map<java.lang.String, java.lang.Object> r0 = r3.mValues
                long[] r5 = (long[]) r5
                java.lang.Long[] r5 = androidx.work.Data.convertPrimitiveLongArray(r5)
                r0.put(r4, r5)
                return r3
            L86:
                java.lang.Class<float[]> r1 = float[].class
                if (r0 != r1) goto L96
                java.util.Map<java.lang.String, java.lang.Object> r0 = r3.mValues
                float[] r5 = (float[]) r5
                java.lang.Float[] r5 = androidx.work.Data.convertPrimitiveFloatArray(r5)
                r0.put(r4, r5)
                return r3
            L96:
                java.lang.Class<double[]> r1 = double[].class
                if (r0 != r1) goto La6
                java.util.Map<java.lang.String, java.lang.Object> r0 = r3.mValues
                double[] r5 = (double[]) r5
                java.lang.Double[] r5 = androidx.work.Data.convertPrimitiveDoubleArray(r5)
                r0.put(r4, r5)
                return r3
            La6:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                r1 = 2
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                r1[r2] = r4
                r4 = 1
                r1[r4] = r0
                java.lang.String r4 = "Key %s has invalid type %s"
                java.lang.String r4 = java.lang.String.format(r4, r1)
                r5.<init>(r4)
                throw r5
            Lbb:
                java.util.Map<java.lang.String, java.lang.Object> r0 = r3.mValues
                r0.put(r4, r5)
                return r3
        }

        @androidx.annotation.NonNull
        public androidx.work.Data.Builder putAll(@androidx.annotation.NonNull androidx.work.Data r1) {
                r0 = this;
                java.util.Map<java.lang.String, java.lang.Object> r1 = r1.mValues
                r0.putAll(r1)
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.work.Data.Builder putAll(@androidx.annotation.NonNull java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                java.util.Set r3 = r3.entrySet()
                java.util.Iterator r3 = r3.iterator()
            L8:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L22
                java.lang.Object r0 = r3.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r1 = r0.getKey()
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r0 = r0.getValue()
                r2.put(r1, r0)
                goto L8
            L22:
                return r2
        }

        @androidx.annotation.NonNull
        public androidx.work.Data.Builder putBoolean(@androidx.annotation.NonNull java.lang.String r2, boolean r3) {
                r1 = this;
                java.util.Map<java.lang.String, java.lang.Object> r0 = r1.mValues
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                r0.put(r2, r3)
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.work.Data.Builder putBooleanArray(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull boolean[] r3) {
                r1 = this;
                java.util.Map<java.lang.String, java.lang.Object> r0 = r1.mValues
                java.lang.Boolean[] r3 = androidx.work.Data.convertPrimitiveBooleanArray(r3)
                r0.put(r2, r3)
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.work.Data.Builder putByte(@androidx.annotation.NonNull java.lang.String r2, byte r3) {
                r1 = this;
                java.util.Map<java.lang.String, java.lang.Object> r0 = r1.mValues
                java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
                r0.put(r2, r3)
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.work.Data.Builder putByteArray(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull byte[] r3) {
                r1 = this;
                java.util.Map<java.lang.String, java.lang.Object> r0 = r1.mValues
                java.lang.Byte[] r3 = androidx.work.Data.convertPrimitiveByteArray(r3)
                r0.put(r2, r3)
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.work.Data.Builder putDouble(@androidx.annotation.NonNull java.lang.String r2, double r3) {
                r1 = this;
                java.util.Map<java.lang.String, java.lang.Object> r0 = r1.mValues
                java.lang.Double r3 = java.lang.Double.valueOf(r3)
                r0.put(r2, r3)
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.work.Data.Builder putDoubleArray(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull double[] r3) {
                r1 = this;
                java.util.Map<java.lang.String, java.lang.Object> r0 = r1.mValues
                java.lang.Double[] r3 = androidx.work.Data.convertPrimitiveDoubleArray(r3)
                r0.put(r2, r3)
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.work.Data.Builder putFloat(@androidx.annotation.NonNull java.lang.String r2, float r3) {
                r1 = this;
                java.util.Map<java.lang.String, java.lang.Object> r0 = r1.mValues
                java.lang.Float r3 = java.lang.Float.valueOf(r3)
                r0.put(r2, r3)
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.work.Data.Builder putFloatArray(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull float[] r3) {
                r1 = this;
                java.util.Map<java.lang.String, java.lang.Object> r0 = r1.mValues
                java.lang.Float[] r3 = androidx.work.Data.convertPrimitiveFloatArray(r3)
                r0.put(r2, r3)
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.work.Data.Builder putInt(@androidx.annotation.NonNull java.lang.String r2, int r3) {
                r1 = this;
                java.util.Map<java.lang.String, java.lang.Object> r0 = r1.mValues
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r0.put(r2, r3)
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.work.Data.Builder putIntArray(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull int[] r3) {
                r1 = this;
                java.util.Map<java.lang.String, java.lang.Object> r0 = r1.mValues
                java.lang.Integer[] r3 = androidx.work.Data.convertPrimitiveIntArray(r3)
                r0.put(r2, r3)
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.work.Data.Builder putLong(@androidx.annotation.NonNull java.lang.String r2, long r3) {
                r1 = this;
                java.util.Map<java.lang.String, java.lang.Object> r0 = r1.mValues
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                r0.put(r2, r3)
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.work.Data.Builder putLongArray(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull long[] r3) {
                r1 = this;
                java.util.Map<java.lang.String, java.lang.Object> r0 = r1.mValues
                java.lang.Long[] r3 = androidx.work.Data.convertPrimitiveLongArray(r3)
                r0.put(r2, r3)
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.work.Data.Builder putString(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.Nullable java.lang.String r3) {
                r1 = this;
                java.util.Map<java.lang.String, java.lang.Object> r0 = r1.mValues
                r0.put(r2, r3)
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.work.Data.Builder putStringArray(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.lang.String[] r3) {
                r1 = this;
                java.util.Map<java.lang.String, java.lang.Object> r0 = r1.mValues
                r0.put(r2, r3)
                return r1
        }
    }

    static {
            java.lang.String r0 = "Data"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.Data.TAG = r0
            androidx.work.Data$Builder r0 = new androidx.work.Data$Builder
            r0.<init>()
            androidx.work.Data r0 = r0.build()
            androidx.work.Data.EMPTY = r0
            return
    }

    Data() {
            r0 = this;
            r0.<init>()
            return
    }

    public Data(@androidx.annotation.NonNull androidx.work.Data r2) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            java.util.Map<java.lang.String, java.lang.Object> r2 = r2.mValues
            r0.<init>(r2)
            r1.mValues = r0
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public Data(@androidx.annotation.NonNull java.util.Map<java.lang.String, ?> r2) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r2)
            r1.mValues = r0
            return
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static java.lang.Boolean[] convertPrimitiveBooleanArray(@androidx.annotation.NonNull boolean[] r3) {
            int r0 = r3.length
            java.lang.Boolean[] r0 = new java.lang.Boolean[r0]
            r1 = 0
        L4:
            int r2 = r3.length
            if (r1 >= r2) goto L12
            boolean r2 = r3[r1]
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L4
        L12:
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static java.lang.Byte[] convertPrimitiveByteArray(@androidx.annotation.NonNull byte[] r3) {
            int r0 = r3.length
            java.lang.Byte[] r0 = new java.lang.Byte[r0]
            r1 = 0
        L4:
            int r2 = r3.length
            if (r1 >= r2) goto L12
            r2 = r3[r1]
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L4
        L12:
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static java.lang.Double[] convertPrimitiveDoubleArray(@androidx.annotation.NonNull double[] r4) {
            int r0 = r4.length
            java.lang.Double[] r0 = new java.lang.Double[r0]
            r1 = 0
        L4:
            int r2 = r4.length
            if (r1 >= r2) goto L12
            r2 = r4[r1]
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L4
        L12:
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static java.lang.Float[] convertPrimitiveFloatArray(@androidx.annotation.NonNull float[] r3) {
            int r0 = r3.length
            java.lang.Float[] r0 = new java.lang.Float[r0]
            r1 = 0
        L4:
            int r2 = r3.length
            if (r1 >= r2) goto L12
            r2 = r3[r1]
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L4
        L12:
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static java.lang.Integer[] convertPrimitiveIntArray(@androidx.annotation.NonNull int[] r3) {
            int r0 = r3.length
            java.lang.Integer[] r0 = new java.lang.Integer[r0]
            r1 = 0
        L4:
            int r2 = r3.length
            if (r1 >= r2) goto L12
            r2 = r3[r1]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L4
        L12:
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static java.lang.Long[] convertPrimitiveLongArray(@androidx.annotation.NonNull long[] r4) {
            int r0 = r4.length
            java.lang.Long[] r0 = new java.lang.Long[r0]
            r1 = 0
        L4:
            int r2 = r4.length
            if (r1 >= r2) goto L12
            r2 = r4[r1]
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L4
        L12:
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static byte[] convertToPrimitiveArray(@androidx.annotation.NonNull java.lang.Byte[] r3) {
            int r0 = r3.length
            byte[] r0 = new byte[r0]
            r1 = 0
        L4:
            int r2 = r3.length
            if (r1 >= r2) goto L12
            r2 = r3[r1]
            byte r2 = r2.byteValue()
            r0[r1] = r2
            int r1 = r1 + 1
            goto L4
        L12:
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static double[] convertToPrimitiveArray(@androidx.annotation.NonNull java.lang.Double[] r4) {
            int r0 = r4.length
            double[] r0 = new double[r0]
            r1 = 0
        L4:
            int r2 = r4.length
            if (r1 >= r2) goto L12
            r2 = r4[r1]
            double r2 = r2.doubleValue()
            r0[r1] = r2
            int r1 = r1 + 1
            goto L4
        L12:
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static float[] convertToPrimitiveArray(@androidx.annotation.NonNull java.lang.Float[] r3) {
            int r0 = r3.length
            float[] r0 = new float[r0]
            r1 = 0
        L4:
            int r2 = r3.length
            if (r1 >= r2) goto L12
            r2 = r3[r1]
            float r2 = r2.floatValue()
            r0[r1] = r2
            int r1 = r1 + 1
            goto L4
        L12:
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static int[] convertToPrimitiveArray(@androidx.annotation.NonNull java.lang.Integer[] r3) {
            int r0 = r3.length
            int[] r0 = new int[r0]
            r1 = 0
        L4:
            int r2 = r3.length
            if (r1 >= r2) goto L12
            r2 = r3[r1]
            int r2 = r2.intValue()
            r0[r1] = r2
            int r1 = r1 + 1
            goto L4
        L12:
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static long[] convertToPrimitiveArray(@androidx.annotation.NonNull java.lang.Long[] r4) {
            int r0 = r4.length
            long[] r0 = new long[r0]
            r1 = 0
        L4:
            int r2 = r4.length
            if (r1 >= r2) goto L12
            r2 = r4[r1]
            long r2 = r2.longValue()
            r0[r1] = r2
            int r1 = r1 + 1
            goto L4
        L12:
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static boolean[] convertToPrimitiveArray(@androidx.annotation.NonNull java.lang.Boolean[] r3) {
            int r0 = r3.length
            boolean[] r0 = new boolean[r0]
            r1 = 0
        L4:
            int r2 = r3.length
            if (r1 >= r2) goto L12
            r2 = r3[r1]
            boolean r2 = r2.booleanValue()
            r0[r1] = r2
            int r1 = r1 + 1
            goto L4
        L12:
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.room.TypeConverter
    public static androidx.work.Data fromByteArray(@androidx.annotation.NonNull byte[] r5) {
            int r0 = r5.length
            r1 = 10240(0x2800, float:1.4349E-41)
            if (r0 > r1) goto L50
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r5)
            r5 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L35 java.lang.Throwable -> L39
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L35 java.lang.Throwable -> L39
            int r5 = r2.readInt()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L2b
        L19:
            if (r5 <= 0) goto L2e
            java.lang.String r3 = r2.readUTF()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L2b
            java.lang.Object r4 = r2.readObject()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L2b
            r0.put(r3, r4)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L2b
            int r5 = r5 + (-1)
            goto L19
        L29:
            r5 = move-exception
            goto L3b
        L2b:
            r5 = r2
            goto L44
        L2e:
            r2.close()     // Catch: java.io.IOException -> L31
        L31:
            r1.close()     // Catch: java.io.IOException -> L4a
            goto L4a
        L35:
            r0 = move-exception
            r2 = r5
            r5 = r0
            goto L3b
        L39:
            goto L44
        L3b:
            if (r2 == 0) goto L40
            r2.close()     // Catch: java.io.IOException -> L40
        L40:
            r1.close()     // Catch: java.io.IOException -> L43
        L43:
            throw r5
        L44:
            if (r5 == 0) goto L31
            r5.close()     // Catch: java.io.IOException -> L31
            goto L31
        L4a:
            androidx.work.Data r5 = new androidx.work.Data
            r5.<init>(r0)
            return r5
        L50:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r5.<init>(r0)
            throw r5
    }

    @androidx.annotation.NonNull
    @androidx.room.TypeConverter
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static byte[] toByteArrayInternal(@androidx.annotation.NonNull androidx.work.Data r4) {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 0
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L5d
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L5d
            int r1 = r4.size()     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3c
            r2.writeInt(r1)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3c
            java.util.Map<java.lang.String, java.lang.Object> r4 = r4.mValues     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3c
            java.util.Set r4 = r4.entrySet()     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3c
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3c
        L1c:
            boolean r1 = r4.hasNext()     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3c
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r4.next()     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3c
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3c
            java.lang.Object r3 = r1.getKey()     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3c
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3c
            r2.writeUTF(r3)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3c
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3c
            r2.writeObject(r1)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3c
            goto L1c
        L39:
            r4 = move-exception
            r1 = r2
            goto L6a
        L3c:
            r1 = r2
            goto L5d
        L3e:
            r2.close()     // Catch: java.io.IOException -> L41
        L41:
            r0.close()     // Catch: java.io.IOException -> L45
            goto L46
        L45:
        L46:
            int r4 = r0.size()
            r1 = 10240(0x2800, float:1.4349E-41)
            if (r4 > r1) goto L53
            byte[] r4 = r0.toByteArray()
            return r4
        L53:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r4.<init>(r0)
            throw r4
        L5b:
            r4 = move-exception
            goto L6a
        L5d:
            byte[] r4 = r0.toByteArray()     // Catch: java.lang.Throwable -> L5b
            if (r1 == 0) goto L66
            r1.close()     // Catch: java.io.IOException -> L66
        L66:
            r0.close()     // Catch: java.io.IOException -> L69
        L69:
            return r4
        L6a:
            if (r1 == 0) goto L6f
            r1.close()     // Catch: java.io.IOException -> L6f
        L6f:
            r0.close()     // Catch: java.io.IOException -> L72
        L72:
            throw r4
    }

    public boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            r1 = 0
            if (r7 == 0) goto L65
            java.lang.Class<androidx.work.Data> r2 = androidx.work.Data.class
            java.lang.Class r3 = r7.getClass()
            if (r2 == r3) goto L10
            goto L65
        L10:
            androidx.work.Data r7 = (androidx.work.Data) r7
            java.util.Map<java.lang.String, java.lang.Object> r2 = r6.mValues
            java.util.Set r2 = r2.keySet()
            java.util.Map<java.lang.String, java.lang.Object> r3 = r7.mValues
            java.util.Set r3 = r3.keySet()
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L25
            return r1
        L25:
            java.util.Iterator r2 = r2.iterator()
        L29:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L64
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.util.Map<java.lang.String, java.lang.Object> r4 = r6.mValues
            java.lang.Object r4 = r4.get(r3)
            java.util.Map<java.lang.String, java.lang.Object> r5 = r7.mValues
            java.lang.Object r3 = r5.get(r3)
            if (r4 == 0) goto L5c
            if (r3 != 0) goto L46
            goto L5c
        L46:
            boolean r5 = r4 instanceof java.lang.Object[]
            if (r5 == 0) goto L57
            boolean r5 = r3 instanceof java.lang.Object[]
            if (r5 == 0) goto L57
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            boolean r3 = java.util.Arrays.deepEquals(r4, r3)
            goto L61
        L57:
            boolean r3 = r4.equals(r3)
            goto L61
        L5c:
            if (r4 != r3) goto L60
            r3 = 1
            goto L61
        L60:
            r3 = 0
        L61:
            if (r3 != 0) goto L29
            return r1
        L64:
            return r0
        L65:
            return r1
    }

    public boolean getBoolean(@androidx.annotation.NonNull java.lang.String r2, boolean r3) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.mValues
            java.lang.Object r2 = r0.get(r2)
            boolean r0 = r2 instanceof java.lang.Boolean
            if (r0 == 0) goto L11
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            return r2
        L11:
            return r3
    }

    @androidx.annotation.Nullable
    public boolean[] getBooleanArray(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.mValues
            java.lang.Object r2 = r0.get(r2)
            boolean r0 = r2 instanceof java.lang.Boolean[]
            if (r0 == 0) goto L11
            java.lang.Boolean[] r2 = (java.lang.Boolean[]) r2
            boolean[] r2 = convertToPrimitiveArray(r2)
            return r2
        L11:
            r2 = 0
            return r2
    }

    public byte getByte(@androidx.annotation.NonNull java.lang.String r2, byte r3) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.mValues
            java.lang.Object r2 = r0.get(r2)
            boolean r0 = r2 instanceof java.lang.Byte
            if (r0 == 0) goto L11
            java.lang.Byte r2 = (java.lang.Byte) r2
            byte r2 = r2.byteValue()
            return r2
        L11:
            return r3
    }

    @androidx.annotation.Nullable
    public byte[] getByteArray(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.mValues
            java.lang.Object r2 = r0.get(r2)
            boolean r0 = r2 instanceof java.lang.Byte[]
            if (r0 == 0) goto L11
            java.lang.Byte[] r2 = (java.lang.Byte[]) r2
            byte[] r2 = convertToPrimitiveArray(r2)
            return r2
        L11:
            r2 = 0
            return r2
    }

    public double getDouble(@androidx.annotation.NonNull java.lang.String r2, double r3) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.mValues
            java.lang.Object r2 = r0.get(r2)
            boolean r0 = r2 instanceof java.lang.Double
            if (r0 == 0) goto L11
            java.lang.Double r2 = (java.lang.Double) r2
            double r2 = r2.doubleValue()
            return r2
        L11:
            return r3
    }

    @androidx.annotation.Nullable
    public double[] getDoubleArray(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.mValues
            java.lang.Object r2 = r0.get(r2)
            boolean r0 = r2 instanceof java.lang.Double[]
            if (r0 == 0) goto L11
            java.lang.Double[] r2 = (java.lang.Double[]) r2
            double[] r2 = convertToPrimitiveArray(r2)
            return r2
        L11:
            r2 = 0
            return r2
    }

    public float getFloat(@androidx.annotation.NonNull java.lang.String r2, float r3) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.mValues
            java.lang.Object r2 = r0.get(r2)
            boolean r0 = r2 instanceof java.lang.Float
            if (r0 == 0) goto L11
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            return r2
        L11:
            return r3
    }

    @androidx.annotation.Nullable
    public float[] getFloatArray(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.mValues
            java.lang.Object r2 = r0.get(r2)
            boolean r0 = r2 instanceof java.lang.Float[]
            if (r0 == 0) goto L11
            java.lang.Float[] r2 = (java.lang.Float[]) r2
            float[] r2 = convertToPrimitiveArray(r2)
            return r2
        L11:
            r2 = 0
            return r2
    }

    public int getInt(@androidx.annotation.NonNull java.lang.String r2, int r3) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.mValues
            java.lang.Object r2 = r0.get(r2)
            boolean r0 = r2 instanceof java.lang.Integer
            if (r0 == 0) goto L11
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            return r2
        L11:
            return r3
    }

    @androidx.annotation.Nullable
    public int[] getIntArray(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.mValues
            java.lang.Object r2 = r0.get(r2)
            boolean r0 = r2 instanceof java.lang.Integer[]
            if (r0 == 0) goto L11
            java.lang.Integer[] r2 = (java.lang.Integer[]) r2
            int[] r2 = convertToPrimitiveArray(r2)
            return r2
        L11:
            r2 = 0
            return r2
    }

    @androidx.annotation.NonNull
    public java.util.Map<java.lang.String, java.lang.Object> getKeyValueMap() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.mValues
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            return r0
    }

    public long getLong(@androidx.annotation.NonNull java.lang.String r2, long r3) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.mValues
            java.lang.Object r2 = r0.get(r2)
            boolean r0 = r2 instanceof java.lang.Long
            if (r0 == 0) goto L11
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            return r2
        L11:
            return r3
    }

    @androidx.annotation.Nullable
    public long[] getLongArray(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.mValues
            java.lang.Object r2 = r0.get(r2)
            boolean r0 = r2 instanceof java.lang.Long[]
            if (r0 == 0) goto L11
            java.lang.Long[] r2 = (java.lang.Long[]) r2
            long[] r2 = convertToPrimitiveArray(r2)
            return r2
        L11:
            r2 = 0
            return r2
    }

    @androidx.annotation.Nullable
    public java.lang.String getString(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.mValues
            java.lang.Object r2 = r0.get(r2)
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto Ld
            java.lang.String r2 = (java.lang.String) r2
            return r2
        Ld:
            r2 = 0
            return r2
    }

    @androidx.annotation.Nullable
    public java.lang.String[] getStringArray(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.mValues
            java.lang.Object r2 = r0.get(r2)
            boolean r0 = r2 instanceof java.lang.String[]
            if (r0 == 0) goto Ld
            java.lang.String[] r2 = (java.lang.String[]) r2
            return r2
        Ld:
            r2 = 0
            return r2
    }

    public <T> boolean hasKeyWithValueOfType(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.lang.Class<T> r3) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.mValues
            java.lang.Object r2 = r0.get(r2)
            if (r2 == 0) goto L14
            java.lang.Class r2 = r2.getClass()
            boolean r2 = r3.isAssignableFrom(r2)
            if (r2 == 0) goto L14
            r2 = 1
            return r2
        L14:
            r2 = 0
            return r2
    }

    public int hashCode() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.mValues
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    @androidx.annotation.VisibleForTesting
    public int size() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.mValues
            int r0 = r0.size()
            return r0
    }

    @androidx.annotation.NonNull
    public byte[] toByteArray() {
            r1 = this;
            byte[] r0 = toByteArrayInternal(r1)
            return r0
    }

    @androidx.annotation.NonNull
    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Data {"
            r0.<init>(r1)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r4.mValues
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L4a
            java.util.Map<java.lang.String, java.lang.Object> r1 = r4.mValues
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L19:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4a
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
            java.lang.String r3 = " : "
            r0.append(r3)
            java.util.Map<java.lang.String, java.lang.Object> r3 = r4.mValues
            java.lang.Object r2 = r3.get(r2)
            boolean r3 = r2 instanceof java.lang.Object[]
            if (r3 == 0) goto L41
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            java.lang.String r2 = java.util.Arrays.toString(r2)
            r0.append(r2)
            goto L44
        L41:
            r0.append(r2)
        L44:
            java.lang.String r2 = ", "
            r0.append(r2)
            goto L19
        L4a:
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
