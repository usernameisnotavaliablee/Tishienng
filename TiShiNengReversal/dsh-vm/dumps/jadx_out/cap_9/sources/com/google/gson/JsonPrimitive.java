package com.google.gson;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class JsonPrimitive extends com.google.gson.JsonElement {
    private static final java.lang.Class<?>[] PRIMITIVE_TYPES = null;
    private java.lang.Object value;

    static {
            r0 = 16
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r2 = 0
            r0[r2] = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            r2 = 1
            r0[r2] = r1
            java.lang.Class r1 = java.lang.Short.TYPE
            r2 = 2
            r0[r2] = r1
            java.lang.Class r1 = java.lang.Float.TYPE
            r2 = 3
            r0[r2] = r1
            java.lang.Class r1 = java.lang.Double.TYPE
            r2 = 4
            r0[r2] = r1
            java.lang.Class r1 = java.lang.Byte.TYPE
            r2 = 5
            r0[r2] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r2 = 6
            r0[r2] = r1
            java.lang.Class r1 = java.lang.Character.TYPE
            r2 = 7
            r0[r2] = r1
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            r2 = 8
            r0[r2] = r1
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            r2 = 9
            r0[r2] = r1
            java.lang.Class<java.lang.Short> r1 = java.lang.Short.class
            r2 = 10
            r0[r2] = r1
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            r2 = 11
            r0[r2] = r1
            java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
            r2 = 12
            r0[r2] = r1
            java.lang.Class<java.lang.Byte> r1 = java.lang.Byte.class
            r2 = 13
            r0[r2] = r1
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            r2 = 14
            r0[r2] = r1
            java.lang.Class<java.lang.Character> r1 = java.lang.Character.class
            r2 = 15
            r0[r2] = r1
            com.google.gson.JsonPrimitive.PRIMITIVE_TYPES = r0
            return
    }

    public JsonPrimitive(java.lang.Boolean r1) {
            r0 = this;
            r0.<init>()
            r0.setValue(r1)
            return
    }

    public JsonPrimitive(java.lang.Character r1) {
            r0 = this;
            r0.<init>()
            r0.setValue(r1)
            return
    }

    public JsonPrimitive(java.lang.Number r1) {
            r0 = this;
            r0.<init>()
            r0.setValue(r1)
            return
    }

    JsonPrimitive(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0.setValue(r1)
            return
    }

    public JsonPrimitive(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.setValue(r1)
            return
    }

    private static boolean isIntegral(com.google.gson.JsonPrimitive r2) {
            java.lang.Object r2 = r2.value
            boolean r0 = r2 instanceof java.lang.Number
            r1 = 0
            if (r0 == 0) goto L21
            java.lang.Number r2 = (java.lang.Number) r2
            boolean r0 = r2 instanceof java.math.BigInteger
            if (r0 != 0) goto L1f
            boolean r0 = r2 instanceof java.lang.Long
            if (r0 != 0) goto L1f
            boolean r0 = r2 instanceof java.lang.Integer
            if (r0 != 0) goto L1f
            boolean r0 = r2 instanceof java.lang.Short
            if (r0 != 0) goto L1f
            boolean r2 = r2 instanceof java.lang.Byte
            if (r2 == 0) goto L1e
            goto L1f
        L1e:
            return r1
        L1f:
            r2 = 1
            return r2
        L21:
            return r1
    }

    private static boolean isPrimitiveOrString(java.lang.Object r6) {
            boolean r0 = r6 instanceof java.lang.String
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            java.lang.Class r6 = r6.getClass()
            java.lang.Class<?>[] r0 = com.google.gson.JsonPrimitive.PRIMITIVE_TYPES
            int r2 = r0.length
            r3 = 0
            r4 = 0
        Lf:
            if (r4 >= r2) goto L1d
            r5 = r0[r4]
            boolean r5 = r5.isAssignableFrom(r6)
            if (r5 == 0) goto L1a
            return r1
        L1a:
            int r4 = r4 + 1
            goto Lf
        L1d:
            return r3
    }

    @Override // com.google.gson.JsonElement
    public /* bridge */ /* synthetic */ com.google.gson.JsonElement deepCopy() {
            r1 = this;
            com.google.gson.JsonPrimitive r0 = r1.deepCopy()
            return r0
    }

    @Override // com.google.gson.JsonElement
    public com.google.gson.JsonPrimitive deepCopy() {
            r0 = this;
            return r0
    }

    public boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            r1 = 0
            if (r7 == 0) goto L74
            java.lang.Class<com.google.gson.JsonPrimitive> r2 = com.google.gson.JsonPrimitive.class
            java.lang.Class r3 = r7.getClass()
            if (r2 == r3) goto L10
            goto L74
        L10:
            com.google.gson.JsonPrimitive r7 = (com.google.gson.JsonPrimitive) r7
            java.lang.Object r2 = r6.value
            if (r2 != 0) goto L1c
            java.lang.Object r7 = r7.value
            if (r7 != 0) goto L1b
            return r0
        L1b:
            return r1
        L1c:
            boolean r2 = isIntegral(r6)
            if (r2 == 0) goto L3e
            boolean r2 = isIntegral(r7)
            if (r2 == 0) goto L3e
            java.lang.Number r2 = r6.getAsNumber()
            long r2 = r2.longValue()
            java.lang.Number r7 = r7.getAsNumber()
            long r4 = r7.longValue()
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 != 0) goto L3d
            return r0
        L3d:
            return r1
        L3e:
            java.lang.Object r2 = r6.value
            boolean r3 = r2 instanceof java.lang.Number
            if (r3 == 0) goto L6d
            java.lang.Object r3 = r7.value
            boolean r3 = r3 instanceof java.lang.Number
            if (r3 == 0) goto L6d
            java.lang.Number r2 = r6.getAsNumber()
            double r2 = r2.doubleValue()
            java.lang.Number r7 = r7.getAsNumber()
            double r4 = r7.doubleValue()
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 == 0) goto L6c
            boolean r7 = java.lang.Double.isNaN(r2)
            if (r7 == 0) goto L6b
            boolean r7 = java.lang.Double.isNaN(r4)
            if (r7 == 0) goto L6b
            goto L6c
        L6b:
            return r1
        L6c:
            return r0
        L6d:
            java.lang.Object r7 = r7.value
            boolean r7 = r2.equals(r7)
            return r7
        L74:
            return r1
    }

    @Override // com.google.gson.JsonElement
    public java.math.BigDecimal getAsBigDecimal() {
            r2 = this;
            java.lang.Object r0 = r2.value
            boolean r1 = r0 instanceof java.math.BigDecimal
            if (r1 == 0) goto L9
            java.math.BigDecimal r0 = (java.math.BigDecimal) r0
            return r0
        L9:
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.Object r1 = r2.value
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.gson.JsonElement
    public java.math.BigInteger getAsBigInteger() {
            r2 = this;
            java.lang.Object r0 = r2.value
            boolean r1 = r0 instanceof java.math.BigInteger
            if (r1 == 0) goto L9
            java.math.BigInteger r0 = (java.math.BigInteger) r0
            return r0
        L9:
            java.math.BigInteger r0 = new java.math.BigInteger
            java.lang.Object r1 = r2.value
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.gson.JsonElement
    public boolean getAsBoolean() {
            r1 = this;
            boolean r0 = r1.isBoolean()
            if (r0 == 0) goto Lf
            java.lang.Boolean r0 = r1.getAsBooleanWrapper()
            boolean r0 = r0.booleanValue()
            return r0
        Lf:
            java.lang.String r0 = r1.getAsString()
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            return r0
    }

    @Override // com.google.gson.JsonElement
    java.lang.Boolean getAsBooleanWrapper() {
            r1 = this;
            java.lang.Object r0 = r1.value
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            return r0
    }

    @Override // com.google.gson.JsonElement
    public byte getAsByte() {
            r1 = this;
            boolean r0 = r1.isNumber()
            if (r0 == 0) goto Lf
            java.lang.Number r0 = r1.getAsNumber()
            byte r0 = r0.byteValue()
            return r0
        Lf:
            java.lang.String r0 = r1.getAsString()
            byte r0 = java.lang.Byte.parseByte(r0)
            return r0
    }

    @Override // com.google.gson.JsonElement
    public char getAsCharacter() {
            r2 = this;
            java.lang.String r0 = r2.getAsString()
            r1 = 0
            char r0 = r0.charAt(r1)
            return r0
    }

    @Override // com.google.gson.JsonElement
    public double getAsDouble() {
            r2 = this;
            boolean r0 = r2.isNumber()
            if (r0 == 0) goto Lf
            java.lang.Number r0 = r2.getAsNumber()
            double r0 = r0.doubleValue()
            return r0
        Lf:
            java.lang.String r0 = r2.getAsString()
            double r0 = java.lang.Double.parseDouble(r0)
            return r0
    }

    @Override // com.google.gson.JsonElement
    public float getAsFloat() {
            r1 = this;
            boolean r0 = r1.isNumber()
            if (r0 == 0) goto Lf
            java.lang.Number r0 = r1.getAsNumber()
            float r0 = r0.floatValue()
            return r0
        Lf:
            java.lang.String r0 = r1.getAsString()
            float r0 = java.lang.Float.parseFloat(r0)
            return r0
    }

    @Override // com.google.gson.JsonElement
    public int getAsInt() {
            r1 = this;
            boolean r0 = r1.isNumber()
            if (r0 == 0) goto Lf
            java.lang.Number r0 = r1.getAsNumber()
            int r0 = r0.intValue()
            return r0
        Lf:
            java.lang.String r0 = r1.getAsString()
            int r0 = java.lang.Integer.parseInt(r0)
            return r0
    }

    @Override // com.google.gson.JsonElement
    public long getAsLong() {
            r2 = this;
            boolean r0 = r2.isNumber()
            if (r0 == 0) goto Lf
            java.lang.Number r0 = r2.getAsNumber()
            long r0 = r0.longValue()
            return r0
        Lf:
            java.lang.String r0 = r2.getAsString()
            long r0 = java.lang.Long.parseLong(r0)
            return r0
    }

    @Override // com.google.gson.JsonElement
    public java.lang.Number getAsNumber() {
            r2 = this;
            java.lang.Object r0 = r2.value
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto Le
            com.google.gson.internal.LazilyParsedNumber r1 = new com.google.gson.internal.LazilyParsedNumber
            java.lang.String r0 = (java.lang.String) r0
            r1.<init>(r0)
            return r1
        Le:
            java.lang.Number r0 = (java.lang.Number) r0
            return r0
    }

    @Override // com.google.gson.JsonElement
    public short getAsShort() {
            r1 = this;
            boolean r0 = r1.isNumber()
            if (r0 == 0) goto Lf
            java.lang.Number r0 = r1.getAsNumber()
            short r0 = r0.shortValue()
            return r0
        Lf:
            java.lang.String r0 = r1.getAsString()
            short r0 = java.lang.Short.parseShort(r0)
            return r0
    }

    @Override // com.google.gson.JsonElement
    public java.lang.String getAsString() {
            r1 = this;
            boolean r0 = r1.isNumber()
            if (r0 == 0) goto Lf
            java.lang.Number r0 = r1.getAsNumber()
            java.lang.String r0 = r0.toString()
            return r0
        Lf:
            boolean r0 = r1.isBoolean()
            if (r0 == 0) goto L1e
            java.lang.Boolean r0 = r1.getAsBooleanWrapper()
            java.lang.String r0 = r0.toString()
            return r0
        L1e:
            java.lang.Object r0 = r1.value
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public int hashCode() {
            r4 = this;
            java.lang.Object r0 = r4.value
            if (r0 != 0) goto L7
            r0 = 31
            return r0
        L7:
            boolean r0 = isIntegral(r4)
            r1 = 32
            if (r0 == 0) goto L1c
            java.lang.Number r0 = r4.getAsNumber()
            long r2 = r0.longValue()
        L17:
            long r0 = r2 >>> r1
            long r0 = r0 ^ r2
            int r1 = (int) r0
            return r1
        L1c:
            java.lang.Object r0 = r4.value
            boolean r2 = r0 instanceof java.lang.Number
            if (r2 == 0) goto L2f
            java.lang.Number r0 = r4.getAsNumber()
            double r2 = r0.doubleValue()
            long r2 = java.lang.Double.doubleToLongBits(r2)
            goto L17
        L2f:
            int r0 = r0.hashCode()
            return r0
    }

    public boolean isBoolean() {
            r1 = this;
            java.lang.Object r0 = r1.value
            boolean r0 = r0 instanceof java.lang.Boolean
            return r0
    }

    public boolean isNumber() {
            r1 = this;
            java.lang.Object r0 = r1.value
            boolean r0 = r0 instanceof java.lang.Number
            return r0
    }

    public boolean isString() {
            r1 = this;
            java.lang.Object r0 = r1.value
            boolean r0 = r0 instanceof java.lang.String
            return r0
    }

    void setValue(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.Character
            if (r0 == 0) goto L11
            java.lang.Character r2 = (java.lang.Character) r2
            char r2 = r2.charValue()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.value = r2
            return
        L11:
            boolean r0 = r2 instanceof java.lang.Number
            if (r0 != 0) goto L1e
            boolean r0 = isPrimitiveOrString(r2)
            if (r0 == 0) goto L1c
            goto L1e
        L1c:
            r0 = 0
            goto L1f
        L1e:
            r0 = 1
        L1f:
            com.google.gson.internal.C$Gson$Preconditions.checkArgument(r0)
            r1.value = r2
            return
    }
}
