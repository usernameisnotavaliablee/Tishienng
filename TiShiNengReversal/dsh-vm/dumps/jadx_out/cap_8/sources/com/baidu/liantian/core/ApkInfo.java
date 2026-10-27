package com.baidu.liantian.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class ApkInfo {
    public android.content.pm.ActivityInfo[] activities;
    public java.lang.String apkMD5;
    public int apkParseSuc;
    public int applicationTheme;
    public java.lang.ClassLoader classLoader;
    public java.lang.String className;
    public android.content.pm.PackageInfo cloudPkgInfo;
    public java.lang.String dataDir;
    public java.lang.String dexPath;
    public java.lang.String downloadURL;
    public int duration;
    public android.content.Context hostContext;
    public int initStatus;
    public java.util.List<com.baidu.liantian.core.h> intentFilters;
    public boolean isMem;
    public int isOnce;
    public int key;
    public java.lang.String libPath;
    public int network;
    public java.lang.String packageName;
    public java.lang.String pkgPath;
    public int priority;
    public java.lang.String signMD5;
    public long startTime;
    public java.lang.String versionName;

    public ApkInfo() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.priority = r0
            r0 = 0
            r1.isMem = r0
            return
    }

    public ApkInfo(int r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.priority = r0
            r0 = 0
            r1.isMem = r0
            r1.key = r2
            r1.versionName = r3
            r1.pkgPath = r4
            return
    }

    public ApkInfo(int r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.priority = r0
            r0 = 0
            r1.isMem = r0
            r1.key = r2
            r1.packageName = r3
            r1.versionName = r4
            r1.downloadURL = r5
            r1.apkMD5 = r6
            return
    }

    public ApkInfo(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.priority = r0
            r0 = 0
            r1.isMem = r0
            r1.versionName = r2
            r1.pkgPath = r3
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 != 0) goto L8
            return r1
        L8:
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L13
            return r1
        L13:
            com.baidu.liantian.core.ApkInfo r5 = (com.baidu.liantian.core.ApkInfo) r5
            java.lang.String r2 = r4.packageName
            if (r2 != 0) goto L1e
            java.lang.String r5 = r5.packageName
            if (r5 == 0) goto L27
            return r1
        L1e:
            java.lang.String r5 = r5.packageName
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L27
            return r1
        L27:
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.packageName
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            int r0 = r0 + 31
            return r0
    }
}
