package com.bytedance.msdk.api;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j {
    public int cw;
    public int j;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f2149r;
    public java.lang.String xt;

    public j() {
            r2 = this;
            r0 = -99999(0xfffffffffffe7961, float:NaN)
            java.lang.String r1 = "no error message"
            r2.<init>(r0, r1)
            return
    }

    public j(int r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r1, r2, r1, r2)
            return
    }

    public j(int r1, java.lang.String r2, int r3, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.j = r1
            r0.xt = r2
            r0.cw = r3
            r0.f2149r = r4
            return
    }

    public j(java.lang.String r2) {
            r1 = this;
            r0 = -99999(0xfffffffffffe7961, float:NaN)
            r1.<init>(r0, r2)
            return
    }

    public static java.lang.String j(int r1) {
            java.lang.String r0 = "信息流广告暂无广告返回，请稍后重试"
            switch(r1) {
                case -2: goto Ld0;
                case -1: goto Lcd;
                case 1: goto Lca;
                case 10003: goto Lc7;
                case 10012: goto Lc4;
                case 10013: goto Lc1;
                case 10014: goto Lbe;
                case 10015: goto Lbb;
                case 20005: goto Lb8;
                case 40044: goto Lb5;
                case 40045: goto Lb2;
                case 40047: goto Laf;
                case 40048: goto Lac;
                case 40052: goto La9;
                case 40061: goto La6;
                case 40062: goto La3;
                case 40063: goto La0;
                case 40064: goto L9d;
                case 41005: goto L9a;
                case 41007: goto L97;
                case 41008: goto L94;
                case 41041: goto L91;
                case 41042: goto L8e;
                case 41043: goto L8b;
                case 41044: goto L88;
                case 44404: goto L85;
                case 44405: goto L82;
                case 49000: goto L7f;
                case 49001: goto L7c;
                case 49002: goto L79;
                case 49003: goto L76;
                case 49004: goto L73;
                case 49005: goto L70;
                case 49006: goto L6d;
                case 49007: goto L6a;
                case 49008: goto L67;
                case 49009: goto L64;
                case 49010: goto L61;
                case 49012: goto L5e;
                case 49015: goto L5b;
                case 49016: goto L58;
                case 50100: goto L55;
                case 81001: goto L52;
                case 81002: goto L4f;
                case 81003: goto L4c;
                case 81004: goto L49;
                case 81008: goto L46;
                case 81009: goto L43;
                case 81010: goto L40;
                case 81011: goto L3d;
                case 81012: goto L3a;
                case 810085: goto L37;
                case 840026: goto L34;
                case 840027: goto L31;
                case 840028: goto L2e;
                case 840029: goto L2b;
                case 840030: goto L28;
                case 840031: goto L25;
                case 840032: goto L22;
                case 840033: goto L1f;
                case 840034: goto L1c;
                case 840035: goto L1b;
                case 840036: goto L18;
                case 840037: goto L15;
                case 840038: goto L14;
                case 840039: goto L11;
                case 840040: goto Lb2;
                case 840041: goto Le;
                case 840042: goto Lb;
                case 840043: goto L8;
                default: goto L5;
            }
        L5:
            java.lang.String r1 = "unknown error!"
            return r1
        L8:
            java.lang.String r1 = "如占比过高，请延长广告请求发起间隔，稍后重试"
            return r1
        Lb:
            java.lang.String r1 = "展示控制错误码，无需调整，如占比较高可调高瀑布流属性设置中的展示上限及间隔"
            return r1
        Le:
            java.lang.String r1 = "可检查该广告位ID下的【瀑布流属性设置内】-【展示控制设置】-【天级别频控】是否达到上限"
            return r1
        L11:
            java.lang.String r1 = "插全屏广告暂无广告返回，请稍后重试"
            return r1
        L14:
            return r0
        L15:
            java.lang.String r1 = "全屏视频广告暂无广告返回，请稍后重试"
            return r1
        L18:
            java.lang.String r1 = "激励视频广告暂无广告返回，请稍后重试"
            return r1
        L1b:
            return r0
        L1c:
            java.lang.String r1 = "开屏广告暂无广告返回，请稍后重试"
            return r1
        L1f:
            java.lang.String r1 = "插屏广告暂无广告返回，请稍后重试"
            return r1
        L22:
            java.lang.String r1 = "Banner广告暂无广告返回，请稍后重试"
            return r1
        L25:
            java.lang.String r1 = "在ADN后台明确创建的广告类型，需确保与开发者平台设置的匹配"
            return r1
        L28:
            java.lang.String r1 = "Draw广告暂无广告返回，请稍后重试"
            return r1
        L2b:
            java.lang.String r1 = "该广告暂无广告返回，请稍后重试"
            return r1
        L2e:
            java.lang.String r1 = "检查应用ID与初始化的应用ID是否一致"
            return r1
        L31:
            java.lang.String r1 = "请检查开屏广告自定义兜底参数是否正确"
            return r1
        L34:
            java.lang.String r1 = "请检查Adslot是否为null"
            return r1
        L37:
            java.lang.String r1 = "命中请求过于频繁、无返回"
            return r1
        L3a:
            java.lang.String r1 = "ui测试工具config为null"
            return r1
        L3d:
            java.lang.String r1 = "adn本身问题，不支持轮播"
            return r1
        L40:
            java.lang.String r1 = "adn impl changed"
            return r1
        L43:
            java.lang.String r1 = "only customAd"
            return r1
        L46:
            java.lang.String r1 = "no ad"
            return r1
        L49:
            java.lang.String r1 = "CSJ4900已经移除旧插屏接口，但仍然有旧插屏代码位请求，请接入CSJ48xx或更换为新插屏代码位"
            return r1
        L4c:
            java.lang.String r1 = "传入的参数有误或为空，请检查参数"
            return r1
        L4f:
            java.lang.String r1 = "无白名单权限"
            return r1
        L52:
            java.lang.String r1 = "配置正在请求中，稍后重试"
            return r1
        L55:
            java.lang.String r1 = "本次出价低于竞价底价"
            return r1
        L58:
            java.lang.String r1 = "自定义ADN draw 视频播放失败"
            return r1
        L5b:
            java.lang.String r1 = "自定义ADN draw load失败"
            return r1
        L5e:
            java.lang.String r1 = "自定义ADN 信息流 视频播放失败"
            return r1
        L61:
            java.lang.String r1 = "自定义ADN 信息流 load失败"
            return r1
        L64:
            java.lang.String r1 = "自定义ADN 开屏视频 show失败"
            return r1
        L67:
            java.lang.String r1 = "自定义ADN 开屏视频 load失败"
            return r1
        L6a:
            java.lang.String r1 = "自定义ADN 全屏视频 show失败"
            return r1
        L6d:
            java.lang.String r1 = "自定义ADN 全屏视频 load失败"
            return r1
        L70:
            java.lang.String r1 = "自定义ADN 激励视频 show失败"
            return r1
        L73:
            java.lang.String r1 = "自定义ADN 激励视频 load失败"
            return r1
        L76:
            java.lang.String r1 = "自定义ADN 插屏 show失败"
            return r1
        L79:
            java.lang.String r1 = "自定义ADN 插屏 load失败"
            return r1
        L7c:
            java.lang.String r1 = "自定义ADN banner show失败"
            return r1
        L7f:
            java.lang.String r1 = "自定义ADN banner load失败"
            return r1
        L82:
            java.lang.String r1 = "检查网络环境是否正常，更换网络重新发起请求"
            return r1
        L85:
            java.lang.String r1 = "确保网络环境正常后重新发起请求"
            return r1
        L88:
            java.lang.String r1 = "请勿重复调用destroy方法"
            return r1
        L8b:
            java.lang.String r1 = "请检查内存占用情况，如占比较高可提供日志广告ID提工单联系技术支持解决"
            return r1
        L8e:
            java.lang.String r1 = "未超过代码位层级规定的展示间隔，请求频繁，实际未发起请求"
            return r1
        L91:
            java.lang.String r1 = "超过代码位层级规定的用户展示上限，实际未发起请求，请求失败"
            return r1
        L94:
            java.lang.String r1 = "暂无公用缓存池广告"
            return r1
        L97:
            java.lang.String r1 = "暂无公用缓存池访问权限"
            return r1
        L9a:
            java.lang.String r1 = "请检查传入的context是否为null"
            return r1
        L9d:
            java.lang.String r1 = "命中WF级别配置的ADN错误码，进入冷冻期，实际未发起请求"
            return r1
        La0:
            java.lang.String r1 = "非穿山甲给出的展示广告"
            return r1
        La3:
            java.lang.String r1 = "无法解析价格标签，请确认并更新平台配置"
            return r1
        La6:
            java.lang.String r1 = "价格标签为空字符，无多阶底价权限或权限异常"
            return r1
        La9:
            java.lang.String r1 = "若为穿山甲广告可优先检查是否是调整了系统时间导致"
            return r1
        Lac:
            java.lang.String r1 = "已经展示过的广告对象不可重复使用"
            return r1
        Laf:
            java.lang.String r1 = "每次加载广告时需重新创建新的广告对象"
            return r1
        Lb2:
            java.lang.String r1 = "清理客户端缓存并调整广告请求在SDK初始化成功后；首次冷启动拉取不到配置导致，可参考文档解决  https://www.csjplatform.com/supportcenter/5885 "
            return r1
        Lb5:
            java.lang.String r1 = "可调整广告请求发起间隔解决"
            return r1
        Lb8:
            java.lang.String r1 = "全部代码位请求失败"
            return r1
        Lbb:
            java.lang.String r1 = "请先获取token相关信息"
            return r1
        Lbe:
            java.lang.String r1 = "广告位不是内容混出广告位，请查看配置"
            return r1
        Lc1:
            java.lang.String r1 = "Adm数据异常"
            return r1
        Lc4:
            java.lang.String r1 = "Adn超时后回调"
            return r1
        Lc7:
            java.lang.String r1 = "load ad timeout !!!"
            return r1
        Lca:
            java.lang.String r1 = "MSDK还未初始化"
            return r1
        Lcd:
            java.lang.String r1 = "检查是否在子线程调用了广告展示；检查注册点击事件时viewgroup是否传空 "
            return r1
        Ld0:
            java.lang.String r1 = "检查一下网络连接是否正常或者查看是否设置了代理"
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AdError{code="
            r0.<init>(r1)
            int r1 = r3.j
            r0.append(r1)
            java.lang.String r1 = ", message='"
            r0.append(r1)
            java.lang.String r1 = r3.xt
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r2 = ", thirdSdkErrorCode="
            r0.append(r2)
            int r2 = r3.cw
            r0.append(r2)
            java.lang.String r2 = ", thirdSdkErrorMessage='"
            r0.append(r2)
            java.lang.String r2 = r3.f2149r
            r0.append(r2)
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
