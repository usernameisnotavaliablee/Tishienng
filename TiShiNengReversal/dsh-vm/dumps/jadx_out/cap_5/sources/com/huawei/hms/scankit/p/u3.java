package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
abstract class u3 {
    static java.lang.String d = "FORMAT_UNKNOWN";
    static java.lang.String e = "OTHER";
    static android.util.SparseArray<java.lang.String> f;
    static android.util.SparseArray<java.lang.String> g;
    android.content.Context a;
    java.util.LinkedHashMap<java.lang.String, java.lang.String> b;
    volatile long c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends android.util.SparseArray<java.lang.String> {
        a() {
                r2 = this;
                r2.<init>()
                int r0 = com.huawei.hms.ml.scan.HmsScanBase.AZTEC_SCAN_TYPE
                java.lang.String r1 = "AZTEC"
                r2.put(r0, r1)
                int r0 = com.huawei.hms.ml.scan.HmsScanBase.CODABAR_SCAN_TYPE
                java.lang.String r1 = "CODABAR"
                r2.put(r0, r1)
                int r0 = com.huawei.hms.ml.scan.HmsScanBase.CODE39_SCAN_TYPE
                java.lang.String r1 = "CODE39"
                r2.put(r0, r1)
                int r0 = com.huawei.hms.ml.scan.HmsScanBase.CODE93_SCAN_TYPE
                java.lang.String r1 = "CODE93"
                r2.put(r0, r1)
                int r0 = com.huawei.hms.ml.scan.HmsScanBase.CODE128_SCAN_TYPE
                java.lang.String r1 = "CODE128"
                r2.put(r0, r1)
                int r0 = com.huawei.hms.ml.scan.HmsScanBase.DATAMATRIX_SCAN_TYPE
                java.lang.String r1 = "DATAMATRIX"
                r2.put(r0, r1)
                int r0 = com.huawei.hms.ml.scan.HmsScanBase.EAN8_SCAN_TYPE
                java.lang.String r1 = "EAN8"
                r2.put(r0, r1)
                int r0 = com.huawei.hms.ml.scan.HmsScanBase.EAN13_SCAN_TYPE
                java.lang.String r1 = "EAN13"
                r2.put(r0, r1)
                int r0 = com.huawei.hms.ml.scan.HmsScanBase.ITF14_SCAN_TYPE
                java.lang.String r1 = "ITF14"
                r2.put(r0, r1)
                int r0 = com.huawei.hms.ml.scan.HmsScanBase.PDF417_SCAN_TYPE
                java.lang.String r1 = "PDF417"
                r2.put(r0, r1)
                int r0 = com.huawei.hms.ml.scan.HmsScanBase.QRCODE_SCAN_TYPE
                java.lang.String r1 = "QRCODE"
                r2.put(r0, r1)
                int r0 = com.huawei.hms.ml.scan.HmsScanBase.UPCCODE_A_SCAN_TYPE
                java.lang.String r1 = "UPCCODE_A"
                r2.put(r0, r1)
                int r0 = com.huawei.hms.ml.scan.HmsScanBase.UPCCODE_E_SCAN_TYPE
                java.lang.String r1 = "UPCCODE_E"
                r2.put(r0, r1)
                int r0 = com.huawei.hms.ml.scan.HmsScanBase.FORMAT_UNKNOWN
                java.lang.String r1 = com.huawei.hms.scankit.p.u3.d
                r2.put(r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends android.util.SparseArray<java.lang.String> {
        b() {
                r2 = this;
                r2.<init>()
                int r0 = com.huawei.hms.ml.scan.HmsScan.ARTICLE_NUMBER_FORM
                java.lang.String r1 = "ARTICLE_NUMBER"
                r2.put(r0, r1)
                int r0 = com.huawei.hms.ml.scan.HmsScan.EMAIL_CONTENT_FORM
                java.lang.String r1 = "EMAIL_CONTENT"
                r2.put(r0, r1)
                int r0 = com.huawei.hms.ml.scan.HmsScan.TEL_PHONE_NUMBER_FORM
                java.lang.String r1 = "TEL_PHONE_NUMBER"
                r2.put(r0, r1)
                int r0 = com.huawei.hms.ml.scan.HmsScan.PURE_TEXT_FORM
                java.lang.String r1 = "PURE_TEXT"
                r2.put(r0, r1)
                int r0 = com.huawei.hms.ml.scan.HmsScan.SMS_FORM
                java.lang.String r1 = "SMS"
                r2.put(r0, r1)
                int r0 = com.huawei.hms.ml.scan.HmsScan.URL_FORM
                java.lang.String r1 = "URL"
                r2.put(r0, r1)
                int r0 = com.huawei.hms.ml.scan.HmsScan.WIFI_CONNECT_INFO_FORM
                java.lang.String r1 = "WIFI_CONNECT_INFO"
                r2.put(r0, r1)
                int r0 = com.huawei.hms.ml.scan.HmsScan.EVENT_INFO_FORM
                java.lang.String r1 = "EVENT_INFO"
                r2.put(r0, r1)
                int r0 = com.huawei.hms.ml.scan.HmsScan.CONTACT_DETAIL_FORM
                java.lang.String r1 = "CONTACT_DETAIL"
                r2.put(r0, r1)
                int r0 = com.huawei.hms.ml.scan.HmsScan.DRIVER_INFO_FORM
                java.lang.String r1 = "DRIVER_INFO"
                r2.put(r0, r1)
                int r0 = com.huawei.hms.ml.scan.HmsScan.LOCATION_COORDINATE_FORM
                java.lang.String r1 = "LOCATION_COORDINATE"
                r2.put(r0, r1)
                int r0 = com.huawei.hms.ml.scan.HmsScan.ISBN_NUMBER_FORM
                java.lang.String r1 = "ISBN_NUMBER"
                r2.put(r0, r1)
                java.lang.String r0 = com.huawei.hms.scankit.p.u3.e
                r1 = -1
                r2.put(r1, r0)
                return
        }
    }

    static {
            com.huawei.hms.scankit.p.u3$a r0 = new com.huawei.hms.scankit.p.u3$a
            r0.<init>()
            com.huawei.hms.scankit.p.u3.f = r0
            com.huawei.hms.scankit.p.u3$b r0 = new com.huawei.hms.scankit.p.u3$b
            r0.<init>()
            com.huawei.hms.scankit.p.u3.g = r0
            return
    }

    u3(android.os.Bundle r2, android.content.Context r3) {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.b = r0
            r1.a = r3
            r1.b(r2)
            return
    }

    static java.lang.String a(int r2) {
            android.util.SparseArray<java.lang.String> r0 = com.huawei.hms.scankit.p.u3.f
            java.lang.String r1 = com.huawei.hms.scankit.p.u3.d
            java.lang.Object r2 = r0.get(r2, r1)
            java.lang.String r2 = (java.lang.String) r2
            return r2
    }

    private java.lang.String a(android.os.Bundle r5) {
            r4 = this;
            java.lang.String r0 = "com.huawei.hms.client.service.name:scanplus"
            java.lang.String r1 = "com.huawei.hms.client.service.name:scankit"
            java.lang.String r2 = "huawei_module_scankit_sdk_version"
            java.lang.String r3 = "com.huawei.hms.client.service.name:scan"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r0, r1}
            if (r5 == 0) goto L22
            r1 = 0
        Lf:
            r2 = 4
            if (r1 >= r2) goto L22
            r2 = r0[r1]
            java.lang.String r3 = r5.getString(r2)
            if (r3 == 0) goto L1f
            java.lang.String r5 = r5.getString(r2)
            return r5
        L1f:
            int r1 = r1 + 1
            goto Lf
        L22:
            java.lang.String r5 = "scankit:1.0.2.300"
            return r5
    }

    private java.lang.String b() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 != r1) goto L9
            java.lang.String r0 = "full-noso"
            return r0
        L9:
            java.lang.String r0 = "full"
            return r0
    }

