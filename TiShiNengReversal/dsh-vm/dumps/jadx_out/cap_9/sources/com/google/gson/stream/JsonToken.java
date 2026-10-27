package com.google.gson.stream;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public enum JsonToken extends java.lang.Enum<com.google.gson.stream.JsonToken> {
    private static final /* synthetic */ com.google.gson.stream.JsonToken[] $VALUES = null;
    public static final com.google.gson.stream.JsonToken BEGIN_ARRAY = null;
    public static final com.google.gson.stream.JsonToken BEGIN_OBJECT = null;
    public static final com.google.gson.stream.JsonToken BOOLEAN = null;
    public static final com.google.gson.stream.JsonToken END_ARRAY = null;
    public static final com.google.gson.stream.JsonToken END_DOCUMENT = null;
    public static final com.google.gson.stream.JsonToken END_OBJECT = null;
    public static final com.google.gson.stream.JsonToken NAME = null;
    public static final com.google.gson.stream.JsonToken NULL = null;
    public static final com.google.gson.stream.JsonToken NUMBER = null;
    public static final com.google.gson.stream.JsonToken STRING = null;

    static {
            com.google.gson.stream.JsonToken r0 = new com.google.gson.stream.JsonToken
            java.lang.String r1 = "BEGIN_ARRAY"
            r2 = 0
            r0.<init>(r1, r2)
            com.google.gson.stream.JsonToken.BEGIN_ARRAY = r0
            com.google.gson.stream.JsonToken r1 = new com.google.gson.stream.JsonToken
            java.lang.String r3 = "END_ARRAY"
            r4 = 1
            r1.<init>(r3, r4)
            com.google.gson.stream.JsonToken.END_ARRAY = r1
            com.google.gson.stream.JsonToken r3 = new com.google.gson.stream.JsonToken
            java.lang.String r5 = "BEGIN_OBJECT"
            r6 = 2
            r3.<init>(r5, r6)
            com.google.gson.stream.JsonToken.BEGIN_OBJECT = r3
            com.google.gson.stream.JsonToken r5 = new com.google.gson.stream.JsonToken
            java.lang.String r7 = "END_OBJECT"
            r8 = 3
            r5.<init>(r7, r8)
            com.google.gson.stream.JsonToken.END_OBJECT = r5
            com.google.gson.stream.JsonToken r7 = new com.google.gson.stream.JsonToken
            java.lang.String r9 = "NAME"
            r10 = 4
            r7.<init>(r9, r10)
            com.google.gson.stream.JsonToken.NAME = r7
            com.google.gson.stream.JsonToken r9 = new com.google.gson.stream.JsonToken
            java.lang.String r11 = "STRING"
            r12 = 5
            r9.<init>(r11, r12)
            com.google.gson.stream.JsonToken.STRING = r9
            com.google.gson.stream.JsonToken r11 = new com.google.gson.stream.JsonToken
            java.lang.String r13 = "NUMBER"
            r14 = 6
            r11.<init>(r13, r14)
            com.google.gson.stream.JsonToken.NUMBER = r11
            com.google.gson.stream.JsonToken r13 = new com.google.gson.stream.JsonToken
            java.lang.String r15 = "BOOLEAN"
            r16 = 0
            r2 = 7
            r13.<init>(r15, r2)
            com.google.gson.stream.JsonToken.BOOLEAN = r13
            com.google.gson.stream.JsonToken r15 = new com.google.gson.stream.JsonToken
            r17 = 7
            java.lang.String r2 = "NULL"
            r18 = 1
            r4 = 8
            r15.<init>(r2, r4)
            com.google.gson.stream.JsonToken.NULL = r15
            com.google.gson.stream.JsonToken r2 = new com.google.gson.stream.JsonToken
            r19 = 8
            java.lang.String r4 = "END_DOCUMENT"
            r20 = 2
            r6 = 9
            r2.<init>(r4, r6)
            com.google.gson.stream.JsonToken.END_DOCUMENT = r2
            r4 = 10
            com.google.gson.stream.JsonToken[] r4 = new com.google.gson.stream.JsonToken[r4]
            r4[r16] = r0
            r4[r18] = r1
            r4[r20] = r3
            r4[r8] = r5
            r4[r10] = r7
            r4[r12] = r9
            r4[r14] = r11
            r4[r17] = r13
            r4[r19] = r15
            r4[r6] = r2
            com.google.gson.stream.JsonToken.$VALUES = r4
            return
    }

    JsonToken(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.google.gson.stream.JsonToken valueOf(java.lang.String r1) {
            java.lang.Class<com.google.gson.stream.JsonToken> r0 = com.google.gson.stream.JsonToken.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.google.gson.stream.JsonToken r1 = (com.google.gson.stream.JsonToken) r1
            return r1
    }

    public static com.google.gson.stream.JsonToken[] values() {
            com.google.gson.stream.JsonToken[] r0 = com.google.gson.stream.JsonToken.$VALUES
            java.lang.Object r0 = r0.clone()
            com.google.gson.stream.JsonToken[] r0 = (com.google.gson.stream.JsonToken[]) r0
            return r0
    }
}
