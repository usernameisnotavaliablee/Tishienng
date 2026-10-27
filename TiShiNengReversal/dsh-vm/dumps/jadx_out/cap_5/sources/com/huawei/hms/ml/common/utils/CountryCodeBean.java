package com.huawei.hms.ml.common.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class CountryCodeBean {
    private static final java.lang.String ANDRIOD_SYSTEMPROP = "android.os.SystemProperties";
    private static final int COUNTRYCODE_SIZE = 2;
    private static final java.lang.String HONOR_VENDORCOUNTRY_SYSTEMPROP = "msc.sys.country";
    private static final java.lang.String LOCALE_COUNTRYSYSTEMPROP = "ro.product.locale.region";
    private static final java.lang.String LOCALE_INFO = "LOCALE_INFO";
    private static final java.lang.String NETWORK_COUNTRY = "NETWORK_COUNTRY";
    private static final java.lang.String SIM_COUNTRY = "SIM_COUNTRY";
    private static final java.lang.String SPECIAL_COUNTRYCODE_CN = "cn";
    private static final java.lang.String SPECIAL_COUNTRYCODE_EU = "eu";
    private static final java.lang.String SPECIAL_COUNTRYCODE_LA = "la";
    private static final java.lang.String TAG = "CountryCodeBean";
    private static final java.lang.String UNKNOWN = "UNKNOWN";
    private static final java.lang.String VENDORCOUNTRY_SYSTEMPROP = "ro.hw.country";
    private static final java.lang.String VENDOR_COUNTRY = "VENDOR_COUNTRY";
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
            java.lang.String r0 = "get"
            java.lang.String r1 = "ro.product.locale.region"
            java.lang.String r2 = "android.os.SystemProperties"
            java.lang.String r3 = "UNKNOWN"
            java.lang.String r0 = getProperty(r0, r1, r2, r3)
            r4.countryCode = r0
            java.lang.String r0 = "LOCALE_INFO"
            r4.countrySource = r0
            java.lang.String r0 = com.huawei.hms.ml.common.utils.CountryCodeBean.TAG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "getLocaleCountryCode="
            r1.append(r2)
            java.lang.String r2 = r4.countryCode
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.huawei.hms.ml.common.utils.SmartLog.e(r0, r1)
            java.lang.String r1 = "cn"
            java.lang.String r2 = r4.countryCode
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 != 0) goto L3d
            java.lang.String r1 = "getLocaleCountryCode from system language is not reliable."
            com.huawei.hms.ml.common.utils.SmartLog.e(r0, r1)
            r4.countryCode = r3
            r4.countrySource = r3
        L3d:
            return
    }

    private static java.lang.String getProperty(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L3d
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L3d
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L3d
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch: java.lang.Exception -> L32 java.lang.RuntimeException -> L3b
            r0 = 2
            java.lang.Class[] r1 = new java.lang.Class[r0]     // Catch: java.lang.Exception -> L32 java.lang.RuntimeException -> L3b
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r3 = 0
            r1[r3] = r2     // Catch: java.lang.Exception -> L32 java.lang.RuntimeException -> L3b
            r4 = 1
            r1[r4] = r2     // Catch: java.lang.Exception -> L32 java.lang.RuntimeException -> L3b
            java.lang.reflect.Method r5 = r7.getMethod(r5, r1)     // Catch: java.lang.Exception -> L32 java.lang.RuntimeException -> L3b
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L32 java.lang.RuntimeException -> L3b
            r0[r3] = r6     // Catch: java.lang.Exception -> L32 java.lang.RuntimeException -> L3b
            r0[r4] = r8     // Catch: java.lang.Exception -> L32 java.lang.RuntimeException -> L3b
            java.lang.Object r5 = r5.invoke(r7, r0)     // Catch: java.lang.Exception -> L32 java.lang.RuntimeException -> L3b
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> L32 java.lang.RuntimeException -> L3b
            return r5
        L32:
            r5 = move-exception
            java.lang.String r6 = com.huawei.hms.ml.common.utils.CountryCodeBean.TAG
            java.lang.String r7 = "getProperty catch exception: "
            com.huawei.hms.ml.common.utils.SmartLog.e(r6, r7, r5)
            return r8
        L3b:
            r5 = move-exception
            throw r5
        L3d:
            java.lang.String r5 = com.huawei.hms.ml.common.utils.CountryCodeBean.TAG
            java.lang.String r6 = "reflect class for method has exception."
            com.huawei.hms.ml.common.utils.SmartLog.w(r5, r6)
            return r8
    }

    private void getSimCountryCode(android.content.Context r2, boolean r3) {
            r1 = this;
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            java.lang.String r0 = "phone"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.telephony.TelephonyManager r2 = (android.telephony.TelephonyManager) r2
            if (r2 == 0) goto L60
            if (r3 == 0) goto L3e
            int r3 = r2.getPhoneType()
            r0 = 2
            if (r3 == r0) goto L3e
            java.lang.String r2 = r2.getNetworkCountryIso()
            r1.countryCode = r2
            java.lang.String r2 = "NETWORK_COUNTRY"
            r1.countrySource = r2
            java.lang.String r2 = com.huawei.hms.ml.common.utils.CountryCodeBean.TAG
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "getSimCountryCode by enableNetwork, countryCode="
            r3.append(r0)
            java.lang.String r0 = r1.countryCode
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            com.huawei.hms.ml.common.utils.SmartLog.e(r2, r3)
            goto L60
        L3e:
            java.lang.String r2 = r2.getSimCountryIso()
            r1.countryCode = r2
            java.lang.String r2 = "SIM_COUNTRY"
            r1.countrySource = r2
            java.lang.String r2 = com.huawei.hms.ml.common.utils.CountryCodeBean.TAG
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "getSimCountryCode by not enableNetwork, countryCode="
            r3.append(r0)
            java.lang.String r0 = r1.countryCode
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            com.huawei.hms.ml.common.utils.SmartLog.e(r2, r3)
        L60:
            r1.checkCodeLenth()
            return
    }

    private void getVendorCountryCode() {
            r4 = this;
            java.lang.String r0 = "VENDOR_COUNTRY"
            r4.countrySource = r0
            java.lang.String r0 = android.os.Build.BRAND
            java.lang.String r1 = "HONOR"
            boolean r0 = r1.equals(r0)
            java.lang.String r1 = "android.os.SystemProperties"
            java.lang.String r2 = "get"
            java.lang.String r3 = "UNKNOWN"
            if (r0 == 0) goto L1d
            java.lang.String r0 = "msc.sys.country"
            java.lang.String r0 = getProperty(r2, r0, r1, r3)
            r4.countryCode = r0
            goto L25
        L1d:
            java.lang.String r0 = "ro.hw.country"
            java.lang.String r0 = getProperty(r2, r0, r1, r3)
            r4.countryCode = r0
        L25:
            java.lang.String r0 = com.huawei.hms.ml.common.utils.CountryCodeBean.TAG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "getVendorCountry="
            r1.append(r2)
            java.lang.String r2 = r4.countryCode
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.huawei.hms.ml.common.utils.SmartLog.e(r0, r1)
            java.lang.String r1 = "eu"
            java.lang.String r2 = r4.countryCode
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 != 0) goto L56
            java.lang.String r1 = "la"
            java.lang.String r2 = r4.countryCode
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto L52
            goto L56
        L52:
            r4.checkCodeLenth()
            return
        L56:
            java.lang.String r1 = "getVendorCountry equals eu or la ,not reliable"
            com.huawei.hms.ml.common.utils.SmartLog.e(r0, r1)
            r4.countryCode = r3
            r4.countrySource = r3
            return
    }

    private void init(android.content.Context r3, boolean r4) {
            r2 = this;
            if (r3 == 0) goto L3f
            r2.getVendorCountryCode()     // Catch: java.lang.Exception -> L37
            boolean r0 = r2.isCodeValidate()     // Catch: java.lang.Exception -> L37
            java.lang.String r1 = "getCountryCode get country code from {%s}"
            if (r0 == 0) goto L15
            java.lang.String r3 = com.huawei.hms.ml.common.utils.CountryCodeBean.TAG     // Catch: java.lang.Exception -> L37
            java.lang.String r4 = "VENDOR_COUNTRY"
            com.huawei.hms.ml.common.utils.SmartLog.d(r3, r1, r4)     // Catch: java.lang.Exception -> L37
            return
        L15:
            r2.getSimCountryCode(r3, r4)     // Catch: java.lang.Exception -> L37
            boolean r3 = r2.isCodeValidate()     // Catch: java.lang.Exception -> L37
            if (r3 == 0) goto L26
            java.lang.String r3 = com.huawei.hms.ml.common.utils.CountryCodeBean.TAG     // Catch: java.lang.Exception -> L37
            java.lang.String r4 = "SIM_COUNTRY"
            com.huawei.hms.ml.common.utils.SmartLog.d(r3, r1, r4)     // Catch: java.lang.Exception -> L37
            return
        L26:
            r2.getLocaleCountryCode()     // Catch: java.lang.Exception -> L37
            boolean r3 = r2.isCodeValidate()     // Catch: java.lang.Exception -> L37
            if (r3 == 0) goto L36
            java.lang.String r3 = com.huawei.hms.ml.common.utils.CountryCodeBean.TAG     // Catch: java.lang.Exception -> L37
            java.lang.String r4 = "LOCALE_INFO"
            com.huawei.hms.ml.common.utils.SmartLog.d(r3, r1, r4)     // Catch: java.lang.Exception -> L37
        L36:
            return
        L37:
            java.lang.String r3 = com.huawei.hms.ml.common.utils.CountryCodeBean.TAG
            java.lang.String r4 = "get CountryCode error"
            com.huawei.hms.ml.common.utils.SmartLog.w(r3, r4)
            return
        L3f:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "context must be not null.Please provide app's Context"
            r3.<init>(r4)
            throw r3
    }

    private boolean isCodeValidate() {
            r2 = this;
            java.lang.String r0 = "UNKNOWN"
            java.lang.String r1 = r2.countryCode
            boolean r0 = r0.equals(r1)
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
