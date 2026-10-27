package com.alibaba.fastjson;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class JSONObject extends com.alibaba.fastjson.JSON implements java.util.Map<java.lang.String, java.lang.Object>, java.lang.Cloneable, java.io.Serializable, java.lang.reflect.InvocationHandler {
    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    private static final long serialVersionUID = 1;
    private final java.util.Map<java.lang.String, java.lang.Object> map;

    public JSONObject() {
            r2 = this;
            r0 = 16
            r1 = 0
            r2.<init>(r0, r1)
            return
    }

    public JSONObject(int r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public JSONObject(int r1, boolean r2) {
            r0 = this;
            r0.<init>()
            if (r2 == 0) goto Ld
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>(r1)
            r0.map = r2
            return
        Ld:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>(r1)
            r0.map = r2
            return
    }

    public JSONObject(java.util.Map<java.lang.String, java.lang.Object> r1) {
            r0 = this;
            r0.<init>()
            r0.map = r1
            return
    }

    public JSONObject(boolean r2) {
            r1 = this;
            r0 = 16
            r1.<init>(r0, r2)
            return
    }

    @Override // java.util.Map
    public void clear() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.map
            r0.clear()
            return
    }

    public java.lang.Object clone() {
            r3 = this;
            com.alibaba.fastjson.JSONObject r0 = new com.alibaba.fastjson.JSONObject
            java.util.Map<java.lang.String, java.lang.Object> r1 = r3.map
            boolean r1 = r1 instanceof java.util.LinkedHashMap
            if (r1 == 0) goto L10
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            java.util.Map<java.lang.String, java.lang.Object> r2 = r3.map
            r1.<init>(r2)
            goto L17
        L10:
            java.util.HashMap r1 = new java.util.HashMap
            java.util.Map<java.lang.String, java.lang.Object> r2 = r3.map
            r1.<init>(r2)
        L17:
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.map
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.map
            boolean r2 = r0.containsValue(r2)
            return r2
    }

    @Override // java.util.Map
    public java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.Object>> entrySet() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.map
            java.util.Set r0 = r0.entrySet()
            return r0
    }

    @Override // java.util.Map
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.map
            boolean r2 = r0.equals(r2)
            return r2
    }

    public com.alibaba.fastjson.JSONObject fluentClear() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.map
            r0.clear()
            return r1
    }

    public com.alibaba.fastjson.JSONObject fluentPut(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.map
            r0.put(r2, r3)
            return r1
    }

    public com.alibaba.fastjson.JSONObject fluentPutAll(java.util.Map<? extends java.lang.String, ? extends java.lang.Object> r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.map
            r0.putAll(r2)
            return r1
    }

    public com.alibaba.fastjson.JSONObject fluentRemove(java.lang.Object r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.map
            r0.remove(r2)
            return r1
    }

    @Override // java.util.Map
    public java.lang.Object get(java.lang.Object r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.map
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    public java.math.BigDecimal getBigDecimal(java.lang.String r1) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            java.math.BigDecimal r1 = com.alibaba.fastjson.util.TypeUtils.castToBigDecimal(r1)
            return r1
    }

    public java.math.BigInteger getBigInteger(java.lang.String r1) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            java.math.BigInteger r1 = com.alibaba.fastjson.util.TypeUtils.castToBigInteger(r1)
            return r1
    }

    public java.lang.Boolean getBoolean(java.lang.String r1) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.Boolean r1 = com.alibaba.fastjson.util.TypeUtils.castToBoolean(r1)
            return r1
    }

    public boolean getBooleanValue(java.lang.String r1) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.Boolean r1 = com.alibaba.fastjson.util.TypeUtils.castToBoolean(r1)
            boolean r1 = r1.booleanValue()
            return r1
    }

    public java.lang.Byte getByte(java.lang.String r1) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            java.lang.Byte r1 = com.alibaba.fastjson.util.TypeUtils.castToByte(r1)
            return r1
    }

    public byte getByteValue(java.lang.String r1) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.Byte r1 = com.alibaba.fastjson.util.TypeUtils.castToByte(r1)
            byte r1 = r1.byteValue()
            return r1
    }

    public byte[] getBytes(java.lang.String r1) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            byte[] r1 = com.alibaba.fastjson.util.TypeUtils.castToBytes(r1)
            return r1
    }

    public java.util.Date getDate(java.lang.String r1) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            java.util.Date r1 = com.alibaba.fastjson.util.TypeUtils.castToDate(r1)
            return r1
    }

    public java.lang.Double getDouble(java.lang.String r1) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            java.lang.Double r1 = com.alibaba.fastjson.util.TypeUtils.castToDouble(r1)
            return r1
    }

    public double getDoubleValue(java.lang.String r3) {
            r2 = this;
            java.lang.Object r3 = r2.get(r3)
            if (r3 != 0) goto L9
            r0 = 0
            return r0
        L9:
            java.lang.Double r3 = com.alibaba.fastjson.util.TypeUtils.castToDouble(r3)
            double r0 = r3.doubleValue()
            return r0
    }

    public java.lang.Float getFloat(java.lang.String r1) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            java.lang.Float r1 = com.alibaba.fastjson.util.TypeUtils.castToFloat(r1)
            return r1
    }

    public float getFloatValue(java.lang.String r1) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.Float r1 = com.alibaba.fastjson.util.TypeUtils.castToFloat(r1)
            float r1 = r1.floatValue()
            return r1
    }

    public int getIntValue(java.lang.String r1) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.Integer r1 = com.alibaba.fastjson.util.TypeUtils.castToInt(r1)
            int r1 = r1.intValue()
            return r1
    }

    public java.lang.Integer getInteger(java.lang.String r1) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            java.lang.Integer r1 = com.alibaba.fastjson.util.TypeUtils.castToInt(r1)
            return r1
    }

    public com.alibaba.fastjson.JSONArray getJSONArray(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.map
            java.lang.Object r2 = r0.get(r2)
            boolean r0 = r2 instanceof com.alibaba.fastjson.JSONArray
            if (r0 == 0) goto Ld
            com.alibaba.fastjson.JSONArray r2 = (com.alibaba.fastjson.JSONArray) r2
            return r2
        Ld:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L1a
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = com.alibaba.fastjson.JSON.parse(r2)
            com.alibaba.fastjson.JSONArray r2 = (com.alibaba.fastjson.JSONArray) r2
            return r2
        L1a:
            java.lang.Object r2 = com.alibaba.fastjson.JSON.toJSON(r2)
            com.alibaba.fastjson.JSONArray r2 = (com.alibaba.fastjson.JSONArray) r2
            return r2
    }

    public com.alibaba.fastjson.JSONObject getJSONObject(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.map
            java.lang.Object r2 = r0.get(r2)
            boolean r0 = r2 instanceof com.alibaba.fastjson.JSONObject
            if (r0 == 0) goto Ld
            com.alibaba.fastjson.JSONObject r2 = (com.alibaba.fastjson.JSONObject) r2
            return r2
        Ld:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L18
            java.lang.String r2 = (java.lang.String) r2
            com.alibaba.fastjson.JSONObject r2 = com.alibaba.fastjson.JSON.parseObject(r2)
            return r2
        L18:
            java.lang.Object r2 = com.alibaba.fastjson.JSON.toJSON(r2)
            com.alibaba.fastjson.JSONObject r2 = (com.alibaba.fastjson.JSONObject) r2
            return r2
    }

    public java.lang.Long getLong(java.lang.String r1) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            java.lang.Long r1 = com.alibaba.fastjson.util.TypeUtils.castToLong(r1)
            return r1
    }

    public long getLongValue(java.lang.String r3) {
            r2 = this;
            java.lang.Object r3 = r2.get(r3)
            if (r3 != 0) goto L9
            r0 = 0
            return r0
        L9:
            java.lang.Long r3 = com.alibaba.fastjson.util.TypeUtils.castToLong(r3)
            long r0 = r3.longValue()
            return r0
    }

    public <T> T getObject(java.lang.String r2, com.alibaba.fastjson.TypeReference r3) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.map
            java.lang.Object r2 = r0.get(r2)
            if (r3 != 0) goto L9
            return r2
        L9:
            java.lang.reflect.Type r3 = r3.getType()
            com.alibaba.fastjson.parser.ParserConfig r0 = com.alibaba.fastjson.parser.ParserConfig.getGlobalInstance()
            java.lang.Object r2 = com.alibaba.fastjson.util.TypeUtils.cast(r2, r3, r0)
            return r2
    }

    public <T> T getObject(java.lang.String r2, java.lang.Class<T> r3) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.map
            java.lang.Object r2 = r0.get(r2)
            java.lang.Object r2 = com.alibaba.fastjson.util.TypeUtils.castToJavaBean(r2, r3)
            return r2
    }

    public <T> T getObject(java.lang.String r2, java.lang.reflect.Type r3) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.map
            java.lang.Object r2 = r0.get(r2)
            com.alibaba.fastjson.parser.ParserConfig r0 = com.alibaba.fastjson.parser.ParserConfig.getGlobalInstance()
            java.lang.Object r2 = com.alibaba.fastjson.util.TypeUtils.cast(r2, r3, r0)
            return r2
    }

    public java.lang.Short getShort(java.lang.String r1) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            java.lang.Short r1 = com.alibaba.fastjson.util.TypeUtils.castToShort(r1)
            return r1
    }

    public short getShortValue(java.lang.String r1) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.Short r1 = com.alibaba.fastjson.util.TypeUtils.castToShort(r1)
            short r1 = r1.shortValue()
            return r1
    }

    public java.sql.Date getSqlDate(java.lang.String r1) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            java.sql.Date r1 = com.alibaba.fastjson.util.TypeUtils.castToSqlDate(r1)
            return r1
    }

    public java.lang.String getString(java.lang.String r1) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.String r1 = r1.toString()
            return r1
    }

    public java.sql.Timestamp getTimestamp(java.lang.String r1) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            java.sql.Timestamp r1 = com.alibaba.fastjson.util.TypeUtils.castToTimestamp(r1)
            return r1
    }

    @Override // java.util.Map
    public int hashCode() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.map
            int r0 = r0.hashCode()
            return r0
    }

    @Override // java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object r8, java.lang.reflect.Method r9, java.lang.Object[] r10) throws java.lang.Throwable {
            r7 = this;
            java.lang.Class[] r8 = r9.getParameterTypes()
            int r0 = r8.length
            r1 = 3
            java.lang.Class<com.alibaba.fastjson.annotation.JSONField> r2 = com.alibaba.fastjson.annotation.JSONField.class
            java.lang.Class r3 = java.lang.Void.TYPE
            r4 = 0
            r5 = 0
            r6 = 1
            if (r0 != r6) goto L94
            java.lang.String r8 = r9.getName()
            java.lang.String r0 = "equals"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L26
            r8 = r10[r5]
            boolean r8 = r7.equals(r8)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            return r8
        L26:
            java.lang.Class r8 = r9.getReturnType()
            java.lang.String r0 = "illegal setter"
            if (r8 != r3) goto L8e
            java.lang.annotation.Annotation r8 = r9.getAnnotation(r2)
            com.alibaba.fastjson.annotation.JSONField r8 = (com.alibaba.fastjson.annotation.JSONField) r8
            if (r8 == 0) goto L45
            java.lang.String r2 = r8.name()
            int r2 = r2.length()
            if (r2 == 0) goto L45
            java.lang.String r8 = r8.name()
            goto L46
        L45:
            r8 = r4
        L46:
            if (r8 != 0) goto L86
            java.lang.String r8 = r9.getName()
            java.lang.String r9 = "set"
            boolean r9 = r8.startsWith(r9)
            if (r9 == 0) goto L80
            java.lang.String r8 = r8.substring(r1)
            int r9 = r8.length()
            if (r9 == 0) goto L7a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            char r0 = r8.charAt(r5)
            char r0 = java.lang.Character.toLowerCase(r0)
            r9.append(r0)
            java.lang.String r8 = r8.substring(r6)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            goto L86
        L7a:
            com.alibaba.fastjson.JSONException r8 = new com.alibaba.fastjson.JSONException
            r8.<init>(r0)
            throw r8
        L80:
            com.alibaba.fastjson.JSONException r8 = new com.alibaba.fastjson.JSONException
            r8.<init>(r0)
            throw r8
        L86:
            java.util.Map<java.lang.String, java.lang.Object> r9 = r7.map
            r10 = r10[r5]
            r9.put(r8, r10)
            return r4
        L8e:
            com.alibaba.fastjson.JSONException r8 = new com.alibaba.fastjson.JSONException
            r8.<init>(r0)
            throw r8
        L94:
            int r8 = r8.length
            if (r8 != 0) goto L161
            java.lang.Class r8 = r9.getReturnType()
            java.lang.String r10 = "illegal getter"
            if (r8 == r3) goto L15b
            java.lang.annotation.Annotation r8 = r9.getAnnotation(r2)
            com.alibaba.fastjson.annotation.JSONField r8 = (com.alibaba.fastjson.annotation.JSONField) r8
            if (r8 == 0) goto Lb5
            java.lang.String r0 = r8.name()
            int r0 = r0.length()
            if (r0 == 0) goto Lb5
            java.lang.String r4 = r8.name()
        Lb5:
            if (r4 != 0) goto L148
            java.lang.String r8 = r9.getName()
            java.lang.String r0 = "get"
            boolean r0 = r8.startsWith(r0)
            if (r0 == 0) goto Lef
            java.lang.String r8 = r8.substring(r1)
            int r0 = r8.length()
            if (r0 == 0) goto Le9
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            char r0 = r8.charAt(r5)
            char r0 = java.lang.Character.toLowerCase(r0)
            r10.append(r0)
            java.lang.String r8 = r8.substring(r6)
            r10.append(r8)
            java.lang.String r4 = r10.toString()
            goto L148
        Le9:
            com.alibaba.fastjson.JSONException r8 = new com.alibaba.fastjson.JSONException
            r8.<init>(r10)
            throw r8
        Lef:
            java.lang.String r0 = "is"
            boolean r0 = r8.startsWith(r0)
            if (r0 == 0) goto L124
            r0 = 2
            java.lang.String r8 = r8.substring(r0)
            int r0 = r8.length()
            if (r0 == 0) goto L11e
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            char r0 = r8.charAt(r5)
            char r0 = java.lang.Character.toLowerCase(r0)
            r10.append(r0)
            java.lang.String r8 = r8.substring(r6)
            r10.append(r8)
            java.lang.String r4 = r10.toString()
            goto L148
        L11e:
            com.alibaba.fastjson.JSONException r8 = new com.alibaba.fastjson.JSONException
            r8.<init>(r10)
            throw r8
        L124:
            java.lang.String r9 = "hashCode"
            boolean r9 = r8.startsWith(r9)
            if (r9 == 0) goto L135
            int r8 = r7.hashCode()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            return r8
        L135:
            java.lang.String r9 = "toString"
            boolean r8 = r8.startsWith(r9)
            if (r8 == 0) goto L142
            java.lang.String r8 = r7.toString()
            return r8
        L142:
            com.alibaba.fastjson.JSONException r8 = new com.alibaba.fastjson.JSONException
            r8.<init>(r10)
            throw r8
        L148:
            java.util.Map<java.lang.String, java.lang.Object> r8 = r7.map
            java.lang.Object r8 = r8.get(r4)
            java.lang.reflect.Type r9 = r9.getGenericReturnType()
            com.alibaba.fastjson.parser.ParserConfig r10 = com.alibaba.fastjson.parser.ParserConfig.getGlobalInstance()
            java.lang.Object r8 = com.alibaba.fastjson.util.TypeUtils.cast(r8, r9, r10)
            return r8
        L15b:
            com.alibaba.fastjson.JSONException r8 = new com.alibaba.fastjson.JSONException
            r8.<init>(r10)
            throw r8
        L161:
            java.lang.UnsupportedOperationException r8 = new java.lang.UnsupportedOperationException
            java.lang.String r9 = r9.toGenericString()
            r8.<init>(r9)
            throw r8
    }

    @Override // java.util.Map
    public boolean isEmpty() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.map
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.Map
    public java.util.Set<java.lang.String> keySet() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.map
            java.util.Set r0 = r0.keySet()
            return r0
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ java.lang.Object put(java.lang.String r1, java.lang.Object r2) {
            r0 = this;
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r0.put2(r1, r2)
            return r1
    }

    /* renamed from: put, reason: avoid collision after fix types in other method */
    public java.lang.Object put2(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.map
            java.lang.Object r2 = r0.put(r2, r3)
            return r2
    }

    @Override // java.util.Map
    public void putAll(java.util.Map<? extends java.lang.String, ? extends java.lang.Object> r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.map
            r0.putAll(r2)
            return
    }

    @Override // java.util.Map
    public java.lang.Object remove(java.lang.Object r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.map
            java.lang.Object r2 = r0.remove(r2)
            return r2
    }

    @Override // java.util.Map
    public int size() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.map
            int r0 = r0.size()
            return r0
    }

    @Override // java.util.Map
    public java.util.Collection<java.lang.Object> values() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.map
            java.util.Collection r0 = r0.values()
            return r0
    }
}
