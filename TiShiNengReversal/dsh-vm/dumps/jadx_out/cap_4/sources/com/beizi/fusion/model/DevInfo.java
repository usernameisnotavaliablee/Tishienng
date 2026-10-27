package com.beizi.fusion.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class DevInfo {
    private static final java.lang.String KEY_SDK_UID_NEW = "SDK_UID_KEY_NEW";
    private static final java.lang.String KEY_SDK_UID_ORIG = "SDK_UID_KEY";
    private static final int algorithmVersion = 1;
    private java.lang.String brand;
    private java.lang.String cnOaid;
    private android.content.Context context;
    private java.lang.String density;
    private java.lang.String densityDpi;
    private java.lang.String devType;
    private java.lang.String gaid;
    private java.lang.String honorOaid;
    private java.lang.String language;
    private java.lang.String model;
    private java.lang.String msaOaid;
    private java.lang.String oaid;
    private java.lang.String os;
    private java.lang.String platform;
    private java.lang.String resolution;
    private java.lang.String romVersion;
    private java.lang.String root;
    private java.lang.String screenSize;
    private java.lang.String sdkUID;
    private java.lang.String sdkUIDOrig;
    private java.lang.String smOaid;

    public DevInfo(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            r2.context = r3
            java.lang.String r0 = "SDK_UID_KEY_NEW"
            java.lang.String r0 = com.beizi.fusion.tool.an.a(r3, r0)
            r2.sdkUID = r0
            java.lang.String r0 = "SDK_UID_KEY"
            java.lang.String r0 = com.beizi.fusion.tool.an.a(r3, r0)
            r2.sdkUIDOrig = r0
            java.lang.String r0 = com.beizi.fusion.tool.p.c()
            r2.os = r0
            java.lang.String r0 = "2"
            r2.platform = r0
            java.lang.String r0 = com.beizi.fusion.tool.p.d(r3)
            r2.devType = r0
            java.lang.String r0 = com.beizi.fusion.tool.p.a()
            r2.brand = r0
            java.lang.String r0 = com.beizi.fusion.tool.p.b()
            r2.model = r0
            r2.getScreenInformation(r3)
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getLanguage()
            r2.language = r0
            java.lang.String r0 = com.beizi.fusion.tool.ap.a()
            r2.root = r0
            java.lang.String r0 = r2.sdkUID
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L53
            java.lang.String r0 = r2.brand
            java.lang.String r1 = r2.model
            r2.generateSdkUID(r3, r0, r1)
        L53:
            java.lang.String r3 = r2.getCurrentRomVersion()
            r2.romVersion = r3
            return
    }

    private java.lang.String generateCurrentTimeMillis() {
            r8 = this;
            java.util.Locale r0 = java.util.Locale.CHINA
            java.util.Calendar r1 = java.util.Calendar.getInstance(r0)
            r1.clear()
            r6 = 0
            r7 = 0
            r2 = 2020(0x7e4, float:2.83E-42)
            r3 = 0
            r4 = 1
            r5 = 0
            r1.set(r2, r3, r4, r5, r6, r7)
            long r0 = r1.getTimeInMillis()
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r0
            java.lang.String r0 = java.lang.String.valueOf(r2)
            return r0
    }

    private java.lang.String generateFourDigitRandom() {
            r4 = this;
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = ""
            r1.append(r2)
            r2 = 10
            int r3 = r0.nextInt(r2)
            r1.append(r3)
            int r3 = r0.nextInt(r2)
            r1.append(r3)
            int r3 = r0.nextInt(r2)
            r1.append(r3)
            int r0 = r0.nextInt(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    private void generateSdkUID(android.content.Context r5, java.lang.String r6, java.lang.String r7) {
            r4 = this;
            java.lang.String r0 = r4.generateFourDigitRandom()
            java.lang.String r1 = r4.generateCurrentTimeMillis()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            java.lang.String r6 = "_"
            r2.append(r6)
            r2.append(r7)
            r2.append(r6)
            java.lang.String r7 = com.beizi.fusion.tool.ap.c(r5)
            r2.append(r7)
            r2.append(r6)
            r7 = 1
            r2.append(r7)
            r2.append(r6)
            r2.append(r0)
            r2.append(r6)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = com.beizi.fusion.tool.ao.a(r2)
            r3.append(r2)
            r3.append(r6)
            r3.append(r7)
            r3.append(r6)
            r3.append(r0)
            r3.append(r6)
            r3.append(r1)
            java.lang.String r6 = r3.toString()
            r4.sdkUID = r6
            java.lang.String r7 = "SDK_UID_KEY_NEW"
            com.beizi.fusion.tool.an.a(r5, r7, r6)
            return
    }

    private java.lang.String getCurrentRomVersion() {
            r1 = this;
            com.beizi.fusion.tool.ac r0 = com.beizi.fusion.tool.ac.a()     // Catch: java.lang.Throwable -> Lc
            r0.b()     // Catch: java.lang.Throwable -> Lc
            java.lang.String r0 = r0.c()     // Catch: java.lang.Throwable -> Lc
            return r0
        Lc:
            r0 = 0
            return r0
    }

    private void getScreenInformation(android.content.Context r8) {
            r7 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = "window"
            java.lang.Object r1 = r8.getSystemService(r1)     // Catch: java.lang.Throwable -> L9e
            android.view.WindowManager r1 = (android.view.WindowManager) r1     // Catch: java.lang.Throwable -> L9e
            android.util.DisplayMetrics r2 = new android.util.DisplayMetrics     // Catch: java.lang.Throwable -> L9e
            r2.<init>()     // Catch: java.lang.Throwable -> L9e
            android.view.Display r1 = r1.getDefaultDisplay()     // Catch: java.lang.Throwable -> L9e
            r1.getMetrics(r2)     // Catch: java.lang.Throwable -> L9e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9e
            r1.<init>()     // Catch: java.lang.Throwable -> L9e
            int r3 = r2.widthPixels     // Catch: java.lang.Throwable -> L9e
            r1.append(r3)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r3 = "_"
            r1.append(r3)     // Catch: java.lang.Throwable -> L9e
            int r3 = r2.heightPixels     // Catch: java.lang.Throwable -> L9e
            r1.append(r3)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L9e
            r7.resolution = r1     // Catch: java.lang.Throwable -> L9e
            int r1 = r2.heightPixels     // Catch: java.lang.Throwable -> L9e
            float r1 = (float) r1     // Catch: java.lang.Throwable -> L9e
            float r3 = r2.ydpi     // Catch: java.lang.Throwable -> L9e
            float r1 = r1 / r3
            int r3 = r2.widthPixels     // Catch: java.lang.Throwable -> L9e
            float r3 = (float) r3     // Catch: java.lang.Throwable -> L9e
            float r2 = r2.xdpi     // Catch: java.lang.Throwable -> L9e
            float r3 = r3 / r2
            float r3 = r3 * r3
            float r1 = r1 * r1
            float r3 = r3 + r1
            double r1 = (double) r3     // Catch: java.lang.Throwable -> L9e
            double r1 = java.lang.Math.sqrt(r1)     // Catch: java.lang.Throwable -> L9e
            r3 = 4621819117588971520(0x4024000000000000, double:10.0)
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r3 = java.lang.Math.pow(r3, r5)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r5 = "%.2f"
            double r1 = r1 * r3
            long r1 = java.lang.Math.round(r1)     // Catch: java.lang.Throwable -> L9e
            double r1 = (double) r1     // Catch: java.lang.Throwable -> L9e
            double r1 = r1 / r3
            java.lang.Double r1 = java.lang.Double.valueOf(r1)     // Catch: java.lang.Throwable -> L9e
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L9e
            r3 = 0
            r2[r3] = r1     // Catch: java.lang.Throwable -> L9e
            java.lang.String r1 = java.lang.String.format(r5, r2)     // Catch: java.lang.Throwable -> L9e
            r7.screenSize = r1     // Catch: java.lang.Throwable -> L9e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9e
            r1.<init>()     // Catch: java.lang.Throwable -> L9e
            android.content.res.Resources r2 = r8.getResources()     // Catch: java.lang.Throwable -> L9e
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()     // Catch: java.lang.Throwable -> L9e
            float r2 = r2.density     // Catch: java.lang.Throwable -> L9e
            r1.append(r2)     // Catch: java.lang.Throwable -> L9e
            r1.append(r0)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L9e
            r7.density = r1     // Catch: java.lang.Throwable -> L9e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9e
            r1.<init>()     // Catch: java.lang.Throwable -> L9e
            android.content.res.Resources r8 = r8.getResources()     // Catch: java.lang.Throwable -> L9e
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()     // Catch: java.lang.Throwable -> L9e
            int r8 = r8.densityDpi     // Catch: java.lang.Throwable -> L9e
            r1.append(r8)     // Catch: java.lang.Throwable -> L9e
            r1.append(r0)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r8 = r1.toString()     // Catch: java.lang.Throwable -> L9e
            r7.densityDpi = r8     // Catch: java.lang.Throwable -> L9e
        L9e:
            return
    }

    public java.lang.String getBrand() {
            r1 = this;
            java.lang.String r0 = r1.brand
            return r0
    }

    public java.lang.String getCnOaid() {
            r1 = this;
            java.lang.String r0 = r1.cnOaid
            return r0
    }

    public java.lang.String getDensity() {
            r1 = this;
            java.lang.String r0 = r1.density
            return r0
    }

    public java.lang.String getDensityDpi() {
            r1 = this;
            java.lang.String r0 = r1.densityDpi
            return r0
    }

    public java.lang.String getDevType() {
            r1 = this;
            java.lang.String r0 = r1.devType
            return r0
    }

    public java.lang.String getGaid() {
            r1 = this;
            java.lang.String r0 = r1.gaid
            return r0
    }

    public java.lang.String getHonorOaid() {
            r1 = this;
            java.lang.String r0 = r1.honorOaid
            return r0
    }

    public java.lang.String getLanguage() {
            r1 = this;
            java.lang.String r0 = r1.language
            return r0
    }

    public java.lang.String getModel() {
            r1 = this;
            java.lang.String r0 = r1.model
            return r0
    }

    public java.lang.String getMsaOaid() {
            r1 = this;
            java.lang.String r0 = r1.msaOaid
            return r0
    }

    public java.lang.String getOaid() {
            r1 = this;
            java.lang.String r0 = r1.oaid
            return r0
    }

    public java.lang.String getOs() {
            r1 = this;
            java.lang.String r0 = r1.os
            return r0
    }

    public java.lang.String getPlatform() {
            r1 = this;
            java.lang.String r0 = r1.platform
            return r0
    }

    public java.lang.String getResolution() {
            r1 = this;
            java.lang.String r0 = r1.resolution
            return r0
    }

    public java.lang.String getRomVersion() {
            r1 = this;
            java.lang.String r0 = r1.romVersion
            return r0
    }

    public java.lang.String getRoot() {
            r1 = this;
            java.lang.String r0 = r1.root
            return r0
    }

    public java.lang.String getScreenSize() {
            r1 = this;
            java.lang.String r0 = r1.screenSize
            return r0
    }

    public java.lang.String getSdkUID() {
            r1 = this;
            java.lang.String r0 = r1.sdkUID
            return r0
    }

    public java.lang.String getSdkUIDOrig() {
            r1 = this;
            java.lang.String r0 = r1.sdkUIDOrig
            return r0
    }

    public java.lang.String getSmOaid() {
            r1 = this;
            java.lang.String r0 = r1.smOaid
            return r0
    }

    public void setBrand(java.lang.String r1) {
            r0 = this;
            r0.brand = r1
            return
    }

    public void setCnOaid(java.lang.String r1) {
            r0 = this;
            r0.cnOaid = r1
            return
    }

    public void setDensity(java.lang.String r1) {
            r0 = this;
            r0.density = r1
            return
    }

    public void setDensityDpi(java.lang.String r1) {
            r0 = this;
            r0.densityDpi = r1
            return
    }

    public void setDevType(java.lang.String r1) {
            r0 = this;
            r0.devType = r1
            return
    }

    public void setGaid(java.lang.String r1) {
            r0 = this;
            r0.gaid = r1
            return
    }

    public void setHonorOaid(java.lang.String r1) {
            r0 = this;
            r0.honorOaid = r1
            return
    }

    public void setLanguage(java.lang.String r1) {
            r0 = this;
            r0.language = r1
            return
    }

    public void setModel(java.lang.String r1) {
            r0 = this;
            r0.model = r1
            return
    }

    public void setMsaOaid(java.lang.String r1) {
            r0 = this;
            r0.msaOaid = r1
            return
    }

    public void setOaid(java.lang.String r1) {
            r0 = this;
            r0.oaid = r1
            return
    }

    public void setOs(java.lang.String r1) {
            r0 = this;
            r0.os = r1
            return
    }

    public void setPlatform(java.lang.String r1) {
            r0 = this;
            r0.platform = r1
            return
    }

    public void setResolution(java.lang.String r1) {
            r0 = this;
            r0.resolution = r1
            return
    }

    public void setRomVersion(java.lang.String r1) {
            r0 = this;
            r0.romVersion = r1
            return
    }

    public void setRoot(java.lang.String r1) {
            r0 = this;
            r0.root = r1
            return
    }

    public void setScreenSize(java.lang.String r1) {
            r0 = this;
            r0.screenSize = r1
            return
    }

    public void setSdkUID(java.lang.String r1) {
            r0 = this;
            r0.sdkUID = r1
            return
    }

    public void setSdkUIDOrig(java.lang.String r1) {
            r0 = this;
            r0.sdkUIDOrig = r1
            return
    }

    public void setSmOaid(java.lang.String r1) {
            r0 = this;
            r0.smOaid = r1
            return
    }
}
