package com.tencent.open;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class b {
    protected java.util.HashMap<java.lang.String, com.tencent.open.b.C0035b> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a {
        protected java.lang.ref.WeakReference<android.webkit.WebView> a;
        protected long b;
        protected java.lang.String c;

        public a(android.webkit.WebView r2, long r3, java.lang.String r5) {
                r1 = this;
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.a = r0
                r1.b = r3
                r1.c = r5
                return
        }

        public void a() {
                r4 = this;
                java.lang.ref.WeakReference<android.webkit.WebView> r0 = r4.a
                java.lang.Object r0 = r0.get()
                android.webkit.WebView r0 = (android.webkit.WebView) r0
                if (r0 != 0) goto Lb
                return
            Lb:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "javascript:window.JsBridge&&JsBridge.callback("
                r1.append(r2)
                long r2 = r4.b
                r1.append(r2)
                java.lang.String r2 = ",{'r':1,'result':'no such method'})"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.loadUrl(r1)
                return
        }

        public void a(java.lang.Object r5) {
                r4 = this;
                java.lang.ref.WeakReference<android.webkit.WebView> r0 = r4.a
                java.lang.Object r0 = r0.get()
                android.webkit.WebView r0 = (android.webkit.WebView) r0
                if (r0 != 0) goto Lb
                return
            Lb:
                boolean r1 = r5 instanceof java.lang.String
                if (r1 == 0) goto L34
                java.lang.String r5 = (java.lang.String) r5
                java.lang.String r1 = "\\"
                java.lang.String r2 = "\\\\"
                java.lang.String r5 = r5.replace(r1, r2)
                java.lang.String r1 = "\\'"
                java.lang.String r2 = "'"
                java.lang.String r5 = r5.replace(r2, r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r2)
                r1.append(r5)
                r1.append(r2)
                java.lang.String r5 = r1.toString()
                goto L59
            L34:
                boolean r1 = r5 instanceof java.lang.Number
                if (r1 != 0) goto L55
                boolean r1 = r5 instanceof java.lang.Long
                if (r1 != 0) goto L55
                boolean r1 = r5 instanceof java.lang.Integer
                if (r1 != 0) goto L55
                boolean r1 = r5 instanceof java.lang.Double
                if (r1 != 0) goto L55
                boolean r1 = r5 instanceof java.lang.Float
                if (r1 == 0) goto L49
                goto L55
            L49:
                boolean r1 = r5 instanceof java.lang.Boolean
                if (r1 == 0) goto L52
                java.lang.String r5 = r5.toString()
                goto L59
            L52:
                java.lang.String r5 = "'undefined'"
                goto L59
            L55:
                java.lang.String r5 = r5.toString()
            L59:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "javascript:window.JsBridge&&JsBridge.callback("
                r1.append(r2)
                long r2 = r4.b
                r1.append(r2)
                java.lang.String r2 = ",{'r':0,'result':"
                r1.append(r2)
                r1.append(r5)
                java.lang.String r5 = "});"
                r1.append(r5)
                java.lang.String r5 = r1.toString()
                r0.loadUrl(r5)
                return
        }

        public void a(java.lang.String r4) {
                r3 = this;
                java.lang.ref.WeakReference<android.webkit.WebView> r0 = r3.a
                java.lang.Object r0 = r0.get()
                android.webkit.WebView r0 = (android.webkit.WebView) r0
                if (r0 == 0) goto L1e
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "javascript:"
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.loadUrl(r4)
            L1e:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.tencent.open.b$b, reason: collision with other inner class name */
    public static class C0035b {
        public C0035b() {
                r0 = this;
                r0.<init>()
                return
        }

        public void call(java.lang.String r18, java.util.List<java.lang.String> r19, com.tencent.open.b.a r20) {
                r17 = this;
                r1 = r17
                r0 = r19
                r2 = r20
                java.lang.String r3 = "openSDK_LOG.JsBridge"
                java.lang.Class r4 = r1.getClass()
                java.lang.reflect.Method[] r4 = r4.getDeclaredMethods()
                int r5 = r4.length
                r6 = 0
                r7 = 0
            L13:
                if (r7 >= r5) goto L32
                r9 = r4[r7]
                java.lang.String r10 = r9.getName()
                r11 = r18
                boolean r10 = r10.equals(r11)
                if (r10 == 0) goto L2f
                java.lang.Class[] r10 = r9.getParameterTypes()
                int r10 = r10.length
                int r12 = r0.size()
                if (r10 != r12) goto L2f
                goto L33
            L2f:
                int r7 = r7 + 1
                goto L13
            L32:
                r9 = 0
            L33:
                if (r9 == 0) goto L167
                int r4 = r0.size()     // Catch: java.lang.Exception -> L77
                if (r4 == 0) goto Lf7
                r5 = 1
                if (r4 == r5) goto Lea
                r7 = 2
                if (r4 == r7) goto Ld7
                r10 = 3
                if (r4 == r10) goto Lbe
                r11 = 4
                if (r4 == r11) goto L9f
                r12 = 5
                if (r4 == r12) goto L7a
                java.lang.Object r4 = r0.get(r6)     // Catch: java.lang.Exception -> L77
                java.lang.Object r13 = r0.get(r5)     // Catch: java.lang.Exception -> L77
                java.lang.Object r14 = r0.get(r7)     // Catch: java.lang.Exception -> L77
                java.lang.Object r15 = r0.get(r10)     // Catch: java.lang.Exception -> L77
                java.lang.Object r16 = r0.get(r11)     // Catch: java.lang.Exception -> L77
                java.lang.Object r0 = r0.get(r12)     // Catch: java.lang.Exception -> L77
                r8 = 6
                java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.lang.Exception -> L77
                r8[r6] = r4     // Catch: java.lang.Exception -> L77
                r8[r5] = r13     // Catch: java.lang.Exception -> L77
                r8[r7] = r14     // Catch: java.lang.Exception -> L77
                r8[r10] = r15     // Catch: java.lang.Exception -> L77
                r8[r11] = r16     // Catch: java.lang.Exception -> L77
                r8[r12] = r0     // Catch: java.lang.Exception -> L77
                java.lang.Object r0 = r9.invoke(r1, r8)     // Catch: java.lang.Exception -> L77
                goto Lfd
            L77:
                r0 = move-exception
                goto L14d
            L7a:
                java.lang.Object r4 = r0.get(r6)     // Catch: java.lang.Exception -> L77
                java.lang.Object r8 = r0.get(r5)     // Catch: java.lang.Exception -> L77
                java.lang.Object r13 = r0.get(r7)     // Catch: java.lang.Exception -> L77
                java.lang.Object r14 = r0.get(r10)     // Catch: java.lang.Exception -> L77
                java.lang.Object r0 = r0.get(r11)     // Catch: java.lang.Exception -> L77
                java.lang.Object[] r12 = new java.lang.Object[r12]     // Catch: java.lang.Exception -> L77
                r12[r6] = r4     // Catch: java.lang.Exception -> L77
                r12[r5] = r8     // Catch: java.lang.Exception -> L77
                r12[r7] = r13     // Catch: java.lang.Exception -> L77
                r12[r10] = r14     // Catch: java.lang.Exception -> L77
                r12[r11] = r0     // Catch: java.lang.Exception -> L77
                java.lang.Object r0 = r9.invoke(r1, r12)     // Catch: java.lang.Exception -> L77
                goto Lfd
            L9f:
                java.lang.Object r4 = r0.get(r6)     // Catch: java.lang.Exception -> L77
                java.lang.Object r8 = r0.get(r5)     // Catch: java.lang.Exception -> L77
                java.lang.Object r12 = r0.get(r7)     // Catch: java.lang.Exception -> L77
                java.lang.Object r0 = r0.get(r10)     // Catch: java.lang.Exception -> L77
                java.lang.Object[] r11 = new java.lang.Object[r11]     // Catch: java.lang.Exception -> L77
                r11[r6] = r4     // Catch: java.lang.Exception -> L77
                r11[r5] = r8     // Catch: java.lang.Exception -> L77
                r11[r7] = r12     // Catch: java.lang.Exception -> L77
                r11[r10] = r0     // Catch: java.lang.Exception -> L77
                java.lang.Object r0 = r9.invoke(r1, r11)     // Catch: java.lang.Exception -> L77
                goto Lfd
            Lbe:
                java.lang.Object r4 = r0.get(r6)     // Catch: java.lang.Exception -> L77
                java.lang.Object r8 = r0.get(r5)     // Catch: java.lang.Exception -> L77
                java.lang.Object r0 = r0.get(r7)     // Catch: java.lang.Exception -> L77
                java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch: java.lang.Exception -> L77
                r10[r6] = r4     // Catch: java.lang.Exception -> L77
                r10[r5] = r8     // Catch: java.lang.Exception -> L77
                r10[r7] = r0     // Catch: java.lang.Exception -> L77
                java.lang.Object r0 = r9.invoke(r1, r10)     // Catch: java.lang.Exception -> L77
                goto Lfd
            Ld7:
                java.lang.Object r4 = r0.get(r6)     // Catch: java.lang.Exception -> L77
                java.lang.Object r0 = r0.get(r5)     // Catch: java.lang.Exception -> L77
                java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Exception -> L77
                r7[r6] = r4     // Catch: java.lang.Exception -> L77
                r7[r5] = r0     // Catch: java.lang.Exception -> L77
                java.lang.Object r0 = r9.invoke(r1, r7)     // Catch: java.lang.Exception -> L77
                goto Lfd
            Lea:
                java.lang.Object r0 = r0.get(r6)     // Catch: java.lang.Exception -> L77
                java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L77
                r4[r6] = r0     // Catch: java.lang.Exception -> L77
                java.lang.Object r0 = r9.invoke(r1, r4)     // Catch: java.lang.Exception -> L77
                goto Lfd
            Lf7:
                r0 = 0
                java.lang.Object r4 = r9.invoke(r1, r0)     // Catch: java.lang.Exception -> L77
                r0 = r4
            Lfd:
                java.lang.Class r4 = r9.getReturnType()     // Catch: java.lang.Exception -> L77
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L77
                r5.<init>()     // Catch: java.lang.Exception -> L77
                java.lang.String r6 = "-->call, result: "
                r5.append(r6)     // Catch: java.lang.Exception -> L77
                r5.append(r0)     // Catch: java.lang.Exception -> L77
                java.lang.String r6 = " | ReturnType: "
                r5.append(r6)     // Catch: java.lang.Exception -> L77
                java.lang.String r6 = r4.getName()     // Catch: java.lang.Exception -> L77
                r5.append(r6)     // Catch: java.lang.Exception -> L77
                java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L77
                com.tencent.open.log.SLog.d(r3, r5)     // Catch: java.lang.Exception -> L77
                java.lang.String r5 = "void"
                java.lang.String r6 = r4.getName()     // Catch: java.lang.Exception -> L77
                boolean r5 = r5.equals(r6)     // Catch: java.lang.Exception -> L77
                if (r5 != 0) goto L146
                java.lang.Class<java.lang.Void> r5 = java.lang.Void.class
                if (r4 != r5) goto L132
                goto L146
            L132:
                if (r2 == 0) goto L16c
                boolean r4 = r1.customCallback()     // Catch: java.lang.Exception -> L77
                if (r4 == 0) goto L16c
                if (r0 == 0) goto L141
                java.lang.String r8 = r0.toString()     // Catch: java.lang.Exception -> L77
                goto L142
            L141:
                r8 = 0
            L142:
                r2.a(r8)     // Catch: java.lang.Exception -> L77
                return
            L146:
                if (r2 == 0) goto L16c
                r0 = 0
                r2.a(r0)     // Catch: java.lang.Exception -> L77
                return
            L14d:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "-->handler call mehtod ex. targetMethod: "
                r4.append(r5)
                r4.append(r9)
                java.lang.String r4 = r4.toString()
                com.tencent.open.log.SLog.e(r3, r4, r0)
                if (r2 == 0) goto L16c
                r2.a()
                goto L16c
            L167:
                if (r2 == 0) goto L16c
                r2.a()
            L16c:
                return
        }

        public boolean customCallback() {
                r1 = this;
                r0 = 0
                return r0
        }
    }

    public b() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.a = r0
            return
    }

    public void a(com.tencent.open.b.C0035b r2, java.lang.String r3) {
            r1 = this;
            java.util.HashMap<java.lang.String, com.tencent.open.b$b> r0 = r1.a
            r0.put(r3, r2)
            return
    }

    public void a(java.lang.String r6, java.lang.String r7, java.util.List<java.lang.String> r8, com.tencent.open.b.a r9) {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getResult---objName = "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = " methodName = "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "openSDK_LOG.JsBridge"
            com.tencent.open.log.SLog.v(r1, r0)
            int r0 = r8.size()
            r2 = 0
        L23:
            if (r2 >= r0) goto L37
            java.lang.Object r3 = r8.get(r2)     // Catch: java.io.UnsupportedEncodingException -> L34
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.io.UnsupportedEncodingException -> L34
            java.lang.String r4 = "UTF-8"
            java.lang.String r3 = java.net.URLDecoder.decode(r3, r4)     // Catch: java.io.UnsupportedEncodingException -> L34
            r8.set(r2, r3)     // Catch: java.io.UnsupportedEncodingException -> L34
        L34:
            int r2 = r2 + 1
            goto L23
        L37:
            java.util.HashMap<java.lang.String, com.tencent.open.b$b> r0 = r5.a
            java.lang.Object r6 = r0.get(r6)
            com.tencent.open.b$b r6 = (com.tencent.open.b.C0035b) r6
            if (r6 == 0) goto L4a
            java.lang.String r0 = "call----"
            com.tencent.open.log.SLog.d(r1, r0)
            r6.call(r7, r8, r9)
            goto L54
        L4a:
            java.lang.String r6 = "not call----objName NOT FIND"
            com.tencent.open.log.SLog.d(r1, r6)
            if (r9 == 0) goto L54
            r9.a()
        L54:
            return
    }

    public boolean a(android.webkit.WebView r8, java.lang.String r9) {
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "-->canHandleUrl---url = "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "openSDK_LOG.JsBridge"
            com.tencent.open.log.SLog.v(r1, r0)
            r0 = 0
            if (r9 != 0) goto L1a
            return r0
        L1a:
            android.net.Uri r1 = android.net.Uri.parse(r9)
            java.lang.String r1 = r1.getScheme()
            java.lang.String r2 = "jsbridge"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L2b
            return r0
        L2b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r9)
            java.lang.String r2 = "/#"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "/"
            java.lang.String[] r1 = r1.split(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.List r1 = java.util.Arrays.asList(r1)
            r2.<init>(r1)
            int r1 = r2.size()
            r3 = 6
            if (r1 >= r3) goto L53
            return r0
        L53:
            r0 = 2
            java.lang.Object r0 = r2.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1 = 3
            java.lang.Object r1 = r2.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r3 = r2.size()
            r4 = 1
            int r3 = r3 - r4
            r5 = 4
            java.util.List r2 = r2.subList(r5, r3)
            com.tencent.open.b$a r3 = new com.tencent.open.b$a
            r5 = 4
            r3.<init>(r8, r5, r9)
            r8.getUrl()
            r7.a(r0, r1, r2, r3)
            return r4
    }
}
