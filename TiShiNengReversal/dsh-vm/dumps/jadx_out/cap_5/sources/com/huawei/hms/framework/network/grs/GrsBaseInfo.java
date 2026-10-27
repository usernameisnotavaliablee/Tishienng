package com.huawei.hms.framework.network.grs;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class GrsBaseInfo implements java.lang.Cloneable {
    private static final java.lang.String TAG = "GrsBaseInfo";
    private java.lang.String androidVersion;
    private java.lang.String appName;
    private java.lang.String countrySource;
    private java.lang.String deviceModel;
    private java.lang.String issueCountry;
    private int queryTimeout;
    private java.lang.String regCountry;
    private java.lang.String romVersion;
    private java.lang.String serCountry;
    private java.lang.String uid;
    private java.lang.String versionName;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public @interface CountryCodeSource {
        public static final java.lang.String APP = "APP";
        public static final java.lang.String LOCALE_INFO = "LOCALE_INFO";
        public static final java.lang.String NETWORK_COUNTRY = "NETWORK_COUNTRY";
        public static final java.lang.String SIM_COUNTRY = "SIM_COUNTRY";
        public static final java.lang.String UNKNOWN = "UNKNOWN";
        public static final java.lang.String VENDOR_COUNTRY = "VENDOR_COUNTRY";
    }

    static {
            return
    }

    public GrsBaseInfo() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.queryTimeout = r0
            return
    }

    public GrsBaseInfo(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.queryTimeout = r0
            com.huawei.hms.framework.network.grs.GrsApp r0 = com.huawei.hms.framework.network.grs.GrsApp.getInstance()
            java.lang.String r2 = r0.getIssueCountryCode(r2)
            r1.issueCountry = r2
            return
    }

    private static java.lang.String getObjSummary(com.huawei.hms.framework.network.grs.GrsBaseInfo r2) {
            if (r2 != 0) goto L5
            java.lang.String r2 = ""
            return r2
        L5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "serCountry:"
            r0.append(r1)
            java.lang.String r1 = r2.serCountry
            r0.append(r1)
            java.lang.String r1 = "versionName:"
            r0.append(r1)
            java.lang.String r1 = r2.versionName
            r0.append(r1)
            java.lang.String r1 = "appName:"
            r0.append(r1)
            java.lang.String r1 = r2.appName
            r0.append(r1)
            java.lang.String r1 = "uid:"
            r0.append(r1)
            java.lang.String r1 = r2.uid
            r0.append(r1)
            java.lang.String r1 = "regCountry:"
            r0.append(r1)
            java.lang.String r1 = r2.regCountry
            r0.append(r1)
            java.lang.String r1 = "issueCountry:"
            r0.append(r1)
            java.lang.String r1 = r2.issueCountry
            r0.append(r1)
            java.lang.String r1 = "androidVersion:"
            r0.append(r1)
            java.lang.String r1 = r2.androidVersion
            r0.append(r1)
            java.lang.String r1 = "romVersion:"
            r0.append(r1)
            java.lang.String r1 = r2.romVersion
            r0.append(r1)
            java.lang.String r1 = "deviceModel:"
            r0.append(r1)
            java.lang.String r1 = r2.deviceModel
            r0.append(r1)
            java.lang.String r1 = "countrySource:"
            r0.append(r1)
            java.lang.String r2 = r2.countrySource
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    private java.lang.StringBuffer getStringBuffer(java.lang.StringBuffer r4, boolean r5, android.content.Context r6) {
            r3 = this;
            java.lang.String r5 = r3.getAndroidVersion()
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            java.lang.String r1 = "="
            java.lang.String r2 = "&"
            if (r0 != 0) goto L2a
            java.lang.String r0 = r4.toString()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1b
            r4.append(r2)
        L1b:
            java.lang.String r0 = "android_version"
            r4.append(r0)
            r4.append(r1)
            java.lang.String r5 = r3.getUrlEncodedStr(r5)
            r4.append(r5)
        L2a:
            java.lang.String r5 = r3.getRomVersion()
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L50
            java.lang.String r0 = r4.toString()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L41
            r4.append(r2)
        L41:
            java.lang.String r0 = "rom_version"
            r4.append(r0)
            r4.append(r1)
            java.lang.String r5 = r3.getUrlEncodedStr(r5)
            r4.append(r5)
        L50:
            java.lang.String r5 = r3.getDeviceModel()
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L76
            java.lang.String r0 = r4.toString()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L67
            r4.append(r2)
        L67:
            java.lang.String r0 = "device_model"
            r4.append(r0)
            r4.append(r1)
            java.lang.String r5 = r3.getUrlEncodedStr(r5)
            r4.append(r5)
        L76:
            java.lang.String r5 = r3.getCountrySource()
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L9c
            java.lang.String r0 = r4.toString()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L8d
            r4.append(r2)
        L8d:
            java.lang.String r0 = "country_source"
            r4.append(r0)
            r4.append(r1)
            java.lang.String r5 = r3.getUrlEncodedStr(r5)
            r4.append(r5)
        L9c:
            java.lang.String r5 = r4.toString()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto La9
            r4.append(r2)
        La9:
            java.lang.String r5 = "package_name"
            r4.append(r5)
            r4.append(r1)
            java.lang.String r5 = r6.getPackageName()
            java.lang.String r5 = r3.getUrlEncodedStr(r5)
            r4.append(r5)
            return r4
    }

    public com.huawei.hms.framework.network.grs.GrsBaseInfo clone() {
            r1 = this;
            java.lang.Object r0 = super.clone()
            com.huawei.hms.framework.network.grs.GrsBaseInfo r0 = (com.huawei.hms.framework.network.grs.GrsBaseInfo) r0
            return r0
    }

    /* renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ java.lang.Object m0clone() {
            r1 = this;
            com.huawei.hms.framework.network.grs.GrsBaseInfo r0 = r1.clone()
            return r0
    }

    public boolean compare(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            if (r3 == 0) goto L1e
            java.lang.Class r0 = r3.getClass()
            java.lang.Class<com.huawei.hms.framework.network.grs.GrsBaseInfo> r1 = com.huawei.hms.framework.network.grs.GrsBaseInfo.class
            if (r1 == r0) goto Lf
            goto L1e
        Lf:
            com.huawei.hms.framework.network.grs.GrsBaseInfo r3 = (com.huawei.hms.framework.network.grs.GrsBaseInfo) r3
            java.lang.String r0 = getObjSummary(r2)
            java.lang.String r3 = getObjSummary(r3)
            boolean r3 = r0.equals(r3)
            return r3
        L1e:
            r3 = 0
            return r3
    }

    public com.huawei.hms.framework.network.grs.GrsBaseInfo copy() {
            r2 = this;
            com.huawei.hms.framework.network.grs.GrsBaseInfo r0 = new com.huawei.hms.framework.network.grs.GrsBaseInfo
            r0.<init>()
            java.lang.String r1 = r2.appName
            r0.setAppName(r1)
            java.lang.String r1 = r2.serCountry
            r0.setSerCountry(r1)
            java.lang.String r1 = r2.regCountry
            r0.setRegCountry(r1)
            java.lang.String r1 = r2.issueCountry
            r0.setIssueCountry(r1)
            java.lang.String r1 = r2.countrySource
            r0.setCountrySource(r1)
            java.lang.String r1 = r2.androidVersion
            r0.setAndroidVersion(r1)
            java.lang.String r1 = r2.deviceModel
            r0.setDeviceModel(r1)
            java.lang.String r1 = r2.romVersion
            r0.setRomVersion(r1)
            java.lang.String r1 = r2.uid
            r0.setUid(r1)
            java.lang.String r1 = r2.versionName
            r0.setVersionName(r1)
            int r1 = r2.queryTimeout
            r0.setQueryTimeout(r1)
            return r0
    }

    public java.lang.String getAndroidVersion() {
            r1 = this;
            java.lang.String r0 = r1.androidVersion
            return r0
    }

    public java.lang.String getAppName() {
            r1 = this;
            java.lang.String r0 = r1.appName
            return r0
    }

    public java.lang.String getCountrySource() {
            r1 = this;
            java.lang.String r0 = r1.countrySource
            return r0
    }

    public java.lang.String getDeviceModel() {
            r1 = this;
            java.lang.String r0 = r1.deviceModel
            return r0
    }

    public java.lang.String getGrsParasKey(boolean r3, boolean r4, android.content.Context r5) {
            r2 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r1 = r5.getPackageName()
            com.huawei.hms.framework.network.grs.f.b r1 = com.huawei.hms.framework.network.grs.f.b.a(r1)
            if (r1 == 0) goto L14
            t1.a r1 = r1.d()
            goto L15
        L14:
            r1 = 0
        L15:
            if (r1 == 0) goto L1c
            java.lang.String r1 = r1.a()
            goto L1e
        L1c:
            java.lang.String r1 = ""
        L1e:
            java.lang.String r3 = r2.getGrsReqParamJoint(r3, r4, r1, r5)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L3a
            java.lang.String r4 = r0.toString()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L37
            java.lang.String r4 = "&"
            r0.append(r4)
        L37:
            r0.append(r3)
        L3a:
            java.lang.String r3 = r0.toString()
            return r3
    }

    public java.lang.String getGrsReqParamJoint(boolean r5, boolean r6, java.lang.String r7, android.content.Context r8) {
            r4 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r1 = "1.0"
            boolean r1 = r1.equals(r7)
            java.lang.String r2 = "="
            if (r1 == 0) goto L17
            java.lang.String r7 = com.huawei.hms.framework.network.grs.GrsBaseInfo.TAG
            java.lang.String r1 = "1.0 interface has no query param appname"
            com.huawei.hms.framework.common.Logger.v(r7, r1)
            goto L42
        L17:
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            java.lang.String r3 = "app_name"
            if (r1 != 0) goto L2d
            r0.append(r3)
            r0.append(r2)
        L25:
            java.lang.String r7 = r4.getUrlEncodedStr(r7)
            r0.append(r7)
            goto L42
        L2d:
            java.lang.String r7 = r4.getAppName()
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L42
            r0.append(r3)
            r0.append(r2)
            java.lang.String r7 = r4.getAppName()
            goto L25
        L42:
            java.lang.String r7 = r4.getVersionName()
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            java.lang.String r3 = "&"
            if (r1 != 0) goto L6a
            java.lang.String r1 = r0.toString()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L5b
            r0.append(r3)
        L5b:
            java.lang.String r1 = "app_version"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r7 = r4.getUrlEncodedStr(r7)
            r0.append(r7)
        L6a:
            java.lang.String r7 = r4.getUid()
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            if (r1 != 0) goto L9d
            java.lang.String r1 = r0.toString()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L81
            r0.append(r3)
        L81:
            java.lang.String r1 = "uid"
            r0.append(r1)
            r0.append(r2)
            if (r5 == 0) goto L93
            java.lang.String r5 = q1.b.d(r7)
        L8f:
            r0.append(r5)
            goto L9d
        L93:
            if (r6 == 0) goto L9a
            java.lang.String r5 = q1.b.a(r7)
            goto L8f
        L9a:
            r0.append(r7)
        L9d:
            java.lang.String r5 = r4.getRegCountry()
            boolean r7 = android.text.TextUtils.isEmpty(r5)
            java.lang.String r1 = "UNKNOWN"
            if (r7 != 0) goto Lcb
            boolean r7 = r1.equals(r5)
            if (r7 != 0) goto Lcb
            java.lang.String r7 = r0.toString()
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto Lbc
            r0.append(r3)
        Lbc:
            java.lang.String r7 = "reg_country"
            r0.append(r7)
            r0.append(r2)
            java.lang.String r5 = r4.getUrlEncodedStr(r5)
            r0.append(r5)
        Lcb:
            java.lang.String r5 = r4.getSerCountry()
            boolean r7 = android.text.TextUtils.isEmpty(r5)
            if (r7 != 0) goto Lf7
            boolean r7 = r1.equals(r5)
            if (r7 != 0) goto Lf7
            java.lang.String r7 = r0.toString()
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto Le8
            r0.append(r3)
        Le8:
            java.lang.String r7 = "ser_country"
            r0.append(r7)
            r0.append(r2)
            java.lang.String r5 = r4.getUrlEncodedStr(r5)
            r0.append(r5)
        Lf7:
            java.lang.String r5 = r4.getIssueCountry()
            boolean r7 = android.text.TextUtils.isEmpty(r5)
            if (r7 != 0) goto L123
            boolean r7 = r1.equals(r5)
            if (r7 != 0) goto L123
            java.lang.String r7 = r0.toString()
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L114
            r0.append(r3)
        L114:
            java.lang.String r7 = "issue_country"
            r0.append(r7)
            r0.append(r2)
            java.lang.String r5 = r4.getUrlEncodedStr(r5)
            r0.append(r5)
        L123:
            java.lang.StringBuffer r5 = r4.getStringBuffer(r0, r6, r8)
            java.lang.String r5 = r5.toString()
            return r5
    }

    public java.lang.String getIssueCountry() {
            r1 = this;
            java.lang.String r0 = r1.issueCountry
            return r0
    }

    public int getQueryTimeout() {
            r1 = this;
            int r0 = r1.queryTimeout
            return r0
    }

    public java.lang.String getRegCountry() {
            r1 = this;
            java.lang.String r0 = r1.regCountry
            return r0
    }

    public java.lang.String getRomVersion() {
            r1 = this;
            java.lang.String r0 = r1.romVersion
            return r0
    }

    public java.lang.String getSerCountry() {
            r1 = this;
            java.lang.String r0 = r1.serCountry
            return r0
    }

    public java.lang.String getUid() {
            r1 = this;
            java.lang.String r0 = r1.uid
            return r0
    }

    public java.lang.String getUrlEncodedStr(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "utf-8"
            java.lang.String r2 = java.net.URLEncoder.encode(r2, r0)     // Catch: java.io.UnsupportedEncodingException -> L7
            return r2
        L7:
            java.lang.String r2 = com.huawei.hms.framework.network.grs.GrsBaseInfo.TAG
            java.lang.String r0 = "UnsupportedEncodingException, Please check the params!"
            com.huawei.hms.framework.common.Logger.e(r2, r0)
            java.lang.String r2 = ""
            return r2
    }

    public java.lang.String getVersionName() {
            r1 = this;
            java.lang.String r0 = r1.versionName
            return r0
    }

    public void setAndroidVersion(java.lang.String r1) {
            r0 = this;
            r0.androidVersion = r1
            return
    }

    public void setAppName(java.lang.String r1) {
            r0 = this;
            r0.appName = r1
            return
    }

    public void setCountrySource(java.lang.String r1) {
            r0 = this;
            r0.countrySource = r1
            return
    }

    public void setDeviceModel(java.lang.String r1) {
            r0 = this;
            r0.deviceModel = r1
            return
    }

    @java.lang.Deprecated
    public void setIssueCountry(java.lang.String r2) {
            r1 = this;
            if (r2 == 0) goto L9
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.String r2 = r2.toUpperCase(r0)
            goto Lb
        L9:
            java.lang.String r2 = ""
        Lb:
            r1.issueCountry = r2
            return
    }

    public void setQueryTimeout(int r1) {
            r0 = this;
            r0.queryTimeout = r1
            return
    }

    public void setRegCountry(java.lang.String r2) {
            r1 = this;
            if (r2 == 0) goto L9
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.String r2 = r2.toUpperCase(r0)
            goto Lb
        L9:
            java.lang.String r2 = ""
        Lb:
            r1.regCountry = r2
            return
    }

    public void setRomVersion(java.lang.String r1) {
            r0 = this;
            r0.romVersion = r1
            return
    }

    public void setSerCountry(java.lang.String r2) {
            r1 = this;
            if (r2 == 0) goto L9
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.String r2 = r2.toUpperCase(r0)
            goto Lb
        L9:
            java.lang.String r2 = ""
        Lb:
            r1.serCountry = r2
            return
    }

    @java.lang.Deprecated
    public void setUid(java.lang.String r1) {
            r0 = this;
            r0.uid = r1
            return
    }

    public void setVersionName(java.lang.String r1) {
            r0 = this;
            r0.versionName = r1
            return
    }

    public int uniqueCode() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.appName
            r0.append(r1)
            java.lang.String r1 = "#"
            r0.append(r1)
            java.lang.String r2 = r3.serCountry
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = r3.regCountry
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = r3.issueCountry
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            int r0 = r0.hashCode()
            return r0
    }
}
