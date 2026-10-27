package com.amap.api.services.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class AMapException extends java.lang.Exception {
    public static final java.lang.String AMAP_ACCESS_TOO_FREQUENT = "用户访问过于频繁";
    public static final java.lang.String AMAP_CLIENT_ERRORCODE_MISSSING = "没有对应的错误";
    public static final java.lang.String AMAP_CLIENT_ERRORCODE_MISSSING_TPPE = "AMAP_CLIENT_ERRORCODE_MISSSING";
    public static final java.lang.String AMAP_CLIENT_ERROR_PROTOCOL = "协议解析错误 - ProtocolException";
    public static final java.lang.String AMAP_CLIENT_INVALID_PARAMETER = "无效的参数 - IllegalArgumentException";
    public static final java.lang.String AMAP_CLIENT_IO_EXCEPTION = "IO 操作异常 - IOException";
    public static final java.lang.String AMAP_CLIENT_NEARBY_NULL_RESULT = "NearbyInfo对象为空";
    public static final java.lang.String AMAP_CLIENT_NETWORK_EXCEPTION = "http或socket连接失败 - ConnectionException";
    public static final java.lang.String AMAP_CLIENT_NULLPOINT_EXCEPTION = "空指针异常 - NullPointException";
    public static final java.lang.String AMAP_CLIENT_OVER_KEYWORD_LEN_MAX_COUNT_EXCEPTION = "关键字过长";
    public static final java.lang.String AMAP_CLIENT_OVER_PASSAREA_ITEM_POINT_COUNT_EXCEPTION = "避让区域点个数超限";
    public static final java.lang.String AMAP_CLIENT_OVER_PASSAREA_MAX_AREA_EXCEPTION = "避让区域大小超限";
    public static final java.lang.String AMAP_CLIENT_OVER_PASSAREA_MAX_COUNT_EXCEPTION = "避让区域个数超限";
    public static final java.lang.String AMAP_CLIENT_OVER_PASSBY_MAX_COUNT_EXCEPTION = "途经点个数超限";
    public static final java.lang.String AMAP_CLIENT_SOCKET_TIMEOUT_EXCEPTION = "socket 连接超时 - SocketTimeoutException";
    public static final java.lang.String AMAP_CLIENT_UNKNOWHOST_EXCEPTION = "未知主机 - UnKnowHostException";
    public static final java.lang.String AMAP_CLIENT_UNKNOWN_ERROR = "未知错误";
    public static final java.lang.String AMAP_CLIENT_UNKNOWN_ERROR_TYPE = "CLIENT_UNKNOWN_ERROR";
    public static final java.lang.String AMAP_CLIENT_UPLOADAUTO_STARTED_ERROR = "已开启自动上传";
    public static final java.lang.String AMAP_CLIENT_UPLOAD_LOCATION_ERROR = "Point为空，或与前次上传的相同";
    public static final java.lang.String AMAP_CLIENT_UPLOAD_TOO_FREQUENT = "两次单次上传的间隔低于7秒";
    public static final java.lang.String AMAP_CLIENT_URL_EXCEPTION = "url异常 - MalformedURLException";
    public static final java.lang.String AMAP_CLIENT_USERID_ILLEGAL = "USERID非法";
    public static final java.lang.String AMAP_DAILY_QUERY_OVER_LIMIT = "访问已超出日访问量";
    public static final java.lang.String AMAP_ENGINE_CONNECT_TIMEOUT = "服务端请求链接超时";
    public static final java.lang.String AMAP_ENGINE_RESPONSE_DATA_ERROR = "引擎返回数据异常";
    public static final java.lang.String AMAP_ENGINE_RESPONSE_ERROR = "请求服务响应错误";
    public static final java.lang.String AMAP_ENGINE_RETURN_TIMEOUT = "读取服务结果超时";
    public static final java.lang.String AMAP_ENGINE_TABLEID_NOT_EXIST = "key对应的tableID不存在";
    public static final int AMAP_ERROR_CORE = 1;
    public static final int AMAP_ERROR_LOCAL = 0;
    public static final int AMAP_ERROR_LOCAL_STANDARDIZED = 4;
    public static final int AMAP_ERROR_REST = 2;
    public static final java.lang.String AMAP_ID_NOT_EXIST = "ID不存在";
    public static final java.lang.String AMAP_INSUFFICIENT_PRIVILEGES = "权限不足，服务请求被拒绝";
    public static final java.lang.String AMAP_INVALID_USER_DOMAIN = "用户域名无效";
    public static final java.lang.String AMAP_INVALID_USER_IP = "用户IP无效";
    public static final java.lang.String AMAP_INVALID_USER_KEY = "用户key不正确或过期";
    public static final java.lang.String AMAP_INVALID_USER_SCODE = "用户MD5安全码未通过";
    public static final java.lang.String AMAP_IP_QUERY_OVER_LIMIT = "IP访问超限";
    public static final java.lang.String AMAP_NEARBY_INVALID_USERID = "找不到对应的userid信息,请检查您提供的userid是否存在";
    public static final java.lang.String AMAP_NEARBY_KEY_NOT_BIND = "App key未开通“附近”功能,请注册附近KEY";
    public static final java.lang.String AMAP_NOT_SUPPORT_HTTPS = "服务不支持https请求";
    public static final java.lang.String AMAP_OVER_DIRECTION_RANGE = "起点终点距离过长";
    public static final java.lang.String AMAP_ROUTE_FAIL = "路线计算失败，通常是由于道路连通关系导致";
    public static final java.lang.String AMAP_ROUTE_NO_ROADS_NEARBY = "规划点（起点、终点、途经点）附近搜不到路";
    public static final java.lang.String AMAP_ROUTE_OUT_OF_SERVICE = "规划点（包括起点、终点、途经点）不在中国陆地范围内";
    public static final java.lang.String AMAP_SERVICE_ILLEGAL_REQUEST = "请求协议非法";
    public static final java.lang.String AMAP_SERVICE_INVALID_PARAMS = "请求参数非法";
    public static final java.lang.String AMAP_SERVICE_MAINTENANCE = "服务器维护中";
    public static final java.lang.String AMAP_SERVICE_MISSING_REQUIRED_PARAMS = "缺少必填参数";
    public static final java.lang.String AMAP_SERVICE_NOT_AVAILBALE = "请求服务不存在";
    public static final java.lang.String AMAP_SERVICE_TABLEID_NOT_EXIST = "tableID格式不正确不存在";
    public static final java.lang.String AMAP_SERVICE_UNKNOWN_ERROR = "其他未知错误";
    public static final java.lang.String AMAP_SHARE_FAILURE = "短串请求失败";
    public static final java.lang.String AMAP_SHARE_LICENSE_IS_EXPIRED = "短串分享认证失败";
    public static final java.lang.String AMAP_SHARE_SIGNATURE_FAILURE = "用户签名未通过";
    public static final java.lang.String AMAP_SIGNATURE_ERROR = "用户签名未通过";
    public static final java.lang.String AMAP_USERKEY_PLAT_NOMATCH = "请求key与绑定平台不符";
    public static final java.lang.String AMAP_USER_KEY_RECYCLED = "开发者删除了key，key被删除后无法正常使用";
    public static final int CODE_AMAP_ACCESS_TOO_FREQUENT = 1005;
    public static final int CODE_AMAP_CLIENT_ERRORCODE_MISSSING = 1800;
    public static final int CODE_AMAP_CLIENT_ERROR_PROTOCOL = 1801;
    public static final int CODE_AMAP_CLIENT_INVALID_PARAMETER = 1901;
    public static final int CODE_AMAP_CLIENT_IO_EXCEPTION = 1902;
    public static final int CODE_AMAP_CLIENT_NEARBY_NULL_RESULT = 2202;
    public static final int CODE_AMAP_CLIENT_NETWORK_EXCEPTION = 1806;
    public static final int CODE_AMAP_CLIENT_NULLPOINT_EXCEPTION = 1903;
    public static final int CODE_AMAP_CLIENT_OVER_KEYWORD_LEN_MAX_COUNT_EXCEPTION = 1813;
    public static final int CODE_AMAP_CLIENT_OVER_PASSAREA_ITEM_POINT_COUNT_EXCEPTION = 1812;
    public static final int CODE_AMAP_CLIENT_OVER_PASSAREA_MAX_AREA_EXCEPTION = 1811;
    public static final int CODE_AMAP_CLIENT_OVER_PASSAREA_MAX_COUNT_EXCEPTION = 1810;
    public static final int CODE_AMAP_CLIENT_OVER_PASSBY_MAX_COUNT_EXCEPTION = 1809;
    public static final int CODE_AMAP_CLIENT_SOCKET_TIMEOUT_EXCEPTION = 1802;
    public static final int CODE_AMAP_CLIENT_UNKNOWHOST_EXCEPTION = 1804;
    public static final int CODE_AMAP_CLIENT_UNKNOWN_ERROR = 1900;
    public static final int CODE_AMAP_CLIENT_UPLOADAUTO_STARTED_ERROR = 2200;
    public static final int CODE_AMAP_CLIENT_UPLOAD_LOCATION_ERROR = 2204;
    public static final int CODE_AMAP_CLIENT_UPLOAD_TOO_FREQUENT = 2203;
    public static final int CODE_AMAP_CLIENT_URL_EXCEPTION = 1803;
    public static final int CODE_AMAP_CLIENT_USERID_ILLEGAL = 2201;
    public static final int CODE_AMAP_DAILY_QUERY_OVER_LIMIT = 1004;
    public static final int CODE_AMAP_ENGINE_CONNECT_TIMEOUT = 1102;
    public static final int CODE_AMAP_ENGINE_RESPONSE_DATA_ERROR = 1101;
    public static final int CODE_AMAP_ENGINE_RESPONSE_ERROR = 1100;
    public static final int CODE_AMAP_ENGINE_RETURN_TIMEOUT = 1103;
    public static final int CODE_AMAP_ENGINE_TABLEID_NOT_EXIST = 2003;
    public static final int CODE_AMAP_ID_NOT_EXIST = 2001;
    public static final int CODE_AMAP_INSUFFICIENT_PRIVILEGES = 1012;
    public static final int CODE_AMAP_INVALID_USER_DOMAIN = 1007;
    public static final int CODE_AMAP_INVALID_USER_IP = 1006;
    public static final int CODE_AMAP_INVALID_USER_KEY = 1002;
    public static final int CODE_AMAP_INVALID_USER_SCODE = 1008;
    public static final int CODE_AMAP_IP_QUERY_OVER_LIMIT = 1010;
    public static final int CODE_AMAP_NEARBY_INVALID_USERID = 2100;
    public static final int CODE_AMAP_NEARBY_KEY_NOT_BIND = 2101;
    public static final int CODE_AMAP_NOT_SUPPORT_HTTPS = 1011;
    public static final int CODE_AMAP_OVER_DIRECTION_RANGE = 3003;
    public static final int CODE_AMAP_ROUTE_FAIL = 3002;
    public static final int CODE_AMAP_ROUTE_NO_ROADS_NEARBY = 3001;
    public static final int CODE_AMAP_ROUTE_OUT_OF_SERVICE = 3000;
    public static final int CODE_AMAP_SERVICE_ILLEGAL_REQUEST = 1202;
    public static final int CODE_AMAP_SERVICE_INVALID_PARAMS = 1200;
    public static final int CODE_AMAP_SERVICE_MAINTENANCE = 2002;
    public static final int CODE_AMAP_SERVICE_MISSING_REQUIRED_PARAMS = 1201;
    public static final int CODE_AMAP_SERVICE_NOT_AVAILBALE = 1003;
    public static final int CODE_AMAP_SERVICE_TABLEID_NOT_EXIST = 2000;
    public static final int CODE_AMAP_SERVICE_UNKNOWN_ERROR = 1203;
    public static final int CODE_AMAP_SHARE_FAILURE = 4001;
    public static final int CODE_AMAP_SHARE_LICENSE_IS_EXPIRED = 4000;
    public static final int CODE_AMAP_SHARE_SIGNATURE_FAILURE = 4002;
    public static final int CODE_AMAP_SIGNATURE_ERROR = 1001;
    public static final int CODE_AMAP_SUCCESS = 1000;
    public static final int CODE_AMAP_USERKEY_PLAT_NOMATCH = 1009;
    public static final int CODE_AMAP_USER_KEY_RECYCLED = 1013;
    private int a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f5139b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f5140c;

    /* renamed from: d, reason: collision with root package name */
    private int f5141d;

    public AMapException() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            r0 = 0
            r1.f5139b = r0
            java.lang.String r0 = ""
            r1.f5140c = r0
            r0 = 1000(0x3e8, float:1.401E-42)
            r1.f5141d = r0
            return
    }

    public AMapException(java.lang.String r2) {
            r1 = this;
            r1.<init>(r2)
            r0 = 0
            r1.f5139b = r0
            r0 = 1000(0x3e8, float:1.401E-42)
            r1.f5141d = r0
            r1.f5140c = r2
            r0 = 0
            r1.a = r0
            r1.a(r2)
            return
    }

    public AMapException(java.lang.String r2, int r3, java.lang.String r4) {
            r1 = this;
            r1.<init>(r2)
            r0 = 1000(0x3e8, float:1.401E-42)
            r1.f5141d = r0
            r1.f5140c = r2
            r1.a = r3
            r1.f5139b = r4
            r1.a(r2)
            return
    }

    public AMapException(java.lang.String r1, int r2, java.lang.String r3, int r4) {
            r0 = this;
            r0.<init>(r1)
            r0.f5140c = r1
            r0.a = r2
            r0.f5139b = r3
            r0.f5141d = r4
            return
    }

    private void a(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "用户签名未通过"
            boolean r1 = r0.equals(r3)
            if (r1 == 0) goto Ld
            r3 = 1001(0x3e9, float:1.403E-42)
            r2.f5141d = r3
            return
        Ld:
            java.lang.String r1 = "用户key不正确或过期"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L1a
            r3 = 1002(0x3ea, float:1.404E-42)
            r2.f5141d = r3
            return
        L1a:
            java.lang.String r1 = "请求服务不存在"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L27
            r3 = 1003(0x3eb, float:1.406E-42)
            r2.f5141d = r3
            return
        L27:
            java.lang.String r1 = "访问已超出日访问量"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L34
            r3 = 1004(0x3ec, float:1.407E-42)
            r2.f5141d = r3
            return
        L34:
            java.lang.String r1 = "用户访问过于频繁"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L41
            r3 = 1005(0x3ed, float:1.408E-42)
            r2.f5141d = r3
            return
        L41:
            java.lang.String r1 = "用户IP无效"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L4e
            r3 = 1006(0x3ee, float:1.41E-42)
            r2.f5141d = r3
            return
        L4e:
            java.lang.String r1 = "用户域名无效"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L5b
            r3 = 1007(0x3ef, float:1.411E-42)
            r2.f5141d = r3
            return
        L5b:
            java.lang.String r1 = "用户MD5安全码未通过"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L68
            r3 = 1008(0x3f0, float:1.413E-42)
            r2.f5141d = r3
            return
        L68:
            java.lang.String r1 = "请求key与绑定平台不符"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L75
            r3 = 1009(0x3f1, float:1.414E-42)
            r2.f5141d = r3
            return
        L75:
            java.lang.String r1 = "IP访问超限"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L82
            r3 = 1010(0x3f2, float:1.415E-42)
            r2.f5141d = r3
            return
        L82:
            java.lang.String r1 = "服务不支持https请求"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L8f
            r3 = 1011(0x3f3, float:1.417E-42)
            r2.f5141d = r3
            return
        L8f:
            java.lang.String r1 = "权限不足，服务请求被拒绝"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L9c
            r3 = 1012(0x3f4, float:1.418E-42)
            r2.f5141d = r3
            return
        L9c:
            java.lang.String r1 = "开发者删除了key，key被删除后无法正常使用"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto La9
            r3 = 1013(0x3f5, float:1.42E-42)
            r2.f5141d = r3
            return
        La9:
            java.lang.String r1 = "请求服务响应错误"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Lb6
            r3 = 1100(0x44c, float:1.541E-42)
            r2.f5141d = r3
            return
        Lb6:
            java.lang.String r1 = "引擎返回数据异常"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Lc3
            r3 = 1101(0x44d, float:1.543E-42)
            r2.f5141d = r3
            return
        Lc3:
            java.lang.String r1 = "服务端请求链接超时"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Ld0
            r3 = 1102(0x44e, float:1.544E-42)
            r2.f5141d = r3
            return
        Ld0:
            java.lang.String r1 = "读取服务结果超时"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Ldd
            r3 = 1103(0x44f, float:1.546E-42)
            r2.f5141d = r3
            return
        Ldd:
            java.lang.String r1 = "请求参数非法"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Lea
            r3 = 1200(0x4b0, float:1.682E-42)
            r2.f5141d = r3
            return
        Lea:
            java.lang.String r1 = "缺少必填参数"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Lf7
            r3 = 1201(0x4b1, float:1.683E-42)
            r2.f5141d = r3
            return
        Lf7:
            java.lang.String r1 = "请求协议非法"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L104
            r3 = 1202(0x4b2, float:1.684E-42)
            r2.f5141d = r3
            return
        L104:
            java.lang.String r1 = "其他未知错误"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L111
            r3 = 1203(0x4b3, float:1.686E-42)
            r2.f5141d = r3
            return
        L111:
            java.lang.String r1 = "协议解析错误 - ProtocolException"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L11e
            r3 = 1801(0x709, float:2.524E-42)
            r2.f5141d = r3
            return
        L11e:
            java.lang.String r1 = "socket 连接超时 - SocketTimeoutException"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L12b
            r3 = 1802(0x70a, float:2.525E-42)
            r2.f5141d = r3
            return
        L12b:
            java.lang.String r1 = "url异常 - MalformedURLException"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L138
            r3 = 1803(0x70b, float:2.527E-42)
            r2.f5141d = r3
            return
        L138:
            java.lang.String r1 = "未知主机 - UnKnowHostException"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L145
            r3 = 1804(0x70c, float:2.528E-42)
            r2.f5141d = r3
            return
        L145:
            java.lang.String r1 = "无效的参数 - IllegalArgumentException"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L152
            r3 = 1901(0x76d, float:2.664E-42)
            r2.f5141d = r3
            return
        L152:
            java.lang.String r1 = "http或socket连接失败 - ConnectionException"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L15f
            r3 = 1806(0x70e, float:2.531E-42)
            r2.f5141d = r3
            return
        L15f:
            java.lang.String r1 = "IO 操作异常 - IOException"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L16c
            r3 = 1902(0x76e, float:2.665E-42)
            r2.f5141d = r3
            return
        L16c:
            java.lang.String r1 = "空指针异常 - NullPointException"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L179
            r3 = 1903(0x76f, float:2.667E-42)
            r2.f5141d = r3
            return
        L179:
            java.lang.String r1 = "tableID格式不正确不存在"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L186
            r3 = 2000(0x7d0, float:2.803E-42)
            r2.f5141d = r3
            return
        L186:
            java.lang.String r1 = "ID不存在"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L193
            r3 = 2001(0x7d1, float:2.804E-42)
            r2.f5141d = r3
            return
        L193:
            java.lang.String r1 = "服务器维护中"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L1a0
            r3 = 2002(0x7d2, float:2.805E-42)
            r2.f5141d = r3
            return
        L1a0:
            java.lang.String r1 = "key对应的tableID不存在"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L1ad
            r3 = 2003(0x7d3, float:2.807E-42)
            r2.f5141d = r3
            return
        L1ad:
            java.lang.String r1 = "找不到对应的userid信息,请检查您提供的userid是否存在"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L1ba
            r3 = 2100(0x834, float:2.943E-42)
            r2.f5141d = r3
            return
        L1ba:
            java.lang.String r1 = "App key未开通“附近”功能,请注册附近KEY"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L1c7
            r3 = 2101(0x835, float:2.944E-42)
            r2.f5141d = r3
            return
        L1c7:
            java.lang.String r1 = "规划点（包括起点、终点、途经点）不在中国陆地范围内"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L1d4
            r3 = 3000(0xbb8, float:4.204E-42)
            r2.f5141d = r3
            return
        L1d4:
            java.lang.String r1 = "规划点（起点、终点、途经点）附近搜不到路"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L1e1
            r3 = 3001(0xbb9, float:4.205E-42)
            r2.f5141d = r3
            return
        L1e1:
            java.lang.String r1 = "路线计算失败，通常是由于道路连通关系导致"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L1ee
            r3 = 3002(0xbba, float:4.207E-42)
            r2.f5141d = r3
            return
        L1ee:
            java.lang.String r1 = "起点终点距离过长"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L1fb
            r3 = 3003(0xbbb, float:4.208E-42)
            r2.f5141d = r3
            return
        L1fb:
            java.lang.String r1 = "已开启自动上传"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L208
            r3 = 2200(0x898, float:3.083E-42)
            r2.f5141d = r3
            return
        L208:
            java.lang.String r1 = "USERID非法"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L215
            r3 = 2201(0x899, float:3.084E-42)
            r2.f5141d = r3
            return
        L215:
            java.lang.String r1 = "NearbyInfo对象为空"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L222
            r3 = 2202(0x89a, float:3.086E-42)
            r2.f5141d = r3
            return
        L222:
            java.lang.String r1 = "两次单次上传的间隔低于7秒"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L22f
            r3 = 2203(0x89b, float:3.087E-42)
            r2.f5141d = r3
            return
        L22f:
            java.lang.String r1 = "Point为空，或与前次上传的相同"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L23c
            r3 = 2204(0x89c, float:3.088E-42)
            r2.f5141d = r3
            return
        L23c:
            java.lang.String r1 = "短串分享认证失败"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L249
            r3 = 4000(0xfa0, float:5.605E-42)
            r2.f5141d = r3
            return
        L249:
            java.lang.String r1 = "短串请求失败"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L256
            r3 = 4001(0xfa1, float:5.607E-42)
            r2.f5141d = r3
            return
        L256:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L261
            r3 = 4002(0xfa2, float:5.608E-42)
            r2.f5141d = r3
            return
        L261:
            java.lang.String r0 = "未知错误"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L272
            r3 = 1900(0x76c, float:2.662E-42)
            r2.f5141d = r3
            java.lang.String r3 = "CLIENT_UNKNOWN_ERROR"
            r2.f5139b = r3
            return
        L272:
            java.lang.String r0 = "避让区域点个数超限"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L27f
            r3 = 1812(0x714, float:2.539E-42)
            r2.f5141d = r3
            return
        L27f:
            java.lang.String r0 = "关键字过长"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L28c
            r3 = 1813(0x715, float:2.54E-42)
            r2.f5141d = r3
            return
        L28c:
            java.lang.String r0 = "避让区域大小超限"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L299
            r3 = 1811(0x713, float:2.538E-42)
            r2.f5141d = r3
            return
        L299:
            java.lang.String r0 = "避让区域个数超限"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L2a6
            r3 = 1810(0x712, float:2.536E-42)
            r2.f5141d = r3
            return
        L2a6:
            java.lang.String r0 = "途经点个数超限"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L2b3
            r3 = 1809(0x711, float:2.535E-42)
            r2.f5141d = r3
            return
        L2b3:
            r3 = 1800(0x708, float:2.522E-42)
            r2.f5141d = r3
            java.lang.String r3 = "AMAP_CLIENT_ERRORCODE_MISSSING"
            r2.f5139b = r3
            return
    }

    public int getErrorCode() {
            r1 = this;
            int r0 = r1.f5141d
            return r0
    }

    public int getErrorLevel() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    public java.lang.String getErrorMessage() {
            r1 = this;
            java.lang.String r0 = r1.f5140c
            return r0
    }

    public java.lang.String getErrorType() {
            r1 = this;
            java.lang.String r0 = r1.f5139b
            return r0
    }
}
