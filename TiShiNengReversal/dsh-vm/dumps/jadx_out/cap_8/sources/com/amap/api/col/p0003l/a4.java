package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class a4 {
    private static java.lang.String[] a;

    static {
            java.lang.String r0 = "com.amap.api.trace"
            java.lang.String r1 = "com.amap.api.trace.core"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            com.amap.api.col.p0003l.a4.a = r0
            return
    }

    public a4() {
            r1 = this;
            r1.<init>()
            return
    }

    public static int a(java.util.List<com.amap.api.maps.model.LatLng> r4) {
            r0 = 0
            if (r4 == 0) goto L2f
            int r1 = r4.size()
            if (r1 != 0) goto La
            goto L2f
        La:
            r1 = 0
        Lb:
            int r2 = r4.size()
            int r2 = r2 + (-1)
            if (r0 >= r2) goto L2e
            java.lang.Object r2 = r4.get(r0)
            com.amap.api.maps.model.LatLng r2 = (com.amap.api.maps.model.LatLng) r2
            int r0 = r0 + 1
            java.lang.Object r3 = r4.get(r0)
            com.amap.api.maps.model.LatLng r3 = (com.amap.api.maps.model.LatLng) r3
            if (r2 == 0) goto L2e
            if (r3 != 0) goto L26
            goto L2e
        L26:
            float r1 = (float) r1
            float r2 = com.amap.api.maps.AMapUtils.calculateLineDistance(r2, r3)
            float r1 = r1 + r2
            int r1 = (int) r1
            goto Lb
        L2e:
            return r1
        L2f:
            return r0
    }

    private static void b(int r0, java.lang.String r1) throws com.amap.api.col.p0003l.fc {
            if (r0 == 0) goto Lb9
            switch(r0) {
                case 10000: goto Lb9;
                case 10001: goto Lb1;
                case 10002: goto La9;
                case 10003: goto La1;
                case 10004: goto L99;
                case 10005: goto L91;
                case 10006: goto L89;
                case 10007: goto L81;
                case 10008: goto L79;
                case 10009: goto L71;
                case 10010: goto L69;
                case 10011: goto L61;
                case 10012: goto L59;
                case 10013: goto L51;
                default: goto L5;
            }
        L5:
            switch(r0) {
                case 20000: goto L49;
                case 20001: goto L41;
                case 20002: goto L39;
                case 20003: goto L31;
                default: goto L8;
            }
        L8:
            switch(r0) {
                case 30000: goto L29;
                case 30001: goto L21;
                case 30002: goto L19;
                case 30003: goto L11;
                default: goto Lb;
            }
        Lb:
            com.amap.api.col.3l.fc r0 = new com.amap.api.col.3l.fc
            r0.<init>(r1)
            throw r0
        L11:
            com.amap.api.col.3l.fc r0 = new com.amap.api.col.3l.fc
            java.lang.String r1 = "读取服务结果超时"
            r0.<init>(r1)
            throw r0
        L19:
            com.amap.api.col.3l.fc r0 = new com.amap.api.col.3l.fc
            java.lang.String r1 = "服务端请求链接超时"
            r0.<init>(r1)
            throw r0
        L21:
            com.amap.api.col.3l.fc r0 = new com.amap.api.col.3l.fc
            java.lang.String r1 = "引擎返回数据异常"
            r0.<init>(r1)
            throw r0
        L29:
            com.amap.api.col.3l.fc r0 = new com.amap.api.col.3l.fc
            java.lang.String r1 = "请求服务响应错误"
            r0.<init>(r1)
            throw r0
        L31:
            com.amap.api.col.3l.fc r0 = new com.amap.api.col.3l.fc
            java.lang.String r1 = "其他未知错误"
            r0.<init>(r1)
            throw r0
        L39:
            com.amap.api.col.3l.fc r0 = new com.amap.api.col.3l.fc
            java.lang.String r1 = "请求协议非法"
            r0.<init>(r1)
            throw r0
        L41:
            com.amap.api.col.3l.fc r0 = new com.amap.api.col.3l.fc
            java.lang.String r1 = "缺少必填参数"
            r0.<init>(r1)
            throw r0
        L49:
            com.amap.api.col.3l.fc r0 = new com.amap.api.col.3l.fc
            java.lang.String r1 = "请求参数非法"
            r0.<init>(r1)
            throw r0
        L51:
            com.amap.api.col.3l.fc r0 = new com.amap.api.col.3l.fc
            java.lang.String r1 = "开发者删除了key，key被删除后无法正常使用"
            r0.<init>(r1)
            throw r0
        L59:
            com.amap.api.col.3l.fc r0 = new com.amap.api.col.3l.fc
            java.lang.String r1 = "权限不足，服务请求被拒绝"
            r0.<init>(r1)
            throw r0
        L61:
            com.amap.api.col.3l.fc r0 = new com.amap.api.col.3l.fc
            java.lang.String r1 = "服务不支持https请求"
            r0.<init>(r1)
            throw r0
        L69:
            com.amap.api.col.3l.fc r0 = new com.amap.api.col.3l.fc
            java.lang.String r1 = "IP访问超限"
            r0.<init>(r1)
            throw r0
        L71:
            com.amap.api.col.3l.fc r0 = new com.amap.api.col.3l.fc
            java.lang.String r1 = "请求key与绑定平台不符"
            r0.<init>(r1)
            throw r0
        L79:
            com.amap.api.col.3l.fc r0 = new com.amap.api.col.3l.fc
            java.lang.String r1 = "用户MD5安全码未通过"
            r0.<init>(r1)
            throw r0
        L81:
            com.amap.api.col.3l.fc r0 = new com.amap.api.col.3l.fc
            java.lang.String r1 = "用户签名未通过"
            r0.<init>(r1)
            throw r0
        L89:
            com.amap.api.col.3l.fc r0 = new com.amap.api.col.3l.fc
            java.lang.String r1 = "用户域名无效"
            r0.<init>(r1)
            throw r0
        L91:
            com.amap.api.col.3l.fc r0 = new com.amap.api.col.3l.fc
            java.lang.String r1 = "用户IP无效"
            r0.<init>(r1)
            throw r0
        L99:
            com.amap.api.col.3l.fc r0 = new com.amap.api.col.3l.fc
            java.lang.String r1 = "用户访问过于频繁"
            r0.<init>(r1)
            throw r0
        La1:
            com.amap.api.col.3l.fc r0 = new com.amap.api.col.3l.fc
            java.lang.String r1 = "访问已超出日访问量"
            r0.<init>(r1)
            throw r0
        La9:
            com.amap.api.col.3l.fc r0 = new com.amap.api.col.3l.fc
            java.lang.String r1 = "请求服务不存在"
            r0.<init>(r1)
            throw r0
        Lb1:
            com.amap.api.col.3l.fc r0 = new com.amap.api.col.3l.fc
            java.lang.String r1 = "用户key不正确或过期"
            r0.<init>(r1)
            throw r0
        Lb9:
            return
    }

    public static void c(java.lang.String r4) throws com.amap.api.col.p0003l.fc {
            java.lang.String r0 = "infocode"
            java.lang.String r1 = "status"
            java.lang.String r2 = "errcode"
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> L4f
            r3.<init>(r4)     // Catch: org.json.JSONException -> L4f
            boolean r4 = r3.has(r2)     // Catch: org.json.JSONException -> L4f
            if (r4 == 0) goto L1f
            int r4 = r3.getInt(r2)     // Catch: org.json.JSONException -> L4f
            java.lang.String r0 = "errmsg"
            java.lang.String r0 = r3.getString(r0)     // Catch: org.json.JSONException -> L4f
            b(r4, r0)     // Catch: org.json.JSONException -> L4f
            return
        L1f:
            boolean r4 = r3.has(r1)     // Catch: org.json.JSONException -> L4f
            if (r4 == 0) goto L4e
            boolean r4 = r3.has(r0)     // Catch: org.json.JSONException -> L4f
            if (r4 != 0) goto L2c
            goto L4e
        L2c:
            java.lang.String r4 = r3.getString(r1)     // Catch: org.json.JSONException -> L4f
            int r0 = r3.getInt(r0)     // Catch: org.json.JSONException -> L4f
            java.lang.String r1 = "1"
            boolean r1 = r1.equals(r4)     // Catch: org.json.JSONException -> L4f
            if (r1 == 0) goto L3d
            goto L4e
        L3d:
            java.lang.String r1 = "info"
            java.lang.String r1 = r3.getString(r1)     // Catch: org.json.JSONException -> L4f
            java.lang.String r2 = "0"
            boolean r4 = r2.equals(r4)     // Catch: org.json.JSONException -> L4f
            if (r4 == 0) goto L4e
            b(r0, r1)     // Catch: org.json.JSONException -> L4f
        L4e:
            return
        L4f:
            com.amap.api.col.3l.fc r4 = new com.amap.api.col.3l.fc
            java.lang.String r0 = "协议解析错误 - ProtocolException"
            r4.<init>(r0)
            throw r4
    }
}
