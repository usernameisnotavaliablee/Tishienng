package cn.jpush.android.cache;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class Key<T> {
    java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    java.lang.String f1743b;

    /* renamed from: c, reason: collision with root package name */
    T f1744c;

    /* renamed from: d, reason: collision with root package name */
    boolean f1745d;

    /* renamed from: e, reason: collision with root package name */
    boolean f1746e;

    private Key(java.lang.String r1, java.lang.String r2, T r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.f1743b = r2
            if (r3 == 0) goto Lc
            r0.f1744c = r3
            return
        Lc:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "default value can not be null"
            r1.<init>(r2)
            throw r1
    }

    public static cn.jpush.android.cache.Key<java.lang.Boolean> AllowRunningProcess() {
            cn.jpush.android.cache.Key r0 = new cn.jpush.android.cache.Key
            java.lang.String r1 = "AllowRunningProcess"
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            java.lang.String r3 = "cn.jpush.config"
            r0.<init>(r3, r1, r2)
            cn.jpush.android.cache.Key r0 = r0.a()
            return r0
    }

    public static cn.jpush.android.cache.Key<java.lang.Integer> BadgeCurNum() {
            cn.jpush.android.cache.Key r0 = new cn.jpush.android.cache.Key
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "cn.jpush.config"
            java.lang.String r3 = "badgeCurNum"
            r0.<init>(r2, r3, r1)
            cn.jpush.android.cache.Key r0 = r0.a()
            return r0
    }

    public static cn.jpush.android.cache.Key<java.lang.Long> BlackPagesInternalTime() {
            cn.jpush.android.cache.Key r0 = new cn.jpush.android.cache.Key
            r1 = 21600(0x5460, double:1.0672E-319)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "cn.jpush.config"
            java.lang.String r3 = "BInternalTime"
            r0.<init>(r2, r3, r1)
            cn.jpush.android.cache.Key r0 = r0.a()
            return r0
    }

    public static cn.jpush.android.cache.Key<java.lang.Long> BlackPagesLastReqTime() {
            cn.jpush.android.cache.Key r0 = new cn.jpush.android.cache.Key
            r1 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "cn.jpush.config"
            java.lang.String r3 = "BLastReqTime"
            r0.<init>(r2, r3, r1)
            cn.jpush.android.cache.Key r0 = r0.a()
            return r0
    }

    public static cn.jpush.android.cache.Key<java.lang.String> FCM_ClearFlag() {
            cn.jpush.android.cache.Key r0 = new cn.jpush.android.cache.Key
            java.lang.String r1 = "fcm_clear_flag"
            java.lang.String r2 = ""
            java.lang.String r3 = "cn.jpush.config"
            r0.<init>(r3, r1, r2)
            cn.jpush.android.cache.Key r0 = r0.a()
            return r0
    }

    public static cn.jpush.android.cache.Key<java.lang.Boolean> IgnoreLocalAllowRPConfig() {
            cn.jpush.android.cache.Key r0 = new cn.jpush.android.cache.Key
            java.lang.String r1 = "IgnoreLocalAllowRPConfig"
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            java.lang.String r3 = "cn.jpush.config"
            r0.<init>(r3, r1, r2)
            cn.jpush.android.cache.Key r0 = r0.a()
            return r0
    }

    public static cn.jpush.android.cache.Key<java.lang.Integer> IsNotificationEnabledLastTime() {
            cn.jpush.android.cache.Key r0 = new cn.jpush.android.cache.Key
            r1 = -1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "cn.jpush.config"
            java.lang.String r3 = "isNotificationEnabledLastTime"
            r0.<init>(r2, r3, r1)
            cn.jpush.android.cache.Key r0 = r0.a()
            return r0
    }

    public static cn.jpush.android.cache.Key<java.lang.String> JAppKey(java.lang.String r3) {
            cn.jpush.android.cache.Key r0 = new cn.jpush.android.cache.Key
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = "j_key"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r1 = ""
            java.lang.String r2 = "cn.jpush.config"
            r0.<init>(r2, r3, r1)
            cn.jpush.android.cache.Key r3 = r0.b()
            return r3
    }

    public static cn.jpush.android.cache.Key<java.lang.String> LastAniConfigPath() {
            cn.jpush.android.cache.Key r0 = new cn.jpush.android.cache.Key
            java.lang.String r1 = "LastAniConfigPath"
            java.lang.String r2 = ""
            java.lang.String r3 = "cn.jpush.config"
            r0.<init>(r3, r1, r2)
            cn.jpush.android.cache.Key r0 = r0.a()
            return r0
    }

    public static cn.jpush.android.cache.Key<java.lang.Long> LastAniConfigReqTime() {
            cn.jpush.android.cache.Key r0 = new cn.jpush.android.cache.Key
            r1 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "cn.jpush.config"
            java.lang.String r3 = "LastAniConfigReqTime"
            r0.<init>(r2, r3, r1)
            cn.jpush.android.cache.Key r0 = r0.a()
            return r0
    }

    public static cn.jpush.android.cache.Key<java.lang.Long> LastReportApiStatisticTime() {
            cn.jpush.android.cache.Key r0 = new cn.jpush.android.cache.Key
            r1 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "cn.jpush.config"
            java.lang.String r3 = "LastReportApiStatisticTime"
            r0.<init>(r2, r3, r1)
            cn.jpush.android.cache.Key r0 = r0.a()
            return r0
    }

    public static cn.jpush.android.cache.Key<java.lang.String> LocalAniConfigSign() {
            cn.jpush.android.cache.Key r0 = new cn.jpush.android.cache.Key
            java.lang.String r1 = "LocalAniConfigSign"
            java.lang.String r2 = ""
            java.lang.String r3 = "cn.jpush.config"
            r0.<init>(r3, r1, r2)
            cn.jpush.android.cache.Key r0 = r0.a()
            return r0
    }

    public static cn.jpush.android.cache.Key<java.lang.Integer> LocalAniConfigVersion() {
            cn.jpush.android.cache.Key r0 = new cn.jpush.android.cache.Key
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "cn.jpush.config"
            java.lang.String r3 = "LocalAniConfigVersion"
            r0.<init>(r2, r3, r1)
            cn.jpush.android.cache.Key r0 = r0.a()
            return r0
    }

    public static cn.jpush.android.cache.Key<java.lang.String> MAppId(java.lang.String r3) {
            cn.jpush.android.cache.Key r0 = new cn.jpush.android.cache.Key
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = "m_id"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r1 = ""
            java.lang.String r2 = "cn.jpush.config"
            r0.<init>(r2, r3, r1)
            cn.jpush.android.cache.Key r3 = r0.b()
            return r3
    }

    public static cn.jpush.android.cache.Key<java.lang.String> MAppKey(java.lang.String r3) {
            cn.jpush.android.cache.Key r0 = new cn.jpush.android.cache.Key
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = "m_key"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r1 = ""
            java.lang.String r2 = "cn.jpush.config"
            r0.<init>(r2, r3, r1)
            cn.jpush.android.cache.Key r3 = r0.b()
            return r3
    }

    public static cn.jpush.android.cache.Key<java.lang.String> MAppSecret(java.lang.String r3) {
            cn.jpush.android.cache.Key r0 = new cn.jpush.android.cache.Key
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = "m_scrt"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r1 = ""
            java.lang.String r2 = "cn.jpush.config"
            r0.<init>(r2, r3, r1)
            cn.jpush.android.cache.Key r3 = r0.b()
            return r3
    }

    public static cn.jpush.android.cache.Key<java.lang.String> NotiCancel() {
            cn.jpush.android.cache.Key r0 = new cn.jpush.android.cache.Key
            java.lang.String r1 = "NotiCancel"
            java.lang.String r2 = ""
            java.lang.String r3 = "cn.jpush.config"
            r0.<init>(r3, r1, r2)
            cn.jpush.android.cache.Key r0 = r0.a()
            return r0
    }

    public static cn.jpush.android.cache.Key<java.lang.String> NotiSchedule() {
            cn.jpush.android.cache.Key r0 = new cn.jpush.android.cache.Key
            java.lang.String r1 = "NotiSchedule"
            java.lang.String r2 = ""
            java.lang.String r3 = "cn.jpush.config"
            r0.<init>(r3, r1, r2)
            cn.jpush.android.cache.Key r0 = r0.a()
            return r0
    }

    public static cn.jpush.android.cache.Key<java.lang.String> NotiShow() {
            cn.jpush.android.cache.Key r0 = new cn.jpush.android.cache.Key
            java.lang.String r1 = "NotiShow"
            java.lang.String r2 = ""
            java.lang.String r3 = "cn.jpush.config"
            r0.<init>(r3, r1, r2)
            cn.jpush.android.cache.Key r0 = r0.a()
            return r0
    }

    public static cn.jpush.android.cache.Key<java.lang.Long> PushStatusSyncTime() {
            cn.jpush.android.cache.Key r0 = new cn.jpush.android.cache.Key
            r1 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "cn.jpush.config"
            java.lang.String r3 = "PushStatusSyncTime"
            r0.<init>(r2, r3, r1)
            cn.jpush.android.cache.Key r0 = r0.a()
            return r0
    }

    public static cn.jpush.android.cache.Key<java.lang.Integer> PushVerCode() {
            cn.jpush.android.cache.Key r0 = new cn.jpush.android.cache.Key
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "cn.jpush.config"
            java.lang.String r3 = "versionCode"
            r0.<init>(r2, r3, r1)
            cn.jpush.android.cache.Key r0 = r0.a()
            return r0
    }

    public static cn.jpush.android.cache.Key<java.lang.String> SvrAniConfigSign() {
            cn.jpush.android.cache.Key r0 = new cn.jpush.android.cache.Key
            java.lang.String r1 = "SvrAniConfigSign"
            java.lang.String r2 = ""
            java.lang.String r3 = "cn.jpush.config"
            r0.<init>(r3, r1, r2)
            cn.jpush.android.cache.Key r0 = r0.a()
            return r0
    }

    public static cn.jpush.android.cache.Key<java.lang.String> ThirdPush_ClearFlag() {
            cn.jpush.android.cache.Key r0 = new cn.jpush.android.cache.Key
            java.lang.String r1 = "third_push_clear_flag"
            java.lang.String r2 = ""
            java.lang.String r3 = "cn.jpush.config"
            r0.<init>(r3, r1, r2)
            cn.jpush.android.cache.Key r0 = r0.a()
            return r0
    }

    public static cn.jpush.android.cache.Key<java.lang.String> ThirdPush_RegID(byte r3) {
            cn.jpush.android.cache.Key r0 = new cn.jpush.android.cache.Key
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "pluginPlatformRegid_v2"
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r1 = ""
            java.lang.String r2 = "cn.jpush.config"
            r0.<init>(r2, r3, r1)
            cn.jpush.android.cache.Key r3 = r0.a()
            return r3
    }

    public static cn.jpush.android.cache.Key<java.lang.Boolean> ThirdPush_RegUpload(byte r3) {
            cn.jpush.android.cache.Key r0 = new cn.jpush.android.cache.Key
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "pluginPlatformRegidupload"
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            java.lang.String r2 = "cn.jpush.config"
            r0.<init>(r2, r3, r1)
            cn.jpush.android.cache.Key r3 = r0.a()
            return r3
    }

    public static cn.jpush.android.cache.Key<java.lang.Boolean> UPSRegister() {
            cn.jpush.android.cache.Key r0 = new cn.jpush.android.cache.Key
            java.lang.String r1 = "upsRegister"
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.String r3 = "cn.jpush.config"
            r0.<init>(r3, r1, r2)
            return r0
    }

    private cn.jpush.android.cache.Key<T> a() {
            r1 = this;
            r0 = 1
            r1.f1745d = r0
            return r1
    }

    private cn.jpush.android.cache.Key<T> b() {
            r1 = this;
            r0 = 1
            r1.f1746e = r0
            return r1
    }

    public static cn.jpush.android.cache.Key<java.lang.Boolean> isEnableUA() {
            cn.jpush.android.cache.Key r0 = new cn.jpush.android.cache.Key
            java.lang.String r1 = "IsEnableUA"
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.String r3 = "cn.jpush.config"
            r0.<init>(r3, r1, r2)
            cn.jpush.android.cache.Key r0 = r0.a()
            return r0
    }

    public static cn.jpush.android.cache.Key<java.lang.Integer> registerType() {
            cn.jpush.android.cache.Key r0 = new cn.jpush.android.cache.Key
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "cn.jpush.config"
            java.lang.String r3 = "r_type"
            r0.<init>(r2, r3, r1)
            cn.jpush.android.cache.Key r0 = r0.a()
            return r0
    }

    public cn.jpush.android.cache.Key<T> file(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return r0
    }

    public cn.jpush.android.cache.Key<T> name(java.lang.String r1) {
            r0 = this;
            r0.f1743b = r1
            return r0
    }

    public cn.jpush.android.cache.Key<T> set(T r1) {
            r0 = this;
            r0.f1744c = r1
            return r0
    }
}
