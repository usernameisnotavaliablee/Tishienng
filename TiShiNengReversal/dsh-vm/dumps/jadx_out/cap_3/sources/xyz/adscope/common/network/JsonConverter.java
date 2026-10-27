package xyz.adscope.common.network;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class JsonConverter implements xyz.adscope.common.network.simple.Converter {
    private android.content.Context a;

    public JsonConverter(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // xyz.adscope.common.network.simple.Converter
    public <S, F> xyz.adscope.common.network.simple.SimpleResponse<S, F> convert(java.lang.reflect.Type r4, java.lang.reflect.Type r5, xyz.adscope.common.network.Response r6, boolean r7) {
            r3 = this;
            int r5 = r6.code()
            xyz.adscope.common.network.ResponseBody r0 = r6.body()
            java.lang.String r0 = r0.string()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "JsonConverter response code : "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = " , serverJson : "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "common_log"
            xyz.adscope.common.tool.LogUtil.i(r2, r1)
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 0
            if (r5 < r1) goto L43
            r1 = 300(0x12c, float:4.2E-43)
            if (r5 >= r1) goto L43
            int r5 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r5 < r1) goto L6b
            java.lang.String r4 = xyz.adscope.common.network.a.a(r4)
            java.lang.String r5 = "java.lang.String"
            r4.equals(r5)
            goto L6b
        L43:
            r4 = 302(0x12e, float:4.23E-43)
            if (r5 != r4) goto L4c
            java.lang.String r0 = r6.toString()
            goto L6b
        L4c:
            r4 = 400(0x190, float:5.6E-43)
            r0 = 500(0x1f4, float:7.0E-43)
            if (r5 < r4) goto L5f
            if (r5 >= r0) goto L5f
            android.content.Context r4 = r3.a
            int r5 = xyz.adscope.common.R.string.adscope_server_unknown_exception
            java.lang.String r4 = r4.getString(r5)
        L5c:
            r0 = r2
            r2 = r4
            goto L6b
        L5f:
            if (r5 < r0) goto L6a
            android.content.Context r4 = r3.a
            int r5 = xyz.adscope.common.R.string.adscope_server_not_response
            java.lang.String r4 = r4.getString(r5)
            goto L5c
        L6a:
            r0 = r2
        L6b:
            xyz.adscope.common.network.simple.SimpleResponse$Builder r4 = xyz.adscope.common.network.simple.SimpleResponse.newBuilder()
            int r5 = r6.code()
            xyz.adscope.common.network.simple.SimpleResponse$Builder r4 = r4.code(r5)
            xyz.adscope.common.network.Headers r5 = r6.headers()
            xyz.adscope.common.network.simple.SimpleResponse$Builder r4 = r4.headers(r5)
            xyz.adscope.common.network.simple.SimpleResponse$Builder r4 = r4.fromCache(r7)
            xyz.adscope.common.network.simple.SimpleResponse$Builder r4 = r4.succeed(r0)
            xyz.adscope.common.network.simple.SimpleResponse$Builder r4 = r4.failed(r2)
            xyz.adscope.common.network.simple.SimpleResponse r4 = r4.build()
            return r4
    }
}
