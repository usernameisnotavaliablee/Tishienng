package com.umeng.socialize.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class UmengText {
    public static java.lang.String FULL = "完整版";
    public static java.lang.String MAN = "男";
    public static java.lang.String SIMPLE = "精简版";
    public static java.lang.String SOLVE = "解决方案--";
    public static java.lang.String WOMAN = "女";

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class AUTH {
        public static java.lang.String ALL_AUTH_EVERY = "我想每次获取用户资料都授权怎么办？";
        public static java.lang.String ALL_AUTH_TWICE = "为什么我每次获取用户资料都跳转两次授权界面？";
        public static java.lang.String AUTH_DENIED = "[SA10001]权限验证失败，请检查你的签名以及该平台Appkey权限.";
        public static java.lang.String DATA_EMPTY = "[SA10003]返回数据为空";
        public static java.lang.String GET_FAIL_BY_EMPTY = "[SA10002]获取用户资料为空，uid为空或token为空";
        public static java.lang.String NOT_SUPPORT_PLATFROM = "[SA10000]平台不支持授权,无法完成操作";

        static {
                return
        }

        public AUTH() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class CACHE {
        public static java.lang.String CACHEFILE = null;
        public static java.lang.String CLOSE = null;
        public static java.lang.String MSANDCACHE_FOUNT = null;
        public static java.lang.String SD_NOT_FOUNT = null;
        private static java.lang.String id = "[SCC10000]";

        static {
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = com.umeng.socialize.utils.UmengText.CACHE.id
                r0.append(r1)
                java.lang.String r1 = "缓存文件错误，请勿担心，不影响正常使用"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.umeng.socialize.utils.UmengText.CACHE.CACHEFILE = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = com.umeng.socialize.utils.UmengText.CACHE.id
                r0.append(r1)
                java.lang.String r1 = "关闭流异常"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.umeng.socialize.utils.UmengText.CACHE.CLOSE = r0
                java.lang.String r0 = "[SCC10001]没有找到存储设备，存储图片"
                com.umeng.socialize.utils.UmengText.CACHE.SD_NOT_FOUNT = r0
                java.lang.String r0 = "[SCC10002]mSandCache 找不到"
                com.umeng.socialize.utils.UmengText.CACHE.MSANDCACHE_FOUNT = r0
                return
        }

        public CACHE() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class CHECK {
        public static java.lang.String ACTIVITYNULL = "[SCH10001]传入Activity为空";
        public static java.lang.String ALIPAYERROR = "[SCH10006]没有配置支付宝回调activity或配置不正确";
        public static java.lang.String ALIPAYSUCCESS = "支付宝配置正确";
        public static java.lang.String ALL_NO_ONACTIVITY = "[SCH10000]您的activity中没有重写onActivityResult方法";
        public static java.lang.String APPKEY_NOT_FOUND = "[SCH10003]请配置您的友盟Appkey";
        public static java.lang.String DEPENDENT_COMMON_NOT_MATCH = "分享SDK 7.1.x必须配合友盟基础组件库(v9.2.x版本或更高版本)使用!";
        public static java.lang.String LISTENRNULL = "[SCH10005]监听器为空";
        public static java.lang.String NOINT = "你的初始化未完成，请在Application的onCreate中调用 UMConfigure.init(this,appkey,channel,UMConfigure.DEVICE_TYPE_PHONE,\"\");/";
        public static java.lang.String NO_SUPPORT_AUTH = "[SCH10004]该平台不支持查询是否授权";
        public static java.lang.String NO_SUPPORT_INSTALL = "[SCH10004]该平台不支持查询安装";
        public static java.lang.String NO_SUPPORT_SDKL = "[SCH10004]该平台不支持查询sdk支持";
        public static java.lang.String ROUTERNULL = "[SCH10002]Router为空请检查是否程序被杀死，或释放了我们所有的引用";
        public static java.lang.String SDKVERSION = "您使用的SDK版本为：";
        public static java.lang.String SHARE_CONTENT_IS_EMPTY = "分享对象不能为空!";

        static {
                return
        }

        public CHECK() {
                r0 = this;
                r0.<init>()
                return
        }

        public static java.lang.String checkSuccess(java.lang.String r2, java.lang.String r3) {
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "[SC20008]您本次打包的签名:"
                r0.append(r1)
                r0.append(r2)
                java.lang.String r2 = "\n包名:"
                r0.append(r2)
                r0.append(r3)
                java.lang.String r2 = r0.toString()
                return r2
        }

        public static java.lang.String getActivityResult(int r2, int r3) {
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "onActivityResult ="
                r0.append(r1)
                r0.append(r2)
                java.lang.String r2 = "  resultCode="
                r0.append(r2)
                r0.append(r3)
                java.lang.String r2 = r0.toString()
                return r2
        }

        public static java.lang.String noJar(com.umeng.socialize.bean.SHARE_MEDIA r2) {
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "[SC10006]您没有配置 "
                r0.append(r1)
                r0.append(r2)
                java.lang.String r2 = " 的jar包"
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                return r2
        }

        public static java.lang.String noKey(com.umeng.socialize.bean.SHARE_MEDIA r2) {
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "您没有配置"
                r0.append(r1)
                java.lang.String r2 = r2.toString()
                r0.append(r2)
                java.lang.String r2 = "的appkey,请在Application中调用PlatformConfig.setxxx进行配置"
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class DING {
        public static java.lang.String Ding_FILE_PROVIDER_ERROR = "钉钉分享初始化缺少FileProvider authorities参数，请检查是否调用PlatformConfig.setDingFileProvider方法设置相关参数。";

        static {
                return
        }

        public DING() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class DROPBOX {
        public static java.lang.String NEEDACTIVITY = "[SDB10001]dropbox请传入Activity";

        static {
                return
        }

        public DROPBOX() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class FACEBOOK {
        public static java.lang.String ERRORMETA = "[SF10000]没有找到facebook_app_id，facebook的id必须写在string文件中且名字必须用facebook_app_id";
        public static java.lang.String FACEBOOK_AUTH_FAIL = "为什么facebook分享失败？";
        public static java.lang.String FACEBOOK_CANCEL_SUCCESS = "为什么facebook分享取消却回调成功？";
        public static java.lang.String FACEBOOK_GRAY = "为什么发布按钮为灰色？";
        public static java.lang.String FACEBOOK_NET_SUPPORT = "facebook网页链接，缩略图必须为网络图片";
        public static java.lang.String NOFACEBOOKACTIVITY = "[SF10000]您没有在AndroidManifest.xml中配置com.umeng.facebook.FacebookActivity";
        public static java.lang.String NOFACEBOOKCONTENTPROVIDER = "[SF10000]您没有在AndroidManifest.xml中配置com.umeng.facebook.FacebookContentProvider";
        public static java.lang.String NOMETA = "[SF10000]您没有在AndroidManifest中配置facebook的appid";

        static {
                return
        }

        public FACEBOOK() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class IMAGE {
        public static java.lang.String BINARYTOFILE = null;
        public static java.lang.String BITMAOTOBINARY = null;
        public static java.lang.String CHECK_FORMAT_ERROR = null;
        public static java.lang.String CLOSE = null;
        public static java.lang.String FILE_TO_BINARY_ERROR = null;
        public static java.lang.String GET_FILE_FROM_BINARY = null;
        public static java.lang.String GET_IMAGE_SCALE_ERROR = null;
        public static java.lang.String IMAGEURL = null;
        public static java.lang.String READ_IMAGE_ERROR = null;
        public static java.lang.String SHARECONTENT_IMAGE_ERROR = null;
        public static java.lang.String SHARECONTENT_THUMB_ERROR = null;
        public static java.lang.String THUMB_ERROR = null;
        public static java.lang.String TOOBIG = null;
        public static java.lang.String UNKNOW_UMIMAGE = null;
        private static java.lang.String id = "[SI10000]";

        static {
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = com.umeng.socialize.utils.UmengText.IMAGE.id
                r0.append(r1)
                java.lang.String r1 = "字节流转文件错误"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.umeng.socialize.utils.UmengText.IMAGE.BINARYTOFILE = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = com.umeng.socialize.utils.UmengText.IMAGE.id
                r0.append(r1)
                java.lang.String r1 = "bitmap转字节流错误"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.umeng.socialize.utils.UmengText.IMAGE.BITMAOTOBINARY = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = com.umeng.socialize.utils.UmengText.IMAGE.id
                r0.append(r1)
                java.lang.String r1 = "流关闭错误"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.umeng.socialize.utils.UmengText.IMAGE.CLOSE = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = com.umeng.socialize.utils.UmengText.IMAGE.id
                r0.append(r1)
                java.lang.String r1 = "字节流输出文件出错"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.umeng.socialize.utils.UmengText.IMAGE.GET_FILE_FROM_BINARY = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = com.umeng.socialize.utils.UmengText.IMAGE.id
                r0.append(r1)
                java.lang.String r1 = "加载文件过大"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.umeng.socialize.utils.UmengText.IMAGE.TOOBIG = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = com.umeng.socialize.utils.UmengText.IMAGE.id
                r0.append(r1)
                java.lang.String r1 = "文件转入字节流，先要进行压缩出错"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.umeng.socialize.utils.UmengText.IMAGE.FILE_TO_BINARY_ERROR = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = com.umeng.socialize.utils.UmengText.IMAGE.id
                r0.append(r1)
                java.lang.String r1 = "获取文件大小出错"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.umeng.socialize.utils.UmengText.IMAGE.GET_IMAGE_SCALE_ERROR = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = com.umeng.socialize.utils.UmengText.IMAGE.id
                r0.append(r1)
                java.lang.String r1 = "读取图片文件出错"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.umeng.socialize.utils.UmengText.IMAGE.READ_IMAGE_ERROR = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = com.umeng.socialize.utils.UmengText.IMAGE.id
                r0.append(r1)
                java.lang.String r1 = "checkFormat出错"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.umeng.socialize.utils.UmengText.IMAGE.CHECK_FORMAT_ERROR = r0
                java.lang.String r0 = "[SI10001]您的原始图片太大,导致缩略图压缩过后还大于32KB,请将分享到微信的图片进行适当缩小."
                com.umeng.socialize.utils.UmengText.IMAGE.THUMB_ERROR = r0
                java.lang.String r0 = "[SI10002]缩略图参数有误，您没有设置缩略图，或者设置的缩略图内容有误，不能被解析"
                com.umeng.socialize.utils.UmengText.IMAGE.SHARECONTENT_THUMB_ERROR = r0
                java.lang.String r0 = "[SI10003]图片参数有误，您没有设置缩略图，或者设置的缩略图内容有误，不能被解析"
                com.umeng.socialize.utils.UmengText.IMAGE.SHARECONTENT_IMAGE_ERROR = r0
                java.lang.String r0 = "图片下载链接:"
                com.umeng.socialize.utils.UmengText.IMAGE.IMAGEURL = r0
                java.lang.String r0 = "[SI10004]不支持的UMImage构建类型，您传入的类型为:"
                com.umeng.socialize.utils.UmengText.IMAGE.UNKNOW_UMIMAGE = r0
                return
        }

        public IMAGE() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class INTER {
        public static java.lang.String CONTEXT_ERROR = "[SIG10002]ContextUtil中context为空，请确保程序初始化完毕，且程序中不要使用ContextUtil.setContext（null）方法";
        public static java.lang.String HANDLERID = "handler id:";
        public static java.lang.String MOREERROR = "[SIG10001]调用系统分享菜单错误，请换个手机测试";
        public static java.lang.String NULLJAR = "[SIG10000]没有加入界面jar,请添加shareview";
        public static java.lang.String PINFO = "分享平台相关信息:";

        static {
                return
        }

        public INTER() {
                r0 = this;
                r0.<init>()
                return
        }

        public static java.lang.String getVersion(java.lang.String r2) {
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "平台("
                r0.append(r1)
                r0.append(r2)
                java.lang.String r2 = "):"
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class NET {
        public static java.lang.String BODYNULL = null;
        public static java.lang.String CLOSE = null;
        public static java.lang.String CREATE = null;
        public static java.lang.String IMAGEDOWN = null;
        public static java.lang.String JSONNULL = null;
        public static java.lang.String JSONRESULT = null;
        public static java.lang.String MACNULL = null;
        public static java.lang.String NET_AGAIN_ERROR = null;
        public static java.lang.String NET_INAVALIBLE = null;
        public static java.lang.String PARSEERROR = null;
        public static java.lang.String POSTJSON = null;
        public static java.lang.String SHARESELFFAIL = null;
        public static java.lang.String SHARESELFOK = null;
        public static java.lang.String TOOL = null;
        private static java.lang.String id = "[SN10000]";

        static {
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = com.umeng.socialize.utils.UmengText.NET.id
                r0.append(r1)
                java.lang.String r1 = "返回字符串不是json，可能是由于服务器不通造成"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.umeng.socialize.utils.UmengText.NET.PARSEERROR = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = com.umeng.socialize.utils.UmengText.NET.id
                r0.append(r1)
                java.lang.String r1 = "工具类内的错误，不影响用户使用"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.umeng.socialize.utils.UmengText.NET.TOOL = r0
                java.lang.String r0 = "[SN10004]图片下载错误,请检查网址"
                com.umeng.socialize.utils.UmengText.NET.IMAGEDOWN = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = com.umeng.socialize.utils.UmengText.NET.id
                r0.append(r1)
                java.lang.String r1 = "关闭流异常"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.umeng.socialize.utils.UmengText.NET.CLOSE = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = com.umeng.socialize.utils.UmengText.NET.id
                r0.append(r1)
                java.lang.String r1 = "构建response出错,不影响用户使用，但需要查明原因"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.umeng.socialize.utils.UmengText.NET.CREATE = r0
                java.lang.String r0 = "[SN10001]重定向问题：url和重定向url相同"
                com.umeng.socialize.utils.UmengText.NET.NET_AGAIN_ERROR = r0
                java.lang.String r0 = "[SN10002]后台返回json为空"
                com.umeng.socialize.utils.UmengText.NET.JSONNULL = r0
                java.lang.String r0 = "[SN10003]由于权限问题，没有获取到mac"
                com.umeng.socialize.utils.UmengText.NET.MACNULL = r0
                java.lang.String r0 = " post json："
                com.umeng.socialize.utils.UmengText.NET.POSTJSON = r0
                java.lang.String r0 = " return json："
                com.umeng.socialize.utils.UmengText.NET.JSONRESULT = r0
                java.lang.String r0 = " sharelog success"
                com.umeng.socialize.utils.UmengText.NET.SHARESELFOK = r0
                java.lang.String r0 = " sharelog fail"
                com.umeng.socialize.utils.UmengText.NET.SHARESELFFAIL = r0
                java.lang.String r0 = "抱歉,您的网络不可用..."
                com.umeng.socialize.utils.UmengText.NET.NET_INAVALIBLE = r0
                java.lang.String r0 = "body is null"
                com.umeng.socialize.utils.UmengText.NET.BODYNULL = r0
                return
        }

        public NET() {
                r0 = this;
                r0.<init>()
                return
        }

        public static java.lang.String assertURL(java.lang.String r2, java.lang.String r3) {
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "urlPath="
                r0.append(r1)
                r0.append(r2)
                java.lang.String r2 = "  SocializeNetUtils url="
                r0.append(r2)
                r0.append(r3)
                java.lang.String r2 = r0.toString()
                return r2
        }

        public static java.lang.String getURLERROR(java.lang.String r2) {
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = com.umeng.socialize.utils.UmengText.NET.id
                r0.append(r1)
                java.lang.String r1 = "baseurl="
                r0.append(r1)
                r0.append(r2)
                java.lang.String r2 = " 该url不正确"
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class QQ {
        public static java.lang.String ERRORCALLBACK = "为什么qq分享成功却回调取消？";
        public static java.lang.String ERRORDATA = "[SQ10011]qq配置不正确，AndroidManifest中AuthActivity的data中要加入自己的qq应用id";
        public static java.lang.String ERRORINFO = "错误信息:";
        public static java.lang.String NOAPPID = "[SQ10000]qq配置不正确，没有检测到qq的id配置";
        public static java.lang.String NOCALLBACK = "为什么我的QQ没有回调？";
        public static java.lang.String NOPERMISSION = "为什么qq分享失败，缺少权限？";
        public static java.lang.String NOREPLY = "为什么qq分享成功却没有收到消息？";
        public static java.lang.String OPENIDANDTOKEN = "[SQ20009]initOpenidAndToken error";
        public static java.lang.String QQ100044 = "为什么qq提示100044?";
        public static java.lang.String QQ_ERROR = "[SQ20007]mTencent信息不正确，请确认appid";
        public static java.lang.String QQ_FILE_PROVIDER_ERROR = "[SQ20010]Tencent初始化缺少FileProvider authorities参数，请检查是否调用PlatformConfig.setQQFileProvider方法设置相关参数。";
        public static java.lang.String QQ_MUSIC = "QQ分享音乐,除了设置播放音乐的url,还可以设置一个跳转的url,可以通过UMusic().setmTargetUrl(xxx)设定";
        public static java.lang.String QQ_PERMISSION = "[SQ10004]QQ图片存储失败，请检查图片或者检查是否有读写权限";
        public static java.lang.String QQ_TENCENT_ERROR = "[SQ20007]Tencent变量初始化失败，请检查你的app id跟AndroidManifest.xml文件中AuthActivity的scheme是否填写正确";
        public static java.lang.String TENCENTFAIL = "为什么qq tencent初始化失败？";

        static {
                return
        }

        public QQ() {
                r0 = this;
                r0.<init>()
                return
        }

        public static java.lang.String getError(java.lang.String r2) {
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "[SQ10011]没有在AndroidManifest.xml中检测到"
                r0.append(r1)
                r0.append(r2)
                java.lang.String r1 = "请添加"
                r0.append(r1)
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class SHARE {
        public static java.lang.String CONTEXT_EMPTY = "请输入内容....";
        public static java.lang.String CONTEXT_LONG = "超出最大字数限制....";
        public static java.lang.String EMPTY_TEXT = "[SST10004]分享的文本不能为空";
        public static java.lang.String EMPTY_WEB_URL = "[SST10003]您分享的是网页类型但是网址为空";
        public static java.lang.String ERRORTYPE = "[SST10000]不支持的分享类型";
        public static java.lang.String FILENAME = "文件名:";
        public static java.lang.String FLICKER_WARN = "Flickr只支持图片分享";
        public static java.lang.String FOURSQUARE_WARN = "Foursquare只支持纯图片分享";
        public static java.lang.String INFO = "以下为分享的内容:";
        public static java.lang.String LOCALIMAGE = "本地图片:";
        public static java.lang.String LOCALTHUMB = "本地缩略图:";
        public static java.lang.String LONG_TEXT = "[SST10005]分享的文本过长";
        public static java.lang.String LONG_URL = "[SST10006]分享的链接过长";
        public static java.lang.String MUSICDES = "音乐描述:";
        public static java.lang.String MUSICTITLE = "音乐标题:";
        public static java.lang.String MUSICURL = "音乐链接:";
        public static java.lang.String SHAREPLAT = "分享平台:";
        public static java.lang.String SHARESTYLE = "分享类型:";
        public static java.lang.String SHARETEXT = "分享文本:";
        public static java.lang.String SHAREVIEWV = "shareview版本号:";
        public static java.lang.String SHARE_CONTENT_FAIL = "[SST10002]当前分享类型内容有误，缺少设置参数或内容不合规，请查看友盟log";
        public static java.lang.String SHARE_STYLE = "分享类型--";
        public static java.lang.String SHARE_TO = "分享到";
        public static java.lang.String URLDES = "url描述:";
        public static java.lang.String URLIMAGE = "图片链接:";
        public static java.lang.String URLTHUMB = "缩略图链接:";
        public static java.lang.String URLTITLE = "url标题:";
        public static java.lang.String URLURL = "链接:";
        public static java.lang.String VERSION = "API版本号:";
        public static java.lang.String VERSION_NOT_SUPPORT = "[SST10001]分享内容有误，请查看log或当前使用的客户端版本不支持分享或授权";
        public static java.lang.String VIDEODES = "视频描述:";
        public static java.lang.String VIDEOTITLE = "视频标题:";
        public static java.lang.String VIDEOURL = "视频链接:";
        public static java.lang.String WEB_HTTP = "[SST10007]分享的链接需要以http开头";
        public static java.lang.String YNOTE_WARN = "有道云笔记只支持文本，图片，图文分享";

        static {
                return
        }

        public SHARE() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class SHAREBOARD {
        public static java.lang.String NULLJAR = "[SSB10001]您的工程需要依赖v4或我们提供umeng_shareboard_widget包，请参考线上文档";
        public static java.lang.String NULLNAME = "[SSB10000]获取平台名字为空，请检查代码";

        static {
                return
        }

        public SHAREBOARD() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class SINA {
        public static java.lang.String SINASTARTERROR = "[SS10008]启动新浪客户端错误";
        public static java.lang.String SINA_AID_ERROR = "[SS10009]新浪AID获取失败";
        public static java.lang.String SINA_FILE_PROVIDER_ERROR = "[SS10014]新浪微博分享初始化缺少FileProvider authorities参数，请检查是否调用PlatformConfig.setSinaFileProvider方法设置相关参数。";
        public static java.lang.String SINA_GET_ERROR = "[SS10011]返回结果为空，请检查网络，或token是否过期,请检查Appkey是否审核通过";
        public static java.lang.String SINA_MUL_IMAGE = "新浪多图分享必须加文字";
        public static java.lang.String SINA_SIGN_ERROR = "[SS10001]新浪签名或回调地址错误，请去后台检查";
        public static java.lang.String SINA_THUMB_ERROR = "[SS10007]新浪多媒体分享，需要添加缩略图，请检查是否添加正确";
        public static java.lang.String SINA_UPLOAD_ERROR = "[SS10012]新浪上传图片失败";

        static {
                return
        }

        public SINA() {
                r0 = this;
                r0.<init>()
                return
        }

        public static java.lang.String getError(java.lang.String r2) {
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "[SS10010]没有在AndroidManifest.xml中检测到"
                r0.append(r1)
                r0.append(r2)
                java.lang.String r1 = "请添加"
                r0.append(r1)
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class TWITTER {
        public static java.lang.String TWITTER_AUTH_FAIL = "为什么提示我们无法验证您的凭据？";
        public static java.lang.String TWITTER_NULL_SESSION = "当前无活动会话，请确保已经完成授权申请。";

        static {
                return
        }

        public TWITTER() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class WX {
        public static java.lang.String WEIXIN_FILE_PROVIDER_ERROR = "[SX10003]微信分享初始化缺少FileProvider authorities参数，请检查是否调用PlatformConfig.setWXFileProvider方法设置相关参数。";
        public static java.lang.String WX_40125 = "为什么微信提示40125/invalid APPsecret？";
        public static java.lang.String WX_CIRCLE_NOCONTENT = "为什么微信朋友圈链接不显示描述文字？";
        public static java.lang.String WX_CIRCLE_NOT_SUPPORT_EMOJ = "微信朋友圈不支持表情分享...";
        public static java.lang.String WX_CIRCLE_NOT_SUPPORT_MIN = "微信朋友圈不支持小程序分享...";
        public static java.lang.String WX_ERRORACTIVITY = "[SX10001]请让您的WXEntryActivity继承com.umeng.socialize.weixin.view.WXCallbackActivity";
        public static java.lang.String WX_ERRORMANIFEST = "[SX10002]请在AndroidManifest文件中配置WXEntryActivity";
        public static java.lang.String WX_ERROR_SIGN = "为什么微信授权一直等待不能成功？";
        public static java.lang.String WX_HIT_PUSH = "为什么微信分享提示hit push hold？";
        public static java.lang.String WX_NOACTIVITY = "[SX10000]您没有配置WXEntryActivity或没有配置不正确";
        public static java.lang.String WX_NOTHUMB_EMOJ = "微信表情分享没有设置缩略图";
        public static java.lang.String WX_NO_CALLBACK = "为什么微信没有回调？";
        public static java.lang.String WX_NO_LINK = "为什么微信登陆提示该链接无法访问？";

        static {
                return
        }

        public WX() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class WXWORK {
        public static java.lang.String WXWORK_FILE_PROVIDER_ERROR = "[SWW10000]企业微信分享初始化缺少FileProvider authorities参数，请检查是否调用PlatformConfig.setWXWorkFileProvider方法设置相关参数。";

        static {
                return
        }

        public WXWORK() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            return
    }

    public UmengText() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String errorWithUrl(java.lang.String r1, java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "\n解决方案："
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static java.lang.String netMethodError(java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "验证请求方式失败["
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = "]"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static java.lang.String resError(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "缺少资源文件:packageName="
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = "\n type="
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = "\n name="
            r0.append(r2)
            r0.append(r4)
            java.lang.String r2 = "请去sdk下载包中拷贝"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static java.lang.String supportStyle(boolean r2, java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "该平台"
            r0.<init>(r1)
            if (r2 == 0) goto Lc
            java.lang.String r2 = "只"
            goto Le
        Lc:
            java.lang.String r2 = "不"
        Le:
            r0.append(r2)
            java.lang.String r2 = "支持"
            r0.append(r2)
            java.lang.String r2 = "image"
            boolean r2 = r3.contains(r2)
            if (r2 == 0) goto L23
            java.lang.String r2 = "图片"
            r0.append(r2)
        L23:
            java.lang.String r2 = "netimg"
            boolean r2 = r3.contains(r2)
            if (r2 == 0) goto L30
            java.lang.String r2 = "网络图片"
            r0.append(r2)
        L30:
            java.lang.String r2 = "localimg"
            boolean r2 = r3.contains(r2)
            if (r2 == 0) goto L3d
            java.lang.String r2 = "本地图片"
            r0.append(r2)
        L3d:
            java.lang.String r2 = "url"
            boolean r2 = r3.contains(r2)
            if (r2 == 0) goto L4a
            java.lang.String r2 = "链接"
            r0.append(r2)
        L4a:
            java.lang.String r2 = "video"
            boolean r2 = r3.contains(r2)
            if (r2 == 0) goto L57
            java.lang.String r2 = "视频"
            r0.append(r2)
        L57:
            java.lang.String r2 = "timg"
            boolean r2 = r3.contains(r2)
            if (r2 == 0) goto L64
            java.lang.String r2 = "图文"
            r0.append(r2)
        L64:
            java.lang.String r2 = "text"
            boolean r2 = r3.contains(r2)
            if (r2 == 0) goto L71
            java.lang.String r2 = "纯文本"
            r0.append(r2)
        L71:
            java.lang.String r2 = "分享"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static java.lang.String tencentEmpty(boolean r2) {
            if (r2 == 0) goto L5
            java.lang.String r2 = com.umeng.socialize.utils.UmengText.SIMPLE
            goto L7
        L5:
            java.lang.String r2 = com.umeng.socialize.utils.UmengText.FULL
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "您使用的是"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = "但是你的AndroidManifest配置不正确，或者配置的不是"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = "的路径，请参照线上报错必看文档"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static java.lang.String urlEmpty(int r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "错误:设置视频"
            r0.<init>(r1)
            if (r2 != 0) goto Le
            java.lang.String r1 = "视频"
            r0.append(r1)
        Le:
            r1 = 1
            if (r2 != r1) goto L16
            java.lang.String r1 = "音乐"
            r0.append(r1)
        L16:
            r1 = 2
            if (r2 != r1) goto L1e
            java.lang.String r2 = "网页"
            r0.append(r2)
        L1e:
            java.lang.String r2 = "分享类型，链接不能为空"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
