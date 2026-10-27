package com.alibaba.fastjson.parser.deserializer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class ThrowableDeserializer extends com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer {
    public ThrowableDeserializer(com.alibaba.fastjson.parser.ParserConfig r1, java.lang.Class<?> r2) {
            r0 = this;
            r0.<init>(r1, r2, r2)
            return
    }

    private java.lang.Throwable createException(java.lang.String r15, java.lang.Throwable r16, java.lang.Class<?> r17) throws java.lang.Exception {
            r14 = this;
            java.lang.reflect.Constructor[] r0 = r17.getConstructors()
            int r1 = r0.length
            r2 = 0
            r3 = 0
            r5 = r2
            r6 = r5
            r7 = r6
            r4 = 0
        Lb:
            r8 = 2
            r9 = 1
            if (r4 >= r1) goto L36
            r10 = r0[r4]
            java.lang.Class[] r11 = r10.getParameterTypes()
            int r12 = r11.length
            if (r12 != 0) goto L1a
            r7 = r10
            goto L33
        L1a:
            int r12 = r11.length
            java.lang.Class<java.lang.String> r13 = java.lang.String.class
            if (r12 != r9) goto L25
            r12 = r11[r3]
            if (r12 != r13) goto L25
            r6 = r10
            goto L33
        L25:
            int r12 = r11.length
            if (r12 != r8) goto L33
            r8 = r11[r3]
            if (r8 != r13) goto L33
            r8 = r11[r9]
            java.lang.Class<java.lang.Throwable> r9 = java.lang.Throwable.class
            if (r8 != r9) goto L33
            r5 = r10
        L33:
            int r4 = r4 + 1
            goto Lb
        L36:
            if (r5 == 0) goto L45
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r3] = r15
            r0[r9] = r16
            java.lang.Object r15 = r5.newInstance(r0)
            java.lang.Throwable r15 = (java.lang.Throwable) r15
            return r15
        L45:
            if (r6 == 0) goto L52
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r3] = r15
            java.lang.Object r15 = r6.newInstance(r0)
            java.lang.Throwable r15 = (java.lang.Throwable) r15
            return r15
        L52:
            if (r7 == 0) goto L5b
            java.lang.Object r15 = r7.newInstance(r2)
            java.lang.Throwable r15 = (java.lang.Throwable) r15
            return r15
        L5b:
            return r2
    }

    @Override // com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(com.alibaba.fastjson.parser.DefaultJSONParser r17, java.lang.reflect.Type r18, java.lang.Object r19) {
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r18
            com.alibaba.fastjson.parser.JSONLexer r3 = r0.lexer
            int r4 = r3.token()
            r5 = 0
            r6 = 8
            if (r4 != r6) goto L15
            r3.nextToken()
            return r5
        L15:
            int r4 = r0.getResolveStatus()
            r7 = 2
            java.lang.String r8 = "syntax error"
            if (r4 != r7) goto L23
            r4 = 0
            r0.setResolveStatus(r4)
            goto L2b
        L23:
            int r4 = r3.token()
            r7 = 12
            if (r4 != r7) goto L130
        L2b:
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            if (r2 == 0) goto L3c
            boolean r7 = r2 instanceof java.lang.Class
            if (r7 == 0) goto L3c
            java.lang.Class r2 = (java.lang.Class) r2
            boolean r7 = r4.isAssignableFrom(r2)
            if (r7 == 0) goto L3c
            goto L3d
        L3c:
            r2 = r5
        L3d:
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            r9 = r5
            r10 = r9
            r11 = r10
        L45:
            com.alibaba.fastjson.parser.SymbolTable r12 = r0.getSymbolTable()
            java.lang.String r12 = r3.scanSymbol(r12)
            r13 = 13
            r14 = 16
            if (r12 != 0) goto L6d
            int r15 = r3.token()
            if (r15 != r13) goto L5e
            r3.nextToken(r14)
            goto Leb
        L5e:
            int r15 = r3.token()
            if (r15 != r14) goto L6d
            com.alibaba.fastjson.parser.Feature r15 = com.alibaba.fastjson.parser.Feature.AllowArbitraryCommas
            boolean r15 = r3.isEnabled(r15)
            if (r15 == 0) goto L6d
            goto L45
        L6d:
            r15 = 4
            r3.nextTokenWithColon(r15)
            java.lang.String r13 = com.alibaba.fastjson.JSON.DEFAULT_TYPE_KEY
            boolean r13 = r13.equals(r12)
            if (r13 == 0) goto L95
            int r2 = r3.token()
            if (r2 != r15) goto L8f
            java.lang.String r2 = r3.stringVal()
            com.alibaba.fastjson.parser.ParserConfig r12 = r0.getConfig()
            java.lang.Class r2 = r12.checkAutoType(r2, r4)
            r3.nextToken(r14)
            goto Le0
        L8f:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            r0.<init>(r8)
            throw r0
        L95:
            java.lang.String r13 = "message"
            boolean r13 = r13.equals(r12)
            if (r13 == 0) goto Lb9
            int r10 = r3.token()
            if (r10 != r6) goto La5
            r10 = r5
            goto Laf
        La5:
            int r10 = r3.token()
            if (r10 != r15) goto Lb3
            java.lang.String r10 = r3.stringVal()
        Laf:
            r3.nextToken()
            goto Le0
        Lb3:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            r0.<init>(r8)
            throw r0
        Lb9:
            java.lang.String r13 = "cause"
            boolean r15 = r13.equals(r12)
            if (r15 == 0) goto Lc8
            java.lang.Object r9 = r1.deserialze(r0, r5, r13)
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            goto Le0
        Lc8:
            java.lang.String r13 = "stackTrace"
            boolean r13 = r13.equals(r12)
            if (r13 == 0) goto Ld9
            java.lang.Class<java.lang.StackTraceElement[]> r11 = java.lang.StackTraceElement[].class
            java.lang.Object r11 = r0.parseObject(r11)
            java.lang.StackTraceElement[] r11 = (java.lang.StackTraceElement[]) r11
            goto Le0
        Ld9:
            java.lang.Object r13 = r0.parse()
            r7.put(r12, r13)
        Le0:
            int r12 = r3.token()
            r13 = 13
            if (r12 != r13) goto L45
            r3.nextToken(r14)
        Leb:
            if (r2 != 0) goto Lf3
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r10, r9)
            goto L107
        Lf3:
            boolean r0 = r4.isAssignableFrom(r2)
            if (r0 == 0) goto L115
            java.lang.Throwable r0 = r1.createException(r10, r9, r2)     // Catch: java.lang.Exception -> L105
            if (r0 != 0) goto L107
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Exception -> L105
            r0.<init>(r10, r9)     // Catch: java.lang.Exception -> L105
            goto L107
        L105:
            r0 = move-exception
            goto L10d
        L107:
            if (r11 == 0) goto L10c
            r0.setStackTrace(r11)
        L10c:
            return r0
        L10d:
            com.alibaba.fastjson.JSONException r2 = new com.alibaba.fastjson.JSONException
            java.lang.String r3 = "create instance error"
            r2.<init>(r3, r0)
            throw r2
        L115:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "type not match, not Throwable. "
            r3.append(r4)
            java.lang.String r2 = r2.getName()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.<init>(r2)
            throw r0
        L130:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            r0.<init>(r8)
            throw r0
    }

    @Override // com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public int getFastMatchToken() {
            r1 = this;
            r0 = 12
            return r0
    }
}
