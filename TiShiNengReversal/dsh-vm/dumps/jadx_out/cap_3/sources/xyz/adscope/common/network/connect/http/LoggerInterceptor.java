package xyz.adscope.common.network.connect.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class LoggerInterceptor implements xyz.adscope.common.network.connect.Interceptor {
    private final java.lang.String a;
    private final boolean b;

    public LoggerInterceptor(java.lang.String r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // xyz.adscope.common.network.connect.Interceptor
    public xyz.adscope.common.network.Response intercept(xyz.adscope.common.network.connect.http.Chain r12) {
            r11 = this;
            xyz.adscope.common.network.Request r0 = r12.request()
            boolean r1 = r11.b
            if (r1 == 0) goto L102
            xyz.adscope.common.network.Response r12 = r12.proceed(r0)
            xyz.adscope.common.network.Url r1 = r0.url()
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r5 = 0
            r4[r5] = r1
            java.lang.String r6 = " \nPrint Request: %1$s."
            java.lang.String r4 = java.lang.String.format(r6, r4)
            r2.<init>(r4)
            xyz.adscope.common.network.RequestMethod r4 = r0.method()
            java.lang.String r4 = r4.name()
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r6[r5] = r4
            java.lang.String r4 = "\nMethod: %1$s."
            java.lang.String r4 = java.lang.String.format(r4, r6)
            r2.append(r4)
            xyz.adscope.common.network.Headers r4 = r0.headers()
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L46:
            boolean r6 = r4.hasNext()
            r7 = 2
            java.lang.String r8 = "\n%1$s: %2$s."
            java.lang.String r9 = ";"
            if (r6 == 0) goto L75
            java.lang.Object r6 = r4.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r10 = r6.getKey()
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r6 = r6.getValue()
            java.util.List r6 = (java.util.List) r6
            java.lang.String r6 = android.text.TextUtils.join(r9, r6)
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r5] = r10
            r7[r3] = r6
            java.lang.String r6 = java.lang.String.format(r8, r7)
            r2.append(r6)
            goto L46
        L75:
            xyz.adscope.common.network.RequestMethod r4 = r0.method()
            boolean r4 = r4.allowBody()
            if (r4 == 0) goto L9c
            xyz.adscope.common.network.RequestBody r0 = r0.body()
            boolean r4 = r0 instanceof xyz.adscope.common.network.StringBody
            if (r4 != 0) goto L8b
            boolean r4 = r0 instanceof xyz.adscope.common.network.UrlBody
            if (r4 == 0) goto L9c
        L8b:
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r5] = r0
            java.lang.String r0 = " \nRequest Body: %1$s."
            java.lang.String r0 = java.lang.String.format(r0, r4)
            r2.append(r0)
        L9c:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r5] = r1
            java.lang.String r1 = " \nPrint Response: %1$s."
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r2.append(r0)
            java.util.Locale r0 = java.util.Locale.getDefault()
            int r1 = r12.code()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r5] = r1
            java.lang.String r1 = "\nCode: %1$d"
            java.lang.String r0 = java.lang.String.format(r0, r1, r4)
            r2.append(r0)
            xyz.adscope.common.network.Headers r0 = r12.headers()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        Lce:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lf8
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r4 = r1.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            java.lang.String r1 = android.text.TextUtils.join(r9, r1)
            java.lang.Object[] r6 = new java.lang.Object[r7]
            r6[r5] = r4
            r6[r3] = r1
            java.lang.String r1 = java.lang.String.format(r8, r6)
            r2.append(r1)
            goto Lce
        Lf8:
            java.lang.String r0 = r11.a
            java.lang.String r1 = r2.toString()
            xyz.adscope.common.tool.LogUtil.i(r0, r1)
            return r12
        L102:
            xyz.adscope.common.network.Response r12 = r12.proceed(r0)
            return r12
    }
}
