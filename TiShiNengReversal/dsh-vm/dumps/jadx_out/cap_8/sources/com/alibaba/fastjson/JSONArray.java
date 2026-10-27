package com.alibaba.fastjson;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class JSONArray extends com.alibaba.fastjson.JSON implements java.util.List<java.lang.Object>, java.lang.Cloneable, java.util.RandomAccess, java.io.Serializable {
    private static final long serialVersionUID = 1;
    protected transient java.lang.reflect.Type componentType;
    private final java.util.List<java.lang.Object> list;
    protected transient java.lang.Object relatedArray;

    public JSONArray() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.list = r0
            return
    }

    public JSONArray(int r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r1.list = r0
            return
    }

    public JSONArray(java.util.List<java.lang.Object> r1) {
            r0 = this;
            r0.<init>()
            r0.list = r1
            return
    }

    @Override // java.util.List
    public void add(int r2, java.lang.Object r3) {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.list
            r0.add(r2, r3)
            return
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(java.lang.Object r2) {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.list
            boolean r2 = r0.add(r2)
            return r2
    }

    @Override // java.util.List
    public boolean addAll(int r2, java.util.Collection<? extends java.lang.Object> r3) {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.list
            boolean r2 = r0.addAll(r2, r3)
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(java.util.Collection<? extends java.lang.Object> r2) {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.list
            boolean r2 = r0.addAll(r2)
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.list
            r0.clear()
            return
    }

    public java.lang.Object clone() {
            r3 = this;
            com.alibaba.fastjson.JSONArray r0 = new com.alibaba.fastjson.JSONArray
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.List<java.lang.Object> r2 = r3.list
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(java.lang.Object r2) {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.list
            boolean r2 = r0.contains(r2)
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(java.util.Collection<?> r2) {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.list
            boolean r2 = r0.containsAll(r2)
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.list
            boolean r2 = r0.equals(r2)
            return r2
    }

    public com.alibaba.fastjson.JSONArray fluentAdd(int r2, java.lang.Object r3) {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.list
            r0.add(r2, r3)
            return r1
    }

    public com.alibaba.fastjson.JSONArray fluentAdd(java.lang.Object r2) {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.list
            r0.add(r2)
            return r1
    }

    public com.alibaba.fastjson.JSONArray fluentAddAll(int r2, java.util.Collection<? extends java.lang.Object> r3) {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.list
            r0.addAll(r2, r3)
            return r1
    }

    public com.alibaba.fastjson.JSONArray fluentAddAll(java.util.Collection<? extends java.lang.Object> r2) {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.list
            r0.addAll(r2)
            return r1
    }

    public com.alibaba.fastjson.JSONArray fluentClear() {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.list
            r0.clear()
            return r1
    }

    public com.alibaba.fastjson.JSONArray fluentRemove(int r2) {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.list
            r0.remove(r2)
            return r1
    }

    public com.alibaba.fastjson.JSONArray fluentRemove(java.lang.Object r2) {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.list
            r0.remove(r2)
            return r1
    }

    public com.alibaba.fastjson.JSONArray fluentRemoveAll(java.util.Collection<?> r2) {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.list
            r0.removeAll(r2)
            return r1
    }

    public com.alibaba.fastjson.JSONArray fluentRetainAll(java.util.Collection<?> r2) {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.list
            r0.retainAll(r2)
            return r1
    }

    public com.alibaba.fastjson.JSONArray fluentSet(int r1, java.lang.Object r2) {
            r0 = this;
            r0.set(r1, r2)
            return r0
    }

    @Override // java.util.List
    public java.lang.Object get(int r2) {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.list
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    public java.math.BigDecimal getBigDecimal(int r1) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            java.math.BigDecimal r1 = com.alibaba.fastjson.util.TypeUtils.castToBigDecimal(r1)
            return r1
    }

    public java.math.BigInteger getBigInteger(int r1) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            java.math.BigInteger r1 = com.alibaba.fastjson.util.TypeUtils.castToBigInteger(r1)
            return r1
    }

    public java.lang.Boolean getBoolean(int r1) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.Boolean r1 = com.alibaba.fastjson.util.TypeUtils.castToBoolean(r1)
            return r1
    }

    public boolean getBooleanValue(int r1) {
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

    public java.lang.Byte getByte(int r1) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            java.lang.Byte r1 = com.alibaba.fastjson.util.TypeUtils.castToByte(r1)
            return r1
    }

    public byte getByteValue(int r1) {
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

    public java.lang.reflect.Type getComponentType() {
            r1 = this;
            java.lang.reflect.Type r0 = r1.componentType
            return r0
    }

    public java.util.Date getDate(int r1) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            java.util.Date r1 = com.alibaba.fastjson.util.TypeUtils.castToDate(r1)
            return r1
    }

    public java.lang.Double getDouble(int r1) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            java.lang.Double r1 = com.alibaba.fastjson.util.TypeUtils.castToDouble(r1)
            return r1
    }

    public double getDoubleValue(int r3) {
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

    public java.lang.Float getFloat(int r1) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            java.lang.Float r1 = com.alibaba.fastjson.util.TypeUtils.castToFloat(r1)
            return r1
    }

    public float getFloatValue(int r1) {
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

    public int getIntValue(int r1) {
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

    public java.lang.Integer getInteger(int r1) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            java.lang.Integer r1 = com.alibaba.fastjson.util.TypeUtils.castToInt(r1)
            return r1
    }

    public com.alibaba.fastjson.JSONArray getJSONArray(int r2) {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.list
            java.lang.Object r2 = r0.get(r2)
            boolean r0 = r2 instanceof com.alibaba.fastjson.JSONArray
            if (r0 == 0) goto Ld
            com.alibaba.fastjson.JSONArray r2 = (com.alibaba.fastjson.JSONArray) r2
            return r2
        Ld:
            java.lang.Object r2 = com.alibaba.fastjson.JSON.toJSON(r2)
            com.alibaba.fastjson.JSONArray r2 = (com.alibaba.fastjson.JSONArray) r2
            return r2
    }

    public com.alibaba.fastjson.JSONObject getJSONObject(int r2) {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.list
            java.lang.Object r2 = r0.get(r2)
            boolean r0 = r2 instanceof com.alibaba.fastjson.JSONObject
            if (r0 == 0) goto Ld
            com.alibaba.fastjson.JSONObject r2 = (com.alibaba.fastjson.JSONObject) r2
            return r2
        Ld:
            java.lang.Object r2 = com.alibaba.fastjson.JSON.toJSON(r2)
            com.alibaba.fastjson.JSONObject r2 = (com.alibaba.fastjson.JSONObject) r2
            return r2
    }

    public java.lang.Long getLong(int r1) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            java.lang.Long r1 = com.alibaba.fastjson.util.TypeUtils.castToLong(r1)
            return r1
    }

    public long getLongValue(int r3) {
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

    public <T> T getObject(int r2, java.lang.Class<T> r3) {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.list
            java.lang.Object r2 = r0.get(r2)
            java.lang.Object r2 = com.alibaba.fastjson.util.TypeUtils.castToJavaBean(r2, r3)
            return r2
    }

    public java.lang.Object getRelatedArray() {
            r1 = this;
            java.lang.Object r0 = r1.relatedArray
            return r0
    }

    public java.lang.Short getShort(int r1) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            java.lang.Short r1 = com.alibaba.fastjson.util.TypeUtils.castToShort(r1)
            return r1
    }

    public short getShortValue(int r1) {
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

    public java.sql.Date getSqlDate(int r1) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            java.sql.Date r1 = com.alibaba.fastjson.util.TypeUtils.castToSqlDate(r1)
            return r1
    }

    public java.lang.String getString(int r1) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            java.lang.String r1 = com.alibaba.fastjson.util.TypeUtils.castToString(r1)
            return r1
    }

    public java.sql.Timestamp getTimestamp(int r1) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            java.sql.Timestamp r1 = com.alibaba.fastjson.util.TypeUtils.castToTimestamp(r1)
            return r1
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.list
            int r0 = r0.hashCode()
            return r0
    }

    @Override // java.util.List
    public int indexOf(java.lang.Object r2) {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.list
            int r2 = r0.indexOf(r2)
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.list
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public java.util.Iterator<java.lang.Object> iterator() {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.list
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    @Override // java.util.List
    public int lastIndexOf(java.lang.Object r2) {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.list
            int r2 = r0.lastIndexOf(r2)
            return r2
    }

    @Override // java.util.List
    public java.util.ListIterator<java.lang.Object> listIterator() {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.list
            java.util.ListIterator r0 = r0.listIterator()
            return r0
    }

    @Override // java.util.List
    public java.util.ListIterator<java.lang.Object> listIterator(int r2) {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.list
            java.util.ListIterator r2 = r0.listIterator(r2)
            return r2
    }

    @Override // java.util.List
    public java.lang.Object remove(int r2) {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.list
            java.lang.Object r2 = r0.remove(r2)
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(java.lang.Object r2) {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.list
            boolean r2 = r0.remove(r2)
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(java.util.Collection<?> r2) {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.list
            boolean r2 = r0.removeAll(r2)
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(java.util.Collection<?> r2) {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.list
            boolean r2 = r0.retainAll(r2)
            return r2
    }

    @Override // java.util.List
    public java.lang.Object set(int r4, java.lang.Object r5) {
            r3 = this;
            r0 = -1
            r1 = 0
            if (r4 != r0) goto La
            java.util.List<java.lang.Object> r4 = r3.list
            r4.add(r5)
            return r1
        La:
            java.util.List<java.lang.Object> r0 = r3.list
            int r0 = r0.size()
            if (r0 > r4) goto L28
            java.util.List<java.lang.Object> r0 = r3.list
            int r0 = r0.size()
        L18:
            if (r0 >= r4) goto L22
            java.util.List<java.lang.Object> r2 = r3.list
            r2.add(r1)
            int r0 = r0 + 1
            goto L18
        L22:
            java.util.List<java.lang.Object> r4 = r3.list
            r4.add(r5)
            return r1
        L28:
            java.util.List<java.lang.Object> r0 = r3.list
            java.lang.Object r4 = r0.set(r4, r5)
            return r4
    }

    public void setComponentType(java.lang.reflect.Type r1) {
            r0 = this;
            r0.componentType = r1
            return
    }

    public void setRelatedArray(java.lang.Object r1) {
            r0 = this;
            r0.relatedArray = r1
            return
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.list
            int r0 = r0.size()
            return r0
    }

    @Override // java.util.List
    public java.util.List<java.lang.Object> subList(int r2, int r3) {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.list
            java.util.List r2 = r0.subList(r2, r3)
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public java.lang.Object[] toArray() {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.list
            java.lang.Object[] r0 = r0.toArray()
            return r0
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] r2) {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.list
            java.lang.Object[] r2 = r0.toArray(r2)
            return r2
    }

    public <T> java.util.List<T> toJavaList(java.lang.Class<T> r5) {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r4.size()
            r0.<init>(r1)
            com.alibaba.fastjson.parser.ParserConfig r1 = com.alibaba.fastjson.parser.ParserConfig.getGlobalInstance()
            java.util.Iterator r2 = r4.iterator()
        L11:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L23
            java.lang.Object r3 = r2.next()
            java.lang.Object r3 = com.alibaba.fastjson.util.TypeUtils.cast(r3, r5, r1)
            r0.add(r3)
            goto L11
        L23:
            return r0
    }
}
