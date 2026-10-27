package com.amap.api.maps;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class AMapException extends java.lang.Exception {
    public static final java.lang.String AMAP_NOT_SUPPORT = "移动设备上未安装高德地图或高德地图版本较旧";
    public static final java.lang.String ERROR_CONNECTION = "http连接失败 - ConnectionException";
    public static final java.lang.String ERROR_FAILURE_AUTH = "key鉴权失败";
    public static final java.lang.String ERROR_FAILURE_OVERSEA_AUTH = "海外鉴权失败";
    public static final java.lang.String ERROR_ILLEGAL_VALUE = "非法坐标值";
    public static final java.lang.String ERROR_INVALID_PARAMETER = "无效的参数 - IllegalArgumentException";
    public static final java.lang.String ERROR_IO = "IO 操作异常 - IOException";
    public static final java.lang.String ERROR_NOT_AVAILABLE = "不可写入异常";
    public static final java.lang.String ERROR_NOT_ENOUGH_SPACE = "空间不足";
    public static final java.lang.String ERROR_NULL_PARAMETER = "空指针异常 - NullPointException";
    public static final java.lang.String ERROR_PROTOCOL = "协议解析错误 - ProtocolException";
    public static final java.lang.String ERROR_SOCKET = "socket 连接异常 - SocketException";
    public static final java.lang.String ERROR_SOCKE_TIME_OUT = "socket 连接超时 - SocketTimeoutException";
    public static final java.lang.String ERROR_UNKNOWN = "未知的错误";
    public static final java.lang.String ERROR_UNKNOW_HOST = "未知主机 - UnKnowHostException";
    public static final java.lang.String ERROR_UNKNOW_SERVICE = "服务器连接失败 - UnknownServiceException";
    public static final java.lang.String ERROR_URL = "url异常 - MalformedURLException";
    public static final java.lang.String FEATURE_GLTF_NOT_SUPPORT = "GLTF功能不支持";
    public static final java.lang.String FEATURE_MVT_NOT_SUPPORT = "MVT功能不支持";
    public static final java.lang.String FEATURE_TERRAIN_NOT_SUPPORT = "地形图功能为计费能力，请联系商务进行功能开通。";
    public static final java.lang.String ILLEGAL_AMAP_ARGUMENT = "非法参数";
    private static final long serialVersionUID = 5204097757158979179L;
    private java.lang.String errorMessage;

    public AMapException() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "未知的错误"
            r1.errorMessage = r0
            return
    }

    public AMapException(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            r0.errorMessage = r1
            return
    }

    public java.lang.String getErrorMessage() {
            r1 = this;
            java.lang.String r0 = r1.errorMessage
            return r0
    }
}
