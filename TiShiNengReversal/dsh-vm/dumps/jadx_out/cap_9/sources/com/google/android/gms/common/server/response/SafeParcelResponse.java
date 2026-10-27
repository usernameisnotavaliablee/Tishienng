package com.google.android.gms.common.server.response;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "SafeParcelResponseCreator")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class SafeParcelResponse extends com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse {

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.server.response.SafeParcelResponse> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField(getter = "getVersionCode", id = 1)
    private final int zaa;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getParcel", id = 2)
    private final android.os.Parcel zab;
    private final int zac;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getFieldMappingDictionary", id = 3)
    private final com.google.android.gms.common.server.response.zan zad;

    @androidx.annotation.Nullable
    private final java.lang.String zae;
    private int zaf;
    private int zag;

    static {
            com.google.android.gms.common.server.response.zaq r0 = new com.google.android.gms.common.server.response.zaq
            r0.<init>()
            com.google.android.gms.common.server.response.SafeParcelResponse.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    SafeParcelResponse(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) android.os.Parcel r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) com.google.android.gms.common.server.response.zan r3) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            android.os.Parcel r1 = (android.os.Parcel) r1
            r0.zab = r1
            r1 = 2
            r0.zac = r1
            r0.zad = r3
            if (r3 != 0) goto L18
            r2 = 0
        L15:
            r0.zae = r2
            goto L1d
        L18:
            java.lang.String r2 = r3.zaa()
            goto L15
        L1d:
            r0.zaf = r1
            return
    }

    private SafeParcelResponse(com.google.android.gms.common.internal.safeparcel.SafeParcelable r4, com.google.android.gms.common.server.response.zan r5, java.lang.String r6) {
            r3 = this;
            r3.<init>()
            r0 = 1
            r3.zaa = r0
            android.os.Parcel r1 = android.os.Parcel.obtain()
            r3.zab = r1
            r2 = 0
            r4.writeToParcel(r1, r2)
            r3.zac = r0
            java.lang.Object r4 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            com.google.android.gms.common.server.response.zan r4 = (com.google.android.gms.common.server.response.zan) r4
            r3.zad = r4
            java.lang.Object r4 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)
            java.lang.String r4 = (java.lang.String) r4
            r3.zae = r4
            r4 = 2
            r3.zaf = r4
            return
    }

    public SafeParcelResponse(com.google.android.gms.common.server.response.zan r2, java.lang.String r3) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.zaa = r0
            android.os.Parcel r0 = android.os.Parcel.obtain()
            r1.zab = r0
            r0 = 0
            r1.zac = r0
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            com.google.android.gms.common.server.response.zan r2 = (com.google.android.gms.common.server.response.zan) r2
            r1.zad = r2
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            java.lang.String r2 = (java.lang.String) r2
            r1.zae = r2
            r1.zaf = r0
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static <T extends com.google.android.gms.common.server.response.FastJsonResponse & com.google.android.gms.common.internal.safeparcel.SafeParcelable> com.google.android.gms.common.server.response.SafeParcelResponse from(@androidx.annotation.NonNull T r3) {
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getCanonicalName()
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            java.lang.String r0 = (java.lang.String) r0
            com.google.android.gms.common.server.response.zan r1 = new com.google.android.gms.common.server.response.zan
            java.lang.Class r2 = r3.getClass()
            r1.<init>(r2)
            zaF(r1, r3)
            r1.zac()
            r1.zad()
            com.google.android.gms.common.server.response.SafeParcelResponse r2 = new com.google.android.gms.common.server.response.SafeParcelResponse
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r3 = (com.google.android.gms.common.internal.safeparcel.SafeParcelable) r3
            r2.<init>(r3, r1, r0)
            return r2
    }

    private static void zaF(com.google.android.gms.common.server.response.zan r3, com.google.android.gms.common.server.response.FastJsonResponse r4) {
            java.lang.Class r0 = r4.getClass()
            boolean r1 = r3.zaf(r0)
            if (r1 != 0) goto L75
            java.util.Map r4 = r4.getFieldMappings()
            r3.zae(r0, r4)
            java.util.Set r0 = r4.keySet()
            java.util.Iterator r0 = r0.iterator()
        L19:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L75
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r4.get(r1)
            com.google.android.gms.common.server.response.FastJsonResponse$Field r1 = (com.google.android.gms.common.server.response.FastJsonResponse.Field) r1
            java.lang.Class r2 = r1.zag
            if (r2 == 0) goto L19
            java.lang.Object r2 = r2.newInstance()     // Catch: java.lang.IllegalAccessException -> L39 java.lang.InstantiationException -> L3b
            com.google.android.gms.common.server.response.FastJsonResponse r2 = (com.google.android.gms.common.server.response.FastJsonResponse) r2     // Catch: java.lang.IllegalAccessException -> L39 java.lang.InstantiationException -> L3b
            zaF(r3, r2)     // Catch: java.lang.IllegalAccessException -> L39 java.lang.InstantiationException -> L3b
            goto L19
        L39:
            r3 = move-exception
            goto L3d
        L3b:
            r3 = move-exception
            goto L59
        L3d:
            java.lang.Class r4 = r1.zag
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.Object r4 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            java.lang.Class r4 = (java.lang.Class) r4
            java.lang.String r4 = r4.getCanonicalName()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r1 = "Could not access object of type "
            java.lang.String r4 = r1.concat(r4)
            r0.<init>(r4, r3)
            throw r0
        L59:
            java.lang.Class r4 = r1.zag
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.Object r4 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            java.lang.Class r4 = (java.lang.Class) r4
            java.lang.String r4 = r4.getCanonicalName()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r1 = "Could not instantiate an object of type "
            java.lang.String r4 = r1.concat(r4)
            r0.<init>(r4, r3)
            throw r0
        L75:
            return
    }

    private final void zaG(com.google.android.gms.common.server.response.FastJsonResponse.Field r3) {
            r2 = this;
            int r3 = r3.zaf
            r0 = -1
            if (r3 == r0) goto L2a
            android.os.Parcel r3 = r2.zab
            if (r3 == 0) goto L22
            int r0 = r2.zaf
            r1 = 1
            if (r0 == 0) goto L19
            if (r0 != r1) goto L11
            return
        L11:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Attempted to parse JSON with a SafeParcelResponse object that is already filled with data."
            r3.<init>(r0)
            throw r3
        L19:
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r3)
            r2.zag = r3
            r2.zaf = r1
            return
        L22:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Internal Parcel object is null."
            r3.<init>(r0)
            throw r3
        L2a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Field does not have a valid safe parcelable field id."
            r3.<init>(r0)
            throw r3
    }

    private final void zaH(java.lang.StringBuilder r11, java.util.Map r12, android.os.Parcel r13) {
            r10 = this;
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            java.util.Set r12 = r12.entrySet()
            java.util.Iterator r12 = r12.iterator()
        Ld:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r12.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            com.google.android.gms.common.server.response.FastJsonResponse$Field r2 = (com.google.android.gms.common.server.response.FastJsonResponse.Field) r2
            int r2 = r2.getSafeParcelableFieldId()
            r0.put(r2, r1)
            goto Ld
        L27:
            r12 = 123(0x7b, float:1.72E-43)
            r11.append(r12)
            int r12 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r13)
            r1 = 0
            r2 = 0
        L32:
            int r3 = r13.dataPosition()
            if (r3 >= r12) goto L2a5
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r13)
            int r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r3)
            java.lang.Object r4 = r0.get(r4)
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            if (r4 == 0) goto L32
            java.lang.String r5 = ","
            if (r2 == 0) goto L4f
            r11.append(r5)
        L4f:
            java.lang.Object r2 = r4.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r4.getValue()
            com.google.android.gms.common.server.response.FastJsonResponse$Field r4 = (com.google.android.gms.common.server.response.FastJsonResponse.Field) r4
            java.lang.String r6 = "\""
            r11.append(r6)
            r11.append(r2)
            java.lang.String r2 = "\":"
            r11.append(r2)
            boolean r2 = r4.zaj()
            r7 = 1
            if (r2 == 0) goto L149
            int r2 = r4.zac
            switch(r2) {
                case 0: goto L138;
                case 1: goto L12c;
                case 2: goto L11c;
                case 3: goto L10c;
                case 4: goto Lfc;
                case 5: goto Lf0;
                case 6: goto Le0;
                case 7: goto Ld4;
                case 8: goto Lc8;
                case 9: goto Lc8;
                case 10: goto L93;
                case 11: goto L8b;
                default: goto L74;
            }
        L74:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Unknown field out type = "
            r12.append(r13)
            r12.append(r2)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L8b:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Method does not accept concrete type."
            r11.<init>(r12)
            throw r11
        L93:
            android.os.Bundle r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(r13, r3)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.Set r5 = r2.keySet()
            java.util.Iterator r5 = r5.iterator()
        La4:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto Lbe
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r8 = r2.getString(r6)
            java.lang.Object r8 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)
            java.lang.String r8 = (java.lang.String) r8
            r3.put(r6, r8)
            goto La4
        Lbe:
            java.lang.Object r2 = com.google.android.gms.common.server.response.FastJsonResponse.zaD(r4, r3)
            zaJ(r11, r4, r2)
        Lc5:
            r2 = 1
            goto L32
        Lc8:
            byte[] r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(r13, r3)
            java.lang.Object r2 = com.google.android.gms.common.server.response.FastJsonResponse.zaD(r4, r2)
            zaJ(r11, r4, r2)
            goto Lc5
        Ld4:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r13, r3)
            java.lang.Object r2 = com.google.android.gms.common.server.response.FastJsonResponse.zaD(r4, r2)
            zaJ(r11, r4, r2)
            goto Lc5
        Le0:
            boolean r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r13, r3)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.Object r2 = com.google.android.gms.common.server.response.FastJsonResponse.zaD(r4, r2)
            zaJ(r11, r4, r2)
            goto Lc5
        Lf0:
            java.math.BigDecimal r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBigDecimal(r13, r3)
            java.lang.Object r2 = com.google.android.gms.common.server.response.FastJsonResponse.zaD(r4, r2)
            zaJ(r11, r4, r2)
            goto Lc5
        Lfc:
            double r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readDouble(r13, r3)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            java.lang.Object r2 = com.google.android.gms.common.server.response.FastJsonResponse.zaD(r4, r2)
            zaJ(r11, r4, r2)
            goto Lc5
        L10c:
            float r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(r13, r3)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            java.lang.Object r2 = com.google.android.gms.common.server.response.FastJsonResponse.zaD(r4, r2)
            zaJ(r11, r4, r2)
            goto Lc5
        L11c:
            long r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r13, r3)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object r2 = com.google.android.gms.common.server.response.FastJsonResponse.zaD(r4, r2)
            zaJ(r11, r4, r2)
            goto Lc5
        L12c:
            java.math.BigInteger r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBigInteger(r13, r3)
            java.lang.Object r2 = com.google.android.gms.common.server.response.FastJsonResponse.zaD(r4, r2)
            zaJ(r11, r4, r2)
            goto Lc5
        L138:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r13, r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = com.google.android.gms.common.server.response.FastJsonResponse.zaD(r4, r2)
            zaJ(r11, r4, r2)
            goto Lc5
        L149:
            boolean r2 = r4.zad
            if (r2 == 0) goto L1cb
            java.lang.String r2 = "["
            r11.append(r2)
            int r2 = r4.zac
            switch(r2) {
                case 0: goto L1bd;
                case 1: goto L1b5;
                case 2: goto L1ad;
                case 3: goto L1a5;
                case 4: goto L19d;
                case 5: goto L195;
                case 6: goto L18d;
                case 7: goto L185;
                case 8: goto L17d;
                case 9: goto L17d;
                case 10: goto L17d;
                case 11: goto L15f;
                default: goto L157;
            }
        L157:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Unknown field type out."
            r11.<init>(r12)
            throw r11
        L15f:
            android.os.Parcel[] r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelArray(r13, r3)
            int r3 = r2.length
            r6 = 0
        L165:
            if (r6 >= r3) goto L1c4
            if (r6 <= 0) goto L16c
            r11.append(r5)
        L16c:
            r8 = r2[r6]
            r8.setDataPosition(r1)
            java.util.Map r8 = r4.zah()
            r9 = r2[r6]
            r10.zaH(r11, r8, r9)
            int r6 = r6 + 1
            goto L165
        L17d:
            java.lang.UnsupportedOperationException r11 = new java.lang.UnsupportedOperationException
            java.lang.String r12 = "List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported"
            r11.<init>(r12)
            throw r11
        L185:
            java.lang.String[] r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringArray(r13, r3)
            com.google.android.gms.common.util.ArrayUtils.writeStringArray(r11, r2)
            goto L1c4
        L18d:
            boolean[] r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBooleanArray(r13, r3)
            com.google.android.gms.common.util.ArrayUtils.writeArray(r11, r2)
            goto L1c4
        L195:
            java.math.BigDecimal[] r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBigDecimalArray(r13, r3)
            com.google.android.gms.common.util.ArrayUtils.writeArray(r11, r2)
            goto L1c4
        L19d:
            double[] r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createDoubleArray(r13, r3)
            com.google.android.gms.common.util.ArrayUtils.writeArray(r11, r2)
            goto L1c4
        L1a5:
            float[] r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createFloatArray(r13, r3)
            com.google.android.gms.common.util.ArrayUtils.writeArray(r11, r2)
            goto L1c4
        L1ad:
            long[] r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createLongArray(r13, r3)
            com.google.android.gms.common.util.ArrayUtils.writeArray(r11, r2)
            goto L1c4
        L1b5:
            java.math.BigInteger[] r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBigIntegerArray(r13, r3)
            com.google.android.gms.common.util.ArrayUtils.writeArray(r11, r2)
            goto L1c4
        L1bd:
            int[] r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createIntArray(r13, r3)
            com.google.android.gms.common.util.ArrayUtils.writeArray(r11, r2)
        L1c4:
            java.lang.String r2 = "]"
            r11.append(r2)
            goto Lc5
        L1cb:
            int r2 = r4.zac
            switch(r2) {
                case 0: goto L29c;
                case 1: goto L293;
                case 2: goto L28a;
                case 3: goto L281;
                case 4: goto L278;
                case 5: goto L26f;
                case 6: goto L266;
                case 7: goto L253;
                case 8: goto L240;
                case 9: goto L22d;
                case 10: goto L1e8;
                case 11: goto L1d8;
                default: goto L1d0;
            }
        L1d0:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Unknown field type out"
            r11.<init>(r12)
            throw r11
        L1d8:
            android.os.Parcel r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcel(r13, r3)
            r2.setDataPosition(r1)
            java.util.Map r3 = r4.zah()
            r10.zaH(r11, r3, r2)
            goto Lc5
        L1e8:
            android.os.Bundle r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(r13, r3)
            java.util.Set r3 = r2.keySet()
            java.lang.String r4 = "{"
            r11.append(r4)
            java.util.Iterator r3 = r3.iterator()
            r4 = 1
        L1fa:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L226
            java.lang.Object r8 = r3.next()
            java.lang.String r8 = (java.lang.String) r8
            if (r4 != 0) goto L20b
            r11.append(r5)
        L20b:
            r11.append(r6)
            r11.append(r8)
            java.lang.String r4 = "\":\""
            r11.append(r4)
            java.lang.String r4 = r2.getString(r8)
            java.lang.String r4 = com.google.android.gms.common.util.JsonUtils.escapeString(r4)
            r11.append(r4)
            r11.append(r6)
            r4 = 0
            goto L1fa
        L226:
            java.lang.String r2 = "}"
            r11.append(r2)
            goto Lc5
        L22d:
            byte[] r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(r13, r3)
            r11.append(r6)
            java.lang.String r2 = com.google.android.gms.common.util.Base64Utils.encodeUrlSafe(r2)
            r11.append(r2)
            r11.append(r6)
            goto Lc5
        L240:
            byte[] r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(r13, r3)
            r11.append(r6)
            java.lang.String r2 = com.google.android.gms.common.util.Base64Utils.encode(r2)
            r11.append(r2)
            r11.append(r6)
            goto Lc5
        L253:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r13, r3)
            r11.append(r6)
            java.lang.String r2 = com.google.android.gms.common.util.JsonUtils.escapeString(r2)
            r11.append(r2)
            r11.append(r6)
            goto Lc5
        L266:
            boolean r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r13, r3)
            r11.append(r2)
            goto Lc5
        L26f:
            java.math.BigDecimal r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBigDecimal(r13, r3)
            r11.append(r2)
            goto Lc5
        L278:
            double r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readDouble(r13, r3)
            r11.append(r2)
            goto Lc5
        L281:
            float r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(r13, r3)
            r11.append(r2)
            goto Lc5
        L28a:
            long r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r13, r3)
            r11.append(r2)
            goto Lc5
        L293:
            java.math.BigInteger r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBigInteger(r13, r3)
            r11.append(r2)
            goto Lc5
        L29c:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r13, r3)
            r11.append(r2)
            goto Lc5
        L2a5:
            int r0 = r13.dataPosition()
            if (r0 != r12) goto L2b1
            r12 = 125(0x7d, float:1.75E-43)
            r11.append(r12)
            return
        L2b1:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException r11 = new com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Overread allowed size end="
            r0.append(r1)
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r11.<init>(r12, r13)
            throw r11
    }

    private static final void zaI(java.lang.StringBuilder r1, int r2, @androidx.annotation.Nullable java.lang.Object r3) {
            java.lang.String r0 = "\""
            switch(r2) {
                case 0: goto L64;
                case 1: goto L64;
                case 2: goto L64;
                case 3: goto L64;
                case 4: goto L64;
                case 5: goto L64;
                case 6: goto L64;
                case 7: goto L4e;
                case 8: goto L3e;
                case 9: goto L2e;
                case 10: goto L24;
                case 11: goto L1c;
                default: goto L5;
            }
        L5:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Unknown type = "
            r3.append(r0)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L1c:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Method does not accept concrete type."
            r1.<init>(r2)
            throw r1
        L24:
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            java.util.HashMap r2 = (java.util.HashMap) r2
            com.google.android.gms.common.util.MapUtils.writeStringMapToJson(r1, r2)
            return
        L2e:
            r1.append(r0)
            byte[] r3 = (byte[]) r3
            java.lang.String r2 = com.google.android.gms.common.util.Base64Utils.encodeUrlSafe(r3)
            r1.append(r2)
            r1.append(r0)
            return
        L3e:
            r1.append(r0)
            byte[] r3 = (byte[]) r3
            java.lang.String r2 = com.google.android.gms.common.util.Base64Utils.encode(r3)
            r1.append(r2)
            r1.append(r0)
            return
        L4e:
            r1.append(r0)
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = com.google.android.gms.common.util.JsonUtils.escapeString(r2)
            r1.append(r2)
            r1.append(r0)
            return
        L64:
            r1.append(r3)
            return
    }

    private static final void zaJ(java.lang.StringBuilder r4, com.google.android.gms.common.server.response.FastJsonResponse.Field r5, java.lang.Object r6) {
            boolean r0 = r5.zab
            if (r0 == 0) goto L2b
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            java.lang.String r0 = "["
            r4.append(r0)
            int r0 = r6.size()
            r1 = 0
        L10:
            if (r1 >= r0) goto L25
            if (r1 == 0) goto L19
            java.lang.String r2 = ","
            r4.append(r2)
        L19:
            int r2 = r5.zaa
            java.lang.Object r3 = r6.get(r1)
            zaI(r4, r2, r3)
            int r1 = r1 + 1
            goto L10
        L25:
            java.lang.String r5 = "]"
            r4.append(r5)
            return
        L2b:
            int r5 = r5.zaa
            zaI(r4, r5, r6)
            return
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final <T extends com.google.android.gms.common.server.response.FastJsonResponse> void addConcreteTypeArrayInternal(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field r4, @androidx.annotation.NonNull java.lang.String r5, @androidx.annotation.Nullable java.util.ArrayList<T> r6) {
            r3 = this;
            r3.zaG(r4)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.size()
            int r0 = r6.size()
            r1 = 0
        L16:
            if (r1 >= r0) goto L2a
            java.lang.Object r2 = r6.get(r1)
            com.google.android.gms.common.server.response.FastJsonResponse r2 = (com.google.android.gms.common.server.response.FastJsonResponse) r2
            com.google.android.gms.common.server.response.SafeParcelResponse r2 = (com.google.android.gms.common.server.response.SafeParcelResponse) r2
            android.os.Parcel r2 = r2.zaE()
            r5.add(r2)
            int r1 = r1 + 1
            goto L16
        L2a:
            android.os.Parcel r6 = r3.zab
            int r4 = r4.getSafeParcelableFieldId()
            r0 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelList(r6, r4, r5, r0)
            return
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final <T extends com.google.android.gms.common.server.response.FastJsonResponse> void addConcreteTypeInternal(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field r2, @androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.NonNull T r4) {
            r1 = this;
            r1.zaG(r2)
            com.google.android.gms.common.server.response.SafeParcelResponse r4 = (com.google.android.gms.common.server.response.SafeParcelResponse) r4
            android.os.Parcel r3 = r4.zaE()
            android.os.Parcel r4 = r1.zab
            int r2 = r2.getSafeParcelableFieldId()
            r0 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcel(r4, r2, r3, r0)
            return
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    @androidx.annotation.Nullable
    public final java.util.Map<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>> getFieldMappings() {
            r2 = this;
            com.google.android.gms.common.server.response.zan r0 = r2.zad
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.String r1 = r2.zae
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Map r0 = r0.zab(r1)
            return r0
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    @androidx.annotation.NonNull
    public final java.lang.Object getValueObject(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Converting to JSON does not require this method."
            r2.<init>(r0)
            throw r2
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean isPrimitiveFieldSet(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Converting to JSON does not require this method."
            r2.<init>(r0)
            throw r2
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void setBooleanInternal(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> r1, @androidx.annotation.NonNull java.lang.String r2, boolean r3) {
            r0 = this;
            r0.zaG(r1)
            android.os.Parcel r2 = r0.zab
            int r1 = r1.getSafeParcelableFieldId()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r2, r1, r3)
            return
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void setDecodedBytesInternal(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> r2, @androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.Nullable byte[] r4) {
            r1 = this;
            r1.zaG(r2)
            android.os.Parcel r3 = r1.zab
            int r2 = r2.getSafeParcelableFieldId()
            r0 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(r3, r2, r4, r0)
            return
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void setIntegerInternal(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> r1, @androidx.annotation.NonNull java.lang.String r2, int r3) {
            r0 = this;
            r0.zaG(r1)
            android.os.Parcel r2 = r0.zab
            int r1 = r1.getSafeParcelableFieldId()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r2, r1, r3)
            return
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void setLongInternal(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> r1, @androidx.annotation.NonNull java.lang.String r2, long r3) {
            r0 = this;
            r0.zaG(r1)
            android.os.Parcel r2 = r0.zab
            int r1 = r1.getSafeParcelableFieldId()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r2, r1, r3)
            return
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void setStringInternal(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> r2, @androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.Nullable java.lang.String r4) {
            r1 = this;
            r1.zaG(r2)
            android.os.Parcel r3 = r1.zab
            int r2 = r2.getSafeParcelableFieldId()
            r0 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r3, r2, r4, r0)
            return
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void setStringMapInternal(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> r4, @androidx.annotation.NonNull java.lang.String r5, @androidx.annotation.Nullable java.util.Map<java.lang.String, java.lang.String> r6) {
            r3 = this;
            r3.zaG(r4)
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)
            java.util.Map r0 = (java.util.Map) r0
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L16:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r6.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            r5.putString(r1, r2)
            goto L16
        L2c:
            android.os.Parcel r6 = r3.zab
            int r4 = r4.getSafeParcelableFieldId()
            r0 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(r6, r4, r5, r0)
            return
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void setStringsInternal(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> r4, @androidx.annotation.NonNull java.lang.String r5, @androidx.annotation.Nullable java.util.ArrayList<java.lang.String> r6) {
            r3 = this;
            r3.zaG(r4)
            java.lang.Object r5 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r5 = r5.size()
            java.lang.String[] r0 = new java.lang.String[r5]
            r1 = 0
        L10:
            if (r1 >= r5) goto L1d
            java.lang.Object r2 = r6.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            r0[r1] = r2
            int r1 = r1 + 1
            goto L10
        L1d:
            android.os.Parcel r5 = r3.zab
            int r4 = r4.getSafeParcelableFieldId()
            r6 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringArray(r5, r4, r0, r6)
            return
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    @androidx.annotation.NonNull
    public final java.lang.String toString() {
            r4 = this;
            com.google.android.gms.common.server.response.zan r0 = r4.zad
            java.lang.String r1 = "Cannot convert to JSON on client side."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0, r1)
            android.os.Parcel r0 = r4.zaE()
            r1 = 0
            r0.setDataPosition(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 100
            r1.<init>(r2)
            java.lang.String r2 = r4.zae
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            java.lang.String r2 = (java.lang.String) r2
            com.google.android.gms.common.server.response.zan r3 = r4.zad
            java.util.Map r2 = r3.zab(r2)
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            java.util.Map r2 = (java.util.Map) r2
            r4.zaH(r1, r2, r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@androidx.annotation.NonNull android.os.Parcel r6, int r7) {
            r5 = this;
            int r0 = r5.zaa
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r6)
            r2 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r6, r2, r0)
            android.os.Parcel r0 = r5.zaE()
            r3 = 2
            r4 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcel(r6, r3, r0, r4)
            int r0 = r5.zac
            if (r0 == 0) goto L1f
            if (r0 == r2) goto L1c
            com.google.android.gms.common.server.response.zan r0 = r5.zad
            goto L20
        L1c:
            com.google.android.gms.common.server.response.zan r0 = r5.zad
            goto L20
        L1f:
            r0 = 0
        L20:
            r2 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r6, r2, r0, r7, r4)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r6, r1)
            return
    }

    @androidx.annotation.NonNull
    public final android.os.Parcel zaE() {
            r3 = this;
            int r0 = r3.zaf
            r1 = 2
            if (r0 == 0) goto L13
            r2 = 1
            if (r0 == r2) goto L9
            goto L22
        L9:
            android.os.Parcel r0 = r3.zab
            int r2 = r3.zag
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r0, r2)
            r3.zaf = r1
            goto L22
        L13:
            android.os.Parcel r0 = r3.zab
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r0)
            r3.zag = r0
            android.os.Parcel r2 = r3.zab
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r2, r0)
            r3.zaf = r1
        L22:
            android.os.Parcel r0 = r3.zab
            return r0
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void zab(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field r2, @androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.Nullable java.math.BigDecimal r4) {
            r1 = this;
            r1.zaG(r2)
            android.os.Parcel r3 = r1.zab
            int r2 = r2.getSafeParcelableFieldId()
            r0 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBigDecimal(r3, r2, r4, r0)
            return
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void zad(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field r4, @androidx.annotation.NonNull java.lang.String r5, @androidx.annotation.Nullable java.util.ArrayList r6) {
            r3 = this;
            r3.zaG(r4)
            java.lang.Object r5 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r5 = r5.size()
            java.math.BigDecimal[] r0 = new java.math.BigDecimal[r5]
            r1 = 0
        L10:
            if (r1 >= r5) goto L1d
            java.lang.Object r2 = r6.get(r1)
            java.math.BigDecimal r2 = (java.math.BigDecimal) r2
            r0[r1] = r2
            int r1 = r1 + 1
            goto L10
        L1d:
            android.os.Parcel r5 = r3.zab
            int r4 = r4.getSafeParcelableFieldId()
            r6 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBigDecimalArray(r5, r4, r0, r6)
            return
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void zaf(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field r2, @androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.Nullable java.math.BigInteger r4) {
            r1 = this;
            r1.zaG(r2)
            android.os.Parcel r3 = r1.zab
            int r2 = r2.getSafeParcelableFieldId()
            r0 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBigInteger(r3, r2, r4, r0)
            return
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void zah(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field r4, @androidx.annotation.NonNull java.lang.String r5, @androidx.annotation.Nullable java.util.ArrayList r6) {
            r3 = this;
            r3.zaG(r4)
            java.lang.Object r5 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r5 = r5.size()
            java.math.BigInteger[] r0 = new java.math.BigInteger[r5]
            r1 = 0
        L10:
            if (r1 >= r5) goto L1d
            java.lang.Object r2 = r6.get(r1)
            java.math.BigInteger r2 = (java.math.BigInteger) r2
            r0[r1] = r2
            int r1 = r1 + 1
            goto L10
        L1d:
            android.os.Parcel r5 = r3.zab
            int r4 = r4.getSafeParcelableFieldId()
            r6 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBigIntegerArray(r5, r4, r0, r6)
            return
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void zak(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field r4, @androidx.annotation.NonNull java.lang.String r5, @androidx.annotation.Nullable java.util.ArrayList r6) {
            r3 = this;
            r3.zaG(r4)
            java.lang.Object r5 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r5 = r5.size()
            boolean[] r0 = new boolean[r5]
            r1 = 0
        L10:
            if (r1 >= r5) goto L21
            java.lang.Object r2 = r6.get(r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r0[r1] = r2
            int r1 = r1 + 1
            goto L10
        L21:
            android.os.Parcel r5 = r3.zab
            int r4 = r4.getSafeParcelableFieldId()
            r6 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBooleanArray(r5, r4, r0, r6)
            return
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void zan(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field r1, @androidx.annotation.NonNull java.lang.String r2, double r3) {
            r0 = this;
            r0.zaG(r1)
            android.os.Parcel r2 = r0.zab
            int r1 = r1.getSafeParcelableFieldId()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeDouble(r2, r1, r3)
            return
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void zap(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field r5, @androidx.annotation.NonNull java.lang.String r6, @androidx.annotation.Nullable java.util.ArrayList r7) {
            r4 = this;
            r4.zaG(r5)
            java.lang.Object r6 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            int r6 = r6.size()
            double[] r0 = new double[r6]
            r1 = 0
        L10:
            if (r1 >= r6) goto L21
            java.lang.Object r2 = r7.get(r1)
            java.lang.Double r2 = (java.lang.Double) r2
            double r2 = r2.doubleValue()
            r0[r1] = r2
            int r1 = r1 + 1
            goto L10
        L21:
            android.os.Parcel r6 = r4.zab
            int r5 = r5.getSafeParcelableFieldId()
            r7 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeDoubleArray(r6, r5, r0, r7)
            return
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void zar(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field r1, @androidx.annotation.NonNull java.lang.String r2, float r3) {
            r0 = this;
            r0.zaG(r1)
            android.os.Parcel r2 = r0.zab
            int r1 = r1.getSafeParcelableFieldId()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(r2, r1, r3)
            return
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void zat(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field r4, @androidx.annotation.NonNull java.lang.String r5, @androidx.annotation.Nullable java.util.ArrayList r6) {
            r3 = this;
            r3.zaG(r4)
            java.lang.Object r5 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r5 = r5.size()
            float[] r0 = new float[r5]
            r1 = 0
        L10:
            if (r1 >= r5) goto L21
            java.lang.Object r2 = r6.get(r1)
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r0[r1] = r2
            int r1 = r1 + 1
            goto L10
        L21:
            android.os.Parcel r5 = r3.zab
            int r4 = r4.getSafeParcelableFieldId()
            r6 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloatArray(r5, r4, r0, r6)
            return
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void zaw(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field r4, @androidx.annotation.NonNull java.lang.String r5, @androidx.annotation.Nullable java.util.ArrayList r6) {
            r3 = this;
            r3.zaG(r4)
            java.lang.Object r5 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r5 = r5.size()
            int[] r0 = new int[r5]
            r1 = 0
        L10:
            if (r1 >= r5) goto L21
            java.lang.Object r2 = r6.get(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0[r1] = r2
            int r1 = r1 + 1
            goto L10
        L21:
            android.os.Parcel r5 = r3.zab
            int r4 = r4.getSafeParcelableFieldId()
            r6 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIntArray(r5, r4, r0, r6)
            return
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void zaz(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field r5, @androidx.annotation.NonNull java.lang.String r6, @androidx.annotation.Nullable java.util.ArrayList r7) {
            r4 = this;
            r4.zaG(r5)
            java.lang.Object r6 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            int r6 = r6.size()
            long[] r0 = new long[r6]
            r1 = 0
        L10:
            if (r1 >= r6) goto L21
            java.lang.Object r2 = r7.get(r1)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r0[r1] = r2
            int r1 = r1 + 1
            goto L10
        L21:
            android.os.Parcel r6 = r4.zab
            int r5 = r5.getSafeParcelableFieldId()
            r7 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLongArray(r6, r5, r0, r7)
            return
    }
}
