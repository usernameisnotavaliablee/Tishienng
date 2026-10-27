package com.alibaba.fastjson.parser.deserializer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class EnumDeserializer implements com.alibaba.fastjson.parser.deserializer.ObjectDeserializer {
    private final java.lang.Class<?> enumClass;
    protected long[] enumNameHashCodes;
    protected final java.lang.Enum[] enums;
    protected final java.lang.Enum[] ordinalEnums;

    public EnumDeserializer(java.lang.Class<?> r10) {
            r9 = this;
            r9.<init>()
            r9.enumClass = r10
            java.lang.Object[] r10 = r10.getEnumConstants()
            java.lang.Enum[] r10 = (java.lang.Enum[]) r10
            r9.ordinalEnums = r10
            int r0 = r10.length
            long[] r1 = new long[r0]
            int r10 = r10.length
            long[] r10 = new long[r10]
            r9.enumNameHashCodes = r10
            r10 = 0
            r2 = 0
        L17:
            java.lang.Enum[] r3 = r9.ordinalEnums
            int r4 = r3.length
            if (r2 >= r4) goto L43
            r3 = r3[r2]
            java.lang.String r3 = r3.name()
            r4 = -2128831035(0xffffffff811c9dc5, double:NaN)
            r6 = 0
        L26:
            int r7 = r3.length()
            if (r6 >= r7) goto L3a
            char r7 = r3.charAt(r6)
            long r7 = (long) r7
            long r4 = r4 ^ r7
            r7 = 16777619(0x1000193, double:8.289245E-317)
            long r4 = r4 * r7
            int r6 = r6 + 1
            goto L26
        L3a:
            r1[r2] = r4
            long[] r3 = r9.enumNameHashCodes
            r3[r2] = r4
            int r2 = r2 + 1
            goto L17
        L43:
            long[] r2 = r9.enumNameHashCodes
            java.util.Arrays.sort(r2)
            java.lang.Enum[] r2 = r9.ordinalEnums
            int r2 = r2.length
            java.lang.Enum[] r2 = new java.lang.Enum[r2]
            r9.enums = r2
            r2 = 0
        L50:
            long[] r3 = r9.enumNameHashCodes
            int r3 = r3.length
            if (r2 >= r3) goto L71
            r3 = 0
        L56:
            if (r3 >= r0) goto L6e
            long[] r4 = r9.enumNameHashCodes
            r5 = r4[r2]
            r7 = r1[r3]
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r4 != 0) goto L6b
            java.lang.Enum[] r4 = r9.enums
            java.lang.Enum[] r5 = r9.ordinalEnums
            r3 = r5[r3]
            r4[r2] = r3
            goto L6e
        L6b:
            int r3 = r3 + 1
            goto L56
        L6e:
            int r2 = r2 + 1
            goto L50
        L71:
            return
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(com.alibaba.fastjson.parser.DefaultJSONParser r6, java.lang.reflect.Type r7, java.lang.Object r8) {
            r5 = this;
            com.alibaba.fastjson.parser.JSONLexer r7 = r6.lexer     // Catch: java.lang.Exception -> L20 com.alibaba.fastjson.JSONException -> L22
            int r8 = r7.token()     // Catch: java.lang.Exception -> L20 com.alibaba.fastjson.JSONException -> L22
            r0 = 2
            java.lang.String r1 = " error, value : "
            java.lang.String r2 = "parse enum "
            r3 = 16
            if (r8 != r0) goto L45
            int r6 = r7.intValue()     // Catch: java.lang.Exception -> L20 com.alibaba.fastjson.JSONException -> L22
            r7.nextToken(r3)     // Catch: java.lang.Exception -> L20 com.alibaba.fastjson.JSONException -> L22
            if (r6 < 0) goto L24
            java.lang.Enum[] r7 = r5.ordinalEnums     // Catch: java.lang.Exception -> L20 com.alibaba.fastjson.JSONException -> L22
            int r8 = r7.length     // Catch: java.lang.Exception -> L20 com.alibaba.fastjson.JSONException -> L22
            if (r6 > r8) goto L24
            r6 = r7[r6]     // Catch: java.lang.Exception -> L20 com.alibaba.fastjson.JSONException -> L22
            return r6
        L20:
            r6 = move-exception
            goto L8b
        L22:
            r6 = move-exception
            goto L95
        L24:
            com.alibaba.fastjson.JSONException r7 = new com.alibaba.fastjson.JSONException     // Catch: java.lang.Exception -> L20 com.alibaba.fastjson.JSONException -> L22
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L20 com.alibaba.fastjson.JSONException -> L22
            r8.<init>()     // Catch: java.lang.Exception -> L20 com.alibaba.fastjson.JSONException -> L22
            r8.append(r2)     // Catch: java.lang.Exception -> L20 com.alibaba.fastjson.JSONException -> L22
            java.lang.Class<?> r0 = r5.enumClass     // Catch: java.lang.Exception -> L20 com.alibaba.fastjson.JSONException -> L22
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Exception -> L20 com.alibaba.fastjson.JSONException -> L22
            r8.append(r0)     // Catch: java.lang.Exception -> L20 com.alibaba.fastjson.JSONException -> L22
            r8.append(r1)     // Catch: java.lang.Exception -> L20 com.alibaba.fastjson.JSONException -> L22
            r8.append(r6)     // Catch: java.lang.Exception -> L20 com.alibaba.fastjson.JSONException -> L22
            java.lang.String r6 = r8.toString()     // Catch: java.lang.Exception -> L20 com.alibaba.fastjson.JSONException -> L22
            r7.<init>(r6)     // Catch: java.lang.Exception -> L20 com.alibaba.fastjson.JSONException -> L22
            throw r7     // Catch: java.lang.Exception -> L20 com.alibaba.fastjson.JSONException -> L22
        L45:
            r0 = 4
            r4 = 0
            if (r8 != r0) goto L5e
            java.lang.String r6 = r7.stringVal()     // Catch: java.lang.Exception -> L20 com.alibaba.fastjson.JSONException -> L22
            r7.nextToken(r3)     // Catch: java.lang.Exception -> L20 com.alibaba.fastjson.JSONException -> L22
            int r7 = r6.length()     // Catch: java.lang.Exception -> L20 com.alibaba.fastjson.JSONException -> L22
            if (r7 != 0) goto L57
            return r4
        L57:
            java.lang.Class<?> r7 = r5.enumClass     // Catch: java.lang.Exception -> L20 com.alibaba.fastjson.JSONException -> L22
            java.lang.Enum r6 = java.lang.Enum.valueOf(r7, r6)     // Catch: java.lang.Exception -> L20 com.alibaba.fastjson.JSONException -> L22
            return r6
        L5e:
            r0 = 8
            if (r8 != r0) goto L66
            r7.nextToken(r3)     // Catch: java.lang.Exception -> L20 com.alibaba.fastjson.JSONException -> L22
            return r4
        L66:
            java.lang.Object r6 = r6.parse()     // Catch: java.lang.Exception -> L20 com.alibaba.fastjson.JSONException -> L22
            com.alibaba.fastjson.JSONException r7 = new com.alibaba.fastjson.JSONException     // Catch: java.lang.Exception -> L20 com.alibaba.fastjson.JSONException -> L22
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L20 com.alibaba.fastjson.JSONException -> L22
            r8.<init>()     // Catch: java.lang.Exception -> L20 com.alibaba.fastjson.JSONException -> L22
            r8.append(r2)     // Catch: java.lang.Exception -> L20 com.alibaba.fastjson.JSONException -> L22
            java.lang.Class<?> r0 = r5.enumClass     // Catch: java.lang.Exception -> L20 com.alibaba.fastjson.JSONException -> L22
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Exception -> L20 com.alibaba.fastjson.JSONException -> L22
            r8.append(r0)     // Catch: java.lang.Exception -> L20 com.alibaba.fastjson.JSONException -> L22
            r8.append(r1)     // Catch: java.lang.Exception -> L20 com.alibaba.fastjson.JSONException -> L22
            r8.append(r6)     // Catch: java.lang.Exception -> L20 com.alibaba.fastjson.JSONException -> L22
            java.lang.String r6 = r8.toString()     // Catch: java.lang.Exception -> L20 com.alibaba.fastjson.JSONException -> L22
            r7.<init>(r6)     // Catch: java.lang.Exception -> L20 com.alibaba.fastjson.JSONException -> L22
            throw r7     // Catch: java.lang.Exception -> L20 com.alibaba.fastjson.JSONException -> L22
        L8b:
            com.alibaba.fastjson.JSONException r7 = new com.alibaba.fastjson.JSONException
            java.lang.String r8 = r6.getMessage()
            r7.<init>(r8, r6)
            throw r7
        L95:
            throw r6
    }

    public java.lang.Enum getEnumByHashCode(long r3) {
            r2 = this;
            java.lang.Enum[] r0 = r2.enums
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            long[] r0 = r2.enumNameHashCodes
            int r3 = java.util.Arrays.binarySearch(r0, r3)
            if (r3 >= 0) goto Lf
            return r1
        Lf:
            java.lang.Enum[] r4 = r2.enums
            r3 = r4[r3]
            return r3
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public int getFastMatchToken() {
            r1 = this;
            r0 = 2
            return r0
    }

    public java.lang.Enum<?> valueOf(int r2) {
            r1 = this;
            java.lang.Enum[] r0 = r1.ordinalEnums
            r2 = r0[r2]
            return r2
    }
}
