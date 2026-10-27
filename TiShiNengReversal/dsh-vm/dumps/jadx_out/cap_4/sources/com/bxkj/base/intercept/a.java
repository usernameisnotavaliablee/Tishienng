package com.bxkj.base.intercept;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class a implements okhttp3.Interceptor {
    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String a(java.lang.String r1, java.lang.String r2, boolean r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "="
            r0.append(r1)
            if (r3 == 0) goto L1d
            java.lang.String r1 = "UTF-8"
            java.lang.String r1 = java.net.URLEncoder.encode(r2, r1)     // Catch: java.io.UnsupportedEncodingException -> L19
            r0.append(r1)     // Catch: java.io.UnsupportedEncodingException -> L19
            goto L20
        L19:
            r0.append(r2)
            goto L20
        L1d:
            r0.append(r2)
        L20:
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static java.lang.String b(java.util.Map<java.lang.String, java.lang.String> r3) {
            b0.b r0 = b0.b.a
            com.bxkj.base.BaseApp r1 = com.bxkj.base.BaseApp.c()
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getToken()
            java.lang.String r3 = r0.i(r1, r2, r3)
            return r3
    }

    public static java.lang.String c(java.util.Map<java.lang.String, java.lang.String> r5, boolean r6) {
            if (r6 == 0) goto L7
            java.lang.String r5 = b(r5)
            return r5
        L7:
            java.util.ArrayList r6 = new java.util.ArrayList
            java.util.Set r0 = r5.keySet()
            r6.<init>(r0)
            java.util.Collections.sort(r6)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            r2 = 0
        L1a:
            int r3 = r6.size()
            int r3 = r3 + (-1)
            if (r2 >= r3) goto L3d
            java.lang.Object r3 = r6.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r5.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r3 = a(r3, r4, r1)
            r0.append(r3)
            java.lang.String r3 = "&"
            r0.append(r3)
            int r2 = r2 + 1
            goto L1a
        L3d:
            int r2 = r6.size()
            int r2 = r2 + (-1)
            java.lang.Object r6 = r6.get(r2)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r5.get(r6)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = a(r6, r5, r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r5 = cn.bluemobi.dylan.http.MD5Utils.md5(r5)
            java.lang.String r6 = "UTF-8"
            java.lang.String r5 = java.net.URLEncoder.encode(r5, r6)     // Catch: java.io.UnsupportedEncodingException -> L65
            return r5
        L65:
            java.lang.String r5 = ""
            return r5
    }

    private int d() {
            r3 = this;
            r0 = 0
            com.bxkj.base.BaseApp r1 = com.bxkj.base.BaseApp.c()     // Catch: java.lang.Exception -> L17
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Exception -> L17
            com.bxkj.base.BaseApp r2 = com.bxkj.base.BaseApp.c()     // Catch: java.lang.Exception -> L17
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Exception -> L17
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r0)     // Catch: java.lang.Exception -> L17
            int r0 = r1.versionCode     // Catch: java.lang.Exception -> L17
        L17:
            return r0
    }

    public okhttp3.Response intercept(okhttp3.Interceptor.Chain r18) throws java.io.IOException {
            r17 = this;
            okhttp3.Request r0 = r18.request()
            okhttp3.Request$Builder r1 = r0.newBuilder()
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r3 = r3.getAppId()
            com.bxkj.base.user.LoginUser r4 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r4 = r4.getToken()
            okhttp3.HttpUrl r5 = r0.url()
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "https://m.boxkj.com/"
            boolean r5 = r5.startsWith(r6)
            java.lang.String r6 = "1"
            java.lang.String r7 = "e8167ef026cbc5e456ab837d9d6d9254"
            r8 = 0
            if (r5 == 0) goto L39
            java.lang.String r3 = "move"
        L37:
            r4 = 0
            goto Lac
        L39:
            com.bxkj.base.user.LoginUser r5 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r5 = r5.getIsOpenEncry()
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L37
            okhttp3.HttpUrl r5 = r0.url()
            java.lang.String r5 = r5.toString()
            java.lang.String r9 = "app/sportRecordSetting/getSetting"
            boolean r5 = r5.endsWith(r9)
            if (r5 != 0) goto L67
            okhttp3.HttpUrl r5 = r0.url()
            java.lang.String r5 = r5.toString()
            java.lang.String r9 = "app/appSportRecord/appAddSportRecord"
            boolean r5 = r5.endsWith(r9)
            if (r5 == 0) goto L37
        L67:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "originAppId="
            r5.append(r7)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            com.orhanobut.logger.j.c(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "originToken="
            r3.append(r5)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.orhanobut.logger.j.c(r3)
            b0.b r3 = b0.b.a
            com.bxkj.base.BaseApp r5 = com.bxkj.base.BaseApp.c()
            com.bxkj.base.user.LoginUser r7 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r7 = r7.getAppId()
            java.lang.String r5 = r3.d(r5, r7, r4, r2)
            com.bxkj.base.BaseApp r7 = com.bxkj.base.BaseApp.c()
            java.lang.String r7 = r3.e(r7, r4, r2)
            r3 = 1
            r3 = r5
            r4 = 1
        Lac:
            okhttp3.RequestBody r5 = r0.body()
            boolean r9 = r5 instanceof okhttp3.FormBody
            java.lang.String r10 = "sign"
            java.lang.String r11 = "appSecret"
            java.lang.String r12 = "appId"
            java.lang.String r13 = "timestamp"
            if (r9 == 0) goto L104
            okhttp3.FormBody$Builder r9 = new okhttp3.FormBody$Builder
            r9.<init>()
            java.util.HashMap r14 = new java.util.HashMap
            r14.<init>()
            okhttp3.FormBody r5 = (okhttp3.FormBody) r5
        Lc8:
            int r15 = r5.size()
            if (r8 >= r15) goto Le3
            java.lang.String r15 = r5.name(r8)
            r16 = r0
            java.lang.String r0 = r5.value(r8)
            r14.put(r15, r0)
            r9.add(r15, r0)
            int r8 = r8 + 1
            r0 = r16
            goto Lc8
        Le3:
            r16 = r0
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto Lee
            r14.put(r12, r3)
        Lee:
            r14.put(r13, r2)
            r14.put(r11, r7)
            java.lang.String r0 = c(r14, r4)
            r9.add(r13, r2)
            r9.add(r10, r0)
            okhttp3.FormBody r0 = r9.build()
            goto L188
        L104:
            r16 = r0
            boolean r0 = r5 instanceof okhttp3.MultipartBody
            if (r0 == 0) goto L161
            okhttp3.MultipartBody r5 = (okhttp3.MultipartBody) r5
            okhttp3.MultipartBody$Builder r0 = new okhttp3.MultipartBody$Builder
            r0.<init>()
            okhttp3.MediaType r8 = okhttp3.MultipartBody.FORM
            r0.setType(r8)
            java.util.List r8 = r5.parts()
            java.util.Iterator r8 = r8.iterator()
        L11e:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L12e
            java.lang.Object r9 = r8.next()
            okhttp3.MultipartBody$Part r9 = (okhttp3.MultipartBody.Part) r9
            r0.addPart(r9)
            goto L11e
        L12e:
            kotlin.Pair r5 = com.bxkj.base.v2.common.ext.h.a(r5)
            java.lang.Object r8 = r5.component1()
            java.util.Map r8 = (java.util.Map) r8
            java.lang.Object r5 = r5.component2()
            java.util.Map r5 = (java.util.Map) r5
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>(r8)
            boolean r8 = android.text.TextUtils.isEmpty(r3)
            if (r8 != 0) goto L14c
            r5.put(r12, r3)
        L14c:
            r5.put(r13, r2)
            r5.put(r11, r7)
            java.lang.String r3 = c(r5, r4)
            r0.addFormDataPart(r13, r2)
            r0.addFormDataPart(r10, r3)
            okhttp3.MultipartBody r0 = r0.build()
            goto L188
        L161:
            okhttp3.FormBody$Builder r0 = new okhttp3.FormBody$Builder
            r0.<init>()
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            boolean r8 = android.text.TextUtils.isEmpty(r3)
            if (r8 != 0) goto L174
            r5.put(r12, r3)
        L174:
            r5.put(r13, r2)
            r5.put(r11, r7)
            java.lang.String r3 = c(r5, r4)
            r0.add(r13, r2)
            r0.add(r10, r3)
            okhttp3.FormBody r0 = r0.build()
        L188:
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getToken()
            java.lang.String r3 = "token"
            r1.addHeader(r3, r2)
            java.lang.String r2 = "Android"
            java.lang.String r3 = "channel"
            r1.addHeader(r3, r2)
            int r2 = r17.d()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "version"
            r1.addHeader(r3, r2)
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            int r2 = r2.getUserType()
            r3 = 2
            if (r2 != r3) goto L1b5
            goto L1b7
        L1b5:
            java.lang.String r6 = "0"
        L1b7:
            java.lang.String r2 = "type"
            r1.addHeader(r2, r6)
            java.lang.String r2 = r16.method()
            java.lang.String r3 = "GET"
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 != 0) goto L1cf
            java.lang.String r2 = r16.method()
            r1.method(r2, r0)
        L1cf:
            okhttp3.Request r0 = r1.build()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "request.url()="
            r1.append(r2)
            okhttp3.HttpUrl r2 = r0.url()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.orhanobut.logger.j.c(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "request.headers().toString()="
            r1.append(r2)
            okhttp3.Headers r2 = r0.headers()
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.orhanobut.logger.j.c(r1)
            r1 = r18
            okhttp3.Response r0 = r1.proceed(r0)
            return r0
    }
}