    static java.lang.String b(int r2) {
            android.util.SparseArray<java.lang.String> r0 = com.huawei.hms.scankit.p.u3.g
            java.lang.String r1 = com.huawei.hms.scankit.p.u3.e
            java.lang.Object r2 = r0.get(r2, r1)
            java.lang.String r2 = (java.lang.String) r2
            return r2
    }

    private void b(android.os.Bundle r7) {
            r6 = this;
            java.lang.String r0 = "initValue Exception"
            java.lang.String r1 = "unknown"
            java.lang.String r2 = "HaLog"
            android.content.Context r3 = r6.a     // Catch: java.lang.Exception -> L72 android.content.pm.PackageManager.NameNotFoundException -> L76
            java.lang.String r3 = r3.getPackageName()     // Catch: java.lang.Exception -> L72 android.content.pm.PackageManager.NameNotFoundException -> L76
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r4 = r6.b     // Catch: java.lang.Exception -> L72 android.content.pm.PackageManager.NameNotFoundException -> L76
            java.lang.String r5 = "package"
            r4.put(r5, r3)     // Catch: java.lang.Exception -> L72 android.content.pm.PackageManager.NameNotFoundException -> L76
            java.lang.String r4 = "appid"
            if (r7 == 0) goto L27
            boolean r5 = r7.containsKey(r4)     // Catch: java.lang.Exception -> L72 android.content.pm.PackageManager.NameNotFoundException -> L76
            if (r5 == 0) goto L27
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r5 = r6.b     // Catch: java.lang.Exception -> L72 android.content.pm.PackageManager.NameNotFoundException -> L76
            java.lang.String r7 = r7.getString(r4)     // Catch: java.lang.Exception -> L72 android.content.pm.PackageManager.NameNotFoundException -> L76
            r5.put(r4, r7)     // Catch: java.lang.Exception -> L72 android.content.pm.PackageManager.NameNotFoundException -> L76
            goto L2c
        L27:
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r7 = r6.b     // Catch: java.lang.Exception -> L72 android.content.pm.PackageManager.NameNotFoundException -> L76
            r7.put(r4, r3)     // Catch: java.lang.Exception -> L72 android.content.pm.PackageManager.NameNotFoundException -> L76
        L2c:
            android.content.Context r7 = r6.a     // Catch: java.lang.Exception -> L72 android.content.pm.PackageManager.NameNotFoundException -> L76
            android.content.pm.PackageManager r7 = r7.getPackageManager()     // Catch: java.lang.Exception -> L72 android.content.pm.PackageManager.NameNotFoundException -> L76
            r4 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r3 = r7.getApplicationInfo(r3, r4)     // Catch: java.lang.Exception -> L72 android.content.pm.PackageManager.NameNotFoundException -> L76
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r4 = r6.b     // Catch: java.lang.Exception -> L72 android.content.pm.PackageManager.NameNotFoundException -> L76
            java.lang.String r5 = "appName"
            java.lang.CharSequence r7 = r3.loadLabel(r7)     // Catch: java.lang.Exception -> L72 android.content.pm.PackageManager.NameNotFoundException -> L76
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> L72 android.content.pm.PackageManager.NameNotFoundException -> L76
            r4.put(r5, r7)     // Catch: java.lang.Exception -> L72 android.content.pm.PackageManager.NameNotFoundException -> L76
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r7 = r6.b     // Catch: java.lang.Exception -> L72 android.content.pm.PackageManager.NameNotFoundException -> L76
            java.lang.String r4 = "version"
            android.os.Bundle r3 = r3.metaData     // Catch: java.lang.Exception -> L72 android.content.pm.PackageManager.NameNotFoundException -> L76
            java.lang.String r3 = r6.a(r3)     // Catch: java.lang.Exception -> L72 android.content.pm.PackageManager.NameNotFoundException -> L76
            r7.put(r4, r3)     // Catch: java.lang.Exception -> L72 android.content.pm.PackageManager.NameNotFoundException -> L76
            java.lang.String r7 = r6.d()     // Catch: java.lang.Exception -> L72 android.content.pm.PackageManager.NameNotFoundException -> L76
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r3 = r6.b     // Catch: java.lang.Exception -> L72 android.content.pm.PackageManager.NameNotFoundException -> L76
            java.lang.String r4 = "hmscoreVersion"
            r3.put(r4, r7)     // Catch: java.lang.Exception -> L72 android.content.pm.PackageManager.NameNotFoundException -> L76
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r3 = r6.b     // Catch: java.lang.Exception -> L72 android.content.pm.PackageManager.NameNotFoundException -> L76
            java.lang.String r4 = "isHMSCore"
            boolean r7 = r1.equals(r7)     // Catch: java.lang.Exception -> L72 android.content.pm.PackageManager.NameNotFoundException -> L76
            if (r7 == 0) goto L6c
            java.lang.String r7 = "0"
            goto L6e
        L6c:
            java.lang.String r7 = "1"
        L6e:
            r3.put(r4, r7)     // Catch: java.lang.Exception -> L72 android.content.pm.PackageManager.NameNotFoundException -> L76
            goto L7b
        L72:
            com.huawei.hms.scankit.p.o4.b(r2, r0)
            goto L7b
        L76:
            java.lang.String r7 = "PackageManager.NameNotFoundException"
            com.huawei.hms.scankit.p.o4.b(r2, r7)
        L7b:
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r7 = r6.b     // Catch: java.lang.Exception -> L114 java.lang.RuntimeException -> L118
            java.lang.String r3 = "sdkName"
            java.lang.String r4 = "scankit"
            r7.put(r3, r4)     // Catch: java.lang.Exception -> L114 java.lang.RuntimeException -> L118
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r7 = r6.b     // Catch: java.lang.Exception -> L114 java.lang.RuntimeException -> L118
            java.lang.String r3 = "algopt"
            java.lang.String r4 = r6.b()     // Catch: java.lang.Exception -> L114 java.lang.RuntimeException -> L118
            r7.put(r3, r4)     // Catch: java.lang.Exception -> L114 java.lang.RuntimeException -> L118
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r7 = r6.b     // Catch: java.lang.Exception -> L114 java.lang.RuntimeException -> L118
            java.lang.String r3 = "isFullSdk"
            java.lang.String r4 = "FULLSDK"
            r7.put(r3, r4)     // Catch: java.lang.Exception -> L114 java.lang.RuntimeException -> L118
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r7 = r6.b     // Catch: java.lang.Exception -> L114 java.lang.RuntimeException -> L118
            java.lang.String r3 = "cpAppVersion"
            java.lang.String r4 = r6.c()     // Catch: java.lang.Exception -> L114 java.lang.RuntimeException -> L118
            r7.put(r3, r4)     // Catch: java.lang.Exception -> L114 java.lang.RuntimeException -> L118
            boolean r7 = com.huawei.hms.scankit.p.b4.a     // Catch: java.lang.Exception -> L114 java.lang.RuntimeException -> L118
            java.lang.String r3 = "apkVersion"
            if (r7 != 0) goto Laf
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r7 = r6.b     // Catch: java.lang.Exception -> L114 java.lang.RuntimeException -> L118
            r7.put(r3, r1)     // Catch: java.lang.Exception -> L114 java.lang.RuntimeException -> L118
            goto Lb6
        Laf:
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r7 = r6.b     // Catch: java.lang.Exception -> L114 java.lang.RuntimeException -> L118
            java.lang.String r1 = com.huawei.hms.scankit.p.b4.b     // Catch: java.lang.Exception -> L114 java.lang.RuntimeException -> L118
            r7.put(r3, r1)     // Catch: java.lang.Exception -> L114 java.lang.RuntimeException -> L118
        Lb6:
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r7 = r6.b     // Catch: java.lang.Exception -> L114 java.lang.RuntimeException -> L118
            java.lang.String r1 = "service"
            java.lang.String r3 = "com.huawei.hms.scankit"
            r7.put(r1, r3)     // Catch: java.lang.Exception -> L114 java.lang.RuntimeException -> L118
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r7 = r6.b     // Catch: java.lang.Exception -> L114 java.lang.RuntimeException -> L118
            java.lang.String r1 = "operator"
            android.content.Context r3 = r6.a     // Catch: java.lang.Exception -> L114 java.lang.RuntimeException -> L118
            java.lang.String r3 = com.huawei.hms.scankit.p.b4.b(r3)     // Catch: java.lang.Exception -> L114 java.lang.RuntimeException -> L118
            r7.put(r1, r3)     // Catch: java.lang.Exception -> L114 java.lang.RuntimeException -> L118
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r7 = r6.b     // Catch: java.lang.Exception -> L114 java.lang.RuntimeException -> L118
            java.lang.String r1 = "networkType"
            android.content.Context r3 = r6.a     // Catch: java.lang.Exception -> L114 java.lang.RuntimeException -> L118
            java.lang.String r3 = com.huawei.hms.scankit.p.b4.a(r3)     // Catch: java.lang.Exception -> L114 java.lang.RuntimeException -> L118
            r7.put(r1, r3)     // Catch: java.lang.Exception -> L114 java.lang.RuntimeException -> L118
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r7 = r6.b     // Catch: java.lang.Exception -> L114 java.lang.RuntimeException -> L118
            java.lang.String r1 = "countryCode"
            android.content.Context r3 = r6.a     // Catch: java.lang.Exception -> L114 java.lang.RuntimeException -> L118
            r4 = 0
            java.lang.String r3 = com.huawei.hms.scankit.p.b4.a(r3, r4)     // Catch: java.lang.Exception -> L114 java.lang.RuntimeException -> L118
            r7.put(r1, r3)     // Catch: java.lang.Exception -> L114 java.lang.RuntimeException -> L118
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r7 = r6.b     // Catch: java.lang.Exception -> L114 java.lang.RuntimeException -> L118
            java.lang.String r1 = "deviceType"
            java.lang.String r3 = com.huawei.hms.scankit.p.b4.c()     // Catch: java.lang.Exception -> L114 java.lang.RuntimeException -> L118
            r7.put(r1, r3)     // Catch: java.lang.Exception -> L114 java.lang.RuntimeException -> L118
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r7 = r6.b     // Catch: java.lang.Exception -> L114 java.lang.RuntimeException -> L118
            java.lang.String r1 = "emuiVersion"
            java.lang.String r3 = com.huawei.hms.scankit.p.b4.d()     // Catch: java.lang.Exception -> L114 java.lang.RuntimeException -> L118
            r7.put(r1, r3)     // Catch: java.lang.Exception -> L114 java.lang.RuntimeException -> L118
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r7 = r6.b     // Catch: java.lang.Exception -> L114 java.lang.RuntimeException -> L118
            java.lang.String r1 = "androidVersion"
            java.lang.String r3 = com.huawei.hms.scankit.p.b4.a()     // Catch: java.lang.Exception -> L114 java.lang.RuntimeException -> L118
            r7.put(r1, r3)     // Catch: java.lang.Exception -> L114 java.lang.RuntimeException -> L118
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r7 = r6.b     // Catch: java.lang.Exception -> L114 java.lang.RuntimeException -> L118
            java.lang.String r1 = "deviceCategory"
            java.lang.String r3 = com.huawei.hms.scankit.p.b4.b()     // Catch: java.lang.Exception -> L114 java.lang.RuntimeException -> L118
            r7.put(r1, r3)     // Catch: java.lang.Exception -> L114 java.lang.RuntimeException -> L118
            goto L11d
        L114:
            com.huawei.hms.scankit.p.o4.b(r2, r0)
            goto L11d
        L118:
            java.lang.String r7 = "initValue RuntimeException"
            com.huawei.hms.scankit.p.o4.b(r2, r7)
        L11d:
            return
    }

