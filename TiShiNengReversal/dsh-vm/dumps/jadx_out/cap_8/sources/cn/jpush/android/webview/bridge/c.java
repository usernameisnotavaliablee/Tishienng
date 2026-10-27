package cn.jpush.android.webview.bridge;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c {
    private java.util.HashMap<java.lang.String, java.lang.reflect.Method> a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f2007b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f2008c;

    public c(java.lang.String r9, java.lang.Class r10) {
            r8 = this;
            java.lang.String r0 = "JsCallJava"
            r8.<init>()
            boolean r1 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Exception -> L59
            if (r1 != 0) goto Laa
            r8.f2007b = r9     // Catch: java.lang.Exception -> L59
            java.util.HashMap r9 = new java.util.HashMap     // Catch: java.lang.Exception -> L59
            r9.<init>()     // Catch: java.lang.Exception -> L59
            r8.a = r9     // Catch: java.lang.Exception -> L59
            java.lang.reflect.Method[] r9 = r10.getDeclaredMethods()     // Catch: java.lang.Exception -> L59
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L59
            java.lang.String r1 = "javascript:(function(b){console.log(\""
            r10.<init>(r1)     // Catch: java.lang.Exception -> L59
            java.lang.String r1 = r8.f2007b     // Catch: java.lang.Exception -> L59
            r10.append(r1)     // Catch: java.lang.Exception -> L59
            java.lang.String r1 = " initialization begin\");var a={queue:[],callback:function(){var d=Array.prototype.slice.call(arguments,0);var c=d.shift();var e=d.shift();this.queue[c].apply(this,d);if(!e){delete this.queue[c]}}};"
            r10.append(r1)     // Catch: java.lang.Exception -> L59
            int r1 = r9.length     // Catch: java.lang.Exception -> L59
            r2 = 0
            r3 = 0
        L2c:
            if (r3 >= r1) goto L5e
            r4 = r9[r3]     // Catch: java.lang.Exception -> L59
            int r5 = r4.getModifiers()     // Catch: java.lang.Exception -> L59
            r6 = 9
            if (r5 != r6) goto L5b
            java.lang.String r5 = r8.a(r4)     // Catch: java.lang.Exception -> L59
            if (r5 != 0) goto L3f
            goto L5b
        L3f:
            java.util.HashMap<java.lang.String, java.lang.reflect.Method> r6 = r8.a     // Catch: java.lang.Exception -> L59
            r6.put(r5, r4)     // Catch: java.lang.Exception -> L59
            java.util.Locale r5 = java.util.Locale.ENGLISH     // Catch: java.lang.Exception -> L59
            java.lang.String r6 = "a.%s="
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Exception -> L59
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Exception -> L59
            r7[r2] = r4     // Catch: java.lang.Exception -> L59
            java.lang.String r4 = java.lang.String.format(r5, r6, r7)     // Catch: java.lang.Exception -> L59
            r10.append(r4)     // Catch: java.lang.Exception -> L59
            goto L5b
        L59:
            r9 = move-exception
            goto Lb2
        L5b:
            int r3 = r3 + 1
            goto L2c
        L5e:
            java.lang.String r9 = "function(){var f=Array.prototype.slice.call(arguments,0);if(f.length<1){throw\""
            r10.append(r9)     // Catch: java.lang.Exception -> L59
            java.lang.String r9 = r8.f2007b     // Catch: java.lang.Exception -> L59
            r10.append(r9)     // Catch: java.lang.Exception -> L59
            java.lang.String r9 = " call error, message:miss method name\"}var e=[];for(var h=1;h<f.length;h++){var c=f[h];var j=typeof c;e[e.length]=j;if(j==\"function\"){var d=a.queue.length;a.queue[d]=c;f[h]=d}}var g=JSON.parse(prompt(JSON.stringify({method:f.shift(),types:e,args:f})));if(g.code!=200){throw\""
            r10.append(r9)     // Catch: java.lang.Exception -> L59
            java.lang.String r9 = r8.f2007b     // Catch: java.lang.Exception -> L59
            r10.append(r9)     // Catch: java.lang.Exception -> L59
            java.lang.String r9 = " call error, code:\"+g.code+\", message:\"+g.result}return g.result};Object.getOwnPropertyNames(a).forEach(function(d){var c=a[d];if(typeof c===\"function\"&&d!==\"callback\"){a[d]=function(){return c.apply(a,[d].concat(Array.prototype.slice.call(arguments,0)))}}});b."
            r10.append(r9)     // Catch: java.lang.Exception -> L59
            java.lang.String r9 = r8.f2007b     // Catch: java.lang.Exception -> L59
            r10.append(r9)     // Catch: java.lang.Exception -> L59
            java.lang.String r9 = "=a;console.log(\""
            r10.append(r9)     // Catch: java.lang.Exception -> L59
            java.lang.String r9 = r8.f2007b     // Catch: java.lang.Exception -> L59
            r10.append(r9)     // Catch: java.lang.Exception -> L59
            java.lang.String r9 = " initialization end\")})(window);"
            r10.append(r9)     // Catch: java.lang.Exception -> L59
            java.lang.String r9 = r10.toString()     // Catch: java.lang.Exception -> L59
            r8.f2008c = r9     // Catch: java.lang.Exception -> L59
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L59
            r9.<init>()     // Catch: java.lang.Exception -> L59
            java.lang.String r1 = "----------"
            r9.append(r1)     // Catch: java.lang.Exception -> L59
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Exception -> L59
            r9.append(r10)     // Catch: java.lang.Exception -> L59
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Exception -> L59
            cn.jpush.android.helper.Logger.d(r0, r9)     // Catch: java.lang.Exception -> L59
            return
        Laa:
            java.lang.Exception r9 = new java.lang.Exception     // Catch: java.lang.Exception -> L59
            java.lang.String r10 = "injected name can not be null"
            r9.<init>(r10)     // Catch: java.lang.Exception -> L59
            throw r9     // Catch: java.lang.Exception -> L59
        Lb2:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r1 = "init js error:"
            r10.append(r1)
            java.lang.String r9 = r9.getMessage()
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            cn.jpush.android.helper.Logger.e(r0, r9)
            return
    }

    private java.lang.String a(java.lang.String r4, int r5, java.lang.Object r6) {
            r3 = this;
            if (r6 != 0) goto L5
            java.lang.String r6 = "null"
            goto L45
        L5:
            boolean r0 = r6 instanceof java.lang.String
            if (r0 == 0) goto L26
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r0 = "\\\""
            java.lang.String r1 = "\""
            java.lang.String r6 = r6.replace(r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r6)
            r0.append(r1)
            java.lang.String r6 = r0.toString()
            goto L45
        L26:
            boolean r0 = r6 instanceof java.lang.Integer
            if (r0 != 0) goto L41
            boolean r0 = r6 instanceof java.lang.Long
            if (r0 != 0) goto L41
            boolean r0 = r6 instanceof java.lang.Boolean
            if (r0 != 0) goto L41
            boolean r0 = r6 instanceof java.lang.Float
            if (r0 != 0) goto L41
            boolean r0 = r6 instanceof java.lang.Double
            if (r0 != 0) goto L41
            boolean r0 = r6 instanceof org.json.JSONObject
            if (r0 != 0) goto L41
            java.lang.String r6 = ""
            goto L45
        L41:
            java.lang.String r6 = java.lang.String.valueOf(r6)
        L45:
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r5
            r5 = 1
            r1[r5] = r6
            java.lang.String r5 = "{\"code\": %d, \"result\": %s}"
            java.lang.String r5 = java.lang.String.format(r0, r5, r1)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = r3.f2007b
            r6.append(r0)
            java.lang.String r0 = " call json: "
            r6.append(r0)
            r6.append(r4)
            java.lang.String r4 = " result:"
            r6.append(r4)
            r6.append(r5)
            java.lang.String r4 = r6.toString()
            java.lang.String r6 = "JsCallJava"
            cn.jpush.android.helper.Logger.d(r6, r4)
            return r5
    }

    private java.lang.String a(java.lang.reflect.Method r6) {
            r5 = this;
            java.lang.String r0 = r6.getName()
            java.lang.Class[] r6 = r6.getParameterTypes()
            int r1 = r6.length
            r2 = 1
            if (r1 < r2) goto L77
            r3 = 0
            r3 = r6[r3]
            java.lang.Class<android.webkit.WebView> r4 = android.webkit.WebView.class
            if (r3 == r4) goto L14
            goto L77
        L14:
            if (r2 >= r1) goto L76
            r3 = r6[r2]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            if (r3 != r4) goto L2e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = "_S"
        L26:
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            goto L73
        L2e:
            java.lang.Class r4 = java.lang.Integer.TYPE
            if (r3 == r4) goto L68
            java.lang.Class r4 = java.lang.Long.TYPE
            if (r3 == r4) goto L68
            java.lang.Class r4 = java.lang.Float.TYPE
            if (r3 == r4) goto L68
            java.lang.Class r4 = java.lang.Double.TYPE
            if (r3 != r4) goto L3f
            goto L68
        L3f:
            java.lang.Class r4 = java.lang.Boolean.TYPE
            if (r3 != r4) goto L4e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = "_B"
            goto L26
        L4e:
            java.lang.Class<org.json.JSONObject> r4 = org.json.JSONObject.class
            if (r3 != r4) goto L5d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = "_O"
            goto L26
        L5d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = "_P"
            goto L26
        L68:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = "_N"
            goto L26
        L73:
            int r2 = r2 + 1
            goto L14
        L76:
            return r0
        L77:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = "method("
            r6.append(r1)
            r6.append(r0)
            java.lang.String r0 = ") must use webview to be first parameter, will be pass"
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.String r0 = "JsCallJava"
            cn.jpush.android.helper.Logger.w(r0, r6)
            r6 = 0
            return r6
    }

    public java.lang.String a() {
            r1 = this;
            java.lang.String r0 = r1.f2008c
            return r0
    }

    public java.lang.String a(android.webkit.WebView r11, java.lang.String r12) {
            r10 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            r1 = 500(0x1f4, float:7.0E-43)
            if (r0 != 0) goto L184
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L5c
            r0.<init>(r12)     // Catch: java.lang.Exception -> L5c
            java.lang.String r2 = "method"
            java.lang.String r2 = r0.getString(r2)     // Catch: java.lang.Exception -> L5c
            java.lang.String r3 = "types"
            org.json.JSONArray r3 = r0.getJSONArray(r3)     // Catch: java.lang.Exception -> L5c
            java.lang.String r4 = "args"
            org.json.JSONArray r0 = r0.getJSONArray(r4)     // Catch: java.lang.Exception -> L5c
            int r4 = r3.length()     // Catch: java.lang.Exception -> L5c
            int r5 = r4 + 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L5c
            r6 = 0
            r5[r6] = r11     // Catch: java.lang.Exception -> L5c
            r11 = 0
        L2b:
            r7 = 0
            if (r6 >= r4) goto Le2
            java.lang.String r8 = r3.optString(r6)     // Catch: java.lang.Exception -> L5c
            java.lang.String r9 = "string"
            boolean r9 = r9.equals(r8)     // Catch: java.lang.Exception -> L5c
            if (r9 == 0) goto L5f
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L5c
            r8.<init>()     // Catch: java.lang.Exception -> L5c
            r8.append(r2)     // Catch: java.lang.Exception -> L5c
            java.lang.String r2 = "_S"
            r8.append(r2)     // Catch: java.lang.Exception -> L5c
            java.lang.String r2 = r8.toString()     // Catch: java.lang.Exception -> L5c
            int r8 = r6 + 1
            boolean r9 = r0.isNull(r6)     // Catch: java.lang.Exception -> L5c
            if (r9 == 0) goto L54
            goto L58
        L54:
            java.lang.String r7 = r0.getString(r6)     // Catch: java.lang.Exception -> L5c
        L58:
            r5[r8] = r7     // Catch: java.lang.Exception -> L5c
            goto Lde
        L5c:
            r11 = move-exception
            goto L157
        L5f:
            java.lang.String r9 = "number"
            boolean r9 = r9.equals(r8)     // Catch: java.lang.Exception -> L5c
            if (r9 == 0) goto L7e
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L5c
            r7.<init>()     // Catch: java.lang.Exception -> L5c
            r7.append(r2)     // Catch: java.lang.Exception -> L5c
            java.lang.String r2 = "_N"
            r7.append(r2)     // Catch: java.lang.Exception -> L5c
            java.lang.String r2 = r7.toString()     // Catch: java.lang.Exception -> L5c
            int r11 = r11 * 10
            int r11 = r11 + r6
            int r11 = r11 + 1
            goto Lde
        L7e:
            java.lang.String r9 = "boolean"
            boolean r9 = r9.equals(r8)     // Catch: java.lang.Exception -> L5c
            if (r9 == 0) goto La4
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L5c
            r7.<init>()     // Catch: java.lang.Exception -> L5c
            r7.append(r2)     // Catch: java.lang.Exception -> L5c
            java.lang.String r2 = "_B"
            r7.append(r2)     // Catch: java.lang.Exception -> L5c
            java.lang.String r2 = r7.toString()     // Catch: java.lang.Exception -> L5c
            int r7 = r6 + 1
            boolean r8 = r0.getBoolean(r6)     // Catch: java.lang.Exception -> L5c
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch: java.lang.Exception -> L5c
            r5[r7] = r8     // Catch: java.lang.Exception -> L5c
            goto Lde
        La4:
            java.lang.String r9 = "object"
            boolean r8 = r9.equals(r8)     // Catch: java.lang.Exception -> L5c
            if (r8 == 0) goto Lcd
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L5c
            r8.<init>()     // Catch: java.lang.Exception -> L5c
            r8.append(r2)     // Catch: java.lang.Exception -> L5c
            java.lang.String r2 = "_O"
            r8.append(r2)     // Catch: java.lang.Exception -> L5c
            java.lang.String r2 = r8.toString()     // Catch: java.lang.Exception -> L5c
            int r8 = r6 + 1
            boolean r9 = r0.isNull(r6)     // Catch: java.lang.Exception -> L5c
            if (r9 == 0) goto Lc6
            goto Lca
        Lc6:
            org.json.JSONObject r7 = r0.getJSONObject(r6)     // Catch: java.lang.Exception -> L5c
        Lca:
            r5[r8] = r7     // Catch: java.lang.Exception -> L5c
            goto Lde
        Lcd:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L5c
            r7.<init>()     // Catch: java.lang.Exception -> L5c
            r7.append(r2)     // Catch: java.lang.Exception -> L5c
            java.lang.String r2 = "_P"
            r7.append(r2)     // Catch: java.lang.Exception -> L5c
            java.lang.String r2 = r7.toString()     // Catch: java.lang.Exception -> L5c
        Lde:
            int r6 = r6 + 1
            goto L2b
        Le2:
            java.util.HashMap<java.lang.String, java.lang.reflect.Method> r3 = r10.a     // Catch: java.lang.Exception -> L5c
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Exception -> L5c
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3     // Catch: java.lang.Exception -> L5c
            if (r3 != 0) goto L107
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L5c
            r11.<init>()     // Catch: java.lang.Exception -> L5c
            java.lang.String r0 = "not found method("
            r11.append(r0)     // Catch: java.lang.Exception -> L5c
            r11.append(r2)     // Catch: java.lang.Exception -> L5c
            java.lang.String r0 = ") with valid parameters"
            r11.append(r0)     // Catch: java.lang.Exception -> L5c
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Exception -> L5c
            java.lang.String r11 = r10.a(r12, r1, r11)     // Catch: java.lang.Exception -> L5c
            return r11
        L107:
            if (r11 <= 0) goto L14c
            java.lang.Class[] r2 = r3.getParameterTypes()     // Catch: java.lang.Exception -> L5c
        L10d:
            if (r11 <= 0) goto L14c
            int r4 = r11 / 10
            int r4 = r4 * 10
            int r4 = r11 - r4
            r6 = r2[r4]     // Catch: java.lang.Exception -> L5c
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L5c
            if (r6 != r8) goto L128
            int r6 = r4 + (-1)
            int r6 = r0.getInt(r6)     // Catch: java.lang.Exception -> L5c
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> L5c
            r5[r4] = r6     // Catch: java.lang.Exception -> L5c
            goto L149
        L128:
            java.lang.Class r8 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> L5c
            if (r6 != r8) goto L13d
            int r6 = r4 + (-1)
            java.lang.String r6 = r0.getString(r6)     // Catch: java.lang.Exception -> L5c
            long r8 = java.lang.Long.parseLong(r6)     // Catch: java.lang.Exception -> L5c
            java.lang.Long r6 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Exception -> L5c
            r5[r4] = r6     // Catch: java.lang.Exception -> L5c
            goto L149
        L13d:
            int r6 = r4 + (-1)
            double r8 = r0.getDouble(r6)     // Catch: java.lang.Exception -> L5c
            java.lang.Double r6 = java.lang.Double.valueOf(r8)     // Catch: java.lang.Exception -> L5c
            r5[r4] = r6     // Catch: java.lang.Exception -> L5c
        L149:
            int r11 = r11 / 10
            goto L10d
        L14c:
            java.lang.Object r11 = r3.invoke(r7, r5)     // Catch: java.lang.Exception -> L5c
            r0 = 200(0xc8, float:2.8E-43)
            java.lang.String r11 = r10.a(r12, r0, r11)     // Catch: java.lang.Exception -> L5c
            return r11
        L157:
            java.lang.Throwable r0 = r11.getCause()
            java.lang.String r2 = "method execute error:"
            if (r0 == 0) goto L17b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.Throwable r11 = r11.getCause()
        L16b:
            java.lang.String r11 = r11.getMessage()
            r0.append(r11)
            java.lang.String r11 = r0.toString()
        L176:
            java.lang.String r11 = r10.a(r12, r1, r11)
            return r11
        L17b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            goto L16b
        L184:
            java.lang.String r11 = "call data empty"
            goto L176
    }
}
