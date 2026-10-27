package com.huawei.hms.framework.network.grs.local.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class CountryCodeBean {
    private static final java.lang.String ANDRIOD_SYSTEMPROP = "android.os.SystemProperties";
    private static final int ANDROID_9_API_LEVEL = 28;
    private static final int COUNTRYCODE_SIZE = 2;
    private static final java.lang.String KEY_VERSION_EMUI = "ro.build.version.emui";
    private static final java.lang.String LOCALE_COUNTRYSYSTEMPROP = "ro.product.locale";
    private static final java.lang.String LOCALE_REGION_COUNTRYSYSTEMPROP = "ro.product.locale.region";
    private static final java.lang.String SPECIAL_COUNTRYCODE_CN = "cn";
    private static final java.lang.String SPECIAL_COUNTRYCODE_EU = "eu";
    private static final java.lang.String SPECIAL_COUNTRYCODE_GB = "gb";
    private static final java.lang.String SPECIAL_COUNTRYCODE_LA = "la";
    private static final java.lang.String SPECIAL_COUNTRYCODE_UK = "uk";
    private static final java.lang.String TAG = "CountryCodeBean";
    private static final java.lang.String VENDORCOUNTRY_SYSTEMPROP = "ro.hw.country";
    private java.lang.String countryCode;
    private java.lang.String countrySource;

    static {
            return
    }

    public CountryCodeBean(android.content.Context r2, boolean r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "UNKNOWN"
            r1.countrySource = r0
            r1.countryCode = r0
            r1.init(r2, r3)
            java.lang.String r2 = r1.countryCode
            java.util.Locale r3 = java.util.Locale.ENGLISH
            java.lang.String r2 = r2.toUpperCase(r3)
            r1.countryCode = r2
            return
    }

    private void checkCodeLenth() {
            r2 = this;
            java.lang.String r0 = r2.countryCode
            if (r0 == 0) goto Ld
            int r0 = r0.length()
            r1 = 2
            if (r0 == r1) goto Lc
            goto Ld
        Lc:
            return
        Ld:
            java.lang.String r0 = "UNKNOWN"
            r2.countryCode = r0
            r2.countrySource = r0
            return
    }

    private void getLocaleCountryCode() {
            r4 = this;
            java.lang.String r0 = "android.os.SystemProperties"
            java.lang.String r1 = ""
            java.lang.String r2 = "get"
            java.lang.String r3 = "ro.build.version.emui"
            java.lang.String r0 = com.huawei.hms.framework.common.SystemPropUtils.getProperty(r2, r3, r0, r1)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2b
            boolean r0 = com.huawei.hms.framework.common.EmuiUtil.isUpPVersion()
            if (r0 == 0) goto L23
            r4.getRegionSettingCountryCode()
            java.lang.String r0 = com.huawei.hms.framework.network.grs.local.model.CountryCodeBean.TAG
            java.lang.String r1 = "EMUI 9.0 upper System, get countryCode form Locale.getDefault().getCountry()"
        L1f:
            com.huawei.hms.framework.common.Logger.d(r0, r1)
            goto L4d
        L23:
            r4.getProductCountryCode()
            java.lang.String r0 = com.huawei.hms.framework.network.grs.local.model.CountryCodeBean.TAG
            java.lang.String r1 = "EMUI 9.0 lower System, get countryCode form ro.product.locale.region or locale"
            goto L1f
        L2b:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L45
            java.lang.String r0 = android.os.Build.VERSION.RELEASE
            r1 = 0
            char r0 = r0.charAt(r1)
            r1 = 57
            if (r0 < r1) goto L3d
            goto L45
        L3d:
            r4.getProductCountryCode()
            java.lang.String r0 = com.huawei.hms.framework.network.grs.local.model.CountryCodeBean.TAG
            java.lang.String r1 = "other Android 9.0 lower, get countryCode form ro.product.locale.region or locale"
            goto L1f
        L45:
            r4.getRegionSettingCountryCode()
            java.lang.String r0 = com.huawei.hms.framework.network.grs.local.model.CountryCodeBean.TAG
            java.lang.String r1 = "other Android 9.0 upper， get countryCode form Locale.getDefault().getCountry()"
            goto L1f
        L4d:
            java.lang.String r0 = "LOCALE_INFO"
            r4.countrySource = r0
            return
    }

    private void getProductCountryCode() {
            r6 = this;
            java.lang.String r0 = "get"
            java.lang.String r1 = "ro.product.locale.region"
            java.lang.String r2 = "android.os.SystemProperties"
            java.lang.String r3 = "UNKNOWN"
            java.lang.String r1 = com.huawei.hms.framework.common.SystemPropUtils.getProperty(r0, r1, r2, r3)
            r6.countryCode = r1
            java.lang.String r1 = com.huawei.hms.framework.network.grs.local.model.CountryCodeBean.TAG
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "countryCode by ro.product.locale.region is: "
            r4.append(r5)
            java.lang.String r5 = r6.countryCode
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.huawei.hms.framework.common.Logger.d(r1, r4)
            java.lang.String r4 = r6.countryCode
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L36
            java.lang.String r4 = r6.countryCode
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L69
        L36:
            java.lang.String r4 = "ro.product.locale"
            java.lang.String r0 = com.huawei.hms.framework.common.SystemPropUtils.getProperty(r0, r4, r2, r3)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L69
            java.lang.String r2 = "-"
            int r2 = r0.lastIndexOf(r2)
            r4 = -1
            if (r2 == r4) goto L69
            int r2 = r2 + 1
            java.lang.String r0 = r0.substring(r2)
            r6.countryCode = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "countryCode by ro.product.locale is: "
            r0.append(r2)
            java.lang.String r2 = r6.countryCode
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.huawei.hms.framework.common.Logger.d(r1, r0)
        L69:
            java.lang.String r0 = r6.countryCode
            java.lang.String r1 = "cn"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L75
            r6.countryCode = r3
        L75:
            return
    }

    private void getRegionSettingCountryCode() {
            r3 = this;
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getCountry()
            r3.countryCode = r0
            java.lang.String r0 = com.huawei.hms.framework.network.grs.local.model.CountryCodeBean.TAG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "countryCode by system's region setting is: "
            r1.append(r2)
            java.lang.String r2 = r3.countryCode
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.huawei.hms.framework.common.Logger.d(r0, r1)
            java.lang.String r0 = r3.countryCode
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L2e
            java.lang.String r0 = "UNKNOWN"
            r3.countryCode = r0
        L2e:
            return
    }

    private void getSimCountryCode(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.getSimCountryCode(r2, r0)
            return
    }

    private void getSimCountryCode(android.content.Context r2, boolean r3) {
            r1 = this;
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            java.lang.String r0 = "phone"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.telephony.TelephonyManager r2 = (android.telephony.TelephonyManager) r2
            if (r2 == 0) goto L52
            if (r3 == 0) goto L3e
            int r3 = r2.getPhoneType()
            r0 = 2
            if (r3 == r0) goto L3e
            java.lang.String r2 = r2.getNetworkCountryIso()
            r1.countryCode = r2
            java.lang.String r2 = "NETWORK_COUNTRY"
            r1.countrySource = r2
            java.lang.String r2 = com.huawei.hms.framework.network.grs.local.model.CountryCodeBean.TAG
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "countryCode by NetworkCountryIso is: "
        L2e:
            r3.append(r0)
            java.lang.String r0 = r1.countryCode
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            com.huawei.hms.framework.common.Logger.d(r2, r3)
            goto L52
        L3e:
            java.lang.String r2 = r2.getSimCountryIso()
            r1.countryCode = r2
            java.lang.String r2 = "SIM_COUNTRY"
            r1.countrySource = r2
            java.lang.String r2 = com.huawei.hms.framework.network.grs.local.model.CountryCodeBean.TAG
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "countryCode by SimCountryIso is: "
            goto L2e
        L52:
            r1.checkCodeLenth()
            return
    }

    private void getVendorCountryCode() {
            r5 = this;
            java.lang.String r0 = "VENDOR_COUNTRY"
            r5.countrySource = r0
            java.lang.String r1 = "get"
            java.lang.String r2 = "ro.hw.country"
            java.lang.String r3 = "android.os.SystemProperties"
            java.lang.String r4 = "UNKNOWN"
            java.lang.String r1 = com.huawei.hms.framework.common.SystemPropUtils.getProperty(r1, r2, r3, r4)
            r5.countryCode = r1
            java.lang.String r1 = com.huawei.hms.framework.network.grs.local.model.CountryCodeBean.TAG
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "countryCode by ro.hw.country is: "
            r2.append(r3)
            java.lang.String r3 = r5.countryCode
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.huawei.hms.framework.common.Logger.d(r1, r2)
            java.lang.String r2 = r5.countryCode
            java.lang.String r3 = "eu"
            boolean r2 = r3.equalsIgnoreCase(r2)
            if (r2 != 0) goto L59
            java.lang.String r2 = r5.countryCode
            java.lang.String r3 = "la"
            boolean r2 = r3.equalsIgnoreCase(r2)
            if (r2 == 0) goto L3f
            goto L59
        L3f:
            java.lang.String r2 = r5.countryCode
            java.lang.String r3 = "uk"
            boolean r2 = r3.equalsIgnoreCase(r2)
            if (r2 == 0) goto L55
            java.lang.String r2 = "special country of UK to map GB."
            com.huawei.hms.framework.common.Logger.d(r1, r2)
            java.lang.String r1 = "gb"
            r5.countryCode = r1
            r5.countrySource = r0
            return
        L55:
            r5.checkCodeLenth()
            return
        L59:
            r5.countryCode = r4
            r5.countrySource = r4
            return
    }

    private void init(android.content.Context r1, boolean r2) {
            r0 = this;
            if (r1 == 0) goto L38
            r0.getVendorCountryCode()     // Catch: java.lang.Exception -> L30
            boolean r2 = r0.isCodeValidate()     // Catch: java.lang.Exception -> L30
            if (r2 == 0) goto L13
            java.lang.String r1 = com.huawei.hms.framework.network.grs.local.model.CountryCodeBean.TAG     // Catch: java.lang.Exception -> L30
            java.lang.String r2 = "get issue_country code from VENDOR_COUNTRY"
        Lf:
            com.huawei.hms.framework.common.Logger.i(r1, r2)     // Catch: java.lang.Exception -> L30
            return
        L13:
            r0.getSimCountryCode(r1)     // Catch: java.lang.Exception -> L30
            boolean r1 = r0.isCodeValidate()     // Catch: java.lang.Exception -> L30
            if (r1 == 0) goto L21
            java.lang.String r1 = com.huawei.hms.framework.network.grs.local.model.CountryCodeBean.TAG     // Catch: java.lang.Exception -> L30
            java.lang.String r2 = "get issue_country code from SIM_COUNTRY"
            goto Lf
        L21:
            r0.getLocaleCountryCode()     // Catch: java.lang.Exception -> L30
            boolean r1 = r0.isCodeValidate()     // Catch: java.lang.Exception -> L30
            if (r1 == 0) goto L2f
            java.lang.String r1 = com.huawei.hms.framework.network.grs.local.model.CountryCodeBean.TAG     // Catch: java.lang.Exception -> L30
            java.lang.String r2 = "get issue_country code from LOCALE_INFO"
            goto Lf
        L2f:
            return
        L30:
            java.lang.String r1 = com.huawei.hms.framework.network.grs.local.model.CountryCodeBean.TAG
            java.lang.String r2 = "get CountryCode error"
            com.huawei.hms.framework.common.Logger.w(r1, r2)
            return
        L38:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "context must be not null.Please provide app's Context"
            r1.<init>(r2)
            throw r1
    }

    private boolean isCodeValidate() {
            r2 = this;
            java.lang.String r0 = r2.countryCode
            java.lang.String r1 = "UNKNOWN"
            boolean r0 = r1.equals(r0)
            r0 = r0 ^ 1
            return r0
    }

    public java.lang.String getCountryCode() {
            r1 = this;
            java.lang.String r0 = r1.countryCode
            return r0
    }

    public java.lang.String getCountrySource() {
            r1 = this;
            java.lang.String r0 = r1.countrySource
            return r0
    }
}