    private java.lang.String c() {
            r4 = this;
            java.lang.String r0 = "unknown"
            android.content.Context r1 = r4.a     // Catch: java.lang.Throwable -> L15
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Throwable -> L15
            android.content.Context r2 = r4.a     // Catch: java.lang.Throwable -> L15
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Throwable -> L15
            r3 = 0
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r3)     // Catch: java.lang.Throwable -> L15
            java.lang.String r0 = r1.versionName     // Catch: java.lang.Throwable -> L15
        L15:
            return r0
    }

    private java.lang.String d() {
            r4 = this;
            java.lang.String r0 = "unknown"
            android.content.Context r1 = r4.a     // Catch: java.lang.Throwable -> L11
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Throwable -> L11
            java.lang.String r2 = "com.huawei.hwid"
            r3 = 0
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r3)     // Catch: java.lang.Throwable -> L11
            java.lang.String r0 = r1.versionName     // Catch: java.lang.Throwable -> L11
        L11:
            return r0
    }

    private boolean e() {
            r6 = this;
            java.lang.String r0 = "CN"
            r1 = 0
            java.lang.String r2 = "get"
            java.lang.String r3 = "ro.hw.country"
            java.lang.String r4 = "android.os.SystemProperties"
            java.lang.String r5 = "UNKNOWN"
            java.lang.String r2 = com.huawei.hms.framework.common.SystemPropUtils.getProperty(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L3d
            android.content.Context r3 = r6.a     // Catch: java.lang.Throwable -> L3d
            android.content.Context r3 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L3d
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r4 = "phone"
            java.lang.Object r3 = r3.getSystemService(r4)     // Catch: java.lang.Throwable -> L3d
            android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3     // Catch: java.lang.Throwable -> L3d
            java.lang.String r4 = r3.getNetworkCountryIso()     // Catch: java.lang.Throwable -> L3d
            java.lang.String r3 = r3.getSimCountryIso()     // Catch: java.lang.Throwable -> L3d
            boolean r2 = r0.equalsIgnoreCase(r2)     // Catch: java.lang.Throwable -> L3d
            if (r2 == 0) goto L3d
            boolean r2 = r0.equalsIgnoreCase(r4)     // Catch: java.lang.Throwable -> L3d
            if (r2 == 0) goto L3d
            boolean r0 = r0.equalsIgnoreCase(r3)     // Catch: java.lang.Throwable -> L3d
            if (r0 == 0) goto L3d
            r0 = 1
            return r0
        L3d:
            return r1
    }

    private boolean f() {
            r1 = this;
            r0 = 1
            return r0
    }

    boolean a() {
            r4 = this;
            android.content.Context r0 = r4.a
            boolean r0 = com.huawei.hms.scankit.p.w7.c(r0)
            r1 = 0
            if (r0 == 0) goto La
            return r1
        La:
            boolean r0 = r4.f()     // Catch: java.lang.Throwable -> L28
            r2 = 1
            if (r0 != 0) goto L27
            boolean r0 = r4.e()     // Catch: java.lang.Throwable -> L28
            if (r0 != 0) goto L27
            android.content.Context r0 = r4.a     // Catch: java.lang.Throwable -> L28
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L28
            java.lang.String r3 = "hw_app_analytics_state"
            int r0 = android.provider.Settings.Secure.getInt(r0, r3, r1)     // Catch: java.lang.Throwable -> L28
            if (r0 != r2) goto L26
            goto L27
        L26:
            return r1
        L27:
            return r2
        L28:
            return r1
    }

    void g() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "update HiAnalyticsLogUtils.apk_mode "
            r0.append(r1)
            boolean r1 = com.huawei.hms.scankit.p.b4.a
            r0.append(r1)
            java.lang.String r1 = " HiAnalyticsLogUtils.apkVersion "
            r0.append(r1)
            java.lang.String r1 = com.huawei.hms.scankit.p.b4.b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "HaLog"
            com.huawei.hms.scankit.p.o4.d(r1, r0)
            boolean r0 = com.huawei.hms.scankit.p.b4.a
            if (r0 == 0) goto L31
            java.lang.String r0 = com.huawei.hms.scankit.p.b4.b
            if (r0 == 0) goto L31
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r1 = r3.b
            java.lang.String r2 = "apkVersion"
            r1.put(r2, r0)
        L31:
            return
    }
}
