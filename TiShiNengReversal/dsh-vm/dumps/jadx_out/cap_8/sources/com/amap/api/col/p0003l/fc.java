package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class fc extends java.lang.Exception {
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private int f3316b;

    public fc() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.a = r0
            r0 = 1000(0x3e8, float:1.401E-42)
            r1.f3316b = r0
            return
    }

    public fc(java.lang.String r2) {
            r1 = this;
            r1.<init>(r2)
            r0 = 1000(0x3e8, float:1.401E-42)
            r1.f3316b = r0
            r1.a = r2
            r1.a(r2)
            return
    }

    private void a(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "用户签名未通过"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Ld
            r2 = 1001(0x3e9, float:1.403E-42)
            r1.f3316b = r2
            return
        Ld:
            java.lang.String r0 = "用户key不正确或过期"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1a
            r2 = 1002(0x3ea, float:1.404E-42)
            r1.f3316b = r2
            return
        L1a:
            java.lang.String r0 = "请求服务不存在"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L27
            r2 = 1003(0x3eb, float:1.406E-42)
            r1.f3316b = r2
            return
        L27:
            java.lang.String r0 = "访问已超出日访问量"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L34
            r2 = 1004(0x3ec, float:1.407E-42)
            r1.f3316b = r2
            return
        L34:
            java.lang.String r0 = "用户访问过于频繁"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L41
            r2 = 1005(0x3ed, float:1.408E-42)
            r1.f3316b = r2
            return
        L41:
            java.lang.String r0 = "用户IP无效"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L4e
            r2 = 1006(0x3ee, float:1.41E-42)
            r1.f3316b = r2
            return
        L4e:
            java.lang.String r0 = "用户域名无效"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L5b
            r2 = 1007(0x3ef, float:1.411E-42)
            r1.f3316b = r2
            return
        L5b:
            java.lang.String r0 = "用户MD5安全码未通过"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L68
            r2 = 1008(0x3f0, float:1.413E-42)
            r1.f3316b = r2
            return
        L68:
            java.lang.String r0 = "请求key与绑定平台不符"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L75
            r2 = 1009(0x3f1, float:1.414E-42)
            r1.f3316b = r2
            return
        L75:
            java.lang.String r0 = "IP访问超限"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L82
            r2 = 1010(0x3f2, float:1.415E-42)
            r1.f3316b = r2
            return
        L82:
            java.lang.String r0 = "服务不支持https请求"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L8f
            r2 = 1011(0x3f3, float:1.417E-42)
            r1.f3316b = r2
            return
        L8f:
            java.lang.String r0 = "权限不足，服务请求被拒绝"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L9c
            r2 = 1012(0x3f4, float:1.418E-42)
            r1.f3316b = r2
            return
        L9c:
            java.lang.String r0 = "开发者删除了key，key被删除后无法正常使用"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto La9
            r2 = 1013(0x3f5, float:1.42E-42)
            r1.f3316b = r2
            return
        La9:
            java.lang.String r0 = "请求服务响应错误"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Lb6
            r2 = 1100(0x44c, float:1.541E-42)
            r1.f3316b = r2
            return
        Lb6:
            java.lang.String r0 = "引擎返回数据异常"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Lc3
            r2 = 1101(0x44d, float:1.543E-42)
            r1.f3316b = r2
            return
        Lc3:
            java.lang.String r0 = "服务端请求链接超时"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Ld0
            r2 = 1102(0x44e, float:1.544E-42)
            r1.f3316b = r2
            return
        Ld0:
            java.lang.String r0 = "读取服务结果超时"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Ldd
            r2 = 1103(0x44f, float:1.546E-42)
            r1.f3316b = r2
            return
        Ldd:
            java.lang.String r0 = "请求参数非法"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Lea
            r2 = 1200(0x4b0, float:1.682E-42)
            r1.f3316b = r2
            return
        Lea:
            java.lang.String r0 = "缺少必填参数"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Lf7
            r2 = 1201(0x4b1, float:1.683E-42)
            r1.f3316b = r2
            return
        Lf7:
            java.lang.String r0 = "请求协议非法"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L104
            r2 = 1202(0x4b2, float:1.684E-42)
            r1.f3316b = r2
            return
        L104:
            java.lang.String r0 = "其他未知错误"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L111
            r2 = 1203(0x4b3, float:1.686E-42)
            r1.f3316b = r2
            return
        L111:
            java.lang.String r0 = "协议解析错误 - ProtocolException"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L11e
            r2 = 1801(0x709, float:2.524E-42)
            r1.f3316b = r2
            return
        L11e:
            java.lang.String r0 = "socket 连接超时 - SocketTimeoutException"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L12b
            r2 = 1802(0x70a, float:2.525E-42)
            r1.f3316b = r2
            return
        L12b:
            java.lang.String r0 = "url异常 - MalformedURLException"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L138
            r2 = 1803(0x70b, float:2.527E-42)
            r1.f3316b = r2
            return
        L138:
            java.lang.String r0 = "未知主机 - UnKnowHostException"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L145
            r2 = 1804(0x70c, float:2.528E-42)
            r1.f3316b = r2
            return
        L145:
            java.lang.String r0 = "未知错误"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L152
            r2 = 1900(0x76c, float:2.662E-42)
            r1.f3316b = r2
            return
        L152:
            java.lang.String r0 = "无效的参数 - IllegalArgumentException"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L15f
            r2 = 1901(0x76d, float:2.664E-42)
            r1.f3316b = r2
            return
        L15f:
            java.lang.String r0 = "http或socket连接失败 - ConnectionException"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L16c
            r2 = 1806(0x70e, float:2.531E-42)
            r1.f3316b = r2
            return
        L16c:
            java.lang.String r0 = "IO 操作异常 - IOException"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L179
            r2 = 1902(0x76e, float:2.665E-42)
            r1.f3316b = r2
            return
        L179:
            java.lang.String r0 = "空指针异常 - NullPointException"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L186
            r2 = 1903(0x76f, float:2.667E-42)
            r1.f3316b = r2
            return
        L186:
            r2 = 1800(0x708, float:2.522E-42)
            r1.f3316b = r2
            return
    }

    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }
}
