package com.alibaba.fastjson.serializer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class AwtCodec implements com.alibaba.fastjson.serializer.ObjectSerializer, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer {
    public static final com.alibaba.fastjson.serializer.AwtCodec instance = null;

    static {
            com.alibaba.fastjson.serializer.AwtCodec r0 = new com.alibaba.fastjson.serializer.AwtCodec
            r0.<init>()
            com.alibaba.fastjson.serializer.AwtCodec.instance = r0
            return
    }

    public AwtCodec() {
            r0 = this;
            r0.<init>()
            return
    }

    private java.lang.Object parseRef(com.alibaba.fastjson.parser.DefaultJSONParser r4, java.lang.Object r5) {
            r3 = this;
            com.alibaba.fastjson.parser.JSONLexer r0 = r4.getLexer()
            r1 = 4
            r0.nextTokenWithColon(r1)
            java.lang.String r1 = r0.stringVal()
            com.alibaba.fastjson.parser.ParseContext r2 = r4.getContext()
            r4.setContext(r2, r5)
            com.alibaba.fastjson.parser.DefaultJSONParser$ResolveTask r5 = new com.alibaba.fastjson.parser.DefaultJSONParser$ResolveTask
            com.alibaba.fastjson.parser.ParseContext r2 = r4.getContext()
            r5.<init>(r2, r1)
            r4.addResolveTask(r5)
            r4.popContext()
            r5 = 1
            r4.setResolveStatus(r5)
            r5 = 13
            r0.nextToken(r5)
            r4.accept(r5)
            r4 = 0
            return r4
    }

    public static boolean support(java.lang.Class<?> r1) {
            java.lang.Class<java.awt.Point> r0 = java.awt.Point.class
            if (r1 == r0) goto L13
            java.lang.Class<java.awt.Rectangle> r0 = java.awt.Rectangle.class
            if (r1 == r0) goto L13
            java.lang.Class<java.awt.Font> r0 = java.awt.Font.class
            if (r1 == r0) goto L13
            java.lang.Class<java.awt.Color> r0 = java.awt.Color.class
            if (r1 != r0) goto L11
            goto L13
        L11:
            r1 = 0
            return r1
        L13:
            r1 = 1
            return r1
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(com.alibaba.fastjson.parser.DefaultJSONParser r5, java.lang.reflect.Type r6, java.lang.Object r7) {
            r4 = this;
            com.alibaba.fastjson.parser.JSONLexer r0 = r5.lexer
            int r1 = r0.token()
            r2 = 8
            r3 = 16
            if (r1 != r2) goto L11
            r0.nextToken(r3)
            r5 = 0
            return r5
        L11:
            int r1 = r0.token()
            r2 = 12
            if (r1 == r2) goto L28
            int r1 = r0.token()
            if (r1 != r3) goto L20
            goto L28
        L20:
            com.alibaba.fastjson.JSONException r5 = new com.alibaba.fastjson.JSONException
            java.lang.String r6 = "syntax error"
            r5.<init>(r6)
            throw r5
        L28:
            r0.nextToken()
            java.lang.Class<java.awt.Point> r0 = java.awt.Point.class
            if (r6 != r0) goto L34
            java.awt.Point r6 = r4.parsePoint(r5, r7)
            goto L4e
        L34:
            java.lang.Class<java.awt.Rectangle> r0 = java.awt.Rectangle.class
            if (r6 != r0) goto L3d
            java.awt.Rectangle r6 = r4.parseRectangle(r5)
            goto L4e
        L3d:
            java.lang.Class<java.awt.Color> r0 = java.awt.Color.class
            if (r6 != r0) goto L46
            java.awt.Color r6 = r4.parseColor(r5)
            goto L4e
        L46:
            java.lang.Class<java.awt.Font> r0 = java.awt.Font.class
            if (r6 != r0) goto L59
            java.awt.Font r6 = r4.parseFont(r5)
        L4e:
            com.alibaba.fastjson.parser.ParseContext r0 = r5.getContext()
            r5.setContext(r6, r7)
            r5.setContext(r0)
            return r6
        L59:
            com.alibaba.fastjson.JSONException r5 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "not support awt class : "
            r7.append(r0)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r5.<init>(r6)
            throw r5
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public int getFastMatchToken() {
            r1 = this;
            r0 = 12
            return r0
    }

    protected java.awt.Color parseColor(com.alibaba.fastjson.parser.DefaultJSONParser r10) {
            r9 = this;
            com.alibaba.fastjson.parser.JSONLexer r10 = r10.lexer
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
        L6:
            int r4 = r10.token()
            r5 = 13
            if (r4 != r5) goto L17
            r10.nextToken()
            java.awt.Color r10 = new java.awt.Color
            r10.<init>(r0, r1, r2, r3)
            return r10
        L17:
            int r4 = r10.token()
            java.lang.String r5 = "syntax error"
            r6 = 4
            if (r4 != r6) goto L85
            java.lang.String r4 = r10.stringVal()
            r7 = 2
            r10.nextTokenWithColon(r7)
            int r8 = r10.token()
            if (r8 != r7) goto L7f
            int r5 = r10.intValue()
            r10.nextToken()
            java.lang.String r7 = "r"
            boolean r7 = r4.equalsIgnoreCase(r7)
            if (r7 == 0) goto L3f
            r0 = r5
            goto L5c
        L3f:
            java.lang.String r7 = "g"
            boolean r7 = r4.equalsIgnoreCase(r7)
            if (r7 == 0) goto L49
            r1 = r5
            goto L5c
        L49:
            java.lang.String r7 = "b"
            boolean r7 = r4.equalsIgnoreCase(r7)
            if (r7 == 0) goto L53
            r2 = r5
            goto L5c
        L53:
            java.lang.String r3 = "alpha"
            boolean r3 = r4.equalsIgnoreCase(r3)
            if (r3 == 0) goto L68
            r3 = r5
        L5c:
            int r4 = r10.token()
            r5 = 16
            if (r4 != r5) goto L6
            r10.nextToken(r6)
            goto L6
        L68:
            com.alibaba.fastjson.JSONException r10 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "syntax error, "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L7f:
            com.alibaba.fastjson.JSONException r10 = new com.alibaba.fastjson.JSONException
            r10.<init>(r5)
            throw r10
        L85:
            com.alibaba.fastjson.JSONException r10 = new com.alibaba.fastjson.JSONException
            r10.<init>(r5)
            throw r10
    }

    protected java.awt.Font parseFont(com.alibaba.fastjson.parser.DefaultJSONParser r9) {
            r8 = this;
            com.alibaba.fastjson.parser.JSONLexer r9 = r9.lexer
            r0 = 0
            r1 = 0
            r2 = r1
            r1 = 0
        L6:
            int r3 = r9.token()
            r4 = 13
            if (r3 != r4) goto L17
            r9.nextToken()
            java.awt.Font r9 = new java.awt.Font
            r9.<init>(r2, r0, r1)
            return r9
        L17:
            int r3 = r9.token()
            r4 = 4
            java.lang.String r5 = "syntax error"
            if (r3 != r4) goto L9e
            java.lang.String r3 = r9.stringVal()
            r6 = 2
            r9.nextTokenWithColon(r6)
            java.lang.String r7 = "name"
            boolean r7 = r3.equalsIgnoreCase(r7)
            if (r7 == 0) goto L44
            int r2 = r9.token()
            if (r2 != r4) goto L3e
            java.lang.String r2 = r9.stringVal()
            r9.nextToken()
            goto L75
        L3e:
            com.alibaba.fastjson.JSONException r9 = new com.alibaba.fastjson.JSONException
            r9.<init>(r5)
            throw r9
        L44:
            java.lang.String r7 = "style"
            boolean r7 = r3.equalsIgnoreCase(r7)
            if (r7 == 0) goto L60
            int r0 = r9.token()
            if (r0 != r6) goto L5a
            int r0 = r9.intValue()
            r9.nextToken()
            goto L75
        L5a:
            com.alibaba.fastjson.JSONException r9 = new com.alibaba.fastjson.JSONException
            r9.<init>(r5)
            throw r9
        L60:
            java.lang.String r1 = "size"
            boolean r1 = r3.equalsIgnoreCase(r1)
            if (r1 == 0) goto L87
            int r1 = r9.token()
            if (r1 != r6) goto L81
            int r1 = r9.intValue()
            r9.nextToken()
        L75:
            int r3 = r9.token()
            r5 = 16
            if (r3 != r5) goto L6
            r9.nextToken(r4)
            goto L6
        L81:
            com.alibaba.fastjson.JSONException r9 = new com.alibaba.fastjson.JSONException
            r9.<init>(r5)
            throw r9
        L87:
            com.alibaba.fastjson.JSONException r9 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "syntax error, "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        L9e:
            com.alibaba.fastjson.JSONException r9 = new com.alibaba.fastjson.JSONException
            r9.<init>(r5)
            throw r9
    }

    protected java.awt.Point parsePoint(com.alibaba.fastjson.parser.DefaultJSONParser r8, java.lang.Object r9) {
            r7 = this;
            com.alibaba.fastjson.parser.JSONLexer r0 = r8.lexer
            r1 = 0
            r2 = 0
        L4:
            int r3 = r0.token()
            r4 = 13
            if (r3 != r4) goto L15
            r0.nextToken()
            java.awt.Point r8 = new java.awt.Point
            r8.<init>(r1, r2)
            return r8
        L15:
            int r3 = r0.token()
            r4 = 4
            if (r3 != r4) goto Lab
            java.lang.String r3 = r0.stringVal()
            java.lang.String r5 = com.alibaba.fastjson.JSON.DEFAULT_TYPE_KEY
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L2e
            java.lang.String r3 = "java.awt.Point"
            r8.acceptType(r3)
            goto L4
        L2e:
            java.lang.String r5 = "$ref"
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L3d
            java.lang.Object r8 = r7.parseRef(r8, r9)
            java.awt.Point r8 = (java.awt.Point) r8
            return r8
        L3d:
            r5 = 2
            r0.nextTokenWithColon(r5)
            int r6 = r0.token()
            if (r6 != r5) goto L4f
            int r5 = r0.intValue()
            r0.nextToken()
            goto L5a
        L4f:
            r5 = 3
            if (r6 != r5) goto L90
            float r5 = r0.floatValue()
            int r5 = (int) r5
            r0.nextToken()
        L5a:
            java.lang.String r6 = "x"
            boolean r6 = r3.equalsIgnoreCase(r6)
            if (r6 == 0) goto L64
            r1 = r5
            goto L6d
        L64:
            java.lang.String r2 = "y"
            boolean r2 = r3.equalsIgnoreCase(r2)
            if (r2 == 0) goto L79
            r2 = r5
        L6d:
            int r3 = r0.token()
            r5 = 16
            if (r3 != r5) goto L4
            r0.nextToken(r4)
            goto L4
        L79:
            com.alibaba.fastjson.JSONException r8 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "syntax error, "
            r9.append(r0)
            r9.append(r3)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L90:
            com.alibaba.fastjson.JSONException r8 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r1 = "syntax error : "
            r9.append(r1)
            java.lang.String r0 = r0.tokenName()
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        Lab:
            com.alibaba.fastjson.JSONException r8 = new com.alibaba.fastjson.JSONException
            java.lang.String r9 = "syntax error"
            r8.<init>(r9)
            throw r8
    }

    protected java.awt.Rectangle parseRectangle(com.alibaba.fastjson.parser.DefaultJSONParser r10) {
            r9 = this;
            com.alibaba.fastjson.parser.JSONLexer r10 = r10.lexer
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
        L6:
            int r4 = r10.token()
            r5 = 13
            if (r4 != r5) goto L17
            r10.nextToken()
            java.awt.Rectangle r10 = new java.awt.Rectangle
            r10.<init>(r0, r1, r2, r3)
            return r10
        L17:
            int r4 = r10.token()
            java.lang.String r5 = "syntax error"
            r6 = 4
            if (r4 != r6) goto L91
            java.lang.String r4 = r10.stringVal()
            r7 = 2
            r10.nextTokenWithColon(r7)
            int r8 = r10.token()
            if (r8 != r7) goto L36
            int r5 = r10.intValue()
            r10.nextToken()
            goto L41
        L36:
            r7 = 3
            if (r8 != r7) goto L8b
            float r5 = r10.floatValue()
            int r5 = (int) r5
            r10.nextToken()
        L41:
            java.lang.String r7 = "x"
            boolean r7 = r4.equalsIgnoreCase(r7)
            if (r7 == 0) goto L4b
            r0 = r5
            goto L68
        L4b:
            java.lang.String r7 = "y"
            boolean r7 = r4.equalsIgnoreCase(r7)
            if (r7 == 0) goto L55
            r1 = r5
            goto L68
        L55:
            java.lang.String r7 = "width"
            boolean r7 = r4.equalsIgnoreCase(r7)
            if (r7 == 0) goto L5f
            r2 = r5
            goto L68
        L5f:
            java.lang.String r3 = "height"
            boolean r3 = r4.equalsIgnoreCase(r3)
            if (r3 == 0) goto L74
            r3 = r5
        L68:
            int r4 = r10.token()
            r5 = 16
            if (r4 != r5) goto L6
            r10.nextToken(r6)
            goto L6
        L74:
            com.alibaba.fastjson.JSONException r10 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "syntax error, "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L8b:
            com.alibaba.fastjson.JSONException r10 = new com.alibaba.fastjson.JSONException
            r10.<init>(r5)
            throw r10
        L91:
            com.alibaba.fastjson.JSONException r10 = new com.alibaba.fastjson.JSONException
            r10.<init>(r5)
            throw r10
    }

    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public void write(com.alibaba.fastjson.serializer.JSONSerializer r3, java.lang.Object r4, java.lang.Object r5, java.lang.reflect.Type r6, int r7) throws java.io.IOException {
            r2 = this;
            com.alibaba.fastjson.serializer.SerializeWriter r3 = r3.out
            if (r4 != 0) goto L8
            r3.writeNull()
            return
        L8:
            boolean r5 = r4 instanceof java.awt.Point
            java.lang.String r6 = "y"
            java.lang.String r7 = "x"
            r0 = 44
            r1 = 123(0x7b, float:1.72E-43)
            if (r5 == 0) goto L28
            java.awt.Point r4 = (java.awt.Point) r4
            java.lang.Class<java.awt.Point> r5 = java.awt.Point.class
            char r5 = r2.writeClassName(r3, r5, r1)
            int r1 = r4.x
            r3.writeFieldValue(r5, r7, r1)
            int r4 = r4.y
            r3.writeFieldValue(r0, r6, r4)
            goto Lab
        L28:
            boolean r5 = r4 instanceof java.awt.Font
            if (r5 == 0) goto L50
            java.awt.Font r4 = (java.awt.Font) r4
            java.lang.Class<java.awt.Font> r5 = java.awt.Font.class
            char r5 = r2.writeClassName(r3, r5, r1)
            java.lang.String r6 = "name"
            java.lang.String r7 = r4.getName()
            r3.writeFieldValue(r5, r6, r7)
            java.lang.String r5 = "style"
            int r6 = r4.getStyle()
            r3.writeFieldValue(r0, r5, r6)
            java.lang.String r5 = "size"
            int r4 = r4.getSize()
            r3.writeFieldValue(r0, r5, r4)
            goto Lab
        L50:
            boolean r5 = r4 instanceof java.awt.Rectangle
            if (r5 == 0) goto L75
            java.awt.Rectangle r4 = (java.awt.Rectangle) r4
            java.lang.Class<java.awt.Rectangle> r5 = java.awt.Rectangle.class
            char r5 = r2.writeClassName(r3, r5, r1)
            int r1 = r4.x
            r3.writeFieldValue(r5, r7, r1)
            int r5 = r4.y
            r3.writeFieldValue(r0, r6, r5)
            java.lang.String r5 = "width"
            int r6 = r4.width
            r3.writeFieldValue(r0, r5, r6)
            java.lang.String r5 = "height"
            int r4 = r4.height
            r3.writeFieldValue(r0, r5, r4)
            goto Lab
        L75:
            boolean r5 = r4 instanceof java.awt.Color
            if (r5 == 0) goto Lb1
            java.awt.Color r4 = (java.awt.Color) r4
            java.lang.Class<java.awt.Color> r5 = java.awt.Color.class
            char r5 = r2.writeClassName(r3, r5, r1)
            java.lang.String r6 = "r"
            int r7 = r4.getRed()
            r3.writeFieldValue(r5, r6, r7)
            java.lang.String r5 = "g"
            int r6 = r4.getGreen()
            r3.writeFieldValue(r0, r5, r6)
            java.lang.String r5 = "b"
            int r6 = r4.getBlue()
            r3.writeFieldValue(r0, r5, r6)
            int r5 = r4.getAlpha()
            if (r5 <= 0) goto Lab
            java.lang.String r5 = "alpha"
            int r4 = r4.getAlpha()
            r3.writeFieldValue(r0, r5, r4)
        Lab:
            r4 = 125(0x7d, float:1.75E-43)
            r3.write(r4)
            return
        Lb1:
            com.alibaba.fastjson.JSONException r3 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "not support awt class : "
            r5.append(r6)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.<init>(r4)
            throw r3
    }

    protected char writeClassName(com.alibaba.fastjson.serializer.SerializeWriter r2, java.lang.Class<?> r3, char r4) {
            r1 = this;
            com.alibaba.fastjson.serializer.SerializerFeature r0 = com.alibaba.fastjson.serializer.SerializerFeature.WriteClassName
            boolean r0 = r2.isEnabled(r0)
            if (r0 == 0) goto L1c
            r4 = 123(0x7b, float:1.72E-43)
            r2.write(r4)
            java.lang.String r4 = com.alibaba.fastjson.JSON.DEFAULT_TYPE_KEY
            r2.writeFieldName(r4)
            java.lang.String r3 = r3.getName()
            r2.writeString(r3)
            r2 = 44
            return r2
        L1c:
            return r4
    }
}
